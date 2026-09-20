/*
 * Code Analysis & Test Matrix:
 * 1. Interface Signature Verification:
 *    - Verify MockCandidateFilter is an interface and public.
 *    - Verify filterCandidate method exists with exact signature: (Collection, Field, Object) -> OngoingInjecter.
 * 2. Contract Implementation & Execution Cases (AAA Pattern):
 *    - Happy Path:
 *      - filterCandidate_givenValidInputs_shouldReturnNonNullOngoingInjecter
 *      - filterCandidate_givenPopulatedMocks_shouldPassCorrectParametersToImplementation
 *    - Boundary & Edge Cases:
 *      - filterCandidate_givenEmptyMocksCollection_shouldExecuteSuccessfully
 *      - filterCandidate_givenNullMocksCollection_shouldAllowContractHandling
 *      - filterCandidate_givenNullFieldToBeInjected_shouldAllowContractHandling
 *      - filterCandidate_givenNullFieldInstance_shouldAllowContractHandling
 *    - Error & Exception Handling:
 *      - filterCandidate_givenFailingImplementation_shouldPropagateException
 */
package org.mockito.internal.configuration.injection.filter;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MockCandidateFilterTest {

    private static class DummyTarget {
        private String targetField;
    }

    private static class RecordingMockCandidateFilter implements MockCandidateFilter {
        private Collection<Object> capturedMocks;
        private Field capturedField;
        private Object capturedFieldInstance;
        private OngoingInjecter stubbedReturn;

        public RecordingMockCandidateFilter(OngoingInjecter stubbedReturn) {
            this.stubbedReturn = stubbedReturn;
        }

        public OngoingInjecter filterCandidate(
                Collection<Object> mocks,
                Field fieldToBeInjected,
                Object fieldInstance) {
            this.capturedMocks = mocks;
            this.capturedField = fieldToBeInjected;
            this.capturedFieldInstance = fieldInstance;
            return this.stubbedReturn;
        }
    }

    private static class ExceptionThrowingMockCandidateFilter implements MockCandidateFilter {
        private final RuntimeException exceptionToThrow;

        public ExceptionThrowingMockCandidateFilter(RuntimeException exceptionToThrow) {
            this.exceptionToThrow = exceptionToThrow;
        }

        public OngoingInjecter filterCandidate(
                Collection<Object> mocks,
                Field fieldToBeInjected,
                Object fieldInstance) {
            throw this.exceptionToThrow;
        }
    }

    private static class DummyOngoingInjecter implements OngoingInjecter {
        public Object thenInject() {
            return null;
        }
    }

    @Test
    public void interfaceStructure_shouldBePublicInterface() {
        // Arrange
        Class<MockCandidateFilter> clazz = MockCandidateFilter.class;

        // Act & Assert
        Assert.assertTrue("MockCandidateFilter must be an interface", clazz.isInterface());
        Assert.assertTrue("MockCandidateFilter must be public", Modifier.isPublic(clazz.getModifiers()));
    }

    @Test
    public void interfaceStructure_shouldDeclareFilterCandidateMethodWithExpectedSignature() throws Exception {
        // Arrange
        Class<MockCandidateFilter> clazz = MockCandidateFilter.class;

        // Act
        Method method = clazz.getMethod(
                "filterCandidate",
                new Class<?>[]{Collection.class, Field.class, Object.class}
        );

        // Assert
        Assert.assertNotNull("filterCandidate method must be declared", method);
        Assert.assertEquals("Return type must be OngoingInjecter", OngoingInjecter.class, method.getReturnType());
        Assert.assertTrue("Method must be public", Modifier.isPublic(method.getModifiers()));
        Assert.assertTrue("Method must be abstract", Modifier.isAbstract(method.getModifiers()));
    }

    @Test
    public void filterCandidate_givenValidInputs_shouldReturnNonNullOngoingInjecter() throws Exception {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        Collection<Object> mocks = new ArrayList<Object>();
        mocks.add("MockInstance1");
        mocks.add("MockInstance2");

        DummyTarget targetObject = new DummyTarget();
        Field targetField = DummyTarget.class.getDeclaredField("targetField");

        // Act
        OngoingInjecter actualInjecter = filter.filterCandidate(mocks, targetField, targetObject);

        // Assert
        Assert.assertNotNull("OngoingInjecter should not be null", actualInjecter);
        Assert.assertSame("Expected exact OngoingInjecter instance to be returned", expectedInjecter, actualInjecter);
        Assert.assertSame("Expected mocks collection to be passed through", mocks, filter.capturedMocks);
        Assert.assertSame("Expected field to be passed through", targetField, filter.capturedField);
        Assert.assertSame("Expected target instance to be passed through", targetObject, filter.capturedFieldInstance);
    }

    @Test
    public void filterCandidate_givenEmptyMocksCollection_shouldExecuteSuccessfully() throws Exception {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        Collection<Object> emptyMocks = Collections.emptyList();
        DummyTarget targetObject = new DummyTarget();
        Field targetField = DummyTarget.class.getDeclaredField("targetField");

        // Act
        OngoingInjecter result = filter.filterCandidate(emptyMocks, targetField, targetObject);

        // Assert
        Assert.assertSame("Result should match stubbed OngoingInjecter", expectedInjecter, result);
        Assert.assertNotNull("Captured mocks should not be null", filter.capturedMocks);
        Assert.assertTrue("Captured mocks collection should be empty", filter.capturedMocks.isEmpty());
    }

    @Test
    public void filterCandidate_givenNullMocksCollection_shouldAllowContractHandling() throws Exception {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        DummyTarget targetObject = new DummyTarget();
        Field targetField = DummyTarget.class.getDeclaredField("targetField");

        // Act
        OngoingInjecter result = filter.filterCandidate(null, targetField, targetObject);

        // Assert
        Assert.assertSame("Result should match stubbed OngoingInjecter", expectedInjecter, result);
        Assert.assertNull("Captured mocks parameter should be null", filter.capturedMocks);
        Assert.assertSame("Captured field should match", targetField, filter.capturedField);
        Assert.assertSame("Captured instance should match", targetObject, filter.capturedFieldInstance);
    }

    @Test
    public void filterCandidate_givenNullFieldToBeInjected_shouldAllowContractHandling() {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        Collection<Object> mocks = new ArrayList<Object>();
        Object targetObject = new Object();

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, null, targetObject);

        // Assert
        Assert.assertSame("Result should match stubbed OngoingInjecter", expectedInjecter, result);
        Assert.assertNull("Captured fieldToBeInjected parameter should be null", filter.capturedField);
        Assert.assertSame("Captured mocks should match", mocks, filter.capturedMocks);
        Assert.assertSame("Captured instance should match", targetObject, filter.capturedFieldInstance);
    }

    @Test
    public void filterCandidate_givenNullFieldInstance_shouldAllowContractHandling() throws Exception {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        Collection<Object> mocks = new ArrayList<Object>();
        Field targetField = DummyTarget.class.getDeclaredField("targetField");

        // Act
        OngoingInjecter result = filter.filterCandidate(mocks, targetField, null);

        // Assert
        Assert.assertSame("Result should match stubbed OngoingInjecter", expectedInjecter, result);
        Assert.assertNull("Captured fieldInstance parameter should be null", filter.capturedFieldInstance);
        Assert.assertSame("Captured mocks should match", mocks, filter.capturedMocks);
        Assert.assertSame("Captured field should match", targetField, filter.capturedField);
    }

    @Test
    public void filterCandidate_givenAllNullArguments_shouldAllowContractHandling() {
        // Arrange
        OngoingInjecter expectedInjecter = new DummyOngoingInjecter();
        RecordingMockCandidateFilter filter = new RecordingMockCandidateFilter(expectedInjecter);

        // Act
        OngoingInjecter result = filter.filterCandidate(null, null, null);

        // Assert
        Assert.assertSame("Result should match stubbed OngoingInjecter", expectedInjecter, result);
        Assert.assertNull("Captured mocks should be null", filter.capturedMocks);
        Assert.assertNull("Captured field should be null", filter.capturedField);
        Assert.assertNull("Captured instance should be null", filter.capturedFieldInstance);
    }

    @Test
    public void filterCandidate_givenFailingImplementation_shouldPropagateException() throws Exception {
        // Arrange
        IllegalArgumentException expectedException = new IllegalArgumentException("Invalid injection candidate");
        ExceptionThrowingMockCandidateFilter filter = new ExceptionThrowingMockCandidateFilter(expectedException);

        Collection<Object> mocks = new ArrayList<Object>();
        Field targetField = DummyTarget.class.getDeclaredField("targetField");
        DummyTarget targetObject = new DummyTarget();

        // Act & Assert
        try {
            filter.filterCandidate(mocks, targetField, targetObject);
            Assert.fail("Expected IllegalArgumentException to be propagated");
        } catch (IllegalArgumentException actualException) {
            Assert.assertSame("Propagated exception must match the thrown exception", expectedException, actualException);
        }
    }
}