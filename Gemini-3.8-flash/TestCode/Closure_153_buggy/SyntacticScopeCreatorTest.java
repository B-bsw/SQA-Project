package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class SyntacticScopeCreatorTest {
  private AbstractCompiler compiler;
  private SyntacticScopeCreator creator;
  private Node root;

  private static class TestCompiler extends AbstractCompiler {
    private boolean errorReported;
    private String lastError;

    @Override
    public void report(JSError error) {
      errorReported = true;
      lastError = error.getDescription();
    }

    @Override
    public InputId getInputId() {
      return null;
    }

    @Override
    public CompilerInput getInput(InputId id) {
      return null;
    }

    @Override
    public CompilerInput getInput(String sourceName) {
      return null;
    }

    @Override
    public boolean hasInput(InputId id) {
      return false;
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    creator = new SyntacticScopeCreator(compiler);
  }

  private Node createFunctionNode(String name) {
    Node function = new Node(Token.FUNCTION);
    Node nameNode = name.isEmpty() ? new Node(Token.NAME, "") : Node.newString(name);
    function.addChildToFront(nameNode);
    Node args = new Node(Token.LP);
    function.addChildAfter(args, nameNode);
    Node body = new Node(Token.BLOCK);
    function.addChildAfter(body, args);
    return function;
  }

  @Test
  public void testCreateScopeWithNullParent() {
    root = new Node(Token.SCRIPT);
    Scope result = creator.createScope(root, null);
    assertNotNull(result);
    assertTrue(result.isGlobal());
  }

  @Test
  public void testCreateScopeWithParent() {
    root = new Node(Token.SCRIPT);
    Scope parent = new Scope(null, root);
    Scope result = creator.createScope(root, parent);
    assertNotNull(result);
    assertSame(parent, result.getParent());
  }

  @Test
  public void testCreateScopeWithFunctionExpression() {
    Node script = new Node(Token.SCRIPT);
    Node function = createFunctionNode("testFn");
    script.addChildToBack(function);
    Scope result = creator.createScope(script, null);
    assertNotNull(result);
    assertNotNull(result.getVar("testFn"));
  }

  @Test
  public void testCreateScopeWithArgumentsInLocalScope() {
    Node script = new Node(Token.SCRIPT);
    Node function = createFunctionNode("testFn");
    Node args = function.getFirstChild().getNext();
    Node argName = Node.newString("arguments");
    args.addChildToBack(argName);
    script.addChildToBack(function);
    Scope result = creator.createScope(script, null);
    assertNotNull(result);
    assertNull(result.getVar("arguments"));
  }

  @Test
  public void testCreateScopeWithVarDeclaration() {
    Node script = new Node(Token.SCRIPT);
    Node var = new Node(Token.VAR);
    Node name = Node.newString("x");
    var.addChildToBack(name);
    script.addChildToBack(var);
    Scope result = creator.createScope(script, null);
    assertNotNull(result.getVar("x"));
  }

  @Test
  public void testCreateScopeWithLocalFunction() {
    Node script = new Node(Token.SCRIPT);
    Node function = createFunctionNode("innerFn");
    script.addChildToBack(function);
    Scope result = creator.createScope(script, null);
    assertNotNull(result.getVar("innerFn"));
  }

  @Test
  public void testCreateScopeWithCatchBlock() {
    Node script = new Node(Token.SCRIPT);
    Node tryBlock = new Node(Token.TRY);
    Node catchBlock = new Node(Token.CATCH);
    Node catchName = Node.newString("e");
    Node catchBody = new Node(Token.BLOCK);
    catchBlock.addChildToBack(catchName);
    catchBlock.addChildToBack(catchBody);
    tryBlock.addChildToBack(new Node(Token.BLOCK));
    tryBlock.addChildToBack(catchBlock);
    script.addChildToBack(tryBlock);
    Scope result = creator.createScope(script, null);
    assertNotNull(result.getVar("e"));
  }

  @Test
  public void testCreateScopeWithFunctionExpressionNotDeclared() {
    Node script = new Node(Token.SCRIPT);
    Node function = createFunctionNode("");
    script.addChildToBack(function);
    Scope result = creator.createScope(script, null);
    assertNotNull(result);
  }

  @Test
  public void testCreateScopeWithDuplicateGlobalVar() {
    root = new Node(Token.SCRIPT);
    Scope scope = creator.createScope(root, null);
    Node var1 = new Node(Token.VAR);
    Node name1 = Node.newString("dup");
    var1.addChildToBack(name1);
    scope.declare("dup", name1, null, null);
    Node var2 = new Node(Token.VAR);
    Node name2 = Node.newString("dup");
    var2.addChildToBack(name2);
    creator.declareVar("dup", name2, var2, root, null, name2);
    assertTrue(((TestCompiler) compiler).errorReported);
  }

  @Test
  public void testCreateScopeWithDuplicateArguments() {
    root = new Node(Token.SCRIPT);
    Scope scope = creator.createScope(root, null);
    Node var1 = new Node(Token.VAR);
    Node name1 = Node.newString("arguments");
    var1.addChildToBack(name1);
    scope.declare("arguments", name1, null, null);
    Node var2 = new Node(Token.VAR);
    Node name2 = Node.newString("arguments");
    var2.addChildToBack(name2);
    creator.declareVar("arguments", name2, var2, root, null, name2);
    assertTrue(((TestCompiler) compiler).errorReported);
  }

  @Test
  public void testCreateScopeWithDuplicateCatch() {
    root = new Node(Token.SCRIPT);
    Scope scope = creator.createScope(root, null);
    Node catch1 = new Node(Token.CATCH);
    Node catchName1 = Node.newString("e");
    catch1.addChildToBack(catchName1);
    Node block1 = new Node(Token.BLOCK);
    catch1.addChildToBack(block1);
    scope.declare("e", catchName1, null, null);
    Node catch2 = new Node(Token.CATCH);
    Node catchName2 = Node.newString("e");
    catch2.addChildToBack(catchName2);
    Node block2 = new Node(Token.BLOCK);
    catch2.addChildToBack(block2);
    creator.declareVar("e", catchName2, catch2, root, null, catchName2);
    assertTrue(((TestCompiler) compiler).errorReported);
  }
}