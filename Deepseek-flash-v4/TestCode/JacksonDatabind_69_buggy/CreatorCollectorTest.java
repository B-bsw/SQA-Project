package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BeanDescription;

import org.junit.Before;
import org.junit.Test;

public class CreatorCollectorTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
    }

    public static class DefaultBean {
        public DefaultBean() { }
    }

    public static class StringBean {
        public StringBean(String value) { }
    }

    public static class DelegateBean {
        public DelegateBean(Boolean value) { }
    }

    public static class CollectionDelegateBean {
        public CollectionDelegateBean(List<String> value) { }
    }

    public static class PropertiesBean {
        public PropertiesBean(String a, String b) { }
    }

    @Test
    public void testDefaultCreatorAndConstructInstantiator() {
        BeanDescription desc = introspect(DefaultBean.class);
        AnnotatedConstructor ctor = constructor(desc);

        CreatorCollector collector = new CreatorCollector(desc, config);
        assertFalse(collector.hasDefaultCreator());

        collector.setDefaultCreator(ctor);
        assertTrue(collector.hasDefaultCreator());

        ValueInstantiator inst = collector.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testStringCreator() {
        BeanDescription desc = introspect(StringBean.class);
        AnnotatedConstructor ctor = constructor(desc, String.class);

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addStringCreator(ctor, true);

        ValueInstantiator inst = collector.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateFromString());
    }

    @Test
    public void testDelegatingCreatorUsesDelegateSlot() throws Exception {
        BeanDescription desc = introspect(DelegateBean.class);
        AnnotatedConstructor ctor = constructor(desc, Boolean.class);

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addDelegatingCreator(ctor, true, null);

        assertTrue(collector.hasDelegatingCreator());
        assertNotNull(getCreator(collector, 6));
        assertNull(getCreator(collector, 8));
    }

    @Test
    public void testCollectionDelegatingCreatorUsesArrayDelegateSlot() throws Exception {
        BeanDescription desc = introspect(CollectionDelegateBean.class);
        AnnotatedConstructor ctor = constructor(desc, List.class);

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addDelegatingCreator(ctor, true, null);

        assertFalse(collector.hasDelegatingCreator());
        assertNull(getCreator(collector, 6));
        assertNotNull(getCreator(collector, 8));
    }

    @Test
    public void testPropertyCreatorWithEmptyProperties() {
        BeanDescription desc = introspect(PropertiesBean.class);
        AnnotatedConstructor ctor = constructor(desc, String.class, String.class);

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addPropertyCreator(ctor, true, new SettableBeanProperty[0]);

        assertTrue(collector.hasPropertyBasedCreator());
        assertNotNull(collector.constructValueInstantiator(config));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConflictingStringCreatorsRejected() {
        BeanDescription desc = introspect(StringBean.class);
        AnnotatedConstructor ctor = constructor(desc, String.class);

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addStringCreator(ctor, true);
        collector.addStringCreator(ctor, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDuplicatePropertyCreatorRejected() {
        BeanDescription desc = introspect(PropertiesBean.class);
        AnnotatedConstructor ctor = constructor(desc, String.class, String.class);

        SettableBeanProperty[] props = new SettableBeanProperty[] {
                property("dup", ctor, 0),
                property("dup", ctor, 1)
        };

        CreatorCollector collector = new CreatorCollector(desc, config);
        collector.addPropertyCreator(ctor, true, props);
    }

    @Test
    public void testVanillaInstantiatorForArrayList() {
        BeanDescription desc = introspect(ArrayList.class);
        CreatorCollector collector = new CreatorCollector(desc, config);

        ValueInstantiator inst = collector.constructValueInstantiator(config);
        assertNotNull(inst);
        assertEquals(ArrayList.class.getName(), inst.getValueTypeDesc());
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
        assertTrue(inst.createUsingDefault(null) instanceof ArrayList);
    }

    @Test
    public void testNullCreatorsAcceptedWithoutError() {
        BeanDescription desc = introspect(DefaultBean.class);
        CreatorCollector collector = new CreatorCollector(desc, config);

        collector.setDefaultCreator(null);
        collector.addStringCreator(null, true);

        assertFalse(collector.hasDefaultCreator());
        assertFalse(collector.hasDelegatingCreator());
        assertFalse(collector.hasPropertyBasedCreator());
        assertNotNull(collector.constructValueInstantiator(config));
    }

    private BeanDescription introspect(Class<?> cls) {
        JavaType type = mapper.getTypeFactory().constructType(cls);
        return config.introspect(type);
    }

    private AnnotatedConstructor constructor(BeanDescription desc, Class<?>... paramTypes) {
        for (AnnotatedConstructor ctor : desc.getClassInfo().getConstructors()) {
            if (ctor.getParameterCount() != paramTypes.length) {
                continue;
            }
            boolean match = true;
            for (int i = 0; i < paramTypes.length; i++) {
                if (!ctor.getRawParameterType(i).equals(paramTypes[i])) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return ctor;
            }
        }
        fail("Constructor not found: " + Arrays.toString(paramTypes));
        return null;
    }

    private SettableBeanProperty property(String name, AnnotatedConstructor ctor, int index) {
        AnnotatedParameter parameter = ctor.getParameter(index);
        return new CreatorProperty(PropertyName.construct(name), ctor.getParameterType(index),
                null, null, null, parameter, index, null);
    }

    private AnnotatedWithParams getCreator(CreatorCollector collector, int index) throws Exception {
        Field field = CreatorCollector.class.getDeclaredField("_creators");
        field.setAccessible(true);
        AnnotatedWithParams[] creators = (AnnotatedWithParams[]) field.get(collector);
        return creators[index];
    }
}