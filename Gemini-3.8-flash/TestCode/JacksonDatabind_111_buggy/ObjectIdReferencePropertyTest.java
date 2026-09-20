package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectIdReferencePropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface DummyAnnotation {
        String value() default "";
    }

    private static class StubSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        public boolean fixAccessCalled = false;
        public Object lastSetInstance = null;
        public Object lastSetValue = null;
        public Object lastSetAndReturnInstance = null;
        public Object lastSetAndReturnValue = null;
        public Object returnFromSetAndReturn = "defaultReturn";
        public int creatorIndex = -1;
        public AnnotatedMember member = null;
        public Annotation annotation = null;

        public StubSettableBeanProperty(PropertyName name, JavaType type, PropertyMetadata metadata,
                                        JsonDeserializer<Object> deser) {
            super(name, type, metadata, deser);
        }

        public StubSettableBeanProperty(StubSettableBeanProperty src, JsonDeserializer<?> deser,
                                        NullValueProvider nva) {
            super(src, deser, nva);
            this.fixAccessCalled = src.fixAccessCalled;
            this.lastSetInstance = src.lastSetInstance;
            this.lastSetValue = src.lastSetValue;
            this.lastSetAndReturnInstance = src.lastSetAndReturnInstance;
            this.lastSetAndReturnValue = src.lastSetAndReturnValue;
            this.returnFromSetAndReturn = src.returnFromSetAndReturn;
            this.creatorIndex = src.creatorIndex;
            this.member = src.member;
            this.annotation = src.annotation;
        }

        public StubSettableBeanProperty(StubSettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this.fixAccessCalled = src.fixAccessCalled;
            this.lastSetInstance = src.lastSetInstance;
            this.lastSetValue = src.lastSetValue;
            this.lastSetAndReturnInstance = src.lastSetAndReturnInstance;
            this.lastSetAndReturnValue = src.lastSetAndReturnValue;
            this.returnFromSetAndReturn = src.returnFromSetAndReturn;
            this.creatorIndex = src.creatorIndex;
            this.member = src.member;
            this.annotation = src.annotation;
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new StubSettableBeanProperty(this, deser, this._nullProvider);
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new StubSettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withNullProvider(NullValueProvider nva) {
            return new StubSettableBeanProperty(this, this._valueDeserializer, nva);
        }

        @Override
        public void fixAccess(DeserializationConfig config) {
            this.fixAccessCalled = true;
        }

        @SuppressWarnings("unchecked")
        @Override
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (annotation != null && acls.isAssignableFrom(annotation.getClass())) {
                return (A) annotation;
            }
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return member;
        }

        @Override
        public int getCreatorIndex() {
            return creatorIndex;
        }

        @Override
        public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object instance)
                throws IOException {
            set(instance, deserialize(p, ctxt));
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser p, DeserializationContext ctxt, Object instance)
                throws IOException {
            return setAndReturn(instance, deserialize(p, ctxt));
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastSetInstance = instance;
            this.lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            this.lastSetAndReturnInstance = instance;
            this.lastSetAndReturnValue = value;
            return this.returnFromSetAndReturn;
        }
    }

    private static class StubJsonDeserializer<T> extends JsonDeserializer<T> {
        public T deserializeResult = null;
        public UnresolvedForwardReference toThrow = null;
        public ObjectIdReader objectIdReader = null;

        @Override
        public T deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException {
            if (toThrow != null) {
                throw toThrow;
            }
            return deserializeResult;
        }

        @Override
        public ObjectIdReader getObjectIdReader() {
            return objectIdReader;
        }
    }

    private static class StubNullValueProvider implements NullValueProvider {
        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return null;
        }
    }

    private static class StubReadableObjectId extends ReadableObjectId {
        public Referring lastReferringAppended = null;

        public StubReadableObjectId(ObjectIdGenerator.IdKey key) {
            super(key);
        }

        @Override
        public void appendReferring(Referring current) {
            this.lastReferringAppended = current;
            super.appendReferring(current);
        }
    }

    private static class StubUnresolvedForwardReference extends UnresolvedForwardReference {
        private static final long serialVersionUID = 1L;
        private final ReadableObjectId _roid;
        private final Object _unresolvedId;

        public StubUnresolvedForwardReference(JsonParser p, String msg, ReadableObjectId roid, Object unresolvedId) {
            super(p, msg, new JsonLocation("N/A", 0L, 0L, 0, 0), roid);
            this._roid = roid;
            this._unresolvedId = unresolvedId;
        }

        @Override
        public ReadableObjectId getRoid() {
            return _roid;
        }

        @Override
        public Object getUnresolvedId() {
            return _unresolvedId;
        }
    }

    private StubSettableBeanProperty forward;
    private ObjectIdInfo objectIdInfo;
    private ObjectIdReferenceProperty property;
    private JavaType stringType;

    @Before
    public void setUp() {
        stringType = TypeFactory.defaultInstance().constructType(String.class);
        forward = new StubSettableBeanProperty(
                new PropertyName("testProp"),
                stringType,
                PropertyMetadata.STD_REQUIRED,
                null
        );
        objectIdInfo = new ObjectIdInfo(
                new PropertyName("idProp"),
                Object.class,
                ObjectIdGenerator.class,
                SimpleObjectIdResolver.class
        );
        property = new ObjectIdReferenceProperty(forward, objectIdInfo);
    }

    @Test
    public void constructor_givenForwardAndObjectIdInfo_shouldInitializeProperly() {
        Assert.assertEquals("testProp", property.getName());
        Assert.assertEquals(stringType, property.getType());
    }

    @Test
    public void withName_givenNewName_shouldReturnNewInstanceWithUpdatedName() {
        PropertyName newName = new PropertyName("renamedProp");

        SettableBeanProperty result = property.withName(newName);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof ObjectIdReferenceProperty);
        Assert.assertNotSame(property, result);
        Assert.assertEquals("renamedProp", result.getName());
    }

    @Test
    public void withValueDeserializer_givenSameDeserializer_shouldReturnSameInstance() {
        JsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) property.withValueDeserializer(deser);

        SettableBeanProperty result = propWithDeser.withValueDeserializer(deser);

        Assert.assertSame(propWithDeser, result);
    }

    @Test
    public void withValueDeserializer_givenDifferentDeserializer_shouldReturnNewInstance() {
        JsonDeserializer<Object> deser1 = new StubJsonDeserializer<Object>();
        JsonDeserializer<Object> deser2 = new StubJsonDeserializer<Object>();
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) property.withValueDeserializer(deser1);

        SettableBeanProperty result = propWithDeser.withValueDeserializer(deser2);

        Assert.assertNotNull(result);
        Assert.assertNotSame(propWithDeser, result);
        Assert.assertSame(deser2, result.getValueDeserializer());
    }

    @Test
    public void withNullProvider_givenNewNullProvider_shouldReturnNewInstanceWithNullProvider() {
        NullValueProvider nva = new StubNullValueProvider();

        SettableBeanProperty result = property.withNullProvider(nva);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof ObjectIdReferenceProperty);
        Assert.assertNotSame(property, result);
        Assert.assertSame(nva, result.getNullValueProvider());
    }

    @Test
    public void fixAccess_givenNonNullForward_shouldCallFixAccessOnForward() {
        property.fixAccess(null);

        Assert.assertTrue(forward.fixAccessCalled);
    }

    @Test
    public void getAnnotation_givenValidAnnotationClass_shouldDelegateToForward() {
        DummyAnnotation dummyAnnotation = new DummyAnnotation() {
            public Class<? extends Annotation> annotationType() {
                return DummyAnnotation.class;
            }
            public String value() {
                return "testValue";
            }
        };
        forward.annotation = dummyAnnotation;

        DummyAnnotation result = property.getAnnotation(DummyAnnotation.class);

        Assert.assertNotNull(result);
        Assert.assertEquals("testValue", result.value());
    }

    @Test
    public void getAnnotation_givenUnknownAnnotationClass_shouldReturnNull() {
        forward.annotation = null;

        JsonPOJOBuilder result = property.getAnnotation(JsonPOJOBuilder.class);

        Assert.assertNull(result);
    }

    @Test
    public void getMember_givenForwardMember_shouldDelegateToForward() {
        forward.member = null;

        AnnotatedMember result = property.getMember();

        Assert.assertNull(result);
    }

    @Test
    public void getCreatorIndex_givenForwardCreatorIndex_shouldDelegateToForward() {
        forward.creatorIndex = 42;

        int index = property.getCreatorIndex();

        Assert.assertEquals(42, index);
    }

    @Test
    public void set_givenInstanceAndValue_shouldDelegateToForward() throws IOException {
        Object target = new Object();
        String val = "sampleValue";

        property.set(target, val);

        Assert.assertSame(target, forward.lastSetInstance);
        Assert.assertSame(val, forward.lastSetValue);
    }

    @Test
    public void setAndReturn_givenInstanceAndValue_shouldDelegateToForwardAndReturnValue() throws IOException {
        Object target = new Object();
        String val = "sampleValue";
        forward.returnFromSetAndReturn = "customResult";

        Object result = property.setAndReturn(target, val);

        Assert.assertSame(target, forward.lastSetAndReturnInstance);
        Assert.assertSame(val, forward.lastSetAndReturnValue);
        Assert.assertEquals("customResult", result);
    }

    @Test
    public void deserializeAndSet_givenValidInput_shouldDeserializeAndSetOnTarget() throws IOException {
        StubJsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        deser.deserializeResult = "deserializedValue";
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) property.withValueDeserializer(deser);
        Object target = new Object();

        propWithDeser.deserializeAndSet(null, null, target);

        Assert.assertSame(target, forward.lastSetAndReturnInstance);
        Assert.assertEquals("deserializedValue", forward.lastSetAndReturnValue);
    }

    @Test
    public void deserializeSetAndReturn_givenValidInput_shouldDeserializeAndReturnValue() throws IOException {
        StubJsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        deser.deserializeResult = "deserializedValue";
        forward.returnFromSetAndReturn = "expectedOutput";
        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) property.withValueDeserializer(deser);
        Object target = new Object();

        Object result = propWithDeser.deserializeSetAndReturn(null, null, target);

        Assert.assertSame(target, forward.lastSetAndReturnInstance);
        Assert.assertEquals("deserializedValue", forward.lastSetAndReturnValue);
        Assert.assertEquals("expectedOutput", result);
    }

    @Test
    public void deserializeSetAndReturn_givenForwardReferenceAndNonNullObjectIdInfo_shouldAppendReferringAndReturnNull()
            throws IOException {
        StubJsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        ObjectIdGenerator.IdKey key = new ObjectIdGenerator.IdKey(Object.class, Object.class, "id123");
        StubReadableObjectId roid = new StubReadableObjectId(key);
        deser.toThrow = new StubUnresolvedForwardReference(null, "Unresolved", roid, "id123");

        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) property.withValueDeserializer(deser);
        Object target = new Object();

        Object result = propWithDeser.deserializeSetAndReturn(null, null, target);

        Assert.assertNull(result);
        Assert.assertNotNull(roid.lastReferringAppended);
        Assert.assertTrue(roid.lastReferringAppended instanceof ObjectIdReferenceProperty.PropertyReferring);
        ObjectIdReferenceProperty.PropertyReferring referring =
                (ObjectIdReferenceProperty.PropertyReferring) roid.lastReferringAppended;
        Assert.assertSame(target, referring._pojo);
    }

    @Test
    public void deserializeSetAndReturn_givenForwardReferenceAndNullObjectIdInfoWithObjectIdReader_shouldAppendReferringAndReturnNull()
            throws IOException {
        StubSettableBeanProperty forwardWithoutId = new StubSettableBeanProperty(
                new PropertyName("testProp2"),
                stringType,
                PropertyMetadata.STD_REQUIRED,
                null
        );
        ObjectIdReferenceProperty propWithoutIdInfo = new ObjectIdReferenceProperty(forwardWithoutId, null);

        StubJsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        ObjectIdGenerator.IdKey key = new ObjectIdGenerator.IdKey(Object.class, Object.class, "id456");
        StubReadableObjectId roid = new StubReadableObjectId(key);
        deser.toThrow = new StubUnresolvedForwardReference(null, "Unresolved", roid, "id456");

        ObjectIdReader dummyReader = ObjectIdReader.construct(
                stringType,
                new PropertyName("id"),
                new ObjectIdGenerators.IntSequenceGenerator(),
                deser,
                forwardWithoutId,
                new SimpleObjectIdResolver()
        );
        deser.objectIdReader = dummyReader;

        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) propWithoutIdInfo.withValueDeserializer(deser);
        Object target = new Object();

        Object result = propWithDeser.deserializeSetAndReturn(null, null, target);

        Assert.assertNull(result);
        Assert.assertNotNull(roid.lastReferringAppended);
    }

    @Test
    public void deserializeSetAndReturn_givenForwardReferenceAndNoIdentityInfo_shouldThrowJsonMappingException() {
        StubSettableBeanProperty forwardWithoutId = new StubSettableBeanProperty(
                new PropertyName("testProp3"),
                stringType,
                PropertyMetadata.STD_REQUIRED,
                null
        );
        ObjectIdReferenceProperty propWithoutIdInfo = new ObjectIdReferenceProperty(forwardWithoutId, null);

        StubJsonDeserializer<Object> deser = new StubJsonDeserializer<Object>();
        ObjectIdGenerator.IdKey key = new ObjectIdGenerator.IdKey(Object.class, Object.class, "id789");
        StubReadableObjectId roid = new StubReadableObjectId(key);
        deser.toThrow = new StubUnresolvedForwardReference(null, "Unresolved", roid, "id789");
        deser.objectIdReader = null;

        ObjectIdReferenceProperty propWithDeser = (ObjectIdReferenceProperty) propWithoutIdInfo.withValueDeserializer(deser);
        Object target = new Object();

        try {
            propWithDeser.deserializeSetAndReturn(null, null, target);
            Assert.fail("Expected JsonMappingException to be thrown");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("Unresolved forward reference but no identity info"));
        } catch (IOException e) {
            Assert.fail("Unexpected IOException type: " + e.getClass().getName());
        }
    }

    @Test
    public void propertyReferring_handleResolvedForwardReference_givenMatchingId_shouldSetOnTarget() throws IOException {
        ObjectIdGenerator.IdKey key = new ObjectIdGenerator.IdKey(Object.class, Object.class, "validId");
        StubReadableObjectId roid = new StubReadableObjectId(key);
        StubUnresolvedForwardReference ref = new StubUnresolvedForwardReference(null, "Unresolved", roid, "validId");
        Object target = new Object();

        ObjectIdReferenceProperty.PropertyReferring referring =
                new ObjectIdReferenceProperty.PropertyReferring(property, ref, String.class, target);

        referring.handleResolvedForwardReference("validId", "resolvedValue");

        Assert.assertSame(target, forward.lastSetInstance);
        Assert.assertEquals("resolvedValue", forward.lastSetValue);
    }

    @Test
    public void propertyReferring_handleResolvedForwardReference_givenMismatchedId_shouldThrowIllegalArgumentException()
            throws IOException {
        ObjectIdGenerator.IdKey key = new ObjectIdGenerator.IdKey(Object.class, Object.class, "validId");
        StubReadableObjectId roid = new StubReadableObjectId(key);
        StubUnresolvedForwardReference ref = new StubUnresolvedForwardReference(null, "Unresolved", roid, "validId");
        Object target = new Object();

        ObjectIdReferenceProperty.PropertyReferring referring =
                new ObjectIdReferenceProperty.PropertyReferring(property, ref, String.class, target);

        try {
            referring.handleResolvedForwardReference("wrongId", "resolvedValue");
            Assert.fail("Expected IllegalArgumentException when ID does not match");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Trying to resolve a forward reference with id [wrongId]"));
        }
    }
}