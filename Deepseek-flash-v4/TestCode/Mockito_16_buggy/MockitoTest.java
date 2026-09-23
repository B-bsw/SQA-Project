package org.mockito;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer;
import org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls;
import org.mockito.internal.stubbing.defaultanswers.ReturnsMocks;
import org.mockito.internal.stubbing.defaultanswers.CallsRealMethods;
import org.mockito.internal.stubbing.defaultanswers.DoesNothing;
import org.mockito.internal.stubbing.defaultanswers.Returns;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.OngoingStubbing;
import org.mockito.stubbing.Stubber;
import org.mockito.stubbing.VoidMethodStubbable;
import org.mockito.stubbing.DeprecatedOngoingStubbing;
import java.util.List;
import java.util.LinkedList;

public class MockitoTest {
    private Mockito mockito;

    @Before
    public void setUp() {
        mockito = new Mockito();
    }

    @After
    public void tearDown() {
        mockito = null;
    }

    @Test
    public void testMockWithClass() {
        List<String> mockList = Mockito.mock(List.class);
        Assert.assertNotNull(mockList);
        Assert.assertTrue(Mockito.mockingDetails(mockList).isMock());
    }

    @Test
    public void testMockWithName() {
        List<String> mockList = Mockito.mock(List.class, "myMock");
        Assert.assertNotNull(mockList);
    }

    @Test
    public void testMockWithReturnValues() {
        List<String> mockList = Mockito.mock(List.class, new ReturnValuesAdapterForTest());
        Assert.assertNotNull(mockList);
    }

    @Test
    public void testMockWithDefaultAnswer() {
        List<String> mockList = Mockito.mock(List.class, Mockito.RETURNS_SMART_NULLS);
        Assert.assertNotNull(mockList);
    }

    @Test
    public void testMockWithSettings() {
        MockSettings settings = Mockito.withSettings().name("testMock").defaultAnswer(Mockito.RETURNS_DEFAULTS);
        List<String> mockList = Mockito.mock(List.class, settings);
        Assert.assertNotNull(mockList);
    }

    @Test
    public void testSpy() {
        List<String> spyList = Mockito.spy(new LinkedList<>());
        Assert.assertNotNull(spyList);
    }

    @Test(expected = NullPointerException.class)
    public void testSpyNull() {
        Mockito.spy(null);
    }

    @Test
    public void testWhen() {
        List<String> mockList = Mockito.mock(List.class);
        OngoingStubbing<String> stub = Mockito.when(mockList.get(0));
        Assert.assertNotNull(stub);
    }

    @Test
    public void testVerify() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        mockList.clear();
        Mockito.verify(mockList).clear();
    }

    @Test
    public void testVerifyWithMode() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        Mockito.verify(mockList, Mockito.times(1)).add("test");
    }

    @Test
    public void testReset() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        Mockito.reset(mockList);
        Mockito.verifyZeroInteractions(mockList);
    }

    @Test
    public void testVerifyNoMoreInteractions() {
        List<String> mockList = Mockito.mock(List.class);
        mockList.add("test");
        Mockito.verify(mockList).add("test");
        Mockito.verifyNoMoreInteractions(mockList);
    }

    @Test
    public void testVerifyZeroInteractions() {
        List<String> mockList = Mockito.mock(List.class);
        Mockito.verifyZeroInteractions(mockList);
    }

    @Test
    public void testStubVoid() {
        List<String> mockList = Mockito.mock(List.class);
        VoidMethodStubbable<List<String>> stub = Mockito.stubVoid(mockList);
        Assert.assertNotNull(stub);
    }

    @Test
    public void testDoThrow() {
        RuntimeException exception = new RuntimeException("expected");
        Stubber stubber = Mockito.doThrow(exception);
        Assert.assertNotNull(stubber);
    }

    @Test
    public void testDoCallRealMethod() {
        Stubber stubber = Mockito.doCallRealMethod();
        Assert.assertNotNull(stubber);
    }

    @Test
    public void testDoAnswer() {
        Stubber stubber = Mockito.doAnswer(invocation -> "answer");
        Assert.assertNotNull(stubber);
    }

    @Test
    public void testDoNothing() {
        Stubber stubber = Mockito.doNothing();
        Assert.assertNotNull(stubber);
    }

    @Test
    public void testDoReturn() {
        Stubber stubber = Mockito.doReturn("data");
        Assert.assertNotNull(stubber);
    }

    @Test
    public void testInOrder() {
        List<String> mockList1 = Mockito.mock(List.class);
        List<String> mockList2 = Mockito.mock(List.class);
        InOrder inOrder = Mockito.inOrder(mockList1, mockList2);
        Assert.assertNotNull(inOrder);
    }

    @Test
    public void testTimes() {
        VerificationMode mode = Mockito.times(3);
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 3", mode.toString());
    }

    @Test
    public void testNever() {
        VerificationMode mode = Mockito.never();
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 0", mode.toString());
    }

    @Test
    public void testAtLeastOnce() {
        VerificationMode mode = Mockito.atLeastOnce();
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 1", mode.toString());
    }

    @Test
    public void testAtLeast() {
        VerificationMode mode = Mockito.atLeast(2);
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 2", mode.toString());
    }

    @Test
    public void testAtMost() {
        VerificationMode mode = Mockito.atMost(4);
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 4", mode.toString());
    }

    @Test
    public void testOnly() {
        VerificationMode mode = Mockito.only();
        Assert.assertNotNull(mode);
        Assert.assertEquals("Wanted invocations count: 1", mode.toString());
    }

    @Test
    public void testValidateMockitoUsage() {
        Mockito.validateMockitoUsage();
    }

    @Test
    public void testWithSettings() {
        MockSettings settings = Mockito.withSettings();
        Assert.assertNotNull(settings);
        Assert.assertNotNull(settings.getDefaultAnswer());
    }

    @Test
    public void testDebug() {
        MockitoDebugger debugger = Mockito.debug();
        Assert.assertNotNull(debugger);
    }

    @Test
    public void testStaticFields() {
        Assert.assertNotNull(Mockito.RETURNS_DEFAULTS);
        Assert.assertNotNull(Mockito.RETURNS_SMART_NULLS);
        Assert.assertNotNull(Mockito.RETURNS_MOCKS);
        Assert.assertNotNull(Mockito.CALLS_REAL_METHODS);
    }

    private static class ReturnValuesAdapterForTest implements ReturnValues {
        @Override
        public Object valueFor(Class<?> type) {
            return null;
        }
    }
}