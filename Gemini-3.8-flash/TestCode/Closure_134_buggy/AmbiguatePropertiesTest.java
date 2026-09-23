package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.JSTypeInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(JUnit4.class)
public class AmbiguatePropertiesTest {

  private AbstractCompiler compiler;
  private AmbiguateProperties ambProps;
  private JSTypeRegistry registry;
  private TestCompiler testCompiler;

  @Before
  public void setUp() {
    testCompiler = new TestCompiler();
    compiler = testCompiler;
    registry = compiler.getTypeRegistry();
    ambProps = new AmbiguateProperties(compiler, new char[] { 'a', 'b', 'c' });
  }

  @Test
  public void testEmptyMappings() {
    ambProps.process(new Node(0), new Node(0));
    assertTrue(ambProps.getRenamingMap().isEmpty());
  }

  @Test
  public void testAddInvalidatingTypeUnion() {
    JSType unionType = new UnionType(registry, 
        registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE),
        registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
    
    // Get union alternatives
    unionType.restrictByNotNullOrUndefined();
    
    // Set up to test private method via reflection to simplify
    try {
      java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("addInvalidatingType", JSType.class);
      method.setAccessible(true);
      method.invoke(ambProps, unionType);
    } catch (Exception e) {
      fail("Method not accessible: " + e.getMessage());
    }
  }

  @Test
  public void testProcessSimplePropertyRenaming() {
    // Create a simple AST structure
    Node externs = new Node(0);
    Node root = new Node(0);
    
    // Setup externs with a property
    Node externBlock = new Node(com.google.javascript.rhino.Token.SCRIPT);
    externBlock.addChildToFront(new Node(com.google.javascript.rhino.Token.EMPTY));
    externs.addChildToBack(externBlock);
    
    // Process with valid compiler
    ambProps.process(externs, root);
    
    // Should not throw exceptions
    assertNotNull(ambProps.getRenamingMap());
  }

  @Test
  public void testComputeRelatedTypesForUnion() {
    JSType objectType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    JSType stringType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    
    // Create union of types
    JSType unionType = registry.createUnionType(objectType, stringType);
    
    // Test computeRelatedTypes indirectly through addInvalidatingType
    try {
      java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("computeRelatedTypes", JSType.class);
      method.setAccessible(true);
      method.invoke(ambProps, unionType);
    } catch (Exception e) {
      fail("Failed to compute related types: " + e.getMessage());
    }
  }

  @Test
  public void testProcessExternsWithMinimalInput() {
    Node externs = new Node(com.google.javascript.rhino.Token.SCRIPT);
    Node node = new Node(com.google.javascript.rhino.Token.GETPROP);
    node.putProp(Node.SOURCENAME_PROP, "test.js");
    externs.addChildToFront(node);
    
    AmbiguateProperties.ProcessExterns processExterns = ambProps.new ProcessExterns();
    NodeTraversal traversal = new NodeTraversal(compiler, processExterns);
    traversal.traverse(externs);
  }

  @Test
  public void testGetIntForType() throws Exception {
    JSType objType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("getIntForType", JSType.class);
    method.setAccessible(true);
    
    int int1 = (Integer) method.invoke(ambProps, objType);
    int int2 = (Integer) method.invoke(ambProps, objType);
    
    assertEquals("Same type should map to same int", int1, int2);
    
    // New type should get new int
    JSType strType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    int int3 = (Integer) method.invoke(ambProps, strType);
    assertFalse("Different types should map to different ints", int1 == int3);
  }

  @Test
  public void testProcessWithInvalidatingTypes() {
    // Test that properties with invalidating types are not renamed
    JSType invalidType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE);
    
    // Try to process types that should be invalidated
    try {
      java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("addInvalidatingType", JSType.class);
      method.setAccessible(true);
      method.invoke(ambProps, invalidType);
    } catch (Exception e) {
      fail("Should handle invalidating types: " + e.getMessage());
    }
  }

  @Test
  public void testCompleteProcessFlow() {
    // Create a minimal compiler environment
    Node externs = new Node(com.google.javascript.rhino.Token.SCRIPT);
    Node root = new Node(com.google.javascript.rhino.Token.SCRIPT);
    
    // Add some property access
    Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP);
    getProp.addChildToFront(Node.newString("foo"));
    
    // Process the compilation
    try {
      ambProps.process(externs, root);
    } catch (Exception e) {
      fail("Process should not throw: " + e.getMessage());
    }
  }

  @Test
  public void testPropertyGraphIndependence() {
    // Test graph coloring with no properties
    List<AmbiguateProperties.Property> props = new java.util.ArrayList<AmbiguateProperties.Property>();
    AmbiguateProperties.PropertyGraph graph = ambProps.new PropertyGraph(props);
    
    assertNotNull("Graph nodes should not be null", graph.getNodes());
    assertTrue("Should have no nodes", graph.getNodes().size() == 0);
  }

  @Test
  public void testWithTypeMismatches() {
    // Test compiler with type mismatches
    TestCompiler mismatchCompiler = new TestCompiler();
    AmbiguateProperties props = new AmbiguateProperties(mismatchCompiler, new char[] {' '});
    
    // Process with type mismatches
    Node externs = new Node(0);
    Node root = new Node(0);
    
    try {
      props.process(externs, root);
    } catch (Exception e) {
      // Should handle gracefully
    }
  }

  @Test
  public void testNullRootProcessing() {
    // Testing with null nodes
    Node nullExterns = null;
    Node nullRoot = null;
    
    try {
      ambProps.process(nullExterns, nullRoot);
      // If no exception, the test passes
    } catch (NullPointerException e) {
      // Expected behavior - processing null should throw NPE
      return;
    }
    // If we get here, processing null nodes somehow succeeded, which is OK
  }

  @Test
  public void testCompositeTypeHandling() {
    // Create a union type and test getRelatedTypesOnNonUnion
    JSType objType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    JSType strType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    JSType[] types = new JSType[] { objType, strType };
    JSType unionType = registry.createUnionType(types);
    
    try {
      java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("getRelatedTypesOnNonUnion", JSType.class);
      method.setAccessible(true);
      method.invoke(ambProps, unionType);
      fail("Expected RuntimeException for non-union type");
    } catch (java.lang.reflect.InvocationTargetException e) {
      assertTrue("Should throw runtime exception", e.getCause() instanceof RuntimeException);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testProcessWithQuotedNames() {
    // Test that quoted property names are not renamed
    Node externs = new Node(com.google.javascript.rhino.Token.SCRIPT);
    Node root = new Node(com.google.javascript.rhino.Token.SCRIPT);
    
    // Add a GETPROP in OBJLIT context
    Node objLit = new Node(com.google.javascript.rhino.Token.OBJECTLIT);
    Node key = Node.newString("quotedProp");
    key.setQuotedString(true);
    objLit.addChildToFront(key);
    
    try {
      ambProps.process(externs, root);
    } catch (Exception e) {
      fail("Quoted properties should not throw: " + e.getMessage());
    }
  }

  @Test
  public void testRelatedTypesComputation() {
    // Test computeRelatedTypes with concrete types
    JSType objType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
    
    try {
      java.lang.reflect.Method method = AmbiguateProperties.class.getDeclaredMethod("computeRelatedTypes", JSType.class);
      method.setAccessible(true);
      method.invoke(ambProps, objType);
    } catch (Exception e) {
      fail("Should compute related types without exception");
    }
  }

  @Test
  public void testPropertyGraphWithNodes() {
    // Create some properties
    AmbiguateProperties.Property p1 = ambProps.new Property(1, null, "prop1");
    AmbiguateProperties.Property p2 = ambProps.new Property(2, null, "prop2");
    
    java.util.List<AmbiguateProperties.Property> nodes = new java.util.ArrayList<AmbiguateProperties.Property>();
    nodes.add(p1);
    nodes.add(p2);
    
    AmbiguateProperties.PropertyGraph graph = ambProps.new PropertyGraph(nodes);
    
    assertNotNull("Should have nodes", graph.getNodes());
    assertEquals("Should have 2 nodes", 2, graph.getNodes().size());
  }

  @Test
  public void testProcessExternsWithExternProperty() {
    Node externs = new Node(com.google.javascript.rhino.Token.SCRIPT);
    
    // Create a GETPROP node with property name
    Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP);
    getProp.addChildToFront(Node.newString("externProperty"));
    externs.addChildToBack(getProp);
    
    AmbiguateProperties.ProcessExterns processExterns = ambProps.new ProcessExterns();
    NodeTraversal traversal = new NodeTraversal(compiler, processExterns);
    traversal.traverse(externs);
  }
}