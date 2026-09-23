package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class BasicDeserializerFactoryTest {

    private DeserializerFactoryConfig config;
    private TestableBasicDeserializerFactory factory;
    private ObjectMapper mapper;
    private DeserializationConfig deserConfig;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        config = new DeserializerFactoryConfig();
        factory = new TestableBasicDeserializerFactory(config);
        mapper = new ObjectMapper();
        deserConfig = mapper.getDeserializationConfig();
        typeFactory = mapper.getTypeFactory();
    }

    @Test
    public void testGetFactoryConfigReturnsConstructorConfig() {
        assertSame(config, factory.getFactoryConfig());
    }

    @Test
    public void testWithAdditionalExtensionsReturnsNewFactoryWithUpdatedConfig() {
        DeserializerFactory f = factory.withAdditionalDeserializers(new Deserializers.Base() {});
        assertNotSame(factory, f);
        assertNotSame(config, f.getFactoryConfig());
        assertSame(config, factory.getFactoryConfig());

        KeyDeserializers kd = new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type,
                    DeserializationConfig config, BeanDescription beanDesc) {
                return null;
            }
        };
        f = factory.withAdditionalKeyDeserializers(kd);
        assertNotSame(factory, f);
        assertNotSame(config, f.getFactoryConfig());

        f = factory.withDeserializerModifier(new BeanDeserializerModifier() {});
        assertNotSame(factory, f);
        assertNotSame(config, f.getFactoryConfig());

        f = factory.withAbstractTypeResolver(new AbstractTypeResolver() {});
        assertNotSame(factory, f);
        assertNotSame(config, f.getFactoryConfig());

        f = factory.withValueInstantiators(new ValueInstantiators() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                    BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return defaultInstantiator;
            }
        });
        assertNotSame(factory, f);
        assertNotSame(config, f.getFactoryConfig());
    }

    @Test
    public void testMapAbstractTypeWithoutResolverReturnsSameType() throws Exception {
        JavaType listType = typeFactory.constructType(List.class);
        assertSame(listType, factory.mapAbstractType(deserConfig, listType));
    }

    @Test
    public void testMapAbstractTypeResolvesToConcreteSubtype() throws Exception {
        DeserializerFactoryConfig cfg = config.withAbstractTypeResolver(new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                if (type.getRawClass() == List.class) {
                    return typeFactory.constructType(ArrayList.class);
                }
                return null;
            }
        });
        TestableBasicDeserializerFactory f = new TestableBasicDeserializerFactory(cfg);

        JavaType result = f.mapAbstractType(deserConfig, typeFactory.constructType(List.class));

        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testMapAbstractTypeRejectsNonSubtype() throws Exception {
        DeserializerFactoryConfig cfg = config.withAbstractTypeResolver(new AbstractTypeResolver() {
            @Override
            public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
                return typeFactory.constructType(String.class);
            }
        });
        TestableBasicDeserializerFactory f = new TestableBasicDeserializerFactory(cfg);

        try {
            f.mapAbstractType(deserConfig, typeFactory.constructType(Number.class));
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid abstract type resolution"));
        }
    }

    @Test
    public void testFindDefaultDeserializerForStringAndCharSequence() throws Exception {
        assertSame(StringDeserializer.instance,
                factory.findDefaultDeserializer(null, typeFactory.constructType(String.class), null));
        assertSame(StringDeserializer.instance,
                factory.findDefaultDeserializer(null, typeFactory.constructType(CharSequence.class), null));
    }

    @Test
    public void testFindDefaultDeserializerForObject() throws Exception {
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(ctxt(),
                typeFactory.constructType(Object.class), null);
        assertNotNull(deser);
        assertTrue(deser.getClass().getName().endsWith("UntypedObjectDeserializer"));
    }

    @Test
    public void testFindDefaultDeserializerForPrimitive() throws Exception {
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(null,
                typeFactory.constructType(int.class), null);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializerForMapEntry() throws Exception {
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(ctxt(),
                typeFactory.constructType(Map.Entry.class), null);
        assertNotNull(deser);
    }

    @Test
    public void testFindDefaultDeserializerForIterable() throws Exception {
        JsonDeserializer<?> deser = factory.findDefaultDeserializer(ctxt(),
                typeFactory.constructType(Iterable.class), null);
        assertNotNull(deser);
    }

    @Test
    public void testCreateArrayDeserializerForStringArray() throws Exception {
        ArrayType arrayType = typeFactory.constructArrayType(String.class);
        JsonDeserializer<?> deser = factory.createArrayDeserializer(ctxt(), arrayType, null);
        assertSame(StringArrayDeserializer.instance, deser);
    }

    @Test
    public void testCreateCollectionDeserializerForListInterface() throws Exception {
        CollectionType listType = typeFactory.constructCollectionType(List.class, String.class);
        JsonDeserializer<?> deser = factory.createCollectionDeserializer(ctxt(), listType, null);
        assertNotNull(deser);
    }

    @Test
    public void testCreateMapDeserializerForMapInterface() throws Exception {
        MapType mapType = typeFactory.constructMapType(Map.class, String.class, Integer.class);
        JsonDeserializer<?> deser = factory.createMapDeserializer(ctxt(), mapType, null);
        assertNotNull(deser);
    }

    @Test
    public void testCreateTreeDeserializerReturnsNodeDeserializer() throws Exception {
        JsonDeserializer<?> deser = factory.createTreeDeserializer(deserConfig,
                typeFactory.constructType(ObjectNode.class), null);
        assertNotNull(deser);
    }

    @Test
    public void testCreateEnumDeserializer() throws Exception {
        JavaType enumType = typeFactory.constructType(TimeUnit.class);
        BeanDescription beanDesc = deserConfig.introspect(enumType);
        JsonDeserializer<?> deser = factory.createEnumDeserializer(ctxt(), enumType, beanDesc);
        assertNotNull(deser);
    }

    @Test
    public void testCreateKeyDeserializerForStringBasedType() throws Exception {
        KeyDeserializer deser = factory.createKeyDeserializer(ctxt(),
                typeFactory.constructType(UUID.class));
        assertNotNull(deser);
    }

    @Test
    public void testMapAbstractCollectionTypeUsesFallback() {
        CollectionType listType = typeFactory.constructCollectionType(List.class, String.class);
        CollectionType result = factory._mapAbstractCollectionType(listType, deserConfig);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testFindTypeDeserializerWithoutTypeInfoReturnsNull() throws Exception {
        assertNull(factory.findTypeDeserializer(deserConfig,
                typeFactory.constructType(String.class)));
    }

    @Test
    public void testValueInstantiatorInstanceNullDefinitionReturnsNull() throws Exception {
        assertNull(factory._valueInstantiatorInstance(deserConfig, null, null));
    }

    @Test
    public void testValueInstantiatorInstanceRejectsNonDescriptor() throws Exception {
        try {
            factory._valueInstantiatorInstance(deserConfig, null, "not-a-definition");
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("expected type KeyDeserializer"));
        }
    }

    private DeserializationContext ctxt() {
        return new DefaultDeserializationContext.Impl(deserConfig);
    }

    @SuppressWarnings("serial")
    static class TestableBasicDeserializerFactory extends BasicDeserializerFactory {
        TestableBasicDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected DeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestableBasicDeserializerFactory(config);
        }
    }
}