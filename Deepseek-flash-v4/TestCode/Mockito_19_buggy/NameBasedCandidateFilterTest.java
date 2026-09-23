package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NameBasedCandidateFilterTest {

    private static class MockCandidateFilterStub implements MockCandidateFilter {
        private Collection<Object> lastMocks;
        private Field lastField;
        private Object lastFieldInstance;
        private OngoingInjecter result = new OngoingInjecterStub();

        @Override
        public OngoingInjecter filterCandidate(Collection<Object> mocks, Field field, Object fieldInstance) {
            this.lastMocks = mocks;
            this.lastField = field;
            this.lastFieldInstance = fieldInstance;
            return result;
        }
    }

    private static class OngoingInjecterStub implements OngoingInjecter {
        // Empty stub
    }

    private static class TestObject {
        private String myField;
        private Integer otherField;
        private Long thirdField;
        @SuppressWarnings("unused")
        private String unMatchingField;
    }

    private MockCandidateFilterStub nextStub;
    private NameBasedCandidateFilter filter;
    private Field stringField;
    private Field integerField;
    private Field longField;
    private Field unMatchingField;

    @Before
    public void setUp() throws Exception {
        nextStub = new MockCandidateFilterStub();
        filter = new NameBasedCandidateFilter(nextStub);
        
        TestObject testObj = new TestObject();
        stringField = TestObject.class.getDeclaredField("myField");
        integerField = TestObject.class.getDeclaredField("otherField");
        longField = TestObject.class.getDeclaredField("thirdField");
        unMatchingField = TestObject.class.getDeclaredField("unMatchingField");
    }

    @After
    public void tearDown() {
        nextStub = null;
        filter = null;
        stringField = null;
        integerField = null;
        longField = null;
        unMatchingField = null;
    }

    @Test
    public void testFilterCandidate_WithSingleMock_PassesThroughToNext() throws Exception {
        // Setup a mock with name "myField"
        Object mock = createMockWithName("myField");
        Collection<Object> mocks = Collections.singletonList(mock);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertSame(mocks, nextStub.lastMocks);
        Assert.assertSame(stringField, nextStub.lastField);
        Assert.assertNotNull(nextStub.lastFieldInstance);
    }

    @Test
    public void testFilterCandidate_WithMultipleMocks_OneNameMatch() throws Exception {
        // Setup mocks with mixed names
        Object matchingMock = createMockWithName("myField");
        Object nonMatchingMock1 = createMockWithName("otherField");
        Object nonMatchingMock2 = createMockWithName("thirdField");
        Collection<Object> mocks = Arrays.asList(matchingMock, nonMatchingMock1, nonMatchingMock2);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        Assert.assertEquals(1, nextStub.lastMocks.size());
        Assert.assertTrue(nextStub.lastMocks.contains(matchingMock));
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithMultipleMocks_AllNameMatches() throws Exception {
        // Setup mocks where both match the field name
        Object mock1 = createMockWithName("myField");
        Object mock2 = createMockWithName("myField");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        Assert.assertEquals(2, nextStub.lastMocks.size());
        Assert.assertTrue(nextStub.lastMocks.containsAll(mocks));
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithMultipleMocks_NoNameMatch() throws Exception {
        // Setup mocks where none match the field name
        Object mock1 = createMockWithName("wrong1");
        Object mock2 = createMockWithName("wrong2");
        Collection<Object> mocks = Arrays.asList(mock1, mock2);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        Assert.assertEquals(0, nextStub.lastMocks.size());
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithEmptyMocks() throws Exception {
        Collection<Object> mocks = Collections.emptyList();
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertSame(mocks, nextStub.lastMocks);
        Assert.assertSame(stringField, nextStub.lastField);
        Assert.assertNotNull(nextStub.lastFieldInstance);
    }

    @Test
    public void testFilterCandidate_WithNullMocks() throws Exception {
        // When
        OngoingInjecter result = filter.filterCandidate(null, stringField, new TestObject());
        
        // Then - should not throw NPE, just pass through
        Assert.assertSame(nextStub.result, result);
        Assert.assertNull(nextStub.lastMocks);
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithMultipleMocks_MixedNameMatchesAndNonMatches() throws Exception {
        Object matchingMock1 = createMockWithName("myField");
        Object matchingMock2 = createMockWithName("myField");
        Object nonMatchingMock1 = createMockWithName("otherField");
        Object nonMatchingMock2 = createMockWithName("thirdField");
        Collection<Object> mocks = Arrays.asList(matchingMock1, nonMatchingMock1, matchingMock2, nonMatchingMock2);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        Assert.assertEquals(2, nextStub.lastMocks.size());
        Assert.assertTrue(nextStub.lastMocks.containsAll(Arrays.asList(matchingMock1, matchingMock2)));
        Assert.assertFalse(nextStub.lastMocks.containsAll(Arrays.asList(nonMatchingMock1, nonMatchingMock2)));
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithSameMockNameButDifferentCase() throws Exception {
        Object mockWithUppercase = createMockWithName("MyField");
        Object mockWithLowercase = createMockWithName("myfield");
        Collection<Object> mocks = Arrays.asList(mockWithUppercase, mockWithLowercase);
        
        // When - field name is "myField", case-sensitive match should not match
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        Assert.assertEquals(0, nextStub.lastMocks.size());
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithNullFieldInstance() throws Exception {
        Object mock = createMockWithName("myField");
        Collection<Object> mocks = Collections.singletonList(mock);
        
        // When
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, null);
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertSame(mocks, nextStub.lastMocks);
        Assert.assertSame(stringField, nextStub.lastField);
        Assert.assertNull(nextStub.lastFieldInstance);
    }

    @Test
    public void testFilterCandidate_WithNullMocksAndNullField() throws Exception {
        OngoingInjecter result = filter.filterCandidate(null, null, null);
        
        Assert.assertSame(nextStub.result, result);
        Assert.assertNull(nextStub.lastMocks);
        Assert.assertNull(nextStub.lastField);
        Assert.assertNull(nextStub.lastFieldInstance);
    }

    @Test
    public void testFilterCandidate_WithEmptyMocksAndNullField() throws Exception {
        Collection<Object> mocks = Collections.emptyList();
        
        OngoingInjecter result = filter.filterCandidate(mocks, null, new TestObject());
        
        Assert.assertSame(nextStub.result, result);
        Assert.assertSame(mocks, nextStub.lastMocks);
        Assert.assertNull(nextStub.lastField);
        Assert.assertNotNull(nextStub.lastFieldInstance);
    }

    @Test
    public void testFilterCandidate_WithMultipleMocksAndHashCodeNameMatch() throws Exception {
        // Test that hashCode is not used for name comparison
        Object mock = createMockWithName("hashCodeOverride");
        Collection<Object> mocks = Collections.singletonList(mock);
        
        // When - field name is "myField", mock name is "hashCodeOverride", no match expected
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertSame(mocks, nextStub.lastMocks);
        Assert.assertSame(stringField, nextStub.lastField);
    }

    @Test
    public void testFilterCandidate_WithNameEqualsNull() throws Exception {
        // Create a mock whose getMockName returns null
        Object mock = new Object() {
            @Override
            public String toString() {
                return null;
            }
        };
        
        // Force the mockUtil to return a MockName that returns null for toString
        Collection<Object> mocks = Arrays.asList(mock, createMockWithName("other"));
        
        // When - should not throw NPE even with null name
        OngoingInjecter result = filter.filterCandidate(mocks, stringField, new TestObject());
        
        // Then
        Assert.assertSame(nextStub.result, result);
        Assert.assertNotNull(nextStub.lastMocks);
        // Only the "other" mock might match if field name is "otherField"
    }

    private Object createMockWithName(final String name) {
        return new Object() {
            @Override
            public String toString() {
                return name;
            }
            
            @Override
            public boolean equals(Object obj) {
                if (this == obj) return true;
                if (obj == null || getClass() != obj.getClass()) return false;
                return name.equals(toString());
            }
            
            @Override
            public int hashCode() {
                return name.hashCode();
            }
        };
    }
}