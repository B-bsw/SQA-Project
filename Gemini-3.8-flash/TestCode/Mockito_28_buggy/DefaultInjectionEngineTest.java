package org.mockito.internal.configuration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.base.MockitoException;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine injectionEngine;

    @Before
    public void setUp() {
        injectionEngine = new DefaultInjectionEngine();
    }

    public static class SuperClassWithDependency {
        private String superField;

        public String getSuperField() {
            return superField;
        }
    }

    public static class SubClassWithDependency extends SuperClassWithDependency {
        private Integer subField;

        public Integer getSubField() {
            return subField;
        }
    }

    public static class TestClassWithTarget {
        private SubClassWithDependency target = new SubClassWithDependency();

        public SubClassWithDependency getTarget() {
            return target;
        }
    }

    public static class TestClassWithUninitializedField {
        private SubClassWithDependency target;

        public SubClassWithDependency getTarget() {
            return target;
        }
    }

    public interface UninstantiableInterface {
        void doSomething();
    }

    public static class TestClassWithInterfaceField {
        private UninstantiableInterface target;
    }

    public static class ComparatorSampleClass {
        public Object objectField;
        public String stringField;
        public Integer integerField;
    }

    @Test
    public void injectMocksOnFields_givenEmptyInjectMocksFields_shouldDoNothing() {
        // Arrange
        Set<Field> injectMocksFields = new HashSet<Field>();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add("dummyMock");
        Object testClassInstance = new Object();

        // Act
        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testClassInstance);

        // Assert
        Assert.assertTrue(injectMocksFields.isEmpty());
    }

    @Test
    public void injectMocksOnFields_givenEmptyMocksSet_shouldKeepFieldsNull() throws Exception {
        // Arrange
        TestClassWithTarget testInstance = new TestClassWithTarget();
        Set<Field> injectMocksFields = new HashSet<Field>();
        Field targetField = TestClassWithTarget.class.getDeclaredField("target");
        injectMocksFields.add(targetField);
        Set<Object> mocks = new HashSet<Object>();

        // Act
        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        // Assert
        Assert.assertNotNull(testInstance.getTarget());
        Assert.assertNull(testInstance.getTarget().getSuperField());
        Assert.assertNull(testInstance.getTarget().getSubField());
    }

    @Test
    public void injectMocksOnFields_givenValidMocksAndHierarchy_shouldInjectIntoSubAndSuperClass() throws Exception {
        // Arrange
        TestClassWithTarget testInstance = new TestClassWithTarget();
        Set<Field> injectMocksFields = new HashSet<Field>();
        Field targetField = TestClassWithTarget.class.getDeclaredField("target");
        injectMocksFields.add(targetField);

        Set<Object> mocks = new HashSet<Object>();
        String stringMock = "InjectedSuperString";
        Integer intMock = Integer.valueOf(42);
        mocks.add(stringMock);
        mocks.add(intMock);

        // Act
        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        // Assert
        Assert.assertEquals(stringMock, testInstance.getTarget().getSuperField());
        Assert.assertEquals(intMock, testInstance.getTarget().getSubField());
    }

    @Test
    public void injectMocksOnFields_givenNullFieldInstance_shouldInstantiateAndInject() throws Exception {
        // Arrange
        TestClassWithUninitializedField testInstance = new TestClassWithUninitializedField();
        Set<Field> injectMocksFields = new HashSet<Field>();
        Field targetField = TestClassWithUninitializedField.class.getDeclaredField("target");
        injectMocksFields.add(targetField);

        Set<Object> mocks = new HashSet<Object>();
        Integer intMock = Integer.valueOf(100);
        mocks.add(intMock);

        // Act
        injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);

        // Assert
        Assert.assertNotNull(testInstance.getTarget());
        Assert.assertEquals(intMock, testInstance.getTarget().getSubField());
    }

    @Test
    public void injectMocksOnFields_givenUninstantiableInterfaceField_shouldThrowMockitoException() throws Exception {
        // Arrange
        TestClassWithInterfaceField testInstance = new TestClassWithInterfaceField();
        Set<Field> injectMocksFields = new HashSet<Field>();
        Field interfaceField = TestClassWithInterfaceField.class.getDeclaredField("target");
        injectMocksFields.add(interfaceField);

        Set<Object> mocks = new HashSet<Object>();

        // Act & Assert
        try {
            injectionEngine.injectMocksOnFields(injectMocksFields, mocks, testInstance);
            Assert.fail("Expected MockitoException when initializing interface field");
        } catch (MockitoException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void supertypesLastComparator_givenField1SupertypeOfField2_shouldReturnPositive() throws Exception {
        // Arrange
        Field comparatorField = DefaultInjectionEngine.class.getDeclaredField("supertypesLast");
        comparatorField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Comparator<Field> comparator = (Comparator<Field>) comparatorField.get(injectionEngine);

        Field objectField = ComparatorSampleClass.class.getField("objectField");
        Field stringField = ComparatorSampleClass.class.getField("stringField");

        // Act
        int result = comparator.compare(objectField, stringField);

        // Assert: Object is assignable from String, so supertype comes last -> 1
        Assert.assertEquals(1, result);
    }

    @Test
    public void supertypesLastComparator_givenField2SupertypeOfField1_shouldReturnNegative() throws Exception {
        // Arrange
        Field comparatorField = DefaultInjectionEngine.class.getDeclaredField("supertypesLast");
        comparatorField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Comparator<Field> comparator = (Comparator<Field>) comparatorField.get(injectionEngine);

        Field objectField = ComparatorSampleClass.class.getField("objectField");
        Field stringField = ComparatorSampleClass.class.getField("stringField");

        // Act
        int result = comparator.compare(stringField, objectField);

        // Assert: Object is assignable from String, field2 is supertype -> -1
        Assert.assertEquals(-1, result);
    }

    @Test
    public void supertypesLastComparator_givenUnrelatedTypes_shouldReturnZero() throws Exception {
        // Arrange
        Field comparatorField = DefaultInjectionEngine.class.getDeclaredField("supertypesLast");
        comparatorField.setAccessible(true);
        @SuppressWarnings("unchecked")
        Comparator<Field> comparator = (Comparator<Field>) comparatorField.get(injectionEngine);

        Field stringField = ComparatorSampleClass.class.getField("stringField");
        Field integerField = ComparatorSampleClass.class.getField("integerField");

        // Act
        int result = comparator.compare(stringField, integerField);

        // Assert: Neither String nor Integer is assignable from each other -> 0
        Assert.assertEquals(0, result);
    }
}