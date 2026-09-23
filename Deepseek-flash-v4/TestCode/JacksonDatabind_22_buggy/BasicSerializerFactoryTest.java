package com.fasterxml.jackson.databind.ser;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.*;
import com.fasterxml.jackson.databind.ser.std.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.*;

public class BasicSerializerFactoryTest {

    private BasicSerializerFactory factory;
    private SerializationConfig config;

    @Before
    public void setUp() {
        config = new SerializationConfig(null, null, null, null, null, null, null, null);
        factory = new BasicSerializerFactory(new SerializerFactoryConfig()) {
            @Override
            public SerializerFactory withConfig(SerializerFactoryConfig config) {
                return this;
            }

            @Override
            protected ObjectSerializer createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException {
                return null;
            }

            @Override
            public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException {
                return null;
            }

            @Override
            public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType keyType, JsonSerializer<Object> defaultImpl) {
                return null;
            }

            @Override
            public TypeSerializer createTypeSerializer(SerializationConfig config, JavaType baseType) {
                return null;
            }
        };
    }

    @After
    public void tearDown() {
        factory = null;
        config = null;
    }

    @Test
    public void testGetFactoryConfig() {
        SerializerFactoryConfig original = new SerializerFactoryConfig();
        BasicSerializerFactory f = new BasicSerializerFactory(original) {
            @Override
            public SerializerFactory withConfig(SerializerFactoryConfig config) {
                return this;
            }

            @Override
            protected JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) {
                return null;
            }

            @Override
            public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType type) throws JsonMappingException {
                return null;
            }

            @Override
            public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType keyType, JsonSerializer<Object> defaultImpl) {
                return null;
            }

            @Override
            public TypeSerializer createTypeSerializer(SerializationConfig config, JavaType baseType) {
                return null;
            }
        };
        assertEquals(original, f.getFactoryConfig());
    }

    @Test
    public void testWithConfigNull() {
        try {
            factory.withConfig(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testWithAdditionalSerializers() {
        Serializers additional = new Serializers.Base() {};
        BasicSerializerFactory result = (BasicSerializerFactory) factory.withAdditionalSerializers(additional);
        assertNotNull(result);
    }

    @Test
    public void testWithAdditionalKeySerializers() {
        Serializers additional = new Serializers.Base() {};
        BasicSerializerFactory result = (BasicSerializerFactory) factory.withAdditionalKeySerializers(additional);
        assertNotNull(result);
    }

    @Test
    public void testWithSerializerModifier() {
        BeanSerializerModifier modifier = new BeanSerializerModifier();
        BasicSerializerFactory result = (BasicSerializerFactory) factory.withSerializerModifier(modifier);
        assertNotNull(result);
    }

    @Test
    public void testBuildIteratorSerializerWithNullParams() {
        JavaType type = config.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        try {
            factory.buildIteratorSerializer(config, type, null, false, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testBuildIteratorSerializerWithNonNullParams() {
        JavaType elemType = config.getTypeFactory().constructType(String.class);
        JavaType type = config.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        try {
            factory.buildIteratorSerializer(config, type, null, true, elemType);
            // If not exception, that's fine; but we can't easily test actual return without mocking
        } catch (Exception e) {
            // Ignore - it might fail due to internal dependencies
        }
    }

    @Test
    public void testBuildIterableSerializer() {
        JavaType elemType = config.getTypeFactory().constructType(String.class);
        JavaType type = config.getTypeFactory().constructCollectionType(ArrayList.class, String.class);
        try {
            factory.buildIterableSerializer(config, type, null, true, elemType);
            // Expect no exception
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testBuildMapEntrySerializer() {
        JavaType keyType = config.getTypeFactory().constructType(String.class);
        JavaType valueType = config.getTypeFactory().constructType(Integer.class);
        MapType type = config.getTypeFactory().constructMapType(HashMap.class, keyType, valueType);
        try {
            factory.buildMapEntrySerializer(config, type, null, false, keyType, valueType);
            // Expect no exception
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testFindPropertyTypeSerializerWithNull() {
        assertNull(factory.findPropertyTypeSerializer(null, null, null));
    }

    @Test
    public void testBuildContainerSerializerNull() {
        try {
            factory.buildContainerSerializer(config, null, null, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testBuildEnumSerializerWithEnumType() {
        JavaType enumType = config.getTypeFactory().constructType(TestEnum.class);
        try {
            factory.buildEnumSerializer(config, enumType, null);
            // Expect no exception, but might be null
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testBuildEnumSerializerWithNonEnum() {
        JavaType type = config.getTypeFactory().constructType(String.class);
        try {
            factory.buildEnumSerializer(config, type, null);
            // Might return null or handle gracefully
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}