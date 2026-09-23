package org.mockito.internal;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.VerificationDataImpl;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.internal.verification.api.VerificationDataInOrder;
import org.mockito.internal.verification.api.VerificationDataInOrderImpl;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;
import org.mockito.verification.VerificationMode;
import org.mockito.InOrder;
import org.mockito.internal.verification.api.VerificationDataInOrder;
import org.mockito.internal.verification.api.VerificationDataInOrderImpl;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;
    private MockingProgress originalMockingProgress;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
        originalMockingProgress = new ThreadSafeMockingProgress();
    }

    @After
    public void tearDown() {
        // Reset state if needed
    }

    @Test
    public void testMockWithValidSettings() {
        MockSettings settings = new MockSettingsImpl();
        Object mock = mockitoCore.mock(Runnable.class, settings);
        assertNotNull(mock);
        assertTrue(mock instanceof Runnable);
    }

    @Test
    public void testMockWithNullClassShouldNotThrowNullPointer() {
        try {
            mockitoCore.mock(null, new MockSettingsImpl());
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testStubWhenNoOngoingStubbingShouldResetAndThrowException() {
        // Simulate no ongoing stubbing
        try {
            mockitoCore.stub();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testStubWithMethodCallShouldStartStubbing() {
        // Create mock first to have ongoing stubbing
        Object mock = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        try {
            IOngoingStubbing stubbing = mockitoCore.stub();
            // After stubbing, return null because no method call on mock
            assertNull(stubbing);
        } catch (RuntimeException e) {
            // expected: missingMethodInvocation
        }
    }

    @Test
    public void testWhenShouldReturnOngoingStubbing() {
        Object mock = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        try {
            OngoingStubbing<?> stubbing = mockitoCore.when(null);
            assertNotNull(stubbing);
        } catch (RuntimeException e) {
            // expected: missingMethodInvocation
        }
    }

    @Test
    public void testVerifyWithNullMockShouldThrowException() {
        try {
            mockitoCore.verify(null, VerificationModeFactory.times(1));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testVerifyWithNonMockShouldThrowException() {
        Object notAMock = new Object();
        try {
            mockitoCore.verify(notAMock, VerificationModeFactory.times(1));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testVerifyWithValidMockAndMode() {
        Object mock = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        Object result = mockitoCore.verify(mock, VerificationModeFactory.times(0));
        assertEquals(mock, result);
    }

    @Test
    public void testResetWithMocksShouldNotThrow() {
        Object mock1 = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        Object mock2 = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        mockitoCore.reset(mock1, mock2);
    }

    @Test
    public void testResetWithNoMocksShouldNotThrow() {
        mockitoCore.reset();
    }

    @Test
    public void testVerifyNoMoreInteractionsWithEmptyMocksShouldThrow() {
        try {
            mockitoCore.verifyNoMoreInteractions();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithNullMockShouldThrow() {
        try {
            mockitoCore.verifyNoMoreInteractions((Object)null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithNonMockShouldThrow() {
        Object mock = new Object();
        try {
            mockitoCore.verifyNoMoreInteractions(mock);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithValidMock() {
        Object mock = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        try {
            mockitoCore.verifyNoMoreInteractions(mock);
        } catch (RuntimeException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsInOrderWithValidInput() {
        List<Object> mocks = Arrays.asList(mockitoCore.mock(Runnable.class, new MockSettingsImpl()));
        InOrderContext context = new InOrderContext() {
            @Override
            public boolean isVerified(Invocation invocation) {
                return false;
            }

            @Override
            public void markVerified(Invocation invocation) {
            }
        };
        mockitoCore.verifyNoMoreInteractionsInOrder(mocks, context);
    }

    @Test
    public void testInOrderWithNullMocksShouldThrow() {
        try {
            mockitoCore.inOrder((Object[])null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testInOrderWithEmptyMocksShouldThrow() {
        try {
            mockitoCore.inOrder();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testInOrderWithNullMockShouldThrow() {
        try {
            mockitoCore.inOrder((Object)null);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testInOrderWithNonMockShouldThrow() {
        try {
            mockitoCore.inOrder(new Object());
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // expected
        }
    }

    @Test
    public void testInOrderWithValidMocks() {
        Object mock1 = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        Object mock2 = mockitoCore.mock(Runnable.class, new MockSettingsImpl());
        InOrder inOrder = mockitoCore.inOrder(mock1, mock2);
        assertNotNull(inOrder);
    }

    @Test
    public void testDoAnswerShouldReturnStubber() {
        Answer answer = new Answer() {
            @Override
            public Object answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        Stubber stubber = mockitoCore.doAnswer(answer);
        assertNotNull(stubber);
    }

    @Test
    public void testStubVoidWithNullMockShouldThrowNullPointer() {
        try {
            mockitoCore.stubVoid(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testValidateMockitoUsageShouldNotThrow() {
        mockitoCore.validateMockitoUsage();
    }

    @Test
    public void testGetLastInvocationWithNoStubbing() {
        // No ongoing stubbing, should throw NullPointerException
        try {
            mockitoCore.getLastInvocation();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}