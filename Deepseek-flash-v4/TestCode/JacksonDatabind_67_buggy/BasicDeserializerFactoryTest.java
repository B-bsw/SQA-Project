package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class BasicDeserializerFactoryTest {

    private static class TestableBasicDeserializerFactory extends BasicDeserializerFactory {
        TestableBasicDeserializerFactory(DeserializerFactoryConfig config) {
            super(config);
        }

        @Override
        protected TestableBasicDeserializerFactory withConfig(DeserializerFactoryConfig config) {
            return new TestableBasicDeserializerFactory(config);
        }

        public CollectionType mapAbstractCollectionTypePublic(JavaType type, DeserializationConfig config) {
            return _mapAbstractCollectionType(type, config);
        }

        public JavaType findRemappedTypePublic(DeserializationConfig config, Class<?> rawType)
                throws JsonMappingException {
            return _findRemappedType(config, rawType);
        }

        public TypeDeserializer findTypeDeserializerPublic(DeserializationConfig config, JavaType baseType)
                throws JsonMappingException {
            return findTypeDeserializer(config, baseType);
        }

        public JsonDeserializer<?> findCustomEnumDeserializerPublic(Class<?> type,
                DeserializationConfig config, BeanDescription beanDesc) throws JsonMappingException {
            return _findCustomEnumDeserializer(type, config, beanDesc);
        }
    }

    private static class MappingResolver extends AbstractTypeResolver {
        private final Class<?> from;
        private final Class<?> to;

        MappingResolver(Class<?> from, Class<?> to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public JavaType findTypeMapping(DeserializationConfig config, JavaType type) {
            if (type.getRawClass() == from) {
                return TypeFactory.defaultInstance().constructType(to);
            }
            return null;
        }
    }

    private static Deserializers noopDeserializers() {
        return new Deserializers.Base() { };
    }

    private static KeyDeserializers noopKeyDeserializers() {
        return new KeyDeserializers() {
            @Override
            public KeyDeserializer findKeyDeserializer(JavaType type, DeserializationConfig config,
                    BeanDescription beanDesc) throws JsonMappingException {
                return null;
            }
        };
    }

    private static ValueInstantiators noopValueInstantiators() {
        return new ValueInstantiators() {
            @Override
            public ValueInstantiator findValueInstantiator(DeserializationConfig config,
                    BeanDescription beanDesc, ValueInstantiator defaultInstantiator) {
                return defaultInstantiator;
            }
        };
    }

    private TestableBasicDeserializerFactory newFactory() {
        return new TestableBasicDeserializerFactory(new DeserializerFactoryConfig());
    }

    private void assertChanged(BasicDeserializerFactory original, DeserializerFactory changed) {
        assertNotNull(changed);
        assertNotSame(original, changed);
        assertTrue(changed instanceof TestableBasicDeserializerFactory);
        assertNotSame(original.getFactoryConfig(),
                ((TestableBasicDeserializerFactory) changed).getFactoryConfig());
    }

    @Test
    public void testGetFactoryConfig() {
        DeserializerFactoryConfig cfg = new DeserializerFactoryConfig();
        TestableBasicDeserializerFactory factory = new TestableBasicDeserializerFactory(cfg);
        assertSame(cfg, factory.getFactoryConfig());
    }

    @Test
    public void testWithMethodsReturnNewFactoryAndConfig() {
        TestableBasicDeserializerFactory factory = newFactory();
        assertChanged(factory, factory.withAdditionalDeserializers(noopDeserializers()));
        assertChanged(factory, factory.withAdditionalKeyDeserializers(noopKeyDeserializers()));
        assertChanged(factory, factory.withDeserializerModifier(new BeanDeserializerModifier() { }));
        assertChanged(factory, factory.withAbstractTypeResolver(
                new MappingResolver(CharSequence.class, String.class)));
        assertChanged(factory, factory.withValueInstantiators(noopValueInstantiators()));
    }

    @Test
    public void testMapAbstractTypeUsesResolver() throws Exception {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        TestableBasicDeserializerFactory factory = new TestableBasicDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(
                        new MappingResolver(List.class, ArrayList.class)));
        JavaType result = factory.mapAbstractType(config,
                TypeFactory.defaultInstance().constructType(List.class));
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMapAbstractTypeRejectsNonSubtype() throws Exception {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        TestableBasicDeserializerFactory factory = new TestableBasicDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(
                        new MappingResolver(String.class, Integer.class)));
        factory.mapAbstractType(config,
                TypeFactory.defaultInstance().constructType(String.class));
    }

    @Test
    public void testMapAbstractCollectionType() {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        TestableBasicDeserializerFactory factory = newFactory();
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        CollectionType mapped = factory.mapAbstractCollectionTypePublic(
                TypeFactory.defaultInstance().constructCollectionType(Collection.class, stringType),
                config);
        assertEquals(ArrayList.class, mapped.getRawClass());
        assertNull(factory.mapAbstractCollectionTypePublic(
                TypeFactory.defaultInstance().constructType(ArrayList.class), config));
    }

    @Test
    public void testFindRemappedType() throws Exception {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        TestableBasicDeserializerFactory factory = new TestableBasicDeserializerFactory(
                new DeserializerFactoryConfig().withAbstractTypeResolver(
                        new MappingResolver(List.class, ArrayList.class)));
        JavaType remapped = factory.findRemappedTypePublic(config, List.class);
        assertNotNull(remapped);
        assertEquals(ArrayList.class, remapped.getRawClass());
        assertNull(newFactory().findRemappedTypePublic(config, List.class));
    }

    @Test
    public void testFindTypeDeserializerDefaultNoResolver() throws Exception {
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        assertNull(newFactory().findTypeDeserializerPublic(config,
                TypeFactory.defaultInstance().constructType(String.class)));
    }

    @Test
    public void testFindCustomEnumDeserializerUsesCustom() throws Exception {
        final JsonDeserializer<Object> fake = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return null;
            }
        };
        Deserializers custom = new Deserializers.Base() {
            @Override
            public JsonDeserializer<?> findEnumDeserializer(Class<?> type,
                    DeserializationConfig config, BeanDescription beanDesc)
                    throws JsonMappingException {
                return fake;
            }
        };
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig();
        TestableBasicDeserializerFactory factory = new TestableBasicDeserializerFactory(
                new DeserializerFactoryConfig().withAdditionalDeserializers(custom));
        assertSame(fake, factory.findCustomEnumDeserializerPublic(TestEnum.class, config, null));
    }

    @Test
    public void testFallbackMapsContainDefaults() {
        assertEquals(LinkedHashMap.class,
                BasicDeserializerFactory._mapFallbacks.get(Map.class.getName()));
        assertEquals(ConcurrentHashMap.class,
                BasicDeserializerFactory._mapFallbacks.get(ConcurrentMap.class.getName()));
        assertEquals(TreeMap.class,
                BasicDeserializerFactory._mapFallbacks.get(SortedMap.class.getName()));
        assertEquals(ArrayList.class,
                BasicDeserializerFactory._collectionFallbacks.get(Collection.class.getName()));
        assertEquals(HashSet.class,
                BasicDeserializerFactory._collectionFallbacks.get(Set.class.getName()));
        assertEquals(LinkedList.class,
                BasicDeserializerFactory._collectionFallbacks.get(Queue.class.getName()));
    }

    private enum TestEnum {
        A
    }
}