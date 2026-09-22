package org.mockito;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.invocation.InvocationOnMock;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @After
    public void tearDown() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void constants_verifyNotNull() {
        Assert.assertNotNull(Mockito.RETURNS_DEFAULTS);
        Assert.assertNotNull(Mockito.RETURNS_SMART_NULLS);
        Assert.assertNotNull(Mockito.RETURNS_MOCKS);
        Assert.assertNotNull(Mockito.CALLS_REAL_METHODS);
    }

    @Test
    public void mock_givenClass_shouldReturnMockInstance() {
        // Arrange & Act
        List list = Mockito.mock(List.class);

        // Assert
        Assert.assertNotNull(list);
    }

    @Test
    public void mock_givenClassAndName_shouldReturnMockInstance() {
        // Arrange & Act
        List list = Mockito.mock(List.class, "customName");

        // Assert
        Assert.assertNotNull(list);
    }

    @Test
    public void mock_givenClassAndEmptyName_shouldReturnMockInstance() {
        // Arrange & Act
        List list = Mockito.mock(List.class, "");

        // Assert
        Assert.assertNotNull(list);
    }

    @Test
    public void mock_givenClassAndDefaultAnswer_shouldReturnMockInstance() {
        // Arrange & Act
        List list = Mockito.mock(List.class, Mockito.RETURNS_SMART_NULLS);

        // Assert
        Assert.assertNotNull(list);
    }

    @Test
    public void mock_givenClassAndCustomAnswer_shouldReturnMockInstance() {
        // Arrange
        Answer customAnswer = new Answer() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "custom";
            }
        };

        // Act
        List list = Mockito.mock(List.class, customAnswer);

        // Assert
        Assert.assertNotNull(list);
        Assert.assertEquals("custom", list.get(0));
    }

    @Test
    public void mock_givenClassAndReturnValues_shouldReturnMockInstance() {
        // Arrange
        ReturnValues returnValues = new ReturnValues() {
            public Object valueFor(InvocationOnMock invocation) {
                return "legacyReturnValue";
            }
        };

        // Act
        List list = Mockito.mock(List.class, returnValues);

        // Assert
        Assert.assertNotNull(list);
        Assert.assertEquals("legacyReturnValue", list.get(0));
    }

    @Test
    public void mock_givenClassAndSettings_shouldReturnMockInstance() {
        // Arrange
        MockSettings settings = Mockito.withSettings().name("settingsMock");

        // Act
        List list = Mockito.mock(List.class, settings);

        // Assert
        Assert.assertNotNull(list);
    }

    @Test
    public void spy_givenInstance_shouldReturnSpyInstanceAndDelegateCalls() {
        // Arrange
        ArrayList realList = new ArrayList();

        // Act
        ArrayList spyList = Mockito.spy(realList);
        spyList.add("element");

        // Assert
        Assert.assertNotNull(spyList);
        Assert.assertEquals(1, spyList.size());
        Assert.assertEquals("element", spyList.get(0));
    }

    @Test
    public void when_givenMethodCall_shouldStubBehavior() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        OngoingStubbing stubbing = Mockito.when(list.get(0));
        stubbing.thenReturn("first");

        // Assert
        Assert.assertEquals("first", list.get(0));
        Assert.assertNull(list.get(1));
    }

    @Test
    public void stub_givenMethodCall_shouldStubBehavior() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        Mockito.stub(list.get(0)).toReturn("deprecatedStub");

        // Assert
        Assert.assertEquals("deprecatedStub", list.get(0));
    }

    @Test
    public void verify_givenSingleInvocation_shouldPass() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("item");

        // Assert
        List verified = Mockito.verify(list);
        verified.add("item");
    }

    @Test
    public void verify_givenTimesVerificationMode_shouldVerifyCorrectInvocations() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("once");
        list.add("twice");
        list.add("twice");

        // Assert
        Mockito.verify(list, Mockito.times(1)).add("once");
        Mockito.verify(list, Mockito.times(2)).add("twice");
    }

    @Test
    public void never_shouldVerifyZeroInvocations() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        VerificationMode mode = Mockito.never();

        // Assert
        Assert.assertNotNull(mode);
        Mockito.verify(list, mode).clear();
    }

    @Test
    public void atLeastOnce_shouldVerifyAtLeastOneInvocation() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("one");
        list.add("one");
        VerificationMode mode = Mockito.atLeastOnce();

        // Assert
        Assert.assertNotNull(mode);
        Mockito.verify(list, mode).add("one");
    }

    @Test
    public void atLeast_shouldVerifyMinimumInvocations() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("item");
        list.add("item");
        VerificationMode mode = Mockito.atLeast(1);

        // Assert
        Assert.assertNotNull(mode);
        Mockito.verify(list, mode).add("item");
    }

    @Test
    public void atMost_shouldVerifyMaximumInvocations() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("item");
        VerificationMode mode = Mockito.atMost(2);

        // Assert
        Assert.assertNotNull(mode);
        Mockito.verify(list, mode).add("item");
    }

    @Test
    public void only_shouldVerifySingleMethodInvokedExclusively() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.clear();
        VerificationMode mode = Mockito.only();

        // Assert
        Assert.assertNotNull(mode);
        Mockito.verify(list, mode).clear();
    }

    @Test
    public void reset_givenMocks_shouldClearInteractionsAndStubbing() {
        // Arrange
        List list = Mockito.mock(List.class);
        Mockito.when(list.get(0)).thenReturn("value");
        Assert.assertEquals("value", list.get(0));

        // Act
        Mockito.reset(list);

        // Assert
        Assert.assertNull(list.get(0));
        Mockito.verify(list, Mockito.never()).get(0);
    }

    @Test
    public void verifyNoMoreInteractions_givenNoAdditionalCalls_shouldPass() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        list.add("alpha");
        Mockito.verify(list).add("alpha");

        // Assert
        Mockito.verifyNoMoreInteractions(list);
    }

    @Test
    public void verifyZeroInteractions_givenNoCalls_shouldPass() {
        // Arrange
        List list1 = Mockito.mock(List.class);
        List list2 = Mockito.mock(List.class);

        // Act & Assert
        Mockito.verifyZeroInteractions(list1, list2);
    }

    @Test
    public void stubVoid_givenMock_shouldConfigureVoidMethod() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        VoidMethodStubbable stubber = Mockito.stubVoid(list);
        Assert.assertNotNull(stubber);
        stubber.toThrow(new RuntimeException("void stub exception")).on().clear();

        // Assert
        try {
            list.clear();
            Assert.fail("Expected RuntimeException was not thrown");
        } catch (RuntimeException e) {
            Assert.assertEquals("void stub exception", e.getMessage());
        }
    }

    @Test
    public void doThrow_givenThrowableInstance_shouldThrowWhenInvoked() {
        // Arrange
        List list = Mockito.mock(List.class);
        IllegalArgumentException exception = new IllegalArgumentException("test exception");

        // Act
        Stubber stubber = Mockito.doThrow(exception);
        Assert.assertNotNull(stubber);
        stubber.when(list).clear();

        // Assert
        try {
            list.clear();
            Assert.fail("Expected IllegalArgumentException was not thrown");
        } catch (IllegalArgumentException e) {
            Assert.assertSame(exception, e);
        }
    }

    @Test
    public void doReturn_givenReturnValue_shouldReturnWhenInvoked() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        Stubber stubber = Mockito.doReturn("mockedResult");
        Assert.assertNotNull(stubber);
        stubber.when(list).get(0);

        // Assert
        Assert.assertEquals("mockedResult", list.get(0));
    }

    @Test
    public void doNothing_givenVoidMethod_shouldDoNothing() {
        // Arrange
        List list = Mockito.mock(List.class);

        // Act
        Stubber stubber = Mockito.doNothing();
        Assert.assertNotNull(stubber);
        stubber.when(list).clear();
        list.clear();

        // Assert
        Mockito.verify(list).clear();
    }

    @Test
    public void doAnswer_givenAnswer_shouldExecuteAnswerWhenInvoked() {
        // Arrange
        List list = Mockito.mock(List.class);
        Answer answer = new Answer() {
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "computed";
            }
        };

        // Act
        Stubber stubber = Mockito.doAnswer(answer);
        Assert.assertNotNull(stubber);
        stubber.when(list).get(5);

        // Assert
        Assert.assertEquals("computed", list.get(5));
    }

    @Test
    public void doCallRealMethod_givenSpy_shouldDelegateToRealImplementation() {
        // Arrange
        ArrayList realList = new ArrayList();
        ArrayList spyList = Mockito.spy(realList);
        Mockito.doReturn(10).when(spyList).size();
        Assert.assertEquals(10, spyList.size());

        // Act
        Stubber stubber = Mockito.doCallRealMethod();
        Assert.assertNotNull(stubber);
        stubber.when(spyList).size();

        // Assert
        Assert.assertEquals(0, spyList.size());
    }

    @Test
    public void inOrder_givenOrderedInvocations_shouldVerifyOrderSuccessfully() {
        // Arrange
        List list1 = Mockito.mock(List.class);
        List list2 = Mockito.mock(List.class);

        // Act
        list1.add("first");
        list2.add("second");
        InOrder inOrder = Mockito.inOrder(list1, list2);

        // Assert
        Assert.assertNotNull(inOrder);
        inOrder.verify(list1).add("first");
        inOrder.verify(list2).add("second");
    }

    @Test
    public void withSettings_shouldReturnMockSettingsConfiguredWithDefaults() {
        // Arrange & Act
        MockSettings settings = Mockito.withSettings();

        // Assert
        Assert.assertNotNull(settings);
    }

    @Test
    public void debug_shouldReturnMockitoDebuggerInstance() {
        // Arrange & Act
        MockitoDebugger debugger = Mockito.debug();

        // Assert
        Assert.assertNotNull(debugger);
    }

    @Test
    public void validateMockitoUsage_whenUsageIsValid_shouldNotThrowException() {
        // Arrange & Act & Assert
        Mockito.validateMockitoUsage();
    }

    @Test
    public void mock_givenNullClass_shouldThrowException() {
        // Arrange, Act & Assert
        try {
            Mockito.mock(null);
            Assert.fail("Expected MockitoException when class to mock is null");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void spy_givenNullInstance_shouldThrowException() {
        // Arrange, Act & Assert
        try {
            Mockito.spy(null);
            Assert.fail("Expected MockitoException when object to spy is null");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void times_givenNegativeNumber_shouldThrowException() {
        // Arrange, Act & Assert
        try {
            Mockito.times(-1);
            Assert.fail("Expected MockitoException for negative invocations count");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void atLeast_givenNegativeNumber_shouldThrowException() {
        // Arrange, Act & Assert
        try {
            Mockito.atLeast(-1);
            Assert.fail("Expected MockitoException for negative minNumberOfInvocations");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void atMost_givenNegativeNumber_shouldThrowException() {
        // Arrange, Act & Assert
        try {
            Mockito.atMost(-1);
            Assert.fail("Expected MockitoException for negative maxNumberOfInvocations");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void constructor_shouldBeInstantiableSinceClassIsPublic() {
        // Arrange & Act
        Mockito mockito = new Mockito();

        // Assert
        Assert.assertNotNull(mockito);
    }
}