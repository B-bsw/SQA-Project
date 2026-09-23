package com.google.javascript.jscomp.parsing;

import static com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.JSDOC;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.*;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class IRFactoryTest {

    private ErrorReporer errorReporter;
    private Config config;
    private IRFactory factory;

    private static class ErrorReporer implements ErrorReporter {
        boolean errorOccurred = false;

        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {
            errorOccurred = true;
        }

        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {
            // No-op
        }
    }

    @Before
    public void setUp() {
        errorReporter = new ErrorReporer();
        config = Config.LanguageMode.ECMASCRIPT5;
        factory = new IRFactory(errorReporter, config);
    }

    @Test
    public void testTransformTreeEmptyRoot() {
        AstRoot root = new AstRoot(1);
        Node result = IRFactory.transformTree(root, null, config, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testTransformTreeWithComments() {
        AstRoot root = new AstRoot(1);
        Comment comment = new Comment(1, JSDOC, "test", 1);
        root.setComments(java.util.Collections.singletonList(comment));
        Node result = IRFactory.transformTree(root, null, config, errorReporter);
        assertNotNull(result);
    }

    @Test
    public void testProcessTokenSwitch() {
        // Test that processToken returns correct Token for various inputs
        assertEquals(Token.IF, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.IF));
        assertEquals(Token.ELSE, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.ELSE));
        assertEquals(Token.SWITCH, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.SWITCH));
        assertEquals(Token.CASE, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.CASE));
        assertEquals(Token.WHILE, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.WHILE));
        assertEquals(Token.DO, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.DO));
        assertEquals(Token.FOR, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.FOR));
        assertEquals(Token.BREAK, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.BREAK));
        assertEquals(Token.CONTINUE, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.CONTINUE));
        assertEquals(Token.VAR, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.VAR));
        assertEquals(Token.WITH, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.WITH));
        assertEquals(Token.CATCH, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.CATCH));
        assertEquals(Token.FINALLY, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.FINALLY));
        assertEquals(Token.VOID, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.VOID));
        assertEquals(Token.EMPTY, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.EMPTY));
        assertEquals(Token.BLOCK, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.BLOCK));
        assertEquals(Token.LABEL, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.LABEL));
        assertEquals(Token.LOOP, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.LOOP));
        assertEquals(Token.TO_OBJECT, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.TO_OBJECT));
        assertEquals(Token.ERROR, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.ERROR));
        assertEquals(Token.EOF, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.EOF));
        assertEquals(Token.EOL, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.EOL));
        assertEquals(Token.ENTERWITH, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.ENTERWITH));
        assertEquals(Token.LEAVEWITH, factory.processToken(com.google.javascript.jscomp.mozilla.rhino.Token.LEAVEWITH));
    }

    @Test
    public void testTransformDispatchName() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        Name name = new Name(1, "test");
        Node result = dispatcher.processName(name, false);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
    }

    @Test
    public void testTransformDispatchNameAsString() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        Name name = new Name(1, "toString");
        Node result = dispatcher.processName(name, true);
        assertNotNull(result);
    }

    @Test
    public void testProcessCommentNoJSDoc() {
        Comment comment = new Comment(1, JSDOC, "test", 1);
        // No parsed flag, should return null
        assertNull(factory.processComment(comment));
    }

    @Test
    public void testProcessCommentParsedJSDoc() {
        Comment comment = new Comment(1, JSDOC, "/** test */", 1);
        // Force parsed state
        comment.setParsed(true);
        // Still null because no JSDoc parser configured
        assertNull(factory.processComment(comment));
    }

    @Test
    public void testCreateMissingSourceNode() {
        Node parent = new Node(Token.BLOCK);
        factory.createMissingSourceNode(parent);
        assertTrue(parent.getFirstChild() != null);
        assertEquals(Token.EMPTY, parent.getFirstChild().getType());
    }

    @Test
    public void testProcessGenericScope() {
        Scope scope = new Scope();
        Node result = factory.processGeneric(scope);
        assertNotNull(result);
        assertEquals(Token.BLOCK, result.getType());
    }

    @Test
    public void testProcessReturnStatementWithValue() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        ReturnStatement returnNode = new ReturnStatement(1);
        returnNode.setReturnValue(new Name(1, "x"));
        Node result = dispatcher.processReturn(returnNode);
        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
    }

    @Test
    public void testProcessReturnStatementNullValue() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        ReturnStatement returnNode = new ReturnStatement(1);
        returnNode.setReturnValue(null);
        Node result = dispatcher.processReturn(returnNode);
        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
    }


    @Test
    public void testProcessIfWithElse() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        IfStatement ifNode = new IfStatement(1);
        ifNode.setCondition(new Name(1, "cond"));
        ifNode.setThenPart(new ExpressionStatement(1, new Name(1, "a")));
        ifNode.setElsePart(new ExpressionStatement(1, new Name(1, "b")));
        Node result = dispatcher.processIf(ifNode);
        assertNotNull(result);
        assertEquals(Token.IF, result.getType());
    }

    @Test
    public void testProcessIfWithoutElse() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        IfStatement ifNode = new IfStatement(1);
        ifNode.setCondition(new Name(1, "cond"));
        ifNode.setThenPart(new ExpressionStatement(1, new Name(1, "a")));
        ifNode.setElsePart(null);
        Node result = dispatcher.processIf(ifNode);
        assertNotNull(result);
        assertEquals(Token.IF, result.getType());
    }

    @Test
    public void testProcessLabeledStatement() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        LabeledStatement labeled = new LabeledStatement(1);
        labeled.setLabel(new Label(1, "mylabel"));
        labeled.setStatement(new ExpressionStatement(1, new Name(1, "x")));
        Node result = dispatcher.processLabeledStatement(labeled);
        assertNotNull(result);
        assertEquals(Token.LABEL, result.getType());
    }

    @Test
    public void testProcessSwitchStatement() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        SwitchStatement switchNode = new SwitchStatement(1);
        SwitchCase defaultCase = new SwitchCase(1);
        defaultCase.setDefault(true);
        switchNode.addCase(defaultCase);
        switchNode.setExpression(new Name(1, "test"));
        Node result = dispatcher.processSwitch(switchNode);
        assertNotNull(result);
        assertEquals(Token.SWITCH, result.getType());
    }

    @Test
    public void testProcessTryCatchFinally() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        TryStatement tryNode = new TryStatement(1);
        CatchClause clause = new CatchClause(1);
        clause.setCatchVar(new Name(1, "e"));
        tryNode.addCatchClause(clause);
        Block finallyBlock = new Block(1);
        tryNode.setFinallyBlock(finallyBlock);
        Node result = dispatcher.processTry(tryNode);
        assertNotNull(result);
        assertEquals(Token.TRY, result.getType());
    }

    @Test
    public void testProcessUnaryExpressionNegNumber() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        UnaryExpression u = new UnaryExpression(1);
        u.setType(com.google.javascript.jscomp.mozilla.rhino.Token.NEG);
        u.setOperand(new NumberLiteral(1, 5.0));
        Node result = dispatcher.processUnary(u);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
    }

    @Test
    public void testProcessUnaryExpressionInvalidAssignTarget() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        UnaryExpression u = new UnaryExpression(1);
        u.setType(com.google.javascript.jscomp.mozilla.rhino.Token.INC);
        u.setOperand(new StringLiteral(1, "not-var"));
        try {
            dispatcher.processUnary(u);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testProcessInfixExpression() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        InfixExpression infix = new InfixExpression(1);
        infix.setType(com.google.javascript.jscomp.mozilla.rhino.Token.ADD);
        infix.setLeft(new Name(1, "a"));
        infix.setRight(new NumberLiteral(1, 1.0));
        Node result = dispatcher.processInfixExpression(infix);
        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
    }

    @Test
    public void testProcessInfixExpressionWithGetter() {
        config = new Config(LanguageMode.ECMASCRIPT3, false, false);
        factory = new IRFactory(errorReporter, config);
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        InfixExpression infix = new InfixExpression(1);
        infix.setType(com.google.javascript.jscomp.mozilla.rhino.Token.SETPROP);
        PropertyGet getter = new PropertyGet(1);
        getter.setTarget(new Name(1, "obj"));
        getter.setProperty(new Name(1, "prop"));
        infix.setLeft(getter);
        infix.setRight(new FunctionCall(1));
        Node result = dispatcher.processInfixExpression(infix);
        assertNotNull(result);
    }

    @Test
    public void testPreconditionsNoChildren() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        FunctionCall call = new FunctionCall(1);
        call.setTarget(new Name(1, "fn"));
        Node result = dispatcher.processFunctionCall(call);
        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
        assertTrue(!result.hasChildren() || result.getFirstChild().getType() == Token.NAME);
    }

    @Test
    public void testValidAssignmentTarget() {
        TransformDispatcher dispatcher = factory.new TransformDispatcher();
        Name name = new Name(1, "x");
        assertTrue(dispatcher.validAssignmentTarget(name));
        ElementGet elem = new ElementGet(1);
        elem.setTarget(new Name(1, "obj"));
        elem.setElement(new Name(1, "y"));
        assertTrue(dispatcher.validAssignmentTarget(elem));
    }

    @Test
    public void testProcessFunctionWithName() {
        Node template = new Node(Token.SCRIPT);
        FunctionNode fnNode = new FunctionNode(1);
        fnNode.setFunctionType(FunctionNode.FUNCTION_STATEMENT);
        fnNode.setName(new Name(1, "myFunc"));
        Block body = new Block(1);
        fnNode.setBody(body);
        Node result = factory.new TransformDispatcher().processFunction(fnNode);
        assertNotNull(result);
        assertEquals(Token.FUNCTION, result.getType());
    }
}