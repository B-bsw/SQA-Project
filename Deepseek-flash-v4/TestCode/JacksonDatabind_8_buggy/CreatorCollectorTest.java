package com.fasterxml.jackson.databind.deser.impl;

import static org.junit.Assert.*;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class CreatorCollectorTest {

    private ObjectMapper mapper;
    private DeserializationConfig config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getDeserializationConfig();
    }

    private BeanDescription beanDescription(Class<?> rawType) {
        JavaType type = mapper.getTypeFactory().constructType(rawType);
        return config.introspect(type);
    }

    private CreatorCollector collectorFor(Class<?> rawType) {
        return new CreatorCollector(beanDescription(rawType), false);
    }

    private static FakeAnnotatedWithParams fake(String name) {
        try {
            Method m = String.class.getMethod("toString");
            return new FakeAnnotatedWithParams(name, String.class, m, String.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testDefaultCreator() {
        CreatorCollector cc = new CreatorCollector(null, false);
        assertFalse(cc.hasDefaultCreator());

        FakeAnnotatedWithParams c = fake("default");
        cc.setDefaultCreator(c);
        assertTrue(cc.hasDefaultCreator());
        assertSame(c, cc._creators[0]);

        cc.setDefaultCreator(null);
        assertFalse(cc.hasDefaultCreator());
        assertNull(cc._creators[0]);
    }

    @Test
    public void testFixAccessWithCanFixAccessTrue() {
        CreatorCollector cc = new CreatorCollector(null, true);
        FakeAnnotatedWithParams c = fake("fixed");
        cc.setDefaultCreator(c);
        assertNotNull(cc._creators[0]);
    }

    @Test
    public void testAddCreatorsAndNonDefaultFlag() {
        CreatorCollector cc = new CreatorCollector(null, false);
        assertFalse(cc._hasNonDefaultCreator);

        FakeAnnotatedWithParams c = fake("c");
        cc.addStringCreator(c, true);
        cc.addIntCreator(c, true);
        cc.addLongCreator(c, true);
        cc.addDoubleCreator(c, true);
        cc.addBooleanCreator(c, true);

        assertTrue(cc._hasNonDefaultCreator);
        assertSame(c, cc._creators[1]);
        assertSame(c, cc._creators[2]);
        assertSame(c, cc._creators[3]);
        assertSame(c, cc._creators[4]);
        assertSame(c, cc._creators[5]);

        cc.addDelegatingCreator(c, true, null);
        assertSame(c, cc._creators[6]);
        assertNull(cc._delegateArgs);

        cc.addPropertyCreator(c, true, new CreatorProperty[0]);
        assertSame(c, cc._creators[7]);
        assertNotNull(cc._propertyBasedArgs);
        assertEquals(0, cc._propertyBasedArgs.length);
    }

    @Test
    public void testConflictingCreatorsRejected() {
        CreatorCollector cc = new CreatorCollector(null, false);
        FakeAnnotatedWithParams c1 = fake("old");
        FakeAnnotatedWithParams c2 = fake("new");

        cc.addStringCreator(c1, false);
        try {
            cc.addStringCreator(c2, false);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting String creators"));
        }
        assertSame(c1, cc._creators[1]);
    }

    @Test
    public void testExplicitCreatorNotReplacedByNonExplicit() {
        CreatorCollector cc = new CreatorCollector(null, false);
        FakeAnnotatedWithParams c1 = fake("explicit");
        FakeAnnotatedWithParams c2 = fake("nonExplicit");

        cc.addStringCreator(c1, true);
        cc.addStringCreator(c2, false);

        assertSame(c1, cc._creators[1]);
    }

    @Test
    public void testIncompleteParameter() {
        CreatorCollector cc = new CreatorCollector(null, false);
        assertNull(cc._incompleteParameter);
        cc.addIncompeteParameter(null);
        assertNull(cc._incompleteParameter);
        cc.addIncompeteParameter(null);
        assertNull(cc._incompleteParameter);
    }

    @Test
    public void testConstructValueInstantiatorVanilla() throws Exception {
        ValueInstantiator inst = collectorFor(ArrayList.class).constructValueInstantiator(config);
        assertTrue(inst.canInstantiate());
        assertTrue(inst.canCreateUsingDefault());
        assertTrue(inst.createUsingDefault(null) instanceof ArrayList);

        inst = collectorFor(LinkedHashMap.class).constructValueInstantiator(config);
        assertTrue(inst.createUsingDefault(null) instanceof LinkedHashMap);

        inst = collectorFor(HashMap.class).constructValueInstantiator(config);
        assertTrue(inst.createUsingDefault(null) instanceof HashMap);
    }

    @Test
    public void testConstructValueInstantiatorWithDefaultCreator() throws Exception {
        CreatorCollector cc = collectorFor(String.class);
        cc.setDefaultCreator(fake("default"));
        ValueInstantiator inst = cc.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateUsingDefault());
    }

    @Test
    public void testConstructValueInstantiatorWithStringCreator() throws Exception {
        CreatorCollector cc = collectorFor(String.class);
        cc.addStringCreator(fake("string"), true);
        ValueInstantiator inst = cc.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateFromString());
    }

    @Test
    public void testConstructValueInstantiatorWithDelegate() throws Exception {
        CreatorCollector cc = collectorFor(String.class);
        cc.addDelegatingCreator(fake("delegate"), true, null);
        ValueInstantiator inst = cc.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateUsingDelegate());
    }

    @Test
    public void testConstructValueInstantiatorWithPropertyCreator() throws Exception {
        CreatorCollector cc = collectorFor(String.class);
        cc.addPropertyCreator(fake("props"), true, new CreatorProperty[0]);
        ValueInstantiator inst = cc.constructValueInstantiator(config);
        assertNotNull(inst);
        assertTrue(inst.canCreateFromObjectWith());
    }

    @Test
    public void testConstructWithoutCreatorsOnNonVanillaType() throws Exception {
        CreatorCollector cc = collectorFor(String.class);
        ValueInstantiator inst = cc.constructValueInstantiator(config);
        assertNotNull(inst);
        assertFalse(inst.canCreateUsingDefault());
    }

    private static class FakeAnnotatedWithParams extends AnnotatedWithParams {
        private final String _name;
        private final Class<?> _rawType;
        private final Member _member;
        private final Type _genericParamType;

        FakeAnnotatedWithParams(String name, Class<?> rawType, Member member, Type genericParamType) {
            super(null, null);
            _name = name;
            _rawType = rawType;
            _member = member;
            _genericParamType = genericParamType;
        }

        @Override
        public <A extends java.lang.annotation.Annotation> A getAnnotation(Class<A> acls) {
            return null;
        }

        @Override
        public int getAnnotationCount() {
            return 0;
        }

        @Override
        public String getName() {
            return _name;
        }

        @Override
        public Class<?> getRawType() {
            return _rawType;
        }

        @Override
        public JavaType getType() {
            return TypeFactory.defaultInstance().constructType(_rawType);
        }

        @Override
        public AnnotatedElement getAnnotated() {
            return _member;
        }

        @Override
        public Member getMember() {
            return _member;
        }

        @Override
        public void setValue(Object target, Object value) {
        }

        @Override
        public Object getValue(Object target) {
            return null;
        }

        @Override
        public Class<?> getRawParameterType(int index) {
            return _rawType;
        }

        @Override
        public Type getGenericParameterType(int index) {
            return _genericParamType;
        }

        @Override
        public Object call() throws Exception {
            return null;
        }

        @Override
        public Object call(Object[] args) throws Exception {
            return null;
        }

        @Override
        public Object call1(Object arg) throws Exception {
            return null;
        }
    }
}