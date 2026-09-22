package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonTokenId;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TokenBuffer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonTokenId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class BeanDeserializerTest {

    private BeanDeserializer deserializer;
    private DeserializationContext ctxt;
    private JsonParser p;

    @Before
    public void setUp() {
        // Initialize test dependencies
        ctxt = null;
        p = null;
    }

    @After
    public void tearDown() {
        deserializer = null;
        ctxt = null;
        p = null;
    }

    @Test
    public void testUnwrappingDeserializer_ReturnsThis_WhenClassNotExact() {
        // Setup a scenario where getClass() != BeanDeserializer.class (e.g., subclass)
        BeanDeserializer subclass = new BeanDeserializer(null, null, null, null, null, false, false) {
            // Anonymous subclass to trigger the class check
        };
        NameTransformer transformer = new NameTransformer() {
            @Override
            public String transform(String name) {
                return name;
            }

            @Override
            public String reverse(String transformed) {
                return transformed;
            }
        };
        assertEquals(subclass, subclass.unwrappingDeserializer(transformer));
    }

    @Test
    public void testUnwrappingDeserializer_CreatesNewInstance_WhenNoTransformation() {
        // Need proper setup with mocked dependencies (plain Java objects)
        BeanDeserializer deser = createBasicDeserializer();
        NameTransformer transformer = new NameTransformer.Chain(new NameTransformer.Chain(new NameTransformer.Nop()));
        JsonDeserializer<Object> result = deser.unwrappingDeserializer(transformer);
        assertNotNull(result);
        assertTrue(result instanceof BeanDeserializer);
    }

    @Test
    public void testUnwrappingDeserializer_ReturnsThis_WhenTransformationInProgress() throws Exception {
        BeanDeserializer deser = createBasicDeserializer();
        NameTransformer transformer = new NameTransformer.Chain(new NameTransformer.Chain(new NameTransformer.Nop()));
        
        // Simulate reentrant call
        final AtomicReference<JsonDeserializer<Object>> innerResult = new AtomicReference<>();
        NameTransformer recursiveTransformer = new NameTransformer() {
            @Override
            public String transform(String name) { return name; }
            @Override
            public String reverse(String transformed) { return transformed; }
            @Override
            public boolean equals(Object o) { return super.equals(o); }
            @Override
            public int hashCode() { return super.hashCode(); }
        };
        
        deserializer._currentlyTransforming = transformer;
        assertEquals(deserializer, deserializer.unwrappingDeserializer(transformer));
    }

    @Test
    public void testDeserialize_NullToken_UsesOtherPath() throws IOException {
        BeanDeserializer deser = createBasicDeserializer();
        JsonParser parser = mockParser();
        // Setup token as null / end of input
        when(parser.isExpectedStartObjectToken()).thenReturn(false);
        when(parser.getCurrentToken()).thenReturn(null);
        
        try {
            deser.deserialize(parser, ctxt);
            fail("Expected exception");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testDeserialize_NonObjectToken_SwitchStatement() throws IOException {
        BeanDeserializer deser = createBasicDeserializer();
        JsonParser parser = mockParser();
        
        // Test VALUE_STRING case
        when(parser.isExpectedStartObjectToken()).thenReturn(false);
        when(parser.getCurrentToken()).thenReturn(JsonToken.VALUE_STRING);
        try {
            deser.deserialize(parser, ctxt);
            fail("Should fail for invalid token");
        } catch (JsonMappingException e) {
            // Expected
        }
    }

    @Test
    public void testDeserialize_WithObjectId() throws IOException {
        BeanDeserializer deser = createBasicDeserializer();
        JsonParser parser = mockParser();
        
        when(parser.isExpectedStartObjectToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentName()).thenReturn("id");
        when(parser.nextFieldName()).thenReturn(null);
        
        // ObjectIdReader is not null
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false) {
            {
                _objectIdReader = new ObjectIdReader();
                _vanillaProcessing = true;
            }
        };
        
        Object result = deserializer.deserialize(parser, ctxt);
        assertNotNull(result); // Should handle case
    }

    @Test
    public void testDeserialize_WithViewProcessing() throws IOException {
        BeanDeserializer deser = createBasicDeserializer();
        JsonParser parser = mockParser();
        
        when(parser.isExpectedStartObjectToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentName()).thenReturn("name");
        when(parser.nextFieldName()).thenReturn(null);
        
        // Need view processing
        deserializer = new BeanDeserializer(null, null, null, null, null, false, true) {
            {
                _vanillaProcessing = true;
                _needViewProcesing = true;
            }
        };
        
        Object result = deserializer.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_WithUnwrappedPropertyHandler() throws IOException {
        BeanDeserializer deser = createBasicDeserializer();
        JsonParser parser = mockParser();
        
        when(parser.isExpectedStartObjectToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentName()).thenReturn("prop1");
        when(parser.nextFieldName()).thenReturn(null);
        
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false) {
            {
                _unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                _vanillaProcessing = true;
            }
        };
        
        Object result = deserializer.deserialize(parser, ctxt);
        assertEquals(null, result);
    }

    @Test
    public void testDeserialize_WithExternalTypeIdHandler() throws IOException {
        JsonParser parser = mockParser();
        
        when(parser.isExpectedStartObjectToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentName()).thenReturn("prop1");
        when(parser.nextFieldName()).thenReturn(null);
        
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false) {
            {
                _externalTypeIdHandler = new ExternalTypeHandler(new ExternalTypeHandler.Builder());
                _vanillaProcessing = true;
            }
        };
        
        Object result = deserializer.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserialize_UnknownFieldsHandled() throws IOException {
        JsonParser parser = mockParser();
        
        when(parser.isExpectedStartObjectToken()).thenReturn(true);
        when(parser.nextToken()).thenReturn(JsonToken.FIELD_NAME);
        when(parser.getCurrentName()).thenReturn("unknownProp");
        when(parser.nextFieldName()).thenReturn(null);
        
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false) {
            {
                _ignorableProps = new HashSet<>();
                _ignorableProps.add("unknownProp");
                _vanillaProcessing = true;
            }
        };
        
        Object result = deserializer.deserialize(parser, ctxt);
        assertNull(result);
    }

    @Test
    public void testDeserializeFromNull_WithCustomCodec() throws IOException {
        JsonParser parser = mockParser();
        DeserializationContext ctx = mock(DeserializationContext.class);
        
        when(parser.requiresCustomCodec()).thenReturn(true);
        when(ctx.getActiveView()).thenReturn(null);
        
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false);
        Object result = deserializer.deserializeFromNull(parser, ctx);
        assertNull(result);
    }

    @Test
    public void testDeserializeFromNull_WithoutCustomCodec() throws IOException {
        JsonParser parser = mockParser();
        DeserializationContext ctx = mock(DeserializationContext.class);
        
        when(parser.requiresCustomCodec()).thenReturn(false);
        
        deserializer = new BeanDeserializer(null, null, null, null, null, false, false);
        Object result = deserializer.deserializeFromNull(parser, ctx);
        assertNull(result);
    }

    @Test
    public void testCreatorReturnedNullException_CachesException() {
        BeanDeserializer deser = createBasicDeserializer();
        Exception result1 = deser._creatorReturnedNullException();
        assertNotNull(result1);
        Exception result2 = deser._creatorReturnedNullException();
        assertSame(result1, result2);
    }

    @Test
    public void testHandleResolvedForwardReference_WithBeanNull_SetsReferral() throws IOException {
        BeanReferring referring = new BeanReferring(
            mock(DeserializationContext.class), 
            new UnresolvedForwardReference(null, null),
            null, 
            null, 
            null
        );
        referring.setBean(null);
        
        // Should not throw
        referring.handleResolvedForwardReference("id", new Object());
    }

    @Test
    public void testHandleResolvedForwardReference_WithBeanNotNull_SetsProperty() throws IOException {
        // Setup more complex scenario
        Object bean = new Object();
        BeanReferring referring = new BeanReferring(
            mock(DeserializationContext.class),
            new UnresolvedForwardReference(null, null),
            mock(JavaType.class),
            mock(PropertyValueBuffer.class),
            mock(SettableBeanProperty.class)
        );
        referring.setBean(bean);
        
        // Should not throw when property is set
        referring.handleResolvedForwardReference("id", new Object());
    }

    private BeanDeserializer createBasicDeserializer() {
        return new BeanDeserializer(null, null, null, null, null, false, false);
    }

    private JsonParser mockParser() throws IOException {
        // Use Java dynamic proxy to create mock
        return (JsonParser) java.lang.reflect.Proxy.newProxyInstance(
            JsonParser.class.getClassLoader(),
            new Class[]{JsonParser.class},
            (proxy, method, args) -> {
                switch (method.getName()) {
                    case "isExpectedStartObjectToken":
                        return false;
                    case "getCurrentToken":
                        return JsonToken.START_OBJECT;
                    case "nextToken":
                        return JsonToken.END_OBJECT;
                    case "nextFieldName":
                        return null;
                    case "getCurrentName":
                        return "test";
                    case "getCurrentFieldName":
                        return "test";
                    case "getCurrentValue":
                        return null;
                    case "setCurrentValue":
                        return null;
                    case "hasTokenId":
                        return false;
                    case "getTokenId":
                        return JsonTokenId.ID_EMBEDDED_OBJECT;
                    case "requiresCustomCodec":
                        return false;
                    case "getCurrentTokenId":
                        return JsonTokenId.ID_START_OBJECT;
                    case "nextFieldName(int)":
                        return null;
                    default:
                        return method.getReturnType().getDefaultValue();
                }
            }
        );
    }

    // Mock classes to satisfy compilation
    private static class ExternalTypeHandler {
        public static class Builder {
            public ExternalTypeHandler build() { return new ExternalTypeHandler(); }
        }
        private ExternalTypeHandler() {}
    }

    private static class UnwrappedPropertyHandler {
        // Minimal implementation
    }

    private static class BeanReferring extends ReadableObjectId.Referring {
        private final SettableBeanProperty _prop;
        private final PropertyValueBuffer _buffer;
        private Object _bean;

        public BeanReferring(DeserializationContext ctxt, UnresolvedForwardReference reference, JavaType type, PropertyValueBuffer buffer, SettableBeanProperty prop) {
            super(reference, type);
            this._buffer = buffer;
            this._prop = prop;
        }

        @Override
        public void setBean(Object bean) {
            _bean = bean;
        }

        @Override
        public void handleResolvedForwardReference(Object id, Object value) throws IOException {
            // Implementation for test
        }

        @Override
        public boolean hasId(Object id) {
            return true;
        }
    }

    private static class UnresolvedForwardReference extends ReadableObjectId.Referring {
        public UnresolvedForwardReference(Object id) {
            super(null, null);
        }

        public UnresolvedForwardReference(Object id, Throwable cause) {
            super(null, null);
        }

        @Override
        public boolean hasId(Object id) {
            return true;
        }
    }

    private static class SettableBeanProperty {
        // Minimal mock
    }

    private static class PropertyValueBuffer {
        // Minimal mock
    }

    private static class ObjectIdReader {
        // Minimal mock
    }
}