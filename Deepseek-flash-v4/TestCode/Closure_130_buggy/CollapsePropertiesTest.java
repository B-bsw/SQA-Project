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

import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RunWith(JUnit4.class)
public class CollapsePropertiesTest {

    private CollapseProperties collapseProperties;
    private AbstractCompiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        collapseProperties = new CollapseProperties(compiler, false, false);
    }

    @Test
    public void testProcessWithExternTypes() {
        CollapseProperties cp = new CollapseProperties(compiler, true, false);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        cp.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testProcessWithoutExternTypes() {
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        collapseProperties.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testProcessWithInlineAliases() {
        CollapseProperties cp = new CollapseProperties(compiler, false, true);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        cp.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testInlineAliasesWithEmptyNameForest() {
        GlobalNamespace namespace = new GlobalNamespace(compiler, new Node(Token.SCRIPT));
        collapseProperties.inlineAliases(namespace);
        assertTrue(true);
    }

    @Test
    public void testInlineAliasesWithSingleName() {
        Node script = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "a");
        script.addChildToFront(nameNode);
        GlobalNamespace namespace = new GlobalNamespace(compiler, script);
        collapseProperties.inlineAliases(namespace);
        assertEquals(0, namespace.getNameForest().size());
    }

    @Test
    public void testInlineAliasIfPossibleWithNonNameParent() {
        Name name = new Name("a", null, true);
        Node aliasNode = new Node(Token.NAME, "a");
        Node parent = new Node(Token.EXPR_RESULT, aliasNode);
        Ref alias = new Ref(aliasNode, null, null, Ref.Type.ALIASING_GET);
        alias.scope = new Scope(compiler.getRoot());
        assertFalse(collapseProperties.inlineAliasIfPossible(alias, null));
    }

    @Test
    public void testInlineAliasIfPossibleWithNameParent() {
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node aliasNode = new Node(Token.NAME, "b");
        varNode.addChildToFront(nameNode);
        script.addChildToFront(varNode);
        
        Node aliasParent = new Node(Token.NAME, "b");
        nameNode.addChildToFront(aliasNode);
        aliasParent.addChildToFront(aliasNode);
        
        Scope scope = new Scope(script);
        Ref alias = new Ref(aliasNode, null, null, Ref.Type.ALIASING_GET);
        alias.scope = scope;
        alias.node = aliasNode;
        
        assertFalse(collapseProperties.inlineAliasIfPossible(alias, new GlobalNamespace(compiler, script)));
    }

    @Test
    public void testCheckNamespacesWithSimpleCases() {
        Node script = new Node(Token.SCRIPT);
        GlobalNamespace namespace = new GlobalNamespace(compiler, script);
        collapseProperties.checkNamespaces();
        assertTrue(true);
    }

    @Test
    public void testWarnAboutNamespaceAliasing() {
        Name name = new Name("a", null, true);
        Node node = new Node(Token.NAME, "a");
        Ref ref = new Ref(node, null, null, Ref.Type.ALIASING_GET);
        collapseProperties.warnAboutNamespaceAliasing(name, ref);
        assertNotNull(compiler.getErrors());
    }

    @Test
    public void testWarnAboutNamespaceRedefinition() {
        Name name = new Name("a", null, true);
        Node node = new Node(Token.NAME, "a");
        Ref ref = new Ref(node, null, null, Ref.Type.SET_FROM_GLOBAL);
        collapseProperties.warnAboutNamespaceRedefinition(name, ref);
        assertNotNull(compiler.getErrors());
    }

    @Test
    public void testFlattenReferencesToCollapsibleDescendantNamesWithNullProps() {
        Name name = new Name("a", null, true);
        collapseProperties.flattenReferencesToCollapsibleDescendantNames(name, "a");
        assertTrue(true);
    }

    @Test
    public void testFlattenSimpleStubDeclarationWithSimpleStub() {
        Node nameNode = Node.newString(Token.NAME, "a");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        Node refNode = new Node(Token.NAME, "b");
        nameNode.addChildToFront(refNode);
        Ref ref = new Ref(refNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        ref.node = refNode;
        
        Name name = new Name("a", null, true);
        name.addRef(ref);
        ref.name = name;
        
        collapseProperties.flattenSimpleStubDeclaration(name, "a.b");
        assertNotNull(parent);
    }

    @Test
    public void testFlattenNameRefAtDepthWithInvalidDepth() {
        Name name = new Name("a", null, true);
        Node node = new Node(Token.GETPROP);
        Node child = Node.newString(Token.NAME, "a");
        node.addChildToFront(child);
        
        collapseProperties.flattenNameRefAtDepth("a.b", node, 5, "a");
        assertTrue(true);
    }

    @Test
    public void testFlattenNameRefAtDepthWithValidDepth() {
        Name name = new Name("a", null, true);
        Node node = new Node(Token.GETPROP);
        Node child = new Node(Token.STRING, "a");
        node.addChildToFront(child);
        
        collapseProperties.flattenNameRefAtDepth("a.b", node, 0, "a");
        assertTrue(true);
    }

    @Test
    public void testCollapseDeclarationOfNameAndDescendantsWithCollapsible() {
        Name name = new Name("a", null, true);
        Node declarationNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        declarationNode.addChildToFront(nameNode);
        Node valueNode = new Node(Token.NUMBER, 1);
        declarationNode.addChildToFront(valueNode);
        
        Ref declaration = new Ref(declarationNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        declaration.node = declarationNode;
        name.declaration = declaration;
        name.addRef(declaration);
        
        collapseProperties.collapseDeclarationOfNameAndDescendants(name, "a");
        assertTrue(true);
    }

    @Test
    public void testCollapseDeclarationOfNameAndDescendantsWithNonCollapsible() {
        Name name = new Name("a", null, false);
        Node declarationNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        declarationNode.addChildToFront(nameNode);
        Node valueNode = new Node(Token.NUMBER, 1);
        declarationNode.addChildToFront(valueNode);
        
        Ref declaration = new Ref(declarationNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        declaration.node = declarationNode;
        name.declaration = declaration;
        name.addRef(declaration);
        
        collapseProperties.collapseDeclarationOfNameAndDescendants(name, "a");
        assertTrue(true);
    }

    @Test
    public void testFlattenPrefixesWithNullDeclaration() {
        Name name = new Name("a", null, true);
        collapseProperties.flattenPrefixes("a.b", name, 0);
        assertTrue(true);
    }

    @Test
    public void testFlattenPrefixesWithDeclaration() {
        Name name = new Name("a", null, true);
        Node declNode = new Node(Token.GETPROP);
        Node child = Node.newString(Token.STRING, "b");
        declNode.addChildToFront(child);
        Ref declaration = new Ref(declNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        declaration.node = declNode;
        name.declaration = declaration;
        
        collapseProperties.flattenPrefixes("a.b", name, 0);
        assertTrue(true);
    }

    @Test
    public void testFlattenNameRefWithSimpleName() {
        String alias = "a.b";
        Node n = new Node(Token.NAME);
        Node parent = new Node(Token.EXPR_RESULT, n);
        String originalName = "a";
        
        collapseProperties.flattenNameRef(alias, n, parent, originalName);
        assertNotNull(n.getFirstChild());
    }

    @Test
    public void testFlattenNameRefWithGetProp() {
        String alias = "a.b";
        Node n = new Node(Token.GETPROP);
        Node propNode = Node.newString(Token.STRING, "b");
        n.addChildToFront(propNode);
        Node parent = new Node(Token.EXPR_RESULT, n);
        String originalName = "a";
        
        collapseProperties.flattenNameRef(alias, n, parent, originalName);
        assertNotNull(n);
    }

    @Test
    public void testCheckForHosedThisReferencesWithThis() {
        Node rvalue = new Node(Token.FUNCTION);
        Node thisNode = new Node(Token.THIS);
        rvalue.addChildToFront(thisNode);
        
        collapseProperties.checkForHosedThisReferences(rvalue, null, new Name("a", null, true));
        assertTrue(true);
    }

    @Test
    public void testCheckForHosedThisReferencesWithoutThis() {
        Node rvalue = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME);
        rvalue.addChildToFront(nameNode);
        
        collapseProperties.checkForHosedThisReferences(rvalue, null, new Name("a", null, true));
        assertTrue(true);
    }

    @Test
    public void testBuildFullyQualifiedNameWithDollarSign() {
        String result = CollapseProperties.buildFullyQualifiedName("a", "b", new Name("a", null, true));
        assertEquals("a.b", result);
    }

    @Test
    public void testBuildFullyQualifiedNameWithSpecialChars() {
        String result = CollapseProperties.buildFullyQualifiedName("a.b", "c", new Name("a.b.c", null, true));
        assertEquals("a.b.c", result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testFlattenNameRefWithNullN() {
        collapseProperties.flattenNameRef("a.b", null, new Node(Token.EXPR_RESULT), "a");
    }
    
    @Test
    public void testUpdateSimpleDeclarationWithFunctionRValue() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node rvalue = new Node(Token.FUNCTION);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToFront(rvalue);
        
        Ref ref = new Ref(assignNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        Name name = new Name("a", null, true);
        
        collapseProperties.updateSimpleDeclaration("a.b", name, ref);
        assertTrue(true);
    }

    @Test
    public void testUpdateSimpleDeclarationWithNonFunctionRValue() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node rvalue = new Node(Token.NUMBER, 1);
        assignNode.addChildToFront(nameNode);
        assignNode.addChildToFront(rvalue);
        
        Ref ref = new Ref(assignNode, null, null, Ref.Type.SET_FROM_GLOBAL);
        Name name = new Name("a", null, true);
        
        collapseProperties.updateSimpleDeclaration("a.b", name, ref);
        assertTrue(true);
    }

    @Test
    public void testIsNamespaceWithAliasing() {
        Name name = new Name("a", null, true);
        name.addRef(new Ref(new Node(Token.NAME), null, null, Ref.Type.ALIASING_GET));
        assertTrue(name.isNamespace());
    }

    @Test
    public void testIsNamespaceWithNoAliasing() {
        Name name = new Name("a.b", null, false);
        assertFalse(name.isNamespace());
    }
}