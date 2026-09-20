package org.mockito.internal.verification;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

/**
 * Complete JUnit Test Suite for VerificationOverTimeImpl.
 * Covers line, branch, and edge cases under Java 7 / JUnit 4 constraints.
 */
public class VerificationOverTimeImplTest {

    private static class TestTimer extends Timer {
        private final int maxLoops;
        private int currentLoop;

        public TestTimer(int maxLoops) {
            super(0L);
            this.maxLoops = maxLoops;
            this.currentLoop = 0;
        }

        public void start() {
            this.currentLoop = 0;
        }

        public boolean isCounting() {
            if (this.currentLoop < this.maxLoops) {
                this.currentLoop++;
                return true;
            }
            return false;
        }
    }

    private static class RecordingVerificationMode implements VerificationMode {
        private int callCount = 0;
        private int failUntilCount = 0;
        private AssertionError errorToThrow = null;

        public RecordingVerificationMode() {
        }

        public RecordingVerificationMode(int failUntilCount, AssertionError errorToThrow) {
            this.failUntilCount = failUntilCount;
            this.errorToThrow = errorToThrow;
        }

        public void verify(VerificationData data) {
            this.callCount++;
            if (this.callCount <= this.failUntilCount && this.errorToThrow != null) {
                if (this.errorToThrow instanceof MockitoAssertionError) {
                    throw (MockitoAssertionError) this.errorToThrow;
                } else if (this.errorToThrow instanceof ArgumentsAreDifferent) {
                    throw (ArgumentsAreDifferent) this.errorToThrow;
                } else {
                    throw this.errorToThrow;
                }
            }
        }

        public int getCallCount() {
            return this.callCount;
        }
    }

    private static class TestAtMost extends AtMost {
        public TestAtMost() {
            super(1);
        }
    }

    @Test
    public void constructor_givenFourArguments_shouldInitializeProperly() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();

        // Act
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(10L, 100L, delegate, true);

        // Assert
        Assert.assertEquals(10L, overTime.getPollingPeriod());
        Assert.assertEquals(100L, overTime.getDuration());
        Assert.assertSame(delegate, overTime.getDelegate());
    }

    @Test
    public void constructor_givenFiveArguments_shouldInitializeProperly() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();
        Timer timer = new Timer(50L);

        // Act
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(5L, 50L, delegate, false, timer);

        // Assert
        Assert.assertEquals(5L, overTime.getPollingPeriod());
        Assert.assertEquals(50L, overTime.getDuration());
        Assert.assertSame(delegate, overTime.getDelegate());
    }

    @Test
    public void verify_givenReturnOnSuccessTrueAndDelegateSucceedsFirstTime_shouldReturnImmediately() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();
        TestTimer timer = new TestTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(1, delegate.getCallCount());
    }

    @Test
    public void verify_givenReturnOnSuccessFalseAndDelegateSucceeds_shouldLoopUntilTimerStops() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();
        TestTimer timer = new TestTimer(3);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(3, delegate.getCallCount());
    }

    @Test
    public void verify_givenReturnOnSuccessTrueAndSucceedsOnSecondAttempt_shouldReturnImmediately() {
        // Arrange
        MockitoAssertionError error = new MockitoAssertionError("failure on first attempt");
        RecordingVerificationMode delegate = new RecordingVerificationMode(1, error);
        TestTimer timer = new TestTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(2, delegate.getCallCount());
    }

    @Test
    public void verify_givenMockitoAssertionErrorAndNeverSucceeds_shouldThrowLastErrorWhenTimerStops() {
        // Arrange
        MockitoAssertionError expectedError = new MockitoAssertionError("permanent failure");
        RecordingVerificationMode delegate = new RecordingVerificationMode(5, expectedError);
        TestTimer timer = new TestTimer(3);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        // Act & Assert
        try {
            overTime.verify(null);
            Assert.fail("Expected MockitoAssertionError was not thrown");
        } catch (MockitoAssertionError actualError) {
            Assert.assertSame(expectedError, actualError);
            Assert.assertEquals(3, delegate.getCallCount());
        }
    }

    @Test
    public void verify_givenArgumentsAreDifferentExceptionAndNeverSucceeds_shouldThrowLastErrorWhenTimerStops() {
        // Arrange
        ArgumentsAreDifferent expectedError = new ArgumentsAreDifferent("diff", "wanted", "actual");
        RecordingVerificationMode delegate = new RecordingVerificationMode(5, expectedError);
        TestTimer timer = new TestTimer(2);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        // Act & Assert
        try {
            overTime.verify(null);
            Assert.fail("Expected ArgumentsAreDifferent was not thrown");
        } catch (ArgumentsAreDifferent actualError) {
            Assert.assertSame(expectedError, actualError);
            Assert.assertEquals(2, delegate.getCallCount());
        }
    }

    @Test
    public void verify_givenAtMostDelegateAndMockitoAssertionError_shouldThrowImmediatelyWithoutRetrying() {
        // Arrange
        final MockitoAssertionError expectedError = new MockitoAssertionError("atMost failed");
        final int[] callCount = new int[]{0};
        AtMost atMostDelegate = new TestAtMost() {
            public void verify(VerificationData data) {
                callCount[0]++;
                throw expectedError;
            }
        };
        TestTimer timer = new TestTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(10L, 100L, atMostDelegate, true, timer);

        // Act & Assert
        try {
            overTime.verify(null);
            Assert.fail("Expected MockitoAssertionError to be rethrown immediately");
        } catch (MockitoAssertionError actualError) {
            Assert.assertSame(expectedError, actualError);
            Assert.assertEquals(1, callCount[0]);
        }
    }

    @Test
    public void verify_givenNoMoreInteractionsDelegateAndMockitoAssertionError_shouldThrowImmediatelyWithoutRetrying() {
        // Arrange
        final MockitoAssertionError expectedError = new MockitoAssertionError("noMoreInteractions failed");
        final int[] callCount = new int[]{0};
        NoMoreInteractions noMoreInteractionsDelegate = new NoMoreInteractions() {
            public void verify(VerificationData data) {
                callCount[0]++;
                throw expectedError;
            }
        };
        TestTimer timer = new TestTimer(5);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(10L, 100L, noMoreInteractionsDelegate, true, timer);

        // Act & Assert
        try {
            overTime.verify(null);
            Assert.fail("Expected MockitoAssertionError to be rethrown immediately");
        } catch (MockitoAssertionError actualError) {
            Assert.assertSame(expectedError, actualError);
            Assert.assertEquals(1, callCount[0]);
        }
    }

    @Test
    public void verify_givenTimerNeverCounts_shouldNotCallDelegateAndNotThrow() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();
        TestTimer timer = new TestTimer(0);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(0, delegate.getCallCount());
    }

    @Test
    public void verify_givenReturnOnSuccessFalseAndSucceedsOnLastAttempt_shouldClearErrorAndPass() {
        // Arrange
        MockitoAssertionError error = new MockitoAssertionError("error on first attempt");
        RecordingVerificationMode delegate = new RecordingVerificationMode(1, error);
        TestTimer timer = new TestTimer(2);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(2, delegate.getCallCount());
    }

    @Test
    public void canRecoverFromFailure_givenRegularVerificationMode_shouldReturnTrue() {
        // Arrange
        RecordingVerificationMode delegate = new RecordingVerificationMode();
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 10L, delegate, true);

        // Act
        boolean recoverable = overTime.canRecoverFromFailure(delegate);

        // Assert
        Assert.assertTrue(recoverable);
    }

    @Test
    public void canRecoverFromFailure_givenAtMostInstance_shouldReturnFalse() {
        // Arrange
        AtMost atMost = new TestAtMost();
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 10L, atMost, true);

        // Act
        boolean recoverable = overTime.canRecoverFromFailure(atMost);

        // Assert
        Assert.assertFalse(recoverable);
    }

    @Test
    public void canRecoverFromFailure_givenNoMoreInteractionsInstance_shouldReturnFalse() {
        // Arrange
        NoMoreInteractions noMoreInteractions = new NoMoreInteractions();
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(1L, 10L, noMoreInteractions, true);

        // Act
        boolean recoverable = overTime.canRecoverFromFailure(noMoreInteractions);

        // Assert
        Assert.assertFalse(recoverable);
    }

    @Test
    public void verify_givenThreadInterruptedDuringSleep_shouldCatchInterruptedExceptionAndContinue() {
        // Arrange
        MockitoAssertionError error = new MockitoAssertionError("error with interruption");
        RecordingVerificationMode delegate = new RecordingVerificationMode(1, error);
        TestTimer timer = new TestTimer(2);
        VerificationOverTimeImpl overTime = new VerificationOverTimeImpl(50L, 100L, delegate, true, timer);

        // Pre-interrupt the current thread so sleep triggers InterruptedException
        Thread.currentThread().interrupt();

        // Act
        overTime.verify(null);

        // Assert
        Assert.assertEquals(2, delegate.getCallCount());
        // Clear interrupt flag in case it was re-set
        Thread.interrupted();
    }
}