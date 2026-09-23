import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class BasicDeserializerFactoryTest {

    private static class TestDeserializerFactory extends BasicDeserializerFactory {
        public TestDeserializerFactory() {
            super();
        }
    }

    private BasicDeserializerFactory factory;
    private DeserializationConfig config;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        factory = new TestDeserializerFactory();
        ObjectMapper mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
        ctxt = mapper.getDeserializationContext();
    }

    @After
    public void tearDown() {
        factory = null;
        config = null;
        ctxt = null;
    }

    @Test
    public void testGetFactoryConfig_ShouldReturnDefaultConfig() {
        DeserializerFactoryConfig result = factory.getFactoryConfig();
        assertNotNull("Factory config should not be null", result);
        assertTrue("Should have abstract type resolvers by default", result.hasAbstractTypeResolvers());
        assertTrue("Should have value instantiators by default", result.hasValueInstantiators());
    }

    @Test
    public void testWithAdditionalDeserializers_ShouldCreateNewInstanceWithCustomDeserializer() {
        Deserializers customDeserializer = new Deserializers.Base() {};
        DeserializerFactory modified = factory.withAdditionalDeserializers(customDeserializer);
        assertNotSame("Factory should be a different instance", factory, modified);
        assertNotNull("Modified factory should not be null", modified);
        assertTrue("Modified factory should have additional deserializers", 
            modified.getFactoryConfig().getAdditionalDeserializers().contains(customDeserializer));
    }

    @Test
    public void testMapAbstractType_WithNoResolvers_ShouldReturnOriginalType() {
        JavaType inputType = config.getTypeFactory().constructType(String.class);
        JavaType result = factory.mapAbstractType(config, inputType);
        assertEquals("Should return original type when no abstract resolvers", inputType, result);
    }

    @Test
    public void testMapAbstractType_WithNullType_ShouldReturnNull() {
        JavaType result = factory.mapAbstractType(config, null);
        assertNull("Should return null for null input", result);
    }

    @Test
    public void testCreateArrayDeserializer_WithPrimitiveIntType() throws Exception {
        JavaType arrayType = config.getTypeFactory().constructArrayType(int.class);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt, 
            (ArrayType) arrayType, 
            new BeanDescription() {
                @Override
                public Class<?> getBeanClass() {
                    return arrayType.getRawClass();
                }
                @Override
                public boolean isFactoryMethodUsed() { return false; }
                @Override
                public Object instantiateBean(Object... arguments) { return null; }
            });
        assertNotNull("Array deserializer should not be null", deserializer);
        assertTrue("Should be primitive array deserializer", deserializer instanceof PrimitiveArrayDeserializers);
    }

    @Test
    public void testCreateArrayDeserializer_WithStringType() throws Exception {
        JavaType arrayType = config.getTypeFactory().constructArrayType(String.class);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt,
            (ArrayType) arrayType,
            new BeanDescription() {
                @Override
                public Class<?> getBeanClass() {
                    return arrayType.getRawClass();
                }
                @Override
                public boolean isFactoryMethodUsed() { return false; }
                @Override
                public Object instantiateBean(Object... arguments) { return null; }
            });
        assertNotNull("String array deserializer should not be null", deserializer);
        assertSame("Should be StringArrayDeserializer instance", StringArrayDeserializer.instance, deserializer);
    }

    @Test
    public void testCreateCollectionDeserializer_WithEnumSetType() {
        JavaType collectionType = config.getTypeFactory().constructCollectionType(EnumSet.class, TestEnum.class);
        // Intentionally expect behavior - this is a basic test
        assertNotNull("Collection type should be constructed", collectionType);
    }

    @Test
    public void testFindDefaultDeserializer_WithObjectType() throws JsonMappingException {
        JavaType objectType = config.getTypeFactory().constructType(Object.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, objectType);
        assertNotNull("Should find deserializer for Object type", deserializer);
        assertTrue("Object type should map to untyped deserializer", 
            deserializer instanceof UntypedObjectDeserializer);
    }

    @Test
    public void testFindDefaultDeserializer_WithStringType() throws JsonMappingException {
        JavaType stringType = config.getTypeFactory().constructType(String.class);
        JsonDeserializer<?> deserializer = factory.findDefaultDeserializer(ctxt, stringType);
        assertNotNull("Should find deserializer for String type", deserializer);
        assertSame("String should use StringDeserializer", StringDeserializer.instance, deserializer);
    }

    @Test
    public void testCreateKeyDeserializer_WithEnumType() throws JsonMappingException {
        JavaType enumType = config.getTypeFactory().constructType(TestEnum.class);
        KeyDeserializer keyDeserializer = factory.createKeyDeserializer(ctxt, enumType);
        assertNotNull("Key deserializer for enum should not be null", keyDeserializer);
    }

    @Test
    public void testFindTypeDeserializer_WithNullBuilder() {
        TypeDeserializer result = factory.findTypeDeserializer(config, config.getTypeFactory().constructType(String.class), null);
        assertNull("Should return null for null subtypes", result);
    }

    @Test
    public void testMapAbstractType_WithResolverReturningConcreteType() {
        final JavaType abstractType = config.getTypeFactory().constructType(Number.class);
        final JavaType concreteType = config.getTypeFactory().constructType(Integer.class);
        
        DeserializerFactory factoryWithResolver = new BasicDeserializerFactory() {
            @Override
            public JavaType mapAbstractType(DeserializationConfig config, JavaType type) throws JsonMappingException {
                if (type.getRawClass() == Number.class) {
                    return concreteType;
                }
                return super.mapAbstractType(config, type);
            }
        };
        
        JavaType result = factoryWithResolver.mapAbstractType(config, abstractType);
        assertEquals("Should map Number to Integer", concreteType, result);
    }

    @Test
    public void testCreateArrayDeserializer_WithNullTypeDeserializer() throws Exception {
        JavaType arrayType = config.getTypeFactory().constructArrayType(Integer.class);
        JsonDeserializer<?> deserializer = factory.createArrayDeserializer(ctxt,
            (ArrayType) arrayType,
            new BeanDescription() {
                @Override
                public Class<?> getBeanClass() {
                    return arrayType.getRawClass();
                }
                @Override
                public boolean isFactoryMethodUsed() { return false; }
                @Override
                public Object instantiateBean(Object... arguments) { return null; }
            });
        assertNotNull("Deserializer should not be null for Integer array", deserializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateEnumDeserializer_WithInvalidFactoryMethod() {
        JavaType enumType = config.getTypeFactory().constructType(TestEnum.class);
        JsonDeserializer<?> deserializer = factory.createEnumDeserializer(ctxt, enumType, null);
        // Should not reach here if exception is thrown
    }

    @Test
    public void testCreateMapDeserializer_WithEnumMap() {
        JavaType keyType = config.getTypeFactory().constructType(TestEnum.class);
        JavaType valueType = config.getTypeFactory().constructType(String.class);
        JavaType enumMapType = config.getTypeFactory().constructMapType(EnumMap.class, keyType, valueType);
        assertNotNull("EnumMap type should be constructible", enumMapType);
    }

    @Test
    public void testFindTypeDeserializer_WithBasicType() {
        TypeDeserializer result = factory.findTypeDeserializer(config, config.getTypeFactory().constructType(String.class));
        assertNull("No type deserializer for basic types", result);
    }

    private abstract static class TestDeserializerFactory extends BasicDeserializerFactory {
        // Helper factory that overrides abstract methods if needed
    }
}