package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

public class TypeDeserializerBaseTest {

    private TypeDeserializerBase deserializer;
    private DeserializationContext ctxt;
    private JavaType baseType;

    @Before
    public void setUp() throws Exception {
        ctxt = mock(DeserializationContext.class);
        baseType = mock(JavaType.class);
        TypeIdResolver idResolver = mock(TypeIdResolver.class);
        deserializer = new TestTypeDeserializerBase(baseType, idResolver, "type", false, null);
    }

    @Test
    public void testBaseTypeName() {
        when(baseType.getRawClass()).thenReturn(String.class);
        assertEquals("java.lang.String", deserializer.baseTypeName());
    }

    @Test
    public void testGetPropertyName() {
        assertEquals("type", deserializer.getPropertyName());
    }

    @Test
    public void testGetTypeIdResolver() {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        assertSame(resolver, d.getTypeIdResolver());
    }

    @Test
    public void testGetDefaultImpl() {
        JavaType defaultImpl = mock(JavaType.class);
        when(defaultImpl.getRawClass()).thenReturn(Integer.class);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, null, "type", false, defaultImpl);
        assertEquals(Integer.class, d.getDefaultImpl());
    }

    @Test
    public void testGetDefaultImplNull() {
        assertNull(deserializer.getDefaultImpl());
    }

    @Test
    public void testBaseType() {
        assertSame(baseType, deserializer.baseType());
    }

    @Test
    public void testToString() {
        String result = deserializer.toString();
        assertNotNull(result);
        assertTrue(result.contains("base-type"));
        assertTrue(result.contains("id-resolver"));
        assertTrue(result.endsWith("]"));
    }

    @Test
    public void testFindDeserializerFromCache() throws IOException {
        JsonDeserializer<Object> cached = mock(JsonDeserializer.class);
        deserializer._deserializers.put("type1", cached);
        JsonDeserializer<Object> result = deserializer._findDeserializer(ctxt, "type1");
        assertSame(cached, result);
        verify(ctxt, never()).findContextualValueDeserializer(any(), any());
    }

    @Test
    public void testFindDeserializerNoCacheTypeResolution() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(ctxt.findContextualValueDeserializer(any(), any())).thenReturn(mock(JsonDeserializer.class));
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        
        JsonDeserializer<Object> result = d._findDeserializer(ctxt, "unknown");
        assertNotNull(result);
        verify(resolver).typeFromId(eq(ctxt), eq("unknown"));
    }

    @Test
    public void testFindDeserializerNoCacheNullType() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(resolver.typeFromId(any(), any())).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        
        JsonDeserializer<Object> result = d._findDeserializer(ctxt, "unknown");
        assertNull(result);
        verify(ctxt).isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
    }

    @Test
    public void testFindDeserializerNoCacheNullTypeFailOnInvalid() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(resolver.typeFromId(any(), any())).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        
        JsonDeserializer<Object> result = d._findDeserializer(ctxt, "unknown");
        assertNull(result);
        verify(ctxt).isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE);
    }

    @Test
    public void testFindDeserializerWithNullDefaultImpl() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(resolver.typeFromId(any(), any())).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        
        JsonDeserializer<Object> result = deserializer._findDeserializer(ctxt, "unknown");
        assertNull(result);
    }

    @Test
    public void testFindDeserializerWithVoidDefaultImpl() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        JavaType voidType = mock(JavaType.class);
        when(voidType.getRawClass()).thenReturn(Void.class);
        when(resolver.typeFromId(any(), any())).thenReturn(voidType);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        
        JsonDeserializer<Object> result = d._findDeserializer(ctxt, "unknown");
        assertNull(result);
    }

    @Test
    public void testFindDeserializerWithBogusDefaultImpl() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        JavaType voidType = mock(JavaType.class);
        when(voidType.getRawClass()).thenReturn(Object.class);
        when(resolver.typeFromId(any(), any())).thenReturn(voidType);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        
        JsonDeserializer<Object> result = d._findDeserializer(ctxt, "unknown");
        assertNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializerNullDefault() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        JsonDeserializer<Object> result = deserializer._findDefaultImplDeserializer(ctxt);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializerNullDefaultFailOnInvalid() throws IOException {
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(true);
        JsonDeserializer<Object> result = deserializer._findDefaultImplDeserializer(ctxt);
        assertNull(result);
    }

    @Test
    public void testFindDefaultImplDeserializerBogusClass() throws IOException {
        JavaType defaultImpl = mock(JavaType.class);
        when(defaultImpl.getRawClass()).thenReturn(Void.class);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, null, "type", false, defaultImpl);
        
        JsonDeserializer<Object> result = d._findDefaultImplDeserializer(ctxt);
        assertSame(NullifyingDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultImplDeserializerValid() throws IOException {
        JavaType defaultImpl = mock(JavaType.class);
        when(defaultImpl.getRawClass()).thenReturn(Integer.class);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, null, "type", false, defaultImpl);
        JsonDeserializer<Object> expectedDeser = mock(JsonDeserializer.class);
        when(ctxt.findContextualValueDeserializer(eq(defaultImpl), any())).thenReturn(expectedDeser);
        
        JsonDeserializer<Object> result = d._findDefaultImplDeserializer(ctxt);
        assertSame(expectedDeser, result);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNullTypeId() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        when(jp.getTypeId()).thenReturn(null);
        when(ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)).thenReturn(false);
        
        Object result = deserializer._deserializeWithNativeTypeId(jp, ctxt, null);
        assertNull(result);
    }

    @Test
    public void testDeserializeWithNativeTypeIdNonNullTypeId() throws IOException {
        JsonParser jp = mock(JsonParser.class);
        Object typeId = "myType";
        JsonDeserializer<Object> deser = mock(JsonDeserializer.class);
        when(jp.getTypeId()).thenReturn(typeId);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, mock(TypeIdResolver.class), "type", false, null);
        when(d._findDeserializer(ctxt, "myType")).thenReturn(deser);
        
        Object expectedResult = new Object();
        when(deser.deserialize(eq(jp), eq(ctxt))).thenReturn(expectedResult);
        
        Object result = d._deserializeWithNativeTypeId(jp, ctxt, typeId);
        assertSame(expectedResult, result);
    }

    @Test
    public void testHandleUnknownTypeId() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(resolver.getDescForKnownTypeIds()).thenReturn("known types");
        BeanProperty property = mock(BeanProperty.class);
        when(property.getName()).thenReturn("prop");
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        d._property = property;
        when(ctxt.handleUnknownTypeId(any(), any(), any(), any())).thenReturn(baseType);
        
        JavaType result = d._handleUnknownTypeId(ctxt, "unknownType");
        assertSame(baseType, result);
        verify(ctxt).handleUnknownTypeId(eq(baseType), eq("unknownType"), eq(resolver), contains("known types"));
    }

    @Test
    public void testHandleUnknownTypeIdNullDescription() throws IOException {
        TypeIdResolver resolver = mock(TypeIdResolver.class);
        when(resolver.getDescForKnownTypeIds()).thenReturn(null);
        TypeDeserializerBase d = new TestTypeDeserializerBase(baseType, resolver, "type", false, null);
        when(ctxt.handleUnknownTypeId(any(), any(), any(), any())).thenReturn(baseType);
        
        JavaType result = d._handleUnknownTypeId(ctxt, "unknownType");
        assertSame(baseType, result);
        verify(ctxt).handleUnknownTypeId(eq(baseType), eq("unknownType"), eq(resolver), contains("type ids are not statically known"));
    }

    @Test
    public void testHandleMissingTypeId() throws IOException {
        when(ctxt.handleMissingTypeId(any(), any(), any())).thenReturn(baseType);
        
        JavaType result = deserializer._handleMissingTypeId(ctxt, "extraDesc");
        assertSame(baseType, result);
        verify(ctxt).handleMissingTypeId(eq(baseType), eq(deserializer._idResolver), eq("extraDesc"));
    }

    // Helper class for testing abstract class
    private static class TestTypeDeserializerBase extends TypeDeserializerBase {
        private static final long serialVersionUID = 1L;

        public TestTypeDeserializerBase(JavaType baseType, TypeIdResolver idRes,
                String typePropertyName, boolean typeIdVisible, JavaType defaultImpl) {
            super(baseType, idRes, typePropertyName, typeIdVisible, defaultImpl);
        }

        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return null;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return null;
        }

        @Override
        public JsonDeserializer<Object> deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt)
                throws IOException {
            return null;
        }

        @Override
        public JsonDeserializer<Object> deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt)
                throws IOException {
            return null;
        }

        @Override
        public JsonDeserializer<Object> deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt)
                throws IOException {
            return null;
        }

        @Override
        public JsonDeserializer<Object> deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt)
                throws IOException {
            return null;
        }
    }
}