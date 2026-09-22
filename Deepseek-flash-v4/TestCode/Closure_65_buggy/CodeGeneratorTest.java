package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import org.junit.Before;
import org.junit.Test;

public class CodeGeneratorTest {
    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder code = new StringBuilder();
        private boolean continueProcessing = true;
        private boolean preserveExtraBlocks = false;
        private boolean preserveBlock = false;

        @Override
        void add(String str) {
            code.append(str);
        }

        @Override
        void addIdentifier(String identifier) {
            code.append(identifier);
        }

        @Override
        void addOp(String op, boolean bin) {
            code.append(op);
        }

        @Override
        void addNumber(double x) {
            code.append(x);
        }

        @Override
        void endStatement() {
            code.append(";");
        }

        @Override
        void endStatement(boolean b) {
            code.append(";");
        }

        @Override
        void startSourceMapping(Node n) {
            // no-op
        }

        @Override
        void endSourceMapping(Node n) {
            // no-op
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return preserveExtraBlocks;
        }

        @Override
        void beginBlock() {
            code.append("{");
        }

        @Override
        void endBlock() {
            code.append("}");
        }

        @Override
        void endFunction(boolean b) {
            code.append("}");
        }

        @Override
        void endCaseBody() {
            // no-op
        }

        @Override
        void endFile() {
            // no-op
        }

        @Override
        void endLine() {
            // no-op
        }

        @Override
        void endList() {
            // no-op
        }

        @Override
        void endPolyadicExpr() {
            // no-op
        }

        @Override
        void endQuote() {
            // no-op
        }

        @Override
        void endString() {
            // no-op
        }

        @Override
        void endStringNode() {
            // no-op
        }

        @Override
        void endTest() {
            // no-op
        }

        @Override
        void endVar() {
            // no-op
        }

        @Override
        void endWith() {
            // no-op
        }

        @Override
        void startBlock(boolean b) {
            code.append("{");
        }

        @Override
        void startBlock() {
            code.append("{");
        }

        @Override
        void startCaseBody() {
            // no-op
        }

        @Override
        void startFile() {
            // no-op
        }

        @Override
        void startLineMapping() {
            // no-op
        }

        @Override
        void startList() {
            // no-op
        }

        @Override
        void startQuote() {
            // no-op
        }

        @Override
        void startString() {
            // no-op
        }

        @Override
        void startStringNode() {
            // no-op
        }

        @Override
        void startTest() {
            // no-op
        }

        @Override
        void startVar() {
            // no-op
        }

        @Override
        void startWith() {
            // no-op
        }

        @Override
        void endFunction() {
            // no-op
        }

        @Override
        void addRegexp(String regexp, double flags) {
            code.append(regexp);
        }

        @Override
        void startBlock(boolean b, boolean c) {
            code.append("{");
        }

        @Override
        void startBlock(boolean b, boolean c, boolean d) {
            code.append("{");
        }

        @Override
        void addEllipsis() {
            code.append("...");
        }

        @Override
        void addNumber(double x, boolean b) {
            code.append(x);
        }

        @Override
        void addNumber(double x, boolean b, boolean c) {
            code.append(x);
        }

        @Override
        void addOp(String op) {
            code.append(op);
        }

        @Override
        void addString(String str) {
            code.append(str);
        }

        @Override
        void addVar() {
            code.append("var ");
        }

        @Override
        void beginNode() {
            // no-op
        }

        @Override
        void endNode() {
            // no-op
        }

        @Override
        void addGoto() {
            // no-op
        }

        @Override
        void addLabel() {
            code.append(":");
        }

        @Override
        void addName(String name) {
            code.append(name);
        }

        @Override
        void addNumber(double value, boolean isNegative) {
            code.append(value);
        }

        @Override
        void addObject() {
            // no-op
        }

        @Override
        void addObjectStart() {
            code.append("{");
        }

        @Override
        void addObjectEnd() {
            code.append("}");
        }

        @Override
        void addProp(String prop) {
            code.append(prop);
        }

        @Override
        void addPropList() {
            // no-op
        }

        @Override
        void addPropListStart() {
            // no-op
        }

        @Override
        void addPropListEnd() {
            // no-op
        }

        @Override
        void addRegexp(String regexp) {
            code.append(regexp);
        }

        @Override
        void addSpecial() {
            // no-op
        }

        @Override
        void addString(String str, boolean b) {
            code.append(str);
        }

        @Override
        void addTest() {
            // no-op
        }

        @Override
        void addVarDecl() {
            code.append("var ");
        }

        @Override
        void addVarDecl(String name) {
            code.append("var ").append(name);
        }

        @Override
        void addVarDecl(String name, Node value) {
            code.append("var ").append(name);
        }

        @Override
        void addVarDeclList() {
            // no-op
        }

        @Override
        void addVarDeclList(String name) {
            code.append(name);
        }

        @Override
        void addVarDeclList(String name, Node value) {
            code.append(name);
        }

        @Override
        void addVarDeclListStart() {
            code.append("var ");
        }

        @Override
        void addVarDeclListEnd() {
            // no-op
        }

        @Override
        void addVariable() {
            // no-op
        }

        @Override
        void addVariable(String name) {
            code.append(name);
        }

        @Override
        void addVariable(String name, Node value) {
            code.append(name);
        }

        @Override
        void addVariableDecl() {
            code.append("var ");
        }

        @Override
        void addVariableDecl(String name) {
            code.append("var ").append(name);
        }

        @Override
        void addVariableDecl(String name, Node value) {
            code.append("var ").append(name);
        }

        @Override
        void beginFunction(Node node) {
            // no-op
        }

        @Override
        void beginFunction() {
            // no-op
        }

        @Override
        void beginFunctionParams() {
            // no-op
        }

        @Override
        void beginFunctionBody() {
            // no-op
        }

        @Override
        void beginFunctionBody(Node node) {
            // no-op
        }

        @Override
        void beginMap() {
            code.append("{");
        }

        @Override
        void endMap() {
            code.append("}");
        }

        @Override
        void addMapEntry() {
            // no-op
        }

        @Override
        void addMapEntry(String key, String value) {
            code.append(key).append(":").append(value);
        }

        @Override
        void addMapEntry(String key) {
            code.append(key);
        }

        @Override
        void beginArray() {
            code.append("[");
        }

        @Override
        void endArray() {
            code.append("]");
        }

        @Override
        void addArrayElement(String element) {
            code.append(element);
        }

        @Override
        void addArrayElement(Node element) {
            add(element);
        }

        @Override
        void addArrayElementWithTrailingComma(String element) {
            code.append(element).append(",");
        }

        @Override
        void addParameter() {
            // no-op
        }

        @Override
        void addParameter(String name) {
            code.append(name);
        }

        @Override
        void addParameter(String name, Node defaultValue) {
            code.append(name);
        }

        @Override
        void beginParameters() {
            code.append("(");
        }

        @Override
        void endParameters() {
            code.append(")");
        }

        @Override
        void beginArguments() {
            code.append("(");
        }

        @Override
        void endArguments() {
            code.append(")");
        }

        @Override
        void beginRoot() {
            // no-op
        }

        @Override
        void endRoot() {
            // no-op
        }

        @Override
        void beginObjectLiteral() {
            code.append("{");
        }

        @Override
        void endObjectLiteral() {
            code.append("}");
        }

        @Override
        void beginObjectLiteralElement() {
            // no-op
        }

        @Override
        void endObjectLiteralElement() {
            // no-op
        }

        @Override
        void beginObjectLiteralKey() {
            // no-op
        }

        @Override
        void endObjectLiteralKey() {
            // no-op
        }

        @Override
        void beginObjectLiteralValue() {
            code.append(":");
        }

        @Override
        void endObjectLiteralValue() {
            // no-op
        }

        @Override
        void beginBlock(int type) {
            code.append("{");
        }

        @Override
        void beginNode(Node node) {
            // no-op
        }

        @Override
        void endNode(Node node) {
            // no-op
        }

        @Override
        void addLabel(String label) {
            code.append(label);
        }

        @Override
        void addGoto(String label) {
            code.append(label);
        }

        @Override
        void addVar(String name, Node value) {
            code.append("var ").append(name);
        }

        @Override
        void addObject(String key, String value) {
            code.append(key).append(":").append(value);
        }

        @Override
        void addArray() {
            code.append("[]");
        }

        @Override
        void addScript() {
            // no-op
        }

        @Override
        void endScript() {
            // no-op
        }

        @Override
        void addStringLiteral(String s) {
            code.append("\"").append(s).append("\"");
        }

        @Override
        void addNull() {
            code.append("null");
        }

        @Override
        void addUndefined() {
            code.append("undefined");
        }

        @Override
        void addThis() {
            code.append("this");
        }

        @Override
        void addTrue() {
            code.append("true");
        }

        @Override
        void addFalse() {
            code.append("false");
        }

        @Override
        void addNumberLiteral(double num) {
            code.append(num);
        }

        @Override
        void addIdentifierName(String name) {
            code.append(name);
        }

        @Override
        void addMemberName(String name) {
            code.append(name);
        }

        @Override
        void addComma() {
            code.append(",");
        }

        @Override
        void addSemicolon() {
            code.append(";");
        }

        @Override
        void addColon() {
            code.append(":");
        }

        @Override
        void addQuestionMark() {
            code.append("?");
        }

        @Override
        void addDot() {
            code.append(".");
        }

        @Override
        void addOpenParen() {
            code.append("(");
        }

        @Override
        void addCloseParen() {
            code.append(")");
        }

        @Override
        void addOpenBracket() {
            code.append("[");
        }

        @Override
        void addCloseBracket() {
            code.append("]");
        }

        @Override
        void addOpenBrace() {
            code.append("{");
        }

        @Override
        void addCloseBrace() {
            code.append("}");
        }

        @Override
        void addNullLiteral() {
            code.append("null");
        }

        @Override
        void addBoolean(boolean val) {
            code.append(val);
        }

        @Override
        void addAssignmentOp(String op) {
            code.append(op);
        }

        @Override
        void addOperator(String op) {
            code.append(op);
        }

        @Override
        void addUnaryOperator(String op) {
            code.append(op);
        }

        @Override
        void addBinaryOperator(String op) {
            code.append(op);
        }

        @Override
        void addPostfixOperator(String op) {
            code.append(op);
        }

        @Override
        void addPrefixOperator(String op) {
            code.append(op);
        }

        @Override
        void addKeyword(String kw) {
            code.append(kw);
        }

        @Override
        void addToken(int type) {
            // no-op
        }

        @Override
        void addToken(int type, String value) {
            code.append(value);
        }

        @Override
        void addStringNode(Node node) {
            // no-op
        }

        @Override
        void addStringNode(String str) {
            code.append(str);
        }

        @Override
        void beginStringNode() {
            code.append("\"");
        }

        @Override
        void endStringNode(String str) {
            code.append(str).append("\"");
        }

        @Override
        void beginRegexp() {
            code.append("/");
        }

        @Override
        void endRegexp(String regexp) {
            code.append(regexp).append("/");
        }

        @Override
        void beginRegexp(String regexp) {
            code.append("/").append(regexp);
        }

        @Override
        void endRegexp() {
            code.append("/");
        }

        @Override
        void beginRegexpLiteral() {
            code.append("/");
        }

        @Override
        void endRegexpLiteral(String regexp) {
            code.append(regexp).append("/");
        }

        @Override
        void beginTemplateLiteral() {
            code.append("`");
        }

        @Override
        void endTemplateLiteral(String value) {
            code.append(value).append("`");
        }

        @Override
        void addTemplateString(String str) {
            code.append(str);
        }

        @Override
        void addTemplateSubstitution() {
            // no-op
        }

        @Override
        void addTemplateExpression(String expr) {
            code.append(expr);
        }

        @Override
        void beginTemplateHead() {
            code.append("`");
        }

        @Override
        void addTemplateHead(String str) {
            code.append(str);
        }

        @Override
        void beginTemplateMiddle() {
            // no-op
        }

        @Override
        void addTemplateMiddle(String str) {
            code.append(str);
        }

        @Override
        void beginTemplateTail() {
            // no-op
        }

        @Override
        void addTemplateTail(String str) {
            code.append(str);
        }

        @Override
        void beginTemplateString() {
            code.append("`");
        }

        @Override
        void endTemplateString() {
            code.append("`");
        }

        @Override
        void addTemplateStringLiteral(String str) {
            code.append(str);
        }

        @Override
        void beginArrayLiteral() {
            code.append("[");
        }

        @Override
        void endArrayLiteral() {
            code.append("]");
        }

        @Override
        void beginArrayElement() {
            // no-op
        }

        @Override
        void endArrayElement() {
            // no-op
        }

        @Override
        void beginObjectLiteralProperty() {
            // no-op
        }

        @Override
        void endObjectLiteralProperty() {
            // no-op
        }

        @Override
        void beginObjectLiteralProperty(String key) {
            code.append(key);
        }

        @Override
        void endObjectLiteralProperty(String key) {
            // no-op
        }

        @Override
        void beginObjectLiteralValue(String key) {
            code.append(key).append(":");
        }

        @Override
        void endObjectLiteralValue(String key) {
            // no-op
        }

        @Override
        void beginObjectLiteralElement(String key) {
            code.append(key);
        }

        @Override
        void endObjectLiteralElement(String key) {
            // no-op
        }

        @Override
        void beginObjectLiteralElement(Node key) {
            // no-op
        }

        @Override
        void endObjectLiteralElement(Node key) {
            // no-op
        }

        @Override
        void beginObjectLiteralKey(String key) {
            code.append(key);
        }

        @Override
        void endObjectLiteralKey(String key) {
            // no-op
        }

        @Override
        void beginObjectLiteralKey(Node key) {
            // no-op
        }

        @Override
        void endObjectLiteralKey(Node key) {
            // no-op
        }

        @Override
        void beginObjectLiteralValue(Node value) {
            // no-op
        }

        @Override
        void endObjectLiteralValue(Node value) {
            // no-op
        }

        @Override
        void beginFunctionCall() {
            code.append("(");
        }

        @Override
        void endFunctionCall() {
            code.append(")");
        }

        @Override
        void beginFunctionCall(Node node) {
            code.append("(");
        }

        @Override
        void endFunctionCall(Node node) {
            code.append(")");
        }

        @Override
        void beginNew() {
            code.append("new ");
        }

        @Override
        void endNew() {
            // no-op
        }

        @Override
        void beginNew(Node node) {
            code.append("new ");
        }

        @Override
        void endNew(Node node) {
            // no-op
        }

        @Override
        void beginMemberAccess() {
            code.append(".");
        }

        @Override
        void endMemberAccess() {
            // no-op
        }

        @Override
        void beginMemberAccess(Node node) {
            code.append(".");
        }

        @Override
        void endMemberAccess(Node node) {
            // no-op
        }

        @Override
        void beginGetProp() {
            code.append(".");
        }

        @Override
        void endGetProp() {
            // no-op
        }

        @Override
        void beginGetProp(Node node) {
            code.append(".");
        }

        @Override
        void endGetProp(Node node) {
            // no-op
        }

        @Override
        void beginGetElem() {
            code.append("[");
        }

        @Override
        void endGetElem() {
            code.append("]");
        }

        @Override
        void beginGetElem(Node node) {
            code.append("[");
        }

        @Override
        void endGetElem(Node node) {
            code.append("]");
        }

        @Override
        void beginCall() {
            code.append("(");
        }

        @Override
        void endCall() {
            code.append(")");
        }

        @Override
        void beginCall(Node node) {
            code.append("(");
        }

        @Override
        void endCall(Node node) {
            code.append(")");
        }

        @Override
        void beginCase() {
            code.append("case ");
        }

        @Override
        void endCase() {
            code.append(":");
        }

        @Override
        void beginCase(Node node) {
            code.append("case ");
        }

        @Override
        void endCase(Node node) {
            code.append(":");
        }

        @Override
        void beginDefaultCase() {
            code.append("default:");
        }

        @Override
        void endDefaultCase() {
            // no-op
        }

        @Override
        void beginDefaultCase(Node node) {
            code.append("default:");
        }

        @Override
        void endDefaultCase(Node node) {
            // no-op
        }

        @Override
        void beginSwitch() {
            code.append("switch(");
        }

        @Override
        void endSwitch() {
            code.append(")");
        }

        @Override
        void beginSwitch(Node node) {
            code.append("switch(");
        }

        @Override
        void endSwitch(Node node) {
            code.append(")");
        }

        @Override
        void beginLabel() {
            // no-op
        }

        @Override
        void endLabel() {
            code.append(":");
        }

        @Override
        void beginLabel(String label) {
            code.append(label);
        }

        @Override
        void endLabel(String label) {
            code.append(":");
        }

        @Override
        void beginLabel(Node node) {
            // no-op
        }

        @Override
        void endLabel(Node node) {
            code.append(":");
        }

        @Override
        void beginBlockComment() {
            code.append("/*");
        }

        @Override
        void endBlockComment() {
            code.append("*/");
        }

        @Override
        void beginLineComment() {
            code.append("//");
        }

        @Override
        void endLineComment() {
            code.append("\n");
        }

        @Override
        void beginComment() {
            // no-op
        }

        @Override
        void endComment() {
            // no-op
        }

        @Override
        void beginComment(Node node) {
            // no-op
        }

        @Override
        void endComment(Node node) {
            // no-op
        }

        @Override
        void addComment(String comment) {
            code.append(comment);
        }

        @Override
        void beginDocComment() {
            code.append("/**");
        }

        @Override
        void endDocComment() {
            code.append("*/");
        }

        @Override
        void beginDocComment(Node node) {
            code.append("/**");
        }

        @Override
        void endDocComment(Node node) {
            code.append("*/");
        }

        @Override
        void addDocComment(String comment) {
            code.append(comment);
        }

        @Override
        void beginStringLiteral() {
            code.append("\"");
        }

        @Override
        void endStringLiteral() {
            code.append("\"");
        }

        @Override
        void beginStringLiteral(String str) {
            code.append("\"").append(str);
        }

        @Override
        void endStringLiteral(String str) {
            code.append(str).append("\"");
        }

        @Override
        void beginNumberLiteral() {
            // no-op
        }

        @Override
        void endNumberLiteral() {
            // no-op
        }

        @Override
        void beginNumberLiteral(double num) {
            code.append(num);
        }

        @Override
        void endNumberLiteral(double num) {
            code.append(num);
        }

        @Override
        void beginBooleanLiteral() {
            // no-op
        }

        @Override
        void endBooleanLiteral() {
            // no-op
        }

        @Override
        void beginBooleanLiteral(boolean val) {
            code.append(val);
        }

        @Override
        void endBooleanLiteral(boolean val) {
            code.append(val);
        }

        @Override
        void beginNullLiteral() {
            code.append("null");
        }

        @Override
        void endNullLiteral() {
            // no-op
        }

        @Override
        void beginThisLiteral() {
            code.append("this");
        }

        @Override
        void endThisLiteral() {
            // no-op
        }

        @Override
        void beginIdentifierLiteral(String name) {
            code.append(name);
        }

        @Override
        void endIdentifierLiteral(String name) {
            // no-op
        }

        @Override
        void beginRegExpLiteral() {
            code.append("/");
        }

        @Override
        void endRegExpLiteral() {
            code.append("/");
        }

        @Override
        void beginRegExpLiteral(String regexp) {
            code.append("/").append(regexp);
        }

        @Override
        void endRegExpLiteral(String regexp) {
            code.append(regexp).append("/");
        }

        @Override
        void beginArrayLiteral(Node node) {
            code.append("[");
        }

        @Override
        void endArrayLiteral(Node node) {
            code.append("]");
        }

        @Override
        void beginObjectLiteral(Node node) {
            code.append("{");
        }

        @Override
        void endObjectLiteral(Node node) {
            code.append("}");
        }

        @Override
        void beginFunctionCall(Node node, int type) {
            code.append("(");
        }

        @Override
        void endFunctionCall(Node node, int type) {
            code.append(")");
        }

        @Override
        void beginMemberAccess(Node node, int type) {
            code.append(".");
        }

        @Override
        void endMemberAccess(Node node, int type) {
            // no-op
        }

        @Override
        void beginGetProp(Node node, int type) {
            code.append(".");
        }

        @Override
        void endGetProp(Node node, int type) {
            // no-op
        }

        @Override
        void beginGetElem(Node node, int type) {
            code.append("[");
        }

        @Override
        void endGetElem(Node node, int type) {
            code.append("]");
        }

        @Override
        void beginCall(Node node, int type) {
            code.append("(");
        }

        @Override
        void endCall(Node node, int type) {
            code.append(")");
        }

        @Override
        void beginNew(Node node, int type) {
            code.append("new ");
        }

        @Override
        void endNew(Node node, int type) {
            // no-op
        }

        @Override
        void beginCase(Node node, int type) {
            code.append("case ");
        }

        @Override
        void endCase(Node node, int type) {
            code.append(":");
        }

        @Override
        void beginDefaultCase(Node node, int type) {
            code.append("default:");
        }

        @Override
        void endDefaultCase(Node node, int type) {
            // no-op
        }

        @Override
        void beginSwitch(Node node, int type) {
            code.append("switch(");
        }

        @Override
        void endSwitch(Node node, int type) {
            code.append(")");
        }

        @Override
        void beginLabel(Node node, int type) {
            // no-op
        }

        @Override
        void endLabel(Node node, int type) {
            code.append(":");
        }

        @Override
        void beginBlock(Node node, int type) {
            code.append("{");
        }

        @Override
        void endBlock(Node node, int type) {
            code.append("}");
        }

        @Override
        void beginScript(Node node) {
            // no-op
        }

        @Override
        void endScript(Node node) {
            // no-op
        }

        @Override
        void beginFile() {
            // no-op
        }

        @Override
        void endFile(com.google.javascript.rhino.Node node) {
            // no-op
        }

        @Override
        void beginFile(Node node) {
            // no-op
        }

        @Override
        void endFile(Node node) {
            // no-op
        }

        @Override
        void addNodes(com.google.javascript.rhino.Node node) {
            // no-op
        }

        @Override
        void addNodes(Node node, Context context) {
            // no-op
        }

        @Override
        void beginNodeProcessing() {
            // no-op
        }

        @Override
        void endNodeProcessing() {
            // no-op
        }
    }

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    @Test
    public void testAdd_BinaryOperator() {
        Node n = new Node(Token.ADD);
        n.addChildToBack(new Node(Token.NUMBER, 1.0));
        n.addChildToBack(new Node(Token.NUMBER, 2.0));
        generator.add(n);
        assertEquals("1.02.0", consumer.code.toString());
    }

    @Test
    public void testAdd_NullOutputStream() {
        consumer.continueProcessing = false;
        generator.add(new Node(Token.NUMBER, 1.0));
        assertEquals("", consumer.code.toString());
    }

    @Test
    public void testTryCatch() {
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EMPTY));
        tryNode.addChildToBack(block);
        Node catchBlock = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(new Node(Token.NAME, "e"));
        catchNode.addChildToBack(catchBlock);
        tryNode.addChildToBack(catchNode);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        generator.add(tryNode);
        assertTrue(consumer.code.toString().contains("try"));
        assertTrue(consumer.code.toString().contains("catch"));
        assertTrue(consumer.code.toString().contains("finally"));
    }

    @Test
    public void testThrow() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(new Node(Token.NAME, "x"));
        generator.add(throwNode);
        assertEquals("throwx;", consumer.code.toString());
    }

    @Test
    public void testReturn_WithChild() {
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(new Node(Token.NUMBER, 42.0));
        generator.add(ret);
        assertEquals("return42", consumer.code.toString());
    }

    @Test
    public void testVar_WithAssignment() {
        Node varNode = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "a");
        varNode.addChildToBack(name);
        generator.add(varNode);
        assertEquals("var a", consumer.code.toString());
    }

    @Test
    public void testNumber() {
        generator.add(new Node(Token.NUMBER, 3.14));
        assertEquals("3.14", consumer.code.toString());
    }

    @Test
    public void testArrayLit() {
        Node arr = new Node(Token.ARRAYLIT);
        arr.addChildToBack(new Node(Token.NUMBER, 1.0));
        arr.addChildToBack(new Node(Token.NUMBER, 2.0));
        generator.add(arr);
        assertEquals("[1.02.0]", consumer.code.toString());
    }

    @Test
    public void testGetProp() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(new Node(Token.NAME, "a"));
        getProp.addChildToBack(new Node(Token.STRING, "b"));
        generator.add(getProp);
        assertEquals("a.b", consumer.code.toString());
    }

    @Test
    public void testGetElem() {
        Node getElem = new Node(Token.GETELEM);
        getElem.addChildToBack(new Node(Token.NAME, "a"));
        getElem.addChildToBack(new Node(Token.NUMBER, 0.0));
        generator.add(getElem);
        assertEquals("a[0.0]", consumer.code.toString());
    }

    @Test
    public void testSwitch() {
        Node switchNode = new Node(Token.SWITCH);
        switchNode.addChildToBack(new Node(Token.NAME, "x"));
        Node caseNode = new Node(Token.CASE);
        caseNode.addChildToBack(new Node(Token.NUMBER, 1.0));
        switchNode.addChildToBack(caseNode);
        generator.add(switchNode);
        assertTrue(consumer.code.toString().contains("switch(x)"));
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", consumer.code.toString());
    }

    @Test(expected = RuntimeException.class)
    public void testAddNullNode() {
        generator.add((Node) null);
    }
}