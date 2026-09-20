package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NameBasedCandidateFilterTest {

    private FakeMockCandidateFilter nextFilter;
    private NameBasedCandidateFilter filter;
    private OngoingInjecter fakeInjecter;
    private Field sampleField;
    private SampleTarget sampleTarget;

    private static class SampleTarget {
        public Object testField;
        public Object anotherField;
    }

    private static class FakeOngoingInjecter implements OngoingInjecter {
        private final Object injectedResult;

        public FakeOngoingInjecter(Object injectedResult) {
            this.injectedResult = injectedResult;
        }

        public Object thenInject() {
            return injectedResult;
        }
    }

    private static class FakeMockCandidateFilter implements MockCandidateFilter {
        private Collection<Object> capturedMocks;
        private Field capturedField;
        private Object capturedFieldInstance;
        private int callCount = 0;
        private final OngoingInjecter returnInjecter;

        public FakeMockCandidateFilter(OngoingInjecter returnInjecter) {
            this.returnInjecter = returnInjecter;
        }

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            this.callCount++;
            return returnInjecter;
        }

        public Collection<Object> getCapturedMocks() {
            return capturedMocks;
        }

        public Field getCapturedField() {
            return capturedField;
        }

        public Object getCapturedFieldInstance() {
            return capturedFieldInstance;
        }

        public int getCallCount() {
            return callCount;
        }
    }

    @Before
    public void setUp() throws Exception {
        fakeInjecter = new FakeOngoingInjecter(new Object());
        nextFilter = new FakeMockCandidateFilter(fakeInjecter);
        filter = new NameBasedCandidateFilter(nextFilter);
        sampleTarget = new SampleTarget();
        sampleField = SampleTarget.class.getDeclaredField("testField");
    }

    @Test
    public void filterCandidate_givenEmptyMocks_shouldDelegateDirectlyToNextFilter() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, sampleTarget);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertSame(mocks, nextFilter.getCapturedMocks());
        Assert.assertTrue(nextFilter.getCapturedMocks().isEmpty());
        Assert.assertSame(sampleField, nextFilter.getCapturedField());
        Assert.assertSame(sampleTarget, nextFilter.getCapturedFieldInstance());
    }

    @Test
    public void filterCandidate_givenSingleMock_shouldDelegateDirectlyToNextFilterWithoutNameFiltering() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        Object singleCandidate = new Object();
        mocks.add(singleCandidate);

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, sampleTarget);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertSame(mocks, nextFilter.getCapturedMocks());
        Assert.assertEquals(1, nextFilter.getCapturedMocks().size());
        Assert.assertTrue(nextFilter.getCapturedMocks().contains(singleCandidate));
        Assert.assertSame(sampleField, nextFilter.getCapturedField());
        Assert.assertSame(sampleTarget, nextFilter.getCapturedFieldInstance());
    }

    @Test
    public void filterCandidate_givenUnmodifiableEmptyMocks_shouldDelegateToNextFilterSuccessfully() {
        // Arrange
        Collection<Object> mocks = Collections.emptyList();

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, sampleTarget);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertSame(mocks, nextFilter.getCapturedMocks());
        Assert.assertEquals(0, nextFilter.getCapturedMocks().size());
    }

    @Test
    public void filterCandidate_givenUnmodifiableSingleMock_shouldDelegateToNextFilterSuccessfully() {
        // Arrange
        Object singleMock = new Object();
        Collection<Object> mocks = Collections.singletonList(singleMock);

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, sampleTarget);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertSame(mocks, nextFilter.getCapturedMocks());
        Assert.assertEquals(1, nextFilter.getCapturedMocks().size());
        Assert.assertSame(singleMock, nextFilter.getCapturedMocks().iterator().next());
    }

    @Test
    public void filterCandidate_givenNullMocks_shouldThrowNullPointerException() {
        // Arrange
        Collection<Object> mocks = null;

        // Act & Assert
        try {
            filter.filterCandidate(mocks, sampleField, sampleTarget);
            Assert.fail("Expected NullPointerException when mocks collection is null");
        } catch (NullPointerException e) {
            Assert.assertEquals(0, nextFilter.getCallCount());
        }
    }

    @Test
    public void filterCandidate_givenNullNextFilterAndSingleMock_shouldThrowNullPointerException() {
        // Arrange
        NameBasedCandidateFilter filterWithNullNext = new NameBasedCandidateFilter(null);
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        // Act & Assert
        try {
            filterWithNullNext.filterCandidate(mocks, sampleField, sampleTarget);
            Assert.fail("Expected NullPointerException when next filter is null");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void filterCandidate_givenNullNextFilterAndEmptyMocks_shouldThrowNullPointerException() {
        // Arrange
        NameBasedCandidateFilter filterWithNullNext = new NameBasedCandidateFilter(null);
        Collection<Object> mocks = new ArrayList<Object>();

        // Act & Assert
        try {
            filterWithNullNext.filterCandidate(mocks, sampleField, sampleTarget);
            Assert.fail("Expected NullPointerException when next filter is null on empty mocks");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void filterCandidate_givenNullFieldInstance_withSingleMock_shouldPassNullInstanceToNext() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, sampleField, null);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertNull(nextFilter.getCapturedFieldInstance());
        Assert.assertSame(sampleField, nextFilter.getCapturedField());
    }

    @Test
    public void filterCandidate_givenNullField_withSingleMock_shouldPassNullFieldToNext() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, null, sampleTarget);

        // Assert
        Assert.assertEquals(1, nextFilter.getCallCount());
        Assert.assertSame(fakeInjecter, result);
        Assert.assertNull(nextFilter.getCapturedField());
        Assert.assertSame(sampleTarget, nextFilter.getCapturedFieldInstance());
    }

    @Test
    public void filterCandidate_givenMultipleNonMockObjects_shouldThrowRuntimeExceptionFromMockUtil() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());
        mocks.add(new Object());

        // Act & Assert
        try {
            filter.filterCandidate(mocks, sampleField, sampleTarget);
            Assert.fail("Expected RuntimeException when plain objects are processed by MockUtil in size > 1 branch");
        } catch (RuntimeException expected) {
            // MockUtil throws a RuntimeException (e.g. NotAMockException) when encountering non-mock instances
            Assert.assertEquals(0, nextFilter.getCallCount());
        }
    }

    @Test
    public void filterCandidate_givenMultipleMocksContainingNull_shouldThrowRuntimeExceptionOrNullPointerException() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(null);
        mocks.add(null);

        // Act & Assert
        try {
            filter.filterCandidate(mocks, sampleField, sampleTarget);
            Assert.fail("Expected Exception when null objects are passed to MockUtil in size > 1 branch");
        } catch (RuntimeException expected) {
            Assert.assertEquals(0, nextFilter.getCallCount());
        }
    }

    @Test
    public void filterCandidate_givenNextFilterReturnsNullInjecter_shouldReturnNull() {
        // Arrange
        FakeMockCandidateFilter filterReturningNull = new FakeMockCandidateFilter(null);
        NameBasedCandidateFilter candidateFilter = new NameBasedCandidateFilter(filterReturningNull);
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new Object());

        // Act
        OngoingInjecter result = candidateFilter.filterCandidate(mocks, sampleField, sampleTarget);

        // Assert
        Assert.assertEquals(1, filterReturningNull.getCallCount());
        Assert.assertNull(result);
    }
}