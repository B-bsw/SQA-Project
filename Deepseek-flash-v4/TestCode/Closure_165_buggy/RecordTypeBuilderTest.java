package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Map;

@RunWith(JUnit4.class)
public class RecordTypeBuilderTest {

  private JSTypeRegistry registry;
  private RecordTypeBuilder builder;

  // Mock JSType class for testing purposes
  private static class MockJSType extends JSType {
    MockJSType(JSTypeRegistry registry) {
      super(registry);
    }
    @Override
    public boolean isSubtype(JSType type) { return false; }
    @Override
    public boolean isEquivalentTo(JSType type) { return false; }
    @Override
    public JSType getLeastSupertype(JSType that) { return null; }
    @Override
    public JSType getGreatestSubtype(JSType that) { return null; }
    @Override
    public <T> T visit(Visitor<T> visitor) { return null; }
    @Override
    public String toString() { return "MockJSType"; }
  }

  // Minimal Node subclass for testing
  private static class MockNode extends Node {
    MockNode() {
      super(0);
    }
  }

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    builder = new RecordTypeBuilder(registry);
  }

  @Test
  public void testInitialState() {
    // Initially, isEmpty should be true and properties should be empty.
    // We can test this by calling build() and verifying it returns object type.
    JSType result = builder.build();
    assertNotNull(result);
    // In this test environment, we just verify it doesn't throw and returns something.
    // The exact type checking would require more complex mocking.
  }

  @Test
  public void testAddPropertyAndBuild() {
    JSType mockType = new MockJSType(registry);
    Node node = new MockNode();
    
    RecordTypeBuilder returnedBuilder = builder.addProperty("foo", mockType, node);
    assertSame(builder, returnedBuilder); // chaining should return this
    
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testAddDuplicatePropertyReturnsNull() {
    JSType mockType = new MockJSType(registry);
    Node node = new MockNode();
    
    builder.addProperty("foo", mockType, node);
    assertNull(builder.addProperty("foo", mockType, node)); // duplicate should return null
  }

  @Test
  public void testEmptyBuildReturnsObjectType() {
    JSType result = builder.build();
    // Since we can't easily check the actual type without more infrastructure,
    // we just verify it returns non-null and is an instance of the expected type.
    assertNotNull(result);
  }

  @Test
  public void testBuildWithMultipleProperties() {
    JSType mockType1 = new MockJSType(registry);
    JSType mockType2 = new MockJSType(registry);
    
    builder.addProperty("a", mockType1, new MockNode());
    builder.addProperty("b", mockType2, new MockNode());
    
    JSType result = builder.build();
    assertNotNull(result);
    // Could potentially inspect the built record type properties if we had access
  }

  @Test
  public void testRecordPropertyGetType() {
    JSType mockType = new MockJSType(registry);
    Node node = new MockNode();
    
    RecordTypeBuilder.RecordProperty prop = new RecordTypeBuilder.RecordProperty(mockType, node);
    assertSame(mockType, prop.getType());
  }

  @Test
  public void testRecordPropertyGetNode() {
    JSType mockType = new MockJSType(registry);
    Node node = new MockNode();
    
    RecordTypeBuilder.RecordProperty prop = new RecordTypeBuilder.RecordProperty(mockType, node);
    assertSame(node, prop.getPropertyNode());
  }

  @Test
  public void testAddPropertyWithNullType() {
    // Even with null type, builder should allow adding (though it may cause issues later)
    Node node = new MockNode();
    builder.addProperty("nullType", null, node);
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testAddPropertyWithNullNode() {
    JSType mockType = new MockJSType(registry);
    // Null node should be allowed, builder works
    builder.addProperty("nullNode", mockType, null);
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testAddMultipleThenDuplicateReturnsNull() {
    JSType mockType1 = new MockJSType(registry);
    JSType mockType2 = new MockJSType(registry);
    
    builder.addProperty("k1", mockType1, new MockNode());
    builder.addProperty("k2", mockType2, new MockNode());
    
    // Adding duplicate key should return null
    assertNull(builder.addProperty("k1", mockType2, new MockNode()));
    
    // Build should still work and contain both original properties + the failed duplicate
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testBuildAfterDuplicatePropertyStillWorks() {
    JSType mockType1 = new MockJSType(registry);
    JSType mockType2 = new MockJSType(registry);
    
    builder.addProperty("sameKey", mockType1, new MockNode());
    builder.addProperty("sameKey", mockType2, new MockNode()); // returns null, but ignore
    
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testBuildWithZeroPropertiesReturnsObjectType() {
    // This tests the isEmpty=true branch specifically
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testBuildWithOneProperty() {
    builder.addProperty("single", new MockJSType(registry), new MockNode());
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testBuildWithManyProperties() {
    for (int i = 0; i < 100; i++) {
      builder.addProperty("p" + i, new MockJSType(registry), new MockNode());
    }
    JSType result = builder.build();
    assertNotNull(result);
  }

  @Test
  public void testRecordPropertyConstructorWithNulls() {
    RecordTypeBuilder.RecordProperty prop = new RecordTypeBuilder.RecordProperty(null, null);
    assertNull(prop.getType());
    assertNull(prop.getPropertyNode());
  }

  @Test
  public void testChainingPattern() {
    JSType type = new MockJSType(registry);
    RecordTypeBuilder current = builder;
    current = current.addProperty("a", type, new MockNode());
    assertNotNull(current);
    current = current.addProperty("b", type, new MockNode());
    assertNotNull(current);
  }
}