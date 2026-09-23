package com.google.javascript.jscomp;

import static org.junit.Assert.*;
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

public class TypedScopeCreatorTest {

    private TypedScopeCreator creator;
    private Compiler compiler;
    private JSTypeRegistry typeRegistry;
    private Scope scope;

    @Before
    public void setUp() {
        compiler = new Compiler();
        typeRegistry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler);
    }

    @After
    public void tearDown() {
        creator = null;
        compiler = null;
        typeRegistry = null;
        scope = null;
    }

    @Test
    public void testCreateScopeNullParent() {
        Node root = new Node(Token.ROOT);
        Scope result = creator.createScope(root, null);
        assertNotNull("Scope should not be null for null parent", result);
        assertTrue("Scope should be global", result.isGlobal());
        assertEquals("Global scope should have correct root node", root, result.getRootNode());
    }

    @Test
    public void testCreateScopeWithParent() {
        Node childRoot = new Node(Token.FUNCTION);
        Node parentRoot = new Node(Token.ROOT);
        Scope parentScope = new Scope(parentRoot, null);
        Scope result = creator.createScope(childRoot, parentScope);
        assertNotNull("Scope should not be null with parent", result);
        assertSame("Parent scope should match", parentScope, result.getParent());
        assertEquals("Child scope root node should match", childRoot, result.getRootNode());
    }

    @Test
    public void testCreateScopeWithFunctionParentAndFunctionType() {
        Node childRoot = new Node(Token.FUNCTION);
        Node functionNode = new Node(Token.FUNCTION);
        JSType fnType = typeRegistry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        childRoot.setJSType(fnType);
        Node parentRoot = new Node(Token.ROOT);
        Scope parentScope = new Scope(parentRoot, null);
        Scope result = creator.createScope(childRoot, parentScope);
        assertNotNull("Scope should not be null", result);
        assertFalse("Scope should not be global when parent has function type", result.isGlobal());
    }

    @Test
    public void testCreateScopeWithNullRoot() {
        Node parentRoot = new Node(Token.ROOT);
        Scope parentScope = new Scope(parentRoot, null);
        try {
            creator.createScope(null, parentScope);
            fail("Expected NullPointerException for null root");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCreateScopeGlobalWithExterns() {
        Node root = new Node(Token.ROOT);
        Node externs = new Node(Token.BLOCK);
        Node externVar = Node.newString(Token.NAME, "externVar");
        externs.addChildToBack(externVar);
        root.addChildToBack(externs);
        Scope result = creator.createScope(root, null);
        assertNotNull("Scope should not be null", result);
        assertTrue("Should be global scope", result.isGlobal());
    }

    @Test
    public void testCreateScopeWithVarDeclaration() {
        Node root = new Node(Token.ROOT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        traversal.traverse(root);
        Scope result = creator.createScope(root, null);
        assertNotNull("Scope should not be null", result);
        assertTrue("x should be declared", result.isDeclared("x", false));
    }

    @Test
    public void testCreateScopeWithGlobalThisFunction() {
        Node root = new Node(Token.ROOT);
        Node fnNode = new Node(Token.FUNCTION);
        Node fnName = Node.newString(Token.NAME, "myFunc");
        fnNode.addChildToFront(fnName);
        root.addChildToBack(fnNode);
        Scope result = creator.createScope(root, null);
        assertNotNull("Scope should not be null", result);
    }

    @Test
    public void testDiscoverEnumsWithEnumVar() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Color");
        Node objectLit = new Node(Token.OBJECTLIT);
        nameNode.addChildToBack(objectLit);
        varNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        traversal.traverse(varNode);
        Scope scope = new Scope(new Node(Token.ROOT), null);
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        Node nameNode = new Node(Token.NAME, "obj");
        Node propName = Node.newString(Token.STRING, "prop");
        getProp.addChildToBack(nameNode);
        getProp.addChildToBack(propName);
        Node objectLit = new Node(Token.OBJECTLIT);
        assignNode.addChildToBack(getProp);
        assignNode.addChildToBack(objectLit);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, assignNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithNullNode() {
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        try {
            creator.new DiscoverEnums().visit(traversal, null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testDiscoverEnumsWithNameNode() {
        Node nameNode = new Node(Token.NAME, "myEnum");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, nameNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithVarAndEnumAttribute() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Color");
        Node valueNode = new Node(Token.OBJECTLIT);
        nameNode.addChildToBack(valueNode);
        varNode.addChildToBack(nameNode);
        Node expResult = new Node(Token.EXPR_RESULT);
        expResult.addChildToBack(varNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, varNode, expResult);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithGetPropAndEnumAttribute() {
        Node getProp = new Node(Token.GETPROP);
        Node nameNode = new Node(Token.NAME, "namespace");
        Node propNode = Node.newString(Token.STRING, "MyEnum");
        getProp.addChildToBack(nameNode);
        getProp.addChildToBack(propNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, getProp, new Node(Token.EXPR_RESULT));
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithNestedGetProp() {
        Node outerGetProp = new Node(Token.GETPROP);
        Node innerGetProp = new Node(Token.GETPROP);
        Node nameNode = new Node(Token.NAME, "a");
        Node prop1 = Node.newString(Token.STRING, "b");
        Node prop2 = Node.newString(Token.STRING, "c");
        innerGetProp.addChildToBack(nameNode);
        innerGetProp.addChildToBack(prop1);
        outerGetProp.addChildToBack(innerGetProp);
        outerGetProp.addChildToBack(prop2);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, outerGetProp, new Node(Token.EXPR_RESULT));
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithNonEnumVar() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node numNode = new Node(Token.NUMBER, 42);
        nameNode.addChildToBack(numNode);
        varNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithInfoAndNoParameterType() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        nameNode.setJSDocInfo(info);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithDuplicateEnumKeys() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Color");
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key1 = Node.newString(Token.STRING, "RED");
        Node key2 = Node.newString(Token.STRING, "RED");
        Node value1 = new Node(Token.NUMBER, 1);
        Node value2 = new Node(Token.NUMBER, 2);
        Node prop1 = new Node(Token.STRING_KEY);
        prop1.addChildToBack(key1);
        Node prop2 = new Node(Token.STRING_KEY);
        prop2.addChildToBack(key2);
        objectLit.addChildToBack(prop1);
        objectLit.addChildToBack(prop2);
        nameNode.addChildToBack(objectLit);
        varNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithValidEnumKey() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Color");
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key = Node.newString(Token.STRING, "RED");
        Node value = new Node(Token.NUMBER, 1);
        Node prop = new Node(Token.STRING_KEY);
        prop.addChildToBack(key);
        objectLit.addChildToBack(prop);
        nameNode.addChildToBack(objectLit);
        varNode.addChildToBack(nameNode);
        JSDocInfo info = new JSDocInfo();
        info.setEnumParameterType(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE));
        nameNode.setJSDocInfo(info);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testDiscoverEnumsWithGlobalScope() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "Color");
        Node objectLit = new Node(Token.OBJECTLIT);
        nameNode.addChildToBack(objectLit);
        varNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        scope = new Scope(new Node(Token.ROOT), null);
        creator.new DiscoverEnums().visit(traversal, varNode, null);
        assertNotNull("Should not throw");
    }

    @Test
    public void testAbstractScopeBuilderShouldTraverse() {
        // Test with a simple node
        Node n = new Node(Token.NAME, "test");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node node, Node parent) {
            }
        });
        TypedScopeCreator enclosingCreator = creator;
        boolean result = creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.shouldTraverse(traversal, n, null);
        assertTrue("Simple name should be traversed", result);
    }

    @Test
    public void testAbstractScopeBuilderShouldTraverseFunction() {
        Node n = new Node(Token.FUNCTION);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node node, Node parent) {
            }
        });
        Node parent = new Node(Token.BLOCK);
        parent.addChildToBack(n);
        boolean result = creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.shouldTraverse(traversal, n, null);
        assertTrue("Function should be traversed", result);
    }

    @Test
    public void testAbstractScopeBuilderShouldNotTraverseFunctionInsideFunction() {
        Node n = new Node(Token.FUNCTION);
        Node parent = new Node(Token.FUNCTION);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node node, Node parent) {
            }
        });
        boolean result = creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.shouldTraverse(traversal, n, parent);
        assertFalse("Function inside function should not be traversed", result);
    }

    @Test
    public void testAbstractScopeBuilderVisitName() {
        Node nameNode = new Node(Token.NAME, "myVar");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertNotNull("Name should not be null", name);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, nameNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitNameWithTypeInference() {
        Node nameNode = new Node(Token.NAME, "myVar");
        Node valueNode = new Node(Token.NUMBER, 42);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(nameNode);
        exprResult.addChildToBack(valueNode);
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        nameNode.setJSType(numberType);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertEquals("Type should be inferred", numberType, type);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, nameNode, exprResult);
    }

    @Test
    public void testAbstractScopeBuilderVisitNameWithTypeAnnotation() {
        Node nameNode = new Node(Token.NAME, "myVar");
        Node valueNode = new Node(Token.NUMBER, 42);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(nameNode);
        exprResult.addChildToBack(valueNode);
        JSType stringType = typeRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSDocInfo info = new JSDocInfo();
        info.setType(stringType);
        nameNode.setJSDocInfo(info);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertEquals("Type should come from annotation", stringType, type);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, nameNode, exprResult);
    }

    @Test
    public void testAbstractScopeBuilderVisitFunctionWithInferredReturnType() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "foo");
        functionNode.addChildToFront(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, functionNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitFunctionWithDeclaredReturnType() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "foo");
        functionNode.addChildToFront(nameNode);
        JSType returnType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSDocInfo info = new JSDocInfo();
        info.setReturnType(returnType);
        functionNode.setJSDocInfo(info);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, functionNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitVarWithNoType() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        varNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertEquals("Type should be null if not defined", null, type);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, varNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitVarWithType() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        Node valueNode = new Node(Token.NUMBER, 10);
        nameNode.addChildToBack(valueNode);
        varNode.addChildToBack(nameNode);
        JSType numberType = typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertNotNull("Type should be inferred from value", type);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, varNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitAssign() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = new Node(Token.NAME, "y");
        Node valueNode = new Node(Token.STRING, "hello");
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(valueNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertEquals("y", name);
                assertNotNull("Type should be inferred", type);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, assignNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitGetProp() {
        Node getProp = new Node(Token.GETPROP);
        Node objName = new Node(Token.NAME, "obj");
        Node propName = Node.newString(Token.STRING, "prop");
        getProp.addChildToBack(objName);
        getProp.addChildToBack(propName);
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToBack(getProp);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, getProp, parent);
    }

    @Test
    public void testAbstractScopeBuilderVisitCallWithDelegate() {
        Node callNode = new Node(Token.CALL);
        Node targetNode = new Node(Token.GETPROP);
        Node objName = new Node(Token.NAME, "goog");
        Node propName = Node.newString(Token.STRING, "delegate");
        targetNode.addChildToBack(objName);
        targetNode.addChildToBack(propName);
        Node delegateName = Node.newString(Token.STRING, "delegateName");
        callNode.addChildToBack(targetNode);
        callNode.addChildToBack(delegateName);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, callNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitCatch() {
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME, "e");
        catchNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
                assertEquals("e", name);
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, catchNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitFunctionWithExternInput() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "extFunc");
        functionNode.addChildToFront(nameNode);
        CompilerInput input = new CompilerInput.Builder(null).setSourceFile(new SourceFile("externs.js")).setExtern(true).build();
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        }, input);
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, functionNode, null);
    }

    @Test
    public void testAbstractScopeBuilderVisitFunctionWithNonExternInput() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "intFunc");
        functionNode.addChildToFront(nameNode);
        CompilerInput input = new CompilerInput.Builder(null).setSourceFile(new SourceFile("internal.js")).setExtern(false).build();
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        }, input);
        creator.new AbstractScopeBuilder() {
            @Override
            void declareName(String name, Node n, Node parent, JSType type) {
            }
            @Override
            void addToScope(NodeTraversal t, Node n, Node parent) {
            }
            @Override
            void declareArguments(NodeTraversal t, Node functionNode) {
            }
            @Override
            void declareLhs(NodeTraversal t, Node n, JSType type) {
            }
        }.visit(traversal, functionNode, null);
    }

    @Test
    public void testGlobalScopeBuilderVisitWithNameAndNoType() {
        Node nameNode = new Node(Token.NAME, "gVar");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new GlobalScopeBuilder(traversal, new Node(Token.ROOT)).visit(traversal, nameNode, null);
}

    @Test
    public void testGlobalScopeBuilderVisitWithCatchNode() {
        Node catchNode = new Node(Token.CATCH);
        Node nameNode = new Node(Token.NAME, "e");
        catchNode.addChildToBack(nameNode);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new GlobalScopeBuilder(traversal, new Node(Token.ROOT)).visit(traversal, catchNode, null);
    }

    @Test
    public void testLocalScopeBuilderShouldTraverse() {
        Node n = new Node(Token.NAME, "test");
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node node, Node parent) {
            }
        });
        Node root = new Node(Token.FUNCTION);
        boolean result = creator.new LocalScopeBuilder(traversal, new Scope(root, null)).shouldTraverse(traversal, n, null);
        assertTrue("Name should be traversed", result);
    }

    @Test
    public void testLocalScopeBuilderShouldNotTraverseRootFunction() {
        Node root = new Node(Token.FUNCTION);
        Node n = new Node(Token.BLOCK);
        root.addChildToBack(n);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node node, Node parent) {
            }
        });
        boolean result = creator.new LocalScopeBuilder(traversal, new Scope(root, null)).shouldTraverse(traversal, n, root);
        assertFalse("Root block should not be traversed", result);
    }

    @Test
    public void testLocalScopeBuilderVisitWithThis() {
        Node thisNode = new Node(Token.THIS);
        NodeTraversal traversal = new NodeTraversal(compiler, new AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
            }
        });
        creator.new LocalScopeBuilder(traversal, new Scope(new Node(Token.FUNCTION), null)).visit(traversal, thisNode, null);
    }
}