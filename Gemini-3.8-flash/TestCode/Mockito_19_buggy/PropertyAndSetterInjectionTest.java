package org.mockito.internal.configuration.injection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PropertyAndSetterInjectionTest {

    private PropertyAndSetterInjection injectionStrategy;

    @Before
    public void setUp() {
        injectionStrategy = new PropertyAndSetterInjection();
    }

    public static class DependencyA {
    }

    public static class DependencyB {
    }

    public static class SuperTarget {
        private DependencyA superDepA;

        public DependencyA getSuperDepA() {
            return superDepA;
        }
    }

    public static class SubTarget extends SuperTarget {
        private DependencyB subDepB;

        public DependencyB getSubDepB() {
            return subDepB;
        }
    }

    public static class TargetWithSetter {
        private DependencyA depA;
        private boolean setterCalled = false;

        public void setDepA(DependencyA depA) {
            this.depA = depA;
            this.setterCalled = true;
        }

        public DependencyA getDepA() {
            return depA;
        }

        public boolean isSetterCalled() {
            return setterCalled;
        }
    }

    public static class TargetWithMultipleSameType {
        private DependencyA firstDep;
        private DependencyA secondDep;

        public DependencyA getFirstDep() {
            return firstDep;
        }

        public DependencyA getSecondDep() {
            return secondDep;
        }
    }

    public static class TargetWithStaticAndFinal {
        public static DependencyA staticDep;
        public final DependencyA finalDep = new DependencyA();
        private DependencyB normalDep;

        public DependencyB getNormalDep() {
            return normalDep;
        }
    }

    public static class ThrowingConstructorTarget {
        public ThrowingConstructorTarget() {
            throw new RuntimeException("Constructor error for test");
        }
    }

    public static class NoDefaultConstructorTarget {
        public NoDefaultConstructorTarget(String arg) {
        }
    }

    public static class TargetOwner {
        public SubTarget subTarget;
        public TargetWithSetter setterTarget;
        public TargetWithMultipleSameType multipleTarget;
        public TargetWithStaticAndFinal staticFinalTarget;
        public ThrowingConstructorTarget throwingTarget;
        public NoDefaultConstructorTarget noDefaultConstructorTarget;
    }

    @Test
    public void processInjection_givenNullOrEmptyMocks_shouldReturnFalse() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.subTarget = new SubTarget();
        Field field = TargetOwner.class.getDeclaredField("subTarget");
        Set<Object> mocks = Collections.emptySet();

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertFalse(result);
        Assert.assertNull(owner.subTarget.getSubDepB());
        Assert.assertNull(owner.subTarget.getSuperDepA());
    }

    @Test
    public void processInjection_givenMatchingSetter_shouldInjectViaSetterAndReturnTrue() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.setterTarget = new TargetWithSetter();
        Field field = TargetOwner.class.getDeclaredField("setterTarget");

        DependencyA mockA = new DependencyA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertSame(mockA, owner.setterTarget.getDepA());
        Assert.assertTrue(owner.setterTarget.isSetterCalled());
    }

    @Test
    public void processInjection_givenFieldInjectionWithoutSetter_shouldInjectDirectly() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.subTarget = new SubTarget();
        Field field = TargetOwner.class.getDeclaredField("subTarget");

        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockB);

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertSame(mockB, owner.subTarget.getSubDepB());
        Assert.assertNull(owner.subTarget.getSuperDepA());
    }

    @Test
    public void processInjection_givenInheritedFields_shouldInjectSuperclassFields() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.subTarget = new SubTarget();
        Field field = TargetOwner.class.getDeclaredField("subTarget");

        DependencyA mockA = new DependencyA();
        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);
        mocks.add(mockB);

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertSame(mockA, owner.subTarget.getSuperDepA());
        Assert.assertSame(mockB, owner.subTarget.getSubDepB());
    }

    @Test
    public void processInjection_givenNoMatchingCandidate_shouldReturnFalse() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.subTarget = new SubTarget();
        Field field = TargetOwner.class.getDeclaredField("subTarget");

        Set<Object> mocks = new HashSet<Object>();
        mocks.add("NonMatchingStringDependency");

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertFalse(result);
        Assert.assertNull(owner.subTarget.getSubDepB());
        Assert.assertNull(owner.subTarget.getSuperDepA());
    }

    @Test
    public void processInjection_givenStaticAndFinalFields_shouldSkipThemAndInjectNormalField() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.staticFinalTarget = new TargetWithStaticAndFinal();
        Field field = TargetOwner.class.getDeclaredField("staticFinalTarget");

        DependencyA mockA = new DependencyA();
        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);
        mocks.add(mockB);

        DependencyA originalFinal = owner.staticFinalTarget.finalDep;
        TargetWithStaticAndFinal.staticDep = null;

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertNull(TargetWithStaticAndFinal.staticDep);
        Assert.assertSame(originalFinal, owner.staticFinalTarget.finalDep);
        Assert.assertSame(mockB, owner.staticFinalTarget.getNormalDep());
    }

    @Test
    public void processInjection_givenUninitializedTargetField_shouldInstantiateTargetAndInject() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.subTarget = null;
        Field field = TargetOwner.class.getDeclaredField("subTarget");

        DependencyB mockB = new DependencyB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockB);

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertNotNull(owner.subTarget);
        Assert.assertSame(mockB, owner.subTarget.getSubDepB());
    }

    @Test
    public void processInjection_givenTargetConstructorThrowsException_shouldThrowMockitoException() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.throwingTarget = null;
        Field field = TargetOwner.class.getDeclaredField("throwingTarget");

        Set<Object> mocks = new HashSet<Object>();

        try {
            injectionStrategy.processInjection(field, owner, mocks);
            Assert.fail("Expected MockitoException caused by constructor failure");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void processInjection_givenTargetWithNoDefaultConstructor_shouldThrowMockitoException() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.noDefaultConstructorTarget = null;
        Field field = TargetOwner.class.getDeclaredField("noDefaultConstructorTarget");

        Set<Object> mocks = new HashSet<Object>();

        try {
            injectionStrategy.processInjection(field, owner, mocks);
            Assert.fail("Expected MockitoException due to missing no-arg constructor");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void processInjection_givenMultipleCandidatesOfSameType_shouldInjectMatchingByName() throws Exception {
        TargetOwner owner = new TargetOwner();
        owner.multipleTarget = new TargetWithMultipleSameType();
        Field field = TargetOwner.class.getDeclaredField("multipleTarget");

        DependencyA firstDep = new DependencyA();
        DependencyA secondDep = new DependencyA();

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(firstDep);
        mocks.add(secondDep);

        boolean result = injectionStrategy.processInjection(field, owner, mocks);

        Assert.assertTrue(result);
        Assert.assertTrue(owner.multipleTarget.getFirstDep() != null || owner.multipleTarget.getSecondDep() != null);
    }
}