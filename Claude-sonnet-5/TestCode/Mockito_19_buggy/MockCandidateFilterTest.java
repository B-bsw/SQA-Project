package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

public class MockCandidateFilterTest {

    private static class DummyClass {
        private String someField;
        private Object anotherField;
    }

    private Field someField;
    private Field anotherField;
    private DummyClass dummyInstance;

    @Before
    public void setUp() throws Exception {
        someField = DummyClass.class.getDeclaredField("someField");
        anotherField = DummyClass.class.getDeclaredField("anotherField");
        dummyInstance = new DummyClass();
    }

    // A simple OngoingInjecter implementation used for verifying side effects
    private static class StubOngoingInjecter implements OngoingInjecter {
        private final Object result;
        private boolean invoked = false;

        StubOngoingInjecter(Object result) {
            this.result = result;
        }

        @Override
        public Object thenInject() {
            invoked = true;
            return result;
        }

        boolean wasInvoked() {
            return invoked;
        }
    }

    @Test
    public void shouldReturnOngoingInjecterForNormalCase() {
        final Object mockObject = new Object();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mockObject);

        final StubOngoingInjecter stubInjecter = new StubOngoingInjecter(mockObject);

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (!mocks.isEmpty()) {
                    return stubInjecter;
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, someField, dummyInstance);

        assertNotNull(result);
        Object injected = result.thenInject();
        assertEquals(mockObject, injected);
        assertEquals(true, stubInjecter.wasInvoked());
    }

    @Test
    public void shouldHandleEmptyMocksCollection() {
        Collection<Object> mocks = Collections.emptyList();

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (mocks.isEmpty()) {
                    return null;
                }
                return new StubOngoingInjecter(new Object());
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, someField, dummyInstance);

        assertNull(result);
    }

    @Test
    public void shouldHandleNullFieldInstance() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        final StubOngoingInjecter stubInjecter = new StubOngoingInjecter("injectedValue");

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (fieldInstance == null) {
                    return stubInjecter;
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, someField, null);

        assertNotNull(result);
        assertEquals("injectedValue", result.thenInject());
    }

    @Test
    public void shouldThrowExceptionWhenMocksIsNull() {
        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (mocks == null) {
                    throw new NullPointerException("mocks collection cannot be null");
                }
                return null;
            }
        };

        try {
            filter.filterCandidate(null, someField, dummyInstance);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            assertEquals("mocks collection cannot be null", e.getMessage());
        }
    }

    @Test
    public void shouldThrowExceptionWhenFieldToBeInjectedIsNull() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                if (fieldToBeInjected == null) {
                    throw new IllegalArgumentException("fieldToBeInjected cannot be null");
                }
                return null;
            }
        };

        try {
            filter.filterCandidate(mocks, null, dummyInstance);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("fieldToBeInjected cannot be null", e.getMessage());
        }
    }

    @Test
    public void shouldHandleSingleMockInCollection() {
        Object singleMock = new Object();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(singleMock);

        final StubOngoingInjecter stubInjecter = new StubOngoingInjecter(singleMock);

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                int count = 0;
                Object found = null;
                for (Object mock : mocks) {
                    count++;
                    found = mock;
                }
                if (count == 1) {
                    return stubInjecter;
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, anotherField, dummyInstance);

        assertNotNull(result);
        assertEquals(singleMock, result.thenInject());
    }

    @Test
    public void shouldHandleMultipleMocksInCollection() {
        List<Object> mocks = new ArrayList<Object>();
        Object mock1 = new Object();
        Object mock2 = new Object();
        Object mock3 = new Object();
        mocks.add(mock1);
        mocks.add(mock2);
        mocks.add(mock3);

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                int count = 0;
                for (Object mock : mocks) {
                    count++;
                }
                final int finalCount = count;
                return new StubOngoingInjecter(finalCount);
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, someField, dummyInstance);

        assertNotNull(result);
        assertEquals(3, result.thenInject());
    }

    @Test
    public void shouldReturnNullWhenNoCandidateMatchesFieldType() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("aStringMock");

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                for (Object mock : mocks) {
                    if (fieldToBeInjected.getType().isInstance(mock)) {
                        return new StubOngoingInjecter(mock);
                    }
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, anotherField, dummyInstance);

        assertNull(result);
    }

    @Test
    public void shouldReturnMatchingCandidateWhenTypeMatches() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("aStringValue");

        MockCandidateFilter filter = new MockCandidateFilter() {
            @Override
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field fieldToBeInjected, Object fieldInstance) {
                for (Object mock : mocks) {
                    if (fieldToBeInjected.getType().isInstance(mock)) {
                        return new StubOngoingInjecter(mock);
                    }
                }
                return null;
            }
        };

        OngoingInjecter result = filter.filterCandidate(mocks, someField, dummyInstance);

        assertNotNull(result);
        assertEquals("aStringValue", result.thenInject());
    }

    // A minimal OngoingInjecter interface stub for testing purposes.
    interface OngoingInjecter {
        Object thenInject();
    }
}