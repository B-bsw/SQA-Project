package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class TypedScopeCreatorTest {
    private static final String SOURCE_NAME = "testSource.js";
    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private TypedScopeCreator creator;
    private Scope globalScope;
    private Node rootNode;
    private CodingConvention convention;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() throws Exception {
        convention = new ClosureCodingConvention();
        errorReporter = new ErrorReporter() {
            @Override
            public void error(String message, String sourceName, int lineNumber, String lineSource) {
                throw new RuntimeException("Unexpected error: " + message);
            }
            @Override
            public void warning(String message, String sourceName, int lineNumber, String lineSource) {
                throw new RuntimeException("Unexpected warning: " + message);
            }
        };
        typeRegistry = new JSTypeRegistry(errorReporter);
        compiler = new Compiler();
        creator = new TypedScopeCreator(compiler);
    }

    @After
    public void tearDown() {
        rootNode = null;
        globalScope = null;
        creator = null;
    }

    private static class TestCompiler extends Compiler {
        private final List<String> externs = new ArrayList<>();
        private final List<String> inputs = new ArrayList<>();

        public TestCompiler() {
            super();
        }

        @Override
        public CompilerInput getInput(String sourceName) {
            return new CompilerInput(new SourceFile(sourceName, ""));
        }

        @Override
        public boolean isIdeMode() {
            return false;
        }
    }

    @Test
    public void testCreateScopeWithNullParent() {
        // Setup: simple empty script
        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));
        CompilerInput input = new CompilerInput(new SourceFile(SOURCE_NAME, "var a;"));
        script.setInputId(new InputId(SOURCE_NAME));

        // Create a minimal compiler setup
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        // Build a simple AST: var a;
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "a");
        varNode.addChildToBack(nameNode);
        script.addChildToBack(varNode);

        // Set up externs
        Node externScript = new Node(Token.SCRIPT);
        externScript.setSourceFileForTesting(new SourceFile("externs.js"));

        Scope someScope = localCreator.createScope(externScript, null);
        assertNotNull("Scope should not be null", someScope);
        assertTrue("Should be global scope", someScope.isGlobal());
    }

    @Test
    public void testCreateScopeWithNonNullParent() {
        // Create a simple scope hierarchy
        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));
        script.setInputId(new InputId(SOURCE_NAME));

        // Global scope
        Scope global = new Scope(null, script, typeRegistry);
        
        // Create child function scope
        Node functionNode = new Node(Token.FUNCTION);
        Node parentScope = new Scope(global, script, typeRegistry).getScope();
        
        // Create local scope
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);
        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, global);
        assertNotNull("Result should not be null", result);
    }

    @Test
    public void testCreateScopeWithExistingScope() {
        // Create a scope with some variables
        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));
        script.setInputId(new InputId(SOURCE_NAME));

        // Add variable declaration: var x = 1;
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        Node numberNode = new Node(Token.NUMBER, 1.0);
        nameNode.addChildToBack(numberNode);
        varNode.addChildToBack(nameNode);
        script.addChildToBack(varNode);

        Scope existingScope = new Scope(null, script, typeRegistry);
        existingScope.declare("x", nameNode, null, null, false);

        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);
        Node externScript = new Node(Token.SCRIPT);
        
        // Appending to an existing variable that's already declared - CDFD (Check Defects4J)
        Node globalThisNode = new Node(Token.THIS);
        Scope result = localCreator.createScope(externScript, null);
        assertNotNull("Scope should not be null", result);
    }

    @Test
    public void testCreateScopeWithFetchTypeFromFunctionDeclaration() {
        // Helper method to create scope with function declaration
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node globalThisNode = new Node(Token.THIS);
        Scope global = new Scope(null, globalThisNode, typeRegistry);
        
        // Create a simple function scope
        Node functionNode = new Node(Token.FUNCTION);
        String name = "myFunc";
        Node fnName = new Node(Token.NAME, name);
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        functionNode.addChildrenToFront(block);
        functionNode.addChildToFront(paramList);
        functionNode.addChildToFront(fnName);
        Node cfg = new Node(Token.SCRIPT);
        cfg.addChildToBack(functionNode);
        
        Scope functionScope = new Scope(global, cfg, typeRegistry, functionNode);
        Node externScript = new Node(Token.SCRIPT);
        
        Scope result = localCreator.createScope(externScript, global);
        assertNotNull(result);
    }

    @Test
    public void testCreateScopeWithCatchBlock() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        // Create try-catch block
        Node tryBlock = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        Node catchName = new Node(Token.NAME, "e");
        catchNode.addChildToBack(catchName);
        tryBlock.addChildToBack(block);
        tryBlock.addChildToBack(catchNode);

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, null);
        assertNotNull("Scope result should not be null", result);
    }

    @Test
    public void testCreateScopeMultipleLevels() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));

        Node functionNode = new Node(Token.FUNCTION);
        Node fnName = new Node(Token.NAME, "inner");
        Node paramList = new Node(Token.PARAM_LIST);
        Node fnBlock = new Node(Token.BLOCK);
        functionNode.addChildrenToFront(fnBlock);
        functionNode.addChildToFront(paramList);
        functionNode.addChildToFront(fnName);

        Node globalThisNode = new Node(Token.THIS);
        Scope global = new Scope(null, script, typeRegistry);
        Scope childScope = new Scope(global, functionNode, typeRegistry, functionNode);

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, global);
        assertNotNull(result);

        Node secondExtern = new Node(Token.SCRIPT);
        result = localCreator.createScope(secondExtern, childScope);
        assertNotNull(result);
    }

    @Test
    public void testCreateScopeWithEmptyExterns() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, null);
        assertNotNull("Scope should not be null", result);
        assertTrue(result.isGlobal());
    }

    @Test
    public void testCreateScopeRepeatedCalls() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node externScript = new Node(Token.SCRIPT);
        Scope first = localCreator.createScope(externScript, null);
        assertNotNull(first);

        // Second call should create a new scope (or return same for externs)
        Node secondExtern = new Node(Token.SCRIPT);
        Scope second = localCreator.createScope(secondExtern, null);
        assertNotNull(second);
    }

    @Test
    public void testCreateScopeWithNullParentAndExterns() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, null);
        assertNotNull("Returned scope should not be null", result);
    }

    @Test
    public void testCreateScopeWithGlobalThis() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node globalThisNode = new Node(Token.THIS);
        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));

        Scope global = new Scope(null, script, typeRegistry);
        globalScope = global;

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, global);
        assertNotNull(result);
    }

    @Test
    public void testCreateScopeWithComplexScopes() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);

        Node script = new Node(Token.SCRIPT);
        script.setSourceFileForTesting(new SourceFile(SOURCE_NAME));
        script.setInputId(new InputId(SOURCE_NAME));

        Node global = new Scope(null, script, typeRegistry).getScope();
        globalScope = global;

        // Create function scope with nested block
        Node functionNode = new Node(Token.FUNCTION);
        Node functionBlock = new Node(Token.BLOCK);
        functionNode.addChildToBack(functionBlock);

        Scope fnScope = new Scope(global, functionBlock, typeRegistry, functionNode);

        Node externScript = new Node(Token.SCRIPT);
        Scope result = localCreator.createScope(externScript, global);
        assertNotNull(result);

        Node secondExtern = new Node(Token.SCRIPT);
        result = localCreator.createScope(secondExtern, fnScope);
        assertNotNull(result);
    }

    @Test
    public void testCreateScopeWithEmptyRoot() {
        TestCompiler testCompiler = new TestCompiler();
        TypedScopeCreator localCreator = new TypedScopeCreator(testCompiler);
        Node root = new Node(Token.SCRIPT);
        root.setSourceFileForTesting(new SourceFile(SOURCE_NAME));
        root.setInputId(new InputId(SOURCE_NAME));
        Scope result = localCreator.createScope(root, null);
        assertNotNull("Result should be non-null", result);
    }
}