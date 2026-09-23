package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

public class TypedScopeCreatorTest {
    private static final String EXTERNS = "var window = {}; window.Object; var Function;";

    private Compiler compiler;
    private JSTypeRegistry typeRegistry;
    private TypedScopeCreator creator;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setIdeMode(true);
        compiler.initOptions(options);
        typeRegistry = compiler.getTypeRegistry();
    }

    @Test
    public void testCreateScopeWithNullParent() {
        CompilerInput input = new CompilerInput(compiler.getCodeBuilder().build());
        input = new CompilerInput(compiler.getCodeBuilder().getSourceFile());
        Node root = compiler.parseInputs(CompilationLevel.WHITESPACE_ONLY);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertTrue(scope.getParent() == null);
    }

    @Test
    public void testCreateScopeWithParentAndFunctionType() {
        CompilerInput input = new CompilerInput(ScriptNodeBuilder.buildScriptNode("function f(){}"));
        compiler.getInputs().add(input);
        Node root = compiler.parseInputs(CompilationLevel.ADVANCED_OPTIMIZATIONS);
        Scope globalScope = Scope.createGlobalScope(root, typeRegistry);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root.getFirstChild(), globalScope);
        assertNotNull(scope);
        assertFalse(scope.isGlobal());
        assertEquals(globalScope, scope.getParent());
    }

    @Test
    public void testCreateScopeWithExternInput() {
        CompilerInput externInput = new CompilerInput(compiler.getCodeBuilder().build());
        Node root = compiler.parseInputs(CompilationLevel.WHITESPACE_ONLY);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testVisitFunctionWithJsDocType() {
        String code = "/** @constructor */ function C() {}";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertNotNull(scope.getVar("C"));
        assertTrue(scope.getVar("C").getType().isConstructor());
    }

    @Test
    public void testVisitEnumWithGetterProp() {
        String code = "var e = {}; e.E = function(){}; e.E[0] = 'a';";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertNotNull(scope.getVar("e"));
        assertNotNull(scope.getVar("e").getType());
    }

    @Test
    public void testVisitNameWithNullInfo() {
        String code = "var x = 1;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
        assertEquals(typeRegistry.NATIVE_TYPE_NUMBER, scope.getVar("x").getType());
    }

    @Test
    public void testVisitNameWithRhsFunction() {
        String code = "var f = function(){};";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("f"));
        assertTrue(scope.getVar("f").getType() instanceof FunctionType);
    }

    @Test
    public void testVisitNameWithRhsObjectLitEnum() {
        String code = "var e = {a: 1}; e.E = 0;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("e"));
    }

    @Test
    public void testVisitCatchBlock() {
        String code = "try { throw 1; } catch (e) {}";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("e"));
    }

    @Test
    public void testVisitGlobalThisRef() {
        String code = "this.x = 1;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getGlobalThis());
    }

    @Test
    public void testVisitExternFunction() {
        CompilerInput externInput = new CompilerInput(compiler.getCodeBuilder().build());
        String externs = "var externFunc;";
        CompilerInput input = new CompilerInput(compiler.getCodeBuilder().build());
        compiler.getExternsRoot().addChildToBack(compiler.parseCode(externs));
        Node root = compiler.parseInputs(CompilationLevel.WHITESPACE_ONLY);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testVisitAssignWithQualifiedName() {
        String code = "var a = {}; a.b = 1;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("a"));
        ObjectType type = (ObjectType) scope.getVar("a").getType();
        assertNotNull(type);
        assertTrue(type.hasProperty("b"));
    }

    @Test
    public void testVisitAssignWithInherits() {
        String code = "function C(){}; function D(){}; D.prototype = new C();";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        FunctionType ctor = (FunctionType) scope.getVar("D").getType();
        assertNotNull(ctor);
    }

    @Test
    public void testVisitAssignWithDelegateRelationship() {
        String code = "function C(){}; C.prototype.del = function(){}; function D(){}; D.prototype = C;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("D"));
    }

    @Test
    public void testVisitGetPropWithObjectLiteralCast() {
        String code = "var x = {a: 1}; y = x.a;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("y"));
    }

    @Test
    public void testVisitGetPropWithEnumKey() {
        String code = "var e = {a: 1}; e.b = 2;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("e"));
    }

    @Test
    public void testVisitGetPropWithNullOwnerType() {
        String code = "var x = {}; x.a = 1;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
    }

    @Test
    public void testVisitNameWithEnclosingType() {
        String code = "var ns = {}; ns.C = function(){}; ns.C.prototype.m = function(){};";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("ns"));
        ObjectType nsType = (ObjectType) scope.getVar("ns").getType();
        assertNotNull(nsType);
        assertTrue(nsType.hasProperty("C"));
    }

    @Test
    public void testVisitFunctionWithEnumAnnotation() {
        String code = "/** @enum {number} */ var E = {A: 1};";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("E"));
        assertTrue(scope.getVar("E").getType() instanceof EnumType);
    }

    @Test
    public void testVisitFunctionWithTypedefAnnotation() {
        String code = "/** @typedef {number|string} */ var T;";
        Node root = compiler.parseCode(code);
        creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("T"));
    }
}