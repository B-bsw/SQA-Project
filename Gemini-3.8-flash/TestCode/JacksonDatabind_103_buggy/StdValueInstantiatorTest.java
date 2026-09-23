package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class StdValueInstantiatorTest {

    private StdValueInstantiator instantiator;
    private DeserializationConfig config;
    private JavaType valueType;

    @Before
    public void setUp() {
        config = new DeserializationConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        valueType = TypeFactory.defaultInstance().constructType(TestBean.class);
        instantiator = new StdValueInstantiator(config, valueType);
    }

    @After
    public void tearDown() {
        instantiator = null;
        config = null;
        valueType = null;
    }

    @Test
    public void testDefaultConstructorWithNullValueType() {
        StdValueInstantiator si = new StdValueInstantiator(config, (Class<?>) null);
        assertEquals("java.lang.Object", si.getValueClass().getName());
        assertEquals("null", si.getValueTypeDesc());
    }

    @Test
    public void testDeprecatedConstructorWithClass() {
        StdValueInstantiator si = new StdValueInstantiator(config, TestBean.class);
        assertEquals(TestBean.class, si.getValueClass());
        assertEquals(TestBean.class.getName(), si.getValueTypeDesc());
    }

    @Test
    public void testCopyConstructor() {
        StdValueInstantiator original = new StdValueInstantiator(config, valueType);
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams();
        original.configureFromObjectSettings(defaultCreator, null, null, null, null, null);

        StdValueInstantiator copy = new StdValueInstantiator(original);
        assertNotNull(copy.getDefaultCreator());
        assertSame(defaultCreator, copy.getDefaultCreator());
    }

    @Test
    public void testConfigureFromObjectSettings() {
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams();
        AnnotatedWithParams delegateCreator = new MockAnnotatedWithParams();
        AnnotatedWithParams withArgsCreator = new MockAnnotatedWithParams();
        JavaType delegateType = TypeFactory.defaultInstance().constructType(String.class);
        SettableBeanProperty[] delegateArgs = new SettableBeanProperty[0];
        SettableBeanProperty[] constructorArgs = new SettableBeanProperty[0];

        instantiator.configureFromObjectSettings(defaultCreator, delegateCreator, delegateType, delegateArgs, withArgsCreator, constructorArgs);

        assertSame(defaultCreator, instantiator.getDefaultCreator());
        assertSame(delegateCreator, instantiator.getDelegateCreator());
        assertSame(withArgsCreator, instantiator.getWithArgsCreator());
        assertEquals(delegateType, instantiator.getDelegateType(config));
        assertArrayEquals(constructorArgs, instantiator.getFromObjectArguments(config));
    }

    @Test
    public void testConfigureFromArraySettings() {
        AnnotatedWithParams arrayDelegateCreator = new MockAnnotatedWithParams();
        JavaType arrayDelegateType = TypeFactory.defaultInstance().constructType(String[].class);
        SettableBeanProperty[] arrayDelegateArgs = new SettableBeanProperty[0];

        instantiator.configureFromArraySettings(arrayDelegateCreator, arrayDelegateType, arrayDelegateArgs);

        assertSame(arrayDelegateCreator, instantiator.getArrayDelegateCreator());
        assertEquals(arrayDelegateType, instantiator.getArrayDelegateType(config));
    }

    @Test
    public void testCanCreateFlags() {
        assertFalse(instantiator.canCreateFromString());
        assertFalse(instantiator.canCreateFromInt());
        assertFalse(instantiator.canCreateFromLong());
        assertFalse(instantiator.canCreateFromDouble());
        assertFalse(instantiator.canCreateFromBoolean());
        assertFalse(instantiator.canCreateUsingDefault());
        assertFalse(instantiator.canCreateUsingDelegate());
        assertFalse(instantiator.canCreateFromObjectWith());
        assertFalse(instantiator.canInstantiate());

        instantiator.configureFromStringCreator(new MockAnnotatedWithParams());
        instantiator.configureFromIntCreator(new MockAnnotatedWithParams());
        instantiator.configureFromLongCreator(new MockAnnotatedWithParams());
        instantiator.configureFromDoubleCreator(new MockAnnotatedWithParams());
        instantiator.configureFromBooleanCreator(new MockAnnotatedWithParams());
        instantiator.configureFromObjectSettings(new MockAnnotatedWithParams(), new MockAnnotatedWithParams(), null, null, new MockAnnotatedWithParams(), null);

        assertTrue(instantiator.canCreateFromString());
        assertTrue(instantiator.canCreateFromInt());
        assertTrue(instantiator.canCreateFromLong());
        assertTrue(instantiator.canCreateFromDouble());
        assertTrue(instantiator.canCreateFromBoolean());
        assertTrue(instantiator.canCreateUsingDefault());
        assertTrue(instantiator.canCreateUsingDelegate());
        assertTrue(instantiator.canCreateFromObjectWith());
        assertTrue(instantiator.canInstantiate());
    }

    @Test
    public void testCanInstantiateWithArrayDelegate() {
        instantiator.configureFromArraySettings(new MockAnnotatedWithParams(), TypeFactory.defaultInstance().constructType(String[].class), null);
        assertTrue(instantiator.canCreateUsingArrayDelegate());
        assertTrue(instantiator.canInstantiate());
    }

    @Test
    public void testCreateUsingDefaultWithNullCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingDefault(ctxt);
        assertNull(result);
    }

    @Test
    public void testCreateUsingDefaultWithCreator() throws IOException {
        AnnotatedWithParams creator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(creator, null, null, null, null, null);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingDefault(ctxt);
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateFromObjectWithNullArgs() throws IOException {
        AnnotatedWithParams withArgsCreator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, null, null, null, withArgsCreator, null);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromObjectWith(ctxt, new Object[]{"test"});
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateUsingDelegateWithNullDelegateCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingDelegate(ctxt, "delegate");
        assertNull(result);
    }

    @Test
    public void testCreateUsingDelegateWithArrayDelegateFallback() throws IOException {
        AnnotatedWithParams arrayDelegateCreator = new MockAnnotatedWithParams();
        instantiator.configureFromArraySettings(arrayDelegateCreator, TypeFactory.defaultInstance().constructType(String[].class), null);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingDelegate(ctxt, "delegate");
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateUsingArrayDelegateWithArrayDelegateCreator() throws IOException {
        AnnotatedWithParams arrayDelegateCreator = new MockAnnotatedWithParams();
        instantiator.configureFromArraySettings(arrayDelegateCreator, TypeFactory.defaultInstance().constructType(String[].class), null);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingArrayDelegate(ctxt, "delegate");
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateUsingArrayDelegateWithRegularDelegateFallback() throws IOException {
        AnnotatedWithParams delegateCreator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, delegateCreator, TypeFactory.defaultInstance().constructType(String.class), null, null, null);
        instantiator.configureFromArraySettings(null, null, null);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingArrayDelegate(ctxt, "delegate");
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateFromStringWithNullCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromString(ctxt, "value");
        assertNull(result);
    }

    @Test
    public void testCreateFromStringWithStringCreator() throws IOException {
        AnnotatedWithParams stringCreator = new MockAnnotatedWithParams();
        instantiator.configureFromStringCreator(stringCreator);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromString(ctxt, "test");
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateFromIntWithIntCreator() throws IOException {
        AnnotatedWithParams intCreator = new MockAnnotatedWithParams();
        instantiator.configureFromIntCreator(intCreator);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromInt(ctxt, 42);
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateFromIntWithLongCreatorFallback() throws IOException {
        AnnotatedWithParams longCreator = new MockAnnotatedWithParams();
        instantiator.configureFromLongCreator(longCreator);

        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromInt(ctxt, 42);
        assertEquals("testValue", result);
    }

    @Test
    public void testCreateFromLongWithNullCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromLong(ctxt, 42L);
        assertNull(result);
    }

    @Test
    public void testCreateFromDoubleWithNullCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromDouble(ctxt, 4.2);
        assertNull(result);
    }

    @Test
    public void testCreateFromBooleanWithNullCreator() throws IOException {
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createFromBoolean(ctxt, true);
        assertNull(result);
    }

    @Test
    public void testGetIncompleteParameter() {
        assertNull(instantiator.getIncompleteParameter());
        AnnotatedParameter parameter = new AnnotatedParameter(null, null, null, null, null);
        instantiator.configureIncompleteParameter(parameter);
        assertSame(parameter, instantiator.getIncompleteParameter());
    }

    @Test
    public void testWrapExceptionWithJsonMappingException() {
        JsonMappingException jme = new JsonMappingException(null, "test");
        Throwable result = instantiator.wrapAsJsonMappingException(new MockDeserializationContext(), jme);
        assertSame(jme, result);
    }

    @Test
    public void testWrapExceptionWithOtherThrowable() {
        JsonMappingException result = instantiator.wrapAsJsonMappingException(new MockDeserializationContext(), new RuntimeException("test"));
        assertNotNull(result);
        assertEquals("Instantiation of " + TestBean.class.getName() + " value failed: test", result.getMessage());
    }

    @Test
    public void testRewrapCtorProblemWithInvocationTargetException() {
        InvocationTargetException ite = new InvocationTargetException(new RuntimeException("cause"));
        DeserializationContext ctxt = new MockDeserializationContext();
        JsonMappingException result = instantiator.rewrapCtorProblem(ctxt, ite);
        assertNotNull(result);
    }

    @Test
    public void testRewrapCtorProblemWithExceptionInInitializerError() {
        ExceptionInInitializerError eie = new ExceptionInInitializerError(new RuntimeException("init"));
        JsonMappingException result = instantiator.rewrapCtorProblem(new MockDeserializationContext(), eie);
        assertNotNull(result);
    }

    @Test
    public void testRewrapCtorProblemWithJsonMappingException() {
        JsonMappingException jme = new JsonMappingException(null, "mapping");
        JsonMappingException result = instantiator.rewrapCtorProblem(new MockDeserializationContext(), jme);
        assertSame(jme, result);
    }

    @Test
    public void testCreateFromStringWithStringCreatorThrowsIOException() {
        AnnotatedWithParams stringCreator = new MockAnnotatedWithParams(true);
        instantiator.configureFromStringCreator(stringCreator);
        DeserializationContext ctxt = new MockDeserializationContext();
        try {
            instantiator.createFromString(ctxt, "test");
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateFromIntWithIntCreatorThrowsIOException() {
        AnnotatedWithParams intCreator = new MockAnnotatedWithParams(true);
        instantiator.configureFromIntCreator(intCreator);
        DeserializationContext ctxt = new MockDeserializationContext();
        try {
            instantiator.createFromInt(ctxt, 42);
            fail("Expected IOException");
        } catch (IOException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testCreateUsingDefaultWithThrowable() throws IOException {
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams(true);
        instantiator.configureFromObjectSettings(defaultCreator, null, null, null, null, null);
        DeserializationContext ctxt = new MockDeserializationContext();
        Object result = instantiator.createUsingDefault(ctxt);
        assertNull(result);
    }

    @Test
    public void testGetValueTypeDescWithCustomType() {
        assertEquals("test", instantiator.getValueTypeDesc());
    }

    @Test
    public void testGetValueClass() {
        assertEquals(TestBean.class, instantiator.getValueClass());
    }

    @Test
    public void testGetDelegateCreator() {
        assertNull(instantiator.getDelegateCreator());
        AnnotatedWithParams delegateCreator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, delegateCreator, null, null, null, null);
        assertSame(delegateCreator, instantiator.getDelegateCreator());
    }

    @Test
    public void testGetArrayDelegateCreator() {
        assertNull(instantiator.getArrayDelegateCreator());
        AnnotatedWithParams arrayDelegateCreator = new MockAnnotatedWithParams();
        instantiator.configureFromArraySettings(arrayDelegateCreator, null, null);
        assertSame(arrayDelegateCreator, instantiator.getArrayDelegateCreator());
    }

    @Test
    public void testGetDefaultCreator() {
        assertNull(instantiator.getDefaultCreator());
        AnnotatedWithParams defaultCreator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(defaultCreator, null, null, null, null, null);
        assertSame(defaultCreator, instantiator.getDefaultCreator());
    }

    @Test
    public void testGetWithArgsCreator() {
        assertNull(instantiator.getWithArgsCreator());
        AnnotatedWithParams withArgsCreator = new MockAnnotatedWithParams();
        instantiator.configureFromObjectSettings(null, null, null, null, withArgsCreator, null);
        assertSame(withArgsCreator, instantiator.getWithArgsCreator());
    }

    private static class TestBean {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    private static class MockAnnotatedWithParams extends AnnotatedWithParams {
        private static final long serialVersionUID = 1L;
        private final boolean throwError;

        public MockAnnotatedWithParams() {
            this(false);
        }

        public MockAnnotatedWithParams(boolean throwError) {
            super(null, null, null, null);
            this.throwError = throwError;
        }

        @Override
        public Class<?> getDeclaringClass() {
            return TestBean.class;
        }

        @Override
        public Object call() throws Exception {
            if (throwError) {
                throw new RuntimeException("Test error");
            }
            return "testValue";
        }

        @Override
        public Object call1(Object arg) throws Exception {
            if (throwError) {
                throw new RuntimeException("Test error");
            }
            return "testValue";
        }

        @Override
        public Object call(Object... args) throws Exception {
            if (throwError) {
                throw new RuntimeException("Test error");
            }
            return "testValue";
        }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        private static final long serialVersionUID = 1L;

        public MockDeserializationContext() {
            super(null, null, null, null, null);
        }

        @Override
        public Object handleInstantiationProblem(Class<?> paramClass, Object argument, Throwable t) {
            return null;
        }

        @Override
        public Object handleInstantiationProblem(Class<?> paramClass, Object argument, Throwable t, String message) {
            return null;
        }

        @Override
        public JsonMappingException instantiationException(Class<?> paramClass, Throwable t) {
            return new JsonMappingException(null, "Instantiation of " + paramClass.getName() + " failed", t);
        }

        @Override
        public JsonMappingException instantiationException(Class<?> paramClass, Throwable t, String message) {
            return new JsonMappingException(null, message, t);
        }

        @Override
        public JsonMappingException instantiationException(Class<?> paramClass, String message) {
            return new JsonMappingException(null, message);
        }

        @Override
        public JsonMappingException instantiationException(Class<?> paramClass, String message, Object argument) {
            return new JsonMappingException(null, message);
        }
    }
}