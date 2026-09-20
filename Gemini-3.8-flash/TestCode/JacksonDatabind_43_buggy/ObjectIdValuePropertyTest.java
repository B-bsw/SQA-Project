package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdValuePropertyTest {

    private static class MockJsonDeserializer<T> extends JsonDeserializer<T> {
        private final T _deserializedValue;

        public MockJsonDeserializer(T deserializedValue) {
            this._deserializedValue = deserializedValue;
        }

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return this._deserializedValue;
        }
    }

    private static class MockReadableObjectId extends ReadableObjectId {
        private Object _boundItem;

        public MockReadableObjectId() {
            super(new ObjectIdGenerator.IdKey(Object.class, Object.class, "mock-id-key"));
        }

        @Override
        public void bindItem(Object item) throws IOException {
            this._boundItem = item;
        }

        public Object getBoundItem() {
            return this._boundItem;
        }
    }

    private static class MockDeserializationContext extends DefaultDeserializationContext.Impl {
        private static final long serialVersionUID = 1L;

        private final MockReadableObjectId _mockReadableObjectId;
        private Object _passedId;
        private ObjectIdGenerator<?> _passedGenerator;
        private ObjectIdResolver _passedResolver;

        public MockDeserializationContext(MockReadableObjectId roid) {
            super(new BeanDeserializerFactory(new DeserializerFactoryConfig()));
            this._mockReadableObjectId = roid;
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> gen, ObjectIdResolver resolverType) {
            this._passedId = id;
            this._passedGenerator = gen;
            this._passedResolver = resolverType;
            return this._mockReadableObjectId;
        }

        public Object getPassedId() {
            return this._passedId;
        }

        public ObjectIdGenerator<?> getPassedGenerator() {
            return this._passedGenerator;
        }

        public ObjectIdResolver getPassedResolver() {
            return this._passedResolver;
        }
    }

    private static class MockSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        private Object _setInstance;
        private Object _setValue;
        private Object _returnToGive;

        public MockSettableBeanProperty(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_REQUIRED, (JsonDeserializer<Object>) null);
        }

        public MockSettableBeanProperty(MockSettableBeanProperty src) {
            super(src);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return this;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return this;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            set(instance, deserializeSetAndReturn(p, ctxt, instance));
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance) throws IOException {
            return setAndReturn(instance, "deserializedValue");
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this._setInstance = instance;
            this._setValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this._setInstance = instance;
            this._setValue = value;
            return (this._returnToGive != null) ? this._returnToGive : instance;
        }

        public Object getSetInstance() {
            return this._setInstance;
        }

        public Object getSetValue() {
            return this._setValue;
        }

        public void setReturnToGive(Object val) {
            this._returnToGive = val;
        }
    }

    private ObjectIdReader createObjectIdReader(JsonDeserializer<?> deser, SettableBeanProperty idProp) {
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("idProp");
        ObjectIdGenerator<?> gen = new ObjectIdGenerators.IntSequenceGenerator();
        ObjectIdResolver resolver = new SimpleObjectIdResolver();
        return ObjectIdReader.construct(idType, propName, gen, deser, idProp, resolver);
    }

    @Test
    public void constructor_givenValidObjectIdReader_shouldInitializeProperly() {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("test-id");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        PropertyMetadata metadata = PropertyMetadata.STD_REQUIRED;

        // Act
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        // Assert
        Assert.assertEquals("idProp", prop.getName());
        Assert.assertEquals(reader.getIdType(), prop.getType());
        Assert.assertEquals(metadata, prop.getMetadata());
        Assert.assertSame(deser, prop.getValueDeserializer());
        Assert.assertSame(reader, prop._objectIdReader);
    }

    @Test
    public void withName_givenNewName_shouldReturnNewInstanceWithUpdatedName() {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("test-id");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty original = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        PropertyName newName = new PropertyName("updatedIdProp");

        // Act
        ObjectIdValueProperty modified = original.withName(newName);

        // Assert
        Assert.assertNotNull(modified);
        Assert.assertNotSame(original, modified);
        Assert.assertEquals("updatedIdProp", modified.getName());
        Assert.assertEquals("idProp", original.getName());
        Assert.assertSame(original._objectIdReader, modified._objectIdReader);
    }

    @Test
    public void withValueDeserializer_givenNewDeserializer_shouldReturnNewInstanceWithUpdatedDeserializer() {
        // Arrange
        JsonDeserializer<Object> deser1 = new MockJsonDeserializer<Object>("id-1");
        JsonDeserializer<Object> deser2 = new MockJsonDeserializer<Object>("id-2");
        ObjectIdReader reader = createObjectIdReader(deser1, null);
        ObjectIdValueProperty original = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act
        ObjectIdValueProperty modified = original.withValueDeserializer(deser2);

        // Assert
        Assert.assertNotNull(modified);
        Assert.assertNotSame(original, modified);
        Assert.assertSame(deser2, modified.getValueDeserializer());
        Assert.assertSame(deser1, original.getValueDeserializer());
        Assert.assertSame(original._objectIdReader, modified._objectIdReader);
    }

    @Test
    public void getAnnotation_givenAnyClass_shouldReturnNull() {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("id");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        // Act
        Override annotation = prop.getAnnotation(Override.class);

        // Assert
        Assert.assertNull(annotation);
    }

    @Test
    public void getMember_givenInvocation_shouldReturnNull() {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("id");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        // Act
        AnnotatedMember member = prop.getMember();

        // Assert
        Assert.assertNull(member);
    }

    @Test
    public void deserializeSetAndReturn_givenNullDeserializedId_shouldReturnNull() throws IOException {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>(null);
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        MockReadableObjectId roid = new MockReadableObjectId();
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object instance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, instance);

        // Assert
        Assert.assertNull(result);
        Assert.assertNull(ctxt.getPassedId());
        Assert.assertNull(roid.getBoundItem());
    }

    @Test
    public void deserializeSetAndReturn_givenValidIdAndNoIdProperty_shouldBindItemAndReturnInstance() throws IOException {
        // Arrange
        String generatedId = "external-id-123";
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>(generatedId);
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);

        MockReadableObjectId roid = new MockReadableObjectId();
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, targetInstance);

        // Assert
        Assert.assertSame(targetInstance, result);
        Assert.assertEquals(generatedId, ctxt.getPassedId());
        Assert.assertSame(reader.generator, ctxt.getPassedGenerator());
        Assert.assertSame(reader.resolver, ctxt.getPassedResolver());
        Assert.assertSame(targetInstance, roid.getBoundItem());
    }

    @Test
    public void deserializeSetAndReturn_givenValidIdAndIdProperty_shouldBindItemAndDelegateToIdProperty() throws IOException {
        // Arrange
        String generatedId = "id-with-prop";
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>(generatedId);

        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        MockSettableBeanProperty mockIdProp = new MockSettableBeanProperty(new PropertyName("underlyingId"), idType);
        Object customReturnObject = new Object();
        mockIdProp.setReturnToGive(customReturnObject);

        ObjectIdReader reader = createObjectIdReader(deser, mockIdProp);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        MockReadableObjectId roid = new MockReadableObjectId();
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, targetInstance);

        // Assert
        Assert.assertSame(customReturnObject, result);
        Assert.assertSame(targetInstance, roid.getBoundItem());
        Assert.assertSame(targetInstance, mockIdProp.getSetInstance());
        Assert.assertSame(generatedId, mockIdProp.getSetValue());
    }

    @Test
    public void deserializeAndSet_givenValidInput_shouldDelegateToDeserializeSetAndReturn() throws IOException {
        // Arrange
        String generatedId = "id-and-set";
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>(generatedId);

        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        MockSettableBeanProperty mockIdProp = new MockSettableBeanProperty(new PropertyName("underlyingId"), idType);
        ObjectIdReader reader = createObjectIdReader(deser, mockIdProp);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        MockReadableObjectId roid = new MockReadableObjectId();
        MockDeserializationContext ctxt = new MockDeserializationContext(roid);
        Object targetInstance = new Object();

        // Act
        prop.deserializeAndSet(null, ctxt, targetInstance);

        // Assert
        Assert.assertSame(targetInstance, roid.getBoundItem());
        Assert.assertSame(targetInstance, mockIdProp.getSetInstance());
        Assert.assertSame(generatedId, mockIdProp.getSetValue());
    }

    @Test
    public void setAndReturn_givenNoIdProperty_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("dummy");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        Object instance = new Object();
        Object value = "value";

        // Act & Assert
        try {
            prop.setAndReturn(instance, value);
            Assert.fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(
                    "Should not call set() on ObjectIdProperty that has no SettableBeanProperty",
                    ex.getMessage());
        }
    }

    @Test
    public void set_givenNoIdProperty_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("dummy");
        ObjectIdReader reader = createObjectIdReader(deser, null);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_OPTIONAL);
        Object instance = new Object();
        Object value = "value";

        // Act & Assert
        try {
            prop.set(instance, value);
            Assert.fail("Expected UnsupportedOperationException to be thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals(
                    "Should not call set() on ObjectIdProperty that has no SettableBeanProperty",
                    ex.getMessage());
        }
    }

    @Test
    public void setAndReturn_givenIdProperty_shouldDelegateToIdProperty() throws IOException {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("dummy");
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        MockSettableBeanProperty mockIdProp = new MockSettableBeanProperty(new PropertyName("underlyingId"), idType);
        Object returnedObject = new Object();
        mockIdProp.setReturnToGive(returnedObject);

        ObjectIdReader reader = createObjectIdReader(deser, mockIdProp);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object targetInstance = new Object();
        Object targetValue = "test-value-123";

        // Act
        Object result = prop.setAndReturn(targetInstance, targetValue);

        // Assert
        Assert.assertSame(returnedObject, result);
        Assert.assertSame(targetInstance, mockIdProp.getSetInstance());
        Assert.assertSame(targetValue, mockIdProp.getSetValue());
    }

    @Test
    public void set_givenIdProperty_shouldDelegateToIdProperty() throws IOException {
        // Arrange
        JsonDeserializer<Object> deser = new MockJsonDeserializer<Object>("dummy");
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        MockSettableBeanProperty mockIdProp = new MockSettableBeanProperty(new PropertyName("underlyingId"), idType);

        ObjectIdReader reader = createObjectIdReader(deser, mockIdProp);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object targetInstance = new Object();
        Object targetValue = "test-value-456";

        // Act
        prop.set(targetInstance, targetValue);

        // Assert
        Assert.assertSame(targetInstance, mockIdProp.getSetInstance());
        Assert.assertSame(targetValue, mockIdProp.getSetValue());
    }
}