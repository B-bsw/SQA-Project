package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.Property;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class AnalyzePrototypePropertiesTest {

  private static class TestCompiler extends AbstractCompiler {
    private final CodingConvention convention = new CodingConvention() {
      @Override
      public boolean isExported(String name) {
        return name.startsWith("exported_");
      }
    };

    @Override
    public CodingConvention getCodingConvention() {
      return convention;
    }
  }

  private static class TestJSModuleGraph extends JSModuleGraph {
    private final JSModule root;

    TestJSModuleGraph(JSModule root) {
      this.root = root;
    }

    @Override
    public JSModule getRootModule() {
      return root;
    }

    @Override
    public Collection<JSModule> getAllModules() {
      return java.util.Collections.singletonList(root);
    }
  }

  private AbstractCompiler compiler;
  private JSModule module;
  private JSModuleGraph moduleGraph;
  private AnalyzePrototypeProperties pass;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    module = new JSModule("root", 0);
    moduleGraph = new TestJSModuleGraph(module);
    pass = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
  }

  @Test
  public void testProcessNullModuleGraph() {
    AnalyzePrototypeProperties p = new AnalyzePrototypeProperties(compiler, null, false, false);
    Node externRoot = createExternRoot();
    Node root = createRoot();
    p.process(externRoot, root);
    assertNotNull(p.getAllNameInfo());
    assertTrue(p.getAllNameInfo().isEmpty());
  }

  @Test
  public void testProcessEmptyProgram() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(0, infos.size());
  }

  @Test
  public void testProcessPrototypeAssignment() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: Foo.prototype.bar = function() { return 1; };
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessGlobalFunctionDeclaration() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: function foo() {}
    Node function = createFunction("foo");
    root.addChildToBack(function);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("foo", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessPropertyAccess() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: obj.prop = 1;
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node obj = child(getProp, Token.NAME);
    obj.setString("obj");
    Node prop = child(getProp, Token.STRING);
    prop.setString("prop");
    Node value = child(assign, Token.NUMBER);
    value.setDouble(1.0);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(prop);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("prop", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessPrototypePropertyWithNonFunctionValue() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: Foo.prototype.bar = 1;
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.NUMBER);
    value.setDouble(1.0);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessExportedProperty() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: Foo.prototype.exported_bar = function() {};
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("exported_bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessExternProperty() {
    AnalyzePrototypeProperties p = new AnalyzePrototypeProperties(compiler, moduleGraph, true, false);
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: externs have: Foo.prototype.bar = function() {};
    Node expr = child(externRoot, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    externRoot.addChildToBack(expr);

    p.process(externRoot, root);
    Collection<NameInfo> infos = p.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessGlobalFunctionWithExportedName() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: function exported_foo() {}
    Node function = createFunction("exported_foo");
    root.addChildToBack(function);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("exported_foo", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessGlobalFunctionWithNonexportedName() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node function = createFunction("foo");
    root.addChildToBack(function);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("foo", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessNameNodeWithNullScope() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node name = new Node(Token.NAME, "foo");
    name.putProp(Node.SOURCE_PROP, "test");
    root.addChildToBack(name);
    // No scope set, should not crash
    pass.process(externRoot, root);
    assertNotNull(pass.getAllNameInfo());
  }

  @Test
  public void testProcessNameNodeWithFunctionScope() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node function = createFunction("bar");
    Node name = new Node(Token.NAME, "local");
    function.addChildToBack(name);
    root.addChildToBack(function);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessMultipleScopes() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node globalFunction = createFunction("global");
    root.addChildToBack(globalFunction);

    Node localFunction = createFunction("local");
    root.addChildToBack(localFunction);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(2, infos.size());
  }

  @Test
  public void testGetAllNameInfoConsistency() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("bar", info.getName());
    assertTrue(info.isReferenced());
  }

  @Test
  public void testProcessChainedPrototypeAssign() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    // Simulate: Foo.prototype.bar.baz = function() {};
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp1 = child(assign, Token.GETPROP);
    Node foo = child(getProp1, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp1, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node bar = child(getProp1, Token.STRING);
    bar.setString("bar");
    bar.setQuotedString(false);
    Node baz = child(getProp1, Token.STRING);
    baz.setString("baz");
    baz.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp1);
    getProp1.addChildToBack(proto);
    getProp1.addChildToBack(bar);
    getProp1.addChildToBack(baz);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(0, infos.size());
  }

  @Test
  public void testProcessGetPropInDifferentContext() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node expr = child(module, Token.EXPR_RESULT);
    Node getProp = child(expr, Token.GETPROP);
    Node obj = child(getProp, Token.NAME);
    obj.setString("Foo");
    Node prop = child(getProp, Token.STRING);
    prop.setString("prototype");
    getProp.addChildToBack(prop);
    expr.addChildToBack(getProp);
    root.addChildToBack(expr);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(0, infos.size());
  }

  @Test
  public void testProcessGlobalFunctionDeclarationWithParentName() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node name = new Node(Token.NAME, "foo");
    Node function = createFunction("unnamed");
    name.addChildToBack(function);
    root.addChildToBack(name);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("foo", info.getName());
  }

  @Test
  public void testProcessFunctionWithNoName() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node function = new Node(Token.FUNCTION);
    function.setIsFunction(true);
    root.addChildToBack(function);

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(0, infos.size());
  }

  @Test
  public void testProcessAssignmentToPrototypeWithMultipleChildren() {
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node expr = child(module, Token.EXPR_RESULT);
    Node assign = child(expr, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.NUMBER);
    value.setDouble(5.0);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    expr.addChildToBack(assign);
    root.addChildToBack(expr);
    root.addChildToBack(expr.cloneTree());

    pass.process(externRoot, root);
    Collection<NameInfo> infos = pass.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
    NameInfo info = infos.iterator().next();
    assertEquals("prototype", info.getName()); // Actually "prototype" is not a property
  }

  @Test
  public void testNameInfoToString() {
    NameInfo info = new NameInfo("test");
    assertEquals("test", info.toString());
  }

  @Test
  public void testNameInfoEquals() {
    NameInfo info1 = new NameInfo("test");
    NameInfo info2 = new NameInfo("test");
    assertTrue(info1.equals(info2));
  }

  @Test
  public void testNameInfoHashCode() {
    NameInfo info = new NameInfo("test");
    assertTrue(info.hashCode() != 0);
  }

  @Test
  public void testExternNodeHandling() {
    AnalyzePrototypeProperties p = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node externProp = child(externRoot, Token.EXPR_RESULT);
    Node assign = child(externProp, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    externProp.addChildToBack(assign);
    externRoot.addChildToBack(externProp);

    p.process(externRoot, root);
    Collection<NameInfo> infos = p.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(0, infos.size());
  }

  @Test
  public void testCanModifyExternsTrue() {
    AnalyzePrototypeProperties p = new AnalyzePrototypeProperties(compiler, moduleGraph, true, false);
    Node externRoot = createExternRoot();
    Node root = createRoot();
    Node externProp = child(externRoot, Token.EXPR_RESULT);
    Node assign = child(externProp, Token.ASSIGN);
    Node getProp = child(assign, Token.GETPROP);
    Node foo = child(getProp, Token.NAME);
    foo.setString("Foo");
    Node proto = child(getProp, Token.STRING);
    proto.setString("prototype");
    proto.setQuotedString(false);
    Node value = child(assign, Token.FUNCTION);
    value.setIsFunction(true);
    assign.setFirstChild(getProp);
    getProp.addChildToBack(proto);
    assign.addChildToBack(value);
    externProp.addChildToBack(assign);
    externRoot.addChildToBack(externProp);

    p.process(externRoot, root);
    Collection<NameInfo> infos = p.getAllNameInfo();
    assertNotNull(infos);
    assertEquals(1, infos.size());
  }

  private Node createExternRoot() {
    return new Node(Token.EMPTY);
  }

  private Node createRoot() {
    Node root = new Node(Token.EMPTY);
    root.setIsEquivalentTo(null);
    return root;
  }

  private Node child(Node parent, int type) {
    Node n = new Node(type);
    parent.addChildToBack(n);
    return n;
  }

  private Node createFunction(String name) {
    Node function = new Node(Token.FUNCTION);
    function.setIsFunction(true);
    if (name != null) {
      Node nameNode = new Node(Token.NAME, name);
      function.addChildToFront(nameNode);
      nameNode.setParent(function);
    }
    return function;
  }
}