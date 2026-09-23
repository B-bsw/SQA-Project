package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FunctionRewriterTest {

  private static class TestCompiler extends AbstractCompiler {
    private Node root;
    private Node syntheticRoot;
    private boolean codeChangeReported;

    @Override
    public void reportCodeChange() {
      codeChangeReported = true;
    }

    @Override
    public Node parseSyntheticCode(String sourceName, String code) {
      syntheticRoot = new Node(Token.SCRIPT);
      // Simple parser: just wrap the code in a block node
      syntheticRoot.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(code)));
      return syntheticRoot;
    }

    @Override
    public Node getNodeForCodeInsertion(Node node) {
      if (root == null) {
        root = new Node(Token.SCRIPT);
      }
      return root;
    }

    @Override
    public void reportError(JSError error) {
      // No-op for tests
    }

    @Override
    public void reportWarning(JSError warning) {
      // No-op for tests
    }

    @Override
    public void reportCodeChange(Scope scope) {
      codeChangeReported = true;
    }
  }

  private static class TestReducer extends FunctionRewriter.Reducer {
    private final String helperSource;
    private final String factoryMethodName;

    TestReducer(String helperSource, String factoryMethodName) {
      this.helperSource = helperSource;
      this.factoryMethodName = factoryMethodName;
    }

    @Override
    String getHelperSource() {
      return helperSource;
    }

    @Override
    Node reduce(Node node) {
      if (node.getType() == Token.FUNCTION) {
        String name = node.getFirstChild().getString();
        if (name.startsWith(FACTORY_METHOD_PREFIX)) {
          return buildCallNode(factoryMethodName, node, node.getLineno(), node.getCharno());
        }
      }
      return node;
    }

    private static final String FACTORY_METHOD_PREFIX = "reducible";
  }

  @Test
  public void testParseHelperCode_ValidCode() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer reducer = new TestReducer("function helper() { return 1; }", "helper");
    
    Node result = rewriter.parseHelperCode(reducer);
    assertNotNull(result);
    assertEquals(Token.EXPR_RESULT, result.getType());
  }

  @Test
  public void testProcess_WithNoReductions() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    Node root = new Node(Token.SCRIPT);
    
    rewriter.process(null, root);
    // Should not throw, no reductions found
  }

  @Test
  public void testProcess_WithReduction_PositiveSavings() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    Node root = new Node(Token.SCRIPT);
    Node functionNode = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    functionNode.addChildToBack(paramList);
    root.addChildToBack(functionNode);
    
    rewriter.process(null, root);
    assertTrue(compiler.codeChangeReported);
  }

  @Test
  public void testProcess_WithLargeReduction() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    Node root = new Node(Token.SCRIPT);
    // Create many nodes to maximize savings
    for (int i = 0; i < 100; i++) {
      Node fn = new Node(Token.FUNCTION);
      fn.addChildToBack(new Node(Token.PARAM_LIST));
      fn.addChildToBack(new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NUMBER, i))));
      root.addChildToBack(fn);
    }
    
    rewriter.process(null, root);
    assertTrue(compiler.codeChangeReported);
  }

  @Test
  public void testReturnConstantReducer_SimpleReturn() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter.ReturnConstantReducer reducer = 
        new FunctionRewriter.ReturnConstantReducer() {
          @Override
          public String getHelperSource() {
            return "function JSCompiler_returnArg(v) { return function() { return v; } }";
          }

          @Override
          public String getFactoryMethodName() {
            return "JSCompiler_returnArg";
          }
        };
    
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    Node returnValue = new Node(Token.NUMBER, 42);
    Node body = new Node(Token.BLOCK, new Node(Token.RETURN, returnValue));
    functionNode.addChildToBack(body);
    
    Node result = reducer.reduce(functionNode);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testReturnConstantReducer_NullValue() {
    TestCompiler compiler = new TestCompiler();
    FunctionRewriter.ReturnConstantReducer reducer = 
        new FunctionRewriter.ReturnConstantReducer() {
          @Override
          public String getHelperSource() {
            return "function JSCompiler_returnArg(v) { return function() { return v; } }";
          }

          @Override
          public String getFactoryMethodName() {
            return "JSCompiler_returnArg";
          }
        };
    
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    Node body = new Node(Token.BLOCK, new Node(Token.VAR));
    functionNode.addChildToBack(body);
    
    Node result = reducer.reduce(functionNode);
    assertSame(functionNode, result);
  }

  @Test
  public void testEmptyFunctionReducer_EmptyFunction() {
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    functionNode.addChildToBack(new Node(Token.BLOCK));
    
    FunctionRewriter.EmptyFunctionReducer reducer = new FunctionRewriter.EmptyFunctionReducer();
    Node result = reducer.reduce(functionNode);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testEmptyFunctionReducer_NonEmptyFunction() {
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    functionNode.addChildToBack(new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NUMBER, 1))));
    
    FunctionRewriter.EmptyFunctionReducer reducer = new FunctionRewriter.EmptyFunctionReducer();
    Node result = reducer.reduce(functionNode);
    assertSame(functionNode, result);
  }

  @Test
  public void testIdentityReducer_IdentityFunction() {
    Node functionNode = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    Node param = Node.newString(Token.NAME, "x");
    paramList.addChildToBack(param);
    functionNode.addChildToBack(paramList);
    Node body = new Node(Token.BLOCK, new Node(Token.RETURN, param.cloneTree()));
    functionNode.addChildToBack(body);
    
    FunctionRewriter.IdentityReducer reducer = new FunctionRewriter.IdentityReducer();
    Node result = reducer.reduce(functionNode);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testIdentityReducer_NonIdentityFunction() {
    Node functionNode = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    Node param = Node.newString(Token.NAME, "x");
    paramList.addChildToBack(param);
    functionNode.addChildToBack(paramList);
    Node body = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newString(Token.NUMBER, "5")));
    functionNode.addChildToBack(body);
    
    FunctionRewriter.IdentityReducer reducer = new FunctionRewriter.IdentityReducer();
    Node result = reducer.reduce(functionNode);
    assertSame(functionNode, result);
  }

  @Test
  public void testGetterReducer_SimpleGetter() {
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    Node thisNode = new Node(Token.THIS);
    Node propName = Node.newString(Token.STRING, "prop");
    Node getProp = new Node(Token.GETPROP, thisNode, propName);
    Node body = new Node(Token.BLOCK, new Node(Token.RETURN, getProp));
    functionNode.addChildToBack(body);
    
    FunctionRewriter.GetterReducer reducer = new FunctionRewriter.GetterReducer();
    Node result = reducer.reduce(functionNode);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testSetterReducer_SimpleSetter() throws Exception {
    Node functionNode = new Node(Token.FUNCTION);
    Node paramList = new Node(Token.PARAM_LIST);
    Node param = Node.newString(Token.NAME, "value");
    paramList.addChildToBack(param);
    functionNode.addChildToBack(paramList);
    
    Node thisNode = new Node(Token.THIS);
    Node propName = Node.newString(Token.STRING, "prop");
    Node getProp = new Node(Token.GETPROP, thisNode, propName);
    Node assign = new Node(Token.ASSIGN, getProp, param.cloneTree());
    Node exprResult = new Node(Token.EXPR_RESULT, assign);
    Node body = new Node(Token.BLOCK, exprResult);
    functionNode.addChildToBack(body);
    
    FunctionRewriter.SetterReducer reducer = new FunctionRewriter.SetterReducer();
    Node result = reducer.reduce(functionNode);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testSingleReturnStatementReducer_NoBody() {
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(null);
    
    FunctionRewriter.SingleReturnStatementReducer reducer = 
        new FunctionRewriter.SingleReturnStatementReducer() {
          @Override
          public String getHelperSource() {
            return "";
          }
        };
    
    Node value = reducer.maybeGetSingleReturnRValue(functionNode);
    assertNull(value);
  }

  @Test
  public void testBuildCallNode_WithNullArgument() {
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };
    
    Node result = reducer.buildCallNode("test", null, 1, 2);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testBuildCallNode_WithArgument() {
    FunctionRewriter.Reducer reducer = new FunctionRewriter.Reducer() {
      @Override
      String getHelperSource() {
        return "";
      }

      @Override
      Node reduce(Node node) {
        return node;
      }
    };
    
    Node arg = Node.newString(Token.NAME, "x");
    Node result = reducer.buildCallNode("test", arg, 1, 2);
    assertNotNull(result);
    assertEquals(Token.CALL, result.getType());
  }

  @Test
  public void testReduction_Apply() throws Exception {
    Node parent = new Node(Token.EXPR_RESULT);
    Node oldChild = Node.newString(Token.NAME, "old");
    Node newChild = Node.newString(Token.NAME, "new");
    parent.addChildToBack(oldChild);
    
    FunctionRewriter.Reduction reduction = 
        new FunctionRewriter().new Reduction(parent, oldChild, newChild);
    reduction.apply();
    assertSame(newChild, parent.getFirstChild());
  }

  @Test
  public void testReduction_EstimateSavings() throws Exception {
    Node oldNode = new Node(Token.FUNCTION);
    oldNode.addChildToBack(new Node(Token.PARAM_LIST));
    oldNode.addChildToBack(new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NUMBER, 999))));
    
    Node newNode = new Node(Token.CALL);
    FunctionRewriter.Reduction reduction = 
        new FunctionRewriter().new Reduction(new Node(Token.EXPR_RESULT), oldNode, newNode);
    assertTrue(reduction.estimateSavings() > 0);
  }

  @Test
  public void testSingleReturnStatementReducer_WithReturn() {
    Node functionNode = new Node(Token.FUNCTION);
    functionNode.addChildToBack(new Node(Token.PARAM_LIST));
    Node returnValue = Node.newString(Token.NAME, "x");
    Node body = new Node(Token.BLOCK, new Node(Token.RETURN, returnValue));
    functionNode.addChildToBack(body);
    
    FunctionRewriter.SingleReturnStatementReducer reducer = 
        new FunctionRewriter.SingleReturnStatementReducer() {
          @Override
          public String getHelperSource() {
            return "";
          }
        };
    
    Node value = reducer.maybeGetSingleReturnRValue(functionNode);
    assertNotNull(value);
    assertSame(returnValue, value);
  }
}