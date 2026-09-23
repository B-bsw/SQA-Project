package org.mockito.exceptions;

import org.junit.Test;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.exceptions.misusing.*;
import org.mockito.exceptions.verification.*;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.exceptions.MockitoLimitations;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.exceptions.util.ScenarioPrinter;
import org.mockito.internal.junit.JUnitTool;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.StringJoiner;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.listeners.InvocationListener;
import org.mockito.mock.MockName;
import org.mockito.mock.SerializableMode;
import org.mockito.internal.reporting.Discrepancy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.mockito.internal.reporting.Pluralizer.pluralize;
import static org.mockito.internal.util.StringJoiner.join;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;

public class ReporterTest {

    private Reporter reporter;

    @Before
    public void setUp() {
        reporter = new Reporter();
    }

    @After
    public void tearDown() {
        reporter = null;
    }

    @Test(expected = MockitoException.class)
    public void testCheckedExceptionInvalid() {
        reporter.checkedExceptionInvalid(new Exception("checked"));
    }

    @Test(expected = MockitoException.class)
    public void testCannotStubWithNullThrowable() {
        reporter.cannotStubWithNullThrowable();
    }

    @Test
    public void testUnfinishedStubbing() {
        try {
            reporter.unfinishedStubbing(new LocationImpl("test"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Unfinished stubbing"));
        }
    }

    @Test
    public void testIncorrectUseOfApi() {
        try {
            reporter.incorrectUseOfApi();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("incorrect use of the API"));
        }
    }

    @Test
    public void testMissingMethodInvocation() {
        try {
            reporter.missingMethodInvocation();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("method");
        }
    }

    @Test
    public void testUnfinishedVerificationException() {
        try {
            reporter.unfinishedVerificationException(new LocationImpl("test"));
            fail("Expected UnfinishedVerificationException");
        } catch (UnfinishedVerificationException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testNotAMockPassedToVerify() {
        try {
            reporter.notAMockPassedToVerify(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("not a mock"));
        }
    }

    @Test
    public void testNullPassedToVerify() {
        try {
            reporter.nullPassedToVerify();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testNotAMockPassedToWhenMethod() {
        try {
            reporter.notAMockPassedToWhenMethod();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("not a mock"));
        }
    }

    @Test
    public void testNullPassedToWhenMethod() {
        try {
            reporter.nullPassedToWhenMethod();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testMocksHaveToBePassedToVerifyNoMoreInteractions() {
        try {
            reporter.mocksHaveToBePassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("mocks"));
        }
    }

    @Test
    public void testNotAMockPassedToVerifyNoMoreInteractions() {
        try {
            reporter.notAMockPassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("not a mock"));
        }
    }

    @Test
    public void testNullPassedToVerifyNoMoreInteractions() {
        try {
            reporter.nullPassedToVerifyNoMoreInteractions();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testNotAMockPassedWhenCreatingInOrder() {
        try {
            reporter.notAMockPassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("not a mock"));
        }
    }

    @Test
    public void testNullPassedWhenCreatingInOrder() {
        try {
            reporter.nullPassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testMocksHaveToBePassedWhenCreatingInOrder() {
        try {
            reporter.mocksHaveToBePassedWhenCreatingInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("mocks"));
        }
    }

    @Test
    public void testInOrderRequiresFamiliarMock() {
        try {
            reporter.inOrderRequiresFamiliarMock();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("familiar mock"));
        }
    }

    @Test
    public void testInvalidUseOfMatchers() {
        List<LocalizedMatcher> matchers = new ArrayList<LocalizedMatcher>();
        matchers.add(new LocalizedMatcher(null, null));
        try {
            reporter.invalidUseOfMatchers(1, matchers);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("matchers"));
        }
    }

    @Test
    public void testIncorrectUseOfAdditionalMatchers() {
        try {
            reporter.incorrectUseOfAdditionalMatchers("anyOf", 0, Collections.<LocalizedMatcher>emptyList());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("additional"));
        }
    }

    @Test
    public void testStubPassedToVerify() {
        try {
            reporter.stubPassedToVerify();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("stub"));
        }
    }

    @Test
    public void testReportNoSubMatchersFound() {
        String result = reporter.reportNoSubMatchersFound("anyOf");
        assertTrue(result.contains("anyOf"));
    }

    @Test
    public void testArgumentsAreDifferent() {
        try {
            reporter.argumentsAreDifferent("expected", "actual", new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("different"));
        }
    }

    @Test
    public void testWantedButNotInvoked() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() {
                return "wanted";
            }
            @Override
            public Location getLocation() {
                return new LocationImpl("test");
            }
        };
        try {
            reporter.wantedButNotInvoked(wanted);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("wanted"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithInvocationsEmpty() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() {
                return "wanted";
            }
            @Override
            public Location getLocation() {
                return new LocationImpl("test");
            }
        };
        try {
            reporter.wantedButNotInvoked(wanted, Collections.<VerificationAwareInvocation>emptyList());
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("wanted"));
        }
    }

    @Test
    public void testWantedButNotInvokedWithInvocationsNonEmpty() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() {
                return "wanted";
            }
            @Override
            public Location getLocation() {
                return new LocationImpl("test");
            }
        };
        VerificationAwareInvocation invocation = new VerificationAwareInvocation() {
            @Override
            public boolean isVerified() { return false; }
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
            @Override
            public String toString() { return "invocation"; }
        };
        try {
            reporter.wantedButNotInvoked(wanted, Arrays.asList(invocation));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("wanted"));
        }
    }

    @Test
    public void testWantedButNotInvokedInOrder() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        DescribedInvocation previous = new DescribedInvocation() {
            @Override
            public String toString() { return "previous"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.wantedButNotInvokedInOrder(wanted, previous);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("wanted"));
        }
    }

    @Test
    public void testTooManyActualInvocations() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.tooManyActualInvocations(1, 2, wanted, new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Too many"));
        }
    }

    @Test
    public void testNeverWantedButInvoked() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.neverWantedButInvoked(wanted, new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("never wanted"));
        }
    }

    @Test
    public void testTooManyActualInvocationsInOrder() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.tooManyActualInvocationsInOrder(1, 2, wanted, new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Too many"));
        }
    }

    @Test
    public void testTooLittleActualInvocations() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.tooLittleActualInvocations(new Discrepancy(1, 2), wanted, new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Too little"));
        }
    }

    @Test
    public void testTooLittleActualInvocationsInOrder() {
        DescribedInvocation wanted = new DescribedInvocation() {
            @Override
            public String toString() { return "wanted"; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
        };
        try {
            reporter.tooLittleActualInvocationsInOrder(new Discrepancy(1, 2), wanted, new LocationImpl("test"));
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("Too little"));
        }
    }

    @Test
    public void testNoMoreInteractionsWanted() {
        Invocation undesired = new Invocation() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { return null; }
            @Override
            public Object[] getArguments() { return new Object[0]; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
            @Override
            public String toString() { return "undesired"; }
        };
        try {
            reporter.noMoreInteractionsWanted(undesired, Collections.<VerificationAwareInvocation>emptyList());
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("No more interactions"));
        }
    }

    @Test
    public void testNoMoreInteractionsWantedInOrder() {
        Invocation undesired = new Invocation() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { return null; }
            @Override
            public Object[] getArguments() { return new Object[0]; }
            @Override
            public Location getLocation() { return new LocationImpl("test"); }
            @Override
            public String toString() { return "undesired"; }
        };
        try {
            reporter.noMoreInteractionsWantedInOrder(undesired);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("No more interactions"));
        }
    }

    @Test
    public void testCannotMockFinalClass() {
        try {
            reporter.cannotMockFinalClass(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("final"));
        }
    }

    @Test
    public void testCannotStubVoidMethodWithAReturnValue() {
        try {
            reporter.cannotStubVoidMethodWithAReturnValue("someMethod");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("void"));
        }
    }

    @Test
    public void testOnlyVoidMethodsCanBeSetToDoNothing() {
        try {
            reporter.onlyVoidMethodsCanBeSetToDoNothing();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("void"));
        }
    }

    @Test
    public void testWrongTypeOfReturnValue() {
        try {
            reporter.wrongTypeOfReturnValue("int", "String", "methodName");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("return"));
        }
    }

    @Test
    public void testWantedAtMostX() {
        try {
            reporter.wantedAtMostX(1, 2);
            fail("Expected MockitoAssertionError");
        } catch (MockitoAssertionError e) {
            assertTrue(e.getMessage().contains("at most"));
        }
    }

    @Test
    public void testMisplacedArgumentMatcher() {
        try {
            reporter.misplacedArgumentMatcher(Collections.<LocalizedMatcher>emptyList());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("misplaced"));
        }
    }

    @Test
    public void testSmartNullPointerException() {
        try {
            reporter.smartNullPointerException("invocation", new LocationImpl("test"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("NPE"));
        }
    }

    @Test
    public void testNoArgumentValueWasCaptured() {
        try {
            reporter.noArgumentValueWasCaptured();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("No argument"));
        }
    }

    @Test
    public void testExtraInterfacesDoesNotAcceptNullParameters() {
        try {
            reporter.extraInterfacesDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testExtraInterfacesAcceptsOnlyInterfaces() {
        try {
            reporter.extraInterfacesAcceptsOnlyInterfaces(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("interface"));
        }
    }

    @Test
    public void testExtraInterfacesCannotContainMockedType() {
        try {
            reporter.extraInterfacesCannotContainMockedType(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("same");
        }
    }

    @Test
    public void testExtraInterfacesRequiresAtLeastOneInterface() {
        try {
            reporter.extraInterfacesRequiresAtLeastOneInterface();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("at least"));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithSpiedInstanceType() {
        try {
            reporter.mockedTypeIsInconsistentWithSpiedInstanceType(ArrayList.class, new Object());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("inconsistent"));
        }
    }

    @Test
    public void testCannotCallAbstractRealMethod() {
        try {
            reporter.cannotCallAbstractRealMethod();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("abstract"));
        }
    }

    @Test
    public void testCannotVerifyToString() {
        try {
            reporter.cannotVerifyToString();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("toString"));
        }
    }

    @Test
    public void testMoreThanOneAnnotationNotAllowed() {
        try {
            reporter.moreThanOneAnnotationNotAllowed("field");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("field"));
        }
    }

    @Test
    public void testUnsupportedCombinationOfAnnotations() {
        try {
            reporter.unsupportedCombinationOfAnnotations("@Mock", "@Spy");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("combination"));
        }
    }

    @Test
    public void testCannotInitializeForSpyAnnotation() {
        try {
            reporter.cannotInitializeForSpyAnnotation("field", new Exception("details"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("field"));
        }
    }

    @Test
    public void testCannotInitializeForInjectMocksAnnotation() {
        try {
            reporter.cannotInitializeForInjectMocksAnnotation("field", new Exception("details"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("field"));
        }
    }

    @Test
    public void testAtMostAndNeverShouldNotBeUsedWithTimeout() {
        try {
            reporter.atMostAndNeverShouldNotBeUsedWithTimeout();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("timeout"));
        }
    }

    @Test
    public void testFieldInitialisationThrewException() {
        try {
            reporter.fieldInitialisationThrewException(new Field("") {}, new Exception("details"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("field"));
        }
    }

    @Test
    public void testInvocationListenerDoesNotAcceptNullParameters() {
        try {
            reporter.invocationListenerDoesNotAcceptNullParameters();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testInvocationListenersRequiresAtLeastOneListener() {
        try {
            reporter.invocationListenersRequiresAtLeastOneListener();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("at least"));
        }
    }

    @Test
    public void testInvocationListenerThrewException() {
        InvocationListener listener = new InvocationListener() {
            @Override
            public void reportInvocation(org.mockito.invocation.Invocation invocation) {}
        };
        try {
            reporter.invocationListenerThrewException(listener, new RuntimeException("msg"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("listener"));
        }
    }

    @Test
    public void testCannotInjectDependency() throws Exception {
        Field field = SomeClass.class.getDeclaredField("value");
        try {
            reporter.cannotInjectDependency(field, new Object(), new Exception("cause"));
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("field"));
        }
    }

    @Test
    public void testMockedTypeIsInconsistentWithDelegatedInstanceTypeWithValidTypes() {
        try {
            reporter.mockedTypeIsInconsistentWithDelegatedInstanceType(ArrayList.class, new ArrayList());
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("inconsistent"));
        }
    }

    @Test
    public void testSpyAndDelegateAreMutuallyExclusive() {
        try {
            reporter.spyAndDelegateAreMutuallyExclusive();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("mutually exclusive"));
        }
    }

    @Test
    public void testInvalidArgumentRangeAtIdentityAnswerCreationTime() {
        try {
            reporter.invalidArgumentRangeAtIdentityAnswerCreationTime();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("index"));
        }
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_NoArgs() {
        InvocationOnMock invocation = new InvocationOnMock() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { 
                try { return String.class.getMethod("length"); } catch (NoSuchMethodException e) { return null; }
            }
            @Override
            public Object[] getArguments() { return new Object[0]; }
            @Override
            public Object callRealMethod() { return null; }
        };
        String result = reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 0);
        assertTrue(result.contains("no arguments"));
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_ValidIndex() {
        InvocationOnMock invocation = new InvocationOnMock() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { 
                try { return String.class.getMethod("charAt", int.class); } catch (NoSuchMethodException e) { return null; }
            }
            @Override
            public Object[] getArguments() { return new Object[]{0}; }
            @Override
            public Object callRealMethod() { return null; }
        };
        String result = reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, false, 0);
        assertTrue(result.contains("on the range"));
    }

    @Test
    public void testInvalidArgumentPositionRangeAtInvocationTime_LastParameter() {
        InvocationOnMock invocation = new InvocationOnMock() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { 
                try { return String.class.getMethod("charAt", int.class); } catch (NoSuchMethodException e) { return null; }
            }
            @Override
            public Object[] getArguments() { return new Object[]{0}; }
            @Override
            public Object callRealMethod() { return null; }
        };
        String result = reporter.invalidArgumentPositionRangeAtInvocationTime(invocation, true, -1);
        assertTrue(result.contains("last"));
    }

    @Test
    public void testWrongTypeOfArgumentToReturn() {
        InvocationOnMock invocation = new InvocationOnMock() {
            @Override
            public Object getMock() { return new Object(); }
            @Override
            public Method getMethod() { 
                try { return String.class.getMethod("charAt", int.class); } catch (NoSuchMethodException e) { return null; }
            }
            @Override
            public Object[] getArguments() { return new Object[]{0}; }
            @Override
            public Object callRealMethod() { return null; }
        };
        try {
            reporter.wrongTypeOfArgumentToReturn(invocation, "int", String.class, 0);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("should return"));
        }
    }

    @Test
    public void testDefaultAnswerDoesNotAcceptNullParameter() {
        try {
            reporter.defaultAnswerDoesNotAcceptNullParameter();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testSerializableWontWorkForObjectsThatDontImplementSerializable() {
        try {
            reporter.serializableWontWorkForObjectsThatDontImplementSerializable(String.class);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Serializable"));
        }
    }

    @Test
    public void testDelegatedMethodHasWrongReturnType() throws Exception {
        Method mockMethod = String.class.getMethod("length");
        Method delegateMethod = Object.class.getMethod("toString");
        try {
            reporter.delegatedMethodHasWrongReturnType(mockMethod, delegateMethod, new Object(), "delegate");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("return type"));
        }
    }

    @Test
    public void testDelegatedMethodDoesNotExistOnDelegate() throws Exception {
        Method mockMethod = String.class.getMethod("length");
        Method delegateMethod = String.class.getMethod("toString");
        try {
            reporter.delegatedMethodDoesNotExistOnDelegate(mockMethod, new Object(), "delegate");
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("must exist"));
        }
    }

    @Test
    public void testUsingConstructorWithFancySerializable() {
        try {
            reporter.usingConstructorWithFancySerializable(SerializableMode.BASIC);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("constructor"));
        }
    }

    @Test
    public void testCannotPassObjectToVerifyInOrder() {
        try {
            reporter.cannotPassObjectToVerifyInOrder();
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("mock"));
        }
    }

    private static class SomeClass {
        public int value;
    }
}