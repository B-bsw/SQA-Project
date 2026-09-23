package org.mockito.internal.configuration;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.lang.reflect.Field;
import org.mockito.Mock;
import org.mockito.Captor;
import org.mockito.Spy;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;
import org.mockito.Mockito;

public class SpyAnnotationEngineTest {
    private SpyAnnotationEngine engine;
    private static class TestClass {
        @Spy
        private java.util.List<String> spyList;
        @Spy
        private java.util.List<String> nullList;
        @Mock
        private java.util.List<String> mockList;
        @Captor
        private org.mockito.ArgumentCaptor<String> captor;
        @Spy
        @Mock
        private java.util.List<String> bothAnnotated;
    }

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
    }

    @After
    public void tearDown() {
        engine = null;
    }

    @Test
    public void testProcessWithNullInstanceThrowsMockitoException() {
        TestClass test = new TestClass();
        try {
            engine.process(TestClass.class, test);
            Assert.fail("Expected MockitoException");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage().contains("instance is missing"));
        }
    }

    @Test
    public void testProcessWithExistingInstance() {
        TestClass test = new TestClass();
        test.spyList = new java.util.ArrayList<>();
        test.nullList = new java.util.ArrayList<>();
        test.bothAnnotated = new java.util.ArrayList<>();
        test.mockList = Mockito.mock(java.util.List.class);
        test.captor = null;
        engine.process(TestClass.class, test);
        Assert.assertNotNull(test.spyList);
        Assert.assertNotNull(test.nullList);
        Assert.assertTrue(MockUtil.isMock(test.spyList));
        Assert.assertTrue(MockUtil.isSpy(test.nullList));
        Assert.assertNotNull(test.bothAnnotated);
        Assert.assertNull(test.captor);
    }

    @Test
    public void testProcessWithExistingMockSpy() {
        TestClass test = new TestClass();
        test.spyList = Mockito.mock(java.util.List.class);
        test.nullList = new java.util.ArrayList<>();
        test.bothAnnotated = new java.util.ArrayList<>();
        test.mockList = null;
        test.captor = null;
        Mockito.when(test.spyList.size()).thenReturn(5);
        engine.process(TestClass.class, test);
        Mockito.verify(test.spyList, Mockito.times(1)).size();
        test.spyList.size();
        Mockito.verify(test.spyList, Mockito.times(2)).size();
    }

    @Test
    public void testProcessWithNoFields() {
        class EmptyClass {};
        EmptyClass test = new EmptyClass();
        engine.process(EmptyClass.class, test);
        Assert.assertNotNull(test);
    }

    @Test
    public void testAssertNoAnnotationsWithUndesiredAnnotations() {
        TestClass test = new TestClass();
        Field field = null;
        try {
            field = TestClass.class.getDeclaredField("bothAnnotated");
        } catch (NoSuchFieldException e) {
            Assert.fail(e.getMessage());
        }
        try {
            engine.assertNoAnnotations(org.mockito.Spy.class, field, org.mockito.Mock.class);
            Assert.fail("Expected MockitoException");
        } catch (MockitoException e) {
            Assert.assertTrue(e.getMessage() != null);
        }
    }

    @Test
    public void testAssertNoAnnotationsWithoutUndesired() {
        TestClass test = new TestClass();
        Field field = null;
        try {
            field = TestClass.class.getDeclaredField("spyList");
        } catch (NoSuchFieldException e) {
            Assert.fail(e.getMessage());
        }
        engine.assertNoAnnotations(org.mockito.Spy.class, field, org.mockito.Mock.class);
        Assert.assertNotNull(field);
    }

    @Test
    public void testCreateMockForReturnsNull() {
        Field field = null;
        try {
            field = TestClass.class.getDeclaredField("spyList");
        } catch (NoSuchFieldException e) {
            Assert.fail(e.getMessage());
        }
        Assert.assertNull(engine.createMockFor(field.getAnnotation(org.mockito.Spy.class), field));
    }

    @Test
    public void testProcessWithExceptionThrownDuringFieldSet() {
        class InvalidClass {
            @Spy
            private java.util.List<String> invalidList;
        }
        InvalidClass test = new InvalidClass();
        test.invalidList = new java.util.ArrayList<>();
        try {
            engine.process(InvalidClass.class, test);
            Assert.assertNotNull(test.invalidList);
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e.getMessage());
        }
    }
}