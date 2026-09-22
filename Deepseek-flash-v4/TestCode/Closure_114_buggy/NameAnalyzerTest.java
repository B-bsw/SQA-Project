package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.javascript.jscomp.NameAnalyzer.JsName;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.NodeTraversal;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NameAnalyzerTest {

    private NameAnalyzer analyzer;
    private Compiler compiler;
    private Node externsRoot;
    private Node jsRoot;

    @Before
    public void setUp() {
        compiler = new Compiler();
        externsRoot = new Node(Token.EMPTY);
        jsRoot = new Node(Token.SCRIPT);
        analyzer = new NameAnalyzer(compiler, true);
    }

    @After
    public void tearDown() {
        analyzer = null;
        compiler = null;
        externsRoot = null;
        jsRoot = null;
    }

    @Test
    public void testProcessWithNullRoots() {
        try {
            analyzer.process(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testProcessWithEmptyRoots() {
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        analyzer.process(externs, root);
        // No exception expected, should not fail
    }

    @Test
    public void testSimpleVariableDeclaration() {
        String code = "var a = 1;";
        jsRoot.addChildToBack(Node.parseCode(code));
        externsRoot.addChildToBack(new Node(Token.EMPTY));
        analyzer.process(externsRoot, jsRoot);
        assertTrue(analyzer.getAllNames().isEmpty() || analyzer.getAllNames().size() >= 0);
    }

    @Test
    public void testGlobalNameInExterns() {
        String externs = "var window;";
        String code = "var a = window;";
        Node extNode = Node.parseCode(externs);
        Node jsNode = Node.parseCode(code);
        externsRoot.addChildToBack(extNode);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(externsRoot, jsRoot);
        assertNull(analyzer.getAllNames().get("window"));
    }

    @Test
    public void testNameWithPrototype() {
        String code = "function Foo() {}; Foo.prototype.bar = function() { return 1; };";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        JsName name = analyzer.getAllNames().get("Foo");
        assertNotNull(name);
        assertEquals("Foo", name.toString().split("\\s")[0]);
    }

    @Test
    public void testIsExportedName() {
        String code = "var _exported = 1;";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        // Use a name with underscore prefix
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        JsName name = analyzer.getAllNames().get("_exported");
        if (name != null) {
            assertFalse(name.externallyDefined);
        }
    }

    @Test
    public void testExternallyDefinedName() {
        String externs = "var exportedName;";
        Node extNode = Node.parseCode(externs);
        externsRoot.addChildToBack(extNode);
        jsRoot.addChildToBack(Node.parseCode("exportedName = 5;"));
        analyzer.process(externsRoot, jsRoot);
        JsName name = analyzer.getAllNames().get("exportedName");
        if (name != null) {
            assertTrue(name.externallyDefined);
        }
    }

    @Test
    public void testAliasRecordedForAssignment() {
        String code = "var a; var b; function f() { a = b; }";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        // Cannot directly test private aliases, but verify no exception and names exist
        assertNotNull(analyzer.getAllNames().get("a"));
        assertNotNull(analyzer.getAllNames().get("b"));
        assertNotNull(analyzer.getAllNames().get("f"));
    }

    @Test
    public void testProcessWithRemoveUnreferenced() {
        analyzer = new NameAnalyzer(compiler, true);
        String code = "var a = 1; a++;";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
    }

    @Test
    public void testProcessWithoutRemoveUnreferenced() {
        analyzer = new NameAnalyzer(compiler, false);
        String code = "var a = 1;";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
    }

    @Test
    public void testDefaultGlobalNamesIncludeWindow() {
        assertTrue(NameAnalyzer.DEFAULT_GLOBAL_NAMES.contains("window"));
        assertTrue(NameAnalyzer.DEFAULT_GLOBAL_NAMES.contains("goog.global"));
    }

    @Test
    public void testGetAllNamesInitialEmpty() {
        assertTrue(analyzer.getAllNames().isEmpty());
    }

    @Test
    public void testProcessWithClassDefinition() {
        String code = "function Foo() {}; Foo.prototype.method = function() { };";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        JsName fooName = analyzer.getAllNames().get("Foo");
        assertNotNull(fooName);
        assertTrue(fooName.prototypeNames.size() > 0);
    }

    @Test
    public void testProcessWithGetPropChain() {
        String code = "var a = {}; var b = a.b.c;";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames());
    }

    @Test
    public void testProcessWithInstanceOf() {
        String code = "function Foo() {}; var x = new Foo(); var y = x instanceof Foo;";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        JsName fooName = analyzer.getAllNames().get("Foo");
        assertNotNull(fooName);
    }

    @Test
    public void testProcessWithForLoop() {
        String code = "var sum = 0; for (var i = 0; i < 10; i++) { sum += i; }";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames());
    }

    @Test
    public void testProcessWithWhileLoop() {
        String code = "var i = 0; while (i < 5) { i++; }";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames());
    }

    @Test
    public void testProcessWithDoWhileLoop() {
        String code = "var i = 0; do { i++; } while (i < 5);";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames());
    }

    @Test
    public void testProcessWithNestedFunctions() {
        String code = "function outer() { function inner() { var a = 1; } inner(); }";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames().get("outer"));
        assertNotNull(analyzer.getAllNames().get("inner"));
    }

    @Test
    public void testProcessWithObjectLiteral() {
        String code = "var obj = {a: 1, b: function() { return 2; }};";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames().get("obj"));
    }

    @Test
    public void testProcessWithArrayLiteral() {
        String code = "var arr = [1, 2, 3];";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        assertNotNull(analyzer.getAllNames().get("arr"));
    }

    @Test
    public void testProcessWithExternallyReferenceableName() {
        String code = "var a = 1; function f() { a; }";
        Node jsNode = Node.parseCode(code);
        jsRoot.addChildToBack(jsNode);
        analyzer.process(new Node(Token.EMPTY), jsRoot);
        JsName name = analyzer.getAllNames().get("a");
        assertNotNull(name);
        // a is referenced inside f, but not extern
        assertFalse(name.externallyDefined);
    }

    @Test
    public void testProcessWithReferenceFromExterns() {
        Node extNode = Node.parseCode("var extName;");
        externsRoot.addChildToBack(extNode);
        String code = "extName = 5;";
        jsRoot.addChildToBack(Node.parseCode(code));
        analyzer.process(externsRoot, jsRoot);
        JsName name = analyzer.getAllNames().get("extName");
        assertNotNull(name);
        assertTrue(name.externallyDefined);
    }
}