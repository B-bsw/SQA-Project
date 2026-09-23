package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PureFunctionIdentifierTest {

  private AbstractCompiler compiler;
  private DefinitionProvider definitionProvider;
  private PureFunctionIdentifier identifier;
  private Node externsRoot;
  private Node srcRoot;

  @Before
  public void setUp() {
    compiler = new TestAbstractCompiler();
    definitionProvider = new TestDefinitionProvider();
    identifier = new PureFunctionIdentifier(compiler, definitionProvider);
    externsRoot = new Node(Token.EMPTY);
    srcRoot = new Node(Token.EMPTY);
  }

  @Test
  public void testProcessTwiceThrowsIllegalState() {
    identifier.process(externsRoot, srcRoot);
    try {
      identifier.process(externsRoot, srcRoot);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testProcessWithExternsAndSource() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Add simple function to externs
    Node externFunction = createFunctionNode("extFunc");
    externs.addChildToFront(externFunction);
    
    // Add simple function to src
    Node srcFunction = createFunctionNode("srcFunc");
    src.addChildToFront(srcFunction);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
    assertTrue(debugReport.contains("Pure functions:"));
  }

  @Test
  public void testNoSideEffectAnnotationInExterns() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create function with @nosideeffects annotation in externs
    Node externFunction = createFunctionNode("pureExternFunc");
    JSDocInfo.Builder builder = JSDocInfo.Builder.maybeCopyFrom(null);
    // Simulate no side effects annotation
    externFunction.setJSDocInfo(builder.build());
    
    externs.addChildToFront(externFunction);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
  }

  @Test
  public void testSideEffectPropagation() {
    // Create AST with a function that calls another function
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Function 1: has side effects (mutates global)
    Node func1 = createFunctionNode("funcWithSideEffects");
    src.addChildToFront(func1);
    
    // Function 2: calls function 1
    Node func2 = createFunctionNode("callerFunc");
    // Add call to func1 inside func2 body
    Node callNode = new Node(Token.CALL);
    Node calleeName = new Node(Token.NAME, "funcWithSideEffects");
    callNode.addChildToFront(calleeName);
    func2.getLastChild().addChildToFront(callNode);
    src.addChildToFirst(func2);
    
    identifier.process(externs, src);
    
    // Debug report should list functions
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
  }

  @Test
  public void testThrowSideEffect() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create function with throw statement
    Node func = createFunctionNode("functionWithThrow");
    Node block = new Node(Token.BLOCK);
    Node throwNode = new Node(Token.THROW);
    Node throwValue = new Node(Token.NAME, "someVar");
    throwNode.addChildToFront(throwValue);
    block.addChildToFront(throwNode);
    func.addChildToBack(block);
    src.addChildToFront(func);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
  }

  @Test
  public void testNullDefinitionProvider() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create function with call to unknown function
    Node func = createFunctionNode("callerFunc");
    Node block = new Node(Token.BLOCK);
    Node callNode = new Node(Token.CALL);
    Node callee = new Node(Token.NAME, "undefinedFunc");
    callNode.addChildToFront(callee);
    block.addChildToFront(callNode);
    func.addChildToBack(block);
    src.addChildToFront(func);
    
    identifier.process(externs, src);
    
    // Should not throw
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
  }

  @Test
  public void testComplexSideEffects() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create function with complex side effects
    Node func = createFunctionNode("complexFunc");
    Node block = new Node(Token.BLOCK);
    
    // Assignment to global variable
    Node assignNode = new Node(Token.ASSIGN);
    Node getPropNode = new Node(Token.GETPROP);
    Node rootName = new Node(Token.NAME, "someObject");
    Node propName = new Node(Token.STRING, "property");
    getPropNode.addChildrenToFront(rootName);
    getPropNode.addChildToBack(propName);
    assignNode.addChildrenToFront(getPropNode);
    Node valueNode = new Node(Token.STRING, "value");
    assignNode.addChildToBack(valueNode);
    block.addChildToFront(assignNode);
    
    func.addChildToBack(block);
    src.addChildToFront(func);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
  }

  @Test
  public void testGetDebugReportBeforeProcess() {
    try {
      identifier.getDebugReport();
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testNoFunctionCalls() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create a simple function with no calls
    Node func = createFunctionNode("standaloneFunc");
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN);
    Node returnValue = new Node(Token.NUMBER, 42);
    returnNode.addChildToFront(returnValue);
    block.addChildToFront(returnNode);
    func.addChildToBack(block);
    src.addChildToFront(func);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
    assertTrue(debugReport.contains("Pure functions:"));
  }

  @Test
  public void testFunctionThrowsAndMutatesThis() {
    Node externs = new Node(Token.SCRIPT);
    Node src = new Node(Token.SCRIPT);
    
    // Create function that mutates this and throws
    Node func = createFunctionNode("throwAndMutateFunc");
    Node block = new Node(Token.BLOCK);
    
    // Mutate this
    Node thisAssign = new Node(Token.ASSIGN);
    Node getPropThis = new Node(Token.GETPROP);
    Node thisNode = new Node(Token.THIS);
    Node thisProp = new Node(Token.STRING, "internalState");
    getPropThis.addChildToFront(thisNode);
    getPropThis.addChildToBack(thisProp);
    thisAssign.addChildToFront(getPropThis);
    Node assignValue = new Node(Token.NUMBER, 1.0);
    thisAssign.addChildToBack(assignValue);
    block.addChildToFront(thisAssign);
    
    // Throw exception
    Node throwNode = new Node(Token.THROW);
    Node throwValue = new Node(Token.NAME, "error");
    throwNode.addChildToFront(throwValue);
    block.addChildToFront(throwNode);
    
    func.addChildToBack(block);
    src.addChildToFront(func);
    
    identifier.process(externs, src);
    
    String debugReport = identifier.getDebugReport();
    assertNotNull(debugReport);
    assertFalse(debugReport.contains("Pure functions:\n  functionName"));
  }

  private Node createFunctionNode(String name) {
    Node func = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, name);
    Node params = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    func.addChildToFront(nameNode);
    func.addChildToBack(params);
    func.addChildToBack(body);
    return func;
  }

  private Node createNameNode(String name) {
    return new Node(Token.NAME, name);
  }

  private static class TestAbstractCompiler extends AbstractCompiler {
    @Override
    public void process(CompilerPass pass) {
    }

    @Override
    public void report(JSError error) {
    }

    @Override
    public void saveErrors() {
    }

    @Override
    public void restoreErrors() {
    }

    @Override
    public String getSourceFile() {
      return "test.js";
    }
  }

  private static class TestDefinitionProvider implements DefinitionProvider {
    @Override
    public Collection<Definition> getDefinitionsReferencedAt(Node node) {
      return null;
    }

    @Override
    public Collection<Definition> getDefinitionsForNode(Node node) {
      return null;
    }
  }
}