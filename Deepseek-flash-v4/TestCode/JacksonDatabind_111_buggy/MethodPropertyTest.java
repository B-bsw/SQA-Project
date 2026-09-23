package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

import org.junit.Test;

public class MethodPropertyTest {

    private MethodProperty methodProperty;
    private TestBean testBean;
    private Method setterMethod;
    private AnnotatedMethod annotatedMethod;
    private BeanPropertyDefinition propDef;
    private JavaType javaType;
    private TypeDeserializer typeDeser;
    private Annotations contextAnnotations;
    private JsonDeserializer<Object> deserializer;
    private NullValueProvider nullProvider;
    private DeserializationConfig config;
    private DeserializationContext ctxt;
    private JsonParser parser;

    @Before
    public void setUp() throws Exception {
        testBean = new TestBean();
        setterMethod = TestBean.class.getMethod("setName", String.class);
        annotatedMethod = new AnnotatedMethod(null, null, null, null, null, null);
        propDef = new BeanPropertyDefinition(null, null, null, null, null, null);
        javaType = null;
        typeDeser = null;
        contextAnnotations = null;
        deserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "deserialized";
            }
        };
        nullProvider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return "nullValue";
            }
        };
        methodProperty = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public SettableBeanProperty withName(PropertyName newName) {
                return this;
            }

            @Override
            public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
                return this;
            }

            @Override
            public SettableBeanProperty withNullProvider(NullValueProvider nva) {
                return this;
            }

            @Override
            public void fixAccess(DeserializationConfig config) {
            }

            @Override
            public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) {
                return null;
            }

            @Override
            public AnnotatedMember getMember() {
                return annotatedMethod;
            }
        };
        config = new DeserializationConfig(null, null, null, null, null, null) {
            @Override
            public boolean isEnabled(MapperFeature f) {
                return true;
            }
        };
        ctxt = new DeserializationContext(null, null, null, null) {
            @Override
            public Object getAttribute(Object key) {
                return null;
            }

            @Override
            public void setAttribute(Object key, Object value) {
            }

            @Override
            public JsonDeserializer<Object> getDeserializer(JavaType type) throws JsonMappingException {
                return deserializer;
            }
        };
        parser = new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public boolean hasToken(JsonToken t) {
                return false;
            }
        };
    }

    @Test
    public void testConstructorWithNullAnnotated() {
        try {
            MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, null);
            assertNull(mp._annotated);
            assertNull(mp._setter);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testWithName() {
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty result = methodProperty.withName(newName);
        assertNotNull(result);
        assertEquals(methodProperty, result);
    }

    @Test
    public void testWithValueDeserializer() {
        JsonDeserializer<?> newDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "newDeser";
            }
        };
        SettableBeanProperty result = methodProperty.withValueDeserializer(newDeser);
        assertNotNull(result);
        assertEquals(methodProperty, result);
    }

    @Test
    public void testWithNullProvider() {
        NullValueProvider newProvider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return "newNull";
            }
        };
        SettableBeanProperty result = methodProperty.withNullProvider(newProvider);
        assertNotNull(result);
        assertEquals(methodProperty, result);
    }

    @Test
    public void testFixAccess() {
        methodProperty.fixAccess(config);
    }

    @Test
    public void testGetAnnotation() {
        assertNull(methodProperty.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember() {
        assertNull(methodProperty.getMember());
    }

    @Test
    public void testDeserializeAndSetVALUE_NULLWithSkipNulls() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        // Set _skipNulls to true
        Method m = MethodProperty.class.getDeclaredField("_skipNulls");
        m.setAccessible(true);
        m.setBoolean(mp, true);
        // Set _setter to actual method
        m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, setterMethod);
        // Set _nullProvider
        m = MethodProperty.class.getDeclaredField("_nullProvider");
        m.setAccessible(true);
        m.set(mp, nullProvider);
        // Set _valueDeserializer
        m = MethodProperty.class.getDeclaredField("_valueDeserializer");
        m.setAccessible(true);
        m.set(mp, deserializer);
        // Set _valueTypeDeserializer
        m = MethodProperty.class.getDeclaredField("_valueTypeDeserializer");
        m.setAccessible(true);
        m.set(mp, null);

        parser = new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public boolean hasToken(JsonToken t) {
                return t == JsonToken.VALUE_NULL;
            }
        };
        mp.deserializeAndSet(parser, ctxt, testBean);
        assertEquals(null, testBean.getName());
    }

    @Test
    public void testDeserializeAndSetVALUE_NULLWithNoSkip() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_skipNulls");
        m.setAccessible(true);
        m.setBoolean(mp, false);
        m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, setterMethod);
        m = MethodProperty.class.getDeclaredField("_nullProvider");
        m.setAccessible(true);
        m.set(mp, new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return "NULL";
            }
        });
        m = MethodProperty.class.getDeclaredField("_valueDeserializer");
        m.setAccessible(true);
        m.set(mp, deserializer);
        m = MethodProperty.class.getDeclaredField("_valueTypeDeserializer");
        m.setAccessible(true);
        m.set(mp, null);

        parser = new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public boolean hasToken(JsonToken t) {
                return t == JsonToken.VALUE_NULL;
            }
        };
        mp.deserializeAndSet(parser, ctxt, testBean);
        assertEquals("NULL", testBean.getName());
    }

    @Test
    public void testDeserializeAndSetNoNullToken() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_skipNulls");
        m.setAccessible(true);
        m.setBoolean(mp, false);
        m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, setterMethod);
        m = MethodProperty.class.getDeclaredField("_nullProvider");
        m.setAccessible(true);
        m.set(mp, nullProvider);
        m = MethodProperty.class.getDeclaredField("_valueDeserializer");
        m.setAccessible(true);
        m.set(mp, deserializer);
        m = MethodProperty.class.getDeclaredField("_valueTypeDeserializer");
        m.setAccessible(true);
        m.set(mp, null);

        parser = new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public boolean hasToken(JsonToken t) {
                return t != JsonToken.VALUE_NULL;
            }
        };
        mp.deserializeAndSet(parser, ctxt, testBean);
        assertEquals("deserialized", testBean.getName());
    }

    @Test
    public void testDeserializeAndSetWithTypeDeser() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_skipNulls");
        m.setAccessible(true);
        m.setBoolean(mp, false);
        m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, setterMethod);
        m = MethodProperty.class.getDeclaredField("_nullProvider");
        m.setAccessible(true);
        m.set(mp, nullProvider);
        m = MethodProperty.class.getDeclaredField("_valueDeserializer");
        m.setAccessible(true);
        m.set(mp, deserializer);
        TypeDeserializer td = new TypeDeserializer() {
            @Override
            public Object deserializeTypedFromAny(Object obj) {
                return null;
            }

            @Override
            public Object deserializeTypedFromArray(Object obj) {
                return null;
            }

            @Override
            public Object deserializeTypedFromObject(Object obj) {
                return null;
            }

            @Override
            public Object deserializeTypedFromScalar(Object obj) {
                return null;
            }

            @Override
            public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, com.fasterxml.jackson.databind.util.TokenBuffer tb) throws IOException {
                return null;
            }

            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return null;
            }

            @Override
            public JavaType getDefaultImpl() {
                return null;
            }

            @Override
            public boolean hasTypeId() {
                return false;
            }
        };
        m = MethodProperty.class.getDeclaredField("_valueTypeDeserializer");
        m.setAccessible(true);
        m.set(mp, td);

        parser = new JsonParser() {
            @Override
            public JsonToken nextToken() throws IOException {
                return null;
            }

            @Override
            public JsonToken getCurrentToken() {
                return null;
            }

            @Override
            public String getText() throws IOException {
                return null;
            }

            @Override
            public boolean hasToken(JsonToken t) {
                return t != JsonToken.VALUE_NULL;
            }
        };
        mp.deserializeAndSet(parser, ctxt, testBean);
        assertEquals("deserialized", testBean.getName());
    }

    @Test
    public void testSetWithException() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, new Method() {
            @Override
            public Object invoke(Object obj, Object... args) throws Exception {
                throw new IOException("Invocation error");
            }
        });
        try {
            mp.set(testBean, "value");
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testSetAndReturnWithException() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, new Method() {
            @Override
            public Object invoke(Object obj, Object... args) throws Exception {
                throw new IOException("Invocation error");
            }
        });
        try {
            mp.setAndReturn(testBean, "value");
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testSetAndReturnWithNullResult() throws Exception {
        MethodProperty mp = new MethodProperty(propDef, javaType, typeDeser, contextAnnotations, annotatedMethod) {
            @Override
            public Object getMember() {
                return annotatedMethod;
            }
        };
        Method m = MethodProperty.class.getDeclaredField("_setter");
        m.setAccessible(true);
        m.set(mp, setterMethod);
        Object result = mp.setAndReturn(testBean, "test");
        assertSame(testBean, result);
    }

    static class TestBean {
        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}