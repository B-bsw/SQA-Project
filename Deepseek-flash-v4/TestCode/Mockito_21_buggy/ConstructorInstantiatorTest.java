package org.mockito.internal.creation.instance;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Constructor;

public class ConstructorInstantiatorTest {
    private ConstructorInstantiator instantiator;

    @Before
    public void setUp() {
        instantiator = new ConstructorInstantiator(null);
    }

    @After
    public void tearDown() {
        instantiator = null;
    }

    @Test
    public void testNewInstanceNoArgConstructor() throws Exception {
        ConstructorInstantiator inst = new ConstructorInstantiator(null);
        SimpleClass result = inst.newInstance(SimpleClass.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(SimpleClass.class, result.getClass());
    }

    @Test
    public void testNewInstanceWithOuterClass() throws Exception {
        OuterClass outer = new OuterClass();
        ConstructorInstantiator inst = new ConstructorInstantiator(outer);
        OuterClass.InnerClass result = inst.newInstance(OuterClass.InnerClass.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(OuterClass.InnerClass.class, result.getClass());
        Assert.assertSame(outer, result.getOuter());
    }

    @Test
    public void testNewInstanceWithOuterClassWrongType() throws Exception {
        try {
            ConstructorInstantiator inst = new ConstructorInstantiator(new Object());
            inst.newInstance(OuterClass.InnerClass.class);
            Assert.fail("Expected InstantationException");
        } catch (InstantationException e) {
            Assert.assertTrue(e.getMessage().contains("Unable to create mock instance"));
        }
    }

    @Test
    public void testNewInstanceNoArgConstructorThrowsException() throws Exception {
        ConstructorInstantiator inst = new ConstructorInstantiator(null);
        try {
            inst.newInstance(NoDefaultConstructor.class);
            Assert.fail("Expected InstantationException");
        } catch (InstantationException e) {
            Assert.assertTrue(e.getMessage().contains("parameter-less constructor"));
        }
    }

    @Test
    public void testNewInstanceWithOuterClassNull() throws Exception {
        ConstructorInstantiator inst = new ConstructorInstantiator(null);
        OuterClass.InnerClass result = inst.newInstance(OuterClass.InnerClass.class);
        Assert.fail("Should throw InstantationException for inner class with null outer instance");
    }

    private static class SimpleClass {
        public SimpleClass() {}
    }

    private static class NoDefaultConstructor {
        public NoDefaultConstructor(String arg) {}
    }

    private static class OuterClass {
        public OuterClass() {}
        
        public class InnerClass {
            public OuterClass getOuter() { return OuterClass.this; }
        }
    }
}