package org.mockito.internal.configuration.injection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    static class FieldHolder {
        private String name;
        private List<String> items;
    }

    @Before
    public void setUp() {
        filter = new FinalMockCandidateFilter();
    }

    @Test
    public void shouldInjectWhenOnlyOneMockCandidateMatches() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("name");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockedValue");

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();

        assertTrue(result);
        assertEquals("mockedValue", holder.name);
    }

    @Test
    public void shouldNotInjectWhenNoMockCandidateFound() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("name");

        Collection<Object> mocks = new ArrayList<Object>();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();

        assertFalse(result);
        assertNull(holder.name);
    }

    @Test
    public void shouldNotInjectWhenMultipleMockCandidatesFound() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("name");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("firstValue");
        mocks.add("secondValue");

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        assertNotNull(injecter);
        boolean result = injecter.thenInject();

        assertFalse(result);
        assertNull(holder.name);
    }

    @Test
    public void shouldThrowMockitoExceptionWhenInjectionFailsDueToTypeMismatch() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("name");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(Integer.valueOf(123));

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        assertNotNull(injecter);
        try {
            injecter.thenInject();
            fail("Expected MockitoException to be thrown");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Problems injecting dependency in name"));
        }
    }

    @Test
    public void shouldReturnFalseInjecterInstanceForEmptyMocksCollection() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("items");

        Collection<Object> mocks = new ArrayList<Object>();

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        assertNotNull(injecter);
        assertFalse(injecter.thenInject());
    }

    @Test
    public void shouldInjectSingleMockIntoCollectionTypedFieldWhenTypesMatch() throws Exception {
        FieldHolder holder = new FieldHolder();
        Field field = FieldHolder.class.getDeclaredField("items");

        List<String> mockList = new ArrayList<String>();
        mockList.add("elem");

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add(mockList);

        MockCandidateFilter.OngoingInjecter injecter = filter.filterCandidate(mocks, field, holder);

        boolean result = injecter.thenInject();

        assertTrue(result);
        assertSame(mockList, holder.items);
    }
}