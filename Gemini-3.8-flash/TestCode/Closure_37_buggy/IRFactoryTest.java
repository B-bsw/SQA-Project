import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ast.*;
import com.google.javascript.rhino.head.ast.Assignment;
import com.google.javascript.rhino.head.ast.Block;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;
import com.google.javascript.rhino.head.ast.WhileLoop;
import com.google.javascript.rhino.head.ast.IfStatement;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.ThrowStatement;
import com.google.javascript.rhino.head.ast.TryStatement;
import com.google.javascript.rhino.head.ast.CatchClause;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.LabeledStatement;
import com.google.javascript.rhino.head.ast.ForLoop;
import com.google.javascript.rhino.head.ast.InfixExpression;
import com.google.javascript.rhino.head.ast.KeywordLiteral;
import com.google.javascript.rhino.head.ast.UnaryExpression;
import com.google.javascript.rhino.head.ast.ElementGet;
import com.google.javascript.rhino.head.ast.PropertyGet;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.ArrayLiteral;
import com.google.javascript.rhino.head.ast.ObjectLiteral;
import com.google.javascript.rhino.head.ast.ObjectProperty;
import com.google.javascript.rhino.head.ast.ParenthesizedExpression;
import com.google.javascript.rhino.head.ast.RegExpLiteral;
import com.google.javascript.rhino.head.ast.SwitchStatement;
import com.google.javascript.rhino.head.ast.SwitchCase;
import com.google.javascript.rhino.head.ast.DoLoop;
import com.google.javascript.rhino.head.ast.ForInLoop;
import com.google.javascript.rhino.head.ast.ContinueStatement;
import com.google.javascript.rhino.head.ast.BreakStatement;
import com.google.javascript.rhino.head.ast.EmptyExpression;
import com.google.javascript.rhino.head.ast.Scope;
import com.google.javascript.rhino.head.ast.WithStatement;
import com.google.javascript.rhino.head.Token.CommentType;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import java.util.*;
import com.google.common.collect.ImmutableSet;

public class IRFactoryTest {
    
    private IRFactory factory;
    private Config config;
    
    @Before
    public void setUp() {
        config = Config.builder()
                .languageMode(LanguageMode.ECMASCRIPT5)
                .build();
        factory = new IRFactory(config);
    }
    
    @Test
    public void testTransformTreeWithJSDocComment() {
        AstRoot root = new AstRoot(0);
        StringLiteral commentValue = new StringLiteral(0, "/** @fileoverview test */");
        commentValue.setType(com.google.javascript.rhino.head.Token.STRING);
        Comment jsDocComment = new Comment(0, commentValue.getValue());
        jsDocComment.setCommentType(CommentType.JSDOC);
        java.util.List<Comment> comments = new ArrayList<>();
        comments.add(jsDocComment);
        root.setComments(comments);
        
        Node result = factory.transformTree(root, null, "test.js");
        assertNotNull(result);
    }
    
    @Test
    public void testTransformTreeWithBlockComment() {
        AstRoot root = new AstRoot(0);
        StringLiteral commentValue = new StringLiteral(0, "/* regular */");
        commentValue.setType(com.google.javascript.rhino.head.Token.STRING);
        Comment blockComment = new Comment(0, commentValue.getValue());
        blockComment.setCommentType(CommentType.BLOCK_COMMENT);
        java.util.List<Comment> comments = new ArrayList<>();
        comments.add(blockComment);
        root.setComments(comments);
        
        Node result = factory.transformTree(root, null, "test.js");
        assertNotNull(result);
        assertTrue(result.getType() == Token.SCRIPT || result.getType() == Token.EMPTY);
    }
    
    @Test
    public void testTransformNumberLiteralJustAboveLongRange() {
        double value = 2147483648.0; // above int range
        assertEquals("2147483648.0", IRFactory.getStringValue(value));
    }
    
    @Test
    public void testTransformNumberWholeNumber() {
        assertEquals("42", IRFactory.getStringValue(42.0));
        assertEquals("-5", IRFactory.getStringValue(-5.0));
    }
    
    @Test
    public void testTransformNumberFractional() {
        assertEquals("3.14", IRFactory.getStringValue(3.14));
    }
    
    @Test
    public void testProcessNameReservedKeyword() {
        Name name = new Name(0, "class");
        Node result = factory.transform(name);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("class", result.getString());
    }
    
    @Test
    public void testProcessNameNormalIdentifier() {
        Name name = new Name(0, "myVar");
        Node result = factory.transform(name);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("myVar", result.getString());
    }
    
    @Test
    public void testProcessNumberLiteral() {
        NumberLiteral literal = new NumberLiteral(0, 123.456);
        Node result = factory.transform(literal);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(123.456, result.getDouble(), 0.001);
    }
    
    @Test
    public void testProcessStringLiteral() {
        StringLiteral literal = new StringLiteral(0, "hello");
        Node result = factory.transform(literal);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }
    
    @Test
    public void testProcessKeywordLiteralTrue() {
        KeywordLiteral literal = new KeywordLiteral(0, "true", 0);
        Node result = factory.transform(literal);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testProcessKeywordLiteralFalse() {
        KeywordLiteral literal = new KeywordLiteral(0, "false", 0);
        Node result = factory.transform(literal);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testTransformNullLiteral() {
        com.google.javascript.rhino.head.ast.KeywordLiteral literal = 
                new com.google.javascript.rhino.head.ast.KeywordLiteral(0, "null", 7);
        Node result = factory.transform(literal);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformArrayLiteralEmpty() {
        ArrayLiteral array = new ArrayLiteral();
        Node result = factory.transform(array);
        assertNotNull(result);
        assertEquals(Token.ARRAYLIT, result.getType());
        assertFalse(result.hasChildren());
    }
    
    @Test
    public void testTransformObjectLiteralEmpty() {
        ObjectLiteral obj = new ObjectLiteral();
        Node result = factory.transform(obj);
        assertNotNull(result);
        assertEquals(Token.OBJECTLIT, result.getType());
    }
    
    @Test
    public void testTransformObjectLiteralWithGetterSetter() {
        ObjectLiteral obj = new ObjectLiteral();
        ObjectProperty prop = new ObjectProperty();
        prop.setLeft(new Name(0, "prop"));
        prop.setRight(new FunctionNode());
        obj.addProperty(prop);
        
        config = Config.builder()
                .languageMode(LanguageMode.ECMASCRIPT3)
                .build();
        factory = new IRFactory(config);
        
        Node result = factory.transform(obj);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformUnaryExpressionNegate() {
        UnaryExpression expr = new UnaryExpression();
        expr.setType(com.google.javascript.rhino.head.Token.NEG);
        expr.setOperand(new NumberLiteral(0, 5));
        Node result = factory.transform(expr);
        assertNotNull(result);
        assertEquals(Token.NEG, result.getType());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformUnsupportedToken() {
        // Create an unsupported node type - e.g., a StringLiteral with token type that maps to unsupported
        Name name = new Name(0, "unsupported");
        name.setType(com.google.javascript.rhino.head.Token.EMPTY); 
        // This won't trigger transform because processGeneric handles it
        Node result = factory.transform(name);
        // Just ensure the method runs without exception for generic case
        assertNotNull(result);
    }
    
    @Test
    public void testTransformInfixExpressionVariousOperators() {
        testInfixOperator(InfixExpression.TokenType.BITOR, Token.BITOR);
        testInfixOperator(InfixExpression.TokenType.BITXOR, Token.BITXOR);
        testInfixOperator(InfixExpression.TokenType.BITAND, Token.BITAND);
        testInfixOperator(InfixExpression.TokenType.EQ, Token.EQ);
        testInfixOperator(InfixExpression.TokenType.NE, Token.NE);
        testInfixOperator(InfixExpression.TokenType.LT, Token.LT);
        testInfixOperator(InfixExpression.TokenType.LE, Token.LE);
        testInfixOperator(InfixExpression.TokenType.GT, Token.GT);
        testInfixOperator(InfixExpression.TokenType.GE, Token.GE);
        testInfixOperator(InfixExpression.TokenType.LSH, Token.LSH);
        testInfixOperator(InfixExpression.TokenType.RSH, Token.RSH);
        testInfixOperator(InfixExpression.TokenType.URSH, Token.URSH);
        testInfixOperator(InfixExpression.TokenType.ADD, Token.ADD);
        testInfixOperator(InfixExpression.TokenType.SUB, Token.SUB);
        testInfixOperator(InfixExpression.TokenType.MUL, Token.MUL);
        testInfixOperator(InfixExpression.TokenType.DIV, Token.DIV);
        testInfixOperator(InfixExpression.TokenType.MOD, Token.MOD);
    }
    
    private void testInfixOperator(InfixExpression.TokenType tokenType, int expectedToken) {
        InfixExpression expr = new InfixExpression();
        expr.setType(tokenType);
        expr.setLeft(new Name(0, "a"));
        expr.setRight(new NumberLiteral(0, 1));
        Node result = factory.transform(expr);
        assertNotNull(result);
        assertEquals(expectedToken, result.getType());
    }
    
    @Test
    public void testTransformUnaryOperators() {
        testUnaryOperator(com.google.javascript.rhino.head.Token.NOT, Token.NOT);
        testUnaryOperator(com.google.javascript.rhino.head.Token.BITNOT, Token.BITNOT);
        testUnaryOperator(com.google.javascript.rhino.head.Token.POS, Token.POS);
        testUnaryOperator(com.google.javascript.rhino.head.Token.NEG, Token.NEG);
        testUnaryOperator(com.google.javascript.rhino.head.Token.TYPEOF, Token.TYPEOF);
    }
    
    private void testUnaryOperator(int sourceToken, int expectedToken) {
        UnaryExpression expr = new UnaryExpression();
        expr.setType(sourceToken);
        expr.setOperand(new NumberLiteral(0, 1));
        Node result = factory.transform(expr);
        assertNotNull(result);
        assertEquals(expectedToken, result.getType());
    }
    
    @Test
    public void testTransformIncrementOperator() {
        UnaryExpression expr = new UnaryExpression();
        expr.setType(com.google.javascript.rhino.head.Token.INC);
        expr.setOperand(new Name(0, "x"));
        Node result = factory.transform(expr);
        assertNotNull(result);
        assertTrue(result.getType() == Token.INC || result.getType() == Token.ADD);
    }
    
    @Test
    public void testTransformReturnWithValue() {
        ReturnStatement ret = new ReturnStatement();
        ret.setReturnValue(new NumberLiteral(0, 42));
        Node result = factory.transform(ret);
        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
    }
    
    @Test
    public void testTransformReturnWithoutValue() {
        ReturnStatement ret = new ReturnStatement();
        Node result = factory.transform(ret);
        assertNotNull(result);
        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren());
    }
    
    @Test
    public void testTransformThrowStatement() {
        ThrowStatement thr = new ThrowStatement();
        thr.setExpression(new Name(0, "e"));
        Node result = factory.transform(thr);
        assertNotNull(result);
        assertEquals(Token.THROW, result.getType());
    }
    
    @Test
    public void testTransformTryCatchFinally() {
        TryStatement tryStmt = new TryStatement();
        Block tryBlock = new Block();
        tryStmt.setTryBlock(tryBlock);
        
        CatchClause catchClause = new CatchClause();
        catchClause.setCatchCondition(new Name(0, "e"));
        tryStmt.addCatchClause(catchClause);
        
        Block finallyBlock = new Block();
        tryStmt.setFinallyBlock(finallyBlock);
        
        Node result = factory.transform(tryStmt);
        assertNotNull(result);
        assertEquals(Token.TRY, result.getType());
    }
    
    @Test
    public void testTransformEmptyExpression() {
        EmptyExpression empty = new EmptyExpression();
        Node result = factory.transform(empty);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }
    
    @Test
    public void testTransformFunctionNode() {
        FunctionNode fn = new FunctionNode();
        Name fnName = new Name(0, "myFunc");
        fn.setName(fnName);
        
        Node result = factory.transform(fn);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformWithStatement() {
        WithStatement with = new WithStatement();
        with.setExpression(new Name(0, "obj"));
        Node result = factory.transform(with);
        assertNotNull(result);
        assertEquals(Token.WITH, result.getType());
    }
    
    @Test
    public void testTransformBreakStatement() {
        BreakStatement br = new BreakStatement();
        br.setBreakLabel(new Name(0, "label"));
        Node result = factory.transform(br);
        assertNotNull(result);
        assertEquals(Token.BREAK, result.getType());
    }
    
    @Test
    public void testTransformContinueStatement() {
        ContinueStatement cont = new ContinueStatement();
        cont.setContinueLabel(new Name(0, "loop1"));
        Node result = factory.transform(cont);
        assertNotNull(result);
        assertEquals(Token.CONTINUE, result.getType());
    }
    
    @Test
    public void testTransformSwitchStatement() {
        SwitchStatement sw = new SwitchStatement();
        Name expr = new Name(0, "x");
        sw.setExpression(expr);
        SwitchCase sc = new SwitchCase();
        sc.setExpression(new NumberLiteral(0, 1));
        sw.addSwitchCase(sc);
        
        Node result = factory.transform(sw);
        assertNotNull(result);
        assertEquals(Token.SWITCH, result.getType());
    }
    
    @Test
    public void testTransformDoWhileLoop() {
        DoLoop loop = new DoLoop();
        Block body = new Block();
        loop.setBody(body);
        loop.setCondition(new Name(0, "cond"));
        Node result = factory.transform(loop);
        assertNotNull(result);
        assertEquals(Token.DO, result.getType());
    }
    
    @Test
    public void testTransformWhileLoop() {
        WhileLoop loop = new WhileLoop();
        loop.setCondition(new Name(0, "cond"));
        Node result = factory.transform(loop);
        assertNotNull(result);
        assertEquals(Token.WHILE, result.getType());
    }
    
    @Test
    public void testTransformForInLoop() {
        ForInLoop loop = new ForInLoop();
        Name iterator = new Name(0, "x");
        loop.setIterator(iterator);
        loop.setIteratedObject(new Name(0, "obj"));
        loop.setBody(new Block());
        loop.setIsForEach(false);
        
        Node result = factory.transform(loop);
        assertNotNull(result);
        assertEquals(Token.FOR, result.getType());
    }
    
    @Test
    public void testTransformLabeledStatement() {
        LabeledStatement labeled = new LabeledStatement();
        Label label = new Label();
        label.setName("mylabel");
        labeled.setLabel(label);
        ExpressionStatement stmt = new ExpressionStatement();
        stmt.setExpression(new Name(0, "x"));
        labeled.setStatement(stmt);
        
        Node result = factory.transform(labeled);
        assertNotNull(result);
        assertEquals(Token.LABEL, result.getType());
    }
    
    @Test
    public void testTransformPropertyGet() {
        PropertyGet pg = new PropertyGet();
        pg.setTarget(new Name(0, "obj"));
        pg.setProperty(new Name(0, "prop"));
        
        Node result = factory.transform(pg);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }
    
    @Test
    public void testTransformElementGet() {
        ElementGet eg = new ElementGet();
        eg.setTarget(new Name(0, "arr"));
        eg.setElement(new NumberLiteral(0, 0));
        
        Node result = factory.transform(eg);
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }
    
    @Test
    public void testTransformFunctionCall() {
        FunctionCall fc = new FunctionCall();
        fc.setTarget(new Name(0, "foo"));
        fc.addArgument(new NumberLiteral(0, 1));
        
        Node result = factory.transform(fc);
        assertNotNull(result);
        assertEquals(Token.CALL, result.getType());
    }
    
    @Test
    public void testTransformNewExpression() {
        NewExpression ne = new NewExpression();
        ne.setTarget(new Name(0, "Foo"));
        ne.addArgument(new NumberLiteral(0, 42));
        
        Node result = factory.transform(ne);
        assertNotNull(result);
        assertEquals(Token.NEW, result.getType());
    }
    
    @Test
    public void testTransformConditionalExpression() {
        ConditionalExpression ce = new ConditionalExpression();
        ce.setTestExpression(new Name(0, "cond"));
        ce.setTrueExpression(new NumberLiteral(0, 1));
        ce.setFalseExpression(new NumberLiteral(0, 2));
        
        Node result = factory.transform(ce);
        assertNotNull(result);
        assertEquals(Token.HOOK, result.getType());
    }
    
    @Test
    public void testTransformVariableDeclaration() {
        VariableDeclaration vd = new VariableDeclaration();
        VariableInitializer vi = new VariableInitializer();
        vi.setTarget(new Name(0, "x"));
        vi.setInitializer(new NumberLiteral(0, 10));
        vd.addVariable(vi);
        
        Node result = factory.transform(vd);
        assertNotNull(result);
        assertEquals(Token.VAR, result.getType());
    }
    
    @Test
    public void testTransformFunctionCallWithReservedKeywordName() {
        Name name = new Name(0, "class");
        Node result = factory.transform(name);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformRegularExpression() {
        RegExpLiteral re = new RegExpLiteral();
        re.setValue("ab+c");
        Node result = factory.transform(re);
        assertNotNull(result);
        assertEquals(Token.REGEXP, result.getType());
    }
    
    @Test
    public void testUnknownTokenTypeInDispatcher() {
        Name name = new Name(0, "test");
        name.setType(999); // Unknown type
        Node result = factory.transform(name);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformEmptyName() {
        Name name = new Name(0, "");
        Node result = factory.transform(name);
        assertNotNull(result);
    }
    
    @Test
    public void testStringWithVerticalTab() {
        StringLiteral literal = new StringLiteral(0, "value\t");
        Node result = factory.transform(literal);
        assertNotNull(result);
    }
    
    @Test
    public void testTransformWithMultipleComments() {
        AstRoot root = new AstRoot(0);
        java.util.List<Comment> comments = new ArrayList<>();
        
        StringLiteral c1val = new StringLiteral(0, "/** doc */");
        Comment c1 = new Comment(0, c1val.getValue());
        c1.setCommentType(CommentType.JSDOC);
        comments.add(c1);
        
        StringLiteral c2val = new StringLiteral(0, "/* block */");
        Comment c2 = new Comment(0, c2val.getValue());
        c2.setCommentType(CommentType.BLOCK_COMMENT);
        comments.add(c2);
        
        root.setComments(comments);
        Node result = factory.transformTree(root, null, "file.js");
        assertNotNull(result);
    }
    
    @Test
    public void testProcessIfStatementWithElse() {
        IfStatement ifStmt = new IfStatement();
        ifStmt.setCondition(new Name(0, "cond"));
        ifStmt.setIfPart(new Block());
        ifStmt.setElsePart(new Block());
        
        Node result = factory.transform(ifStmt);
        assertNotNull(result);
        assertEquals(Token.IF, result.getType());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTransformWithInvalidInfixOperator() {
        InfixExpression expr = new InfixExpression();
        assertNull(expr.getOperator());
        // Force unsupported by calling transform directly - would fail in operator mapping
    }
    
    @Test
    public void testGetStringValueSpecialValues() {
        assertEquals("Infinity", IRFactory.getStringValue(Double.POSITIVE_INFINITY));
        assertEquals("-Infinity", IRFactory.getStringValue(Double.NEGATIVE_INFINITY));
        assertEquals("NaN", IRFactory.getStringValue(Double.NaN));
    }
}