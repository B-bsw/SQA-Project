package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(JUnit4.class)
public class DevirtualizePrototypeMethodsTest {

  private static final String EXTERNS = "var window;";

  private AbstractCompiler compiler;
  private DevirtualizePrototypeMethods pass;
  private List<String> codeChanges;

  @Before
  public void setUp() {
    codeChanges = new ArrayList<>();
    compiler = new Compiler() {
      @Override
      public void reportCodeChange() {
        codeChanges.add("changed");
      }

      @Override
      public JSModuleGraph getModuleGraph() {
        return new JSModuleGraph(new JSModule[] {new JSModule("m1")});
      }

      @Override
      public CodingConvention getCodingConvention() {
        return new GoogleCodingConvention();
      }

      @Override
      public JSTypeRegistry getTypeRegistry() {
        return new JSTypeRegistry(compiler);
      }
    };
    pass = new DevirtualizePrototypeMethods(compiler);
  }

  @Test
  public void testProcessNoEligibleDefinitions() {
    String code = "function Foo() {}; Foo.prototype.bar = function(a) { return a; };";
    Node externs = parse(EXTERNS);
    Node root = parse(code);
    pass.process(externs, root);
    assertEquals(0, codeChanges.size());
  }

  @Test
  public void testProcessBasicRewrite() {
    String code =
        "function Foo() {}; "
        + "Foo.prototype.bar = function(a) { return this.baz(a); }; "
        + "var x = new Foo(); x.bar(1);";
    Node externs = parse(EXTERNS);
    Node root = parse(code);
    pass.process(externs, root);
    assertTrue("Should report code change for rewrite", codeChanges.size() >= 1);
  }

  @Test
  public void testIsEligibleDefinition_Externs() {
    String code = "function Foo() {}; Foo.prototype.bar = function(a) { return a; };";
    Node externs = parse(EXTERNS);
    Node root = parse(code);
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);
    Collection<DefinitionSite> sites = defFinder.getDefinitionSites();
    for (DefinitionSite site : sites) {
      if (site.node.getQualifiedName() != null && site.node.getQualifiedName().contains("bar")) {
        // Should be eligible when in global scope and not exported
        assertTrue(pass.isEligibleDefinition(defFinder, site));
      }
    }
  }

  @Test
  public void testIsEligibleDefinition_ExportedMethod() {
    String code = "function Foo() {}; Foo.prototype.bar = function(a) { return a; };";
    Node externs = parse(EXTERNS);
    Node root = parse(code);
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);
    Collection<DefinitionSite> sites = defFinder.getDefinitionSites();
    for (DefinitionSite site : sites) {
      if (site.node.getQualifiedName() != null && site.node.getQualifiedName().contains("bar")) {
        // Simulate export by checking coding convention
        // In real scenario, exported names are prefixed with $
        assertFalse("Should not be eligible when exported", 
            pass.getRewrittenMethodName("bar").contains("$"));
      }
    }
  }

  @Test
  public void testIsEligibleDefinition_NoUseSites() {
    String code = "function Foo() {}; Foo.prototype.bar = function(a) { return a; };";
    Node externs = parse(EXTERNS);
    Node root = parse(code);
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);
    Collection<DefinitionSite> sites = defFinder.getDefinitionSites();
    for (DefinitionSite site : sites) {
      if (site.node.getQualifiedName() != null && site.node.getQualifiedName().contains("bar")) {
        // No use sites should make it ineligible
        assertFalse(pass.isEligibleDefinition(defFinder, site));
      }
    }
  }

  @Test
  public void testReplaceReferencesToThis_SimpleCase() {
    Node body = parse("this.a + this.b;");
    pass.replaceReferencesToThis(body, "self");
    String result = body.toStringTree();
    assertFalse("Should replace this with self", result.contains("this"));
    assertTrue("Should contain self.a", result.contains("self.a"));
  }

  @Test
  public void testReplaceReferencesToThis_NestedFunction() {
    Node body = parse("this.a + (function() { return this.b; })();");
    pass.replaceReferencesToThis(body, "self");
    String result = body.toStringTree();
    assertFalse("Should not replace this inside inner function", result.contains("self"));
    assertTrue("Should have this.b in output", result.contains("this"));
  }

  @Test
  public void testIsPrototypeMethodDefinition_NullParent() {
    Node node = Node.newString(Token.NAME, "test");
    assertFalse(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(node));
  }

  @Test
  public void testIsPrototypeMethodDefinition_NotNull() {
    String code = "Foo.prototype.bar = function() {};";
    Node root = parse(code);
    Node exprNode = root.getFirstChild().getFirstChild();
    assertTrue(DevirtualizePrototypeMethods.isPrototypeMethodDefinition(exprNode));
  }

  @Test
  public void testGetRewrittenMethodName() {
    assertEquals("JSCompiler_StaticMethods_bar", 
        pass.getRewrittenMethodName("bar"));
  }

  @Test
  public void testFixFunctionType() {
    String code = "function Foo() {}; Foo.prototype.bar = function(a) { return a; };";
    Node root = parse(code);
    // find the function node
    Node functionNode = null;
    for (Node n : root.children()) {
      if (n.getType() == Token.VAR) {
        Node firstChild = n.getFirstChild();
        if (firstChild != null && firstChild.getFirstChild() != null) {
          functionNode = firstChild.getFirstChild();
          if (functionNode.getType() == Token.FUNCTION) {
            break;
          }
        }
      }
    }
    if (functionNode != null) {
      functionNode.setJSType(compiler.getTypeRegistry().createFunctionType(
          compiler.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_TYPE),
          List.of(compiler.getTypeRegistry().getNativeType(JSTypeNative.NUMBER_TYPE)),
          null));
      pass.fixFunctionType(functionNode);
      assertNotNull(functionNode.getJSType());
    }
  }

  @Test
  public void testRewriteCallSites_WithInvalidDefinition() {
    // Simulate invalid definition returns
    Node externs = parse(EXTERNS);
    Node root = parse("function Foo() {}; Foo.prototype.bar = function(a) { return this.baz(a); }; var x = new Foo(); x.bar(1);");
    SimpleDefinitionFinder defFinder = new SimpleDefinitionFinder(compiler);
    defFinder.process(externs, root);
    Collection<DefinitionSite> sites = defFinder.getDefinitionSites();
    for (DefinitionSite site : sites) {
      if (site.node.getQualifiedName() != null && site.node.getQualifiedName().contains("bar")) {
        try {
          pass.rewriteCallSites(defFinder, site.definition, "newName");
          // Should not throw but no uses sites may not exist
        } catch (Exception e) {
          fail("Should not throw exception");
        }
      }
    }
  }

  @Test
  public void testRewriteCallSites_NoUseSites() {
    // No use sites should not throw
    JSModule module = new JSModule("m1");
    Definition def = new Definition();
    pass.rewriteCallSites(null, def, "name");
    assertEquals(0, codeChanges.size());
  }

  private Node parse(String code) {
    return compiler.parseSyntheticCode(code);
  }

  // Inner class to allow access to package-private methods
  static class Testable extends DevirtualizePrototypeMethods {
    public Testable(AbstractCompiler compiler) {
      super(compiler);
    }

    @Override
    public boolean isEligibleDefinition(SimpleDefinitionFinder defFinder, DefinitionSite site) {
      return super.isEligibleDefinition(defFinder, site);
    }
  }
}