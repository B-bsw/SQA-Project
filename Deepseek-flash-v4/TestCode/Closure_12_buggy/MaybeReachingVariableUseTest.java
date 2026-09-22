package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MaybeReachingVariableUseTest {

  private static final class Compiler extends AbstractCompiler {
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n) {}
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n, Node parent) {}
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n, Node parent, Node grandParent) {}
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n, Node parent, Node grandParent, Node greatGrandParent) {}
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n, Node parent, Node grandParent, Node greatGrandParent, Node greatGreatGrandParent) {}
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n, Node parent, Node grandParent, Node greatGrandParent, Node greatGreatGrandParent, Node greatGreatGreatGrandParent) {}
    // ... more overrides ...
  }

  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void process(com.google.javascript.jscomp.NodeTraversal t, Node n) {}
    // ... other abstract methods ...
  }

  private static class TestScope extends Scope {
    private final Map<String, Var> vars = new HashMap<>();

    TestScope(Node root) {
      super(root, null); // assuming Scope constructor takes (Node, Scope)
    }

    @Override
    public Var getVar(String name) {
      return vars.get(name);
    }

    void addVar(String name, Var var) { vars.put(name, var); }
  }

  private static class TestVar extends Var {
    final String name;
    final Scope scope;

    TestVar(String name, Scope scope) {
      this.name = name;
      this.scope = scope;
    }

    @Override
    public String getName() { return name; }
    @Override
    public Scope getScope() { return scope; }
  }

  private TestScope scope;
  private ControlFlowGraph<Node> cfg;
  private MaybeReachingVariableUse analysis;
  private Set<Var> escaped;

  @Before
  public void setUp() throws Exception {
    scope = new TestScope(new Node(Token.BLOCK));
    escaped = new HashSet<>();
    cfg = new ControlFlowGraph<>(null, true, true); // dummy CFG nodes added by test
    analysis = new MaybeReachingVariableUse(cfg, scope, new TestCompiler()) {
      @Override
      private boolean hasExceptionHandler(Node cfgNode) {
        return false;
      }
      // override computeMayUse to test internally
      @Override
      private void computeMayUse(Node n, Node cfgNode, ReachingUses output, boolean conditional) {
        // call private method via reflection? no, just test public getUses
      }
    };
  }

  @Test
  public void testGetUses_noNodesReturnsNull() {
    // when no nodes in CFG, getUses should return null
    Collection<Node> uses = analysis.getUses("x", new Node(Token.NAME));
    assertNull(uses);
  }

  @Test
  public void testGetUses_withLocalVarReturnsEmptyCollection() {
    Node defNode = new Node(Token.NAME, "x");
    Var var = new TestVar("x", scope);
    scope.addVar("x", var);

    // create a CFG node
    DiGraphNode<Node, Branch> cfgNode = new TestDiGraphNode<>(defNode);
    cfg.addNode(cfgNode);

    // setup analysis output: var not used
    analysis.getCfg().getNode(defNode).setAnnotation(new FlowState<>(new ReachingUses(), new ReachingUses()));
    Collection<Node> uses = analysis.getUses("x", defNode);
    assertNotNull(uses);
    assertEquals(0, uses.size());
  }

  @Test
  public void testComputeMayUse_nameAddsLocal() throws Exception {
    Node nameNode = new Node(Token.NAME, "a");
    Node cfgNode = nameNode;
    ReachingUses output = new ReachingUses();
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    // use reflection to test private method
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, nameNode, cfgNode, output, false);

    assertTrue(output.mayUseMap.containsKey(var));
    assertTrue(output.mayUseMap.get(var).contains(nameNode));
  }

  @Test
  public void testComputeMayUse_nameNotLocalSkips() throws Exception {
    Node nameNode = new Node(Token.NAME, "a");
    Node cfgNode = nameNode;
    ReachingUses output = new ReachingUses();

    // var not in scope
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, nameNode, cfgNode, output, false);

    assertTrue(output.mayUseMap.isEmpty());
  }

  @Test
  public void testComputeMayUse_nameConditionalStillAdds() throws Exception {
    Node nameNode = new Node(Token.NAME, "a");
    ReachingUses output = new ReachingUses();
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, nameNode, nameNode, output, true);

    assertTrue(output.mayUseMap.containsKey(var));
    assertEquals(1, output.mayUseMap.get(var).size());
  }

  @Test
  public void testComputeMayUse_blockReturnsWithoutModifyingOutput() throws Exception {
    Node block = new Node(Token.BLOCK);
    block.addChildToFront(new Node(Token.NAME, "a"));
    ReachingUses output = new ReachingUses();

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, block, block, output, false);

    assertTrue(output.mayUseMap.isEmpty());
  }

  @Test
  public void testComputeMayUse_assignRemovesThenAdds() throws Exception {
    Node assign = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "a");
    Node value = new Node(Token.NUMBER, 5.0);
    assign.addChildToFront(name);
    assign.addChildToFront(value);

    ReachingUses output = new ReachingUses();
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    // add "a" to use first
    output.mayUseMap.put(var, new Node(Token.NAME));

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, assign, assign, output, false);

    // should remove "a" then add "a" (since not conditional)
    assertTrue(output.mayUseMap.containsKey(var));
    assertEquals(1, output.mayUseMap.get(var).size());
  }

  @Test
  public void testAddToUseIfLocal_escapedVarNotAdded() {
    Node nameNode = new Node(Token.NAME, "a");
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);
    escaped.add(var); // mark as escaped

    ReachingUses uses = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "addToUseIfLocal", String.class, Node.class, ReachingUses.class);
    method.setAccessible(true);
    try {
      method.invoke(analysis, "a", nameNode, uses);
    } catch (Exception e) {
      fail("Should not throw: " + e.getMessage());
    }

    assertFalse(uses.mayUseMap.containsKey(var));
  }

  @Test
  public void testAddToUseIfLocal_localNotEscaped() throws Exception {
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);
    Node useNode = new Node(Token.NAME, "a");

    ReachingUses uses = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "addToUseIfLocal", String.class, Node.class, ReachingUses.class);
    method.setAccessible(true);
    method.invoke(analysis, "a", useNode, uses);

    assertTrue(uses.mayUseMap.containsKey(var));
    assertTrue(uses.mayUseMap.get(var).contains(useNode));
  }

  @Test
  public void testRemoveFromUseIfLocal_removesEntries() throws Exception {
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);
    Node useNode = new Node(Token.NAME, "a");
    ReachingUses uses = new ReachingUses();
    uses.mayUseMap.put(var, useNode);

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "removeFromUseIfLocal", String.class, ReachingUses.class);
    method.setAccessible(true);
    method.invoke(analysis, "a", uses);

    assertFalse(uses.mayUseMap.containsKey(var));
  }

  @Test
  public void testRemoveFromUseIfLocal_escapedVarNotRemoved() throws Exception {
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);
    escaped.add(var);
    Node useNode = new Node(Token.NAME, "a");
    ReachingUses uses = new ReachingUses();
    uses.mayUseMap.put(var, useNode);

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "removeFromUseIfLocal", String.class, ReachingUses.class);
    method.setAccessible(true);
    method.invoke(analysis, "a", uses);

    assertTrue(uses.mayUseMap.containsKey(var));
  }

  @Test
  public void testFlowThrough_conditionalWithExceptionHandler() {
    Node n = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "a");
    Node value = new Node(Token.NUMBER, 1.0);
    n.addChildToFront(name);
    n.addChildToFront(value);
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    ReachingUses input = new ReachingUses();
    // Override hasExceptionHandler to return true via subclass
    analysis = new MaybeReachingVariableUse(cfg, scope, new TestCompiler()) {
      @Override
      boolean hasExceptionHandler(Node cfgNode) { return true; }
    };

    ReachingUses output = analysis.flowThrough(n, input);
    assertNotNull(output);
    // conditional true because exception handler -> not removed from use
    assertTrue(output.mayUseMap.containsKey(var));
  }

  @Test
  public void testFlowThrough_conditionalTrueSkipsRemoval() {
    Node n = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "a");
    Node value = new Node(Token.NUMBER, 1.0);
    n.addChildToFront(name);
    n.addChildToFront(value);
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    ReachingUses input = new ReachingUses();
    input.mayUseMap.put(var, new Node(Token.NAME));

    // hasExceptionHandler returns false -> conditional=false -> remove "a"
    ReachingUses output = analysis.flowThrough(n, input);
    assertFalse(output.mayUseMap.containsKey(var));
  }

  @Test
  public void testFlowThrough_assignmentWithNoRHSRemoves() {
    Node n = new Node(Token.NAME, "a");
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    ReachingUses input = new ReachingUses();
    input.mayUseMap.put(var, new Node(Token.NAME));

    ReachingUses output = analysis.flowThrough(n, input);
    assertFalse(output.mayUseMap.containsKey(var));
  }

  @Test(expected = NullPointerException.class)
  public void testGetUses_nullNodeThrows() {
    analysis.getUses("a", null);
  }

  @Test
  public void testReachingUsesJoinOp_unionOfMaps() {
    List<ReachingUses> from = new ArrayList<>();
    ReachingUses u1 = new ReachingUses();
    Var var1 = new TestVar("a", scope);
    u1.mayUseMap.put(var1, new Node(Token.NAME));
    ReachingUses u2 = new ReachingUses();
    Var var2 = new TestVar("b", scope);
    u2.mayUseMap.put(var2, new Node(Token.NAME));
    from.add(u1);
    from.add(u2);

    MaybeReachingVariableUse.ReachingUsesJoinOp joinOp = 
        new MaybeReachingVariableUse.ReachingUsesJoinOp();
    MaybeReachingVariableUse.ReachingUses result = joinOp.apply(from);
    assertEquals(2, result.mayUseMap.size());
    assertTrue(result.mayUseMap.containsKey(var1));
    assertTrue(result.mayUseMap.containsKey(var2));
  }

  @Test
  public void testReachingUsesJoinOp_duplicateVarFromDifferentSources() {
    List<ReachingUses> from = new ArrayList<>();
    Var var = new TestVar("a", scope);
    ReachingUses u1 = new ReachingUses();
    u1.mayUseMap.put(var, new Node(Token.NAME));
    ReachingUses u2 = new ReachingUses();
    u2.mayUseMap.put(var, new Node(Token.NAME));
    from.add(u1);
    from.add(u2);

    MaybeReachingVariableUse.ReachingUsesJoinOp joinOp = 
        new MaybeReachingVariableUse.ReachingUsesJoinOp();
    MaybeReachingVariableUse.ReachingUses result = joinOp.apply(from);
    assertEquals(1, result.mayUseMap.size());
    assertEquals(2, result.mayUseMap.get(var).size());
  }

  @Test
  public void testReachingUses_equals_sameContent() {
    Var var = new TestVar("a", scope);
    Node n = new Node(Token.NAME);
    ReachingUses u1 = new ReachingUses();
    u1.mayUseMap.put(var, n);
    ReachingUses u2 = new ReachingUses();
    u2.mayUseMap.put(var, n);
    assertTrue(u1.equals(u2));
    assertEquals(u1.hashCode(), u2.hashCode());
  }

  @Test
  public void testReachingUses_equals_differentContent() {
    Var varA = new TestVar("a", scope);
    Var varB = new TestVar("b", scope);
    ReachingUses u1 = new ReachingUses();
    u1.mayUseMap.put(varA, new Node(Token.NAME));
    ReachingUses u2 = new ReachingUses();
    u2.mayUseMap.put(varB, new Node(Token.NAME));
    assertFalse(u1.equals(u2));
  }

  @Test
  public void testGetUses_returnsUpwardExposedUses() {
    Node defNode = new Node(Token.NAME, "x");
    Var var = new TestVar("x", scope);
    scope.addVar("x", var);
    Node use1 = new Node(Token.NAME);
    Node use2 = new Node(Token.NAME);

    DiGraphNode<Node, Branch> cfgNode = new TestDiGraphNode<>(defNode);
    cfg.addNode(cfgNode);
    ReachingUses out = new ReachingUses();
    out.mayUseMap.put(var, use1);
    out.mayUseMap.put(var, use2);
    // setup state
    analysis.getCfg().getNode(defNode).setAnnotation(
        new FlowState<>(new ReachingUses(), out));

    Collection<Node> uses = analysis.getUses("x", defNode);
    assertEquals(2, uses.size());
  }

  @Test
  public void testGetUses_escapedVarReturnsNull() {
    Node defNode = new Node(Token.NAME, "x");
    Var var = new TestVar("x", scope);
    scope.addVar("x", var);
    escaped.add(var);
    DiGraphNode<Node, Branch> cfgNode = new TestDiGraphNode<>(defNode);
    cfg.addNode(cfgNode);
    analysis.getCfg().getNode(defNode).setAnnotation(
        new FlowState<>(new ReachingUses(), new ReachingUses()));

    Collection<Node> uses = analysis.getUses("x", defNode);
    assertNull(uses); // since var is escaped, addToUseIfLocal doesn't add
  }

  @Test
  public void testComputeMayUse_forInRemoves() throws Exception {
    // for (x in obj) { ... }
    Node forNode = new Node(Token.FOR);
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NAME, "obj");
    forNode.addChildToFront(lhs);
    forNode.addChildToFront(rhs);
    // make it a for-in
    forNode.putBooleanProp(Node.FORIN_PROP, true);

    Var var = new TestVar("x", scope);
    scope.addVar("x", var);
    ReachingUses output = new ReachingUses();
    output.mayUseMap.put(var, new Node(Token.NAME)); // existing use

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, forNode, forNode, output, false);

    assertFalse(output.mayUseMap.containsKey(var));
  }

  @Test
  public void testComputeMayUse_forInConditionalDoesNotRemove() throws Exception {
    Node forNode = new Node(Token.FOR);
    Node lhs = new Node(Token.NAME, "x");
    Node rhs = new Node(Token.NAME, "obj");
    forNode.addChildToFront(lhs);
    forNode.addChildToFront(rhs);
    forNode.putBooleanProp(Node.FORIN_PROP, true);

    Var var = new TestVar("x", scope);
    scope.addVar("x", var);
    ReachingUses output = new ReachingUses();
    output.mayUseMap.put(var, new Node(Token.NAME));

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, forNode, forNode, output, true); // conditional true

    assertTrue(output.mayUseMap.containsKey(var)); // not removed
  }

  @Test
  public void testComputeMayUse_andOr() throws Exception {
    Node andNode = new Node(Token.AND);
    Node lhs = new Node(Token.NAME, "a");
    Node rhs = new Node(Token.NAME, "b");
    andNode.addChildToFront(lhs);
    andNode.addChildToFront(rhs);
    Var varA = new TestVar("a", scope);
    Var varB = new TestVar("b", scope);
    scope.addVar("a", varA);
    scope.addVar("b", varB);

    ReachingUses output = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, andNode, andNode, output, false);

    assertTrue(output.mayUseMap.containsKey(varA));
    assertTrue(output.mayUseMap.containsKey(varB));
    assertEquals(1, output.mayUseMap.get(varA).size()); // a is used
    assertEquals(1, output.mayUseMap.get(varB).size()); // b is used
  }

  @Test
  public void testComputeMayUse_hook() throws Exception {
    Node hookNode = new Node(Token.HOOK);
    Node cond = new Node(Token.NAME, "c");
    Node thenNode = new Node(Token.NAME, "t");
    Node elseNode = new Node(Token.NAME, "e");
    hookNode.addChildToFront(cond);
    hookNode.addChildToFront(thenNode);
    hookNode.addChildToFront(elseNode);

    Var varC = new TestVar("c", scope);
    Var varT = new TestVar("t", scope);
    Var varE = new TestVar("e", scope);
    scope.addVar("c", varC);
    scope.addVar("t", varT);
    scope.addVar("e", varE);

    ReachingUses output = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, hookNode, hookNode, output, false);

    assertTrue(output.mayUseMap.containsKey(varC));
    assertTrue(output.mayUseMap.containsKey(varT));
    assertTrue(output.mayUseMap.containsKey(varE));
  }

  @Test
  public void testComputeMayUse_varWithNoChildrenDoesNothing() throws Exception {
    Node varNode = new Node(Token.VAR);
    varNode.addChildToFront(new Node(Token.NAME)); // no string value, but has child
    // actually VAR with no children? The source checks n.hasChildren()
    Node varName = new Node(Token.NAME, "x");
    varNode.addChildToFront(varName);
    // then it has children, but varName may have no children

    ReachingUses output = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, varNode, varNode, output, false);
    // should not throw
  }

  @Test
  public void testComputeMayUse_assignWithNameChild() throws Exception {
    Node assign = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "a");
    Node rhs = new Node(Token.NUMBER, 5.0);
    assign.addChildToFront(name);
    assign.addChildToFront(rhs);
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);

    ReachingUses output = new ReachingUses();
    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, assign, assign, output, false);

    assertTrue(output.mayUseMap.containsKey(var));
    assertEquals(1, output.mayUseMap.get(var).size());
  }

  @Test
  public void testIsForward_returnsFalse() throws Exception {
    assertFalse(analysis.isForward());
  }

  @Test
  public void testCreateEntryLattice_returnsEmptyReachingUses() {
    assertNotNull(analysis.createEntryLattice());
    assertTrue(analysis.createEntryLattice().mayUseMap.isEmpty());
  }

  @Test
  public void testCreateInitialEstimateLattice_returnsEmpty() {
    assertNotNull(analysis.createInitialEstimateLattice());
    assertTrue(analysis.createInitialEstimateLattice().mayUseMap.isEmpty());
  }

  @Test
  public void testComputeMayUse_nameWithinConditionalStillAdds() throws Exception {
    Node nameNode = new Node(Token.NAME, "a");
    Var var = new TestVar("a", scope);
    scope.addVar("a", var);
    ReachingUses output = new ReachingUses();

    java.lang.reflect.Method method = MaybeReachingVariableUse.class.getDeclaredMethod(
        "computeMayUse", Node.class, Node.class, ReachingUses.class, boolean.class);
    method.setAccessible(true);
    method.invoke(analysis, nameNode, nameNode, output, true);

    assertTrue(output.mayUseMap.containsKey(var));
  }

  private static class TestDiGraphNode<N> implements DiGraphNode<N, Branch> {
    private final N value;
    TestDiGraphNode(N value) { this.value = value; }
    @Override public N getValue() { return value; }
    @Override public void setValue(N value) {}
    @Override public List<DiGraphEdge<N, Branch>> getOutEdges() { return new ArrayList<>(); }
    @Override public List<DiGraphEdge<N, Branch>> getInEdges() { return new ArrayList<>(); }
    @Override public DiGraphEdge<N, Branch> getOutEdge(Branch edge) { return null; }
    @Override public DiGraphEdge<N, Branch> getInEdge(Branch edge) { return null; }
    @Override public int getOutDegree() { return 0; }
    @Override public int getInDegree() { return 0; }
    @Override public void setAnnotation(com.google.javascript.jscomp.graph.Annotation annotation) {}
    @Override public com.google.javascript.jscomp.graph.Annotation getAnnotation() { return null; }
  }
}