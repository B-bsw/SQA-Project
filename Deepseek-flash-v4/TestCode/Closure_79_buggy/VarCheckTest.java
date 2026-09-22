package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class VarCheckTest {
    private MockCompiler compiler;
    private VarCheck varCheck;

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        varCheck = new VarCheck(compiler, false);
    }

    // ---------- Helper: NodeTraversal with recordable report ----------
    private static class TestNodeTraversal extends NodeTraversal {
        List<Object[]> reported = new ArrayList<>();
        Scope scope;
        CompilerInput input;
        boolean isExtern;

        TestNodeTraversal(AbstractCompiler c) {
            super(c, null);
        }

        @Override
        public Scope getScope() { return scope; }
        @Override
        public CompilerInput getInput() { return input; }
        @Override
        public void report(Node n, DiagnosticType type, String... arguments) {
            reported.add(new Object[]{n, type, arguments});
        }
    }

    // ---------- Mock helpers ----------
    private static class MockCompiler extends AbstractCompiler {
        CodingConvention convention = new CodingConvention() {
            @Override public boolean isConstant(String name) { return false; }
        };
        JSModuleGraph moduleGraph;
        CheckLevel errorLevel = CheckLevel.WARNING;

        @Override public CodingConvention getCodingConvention() { return convention; }
        @Override public JSModuleGraph getModuleGraph() { return moduleGraph; }
        @Override public CheckLevel getErrorLevel(JSError error) { return errorLevel; }
        @Override public CompilerInput newExternInput(String name) { return new MockCompilerInput(); }
        // unused abstract methods – stub
        @Override public void report(JSError error) {}
        @Override public void reportCodeChange() {}
        @Override public String getSourceLine(String sourceName, int lineNumber) { return null; }
        @Override public com.google.javascript.rhino.SourcePosition getSourcePosition(String sourceName, int lineNumber) { return null; }
    }

    private static class MockCompilerInput extends CompilerInput {
        JSModule module;
        MockCompilerInput() { super(null); }
        @Override public JSModule getModule() { return module; }
        @Override public boolean isExtern() { return false; }
    }

    private static class MockJSModule extends JSModule {
        String name;
        MockJSModule(String name) { super(name); this.name = name; }
        @Override public String getName() { return name; }
    }

    private static class MockJSModuleGraph extends JSModuleGraph {
        List<JSModule> modules;
        MockJSModuleGraph() { super(null); }
        @Override public boolean dependsOn(JSModule from, JSModule to) {
            // Hardcoded for tests: depends if from.name contains "to"
            return from.getName().contains(to.getName());
        }
    }

    // ---------- Tests ----------
    @Test
    public void testUndefinedVar() {
        Node nameNode = Node.newString(Token.NAME, "undefinedVar");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) { return null; }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return true; }
            @Override public String getRootNodeName() { return "global"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };
        t.input = new MockCompilerInput();

        varCheck.visit(t, nameNode, parent);

        assertEquals(1, t.reported.size());
        Object[] report = t.reported.get(0);
        assertEquals(VarCheck.UNDEFINED_VAR_ERROR, report[1]);
        assertEquals("undefinedVar", ((String[])(report[2]))[0]);
    }

    @Test(expected = IllegalStateException.class)
    public void testUndefinedVarSanityCheck() {
        VarCheck sanityCheck = new VarCheck(compiler, true);
        Node nameNode = Node.newString(Token.NAME, "undefinedVar");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) { return null; }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return true; }
            @Override public String getRootNodeName() { return "global"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };
        t.input = new MockCompilerInput();

        sanityCheck.visit(t, nameNode, parent);
    }

    @Test
    public void testDefinedVar() {
        Node nameNode = Node.newString(Token.NAME, "definedVar");
        Node varNode = new Node(Token.VAR, nameNode);
        MockCompilerInput input = new MockCompilerInput();
        MockCompilerInput sameInput = input; // same object

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) {
                return new Scope.Var() {
                    @Override public Node getNameNode() { return nameNode; }
                    @Override public CompilerInput getInput() { return sameInput; }
                    @Override public String getGlobalName() { return name; }
                    @Override public Node getParentNode() { return null; }
                    @Override public Scope getScope() { return this; }
                    @Override public boolean isGlobal() { return false; }
                    @Override public boolean isLocal() { return true; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getName() { return name; }
                };
            }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return false; }
            @Override public String getRootNodeName() { return "local"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };
        t.input = input;

        varCheck.visit(t, nameNode, varNode);
        assertTrue(t.reported.isEmpty());
    }

    @Test
    public void testEmptyNameFunctionDeclaration() {
        Node nameNode = Node.newString(Token.NAME, "");
        Node funcNode = new Node(Token.FUNCTION, nameNode);

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) { return null; }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return true; }
            @Override public String getRootNodeName() { return "global"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };
        t.input = new MockCompilerInput();

        varCheck.visit(t, nameNode, funcNode);
        assertEquals(1, t.reported.size());
        assertEquals(VarCheck.INVALID_FUNCTION_DECL, t.reported.get(0)[1]);
    }

    @Test
    public void testViolatedModuleDep() {
        JSModule currModule = new MockJSModule("modA");
        JSModule varModule = new MockJSModule("modB");
        MockCompilerInput currInput = new MockCompilerInput();
        currInput.module = currModule;
        MockCompilerInput varInput = new MockCompilerInput();
        varInput.module = varModule;

        compiler.errorLevel = CheckLevel.ERROR; // to make strictExternCheck false (no effect on module check)

        // Module graph: varModule depends on currModule (reverse of desired)
        MockJSModuleGraph graph = new MockJSModuleGraph();
        graph.modules = new ArrayList<>();
        graph.modules.add(currModule);
        graph.modules.add(varModule);
        // dependsOn(modB, modA) => true -> VIOLATED_MODULE_DEP_ERROR
        // we want modA cannot reference modB, so we need dependsOn(currModule, varModule) == false
        // and dependsOn(varModule, currModule) == true
        // In our MockJSModuleGraph, dependsOn returns true if from name contains to name
        // So if currModule name is "modA" and varModule name is "modB", dependsOn("modA","modB") = false (no "modB" in "modA")
        // dependsOn("modB","modA") = true (because "modB" contains "modA"? No, "modB" does not contain "modA")
        // We need to adjust naming: currModule = "AA", varModule = "ABA" so that varModule contains currModule?
        // Actually we want dependsOn(varModule, currModule) == true -> VIOLATED_MODULE_DEP_ERROR
        // Let's set currModule name = "A", varModule name = "AB" (contains "A")
        currModule.name = "A";
        varModule.name = "AB";
        compiler.moduleGraph = graph;

        Node nameNode = Node.newString(Token.NAME, "someVar");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.input = currInput;
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) {
                return new Scope.Var() {
                    @Override public Node getNameNode() { return nameNode; }
                    @Override public CompilerInput getInput() { return varInput; }
                    @Override public String getGlobalName() { return name; }
                    @Override public Node getParentNode() { return null; }
                    @Override public Scope getScope() { return this; }
                    @Override public boolean isGlobal() { return false; }
                    @Override public boolean isLocal() { return true; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getName() { return name; }
                };
            }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return true; }
            @Override public String getRootNodeName() { return "global"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };

        varCheck.visit(t, nameNode, parent);

        assertEquals(1, t.reported.size());
        assertEquals(VarCheck.VIOLATED_MODULE_DEP_ERROR, t.reported.get(0)[1]);
    }

    @Test
    public void testMissingModuleDep() {
        JSModule currModule = new MockJSModule("X");
        JSModule varModule = new MockJSModule("Y");
        MockCompilerInput currInput = new MockCompilerInput();
        currInput.module = currModule;
        MockCompilerInput varInput = new MockCompilerInput();
        varInput.module = varModule;

        compiler.errorLevel = CheckLevel.ERROR;
        MockJSModuleGraph graph = new MockJSModuleGraph();
        graph.modules = new ArrayList<>();
        graph.modules.add(currModule);
        graph.modules.add(varModule);
        // dependsOn("X","Y") = false (no "Y" in "X"), dependsOn("Y","X") = false (no "X" in "Y")
        compiler.moduleGraph = graph;

        Node nameNode = Node.newString(Token.NAME, "someVar");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);

        TestNodeTraversal t = new TestNodeTraversal(compiler);
        t.input = currInput;
        t.scope = new Scope() {
            @Override public Scope.Var getVar(String name) {
                return new Scope.Var() {
                    @Override public Node getNameNode() { return nameNode; }
                    @Override public CompilerInput getInput() { return varInput; }
                    @Override public String getGlobalName() { return name; }
                    @Override public Node getParentNode() { return null; }
                    @Override public Scope getScope() { return this; }
                    @Override public boolean isGlobal() { return false; }
                    @Override public boolean isLocal() { return true; }
                    @Override public int getIndex() { return 0; }
                    @Override public String getName() { return name; }
                };
            }
            @Override public Scope getGlobalScope() { return this; }
            @Override public boolean isGlobal() { return true; }
            @Override public String getRootNodeName() { return "global"; }
            @Override public Scope getParent() { return null; }
            @Override public int getDepth() { return 0; }
        };

        varCheck.visit(t, nameNode, parent);

        assertEquals(1, t.reported.size());
        assertEquals(VarCheck.MISSING_MODULE_DEP_ERROR, t.reported.get(0)[1]);
    }
}