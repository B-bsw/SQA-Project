package org.mockito.internal.creation.instance;

import org.junit.Assert;
import org.junit.Test;

public class ConstructorInstantiatorTest {

    public static class SimpleClass {
        public SimpleClass() {
        }
    }

    public static class ClassWithoutNoArgConstructor {
        public ClassWithoutNoArgConstructor(String param) {
        }
    }

    public static abstract class AbstractTestClass {
        public AbstractTestClass() {
        }
    }

    public static class ThrowingConstructorClass {
        public ThrowingConstructorClass() {
            throw new RuntimeException("Error inside no-arg constructor");
        }
    }

    public static class OuterTestClass {
        public class InnerTestClass {
            public InnerTestClass() {
            }
        }

        public class ThrowingInnerTestClass {
            public ThrowingInnerTestClass() {
                throw new RuntimeException("Error inside inner constructor");
            }
        }
    }

    public static class UnrelatedOuterClass {
    }

    @Test
    public void newInstance_givenNullOuterClassAndValidClass_shouldInstantiateSuccessfully() {
        // Arrange
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        // Act
        SimpleClass instance = instantiator.newInstance(SimpleClass.class);

        // Assert
        Assert.assertNotNull(instance);
    }

    @Test
    public void newInstance_givenNullOuterClassAndNoArgConstructorMissing_shouldThrowInstantationException() {
        // Arrange
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        // Act & Assert
        try {
            instantiator.newInstance(ClassWithoutNoArgConstructor.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'ClassWithoutNoArgConstructor'") != -1);
            Assert.assertTrue(message.indexOf("Please ensure it has parameter-less constructor.") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void newInstance_givenNullOuterClassAndAbstractClass_shouldThrowInstantationException() {
        // Arrange
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        // Act & Assert
        try {
            instantiator.newInstance(AbstractTestClass.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'AbstractTestClass'") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void newInstance_givenNullOuterClassAndConstructorThrowsException_shouldThrowInstantationException() {
        // Arrange
        ConstructorInstantiator instantiator = new ConstructorInstantiator(null);

        // Act & Assert
        try {
            instantiator.newInstance(ThrowingConstructorClass.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'ThrowingConstructorClass'") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void newInstance_givenValidOuterClassAndInnerClass_shouldInstantiateSuccessfully() {
        // Arrange
        OuterTestClass outerInstance = new OuterTestClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);

        // Act
        OuterTestClass.InnerTestClass innerInstance = instantiator.newInstance(OuterTestClass.InnerTestClass.class);

        // Assert
        Assert.assertNotNull(innerInstance);
    }

    @Test
    public void newInstance_givenWrongOuterClassType_shouldThrowInstantationException() {
        // Arrange
        UnrelatedOuterClass wrongOuterInstance = new UnrelatedOuterClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(wrongOuterInstance);

        // Act & Assert
        try {
            instantiator.newInstance(OuterTestClass.InnerTestClass.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'InnerTestClass'") != -1);
            Assert.assertTrue(message.indexOf("Please ensure that the outer instance has correct type") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void newInstance_givenOuterClassAndTopLevelClass_shouldThrowInstantationException() {
        // Arrange
        OuterTestClass outerInstance = new OuterTestClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);

        // Act & Assert
        try {
            instantiator.newInstance(SimpleClass.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'SimpleClass'") != -1);
            Assert.assertTrue(message.indexOf("Please ensure that the outer instance has correct type") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void newInstance_givenOuterClassAndFailingInnerConstructor_shouldThrowInstantationException() {
        // Arrange
        OuterTestClass outerInstance = new OuterTestClass();
        ConstructorInstantiator instantiator = new ConstructorInstantiator(outerInstance);

        // Act & Assert
        try {
            instantiator.newInstance(OuterTestClass.ThrowingInnerTestClass.class);
            Assert.fail("Expected InstantationException to be thrown");
        } catch (InstantationException e) {
            String message = e.getMessage();
            Assert.assertTrue(message.indexOf("Unable to create mock instance of 'ThrowingInnerTestClass'") != -1);
            Assert.assertTrue(message.indexOf("Please ensure that the outer instance has correct type") != -1);
            Assert.assertNotNull(e.getCause());
        }
    }
}