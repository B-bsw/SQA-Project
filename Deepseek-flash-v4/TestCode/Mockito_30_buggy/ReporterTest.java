package org.mockito.exceptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.exceptions.Reporter.createWantedButNotInvokedMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.ArgumentsAreDifferent;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.LocationImpl;
import org.mockito.internal.progress.Discrepancy;
import org.mockito.internal.verification.api.PrintableInvocation;

public class ReporterTest {

    private final Reporter reporter = new Reporter();
    private final Location location = new LocationImpl(new Throwable(), "test");
    private final PrintableInvocation wanted = new SimplePrintableInvocation("wanted", location);
    private final PrintableInvocation previous = new SimplePrintableInvocation("previous", location);
    private final Location actualLocation = new LocationImpl(new Throwable(), "actual");

    private static class SimplePrintableInvocation implements PrintableInvocation {
        private final String text;
        private final Location loc;

        SimplePrintableInvocation(String text, Location loc) {
            this.text = text;
            this.loc = loc;
        }

        @Override
        public String toString() {
            return text;
        }

        @Override
        public Location getLocation() {
            return loc;
        }

        @Override
        public boolean isVerified() {
            return false;
        }

        @Override
        public boolean isIgnoredForVerification() {
            return false;
        }

        @Override
        public Object getMock() {
            return null;
        }

        @Override
        public String getMethodName() {
            return text;
        }
    }

    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid() {
        reporter.checkedExceptionInvalid(new RuntimeException("checked"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test(expected = UnfinishedStubbingException.class)
    public void testUnfinishedStubbing() {
        reporter.unfinishedStubbing(location);
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void testMissingMethodInvocation() {
        reporter.missingMethodInvocation();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void testUnfinishedVerificationException() {
        reporter.unfinishedVerificationException(location);
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerify() {
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerify() {
        reporter.nullPassedToVerify();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToWhenMethod() {
        reporter.notAMockPassedToWhenMethod();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToWhenMethod() {
        reporter.nullPassedToWhenMethod();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedToVerifyNoMoreInteractions() {
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void testNotAMockPassedWhenCreatingInOrder() {
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void testNullPassedWhenCreatingInOrder() {
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void testInOrderRequiresFamiliarMock() {
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testInvalidUseOfMatchers() {
        reporter.invalidUseOfMatchers(2, 1);
    }

    @Test
    public void testArgumentsAreDifferentWithoutJUnit() {
        try {
            reporter.argumentsAreDifferent("wanted", "actual", actualLocation);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Argument(s) are different!"));
        }
    }

    @Test(expected = WantedButNotInvoked.class)
    public void testWantedButNotInvokedSingle() {
        reporter.wantedButNotInvoked(wanted);
    }

    @Test
    public void testWantedButNotInvokedWithEmptyInvocations() {
        try {
            reporter.wantedButNotInvoked(wanted, Collections.<PrintableInvocation>emptyList());
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("zero interactions"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithInvocations() {
        List<PrintableInvocation> invocations = new ArrayList<PrintableInvocation>();
        invocations.add(new SimplePrintableInvocation("other", location));
        try {
            reporter.wantedButNotInvoked(wanted, invocations);
            fail("Expected WantedButNotInvoked");
        } catch (WantedButNotInvoked e) {
            assertTrue(e.getMessage().contains("other interactions"));
        }
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testWantedButNotInvokedInOrder() {
        reporter.wantedButNotInvokedInOrder(wanted, previous);
    }

    @Test
    public void testTooManyActualInvocations() {
        try {
            reporter.tooManyActualInvocations(1, 3, wanted, actualLocation);
            fail("Expected TooManyActualInvocations");
        } catch (TooManyActualInvocations e) {
            assertTrue(e.getMessage().contains("Too many actual invocations"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder() {
        try {
            reporter.tooManyActualInvocationsInOrder(1, 3, wanted, actualLocation);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Too many actual invocations"));
        }
    }

    @Test
    public void testTooLittleActualInvocations() {
        Discrepancy discrepancy = new Discrepancy(1, 2);
        try {
            reporter.tooLittleActualInvocations(discrepancy, wanted, actualLocation);
            fail("Expected TooLittleActualInvocations");
        } catch (TooLittleActualInvocations e) {
            assertTrue(e.getMessage().contains("Too few actual invocations"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder() {
        Discrepancy discrepancy = new Discrepancy(1, 2);
        try {
            reporter.tooLittleActualInvocationsInOrder(discrepancy, wanted, actualLocation);
            fail("Expected VerificationInOrderFailure");
        } catch (VerificationInOrderFailure e) {
            assertTrue(e.getMessage().contains("Too few actual invocations"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted() {
        Invocation undesired = new Invocation(new Object(), new InvocationMatcher(wanted), 0, null);
        List<VerificationAwareInvocation> invocations = new ArrayList<VerificationAwareInvocation>();
        try {
            reporter.noMoreInteractionsWanted(undesired, invocations);
            fail("Expected NoInteractionsWanted");
        } catch (NoInteractionsWanted e) {
            assertTrue(e.getMessage().contains("No more interactions wanted"));
        }
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void testNoMoreInteractionsWantedInOrder() {
        Invocation undesired = new Invocation(new Object(), new InvocationMatcher(wanted), 0, null);
        reporter.noMoreInteractionsWantedInOrder(undesired);
    }

    @Test(expected = MockitoException.class)
    public void testCannotMockFinalClass() {
        reporter.cannotMockFinalClass(String.class);
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubVoidMethodWithAReturnValue() {
        reporter.cannotStubVoidMethodWithAReturnValue("someVoidMethod");
    }

    @Test(expected = MockitoException.class)
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void testWrongTypeOfReturnValue() {
        reporter.wrongTypeOfReturnValue("String", "Integer", "getValue");
    }

    @Test
    public void testWantedAtMostX() {
        try {
            reporter.wantedAtMostX(3, 5);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("wanted at most 3 times"));
        }
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void testMisplacedArgumentMatcher() {
        reporter.misplacedArgumentMatcher(location);
    }

    @Test(expected = SmartNullPointerException.class)
    public void testSmartNullPointerException() {
        reporter.smartNullPointerException(location);
    }

    @Test(expected = MockitoException.class)
    public void testNoArgumentValueWasCaptured() {
        reporter.noArgumentValueWasCaptured();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesDoesNotAcceptNullParameters() {
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesAcceptsOnlyInterfaces() {
        reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesCannotContainMockedType() {
        reporter.extraInterfacesCannotContainMockedType(List.class);
    }

    @Test(expected = MockitoException.class)
    public void testExtraInterfacesRequiresAtLeastOneInterface() {
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test(expected = MockitoException.class)
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<String>());
    }

    @Test(expected = MockitoException.class)
    public void testCannotCallRealMethodOnInterface() {
        reporter.cannotCallRealMethodOnInterface();
    }

    @Test(expected = MockitoException.class)
    public void testCannotVerifyToString() {
        reporter.cannotVerifyToString();
    }

    @Test(expected = MockitoException.class)
    public void testMoreThanOneAnnotationNotAllowed() {
        reporter.moreThanOneAnnotationNotAllowed("fieldName");
    }

    @Test(expected = MockitoException.class)
    public void testUnsupportedCombinationOfAnnotations() {
        reporter.unsupportedCombinationOfAnnotations("@Mock", "@Spy");
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForSpyAnnotation() {
        reporter.cannotInitializeForSpyAnnotation("fieldName", new Exception("details"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotInitializeForInjectMocksAnnotation() {
        reporter.cannotInitializeForInjectMocksAnnotation("fieldName", new Exception("details"));
    }

    @Test
    public void testCreateWantedButNotInvokedMessage_containsWanted() {
        String message = createWantedButNotInvokedMessage(wanted);
        assertTrue(message.contains("Wanted but not invoked:"));
        assertTrue(message.contains("wanted"));
    }

    @Test
    public void testCreateTooManyInvocationsMessage_basicContent() {
        String message = reporter.createTooManyInvocationsMessage(1, 3, wanted, actualLocation);
        assertNotNull(message);
        assertTrue(message.contains("Too many actual invocations"));
        assertTrue(message.contains("wanted"));
        assertTrue(message.contains("actualLocation"));
    }

    @Test
    public void testCreateTooManyInvocationsMessage_zeroWanted() {
        String message = reporter.createTooManyInvocationsMessage(0, 3, wanted, actualLocation);
        assertNotNull(message);
        assertTrue(message.contains("Never wanted here"));
    }

    @Test
    public void testCreateTooManyInvocationsMessage_singleWanted() {
        String message = reporter.createTooManyInvocationsMessage(1, 3, wanted, actualLocation);
        assertTrue(message.contains("1 time"));
        assertTrue(message.contains("3 times"));
    }
}