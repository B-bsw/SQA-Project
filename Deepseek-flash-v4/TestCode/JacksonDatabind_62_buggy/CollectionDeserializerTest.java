package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CollectionDeserializerTest {

    private JsonParser parser(String json) throws IOException {
        JsonParser p = new JsonFactory().createParser(json);
        p.nextToken();
        return p;
    }

    @Test
    public void testWithResolvedSameInstance() {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        ValueInstantiator vi = new MockValueInstantiator();
        JsonDeserializer<Object> vd = new MockValueDeserializer();
        CollectionDeserializer deser = new CollectionDeserializer(type, vd, null, vi);

        assertSame(deser, deser.withResolved(null, vd, null, null));
    }

    @Test
    public void testWithResolvedNewInstanceAndUnwrapSingle() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        ValueInstantiator vi = new MockValueInstantiator();
        JsonDeserializer<Object> vd = new MockValueDeserializer();
        CollectionDeserializer base = new CollectionDeserializer(type, vd, null, vi);
        CollectionDeserializer unwrap = base.withResolved(null, vd, null, Boolean.TRUE);

        assertNotSame(base, unwrap);
        assertEquals(Arrays.asList("single"), unwrap.deserialize(parser("\"single\""), null));
    }

    @Test
    public void testIsCachable() {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        ValueInstantiator vi = new MockValueInstantiator();
        JsonDeserializer<Object> vd = new MockValueDeserializer();

        assertTrue(new CollectionDeserializer(type, null, null, vi).isCachable());
        assertFalse(new CollectionDeserializer(type, vd, null, vi).isCachable());

        CollectionDeserializer base = new CollectionDeserializer(type, vd, null, vi);
        CollectionDeserializer withDelegate = base.withResolved(new MockValueDeserializer(), null, null, null);
        assertFalse(withDelegate.isCachable());
    }

    @Test
    public void testGetContentTypeAndContentDeserializer() {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> vd = new MockValueDeserializer();
        CollectionDeserializer deser = new CollectionDeserializer(type, vd, null, new MockValueInstantiator());

        assertEquals(String.class, deser.getContentType().getRawClass());
        assertSame(vd, deser.getContentDeserializer());
    }

    @Test
    public void testDeserializeArrayWithNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> vd = new MockValueDeserializer();
        CollectionDeserializer deser = new CollectionDeserializer(type, vd, null, new MockValueInstantiator());

        Collection<Object> result = deser.deserialize(parser("[\"a\", null, \"b\"]"), null);

        assertEquals(Arrays.asList("a", "NULL", "b"), result);
    }

    @Test
    public void testDeserializeEmptyString() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        CollectionDeserializer deser = new CollectionDeserializer(type, null, null, new MockValueInstantiator());

        Collection<Object> result = deser.deserialize(parser("\"\""), null);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testDeserializeUsingDelegate() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        JsonDeserializer<Object> vd = new MockValueDeserializer();
        CollectionDeserializer base = new CollectionDeserializer(type, vd, null, new MockValueInstantiator());
        CollectionDeserializer deser = base.withResolved(new FixedValueDeserializer("delegate"), vd, null, null);

        Collection<Object> result = deser.deserialize(parser("[]"), null);

        assertEquals(Arrays.asList("delegate"), result);
    }

    @Test(expected = JsonMappingException.class)
    public void testDeserializeWrapsRuntimeException() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        CollectionDeserializer deser = new CollectionDeserializer(type, new ThrowingDeserializer(), null,
                new MockValueInstantiator());

        deser.deserialize(parser("[\"x\"]"), null);
    }

    @Test
    public void testDeserializeWithType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        CollectionDeserializer deser = new CollectionDeserializer(type, new MockValueDeserializer(),
                null, new MockValueInstantiator());

        Object result = deser.deserializeWithType(parser("[]"), null, new MockTypeDeserializer());

        assertEquals("typed-array", result);
    }

    @Test
    public void testCollectionReferringAccumulator() throws Exception {
        List<Object> result = new ArrayList<Object>();
        CollectionDeserializer.CollectionReferringAccumulator acc =
                new CollectionDeserializer.CollectionReferringAccumulator(String.class, result);

        acc.add("a");
        assertEquals(Arrays.asList("a"), result);

        UnresolvedForwardReference ref1 = new UnresolvedForwardReference(null, "unresolved", null,
                new ReadableObjectId("id1"));
        acc.handleUnresolvedReference(ref1);
        acc.add("b");
        assertEquals(Arrays.asList("a"), result);

        UnresolvedForwardReference ref2 = new UnresolvedForwardReference(null, "unresolved", null,
                new ReadableObjectId("id2"));
        acc.handleUnresolvedReference(ref2);
        acc.add("c");
        assertEquals(Arrays.asList("a"), result);

        acc.resolveForwardReference("id2", "B");
        assertEquals(Arrays.asList("a"), result);

        acc.resolveForwardReference("id1", "A");
        assertEquals(Arrays.asList("a", "A", "B", "c"), result);

        try {
            acc.resolveForwardReference("unknown", "x");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    static class MockValueInstantiator extends ValueInstantiator {
        @Override
        public String getValueTypeDesc() {
            return "mock";
        }

        @Override
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override
        public Object createUsingDefault(DeserializationContext ctxt) throws IOException {
            return new ArrayList<Object>();
        }

        @Override
        public boolean canCreateFromString() {
            return true;
        }

        @Override
        public Object createFromString(DeserializationContext ctxt, String value) throws IOException {
            return new ArrayList<Object>();
        }

        @Override
        public boolean canCreateUsingDelegate() {
            return true;
        }

        @Override
        public Object createUsingDelegate(DeserializationContext ctxt, Object delegate) throws IOException {
            return new ArrayList<Object>(Arrays.asList(delegate));
        }
    }

    static class MockValueDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return p.getCurrentToken() == JsonToken.VALUE_STRING ? p.getText() : String.valueOf(p.getCurrentToken());
        }

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return "NULL";
        }
    }

    static class FixedValueDeserializer extends JsonDeserializer<Object> {
        private final Object value;

        FixedValueDeserializer(Object value) {
            this.value = value;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return value;
        }
    }

    static class ThrowingDeserializer extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            throw new RuntimeException("boom");
        }
    }

    static class MockTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty property) {
            return this;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.WRAPPER_ARRAY;
        }

        @Override
        public String getPropertyName() {
            return "type";
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return null;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return "typed-array";
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }
}