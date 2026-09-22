package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import com.google.javascript.jscomp.testing.TestCompiler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class RuntimeTypeCheckTest {
  private AbstractCompiler compiler;
  private RuntimeTypeCheck runtimeTypeCheck;

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    runtimeTypeCheck = new RuntimeTypeCheck(compiler, null);
  }

  @After
  public void tearDown() {
    compiler = null;
    runtimeTypeCheck = null;
  }

  @Test
  public void testGetBoilerplateCodeWithNullLogFunction() {
    Node result = runtimeTypeCheck.getBoilerplateCode(compiler, null);
    assertNotNull(result);
    assertTrue(result.isScript());
  }

  @Test
  public void testGetBoilerplateCodeWithLogFunction() {
    Node result = runtimeTypeCheck.getBoilerplateCode(compiler, "function(log) {}");
    assertNotNull(result);
    assertTrue(result.isScript());
  }

  @Test
  public void testProcessWithEmptyRoot() {
    Node root = new Node(Token.EMPTY);
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testProcessWithFunctionNode() {
    Node root = new Node(Token.SCRIPT);
    Node function = new Node(Token.FUNCTION);
    Node functionName = Node.newString("testFn");
    function.addChildToFront(functionName);
    root.addChildToBack(function);
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testAddMarkersWithNullSource() {
    Node function = new Node(Token.FUNCTION);
    function.setJSType(null);
    runtimeTypeCheck.process(new Node(Token.SCRIPT), function);
    // Should not throw exception
  }

  @Test
  public void testGetBoilerplateCodeWithInvalidPath() {
    try {
      runtimeTypeCheck.getBoilerplateCode(compiler, "test");
      fail("Expected IOException to be thrown");
    } catch (RuntimeException e) {
      // Expected exception
    }
  }

  @Test
  public void testNullLogFunctionInBoilerplate() {
    String logFunction = null;
    Node result = runtimeTypeCheck.getBoilerplateCode(compiler, logFunction);
    assertNotNull(result);
  }

  @Test
  public void testEmptyLogFunctionString() {
    Node result = runtimeTypeCheck.getBoilerplateCode(compiler, "");
    assertNotNull(result);
  }

  @Test
  public void testProcessWithNullExterns() {
    Node root = new Node(Token.SCRIPT);
    try {
      runtimeTypeCheck.process(null, root);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testProcessWithNullRoot() {
    try {
      runtimeTypeCheck.process(new Node(Token.SCRIPT), null);
      fail("Expected NullPointerException");
    } catch (NullPointerException e) {
      // Expected
    }
  }

  @Test
  public void testProcessWithNormalScript() {
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, Node.newString("x"));
    nameNode.putProp(Node.ORIGINALNAME_PROP, "x");
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testProcessWithFunctionAndReturn() {
    Node root = new Node(Token.SCRIPT);
    Node function = new Node(Token.FUNCTION);
    Node functionName = Node.newString("testFunction");
    function.addChildToFront(functionName);
    
    Node params = new Node(Token.PARAM_LIST);
    function.addChildToBack(params);
    
    Node body = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN);
    returnNode.addChildToBack(Node.newString("value"));
    body.addChildToBack(returnNode);
    function.addChildToBack(body);
    
    root.addChildToBack(function);
    
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testProcessWithMultipleFunctions() {
    Node root = new Node(Token.SCRIPT);
    
    for (int i = 0; i < 3; i++) {
      Node function = new Node(Token.FUNCTION);
      Node functionName = Node.newString("fn" + i);
      function.addChildToFront(functionName);
      
      Node params = new Node(Token.PARAM_LIST);
      function.addChildToBack(params);
      
      Node body = new Node(Token.BLOCK);
      function.addChildToBack(body);
      
      root.addChildToBack(function);
    }
    
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testProcessWithOneFunction() {
    Node root = new Node(Token.SCRIPT);
    Node function = new Node(Token.FUNCTION);
    Node functionName = Node.newString("singleFn");
    function.addChildToFront(functionName);
    
    Node params = new Node(Token.PARAM_LIST);
    function.addChildToBack(params);
    
    Node body = new Node(Token.BLOCK);
    function.addChildToBack(body);
    
    root.addChildToBack(function);
    
    runtimeTypeCheck.process(new Node(Token.SCRIPT), root);
    // Should not throw exception
  }

  @Test
  public void testProcessWithOnlyExterns() {
    Node externs = new Node(Token.SCRIPT);
    Node root = new Node(Token.SCRIPT);
    
    runtimeTypeCheck.process(externs, root);
    // Should not throw exception
  }

  @Test
  public void testGetBoilerplateCodeWithValidInput() {
    Node result = runtimeTypeCheck.getBoilerplateCode(compiler, "function() {}");
    assertNotNull(result);
  }
}