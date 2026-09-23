package org.mockito.internal.configuration.injection.filter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter.OngoingInjecter;
import org.mockito.internal.util.reflection.BeanPropertySetter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FinalMockCandidateFilterTest {
    private FinalMockCandidateFilter filter;
    private TestClassWithSetters target;
    private Field field;

    @Before
    public void setUp() throws Exception {
        filter = new FinalMockCandidateFilter();
        target = new TestClassWithSetters();
        field = TestClassWithSetters.class.getDeclaredField("service");
        field.setAccessible(true);
    }

    @After
    public void tearDown() throws Exception {
        field = null;
        filter = null;
        target = null;
    }

    @Test
    public void testFilterCandidateWithOneMock_UsesBeanPropertySetter() throws Exception {
        List<Object> mocks = new ArrayList<>();
        Object mock = new Object();
        mocks.add(mock);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        injecter.thenInject();

        assertEquals(mock, field.get(target));
    }

    @Test
    public void testFilterCandidateWithOneMock_HasSetter_UsesSetter() throws Exception {
        TestClassWithMethods targetWithSetter = new TestClassWithMethods();
        Field setterField = TestClassWithMethods.class.getDeclaredField("value");
        setterField.setAccessible(true);
        Object mockValue = new Object();

        OngoingInjecter injecter = filter.filterCandidate(
                Collections.singletonList(mockValue), setterField, targetWithSetter);

        injecter.thenInject();

        assertEquals(mockValue, targetWithSetter.value);
        assertTrue(targetWithSetter.setterCalled);
    }

    @Test
    public void testFilterCandidateWithOneMock_NoSetter_UsesFieldDirectly() throws Exception {
        TestClassWithMethods targetNoSetter = new TestClassWithMethods();
        Field fieldNoSetter = TestClassWithMethods.class.getDeclaredField("fieldOnly");
        fieldNoSetter.setAccessible(true);
        Object mockValue = new Object();

        OngoingInjecter injecter = filter.filterCandidate(
                Collections.singletonList(mockValue), fieldNoSetter, targetNoSetter);

        injecter.thenInject();

        assertEquals(mockValue, targetNoSetter.fieldOnly);
    }

    @Test
    public void testFilterCandidateWithMultipleMocks_ReturnsNull() throws Exception {
        List<Object> mocks = new ArrayList<>();
        mocks.add(new Object());
        mocks.add(new Object());

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNull(injecter.thenInject());
    }

    @Test
    public void testFilterCandidateWithZeroMocks_ReturnsNull() throws Exception {
        List<Object> mocks = new ArrayList<>();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);

        assertNull(injecter.thenInject());
    }

    @Test
    public void testFilterCandidateWithNullMocks_UsesBeanPropertySetter() throws Exception {
        List<Object> mocks = new ArrayList<>();
        mocks.add(null);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, target);
        injecter.thenInject();

        assertNull(field.get(target));
        assertNull(target.service);
    }

    @Test
    public void testFilterCandidateWithRuntimeExceptionInSetter_ReporterCalled() throws Exception {
        TargetWithThrowingSetter targetThrowing = new TargetWithThrowingSetter();
        Field throwingField = TargetWithThrowingSetter.class.getDeclaredField("value");
        Object mockValue = new Object();

        OngoingInjecter injecter = filter.filterCandidate(
                Collections.singletonList(mockValue), throwingField, targetThrowing);

        injecter.thenInject();
        // Should not propagate exception - reporter swallows it
        assertTrue(targetThrowing.hitException);
    }

    @Test
    public void testFilterCandidateWithNullFieldInstance_ThrowsNPE() throws Exception {
        List<Object> mocks = Collections.singletonList(new Object());

        try {
            filter.filterCandidate(mocks, field, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFilterCandidateWithNullField_ThrowsNPE() throws Exception {
        List<Object> mocks = Collections.singletonList(new Object());

        try {
            filter.filterCandidate(mocks, null, target);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testFilterCandidateWithOneMock_ReturnSameMock() throws Exception {
        Object mock = new Object();
        OngoingInjecter injecter = filter.filterCandidate(
                Collections.singletonList(mock), field, target);

        assertSame(mock, injecter.thenInject());
    }

    @Test
    public void testFilterCandidateWithMultipleMocks_ReturnsNullFromInjecter() throws Exception {
        OngoingInjecter injecter = filter.filterCandidate(
                Arrays.asList(new Object(), new Object()), field, target);

        assertNull(injecter.thenInject());
    }

    private static class TestClassWithSetters {
        private Object service;
    }

    private static class TestClassWithMethods {
        private Object value;
        private Object fieldOnly;
        boolean setterCalled;

        public void setValue(Object value) {
            this.value = value;
            setterCalled = true;
        }
    }

    private static class TargetWithThrowingSetter {
        public Object value;
        boolean hitException;

        public void setValue(Object value) {
            throw new RuntimeException("Cannot set");
        }
    }
}