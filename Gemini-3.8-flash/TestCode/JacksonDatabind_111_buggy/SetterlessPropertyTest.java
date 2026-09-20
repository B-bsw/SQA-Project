package com.fasterxml.jackson.databind.deser.impl;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.AccessPattern;

public class SetterlessPropertyTest {

    public static class CollectionBean {
        private List<String> values = new ArrayList<String>();

        public List<String> getValues() {
            return this.values;
        }
    }

    public static class ThrowingBean {
        public List<String> getValues() {
            throw new RuntimeException("Simulated getter failure");
        }
    }

    public static class NullReturningBean {
        public List<String> getValues() {
            return null;
        }
    }

    public static class AnnotatedBean {
        private List<String> values = new ArrayList<String>();

        @Deprecated
        public List<String> getValues() {
            return this.values;
        }
    }

    private static class StubTypeDeserializer extends TypeDeserializer {
        @Override
        public TypeDeserializer forProperty(BeanProperty prop) {
            return this;
        }

        @Override
        public JsonTypeInfo.As getTypeInclusion() {
            return JsonTypeInfo.As.PROPERTY;
        }

        @Override
        public String getPropertyName() {
            return "@type";
        }

        @Override
        public TypeIdResolver getTypeIdResolver() {
            return null;
        }

        @Override
        public Class<?> getDefaultImpl() {
            return null;
        }

        @Override
        public Object deserializeTypedFromObject(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromArray(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromScalar(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }

        @Override
        public Object deserializeTypedFromAny(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    private SetterlessProperty createProperty(Class<?> targetClass, ObjectMapper mapper, TypeDeserializer typeDeser) {
        JavaType beanType = mapper.constructType(targetClass);
        BeanDescription beanDesc = mapper.getDeserializationConfig().introspect(beanType);
        BeanPropertyDefinition propDef = null;
        for (BeanPropertyDefinition p : beanDesc.findProperties()) {
            if ("values".equals(p.getName())) {
                propDef = p;
                break;
            }
        }
        AnnotatedMethod getter = propDef.getGetter();
        JavaType propType = getter.getType();
        return new SetterlessProperty(propDef, propType, typeDeser, null, getter);
    }

    private DefaultDeserializationContext createDeserializationContext(ObjectMapper mapper, JsonParser parser) {
        return ((DefaultDeserializationContext) mapper.getDeserializationContext())
                .createInstance(mapper.getDeserializationConfig(), parser, mapper.getInjectableValues());
    }

    private JsonDeserializer<Object> createAppendingDeserializer(final String itemToAppend) {
        return new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt, Object intoValue) throws IOException {
                if (intoValue instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<Object> list = (List<Object>) intoValue;
                    list.add(itemToAppend);
                }
                return intoValue;
            }
        };
    }

    @Test
    public void constructor_givenValidArguments_shouldInitializeFields() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        
        // Act
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);

        // Assert
        Assert.assertNotNull(prop);
        Assert.assertEquals("values", prop.getName());
        Assert.assertNotNull(prop.getMember());
        Assert.assertEquals("getValues", prop.getMember().getName());
    }

    @Test
    public void withName_givenNewPropertyName_shouldReturnNewInstanceWithUpdatedName() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        PropertyName newName = new PropertyName("renamedValues");

        // Act
        SettableBeanProperty renamed = prop.withName(newName);

        // Assert
        Assert.assertNotNull(renamed);
        Assert.assertNotSame(prop, renamed);
        Assert.assertEquals("renamedValues", renamed.getName());
        Assert.assertEquals(prop.getType(), renamed.getType());
    }

    @Test
    public void withValueDeserializer_givenSameDeserializer_shouldReturnSameInstance() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        JsonDeserializer<Object> deser = createAppendingDeserializer("test");
        SetterlessProperty configuredProp = (SetterlessProperty) prop.withValueDeserializer(deser);

        // Act
        SettableBeanProperty result = configuredProp.withValueDeserializer(deser);

        // Assert
        Assert.assertSame(configuredProp, result);
    }

    @Test
    public void withValueDeserializer_givenDifferentDeserializer_shouldReturnNewInstance() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        JsonDeserializer<Object> deser1 = createAppendingDeserializer("test1");
        JsonDeserializer<Object> deser2 = createAppendingDeserializer("test2");
        SetterlessProperty configuredProp = (SetterlessProperty) prop.withValueDeserializer(deser1);

        // Act
        SettableBeanProperty result = configuredProp.withValueDeserializer(deser2);

        // Assert
        Assert.assertNotSame(configuredProp, result);
        Assert.assertSame(deser2, result.getValueDeserializer());
    }

    @Test
    public void withNullProvider_givenNullValueProvider_shouldReturnNewInstanceWithProvider() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        NullValueProvider nva = new NullValueProvider() {
            public Object getNullValue(DeserializationContext ctxt) throws JsonMappingException {
                return null;
            }

            public AccessPattern getNullAccessPattern() {
                return AccessPattern.ALWAYS_NULL;
            }
        };

        // Act
        SettableBeanProperty result = prop.withNullProvider(nva);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertNotSame(prop, result);
        Assert.assertSame(nva, result.getNullValueProvider());
    }

    @Test
    public void fixAccess_givenConfigWithOverrideModifiers_shouldExecuteWithoutException() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        DeserializationConfig config = mapper.getDeserializationConfig()
                .with(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);

        // Act & Assert
        prop.fixAccess(config);
    }

    @Test
    public void fixAccess_givenConfigWithoutOverrideModifiers_shouldExecuteWithoutException() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        DeserializationConfig config = mapper.getDeserializationConfig()
                .without(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);

        // Act & Assert
        prop.fixAccess(config);
    }

    @Test
    public void getAnnotation_givenExistingAnnotation_shouldReturnAnnotationInstance() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(AnnotatedBean.class, mapper, null);

        // Act
        Deprecated ann = prop.getAnnotation(Deprecated.class);

        // Assert
        Assert.assertNotNull(ann);
    }

    @Test
    public void getAnnotation_givenNonExistingAnnotation_shouldReturnNull() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(AnnotatedBean.class, mapper, null);

        // Act
        Override ann = prop.getAnnotation(Override.class);

        // Assert
        Assert.assertNull(ann);
    }

    @Test
    public void getMember_givenSetterlessProperty_shouldReturnAnnotatedMethod() {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);

        // Act
        AnnotatedMember member = prop.getMember();

        // Assert
        Assert.assertNotNull(member);
        Assert.assertTrue(member instanceof AnnotatedMethod);
        Assert.assertEquals("getValues", member.getName());
    }

    @Test
    public void deserializeAndSet_givenNullToken_shouldReturnEarlyWithoutModifying() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("null");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        CollectionBean bean = new CollectionBean();

        // Act
        prop.deserializeAndSet(parser, ctxt, bean);

        // Assert
        Assert.assertEquals(0, bean.getValues().size());
        parser.close();
    }

    @Test
    public void deserializeAndSet_givenValueTypeDeserializerNotNull_shouldReportBadDefinition() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        TypeDeserializer typeDeser = new StubTypeDeserializer();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, typeDeser);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        CollectionBean bean = new CollectionBean();

        // Act & Assert
        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected JsonMappingException for setterless property with TypeDeserializer");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("no way to handle typed deser with setterless yet"));
        } finally {
            parser.close();
        }
    }

    @Test
    public void deserializeAndSet_givenGetterThrowsException_shouldThrowIOException() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(ThrowingBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        ThrowingBean bean = new ThrowingBean();

        // Act & Assert
        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected IOException when getter fails");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Simulated getter failure"));
        } finally {
            parser.close();
        }
    }

    @Test
    public void deserializeAndSet_givenIncompatibleTargetInstance_shouldCatchReflectionExceptionAndThrow() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        Object incompatibleInstance = "IncompatibleTargetInstance";

        // Act & Assert
        try {
            prop.deserializeAndSet(parser, ctxt, incompatibleInstance);
            Assert.fail("Expected JsonMappingException due to reflection target mismatch");
        } catch (JsonMappingException e) {
            Assert.assertNotNull(e.getMessage());
        } finally {
            parser.close();
        }
    }

    @Test
    public void deserializeAndSet_givenGetterReturnsNull_shouldReportBadDefinition() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(NullReturningBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        NullReturningBean bean = new NullReturningBean();

        // Act & Assert
        try {
            prop.deserializeAndSet(parser, ctxt, bean);
            Assert.fail("Expected JsonMappingException when getter returns null");
        } catch (JsonMappingException e) {
            Assert.assertTrue(e.getMessage().contains("get method returned null"));
        } finally {
            parser.close();
        }
    }

    @Test
    public void deserializeAndSet_givenValidTarget_shouldDeserializeAndModifyTarget() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        CollectionBean bean = new CollectionBean();

        // Act
        prop.deserializeAndSet(parser, ctxt, bean);

        // Assert
        Assert.assertEquals(1, bean.getValues().size());
        Assert.assertEquals("item1", bean.getValues().get(0));
        parser.close();
    }

    @Test
    public void deserializeSetAndReturn_givenValidTarget_shouldReturnSameInstance() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        prop = (SetterlessProperty) prop.withValueDeserializer(createAppendingDeserializer("item1"));
        JsonParser parser = mapper.getFactory().createParser("[\"item1\"]");
        parser.nextToken();
        DeserializationContext ctxt = createDeserializationContext(mapper, parser);
        CollectionBean bean = new CollectionBean();

        // Act
        Object result = prop.deserializeSetAndReturn(parser, ctxt, bean);

        // Assert
        Assert.assertSame(bean, result);
        Assert.assertEquals(1, bean.getValues().size());
        Assert.assertEquals("item1", bean.getValues().get(0));
        parser.close();
    }

    @Test
    public void set_givenAnyArguments_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        CollectionBean bean = new CollectionBean();
        List<String> dummyList = new ArrayList<String>();

        // Act & Assert
        try {
            prop.set(bean, dummyList);
            Assert.fail("Expected UnsupportedOperationException when invoking set()");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().contains("Should never call `set()` on setterless property"));
            Assert.assertTrue(e.getMessage().contains("values"));
        }
    }

    @Test
    public void setAndReturn_givenAnyArguments_shouldThrowUnsupportedOperationException() throws IOException {
        // Arrange
        ObjectMapper mapper = new ObjectMapper();
        SetterlessProperty prop = createProperty(CollectionBean.class, mapper, null);
        CollectionBean bean = new CollectionBean();
        List<String> dummyList = new ArrayList<String>();

        // Act & Assert
        try {
            prop.setAndReturn(bean, dummyList);
            Assert.fail("Expected UnsupportedOperationException when invoking setAndReturn()");
        } catch (UnsupportedOperationException e) {
            Assert.assertTrue(e.getMessage().contains("Should never call `set()` on setterless property"));
            Assert.assertTrue(e.getMessage().contains("values"));
        }
    }
}