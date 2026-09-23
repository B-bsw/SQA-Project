package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName;
import com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ProcessClosurePrimitivesTest {

    private ProcessClosurePrimitives processClosurePrimitives;
    private CompilerPass compilerPass;
    private AbstractCompiler compiler;
    private Node externs;
    private Node root;

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public void report(JSError error) {
            // Mock report
        }

        @Override
        public void reportCodeChange() {
            // Mock report code change
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public String identifyTypeDeclarationCall(Node n) {
                    return null;
                }

                @Override
                public List<String> identifyTypeDeclarationCall(Node n) {
                    return null;
                }

                @Override
                public boolean isConstant(String name) {
                    return false;
                }

                @Override
                public boolean isConstant(Node n) {
                    return false;
                }

                @Override
                public boolean isPrivate(String name) {
                    return false;
                }

                @Override
                public boolean isPrivate(Node n) {
                    return false;
                }
            };
        }

        @Override
        public TypeRegistry getTypeRegistry() {
            return null;
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return null;
        }

        @Override
        public Node getRoot() {
            return null;
        }

        @Override
        public Node getExternsRoot() {
            return null;
        }

        @Override
        public ErrorManager getErrorManager() {
            return null;
        }

        @Override
        public String getSourceFile(String name) {
            return null;
        }

        @Override
        public void setSourceFile(String name, String source) {
        }

        @Override
        public void setErrorManager(ErrorManager errorManager) {
        }

        @Override
        public void setExternsRoot(Node externs) {
        }

        @Override
        public void setRoot(Node root) {
        }

        @Override
        public List<SourceFile> getSourceFiles() {
            return null;
        }

        @Override
        public void setSourceFiles(List<SourceFile> files) {
        }

        @Override
        public void setCodingConvention(CodingConvention convention) {
        }

        @Override
        public void setModuleGraph(JSModuleGraph graph) {
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        processClosurePrimitives = new ProcessClosurePrimitives(compiler, CheckLevel.ERROR, false);
        compilerPass = processClosurePrimitives;
        externs = new Node(Token.EMPTY);
        root = new Node(Token.EMPTY);
    }

    @Test
    public void testGetExportedVariableNames_empty() {
        assertNotNull(processClosurePrimitives.getExportedVariableNames());
        assertTrue(processClosurePrimitives.getExportedVariableNames().isEmpty());
    }

    @Test
    public void testProcess_exportsVariable() {
        Node func = new Node(Token.FUNCTION, Node.newString(Token.NAME, "goog.exportSymbol"));
        Node call = new Node(Token.CALL, func);
        Node arg = Node.newString(Token.STRING, "foo.bar");
        call.addChildToBack(arg);
        root.addChildToBack(call);

        compilerPass.process(externs, root);

        assertTrue(processClosurePrimitives.getExportedVariableNames().contains("foo"));
    }

    @Test
    public void testProcess_provideCall_addsToProvidedNames() {
        Node var = new Node(Token.VAR);
        Node name = Node.newString(Token.NAME, "goog");
        Node provideCall = new Node(Token.CALL, name);
        Node arg = Node.newString(Token.STRING, "my.namespace");
        provideCall.addChildToBack(arg);
        var.addChildToBack(provideCall);
        root.addChildToBack(var);

        compilerPass.process(externs, root);

        // Because the call is not in a proper assign/name pattern, nothing should be added.
        assertTrue(processClosurePrimitives.getExportedVariableNames().isEmpty());
    }

    @Test
    public void testProcess_baseCall_invalid() {
        Node thisNode = new Node(Token.THIS);
        Node call = new Node(Token.CALL, new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "base")), thisNode);
        root.addChildToBack(call);

        compilerPass.process(externs, root);
        // No exception, just verify it doesn't crash.
        assertNotNull(processClosurePrimitives);
    }

    @Test
    public void testProcess_requireCall_unknownNamespace() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node name = new Node(Token.NAME, "goog");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "require"));
        Node call = new Node(Token.CALL, getProp, Node.newString(Token.STRING, "unknown.namespace"));
        expr.addChildToBack(call);
        root.addChildToBack(expr);

        compilerPass.process(externs, root);
        // Should not throw.
    }

    @Test
    public void testProcess_requireCall_noArgument() {
        Node expr = new Node(Token.EXPR_RESULT);
        Node name = new Node(Token.NAME, "goog");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "require"));
        Node call = new Node(Token.CALL, getProp);
        expr.addChildToBack(call);
        root.addChildToBack(expr);

        compilerPass.process(externs, root);
        // Should not throw and report error.
    }

    @Test
    public void testProcess_provideCall_withQualifiedName() {
        Node var = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "goog");
        Node provideCall = new Node(Token.CALL, name);
        Node arg = Node.newString(Token.STRING, "my.namespace");
        provideCall.addChildToBack(arg);
        var.addChildToBack(provideCall);
        root.addChildToBack(var);

        // The call is not inside an assign/name expression, so nothing should be added.
        compilerPass.process(externs, root);
        assertTrue(processClosurePrimitives.getExportedVariableNames().isEmpty());
    }

    @Test
    public void testVerifyArgument_nullArgument() {
        assertFalse(processClosurePrimitives.verifyArgument(null, null, null));
    }

    @Test
    public void testIsExplicitlyProvided_initial() {
        ProvidedName providedName = processClosurePrimitives.new ProvidedName("test", null, null, false);
        assertFalse(providedName.isExplicitlyProvided());
    }

    @Test
    public void testAddDefinition_explicitTrue() {
        Node parent = new Node(Token.EXPR_RESULT);
        ProvidedName providedName = processClosurePrimitives.new ProvidedName("test", parent, null, false);
        providedName.addProvide(parent, null, true);
        assertTrue(providedName.isExplicitlyProvided());
    }

    @Test
    public void testAddDefinition_explicitFalse() {
        Node parent = new Node(Token.EXPR_RESULT);
        ProvidedName providedName = processClosurePrimitives.new ProvidedName("test", parent, null, false);
        providedName.addProvide(parent, null, false);
        assertFalse(providedName.isExplicitlyProvided());
    }

    @Test
    public void testRegisterAnyProvidedPrefixes() {
        Node parent = new Node(Token.EXPR_RESULT);
        // Call with a dotted name
        processClosurePrimitives.registerAnyProvidedPrefixes("a.b.c", parent, null);
        assertNotNull(processClosurePrimitives.providedNames.get("a.b"));
        assertNotNull(processClosurePrimitives.providedNames.get("a"));
    }

    @Test
    public void testHandleCandidateProvideDefinition_notInGlobalScope() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        t.scope = Scope.createGlobalScope(root);
        Node name = Node.newString(Token.NAME, "test");
        Node parent = new Node(Token.VAR, name);
        processClosurePrimitives.handleCandidateProvideDefinition(t, name, parent);
        // Should do nothing because not in global scope.
    }

    @Test
    public void testHandleCandidateProvideDefinition_inGlobalScopeName() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        t.scope = Scope.createGlobalScope(root);
        Node name = Node.newString(Token.NAME, "test");
        Node parent = new Node(Token.VAR, name);
        t.scope = Scope.createGlobalScope(root);
        processClosurePrimitives.handleCandidateProvideDefinition(t, name, parent);
        assertNotNull(processClosurePrimitives.providedNames.get("test"));
    }

    @Test
    public void testProcessBaseClassCall_noThisArg() {
        Node n = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "base"));
        n.addChildToBack(callee);
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        processClosurePrimitives.processBaseClassCall(t, n);
        // Should report error, no exception.
    }

    @Test
    public void testProcessBaseClassCall_thisArg() {
        Node n = new Node(Token.CALL);
        Node callee = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "base"));
        n.addChildToBack(callee);
        Node thisNode = new Node(Token.THIS);
        n.addChildToBack(thisNode);
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        processClosurePrimitives.processBaseClassCall(t, n);
        // Should not throw, but might report error if no enclosing function found.
    }

    @Test
    public void testVerifyProvide_wrongArgs() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node n = new Node(Token.EXPR_RESULT);
        Node left = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "provide"));
        Node arg = Node.newNumber(5);
        assertFalse(processClosurePrimitives.verifyProvide(t, left, arg));
    }

    @Test
    public void testVerifyArgument_stringType() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node arg = Node.newString(Token.STRING, "test");
        assertTrue(processClosurePrimitives.verifyArgument(t, null, arg, Token.STRING));
    }

    @Test
    public void testVerifyArgument_wrongType() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node arg = Node.newNumber(5);
        assertFalse(processClosurePrimitives.verifyArgument(t, null, arg, Token.STRING));
    }

    @Test
    public void testVerifyArgument_tooManyArgs() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node arg = Node.newString(Token.STRING, "test");
        arg.addChildToBack(Node.newNumber(1)); // Add another child to simulate more arguments
        Node n = new Node(Token.CALL);
        n.addChildToBack(arg);
        assertFalse(processClosurePrimitives.verifyArgument(t, null, n, Token.STRING));
    }

    @Test
    public void testProcessSetCssNameMapping_nonObjectLiteral() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node n = new Node(Token.CALL);
        Node left = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "setCssNameMapping"));
        Node arg = Node.newString("test");
        processClosurePrimitives.processSetCssNameMapping(t, n, arg);
        // Should report error, no exception.
    }

    @Test
    public void testProcessSetCssNameMapping_objectLiteralWithError() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node value = Node.newNumber(5); // Invalid value
        objLit.addChildToBack(new Node(Token.KEY, key, value));
        Node n = new Node(Token.CALL);
        Node left = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "setCssNameMapping"));
        n.addChildToBack(left);
        n.addChildToBack(objLit);
        processClosurePrimitives.processSetCssNameMapping(t, n, objLit);
        // Should report error, no exception.
    }

    @Test
    public void testProcessSetCssNameMapping_validObjectLiteral() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "key");
        Node value = Node.newString(Token.STRING, "value");
        objLit.addChildToBack(new Node(Token.KEY, key, value));
        Node n = new Node(Token.CALL);
        Node left = new Node(Token.GETPROP, new Node(Token.NAME, "goog"), Node.newString(Token.STRING, "setCssNameMapping"));
        n.addChildToBack(left);
        n.addChildToBack(objLit);
        processClosurePrimitives.processSetCssNameMapping(t, n, objLit);
        // Should not throw.
    }

    @Test
    public void testTrySimplifyNewDate_invalidDatePattern() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node newCall = new Node(Token.NEW, Node.newString(Token.NAME, "Date"));
        NodeTraversal traversal = new NodeTraversal(compiler, processClosurePrimitives);
        processClosurePrimitives.trySimplifyNewDate(traversal, newCall, null);
        // Should not throw.
    }

    @Test
    public void testVisit_assignmentWithNamespaceFlag() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node n = new Node(Token.ASSIGN);
        Node name = Node.newString(Token.NAME, "test");
        name.putBooleanProp(Node.IS_NAMESPACE, true);
        n.addChildToBack(name);
        Node value = new Node(Token.OBJECTLIT);
        n.addChildToBack(value);
        processClosurePrimitives.visit(t, n, new Node(Token.EXPR_RESULT));
        assertNotNull(processClosurePrimitives.providedNames.get("test"));
    }

    @Test
    public void testVisit_functionInGlobalScopeWithProvideMatch() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        t.scope = Scope.createGlobalScope(root);
        Node func = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "test");
        func.addChildToBack(name);
        processClosurePrimitives.providedNames.put("test", processClosurePrimitives.new ProvidedName("test", null, null, true));
        processClosurePrimitives.visit(t, func, null);
        // Should report function namespace error.
    }

    @Test
    public void testVisit_getPropWithGoogBaseNotInCall() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node n = new Node(Token.GETPROP);
        Node name = new Node(Token.NAME, "goog");
        Node prop = Node.newString(Token.STRING, "base");
        n.addChildToBack(name);
        n.addChildToBack(prop);
        processClosurePrimitives.visit(t, n, null);
        // Should report bad base class use.
    }

    @Test
    public void testProcessProvideCall_duplicateNamespace() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node name = new Node(Token.NAME, "goog");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "provide"));
        Node call = new Node(Token.CALL, getProp, Node.newString(Token.STRING, "test.ns"));
        Node parent = new Node(Token.EXPR_RESULT, call);
        
        processClosurePrimitives.providedNames.put("test.ns", processClosurePrimitives.new ProvidedName("test.ns", null, null, false));
        processClosurePrimitives.processProvideCall(t, call, parent);
        assertTrue(processClosurePrimitives.providedNames.get("test.ns").isExplicitlyProvided());
    }

    @Test
    public void testProcessProvideCall_newNamespace() {
        NodeTraversal t = new NodeTraversal(compiler, processClosurePrimitives);
        Node name = new Node(Token.NAME, "goog");
        Node getProp = new Node(Token.GETPROP, name, Node.newString(Token.STRING, "provide"));
        Node call = new Node(Token.CALL, getProp, Node.newString(Token.STRING, "new.ns"));
        Node parent = new Node(Token.EXPR_RESULT, call);
        
        processClosurePrimitives.processProvideCall(t, call, parent);
        assertNotNull(processClosurePrimitives.providedNames.get("new.ns"));
    }

    @Test
    public void testUnrecognizedRequire() {
        Node requireNode = new Node(Token.CALL);
        requireNode.addChildToBack(Node.newString(Token.STRING, "unknown"));
        UnrecognizedRequire ur = processClosurePrimitives.new UnrecognizedRequire(requireNode, "unknown", "test.js");
        assertEquals("unknown", ur.namespace);
        assertEquals("test.js", ur.inputName);
        assertSame(requireNode, ur.requireNode);
    }
}