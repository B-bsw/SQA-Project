package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.AccessPattern;

public class ObjectIdValuePropertyTest {

    private JsonFactory jsonFactory;
    private JavaType stringType;
    private PropertyName defaultPropName;
    private DummyDeserializer defaultDeserializer;
    private ObjectIdGenerator<String> defaultGenerator;
    private ObjectIdResolver defaultResolver;

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnnotation {
    }

    private static class DummyDeserializer extends JsonDeserializer<Object> {
        private final Object deserializedValue;

        public DummyDeserializer(Object deserializedValue) {
            this.deserializedValue = deserializedValue;
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return this.deserializedValue;
        }
    }

    private static class DummyNullValueProvider implements NullValueProvider {
        private final Object nullValue;

        public DummyNullValueProvider(Object nullValue) {
            this.nullValue = nullValue;
        }

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return this.nullValue;
        }

        @Override
        public AccessPattern getNullAccessPattern(DeserializationContext ctxt) {
            return AccessPattern.CONSTANT;
        }
    }

    private static class TestSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        Object lastInstance;
        Object lastValue;
        Object returnValue;

        public TestSettableBeanProperty(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_OPTIONAL, null);
        }

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
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            set(instance, deserializeSetAndReturn(p, ctxt, instance));
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return instance;
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastInstance = instance;
            this.lastValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.lastInstance = instance;
            this.lastValue = value;
            return this.returnValue != null ? this.returnValue : instance;
        }
    }

    private static class TestDeserializationContext extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1L;
        Object boundItem;
        Object lastResolvedId;

        public TestDeserializationContext() {
            super(new BeanDeserializerFactory(new DeserializerFactoryConfig()), null);
        }

        public TestDeserializationContext(TestDeserializationContext src) {
            super(src);
        }

        @Override
        public DefaultDeserializationContext with(DeserializerFactory factory) {
            return this;
        }

        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config,
                JsonParser p, InjectableValues injectableValues) {
            return this;
        }

        @Override
        public ReadableObjectId findObjectId(final Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolver) {
            this.lastResolvedId = id;
            return new ReadableObjectId(new ObjectIdGenerator.IdKey(Object.class, Object.class, id)) {
                @Override
                public void bindItem(Object pojo) throws IOException {
                    boundItem = pojo;
                }
            };
        }
    }

    @Before
    public void setUp() {
        jsonFactory = new JsonFactory();
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        defaultPropName = new PropertyName("idProp");
        defaultDeserializer = new DummyDeserializer("deserialized-id-123");
        defaultGenerator = new ObjectIdGenerators.StringIdGenerator();
        defaultResolver = new SimpleObjectIdResolver();
    }

    private ObjectIdValueProperty createProperty(SettableBeanProperty idProp) {
        ObjectIdReader reader = ObjectIdReader.construct(
                stringType,
                defaultPropName,
                defaultGenerator,
                defaultDeserializer,
                idProp,
                defaultResolver
        );
        return new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
    }

    @Test
    public void constructor_givenValidObjectIdReader_shouldInitializeProperly() {
        // Arrange & Act
        ObjectIdValueProperty prop = createProperty(null);

        // Assert
        Assert.assertEquals("idProp", prop.getName());
        Assert.assertEquals(defaultPropName, prop.getFullName());
        Assert.assertEquals(stringType, prop.getType());
        Assert.assertSame(defaultDeserializer, prop.getValueDeserializer());
        Assert.assertEquals(PropertyMetadata.STD_REQUIRED, prop.getMetadata());
        Assert.assertNotNull(prop._objectIdReader);
    }

    @Test
    public void withName_givenNewName_shouldReturnNewInstanceWithUpdatedName() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        PropertyName newName = new PropertyName("renamedIdProp");

        // Act
        SettableBeanProperty updatedProp = prop.withName(newName);

        // Assert
        Assert.assertNotNull(updatedProp);
        Assert.assertNotSame(prop, updatedProp);
        Assert.assertTrue(updatedProp instanceof ObjectIdValueProperty);
        Assert.assertEquals("renamedIdProp", updatedProp.getName());
        Assert.assertEquals(newName, updatedProp.getFullName());
        Assert.assertSame(prop.getValueDeserializer(), updatedProp.getValueDeserializer());
        Assert.assertSame(prop._objectIdReader, ((ObjectIdValueProperty) updatedProp)._objectIdReader);
    }

    @Test
    public void withValueDeserializer_givenSameDeserializer_shouldReturnSameInstance() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);

        // Act
        SettableBeanProperty updatedProp = prop.withValueDeserializer(defaultDeserializer);

        // Assert
        Assert.assertSame(prop, updatedProp);
    }

    @Test
    public void withValueDeserializer_givenDifferentDeserializer_shouldReturnNewInstanceWithUpdatedDeserializer() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        DummyDeserializer newDeser = new DummyDeserializer("new-id-val");

        // Act
        SettableBeanProperty updatedProp = prop.withValueDeserializer(newDeser);

        // Assert
        Assert.assertNotNull(updatedProp);
        Assert.assertNotSame(prop, updatedProp);
        Assert.assertTrue(updatedProp instanceof ObjectIdValueProperty);
        Assert.assertSame(newDeser, updatedProp.getValueDeserializer());
        Assert.assertSame(prop._objectIdReader, ((ObjectIdValueProperty) updatedProp)._objectIdReader);
    }

    @Test
    public void withNullProvider_givenNullProvider_shouldReturnNewInstanceWithNullProvider() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        DummyNullValueProvider nullProvider = new DummyNullValueProvider("null-fallback");

        // Act
        SettableBeanProperty updatedProp = prop.withNullProvider(nullProvider);

        // Assert
        Assert.assertNotNull(updatedProp);
        Assert.assertNotSame(prop, updatedProp);
        Assert.assertTrue(updatedProp instanceof ObjectIdValueProperty);
        Assert.assertSame(prop.getValueDeserializer(), updatedProp.getValueDeserializer());
        Assert.assertSame(nullProvider, updatedProp.getNullValueProvider());
        Assert.assertSame(prop._objectIdReader, ((ObjectIdValueProperty) updatedProp)._objectIdReader);
    }

    @Test
    public void getAnnotation_givenAnyAnnotationClass_shouldAlwaysReturnNull() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);

        // Act & Assert
        Assert.assertNull(prop.getAnnotation(TestAnnotation.class));
        Assert.assertNull(prop.getAnnotation(Retention.class));
    }

    @Test
    public void getMember_shouldAlwaysReturnNull() {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);

        // Act & Assert
        Assert.assertNull(prop.getMember());
    }

    @Test
    public void deserializeSetAndReturn_givenJsonTokenValueNull_shouldReturnNullWithoutBinding() throws IOException {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        JsonParser parser = jsonFactory.createParser("null");
        parser.nextToken(); // Move to JsonToken.VALUE_NULL
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.currentToken());

        TestDeserializationContext ctxt = new TestDeserializationContext();
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, ctxt, targetInstance);

        // Assert
        Assert.assertNull(result);
        Assert.assertNull(ctxt.boundItem);
        Assert.assertNull(ctxt.lastResolvedId);
    }

    @Test
    public void deserializeAndSet_givenJsonTokenValueNull_shouldReturnEarlyAndNotModifyInstance() throws IOException {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        JsonParser parser = jsonFactory.createParser("null");
        parser.nextToken();

        TestDeserializationContext ctxt = new TestDeserializationContext();
        Object targetInstance = new Object();

        // Act
        prop.deserializeAndSet(parser, ctxt, targetInstance);

        // Assert
        Assert.assertNull(ctxt.boundItem);
        Assert.assertNull(ctxt.lastResolvedId);
    }

    @Test
    public void deserializeSetAndReturn_givenNonNullTokenAndNoIdProperty_shouldBindItemAndReturnInstance() throws IOException {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        JsonParser parser = jsonFactory.createParser("\"dummy-token\"");
        parser.nextToken();

        TestDeserializationContext ctxt = new TestDeserializationContext();
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, ctxt, targetInstance);

        // Assert
        Assert.assertSame(targetInstance, result);
        Assert.assertSame(targetInstance, ctxt.boundItem);
        Assert.assertEquals("deserialized-id-123", ctxt.lastResolvedId);
    }

    @Test
    public void deserializeSetAndReturn_givenNonNullTokenAndIdProperty_shouldBindItemAndDelegateToIdProperty() throws IOException {
        // Arrange
        TestSettableBeanProperty idProp = new TestSettableBeanProperty(new PropertyName("underlyingId"), stringType);
        Object customReturn = new Object();
        idProp.returnValue = customReturn;

        ObjectIdValueProperty prop = createProperty(idProp);
        JsonParser parser = jsonFactory.createParser("\"dummy-token\"");
        parser.nextToken();

        TestDeserializationContext ctxt = new TestDeserializationContext();
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, ctxt, targetInstance);

        // Assert
        Assert.assertSame(customReturn, result);
        Assert.assertSame(targetInstance, ctxt.boundItem);
        Assert.assertEquals("deserialized-id-123", ctxt.lastResolvedId);
        Assert.assertSame(targetInstance, idProp.lastInstance);
        Assert.assertEquals("deserialized-id-123", idProp.lastValue);
    }

    @Test
    public void deserializeAndSet_givenNonNullTokenAndIdProperty_shouldDelegateToDeserializeSetAndReturn() throws IOException {
        // Arrange
        TestSettableBeanProperty idProp = new TestSettableBeanProperty(new PropertyName("underlyingId"), stringType);
        ObjectIdValueProperty prop = createProperty(idProp);

        JsonParser parser = jsonFactory.createParser("\"dummy-token\"");
        parser.nextToken();

        TestDeserializationContext ctxt = new TestDeserializationContext();
        Object targetInstance = new Object();

        // Act
        prop.deserializeAndSet(parser, ctxt, targetInstance);

        // Assert
        Assert.assertSame(targetInstance, ctxt.boundItem);
        Assert.assertEquals("deserialized-id-123", ctxt.lastResolvedId);
        Assert.assertSame(targetInstance, idProp.lastInstance);
        Assert.assertEquals("deserialized-id-123", idProp.lastValue);
    }

    @Test
    public void setAndReturn_givenIdPropertyNull_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        Object targetInstance = new Object();

        // Act & Assert
        try {
            prop.setAndReturn(targetInstance, "anyId");
            Assert.fail("Expected UnsupportedOperationException when idProperty is null");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().indexOf("Should not call set() on ObjectIdProperty that has no SettableBeanProperty") >= 0);
        }
    }

    @Test
    public void set_givenIdPropertyNull_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        ObjectIdValueProperty prop = createProperty(null);
        Object targetInstance = new Object();

        // Act & Assert
        try {
            prop.set(targetInstance, "anyId");
            Assert.fail("Expected UnsupportedOperationException when idProperty is null");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().indexOf("Should not call set() on ObjectIdProperty that has no SettableBeanProperty") >= 0);
        }
    }

    @Test
    public void setAndReturn_givenIdPropertyNotNull_shouldDelegateToIdProperty() throws IOException {
        // Arrange
        TestSettableBeanProperty idProp = new TestSettableBeanProperty(new PropertyName("underlyingId"), stringType);
        Object returnObj = new Object();
        idProp.returnValue = returnObj;

        ObjectIdValueProperty prop = createProperty(idProp);
        Object targetInstance = new Object();
        String idValue = "explicitId123";

        // Act
        Object result = prop.setAndReturn(targetInstance, idValue);

        // Assert
        Assert.assertSame(returnObj, result);
        Assert.assertSame(targetInstance, idProp.lastInstance);
        Assert.assertEquals(idValue, idProp.lastValue);
    }

    @Test
    public void set_givenIdPropertyNotNull_shouldDelegateToIdProperty() throws IOException {
        // Arrange
        TestSettableBeanProperty idProp = new TestSettableBeanProperty(new PropertyName("underlyingId"), stringType);
        ObjectIdValueProperty prop = createProperty(idProp);
        Object targetInstance = new Object();
        String idValue = "explicitId456";

        // Act
        prop.set(targetInstance, idValue);

        // Assert
        Assert.assertSame(targetInstance, idProp.lastInstance);
        Assert.assertEquals(idValue, idProp.lastValue);
    }
}