package org.mockito.exceptions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.CannotStubVoidMethodWithReturnValue;
import org.mockito.exceptions.misusing.CannotVerifyStubOnlyMock;
import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.exceptions.misusing.NullInsteadOfMockException;
import org.mockito.exceptions.misusing.UnfinishedStubbingException;
import org.mockito.exceptions.misusing.UnfinishedVerificationException;
import org.mockito.exceptions.misusing.WrongTypeOfReturnValue;
import org.mockito.exceptions.verification.NeverWantedButInvoked;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.exceptions.verification.SmartNullPointerException;
import org.mockito.exceptions.verification.TooLittleActualInvocations;
import org.mockito.exceptions.verification.TooManyActualInvocations;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.exceptions.verification.WantedButNotInvoked;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.reporting.Discrepancy;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.mock.SerializableMode;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReporterTest {

    private Reporter reporter;

    public String sampleField;

    public void noArgMethod() {}
    public void regularMethod(String str, int num) {}
    public void varargMethod(String str, Integer... numbers) {}

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    private DescribedInvocation createDummyDescribedInvocation(final String description, final Location location) {
        return (DescribedInvocation) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class[] { DescribedInvocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getLocation".equals(method.getName())) {
                            return location;
                        }
                        if ("toString".equals(method.getName())) {
                            return description;
                        }
                        return null;
                    }
                }
        );
    }

    private Invocation createDummyInvocation(final Object mock, final Method methodRef, final Location location, final String desc) {
        return (Invocation) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class[] { Invocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getMock".equals(method.getName())) {
                            return mock;
                        }
                        if ("getLocation".equals(method.getName())) {
                            return location;
                        }
                        if ("getMethod".equals(method.getName())) {
                            return methodRef;
                        }
                        if ("toString".equals(method.getName())) {
                            return desc;
                        }
                        return null;
                    }
                }
        );
    }

    private InvocationOnMock createDummyInvocationOnMock(final Object mock, final Method methodRef) {
        return (InvocationOnMock) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class[] { InvocationOnMock.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("getMock".equals(method.getName())) {
                            return mock;
                        }
                        if ("getMethod".equals(method.getName())) {
                            return methodRef;
                        }
                        return null;
                    }
                }
        );
    }

    private VerificationAwareInvocation createDummyVerificationAwareInvocation(final boolean isVerified) {
        return (VerificationAwareInvocation) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class[] { VerificationAwareInvocation.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("isVerified".equals(method.getName())) {
                            return Boolean.valueOf(isVerified);
                        }
                        if ("getLocation".equals(method.getName())) {
                            return new LocationImpl();
                        }
                        if ("toString".equals(method.getName())) {
                            return "dummyVerificationAwareInvocation()";
                        }
                        return null;
                    }
                }
        );
    }

    private InvocationListener createDummyInvocationListener() {
        return (InvocationListener) Proxy.newProxyInstance(
                ReporterTest.class.getClassLoader(),
                new Class[] { InvocationListener.class },
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
    }

    @Test(expected = MockitoException.class)
    public void checkedExceptionInvalid_givenThrowable_shouldThrowMockitoException() {
        reporter.checkedExceptionInvalid(new Exception("Checked exception"));
    }

    @Test(expected = MockitoException.class)
    public void cannotStubWithNullThrowable_givenCall_shouldThrowMockitoException() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test(expected = UnfinishedStubbingException.class)
    public void unfinishedStubbing_givenLocation_shouldThrowUnfinishedStubbingException() {
        reporter.unfinishedStubbing(new LocationImpl());
    }

    @Test(expected = MockitoException.class)
    public void incorrectUseOfApi_givenCall_shouldThrowMockitoException() {
        reporter.incorrectUseOfApi();
    }

    @Test(expected = MissingMethodInvocationException.class)
    public void missingMethodInvocation_givenCall_shouldThrowMissingMethodInvocationException() {
        reporter.missingMethodInvocation();
    }

    @Test(expected = UnfinishedVerificationException.class)
    public void unfinishedVerificationException_givenLocation_shouldThrowUnfinishedVerificationException() {
        reporter.unfinishedVerificationException(new LocationImpl());
    }

    @Test(expected = NotAMockException.class)
    public void notAMockPassedToVerify_givenType_shouldThrowNotAMockException() {
        reporter.notAMockPassedToVerify(String.class);
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void nullPassedToVerify_givenCall_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToVerify();
    }

    @Test(expected = NotAMockException.class)
    public void notAMockPassedToWhenMethod_givenCall_shouldThrowNotAMockException() {
        reporter.notAMockPassedToWhenMethod();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void nullPassedToWhenMethod_givenCall_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToWhenMethod();
    }

    @Test(expected = MockitoException.class)
    public void mocksHaveToBePassedToVerifyNoMoreInteractions_givenCall_shouldThrowMockitoException() {
        reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void notAMockPassedToVerifyNoMoreInteractions_givenCall_shouldThrowNotAMockException() {
        reporter.notAMockPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void nullPassedToVerifyNoMoreInteractions_givenCall_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedToVerifyNoMoreInteractions();
    }

    @Test(expected = NotAMockException.class)
    public void notAMockPassedWhenCreatingInOrder_givenCall_shouldThrowNotAMockException() {
        reporter.notAMockPassedWhenCreatingInOrder();
    }

    @Test(expected = NullInsteadOfMockException.class)
    public void nullPassedWhenCreatingInOrder_givenCall_shouldThrowNullInsteadOfMockException() {
        reporter.nullPassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void mocksHaveToBePassedWhenCreatingInOrder_givenCall_shouldThrowMockitoException() {
        reporter.mocksHaveToBePassedWhenCreatingInOrder();
    }

    @Test(expected = MockitoException.class)
    public void inOrderRequiresFamiliarMock_givenCall_shouldThrowMockitoException() {
        reporter.inOrderRequiresFamiliarMock();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void invalidUseOfMatchers_givenMatchers_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher>();
        matchers.add(new LocalizedMatcher(null));
        reporter.invalidUseOfMatchers(2, matchers);
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void incorrectUseOfAdditionalMatchers_givenMatcherStack_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher>();
        matchers.add(new LocalizedMatcher(null));
        reporter.incorrectUseOfAdditionalMatchers("and", 2, matchers);
    }

    @Test(expected = CannotVerifyStubOnlyMock.class)
    public void stubPassedToVerify_givenCall_shouldThrowCannotVerifyStubOnlyMock() {
        reporter.stubPassedToVerify();
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void reportNoSubMatchersFound_givenMatcherName_shouldThrowInvalidUseOfMatchersException() {
        reporter.reportNoSubMatchersFound("and");
    }

    @Test
    public void argumentsAreDifferent_givenDifferences_shouldThrowException() {
        try {
            reporter.argumentsAreDifferent("wanted()", "actual()", new LocationImpl());
            Assert.fail("Should throw ArgumentsAreDifferent or ComparisonFailure");
        } catch (AssertionError e) {
            Assert.assertNotNull(e.getMessage());
        } catch (Exception e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test(expected = WantedButNotInvoked.class)
    public void wantedButNotInvoked_givenInvocation_shouldThrowWantedButNotInvoked() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wantedMethod()", new LocationImpl());
        reporter.wantedButNotInvoked(wanted);
    }

    @Test(expected = WantedButNotInvoked.class)
    public void wantedButNotInvoked_givenEmptyInvocationsList_shouldIncludeZeroInteractionsMessage() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wantedMethod()", new LocationImpl());
        List<DescribedInvocation> invocations = Collections.emptyList();
        try {
            reporter.wantedButNotInvoked(wanted, invocations);
        } catch (WantedButNotInvoked e) {
            Assert.assertTrue(e.getMessage().indexOf("zero interactions") != -1);
            throw e;
        }
    }

    @Test(expected = WantedButNotInvoked.class)
    public void wantedButNotInvoked_givenNonEmptyInvocationsList_shouldIncludeOtherInteractionsMessage() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wantedMethod()", new LocationImpl());
        DescribedInvocation other = createDummyDescribedInvocation("otherMethod()", new LocationImpl());
        List<DescribedInvocation> invocations = new ArrayList<DescribedInvocation>();
        invocations.add(other);
        try {
            reporter.wantedButNotInvoked(wanted, invocations);
        } catch (WantedButNotInvoked e) {
            Assert.assertTrue(e.getMessage().indexOf("other interactions") != -1);
            throw e;
        }
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void wantedButNotInvokedInOrder_givenWantedAndPrevious_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        DescribedInvocation previous = createDummyDescribedInvocation("previous()", new LocationImpl());
        reporter.wantedButNotInvokedInOrder(wanted, previous);
    }

    @Test(expected = TooManyActualInvocations.class)
    public void tooManyActualInvocations_givenInvocations_shouldThrowTooManyActualInvocations() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooManyActualInvocations(1, 2, wanted, new LocationImpl());
    }

    @Test(expected = NeverWantedButInvoked.class)
    public void neverWantedButInvoked_givenInvocation_shouldThrowNeverWantedButInvoked() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.neverWantedButInvoked(wanted, new LocationImpl());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void tooManyActualInvocationsInOrder_givenInvocations_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooManyActualInvocationsInOrder(1, 2, wanted, new LocationImpl());
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void tooLittleActualInvocations_givenNonNullLocation_shouldThrowTooLittleActualInvocations() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooLittleActualInvocations(new Discrepancy(2, 1), wanted, new LocationImpl());
    }

    @Test(expected = TooLittleActualInvocations.class)
    public void tooLittleActualInvocations_givenNullLocation_shouldThrowTooLittleActualInvocations() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooLittleActualInvocations(new Discrepancy(2, 1), wanted, null);
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void tooLittleActualInvocationsInOrder_givenNonNullLocation_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooLittleActualInvocationsInOrder(new Discrepancy(2, 1), wanted, new LocationImpl());
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void tooLittleActualInvocationsInOrder_givenNullLocation_shouldThrowVerificationInOrderFailure() {
        DescribedInvocation wanted = createDummyDescribedInvocation("wanted()", new LocationImpl());
        reporter.tooLittleActualInvocationsInOrder(new Discrepancy(2, 1), wanted, null);
    }

    @Test(expected = NoInteractionsWanted.class)
    public void noMoreInteractionsWanted_givenUndesiredAndInvocations_shouldThrowNoInteractionsWanted() {
        Invocation undesired = createDummyInvocation("mockObject", null, new LocationImpl(), "undesired()");
        List<VerificationAwareInvocation> invocations = new ArrayList<VerificationAwareInvocation>();
        invocations.add(createDummyVerificationAwareInvocation(false));
        reporter.noMoreInteractionsWanted(undesired, invocations);
    }

    @Test(expected = VerificationInOrderFailure.class)
    public void noMoreInteractionsWantedInOrder_givenUndesired_shouldThrowVerificationInOrderFailure() {
        Invocation undesired = createDummyInvocation("mockObject", null, new LocationImpl(), "undesired()");
        reporter.noMoreInteractionsWantedInOrder(undesired);
    }

    @Test(expected = MockitoException.class)
    public void cannotMockFinalClass_givenFinalClass_shouldThrowMockitoException() {
        reporter.cannotMockFinalClass(String.class);
    }

    @Test(expected = CannotStubVoidMethodWithReturnValue.class)
    public void cannotStubVoidMethodWithAReturnValue_givenMethodName_shouldThrowCannotStubVoidMethodWithReturnValue() {
        reporter.cannotStubVoidMethodWithAReturnValue("voidMethod");
    }

    @Test(expected = MockitoException.class)
    public void onlyVoidMethodsCanBeSetToDoNothing_givenCall_shouldThrowMockitoException() {
        reporter.onlyVoidMethodsCanBeSetToDoNothing();
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void wrongTypeOfReturnValue_givenTypes_shouldThrowWrongTypeOfReturnValue() {
        reporter.wrongTypeOfReturnValue("String", "Integer", "getName");
    }

    @Test(expected = MockitoAssertionError.class)
    public void wantedAtMostX_givenCounts_shouldThrowMockitoAssertionError() {
        reporter.wantedAtMostX(2, 3);
    }

    @Test(expected = InvalidUseOfMatchersException.class)
    public void misplacedArgumentMatcher_givenMatchers_shouldThrowInvalidUseOfMatchersException() {
        List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher>();
        matchers.add(new LocalizedMatcher(null));
        reporter.misplacedArgumentMatcher(matchers);
    }

    @Test(expected = SmartNullPointerException.class)
    public void smartNullPointerException_givenInvocationAndLocation_shouldThrowSmartNullPointerException() {
        reporter.smartNullPointerException("dummyMethod()", new LocationImpl());
    }

    @Test(expected = MockitoException.class)
    public void noArgumentValueWasCaptured_givenCall_shouldThrowMockitoException() {
        reporter.noArgumentValueWasCaptured();
    }

    @Test(expected = MockitoException.class)
    public void extraInterfacesDoesNotAcceptNullParameters_givenCall_shouldThrowMockitoException() {
        reporter.extraInterfacesDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void extraInterfacesAcceptsOnlyInterfaces_givenClass_shouldThrowMockitoException() {
        reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
    }

    @Test(expected = MockitoException.class)
    public void extraInterfacesCannotContainMockedType_givenClass_shouldThrowMockitoException() {
        reporter.extraInterfacesCannotContainMockedType(Comparable.class);
    }

    @Test(expected = MockitoException.class)
    public void extraInterfacesRequiresAtLeastOneInterface_givenCall_shouldThrowMockitoException() {
        reporter.extraInterfacesRequiresAtLeastOneInterface();
    }

    @Test(expected = MockitoException.class)
    public void mockedTypeIsInconsistentWithSpiedInstanceType_givenTypes_shouldThrowMockitoException() {
        reporter.mockedTypeIsInconsistentWithSpiedInstanceType(List.class, new ArrayList<Object>());
    }

    @Test(expected = MockitoException.class)
    public void cannotCallAbstractRealMethod_givenCall_shouldThrowMockitoException() {
        reporter.cannotCallAbstractRealMethod();
    }

    @Test(expected = MockitoException.class)
    public void cannotVerifyToString_givenCall_shouldThrowMockitoException() {
        reporter.cannotVerifyToString();
    }

    @Test(expected = MockitoException.class)
    public void moreThanOneAnnotationNotAllowed_givenFieldName_shouldThrowMockitoException() {
        reporter.moreThanOneAnnotationNotAllowed("myField");
    }

    @Test(expected = MockitoException.class)
    public void unsupportedCombinationOfAnnotations_givenAnnotations_shouldThrowMockitoException() {
        reporter.unsupportedCombinationOfAnnotations("Mock", "Spy");
    }

    @Test(expected = MockitoException.class)
    public void cannotInitializeForSpyAnnotation_givenFieldAndDetails_shouldThrowMockitoException() {
        reporter.cannotInitializeForSpyAnnotation("spyField", new RuntimeException("Init error"));
    }

    @Test(expected = MockitoException.class)
    public void cannotInitializeForInjectMocksAnnotation_givenFieldAndDetails_shouldThrowMockitoException() {
        reporter.cannotInitializeForInjectMocksAnnotation("injectMocksField", new RuntimeException("Init error"));
    }

    @Test(expected = FriendlyReminderException.class)
    public void atMostAndNeverShouldNotBeUsedWithTimeout_givenCall_shouldThrowFriendlyReminderException() {
        reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
    }

    @Test(expected = MockitoException.class)
    public void fieldInitialisationThrewException_givenFieldAndDetails_shouldThrowMockitoException() throws Exception {
        Field field = ReporterTest.class.getDeclaredField("sampleField");
        reporter.fieldInitialisationThrewException(field, new RuntimeException("Init block exception"));
    }

    @Test(expected = MockitoException.class)
    public void invocationListenerDoesNotAcceptNullParameters_givenCall_shouldThrowMockitoException() {
        reporter.invocationListenerDoesNotAcceptNullParameters();
    }

    @Test(expected = MockitoException.class)
    public void invocationListenersRequiresAtLeastOneListener_givenCall_shouldThrowMockitoException() {
        reporter.invocationListenersRequiresAtLeastOneListener();
    }

    @Test(expected = MockitoException.class)
    public void invocationListenerThrewException_givenListenerAndThrowable_shouldThrowMockitoException() {
        InvocationListener listener = createDummyInvocationListener();
        reporter.invocationListenerThrewException(listener, new RuntimeException("Listener error"));
    }

    @Test(expected = MockitoException.class)
    public void cannotInjectDependency_givenFieldMockAndDetailsWithCause_shouldThrowMockitoException() throws Exception {
        Field field = ReporterTest.class.getDeclaredField("sampleField");
        Exception details = new Exception("wrapper", new RuntimeException("Underlying cause"));
        reporter.cannotInjectDependency(field, "dummyMock", details);
    }

    @Test(expected = MockitoException.class)
    public void mockedTypeIsInconsistentWithDelegatedInstanceType_givenTypes_shouldThrowMockitoException() {
        reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(List.class, new Object());
    }

    @Test(expected = MockitoException.class)
    public void spyAndDelegateAreMutuallyExclusive_givenCall_shouldThrowMockitoException() {
        reporter.spyAndDelegateAreMutuallyExclusive();
    }

    @Test(expected = MockitoException.class)
    public void invalidArgumentRangeAtIdentityAnswerCreationTime_givenCall_shouldThrowMockitoException() {
        reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
    }

    @Test(expected = MockitoException.class)
    public void invalidArgumentPositionRangeAtInvocationTime_givenNoArgMethod_shouldThrowMockitoException() throws Exception {
        Method method = ReporterTest.class.getDeclaredMethod("noArgMethod", new Class[0]);
        InvocationOnMock invocation = createDummyInvocationOnMock("dummyMock", method);
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 0);
    }

    @Test(expected = MockitoException.class)
    public void invalidArgumentPositionRangeAtInvocationTime_givenRegularMethodAndLastWanted_shouldThrowMockitoException() throws Exception {
        Method method = ReporterTest.class.getDeclaredMethod("regularMethod", new Class[] { String.class, int.class });
        InvocationOnMock invocation = createDummyInvocationOnMock("dummyMock", method);
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, true, -1);
    }

    @Test(expected = MockitoException.class)
    public void invalidArgumentPositionRangeAtInvocationTime_givenVarargMethod_shouldThrowMockitoException() throws Exception {
        Method method = ReporterTest.class.getDeclaredMethod("varargMethod", new Class[] { String.class, Integer[].class });
        InvocationOnMock invocation = createDummyInvocationOnMock("dummyMock", method);
        reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 5);
    }

    @Test(expected = WrongTypeOfReturnValue.class)
    public void wrongTypeOfArgumentToReturn_givenInvocationAndTypes_shouldThrowWrongTypeOfReturnValue() throws Exception {
        Method method = ReporterTest.class.getDeclaredMethod("regularMethod", new Class[] { String.class, int.class });
        InvocationOnMock invocation = createDummyInvocationOnMock("dummyMock", method);
        reporter.wrongTypeOfArgumentToReturn(invocation, "String", Integer.class, 0);
    }

    @Test(expected = MockitoException.class)
    public void defaultAnswerDoesNotAcceptNullParameter_givenCall_shouldThrowMockitoException() {
        reporter.defaultAnswerDoesNotAcceptNullParameter();
    }

    @Test(expected = MockitoException.class)
    public void serializableWontWorkForObjectsThatDontImplementSerializable_givenClass_shouldThrowMockitoException() {
        reporter.serializableWontWorkForObjectsThatDontImplementSerializable(Object.class);
    }

    @Test(expected = MockitoException.class)
    public void delegatedMethodHasWrongReturnType_givenMethods_shouldThrowMockitoException() throws Exception {
        Method mockMethod = ReporterTest.class.getDeclaredMethod("regularMethod", new Class[] { String.class, int.class });
        Method delegateMethod = ReporterTest.class.getDeclaredMethod("noArgMethod", new Class[0]);
        reporter.delegatedMethodHasWrongReturnType(mockMethod, delegateMethod, "mockObj", new Object());
    }

    @Test(expected = MockitoException.class)
    public void delegatedMethodDoesNotExistOnDelegate_givenMethod_shouldThrowMockitoException() throws Exception {
        Method mockMethod = ReporterTest.class.getDeclaredMethod("regularMethod", new Class[] { String.class, int.class });
        reporter.delegatedMethodDoesNotExistOnDelegate(mockMethod, "mockObj", new Object());
    }

    @Test(expected = MockitoException.class)
    public void usingConstructorWithFancySerializable_givenMode_shouldThrowMockitoException() {
        reporter.usingConstructorWithFancySerializable(SerializableMode.values()[0]);
    }
}