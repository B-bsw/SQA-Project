package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.type.SimpleType;

public class ObjectIdValuePropertyTest {

    private JavaType stringType;
    private PropertyName defaultPropName;
    private ObjectIdGenerator<?> dummyGenerator;
    private ObjectIdResolver dummyResolver;

    @Before
    public void setUp() {
        stringType = SimpleType.constructUnsafe(String.class);
        defaultPropName = new PropertyName("testObjectId");
        dummyGenerator = new ObjectIdGenerators.IntSequenceGenerator();
        dummyResolver = new SimpleObjectIdResolver();
    }

    private static class StubJsonDeserializer extends JsonDeserializer<Object> {
        private final Object returnValue;

        public StubJsonDeserializer(Object returnValue) {
            this.returnValue = returnValue;
        }

        @Override
        public Object deserialize(JsonParser jp, DeserializationContext ctxt) {
            return this.returnValue;
        }
    }

    private static class StubSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;
        public Object recordedInstance;
        public Object recordedValue;
        public Object returnValueToReturn;

        public StubSettableBeanProperty(PropertyName name, JavaType type) {
            super(name, type, PropertyMetadata.STD_REQUIRED, null);
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
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return null;
        }

        @Override
        public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            setAndReturn(instance, "deserializedStubValue");
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            return setAndReturn(instance, "deserializedStubValue");
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            setAndReturn(instance, value);
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.recordedInstance = instance;
            this.recordedValue = value;
            if (this.returnValueToReturn != null) {
                return this.returnValueToReturn;
            }
            return instance;
        }
    }

    private static class StubReadableObjectId extends ReadableObjectId {
        public Object boundItem;
        public int bindItemCallCount = 0;

        public StubReadableObjectId() {
            super(new ObjectIdGenerator.IdKey(Object.class, Object.class, "test-id"));
        }

        @Override
        public void bindItem(Object ob) {
            this.boundItem = ob;
            this.bindItemCallCount++;
        }
    }

    private static class StubDeserializationContext extends DefaultDeserializationContext.Impl {
        private static final long serialVersionUID = 1L;
        public final StubReadableObjectId stubRoid;
        public Object capturedFindId;

        public StubDeserializationContext(StubReadableObjectId roid) {
            super(BeanDeserializerFactory.instance);
            this.stubRoid = roid;
        }

        protected StubDeserializationContext(StubDeserializationContext src, DeserializationConfig config,
                                             JsonParser jp, InjectableValues values) {
            super(src, config, jp, values);
            this.stubRoid = src.stubRoid;
        }

        protected StubDeserializationContext(StubDeserializationContext src, DeserializerFactory factory) {
            super(src, factory);
            this.stubRoid = src.stubRoid;
        }

        @Override
        public ReadableObjectId findObjectId(Object id, ObjectIdGenerator<?> generator, ObjectIdResolver resolverType) {
            this.capturedFindId = id;
            return this.stubRoid;
        }

        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues values) {
            return new StubDeserializationContext(this, config, jp, values);
        }

        @Override
        public DefaultDeserializationContext with(DeserializerFactory factory) {
            return new StubDeserializationContext(this, factory);
        }
    }

    @Test
    public void constructor_givenValidObjectIdReaderAndMetadata_shouldInitializeCorrectly() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        PropertyMetadata metadata = PropertyMetadata.STD_OPTIONAL;

        // Act
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, metadata);

        // Assert
        Assert.assertEquals(defaultPropName.getSimpleName(), prop.getName());
        Assert.assertEquals(stringType, prop.getType());
        Assert.assertSame(deser, prop.getValueDeserializer());
        Assert.assertSame(metadata, prop.getMetadata());
    }

    @Test
    public void withName_givenNewPropertyName_shouldCreateNewInstanceWithUpdatedName() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        PropertyName newName = new PropertyName("updatedId");

        // Act
        ObjectIdValueProperty copy = prop.withName(newName);

        // Assert
        Assert.assertNotNull(copy);
        Assert.assertNotSame(prop, copy);
        Assert.assertEquals("updatedId", copy.getName());
        Assert.assertSame(prop.getValueDeserializer(), copy.getValueDeserializer());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void constructorDeprecated_givenStringName_shouldCreateNewInstanceWithExpectedName() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty original = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act
        ObjectIdValueProperty copy = new ObjectIdValueProperty(original, "stringName");

        // Assert
        Assert.assertNotNull(copy);
        Assert.assertNotSame(original, copy);
        Assert.assertEquals("stringName", copy.getName());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void constructorDeprecated_givenPropertyName_shouldCreateNewInstanceWithExpectedName() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty original = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);
        PropertyName newPropName = new PropertyName("propertyNewName");

        // Act
        ObjectIdValueProperty copy = new ObjectIdValueProperty(original, newPropName);

        // Assert
        Assert.assertNotNull(copy);
        Assert.assertNotSame(original, copy);
        Assert.assertEquals("propertyNewName", copy.getName());
    }

    @Test
    public void withValueDeserializer_givenNewDeserializer_shouldCreateNewInstanceWithUpdatedDeserializer() {
        // Arrange
        StubJsonDeserializer initialDeser = new StubJsonDeserializer("id1");
        StubJsonDeserializer updatedDeser = new StubJsonDeserializer("id2");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, initialDeser, null, dummyResolver);
        ObjectIdValueProperty original = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act
        ObjectIdValueProperty copy = original.withValueDeserializer(updatedDeser);

        // Assert
        Assert.assertNotNull(copy);
        Assert.assertNotSame(original, copy);
        Assert.assertSame(updatedDeser, copy.getValueDeserializer());
        Assert.assertEquals(original.getName(), copy.getName());
    }

    @Test
    public void getAnnotation_givenAnyAnnotationClass_shouldReturnNull() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act
        Override annotation = prop.getAnnotation(Override.class);

        // Assert
        Assert.assertNull(annotation);
    }

    @Test
    public void getMember_givenAnyState_shouldReturnNull() {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("my-id");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act
        AnnotatedMember member = prop.getMember();

        // Assert
        Assert.assertNull(member);
    }

    @Test
    public void deserializeSetAndReturn_givenIdPropertyPresent_shouldBindItemAndCallIdPropertySetAndReturn() throws IOException {
        // Arrange
        String deserializedId = "resolved-id-001";
        StubJsonDeserializer deser = new StubJsonDeserializer(deserializedId);
        StubSettableBeanProperty idProp = new StubSettableBeanProperty(new PropertyName("underlyingProp"), stringType);
        String expectedResult = "customReturnedInstance";
        idProp.returnValueToReturn = expectedResult;

        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, idProp, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        StubReadableObjectId stubRoid = new StubReadableObjectId();
        StubDeserializationContext ctxt = new StubDeserializationContext(stubRoid);
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, targetInstance);

        // Assert
        Assert.assertEquals(deserializedId, ctxt.capturedFindId);
        Assert.assertEquals(1, stubRoid.bindItemCallCount);
        Assert.assertSame(targetInstance, stubRoid.boundItem);
        Assert.assertSame(targetInstance, idProp.recordedInstance);
        Assert.assertEquals(deserializedId, idProp.recordedValue);
        Assert.assertSame(expectedResult, result);
    }

    @Test
    public void deserializeSetAndReturn_givenIdPropertyNull_shouldBindItemAndReturnInstance() throws IOException {
        // Arrange
        String deserializedId = "resolved-id-002";
        StubJsonDeserializer deser = new StubJsonDeserializer(deserializedId);
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        StubReadableObjectId stubRoid = new StubReadableObjectId();
        StubDeserializationContext ctxt = new StubDeserializationContext(stubRoid);
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, targetInstance);

        // Assert
        Assert.assertEquals(deserializedId, ctxt.capturedFindId);
        Assert.assertEquals(1, stubRoid.bindItemCallCount);
        Assert.assertSame(targetInstance, stubRoid.boundItem);
        Assert.assertSame(targetInstance, result);
    }

    @Test
    public void deserializeSetAndReturn_givenNullDeserializedId_shouldFindObjectIdWithNullAndBindItem() throws IOException {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer(null);
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        StubReadableObjectId stubRoid = new StubReadableObjectId();
        StubDeserializationContext ctxt = new StubDeserializationContext(stubRoid);
        Object targetInstance = new Object();

        // Act
        Object result = prop.deserializeSetAndReturn(null, ctxt, targetInstance);

        // Assert
        Assert.assertNull(ctxt.capturedFindId);
        Assert.assertEquals(1, stubRoid.bindItemCallCount);
        Assert.assertSame(targetInstance, stubRoid.boundItem);
        Assert.assertSame(targetInstance, result);
    }

    @Test
    public void deserializeAndSet_givenValidInputs_shouldDelegateToDeserializeSetAndReturn() throws IOException {
        // Arrange
        String deserializedId = "resolved-id-003";
        StubJsonDeserializer deser = new StubJsonDeserializer(deserializedId);
        StubSettableBeanProperty idProp = new StubSettableBeanProperty(new PropertyName("underlyingProp"), stringType);

        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, idProp, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        StubReadableObjectId stubRoid = new StubReadableObjectId();
        StubDeserializationContext ctxt = new StubDeserializationContext(stubRoid);
        Object targetInstance = new Object();

        // Act
        prop.deserializeAndSet(null, ctxt, targetInstance);

        // Assert
        Assert.assertEquals(deserializedId, ctxt.capturedFindId);
        Assert.assertEquals(1, stubRoid.bindItemCallCount);
        Assert.assertSame(targetInstance, stubRoid.boundItem);
        Assert.assertSame(targetInstance, idProp.recordedInstance);
        Assert.assertEquals(deserializedId, idProp.recordedValue);
    }

    @Test
    public void setAndReturn_givenIdPropertyPresent_shouldDelegateToIdProperty() throws IOException {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("any");
        StubSettableBeanProperty idProp = new StubSettableBeanProperty(new PropertyName("underlyingProp"), stringType);
        String expectedReturn = "delegatedResult";
        idProp.returnValueToReturn = expectedReturn;

        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, idProp, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object targetInstance = new Object();
        Object valueToSet = "myExplicitIdValue";

        // Act
        Object result = prop.setAndReturn(targetInstance, valueToSet);

        // Assert
        Assert.assertSame(targetInstance, idProp.recordedInstance);
        Assert.assertSame(valueToSet, idProp.recordedValue);
        Assert.assertSame(expectedReturn, result);
    }

    @Test
    public void setAndReturn_givenIdPropertyNull_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("any");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act & Assert
        try {
            prop.setAndReturn(new Object(), "testValue");
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals("Should not call set() on ObjectIdProperty that has no SettableBeanProperty", ex.getMessage());
        }
    }

    @Test
    public void set_givenIdPropertyPresent_shouldDelegateToSetAndReturn() throws IOException {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("any");
        StubSettableBeanProperty idProp = new StubSettableBeanProperty(new PropertyName("underlyingProp"), stringType);
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, idProp, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        Object targetInstance = new Object();
        Object valueToSet = "explicitId";

        // Act
        prop.set(targetInstance, valueToSet);

        // Assert
        Assert.assertSame(targetInstance, idProp.recordedInstance);
        Assert.assertSame(valueToSet, idProp.recordedValue);
    }

    @Test
    public void set_givenIdPropertyNull_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        StubJsonDeserializer deser = new StubJsonDeserializer("any");
        ObjectIdReader reader = new ObjectIdReader(stringType, defaultPropName, dummyGenerator, deser, null, dummyResolver);
        ObjectIdValueProperty prop = new ObjectIdValueProperty(reader, PropertyMetadata.STD_REQUIRED);

        // Act & Assert
        try {
            prop.set(new Object(), "explicitId");
            Assert.fail("Expected UnsupportedOperationException was not thrown");
        } catch (UnsupportedOperationException ex) {
            Assert.assertEquals("Should not call set() on ObjectIdProperty that has no SettableBeanProperty", ex.getMessage());
        }
    }
}