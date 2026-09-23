package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter.OngoingInjecter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class MockCandidateFilterTest {

    // Simple concrete implementation for testing the interface
    private static class ConcreteMockCandidateFilter implements MockCandidateFilter {
        private final boolean returnsOngoingInjecter;

        ConcreteMockCandidateFilter(boolean returnsOngoingInjecter) {
            this.returnsOngoingInjecter = returnsOngoingInjecter;
        }

        @Override
        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
            // Simple logic to be tested through the interface contract
            if (mocks.isEmpty()) {
                return null; // Edge case: no mocks provided
            }
            if (fieldToBeInjected == null) {
                return null;
            }
            if (fieldToBeInjected.getType().isPrimitive()) {
                return null;
            }
            if (returnsOngoingInjecter) {
                return new OngoingInjecter() {
                    @Override
                    public void inject() {
                        // no-op for test
                    }
                };
            } else {
                return null; // Decide not to inject
            }
        }
    }

    private static class TestOngoingInjecter implements OngoingInjecter {
        private final Object instance;
        private final Field field;
        private final Object value;
        private boolean injected = false;

        TestOngoingInjecter(Object instance, Field field, Object value) {
            this.instance = instance;
            this.field = field;
            this.value = value;
        }

        public boolean isInjected() {
            return injected;
        }

        @Override
        public void inject() {
            try {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                field.set(instance, value);
                injected = true;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Test class with a field to inject into
    private static class TestClass {
        private String fieldToInject;
        private Integer primitiveInt;
    }

    private Field findField(String name, Class<?> clazz) throws NoSuchFieldException {
        return clazz.getDeclaredField(name);
    }

    @Test
    public void testFilterCandidate_normalCase_injectsMock() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        MockCandidateFilter filter = new ConcreteMockCandidateFilter(true);
        Collection<Object> mocks = Arrays.asList((Object)"mockValue");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, testClass);

        assertNotNull("Injecter should not be null when filter decides to inject", injecter);
        // Actually test injection
        TestOngoingInjecter testInjecter = new TestOngoingInjecter(testClass, field, "mockValue");
        testInjecter.inject();
        assertEquals("mockValue", testClass.fieldToInject);
        assertTrue(testInjecter.isInjected());

        // But also test the original injecter's contract
        injecter.inject(); // Should not throw
    }

    @Test
    public void testFilterCandidate_emptyMocksList_returnsNull() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        MockCandidateFilter filter = new ConcreteMockCandidateFilter(true);
        Collection<Object> mocks = new ArrayList<Object>();

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, testClass);

        assertNull("Injecter should be null when mocks collection is empty", injecter);
    }

    @Test
    public void testFilterCandidate_nullField_returnsNull() {
        MockCandidateFilter filter = new ConcreteMockCandidateFilter(true);
        Collection<Object> mocks = Arrays.asList((Object)"mock");

        OngoingInjecter injecter = filter.filterCandidate(mocks, null, new TestClass());

        assertNull("Injecter should be null when field is null", injecter);
    }

    @Test
    public void testFilterCandidate_primitiveField_returnsNull() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("primitiveInt", TestClass.class);
        assertTrue("Test should have primitive field", field.getType().isPrimitive());
        MockCandidateFilter filter = new ConcreteMockCandidateFilter(true);
        Collection<Object> mocks = Arrays.asList((Object)4);

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, testClass);

        assertNull("Injecter should be null for primitive fields", injecter);
    }

    @Test
    public void testFilterCandidate_filterReturnsNull_returnsNull() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        MockCandidateFilter filter = new ConcreteMockCandidateFilter(false); // returns null even though conditions met
        Collection<Object> mocks = Arrays.asList((Object)"mock");

        OngoingInjecter injecter = filter.filterCandidate(mocks, field, testClass);

        assertNull("Injecter should be null when filter decides not to inject", injecter);
    }

    @Test
    public void testFilterCandidate_nullMocksArgument_returnsNullOrBehavior() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        // The mock itself handles null mocks by NPE, but our filter implementation checks for null explicitly
        // We'll test the interface contract with a different implementation that handles null
        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                assertNull("mocks should be null for this test", mocks);
                return null;
            }
        };

        OngoingInjecter injecter = filter.filterCandidate(null, field, testClass);

        assertNull(injecter);
    }

    @Test
    public void testFilterCandidate_withVariousMocksizes() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);

        // Test with 1 mock
        MockCandidateFilter filter1 = new ConcreteMockCandidateFilter(true);
        OngoingInjecter inj1 = filter1.filterCandidate(Arrays.asList((Object)"a"), field, testClass);
        assertNotNull("Should inject with 1 mock", inj1);

        // Test with many mocks
        MockCandidateFilter filterMany = new ConcreteMockCandidateFilter(true);
        List<Object> manyMocks = new ArrayList<Object>();
        manyMocks.add("a");
        manyMocks.add("b");
        manyMocks.add("c");
        OngoingInjecter injMany = filterMany.filterCandidate(manyMocks, field, testClass);
        assertNotNull("Should inject with many mocks", injMany);

        // Test with 100 mocks (many iterations)
        MockCandidateFilter filter100 = new ConcreteMockCandidateFilter(true);
        List<Object> hundredMocks = new ArrayList<Object>();
        for (int i = 0; i < 100; i++) {
            hundredMocks.add(new Object());
        }
        OngoingInjecter inj100 = filter100.filterCandidate(hundredMocks, field, testClass);
        assertNotNull("Should inject with 100 mocks", inj100);

        // Edge: boundary between 1 and 2 mocks
        MockCandidateFilter filter2 = new ConcreteMockCandidateFilter(true);
        OngoingInjecter inj2 = filter2.filterCandidate(Arrays.asList((Object)"a", new Object()), field, testClass);
        assertNotNull("Should inject with 2 mocks", inj2);
    }

    @Test
    public void testOngoingInjecter_inject_setsField() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        TestOngoingInjecter injecter = new TestOngoingInjecter(testClass, field, "injectedValue");

        assertFalse("Initially not injected", injecter.isInjected());
        injecter.inject();

        assertTrue("Should be marked as injected", injecter.isInjected());
        assertEquals("Field should have been set", "injectedValue", testClass.fieldToInject);
    }

    @Test
    public void testOngoingInjecter_inject_twice_modifiesField() throws Exception {
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        TestOngoingInjecter injecter = new TestOngoingInjecter(testClass, field, "firstValue");

        injecter.inject();
        assertEquals("firstValue", testClass.fieldToInject);
        assertEquals("Still marked as injected after first injection", true, injecter.isInjected());

        // Create a new injecter with same field but new value
        TestOngoingInjecter injecter2 = new TestOngoingInjecter(testClass, field, "secondValue");
        injecter2.inject();
        assertEquals("secondValue", testClass.fieldToInject);
    }

    @Test
    public void testFilterCandidate_interfaceDefaultBehavior_noInjectionWhenConditionsMet() throws Exception {
        // Test the default contract: when filter doesn't want injection, returns null
        TestClass testClass = new TestClass();
        Field field = findField("fieldToInject", TestClass.class);
        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                assertNotNull("mocks should not be null in normal flow", mocks);
                assertNotNull("field should not be null", fieldToBeInjected);
                assertNotNull("instance should not be null", fieldInstance);
                // choose not to inject
                return null;
            }
        };

        OngoingInjecter injecter = filter.filterCandidate(Arrays.asList((Object)"mock"), field, testClass);

        assertNull("Expected null when filter chooses not to inject", injecter);
    }
}