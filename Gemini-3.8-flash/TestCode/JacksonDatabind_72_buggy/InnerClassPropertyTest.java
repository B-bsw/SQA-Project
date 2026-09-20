package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class InnerClassPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface DummyAnnotation {
        String value() default "test";
    }

    public static class OuterClass {
        public class NonStaticInner {
            public String data = "initial";

            public NonStaticInner() {
            }
        }

        public class FailingInner {
            public FailingInner() {
                throw new IllegalStateException("Simulated instantiation failure");
            }
        }
    }

    private static class StubSettableBeanProperty extends SettableBeanProperty {
        private static final long serialVersionUID = 1L;

        public Object lastSetInstance;
        public Object lastSetValue;
        public int assignedIndex = -1;
        public AnnotatedMember memberStub;
        public Annotation annotationStub;

        public StubSettableBeanProperty(String name, JavaType type) {
            super(new PropertyName(name), type, null, null);
        }

        protected StubSettableBeanProperty(StubSettableBeanProperty src) {
            super(src);
            this.lastSetInstance = src.lastSetInstance;
            this.lastSetValue = src.lastSetValue;
            this.assignedIndex = src.assignedIndex;
            this.memberStub = src.memberStub;
            this.annotationStub = src.annotationStub;
        }

        protected StubSettableBeanProperty(StubSettableBeanProperty src, PropertyName newName) {
            super(src, newName);
            this.lastSetInstance = src.lastSetInstance;
            this.lastSetValue = src.lastSetValue;
            this.assignedIndex = src.assignedIndex;
            this.memberStub = src.memberStub;
            this.annotationStub = src.annotationStub;
        }

        protected StubSettableBeanProperty(StubSettableBeanProperty src, JsonDeserializer<?> deser) {
            super(src, deser);
            this.lastSetInstance = src.lastSetInstance;
            this.lastSetValue = src.lastSetValue;
            this.assignedIndex = src.assignedIndex;
            this.memberStub = src.memberStub;
            this.annotationStub = src.annotationStub;
        }

        @Override
        public SettableBeanProperty withName(PropertyName newName) {
            return new StubSettableBeanProperty(this, newName);
        }

        @Override
        public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser) {
            return new StubSettableBeanProperty(this, deser);
        }

        @Override
        public void assignIndex(int index) {
            this.assignedIndex = index;
        }

        @Override
        public int getPropertyIndex() {
            return this.assignedIndex;
        }

        @Override
        @SuppressWarnings("unchecked")
        public <A extends Annotation> A getAnnotation(Class<A> acls) {
            if (this.annotationStub != null && acls.isInstance(this.annotationStub)) {
                return (A) this.annotationStub;
            }
            return null;
        }

        @Override
        public AnnotatedMember getMember() {
            return this.memberStub;
        }

        @Override
        public void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            Object value = deserialize(jp, ctxt);
            set(instance, value);
        }

        @Override
        public Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException {
            Object value = deserialize(jp, ctxt);
            return setAndReturn(instance, value);
        }

        @Override
        public void set(Object instance, Object value) throws IOException {
            this.lastSetInstance = instance;
            this.lastSetValue = value;
        }

        @Override
        public Object setAndReturn(Object instance, Object value) throws IOException {
            set(instance, value);
            return instance;
        }
    }

    private static class StubJsonDeserializer extends JsonDeserializer<Object> {
        public Object nullValueToReturn = "NULL_VALUE";
        public Object deserializeWithTypeToReturn = "DESERIALIZE_WITH_TYPE_VALUE";
        public Object deserializedValue;
        public boolean deserializeCalled = false;

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) {
            return "DESERIALIZED_TOKEN";
        }

        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) {
            this.deserializeCalled = true;
            this.deserializedValue = intoValue;
            if (intoValue instanceof OuterClass.NonStaticInner) {
                ((OuterClass.NonStaticInner) intoValue).data = "updated_by_deserializer";
            }
            return intoValue;
        }

        @Override
        public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) {
            return this.deserializeWithTypeToReturn;
        }

        @Override
        public Object getNullValue(DeserializationContext ctxt) {
            return this.nullValueToReturn;
        }
    }

    private static class StubJsonParser extends JsonParser {
        public JsonToken currentToken;

        public StubJsonParser(JsonToken token) {
            this.currentToken = token;
        }

        @Override
        public JsonToken getCurrentToken() {
            return this.currentToken;
        }

        @Override
        public JsonToken nextToken() {
            return null;
        }

        @Override
        public ObjectCodec getCodec() {
            return null;
        }

        @Override
        public void setCodec(ObjectCodec c) {
        }

        @Override
        public Version version() {
            return Version.unknownVersion();
        }

        @Override
        public void close() {
        }

        @Override
        public boolean isClosed() {
            return false;
        }

        @Override
        public JsonStreamContext getParsingContext() {
            return null;
        }

        @Override
        public JsonLocation getTokenLocation() {
            return null;
        }

        @Override
        public JsonLocation getCurrentLocation() {
            return null;
        }

        @Override
        public String getText() {
            return null;
        }

        @Override
        public char[] getTextCharacters() {
            return new char[0];
        }

        @Override
        public int getTextLength() {
            return 0;
        }

        @Override
        public int getTextOffset() {
            return 0;
        }

        @Override
        public Number getNumberValue() {
            return null;
        }

        @Override
        public NumberType getNumberType() {
            return null;
        }

        @Override
        public int getIntValue() {
            return 0;
        }

        @Override
        public long getLongValue() {
            return 0L;
        }

        @Override
        public BigInteger getBigIntegerValue() {
            return null;
        }

        @Override
        public float getFloatValue() {
            return 0.0f;
        }

        @Override
        public double getDoubleValue() {
            return 0.0;
        }

        @Override
        public BigDecimal getDecimalValue() {
            return null;
        }

        @Override
        public byte[] getBinaryValue(Base64Variant bv) {
            return new byte[0];
        }

        @Override
        public void overrideCurrentName(String name) {
        }

        @Override
        public String getCurrentName() {
            return null;
        }

        @Override
        public JsonToken nextValue() {
            return null;
        }

        @Override
        public JsonParser skipChildren() {
            return this;
        }

        @Override
        public void clearCurrentToken() {
            this.currentToken = null;
        }

        @Override
        public JsonToken getLastClearedToken() {
            return null;
        }
    }

    private static class StubTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(com.fasterxml.jackson.databind.BeanProperty prop) {
            return this;
        }

        @Override
        public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion() {
            return null;
        }

        @Override
        public String getPropertyName() {
            return "type";
        }

        @Override
        public com.fasterxml.jackson.databind.jsontype.TypeIdResolver getTypeIdResolver() {
            return null;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return null;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) {
            return null;
        }
    }

    private static class SettableBeanPropertyWithType extends StubSettableBeanProperty {
        private static final long serialVersionUID = 1L;

        public SettableBeanPropertyWithType(String name, JavaType type, TypeDeserializer typeDeser, JsonDeserializer<?> valDeser) {
            super(name, type);
            this._valueTypeDeserializer = typeDeser;
            this._valueDeserializer = valDeser;
        }
    }

    private OuterClass outerInstance;
    private Constructor<?> validConstructor;
    private Constructor<?> failingConstructor;
    private StubSettableBeanProperty stubDelegate;
    private StubJsonDeserializer stubDeserializer;
    private JavaType stringType;

    @Before
    public void setUp() throws Exception {
        this.outerInstance = new OuterClass();
        this.validConstructor = OuterClass.NonStaticInner.class.getDeclaredConstructor(new Class<?>[] { OuterClass.class });
        this.failingConstructor = OuterClass.FailingInner.class.getDeclaredConstructor(new Class<?>[] { OuterClass.class });
        this.stringType = TypeFactory.defaultInstance().constructType(String.class);
        this.stubDelegate = new StubSettableBeanProperty("testProp", this.stringType);
        this.stubDeserializer = new StubJsonDeserializer();
    }

    @Test
    public void constructor_givenDelegateAndCtor_shouldInitializeCorrectly() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        Assert.assertSame(this.stubDelegate, prop._delegate);
        Assert.assertSame(this.validConstructor, prop._creator);
        Assert.assertNull(prop._annotated);
    }

    @Test
    public void constructor_givenAnnotatedConstructor_shouldSetAnnotatedAndCreator() {
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedConstructor ann = new AnnotatedConstructor(null, this.validConstructor, annMap, null);
        InnerClassProperty base = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        InnerClassProperty copy = new InnerClassProperty(base, ann);

        Assert.assertSame(ann, copy._annotated);
        Assert.assertSame(this.validConstructor, copy._creator);
        Assert.assertSame(this.stubDelegate, copy._delegate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullAnnotated_shouldThrowIllegalArgumentException() {
        InnerClassProperty base = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        new InnerClassProperty(base, (AnnotatedConstructor) null);
    }

    @Test
    public void constructor_givenAnnotatedWithNullConstructor_shouldThrowIllegalArgumentException() {
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedConstructor ann = new AnnotatedConstructor(null, null, annMap, null);
        InnerClassProperty base = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        try {
            new InnerClassProperty(base, ann);
            Assert.fail("Expected IllegalArgumentException for null constructor");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Missing constructor (broken JDK (de)serialization?)", e.getMessage());
        }
    }

    @Test
    public void withName_givenNewPropertyName_shouldCreateNewInstanceWithUpdatedName() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        PropertyName newName = new PropertyName("renamedProp");

        InnerClassProperty renamed = prop.withName(newName);

        Assert.assertNotSame(prop, renamed);
        Assert.assertEquals("renamedProp", renamed.getName());
        Assert.assertSame(this.validConstructor, renamed._creator);
        Assert.assertEquals("renamedProp", renamed._delegate.getName());
    }

    @Test
    public void withValueDeserializer_givenNewDeserializer_shouldUpdateDelegateAndRetainCreator() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        StubJsonDeserializer newDeser = new StubJsonDeserializer();

        InnerClassProperty updated = prop.withValueDeserializer(newDeser);

        Assert.assertNotSame(prop, updated);
        Assert.assertSame(newDeser, updated.getValueDeserializer());
        Assert.assertSame(this.validConstructor, updated._creator);
        Assert.assertSame(newDeser, updated._delegate.getValueDeserializer());
    }

    @Test
    public void assignIndex_givenIndex_shouldDelegateToUnderlyingDelegate() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        prop.assignIndex(5);
        Assert.assertEquals(5, prop.getPropertyIndex());
        Assert.assertEquals(5, this.stubDelegate.assignedIndex);

        prop.assignIndex(0);
        Assert.assertEquals(0, prop.getPropertyIndex());
        Assert.assertEquals(0, this.stubDelegate.assignedIndex);

        prop.assignIndex(-1);
        Assert.assertEquals(-1, prop.getPropertyIndex());
        Assert.assertEquals(-1, this.stubDelegate.assignedIndex);
    }

    @Test
    public void getAnnotation_givenAnnotationClass_shouldDelegateToDelegate() {
        DummyAnnotation dummy = OuterClass.class.getAnnotation(DummyAnnotation.class);
        this.stubDelegate.annotationStub = dummy;

        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        Assert.assertSame(dummy, prop.getAnnotation(DummyAnnotation.class));
        Assert.assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void getMember_whenCalled_shouldDelegateToDelegate() {
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedConstructor ann = new AnnotatedConstructor(null, this.validConstructor, annMap, null);
        this.stubDelegate.memberStub = ann;

        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);

        Assert.assertSame(ann, prop.getMember());
    }

    @Test
    public void set_givenInstanceAndValue_shouldDelegateToDelegate() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        Object target = new Object();
        Object val = "testValue";

        prop.set(target, val);

        Assert.assertSame(target, this.stubDelegate.lastSetInstance);
        Assert.assertSame(val, this.stubDelegate.lastSetValue);
    }

    @Test
    public void setAndReturn_givenInstanceAndValue_shouldDelegateToDelegateAndReturn() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        Object target = new Object();
        Object val = "testValue";

        Object result = prop.setAndReturn(target, val);

        Assert.assertSame(target, result);
        Assert.assertSame(target, this.stubDelegate.lastSetInstance);
        Assert.assertSame(val, this.stubDelegate.lastSetValue);
    }

    @Test
    public void deserializeAndSet_givenTokenValueNull_shouldSetNullValue() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        prop = prop.withValueDeserializer(this.stubDeserializer);
        this.stubDeserializer.nullValueToReturn = "EXPLICIT_NULL";

        StubJsonParser parser = new StubJsonParser(JsonToken.VALUE_NULL);
        prop.deserializeAndSet(parser, (DeserializationContext) null, this.outerInstance);

        Assert.assertSame(this.outerInstance, this.stubDelegate.lastSetInstance);
        Assert.assertEquals("EXPLICIT_NULL", this.stubDelegate.lastSetValue);
        Assert.assertFalse(this.stubDeserializer.deserializeCalled);
    }

    @Test
    public void deserializeAndSet_givenValueTypeDeserializerNonNull_shouldCallDeserializeWithType() throws IOException {
        StubTypeDeserializer typeDeser = new StubTypeDeserializer();
        SettableBeanPropertyWithType delegateWithType = new SettableBeanPropertyWithType(
                "propWithType", this.stringType, typeDeser, this.stubDeserializer);
        InnerClassProperty prop = new InnerClassProperty(delegateWithType, this.validConstructor);

        this.stubDeserializer.deserializeWithTypeToReturn = "CUSTOM_TYPED_VALUE";
        StubJsonParser parser = new StubJsonParser(JsonToken.START_OBJECT);

        prop.deserializeAndSet(parser, (DeserializationContext) null, this.outerInstance);

        Assert.assertSame(this.outerInstance, delegateWithType.lastSetInstance);
        Assert.assertEquals("CUSTOM_TYPED_VALUE", delegateWithType.lastSetValue);
        Assert.assertFalse(this.stubDeserializer.deserializeCalled);
    }

    @Test
    public void deserializeAndSet_givenNormalTokenAndNoTypeDeserializer_shouldInstantiateAndDeserialize() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        prop = prop.withValueDeserializer(this.stubDeserializer);

        StubJsonParser parser = new StubJsonParser(JsonToken.START_OBJECT);
        prop.deserializeAndSet(parser, (DeserializationContext) null, this.outerInstance);

        Assert.assertTrue(this.stubDeserializer.deserializeCalled);
        Assert.assertNotNull(this.stubDeserializer.deserializedValue);
        Assert.assertTrue(this.stubDeserializer.deserializedValue instanceof OuterClass.NonStaticInner);

        OuterClass.NonStaticInner inner = (OuterClass.NonStaticInner) this.stubDelegate.lastSetValue;
        Assert.assertSame(this.outerInstance, this.stubDelegate.lastSetInstance);
        Assert.assertSame(this.stubDeserializer.deserializedValue, inner);
        Assert.assertEquals("updated_by_deserializer", inner.data);
    }

    @Test
    public void deserializeAndSet_givenConstructorThrowsException_shouldUnwrapAndThrowAsIAE() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.failingConstructor);
        prop = prop.withValueDeserializer(this.stubDeserializer);

        StubJsonParser parser = new StubJsonParser(JsonToken.START_OBJECT);

        try {
            prop.deserializeAndSet(parser, (DeserializationContext) null, this.outerInstance);
            Assert.fail("Expected IllegalArgumentException when constructor throws exception");
        } catch (IllegalArgumentException e) {
            String msg = e.getMessage();
            Assert.assertTrue(msg != null && msg.indexOf("Failed to instantiate class") >= 0);
            Assert.assertTrue(msg.indexOf("Simulated instantiation failure") >= 0);
        } catch (IOException e) {
            Assert.fail("Expected IllegalArgumentException, not IOException: " + e.getMessage());
        }
    }

    @Test
    public void deserializeSetAndReturn_givenParserAndContext_shouldCallDeserializeAndSetAndReturn() throws IOException {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        prop = prop.withValueDeserializer(this.stubDeserializer);

        StubJsonParser parser = new StubJsonParser(JsonToken.VALUE_STRING);
        Object returned = prop.deserializeSetAndReturn(parser, (DeserializationContext) null, this.outerInstance);

        Assert.assertSame(this.outerInstance, returned);
        Assert.assertSame(this.outerInstance, this.stubDelegate.lastSetInstance);
        Assert.assertEquals("DESERIALIZED_TOKEN", this.stubDelegate.lastSetValue);
    }

    @Test
    public void writeReplace_whenAnnotatedIsNull_shouldCreateAnnotatedConstructor() {
        InnerClassProperty prop = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        Assert.assertNull(prop._annotated);

        Object replaced = prop.writeReplace();

        Assert.assertNotSame(prop, replaced);
        Assert.assertTrue(replaced instanceof InnerClassProperty);
        InnerClassProperty innerReplaced = (InnerClassProperty) replaced;
        Assert.assertNotNull(innerReplaced._annotated);
        Assert.assertSame(this.validConstructor, innerReplaced._annotated.getAnnotated());
        Assert.assertSame(this.validConstructor, innerReplaced._creator);
    }

    @Test
    public void writeReplace_whenAnnotatedIsNotNull_shouldReturnThis() {
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedConstructor ann = new AnnotatedConstructor(null, this.validConstructor, annMap, null);
        InnerClassProperty base = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        InnerClassProperty propWithAnn = new InnerClassProperty(base, ann);

        Object replaced = propWithAnn.writeReplace();

        Assert.assertSame(propWithAnn, replaced);
    }

    @Test
    public void readResolve_whenAnnotatedIsValid_shouldReturnReconstructedInnerClassProperty() {
        AnnotationMap annMap = new AnnotationMap();
        AnnotatedConstructor ann = new AnnotatedConstructor(null, this.validConstructor, annMap, null);
        InnerClassProperty base = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        InnerClassProperty propWithAnn = new InnerClassProperty(base, ann);

        Object resolved = propWithAnn.readResolve();

        Assert.assertNotNull(resolved);
        Assert.assertTrue(resolved instanceof InnerClassProperty);
        InnerClassProperty resolvedProp = (InnerClassProperty) resolved;
        Assert.assertSame(this.validConstructor, resolvedProp._creator);
        Assert.assertSame(ann, resolvedProp._annotated);
        Assert.assertSame(this.stubDelegate, resolvedProp._delegate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void readResolve_whenAnnotatedIsNull_shouldThrowIllegalArgumentException() {
        InnerClassProperty propWithoutAnn = new InnerClassProperty(this.stubDelegate, this.validConstructor);
        propWithoutAnn.readResolve();
    }
}