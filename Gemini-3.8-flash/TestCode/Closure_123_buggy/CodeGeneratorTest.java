package com.google.javascript.jscomp;

import com.google.common.base.Charsets;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CodeGeneratorTest {

  private TestCodeConsumer consumer;
  private CodeGenerator generator;

  private static class TestCodeConsumer extends CodeConsumer {
    final StringBuilder buffer = new StringBuilder();
    boolean continueProcessing = true;
    boolean preserveExtraBlocks = false;
    char lastChar = '\0';

    @Override
    boolean continueProcessing() {
      return continueProcessing;
    }

    @Override
    char getLastChar() {
      return lastChar;
    }

    @Override
    void append(String newcode) {
      buffer.append(newcode);
      if (newcode.length() > 0) {
        lastChar = newcode.charAt(newcode.length() - 1);
      }
    }

    @Override
    void add(String newcode) {
      append(newcode);
    }

    @Override
    void addIdentifier(String identifier) {
      append(identifier);
    }

    @Override
    void addOp(String op, boolean binOp) {
      append(op);
    }

    @Override
    void addNumber(double x) {
      if (x == (long) x) {
        append(String.valueOf((long) x));
      } else {
        append(String.valueOf(x));
      }
    }

    @Override
    void addConstant(String newcode) {
      append(newcode);
    }

    @Override
    void endStatement(boolean needSemi) {
      if (needSemi) {
        append(";");
      }
    }

    @Override
    void endStatement() {
      append(";");
    }

    @Override
    void beginBlock() {
      append("{");
    }

    @Override
    void endBlock(boolean needSemi) {
      append("}");
      if (needSemi) {
        append(";");
      }
    }

    @Override
    void listSeparator() {
      append(",");
    }

    @Override
    void beginCaseBody() {
      append(":");
    }

    @Override
    void endCaseBody() {
    }

    @Override
    void startSourceMapping(Node n) {
    }

    @Override
    void endSourceMapping(Node n) {
    }

    @Override
    void endFunction(boolean statementContext) {
    }

    @Override
    void maybeLineBreak() {
    }

    @Override
    void notePreferredLineBreak() {
    }

    @Override
    boolean breakAfterBlockFor(Node n, boolean statementContext) {
      return false;
    }

    @Override
    boolean shouldPreserveExtraBlocks() {
      return preserveExtraBlocks;
    }

    String getOutput() {
      return buffer.toString();
    }

    void clear() {
      buffer.setLength(0);
      lastChar = '\0';
    }
  }

  private static class SubclassNode extends Node {
    SubclassNode(int type) {
      super(type);
    }
  }

  @Before
  public void setUp() {
    consumer = new TestCodeConsumer();
    generator = CodeGenerator.forCostEstimation(consumer);
  }

  @Test
  public void isSimpleNumber_givenEmptyString_shouldReturnFalse() {
    Assert.assertFalse(CodeGenerator.isSimpleNumber(""));
  }

  @Test
  public void isSimpleNumber_givenZero_shouldReturnTrue() {
    Assert.assertTrue(CodeGenerator.isSimpleNumber("0"));
  }

  @Test
  public void isSimpleNumber_givenValidPositiveInteger_shouldReturnTrue() {
    Assert.assertTrue(CodeGenerator.isSimpleNumber("42"));
    Assert.assertTrue(CodeGenerator.isSimpleNumber("9999"));
  }

  @Test
  public void isSimpleNumber_givenLeadingZeroMultiDigit_shouldReturnFalse() {
    Assert.assertFalse(CodeGenerator.isSimpleNumber("01"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("007"));
  }

  @Test
  public void isSimpleNumber_givenNonNumericCharacters_shouldReturnFalse() {
    Assert.assertFalse(CodeGenerator.isSimpleNumber("-1"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("12a"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("1.5"));
    Assert.assertFalse(CodeGenerator.isSimpleNumber("abc"));
  }

  @Test
  public void getSimpleNumber_givenValidNumbers_shouldReturnDoubleValue() {
    Assert.assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0001);
    Assert.assertEquals(42.0, CodeGenerator.getSimpleNumber("42"), 0.0001);
    Assert.assertEquals(1000.0, CodeGenerator.getSimpleNumber("1000"), 0.0001);
  }

  @Test
  public void getSimpleNumber_givenInvalidOrOverflow_shouldReturnNaN() {
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("01")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("abc")));
    Assert.assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("99999999999999999999999999999999999999")));
  }

  @Test
  public void identifierEscape_givenLatinString_shouldReturnSameString() {
    Assert.assertEquals("myVariable_123$", CodeGenerator.identifierEscape("myVariable_123$"));
  }

  @Test
  public void identifierEscape_givenNonLatinChars_shouldEscapeToHex() {
    String escaped = CodeGenerator.identifierEscape("var_\u00A0");
    Assert.assertEquals("var_\\u00a0", escaped);
  }

  @Test
  public void identifierEscape_givenSupplementaryChar_shouldEscapeBothSurrogates() {
    String supplementary = new String(Character.toChars(0x1F600));
    String escaped = CodeGenerator.identifierEscape(supplementary);
    Assert.assertEquals("\\ud83d\\ude00", escaped);
  }

  @Test
  public void tagAsStrict_shouldOutputUseStrictDirective() {
    generator.tagAsStrict();
    Assert.assertEquals("'use strict';", consumer.getOutput());
  }

  @Test
  public void escapeToDoubleQuotedJsString_givenPlainString_shouldWrapInDoubleQuotes() {
    String res = generator.escapeToDoubleQuotedJsString("hello");
    Assert.assertEquals("\"hello\"", res);
  }

  @Test
  public void regexpEscape_givenPattern_shouldWrapInSlashes() {
    String res = generator.regexpEscape("a/b");
    Assert.assertEquals("/a\\/b/", res);
  }

  @Test
  public void strEscape_givenSpecialCharacters_shouldEscapeCorrectly() {
    Node strNode = Node.newString("\0\b\f\n\r\t\\\"'\u2028\u2029");
    generator.add(strNode);
    Assert.assertEquals("\"\\x00\\b\\f\\n\\r\\t\\\\\\\"'\\u2028\\u2029\"", consumer.getOutput());
  }

  @Test
  public void strEscape_givenSlashVFlag_shouldOutputBackslashV() {
    Node strNode = Node.newString("\u000B");
    strNode.putBooleanProp(Node.SLASH_V, true);
    generator.add(strNode);
    Assert.assertEquals("\"\\v\"", consumer.getOutput());

    consumer.clear();
    Node strNodeNoSlashV = Node.newString("\u000B");
    generator.add(strNodeNoSlashV);
    Assert.assertEquals("\"\\x0B\"", consumer.getOutput());
  }

  @Test
  public void strEscape_givenQuotePreferenceAndCounts_shouldPickAppropriateQuote() {
    CompilerOptions options = new CompilerOptions();
    options.preferSingleQuotes = true;
    CodeGenerator singleQuoteGen = new CodeGenerator(consumer, options);

    consumer.clear();
    singleQuoteGen.add(Node.newString("a\"b'"));
    Assert.assertEquals("'a\"b\\''", consumer.getOutput());

    consumer.clear();
    singleQuoteGen.add(Node.newString("a''b\""));
    Assert.assertEquals("\"a''b\\\"\"", consumer.getOutput());

    options.preferSingleQuotes = false;
    CodeGenerator doubleQuoteGen = new CodeGenerator(consumer, options);

    consumer.clear();
    doubleQuoteGen.add(Node.newString("a\"b'"));
    Assert.assertEquals("\"a\\\"b'\"", consumer.getOutput());

    consumer.clear();
    doubleQuoteGen.add(Node.newString("a\"\"b'"));
    Assert.assertEquals("'a\"\"b\\''", consumer.getOutput());
  }

  @Test
  public void strEscape_givenUntrustedStrings_shouldEscapeDangerousHtmlTags() {
    CompilerOptions options = new CompilerOptions();
    options.trustedStrings = false;
    CodeGenerator untrustedGen = new CodeGenerator(consumer, options);

    consumer.clear();
    untrustedGen.add(Node.newString("=&><"));
    Assert.assertEquals("\"\\x3d\\x26\\x3e\\x3c\"", consumer.getOutput());
  }

  @Test
  public void strEscape_givenTrustedStrings_shouldEscapeCommentAndScriptEnd() {
    CompilerOptions options = new CompilerOptions();
    options.trustedStrings = true;
    CodeGenerator trustedGen = new CodeGenerator(consumer, options);

    consumer.clear();
    trustedGen.add(Node.newString("--> ]]>"));
    Assert.assertEquals("\"--\\x3e ]]\\x3e\"", consumer.getOutput());

    consumer.clear();
    trustedGen.add(Node.newString("<!-- </script>"));
    Assert.assertEquals("\"\\x3c!-- \\x3c/script>\"", consumer.getOutput());

    consumer.clear();
    trustedGen.add(Node.newString("> <"));
    Assert.assertEquals("\"> <\"", consumer.getOutput());
  }

  @Test
  public void strEscape_withCharsetEncoder_shouldEscapeUnencodableChars() {
    CompilerOptions options = new CompilerOptions();
    try {
      Method m = CompilerOptions.class.getMethod("setOutputCharset", Charset.class);
      m.invoke(options, Charsets.US_ASCII);
    } catch (Throwable t1) {
      try {
        Method m = CompilerOptions.class.getMethod("setOutputCharset", String.class);
        m.invoke(options, "US-ASCII");
      } catch (Throwable ignored) {
      }
    }

    CodeGenerator asciiGen = new CodeGenerator(consumer, options);
    consumer.clear();
    asciiGen.add(Node.newString("caf\u00E9"));
    Assert.assertEquals("\"caf\\u00e9\"", consumer.getOutput());
  }

  @Test
  public void add_whenContinueProcessingFalse_shouldHaltProcessing() {
    consumer.continueProcessing = false;
    generator.add(Node.newNumber(123));
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void add_numberLiteral_shouldOutputNumber() {
    generator.add(Node.newNumber(42.5));
    Assert.assertEquals("42.5", consumer.getOutput());
  }

  @Test
  public void add_nullThisTrueFalseDebuggerEmpty_shouldOutputTokens() {
    generator.add(new Node(Token.NULL));
    Assert.assertEquals("null", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.THIS));
    Assert.assertEquals("this", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.TRUE));
    Assert.assertEquals("true", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.FALSE));
    Assert.assertEquals("false", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.DEBUGGER));
    Assert.assertEquals("debugger;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.EMPTY));
    Assert.assertEquals("", consumer.getOutput());
  }

  @Test
  public void add_unaryOperators_shouldOutputOpAndExpression() {
    generator.add(new Node(Token.NOT, Node.newString(Token.NAME, "a")));
    Assert.assertEquals("!a", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.VOID, Node.newNumber(0)));
    Assert.assertEquals("void0", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.TYPEOF, Node.newString(Token.NAME, "x")));
    Assert.assertEquals("typeofx", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.BITNOT, Node.newNumber(1)));
    Assert.assertEquals("~1", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.POS, Node.newString(Token.NAME, "val")));
    Assert.assertEquals("+val", consumer.getOutput());
  }

  @Test
  public void add_negOperator_givenNumberAndNonNumber_shouldOutputCorrectly() {
    generator.add(new Node(Token.NEG, Node.newNumber(5)));
    Assert.assertEquals("-5", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.NEG, Node.newString(Token.NAME, "x")));
    Assert.assertEquals("-x", consumer.getOutput());
  }

  @Test
  public void add_incDecOperator_givenPrefixAndPostfix_shouldOutputCorrectly() {
    Node preInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    generator.add(preInc);
    Assert.assertEquals("++x", consumer.getOutput());

    consumer.clear();
    Node postInc = new Node(Token.INC, Node.newString(Token.NAME, "x"));
    postInc.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postInc);
    Assert.assertEquals("x++", consumer.getOutput());

    consumer.clear();
    Node preDec = new Node(Token.DEC, Node.newString(Token.NAME, "y"));
    generator.add(preDec);
    Assert.assertEquals("--y", consumer.getOutput());

    consumer.clear();
    Node postDec = new Node(Token.DEC, Node.newString(Token.NAME, "y"));
    postDec.putIntProp(Node.INCRDECR_PROP, 1);
    generator.add(postDec);
    Assert.assertEquals("y--", consumer.getOutput());
  }

  @Test
  public void add_delpropOperator_shouldOutputDeleteExpression() {
    generator.add(new Node(Token.DELPROP, Node.newString(Token.NAME, "prop")));
    Assert.assertEquals("delete prop", consumer.getOutput());
  }

  @Test
  public void add_binaryOperatorAssociative_shouldChainWithoutExtraParens() {
    Node addLeft = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
    Node addRoot = new Node(Token.ADD, addLeft, Node.newNumber(3));
    generator.add(addRoot);
    Assert.assertEquals("1+2+3", consumer.getOutput());
  }

  @Test
  public void add_binaryOperatorAssignment_shouldChainRightAssociative() {
    Node assignRight = new Node(Token.ASSIGN, Node.newString(Token.NAME, "b"), Node.newNumber(2));
    Node assignRoot = new Node(Token.ASSIGN, Node.newString(Token.NAME, "a"), assignRight);
    generator.add(assignRoot);
    Assert.assertEquals("a=b=2", consumer.getOutput());
  }

  @Test(expected = IllegalStateException.class)
  public void add_binaryOperator_givenWrongChildCount_shouldThrowException() {
    Node badAdd = new Node(Token.ADD, Node.newNumber(1));
    generator.add(badAdd);
  }

  @Test
  public void add_commaOperator_shouldUnrollSiblings() {
    Node commaLeft = new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2));
    Node commaRoot = new Node(Token.COMMA, commaLeft, Node.newNumber(3));
    generator.add(commaRoot);
    Assert.assertEquals("1,2,3", consumer.getOutput());
  }

  @Test
  public void add_hookOperator_shouldOutputTernary() {
    Node hook = new Node(Token.HOOK,
        Node.newString(Token.NAME, "cond"),
        Node.newNumber(1),
        Node.newNumber(2));
    generator.add(hook);
    Assert.assertEquals("cond?1:2", consumer.getOutput());
  }

  @Test
  public void add_nameNode_givenNoChildrenAndInitializedChildren_shouldOutputCorrectly() {
    generator.add(Node.newString(Token.NAME, "foo"));
    Assert.assertEquals("foo", consumer.getOutput());

    consumer.clear();
    Node nameWithInit = Node.newString(Token.NAME, "bar");
    nameWithInit.addChildToBack(Node.newNumber(10));
    generator.add(nameWithInit);
    Assert.assertEquals("bar=10", consumer.getOutput());

    consumer.clear();
    Node nameWithCommaInit = Node.newString(Token.NAME, "baz");
    nameWithCommaInit.addChildToBack(new Node(Token.COMMA, Node.newNumber(1), Node.newNumber(2)));
    generator.add(nameWithCommaInit);
    Assert.assertEquals("baz=(1,2)", consumer.getOutput());
  }

  @Test
  public void add_varStatement_shouldOutputVarDeclarations() {
    Node varNode = new Node(Token.VAR);
    Node v1 = Node.newString(Token.NAME, "x");
    v1.addChildToBack(Node.newNumber(1));
    Node v2 = Node.newString(Token.NAME, "y");
    varNode.addChildToBack(v1);
    varNode.addChildToBack(v2);

    generator.add(varNode);
    Assert.assertEquals("var x=1,y", consumer.getOutput());
  }

  @Test
  public void add_arrayLiteral_givenHolesAndElements_shouldOutputBrackets() {
    Node array = new Node(Token.ARRAYLIT);
    array.addChildToBack(Node.newNumber(1));
    array.addChildToBack(new Node(Token.EMPTY));
    array.addChildToBack(Node.newNumber(3));
    array.addChildToBack(new Node(Token.EMPTY));

    generator.add(array);
    Assert.assertEquals("[1,,3,,]", consumer.getOutput());
  }

  @Test
  public void add_paramList_shouldOutputParenthesizedList() {
    Node params = new Node(Token.PARAM_LIST);
    params.addChildToBack(Node.newString(Token.NAME, "a"));
    params.addChildToBack(Node.newString(Token.NAME, "b"));

    generator.add(params);
    Assert.assertEquals("(a,b)", consumer.getOutput());
  }

  @Test
  public void add_regexp_givenFlagsAndNoFlags_shouldOutputCorrectly() {
    Node regexNoFlags = new Node(Token.REGEXP, Node.newString("abc"));
    generator.add(regexNoFlags);
    Assert.assertEquals("/abc/", consumer.getOutput());

    consumer.clear();
    Node regexFlags = new Node(Token.REGEXP, Node.newString("abc"), Node.newString("gi"));
    generator.add(regexFlags);
    Assert.assertEquals("/abc/gi", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void add_regexp_givenNonStringChildren_shouldThrowError() {
    Node badRegex = new Node(Token.REGEXP, Node.newNumber(123));
    generator.add(badRegex);
  }

  @Test
  public void add_function_givenExpressionAndStartOfExpr_shouldWrapWhenNeeded() {
    Node fn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "foo"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK));

    generator.add(fn, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("(functionfoo(){})", consumer.getOutput());

    consumer.clear();
    generator.add(fn, CodeGenerator.Context.STATEMENT);
    Assert.assertEquals("functionfoo(){}", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void add_function_givenUnexpectedNodeSubclass_shouldThrowError() {
    Node badFn = new SubclassNode(Token.FUNCTION);
    badFn.addChildToBack(Node.newString(Token.NAME, "foo"));
    badFn.addChildToBack(new Node(Token.PARAM_LIST));
    badFn.addChildToBack(new Node(Token.BLOCK));

    generator.add(badFn);
  }

  @Test
  public void add_objectLit_givenVariousKeys_shouldOutputCorrectFormat() {
    Node obj = new Node(Token.OBJECTLIT);

    Node latinKey = Node.newString(Token.STRING_KEY, "prop");
    latinKey.addChildToBack(Node.newNumber(1));
    obj.addChildToBack(latinKey);

    Node numKey = Node.newString(Token.STRING_KEY, "123");
    numKey.addChildToBack(Node.newNumber(2));
    obj.addChildToBack(numKey);

    Node quotedKey = Node.newString(Token.STRING_KEY, "k-ey");
    quotedKey.putBooleanProp(Node.QUOTED_STRING, true);
    quotedKey.addChildToBack(Node.newNumber(3));
    obj.addChildToBack(quotedKey);

    generator.add(obj, CodeGenerator.Context.START_OF_EXPR);
    Assert.assertEquals("({prop:1,123:2,\"k-ey\":3})", consumer.getOutput());
  }

  @Test
  public void add_objectLit_getterAndSetterDef_shouldOutputGetAndSet() {
    Node obj = new Node(Token.OBJECTLIT);

    Node getFn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, ""),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK));
    Node getter = Node.newString(Token.GETTER_DEF, "x");
    getter.addChildToBack(getFn);
    obj.addChildToBack(getter);

    Node setParams = new Node(Token.PARAM_LIST);
    setParams.addChildToBack(Node.newString(Token.NAME, "v"));
    Node setFn = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, ""),
        setParams,
        new Node(Token.BLOCK));
    Node setter = Node.newString(Token.SETTER_DEF, "y");
    setter.addChildToBack(setFn);
    obj.addChildToBack(setter);

    generator.add(obj);
    Assert.assertEquals("{get x(){},set y(v){}}", consumer.getOutput());
  }

  @Test
  public void add_getprop_givenNumberFirstChild_shouldWrapInParens() {
    Node prop = new Node(Token.GETPROP, Node.newNumber(42), Node.newString("toString"));
    generator.add(prop);
    Assert.assertEquals("(42).toString", consumer.getOutput());
  }

  @Test
  public void add_getprop_givenEcmascript3Keyword_shouldUseBracketNotation() {
    CompilerOptions options = new CompilerOptions();
    options.setLanguageOut(LanguageMode.ECMASCRIPT3);
    CodeGenerator es3Gen = new CodeGenerator(consumer, options);

    Node prop = new Node(Token.GETPROP, Node.newString(Token.NAME, "obj"), Node.newString("delete"));
    es3Gen.add(prop);
    Assert.assertEquals("obj[\"delete\"]", consumer.getOutput());
  }

  @Test
  public void add_getelem_shouldOutputBracketAccess() {
    Node elem = new Node(Token.GETELEM, Node.newString(Token.NAME, "arr"), Node.newNumber(0));
    generator.add(elem);
    Assert.assertEquals("arr[0]", consumer.getOutput());
  }

  @Test
  public void add_call_givenIndirectEvalAndFreeCall_shouldOutputZeroCommaForm() {
    Node evalCall = new Node(Token.CALL, Node.newString(Token.NAME, "eval"), Node.newString("1+1"));
    generator.add(evalCall);
    Assert.assertEquals("(0,eval)(\"1+1\")", consumer.getOutput());

    consumer.clear();
    Node freeGetCall = new Node(Token.CALL,
        new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString("b")),
        Node.newNumber(1));
    freeGetCall.putBooleanProp(Node.FREE_CALL, true);
    generator.add(freeGetCall);
    Assert.assertEquals("(0,a.b)(1)", consumer.getOutput());
  }

  @Test
  public void add_newOperator_givenCallTargetAndNormalTarget_shouldOutputNew() {
    Node newCall = new Node(Token.NEW, Node.newString(Token.NAME, "Foo"));
    generator.add(newCall);
    Assert.assertEquals("new Foo", consumer.getOutput());

    consumer.clear();
    Node newWithArgs = new Node(Token.NEW, Node.newString(Token.NAME, "Bar"), Node.newNumber(1));
    generator.add(newWithArgs);
    Assert.assertEquals("new Bar(1)", consumer.getOutput());
  }

  @Test
  public void add_ifStatement_withAndWithoutElse_shouldOutputCorrectly() {
    Node ifNoElse = new Node(Token.IF,
        Node.newString(Token.NAME, "cond"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    generator.add(ifNoElse);
    Assert.assertEquals("if(cond)1;", consumer.getOutput());

    consumer.clear();
    Node ifWithElse = new Node(Token.IF,
        Node.newString(Token.NAME, "cond"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(2))));
    generator.add(ifWithElse);
    Assert.assertEquals("if(cond)1;else 2;", consumer.getOutput());

    consumer.clear();
    generator.add(ifNoElse, CodeGenerator.Context.BEFORE_DANGLING_ELSE);
    Assert.assertEquals("{if(cond)1;}", consumer.getOutput());
  }

  @Test
  public void add_loops_forWhileDoWhile_shouldOutputCorrectly() {
    Node for4 = new Node(Token.FOR,
        new Node(Token.VAR, Node.newString(Token.NAME, "i")),
        Node.newString(Token.NAME, "cond"),
        new Node(Token.INC, Node.newString(Token.NAME, "i")),
        new Node(Token.BLOCK));
    generator.add(for4);
    Assert.assertEquals("for(var i;cond;i++);", consumer.getOutput());

    consumer.clear();
    Node forIn = new Node(Token.FOR,
        Node.newString(Token.NAME, "k"),
        Node.newString(Token.NAME, "obj"),
        new Node(Token.BLOCK));
    generator.add(forIn);
    Assert.assertEquals("for(k in obj);", consumer.getOutput());

    consumer.clear();
    Node whileNode = new Node(Token.WHILE,
        Node.newString(Token.NAME, "cond"),
        new Node(Token.BLOCK));
    generator.add(whileNode);
    Assert.assertEquals("while(cond);", consumer.getOutput());

    consumer.clear();
    Node doNode = new Node(Token.DO,
        new Node(Token.BLOCK),
        Node.newString(Token.NAME, "cond"));
    generator.add(doNode);
    Assert.assertEquals("do;while(cond);", consumer.getOutput());
  }

  @Test
  public void add_tryCatchFinally_shouldOutputCorrectStructure() {
    Node tryBlock = new Node(Token.BLOCK);
    Node catchBody = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, Node.newString(Token.NAME, "e"), catchBody);
    Node catchBlockWrapper = new Node(Token.BLOCK, catchNode);
    Node finallyBlock = new Node(Token.BLOCK);

    Node tryCatch = new Node(Token.TRY, tryBlock, catchBlockWrapper);
    generator.add(tryCatch);
    Assert.assertEquals("try{}catch(e){}", consumer.getOutput());

    consumer.clear();
    Node tryCatchFinally = new Node(Token.TRY, tryBlock, catchBlockWrapper, finallyBlock);
    generator.add(tryCatchFinally);
    Assert.assertEquals("try{}catch(e){}finally{}", consumer.getOutput());
  }

  @Test
  public void add_throwReturnContinueBreak_shouldOutputStatements() {
    generator.add(new Node(Token.THROW, Node.newString(Token.NAME, "err")));
    Assert.assertEquals("throw err;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.RETURN));
    Assert.assertEquals("return;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.RETURN, Node.newNumber(42)));
    Assert.assertEquals("return 42;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.CONTINUE));
    Assert.assertEquals("continue;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.CONTINUE, Node.newString(Token.LABEL_NAME, "loop")));
    Assert.assertEquals("continue loop;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.BREAK));
    Assert.assertEquals("break;", consumer.getOutput());

    consumer.clear();
    generator.add(new Node(Token.BREAK, Node.newString(Token.LABEL_NAME, "outer")));
    Assert.assertEquals("break outer;", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void add_break_givenNonLabelNameChild_shouldThrowError() {
    generator.add(new Node(Token.BREAK, Node.newNumber(1)));
  }

  @Test
  public void add_switchCaseDefault_shouldOutputSwitchBlock() {
    Node switchNode = new Node(Token.SWITCH, Node.newString(Token.NAME, "x"));
    Node case1 = new Node(Token.CASE, Node.newNumber(1), new Node(Token.BLOCK));
    Node def = new Node(Token.DEFAULT_CASE, new Node(Token.BLOCK));
    switchNode.addChildToBack(case1);
    switchNode.addChildToBack(def);

    generator.add(switchNode);
    Assert.assertEquals("switch(x){case 1:;default:;}", consumer.getOutput());
  }

  @Test
  public void add_labelAndWith_shouldOutputCorrectSyntax() {
    Node label = new Node(Token.LABEL,
        Node.newString(Token.LABEL_NAME, "lbl"),
        new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, Node.newNumber(1))));
    generator.add(label);
    Assert.assertEquals("lbl:1;", consumer.getOutput());

    consumer.clear();
    Node withNode = new Node(Token.WITH,
        Node.newString(Token.NAME, "ctx"),
        new Node(Token.BLOCK));
    generator.add(withNode);
    Assert.assertEquals("with(ctx);", consumer.getOutput());
  }

  @Test
  public void add_cast_shouldOutputParenthesizedExpression() {
    generator.add(new Node(Token.CAST, Node.newNumber(123)));
    Assert.assertEquals("(123)", consumer.getOutput());
  }

  @Test
  public void add_block_withPreserveExtraBlocks_shouldOutputBraces() {
    consumer.preserveExtraBlocks = true;
    Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "c"), new Node(Token.BLOCK));
    generator.add(whileNode);
    Assert.assertEquals("while(c){}", consumer.getOutput());
  }

  @Test(expected = Error.class)
  public void add_unknownNodeType_shouldThrowError() {
    generator.add(new Node(Token.SHEQ));
  }
}