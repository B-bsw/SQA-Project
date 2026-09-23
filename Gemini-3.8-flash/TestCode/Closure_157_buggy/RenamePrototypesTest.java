package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class RenamePrototypesTest {

  private RenamePrototypes renamePrototypes;
  private Compiler compiler;
  private Node externsRoot;
  private Node root;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
    externsRoot = new Node(Token.EMPTY);
    root = new Node(Token.EMPTY);
    renamePrototypes = new RenamePrototypes(compiler, false, null, null);
  }

  @Test
  public void testProcessExternedProperties() {
    Node externs = new Node(Token.SCRIPT);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node target = Node.newString(Token.NAME, "obj");
    Node propName = Node.newString("bar");
    getProp.addChildToBack(target);
    getProp.addChildToBack(propName);
    externs.addChildToBack(getProp);

    renamePrototypes.process(externs, root);
    
    NodeTraversal.traverse(compiler, externs, renamePrototypes.new ProcessExternedProperties());
    assertNotNull(renamePrototypes.reservedNames);
    assertTrue(renamePrototypes.reservedNames.contains("bar"));
  }

  @Test
  public void testProcessPrototypeParentAssignment() {
    Node script = new Node(Token.SCRIPT);
    Node assign = new Node(Token.ASSIGN);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node prototypeNode = Node.newString(Token.NAME, "prototype");
    Node objectLit = new Node(Token.OBJECTLIT);
    Node key1 = Node.newString("getBar");
    Node val1 = new Node(Token.FUNCTION);
    objectLit.addChildToBack(key1);
    objectLit.addChildToBack(val1);
    
    getProp.addChildToBack(prototypeNode);
    assign.addChildToBack(getProp);
    assign.addChildToBack(objectLit);
    script.addChildToBack(assign);

    renamePrototypes.process(new Node(Token.SCRIPT), script);
    NodeTraversal.traverse(compiler, script, renamePrototypes.new ProcessProperties());
    
    assertTrue(renamePrototypes.properties.containsKey("getBar"));
    assertTrue(renamePrototypes.prototypeObjLits.contains(objectLit));
  }

  @Test
  public void testMarkPrototypePropertyCandidate() {
    Node stringNode = Node.newString("foo_bar");
    CompilerInput input = new CompilerInput(new Node(Token.SCRIPT));
    renamePrototypes.markPrototypePropertyCandidate(stringNode, input);
    
    assertTrue(renamePrototypes.stringNodes.contains(stringNode));
    assertEquals(1, renamePrototypes.properties.get("foo_bar").prototypeCount);
  }

  @Test
  public void testMarkObjLitPropertyCandidate() {
    Node stringNode = Node.newString("foo_bar");
    CompilerInput input = new CompilerInput(new Node(Token.SCRIPT));
    renamePrototypes.markObjLitPropertyCandidate(stringNode, input);
    
    assertEquals(1, renamePrototypes.properties.get("foo_bar").objLitCount);
  }

  @Test
  public void testMarkPropertyAccessCandidate() {
    Node stringNode = Node.newString("foo_bar");
    CompilerInput input = new CompilerInput(new Node(Token.SCRIPT));
    renamePrototypes.markPropertyAccessCandidate(stringNode, input);
    
    assertEquals(1, renamePrototypes.properties.get("foo_bar").refCount);
  }

  @Test
  public void testGetPropertyCreatesNewProperty() {
    Property prop = renamePrototypes.getProperty("testProp");
    assertNotNull(prop);
    assertEquals("testProp", prop.oldName);
    assertEquals(0, prop.count());
  }

  @Test
  public void testGetPropertyExistingProperty() {
    Property prop1 = renamePrototypes.getProperty("testProp");
    Property prop2 = renamePrototypes.getProperty("testProp");
    assertSame(prop1, prop2);
  }

  @Test
  public void testPropertyCanRename() {
    Property prop = renamePrototypes.new Property("test_");
    prop.prototypeCount = 1;
    assertTrue(prop.canRename());
    
    prop = renamePrototypes.new Property("Test_");
    prop.prototypeCount = 1;
    assertTrue(prop.canRename());
  }

  @Test
  public void testPropertyCannotRenameExported() {
    Property prop = renamePrototypes.new Property("test_");
    prop.prototypeCount = 1;
    compiler.setCodingConvention(new DefaultCodingConvention() {
      @Override
      public boolean isExported(String name) {
        return true;
      }
    });
    assertFalse(prop.canRename());
  }

  @Test
  public void testPropertyCannotRenameForObjLit() {
    Property prop = renamePrototypes.new Property("test");
    prop.objLitCount = 1;
    assertFalse(prop.canRename());
  }

  @Test
  public void testBoundaryPropertyCounting() {
    Property prop = renamePrototypes.new Property("test");
    prop.prototypeCount = 1;
    assertEquals(1, prop.count());
    
    prop = renamePrototypes.new Property("test2");
    prop.objLitCount = 2;
    assertEquals(2, prop.count());
    
    prop = renamePrototypes.new Property("test3");
    prop.refCount = 3;
    assertEquals(3, prop.count());
  }

  @Test
  public void testProcessWithNullReservedCharacters() {
    renamePrototypes = new RenamePrototypes(compiler, true, null, null);
    Node script = new Node(Token.SCRIPT);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node target = Node.newString(Token.NAME, "obj");
    Node propName = Node.newString("bar_");
    getProp.addChildToBack(target);
    getProp.addChildToBack(propName);
    script.addChildToBack(getProp);
    
    renamePrototypes.process(externsRoot, script);
    NodeTraversal.traverse(compiler, script, renamePrototypes.new ProcessProperties());
    
    assertFalse(renamePrototypes.getPropertyMap().getOriginalNameToNewNameMap().isEmpty());
  }

  @Test
  public void testProcessWithReservedNames() {
    renamePrototypes = new RenamePrototypes(compiler, true, new char[]{'a'}, null);
    Node script = new Node(Token.SCRIPT);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node target = Node.newString(Token.NAME, "obj");
    Node propName = Node.newString("bar_");
    getProp.addChildToBack(target);
    getProp.addChildToBack(propName);
    script.addChildToBack(getProp);
    
    renamePrototypes.process(externsRoot, script);
    NodeTraversal.traverse(compiler, script, renamePrototypes.new ProcessProperties());
    
    VariableMap map = renamePrototypes.getPropertyMap();
    assertFalse(map.getOriginalNameToNewNameMap().isEmpty());
  }

  @Test
  public void testProcessPropertiesIncrementsCount() {
    Node script = new Node(Token.SCRIPT);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node target = Node.newString(Token.NAME, "obj");
    Node propName = Node.newString("bar_");
    getProp.addChildToBack(target);
    getProp.addChildToBack(propName);
    script.addChildToBack(getProp);

    NodeTraversal.traverse(compiler, script, renamePrototypes.new ProcessProperties());
    
    Property prop = renamePrototypes.properties.get("bar_");
    assertNotNull(prop);
    assertEquals(1, prop.refCount);
  }

  @Test
  public void testProcessPrototypeParentWithObjLit() {
    Node script = new Node(Token.SCRIPT);
    Node assign = new Node(Token.ASSIGN);
    Node getProp = Node.newString(Token.GETPROP, "foo");
    Node prototypeNode = Node.newString(Token.NAME, "prototype");
    Node objectLit = new Node(Token.OBJECTLIT);
    Node key1 = Node.newString("bar_");
    Node val1 = new Node(Token.FUNCTION);
    objectLit.addChildToBack(key1);
    objectLit.addChildToBack(val1);
    
    getProp.addChildToBack(prototypeNode);
    assign.addChildToBack(getProp);
    assign.addChildToBack(objectLit);
    script.addChildToBack(assign);

    renamePrototypes.process(new Node(Token.SCRIPT), script);
    NodeTraversal.traverse(compiler, script, renamePrototypes.new ProcessProperties());
    
    assertTrue(renamePrototypes.prototypeObjLits.contains(objectLit));
    Property prop = renamePrototypes.properties.get("bar_");
    assertNotNull(prop);
    assertEquals(1, prop.objLitCount);
  }
}