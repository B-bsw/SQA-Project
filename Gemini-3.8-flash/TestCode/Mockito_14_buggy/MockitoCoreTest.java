package org.mockito.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.InOrderContext;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;

public class MockitoCoreTest {

    private MockitoCore mockitoCore;

    @Before
    public void setUp() {
        new ThreadSafeMockingProgress().reset();
        this.mockitoCore = new MockitoCore();
    }

    @After
    public void tearDown() {
        new ThreadSafeMockingProgress().reset();
    }

    @Test
    public void mock_givenValidInterface_shouldReturnMockInstance() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        List mockList = (List) mockitoCore.mock(List.class, settings);

        // Assert
        Assert.assertNotNull(mockList);
    }

    @Test
    public void mock_givenValidClass_shouldReturnMockInstance() {
        // Arrange
        MockSettingsImpl settings = new MockSettingsImpl();

        // Act
        ArrayList mockArrayList = (ArrayList) mockitoCore.mock(ArrayList.class, settings);

        // Assert
        Assert.assertNotNull(mockArrayList);
    }

    @Test
    public void stub_givenNoOngoingStubbing_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.stub();
            Assert.fail("Expected exception when calling stub() without ongoing stubbing");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void stub_givenMethodCallWithNoStubbing_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.stub("methodCall");
            Assert.fail("Expected exception when stubbing without preceding method call");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void when_givenMethodCallWithNoStubbing_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.when("methodCall");
            Assert.fail("Expected exception when calling when() without preceding method call");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verify_givenNullMock_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.verify(null, VerificationModeFactory.times(1));
            Assert.fail("Expected exception when null passed to verify()");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verify_givenNonMockObject_shouldThrowException() {
        // Arrange
        String nonMock = "Not a mock";

        // Act & Assert
        try {
            mockitoCore.verify(nonMock, VerificationModeFactory.times(1));
            Assert.fail("Expected exception when non-mock passed to verify()");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verify_givenValidMock_shouldReturnMock() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        List returned = (List) mockitoCore.verify(mock, VerificationModeFactory.times(1));

        // Assert
        Assert.assertSame(mock, returned);
    }

    @Test
    public void reset_givenSingleMock_shouldResetWithoutError() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        mockitoCore.reset(new Object[] { mock });

        // Assert
        Assert.assertNotNull(mock);
    }

    @Test
    public void reset_givenMultipleMocks_shouldResetAll() {
        // Arrange
        List mock1 = (List) mockitoCore.mock(List.class, new MockSettingsImpl());
        List mock2 = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        mockitoCore.reset(new Object[] { mock1, mock2 });

        // Assert
        Assert.assertNotNull(mock1);
        Assert.assertNotNull(mock2);
    }

    @Test
    public void reset_givenEmptyArray_shouldNotThrowException() {
        // Arrange & Act
        mockitoCore.reset(new Object[0]);
    }

    @Test
    public void verifyNoMoreInteractions_givenNullArray_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.verifyNoMoreInteractions((Object[]) null);
            Assert.fail("Expected exception when null array passed to verifyNoMoreInteractions");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verifyNoMoreInteractions_givenEmptyArray_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.verifyNoMoreInteractions(new Object[0]);
            Assert.fail("Expected exception when empty array passed to verifyNoMoreInteractions");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verifyNoMoreInteractions_givenArrayWithNullElement_shouldThrowException() {
        // Arrange
        Object[] mocks = new Object[] { null };

        // Act & Assert
        try {
            mockitoCore.verifyNoMoreInteractions(mocks);
            Assert.fail("Expected exception when null element passed to verifyNoMoreInteractions");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verifyNoMoreInteractions_givenNonMock_shouldThrowException() {
        // Arrange
        Object[] mocks = new Object[] { "I am not a mock" };

        // Act & Assert
        try {
            mockitoCore.verifyNoMoreInteractions(mocks);
            Assert.fail("Expected exception when non-mock passed to verifyNoMoreInteractions");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void verifyNoMoreInteractions_givenValidMockWithoutInteractions_shouldPass() {
        // Arrange
        List mock = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act & Assert
        mockitoCore.verifyNoMoreInteractions(new Object[] { mock });
    }

    @Test
    public void verifyNoMoreInteractionsInOrder_givenEmptyList_shouldPass() {
        // Arrange
        List emptyList = new ArrayList();
        InOrderContext context = new InOrderContext() {
            public boolean isVerified(Invocation invocation) {
                return false;
            }
            public void markVerified(Invocation invocation) {
            }
        };

        // Act & Assert
        mockitoCore.verifyNoMoreInteractionsInOrder(emptyList, context);
    }

    @Test
    public void inOrder_givenNullArray_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.inOrder((Object[]) null);
            Assert.fail("Expected exception when null array passed to inOrder");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void inOrder_givenEmptyArray_shouldThrowException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.inOrder(new Object[0]);
            Assert.fail("Expected exception when empty array passed to inOrder");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void inOrder_givenArrayWithNullElement_shouldThrowException() {
        // Arrange
        Object[] mocks = new Object[] { null };

        // Act & Assert
        try {
            mockitoCore.inOrder(mocks);
            Assert.fail("Expected exception when array contains null passed to inOrder");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void inOrder_givenArrayWithNonMockElement_shouldThrowException() {
        // Arrange
        Object[] mocks = new Object[] { "NotAMockObject" };

        // Act & Assert
        try {
            mockitoCore.inOrder(mocks);
            Assert.fail("Expected exception when array contains non-mock passed to inOrder");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
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
    public void inOrder_givenMultipleValidMocks_shouldReturnInOrderInstance() {
        // Arrange
        List mock1 = (List) mockitoCore.mock(List.class, new MockSettingsImpl());
        List mock2 = (List) mockitoCore.mock(List.class, new MockSettingsImpl());

        // Act
        InOrder inOrder = mockitoCore.inOrder(new Object[] { mock1, mock2 });

        // Assert
        Assert.assertNotNull(inOrder);
    }

    @Test
    public void doAnswer_givenValidAnswer_shouldReturnStubber() {
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
    public void stubVoid_givenNonMock_shouldThrowException() {
        // Arrange
        String nonMock = "Not a mock";

        // Act & Assert
        try {
            mockitoCore.stubVoid(nonMock);
            Assert.fail("Expected exception when non-mock passed to stubVoid");
        } catch (RuntimeException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void validateMockitoUsage_givenCleanState_shouldPass() {
        // Arrange & Act
        mockitoCore.validateMockitoUsage();
    }

    @Test
    public void getLastInvocation_givenNoStubbing_shouldThrowNullPointerException() {
        // Arrange & Act & Assert
        try {
            mockitoCore.getLastInvocation();
            Assert.fail("Expected NullPointerException when pullOngoingStubbing returns null");
        } catch (NullPointerException expected) {
            // Success: ongoingStubbing is null
        }
    }
}