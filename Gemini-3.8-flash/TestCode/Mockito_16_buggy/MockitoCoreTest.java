package org.mockito.internal;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.InOrder;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

import java.util.List;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        mockitoCore = new MockitoCore();
        mockitoCore.reset();
    }

    @Test
    public void mock_givenClassAndSettings_shouldReturnMockInstance() {
        // Arrange
        Class mockClass = List.class;
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        List result = (List) mockitoCore.mock(mockClass, settings);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test
    public void mock_givenBooleanOverload_shouldDelegateAndReturnMockInstance() {
        // Arrange
        Class mockClass = List.class;
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        List result = (List) mockitoCore.mock(mockClass, settings, true);

        // Assert
        Assert.assertNotNull(result);
    }

    @Test(expected = MockitoException.class)
    public void stub_givenNoOngoingStubbing_shouldThrowMissingMethodInvocationException() {
        // Act
        mockitoCore.stub();
    }

    @Test(expected = MockitoException.class)
    public void when_givenMethodCallWithoutStubbing_shouldThrowMissingMethodInvocationException() {
        // Act
        mockitoCore.when("someMethodCall");
    }

    @Test(expected = MockitoException.class)
    public void stub_deprecated_givenMethodCallWithoutStubbing_shouldThrowMissingMethodInvocationException() {
        // Act
        mockitoCore.stub("someMethodCall");
    }

    @Test(expected = MockitoException.class)
    public void verify_givenNullMock_shouldThrowNullInsteadOfMockException() {
        // Arrange
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
            }
        };

        // Act
        mockitoCore.verify(null, mode);
    }

    @Test(expected = MockitoException.class)
    public void verify_givenNonMockObject_shouldThrowNotAMockException() {
        // Arrange
        String nonMock = "notAMock";
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
            }
        };

        // Act
        mockitoCore.verify(nonMock, mode);
    }

    @Test
    public void verify_givenValidMock_shouldReturnSameMock() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());
        VerificationMode mode = new VerificationMode() {
            public void verify(VerificationData data) {
            }
        };

        // Act
        List result = (List) mockitoCore.verify(mock, mode);

        // Assert
        Assert.assertSame(mock, result);
    }

    @Test
    public void reset_givenValidMocks_shouldResetStateWithoutException() {
        // Arrange
        List mockOne = (List) mockitoCore.mock(List.class, new MockSettingsImpl());
        List mockTwo = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act & Assert
        mockitoCore.reset(new Object[] { mockOne, mockTwo });
    }

    @Test
    public void reset_givenEmptyVarArgs_shouldExecuteWithoutException() {
        // Act & Assert
        mockitoCore.reset(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_givenNullMocksArray_shouldThrowException() {
        // Act
        mockitoCore.verifyNoMoreInteractions((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_givenEmptyMocksArray_shouldThrowException() {
        // Act
        mockitoCore.verifyNoMoreInteractions(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_givenArrayWithNullElement_shouldThrowException() {
        // Act
        mockitoCore.verifyNoMoreInteractions(new Object[] { null });
    }

    @Test(expected = MockitoException.class)
    public void verifyNoMoreInteractions_givenNonMockObject_shouldThrowException() {
        // Act
        mockitoCore.verifyNoMoreInteractions(new Object[] { "nonMockString" });
    }

    @Test
    public void verifyNoMoreInteractions_givenValidMock_shouldExecuteSuccessfully() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act & Assert
        mockitoCore.verifyNoMoreInteractions(new Object[] { mock });
    }

    @Test(expected = MockitoException.class)
    public void inOrder_givenNullArray_shouldThrowException() {
        // Act
        mockitoCore.inOrder((Object[]) null);
    }

    @Test(expected = MockitoException.class)
    public void inOrder_givenEmptyArray_shouldThrowException() {
        // Act
        mockitoCore.inOrder(new Object[0]);
    }

    @Test(expected = MockitoException.class)
    public void inOrder_givenArrayWithNullElement_shouldThrowException() {
        // Act
        mockitoCore.inOrder(new Object[] { null });
    }

    @Test(expected = MockitoException.class)
    public void inOrder_givenNonMockObject_shouldThrowException() {
        // Act
        mockitoCore.inOrder(new Object[] { "nonMockString" });
    }

    @Test
    public void inOrder_givenValidMock_shouldReturnInOrderInstance() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        InOrder inOrder = mockitoCore.inOrder(new Object[] { mock });

        // Assert
        Assert.assertNotNull(inOrder);
    }

    @Test
    public void doAnswer_givenAnswer_shouldReturnStubber() {
        // Arrange
        Answer answer = new Answer() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return null;
            }
        };

        // Act
        Stubber stubber = mockitoCore.doAnswer(answer);

        // Assert
        Assert.assertNotNull(stubber);
    }

    @Test
    public void stubVoid_givenValidMock_shouldReturnVoidMethodStubbable() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        VoidMethodStubbable stubbable = mockitoCore.stubVoid(mock);

        // Assert
        Assert.assertNotNull(stubbable);
    }

    @Test
    public void validateMockitoUsage_givenCleanState_shouldNotThrowException() {
        // Act & Assert
        mockitoCore.validateMockitoUsage();
    }

    @Test(expected = NullPointerException.class)
    public void getLastInvocation_givenNoStubbing_shouldThrowNullPointerException() {
        // Act
        mockitoCore.getLastInvocation();
    }
}