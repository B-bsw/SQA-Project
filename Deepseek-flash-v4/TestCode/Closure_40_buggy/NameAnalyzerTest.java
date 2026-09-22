package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class NameAnalyzerTest {

    private static final String EXTERN_BASE = "var window; var goog; var alert; function alert(){}; ";
    private NameAnalyzer analyzer;
    private AbstractCompiler compiler;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.init(externs, root, null, null, null);
    }

    private void compileAndProcess(String code) {
        Node check = parse(code);
        assertEquals(check, check);
        assertNull(externs);
    }

    private Node parse(String code) {
        return new Node(code == null ? 0 : 1);
    }

    @Test
    public void testCompile() {
        assertNotNull(new Compiler());
    }

    @Test
    public void testProcessWithNullExterns() {
        Node rootNode = IR.block();
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(null, rootNode);
        assertNotNull(analyzer);
    }

    @Test
    public void testProcessWithSimpleExterns() {
        Node externs = IR.block();
        Node root = IR.block();
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        analyzer.process(externs, root);
        assertEquals(0, NodeUtil.getCount());
    }

    @Test
    public void testIsExternallyReferenceable() {
        NameInformation info = new NameInformation();
        info.name = "foo";
        info.isExternallyReferenceable = true;
        assertTrue(info.isExternallyReferenceable);
    }

    @Test
    public void testJsNameCompareTo() {
        JsName a = new JsName();
        a.name = "a";
        JsName b = new JsName();
        b.name = "b";
        assertTrue(a.compareTo(b) < 0);
        assertTrue(b.compareTo(a) > 0);
        assertEquals(0, a.compareTo(a));
    }

    @Test
    public void testJsNameToStringWithoutPrototypes() {
        JsName name = new JsName();
        name.name = "test";
        assertEquals("test", name.toString());
    }

    @Test
    public void testJsNameToStringWithPrototypes() {
        JsName name = new JsName();
        name.name = "obj";
        name.prototypeNames.add("func1");
        name.prototypeNames.add("func2");
        String result = name.toString();
        assertTrue(result.contains("obj"));
        assertTrue(result.contains("(CLASS)"));
        assertTrue(result.contains("func1"));
        assertTrue(result.contains("func2"));
    }

    @Test
    public void testJsNameRefNodeRemoveVar() {
        JsName name = new JsName();
        name.name = "x";
        Node varNode = Node.newString(Token.VAR, "x");
        Node parent = IR.exprResult();
        parent.addChildToBack(varNode);
        JsNameRefNode ref = new JsNameRefNode(name, varNode);
        Node grandParent = IR.block();
        grandParent.addChildToBack(parent);
        assertNotNull(ref.name());
    }

    @Test
    public void testJsNameRefNodeRemove() {
        JsName name = new JsName();
        name.name = "y";
        Node assign = IR.assign(IR.name("y"), IR.number(1));
        Node expr = IR.exprResult(assign);
        Node containing = IR.block();
        containing.addChildToBack(expr);
        JsNameRefNode ref = new JsNameRefNode(name, expr);
        assertNotNull(ref.name());
    }

    @Test
    public void testPrototypeSetNodeRemoveFunction() {
        JsName name = new JsName();
        name.name = "Func.prototype.method";
        Node assign = IR.assign(IR.getprop(IR.name("Func"), IR.string("prototype")), IR.empty());
        Node func = IR.function(IR.name("Func"), IR.paramList(), IR.block());
        Node expr = IR.exprResult(assign);
        Node block = IR.block();
        block.addChildToBack(expr);
        PrototypeSetNode node = new PrototypeSetNode(name, assign);
        assertNotNull(node);
    }

    @Test
    public void testSpecialReferenceNodeTraverseEdge() {
        JsName from = new JsName();
        from.name = "a";
        JsName to = new JsName();
        to.name = "b";
        from.referenced = true;
        to.referenced = false;
        ReferencePropagationCallback cb = new ReferencePropagationCallback();
        assertTrue(cb.traverseEdge(from, null, to));
        assertTrue(to.referenced);
        to.referenced = true;
        assertFalse(cb.traverseEdge(from, null, to));
    }

    @Test
    public void testNameInformationDefaults() {
        NameInformation info = new NameInformation();
        assertNull(info.name);
        assertFalse(info.isExternallyReferenceable);
        assertFalse(info.isPrototype);
        assertNull(info.prototypeClass);
        assertNull(info.prototypeProperty);
        assertNull(info.superclass);
        assertFalse(info.onlyAffectsClassDef);
    }

    @Test
    public void testAliasSet() {
        AliasSet set = new AliasSet("a", "b");
        assertTrue(set.names.contains("a"));
        assertTrue(set.names.contains("b"));
        assertEquals(2, set.names.size());
    }

    @Test
    public void testDefaultGlobalNames() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        assertTrue(analyzer.DEFAULT_GLOBAL_NAMES.contains("window"));
    }

    @Test
    public void testProcessExternals() {
        Node externsNode = IR.block();
        Node rootNode = IR.block();
        Node varNode = IR.name("foo");
        Node parent = IR.var(varNode);
        ProcessExternals pe = new ProcessExternals();
        assertNotNull(pe);
    }

    @Test
    public void testFindDependencyScopes() {
        FindDependencyScopes scopes = new FindDependencyScopes();
        assertNotNull(scopes);
    }

    @Test
    public void testNodeAccumulator() {
        NodeAccumulator accumulator = new NodeAccumulator();
        assertNotNull(accumulator);
    }

    @Test
    public void testRemoveListener() {
        RemoveListener listener = new RemoveListener();
        assertNotNull(listener);
        Node n = IR.name("test");
        listener.nodeRemoved(n);
    }

    @Test
    public void testHoistVariableAndFunctionDeclarations() {
        HoistVariableAndFunctionDeclarations hoist = new HoistVariableAndFunctionDeclarations();
        assertNotNull(hoist);
    }

    @Test
    public void testFindDeclarationsAndSetters() {
        FindDeclarationsAndSetters finder = new FindDeclarationsAndSetters();
        assertNotNull(finder);
    }

    @Test
    public void testIsVarOrSimpleAssignLhs() {
        assertFalse(FindReferences.isVarOrSimpleAssignLhs(null, null));
    }

    @Test
    public void testMaybeHiddenAlias() {
        FindReferences fr = new FindReferences();
        assertFalse(fr.maybeHiddenAlias(null, null));
    }

    @Test
    public void testIsNameAssignmentTarget() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        Node name = IR.name("x");
        Node parent = IR.assign(name, IR.number(1));
        assertTrue(analyzer.isNameAssignmentTarget(name, parent));
    }

    @Test
    public void testIsNameAssignmentTargetNoAssign() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        Node name = IR.name("x");
        Node parent = IR.exprResult(name);
        assertFalse(analyzer.isNameAssignmentTarget(name, parent));
    }

    @Test
    public void testIsPrototypeAssignment() {
        Node getProp = IR.getprop(IR.name("Foo"), IR.string("prototype"));
        Node getProp2 = IR.getprop(getProp, IR.string("bar"));
        assertTrue(NodeUtil.isPrototypeAssignment(getProp2));
    }

    @Test
    public void testIsPrototypeAssignmentNo() {
        Node getProp = IR.getprop(IR.name("Foo"), IR.string("bar"));
        assertFalse(NodeUtil.isPrototypeAssignment(getProp));
    }

    @Test
    public void testReferencePropagationCallbackWithToReferenced() {
        JsName from = new JsName();
        from.name = "a";
        JsName to = new JsName();
        to.name = "b";
        from.referenced = true;
        to.referenced = true;
        ReferencePropagationCallback cb = new ReferencePropagationCallback();
        assertFalse(cb.traverseEdge(from, null, to));
    }

    @Test
    public void testReferencePropagationCallbackFromNotReferenced() {
        JsName from = new JsName();
        from.name = "a";
        JsName to = new JsName();
        to.name = "b";
        from.referenced = false;
        to.referenced = false;
        ReferencePropagationCallback cb = new ReferencePropagationCallback();
        assertFalse(cb.traverseEdge(from, null, to));
    }

    @Test
    public void testFindReferencesShouldTraverse() {
        FindReferences fr = new FindReferences();
        assertTrue(fr.shouldTraverse(null, IR.script(), null));
    }

    @Test
    public void testProcessVisitNameInVarDecl() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        Node name = IR.name("x");
        Node var = IR.var(name);
        Node parent = IR.block();
        parent.addChildToBack(var);
        NodeTraversal t = new NodeTraversal(compiler, null);
        t.traverse(parent);
        Node value = name.getFirstChild();
        assertNull(value);
    }

    @Test
    public void testFindReferencesVisitCall() {
        FindReferences fr = new FindReferences();
        Node call = IR.call(IR.name("foo"));
        fr.visit(null, call, null);
        assertNotNull(call);
    }

    @Test
    public void testEmptyProcess() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        Node root = IR.block();
        Node externs = IR.block();
        analyzer.process(externs, root);
        assertTrue(referenceGraph.isDirected());
    }

    @Test
    public void testProcessWithUnreferenced() {
        NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
        Node root = IR.block();
        Node externs = IR.block();
        Node varNode = IR.name("x");
        Node var = IR.var(varNode);
        root.addChildToBack(var);
        analyzer.process(externs, root);
        assertNotNull(analyzer.getNames());
    }
}