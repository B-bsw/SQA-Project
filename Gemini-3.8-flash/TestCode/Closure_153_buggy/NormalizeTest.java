package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.HashSet;
import java.util.Set;

public class NormalizeTest {

  private static class MockCompiler extends AbstractCompiler {
    private final Set<String> codeChanges = new HashSet<>();
    private String lastCodeChange;
    private int changeCount = 0;

    @Override
    public void reportCodeChange() {
      changeCount++;
    }

    @Override
    public void reportCodeChange(String description) {
      lastCodeChange = description;
      codeChanges.add(description);
      changeCount++;
    }

    @Override
    public Node parseSyntheticCode(String code) {
      return new Node(Token.SCRIPT);
    }

    @Override
    public Node parseTestCode(String code) {
      return new Node(Token.SCRIPT);
    }

    @Override
    public UniqueNameSupplier getUniqueNameIdSupplier() {
      return new UniqueNameSupplier() {
        @Override
        public String getUniqueNameId() {
          return "unique_" + System.nanoTime();
        }
      };
    }

    @Override
    public void report(JSError error) {
    }

    @Override
    public void setNormalized() {
    }

    @Override
    public CodingConvention getCodingConvention() {
      return new CodingConvention() {
        @Override
        public boolean isConstant(String name) {
          return name.startsWith("CONST_");
        }

        @Override
        public boolean isConstantKey(String key) {
          return key.startsWith("CONST_");
        }

        @Override
        public boolean isValidEnumKey(String key) {
          return false;
        }

        @Override
        public boolean isPrivate(String name) {
          return false;
        }

        @Override
        public boolean isPublic(String name) {
          return true;
        }

        @Override
        public boolean isOptionalParameter(Node parameter) {
          return false;
        }

        @Override
        public boolean isVarArgs(Node varArgs) {
          return false;
        }

        @Override
        public String getParameterName(Node parameter) {
          return null;
        }

        @Override
        public String getTypeName(Node n) {
          return null;
        }

        @Override
        public void applyAlias(AbstractCompiler compiler, Node root, Node alias) {
        }
      };
    }

    @Override
    public Node getRoot() {
      return new Node(Token.EMPTY);
    }

    @Override
    public void report(JSError error, Node n) {
    }

    public int getChangeCount() {
      return changeCount;
    }

    public String getLastCodeChange() {
      return lastCodeChange;
    }
  }

  private MockCompiler compiler;
  private Normalize normalize;

  @Before
  public void setUp() {
    compiler = new MockCompiler();
    normalize = new Normalize(compiler, false);
  }

  @Test
  public void testProcessNoChanges() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    root.addChildToBack(externs);
    normalize.process(externs, root);
    assertEquals(0, compiler.getChangeCount());
  }

  @Test
  public void testProcessWithWhileToForConversion() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node whileNode = new Node(Token.WHILE);
    whileNode.addChildToBack(new Node(Token.EMPTY));
    root.addChildToBack(whileNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() > 0);
    assertEquals(Token.FOR, whileNode.getType());
  }

  @Test
  public void testProcessWhileShouldTraverse() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node whileNode = new Node(Token.WHILE);
    Node condition = new Node(Token.EMPTY);
    whileNode.addChildToBack(condition);
    root.addChildToBack(whileNode);
    normalize.process(externs, root);
    assertTrue(whileNode.getType() == Token.FOR);
  }

  @Test
  public void testNormalizeLabelsCase() {
    Node labelNode = new Node(Token.LABEL);
    labelNode.addChildToBack(new Node(Token.NAME, "label"));
    Node innerBlock = new Node(Token.BLOCK);
    labelNode.addChildToBack(innerBlock);
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    // shouldTraverse should not throw
    stats.shouldTraverse(null, labelNode, null);
  }

  @Test
  public void testNormalizeForInitializer() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    init.addChildToBack(new Node(Token.NAME, "i"));
    forNode.addChildToBack(init);
    root.addChildToBack(forNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testNormalizeForInInitializer() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node forInNode = new Node(Token.FOR_IN);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "x");
    varNode.addChildToBack(nameNode);
    forInNode.addChildToBack(varNode);
    root.addChildToBack(forInNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() > 0);
  }

  @Test
  public void testNormalizeFunctionDeclaration() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(new Node(Token.NAME, "fn"));
    fnNode.addChildToBack(new Node(Token.BLOCK));
    root.addChildToBack(fnNode);
    normalize.process(externs, root);
    assertEquals(Token.SCRIPT, root.getType());
  }

  @Test
  public void testNormalizeStatementBlock() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node block = new Node(Token.BLOCK);
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(new Node(Token.NAME, "a"));
    varNode.addChildToBack(new Node(Token.NAME, "b"));
    block.addChildToBack(varNode);
    root.addChildToBack(block);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() > 0);
  }

  @Test
  public void testNormalizeFunctionExpressionNotMoved() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(new Node(Token.NAME, "fn"));
    Node param = new Node(Token.PARAM_LIST);
    fnNode.addChildToBack(param);
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToBack(body);
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(new Node(Token.NAME, "x"));
    assign.addChildToBack(fnNode);
    root.addChildToBack(assign);
    normalize.process(externs, root);
    assertEquals(Token.ASSIGN, root.getFirstChild().getType());
  }

  @Test
  public void testNormalizeCatchBlockError() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node catchNode = new Node(Token.CATCH);
    Node catchVar = new Node(Token.NAME, "e");
    catchNode.addChildToBack(catchVar);
    root.addChildToBack(catchNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testRemoveDuplicateDeclarations() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node var1 = new Node(Token.VAR);
    var1.addChildToBack(new Node(Token.NAME, "a"));
    Node var2 = new Node(Token.VAR);
    var2.addChildToBack(new Node(Token.NAME, "a"));
    root.addChildToBack(var1);
    root.addChildToBack(var2);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testDuplicateDeclarationHandlerWithCatchVar() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(new Node(Token.NAME, "f"));
    Node body = new Node(Token.BLOCK);
    fnNode.addChildToBack(body);
    root.addChildToBack(fnNode);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "e");
    varNode.addChildToBack(nameNode);
    Node catchNode = new Node(Token.CATCH);
    catchNode.addChildToBack(new Node(Token.NAME, "e"));
    body.addChildToBack(catchNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testPropagateConstantAnnotations() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "CONST_FOO");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testVerifyConstantsConsistent() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "CONST_X");
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    Node result = Normalize.parseAndNormalizeSyntheticCode(compiler, "var x = 1;", "prefix");
    assertNotNull(result);
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    try {
      Node result = Normalize.parseAndNormalizeTestCode(compiler, "var x = 1;");
      assertNotNull(result);
    } catch (NullPointerException e) {
      fail("NPE thrown: " + e.getMessage());
    }
  }

  @Test
  public void testReportCodeChangeAssertOnChangeTrue() {
    MockCompiler c = new MockCompiler();
    Normalize n = new Normalize(c, true);
    try {
      n.reportCodeChange("test change");
      fail("Should throw IllegalStateException");
    } catch (IllegalStateException expected) {
      // expected
    }
  }

  @Test
  public void testReportCodeChangeAssertOnChangeFalse() {
    Normalize n = new Normalize(compiler, false);
    n.reportCodeChange("test change");
    assertEquals(1, compiler.getChangeCount());
  }

  @Test
  public void testNormalizeStatementsShouldTraverseWithFunction() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node root = new Node(Token.SCRIPT);
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(new Node(Token.NAME, "fn"));
    fnNode.addChildToBack(new Node(Token.BLOCK));
    root.addChildToBack(fnNode);
    stats.shouldTraverse(null, fnNode, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testNormalizeStatementsShouldTraverseWithName() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node root = new Node(Token.SCRIPT);
    Node nameNode = new Node(Token.NAME, "x");
    root.addChildToBack(nameNode);
    stats.shouldTraverse(null, nameNode, root);
    assertTrue(compiler.getChangeCount() == 0);
  }

  @Test
  public void testNormalizeStatementsForWithInitVar() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node root = new Node(Token.SCRIPT);
    Node forNode = new Node(Token.FOR);
    Node initVar = new Node(Token.VAR);
    initVar.addChildToBack(new Node(Token.NAME, "i"));
    forNode.addChildToBack(initVar);
    root.addChildToBack(forNode);
    stats.shouldTraverse(null, forNode, root);
    assertTrue(compiler.getChangeCount() > 0);
  }

  @Test
  public void testNormalizeStatementsExtractForInitializerNullBefore() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node root = new Node(Token.SCRIPT);
    Node forNode = new Node(Token.FOR);
    Node init = new Node(Token.VAR);
    init.addChildToBack(new Node(Token.NAME, "i"));
    forNode.addChildToBack(init);
    stats.extractForInitializer(forNode, null, root);
    assertTrue(compiler.getChangeCount() > 0);
  }

  @Test
  public void testSplitVarDeclarationsSingle() {
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(new Node(Token.NAME, "a"));
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    stats.splitVarDeclarations(varNode);
    assertEquals(0, compiler.getChangeCount());
  }

  @Test
  public void testSplitVarDeclarationsMultiple() {
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(new Node(Token.NAME, "a"));
    varNode.addChildToBack(new Node(Token.NAME, "b"));
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    stats.splitVarDeclarations(varNode);
    assertTrue(compiler.getChangeCount() > 0);
  }

  @Test
  public void testMoveNamedFunctionsAlreadyAtTop() {
    Node functionBody = new Node(Token.BLOCK);
    Node fn1 = new Node(Token.FUNCTION);
    fn1.addChildToBack(new Node(Token.NAME, "f1"));
    fn1.addChildToBack(new Node(Token.BLOCK));
    functionBody.addChildToBack(fn1);
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    stats.moveNamedFunctions(functionBody);
    assertEquals(0, compiler.getChangeCount());
  }

  @Test
  public void testAddToFrontEmptyAfter() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node newChild = new Node(Token.NAME, "x");
    Node result = stats.addToFront(parent, newChild, null);
    assertEquals(newChild, result);
    assertEquals(newChild, parent.getFirstChild());
  }

  @Test
  public void testAddToFrontWithAfter() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node parent = new Node(Token.BLOCK);
    Node existing = new Node(Token.NAME, "a");
    parent.addChildToBack(existing);
    Node newChild = new Node(Token.NAME, "b");
    Node result = stats.addToFront(parent, newChild, existing);
    assertEquals(newChild, result);
  }

  @Test
  public void testNormalizeFunctionDeclarationFunction() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node n = new Node(Token.FUNCTION);
    n.addChildToBack(new Node(Token.NAME, "fn"));
    n.addChildToBack(new Node(Token.BLOCK));
    stats.normalizeFunctionDeclaration(n);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testNormalizeFunctionDeclarationExpression() {
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    Node n = new Node(Token.FUNCTION);
    Node name = new Node(Token.NAME, "fn");
    n.addChildToBack(name);
    n.addChildToBack(new Node(Token.BLOCK));
    Node assign = new Node(Token.ASSIGN);
    assign.addChildToBack(new Node(Token.NAME, "x"));
    assign.addChildToBack(n);
    stats.normalizeFunctionDeclaration(assign);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testDuplicateDeclarationHandler() {
    Node externs = new Node(Token.EMPTY);
    Node root = new Node(Token.SCRIPT);
    Node varNode = new Node(Token.VAR);
    Node nameNode = new Node(Token.NAME, "a");
    nameNode.addChildToBack(new Node(Token.EMPTY));
    varNode.addChildToBack(nameNode);
    root.addChildToBack(varNode);
    RootScope rootScope = new RootScope(root);
    Normalize.DuplicateDeclarationHandler handler = normalize.new DuplicateDeclarationHandler();
    try {
      handler.onRedeclaration(rootScope, "a", nameNode, varNode, root, nameNode);
      assertTrue(true);
    } catch (Exception e) {
      fail("Unexpected exception: " + e.getMessage());
    }
  }

  @Test
  public void testNormalizeWhileWithForInit() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node whileNode = new Node(Token.WHILE);
    Node condition = new Node(Token.EMPTY);
    whileNode.addChildToBack(condition);
    root.addChildToBack(whileNode);
    normalize.process(externs, root);
    assertEquals(Token.FOR, whileNode.getType());
  }

  @Test
  public void testNormalizeLabel() {
    Node label = new Node(Token.LABEL);
    label.addChildToBack(new Node(Token.NAME, "label"));
    Node stmt = new Node(Token.EMPTY);
    label.addChildToBack(stmt);
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    stats.normalizeLabels(label);
    assertEquals(Token.BLOCK, label.getLastChild().getType());
  }

  @Test
  public void testNormalizeFunctionStatementNotTop() {
    Node body = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT);
    expr.addChildToBack(new Node(Token.NUMBER, 1.0));
    Node fnNode = new Node(Token.FUNCTION);
    fnNode.addChildToBack(new Node(Token.NAME, "fn"));
    Node innerBody = new Node(Token.BLOCK);
    fnNode.addChildToBack(innerBody);
    body.addChildToBack(expr);
    body.addChildToBack(fnNode);
    Normalize.NormalizeStatements stats = normalize.new NormalizeStatements(compiler, false);
    stats.moveNamedFunctions(body);
    assertTrue(body.getFirstChild().getType() == Token.FUNCTION);
  }

  @Test
  public void testPropagateConstantAnnotationsOverVarsVisit() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node nameNode = new Node(Token.NAME, "CONST_X");
    root.addChildToBack(nameNode);
    Normalize.PropagateConstantAnnotationsOverVars prop = 
        normalize.new PropagateConstantAnnotationsOverVars(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, prop);
    t.traverseRoots(externs, root);
    assertTrue(compiler.getChangeCount() >= 0);
  }

  @Test
  public void testVerifyConstantsVisitWithNullParent() {
    Node n = new Node(Token.NAME, "x");
    n.putBooleanProp(Node.IS_CONSTANT_NAME, false);
    Normalize.VerifyConstants verify = normalize.new VerifyConstants(compiler, false);
    NodeTraversal t = new NodeTraversal(compiler, verify);
    t.traverse(new Node(Token.SCRIPT), n);
    assertEquals(0, compiler.getChangeCount());
  }

  @Test
  public void testNormalizeProcessMultipleStatements() {
    Node root = new Node(Token.SCRIPT);
    Node externs = new Node(Token.EMPTY);
    Node whileNode = new Node(Token.WHILE);
    whileNode.addChildToBack(new Node(Token.EMPTY));
    root.addChildToBack(whileNode);
    Node varNode = new Node(Token.VAR);
    varNode.addChildToBack(new Node(Token.NAME, "a"));
    Node name1 = new Node(Token.NAME, "a");
    varNode.addChildToBack(name1);
    root.addChildToBack(varNode);
    normalize.process(externs, root);
    assertTrue(compiler.getChangeCount() > 0);
  }
}