package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class TypedScopeCreatorTest {

    private TypedScopeCreator creator;
    private AbstractCompiler compiler;
    private ScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        creator = new TypedScopeCreator(compiler);
        scopeCreator = creator;
    }

    @After
    public void tearDown() {
        compiler = null;
        creator = null;
        scopeCreator = null;
    }

    @Test
    public void testCreateScopeWithNullParent() {
        Node root = new Node(Token.SCRIPT);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateScopeNullInput() {
        scopeCreator.createScope(null, null);
    }

    @Test
    public void testCreateScopeWithNonNullParent() {
        Node root = new Node(Token.SCRIPT);
        Scope parent = new Scope(null, root);
        Scope scope = scopeCreator.createScope(root, parent);
        assertNotNull(scope);
        assertNotNull(scope.getParent());
        assertEquals(parent, scope.getParent());
    }

    @Test
    public void testCreateScopeWithGlobalFunction() {
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        root.addChildToFront(fnNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithVar() {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "testVar");
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithEmptyNameVar() {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "");
        varNode.addChildToFront(nameNode);
        root.addChildToFront(varNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithCatchBlock() {
        Node root = new Node(Token.SCRIPT);
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME, "e");
        catchNode.addChildToFront(nameNode);
        root.addChildToFront(catchNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithAssign() {
        Node root = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node targetNode = new Node(Token.NAME, "x");
        Node valueNode = new Node(Token.NUMBER, 5);
        assignNode.addChildToFront(targetNode);
        assignNode.addChildToFront(valueNode);
        root.addChildToFront(assignNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithExpressionResult() {
        Node root = new Node(Token.SCRIPT);
        Node exprNode = new Node(Token.EXPR_RESULT);
        Node addNode = new Node(Token.ADD);
        Node numNode1 = new Node(Token.NUMBER, 1);
        Node numNode2 = new Node(Token.NUMBER, 2);
        addNode.addChildToFront(numNode1);
        addNode.addChildToFront(numNode2);
        exprNode.addChildToFront(addNode);
        root.addChildToFront(exprNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithGetProp() {
        Node root = new Node(Token.SCRIPT);
        Node getPropNode = new Node(Token.GETPROP);
        Node objNode = new Node(Token.NAME, "obj");
        Node propNode = new Node(Token.STRING, "prop");
        getPropNode.addChildToFront(objNode);
        getPropNode.addChildToFront(propNode);
        root.addChildToFront(getPropNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithNew() {
        Node root = new Node(Token.SCRIPT);
        Node newNode = new Node(Token.NEW);
        Node nameNode = new Node(Token.NAME, "Foo");
        newNode.addChildToFront(nameNode);
        root.addChildToFront(newNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithObjectLiteral() {
        Node root = new Node(Token.SCRIPT);
        Node objLitNode = new Node(Token.OBJECTLIT);
        Node keyNode = new Node(Token.STRING, "key");
        Node valueNode = new Node(Token.NUMBER, 1);
        objLitNode.addChildToFront(keyNode);
        objLitNode.addChildToFront(valueNode);
        root.addChildToFront(objLitNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithMultipleVarDeclarations() {
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node name1 = new Node(Token.NAME, "a");
        Node name2 = new Node(Token.NAME, "b");
        varNode.addChildToFront(name1);
        varNode.addChildToFront(name2);
        root.addChildToFront(varNode);
        Scope scope = scopeCreator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testDiscoverEnumsWithEnumName() {
        Node root = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "myEnum");
        root.addChildToFront(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, new AbstractShallowCallback() {
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        creator.new DiscoverEnums().visit(t, nameNode, null);
    }

    @Test
    public void testDiscoverEnumsWithAssignToNamedType() {
        Node root = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node targetNode = new Node(Token.NAME, "myEnum");
        addChildToFront(assignNode, targetNode);
        root.addChildToFront(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, new AbstractShallowCallback() {
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        creator.new DiscoverEnums().visit(t, assignNode, null);
    }

    @Test
    public void testVisitWithNullParent() {
        Node n = new Node(Token.NAME, "x");
        NodeTraversal t = new NodeTraversal(compiler, new AbstractShallowCallback() {
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        creator.new DiscoverEnums().visit(t, n, null);
    }

    private void addChildToFront(Node parent, Node child) {
        parent.addChildToFront(child);
    }

    private static class TestCompiler extends AbstractCompiler {
        private CompilerInput input = new TestInput();

        @Override
        CompilerInput getInput(String sourceName) {
            return input;
        }

        @Override
        boolean isExtern(String sourceName) {
            return false;
        }

        @Override
        CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public DelegateRelationship getDelegateRelationship(String name) {
                    return null;
                }

                @Override
                public String getDelegateSuperClassName() {
                    return null;
                }

                @Override
                public void checkForAliasing(Scope scope, String name, Node n) {}

                @Override
                public boolean isValidEnumKey(String key) {
                    return key != null && !key.isEmpty();
                }

                @Override
                public boolean isExported(String name) {
                    return false;
                }

                @Override
                public boolean isPrivate(String name) {
                    return false;
                }

                @Override
                public boolean isSingletonGetter(String name) {
                    return false;
                }

                @Override
                public boolean isDelegate(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateBase(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateBaseConstructor(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateMethod(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateProperty(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteral(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteralMethod(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteralProperty(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteralConstructor(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteralPrototype(String name) {
                    return false;
                }

                @Override
                public boolean isDelegateObjectLiteralBase(String name) {
                    return false;
                }

                @Override
                public String getDelegateBaseClassName(String name) {
                    return null;
                }

                @Override
                public boolean isExternVar(String name) {
                    return false;
                }

                @Override
                public boolean isOptionalParameter(Node n) {
                    return false;
                }

                @Override
                public boolean isVarArgs(Node n) {
                    return false;
                }

                @Override
                public boolean isExternCatch(String name) {
                    return false;
                }

                @Override
                public boolean isExternThis(String name) {
                    return false;
                }

                @Override
                public boolean isExternArguments(String name) {
                    return false;
                }

                @Override
                public boolean isExternConstructor(String name) {
                    return false;
                }

                @Override
                public boolean isExternFunction(String name) {
                    return false;
                }
            };
        }

        @Override
        ErrorReporter getErrorReporter() {
            return new ErrorReporter() {
                @Override
                public void warning(String message, String sourceName, int line, int lineOffset) {}

                @Override
                public void error(String message, String sourceName, int line, int lineOffset) {}
            };
        }

        @Override
        public void process(CompilerInput input) {}

        @Override
        public void processExtern(CompilerInput input) {}

        @Override
        public void addToHistory(Node n) {}

        @Override
        public void report(CheckLevel level, Node n, DiagnosticType diagnostic) {}
    }

    private static class TestInput extends CompilerInput {
        @Override
        public boolean isExtern() {
            return false;
        }

        @Override
        public String getSourceFile() {
            return "test";
        }

        @Override
        public Node getAstRoot() {
            return new Node(Token.SCRIPT);
        }

        @Override
        public JSDocInfo getJsDocInfo() {
            return null;
        }

        @Override
        public String getSourceName() {
            return "test";
        }
    }
}