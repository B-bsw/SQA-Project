package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.*;

public class BeanDeserializerBaseTest {

    private BeanDeserializerBase deserializer;
    private BeanDeserializerBase deserializerWithViews;
    private BeanDeserializerBase deserializerWithIgnorables;
    private BeanDeserializerBase deserializerWithCreatorProps;

    @Before
    public void setUp() throws Exception {
        // Minimal stub for BeanDeserializerBuilder
        BeanDeserializerBuilder builder = new BeanDeserializerBuilder(null, null) {
            @Override
            public ValueInstantiator getValueInstantiator() {
                return new ValueInstantiator.Base() {
                    @Override
                    public boolean canCreateUsingDefault() { return true; }
                    @Override
                    public boolean canCreateFromObjectWith() { return false; }
                    @Override
                    public boolean canCreateUsingDelegate() { return false; }
                    @Override
                    public JavaType getDelegateType(DeserializationConfig config) { return null; }
                    @Override
                    public JavaType getArrayDelegateType(DeserializationConfig config) { return null; }
                    @Override
                    public AnnotatedWithParams getDelegateCreator() { return null; }
                    @Override
                    public AnnotatedWithParams getArrayDelegateCreator() { return null; }
                };
            }
            @Override
            public SettableAnyProperty getAnySetter() { return null; }
            @Override
            public List<ValueInjector> getInjectables() { return null; }
            @Override
            public ObjectIdReader getObjectIdReader() { return null; }
        };

        JavaType beanType = TypeFactory.defaultInstance().constructType(Object.class);
        BeanDescription beanDesc = new BasicBeanDescription(null, beanType, null, null) {
            @Override
            public AnnotatedClass getClassInfo() {
                return new AnnotatedClass(null, null, null, null) {
                    @Override
                    public Annotations getAnnotations() { return new Annotations() {
                        @Override
                        public <A extends java.lang.annotation.Annotation> A get(Class<A> cls) { return null; }
                        @Override
                        public boolean has(Class<?> cls) { return false; }
                        @Override
                        public int size() { return 0; }
                    }; }
                };
            }
            @Override
            public JavaType getType() { return beanType; }
            @Override
            public JsonFormat.Value findExpectedFormat(AnnotatedMember member) { return null; }
        };
        BeanPropertyMap emptyProps = BeanPropertyMap.empty();
        Map<String, SettableBeanProperty> emptyBackRefs = Collections.emptyMap();
        Set<String> emptyIgnorables = Collections.emptySet();
        deserializer = new BeanDeserializerBase(builder, beanDesc, emptyProps, emptyBackRefs, emptyIgnorables, false, false) {
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };

        // copy constructor for views
        deserializerWithViews = new BeanDeserializerBase(deserializer, false) {
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };

        // constructor with ignorable props (testing withoutProperties)
        Set<String> ignorables = new HashSet<>(Arrays.asList("ignoredProp"));
        deserializerWithIgnorables = new BeanDeserializerBase(deserializer, ignorables) {
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };

        // construct instance with some creator properties (simulated via _propertyBasedCreator)
        deserializerWithCreatorProps = new BeanDeserializerBase(builder, beanDesc, emptyProps, emptyBackRefs, emptyIgnorables, false, false) {
            {
                _propertyBasedCreator = PropertyBasedCreator.construct(null, null, new SettableBeanProperty[0]);
            }
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };
    }

    @Test
    public void testIsCachable() {
        assertTrue(deserializer.isCachable());
    }

    @Test
    public void testHandledType() {
        assertEquals(Object.class, deserializer.handledType());
    }

    @Test
    public void testHasPropertyNotFound() {
        assertFalse(deserializer.hasProperty("nonexistent"));
    }

    @Test
    public void testHasViewsDefaultFalse() {
        assertFalse(deserializer.hasViews());
    }

    @Test
    public void testHasViewsTrue() {
        assertTrue(deserializerWithViews.hasViews());
    }

    @Test
    public void testGetPropertyCountEmpty() {
        assertEquals(0, deserializer.getPropertyCount());
    }

    @Test
    public void testGetKnownPropertyNamesEmpty() {
        Collection<Object> names = deserializer.getKnownPropertyNames();
        assertNotNull(names);
        assertTrue(names.isEmpty());
    }

    @Test
    public void testPropertiesThrowsIfUnresolved() {
        BeanDeserializerBase unresolved = new BeanDeserializerBase(deserializer, false) {
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            {
                // set _beanProperties to null to cause IllegalStateException
                try {
                    java.lang.reflect.Field f = BeanDeserializerBase.class.getDeclaredField("_beanProperties");
                    f.setAccessible(true);
                    f.set(this, null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        try {
            unresolved.properties();
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testPropertiesNormal() {
        Iterator<SettableBeanProperty> it = deserializer.properties();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testCreatorPropertiesNull() {
        Iterator<SettableBeanProperty> it = deserializer.creatorProperties();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testCreatorPropertiesPresent() {
        Iterator<SettableBeanProperty> it = deserializerWithCreatorProps.creatorProperties();
        assertNotNull(it);
        // empty array passed, but PropertyBasedCreator may still have no properties
    }

    @Test
    public void testFindPropertyStringNotFound() {
        assertNull(deserializer.findProperty("notThere"));
    }

    @Test
    public void testFindPropertyPropertyNameNotFound() {
        PropertyName pn = new PropertyName("notThere");
        assertNull(deserializer.findProperty(pn));
    }

    @Test
    public void testFindPropertyIntNotFound() {
        assertNull(deserializer.findProperty(42));
    }

    @Test
    public void testFindBackReferenceNullBackRefs() {
        assertNull(deserializer.findBackReference("any"));
    }

    @Test
    public void testFindBackReferenceInMap() {
        Map<String, SettableBeanProperty> backRefs = new HashMap<>();
        backRefs.put("ref1", null); // value can be null for test
        BeanDeserializerBase withBackRefs = new BeanDeserializerBase(deserializer, false) {
            {
                try {
                    java.lang.reflect.Field f = BeanDeserializerBase.class.getDeclaredField("_backRefs");
                    f.setAccessible(true);
                    f.set(this, backRefs);
                } catch (Exception e) { throw new RuntimeException(e); }
            }
            @Override public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer unwrapper) { return null; }
            @Override public BeanDeserializerBase withObjectIdReader(ObjectIdReader oir) { return this; }
            @Override public BeanDeserializerBase withIgnorableProperties(Set<String> ignorableProps) { return this; }
            @Override public BeanDeserializerBase asArrayDeserializer() { return this; }
            @Override protected Object _deserializeUsingPropertyBased(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
            @Override public Object deserializeFromObject(JsonParser p, DeserializationContext ctxt) throws IOException { return null; }
        };
        assertNull(withBackRefs.findBackReference("ref1")); // map value is null
    }

    @Test
    public void testGetValueInstantiator() {
        assertNotNull(deserializer.getValueInstantiator());
    }

    @Test
    public void testGetObjectIdReaderNull() {
        assertNull(deserializer.getObjectIdReader());
    }

    @Test
    public void testVanillaProcessingTrue() {
        assertTrue(deserializer._vanillaProcessing);
    }

    @Test
    public void testWithObjectIdReader() {
        // create ObjectIdReader (simplified)
        JavaType idType = TypeFactory.defaultInstance().constructType(String.class);
        PropertyName propName = new PropertyName("id");
        ObjectIdGenerator<?> gen = new ObjectIdGenerators.PropertyGenerator(Object.class);
        JsonDeserializer<?> idDeser = null;
        SettableBeanProperty idProp = null;
        ObjectIdResolver resolver = null;
        ObjectIdReader oir = ObjectIdReader.construct(idType, propName, gen, idDeser, idProp, resolver);
        BeanDeserializerBase newDeser = deserializer.withObjectIdReader(oir);
        assertNotNull(newDeser);
        assertEquals(oir, newDeser.getObjectIdReader());
    }

    @Test
    public void testWithIgnorableProperties() {
        Set<String> ignorables = new HashSet<>(Arrays.asList("a", "b"));
        BeanDeserializerBase newDeser = deserializer.withIgnorableProperties(ignorables);
        assertNotNull(newDeser);
        // The _ignorableProps set should be the passed one
        // (can't access directly, but we can check that property count remains same)
        assertEquals(0, newDeser.getPropertyCount());
    }
}