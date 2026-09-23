package org.mockito.internal;

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
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;
    private Reporter reporter;
    private MockUtil mockUtil;
    private MockingProgress mockingProgress;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
        reporter = new Reporter();
        mockUtil = new MockUtil();
        mockingProgress = new ThreadSafeMockingProgress();
    }

    @After
    public void tearDown() {
        mockingProgress.reset();
        mockingProgress.resetOngoingStubbing();
    }

    // Test 1: mock() with valid class and default settings
    @Test
    public void testMockWithValidClass() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), true);
        assertNotNull(mockList);
        assertTrue(mockUtil.isMock(mockList));
    }

    // Test 2: mock() with null class should throw NullPointerException (indirectly)
    @Test(expected = NullPointerException.class)
    public void testMockWithNullClass() {
        mockitoCore.mock(null, new MockSettingsImpl(), true);
    }

    // Test 3: stub() returns null when no ongoing stubbing
    @Test
    public void testStubWithNoOngoingStubbing() {
        assertNull(mockitoCore.stub());
    }

    // Test 4: stub() with ongoing stubbing after when()
    @Test
    public void testStubWithOngoingStubbing() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        IOngoingStubbing stubbing = mockitoCore.stub();
        assertNotNull(stubbing);
    }

    // Test 5: stub(T methodCall) deprecated - returns DeprecatedOngoingStubbing
    @Test
    public void testStubDeprecated() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        DeprecatedOngoingStubbing<List<String>> stubbing = mockitoCore.stub(mockList.get(0));
        assertNotNull(stubbing);
    }

    // Test 6: when() with method call - normal case
    @Test
    public void testWhenWithMethodCall() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        OngoingStubbing<String> stubbing = mockitoCore.when(mockList.get(0));
        assertNotNull(stubbing);
    }

    // Test 7: verify() with null mock - should call reporter.nullPassedToVerify
    @Test(expected = NullPointerException.class)
    public void testVerifyWithNullMock() {
        mockitoCore.verify(null, mockingProgress.getVerificationMode());
    }

    // Test 8: verify() with non-mock object - should throw NotAMockException
    @Test(expected = NotAMockException.class)
    public void testVerifyWithNonMockObject() {
        String notMock = "not a mock";
        mockitoCore.verify(notMock, mockingProgress.getVerificationMode());
    }

    // Test 9: verify() with valid mock and mode
    @Test
    public void testVerifyWithValidMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        String result = mockitoCore.verify(mockList, mockingProgress.getVerificationMode());
        assertNotNull(result);
    }

    // Test 10: reset() with mocks - validates state and resets
    @Test
    public void testResetWithMocks() {
        List<String> mockList1 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        List<String> mockList2 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockitoCore.reset(mockList1, mockList2);
        assertTrue(mockUtil.isMock(mockList1));
        assertTrue(mockUtil.isMock(mockList2));
    }

    // Test 11: reset() with empty array - should cause no errors
    @Test
    public void testResetWithEmptyArray() {
        mockitoCore.reset();
    }

    // Test 12: verifyNoMoreInteractions() with empty mocks array
    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractionsWithEmptyMocks() {
        mockitoCore.verifyNoMoreInteractions();
    }

    // Test 13: verifyNoMoreInteractions() with null mocks array
    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractionsWithNullMocks() {
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    // Test 14: verifyNoMoreInteractions() with valid mocks
    @Test
    public void testVerifyNoMoreInteractionsWithValidMocks() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockitoCore.verifyNoMoreInteractions(mockList);
    }

    // Test 15: verifyNoMoreInteractions() with a mock that has interactions
    @Test
    public void testVerifyNoMoreInteractionsWithNonEmptyMocks() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockList.get(0);
        try {
            mockitoCore.verifyNoMoreInteractions(mockList);
            fail("Expected exception for unexpected interactions");
        } catch (RuntimeException e) {
            // Expected: verifyNoMoreInteractions should throw due to unexpected invocation
        }
    }

    // Test 16: inOrder() with empty array
    @Test(expected = RuntimeException.class)
    public void testInOrderWithEmptyArray() {
        mockitoCore.inOrder();
    }

    // Test 17: inOrder() with null array
    @Test(expected = RuntimeException.class)
    public void testInOrderWithNullArray() {
        mockitoCore.inOrder((Object[]) null);
    }

    // Test 18: inOrder() with valid mocks
    @Test
    public void testInOrderWithValidMocks() {
        List<String> mockList1 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        List<String> mockList2 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        InOrderImpl inOrder = (InOrderImpl) mockitoCore.inOrder(mockList1, mockList2);
        assertNotNull(inOrder);
    }

    // Test 19: doAnswer() with valid answer
    @Test
    public void testDoAnswerWithValidAnswer() {
        Answer<?> answer = new Answer<Void>() {
            public Void answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        };
        StubberImpl stubber = (StubberImpl) mockitoCore.doAnswer(answer);
        assertNotNull(stubber);
    }

    // Test 20: stubVoid() with valid mock
    @Test
    public void testStubVoidWithValidMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        VoidMethodStubbable<List<String>> stubbable = mockitoCore.stubVoid(mockList);
        assertNotNull(stubbable);
    }

    // Test 21: validateMockitoUsage() - should not throw
    @Test
    public void testValidateMockitoUsage() {
        mockitoCore.validateMockitoUsage();
    }

    // Test 22: getLastInvocation() with no stubbing - should throw exception
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastInvocationWithNoStubbing() {
        mockitoCore.getLastInvocation();
    }

    // Test 23: getLastInvocation() after stubbing
    @Test
    public void testGetLastInvocationWithStubbing() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        Invocation invocation = mockitoCore.getLastInvocation();
        assertNotNull(invocation);
    }

    // Test 24: verify() with mock that is a mock - validates isMock check
    @Test
    public void testVerifyWithIsMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        assertTrue(mockUtil.isMock(mockList));
        mockitoCore.verify(mockList, mockingProgress.getVerificationMode());
    }

    // Test 25: mock() with null MockSettings - should throw NullPointerException
    @Test(expected = NullPointerException.class)
    public void testMockWithNullSettings() {
        mockitoCore.mock(List.class, null, false);
    }

    // Test 26: reset() with a single mock that is not a mock object
    @Test
    public void testResetWithNonMockObject() {
        String notMock = "not a mock";
        try {
            mockitoCore.reset(notMock);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            // Expected
        }
    }

    // Test 27: verifyNoMoreInteractions() with a non-mock object
    @Test(expected = NotAMockException.class)
    public void testVerifyNoMoreInteractionsWithNonMock() {
        String notMock = "not a mock";
        mockitoCore.verifyNoMoreInteractions(notMock);
    }

    // Test 28: inOrder() with a non-mock object
    @Test(expected = NotAMockException.class)
    public void testInOrderWithNonMock() {
        String notMock = "not a mock";
        mockitoCore.inOrder(notMock);
    }

    // Test 29: stubVoid() with null mock - should throw NPE
    @Test(expected = NullPointerException.class)
    public void testStubVoidWithNullMock() {
        mockitoCore.stubVoid(null);
    }

    // Test 30: stub() when ongoing stubbing is cleared after reset
    @Test
    public void testStubAfterReset() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        mockitoCore.reset(mockList);
        assertNull(mockitoCore.stub());
    }

    // Test 31: Branch test for stub() - verification of null check when stubbing is not null
    @Test
    public void testStubWithOngoingStubbingNotNull() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        IOngoingStubbing stubbing = mockitoCore.stub();
        assertNotNull(stubbing);
    }

    // Test 32: Branch for when() - stubbingStarted method invocation
    @Test
    public void testWhenStubbingStarted() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        OngoingStubbing<String> stubbing = mockitoCore.when(mockList.get(0));
        assertNotNull(stubbing);
    }

    // Test 33: Branch for verify() - isMock false path
    @Test(expected = NotAMockException.class)
    public void testVerifyNotMock() {
        String notMock = "not a mock";
        mockitoCore.verify(notMock, mockingProgress.getVerificationMode());
    }

    // Test 34: Branch for reset() - multiple mocks in array
    @Test
    public void testResetMultipleMocks() {
        List<String> mock1 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        List<String> mock2 = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockitoCore.reset(mock1, mock2);
        assertTrue(mockUtil.isMock(mock1));
        assertTrue(mockUtil.isMock(mock2));
    }

    // Test 35: Branch for verifyNoMoreInteractions - mock is not actually a mock
    @Test(expected = RuntimeException.class)
    public void testVerifyNoMoreInteractionsNotMock() {
        Object notMock = new Object();
        mockitoCore.verifyNoMoreInteractions(notMock);
    }

    // Test 36: Branch for inOrder - multiple mocks with null included
    @Test(expected = NullPointerException.class)
    public void testInOrderWithNullMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockitoCore.inOrder(mockList, null);
    }

    // Test 37: Branch for getLastInvocation - when no invocations exist
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLastInvocationNoInvocations() {
        mockitoCore.getLastInvocation();
    }

    // Test 38: Branch for doAnswer - validates stubbingStarted and resetOngoingStubbing
    @Test
    public void testDoAnswerBranch() {
        mockitoCore.doAnswer(new Answer<Void>() {
            public Void answer(org.mockito.invocation.InvocationOnMock invocation) {
                return null;
            }
        });
        // Should not throw exception
    }

    // Test 39: Branch for stubVoid - with mock that is null
    @Test(expected = NullPointerException.class)
    public void testStubVoidNullMockBranch() {
        mockitoCore.stubVoid(null);
    }

    // Test 40: Boundary test - reset() with no mocks (empty array)
    @Test
    public void testResetNoMocksBoundary() {
        mockitoCore.reset(new Object[0]);
    }

    // Test 41: Boundary test - stubVoid() with valid mock but mock not created via mock()
    @Test(expected = NotAMockException.class)
    public void testStubVoidNonMock() {
        String notMock = "not a mock";
        mockitoCore.stubVoid(notMock);
    }

    // Test 42: ensure mockutil is correct mock
    @Test
    public void testMockUtilIsMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        assertTrue(mockUtil.isMock(mockList));
    }

    // Test 43: test getLastInvocation after reset - should throw exception
    @Test(expected = RuntimeException.class)
    public void testGetLastInvocationAfterReset() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        when(mockList.get(0)).thenReturn("test");
        mockitoCore.reset(mockList);
        mockitoCore.getLastInvocation().getMethod();
    }

    // Test 44: test verifyNoMoreInteractions with mock that was reset
    @Test
    public void testVerifyNoMoreInteractionsResetMock() {
        List<String> mockList = mockitoCore.mock(List.class, new MockSettingsImpl(), false);
        mockitoCore.reset(mockList);
        mockitoCore.verifyNoMoreInteractions(mockList);
    }
}