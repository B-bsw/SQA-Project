package com.fasterxml.jackson.databind.ser;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

public class AnyGetterWriterTest {

    private static class StubAnnotatedMember extends AnnotatedMember {
        private static final long serialVersionUID = 1L;
        private final String memberName;
        private Object valueToReturn;

        public StubAnnotatedMember(String memberName, Object valueToReturn) {
            super((AnnotationMap) null);
            this.memberName = memberName;
            this.valueToReturn = valueToReturn;
        }

        public void setValueToReturn(Object valueToReturn) {
            this.valueToReturn = valueToReturn;
        }

        public Object getValue(Object pojo) throws UnsupportedOperationException, IllegalArgumentException {
            return this.valueToReturn;
        }

        public String getName() {
            return this.memberName;
        }

        public Class<?> getDeclaringClass() {
            return Object.class;
        }

        public Member getMember() {
            return null;
        }

        public void setValue(Object pojo, Object value) throws UnsupportedOperationException, IllegalArgumentException {
        }

        public Annotated withAnnotations(AnnotationMap fallback) {
            return this;
        }

        public AnnotatedElement getAnnotated() {
            return null;
        }

        public int getModifiers() {
            return 0;
        }

        public Type getGenericType() {
            return Object.class;
        }

        public Class<?> getRawType() {
            return Object.class;
        }

        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        public boolean hasAnnotation(Class<?> acls) {
            return false;
        }
    }

    private static class MockMapSerializer extends MapSerializer {
        private static final long serialVersionUID = 1L;
        boolean serializeFieldsCalled = false;
        boolean serializeFilteredFieldsCalled = false;
        Map<?, ?> passedMap = null;
        JsonGenerator passedGen = null;
        SerializerProvider passedProvider = null;
        PropertyFilter passedFilter = null;

        public MockMapSerializer() {
            super((Set<String>) null, (JavaType) null, (JavaType) null, false, (TypeSerializer) null, (JsonSerializer<?>) null, (JsonSerializer<?>) null);
        }

        public void serializeFields(Map<?, ?> value, JsonGenerator gen, SerializerProvider provider) {
            this.serializeFieldsCalled = true;
            this.passedMap = value;
            this.passedGen = gen;
            this.passedProvider = provider;
        }

        public void serializeFilteredFields(Map<?, ?> value, JsonGenerator gen, SerializerProvider provider,
                PropertyFilter filter, Object suppressableValue) {
            this.serializeFilteredFieldsCalled = true;
            this.passedMap = value;
            this.passedGen = gen;
            this.passedProvider = provider;
            this.passedFilter = filter;
        }
    }

    private static class MockSerializerProvider extends DefaultSerializerProvider.Impl {
        private static final long serialVersionUID = 1L;
        MapSerializer contextualizedSerializer = null;
        BeanProperty passedProperty = null;
        MapSerializer serializerToReturn = null;

        public MockSerializerProvider() {
            super();
        }

        public JsonSerializer<?> handlePrimaryContextualization(JsonSerializer<?> ser, BeanProperty prop)
                throws JsonMappingException {
            this.contextualizedSerializer = (MapSerializer) ser;
            this.passedProperty = prop;
            if (this.serializerToReturn != null) {
                return this.serializerToReturn;
            }
            return ser;
        }
    }

    private BeanProperty createDummyBeanProperty(final String propName) {
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
                handler);
    }

    private PropertyFilter createDummyPropertyFilter() {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        };
        return (PropertyFilter) Proxy.newProxyInstance(
                PropertyFilter.class.getClassLoader(),
                new Class<?>[] { PropertyFilter.class },
                handler);
    }

    @Test
    public void constructor_givenValidArguments_shouldInitializeFields() {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("testProp");
        StubAnnotatedMember accessor = new StubAnnotatedMember("anyGetter", null);
        MockMapSerializer serializer = new MockMapSerializer();

        // Act
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);

        // Assert
        Assert.assertNotNull(writer);
        Assert.assertSame(prop, writer._property);
        Assert.assertSame(accessor, writer._accessor);
        Assert.assertSame(serializer, writer._mapSerializer);
    }

    @Test
    public void getAndSerialize_givenNullValueReturned_shouldReturnEarlyWithoutSerializing() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getMap", null);
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();

        // Act
        writer.getAndSerialize(dummyBean, null, null);

        // Assert
        Assert.assertFalse(serializer.serializeFieldsCalled);
    }

    @Test
    public void getAndSerialize_givenNonMapValueReturned_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getMap", "NotAMapInstance");
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();

        // Act & Assert
        try {
            writer.getAndSerialize(dummyBean, null, null);
            Assert.fail("Expected JsonMappingException because returned value is not java.util.Map");
        } catch (JsonMappingException e) {
            String msg = e.getMessage();
            Assert.assertTrue(msg.indexOf("Value returned by 'any-getter'") >= 0);
            Assert.assertTrue(msg.indexOf("getMap()") >= 0);
            Assert.assertTrue(msg.indexOf("java.lang.String") >= 0);
        }
        Assert.assertFalse(serializer.serializeFieldsCalled);
    }

    @Test
    public void getAndSerialize_givenValidMapAndNullSerializer_shouldCompleteWithoutError() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        Map<String, String> mapData = new HashMap<String, String>();
        mapData.put("key", "val");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getMap", mapData);
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, null);
        Object dummyBean = new Object();

        // Act
        writer.getAndSerialize(dummyBean, null, null);

        // Assert
        Assert.assertNull(writer._mapSerializer);
    }

    @Test
    public void getAndSerialize_givenValidMapAndSerializer_shouldInvokeSerializeFields() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        Map<String, String> mapData = new HashMap<String, String>();
        mapData.put("foo", "bar");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getMap", mapData);
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();
        MockSerializerProvider provider = new MockSerializerProvider();

        // Act
        writer.getAndSerialize(dummyBean, null, provider);

        // Assert
        Assert.assertTrue(serializer.serializeFieldsCalled);
        Assert.assertSame(mapData, serializer.passedMap);
        Assert.assertNull(serializer.passedGen);
        Assert.assertSame(provider, serializer.passedProvider);
    }

    @Test
    public void getAndFilter_givenNullValueReturned_shouldReturnEarlyWithoutFiltering() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getFilterMap", null);
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();
        PropertyFilter filter = createDummyPropertyFilter();

        // Act
        writer.getAndFilter(dummyBean, null, null, filter);

        // Assert
        Assert.assertFalse(serializer.serializeFilteredFieldsCalled);
    }

    @Test
    public void getAndFilter_givenNonMapValueReturned_shouldThrowJsonMappingException() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getFilterMap", Integer.valueOf(12345));
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();
        PropertyFilter filter = createDummyPropertyFilter();

        // Act & Assert
        try {
            writer.getAndFilter(dummyBean, null, null, filter);
            Assert.fail("Expected JsonMappingException because returned value is not java.util.Map");
        } catch (JsonMappingException e) {
            String msg = e.getMessage();
            Assert.assertTrue(msg.indexOf("Value returned by 'any-getter'") >= 0);
            Assert.assertTrue(msg.indexOf("getFilterMap()") >= 0);
            Assert.assertTrue(msg.indexOf("java.lang.Integer") >= 0);
        }
        Assert.assertFalse(serializer.serializeFilteredFieldsCalled);
    }

    @Test
    public void getAndFilter_givenValidMapAndNullSerializer_shouldCompleteWithoutError() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        Map<String, String> mapData = Collections.singletonMap("a", "b");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getFilterMap", mapData);
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, null);
        Object dummyBean = new Object();
        PropertyFilter filter = createDummyPropertyFilter();

        // Act
        writer.getAndFilter(dummyBean, null, null, filter);

        // Assert
        Assert.assertNull(writer._mapSerializer);
    }

    @Test
    public void getAndFilter_givenValidMapAndSerializer_shouldInvokeSerializeFilteredFields() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("prop");
        Map<String, String> mapData = Collections.singletonMap("k1", "v1");
        StubAnnotatedMember accessor = new StubAnnotatedMember("getFilterMap", mapData);
        MockMapSerializer serializer = new MockMapSerializer();
        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, serializer);
        Object dummyBean = new Object();
        MockSerializerProvider provider = new MockSerializerProvider();
        PropertyFilter filter = createDummyPropertyFilter();

        // Act
        writer.getAndFilter(dummyBean, null, provider, filter);

        // Assert
        Assert.assertTrue(serializer.serializeFilteredFieldsCalled);
        Assert.assertSame(mapData, serializer.passedMap);
        Assert.assertNull(serializer.passedGen);
        Assert.assertSame(provider, serializer.passedProvider);
        Assert.assertSame(filter, serializer.passedFilter);
    }

    @Test
    public void resolve_givenProvider_shouldContextualizeAndReplaceMapSerializer() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("targetProp");
        StubAnnotatedMember accessor = new StubAnnotatedMember("anyGetter", null);
        MockMapSerializer initialSerializer = new MockMapSerializer();
        MockMapSerializer contextualSerializer = new MockMapSerializer();

        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, initialSerializer);
        MockSerializerProvider provider = new MockSerializerProvider();
        provider.serializerToReturn = contextualSerializer;

        // Act
        writer.resolve(provider);

        // Assert
        Assert.assertSame(initialSerializer, provider.contextualizedSerializer);
        Assert.assertSame(prop, provider.passedProperty);
        Assert.assertSame(contextualSerializer, writer._mapSerializer);
    }

    @Test
    public void resolve_andThenGetAndSerialize_shouldUseContextualizedSerializer() throws Exception {
        // Arrange
        BeanProperty prop = createDummyBeanProperty("targetProp");
        Map<String, String> data = Collections.singletonMap("testKey", "testVal");
        StubAnnotatedMember accessor = new StubAnnotatedMember("anyGetter", data);
        MockMapSerializer initialSerializer = new MockMapSerializer();
        MockMapSerializer contextualSerializer = new MockMapSerializer();

        AnyGetterWriter writer = new AnyGetterWriter(prop, accessor, initialSerializer);
        MockSerializerProvider provider = new MockSerializerProvider();
        provider.serializerToReturn = contextualSerializer;

        // Act: Contextualize
        writer.resolve(provider);

        // Act: Serialize
        Object bean = new Object();
        writer.getAndSerialize(bean, null, provider);

        // Assert
        Assert.assertFalse(initialSerializer.serializeFieldsCalled);
        Assert.assertTrue(contextualSerializer.serializeFieldsCalled);
        Assert.assertSame(data, contextualSerializer.passedMap);
    }
}