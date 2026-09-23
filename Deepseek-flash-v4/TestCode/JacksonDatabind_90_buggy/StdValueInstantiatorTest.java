package com.fasterxml.jackson.databind.deser.std;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.util.UUID;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class StdValueInstantiatorTest {

    private static JavaType stringType() {
        return TypeFactory.defaultInstance().constructType(String.class);
    }

    private static AnnotatedConstructor noArgStringCtor() throws Exception {
        return new AnnotatedConstructor(null, String.class.getConstructor(), null, null);
    }

    private static AnnotatedConstructor oneStringCtor() throws Exception {
        return new AnnotatedConstructor(null, String.class.getConstructor(String.class), null, null);
    }

    private static AnnotatedConstructor intCtor() throws Exception {
        return new AnnotatedConstructor(null, Integer.class.getConstructor(int.class), null, null);
    }

    private static AnnotatedConstructor longCtor() throws Exception {
        return new AnnotatedConstructor(null, Long.class.getConstructor(long.class), null, null);
    }

    private static AnnotatedConstructor doubleCtor() throws Exception {
        return new AnnotatedConstructor(null, Double.class.getConstructor(double.class), null, null);
    }

    private static AnnotatedConstructor booleanCtor() throws Exception {
        return new AnnotatedConstructor(null, Boolean.class.getConstructor(boolean.class), null, null);
    }

    private static AnnotatedConstructor uuidCtor() throws Exception {
        return new AnnotatedConstructor(null, UUID.class.getConstructor(long.class, long.class), null, null);
    }

    @Test
    public void testConstructorWithNullClass() {
        StdValueInstantiator v = new StdValueInstantiator(null, (Class<?>) null);
        assertEquals("UNKNOWN TYPE", v.getValueTypeDesc());
        assertEquals(Object.class, v.getValueClass());
    }

    @Test
    public void testConstructorWithClass() {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        assertEquals("java.lang.String", v.getValueTypeDesc());
        assertEquals(String.class, v.getValueClass());
    }

    @Test
    public void testConstructorWithNullJavaType() {
        StdValueInstantiator v = new StdValueInstantiator(null, (JavaType) null);
        assertEquals("UNKNOWN TYPE", v.getValueTypeDesc());
        assertEquals(Object.class, v.getValueClass());
    }

    @Test
    public void testConstructorWithJavaType() {
        StdValueInstantiator v = new StdValueInstantiator(null, stringType());
        assertEquals(String.class, v.getValueClass());
        assertTrue(v.getValueTypeDesc().contains("String"));
    }

    @Test
    public void testInitialCanCreateAllFalse() {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        assertFalse(v.canCreateFromString());
        assertFalse(v.canCreateFromInt());
        assertFalse(v.canCreateFromLong());
        assertFalse(v.canCreateFromDouble());
        assertFalse(v.canCreateFromBoolean());
        assertFalse(v.canCreateUsingDefault());
        assertFalse(v.canCreateUsingDelegate());
        assertFalse(v.canCreateUsingArrayDelegate());
        assertFalse(v.canCreateFromObjectWith());
        assertNull(v.getDefaultCreator());
        assertNull(v.getDelegateCreator());
        assertNull(v.getArrayDelegateCreator());
        assertNull(v.getWithArgsCreator());
        assertNull(v.getDelegateType(null));
        assertNull(v.getArrayDelegateType(null));
        assertNull(v.getFromObjectArguments(null));
        assertNull(v.getIncompleteParameter());
    }

    @Test
    public void testConfigureFromObjectSettingsAllNull() {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, null, null, null, null, null);
        assertFalse(v.canCreateUsingDefault());
        assertFalse(v.canCreateUsingDelegate());
        assertFalse(v.canCreateFromObjectWith());
        assertNull(v.getDefaultCreator());
        assertNull(v.getDelegateCreator());
        assertNull(v.getWithArgsCreator());
        assertNull(v.getDelegateType(null));
        assertNull(v.getFromObjectArguments(null));
    }

    @Test
    public void testConfigureFromObjectSettingsCustom() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        AnnotatedWithParams defaultC = noArgStringCtor();
        AnnotatedWithParams delegateC = oneStringCtor();
        AnnotatedWithParams withArgsC = oneStringCtor();
        JavaType delegateType = stringType();
        v.configureFromObjectSettings(defaultC, delegateC, delegateType, null, withArgsC, null);
        assertTrue(v.canCreateUsingDefault());
        assertTrue(v.canCreateUsingDelegate());
        assertTrue(v.canCreateFromObjectWith());
        assertSame(defaultC, v.getDefaultCreator());
        assertSame(delegateC, v.getDelegateCreator());
        assertSame(withArgsC, v.getWithArgsCreator());
        assertSame(delegateType, v.getDelegateType(null));
    }

    @Test
    public void testCanCreateUsingDelegateRequiresDelegateType() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, oneStringCtor(), null, null, null, null);
        assertNotNull(v.getDelegateCreator());
        assertFalse(v.canCreateUsingDelegate());
    }

    @Test
    public void testConfigureFromArraySettingsAllNull() {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromArraySettings(null, null, null);
        assertFalse(v.canCreateUsingArrayDelegate());
        assertNull(v.getArrayDelegateCreator());
        assertNull(v.getArrayDelegateType(null));
    }

    @Test
    public void testConfigureFromArraySettingsCustom() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        AnnotatedWithParams arrayDelegateC = oneStringCtor();
        JavaType arrayDelegateType = stringType();
        v.configureFromArraySettings(arrayDelegateC, arrayDelegateType, null);
        assertTrue(v.canCreateUsingArrayDelegate());
        assertSame(arrayDelegateC, v.getArrayDelegateCreator());
        assertSame(arrayDelegateType, v.getArrayDelegateType(null));
    }

    @Test
    public void testConfigureScalarCreators() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromStringCreator(oneStringCtor());
        assertTrue(v.canCreateFromString());
        v.configureFromIntCreator(intCtor());
        assertTrue(v.canCreateFromInt());
        v.configureFromLongCreator(longCtor());
        assertTrue(v.canCreateFromLong());
        v.configureFromDoubleCreator(doubleCtor());
        assertTrue(v.canCreateFromDouble());
        v.configureFromBooleanCreator(booleanCtor());
        assertTrue(v.canCreateFromBoolean());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateUsingDefaultWithNullCreatorFallsBackToSuper() throws Exception {
        new StdValueInstantiator(null, String.class).createUsingDefault(null);
    }

    @Test
    public void testCreateUsingDefaultWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(noArgStringCtor(), null, null, null, null, null);
        assertEquals("", v.createUsingDefault(null));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromObjectWithNullCreatorFallsBackToSuper() throws Exception {
        new StdValueInstantiator(null, String.class).createFromObjectWith(null, null);
    }

    @Test
    public void testCreateFromObjectWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, null, null, null, oneStringCtor(), null);
        assertEquals("foo", v.createFromObjectWith(null, new Object[] {"foo"}));
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingDelegateWithNullCreators() throws Exception {
        new StdValueInstantiator(null, String.class).createUsingDelegate(null, "delegate");
    }

    @Test
    public void testCreateUsingDelegateWithDelegateCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, oneStringCtor(), stringType(), null, null, null);
        assertEquals("value", v.createUsingDelegate(null, "value"));
    }

    @Test
    public void testCreateUsingDelegateFallsBackToArrayDelegate() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromArraySettings(oneStringCtor(), stringType(), null);
        assertEquals("v2", v.createUsingDelegate(null, "v2"));
    }

    @Test
    public void testCreateUsingDelegateWithEmptyArguments() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, noArgStringCtor(), stringType(), new SettableBeanProperty[0], null, null);
        assertEquals("", v.createUsingDelegate(null, "delegate"));
    }

    @Test
    public void testCreateUsingDelegateWithSingleInjective() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, oneStringCtor(), stringType(), new SettableBeanProperty[] { null }, null, null);
        assertEquals("x", v.createUsingDelegate(null, "x"));
    }

    @Test
    public void testCreateUsingDelegateWithMultipleInjectives() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, uuidCtor(), stringType(), new SettableBeanProperty[2], null, null);
        UUID uuid = (UUID) v.createUsingDelegate(null, 1L);
        assertNotNull(uuid);
        assertEquals(1L, uuid.getMostSignificantBits());
        assertEquals(1L, uuid.getLeastSignificantBits());
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateUsingArrayDelegateWithNullCreators() throws Exception {
        new StdValueInstantiator(null, String.class).createUsingArrayDelegate(null, "delegate");
    }

    @Test
    public void testCreateUsingArrayDelegateWithArrayDelegateCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromArraySettings(oneStringCtor(), stringType(), null);
        assertEquals("x", v.createUsingArrayDelegate(null, "x"));
    }

    @Test
    public void testCreateUsingArrayDelegateFallsBackToDelegate() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromObjectSettings(null, oneStringCtor(), stringType(), null, null, null);
        assertEquals("y", v.createUsingArrayDelegate(null, "y"));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromStringWithNullCreatorFallsBack() throws Exception {
        new StdValueInstantiator(null, String.class).createFromString(null, "value");
    }

    @Test
    public void testCreateFromStringWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromStringCreator(oneStringCtor());
        assertEquals("value", v.createFromString(null, "value"));
    }

    @Test
    public void testCreateFromIntWithIntCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromIntCreator(intCtor());
        assertEquals(Integer.valueOf(42), v.createFromInt(null, 42));
    }

    @Test
    public void testCreateFromIntFallbackToLongCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromLongCreator(longCtor());
        assertEquals(Long.valueOf(42L), v.createFromInt(null, 42));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromIntWithNoCreatorFallsBack() throws Exception {
        new StdValueInstantiator(null, String.class).createFromInt(null, 1);
    }

    @Test
    public void testCreateFromLongWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromLongCreator(longCtor());
        assertEquals(Long.valueOf(12L), v.createFromLong(null, 12L));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromLongWithNoCreatorFallsBack() throws Exception {
        new StdValueInstantiator(null, String.class).createFromLong(null, 1L);
    }

    @Test
    public void testCreateFromDoubleWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromDoubleCreator(doubleCtor());
        assertEquals(Double.valueOf(1.5), v.createFromDouble(null, 1.5));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromDoubleWithNoCreatorFallsBack() throws Exception {
        new StdValueInstantiator(null, String.class).createFromDouble(null, 1.0);
    }

    @Test
    public void testCreateFromBooleanWithCreator() throws Exception {
        StdValueInstantiator v = new StdValueInstantiator(null, String.class);
        v.configureFromBooleanCreator(booleanCtor());
        assertEquals(Boolean.TRUE, v.createFromBoolean(null, true));
    }

    @Test(expected = NullPointerException.class)
    public void testCreateFromBooleanWithNoCreatorFallsBack() throws Exception {
        new StdValueInstantiator(null, String.class).createFromBoolean(null, true);
    }
}