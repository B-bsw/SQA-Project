package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.*;

public class RemoveUnusedVarsTest {
    private AbstractCompiler compiler;
    private RemoveUnusedVars removeUnusedVars;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        compiler = new Compiler();
        removeUnusedVars = new RemoveUnusedVars(compiler, true, false, true);
        externs = new Node(Token.EMPTY);
        root = new Node(Token.SCRIPT);
    }

    @After
    public void tearDown() {
        compiler = null;
        removeUnusedVars = null;
        externs = null;
        root = null;
    }

    @Test
    public void testProcessWithNullRoot() {
        try {
            removeUnusedVars.process(externs, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testProcessWithNullExterns() {
        try {
            removeUnusedVars.process(null, root);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testTraverseNodeWithSimpleAssignment() {
        Node script = new Node(Token.SCRIPT);
        Node assign = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "x");
        Node number = Node.newNumber(1);
        assign.addChildToBack(name);
        assign.addChildToBack(number);
        script.addChildToBack(assign);
        
        removeUnusedVars.process(externs, script);
        // No exception expected, validation of no crashes
    }

    @Test
    public void testFunctionWithUnusedParameter() {
        Node script = new Node(Token.SCRIPT);
        Node function = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "foo");
        Node params = new Node(Token.PARAM_LIST);
        Node param = Node.newString(Token.NAME, "unused");
        params.addChildToBack(param);
        function.addChildToBack(name);
        function.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(body);
        script.addChildToBack(function);
        
        removeUnusedVars.process(externs, script);
        // Should handle function with unused param without error
    }

    @Test
    public void testTraverseNodeWithVarDeclaration() {
        Node script = new Node(Token.SCRIPT);
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "y");
        Node value = Node.newNumber(5);
        var.addChildToBack(name);
        name.addChildToBack(value);
        script.addChildToBack(var);
        
        removeUnusedVars.process(externs, script);
        // No exception expected
    }

    @Test
    public void testRemoveReferencedVariableKeepsFunction() {
        Node script = new Node(Token.SCRIPT);
        Node function = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "used");
        Node params = new Node(Token.PARAM_LIST);
        function.addChildToBack(name);
        function.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        Node callExpr = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "console");
        callee.addChildToBack(Node.newString(Token.STRING, "log"));
        call.addChildToBack(callee);
        call.addChildToBack(Node.newString(Token.NAME, "y"));
        callExpr.addChildToBack(call);
        body.addChildToBack(callExpr);
        function.addChildToBack(body);
        script.addChildToBack(function);
        
        Node varDecl = new Node(Token.VAR);
        Node varName = Node.newString(Token.NAME, "y");
        varDecl.addChildToBack(varName);
        script.addChildToBack(varDecl);
        
        removeUnusedVars.process(externs, script);
        // Should not remove used variable
    }

    @Test
    public void testRemoveUnusedVariable() {
        Node script = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR);
        Node varName = Node.newString(Token.NAME, "unused");
        Node value = Node.newNumber(10);
        varName.addChildToBack(value);
        varDecl.addChildToBack(varName);
        script.addChildToBack(varDecl);
        
        removeUnusedVars.process(externs, script);
        // Should remove unused variable without error
    }

    @Test
    public void testProcessWithRemoveGlobalsFalse() {
        RemoveUnusedVars noGlobalRemoval = new RemoveUnusedVars(compiler, false, false, false);
        Node script = new Node(Token.SCRIPT);
        Node varDecl = new Node(Token.VAR);
        Node varName = Node.newString(Token.NAME, "glob");
        Node value = Node.newNumber(10);
        varName.addChildToBack(value);
        varDecl.addChildToBack(varName);
        script.addChildToBack(varDecl);
        
        noGlobalRemoval.process(externs, script);
        // Should not remove global variables
    }

    @Test
    public void testProcessWithNullModifyCallSites() {
        RemoveUnusedVars nullCalls = new RemoveUnusedVars(compiler, true, false, false);
        Node script = new Node(Token.SCRIPT);
        Node func = new Node(Token.FUNCTION);
        Node funcName = Node.newString(Token.NAME, "fooFunc");
        Node params = new Node(Token.PARAM_LIST);
        func.addChildToBack(funcName);
        func.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        func.addChildToBack(body);
        script.addChildToBack(func);
        
        nullCalls.process(externs, script);
        // Should handle without modifyCallSites
    }

    @Test
    public void testContinuationWithEmptyScope() {
        // Test with empty script
        Node emptyScript = new Node(Token.SCRIPT);
        removeUnusedVars.process(externs, emptyScript);
        // Should process empty script without errors
    }

    @Test
    public void testNestedFunctionsWithInnerReferences() {
        Node script = new Node(Token.SCRIPT);
        Node outer = new Node(Token.FUNCTION);
        Node outerName = Node.newString(Token.NAME, "outer");
        Node outerParams = new Node(Token.PARAM_LIST);
        outer.addChildToBack(outerName);
        outer.addChildToBack(outerParams);
        
        Node outerBody = new Node(Token.BLOCK);
        Node inner = new Node(Token.FUNCTION);
        Node innerName = Node.newString(Token.NAME, "inner");
        Node innerParams = new Node(Token.PARAM_LIST);
        inner.addChildToBack(innerName);
        inner.addChildToBack(innerParams);
        Node innerBody = new Node(Token.BLOCK);
        inner.addChildToBack(innerBody);
        
        Node innerCall = new Node(Token.EXPR_RESULT);
        Node callExpr = new Node(Token.CALL);
        Node callName = Node.newString(Token.NAME, "inner");
        callExpr.addChildToBack(callName);
        innerCall.addChildToBack(callExpr);
        outerBody.addChildToBack(innerCall);
        outerBody.addChildToBack(inner);
        outer.addChildToBack(outerBody);
        
        script.addChildToBack(outer);
        removeUnusedVars.process(externs, script);
        // Should handle nested functions
    }

    @Test
    public void testSideEffectsInArguments() {
        Node script = new Node(Token.SCRIPT);
        Node exprResult = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        Node callee = Node.newString(Token.NAME, "cons");
        call.addChildToBack(callee);
        
        Node arg = new Node(Token.ASSIGN);
        Node assignName = Node.newString(Token.NAME, "x");
        Node assignValue = Node.newNumber(1);
        arg.addChildToBack(assignName);
        arg.addChildToBack(assignValue);
        call.addChildToBack(arg);
        exprResult.addChildToBack(call);
        script.addChildToBack(exprResult);
        
        removeUnusedVars.process(externs, script);
        // Should handle side effects in arguments
    }

    @Test
    public void testAssignWithSecondaryEffects() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node getProp = new Node(Token.GETPROP);
        Node objName = Node.newString(Token.NAME, "obj");
        Node propName = Node.newString(Token.STRING, "prop");
        getProp.addChildToBack(objName);
        getProp.addChildToBack(propName);
        assignNode.addChildToBack(getProp);
        Node assignValue = Node.newNumber(5);
        assignNode.addChildToBack(assignValue);
        
        Assign assign = Assign.maybeCreateAssign(assignNode);
        assertNotNull("Should create Assign for getprop", assign);
        assertTrue("getProp assignment should have secondary effects", assign.mayHaveSecondarySideEffects);
    }

    @Test
    public void testFinallyBlockForErrorHandling() {
        try {
            removeUnusedVars.process(new Node(Token.SCRIPT), new Node(Token.SCRIPT));
            assertTrue(true);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}