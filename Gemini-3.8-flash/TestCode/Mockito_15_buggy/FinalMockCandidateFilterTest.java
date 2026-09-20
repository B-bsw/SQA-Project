package org.mockito.internal.configuration.injection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;
    private SampleTarget target;
    private Field stringField;
    private Field integerField;

    private static class SampleTarget {
        public String sampleString;
        public Integer sampleInteger;
    }

    @Before
    public void setUp() throws Exception {
        filter = new FinalMockCandidateFilter();
        target = new SampleTarget();
        stringField = SampleTarget.class.getField("sampleString");
        integerField = SampleTarget.class.getField("sampleInteger");
    }

    @Test
    public void filterCandidate_givenEmptyMocksCollection_shouldReturnInjecterReturningFalse() {
        // Arrange
        Collection<Object> emptyMocks = new ArrayList<Object>();

        // Act
        OngoingInjecter injecter = filter.filterCandidate(emptyMocks, stringField, target);
        boolean injected = injecter.thenInject();

        // Assert
        Assert.assertFalse(injected);
        Assert.assertNull(target.sampleString);
    }

    @Test
    public void filterCandidate_givenMultipleMocksCollection_shouldReturnInjecterReturningFalse() {
        // Arrange
        Collection<Object> multipleMocks = new ArrayList<Object>();
        multipleMocks.add("firstMock");
        multipleMocks.add("secondMock");

        // Act
        OngoingInjecter injecter = filter.filterCandidate(multipleMocks, stringField, target);
        boolean injected = injecter.thenInject();

        // Assert
        Assert.assertFalse(injected);
        Assert.assertNull(target.sampleString);
    }

    @Test
    public void filterCandidate_givenSingleMatchingMock_shouldInjectAndReturnTrue() {
        // Arrange
        String mockValue = "injectedMockString";
        List<Object> singleMockList = new ArrayList<Object>();
        singleMockList.add(mockValue);

        // Act
        OngoingInjecter injecter = filter.filterCandidate(singleMockList, stringField, target);
        boolean injected = injecter.thenInject();

        // Assert
        Assert.assertTrue(injected);
        Assert.assertEquals(mockValue, target.sampleString);
    }

    @Test
    public void filterCandidate_givenSingleNullMockCandidate_shouldInjectNullAndReturnTrue() {
        // Arrange
        target.sampleString = "initialValue";
        List<Object> singleNullMockList = new ArrayList<Object>();
        singleNullMockList.add(null);

        // Act
        OngoingInjecter injecter = filter.filterCandidate(singleNullMockList, stringField, target);
        boolean injected = injecter.thenInject();

        // Assert
        Assert.assertTrue(injected);
        Assert.assertNull(target.sampleString);
    }

    @Test
    public void filterCandidate_givenSingleMockWithIncompatibleType_shouldThrowMockitoException() {
        // Arrange
        List<Object> incompatibleMockList = new ArrayList<Object>();
        incompatibleMockList.add("stringValueForIntegerField");

        OngoingInjecter injecter = filter.filterCandidate(incompatibleMockList, integerField, target);

        // Act & Assert
        try {
            injecter.thenInject();
            Assert.fail("Expected MockitoException to be thrown due to type mismatch");
        } catch (MockitoException e) {
            String expectedMessage = "Problems injecting dependency in " + integerField.getName();
            Assert.assertTrue(e.getMessage().indexOf(expectedMessage) != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void filterCandidate_givenSingleMockWithNullTargetInstance_shouldThrowMockitoException() {
        // Arrange
        List<Object> singleMockList = new ArrayList<Object>();
        singleMockList.add("injectedMock");

        OngoingInjecter injecter = filter.filterCandidate(singleMockList, stringField, null);

        // Act & Assert
        try {
            injecter.thenInject();
            Assert.fail("Expected MockitoException to be thrown due to null target instance");
        } catch (MockitoException e) {
            String expectedMessage = "Problems injecting dependency in " + stringField.getName();
            Assert.assertTrue(e.getMessage().indexOf(expectedMessage) != -1);
            Assert.assertNotNull(e.getCause());
        }
    }
}