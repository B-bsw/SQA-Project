package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.HashSet;
import java.util.Set;

@RunWith(JUnit4.class)
public class FunctionInjectorTest {

    private FunctionInjector injector;
    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;
    private Node parse(String code) {
        // Simple parser for test purposes
        com.google.javascript.jscomp.parsing.ParserRunner.ParseResult result = 
            com.google.javascript.jscomp.parsing.ParserRunner.parse(
                new com.google.javascript.jscomp.parsing.Config.Builder().build(),
                code, null, 0, 0);
        return result.ast;
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        safeNameIdSupplier = new Supplier<String>() {
            private int counter = 0;
            @Override
            public String get() {
                return "temp" + (counter++);
            }
        };
        injector = new FunctionInjector(compiler, safeNameIdSupplier, true, false, false);
    }

    @Test
    public void testConstructorNullChecks() {
        try {
            new FunctionInjector(null, safeNameIdSupplier, true, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
        try {
            new FunctionInjector(compiler, null, true, false, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_InlinableFunction() {
        Node fnNode = parse("function f(x) { return x + 1; }");
        String fnName = "f";
        
        assertTrue(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_EmptyFunction() {
        Node fnNode = parse("function f() {}");
        String fnName = "f";
        
        assertTrue(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesArguments() {
        Node fnNode = parse("function f() { return arguments.length; }");
        String fnName = "f";
        
        assertFalse(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_NullBody() {
        Node fnNode = parse("function f()");
        String fnName = "f";
        
        assertFalse(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_ReferencesFnName() {
        Node fnNode = parse("function f() { return f; }");
        String fnName = "f";
        
        assertFalse(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testDoesFunctionMeetMinimumRequirements_Recursion() {
        Node fnNode = parse("function fact(n) { return n <= 1 ? 1 : n * fact(n - 1); }");
        String fnName = "fact";
        
        assertFalse(injector.doesFunctionMeetMinimumRequirements(fnName, fnNode));
    }

    @Test
    public void testCanInlineReferenceToFunction_SimpleCall() {
        Node callNode = parse("f()");
        Node fnNode = parse("function f() {}");
        Set<String> needAliases = new HashSet<>();
        
        assertEquals(FunctionInjector.CanInlineResult.YES,
            injector.canInlineReferenceToFunction(null, callNode, fnNode, needAliases, 
                FunctionInjector.InliningMode.DIRECT, false, false));
    }

    @Test
    public void testCanInlineReferenceToFunction_ContainsFunctionsInLoop() {
        Node callNode = parse("f()");
        Node fnNode = parse("function f() {}");
        Set<String> needAliases = new HashSet<>();
        
        FunctionInjector loopInjector = new FunctionInjector(compiler, safeNameIdSupplier, false, false, false);
        assertEquals(FunctionInjector.CanInlineResult.NO,
            loopInjector.canInlineReferenceToFunction(null, callNode, fnNode, needAliases, 
                FunctionInjector.InliningMode.DIRECT, false, true));
    }

    @Test
    public void testCanInlineReferenceToFunction_ThisNotStrict() {
        Node callNode = parse("f.call(this)");
        Node fnNode = parse("function f() {}");
        Set<String> needAliases = new HashSet<>();
        
        FunctionInjector nonStrict = new FunctionInjector(compiler, safeNameIdSupplier, true, false, false);
        assertEquals(FunctionInjector.CanInlineResult.NO,
            nonStrict.canInlineReferenceToFunction(null, callNode, fnNode, needAliases, 
                FunctionInjector.InliningMode.DIRECT, true, false));
    }

    @Test
    public void testSetKnownConstants_Normal() {
        Set<String> constants = Sets.newHashSet("A", "B");
        injector.setKnownConstants(constants);
        // Verify by testing with a function that references a constant
        Node fnNode = parse("function f() { return A; }");
        assertTrue(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
    }

    @Test
    public void testCanInlineReturnValue_Normal() {
        Node callNode = parse("f()");
        Node fnNode = parse("function f() { return 5; }");
        
        Node result = injector.inline(callNode, "f", fnNode, FunctionInjector.InliningMode.DIRECT);
        assertNotNull(result);
    }

    @Test
    public void testClassifyCallSite_SimpleCall() {
        Node expr = parse("f()");
        Node callNode = expr;
        // Find call node
        Node call = null;
        while (call == null) {
            if (expr.isCall()) {
                call = expr;
            } else {
                expr = expr.getFirstChild();
            }
        }
        
        FunctionInjector.CallSiteType type = injector.classifyCallSite(call);
        assertEquals(FunctionInjector.CallSiteType.SIMPLE_CALL, type);
    }

    @Test
    public void testClassifyCallSite_Unsupported() {
        Node expr = parse("a + f()");
        Node call = null;
        while (call == null) {
            if (expr.isCall()) {
                call = expr;
            } else {
                expr = expr.getFirstChild();
            }
        }
        
        FunctionInjector.CallSiteType type = injector.classifyCallSite(call);
        assertEquals(FunctionInjector.CallSiteType.EXPRESSION, type);
    }

    @Test
    public void testCanInlineReferenceDirectly_MultipleStatements() {
        Node fnNode = parse("function f() { var a; var b; }");
        assertFalse(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testCanInlineReferenceDirectly_SingleStatement() {
        Node fnNode = parse("function f() { return 5; }");
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testCanInlineReferenceDirectly_EmptyBody() {
        Node fnNode = parse("function f() {}");
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    @Test
    public void testCanInlineReferenceDirectly_ReturnWithNoValue() {
        Node fnNode = parse("function f() { return; }");
        assertTrue(injector.isDirectCallNodeReplacementPossible(fnNode));
    }

    private static class TestCompiler extends AbstractCompiler {
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.stage = stage;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return CodingConventions.getDefault();
        }

        @Override
        public void report(CheckLevel level, JSError error) {
            // no-op
        }

        @Override
        public void reportCodeChange() {
            // no-op
        }

        @Override
        public boolean hasCodeChanged() {
            return false;
        }

        @Override
        public void addChangeHandler(ChangeHandler handler) {
            // no-op
        }

        @Override
        public void removeChangeHandler(ChangeHandler handler) {
            // no-op
        }

        @Override
        public String getSourceFile(String sourceName) {
            return null;
        }

        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return null;
        }

        @Override
        public String getSourceLineCount(String sourceName) {
            return "0";
        }

        @Override
        public String getErrorReport() {
            return null;
        }

        @Override
        public void clearErrorReport() {
            // no-op
        }

        @Override
        public TypeValidator getTypeValidator() {
            return null;
        }

        @Override
        public ErrorManager getErrorManager() {
            return null;
        }

        @Override
        public Node getOldNode(Node node) {
            return null;
        }

        @Override
        public void clearOldNodes() {
            // no-op
        }

        @Override
        public void process(SourceFile[] externs, SourceFile[] code, CompilerOptions options) {
            // no-op
        }

        @Override
        public void process(SourceFile[] externs, SourceFile[] code, CompilerOptions options, Node root) {
            // no-op
        }

        @Override
        public CompilerOptions getOptions() {
            return new CompilerOptions();
        }

        @Override
        public void setOptions(CompilerOptions options) {
            // no-op
        }

        @Override
        public Instrumentation getInstrumentation() {
            return null;
        }

        @Override
        public void setInstrumentation(Instrumentation instrumentation) {
            // no-op
        }

        @Override
        public void process(SourceFile extern, SourceFile code, boolean inBrowser) {
            // no-op
        }

        @Override
        public void setOldNode(Node node) {
            // no-op
        }
    }
}