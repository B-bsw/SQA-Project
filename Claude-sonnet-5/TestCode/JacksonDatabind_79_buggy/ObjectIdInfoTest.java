package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import org.junit.Test;
import static org.junit.Assert.*;

public class ObjectIdInfoTest
{
    static class DummyGenerator extends ObjectIdGenerator<Object> {
        @Override
        public Class<?> getScope() { return Object.class; }
        @Override
        public boolean canUseFor(ObjectIdGenerator<?> gen) { return false; }
        @Override
        public ObjectIdGenerator<Object> forScope(Class<?> scope) { return this; }
        @Override
        public ObjectIdGenerator<Object> newForSerialization(Object context) { return this; }
        @Override
        public IdKey key(Object key) { return null; }
        @Override
        public Object generateId(Object forPojo) { return null; }
    }

    static class DummyResolver extends SimpleObjectIdResolver {
    }

    @Test
    public void testFourArgConstructor_normal()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, DummyGenerator.class, DummyResolver.class);

        assertEquals(name, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(DummyResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testFourArgConstructor_nullResolver_defaultsToSimple()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, DummyGenerator.class, null);

        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testThreeArgConstructor_PropertyName_deprecated()
    {
        PropertyName name = new PropertyName("myid");
        ObjectIdInfo info = new ObjectIdInfo(name, String.class, DummyGenerator.class);

        assertEquals(name, info.getPropertyName());
        assertEquals(String.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testStringConstructor_deprecated_normal()
    {
        ObjectIdInfo info = new ObjectIdInfo("stringId", Integer.class, DummyGenerator.class);

        assertEquals(new PropertyName("stringId"), info.getPropertyName());
        assertEquals(Integer.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testStringConstructor_deprecated_emptyString()
    {
        ObjectIdInfo info = new ObjectIdInfo("", Long.class, DummyGenerator.class);

        assertEquals(new PropertyName(""), info.getPropertyName());
        assertEquals(Long.class, info.getScope());
    }

    @Test
    public void testStringConstructor_deprecated_nullString()
    {
        ObjectIdInfo info = new ObjectIdInfo((String) null, Long.class, DummyGenerator.class);

        assertNotNull(info.getPropertyName());
        assertEquals(Long.class, info.getScope());
    }

    @Test
    public void testWithAlwaysAsId_sameState_returnsSameInstance()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, DummyGenerator.class, DummyResolver.class);

        ObjectIdInfo result = info.withAlwaysAsId(false);

        assertSame(info, result);
    }

    @Test
    public void testWithAlwaysAsId_differentState_returnsNewInstance()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, DummyGenerator.class, DummyResolver.class);

        ObjectIdInfo result = info.withAlwaysAsId(true);

        assertNotSame(info, result);
        assertTrue(result.getAlwaysAsId());
        assertEquals(name, result.getPropertyName());
        assertEquals(Object.class, result.getScope());
        assertEquals(DummyGenerator.class, result.getGeneratorType());
        assertEquals(DummyResolver.class, result.getResolverType());
    }

    @Test
    public void testWithAlwaysAsId_trueToFalse()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo base = new ObjectIdInfo(name, Object.class, DummyGenerator.class, DummyResolver.class);
        ObjectIdInfo trueInfo = base.withAlwaysAsId(true);

        ObjectIdInfo falseInfo = trueInfo.withAlwaysAsId(false);

        assertNotSame(trueInfo, falseInfo);
        assertFalse(falseInfo.getAlwaysAsId());
    }

    @Test
    public void testGetters()
    {
        PropertyName name = new PropertyName("propName");
        ObjectIdInfo info = new ObjectIdInfo(name, Double.class, DummyGenerator.class, DummyResolver.class);

        assertEquals(name, info.getPropertyName());
        assertEquals(Double.class, info.getScope());
        assertEquals(DummyGenerator.class, info.getGeneratorType());
        assertEquals(DummyResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testToString_normal()
    {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, DummyGenerator.class, DummyResolver.class);

        String result = info.toString();

        assertTrue(result.contains