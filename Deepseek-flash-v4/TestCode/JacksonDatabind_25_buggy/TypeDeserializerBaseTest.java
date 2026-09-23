package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;

public class TypeDeserializerBaseTest {

    private static class TestTypeDeserializerBase extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;
        
        public TestTypeDeserializerBase(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }
        
        public TestTypeDeserializerBase(TestTypeDeserializerBase src, BeanProperty property) {
            super(src, property);
        }
        
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return new TestTypeDeserializerBase(this, prop);
        }
        
        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }
        
        // expose protected methods for testing
        public JsonDeserializer<Object> callFindDeserializer(DeserializationContext ctxt, String typeId) throws IOException {
            return _findDeserializer(ctxt, typeId);
        }
        
        public JsonDeserializer<Object> callFindDefaultImplDeserializer(DeserializationContext ctxt) throws IOException {
            return _findDefaultImplDeserializer(ctxt);
        }
        
        public Object callDeserializeWithNativeTypeId(JsonParser jp, DeserializationContext ctxt, Object typeId) throws IOException {
            return _deserializeWithNativeTypeId(jp, ctxt, typeId);
        }
        
        public void callHandleUnknownTypeId(DeserializationContext ctxt, String typeId,
                TypeIdResolver idResolver, JavaType baseType) throws IOException {
            _handleUnknownTypeId(ctxt, typeId, idResolver, baseType);
        }
    }

    private static class TestTypeIdResolver implements TypeIdResolver {
        private String knownTypeId;
        
        public TestTypeIdResolver(String knownTypeId) {
            this.knownTypeId = knownTypeId;
        }
        
        @Override
        public void init(JavaType baseType) {}
        
        @Override
        public String idFromValue(Object value) { return null; }
        
        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }
        
        @Override
        public String idFromBaseType() { return null; }
        
        @Override
        public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException {
            if (id.equals(knownTypeId)) {
                return ctxt.getTypeFactory().constructType(String.class);
            }
            return null;
        }
        
        @Override
        public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CLASS; }
    }
    
    private static class MockDeserializationContext extends DeserializationContext {
        private boolean failOnInvalidSubtype;
        private JavaType unknownType;
        private String typeId;
        
        public MockDeserializationContext(boolean failOnInvalidSubtype) {
            super(null, null, null, null, null);
            this.failOnInvalidSubtype = failOnInvalidSubtype;
        }
        
        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            if (feature == DeserializationFeature.FAIL_ON_INVALID_SUBTYPE) {
                return failOnInvalidSubtype;
            }
            return false;
        }
        
        @Override
        public JsonDeserializer<Object> findContextualValueDeserializer(JavaType type, BeanProperty property) throws JsonMappingException {
            return new JsonDeserializer<Object>() {
                @Override
                public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                    return "default";
                }
            };
        }
        
        @Override
        public JsonMappingException unknownTypeException(JavaType type, String id, String extraDesc) {
            return new JsonMappingException(null, "Unknown type: " + id);
        }
        
        @Override
        public JavaType constructType(Class<?> cls) {
            return null;
        }
    }
    
    private TestTypeDeserializerBase deserializer;
    private JavaType baseType;
    private TestTypeIdResolver idResolver;
    private MockDeserializationContext ctxt;
    
    @Before
    public void setUp() {
        baseType = JavaTypeFactory.simpleType(String.class);
        idResolver = new TestTypeIdResolver("known");
        deserializer = new TestTypeDeserializerBase(baseType, idResolver, "type", true, null);
        ctxt = new MockDeserializationContext(true);
    }
    
    @Test
    public void testConstructor_NullDefaultImpl() {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, null);
        assertNull(test.getDefaultImpl());
        assertEquals("type", test.getPropertyName());
        assertSame(idResolver, test.getTypeIdResolver());
        assertEquals("java.lang.String", test.baseTypeName());
    }
    
    @Test
    public void testConstructor_WithDefaultImpl() {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, Integer.class);
        assertEquals(Integer.class, test.getDefaultImpl());
    }
    
    @Test
    public void testCopyConstructor() {
        TypeDeserializerBase original = new TestTypeDeserializerBase(baseType, idResolver, "type", true, null);
        BeanProperty prop = null; // not testing property here
        TypeDeserializerBase copy = new TestTypeDeserializerBase(original, prop);
        assertEquals(original.baseTypeName(), copy.baseTypeName());
        assertEquals(original.getPropertyName(), copy.getPropertyName());
        assertSame(original.getTypeIdResolver(), copy.getTypeIdResolver());
    }
    
    @Test
    public void testToString() {
        String str = deserializer.toString();
        assertNotNull(str);
        assertTrue(str.contains("base-type:"));
        assertTrue(str.contains("id-resolver:"));
    }
    
    @Test
    public void testGetTypeIdResolver() {
        assertSame(idResolver, deserializer.getTypeIdResolver());
    }
    
    @Test
    public void testGetDefaultImpl_Null() {
        assertNull(deserializer.getDefaultImpl());
    }
    
    @Test
    public void testGetDefaultImpl_WithValue() {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, Double.class);
        assertEquals(Double.class, test.getDefaultImpl());
    }
    
    @Test
    public void testGetPropertyName() {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "myProp", true, null);
        assertEquals("myProp", test.getPropertyName());
    }
    
    @Test
    public void testBaseTypeName() {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, null);
        assertEquals("java.lang.String", test.baseTypeName());
    }
    
    @Test
    public void testFindDeserializer_TypeFound() throws IOException {
        JsonDeserializer<Object> result = deserializer.callFindDeserializer(ctxt, "known");
        assertNotNull(result);
    }
    
    @Test
    public void testFindDeserializer_TypeNotFound_DefaultImplExists() throws IOException {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, String.class);
        JsonDeserializer<Object> result = test.callFindDeserializer(ctxt, "unknown");
        assertNotNull(result);
    }
    
    @Test
    public void testFindDeserializer_TypeNotFound_NoDefaultImpl_Throws() throws IOException {
        try {
            deserializer.callFindDeserializer(ctxt, "unknown");
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown type"));
        }
    }
    
    @Test
    public void testFindDefaultImplDeserializer_NullDefaultImpl_FailOnInvalidSubtype() throws IOException {
        MockDeserializationContext failCtxt = new MockDeserializationContext(true);
        JsonDeserializer<Object> result = deserializer.callFindDefaultImplDeserializer(failCtxt);
        assertNull("Should return null when no default and fail on invalid subtype", result);
    }
    
    @Test
    public void testFindDefaultImplDeserializer_NullDefaultImpl_NoFailOnInvalidSubtype() throws IOException {
        MockDeserializationContext noFailCtxt = new MockDeserializationContext(false);
        JsonDeserializer<Object> result = deserializer.callFindDefaultImplDeserializer(noFailCtxt);
        assertSame(NullifyingDeserializer.instance, result);
    }
    
    @Test
    public void testFindDefaultImplDeserializer_BogusClass() throws IOException {
        // Use Void as bogus class
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, Void.class);
        JsonDeserializer<Object> result = test.callFindDefaultImplDeserializer(ctxt);
        assertSame(NullifyingDeserializer.instance, result);
    }
    
    @Test
    public void testFindDefaultImplDeserializer_ValidDefaultImpl() throws IOException {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, Integer.class);
        JsonDeserializer<Object> result = test.callFindDefaultImplDeserializer(ctxt);
        assertNotNull(result);
    }
    
    @Test
    public void testHandleUnknownTypeId_WithTypeIdResolverBase() throws IOException {
        class TestTypeIdResolverBase extends TypeIdResolverBase {
            @Override
            public String getDescForKnownTypeIds() {
                return "known1, known2";
            }
            
            @Override
            public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CLASS; }
            
            @Override
            public String idFromValue(Object value) { return null; }
            
            @Override
            public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }
            
            @Override
            public String idFromBaseType() { return null; }
            
            @Override
            public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException {
                return null;
            }
        }
        
        TestTypeIdResolverBase resolver = new TestTypeIdResolverBase();
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, resolver, "type", true, null);
        try {
            test.callHandleUnknownTypeId(ctxt, "unknown", resolver, baseType);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown type"));
        }
    }
    
    @Test
    public void testHandleUnknownTypeId_WithTypeIdResolverBase_NullDesc() throws IOException {
        class TestTypeIdResolverBase extends TypeIdResolverBase {
            @Override
            public String getDescForKnownTypeIds() {
                return null;
            }
            
            @Override
            public JsonTypeInfo.Id getMechanism() { return JsonTypeInfo.Id.CLASS; }
            
            @Override
            public String idFromValue(Object value) { return null; }
            
            @Override
            public String idFromValueAndType(Object value, Class<?> suggestedType) { return null; }
            
            @Override
            public String idFromBaseType() { return null; }
            
            @Override
            public JavaType typeFromId(DeserializationContext ctxt, String id) throws IOException {
                return null;
            }
        }
        
        TestTypeIdResolverBase resolver = new TestTypeIdResolverBase();
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, resolver, "type", true, null);
        try {
            test.callHandleUnknownTypeId(ctxt, "unknown", resolver, baseType);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown type"));
        }
    }
    
    @Test
    public void testHandleUnknownTypeId_WithNonBaseResolver() throws IOException {
        try {
            deserializer.callHandleUnknownTypeId(ctxt, "unknown", idResolver, baseType);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unknown type"));
        }
    }
    
    @Test
    public void testDeserializeWithNativeTypeId_NullTypeId_DefaultImplExists() throws IOException {
        TypeDeserializerBase test = new TestTypeDeserializerBase(baseType, idResolver, "type", true, String.class);
        JsonParser jp = null; // not used in this path
        Object result = test.callDeserializeWithNativeTypeId(jp, ctxt, null);
        assertEquals("default", result);
    }
    
    @Test
    public void testDeserializeWithNativeTypeId_NullTypeId_NoDefaultImpl() throws IOException {
        try {
            deserializer.callDeserializeWithNativeTypeId(null, ctxt, null);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("No (native) type id found"));
        }
    }
    
    @Test
    public void testDeserializeWithNativeTypeId_WithStringTypeId() throws IOException {
        JsonParser jp = null; // not used in this path
        Object result = deserializer.callDeserializeWithNativeTypeId(jp, ctxt, "known");
        assertEquals("default", result);
    }
}