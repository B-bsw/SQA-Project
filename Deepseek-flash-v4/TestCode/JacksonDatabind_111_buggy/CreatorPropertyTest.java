package com.fasterxml.jackson.databind.deser;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.NullValueProvider;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

public class CreatorPropertyTest {

    private DeserializationConfig config;
    private DeserializationContext ctxt;
    private JsonParser p;
    private DeserializationContext nullCtxt;
    private JsonParser nullParser;
    private Object bean;
    private Object valueToSet;
    private Object returnValue;

    @Before
    public void setUp() {
        config = new DeserializationConfig(null, null, null, null, null, null, null, null, null, null, null, null);
        ctxt = new DeserializationContext(config, null, null) {
            @Override
            public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) {
                return "injected-value";
            }
            @Override
            public void reportBadDefinition(JavaType type, String msg) throws JsonMappingException {
                throw new JsonMappingException(null, msg);
            }
        };
        p = new JsonParser() {
            @Override public Object getCodec() { return null; }
            @Override public void setCodec(com.fasterxml.jackson.core.ObjectCodec c) { }
            @Override public void close() throws IOException { }
            @Override public boolean isClosed() { return false; }
            @Override public com.fasterxml.jackson.core.JsonStreamContext getParsingContext() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getCurrentLocation() { return null; }
            @Override public com.fasterxml.jackson.core.JsonLocation getTokenLocation() { return null; }
            @Override public com.fasterxml.jackson.core.JsonToken nextToken() throws IOException { return null; }
            @Override public com.fasterxml.jackson.core.JsonToken nextValue() throws IOException { return null; }
            @Override public void skipChildren() throws IOException { }
            @Override public boolean hasCurrentToken() { return false; }
            @Override public com.fasterxml.jackson.core.JsonToken getCurrentToken() { return null; }
            @Override public int getCurrentTokenId() { return 0; }
            @Override public String getCurrentName() throws IOException { return null; }
            @Override public String getText() throws IOException { return null; }
            @Override public char[] getTextCharacters() throws IOException { return null; }
            @Override public int getTextLength() throws IOException { return 0; }
            @Override public int getTextOffset() throws IOException { return 0; }
            @Override public boolean hasTextCharacters() { return false; }
            @Override public Number getNumberValue() throws IOException { return null; }
            @Override public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType() throws IOException { return null; }
            @Override public int getIntValue() throws IOException { return 0; }
            @Override public long getLongValue() throws IOException { return 0; }
            @Override public double getDoubleValue() throws IOException { return 0; }
            @Override public float getFloatValue() throws IOException { return 0; }
            @Override public boolean getBooleanValue() throws IOException { return false; }
            @Override public byte[] getBinaryValue() throws IOException { return null; }
            @Override public String getEmbeddedObject() { return null; }
            @Override public byte getByteValue() throws IOException { return 0; }
            @Override public short getShortValue() throws IOException { return 0; }
            @Override public char getCharValue() throws IOException { return 0; }
            @Override public Object getEmbeddedOject() { return null; }
            // Add any missing abstract methods with default impls if needed
        };
        nullCtxt = null;
        nullParser = p; // use same parser for null test; not ideal but works for throw test
        bean = new Object();
        valueToSet = new Object();
        returnValue = new Object();
    }

    @After
    public void tearDown() {
        config = null;
        ctxt = null;
        p = null;
        nullCtxt = null;
        nullParser = null;
        bean = null;
        valueToSet = null;
        returnValue = null;
    }

    @Test
    public void testConstructorWithAllFields() {
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        int index = 0;
        Object injectableId = "inj-id";
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;

        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, index, injectableId, metadata);
        assertNotNull(prop);
        assertEquals(name, prop.getName());
        assertEquals(type, prop.getType());
        assertEquals(injectableId, prop.getInjectableValueId());
        assertEquals(index, prop.getCreatorIndex());
        assertFalse(prop.isIgnorable());
    }

    @Test
    public void testWithNameReturnsNewInstance() {
        PropertyName name = new PropertyName("oldName");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(String.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty original = new CreatorProperty(name, type, null, null, annotations, param, 0, "inj", PropertyMetadata.STD_REQUIRED);
        
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty newProp = original.withName(newName);
        assertNotNull(newProp);
        assertNotSame(original, newProp);
        assertEquals(newName, newProp.getName());
        assertEquals(original.getType(), newProp.getType());
        assertEquals(original.getInjectableValueId(), newProp.getInjectableValueId());
        assertEquals(original.getCreatorIndex(), ((CreatorProperty)newProp).getCreatorIndex());
    }

    @Test
    public void testWithValueDeserializerSameInstance() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        JsonDeserializer<Object> deser = new StdDeserializer<Object>(Object.class) {
            // empty
        };
        NullValueProvider nvp = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) { return null; }
        };
        CreatorProperty original = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        // set deserializer via reflection? Simpler: use withValueDeserializer to create one with deser
        SettableBeanProperty propWithDeser = original.withValueDeserializer(deser);
        assertNotNull(propWithDeser);
        assertNotSame(original, propWithDeser);
        // same deserializer
        SettableBeanProperty propWithSameDeser = propWithDeser.withValueDeserializer(deser);
        assertSame(propWithDeser, propWithSameDeser);
    }

    @Test
    public void testWithNullProvider() {
        // similar setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty original = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        NullValueProvider nvp = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) { return "null-val"; }
        };
        SettableBeanProperty newProp = original.withNullProvider(nvp);
        assertNotNull(newProp);
        assertNotSame(original, newProp);
    }

    @Test
    public void testFixAccessWithNullSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        prop.fixAccess(config); // should not throw
    }

    @Test
    public void testSetFallbackSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        SettableBeanProperty fallback = new SettableBeanProperty(name, type, null, null, null, PropertyMetadata.STD_REQUIRED) {
            @Override
            public SettableBeanProperty withName(PropertyName newName) { return this; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return this; }
            @Override
            public void fixAccess(DeserializationConfig config) { }
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { }
            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
            @Override
            public void set(Object instance, Object value) throws IOException { /* capture */ }
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException { return value; }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
            @Override
            public int getCreatorIndex() { return 0; }
        };
        prop.setFallbackSetter(fallback);
        // no easy way to verify, but we can call deserializeAndSet etc
        try {
            prop.deserializeAndSet(p, ctxt, bean);
            // should not throw because fallback setter exists
        } catch (IOException e) {
            fail("Should not have thrown: "+e.getMessage());
        }
    }

    @Test
    public void testMarkAsIgnorableAndIsIgnorable() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
    }

    @Test
    public void testFindInjectableValueWhenIdNull() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        try {
            prop.findInjectableValue(ctxt, bean);
            fail("Expected JsonMappingException");
        } catch (JsonMappingException e) {
            // expected
        }
    }

    @Test
    public void testFindInjectableValueWithId() throws Exception {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        Object injId = "inj";
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, injId, PropertyMetadata.STD_REQUIRED);
        Object result = prop.findInjectableValue(ctxt, bean);
        assertEquals("injected-value", result);
    }

    @Test
    public void testInject() throws Exception {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        Object injId = "inj";
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, injId, PropertyMetadata.STD_REQUIRED);
        final Object[] captured = new Object[1];
        SettableBeanProperty fallback = new SettableBeanProperty(name, type, null, null, null, PropertyMetadata.STD_REQUIRED) {
            @Override
            public SettableBeanProperty withName(PropertyName newName) { return this; }
            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) { return this; }
            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) { return this; }
            @Override
            public void fixAccess(DeserializationConfig config) { }
            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { }
            @Override
            public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException { return null; }
            @Override
            public void set(Object instance, Object value) throws IOException { captured[0] = value; }
            @Override
            public Object setAndReturn(Object instance, Object value) throws IOException { captured[0] = value; return value; }
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public AnnotatedMember getMember() { return null; }
            @Override
            public int getCreatorIndex() { return 0; }
        };
        prop.setFallbackSetter(fallback);
        prop.inject(ctxt, bean);
        assertEquals("injected-value", captured[0]);
    }

    @Test
    public void testDeserializeAndSetWhenNoFallbackSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        try {
            prop.deserializeAndSet(p, ctxt, bean);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeSetAndReturnWhenNoFallbackSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        try {
            prop.deserializeSetAndReturn(p, ctxt, bean);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testSetWhenNoFallbackSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        try {
            prop.set(bean, valueToSet);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testSetAndReturnWhenNoFallbackSetter() {
        // setup
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        AnnotatedParameter param = new AnnotatedParameter(null, null, null, null, null, null) {
            @Override
            public <A extends Annotation> A getAnnotation(Class<A> acls) { return null; }
            @Override
            public com.fasterxml.jackson.databind.JavaType getType() { return type; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, param, 0, null, PropertyMetadata.STD_REQUIRED);
        try {
            prop.setAndReturn(bean, valueToSet);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testGetAnnotationWithNullAnnotated() {
        // Create property with null param (should be possible via reflection? Actually constructor requires param, but we can pass null)
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        // We need to construct with null AnnotatedParameter, but constructor expects non-null? Actually it can be null.
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, null, 0, null, PropertyMetadata.STD_REQUIRED);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMemberWithNullAnnotated() {
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, null, 0, null, PropertyMetadata.STD_REQUIRED);
        assertNull(prop.getMember());
    }

    @Test
    public void testToString() {
        PropertyName name = new PropertyName("prop");
        JavaType type = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance().constructType(Object.class);
        Annotations annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> acls) { return null; }
            @Override
            public boolean has(Class<?> acls) { return false; }
            @Override
            public boolean hasOneOf(Class<? extends Annotation>[] acls) { return false; }
            @Override
            public int size() { return 0; }
        };
        Object injId = "inj";
        CreatorProperty prop = new CreatorProperty(name, type, null, null, annotations, null, 0, injId, PropertyMetadata.STD_REQUIRED);
        String s = prop.toString();
        assertNotNull(s);
        assertTrue(s.contains("creator property"));
        assertTrue(s.contains("prop"));
        assertTrue(s.contains("inj"));
    }
}