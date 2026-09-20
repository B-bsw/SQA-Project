package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SpyAnnotationEngineTest {

    private SpyAnnotationEngine engine;

    @Before
    public void setUp() {
        engine = new SpyAnnotationEngine();
    }

    // ---------- createMockFor ----------

    @Test
    public void testCreateMockForAlwaysReturnsNull() {
        Object result = engine.createMockFor(null, null);
        assertNull(result);
    }

    // ---------- process: normal case ----------

    static class SpyOnlyClass {
        @Spy
        List<String> list = new LinkedList<String>();
    }

    @Test
    public void testProcessWithSpyAnnotation_createsSpy() throws Exception {
        SpyOnlyClass testClass = new SpyOnlyClass();
        Object originalInstance = testClass.list;

        engine.process(SpyOnlyClass.class, testClass);

        Field field = SpyOnlyClass.class.getDeclaredField("list");
        field.setAccessible(true);
        Object newInstance = field.get(testClass);

        assertNotNull(newInstance);
        assertTrue(new MockUtil().isMock(newInstance));
        assertNotSame(originalInstance, newInstance);
    }

    // ---------- process: no spy fields (0 loop iterations) ----------

    static class NoAnnotationsClass {
        List<String> list = new LinkedList<String>();
        String name = "hello";
    }

    @Test
    public void testProcessWithNoSpyFields_doesNothing() throws Exception {
        NoAnnotationsClass testClass = new NoAnnotationsClass();
        Object originalList = testClass.list;
        String originalName = testClass.name;

        engine.process(NoAnnotationsClass.class, testClass);

        assertSame(originalList, testClass.list);
        assertEquals(originalName, testClass.name);
        assertFalse(new MockUtil().isMock(testClass.list));
    }

    // ---------- process: multiple spy fields (multiple loop iterations) ----------

    static class MultipleSpiesClass {
        @Spy
        List<String> list1 = new LinkedList<String>();

        @Spy
        List<String> list2 = new ArrayList<String>();
    }

    @Test
    public void testProcessWithMultipleSpyFields_createsAllSpies() throws Exception {
        MultipleSpiesClass testClass = new MultipleSpiesClass();

        engine.process(MultipleSpiesClass.class, testClass);

        Field field1 = MultipleSpiesClass.class.getDeclaredField("list1");
        field1.setAccessible(true);
        Object newList1 = field1.get(testClass);

        Field field2 = MultipleSpiesClass.class.getDeclaredField("list2");
        field2.setAccessible(true);
        Object newList2 = field2.get(testClass);

        assertTrue(new MockUtil().isMock(newList1));
        assertTrue(new MockUtil().isMock(newList2));
    }

    // ---------- process: null instance throws exception ----------

    static class NullInstanceClass {
        @Spy
        List<String> list;
    }

    @Test
    public void testProcessWithNullInstance_throwsMockitoException() {
        NullInstanceClass test