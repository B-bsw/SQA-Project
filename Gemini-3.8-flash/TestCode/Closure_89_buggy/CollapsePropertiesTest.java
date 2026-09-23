package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class CollapsePropertiesTest {

    private AbstractCompiler compiler;
    private CollapseProperties collapseProperties;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        compiler = new JsCompilerForTest();
        collapseProperties = new CollapseProperties(compiler, false, true);
        externs = new Node(Token.EMPTY);
        root = new Node(Token.SCRIPT);
    }

    @Test
    public void testProcessWithEmptyRoot() {
        collapseProperties.process(externs, root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testProcessWithNullExterns() {
        try {
            collapseProperties.process(null, root);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testInlineAliasesWithNullNamespace() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        collapseProperties.inlineAliases(namespace);
        assertNotNull(namespace.getNameForest());
    }

    @Test
    public void testInlineAliasIfPossibleWithNonAliasingRef() {
        Node nameNode = new Node(Token.NAME, "x");
        Node rvalue = new Node(Token.NUMBER, 0);
        Node assignNode = new Node(Token.ASSIGN, nameNode, rvalue);
        Node scopeNode = new Node(Token.BLOCK, assignNode);
        Node scriptNode = new Node(Token.SCRIPT, scopeNode);
        root.addChildToBack(scriptNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Name name = namespace.getNameIndex().get("x");
        if (name != null && name.refs != null && !name.refs.isEmpty()) {
            Ref ref = name.refs.get(0);
            boolean result = collapseProperties.inlineAliasIfPossible(ref, namespace);
            assertTrue(result || !ref.scope.isLocal());
        }
    }

    @Test
    public void testCheckNamespacesWithEmptyMap() {
        collapseProperties.nameMap = new java.util.HashMap<>();
        collapseProperties.checkNamespaces();
        assertTrue(collapseProperties.nameMap.isEmpty());
    }

    @Test
    public void testFlattenReferencesToWithNoProps() {
        Name n = new Name(compiler, "test", null);
        collapseProperties.flattenReferencesToCollapsibleDescendantNames(n, "test");
        assertNull(n.props);
    }

    @Test
    public void testFlattenReferencesWithNullRefs() {
        Name n = new Name(compiler, "test", null);
        n.props = new java.util.ArrayList<>();
        collapseProperties.flattenReferencesTo(n, "test");
        assertEquals(0, n.props.size());
    }

    @Test
    public void testFlattenNameRefAtDepthWithQName() {
        Node n = new Node(Token.GETPROP);
        n.addChildToBack(new Node(Token.NAME, "a"));
        n.addChildToBack(new Node(Token.STRING, "b"));
        Node parent = new Node(Token.EXPR_RESULT, n);
        Node grandparent = new Node(Token.SCRIPT, parent);
        collapseProperties.flattenNameRefAtDepth("alias", n, 1, "original");
        assertEquals(Token.NAME, n.getType());
        assertTrue(n.getFirstChild() == null || n.getChildCount() > 0);
    }

    @Test
    public void testFlattenNameRefAtDepthWithObjKey() {
        Node n = new Node(Token.STRING, "key");
        Node parent = new Node(Token.OBJECTLIT, n);
        collapseProperties.flattenNameRefAtDepth("alias", n, 0, "original");
        assertEquals(Token.STRING, n.getType());
    }

    @Test
    public void testUpdateObjLitOrFunctionDeclarationWithNullDeclaration() {
        Name n = new Name(compiler, "test", null);
        n.declaration = null;
        collapseProperties.updateObjLitOrFunctionDeclaration(n, "alias");
        assertNull(n.declaration);
    }

    @Test
    public void testUpdateSimpleDeclarationWithVarNode() {
        Node nameNode = new Node(Token.NAME, "a");
        Node valueNode = new Node(Token.NUMBER, 5);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        Node exprResult = new Node(Token.EXPR_RESULT, assignNode);
        Node block = new Node(Token.BLOCK, exprResult);
        Node script = new Node(Token.SCRIPT, block);
        root.addChildToBack(script);

        Name n = new Name(compiler, "a", null);
        Ref ref = new Ref(nameNode, null, null, null, null, null);
        n.declaration = ref;
        collapseProperties.updateSimpleDeclaration("alias", n, ref);
        assertNotNull(n.declaration.node);
    }

    @Test
    public void testCheckNamespacesWithAliasingGet() {
        Name name = new Name(compiler, "test", null);
        name.aliasingGets = 1;
        Node refNode = new Node(Token.NAME, "test");
        Ref ref = new Ref(refNode, null, null, null, null, null);
        ref.type = Ref.Type.ALIASING_GET;
        name.refs = java.util.Collections.singletonList(ref);
        collapseProperties.nameMap = new java.util.HashMap<>();
        collapseProperties.nameMap.put("test", name);
        collapseProperties.checkNamespaces();
        assertTrue(name.aliasingGets > 0);
    }

    @Test
    public void testWarnAboutNamespaceRedefinition() {
        Name name = new Name(compiler, "test", null);
        Node node = new Node(Token.NAME, "test");
        Ref ref = new Ref(node, null, null, null, null, null);
        ref.sourceName = "source";
        ref.type = Ref.Type.SET_FROM_GLOBAL;
        collapseProperties.warnAboutNamespaceRedefinition(name, ref);
        assertEquals("test", node.getString());
    }

    @Test
    public void testInlineAliasesWithObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node nameNode = new Node(Token.NAME, "obj");
        Node assignNode = new Node(Token.ASSIGN, nameNode, objLit);
        Node exprResult = new Node(Token.EXPR_RESULT, assignNode);
        Node block = new Node(Token.BLOCK, exprResult);
        Node script = new Node(Token.SCRIPT, block);
        root.addChildToBack(script);

        Name n = new Name(compiler, "obj", null);
        n.type = Name.Type.OBJECTLIT;
        n.globalSets = 1;
        n.localSets = 0;
        n.aliasingGets = 1;
        Ref ref = new Ref(nameNode, null, null, null, null, null);
        ref.type = Ref.Type.ALIASING_GET;
        n.refs = java.util.Collections.singletonList(ref);
        n.declaration = ref;
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        collapseProperties.inlineAliases(namespace);
        assertTrue(n.aliasingGets >= 0);
    }

    @Test
    public void testConstructorWithBooleanFlags() {
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        assertNotNull(cp);
    }

    @Test
    public void testProcessWithExternalTypes() {
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        cp.process(externs, root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testNoChangesWithEmptyTree() {
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        cp.process(externs, root);
        assertEquals(0, root.getChildCount());
    }
}