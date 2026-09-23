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
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LiveVariablesAnalysisTest {

  private static class TestCompiler extends AbstractCompiler {
    @Override
    public void clearAnalysis() {}
    @Override
    public void compileBeforeRun(Node root, Node externsRoot, Node modulesRoot) {}
    @Override
    public void compileBeforeRun(Node root, Node externsRoot, Node modulesRoot, boolean verbose) {}
    @Override
    public Node getRoot() { return null; }
    @Override
    public Node getExternsRoot() { return null; }
    @Override
    public Node getModuleRoot() { return null; }
    @Override
    public Node getModuleInput(String module) { return null; }
    @Override
    public CompilerInput getInput(String name) { return null; }
    @Override
    public CompilerInput getInputById(String id) { return null; }
    @Override
    public CompilerInput getInputForInputId(InputId inputId) { return null; }
    @Override
    public CompilerInput[] getInputs() { return new CompilerInput[0]; }
    @Override
    public CompilerInput[] getModuleInputs(String module) { return null; }
    @Override
    public List<CompilerInput> getInputsInOrder() { return new ArrayList<>(); }
    @Override
    public CompilerInput getInputFromMappedFile(String file) { return null; }
    @Override
    public void setInputs(CompilerInput[] inputs) {}
    @Override
    public void setModuleInputs(String module, CompilerInput[] inputs) {}
    @Override
    public void setInputsInOrder(List<CompilerInput> inputs) {}
    @Override
    public void setTrackInputs(boolean track) {}
    @Override
    public void addExternInput(CompilerInput input) {}
    @Override
    public Node getRootNode() { return null; }
    @Override
    public Node getExternsRootNode() { return null; }
    @Override
    public Node getModulesRootNode() { return null; }
    @Override
    public List<Module> getModules() { return new ArrayList<>(); }
    @Override
    public String getName() { return null; }
    @Override
    public boolean isLive() { return false; }
    @Override
    public SourceFile getSourceFileByName(String name) { return null; }
    @Override
    public SourceFile getSourceFile(String name) { return null; }
    @Override
    public void addSourceFile(SourceFile file) {}
    @Override
    public void removeSourceFile(SourceFile file) {}
    @Override
    public void reportCodeChange() {}
    @Override
    public void reportChange() {}
    @Override
    public void report(CheckLevel level, JSError error) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object... params) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, String param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object... params) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9) {}
    @Override
    public void report(CheckLevel level, Node n, String code, String detail, Object param1, Object param2, Object param3, Object param4, Object param5, Object param6, Object param7, Object param8, Object param9, Object param10) {}
  }

  private LiveVariablesAnalysis analysis;
  private TestCompiler compiler;
  private Scope scope;
  private Node rootNode;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    rootNode = new Node(Token.SCRIPT);
    scope = new Scope(rootNode, null);
  }

  @Test
  public void testCreateEntryLattice() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    LiveVariableLattice lattice = analysis.createEntryLattice();
    assertNotNull(lattice);
    assertEquals(new BitSet(), lattice.liveSet);
  }

  @Test
  public void testCreateInitialEstimateLattice() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    LiveVariableLattice lattice = analysis.createInitialEstimateLattice();
    assertNotNull(lattice);
    assertEquals(new BitSet(), lattice.liveSet);
  }

  @Test
  public void testFlowThroughAndOperator() {
    scope.declare("x", new Node(Token.NAME), null);
    scope.declare("y", new Node(Token.NAME), null);
    Node andNode = new Node(Token.AND);
    Node nameX = new Node(Token.NAME, new Node(Token.STRING, "x"));
    Node nameY = new Node(Token.NAME, new Node(Token.STRING, "y"));
    andNode.addChildToFront(nameX);
    andNode.addChildToFront(nameY);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(andNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    // Input: x live, y dead
    input.liveSet.set(scope.getVar("x").index);
    LiveVariableLattice result = analysis.flowThrough(andNode, input);
    // Should keep x live (gen x), kill y (since y is not gen)
    assertTrue(result.liveSet.get(scope.getVar("x").index));
    assertFalse(result.liveSet.get(scope.getVar("y").index));
  }

  @Test
  public void testFlowThroughName() {
    scope.declare("a", new Node(Token.NAME), null);
    Node nameNode = new Node(Token.NAME, new Node(Token.STRING, "a"));
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(nameNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    LiveVariableLattice result = analysis.flowThrough(nameNode, input);
    // Name node generates a, no kill
    assertTrue(result.liveSet.get(scope.getVar("a").index));
  }

  @Test
  public void testFlowThroughAssignment() {
    scope.declare("x", new Node(Token.NAME), null);
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, new Node(Token.STRING, "x"));
    Node rhs = new Node(Token.NUMBER, new Node(Token.NUMBER, 5));
    assignNode.addChildToFront(lhs);
    assignNode.addChildToFront(rhs);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(assignNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    input.liveSet.set(scope.getVar("x").index); // x live before
    LiveVariableLattice result = analysis.flowThrough(assignNode, input);
    // Assignment kills x, so x should be dead after
    assertFalse(result.liveSet.get(scope.getVar("x").index));
  }

  @Test
  public void testFlowThroughConditionalAssignment() {
    scope.declare("x", new Node(Token.NAME), null);
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME, new Node(Token.STRING, "x"));
    Node rhs = new Node(Token.NUMBER, new Node(Token.NUMBER, 5));
    assignNode.addChildToFront(lhs);
    assignNode.addChildToFront(rhs);
    // Make it conditional via ON_EX edge
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(assignNode, true);
    cfg.createNode(assignNode);
    cfg.createEdge(assignNode, assignNode, Branch.ON_EX);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    input.liveSet.set(scope.getVar("x").index);
    LiveVariableLattice result = analysis.flowThrough(assignNode, input);
    // Conditional assignment should not kill x
    assertTrue(result.liveSet.get(scope.getVar("x").index));
  }

  @Test
  public void testIsArgumentsName() throws Exception {
    scope.declare(ARGUMENT_ARRAY_ALIAS, new Node(Token.NAME), null);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    Node name = new Node(Token.NAME, new Node(Token.STRING, ARGUMENT_ARRAY_ALIAS));
    assertTrue(analysis.isArgumentsName(name));
  }

  @Test
  public void testIsArgumentsNameNotArguments() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    Node name = new Node(Token.NAME, new Node(Token.STRING, "notArg"));
    assertFalse(analysis.isArgumentsName(name));
  }

  @Test
  public void testIsArgumentsNameNot() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    Node name = new Node(Token.NUMBER, new Node(Token.NUMBER, 5));
    name.putStringProp(Node.SOURCE_PROP, "test");
    // Not a name node
    assertFalse(analysis.isArgumentsName(name));
  }

  @Test
  public void testMarkAllParametersEscaped() {
    Node paramList = new Node(Token.PARAM_LIST);
    Node param1 = new Node(Token.NAME, new Node(Token.STRING, "p1"));
    Node param2 = new Node(Token.NAME, new Node(Token.STRING, "p2"));
    paramList.addChildToFront(param1);
    paramList.addChildToFront(param2);
    scope.declare("p1", param1, null);
    scope.declare("p2", param2, null);
    scope.getRootNode().addChildToFront(new Node(Token.NAME));
    scope.getRootNode().addChildToFront(paramList);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    analysis.markAllParametersEscaped();
    Set<Var> escaped = analysis.getEscapedLocals();
    assertEquals(2, escaped.size());
    assertTrue(escaped.contains(scope.getVar("p1")));
    assertTrue(escaped.contains(scope.getVar("p2")));
  }

  @Test
  public void testGetVarIndex() {
    scope.declare("myVar", new Node(Token.NAME), null);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    int index = analysis.getVarIndex("myVar");
    assertEquals(scope.getVar("myVar").index, index);
  }

  @Test
  public void testGetVarIndexNotFound() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    try {
      analysis.getVarIndex("nonexistent");
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testLiveVariableLatticeEquals() {
    LiveVariableLattice a = new LiveVariableLattice(5);
    a.liveSet.set(1);
    LiveVariableLattice b = new LiveVariableLattice(5);
    b.liveSet.set(1);
    assertEquals(a, b);
    b.liveSet.set(2);
    assertFalse(a.equals(b));
  }

  @Test
  public void testLiveVariableLatticeHashCode() {
    LiveVariableLattice a = new LiveVariableLattice(3);
    a.liveSet.set(0);
    LiveVariableLattice b = new LiveVariableLattice(3);
    b.liveSet.set(0);
    assertEquals(a.hashCode(), b.hashCode());
  }

  @Test
  public void testLiveVariableLatticeToString() {
    LiveVariableLattice a = new LiveVariableLattice(3);
    a.liveSet.set(1);
    assertEquals("{1}", a.toString());
  }

  @Test
  public void testLiveVariableLatticeIsLiveByVar() {
    scope.declare("x", new Node(Token.NAME), null);
    LiveVariableLattice lattice = new LiveVariableLattice(scope.getVarCount());
    lattice.liveSet.set(scope.getVar("x").index);
    assertTrue(lattice.isLive(scope.getVar("x")));
    assertFalse(lattice.isLive(scope.getVar("y")));
  }

  @Test
  public void testLiveVariableLatticeIsLiveByIndex() {
    LiveVariableLattice lattice = new LiveVariableLattice(4);
    lattice.liveSet.set(2);
    assertTrue(lattice.isLive(2));
    assertFalse(lattice.isLive(3));
  }

  @Test
  public void testAddToSetIfLocalForNonLocal() {
    scope.declare("x", new Node(Token.NAME), null);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    BitSet set = new BitSet(10);
    Node nameNode = new Node(Token.NAME, new Node(Token.STRING, "global"));
    analysis.addToSetIfLocal(nameNode, set);
    assertFalse(set.get(scope.getVar("x").index));
  }

  @Test
  public void testAddToSetIfLocalForLocalButEscaped() {
    scope.declare("x", new Node(Token.NAME), null);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    analysis.escaped.add(scope.getVar("x"));
    BitSet set = new BitSet(10);
    Node nameNode = new Node(Token.NAME, new Node(Token.STRING, "x"));
    analysis.addToSetIfLocal(nameNode, set);
    assertFalse(set.get(scope.getVar("x").index));
  }

  @Test
  public void testAddToSetIfLocalForLocalNotEscaped() {
    scope.declare("x", new Node(Token.NAME), null);
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    BitSet set = new BitSet(10);
    Node nameNode = new Node(Token.NAME, new Node(Token.STRING, "x"));
    analysis.addToSetIfLocal(nameNode, set);
    assertTrue(set.get(scope.getVar("x").index));
  }

  @Test
  public void testFlowThroughWhileWithName() {
    scope.declare("i", new Node(Token.NAME), null);
    Node whileNode = new Node(Token.WHILE);
    Node cond = new Node(Token.NAME, new Node(Token.STRING, "i"));
    whileNode.addChildToFront(cond);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(whileNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    LiveVariableLattice result = analysis.flowThrough(whileNode, input);
    assertTrue(result.liveSet.get(scope.getVar("i").index));
  }

  @Test
  public void testFlowThroughForIn() {
    scope.declare("x", new Node(Token.NAME), null);
    Node forNode = new Node(Token.FOR);
    Node lhs = new Node(Token.NAME, new Node(Token.STRING, "x"));
    Node rhs = new Node(Token.NAME, new Node(Token.STRING, "obj"));
    forNode.addChildToFront(lhs);
    forNode.addChildToFront(rhs);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(forNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    LiveVariableLattice result = analysis.flowThrough(forNode, input);
    assertTrue(result.liveSet.get(scope.getVar("x").index));
  }

  @Test
  public void testFlowThroughHook() {
    scope.declare("a", new Node(Token.NAME), null);
    scope.declare("b", new Node(Token.NAME), null);
    scope.declare("c", new Node(Token.NAME), null);
    Node hook = new Node(Token.HOOK);
    Node cond = new Node(Token.NAME, new Node(Token.STRING, "a"));
    Node trueBranch = new Node(Token.NAME, new Node(Token.STRING, "b"));
    Node falseBranch = new Node(Token.NAME, new Node(Token.STRING, "c"));
    hook.addChildToFront(cond);
    hook.getFirstChild().addChildToFront(trueBranch);
    hook.getFirstChild().addChildToFront(falseBranch);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(hook, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    LiveVariableLattice result = analysis.flowThrough(hook, input);
    assertTrue(result.liveSet.get(scope.getVar("a").index));
    assertFalse(result.liveSet.get(scope.getVar("b").index));
    assertFalse(result.liveSet.get(scope.getVar("c").index));
  }

  @Test
  public void testFlowThroughVarDeclarationWithInit() {
    scope.declare("v", new Node(Token.NAME), null);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, new Node(Token.STRING, "v"));
    Node valueNode = new Node(Token.NUMBER, new Node(Token.NUMBER, 10));
    nameNode.addChildToFront(valueNode);
    varNode.addChildToFront(nameNode);
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(varNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    LiveVariableLattice result = analysis.flowThrough(varNode, input);
    assertTrue(result.liveSet.get(scope.getVar("v").index));
  }

  @Test
  public void testFlowThroughArgumentsAlias() {
    scope.declare("arguments", new Node(Token.NAME), null);
    scope.declare("x", new Node(Token.NAME), null);
    Node argumentsNode = new Node(Token.NAME, new Node(Token.STRING, "arguments"));
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(argumentsNode, true);
    analysis = new LiveVariablesAnalysis(cfg, scope, compiler);
    LiveVariableLattice input = new LiveVariableLattice(scope.getVarCount());
    analysis.flowThrough(argumentsNode, input);
    // Should mark all parameters escaped
    Set<Var> escaped = analysis.getEscapedLocals();
    assertEquals(1, escaped.size()); // only x? actually arguments is not parameter, but markAllParametersEscaped not called
    // No parameters defined, so escaped set should be empty
    assertEquals(0, escaped.size());
  }

  @Test
  public void testLiveVariableJoinOp() {
    LiveVariableLattice a = new LiveVariableLattice(3);
    a.liveSet.set(0);
    LiveVariableLattice b = new LiveVariableLattice(3);
    b.liveSet.set(1);
    LiveVariableLattice c = new LiveVariableLattice(3);
    c.liveSet.set(2);
    List<LiveVariableLattice> list = new ArrayList<>();
    list.add(a);
    list.add(b);
    list.add(c);
    LiveVariableJoinOp op = new LiveVariableJoinOp();
    LiveVariableLattice result = op.apply(list);
    assertTrue(result.liveSet.get(0));
    assertTrue(result.liveSet.get(1));
    assertTrue(result.liveSet.get(2));
  }

  @Test
  public void testIsArgumentsNameWithNull() {
    analysis = new LiveVariablesAnalysis(null, scope, compiler);
    assertFalse(analysis.isArgumentsName(null));
  }
}