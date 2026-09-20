package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;

public class MethodPropertyTest {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface CustomAnnotation {
        String value() default "";
    }

    public static class TestBean {
        private String value;
        private Object customResult;

        public TestBean() {
        }

        @CustomAnnotation("annotatedSetter")
        public void setValue(String v) {
            this.value = v;
        }

        public String getValue() {
            return this.value;
        }

        public Object setAndReturn(String v) {
            this.value = v;
            return this.customResult;
        }

        public void setCustomResult(Object r) {
            this.customResult = r;
        }

        public void throwingSetter(String v) {
            throw new IllegalArgumentException("Setter exception for: " + v);
        }

        public Object throwingSetAndReturn(String v) {
            throw new IllegalStateException("Setter exception for: " + v);
        }
    }

    private ObjectMapper objectMapper;
    private MethodProperty standardProperty;
    private MethodProperty returnProperty;
    private MethodProperty throwingProperty;
    private MethodProperty throwingReturnProperty;

    @Before
    public void setUp() throws Exception {
        objectMapper = new ObjectMapper();
        JavaType type = objectMapper.constructType(TestBean.class);
        BeanDescription desc = objectMapper.getDeserializationConfig().introspect(type);
        List<BeanPropertyDefinition> props = desc.findProperties();

        for (int i = 0; i < props.size(); i++) {
            BeanPropertyDefinition propDef = props.get(i);
            AnnotatedMethod setter = propDef.getSetter();
            if (setter == null) {
                continue;
            }
            String name = propDef.getName();
            if ("value".equals(name)) {
                standardProperty = new MethodProperty(propDef, propDef.getPrimaryType(),
                        null, null, setter);
            } else if ("andReturn".equals(name) || "setAndReturn".equals(setter.getName())) {
                returnProperty = new MethodProperty(propDef, propDef.getPrimaryType(),
                        null, null, setter);
            }
        }

        Method throwMethod = TestBean.class.getMethod("throwingSetter", new Class[] { String.class });
        Method throwReturnMethod = TestBean.class.getMethod("throwingSetAndReturn", new Class[] { String.class });

        AnnotatedMethod annotatedThrow = new AnnotatedMethod(null, throwMethod, null, null);
        AnnotatedMethod annotatedThrowReturn = new AnnotatedMethod(null, throwReturnMethod, null, null);

        throwingProperty = new MethodProperty(standardProperty, annotatedThrow.getAnnotated());
        throwingReturnProperty = new MethodProperty(standardProperty, annotatedThrowReturn.getAnnotated());
    }

    @Test
    public void constructor_givenValidParameters_shouldInitializeCorrectly() {
        // Arrange & Act
        AnnotatedMember member = standardProperty.getMember();

        // Assert
        Assert.assertNotNull(member);
        Assert.assertTrue(member instanceof AnnotatedMethod);
        Assert.assertEquals("setValue", member.getName());
    }

    @Test
    public void withName_givenNewPropertyName_shouldReturnNewInstanceWithGivenName() {
        // Arrange
        PropertyName newName = new PropertyName("renamedValue");

        // Act
        SettableBeanProperty modifiedProp = standardProperty.withName(newName);

        // Assert
        Assert.assertNotNull(modifiedProp);
        Assert.assertNotSame(standardProperty, modifiedProp);
        Assert.assertEquals("renamedValue", modifiedProp.getName());
    }

    @Test
    public void withValueDeserializer_givenSameDeserializer_shouldReturnSameInstance() {
        // Arrange
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "dummy";
            }
        };
        SettableBeanProperty propWithDeser = standardProperty.withValueDeserializer(deser);

        // Act
        SettableBeanProperty propSameDeser = propWithDeser.withValueDeserializer(deser);

        // Assert
        Assert.assertSame(propWithDeser, propSameDeser);
    }

    @Test
    public void withValueDeserializer_givenDifferentDeserializer_shouldReturnNewInstance() {
        // Arrange
        JsonDeserializer<Object> deser1 = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "v1";
            }
        };
        JsonDeserializer<Object> deser2 = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "v2";
            }
        };

        // Act
        SettableBeanProperty prop1 = standardProperty.withValueDeserializer(deser1);
        SettableBeanProperty prop2 = prop1.withValueDeserializer(deser2);

        // Assert
        Assert.assertNotSame(prop1, prop2);
        Assert.assertSame(deser2, prop2.getValueDeserializer());
    }

    @Test
    public void withNullProvider_givenNewNullProvider_shouldReturnNewInstance() {
        // Arrange
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "fallbackNull";
            }
        };

        // Act
        SettableBeanProperty propWithNull = standardProperty.withNullProvider(nva);

        // Assert
        Assert.assertNotNull(propWithNull);
        Assert.assertNotSame(standardProperty, propWithNull);
        Assert.assertSame(nva, propWithNull.getNullValueProvider());
    }

    @Test
    public void fixAccess_givenConfig_shouldInvokeWithoutException() {
        // Arrange
        DeserializationConfig config = objectMapper.getDeserializationConfig();

        // Act & Assert
        standardProperty.fixAccess(config);
    }

    @Test
    public void getAnnotation_givenExistingAnnotation_shouldReturnAnnotationInstance() {
        // Arrange & Act
        CustomAnnotation annotation = standardProperty.getAnnotation(CustomAnnotation.class);

        // Assert
        Assert.assertNotNull(annotation);
        Assert.assertEquals("annotatedSetter", annotation.value());
    }

    @Test
    public void getAnnotation_givenNullAnnotated_shouldReturnNull() throws Exception {
        // Arrange
        Field annotatedField = MethodProperty.class.getDeclaredField("_annotated");
        annotatedField.setAccessible(true);
        annotatedField.set(standardProperty, null);

        // Act
        CustomAnnotation annotation = standardProperty.getAnnotation(CustomAnnotation.class);

        // Assert
        Assert.assertNull(annotation);
    }

    @Test
    public void set_givenValidInstanceAndValue_shouldInvokeSetterSuccessfully() throws Exception {
        // Arrange
        TestBean bean = new TestBean();

        // Act
        standardProperty.set(bean, "directValue");

        // Assert
        Assert.assertEquals("directValue", bean.getValue());
    }

    @Test
    public void set_givenThrowingSetter_shouldThrowIOException() {
        // Arrange
        TestBean bean = new TestBean();

        // Act & Assert
        try {
            throwingProperty.set(bean, "fail");
            Assert.fail("Expected IOException on throwingSetter");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Setter exception for: fail")
                    || (e.getCause() != null && e.getCause().getMessage().contains("Setter exception for: fail")));
        }
    }

    @Test
    public void setAndReturn_givenNullResult_shouldReturnInstance() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setCustomResult(null);

        // Act
        Object result = returnProperty.setAndReturn(bean, "returnedValue");

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals("returnedValue", bean.getValue());
    }

    @Test
    public void setAndReturn_givenNonNullResult_shouldReturnCustomResult() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        String customReturn = "customResponse";
        bean.setCustomResult(customReturn);

        // Act
        Object result = returnProperty.setAndReturn(bean, "returnedValue");

        // Assert
        Assert.assertSame(customReturn, result);
        Assert.assertEquals("returnedValue", bean.getValue());
    }

    @Test
    public void setAndReturn_givenThrowingSetter_shouldThrowIOException() {
        // Arrange
        TestBean bean = new TestBean();

        // Act & Assert
        try {
            throwingReturnProperty.setAndReturn(bean, "fail");
            Assert.fail("Expected IOException on throwingSetAndReturn");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Setter exception for: fail")
                    || (e.getCause() != null && e.getCause().getMessage().contains("Setter exception for: fail")));
        }
    }

    @Test
    public void deserializeAndSet_givenValueNullTokenAndSkipNullsTrue_shouldReturnWithoutSetting() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        SettableBeanProperty prop = standardProperty.withNullProvider(NullsConstantProvider.skipper());
        JsonParser parser = objectMapper.getFactory().createParser("null");
        parser.nextToken(); // position to VALUE_NULL
        Assert.assertEquals(JsonToken.VALUE_NULL, parser.currentToken());

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenValueNullTokenAndSkipNullsFalse_shouldSetNullValue() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "customNullValue";
            }
        };
        SettableBeanProperty prop = standardProperty.withNullProvider(nva);
        JsonParser parser = objectMapper.getFactory().createParser("null");
        parser.nextToken();

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("customNullValue", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenNormalTokenAndDeserializerReturnsNonNull_shouldSetValue() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "deserializedValue";
            }
        };
        SettableBeanProperty prop = standardProperty.withValueDeserializer(deser);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("deserializedValue", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenDeserializerReturnsNullAndSkipNullsTrue_shouldNotModifyValue() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        SettableBeanProperty prop = standardProperty.withValueDeserializer(deser)
                .withNullProvider(NullsConstantProvider.skipper());
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenDeserializerReturnsNullAndSkipNullsFalse_shouldSetNullProviderValue() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "fallbackFromNullProvider";
            }
        };
        SettableBeanProperty prop = standardProperty.withValueDeserializer(deser).withNullProvider(nva);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("fallbackFromNullProvider", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenTypeDeserializer_shouldCallDeserializeWithType() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "plainDeserialize";
            }

            @Override
            public Object deserializeWithType(JsonParser p, DeserializationContext ctxt,
                    TypeDeserializer typeDeserializer) {
                return "deserializedWithType";
            }
        };

        Field typeDeserField = SettableBeanProperty.class.getDeclaredField("_valueTypeDeserializer");
        typeDeserField.setAccessible(true);
        TypeDeserializer dummyTypeDeser = new TypeDeserializer() {
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
                return null;
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
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };

        SettableBeanProperty prop = standardProperty.withValueDeserializer(deser);
        typeDeserField.set(prop, dummyTypeDeser);

        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        prop.deserializeAndSet(parser, null, bean);

        // Assert
        Assert.assertEquals("deserializedWithType", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenSetterException_shouldThrowIOException() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "willFail";
            }
        };
        SettableBeanProperty prop = throwingProperty.withValueDeserializer(deser);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act & Assert
        try {
            prop.deserializeAndSet(parser, null, bean);
            Assert.fail("Expected IOException when setter throws");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Setter exception for: willFail")
                    || (e.getCause() != null && e.getCause().getMessage().contains("Setter exception for: willFail")));
        } finally {
            parser.close();
        }
    }

    @Test
    public void deserializeSetAndReturn_givenValueNullTokenAndSkipNullsTrue_shouldReturnInstanceWithoutSetting() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        SettableBeanProperty prop = returnProperty.withNullProvider(NullsConstantProvider.skipper());
        JsonParser parser = objectMapper.getFactory().createParser("null");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenValueNullTokenAndSkipNullsFalse_shouldSetAndReturnResult() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        bean.setCustomResult(null);
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "customNull";
            }
        };
        SettableBeanProperty prop = returnProperty.withNullProvider(nva);
        JsonParser parser = objectMapper.getFactory().createParser("null");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals("customNull", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenDeserializerReturnsNonNullAndSetterReturnsResult_shouldReturnCustomResult() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        String customReturn = "customReturnResult";
        bean.setCustomResult(customReturn);

        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "normalValue";
            }
        };
        SettableBeanProperty prop = returnProperty.withValueDeserializer(deser);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(customReturn, result);
        Assert.assertEquals("normalValue", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenDeserializerReturnsNullAndSkipNullsTrue_shouldReturnInstance() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        SettableBeanProperty prop = returnProperty.withValueDeserializer(deser)
                .withNullProvider(NullsConstantProvider.skipper());
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals("initial", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenDeserializerReturnsNullAndSkipNullsFalse_shouldSetNullValueAndReturn() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        bean.setValue("initial");
        bean.setCustomResult(null);

        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        NullValueProvider nva = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "fallbackFromNullProvider";
            }
        };
        SettableBeanProperty prop = returnProperty.withValueDeserializer(deser).withNullProvider(nva);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals("fallbackFromNullProvider", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenTypeDeserializer_shouldCallDeserializeWithType() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        String expectedReturn = "typedReturnResult";
        bean.setCustomResult(expectedReturn);

        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "plainDeserialize";
            }

            @Override
            public Object deserializeWithType(JsonParser p, DeserializationContext ctxt,
                    TypeDeserializer typeDeserializer) {
                return "typedValue";
            }
        };

        Field typeDeserField = SettableBeanProperty.class.getDeclaredField("_valueTypeDeserializer");
        typeDeserField.setAccessible(true);
        TypeDeserializer dummyTypeDeser = new TypeDeserializer() {
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
                return null;
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
            public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
            @Override
            public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };

        SettableBeanProperty prop = returnProperty.withValueDeserializer(deser);
        typeDeserField.set(prop, dummyTypeDeser);

        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, null, bean);

        // Assert
        Assert.assertSame(expectedReturn, result);
        Assert.assertEquals("typedValue", bean.getValue());
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenSetterException_shouldThrowIOException() throws Exception {
        // Arrange
        TestBean bean = new TestBean();
        JsonDeserializer<Object> deser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return "triggerException";
            }
        };
        SettableBeanProperty prop = throwingReturnProperty.withValueDeserializer(deser);
        JsonParser parser = objectMapper.getFactory().createParser("\"data\"");
        parser.nextToken();

        // Act & Assert
        try {
            prop.deserializeSetAndReturn(parser, null, bean);
            Assert.fail("Expected IOException on deserializeSetAndReturn exception");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Setter exception for: triggerException")
                    || (e.getCause() != null && e.getCause().getMessage().contains("Setter exception for: triggerException")));
        } finally {
            parser.close();
        }
    }

    @Test
    public void readResolve_whenInvoked_shouldReturnNewMethodPropertyInstance() throws Exception {
        // Arrange
        Method readResolveMethod = MethodProperty.class.getDeclaredMethod("readResolve", new Class[0]);
        readResolveMethod.setAccessible(true);

        // Act
        Object resolved = readResolveMethod.invoke(standardProperty, new Object[0]);

        // Assert
        Assert.assertNotNull(resolved);
        Assert.assertTrue(resolved instanceof MethodProperty);
        Assert.assertNotSame(standardProperty, resolved);
        Assert.assertEquals(standardProperty.getName(), ((MethodProperty) resolved).getName());
    }
}