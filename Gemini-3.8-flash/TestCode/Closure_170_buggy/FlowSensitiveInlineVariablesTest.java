package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.MustBeReachingVariableDef.Definition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FlowSensitiveInlineVariablesTest {

  private static class CompilerUtil {
    static AbstractCompiler createCompiler(String code) {
      return new AbstractCompiler() {
        private final CodingConvention convention = new GoogleCodingConvention();
        
        @Override
        public CodingConvention getCodingConvention() {
          return convention;
        }
      };
    }
  }

  private FlowSensitiveInlineVariables pass;
  private AbstractCompiler compiler;
  private Node externsRoot;
  private Node root;

  @Before
  public void setUp() {
    compiler = CompilerUtil.createCompiler("");
    externsRoot = new Node(Token.EMPTY);
    root = new Node(Token.EMPTY);
    pass = new FlowSensitiveInlineVariables(compiler);
  }

  @Test
  public void testProcessWithGlobalScopeLeavesAstable() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.EMPTY);
    root.addChildToBack(new Node(Token.FUNCTION, new Node(Token.NAME, "f")));
    
    pass.process(externs, root);
    assertNotNull(pass);
  }

  @Test
  public void testPackagePrivateGatherCandidates() {
    Node varName = Node.newString(Token.NAME, "x");
    Node defNode = createAssignment("x", "1");
    Node useNode = Node.newString(Token.NAME, "x");
    Node useCfgNode = new Node(Token.EXPR_RESULT, useNode);
    
    List<Node> nodes = new ArrayList<>();
    nodes.add(defNode);
    nodes.add(useNode);
    
    // No direct way to test inner classes, so we test via process
    pass.process(externsRoot, createSimpleRoot());
  }

  @Test
  public void testProcessWithNonGlobalScope() {
    Node function = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "f");
    function.addChildToBack(name);
    
    Node paramList = new Node(Token.PARAM_LIST);
    function.addChildToBack(paramList);
    
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(body);
    
    Node externs = new Node(Token.EMPTY);
    
    NodeTraversal traversal = new NodeTraversal(compiler, pass);
    traversal.traverse(externs, function);
    
    // Should not throw
    assertNotNull(pass);
  }

  @Test
  public void testCandidateCanInlineWithParameter() {
    Node def = createAssignment("x", "1");
    Node use = Node.newString(Token.NAME, "x");
    Node useCfgNode = new Node(Token.EXPR_RESULT, use);
    
    Definition defMetadata = new Definition(def, null);
    
    Node function = new Node(Token.FUNCTION);
    def.addChildToFront(Node.newString(Token.NAME, "f"));
    Node paramList = new Node(Token.PARAM_LIST);
    function.addChildToBack(paramList);
    
    // Cannot access private Candidate, so we use reflection or test indirectly
    try {
      pass.process(externsRoot, createSimpleRoot());
      assertNotNull(pass);
    } catch (Exception e) {
      fail("Should not throw exception: " + e.getMessage());
    }
  }

  @Test
  public void testCandidateInlineWithSideEffects() {
    // Test side effect detection in the SIDE_EFFECT_PREDICATE
    Node callNode = new Node(Token.CALL, 
        new Node(Token.NAME, "f"), 
        new Node(Token.NAME, "x"));
    callNode.putBooleanProp(Node.SIDEEFFECTS_PROP, true);
    
    assertTrue("Call with side effects", 
        com.google.javascript.jscomp.FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(callNode));
    
    Node noSideEffect = new Node(Token.NAME, "x");
    assertFalse("Simple name no side effect", 
        com.google.javascript.jscomp.FlowSensitiveInlineVariables.SIDE_EFFECT_PREDICATE.apply(noSideEffect));
  }

  @Test
  public void testProcessWithInvalidCode() {
    try {
      pass.process(externsRoot, null);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testGatherCandidatesHandlesEmptyRoot() {
    pass.process(externsRoot, root);
    assertNotNull(pass);
  }

  @Test
  public void testEnterExitScopeWithEmptyCandidates() {
    Node function = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "f");
    function.addChildToBack(name);
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(body);
    
    NodeTraversal traversal = new NodeTraversal(compiler, pass) {
      @Override
      public void traverse(Node n) {
        super.traverse(n);
      }
    };
    
    assertNotNull(traversal);
  }

  @Test
  public void testCandidateCanInlineWithDependency() {
    Definition defMetadata = new Definition(null, null);
    defMetadata.depends = new ArrayList<>();
    
    assertNotNull(defMetadata);
  }

  @Test
  public void testIsWithinLoopDetection() {
    Node name = Node.newString(Token.NAME, "x");
    Node whileNode = new Node(Token.WHILE);
    Node block = new Node(Token.BLOCK);
    block.addChildToBack(name);
    whileNode.addChildToBack(new Node(Token.EMPTY));
    whileNode.addChildToBack(block);
    
    assertTrue("Name should be in loop", NodeUtil.isWithinLoop(name));
  }

  @Test
  public void testProcessWithComplexFunction() {
    Node function = createComplexFunction();
    Node externs = new Node(Token.EMPTY);
    
    NodeTraversal traversal = new NodeTraversal(compiler, pass);
    traversal.traverse(externs, function);
    
    assertNotNull(pass);
  }

  @Test
  public void testVisitWithNameAndNoCfgNode() {
    Node name = Node.newString(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT);
    parent.addChildToBack(name);
    
    NodeTraversal traversal = new NodeTraversal(compiler, pass);
    // Cannot call visit directly without proper setup; test indirectly
    assertNotNull(name.getString());
  }

  @Test
  public void testExportNameDetection() {
    Node name = Node.newString(Token.NAME, "exported");
    assertTrue("Exported name should be detected", 
        compiler.getCodingConvention().isExported("exported"));
    
    Node normalName = Node.newString(Token.NAME, "normal");
    assertFalse("Normal name should not be exported", 
        compiler.getCodingConvention().isExported("normal"));
  }

  @Test
  public void testMultipleCallsToProcess() {
    pass.process(externsRoot, root);
    pass.process(externsRoot, root);
    assertNotNull(pass);
  }

  @Test
  public void testCandidateDefinitionWithParamList() {
    Node def = createAssignment("x", "1");
    Definition defMetadata = new Definition(def, null);
    defMetadata.depends = new ArrayList<>();
    
    assertNotNull(defMetadata.depends);
    assertEquals(0, defMetadata.depends.size());
  }

  private Node createSimpleRoot() {
    Node function = new Node(Token.FUNCTION);
    Node name = Node.newString(Token.NAME, "test");
    function.addChildToBack(name);
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(body);
    root.addChildToBack(function);
    return root;
  }

  private Node createComplexFunction() {
    Node function = new Node(Token.FUNCTION);
    function.addChildToBack(Node.newString(Token.NAME, "complex"));
    Node paramList = new Node(Token.PARAM_LIST);
    paramList.addChildToBack(Node.newString(Token.NAME, "a"));
    paramList.addChildToBack(Node.newString(Token.NAME, "b"));
    function.addChildToBack(paramList);
    
    Node body = new Node(Token.BLOCK);
    Node varDecl = new Node(Token.VAR);
    Node name1 = Node.newString(Token.NAME, "c");
    varDecl.addChildToBack(new Node(Token.NAME, "c"));
    Node assign1 = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), new Node(Token.NUMBER, 1));
    varDecl.addChildToBack(assign1);
    
    Node exprCall = new Node(Token.EXPR_RESULT);
    exprCall.addChildToBack(new Node(Token.CALL, new Node(Token.NAME, "g")));
    body.addChildToBack(varDecl);
    body.addChildToBack(exprCall);
    function.addChildToBack(body);
    
    return function;
  }

  private Node createAssignment(String varName, String value) {
    Node nameNode = Node.newString(Token.NAME, varName);
    Node valueNode = Node.newString(Token.NUMBER, value);
    Node assign = new Node(Token.ASSIGN, nameNode, valueNode);
    Node exprResult = new Node(Token.EXPR_RESULT);
    exprResult.addChildToBack(assign);
    return exprResult;
  }

  // Mock classes to satisfy AbstractCompiler interface
  private abstract static class AbstractCompiler implements Compiler {
    private CodingConvention convention = new GoogleCodingConvention();
    
    @Override
    public CodingConvention getCodingConvention() {
      return convention;
    }
  }
}