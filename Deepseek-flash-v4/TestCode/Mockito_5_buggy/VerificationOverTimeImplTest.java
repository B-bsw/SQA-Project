package org.mockito.internal.verification;

import org.junit.Test;
import org.junit.Before;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.verification.VerificationMode;
import org.mockito.internal.util.Timer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class VerificationOverTimeImplTest {

    private VerificationData mockData;
    private VerificationMode mockDelegate;
    private Timer mockTimer;
    private VerificationOverTimeImpl verification;

    @Before
    public void setUp() {
        mockData = Mockito.mock(VerificationData.class);
        mockDelegate = Mockito.mock(VerificationMode.class);
        mockTimer = Mockito.mock(Timer.class);
        verification = new VerificationOverTimeImpl(10, 100, mockDelegate, true, mockTimer);
    }

    @Test
    public void testConstructorWithTimer() {
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(5, 50, mockDelegate, false, mockTimer);
        assertEquals(5, impl.getPollingPeriod());
        assertEquals(50, impl.getDuration());
        assertSame(mockDelegate, impl.getDelegate());
    }

    @Test
    public void testVerifyReturnsImmediatelyOnSuccessWhenReturnOnSuccessTrue() {
        when(mockTimer.isCounting()).thenReturn(true, false);
        when(mockDelegate.verify(mockData)).thenReturn(null);
        
        verification.verify(mockData);
        
        verify(mockDelegate).verify(mockData);
        verify(mockTimer).start();
    }

    @Test
    public void testVerifyReturnsAfterDurationWhenReturnOnSuccessFalse() {
        verification = new VerificationOverTimeImpl(10, 100, mockDelegate, false, mockTimer);
        when(mockTimer.isCounting()).thenReturn(true, false);
        
        verification.verify(mockData);
        
        verify(mockDelegate).verify(mockData);
        verify(mockTimer).start();
    }

    @Test
    public void testVerifyThrowsWhenDelegateFailsAndCannotRecover() {
        VerificationMode atMostMock = mock(AtMost.class);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 100, atMostMock, true, mockTimer);
        
        when(mockTimer.isCounting()).thenReturn(true);
        doThrow(new MockitoAssertionError("fail")).when(atMostMock).verify(mockData);
        
        try {
            impl.verify(mockData);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            verify(mockTimer).start();
        }
    }

    @Test
    public void testVerifyThrowsAfterTimeoutWhenDelegateNeverSucceeds() {
        VerificationMode mockDelegate2 = mock(VerificationMode.class);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(10, 50, mockDelegate2, true, mockTimer);
        
        when(mockTimer.isCounting()).thenReturn(true, false);
        doThrow(new MockitoAssertionError("fail")).when(mockDelegate2).verify(mockData);
        
        try {
            impl.verify(mockData);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            verify(mockTimer).start();
        }
    }

    @Test
    public void testVerifyRecoversAndSucceedsOnSecondAttempt() {
        VerificationMode recoverableDelegate = mock(VerificationMode.class);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1, 100, recoverableDelegate, true, mockTimer);
        
        when(mockTimer.isCounting()).thenReturn(true, true, false);
        doThrow(new MockitoAssertionError("fail"))
            .doNothing()
            .when(recoverableDelegate).verify(mockData);
        
        impl.verify(mockData);
        
        verify(recoverableDelegate, times(2)).verify(mockData);
    }

    @Test
    public void testCanRecoverFromFailureTrueForRegularVerificationMode() {
        VerificationMode regularMode = mock(VerificationMode.class);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1, 1, regularMode, true, mockTimer);
        
        assertTrue(impl.canRecoverFromFailure(regularMode));
    }

    @Test
    public void testCanRecoverFromFailureFalseForAtMost() {
        AtMost atMost = mock(AtMost.class);
        assertFalse(verification.canRecoverFromFailure(atMost));
    }

    @Test
    public void testCanRecoverFromFailureFalseForNoMoreInteractions() {
        NoMoreInteractions noMore = mock(NoMoreInteractions.class);
        assertFalse(verification.canRecoverFromFailure(noMore));
    }

    @Test
    public void testGetters() {
        assertEquals(10, verification.getPollingPeriod());
        assertEquals(100, verification.getDuration());
        assertSame(mockDelegate, verification.getDelegate());
    }

    @Test
    public void testVerifyWithZeroPollingPeriod() {
        VerificationOverTimeImpl zeroPolling = new VerificationOverTimeImpl(0, 10, mockDelegate, true, mockTimer);
        when(mockTimer.isCounting()).thenReturn(false);
        
        zeroPolling.verify(mockData);
        
        verify(mockDelegate).verify(mockData);
    }

    @Test
    public void testVerifyThrowsArgumentsAreDifferentException() {
        VerificationMode recoverableDelegate = mock(VerificationMode.class);
        VerificationOverTimeImpl impl = new VerificationOverTimeImpl(1, 50, recoverableDelegate, true, mockTimer);
        
        when(mockTimer.isCounting()).thenReturn(true, false);
        doThrow(new org.mockito.exceptions.verification.junit.ArgumentsAreDifferent("diff", "expected", "actual", null))
            .when(recoverableDelegate).verify(mockData);
        
        try {
            impl.verify(mockData);
            fail("Expected ArgumentsAreDifferent");
        } catch (org.mockito.exceptions.verification.junit.ArgumentsAreDifferent e) {
            verify(mockTimer).start();
        }
    }
}