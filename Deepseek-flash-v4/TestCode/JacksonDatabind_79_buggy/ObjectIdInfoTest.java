package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

public class ObjectIdInfoTest {

    abstract static class DummyGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;
    }

    private static final Class<? extends ObjectIdGenerator<?>> GEN = DummyGenerator.class;
    private static final PropertyName PROP = new PropertyName("id");

    private ObjectIdInfo createDefault() {
        return new ObjectIdInfo(PROP, Object.class, GEN, SimpleObjectIdResolver.class);
    }

    @Test
    public void testFullConstructorGetters() {
        ObjectIdInfo info = createDefault();
        assertEquals(PROP, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(GEN, info.getGeneratorType());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testDeprecatedConstructorWithPropertyNameUsesDefaultResolver() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, String.class, GEN);
        assertEquals(GEN, info.getGeneratorType());
        assertEquals(String.class, info.getScope());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testStringConstructorConvertsToPropertyName() {
        ObjectIdInfo info = new ObjectIdInfo("id", Integer.class, GEN);
        assertEquals(new PropertyName("id"), info.getPropertyName());
        assertEquals(Integer.class, info.getScope());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testNullResolverDefaultsToSimple() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, Object.class, GEN, null);
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testExplicitResolverStored() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, Void.class, GEN, ObjectIdResolver.class);
        assertEquals(ObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testWithAlwaysAsIdSameReturnsSameInstance() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, Object.class, GEN, false, SimpleObjectIdResolver.class);
        assertSame(info, info.withAlwaysAsId(false));
    }

    @Test
    public void testWithAlwaysAsIdDifferentReturnsNewAndPreservesFields() {
        ObjectIdInfo original = new ObjectIdInfo(PROP, Object.class, GEN, false, ObjectIdResolver.class);
        ObjectIdInfo changed = original.withAlwaysAsId(true);
        assertNotSame(original, changed);
        assertTrue(changed.getAlwaysAsId());
        assertEquals(PROP, changed.getPropertyName());
        assertEquals(Object.class, changed.getScope());
        assertEquals(GEN, changed.getGeneratorType());
        assertEquals(ObjectIdResolver.class, changed.getResolverType());
    }

    @Test
    public void testProtectedConstructorWithAlwaysAsIdTrue() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, Object.class, GEN, true, SimpleObjectIdResolver.class);
        assertTrue(info.getAlwaysAsId());
        assertSame(info, info.withAlwaysAsId(true));
    }

    @Test
    public void testNullPropertyName() {
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, Object.class, GEN, SimpleObjectIdResolver.class);
        assertNull(info.getPropertyName());
        assertNotNull(info.toString());
        assertTrue(info.toString().contains("propName=null"));
    }

    @Test
    public void testToStringWithNullValues() {
        ObjectIdInfo info = new ObjectIdInfo(PROP, null, null, SimpleObjectIdResolver.class);
        String str = info.toString();
        assertTrue(str.contains("propName=" + PROP));
        assertTrue(str.contains("scope=null"));
        assertTrue(str.contains("generatorType=null"));
        assertTrue(str.contains("alwaysAsId=false"));
    }

    @Test
    public void testToStringWithNonNullValues() {
        ObjectIdInfo info = createDefault();
        String str = info.toString();
        assertTrue(str.contains("propName=" + PROP));
        assertTrue(str.contains("scope=java.lang.Object"));
        assertTrue(str.contains("generatorType=" + DummyGenerator.class.getName()));
        assertTrue(str.contains("alwaysAsId=false"));
    }
}