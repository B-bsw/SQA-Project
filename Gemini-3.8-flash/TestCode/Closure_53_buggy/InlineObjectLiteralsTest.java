package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class InlineObjectLiteralsTest {

  private InlineObjectLiterals inlineObjectLiterals;
  private AbstractCompiler compiler;
  private Supplier<String> safeNameIdSupplier;

  private static class TestCompiler extends AbstractCompiler {
    private CodingConvention convention;
    private final List<Node> externs = new ArrayList<>();

    TestCompiler(CodingConvention convention) {
      this.convention = convention;
    }

    @Override
    public CodingConvention getCodingConvention() {
      return convention;
    }

    @Override
    public void report(CheckLevel level, JSError error) {
    }

    @Override
    public Node getRoot() {
      return null;
    }

    @Override
    public Node getLastChange() {
      return null;
    }

    @Override
    public void process(CompilerPass pass) {
    }

    @Override
    public void processExterns(Node externs) {
      this.externs.add(externs);
    }

    @Override
    public Node getExternsRoot() {
      return externs.isEmpty() ? null : externs.get(0);
    }

    @Override
    public Node getJsRoot() {
      return null;
    }

    @Override
    public void reportChange(Node n) {
    }

    @Override
    public void addToChangeList(Node n) {
    }

    @Override
    public void removeFromChangeList(Node n) {
    }

    @Override
    public CompilerInput getInput(SourceFile file) {
      return null;
    }
  }

  private static class TestSupplier implements Supplier<String> {
    private int counter = 0;

    @Override
    public String get() {
      return "s" + (counter++);
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler(GoogleCodingConvention.getDefault());
    safeNameIdSupplier = new TestSupplier();
    inlineObjectLiterals = new InlineObjectLiterals(compiler, safeNameIdSupplier);
  }

  @Test
  public void testProcessExternsAndRoot() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.EMPTY);
    try {
      inlineObjectLiterals.process(externs, root);
      fail("Should throw exception for missing scope");
    } catch (NullPointerException e) {
      // expected - root has no children
    }
  }

  @Test
  public void testIsVarOrAssignExprLhs() {
    Node varNode = new Node(Token.VAR);
    Node assignNode = new Node(Token.ASSIGN);
    Node lhs = new Node(Token.NAME);
    assignNode.addChildToBack(lhs);
    assignNode.addChildToBack(new Node(Token.NUMBER));
    
    Node exprResultNode = new Node(Token.EXPR_RESULT);
    exprResultNode.addChildToBack(assignNode);
    
    assertTrue(lhs.isVarOrAssignExprLhs());
    assertFalse(new Node(Token.NAME).isVarOrAssignExprLhs());
  }

  @Test
  public void testIsInlinableObjectNoReferences() {
    List<Reference> refs = new ArrayList<>();
    assertFalse(inlineObjectLiterals.new InliningBehavior().isInlinableObject(refs));
  }

  @Test
  public void testIsInlinableObjectWithNullAssignedValue() {
    Var v = createVar(new Node(Token.NAME, "x"));
    Reference ref = new Reference();
    List<Reference> refs = new ArrayList<>();
    refs.add(ref);
    assertFalse(inlineObjectLiterals.new InliningBehavior().isInlinableObject(refs));
  }

  @Test
  public void testIsInlinableObjectWithNonObjectLit() {
    Var v = createVar(new Node(Token.NAME, "x"));
    Node assign = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "x");
    Node parent = new Node(Token.EXPR_RESULT);
    assign.addChildToBack(name);
    assign.addChildToBack(new Node(Token.NUMBER, "5"));
    parent.addChildToBack(assign);
    
    Reference ref = new Reference(name, parent, parent, parent);
    List<Reference> refs = new ArrayList<>();
    refs.add(ref);
    assertFalse(inlineObjectLiterals.new InliningBehavior().isInlinableObject(refs));
  }

  @Test
  public void testIsInlinableObjectGetPropCall() {
    Var v = createVar(new Node(Token.NAME, "x"));
    Node name = new Node(Token.NAME, "x");
    Node getprop = new Node(Token.GETPROP, name, new Node(Token.STRING, "a"));
    Node call = new Node(Token.CALL, getprop);
    Node expr = new Node(Token.EXPR_RESULT, call);
    
    Reference ref = new Reference(name, getprop, call, expr);
    List<Reference> refs = new ArrayList<>();
    refs.add(ref);
    assertFalse(inlineObjectLiterals.new InliningBehavior().isInlinableObject(refs));
  }

  @Test
  public void testComputeVarListWithBasicReferences() {
    Var v = createVar(new Node(Token.NAME, "x"));
    Node objectLit = new Node(Token.OBJECTLIT);
    Node child1 = new Node(Token.STRING, "a");
    child1.addChildToBack(new Node(Token.NUMBER, "1"));
    Node child2 = new Node(Token.STRING, "b");
    child2.addChildToBack(new Node(Token.NUMBER, "2"));
    objectLit.addChildToBack(child1);
    objectLit.addChildToBack(child2);
    
    Node assign = new Node(Token.ASSIGN);
    Node name = new Node(Token.NAME, "x");
    assign.addChildToBack(name);
    assign.addChildToBack(objectLit);
    
    Reference init = new Reference(name, assign, new Node(Token.EXPR_RESULT), assign);
    
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(init);
    
    Map<String, String> varmap = ((InlineObjectLiterals.InliningBehavior) inlineObjectLiterals.new InliningBehavior()).computeVarList(v, refInfo);
    assertNotNull(varmap);
  }

  @Test
  public void testComputeVarListWithAssignment() {
    Var v = createVar(new Node(Token.NAME, "x"));
    Node objectLit = new Node(Token.OBJECTLIT);
    Node child1 = new Node(Token.STRING, "a");
    child1.addChildToBack(new Node(Token.NUMBER, "1"));
    objectLit.addChildToBack(child1);
    
    Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), objectLit);
    Node expr = new Node(Token.EXPR_RESULT, assign);
    
    Reference init = new Reference(assign.getFirstChild(), assign, expr, assign);
    
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(init);
    
    Map<String, String> varmap = ((InlineObjectLiterals.InliningBehavior) inlineObjectLiterals.new InliningBehavior()).computeVarList(v, refInfo);
    assertNotNull(varmap);
    assertTrue(varmap.isEmpty());
  }

  @Test
  public void testFillInitialValues() {
    InlineObjectLiterals.InliningBehavior behavior = inlineObjectLiterals.new InliningBehavior();
    Node objectLit = new Node(Token.OBJECTLIT);
    Node key1 = new Node(Token.STRING, "a");
    key1.addChildToBack(new Node(Token.NUMBER, "1"));
    objectLit.addChildToBack(key1);
    
    Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), objectLit);
    Reference init = new Reference(assign.getFirstChild(), assign, new Node(Token.EXPR_RESULT), assign);
    
    Map<String, Node> initvals = new java.util.HashMap<>();
    behavior.fillInitialValues(init, initvals);
    assertEquals(1, initvals.size());
    assertNotNull(initvals.get("a"));
  }

  @Test
  public void testBlacklistVarReferencesInTree() {
    InlineObjectLiterals.InliningBehavior behavior = inlineObjectLiterals.new InliningBehavior();
    Var v = createVar(new Node(Token.NAME, "x"));
    Node rootNode = new Node(Token.BLOCK);
    Node nameNode = new Node(Token.NAME, "y");
    rootNode.addChildToBack(nameNode);
    
    behavior.blacklistVarReferencesInTree(rootNode, null);
    assertTrue(behavior.staleVars.isEmpty());
  }

  @Test
  public void testIsVarInlineForbidden() {
    InlineObjectLiterals.InliningBehavior behavior = inlineObjectLiterals.new InliningBehavior();
    Var v = createVar(new Node(Token.NAME, "x"));
    assertFalse(behavior.isVarInlineForbidden(v));
  }

  @Test
  public void testSplitObjectBasic() {
    InlineObjectLiterals.InliningBehavior behavior = inlineObjectLiterals.new InliningBehavior();
    Var v = createVar(new Node(Token.NAME, "x"));
    
    Node objectLit = new Node(Token.OBJECTLIT);
    Node key1 = new Node(Token.STRING, "a");
    key1.addChildToBack(new Node(Token.NUMBER, "1"));
    objectLit.addChildToBack(key1);
    
    Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), objectLit);
    Node expr = new Node(Token.EXPR_RESULT, assign);
    assign.getParent().addChildToBack(expr);
    
    Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
    
    Reference decl = new Reference(varNode, varNode, varNode, varNode);
    Reference init = new Reference(assign, expr, expr, assign);
    
    ReferenceCollection refInfo = new ReferenceCollection();
    refInfo.references = new ArrayList<>();
    refInfo.references.add(decl);
    refInfo.references.add(init);
    
    try {
      behavior.splitObject(v, decl, init, refInfo);
      // No exception means success
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testReplaceAssignmentExpression() {
    InlineObjectLiterals.InliningBehavior behavior = inlineObjectLiterals.new InliningBehavior();
    Var v = createVar(new Node(Token.NAME, "x"));
    
    Node objectLit = new Node(Token.OBJECTLIT);
    Node key1 = new Node(Token.STRING, "a");
    key1.addChildToBack(new Node(Token.NUMBER, "1"));
    objectLit.addChildToBack(key1);
    
    Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), objectLit);
    Node expr = new Node(Token.EXPR_RESULT, assign);
    
    Reference ref = new Reference(assign, expr, expr, assign);
    
    Map<String, String> varmap = new java.util.HashMap<>();
    varmap.put("a", "JSCompiler_object_inline_a_s0");
    
    try {
      behavior.replaceAssignmentExpression(v, ref, varmap);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testProcessWithNullExterns() {
    Node root = new Node(Token.BLOCK);
    try {
      inlineObjectLiterals.process(null, root);
      fail("Should throw NullPointerException");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testProcessWithEmptyRoot() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.BLOCK);
    try {
      inlineObjectLiterals.process(externs, root);
      fail("Should throw exception");
    } catch (Exception e) {
      // expected - no scope
    }
  }

  private Var createVar(Node node) {
    return new Var() {
      @Override
      public String getName() {
        return node.getString();
      }

      @Override
      public Node getNameNode() {
        return node;
      }

      @Override
      public Node getParentNode() {
        return node.getParent();
      }

      @Override
      public Scope getScope() {
        return null;
      }

      @Override
      public boolean isGlobal() {
        return false;
      }

      @Override
      public boolean isExtern() {
        return false;
      }

      @Override
      public boolean isVar() {
        return false;
      }

      @Override
      public boolean isLet() {
        return false;
      }

      @Override
      public boolean isConst() {
        return false;
      }

      @Override
      public boolean isCatch() {
        return false;
      }

      @Override
      public boolean isParam() {
        return false;
      }

      @Override
      public boolean isClass() {
        return false;
      }

      @Override
      public Node getInitialValue() {
        return null;
      }

      @Override
      public String getQualifiedName() {
        return getName();
      }

      @Override
      public boolean isQualifiedName() {
        return false;
      }

      @Override
      public boolean isSimpleName() {
        return false;
      }

      @Override
      public int compareTo(Var o) {
        return 0;
      }
    };
  }
}