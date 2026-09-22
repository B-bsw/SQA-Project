package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.testing.JSCompCorpusTestCase;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class GlobalNamespaceTest {

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public void report(CheckLevel level, JSError error) {}
        @Override
        public void report(JSError error) {}
        @Override
        public Node getRoot() { return null; }
        @Override
        public Node getJsRoot() { return null; }
        @Override
        public void process(SourceFile[] externs, JSModule[] modules) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, AbstractPostOrderCallback callback) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, AbstractPostOrderCallback callback, InstrumentedFunction instrumented) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule, boolean isCheckOnly) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule, boolean isCheckOnly, boolean isIncremental) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule, boolean isCheckOnly, boolean isIncremental, boolean isFull) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule, boolean isCheckOnly, boolean isIncremental, boolean isFull, boolean isAll) {}
        @Override
        public void process(SourceFile[] externs, JSModule[] modules, CompilationLevel level, AbstractPostOrderCallback callback, InstrumentedFunction instrumented, boolean trace, boolean debug, boolean jsXml, boolean asModule, boolean isCheckOnly, boolean isIncremental, boolean isFull, boolean isAll, boolean isNoExterns) {}
    }

    private GlobalNamespace namespace;
    private TestCompiler compiler;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
    }

    @Test
    public void testEmptyRoot() {
        Node root = new Node(Token.EMPTY);
        namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getNameForest());
        assertEquals(0, namespace.getNameForest().size());
        assertNotNull(namespace.getNameIndex());
        assertTrue(namespace.getNameIndex().isEmpty());
    }

    @Test
    public void testSimpleGlobalVar() {
        Node root = parse("var a = 1;");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name name = namespace.getNameIndex().get("a");
        assertNotNull(name);
        assertEquals(GlobalNamespace.Name.Type.OTHER, name.type);
        assertEquals(1, name.getRefs().size());
        assertEquals(1, name.globalSets);
    }

    @Test
    public void testGlobalFunction() {
        Node root = parse("function f() { return 1; }");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name name = namespace.getNameIndex().get("f");
        assertNotNull(name);
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, name.type);
        assertEquals(0, name.getRefs().size());
    }

    @Test
    public void testNestedPropertyGet() {
        Node root = parse("var a = {}; var b = a.x;");
        namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getNameIndex().get("a"));
        assertNotNull(namespace.getNameIndex().get("a.x"));
    }

    @Test
    public void testPrototypeChain() {
        Node root = parse("function A() {} A.prototype.x = function() {};");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name protoName = namespace.getNameIndex().get("A.prototype");
        assertNotNull(protoName);
        assertNotNull(namespace.getNameIndex().get("A.prototype.x"));
    }

    @Test
    public void testObjectLitProperty() {
        Node root = parse("var obj = {a: 1, 'b': 2};");
        namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getNameIndex().get("obj"));
        assertNotNull(namespace.getNameIndex().get("obj.a"));
        assertNotNull(namespace.getNameIndex().get("obj.b"));
    }

    @Test
    public void testLocalSetFromFunction() {
        Node root = parse("var a = 1; function f() { var b = a; a = 2; }");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameA = namespace.getNameIndex().get("a");
        assertNotNull(nameA);
        assertEquals(2, nameA.getRefs().size());
        assertTrue(nameA.getRefs().get(0).type == GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        assertEquals(1, nameA.globalSets);
    }

    @Test
    public void testAliasingGetInHook() {
        Node root = parse("var a = 1; var b = c ? a : 2;");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameA = namespace.getNameIndex().get("a");
        assertNotNull(nameA);
        assertEquals(1, nameA.getRefs().size());
        assertEquals(GlobalNamespace.Ref.Type.ALIASING_GET, nameA.getRefs().get(0).type);
    }

    @Test
    public void testConstructorDetection() {
        Node root = parse("/** @constructor */ function A() {}");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameA = namespace.getNameIndex().get("A");
        assertNotNull(nameA);
        assertTrue(nameA.isClassOrEnum);
    }

    @Test
    public void testEnumDetection() {
        Node root = parse("/** @enum {number} */ var E = {A: 1, B: 2};");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameE = namespace.getNameIndex().get("E");
        assertNotNull(nameE);
        assertTrue(nameE.isClassOrEnum);
    }

    @Test
    public void testIsGlobalNameReferenceWithLocalShadow() {
        Node root = parse("var a = 1; function f(a) { return a; }");
        namespace = new GlobalNamespace(compiler, root);
        assertTrue(namespace.isGlobalNameReference("a", new Scope(null, null)));
    }

    @Test
    public void testHandleSetFromLocal() {
        Node root = parse("var a = 1; function f() { a = 2; }");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameA = namespace.getNameIndex().get("a");
        assertNotNull(nameA);
        assertEquals(2, nameA.getRefs().size());
    }

    @Test
    public void testSimpleNameCollapsingEligibility() {
        Node root = parse("var a = 1; a.x = 2;");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameA = namespace.getNameIndex().get("a");
        assertFalse(nameA.canCollapse());
    }

    @Test
    public void testGetOrCreateNameParent() {
        Node root = parse("var a = {}; a.b = 1;");
        namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameAB = namespace.getNameIndex().get("a.b");
        assertNotNull(nameAB);
        assertEquals("a", nameAB.parent.name);
    }

    @Test
    public void testManyLevelsOfProperties() {
        Node root = parse("var a = {}; a.b.c.d = 1;");
        namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getNameIndex().get("a.b"));
        assertNotNull(namespace.getNameIndex().get("a.b.c"));
        assertNotNull(namespace.getNameIndex().get("a.b.c.d"));
    }

    @Test
    public void testInExternsHandling() {
        Node externs = parse("var externVar;");
        Node root = parse("function f() { var x = 1; }");
        namespace = new GlobalNamespace(compiler, externs, root);
        assertNotNull(namespace.getNameIndex().get("externVar"));
    }

    private Node parse(String source) {
        // Simplified parser for testing - use JSCompCorpusTestCase if available
        return new JSCompCorpusTestCase(new TestCompiler(), source).getLastRoot();
    }
}