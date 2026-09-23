import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.core.*;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FieldPropertyTest {
    private FieldProperty fieldProperty;
    private AnnotatedField annotatedField;
    private JavaType javaType;
    private TypeDeserializer typeDeserializer;
    private Annotations annotations;
    private DeserializationContext ctxt;
    private JsonParser parser;
    private Object instance;
    private Object value;

    @Before
    public void setUp() throws Exception {
        // Setup with a concrete class that has a field
        instance = new TestClass();
        Field field = TestClass.class.getDeclaredField("name");
        annotatedField = new AnnotatedField(null, field, null);
        javaType = TypeFactory.defaultInstance().constructType(String.class);
        typeDeserializer = null;
        annotations = new Annotations() {
            @Override
            public <A extends Annotation> A get(Class<A> cls) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
        ctxt = new DeserializationContext(DeserializationContext.Factory);
        parser = new JsonParser();
        value = "test";
        fieldProperty = new FieldProperty(
                new BeanPropertyDefinition(null, null, null, null) {
                    @Override
                    public String getName() {
                        return "name";
                    }
                },
                javaType,
                typeDeserializer,
                annotations,
                annotatedField
        );
    }

    @Test
    public void testWithNameReturnsNewInstance() {
        PropertyName newName = new PropertyName("newName");
        SettableBeanProperty result = fieldProperty.withName(newName);
        assertNotNull(result);
        assertNotSame(fieldProperty, result);
    }

    @Test
    public void testWithValueDeserializerSameDeserializer() {
        JsonDeserializer<?> deserializer = fieldProperty._valueDeserializer;
        assertEquals(fieldProperty, fieldProperty.withValueDeserializer(deserializer));
    }

    @Test
    public void testWithValueDeserializerDifferentDeserializer() {
        JsonDeserializer<?> deserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "test";
            }
        };
        SettableBeanProperty result = fieldProperty.withValueDeserializer(deserializer);
        assertNotNull(result);
        assertNotSame(fieldProperty, result);
    }

    @Test
    public void testWithNullProvider() {
        NullValueProvider provider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return null;
            }
        };
        SettableBeanProperty result = fieldProperty.withNullProvider(provider);
        assertNotNull(result);
        assertNotSame(fieldProperty, result);
    }

    @Test
    public void testFixAccess() {
        // Just verify no exception is thrown
        DeserializationConfig config = new DeserializationConfig(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS);
        fieldProperty.fixAccess(config);
    }

    @Test
    public void testGetAnnotation() {
        assertNull(fieldProperty.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetMember() {
        AnnotatedMember member = fieldProperty.getMember();
        assertNotNull(member);
    }

    @Test
    public void testDeserializeAndSetVALUE_NULL_SkipNullsFalse() throws IOException {
        // Set up skipNulls false (default is false if nullProvider is not skipper)
        fieldProperty._skipNulls = false;
        parser.setCurrentToken(JsonToken.VALUE_NULL);
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        // Since value is null and skipNulls is false, value = _nullProvider.getNullValue(ctxt);
        // _nullProvider defaults to something, check if field is set to null
        assertEquals(null, ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetVALUE_NULL_SkipNullsTrue() throws IOException {
        fieldProperty._skipNulls = true;
        parser.setCurrentToken(JsonToken.VALUE_NULL);
        Object result = fieldProperty.deserializeSetAndReturn(parser, ctxt, instance);
        assertEquals(instance, result);
        assertEquals(null, ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetNonNullNoTypeDeserializer() throws IOException {
        fieldProperty._skipNulls = false;
        parser.setCurrentToken(JsonToken.VALUE_STRING);
        // Configure value deserializer to return a value
        fieldProperty._valueDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "testValue";
            }
        };
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        assertEquals("testValue", ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetNonNullWithTypeDeserializer() throws IOException {
        fieldProperty._valueTypeDeserializer = new TypeDeserializer() {
            @Override
            public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "typed";
            }

            @Override
            public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "typed";
            }

            @Override
            public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "typed";
            }

            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "typed";
            }

            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return this;
            }

            @Override
            public JavaType getTypeIdResolver(DeserializationContext ctxt) {
                return null;
            }

            @Override
            public JavaType getTypeIdResolver() {
                return null;
            }
        };
        parser.setCurrentToken(JsonToken.START_OBJECT);
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        assertEquals("typed", ((TestClass) instance).name);
    }

    @Test
    public void testSetAndReturn() throws IOException {
        Object result = fieldProperty.setAndReturn(instance, "newValue");
        assertEquals(instance, result);
        assertEquals("newValue", ((TestClass) instance).name);
    }

    @Test
    public void testSetAndReturnException() {
        // Make field not accessible or final
        instance = new TestClassPrivate();
        Field field = TestClassPrivate.class.getDeclaredFields()[0];
        annotatedField = new AnnotatedField(null, field, null);
        fieldProperty = new FieldProperty(
                new BeanPropertyDefinition(null, null, null, null) {
                    @Override
                    public String getName() {
                        return "privateField";
                    }
                },
                javaType,
                typeDeserializer,
                annotations,
                annotatedField
        );
        try {
            fieldProperty.setAndReturn(instance, "value");
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeAndSetException() throws IOException {
        // Make field not accessible
        instance = new TestClassPrivate();
        Field field = TestClassPrivate.class.getDeclaredFields()[0];
        annotatedField = new AnnotatedField(null, field, null);
        fieldProperty = new FieldProperty(
                new BeanPropertyDefinition(null, null, null, null) {
                    @Override
                    public String getName() {
                        return "privateField";
                    }
                },
                javaType,
                typeDeserializer,
                annotations,
                annotatedField
        );
        parser.setCurrentToken(JsonToken.VALUE_STRING);
        fieldProperty._valueDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return "testValue";
            }
        };
        try {
            fieldProperty.deserializeAndSet(parser, ctxt, instance);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithMissingField() {
        AnnotatedField nullAnnotated = new AnnotatedField(null, null, null);
        try {
            FieldProperty fp = new FieldProperty(
                    new BeanPropertyDefinition(null, null, null, null) {
                        @Override
                        public String getName() {
                            return "missing";
                        }
                    },
                    javaType,
                    typeDeserializer,
                    annotations,
                    nullAnnotated
            );
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReadResolveWithMissingField() {
        AnnotatedField nullAnnotated = new AnnotatedField(null, null, null);
        FieldProperty src = new FieldProperty(
                new BeanPropertyDefinition(null, null, null, null) {
                    @Override
                    public String getName() {
                        return "missing";
                    }
                },
                javaType,
                typeDeserializer,
                annotations,
                nullAnnotated
        );
        try {
            src.readResolve();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testDeserializeAndSetWithNullValueFromDeserializerSkipNulls() throws IOException {
        fieldProperty._skipNulls = true;
        parser.setCurrentToken(JsonToken.VALUE_STRING);
        fieldProperty._valueDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }
        };
        Object result = fieldProperty.deserializeSetAndReturn(parser, ctxt, instance);
        assertEquals(instance, result);
        assertEquals(null, ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetWithNullValueFromDeserializerNotSkip() throws IOException {
        fieldProperty._skipNulls = false;
        parser.setCurrentToken(JsonToken.VALUE_STRING);
        fieldProperty._valueDeserializer = new JsonDeserializer<String>() {
            @Override
            public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }
        };
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        // _nullProvider.getNullValue(ctxt) is called, which likely returns null
        assertEquals(null, ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetWithNullProvider() throws IOException {
        fieldProperty._skipNulls = false;
        parser.setCurrentToken(JsonToken.VALUE_NULL);
        fieldProperty._nullProvider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "nullValue";
            }
        };
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        assertEquals("nullValue", ((TestClass) instance).name);
    }

    @Test
    public void testDeserializeAndSetWithTypeDeserializerNullValue() throws IOException {
        fieldProperty._valueTypeDeserializer = new TypeDeserializer() {
            @Override
            public Object deserializeTypedFromObject(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserializeTypedFromArray(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserializeTypedFromScalar(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public Object deserializeTypedFromAny(JsonParser jp, DeserializationContext ctxt) throws IOException {
                return null;
            }

            @Override
            public TypeDeserializer forProperty(BeanProperty prop) {
                return this;
            }

            @Override
            public JavaType getTypeIdResolver(DeserializationContext ctxt) {
                return null;
            }

            @Override
            public JavaType getTypeIdResolver() {
                return null;
            }
        };
        parser.setCurrentToken(JsonToken.START_OBJECT);
        fieldProperty.deserializeAndSet(parser, ctxt, instance);
        // value is null, so if skipNulls is false, it falls through to _nullProvider
        // but _skipNulls is false by default, so value = _nullProvider.getNullValue(ctxt) is called
        // which returns null by default, so field set to null
        assertEquals(null, ((TestClass) instance).name);
    }

    // Test helper classes
    private static class TestClass {
        public String name;
    }

    private static class TestClassPrivate {
        private String privateField;
    }
}