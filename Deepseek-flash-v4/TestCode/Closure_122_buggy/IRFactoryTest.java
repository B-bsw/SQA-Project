package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.head.ast.Comment;
import com.google.javascript.rhino.head.ast.ExpressionStatement;
import com.google.javascript.rhino.head.ast.FunctionCall;
import com.google.javascript.rhino.head.ast.FunctionNode;
import com.google.javascript.rhino.head.ast.Name;
import com.google.javascript.rhino.head.ast.NumberLiteral;
import com.google.javascript.rhino.head.ast.ReturnStatement;
import com.google.javascript.rhino.head.ast.StringLiteral;
import com.google.javascript.rhino.head.ast.VariableDeclaration;
import com.google.javascript.rhino.head.ast.VariableInitializer;

public class IRFactoryTest {

    private static class TestErrorReporter implements ErrorReporter {
        private boolean errorOccurred;
        private String message;

        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {
            // Not needed for tests
        }

        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {
            errorOccurred = true;
            this.message = message;
        }

        @Override
        public com.google.javascript.rhino.head.EvaluatorException runtimeError(
                String message, String sourceName, int line, String lineSource, int lineOffset) {
            return new com.google.javascript.rhino.head.EvaluatorException(message);
        }
    }

    private Config config;
    private IRFactory factory;
    private TestErrorReporter errorReporter;
    private StaticSourceFile sourceFile;

    @Before
    public void setUp() {
        config = new Config(LanguageMode.ECMASCRIPT5, false, ImmutableSet.<String>of(), false);
        errorReporter = new TestErrorReporter();
        sourceFile = new StaticSourceFile() {
            @Override
            public String getName() {
                return "test.js";
            }

            @Override
            public int getLineOfOffset(int offset) {
                return 0;
            }

            @Override
            public int getColumnOfOffset(int offset) {
                return 0;
            }

            @Override
            public int getLineOffset(int line) {
                return 0;
            }
        };
        factory = new IRFactory(sourceFile, config, errorReporter);
    }

    @Test
    public void testTransformTreeEmptyScript() {
        AstRoot root = new AstRoot(0);
        root.setSourceName("test.js");
        Node result = IRFactory.transformTree(root, factory, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTransformTreeWithComments() {
        AstRoot root = new AstRoot(0);
        root.setSourceName("test.js");
        Comment jsDocComment = new Comment(CommentType.JSDOC, "file-overview", 0, 0);
        Comment blockComment = new Comment(CommentType.BLOCK_COMMENT, "block", 0, 0);
        root.setComments(com.google.common.collect.ImmutableList.of(jsDocComment, blockComment));
        
        Node result = IRFactory.transformTree(root, factory, errorReporter);
        assertNotNull(result);
        assertEquals(Token.SCRIPT, result.getType());
    }

    @Test
    public void testProcessStringLiteral() {
        StringLiteral literal = new StringLiteral(0, 3, "hello");
        Node result = factory.processStringLiteral(literal);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testProcessNumberLiteral() {
        NumberLiteral literal = new NumberLiteral(0, 3, 42.0);
        Node result = factory.processNumberLiteral(literal);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.valueOf(42.0), result.getDouble());
    }

    @Test
    public void testTransformNumberLiteralToNumberNode() throws Exception {
        java.lang.reflect.Method method = IRFactory.class.getDeclaredMethod("transform", AstNode.class);
        method.setAccessible(true);
        
        NumberLiteral literal = new NumberLiteral(0, 3, 42.0);
        Node result = (Node) method.invoke(factory, literal);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
    }

    @Test
    public void testTransformName() {
        Name name = new Name(0, 3, "foo");
        Node result = factory.transform(name);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
        assertEquals("foo", result.getString());
    }

    @Test
    public void testTransformReservedKeywordThrows() {
        Name name = new Name(0, 3, "class");
        try {
            factory.transform(name);
            fail("Expected IllegalStateException for reserved keyword");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testIsAllowedPropWithValidName() throws Exception {
        java.lang.reflect.Method method = IRFactory.class.getDeclaredMethod("isAllowedProp", String.class);
        method.setAccessible(true);
        assertTrue((Boolean) method.invoke(factory, "validName"));
    }

    @Test
    public void testIsAllowedPropWithInvalidName() throws Exception {
        java.lang.reflect.Method method = IRFactory.class.getDeclaredMethod("isAllowedProp", String.class);
        method.setAccessible(true);
        assertTrue(!(Boolean) method.invoke(factory, "invalid-name"));
    }

    @Test
    public void testGetStringValueWithWholeNumber() {
        String result = IRFactory.getStringValue(42.0);
        assertEquals("42", result);
    }

    @Test
    public void testGetStringValueWithFractionalNumber() {
        String result = IRFactory.getStringValue(42.5);
        assertEquals("42.5", result);
    }

    @Test
    public void testTransformVariableDeclaration() {
        VariableDeclaration decl = new VariableDeclaration(0, 3);
        Name name = new Name(0, 3, "x");
        decl.setChildren(new VariableInitializer[]{
            new VariableInitializer(0, 3, name, new NumberLiteral(0, 3, 42.0))
        });
        
        Node result = factory.transform(decl);
        assertNotNull(result);
    }

    @Test
    public void testTransformNullInput() {
        try {
            factory.transform((AstNode) null);
            fail("Expected NullPointerException for null input");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testNewNodeWithTokenType() {
        Node node = factory.newNode(Token.EMPTY);
        assertNotNull(node);
        assertEquals(Token.EMPTY, node.getType());
    }

    @Test
    public void testNewStringNode() {
        Node node = factory.newStringNode("test");
        assertNotNull(node);
        assertEquals(Token.STRING, node.getType());
        assertEquals("test", node.getString());
    }

    @Test
    public void testNewNumberNode() {
        Node node = factory.newNumberNode(42.0);
        assertNotNull(node);
        assertEquals(Token.NUMBER, node.getType());
    }

    @Test
    public void testGetJSDocInfoWithNull() {
        assertNull(factory.getJSDocInfo(null));
    }
}