package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.AstNode;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ConditionalExpression;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.EmptyStatement;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.Label;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NewExpression;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IRFactoryTest {

  private TestErrorReporter errorReporter;
  private Config es3Config;
  private Config es5Config;
  private Config es5StrictConfig;
  private Config ideConfig;
  private TestSourceFile defaultSourceFile;

  private static class TestSourceFile implements StaticSourceFile {
    private final String name;

    public TestSourceFile(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public boolean isExtern() {
      return false;
    }

    public int getLineOffset(int lineno) {
      return 0;
    }

    public int getLineOfOffset(int offset) {
      return 0;
    }
  }

  private static class TestErrorReporter implements ErrorReporter {
    private final List<String> warnings = new ArrayList<String>();
    private final List<String> errors = new ArrayList<String>();

    public void warning(String message, String sourceName, int line, String lineSource, int lineOffset) {
      warnings.add(message);
    }

    public void error(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
    }

    public EvaluatorException runtimeError(String message, String sourceName, int line, String lineSource, int lineOffset) {
      errors.add(message);
      return new EvaluatorException(message, sourceName, line, lineSource, lineOffset);
    }

    public boolean hasWarning(String text) {
      for (String w : warnings) {
        if (w.indexOf(text) != -1) {
          return true;
        }
      }
      return false;
    }

    public boolean hasError(String text) {
      for (String e : errors) {
        if (e.indexOf(text) != -1) {
          return true;
        }
      }
      return false;
    }
  }

  @Before
  public void setUp() {
    errorReporter = new TestErrorReporter();
    Set<String> emptySet = Collections.emptySet();
    es3Config = new Config(emptySet, emptySet, false, LanguageMode.ECMASCRIPT3, false);
    es5Config = new Config(emptySet, emptySet, false, LanguageMode.ECMASCRIPT5, false);
    es5StrictConfig = new Config(emptySet, emptySet, false, LanguageMode.ECMASCRIPT5_STRICT, false);
    ideConfig = new Config(emptySet, emptySet, true, LanguageMode.ECMASCRIPT5, true);
    defaultSourceFile = new TestSourceFile("test.js");
  }

  private Node transform(AstRoot root, String source, Config config) {
    return IRFactory.transformTree(root, defaultSourceFile, source, config, errorReporter);
  }

  private Node transform(AstRoot root, String source) {
    return transform(root, source, es5Config);
  }

  @Test
  public void transformTree_givenEmptyAstRoot_shouldReturnScriptNode() {
    AstRoot root = new AstRoot();
    Node result = transform(root, "");
    Assert.assertNotNull(result);
    Assert.assertEquals(Token.SCRIPT, result.getType());
    Assert.assertEquals(0, result.getChildCount());
  }

  @Test
  public void transformTree_givenNullSourceFile_shouldHandleNullSourceFile() {
    AstRoot root = new AstRoot();
    Node result = IRFactory.transformTree(root, null, "", es5Config, errorReporter);
    Assert.assertNotNull(result);
    Assert.assertEquals(Token.SCRIPT, result.getType());
  }

  @Test
  public void transformTree_givenUseStrictDirective_shouldPopulateDirectives() {
    AstRoot root = new AstRoot();
    StringLiteral strLit = new StringLiteral();
    strLit.setValue("use strict");
    ExpressionStatement exprStmt = new ExpressionStatement();
    exprStmt.setExpression(strLit);
    root.addChildToBack(exprStmt);

    Node result = transform(root, "\"use strict\";");
    Assert.assertEquals(Token.SCRIPT, result.getType());
    Assert.assertNotNull(result.getDirectives());
    Assert.assertTrue(result.getDirectives().contains("use strict"));
    Assert.assertEquals(0, result.getChildCount());
  }

  @Test
  public void transformTree_givenSuspiciousBlockComment_shouldReportWarning() {
    AstRoot root = new AstRoot();
    Comment comment = new Comment(0, 15, CommentType.BLOCK_COMMENT, "/* @type {number} */");
    comment.setLineno(1);
    root.addComment(comment);

    transform(root, "/* @type {number} */");
    Assert.assertTrue(errorReporter.hasWarning(IRFactory.SUSPICIOUS_COMMENT_WARNING));
  }

  @Test
  public void transformTree_givenMultilineSuspiciousBlockComment_shouldReportWarning() {
    AstRoot root = new AstRoot();
    Comment comment = new Comment(0, 20, CommentType.BLOCK_COMMENT, "/*\n * @type {number}\n */");
    comment.setLineno(1);
    root.addComment(comment);

    transform(root, "/*\n * @type {number}\n */");
    Assert.assertTrue(errorReporter.hasWarning(IRFactory.SUSPICIOUS_COMMENT_WARNING));
  }

  @Test
  public void transformTree_givenNonSuspiciousBlockComment_shouldNotReportWarning() {
    AstRoot root = new AstRoot();
    Comment comment = new Comment(0, 10, CommentType.BLOCK_COMMENT, "/* simple */");
    comment.setLineno(1);
    root.addComment(comment);

    transform(root, "/* simple */");
    Assert.assertFalse(errorReporter.hasWarning(IRFactory.SUSPICIOUS_COMMENT_WARNING));
  }

  @Test
  public void transformTree_givenJsDocFileOverviewComment_shouldAttachOverviewInfo() {
    AstRoot root = new AstRoot();
    Comment comment = new Comment(0, 30, CommentType.JSDOC, "/** @fileoverview Test info */");
    comment.setLineno(1);
    root.addComment(comment);

    Node result = transform(root, "/** @fileoverview Test info */");
    Assert.assertNotNull(result.getJSDocInfo());
  }

  @Test
  public void processArrayLiteral_givenStandardElements_shouldCreateArraylitNode() {
    AstRoot root = new AstRoot();
    ArrayLiteral arr = new ArrayLiteral();
    NumberLiteral num = new NumberLiteral(42.0);
    arr.addElement(num);
    ExpressionStatement expr = new ExpressionStatement(arr);
    root.addChildToBack(expr);

    Node result = transform(root, "[42];");
    Node exprResult = result.getFirstChild();
    Assert.assertEquals(Token.EXPR_RESULT, exprResult.getType());
    Node arrNode = exprResult.getFirstChild();
    Assert.assertEquals(Token.ARRAYLIT, arrNode.getType());
    Assert.assertEquals(1, arrNode.getChildCount());
    Assert.assertEquals(Token.NUMBER, arrNode.getFirstChild().getType());
  }

  @Test
  public void processArrayLiteral_givenDestructuring_shouldReportError() {
    AstRoot root = new AstRoot();
    ArrayLiteral arr = new ArrayLiteral();
    arr.setIsDestructuring(true);
    ExpressionStatement expr = new ExpressionStatement(arr);
    root.addChildToBack(expr);

    transform(root, "[]");
    Assert.assertTrue(errorReporter.hasError("destructuring assignment forbidden"));
  }

  @Test
  public void processAssignment_givenValidTarget_shouldCreateAssignNode() {
    AstRoot root = new AstRoot();
    Name name = new Name(0, "x");
    NumberLiteral num = new NumberLiteral(10.0);
    Assignment assign = new Assignment(com.google.javascript.rhino.head.Token.ASSIGN, name, num, 2);
    ExpressionStatement expr = new ExpressionStatement(assign);
    root.addChildToBack(expr);

    Node result = transform(root, "x = 10;");
    Node exprResult = result.getFirstChild();
    Node assignNode = exprResult.getFirstChild();
    Assert.assertEquals(Token.ASSIGN, assignNode.getType());
    Assert.assertEquals(Token.NAME, assignNode.getFirstChild().getType());
  }

  @Test
  public void processAssignment_givenInvalidTarget_shouldReportError() {
    AstRoot root = new AstRoot();
    NumberLiteral num1 = new NumberLiteral(1.0);
    NumberLiteral num2 = new NumberLiteral(2.0);
    Assignment assign = new Assignment(com.google.javascript.rhino.head.Token.ASSIGN, num1, num2, 2);
    ExpressionStatement expr = new ExpressionStatement(assign);
    root.addChildToBack(expr);

    transform(root, "1 = 2;");
    Assert.assertTrue(errorReporter.hasError("invalid assignment target"));
  }

  @Test
  public void processBreakStatement_givenBreakWithAndWithoutLabel_shouldTransformCorrectly() {
    AstRoot root = new AstRoot();
    BreakStatement b1 = new BreakStatement();
    BreakStatement b2 = new BreakStatement();
    Name label = new Name(0, "target");
    b2.setBreakLabel(label);
    root.addChildToBack(b1);
    root.addChildToBack(b2);

    Node result = transform(root, "break;\nbreak target;");
    Node first = result.getFirstChild();
    Assert.assertEquals(Token.BREAK, first.getType());
    Assert.assertEquals(0, first.getChildCount());

    Node second = first.getNext();
    Assert.assertEquals(Token.BREAK, second.getType());
    Assert.assertEquals(1, second.getChildCount());
    Assert.assertEquals(Token.LABEL_NAME, second.getFirstChild().getType());
  }

  @Test
  public void processContinueStatement_givenContinueWithAndWithoutLabel_shouldTransformCorrectly() {
    AstRoot root = new AstRoot();
    ContinueStatement c1 = new ContinueStatement();
    ContinueStatement c2 = new ContinueStatement();
    Name label = new Name(0, "loop");
    c2.setLabel(label);
    root.addChildToBack(c1);
    root.addChildToBack(c2);

    Node result = transform(root, "continue;\ncontinue loop;");
    Node first = result.getFirstChild();
    Assert.assertEquals(Token.CONTINUE, first.getType());
    Assert.assertEquals(0, first.getChildCount());

    Node second = first.getNext();
    Assert.assertEquals(Token.CONTINUE, second.getType());
    Assert.assertEquals(Token.LABEL_NAME, second.getFirstChild().getType());
  }

  @Test
  public void processCatchClause_givenCatchClause_shouldCreateCatchNode() {
    AstRoot root = new AstRoot();
    TryStatement tryStmt = new TryStatement();
    Block tryBlock = new Block();
    tryStmt.setTryBlock(tryBlock);

    CatchClause catchClause = new CatchClause();
    Name varName = new Name(0, "e");
    catchClause.setVarName(varName);
    Block catchBody = new Block();
    catchClause.setBody(catchBody);
    tryStmt.addCatchClause(catchClause);
    root.addChildToBack(tryStmt);

    Node result = transform(root, "try {} catch(e) {}");
    Node tryNode = result.getFirstChild();
    Assert.assertEquals(Token.TRY, tryNode.getType());
    Node catchBlock = tryNode.getFirstChild().getNext();
    Assert.assertEquals(Token.BLOCK, catchBlock.getType());
    Node catchNode = catchBlock.getFirstChild();
    Assert.assertEquals(Token.CATCH, catchNode.getType());
  }

  @Test
  public void processCatchClause_givenCatchCondition_shouldReportError() {
    AstRoot root = new AstRoot();
    TryStatement tryStmt = new TryStatement();
    tryStmt.setTryBlock(new Block());

    CatchClause catchClause = new CatchClause();
    catchClause.setVarName(new Name(0, "e"));
    catchClause.setBody(new Block());
    catchClause.setCatchCondition(new Name(0, "cond"));
    tryStmt.addCatchClause(catchClause);
    root.addChildToBack(tryStmt);

    transform(root, "try {} catch(e if cond) {}");
    Assert.assertTrue(errorReporter.hasError("Catch clauses are not supported"));
  }

  @Test
  public void processConditionalExpression_givenTernary_shouldCreateHookNode() {
    AstRoot root = new AstRoot();
    ConditionalExpression cond = new ConditionalExpression();
    cond.setTestExpression(new Name(0, "a"));
    cond.setTrueExpression(new Name(0, "b"));
    cond.setFalseExpression(new Name(0, "c"));
    root.addChildToBack(new ExpressionStatement(cond));

    Node result = transform(root, "a ? b : c;");
    Node expr = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.HOOK, expr.getType());
    Assert.assertEquals(3, expr.getChildCount());
  }

  @Test
  public void processDoLoop_givenDoLoop_shouldCreateDoNode() {
    AstRoot root = new AstRoot();
    DoLoop loop = new DoLoop();
    loop.setBody(new Block());
    loop.setCondition(new Name(0, "cond"));
    root.addChildToBack(loop);

    Node result = transform(root, "do {} while(cond);");
    Node doNode = result.getFirstChild();
    Assert.assertEquals(Token.DO, doNode.getType());
    Assert.assertEquals(Token.BLOCK, doNode.getFirstChild().getType());
  }

  @Test
  public void processElementGet_givenElementAccess_shouldCreateGetElemNode() {
    AstRoot root = new AstRoot();
    ElementGet elemGet = new ElementGet(new Name(0, "arr"), new NumberLiteral(0.0));
    root.addChildToBack(new ExpressionStatement(elemGet));

    Node result = transform(root, "arr[0];");
    Node getElemNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.GETELEM, getElemNode.getType());
  }

  @Test
  public void processEmptyExpressionAndStatement_givenEmptyNodes_shouldCreateEmptyNode() {
    AstRoot root = new AstRoot();
    root.addChildToBack(new EmptyStatement());
    root.addChildToBack(new ExpressionStatement(new EmptyExpression()));

    Node result = transform(root, ";;");
    Assert.assertEquals(Token.EMPTY, result.getFirstChild().getType());
  }

  @Test
  public void processForInLoop_givenStandardForIn_shouldCreateForNode() {
    AstRoot root = new AstRoot();
    ForInLoop loop = new ForInLoop();
    loop.setIterator(new Name(0, "p"));
    loop.setIteratedObject(new Name(0, "obj"));
    loop.setBody(new Block());
    root.addChildToBack(loop);

    Node result = transform(root, "for (p in obj) {}");
    Node forNode = result.getFirstChild();
    Assert.assertEquals(Token.FOR, forNode.getType());
    Assert.assertEquals(4, forNode.getChildCount());
  }

  @Test
  public void processForInLoop_givenForEach_shouldReportError() {
    AstRoot root = new AstRoot();
    ForInLoop loop = new ForInLoop();
    loop.setIsForEach(true);
    loop.setIterator(new Name(0, "p"));
    loop.setIteratedObject(new Name(0, "obj"));
    loop.setBody(new Block());
    root.addChildToBack(loop);

    Node result = transform(root, "for each (p in obj) {}");
    Assert.assertTrue(errorReporter.hasError("unsupported language extension: for each"));
    Assert.assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
  }

  @Test
  public void processForLoop_givenStandardForLoop_shouldCreateForNode() {
    AstRoot root = new AstRoot();
    ForLoop loop = new ForLoop();
    loop.setInitializer(new EmptyExpression());
    loop.setCondition(new EmptyExpression());
    loop.setIncrement(new EmptyExpression());
    loop.setBody(new Block());
    root.addChildToBack(loop);

    Node result = transform(root, "for (;;) {}");
    Node forNode = result.getFirstChild();
    Assert.assertEquals(Token.FOR, forNode.getType());
    Assert.assertEquals(4, forNode.getChildCount());
  }

  @Test
  public void processFunctionCall_givenCall_shouldCreateCallNode() {
    AstRoot root = new AstRoot();
    FunctionCall call = new FunctionCall();
    call.setTarget(new Name(0, "foo"));
    call.addArgument(new NumberLiteral(1.0));
    root.addChildToBack(new ExpressionStatement(call));

    Node result = transform(root, "foo(1);");
    Node callNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.CALL, callNode.getType());
    Assert.assertEquals(2, callNode.getChildCount());
  }

  @Test
  public void processNewExpression_givenNewExpression_shouldCreateNewNode() {
    AstRoot root = new AstRoot();
    NewExpression newExpr = new NewExpression();
    newExpr.setTarget(new Name(0, "Foo"));
    newExpr.addArgument(new NumberLiteral(1.0));
    root.addChildToBack(new ExpressionStatement(newExpr));

    Node result = transform(root, "new Foo(1);");
    Node newNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NEW, newNode.getType());
  }

  @Test
  public void processFunctionNode_givenNamedFunction_shouldCreateFunctionNode() {
    AstRoot root = new AstRoot();
    FunctionNode fn = new FunctionNode();
    fn.setFunctionName(new Name(0, "myFunc"));
    fn.addParam(new Name(0, "arg1"));
    fn.setBody(new Block());
    root.addChildToBack(fn);

    Node result = transform(root, "function myFunc(arg1) {}");
    Node fnNode = result.getFirstChild();
    Assert.assertEquals(Token.FUNCTION, fnNode.getType());
    Node nameNode = fnNode.getFirstChild();
    Assert.assertEquals("myFunc", nameNode.getString());
    Node paramList = nameNode.getNext();
    Assert.assertEquals(Token.PARAM_LIST, paramList.getType());
    Assert.assertEquals(1, paramList.getChildCount());
  }

  @Test
  public void processFunctionNode_givenUnnamedFunctionStatement_shouldReportError() {
    AstRoot root = new AstRoot();
    FunctionNode fn = new FunctionNode();
    fn.setFunctionType(FunctionNode.FUNCTION_STATEMENT);
    fn.setBody(new Block());
    root.addChildToBack(fn);

    Node result = transform(root, "function() {}");
    Assert.assertTrue(errorReporter.hasError("unnamed function statement"));
    Assert.assertEquals(Token.EXPR_RESULT, result.getFirstChild().getType());
  }

  @Test
  public void processFunctionNode_givenUnnamedFunctionExpression_shouldCreateEmptyNamedFunction() {
    AstRoot root = new AstRoot();
    FunctionNode fn = new FunctionNode();
    fn.setFunctionType(FunctionNode.FUNCTION_EXPRESSION);
    fn.setBody(new Block());
    root.addChildToBack(new ExpressionStatement(fn));

    Node result = transform(root, "(function() {});");
    Node fnNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.FUNCTION, fnNode.getType());
    Assert.assertEquals("", fnNode.getFirstChild().getString());
  }

  @Test
  public void processIfStatement_givenIfWithAndWithoutElse_shouldCreateIfNode() {
    AstRoot root = new AstRoot();
    IfStatement if1 = new IfStatement();
    if1.setCondition(new Name(0, "cond"));
    if1.setThenPart(new EmptyStatement());

    IfStatement if2 = new IfStatement();
    if2.setCondition(new Name(0, "cond"));
    if2.setThenPart(new EmptyStatement());
    if2.setElsePart(new EmptyStatement());

    root.addChildToBack(if1);
    root.addChildToBack(if2);

    Node result = transform(root, "if(cond); if(cond); else;");
    Node node1 = result.getFirstChild();
    Assert.assertEquals(Token.IF, node1.getType());
    Assert.assertEquals(2, node1.getChildCount());

    Node node2 = node1.getNext();
    Assert.assertEquals(Token.IF, node2.getType());
    Assert.assertEquals(3, node2.getChildCount());
  }

  @Test
  public void processKeywordLiteral_givenVariousKeywords_shouldTransformToTokens() {
    AstRoot root = new AstRoot();
    KeywordLiteral litThis = new KeywordLiteral();
    litThis.setType(com.google.javascript.rhino.head.Token.THIS);
    KeywordLiteral litNull = new KeywordLiteral();
    litNull.setType(com.google.javascript.rhino.head.Token.NULL);
    KeywordLiteral litTrue = new KeywordLiteral();
    litTrue.setType(com.google.javascript.rhino.head.Token.TRUE);
    KeywordLiteral litFalse = new KeywordLiteral();
    litFalse.setType(com.google.javascript.rhino.head.Token.FALSE);

    root.addChildToBack(new ExpressionStatement(litThis));
    root.addChildToBack(new ExpressionStatement(litNull));
    root.addChildToBack(new ExpressionStatement(litTrue));
    root.addChildToBack(new ExpressionStatement(litFalse));

    Node result = transform(root, "this; null; true; false;");
    Node n = result.getFirstChild();
    Assert.assertEquals(Token.THIS, n.getFirstChild().getType());
    n = n.getNext();
    Assert.assertEquals(Token.NULL, n.getFirstChild().getType());
    n = n.getNext();
    Assert.assertEquals(Token.TRUE, n.getFirstChild().getType());
    n = n.getNext();
    Assert.assertEquals(Token.FALSE, n.getFirstChild().getType());
  }

  @Test
  public void processLabeledStatement_givenLabels_shouldNestLabelNodes() {
    AstRoot root = new AstRoot();
    LabeledStatement labeled = new LabeledStatement();
    Label l1 = new Label(0, 4, "lbl1");
    labeled.addLabel(l1);
    labeled.setStatement(new EmptyStatement());
    root.addChildToBack(labeled);

    Node result = transform(root, "lbl1: ;");
    Node lblNode = result.getFirstChild();
    Assert.assertEquals(Token.LABEL, lblNode.getType());
    Assert.assertEquals(Token.LABEL_NAME, lblNode.getFirstChild().getType());
    Assert.assertEquals("lbl1", lblNode.getFirstChild().getString());
  }

  @Test
  public void processName_givenReservedKeywordsInEs5Strict_shouldReportError() {
    AstRoot root = new AstRoot();
    Name name = new Name(0, "let");
    root.addChildToBack(new ExpressionStatement(name));

    transform(root, "let;", es5StrictConfig);
    Assert.assertTrue(errorReporter.hasError("identifier is a reserved word"));
  }

  @Test
  public void processName_givenReservedKeywordInEs3_shouldReportError() {
    AstRoot root = new AstRoot();
    Name name = new Name(0, "while");
    root.addChildToBack(new ExpressionStatement(name));

    transform(root, "while;", es3Config);
    Assert.assertTrue(errorReporter.hasError("identifier is a reserved word"));
  }

  @Test
  public void processObjectLiteral_givenStandardElements_shouldCreateObjectlitNode() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    ObjectProperty prop = new ObjectProperty();
    prop.setLeft(new Name(0, "key"));
    prop.setRight(new NumberLiteral(123.0));
    obj.addElement(prop);
    root.addChildToBack(new ExpressionStatement(obj));

    Node result = transform(root, "({key: 123});");
    Node objNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.OBJECTLIT, objNode.getType());
    Node keyNode = objNode.getFirstChild();
    Assert.assertEquals(Token.STRING_KEY, keyNode.getType());
    Assert.assertEquals("key", keyNode.getString());
  }

  @Test
  public void processObjectLiteral_givenGetterSetterInEs3_shouldReportError() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    ObjectProperty getter = new ObjectProperty();
    getter.setType(com.google.javascript.rhino.head.Token.GET);
    getter.setLeft(new Name(0, "g"));
    getter.setRight(new FunctionNode());
    obj.addElement(getter);

    ObjectProperty setter = new ObjectProperty();
    setter.setType(com.google.javascript.rhino.head.Token.SET);
    setter.setLeft(new Name(0, "s"));
    setter.setRight(new FunctionNode());
    obj.addElement(setter);

    root.addChildToBack(new ExpressionStatement(obj));
    transform(root, "({get g(){}, set s(v){}});", es3Config);

    Assert.assertTrue(errorReporter.hasError(IRFactory.GETTER_ERROR_MESSAGE));
    Assert.assertTrue(errorReporter.hasError(IRFactory.SETTER_ERROR_MESSAGE));
  }

  @Test
  public void processObjectLiteral_givenInvalidGetterParam_shouldReportError() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    ObjectProperty getter = new ObjectProperty();
    getter.setType(com.google.javascript.rhino.head.Token.GET);
    getter.setLeft(new Name(0, "g"));
    FunctionNode fn = new FunctionNode();
    fn.addParam(new Name(0, "arg"));
    fn.setBody(new Block());
    getter.setRight(fn);
    obj.addElement(getter);
    root.addChildToBack(new ExpressionStatement(obj));

    transform(root, "({get g(arg){}});", es5Config);
    Assert.assertTrue(errorReporter.hasError("getters may not have parameters"));
  }

  @Test
  public void processObjectLiteral_givenInvalidSetterParam_shouldReportError() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    ObjectProperty setter = new ObjectProperty();
    setter.setType(com.google.javascript.rhino.head.Token.SET);
    setter.setLeft(new Name(0, "s"));
    FunctionNode fn = new FunctionNode();
    fn.setBody(new Block());
    setter.setRight(fn);
    obj.addElement(setter);
    root.addChildToBack(new ExpressionStatement(obj));

    transform(root, "({set s(){}});", es5Config);
    Assert.assertTrue(errorReporter.hasError("setters must have exactly one parameter"));
  }

  @Test
  public void processObjectLiteral_givenDestructuring_shouldReportError() {
    AstRoot root = new AstRoot();
    ObjectLiteral obj = new ObjectLiteral();
    obj.setIsDestructuring(true);
    root.addChildToBack(new ExpressionStatement(obj));

    transform(root, "({});", es5Config);
    Assert.assertTrue(errorReporter.hasError("destructuring assignment forbidden"));
  }

  @Test
  public void processPropertyGet_givenValidAndInvalidEs3Identifier_shouldHandleCorrectly() {
    AstRoot root = new AstRoot();
    PropertyGet pg1 = new PropertyGet(new Name(0, "obj"), new Name(4, "prop"));
    PropertyGet pg2 = new PropertyGet(new Name(10, "obj"), new Name(14, "class"));
    root.addChildToBack(new ExpressionStatement(pg1));
    root.addChildToBack(new ExpressionStatement(pg2));

    Node result = transform(root, "obj.prop;\nobj.class;", es3Config);
    Node expr1 = result.getFirstChild();
    Assert.assertEquals(Token.GETPROP, expr1.getFirstChild().getType());
    Assert.assertTrue(errorReporter.hasWarning(IRFactory.INVALID_ES3_PROP_NAME));
  }

  @Test
  public void processRegExpLiteral_givenRegExpWithAndWithoutFlags_shouldCreateRegexpNode() {
    AstRoot root = new AstRoot();
    RegExpLiteral re1 = new RegExpLiteral();
    re1.setValue("abc");
    RegExpLiteral re2 = new RegExpLiteral();
    re2.setValue("xyz");
    re2.setFlags("gi");
    root.addChildToBack(new ExpressionStatement(re1));
    root.addChildToBack(new ExpressionStatement(re2));

    Node result = transform(root, "/abc/;\n/xyz/gi;");
    Node r1 = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.REGEXP, r1.getType());
    Assert.assertEquals(1, r1.getChildCount());

    Node r2 = result.getFirstChild().getNext().getFirstChild();
    Assert.assertEquals(Token.REGEXP, r2.getType());
    Assert.assertEquals(2, r2.getChildCount());
  }

  @Test
  public void processReturnStatement_givenReturnWithAndWithoutValue_shouldCreateReturnNode() {
    AstRoot root = new AstRoot();
    ReturnStatement ret1 = new ReturnStatement();
    ReturnStatement ret2 = new ReturnStatement();
    ret2.setReturnValue(new NumberLiteral(10.0));
    root.addChildToBack(ret1);
    root.addChildToBack(ret2);

    Node result = transform(root, "return;\nreturn 10;");
    Node r1 = result.getFirstChild();
    Assert.assertEquals(Token.RETURN, r1.getType());
    Assert.assertEquals(0, r1.getChildCount());

    Node r2 = r1.getNext();
    Assert.assertEquals(Token.RETURN, r2.getType());
    Assert.assertEquals(1, r2.getChildCount());
  }

  @Test
  public void processScope_givenScope_shouldCreateBlockNode() {
    AstRoot root = new AstRoot();
    Scope scope = new Scope();
    scope.addChildToBack(new EmptyStatement());
    root.addChildToBack(scope);

    Node result = transform(root, "{}");
    Node scopeNode = result.getFirstChild();
    Assert.assertEquals(Token.BLOCK, scopeNode.getType());
  }

  @Test
  public void processStringLiteral_givenVerticalTabEscape_shouldSetSlashVProp() {
    AstRoot root = new AstRoot();
    StringLiteral str = new StringLiteral();
    str.setValue("\u000B");
    str.setLength(4);
    str.setAbsolutePosition(0);
    root.addChildToBack(new ExpressionStatement(str));

    String source = "\"\\v\"";
    Node result = transform(root, source);
    Node strNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Boolean.TRUE, strNode.getProp(Node.SLASH_V));
  }

  @Test
  public void processSwitchStatement_givenSwitchWithCasesAndDefault_shouldCreateSwitchNode() {
    AstRoot root = new AstRoot();
    SwitchStatement switchStmt = new SwitchStatement();
    switchStmt.setExpression(new Name(0, "val"));

    SwitchCase sc1 = new SwitchCase();
    sc1.setExpression(new NumberLiteral(1.0));
    sc1.addStatement(new EmptyStatement());

    SwitchCase scDefault = new SwitchCase();
    scDefault.addStatement(new EmptyStatement());

    switchStmt.addCase(sc1);
    switchStmt.addCase(scDefault);
    root.addChildToBack(switchStmt);

    Node result = transform(root, "switch(val) { case 1: ; default: ; }");
    Node switchNode = result.getFirstChild();
    Assert.assertEquals(Token.SWITCH, switchNode.getType());
    Node case1 = switchNode.getFirstChild().getNext();
    Assert.assertEquals(Token.CASE, case1.getType());
    Node defaultCase = case1.getNext();
    Assert.assertEquals(Token.DEFAULT_CASE, defaultCase.getType());
  }

  @Test
  public void processThrowStatement_givenThrow_shouldCreateThrowNode() {
    AstRoot root = new AstRoot();
    ThrowStatement throwStmt = new ThrowStatement();
    throwStmt.setExpression(new Name(0, "e"));
    root.addChildToBack(throwStmt);

    Node result = transform(root, "throw e;");
    Node throwNode = result.getFirstChild();
    Assert.assertEquals(Token.THROW, throwNode.getType());
  }

  @Test
  public void processTryStatement_givenTryCatchFinally_shouldCreateCompleteTryNode() {
    AstRoot root = new AstRoot();
    TryStatement tryStmt = new TryStatement();
    tryStmt.setTryBlock(new Block());

    CatchClause catchClause = new CatchClause();
    catchClause.setVarName(new Name(0, "err"));
    catchClause.setBody(new Block());
    tryStmt.addCatchClause(catchClause);

    Block finallyBlock = new Block();
    tryStmt.setFinallyBlock(finallyBlock);
    root.addChildToBack(tryStmt);

    Node result = transform(root, "try {} catch(err) {} finally {}");
    Node tryNode = result.getFirstChild();
    Assert.assertEquals(Token.TRY, tryNode.getType());
    Assert.assertEquals(3, tryNode.getChildCount());
  }

  @Test
  public void processUnaryExpression_givenNegNumber_shouldFoldConstant() {
    AstRoot root = new AstRoot();
    UnaryExpression unary = new UnaryExpression(
        com.google.javascript.rhino.head.Token.NEG, 0, new NumberLiteral(5.0), false);
    root.addChildToBack(new ExpressionStatement(unary));

    Node result = transform(root, "-5;");
    Node expr = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NUMBER, expr.getType());
    Assert.assertEquals(-5.0, expr.getDouble(), 0.0001);
  }

  @Test
  public void processUnaryExpression_givenInvalidDeleteTarget_shouldReportError() {
    AstRoot root = new AstRoot();
    UnaryExpression unary = new UnaryExpression(
        com.google.javascript.rhino.head.Token.DELPROP, 0, new NumberLiteral(5.0), false);
    root.addChildToBack(new ExpressionStatement(unary));

    transform(root, "delete 5;");
    Assert.assertTrue(errorReporter.hasError("Invalid delete operand. Only properties can be deleted."));
  }

  @Test
  public void processUnaryExpression_givenInvalidIncrementTarget_shouldReportError() {
    AstRoot root = new AstRoot();
    UnaryExpression unary = new UnaryExpression(
        com.google.javascript.rhino.head.Token.INC, 0, new NumberLiteral(5.0), false);
    root.addChildToBack(new ExpressionStatement(unary));

    transform(root, "++5;");
    Assert.assertTrue(errorReporter.hasError("invalid increment target"));
  }

  @Test
  public void processUnaryExpression_givenInvalidDecrementTarget_shouldReportError() {
    AstRoot root = new AstRoot();
    UnaryExpression unary = new UnaryExpression(
        com.google.javascript.rhino.head.Token.DEC, 0, new NumberLiteral(5.0), false);
    root.addChildToBack(new ExpressionStatement(unary));

    transform(root, "--5;");
    Assert.assertTrue(errorReporter.hasError("invalid decrement target"));
  }

  @Test
  public void processUnaryExpression_givenPostfixInc_shouldSetIncrDecrProp() {
    AstRoot root = new AstRoot();
    UnaryExpression unary = new UnaryExpression(
        com.google.javascript.rhino.head.Token.INC, 0, new Name(0, "x"), true);
    root.addChildToBack(new ExpressionStatement(unary));

    Node result = transform(root, "x++;");
    Node incNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.INC, incNode.getType());
    Assert.assertEquals(Boolean.TRUE, incNode.getProp(Node.INCRDECR_PROP));
  }

  @Test
  public void processVariableDeclaration_givenConstWhenDisallowed_shouldReportError() {
    AstRoot root = new AstRoot();
    VariableDeclaration decl = new VariableDeclaration();
    decl.setType(com.google.javascript.rhino.head.Token.CONST);
    VariableInitializer init = new VariableInitializer();
    init.setTarget(new Name(0, "x"));
    decl.addVariable(init);
    root.addChildToBack(decl);

    transform(root, "const x;", es5Config);
    Assert.assertTrue(errorReporter.hasError("Unsupported syntax: CONST"));
  }

  @Test
  public void processVariableDeclaration_givenConstWhenAllowed_shouldCreateVarNode() {
    AstRoot root = new AstRoot();
    VariableDeclaration decl = new VariableDeclaration();
    decl.setType(com.google.javascript.rhino.head.Token.CONST);
    VariableInitializer init = new VariableInitializer();
    init.setTarget(new Name(0, "x"));
    decl.addVariable(init);
    root.addChildToBack(decl);

    Node result = transform(root, "const x;", ideConfig);
    Assert.assertEquals(Token.VAR, result.getFirstChild().getType());
  }

  @Test
  public void processWhileLoop_givenWhileLoop_shouldCreateWhileNode() {
    AstRoot root = new AstRoot();
    WhileLoop loop = new WhileLoop();
    loop.setCondition(new Name(0, "cond"));
    loop.setBody(new Block());
    root.addChildToBack(loop);

    Node result = transform(root, "while(cond) {}");
    Node whileNode = result.getFirstChild();
    Assert.assertEquals(Token.WHILE, whileNode.getType());
  }

  @Test
  public void processWithStatement_givenWithStatement_shouldCreateWithNode() {
    AstRoot root = new AstRoot();
    WithStatement withStmt = new WithStatement();
    withStmt.setExpression(new Name(0, "obj"));
    withStmt.setStatement(new Block());
    root.addChildToBack(withStmt);

    Node result = transform(root, "with(obj) {}");
    Node withNode = result.getFirstChild();
    Assert.assertEquals(Token.WITH, withNode.getType());
  }

  @Test
  public void processParenthesizedExpression_givenParenthesized_shouldUnwrap() {
    AstRoot root = new AstRoot();
    ParenthesizedExpression paren = new ParenthesizedExpression(new Name(0, "foo"));
    root.addChildToBack(new ExpressionStatement(paren));

    Node result = transform(root, "(foo);");
    Node nameNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.NAME, nameNode.getType());
    Assert.assertEquals("foo", nameNode.getString());
  }

  @Test
  public void maybeInjectCastNode_givenTypeAnnotationOnParentheses_shouldInjectCast() {
    AstRoot root = new AstRoot();
    ParenthesizedExpression paren = new ParenthesizedExpression(new Name(0, "x"));
    Comment jsdoc = new Comment(0, 18, CommentType.JSDOC, "/** @type {string} */");
    paren.setJsDocNode(jsdoc);
    root.addChildToBack(new ExpressionStatement(paren));

    Node result = transform(root, "/** @type {string} */ (x);");
    Node castNode = result.getFirstChild().getFirstChild();
    Assert.assertEquals(Token.CAST, castNode.getType());
  }

  @Test
  public void validateTypeAnnotations_givenMisplacedAnnotation_shouldReportWarning() {
    AstRoot root = new AstRoot();
    EmptyStatement empty = new EmptyStatement();
    Comment jsdoc = new Comment(0, 18, CommentType.JSDOC, "/** @type {string} */");
    empty.setJsDocNode(jsdoc);
    root.addChildToBack(empty);

    transform(root, "/** @type {string} */ ;");
    Assert.assertTrue(errorReporter.hasWarning(IRFactory.MISPLACED_TYPE_ANNOTATION));
  }

  @Test
  public void setFileOverviewJsDoc_givenLicenseAndOverview_shouldPreserveLicense() {
    AstRoot root = new AstRoot();
    Comment fileOverviewComment = new Comment(0, 30, CommentType.JSDOC, "/** @fileoverview Test overview */");
    Comment licenseComment = new Comment(31, 30, CommentType.JSDOC, "/** @license MIT License */");
    root.addComment(fileOverviewComment);
    root.addComment(licenseComment);

    Node result = transform(root, "/** @fileoverview Test overview */\n/** @license MIT License */");
    Assert.assertNotNull(result.getJSDocInfo());
  }

  @Test(expected = IllegalStateException.class)
  public void transformTokenType_givenUnknownToken_shouldThrowIllegalStateException() {
    AstRoot root = new AstRoot();
    AstNode unknown = new AstNode() {
      @Override
      public String toSource(int depth) {
        return "";
      }
    };
    unknown.setType(-9999);
    root.addChildToBack(unknown);
    transform(root, "");
  }
}