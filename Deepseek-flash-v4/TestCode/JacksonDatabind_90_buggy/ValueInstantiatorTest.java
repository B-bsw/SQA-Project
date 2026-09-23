package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;

public class ValueInstantiatorTest {

    private static class DefaultVI extends ValueInstantiator { }

    private static class UnknownClassVI extends ValueInstantiator {
        @Override
        public Class<?> getValueClass() {
            return null;
        }
    }

    private static class CanCreateFromStringVI extends ValueInstantiator {
        @Override
        public boolean canCreateFromString() {
            return true;
        }
    }

    private static class BoolVI extends ValueInstantiator {
        @Override
        public boolean canCreateFromBoolean() {
            return true;
        }

        @Override
        public Object createFromBoolean(DeserializationContext ctxt, boolean value) {
            return Boolean.valueOf(value);
        }
    }

    private static class MockDeserializationContext extends DeserializationContext {
        private final boolean acceptEmpty;

        MockDeserializationContext(boolean acceptEmpty) {
            super((DeserializerFactory) null, null, null, null);
            this.acceptEmpty = acceptEmpty;
        }

        @Override
        public JsonParser getParser() {
            return null;
        }

        @Override
        public Object findInjectableValue(Object valueId, BeanProperty forProperty,
                Object beanInstance) {
            return null;
        }

        @Override
        public JavaType constructType(Class<?> cls) {
            return null;
        }

        @Override
        public Class<?> getActiveView() {
            return null;
        }

        @Override
        public boolean hasDeserializationFeatures(int mask) {
            return false;
        }

        @Override
        public boolean hasSomeOfFeatures(int mask) {
            return false;
        }

        @Override
        public boolean isEnabled(DeserializationFeature feature) {
            return acceptEmpty
                    && feature == DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT;
        }

        @Override
        public int getDeserializationFeatures() {
            return 0;
        }

        @Override
        public Object handleMissingInstantiator(Class<?> instClass, JsonParser p,
                String msg, Object... args) throws IOException {
            throw new IOException(String.format(msg, args));
        }
    }

    @Test
    public void testGetValueClassDefaultAndTypeDesc() {
        ValueInstantiator vi = new DefaultVI();
        assertEquals(Object.class, vi.getValueClass());
        assertEquals("java.lang.Object", vi.getValueTypeDesc());
    }

    @Test
    public void testGetValueTypeDescWhenClassNull() {
        assertEquals("UNKNOWN", new UnknownClassVI().getValueTypeDesc());
    }

    @Test
    public void testDefaultCreatorAndArgumentAccessors() {
        ValueInstantiator vi = new DefaultVI();
        assertNull(vi.getDefaultCreator());
        assertNull(vi.getDelegateCreator());
        assertNull(vi.getArrayDelegateCreator());
        assertNull(vi.getWithArgsCreator());
        assertNull(vi.getIncompleteParameter());
        assertNull(vi.getFromObjectArguments(null));
        assertNull(vi.getDelegateType(null));
        assertNull(vi.getArrayDelegateType(null));
    }

    @Test
    public void testCanCreateMethodsDefaultFalse() {
        ValueInstantiator vi = new DefaultVI();
        assertFalse(vi.canCreateFromString());
        assertFalse(vi.canCreateFromInt());
        assertFalse(vi.canCreateFromLong());
        assertFalse(vi.canCreateFromDouble());
        assertFalse(vi.canCreateFromBoolean());
        assertFalse(vi.canCreateUsingDefault());
        assertFalse(vi.canCreateUsingDelegate());
        assertFalse(vi.canCreateUsingArrayDelegate());
        assertFalse(vi.canCreateFromObjectWith());
        assertFalse(vi.canInstantiate());
    }

    @Test
    public void testCanInstantiateWhenStringCreatorAvailable() {
        assertTrue(new CanCreateFromStringVI().canInstantiate());
    }

    @Test
    public void testBaseClassOverrides() {
        ValueInstantiator.Base base = new ValueInstantiator.Base(String.class);
        assertEquals(String.class, base.getValueClass());
        assertEquals("java.lang.String", base.getValueTypeDesc());
    }

    @Test
    public void testCreateFromStringBooleanBranches() throws IOException {
        BoolVI vi = new BoolVI();
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        assertEquals(Boolean.TRUE, vi.createFromString(ctxt, "true"));
        assertEquals(Boolean.FALSE, vi.createFromString(ctxt, "  false  "));
    }

    @Test
    public void testCreateFromStringEmptyAcceptedAsNull() throws IOException {
        ValueInstantiator vi = new DefaultVI();
        assertNull(vi.createFromString(new MockDeserializationContext(true), ""));
    }

    @Test
    public void testCreateFromStringUnsupportedThrows() throws IOException {
        ValueInstantiator vi = new DefaultVI();
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        try {
            vi.createFromString(ctxt, "hello");
            fail("Should throw for non-empty string");
        } catch (IOException expected) {
        }
        try {
            vi.createFromString(ctxt, "");
            fail("Should throw for empty string when feature disabled");
        } catch (IOException expected) {
        }
    }

    @Test
    public void testCreateMethodsWithoutCreatorThrow() throws IOException {
        ValueInstantiator vi = new DefaultVI();
        MockDeserializationContext ctxt = new MockDeserializationContext(false);
        try {
            vi.createUsingDefault(ctxt);
            fail("Should throw for default creator");
        } catch (IOException expected) {
        }
        try {
            vi.createUsingDelegate(ctxt, "x");
            fail("Should throw for delegate creator");
        } catch (IOException expected) {
        }
        try {
            vi.createUsingArrayDelegate(ctxt, "x");
            fail("Should throw for array delegate creator");
        } catch (IOException expected) {
        }
        try {
            vi.createFromObjectWith(ctxt, new Object[] { "x" });
            fail("Should throw for object-with creator");
        } catch (IOException expected) {
        }
        try {
            vi.createFromInt(ctxt, 1);
            fail("Should throw for int creator");
        } catch (IOException expected) {
        }
        try {
            vi.createFromLong(ctxt, 1L);
            fail("Should throw for long creator");
        } catch (IOException expected) {
        }
        try {
            vi.createFromDouble(ctxt, 1.0d);
            fail("Should throw for double creator");
        } catch (IOException expected) {
        }
        try {
            vi.createFromBoolean(ctxt, true);
            fail("Should throw for boolean creator");
        } catch (IOException expected) {
        }
    }
}