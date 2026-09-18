package org.mockito.internal.configuration.injection.filter;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class NameBasedCandidateFilterTest {

    static class SampleFieldHolder {
        Object myField;
        Object otherField;
    }

    private MockCandidateFilter nextFilter;
    private OngoingInjecter dummyInjecter;
    private NameBasedCandidateFilter filter;

    private Collection<Object> capturedMocks;
    private Field capturedField;
    private Object capturedFieldInstance;

    @Before
    public void setUp() {
        dummyInjecter = new OngoingInjecter() {
            public Object inject() {
                return null;
            }
        };

        nextFilter = new MockCandidateFilter() {
            public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
                capturedMocks = mocks;
                capturedField = field;
                capturedFieldInstance = fieldInstance;
                return dummyInjecter;
            }
        };

        filter = new NameBasedCandidateFilter(nextFilter);
    }

    private Field getField(String name) throws NoSuchFieldException {
        return SampleFieldHolder.class.getDeclaredField(name);
    }

    @Test
    public void shouldDelegateToNextWhenMocksCollectionIsEmpty() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>();
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        assertSame(dummyInjecter, result);
        assertSame(mocks, capturedMocks);
        assertTrue(capturedMocks.isEmpty());
        assertSame(field, capturedField);
        assertSame(fieldInstance, capturedFieldInstance);
    }

    @Test
    public void shouldDelegateToNextWhenMocksCollectionHasOneElement() throws Exception {
        Object mockObj = mock(Object.class, "myField");
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mockObj);
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        assertSame(dummyInjecter, result);
        assertSame(mocks, capturedMocks);
        assertEquals(1, capturedMocks.size());
        assertTrue(capturedMocks.contains(mockObj));
    }

    @Test
    public void shouldFilterByNameWhenMultipleMocksAndNoneMatch() throws Exception {
        Object mock1 = mock(Object.class, "otherName1");
        Object mock2 = mock(Object.class, "otherName2");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(capturedMocks);
        assertTrue(capturedMocks.isEmpty());
        assertSame(field, capturedField);
        assertSame(fieldInstance, capturedFieldInstance);
    }

    @Test
    public void shouldFilterByNameWhenMultipleMocksAndOneMatches() throws Exception {
        Object matchingMock = mock(Object.class, "myField");
        Object nonMatchingMock = mock(Object.class, "otherField");
        Collection<Object> mocks = Arrays.asList(matchingMock, nonMatchingMock);
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(capturedMocks);
        assertEquals(1, capturedMocks.size());
        assertTrue(capturedMocks.contains(matchingMock));
        assertFalse(capturedMocks.contains(nonMatchingMock));
        assertSame(field, capturedField);
        assertSame(fieldInstance, capturedFieldInstance);
    }

    @Test
    public void shouldFilterByNameWhenMultipleMocksAndMultipleMatch() throws Exception {
        Object matchingMock1 = mock(Object.class, "myField");
        Object matchingMock2 = mock(Object.class, "myField");
        Object nonMatchingMock = mock(Object.class, "otherField");
        Collection<Object> mocks = Arrays.asList(matchingMock1, matchingMock2, nonMatchingMock);
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        filter.filterCandidate(mocks, field, fieldInstance);

        assertNotNull(capturedMocks);
        assertEquals(2, capturedMocks.size());
        assertTrue(capturedMocks.contains(matchingMock1));
        assertTrue(capturedMocks.contains(matchingMock2));
        assertFalse(capturedMocks.contains(nonMatchingMock));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowWhenFieldIsNullAndMultipleMocksPresent() throws Exception {
        Object mock1 = mock(Object.class, "name1");
        Object mock2 = mock(Object.class, "name2");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);

        filter.filterCandidate(mocks, null, new SampleFieldHolder());
    }

    @Test
    public void shouldReturnResultFromNextFilterWhenMocksEmpty() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>();
        Field field = getField("myField");

        OngoingInjecter result = filter.filterCandidate(mocks, field, new SampleFieldHolder());

        assertSame(dummyInjecter, result);
    }

    @Test
    public void shouldPassNullFieldInstanceThroughToDelegate() throws Exception {
        Collection<Object> mocks = new ArrayList<Object>();
        Field field = getField("myField");

        OngoingInjecter result = filter.filterCandidate(mocks, field, null);

        assertSame(dummyInjecter, result);
        assertSame(field, capturedField);
        assertEquals(null, capturedFieldInstance);
    }

    @Test
    public void shouldPassFieldAndInstanceCorrectlyWhenSingleMockDoesNotMatchName() throws Exception {
        Object mockObj = mock(Object.class, "unrelatedName");
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mockObj);
        Field field = getField("myField");
        Object fieldInstance = new SampleFieldHolder();

        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        assertSame(dummyInjecter, result);
        assertSame(mocks, capturedMocks);
        assertEquals(1, capturedMocks.size());
    }
}