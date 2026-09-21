package org.mockito.internal.verification;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.verification.junit.ArgumentsAreDifferent;
import org.mockito.internal.util.Timer;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;

public class VerificationOverTimeImplTest {

    private Timer timer;
    private VerificationMode delegate;
    private VerificationData data;

    @Before
    public void setUp() {
        timer = mock(Timer.class);
        delegate = mock(VerificationMode.class);
        data = mock(VerificationData.class);
    }

    @Test
    public void shouldExposeConstructorArguments() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(11L, 22L, delegate, true, timer);

        assertEquals(11L, impl.getPollingPeriod());
        assertEquals(22L, impl.getDuration());
        assertSame(delegate, impl.getDelegate());
    }

    @Test
    public void shouldReturnImmediatelyOnSuccess_whenReturnOnSuccessTrue() {
        when(timer.isCounting()).thenReturn(true);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        impl.verify(data);

        verify(delegate, times(1)).verify(data);
        verify(timer, times(1)).start();
    }

    @Test
    public void shouldLoopMultipleTimesAndSucceed_whenReturnOnSuccessFalse() {
        when(timer.isCounting()).thenReturn(true, true, false);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        impl.verify(data);

        verify(delegate, times(2)).verify(data);
    }

    @Test
    public void shouldNotCallDelegate_whenTimerNotCountingFromStart() {
        when(timer.isCounting()).thenReturn(false);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        impl.verify(data);

        verify(delegate, never()).verify(any(VerificationData.class));
    }

    @Test
    public void shouldRecoverFromFailureAndSucceedOnSecondAttempt() throws Exception {
        when(timer.isCounting()).thenReturn(true, true, false);

        MockitoAssertionError firstError = new MockitoAssertionError("first failure");
        doThrow(firstError).doNothing().when(delegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        impl.verify(data);

        verify(delegate, times(2)).verify(data);
    }

    @Test
    public void shouldThrowLastErrorAfterTimeout_whenDelegateNeverSucceeds() {
        when(timer.isCounting()).thenReturn(true, true, false);

        MockitoAssertionError persistentError = new MockitoAssertionError("always fails");
        doThrow(persistentError).when(delegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        try {
            impl.verify(data);
            fail("Expected MockitoAssertionError to be thrown");
        } catch (MockitoAssertionError e) {
            assertEquals("always fails", e.getMessage());
        }

        verify(delegate, times(2)).verify(data);
    }

    @Test
    public void shouldThrowImmediately_whenDelegateIsAtMostAndFails() {
        AtMost atMostDelegate = mock(AtMost.class);
        when(timer.isCounting()).thenReturn(true, true, false);

        MockitoAssertionError atMostError = new MockitoAssertionError("at most failure");
        doThrow(atMostError).when(atMostDelegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, atMostDelegate, false, timer);

        try {
            impl.verify(data);
            fail("Expected MockitoAssertionError to be thrown immediately");
        } catch (MockitoAssertionError e) {
            assertEquals("at most failure", e.getMessage());
        }

        verify(atMostDelegate, times(1)).verify(data);
    }

    @Test
    public void shouldThrowImmediately_whenDelegateIsNoMoreInteractionsAndFails() {
        NoMoreInteractions nmiDelegate = mock(NoMoreInteractions.class);
        when(timer.isCounting()).thenReturn(true, true, false);

        MockitoAssertionError nmiError = new MockitoAssertionError("no more interactions failure");
        doThrow(nmiError).when(nmiDelegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, nmiDelegate, false, timer);

        try {
            impl.verify(data);
            fail("Expected MockitoAssertionError to be thrown immediately");
        } catch (MockitoAssertionError e) {
            assertEquals("no more interactions failure", e.getMessage());
        }

        verify(nmiDelegate, times(1)).verify(data);
    }

    @Test
    public void shouldHandleArgumentsAreDifferentException_andRecover() {
        when(timer.isCounting()).thenReturn(true, true, false);

        ArgumentsAreDifferent argsDifferent = new ArgumentsAreDifferent("args differ", "wanted", "actual");
        doThrow(argsDifferent).doNothing().when(delegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        impl.verify(data);

        verify(delegate, times(2)).verify(data);
    }

    @Test
    public void shouldWorkWithNullVerificationData() {
        when(timer.isCounting()).thenReturn(true, false);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, true, timer);

        impl.verify(null);

        verify(delegate, times(1)).verify(null);
    }

    @Test
    public void shouldWorkWithRealTimer_usingSingleArgConstructor() {
        MockitoAssertionError firstFailure = new MockitoAssertionError("still failing");
        doThrow(firstFailure).doNothing().when(delegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10L, 200L, delegate, true);

        impl.verify(data);

        verify(delegate, atLeast(2)).verify(data);
        assertEquals(10L, impl.getPollingPeriod());
        assertEquals(200L, impl.getDuration());
        assertSame(delegate, impl.getDelegate());
    }

    @Test
    public void shouldResetErrorToNullOnEachSuccess_whenReturnOnSuccessFalse() {
        when(timer.isCounting()).thenReturn(true, true, true, false);

        MockitoAssertionError intermittentError = new MockitoAssertionError("intermittent failure");
        doNothing().doThrow(intermittentError).doNothing().when(delegate).verify(data);

        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1L, 100L, delegate, false, timer);

        impl.verify(data);

        verify(delegate, times(3)).verify(data);
    }
}