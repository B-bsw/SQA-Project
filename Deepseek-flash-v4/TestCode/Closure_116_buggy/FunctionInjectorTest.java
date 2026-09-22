package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.HashSet;
import java.util.Set;

public class FunctionInjectorTest {

    private FunctionInjector injector;
    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    private static final String FN_NAME = "fnName";
    private static final String FN_RECURSION_NAME = "recursionName";

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        safeNameIdSupplier = new Supplier<String>() {
            private int id = 0;
            @Override
            public String get() {
                return "temp_" + id++;
            }
        };
        injector = new FunctionInjector(compiler, safeNameIdSupplier, true, true, true);
    }

    @Test
    public void testConstructorNullCompilerThrows() {
        try {
            new FunctionInjector(null, safeNameIdSupplier, true, true, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testConstructorNullSupplierThrows() {
        try {
            new FunctionInjector(compiler, null, true, true, true);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_NullFnName() {
        Node fnNode = createFunctionNode();
        try {
            injector.doesFunctionMeetMinimumRequirements(null, fnNode);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_NullFnNode() {
        try {
            injector.doesFunctionMeetMinimumRequirements("fn", null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_EmptyFunction() {
        Node fnNode = createFunctionNode();
        fnNode.addChildToBack(new Node(Token.BLOCK));
        assertFalse(injector.doesFunctionMeetMinimumRequirements(FN_NAME, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_SimpleFunction() {
        Node fnNode = createFunctionNode();
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, new Node(Token.NUMBER, 1)));
        fnNode.addChildToBack(block);
        assertTrue(injector.doesFunctionMeetMinimumRequirements(FN_NAME, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesArguments() {
        Node fnNode = createFunctionNode();
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "arguments");
        block.addChildToBack(new Node(Token.EXPR_RESULT, name));
        fnNode.addChildToBack(block);
        assertFalse(injector.doesFunctionMeetMinimumRequirements(FN_NAME, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesFnName() {
        Node fnNode = createFunctionNode();
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, FN_NAME)));
        fnNode.addChildToBack(block);
        assertFalse(injector.doesFunctionMeetMinimumRequirements(FN_NAME, fnNode));
    }

    @Test
    public void testCanInlineReference_UnsupportedCallType() {
        Node callNode = new Node(Token.CALL);
        Node fnNode = createFunctionNode();
        Set<String> needAliases = new HashSet<String>();
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(
                null, callNode, fnNode, needAliases, InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReference_NullCallNode() {
        Node fnNode = createFunctionNode();
        try {
            injector.canInlineReferenceToFunction(null, null, fnNode,
                    new HashSet<String>(), InliningMode.DIRECT, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCanInlineReference_NullFnNode() {
        Node callNode = new Node(Token.CALL);
        try {
            injector.canInlineReferenceToFunction(null, callNode, null,
                    new HashSet<String>(), InliningMode.DIRECT, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCanInlineReference_NullMode() {
        Node callNode = new Node(Token.CALL);
        Node fnNode = createFunctionNode();
        try {
            injector.canInlineReferenceToFunction(null, callNode, fnNode,
                    new HashSet<String>(), null, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCanInlineReference_NullNeedAliases() {
        Node callNode = new Node(Token.CALL);
        Node fnNode = createFunctionNode();
        try {
            injector.canInlineReferenceToFunction(null, callNode, fnNode,
                    null, InliningMode.DIRECT, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCanInlineReference_DirectMode_SimpleCall() {
        Node callNode = createSimpleCallNode("fnName");
        Node fnNode = createFunctionNode();
        Set<String> needAliases = new HashSet<String>();
        assertEquals(CanInlineResult.NO, injector.canInlineReferenceToFunction(
                null, callNode, fnNode, needAliases, InliningMode.DIRECT, false, false));
    }

    @Test
    public void testInline_NullCallNode() {
        try {
            injector.inline(null, FN_NAME, new Node(Token.FUNCTION), InliningMode.DIRECT);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInline_NullFnName() {
        Node callNode = new Node(Token.CALL);
        try {
            injector.inline(callNode, null, new Node(Token.FUNCTION), InliningMode.DIRECT);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInline_NullFnNode() {
        Node callNode = new Node(Token.CALL);
        try {
            injector.inline(callNode, FN_NAME, null, InliningMode.DIRECT);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInline_NullMode() {
        Node callNode = new Node(Token.CALL);
        try {
            injector.inline(callNode, FN_NAME, new Node(Token.FUNCTION), null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInline_UnsupportedCallSite() {
        Node callNode = new Node(Token.CALL);
        Node fnNode = createFunctionNode();
        try {
            injector.inline(callNode, FN_NAME, fnNode, InliningMode.BLOCK);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testSetKnownConstants_Null() {
        try {
            injector.setKnownConstants(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testSetKnownConstants_EmptySet() {
        Set<String> constants = new HashSet<String>();
        injector.setKnownConstants(constants);
        // No exception should be thrown
    }

    @Test
    public void testSetKnownConstants_NonEmptySet() {
        Set<String> constants = new HashSet<String>();
        constants.add("CONSTANT");
        injector.setKnownConstants(constants);
        // No exception should be thrown
    }

    @Test
    public void testClassifyCallSite_Unsupported() {
        Node callNode = new Node(Token.CALL);
        FunctionInjector.CallSiteType type = injector.classifyCallSite(callNode);
        assertNull(type);
    }

    @Test
    public void testClassifyCallSite_Simple() {
        Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "fn"));
        Node parent = new Node(Token.EXPR_RESULT, callNode);
        FunctionInjector.CallSiteType type = injector.classifyCallSite(callNode);
        assertNotNull(type);
    }

    @Test
    public void testClassifyCallSite_Null() {
        try {
            injector.classifyCallSite(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_NullFnNode() {
        try {
            injector.isDirectCallNodeReplacementPossible(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_SimpleFunction() {
        Node fnNode = createFunctionNode();
        Node block = new Node(Token.BLOCK);
        block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "x")));
        fnNode.addChildToBack(block);
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testIsDirectCallNodeReplacementPossible_ComplexFunction() {
        Node fnNode = createFunctionNode();
        Node block = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "x"));
        block.addChildToBack(new Node(Token.EXPR_RESULT, varNode));
        block.addChildToBack(new Node(Token.RETURN, Node.newString(Token.NAME, "x")));
        fnNode.addChildToBack(block);
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    private Node createFunctionNode() {
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToFront(Node.newString(Token.NAME, FN_RECURSION_NAME));
        fnNode.addChildToBack(new Node(Token.PARAM_LIST));
        return fnNode;
    }

    private Node createSimpleCallNode(String fnName) {
        Node callNode = new Node(Token.CALL);
        callNode.addChildToFront(Node.newString(Token.NAME, fnName));
        Node parent = new Node(Token.EXPR_RESULT, callNode);
        return callNode;
    }

    private static class TestCompiler extends AbstractCompiler {
        // Minimal stub for testing
    }
}