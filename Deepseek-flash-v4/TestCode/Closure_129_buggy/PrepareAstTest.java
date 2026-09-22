package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class PrepareAstTest {

  private PrepareAst prepareAst;
  private Node externs;
  private Node root;

  @Before
  public void setUp() {
    externs = IR.empty();
    root = IR.empty();
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    });
  }

  @Test
  public void testProcessCheckOnly() {
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    Node root = IR.block();
    root.addChildToBack(IR.ifNode(IR.name("x"), IR.block()));
    prepareAst.process(externs, root);
  }

  @Test
  public void testProcessCheckOnlyWithInvalidTree() {
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    Node root = IR.block();
    root.addChildToBack(IR.ifNode(IR.name("x"), IR.name("y"))); // invalid: if with non-block body
    try {
      prepareAst.process(externs, root);
      fail("Expected exception");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void testProcessNormal() {
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, false);
    Node root = IR.block();
    Node ifNode = IR.ifNode(IR.name("cond"), IR.block());
    root.addChildToBack(ifNode);
    prepareAst.process(externs, root);
    assertNotNull(root.getFirstChild());
  }

  @Test
  public void testProcessWithNullExternsAndRoot() {
    prepareAst.process(null, null);
  }

  @Test
  public void testProcessWithNullExterns() {
    prepareAst.process(null, root);
  }

  @Test
  public void testProcessWithNullRoot() {
    prepareAst.process(externs, null);
  }

  @Test
  public void testProcessWithEmptyExternsAndRoot() {
    prepareAst.process(IR.empty(), IR.empty());
  }

  @Test
  public void testPrepareAnnotationsShouldTraverseObjectLit() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node objLit = IR.objectlit();
    Node key = IR.stringKey("key");
    Node value = IR.function(IR.name("fn"), IR.paramList(), IR.block());
    key.addChildToBack(value);
    objLit.addChildToBack(key);
    assertTrue(annotations.shouldTraverse(null, objLit, null));
  }

  @Test
  public void testPrepareAnnotationsShouldTraverseNonObjectLit() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node fn = IR.function(IR.name("fn"), IR.paramList(), IR.block());
    assertTrue(annotations.shouldTraverse(null, fn, null));
  }

  @Test
  public void testPrepareAnnotationsVisitCall() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node call = IR.call(IR.name("foo"));
    annotations.visit(null, call, null);
    assertTrue(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testPrepareAnnotationsVisitCallWithThis() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node call = IR.call(IR.getprop(IR.name("obj"), IR.string("method")));
    annotations.visit(null, call, null);
    assertFalse(call.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testPrepareAnnotationsVisitCallEval() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node call = IR.call(IR.name("eval"));
    annotations.visit(null, call, null);
    assertTrue(call.getFirstChild().getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testPrepareAnnotationsVisitFunctionDispatcher() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node parent = IR.assign(IR.name("target"), IR.function(IR.name("fn"), IR.paramList(), IR.block()));
    Node fn = parent.getLastChild();
    parent.setJSDocInfo(new JSDocInfo() {
      @Override
      public boolean isJavaDispatch() {
        return true;
      }
    });
    annotations.visit(null, fn, parent);
    assertTrue(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testPrepareAnnotationsVisitFunctionNonDispatcher() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node parent = IR.assign(IR.name("target"), IR.function(IR.name("fn"), IR.paramList(), IR.block()));
    Node fn = parent.getLastChild();
    annotations.visit(null, fn, parent);
    assertFalse(fn.getBooleanProp(Node.IS_DISPATCHER));
  }

  @Test
  public void testNormalizeBlocksWithIf() {
    Node ifNode = IR.ifNode(IR.name("cond"), IR.name("body"));
    Node parent = IR.block();
    parent.addChildToBack(ifNode);
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    prepareAst.process(externs, parent);
    Node normalized = parent.getFirstChild();
    assertTrue(normalized.isIf());
    assertTrue(normalized.getLastChild().isBlock());
  }

  @Test
  public void testNormalizeBlocksWithWhile() {
    Node whileNode = IR.whileNode(IR.name("cond"), IR.name("body"));
    Node parent = IR.block();
    parent.addChildToBack(whileNode);
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    prepareAst.process(externs, parent);
    Node normalized = parent.getFirstChild();
    assertTrue(normalized.isWhile());
    assertTrue(normalized.getLastChild().isBlock());
  }

  @Test
  public void testNormalizeBlocksWithEmptyBody() {
    Node ifNode = IR.ifNode(IR.name("cond"), IR.empty());
    Node parent = IR.block();
    parent.addChildToBack(ifNode);
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    prepareAst.process(externs, parent);
    Node normalized = parent.getFirstChild();
    assertTrue(normalized.getLastChild().isBlock());
    assertTrue(normalized.getLastChild().getBooleanProp(Node.WAS_EMPTY));
  }

  @Test
  public void testNormalizeBlocksWithLabel() {
    Node label = IR.label(IR.name("label"), IR.ifNode(IR.name("cond"), IR.name("body")));
    Node parent = IR.block();
    parent.addChildToBack(label);
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    prepareAst.process(externs, parent);
    Node normalized = parent.getFirstChild();
    assertTrue(normalized.isLabel());
    assertFalse(normalized.getLastChild().isBlock());
  }

  @Test
  public void testNormalizeBlocksWithSwitch() {
    Node switchNode = IR.switchNode(IR.name("expr"), IR.block());
    Node parent = IR.block();
    parent.addChildToBack(switchNode);
    prepareAst = new PrepareAst(new AbstractCompiler() {
      @Override
      Node getLastChange() {
        return null;
      }
    }, true);
    prepareAst.process(externs, parent);
    Node normalized = parent.getFirstChild();
    assertTrue(normalized.isSwitch());
    assertFalse(normalized.getLastChild().isBlock());
  }

  @Test
  public void testNormalizeObjectLiteralKeyAnnotationsWithFunction() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node objlit = IR.objectlit();
    Node key = IR.stringKey("key");
    Node value = IR.function(IR.name("fn"), IR.paramList(), IR.block());
    key.addChildToBack(value);
    key.setJSDocInfo(new JSDocInfo() {
      @Override
      public boolean isJavaDispatch() {
        return false;
      }
    });
    objlit.addChildToBack(key);
    annotations.shouldTraverse(null, objlit, null);
    annotations.visit(null, objlit, null);
    assertEquals(key.getJSDocInfo(), value.getJSDocInfo());
  }

  @Test
  public void testNormalizeObjectLiteralKeyAnnotationsWithNonFunction() {
    PrepareAst.PrepareAnnotations annotations = new PrepareAst.PrepareAnnotations();
    Node objlit = IR.objectlit();
    Node key = IR.stringKey("key");
    Node value = IR.string("value");
    key.addChildToBack(value);
    key.setJSDocInfo(new JSDocInfo() {
      @Override
      public boolean isJavaDispatch() {
        return false;
      }
    });
    objlit.addChildToBack(key);
    annotations.shouldTraverse(null, objlit, null);
    annotations.visit(null, objlit, null);
    assertNull(value.getJSDocInfo());
  }
}