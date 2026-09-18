package org.mockito.internal.configuration.injection.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyCollection;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class TypeBasedCandidateFilterTest {

    interface Foo {}

    static class FooImpl implements Foo {}

    static class Bar {}

    static class FieldHolder {
        Foo fooField;
        List<Object> listField;
    }

    private MockCandidateFilter next;
    private TypeBasedCandidateFilter filter;

    @Before
    public void setUp() {
        next = mock(MockCandidateFilter.class);
        filter = new TypeBasedCandidateFilter(next);
    }

    @Test
    public void shouldFilterCandidate_normalCase_singleMatch() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("fooField");
        FooImpl matchingMock = new FooImpl();
        Bar nonMatchingMock = new Bar();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(matchingMock);
        mocks.add(nonMatchingMock);

        OngoingInjecter expected = mock(OngoingInjecter.class);
        when(next.filterCandidate(anyCollection(), eq(field), any())).thenReturn(expected);

        Object fieldInstance = new FieldHolder();
        OngoingInjecter result = filter.filterCandidate(mocks, field, fieldInstance);

        assertSame(expected, result);

        ArgumentCaptor<Collection> captor = ArgumentCaptor.forClass(Collection.class);
        verify(next).filterCandidate(captor.capture(), eq(field), eq(fieldInstance));

        Collection<Object> captured = captor.getValue();
        assertEquals(1, captured.size());
        assertTrue(captured.contains(matchingMock));
        assertFalse(captured.contains(nonMatchingMock));
    }

    @Test
    public void shouldFilterCandidate_emptyMocks_zeroLoopIterations() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("fooField");
        Collection<Object> mocks = new ArrayList<Object>();

        OngoingInjecter expected = mock(OngoingInjecter.class);
        when(next.filterCandidate(anyCollection(), eq(field), any())).thenReturn(expected);

        OngoingInjecter result = filter.filterCandidate(mocks, field, null);

        assertSame(expected, result);

        ArgumentCaptor<Collection> captor = ArgumentCaptor.forClass(Collection.class);
        verify(next).filterCandidate(captor.capture(), eq(field), (Object) isNull());
        assertTrue(captor.getValue().isEmpty());
    }

    @Test
    public void shouldFilterCandidate_multipleMatches_manyLoopIterations() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("fooField");
        FooImpl mock1 = new FooImpl();
        FooImpl mock2 = new FooImpl();
        Bar mock3 = new Bar();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mock1);
        mocks.add(mock2);
        mocks.add(mock3);

        OngoingInjecter expected = mock(OngoingInjecter.class);
        when(next.filterCandidate(anyCollection(), eq(field), any())).thenReturn(expected);

        Object fieldInstance = new FieldHolder();
        filter.filterCandidate(mocks, field, fieldInstance);

        ArgumentCaptor<Collection> captor = ArgumentCaptor.forClass(Collection.class);
        verify(next).filterCandidate(captor.capture(), eq(field), eq(fieldInstance));

        Collection<Object> captured = captor.getValue();
        assertEquals(2, captured.size());
        assertTrue(captured.contains(mock1));
        assertTrue(captured.contains(mock2));
        assertFalse(captured.contains(mock3));
    }

    @Test
    public void shouldFilterCandidate_singleMockOneLoopIteration_noMatch() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("fooField");
        Bar nonMatchingMock = new Bar();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(nonMatchingMock);

        OngoingInjecter expected = mock(OngoingInjecter.class);
        when(next.filterCandidate(anyCollection(), eq(field), any())).thenReturn(expected);

        filter.filterCandidate(mocks, field, null);

        ArgumentCaptor<Collection> captor = ArgumentCaptor.forClass(Collection.class);
        verify(next).filterCandidate(captor.capture(), eq(field), (Object) isNull());
        assertTrue(captor.getValue().isEmpty());
    }

    @Test
    public void shouldFilterCandidate_assignableSuperType_matches() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("listField");
        ArrayList<Object> mockList = new ArrayList<Object>();
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mockList);

        OngoingInjecter expected = mock(OngoingInjecter.class);
        when(next.filterCandidate(anyCollection(), eq(field), any())).thenReturn(expected);

        filter.filterCandidate(mocks, field, null);

        ArgumentCaptor<Collection> captor = ArgumentCaptor.forClass(Collection.class);
        verify(next).filterCandidate(captor.capture(), eq(field), (Object) isNull());
        assertEquals(1, captor.getValue().size());
        assertTrue(captor.getValue().contains(mockList));
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerException_whenFieldIsNull() {
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(new FooImpl());
        filter.filterCandidate(mocks, null, null);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullPointerException_whenMocksIsNull() throws Exception {
        Field field = FieldHolder.class.getDeclaredField("fooField");
        filter.filterCandidate(null, field, null);
    }
}