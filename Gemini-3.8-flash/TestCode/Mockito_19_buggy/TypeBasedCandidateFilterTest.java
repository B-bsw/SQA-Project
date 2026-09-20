package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TypeBasedCandidateFilterTest {

    private static class SampleHost {
        public CharSequence charSequenceField;
        public String stringField;
        public Number numberField;
        public Integer integerField;
    }

    private static class CapturingMockCandidateFilter implements MockCandidateFilter {
        private Collection<Object> capturedMocks;
        private Field capturedField;
        private Object capturedFieldInstance;
        private OngoingInjecter injecterToReturn;

        public CapturingMockCandidateFilter() {
            this(null);
        }

        public CapturingMockCandidateFilter(OngoingInjecter injecterToReturn) {
            this.injecterToReturn = injecterToReturn;
        }

        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = field;
            this.capturedFieldInstance = fieldInstance;
            return this.injecterToReturn;
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
    }

    @Test
    public void filterCandidate_givenEmptyMocks_shouldPassEmptyListToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();
        Collection<Object> mocks = Collections.emptyList();

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertNotNull(next.getCapturedMocks());
        Assert.assertTrue(next.getCapturedMocks().isEmpty());
    }

    @Test
    public void filterCandidate_givenExactTypeMatch_shouldPassMatchingMockToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();
        String matchingMock = "exactMatchString";
        Collection<Object> mocks = Collections.<Object>singletonList(matchingMock);

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertNotNull(next.getCapturedMocks());
        Assert.assertEquals(1, next.getCapturedMocks().size());
        Assert.assertTrue(next.getCapturedMocks().contains(matchingMock));
    }

    @Test
    public void filterCandidate_givenSubclassTypeMatch_shouldPassMatchingMockToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("charSequenceField");
        SampleHost host = new SampleHost();
        String subClassMock = "subclassStringOfCharSequence";
        Collection<Object> mocks = Collections.<Object>singletonList(subClassMock);

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertNotNull(next.getCapturedMocks());
        Assert.assertEquals(1, next.getCapturedMocks().size());
        Assert.assertTrue(next.getCapturedMocks().contains(subClassMock));
    }

    @Test
    public void filterCandidate_givenNonMatchingTypes_shouldPassEmptyListToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();
        Integer nonMatchingMock1 = Integer.valueOf(123);
        Double nonMatchingMock2 = Double.valueOf(45.67);
        Collection<Object> mocks = Arrays.<Object>asList(nonMatchingMock1, nonMatchingMock2);

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertNotNull(next.getCapturedMocks());
        Assert.assertTrue(next.getCapturedMocks().isEmpty());
    }

    @Test
    public void filterCandidate_givenMixedMatchingAndNonMatchingMocks_shouldPassOnlyMatchingMocksToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("numberField");
        SampleHost host = new SampleHost();

        Integer matchingMock1 = Integer.valueOf(10);
        String nonMatchingMock = "nonMatchingString";
        Double matchingMock2 = Double.valueOf(20.5);
        Object nonMatchingObject = new Object();

        Collection<Object> mocks = Arrays.<Object>asList(matchingMock1, nonMatchingMock, matchingMock2, nonMatchingObject);

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertNotNull(next.getCapturedMocks());
        List<Object> capturedList = new ArrayList<Object>(next.getCapturedMocks());
        Assert.assertEquals(2, capturedList.size());
        Assert.assertSame(matchingMock1, capturedList.get(0));
        Assert.assertSame(matchingMock2, capturedList.get(1));
    }

    @Test
    public void filterCandidate_givenMultipleMatchingMocks_shouldPreserveOrderAndPassAllToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();

        String match1 = "first";
        String match2 = "second";
        String match3 = "third";
        Collection<Object> mocks = Arrays.<Object>asList(match1, match2, match3);

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        List<Object> capturedList = new ArrayList<Object>(next.getCapturedMocks());
        Assert.assertEquals(3, capturedList.size());
        Assert.assertSame(match1, capturedList.get(0));
        Assert.assertSame(match2, capturedList.get(1));
        Assert.assertSame(match3, capturedList.get(2));
    }

    @Test
    public void filterCandidate_givenFieldAndFieldInstance_shouldPassThemUntouchedToNext() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("integerField");
        SampleHost host = new SampleHost();
        Collection<Object> mocks = Collections.emptyList();

        // Act
        filter.filterCandidate(mocks, field, host);

        // Assert
        Assert.assertSame(field, next.getCapturedField());
        Assert.assertSame(host, next.getCapturedFieldInstance());
    }

    @Test
    public void filterCandidate_givenNextReturnsValue_shouldReturnSameOngoingInjecter() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter(null);
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();

        // Act
        OngoingInjecter result = filter.filterCandidate(Collections.emptyList(), field, host);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_givenNullMocksCollection_shouldThrowNullPointerException() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();

        // Act
        filter.filterCandidate(null, field, host);
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_givenNullField_shouldThrowNullPointerException() {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        SampleHost host = new SampleHost();
        Collection<Object> mocks = Collections.<Object>singletonList("sampleMock");

        // Act
        filter.filterCandidate(mocks, null, host);
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_givenCollectionContainingNull_shouldThrowNullPointerException() throws Exception {
        // Arrange
        CapturingMockCandidateFilter next = new CapturingMockCandidateFilter();
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(next);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();
        Collection<Object> mocks = Collections.singletonList((Object) null);

        // Act
        filter.filterCandidate(mocks, field, host);
    }

    @Test(expected = NullPointerException.class)
    public void filterCandidate_givenNullNext_shouldThrowNullPointerException() throws Exception {
        // Arrange
        TypeBasedCandidateFilter filter = new TypeBasedCandidateFilter(null);
        Field field = SampleHost.class.getField("stringField");
        SampleHost host = new SampleHost();
        Collection<Object> mocks = Collections.emptyList();

        // Act
        filter.filterCandidate(mocks, field, host);
    }
}