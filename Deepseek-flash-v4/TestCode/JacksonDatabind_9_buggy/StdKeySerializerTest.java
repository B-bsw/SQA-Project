package com.fasterxml.jackson.databind.ser.std;

import static org.junit.Assert.*;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;

public class StdKeySerializerTest {

    private StdKeySerializer serializer;
    private JsonFactory jsonFactory;

    @Before
    public void setUp() {
        serializer = new StdKeySerializer();
        jsonFactory = new JsonFactory();
    }

    private String serializeFieldName(Object key) throws Exception {
        StringWriter writer = new StringWriter();
        JsonGenerator gen = jsonFactory.createGenerator(writer);
        gen.writeStartObject();
        SerializerProvider provider = new ObjectMapper().getSerializerProvider();
        serializer.serialize(key, gen, provider);
        gen.writeNull();
        gen.writeEndObject();
        gen.close();
        return writer.toString();
    }

    @Test
    public void testSerializeStringKey() throws Exception {
        assertEquals("{\"key\":null}", serializeFieldName("key"));
    }

    @Test
    public void testSerializeEmptyStringKey() throws Exception {
        assertEquals("{\"\":null}", serializeFieldName(""));
    }

    @Test
    public void testSerializeToStringKey() throws Exception {
        Object key = new Object() {
            @Override
            public String toString() {
                return "custom";
            }
        };
        assertEquals("{\"custom\":null}", serializeFieldName(key));
    }

    @Test
    public void testSerializeDateKey() throws Exception {
        String json = serializeFieldName(new Date(0L));
        assertTrue(json.startsWith("{\""));
        assertTrue(json.endsWith("\":null}"));
        assertTrue(json.length() >= 10);
    }

    @Test(expected = NullPointerException.class)
    public void testSerializeNullKey() throws Exception {
        serializeFieldName(null);
    }

    @Test
    public void testGetSchema() throws Exception {
        JsonNode schema = serializer.getSchema(new ObjectMapper().getSerializerProvider(), (Type) null);
        assertNotNull(schema);
        JsonNode typeNode = schema.get("type");
        assertNotNull(typeNode);
        assertEquals("string", typeNode.asText());
    }

    @Test
    public void testAcceptJsonFormatVisitor() throws Exception {
        final boolean[] visited = new boolean[1];
        JsonFormatVisitorWrapper visitor = (JsonFormatVisitorWrapper) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[] { JsonFormatVisitorWrapper.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getDeclaringClass() == Object.class) {
                            if ("hashCode".equals(method.getName())) {
                                return System.identityHashCode(proxy);
                            }
                            if ("equals".equals(method.getName())) {
                                return proxy == args[0];
                            }
                            if ("toString".equals(method.getName())) {
                                return "ProxyJsonFormatVisitorWrapper";
                            }
                        }
                        if ("expectStringFormat".equals(method.getName())) {
                            visited[0] = true;
                        }
                        return null;
                    }
                });
        serializer.acceptJsonFormatVisitor(visitor, (JavaType) null);
        assertTrue(visited[0]);
    }
}