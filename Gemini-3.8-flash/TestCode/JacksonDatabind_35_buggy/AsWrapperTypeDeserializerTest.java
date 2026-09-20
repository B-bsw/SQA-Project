package com.fasterxml.jackson.databind.jsontype.impl;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class AsWrapperTypeDeserializerTest {

    private CustomObjectMapper mapper;
    private JavaType dummyBeanType;
    private JavaType stringType;
    private JavaType listType;
    private CustomTypeIdResolver idResolver;

    public static class DummyBean {
        public String type;
        public String name;

        public DummyBean() {
        }

        public DummyBean(String name) {
            this.name = name;
        }
    }

    public static class CustomObjectMapper extends ObjectMapper {
        private static final long serialVersionUID = 1L;

        public DeserializationContext createTestContext(JsonParser p) {
            return createDeserializationContext(p);
        }
    }

    public static class CustomTypeIdResolver extends TypeIdResolverBase {
        private final Map<String, JavaType> idToTypeMap = new HashMap<String, JavaType>();

        public CustomTypeIdResolver(JavaType baseType, TypeFactory typeFactory) {
            super(baseType, typeFactory);
        }

        public void registerType(String id, JavaType type) {
            idToTypeMap.put(id, type);
        }

        @Override
        public String idFromValue(Object value) {
            return null;
        }

        @Override
        public String idFromValueAndType(Object value, Class<?> suggestedType) {
            return null;
        }

        @Override
        public JsonTypeInfo.Id getMechanism() {
            return JsonTypeInfo.Id.CUSTOM;
        }

        @Override
        public JavaType typeFromId(String id) {
            return idToTypeMap.get(id);
        }

        @Override
        public JavaType typeFromId(DatabindContext context, String id) {
            return typeFromId(id);
        }
    }

    public static class NativeTypeIdParser extends JsonParserDelegate {
        private final Object nativeTypeId;

        public NativeTypeIdParser(JsonParser delegate, Object nativeTypeId) {
            super(delegate);
            this.nativeTypeId = nativeTypeId;
        }

        @Override
        public boolean canReadTypeId() {
            return nativeTypeId != null;
        }

        @Override
        public Object getTypeId() {
            return nativeTypeId;
        }
    }

    private BeanProperty createMockBeanProperty(final String propName) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if ("getName".equals(method.getName())) {
                    return propName;
                }
                return null;
            }
        };
        return (BeanProperty) Proxy.newProxyInstance(
                BeanProperty.class.getClassLoader(),
                new Class<?>[] { BeanProperty.class },
                handler
        );
    }

    @Before
    public void setUp() {
        mapper = new CustomObjectMapper();
        dummyBeanType = mapper.constructType(DummyBean.class);
        stringType = mapper.constructType(String.class);
        listType = mapper.getTypeFactory().constructCollectionType(List.class, String.class);

        idResolver = new CustomTypeIdResolver(dummyBeanType, mapper.getTypeFactory());
        idResolver.registerType("dummy", dummyBeanType);
        idResolver.registerType("string", stringType);
        idResolver.registerType("list", listType);
    }

    @Test
    public void getTypeInclusion_shouldReturnWrapperObject() {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );

        As inclusion = deser.getTypeInclusion();

        Assert.assertEquals(As.WRAPPER_OBJECT, inclusion);
    }

    @Test
    public void forProperty_givenSameProperty_shouldReturnSameInstance() {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );

        TypeDeserializer result = deser.forProperty(deser.getProperty());

        Assert.assertSame(deser, result);
    }

    @Test
    public void forProperty_givenDifferentProperty_shouldReturnNewInstanceWithUpdatedProperty() {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        BeanProperty prop = createMockBeanProperty("testProp");

        TypeDeserializer result = deser.forProperty(prop);

        Assert.assertNotSame(deser, result);
        Assert.assertSame(prop, result.getProperty());
        Assert.assertSame(result, result.forProperty(prop));
    }

    @Test
    public void deserializeTypedFromObject_givenValidWrappedObject_shouldDeserializeSuccessfully() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        String json = "{\"dummy\":{\"name\":\"testObject\"}}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromObject(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof DummyBean);
        DummyBean bean = (DummyBean) result;
        Assert.assertEquals("testObject", bean.name);
    }

    @Test
    public void deserializeTypedFromArray_givenValidWrappedArray_shouldDeserializeSuccessfully() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                listType, idResolver, "type", false, List.class
        );
        String json = "{\"list\":[\"entry1\",\"entry2\"]}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromArray(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof List);
        List<?> list = (List<?>) result;
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("entry1", list.get(0));
        Assert.assertEquals("entry2", list.get(1));
    }

    @Test
    public void deserializeTypedFromScalar_givenValidWrappedScalar_shouldDeserializeSuccessfully() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                stringType, idResolver, "type", false, String.class
        );
        String json = "{\"string\":\"scalarContent\"}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromScalar(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertEquals("scalarContent", result);
    }

    @Test
    public void deserializeTypedFromAny_givenValidWrappedScalar_shouldDeserializeSuccessfully() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                stringType, idResolver, "type", false, String.class
        );
        String json = "{\"string\":\"anyContent\"}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromAny(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertEquals("anyContent", result);
    }

    @Test
    public void deserialize_givenNativeTypeIdAvailable_shouldDeserializeUsingNativeTypeId() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        String json = "{\"name\":\"nativeObject\"}";
        JsonParser baseParser = mapper.getFactory().createParser(json);
        NativeTypeIdParser parser = new NativeTypeIdParser(baseParser, "dummy");
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromObject(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof DummyBean);
        DummyBean bean = (DummyBean) result;
        Assert.assertEquals("nativeObject", bean.name);
    }

    @Test
    public void deserialize_givenTokenNotStartObject_shouldThrowJsonProcessingException() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        String json = "[\"dummy\",{\"name\":\"test\"}]";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        try {
            deser.deserializeTypedFromObject(parser, ctxt);
            Assert.fail("Expected JsonProcessingException when current token is not START_OBJECT");
        } catch (JsonProcessingException e) {
            Assert.assertTrue(e.getMessage().indexOf("need JSON Object to contain As.WRAPPER_OBJECT type information") >= 0);
        }
    }

    @Test
    public void deserialize_givenNoFieldNameAfterStartObject_shouldThrowJsonProcessingException() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        String json = "{}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        try {
            deser.deserializeTypedFromObject(parser, ctxt);
            Assert.fail("Expected JsonProcessingException when FIELD_NAME token is missing");
        } catch (JsonProcessingException e) {
            Assert.assertTrue(e.getMessage().indexOf("need JSON String that contains type id") >= 0);
        }
    }

    @Test
    public void deserialize_givenMissingClosingEndObject_shouldThrowJsonProcessingException() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", false, DummyBean.class
        );
        String json = "{\"dummy\":{\"name\":\"test\"},\"extra\":123}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        try {
            deser.deserializeTypedFromObject(parser, ctxt);
            Assert.fail("Expected JsonProcessingException when closing END_OBJECT is missing");
        } catch (JsonProcessingException e) {
            Assert.assertTrue(e.getMessage().indexOf("expected closing END_OBJECT") >= 0);
        }
    }

    @Test
    public void deserialize_givenTypeIdVisibleTrueAndObjectValue_shouldInjectTypeIdIntoObject() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                dummyBeanType, idResolver, "type", true, DummyBean.class
        );
        String json = "{\"dummy\":{\"name\":\"visibleIdTest\"}}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromObject(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof DummyBean);
        DummyBean bean = (DummyBean) result;
        Assert.assertEquals("visibleIdTest", bean.name);
        Assert.assertEquals("dummy", bean.type);
    }

    @Test
    public void deserialize_givenTypeIdVisibleTrueAndScalarValue_shouldNotInjectTypeId() throws IOException {
        AsWrapperTypeDeserializer deser = new AsWrapperTypeDeserializer(
                stringType, idResolver, "type", true, String.class
        );
        String json = "{\"string\":\"scalarWithVisibleTypeId\"}";
        JsonParser parser = mapper.getFactory().createParser(json);
        parser.nextToken();
        DeserializationContext ctxt = mapper.createTestContext(parser);

        Object result = deser.deserializeTypedFromScalar(parser, ctxt);

        Assert.assertNotNull(result);
        Assert.assertEquals("scalarWithVisibleTypeId", result);
    }
}