package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

public class BasicDeserializerFactoryTest {

    private static class TestDeserializerFactory extends BasicDeserializerFactory {
        private static final long serialVersionUID = 1L;

        public TestDeserializerFactory() {
            this(new DeserializerFactoryConfig());
        }

        public TestDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }
    }

    private TestDeserializerFactory factory;

    @Before
    public void setUp() {
        factory = new TestDeserializerFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testGetFactoryConfig_ReturnsConfig() {
        DeserializerFactoryConfig config = new DeserializerFactoryConfig();
        TestDeserializerFactory f = new TestDeserializerFactory(config);
        Assert.assertSame(config, f.getFactoryConfig());
    }

    @Test
    public void testWithAdditionalDeserializers_NonNullSource_ReturnsNewInstance() {
        Deserializers additional = new Deserializers.Base() {};
        TestDeserializerFactory result = (TestDeserializerFactory) factory.withAdditionalDeserializers(additional);
        Assert.assertNotSame(factory, result);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWithAdditionalKeyDeserializers_NonNullSource_ReturnsNewInstance() {
        KeyDeserializers additional = new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc) {
                return null;
            }
        };
        TestDeserializerFactory result = (TestDeserializerFactory) factory.withAdditionalKeyDeserializers(additional);
        Assert.assertNotSame(factory, result);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWithDeserializerModifier_NonNullSource_ReturnsNewInstance() {
        BeanDeserializerModifier modifier = new BeanDeserializerModifier();
        TestDeserializerFactory result = (TestDeserializerFactory) factory.withDeserializerModifier(modifier);
        Assert.assertNotSame(factory, result);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWithAbstractTypeResolver_NonNullSource_ReturnsNewInstance() {
        AbstractTypeResolver resolver = new AbstractTypeResolver() {};
        TestDeserializerFactory result = (TestDeserializerFactory) factory.withAbstractTypeResolver(resolver);
        Assert.assertNotSame(factory, result);
        Assert.assertNotNull(result);
    }

    @Test
    public void testWithValueInstantiators_NonNullSource_ReturnsNewInstance() {
        ValueInstantiators instantiators = new ValueInstantiators.Base() {};
        TestDeserializerFactory result = (TestDeserializerFactory) factory.withValueInstantiators(instantiators);
        Assert.assertNotSame(factory, result);
        Assert.assertNotNull(result);
    }

    @Test
    public void testMapAbstractType_NoResolver_ReturnsSameType() {
        DeserializationConfig config = createConfig();
        JavaType input = config.constructType(String.class);
        JavaType result = factory.mapAbstractType(config, input);
        Assert.assertSame(input, result);
    }

    @Test
    public void testMapAbstractType_WithResolverChain_ResolvesConcrete() {
        DeserializationConfig config = createConfig();
        TestDeserializerFactory f = new TestDeserializerFactory() {
            private static final long serialVersionUID = 1L;
            @Override
            protected AbstractTypeResolver _getAbstractResolver(DeserializationConfig config) {
                return new AbstractTypeResolver() {
                    @Override
                    public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                        if (type.getRawClass().equals(List.class)) {
                            return config.constructType(ArrayList.class);
                        }
                        return null;
                    }
                };
            }
        };
        JavaType input = config.constructType(List.class);
        JavaType result = f.mapAbstractType(config, input);
        Assert.assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractType_WithChain_TwoResolvers_UsesFirstNonNull() {
        DeserializationConfig config = createConfig();
        TestDeserializerFactory f = new TestDeserializerFactory() {
            private static final long serialVersionUID = 1L;
            @Override
            protected AbstractTypeResolver _getAbstractResolver(DeserializationConfig config) {
                return new AbstractTypeResolver() {
                    @Override
                    public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                        return config.constructType(HashSet.class);
                    }
                };
            }
        };
        JavaType input = config.constructType(Set.class);
        JavaType result = f.mapAbstractType(config, input);
        Assert.assertEquals(HashSet.class, result.getRawClass());
    }

    @Test
    public void testFindValueInstantiator_NonNullClass_ReturnsInstance() {
        DeserializationConfig config = createConfig();
        BeanDescription beanDesc = config.introspect(config.constructType(TestBean.class));
        ValueInstantiator result = factory.findValueInstantiator(createDeserializationContext(config), beanDesc);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.canCreateUsingDefault());
    }

    @Test
    public void testFindValueInstantiator_JsonLocation_ReturnsJsonLocationInstantiator() {
        DeserializationConfig config = createConfig();
        BeanDescription beanDesc = config.introspect(config.constructType(JsonLocation.class));
        ValueInstantiator result = factory.findValueInstantiator(createDeserializationContext(config), beanDesc);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof JsonLocationInstantiator);
    }

    @Test
    public void testFindValueInstantiator_EmptySet_ReturnsConstantInstantiator() {
        DeserializationConfig config = createConfig();
        BeanDescription beanDesc = config.introspect(config.constructType(Collections.EMPTY_SET.getClass()));
        ValueInstantiator result = factory.findValueInstantiator(createDeserializationContext(config), beanDesc);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof ConstantValueInstantiator);
    }

    @Test
    public void testFindValueInstantiator_NullBeanDesc_ThrowsIllegalArgument() {
        try {
            factory.findValueInstantiator(createDeserializationContext(createConfig()), null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testCreateCollectionDeserializer_EnumSet_ReturnsCollectionDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        CollectionType type = config.getTypeFactory().constructCollectionType(EnumSet.class, TestEnum.class);
        JsonDeserializer<?> result = factory.createCollectionDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateCollectionDeserializer_ArrayBlockingQueue_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        CollectionType type = config.getTypeFactory().constructCollectionType(ArrayBlockingQueue.class, String.class);
        JsonDeserializer<?> result = factory.createCollectionDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateCollectionLikeDeserializer_NullType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JsonDeserializer<?> result = factory.createCollectionLikeDeserializer(ctxt, null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateMapDeserializer_EnumMap_ReturnsEnumMapDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        MapType type = config.getTypeFactory().constructMapType(EnumMap.class, TestEnum.class, String.class);
        JsonDeserializer<?> result = factory.createMapDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateMapDeserializer_WithMapFallback_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        MapType type = config.getTypeFactory().constructMapType(Map.class, String.class, Integer.class);
        JsonDeserializer<?> result = factory.createMapDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateMapLikeDeserializer_NullType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JsonDeserializer<?> result = factory.createMapLikeDeserializer(ctxt, null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateEnumDeserializer_EnumClass_ReturnsEnumDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(TestEnum.class);
        JsonDeserializer<?> result = factory.createEnumDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof EnumDeserializer);
    }

    @Test
    public void testCreateEnumDeserializer_NonEnumType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(String.class);
        JsonDeserializer<?> result = factory.createEnumDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateTreeDeserializer_JsonNodeType_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(JsonNode.class);
        JsonDeserializer<?> result = factory.createTreeDeserializer(config, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateReferenceDeserializer_AtomicReference_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.getTypeFactory().constructReferenceType(AtomicReference.class, config.constructType(String.class));
        JsonDeserializer<?> result = factory.createReferenceDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateReferenceDeserializer_NonReferenceType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(String.class);
        JsonDeserializer<?> result = factory.createReferenceDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindPropertyTypeDeserializer_WithTypeBuilder_ReturnsTypeDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType baseType = config.constructType(String.class);
        TypeDeserializer result = factory.findPropertyTypeDeserializer(config, baseType, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindPropertyContentTypeDeserializer_WithTypeBuilder_ReturnsTypeDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType contentType = config.constructType(String.class);
        TypeDeserializer result = factory.findPropertyContentTypeDeserializer(config, contentType, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindDefaultDeserializer_ObjectType_ReturnsUntypedObjectDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(Object.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertTrue(result instanceof UntypedObjectDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_StringType_ReturnsStringDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(String.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertSame(StringDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultDeserializer_TokenBufferType_ReturnsTokenBufferDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(TokenBuffer.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertTrue(result instanceof TokenBufferDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_PrimitiveInt_ReturnsIntDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(int.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindDefaultDeserializer_StringArray_ReturnsStringArrayDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(String[].class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertSame(StringArrayDeserializer.instance, result);
    }

    @Test
    public void testFindDefaultDeserializer_UnknownType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(TestCustomType.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindDefaultDeserializer_NullType_ThrowsIllegalArgument() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        try {
            factory.findDefaultDeserializer(ctxt, null, null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testFindDefaultDeserializer_IterableType_ReturnsCollectionDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(Iterable.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    @Test
    public void testFindDefaultDeserializer_MapEntryType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(Map.Entry.class);
        JsonDeserializer<?> result = factory.findDefaultDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateArrayDeserializer_StringArray_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        ArrayType type = config.getTypeFactory().constructArrayType(String.class);
        JsonDeserializer<?> result = factory.createArrayDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateArrayDeserializer_IntArray_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        ArrayType type = config.getTypeFactory().constructArrayType(int.class);
        JsonDeserializer<?> result = factory.createArrayDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateArrayDeserializer_ObjectArray_ReturnsDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        ArrayType type = config.getTypeFactory().constructArrayType(Object.class);
        JsonDeserializer<?> result = factory.createArrayDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateArrayDeserializer_NullType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JsonDeserializer<?> result = factory.createArrayDeserializer(ctxt, null, null);
        Assert.assertNull(result);
    }

    @Test
    public void testCreateKeyDeserializer_EnumClass_ReturnsEnumKeyDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(TestEnum.class);
        KeyDeserializer result = factory.createKeyDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateKeyDeserializer_StringClass_ReturnsFailsafeKeyDeserializer() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(String.class);
        KeyDeserializer result = factory.createKeyDeserializer(ctxt, type, null);
        Assert.assertNotNull(result);
    }

    @Test
    public void testCreateKeyDeserializer_NonEnumType_ReturnsNull() {
        DeserializationConfig config = createConfig();
        DeserializationContext ctxt = createDeserializationContext(config);
        JavaType type = config.constructType(TestCustomType.class);
        KeyDeserializer result = factory.createKeyDeserializer(ctxt, type, null);
        Assert.assertNull(result);
    }

    private DeserializationConfig createConfig() {
        return new com.fasterxml.jackson.databind.DeserializationConfig(
                com.fasterxml.jackson.databind.cfg.BaseSettings.forTests(new com.fasterxml.jackson.databind.cfg.MapperBuilder(null, null)),
                com.fasterxml.jackson.databind.cfg.BaseSettings.forTests(new com.fasterxml.jackson.databind.cfg.MapperBuilder(null, null)).getDefaults(),
                new com.fasterxml.jackson.databind.cfg.ConfigOverrides(), null);
    }

    private DeserializationContext createDeserializationContext(DeserializationConfig config) {
        return new DefaultDeserializationContext.Impl(new com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig(), null, null, config);
    }

    static class TestBean {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    enum TestEnum {
        A, B, C
    }

    static class TestCustomType {
    }
}