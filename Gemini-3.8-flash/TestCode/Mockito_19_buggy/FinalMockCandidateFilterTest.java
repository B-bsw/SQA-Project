package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FinalMockCandidateFilterTest {

    private FinalMockCandidateFilter filter;

    public static class SampleTargetBean {
        private String value;
        private boolean setterInvoked = false;

        public void setValue(String value) {
            this.value = value;
            this.setterInvoked = true;
        }

        public String getValue() {
            return this.value;
        }

        public boolean isSetterInvoked() {
            return this.setterInvoked;
        }
    }

    public static class SampleTargetFieldOnly {
        private String value;

        public String getValue() {
            return this.value;
        }
    }

    public static class SampleTargetThrowingSetter {
        private String value;

        public void setValue(String value) {
            throw new RuntimeException("Simulated setter exception");
        }

        public String getValue() {
            return this.value;
        }
    }

    @Before
    public void setUp() {
        this.filter = new FinalMockCandidateFilter();
    }

    @Test
    public void filterCandidate_givenEmptyMocksCollection_shouldReturnNullOnThenInject() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        SampleTargetFieldOnly target = new SampleTargetFieldOnly();
        Field field = null;
        try {
            field = SampleTargetFieldOnly.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            Assert.fail("Failed to find field: " + e.getMessage());
        }

        // Act
        OngoingInjecter injecter = this.filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        // Assert
        Assert.assertNull("Injecter should return null when mock collection is empty", result);
        Assert.assertNull("Field should remain unassigned", target.getValue());
    }

    @Test
    public void filterCandidate_givenMultipleMocksCollection_shouldReturnNullOnThenInject() {
        // Arrange
        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("mockOne");
        mocks.add("mockTwo");
        SampleTargetFieldOnly target = new SampleTargetFieldOnly();
        Field field = null;
        try {
            field = SampleTargetFieldOnly.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            Assert.fail("Failed to find field: " + e.getMessage());
        }

        // Act
        OngoingInjecter injecter = this.filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        // Assert
        Assert.assertNull("Injecter should return null when mock collection contains more than 1 mock", result);
        Assert.assertNull("Field should remain unassigned", target.getValue());
    }

    @Test
    public void filterCandidate_givenSingleMockAndPropertySetterAvailable_shouldInjectUsingSetter() {
        // Arrange
        String mockInstance = "injectedValue";
        Collection<Object> mocks = Collections.singletonList((Object) mockInstance);
        SampleTargetBean target = new SampleTargetBean();
        Field field = null;
        try {
            field = SampleTargetBean.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            Assert.fail("Failed to find field: " + e.getMessage());
        }

        // Act
        OngoingInjecter injecter = this.filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        // Assert
        Assert.assertSame("Result should be the matching mock instance", mockInstance, result);
        Assert.assertTrue("Property setter should have been called", target.isSetterInvoked());
        Assert.assertEquals("Target value should match injected mock", mockInstance, target.getValue());
    }

    @Test
    public void filterCandidate_givenSingleMockAndNoSetter_shouldInjectDirectlyToField() {
        // Arrange
        String mockInstance = "directFieldValue";
        Collection<Object> mocks = Collections.singletonList((Object) mockInstance);
        SampleTargetFieldOnly target = new SampleTargetFieldOnly();
        Field field = null;
        try {
            field = SampleTargetFieldOnly.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            Assert.fail("Failed to find field: " + e.getMessage());
        }

        // Act
        OngoingInjecter injecter = this.filter.filterCandidate(mocks, field, target);
        Object result = injecter.thenInject();

        // Assert
        Assert.assertSame("Result should be the matching mock instance", mockInstance, result);
        Assert.assertEquals("Field value should match injected mock via FieldSetter", mockInstance, target.getValue());
    }

    @Test
    public void filterCandidate_givenSetterThrowsRuntimeException_shouldDelegateToReporter() {
        // Arrange
        String mockInstance = "errorMock";
        Collection<Object> mocks = Collections.singletonList((Object) mockInstance);
        SampleTargetThrowingSetter target = new SampleTargetThrowingSetter();
        Field field = null;
        try {
            field = SampleTargetThrowingSetter.class.getDeclaredField("value");
        } catch (NoSuchFieldException e) {
            Assert.fail("Failed to find field: " + e.getMessage());
        }

        OngoingInjecter injecter = this.filter.filterCandidate(mocks, field, target);

        // Act & Assert
        try {
            injecter.thenInject();
            Assert.fail("Expected RuntimeException from Reporter.cannotInjectDependency");
        } catch (RuntimeException e) {
            Assert.assertNotNull("Exception should have been reported", e);
        }
    }
}