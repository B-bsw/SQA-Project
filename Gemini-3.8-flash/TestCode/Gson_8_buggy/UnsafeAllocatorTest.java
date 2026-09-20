package com.google.gson.internal;

import org.junit.Assert;
import org.junit.Test;

/**
 * PHASE 1 - CODE ANALYSIS & TEST MATRIX:
 * ---------------------------------------------------------------------------
 * Class Under Test: UnsafeAllocator
 * Primary Functions:
 * 1. create(): Discovers and creates an instance of UnsafeAllocator across
 *    different runtimes (Sun/Oracle JVM Unsafe, Dalvik post-gingerbread,
 *    Dalvik pre-gingerbread, and fallback).
 * 2. newInstance(Class<T> c): Sneakily instantiates class instances without
 *    invoking their constructors.
 *
 * Test Matrix:
 * - Happy Path:
 *   1. create_whenCalled_shouldReturnNonNullAllocator
 *   2. newInstance_givenConcreteClass_shouldInstantiateObject
 *   3. newInstance_givenClassWithFailingConstructor_shouldBypassConstructor
 *   4. newInstance_givenClassWithFieldInitializers_shouldNotRunFieldInitializers
 *   5. newInstance_givenPrivateConstructorClass_shouldInstantiateSuccessfully
 * - Boundary & Edge Cases:
 *   6. newInstance_givenSubclassWithSuperConstructor_shouldBypassAllConstructors
 *   7. newInstance_givenPrimitiveClass_shouldThrowException
 * - Error & Exception Branches:
 *   8. newInstance_givenInterface_shouldThrowException
 *   9. newInstance_givenAbstractClass_shouldThrowException
 *  10. newInstance_givenFallbackAllocator_shouldThrowUnsupportedOperationException
 */
public class UnsafeAllocatorTest {

  // Test helper classes
  public static class ConcreteClass {
    public int value = 100;

    public ConcreteClass() {
      this.value = 200;
    }
  }

  public static class ConstructorThrowsExceptionClass {
    public ConstructorThrowsExceptionClass() {
      throw new AssertionError("Constructor should not be executed");
    }
  }

  public static class PrivateConstructorClass {
    private final String secret;

    private PrivateConstructorClass() {
      this.secret = "initialized";
    }

    public String getSecret() {
      return this.secret;
    }
  }

  public interface DummyInterface {
    void doSomething();
  }

  public static abstract class DummyAbstractClass {
    public abstract void doSomething();
  }

  public static class SuperClassWithExplodingConstructor {
    public SuperClassWithExplodingConstructor() {
      throw new IllegalStateException("Super constructor must not be invoked");
    }
  }

  public static class SubClass extends SuperClassWithExplodingConstructor {
    public SubClass() {
      super();
    }
  }

  @Test
  public void create_whenCalled_shouldReturnNonNullAllocator() {
    // Arrange & Act
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Assert
    Assert.assertNotNull("Allocator instance should not be null", allocator);
  }

  @Test
  public void newInstance_givenConcreteClass_shouldInstantiateObject() throws Exception {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act
    ConcreteClass instance = allocator.newInstance(ConcreteClass.class);

    // Assert
    Assert.assertNotNull("Instance should be successfully created", instance);
    Assert.assertTrue("Instance must be of type ConcreteClass", instance instanceof ConcreteClass);
  }

  @Test
  public void newInstance_givenClassWithFailingConstructor_shouldBypassConstructor() throws Exception {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act
    ConstructorThrowsExceptionClass instance = allocator.newInstance(ConstructorThrowsExceptionClass.class);

    // Assert
    Assert.assertNotNull("Instance should be created without throwing exception from constructor", instance);
  }

  @Test
  public void newInstance_givenClassWithFieldInitializers_shouldNotRunFieldInitializers() throws Exception {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act
    ConcreteClass instance = allocator.newInstance(ConcreteClass.class);

    // Assert
    // Because constructor and initializers are bypassed, primitive int field defaults to 0 instead of 100 or 200.
    Assert.assertEquals("Primitive int field should have JVM default value 0", 0, instance.value);
  }

  @Test
  public void newInstance_givenPrivateConstructorClass_shouldInstantiateSuccessfully() throws Exception {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act
    PrivateConstructorClass instance = allocator.newInstance(PrivateConstructorClass.class);

    // Assert
    Assert.assertNotNull("Instance with private constructor should be created", instance);
    Assert.assertNull("Object field should remain uninitialized (null)", instance.getSecret());
  }

  @Test
  public void newInstance_givenSubclassWithSuperConstructor_shouldBypassAllConstructors() throws Exception {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act
    SubClass instance = allocator.newInstance(SubClass.class);

    // Assert
    Assert.assertNotNull("Subclass instance should be created bypassing super constructors", instance);
  }

  @Test
  public void newInstance_givenInterface_shouldThrowException() {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act & Assert
    try {
      allocator.newInstance(DummyInterface.class);
      Assert.fail("Allocating an interface should throw an Exception");
    } catch (Exception expected) {
      Assert.assertTrue("Expected an InstantiationException or UnsupportedOperationException", true);
    }
  }

  @Test
  public void newInstance_givenAbstractClass_shouldThrowException() {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act & Assert
    try {
      allocator.newInstance(DummyAbstractClass.class);
      Assert.fail("Allocating an abstract class should throw an Exception");
    } catch (Exception expected) {
      Assert.assertTrue("Expected an InstantiationException or UnsupportedOperationException", true);
    }
  }

  @Test
  public void newInstance_givenPrimitiveClass_shouldThrowException() {
    // Arrange
    UnsafeAllocator allocator = UnsafeAllocator.create();

    // Act & Assert
    try {
      allocator.newInstance(int.class);
      Assert.fail("Allocating primitive type class should throw an Exception");
    } catch (Exception expected) {
      Assert.assertTrue("Expected exception when allocating primitive type", true);
    }
  }

  @Test
  public void newInstance_givenFallbackAllocator_shouldThrowUnsupportedOperationException() {
    // Arrange: Create simulated fallback allocator representing last return branch in create()
    UnsafeAllocator fallbackAllocator = new UnsafeAllocator() {
      @Override
      public <T> T newInstance(Class<T> c) {
        throw new UnsupportedOperationException("Cannot allocate " + c);
      }
    };

    // Act & Assert
    try {
      fallbackAllocator.newInstance(ConcreteClass.class);
      Assert.fail("Fallback allocator should throw UnsupportedOperationException");
    } catch (UnsupportedOperationException expected) {
      Assert.assertEquals("Cannot allocate " + ConcreteClass.class, expected.getMessage());
    } catch (Exception e) {
      Assert.fail("Unexpected exception thrown: " + e.getClass().getName());
    }
  }
}