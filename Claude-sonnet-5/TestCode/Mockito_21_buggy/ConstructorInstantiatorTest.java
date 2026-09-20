package org.mockito.internal.creation.instance;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorInstantiatorTest {

    public static class NoArgClass {
        public NoArgClass() {
        }
    }

    public static class PrivateConstructorClass {
        private PrivateConstructorClass() {
        }
    }

    public static abstract class AbstractClass {
        public AbstractClass() {
        }
    }

    public class InnerClass {
        public InnerClass() {
        }
    }

    public static class WrongOuter {
        public WrongOuter() {
        }
    }

    @Test
    public void testNoArgConstructor_normalCase() {
        Instantiator instantiator = new ConstructorInstantiator(null);

        NoArgClass instance = instantiator.newInstance(NoArgClass.class);

        assertNotNull(instance);
        assertTrue(instance instanceof NoArgClass);
    }

    @Test
    public void testNoArgConstructor_exceptionPath_privateConstructor() {
        Instantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(PrivateConstructorClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("PrivateConstructorClass"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testNoArgConstructor_exceptionPath_abstractClass() {
        Instantiator instantiator = new ConstructorInstantiator(null);

        try {
            instantiator.newInstance(AbstractClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("AbstractClass"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testWithOuterClass_normalCase() {
        ConstructorInstantiatorTest outer = this;
        Instantiator instantiator = new ConstructorInstantiator(outer);

        InnerClass inner = instantiator.newInstance(InnerClass.class);

        assertNotNull(inner);
        assertTrue(inner instanceof InnerClass);
    }

    @Test
    public void testWithOuterClass_exceptionPath_wrongOuterType() {
        WrongOuter wrongOuter = new WrongOuter();
        Instantiator instantiator = new ConstructorInstantiator(wrongOuter);

        try {
            instantiator.newInstance(InnerClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("InnerClass"));
            assertNotNull(e.getCause());
        }
    }

    @Test
    public void testWithOuterClass_exceptionPath_emptyStringOuter() {
        String emptyOuter = "";
        Instantiator instantiator = new ConstructorInstantiator(emptyOuter);

        try {
            instantiator.newInstance(InnerClass.class);
            fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            assertNotNull(e.getMessage());
            assertTrue(e.getMessage().contains("InnerClass"));
        }
    }

    @Test
    public void testConstructor_withNullOuterInstance_usesNoArgPath() {
        Instantiator instantiator = new ConstructorInstantiator(null);

        NoArgClass instance = instantiator.newInstance(NoArgClass.class);

        assertNotNull(instance);
    }

    @Test
    public void testConstructor_withNonNullOuterInstance_storesReference() {
        ConstructorInstantiatorTest outer = this;
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outer);

        InnerClass inner = instantiator.newInstance(InnerClass.class);

        assertNotNull(inner);
        assertTrue(inner instanceof InnerClass);
    }
}