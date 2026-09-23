package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.jscomp.testing.JSCompHelper;

public class TypedScopeCreatorTest {

    private static final String EXTERN = "var window; var document;";
    
    @Test
    public void testCreateScopeWithNullParent() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        Node root = compiler.parseSyntheticCode("var x = 1; function f() {}");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testCreateScopeWithParent() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        Node root = compiler.parseSyntheticCode("var x = 1;");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope parent = new Scope(null, root);
        Scope scope = creator.createScope(root, parent);
        assertNotNull(scope);
        assertEquals(parent, scope.getParent());
    }

    @Test
    public void testCreateScopeWithExternDefinitions() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.getInput(0).setCode("var externVar = 10;");
        compiler.ignoreErrors();
        Node root = compiler.parseSyntheticCode("var localVar = 20;");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("externVar"));
        assertNotNull(scope.getVar("localVar"));
    }

    @Test
    public void testCreateScopeWithFunctionDeclaration() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        Node root = compiler.parseSyntheticCode("function foo() {}; foo();");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("foo"));
        assertTrue(scope.getVar("foo").getType().isFunctionType());
    }

    @Test
    public void testCreateScopeWithVarDeclarationNoInitialValue() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        Node root = compiler.parseSyntheticCode("var x;");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
        assertNull(scope.getVar("x").getType());
    }

    @Test
    public void testCreateScopeWithNamedFunctionInsideExpression() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        Node root = compiler.parseSyntheticCode("var f = function foo() {};");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("f"));
        assertNotNull(scope.getVar("foo")); // named function expression
    }

    @Test
    public void testCreateScopeWithEnumTypeAnnotation() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        String code = "/** @enum {number} */ var E = {A: 1, B: 2};";
        Node root = compiler.parseSyntheticCode(code);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("E"));
        assertTrue(scope.getVar("E").getType().isEnumType());
    }

    @Test
    public void testCreateScopeWithConstructor() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        String code = "/** @constructor */ function Foo() {};";
        Node root = compiler.parseSyntheticCode(code);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("Foo"));
        assertTrue(scope.getVar("Foo").getType().isConstructor());
    }

    @Test
    public void testCreateScopeWithRValueTypeInference() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        String code = "var x = 10; var s = 'hello'; var b = true;";
        Node root = compiler.parseSyntheticCode(code);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertTrue(scope.getVar("x").getType().isNumber());
        assertTrue(scope.getVar("s").getType().isString());
        assertTrue(scope.getVar("b").getType().isBoolean());
    }

    @Test
    public void testCreateScopeWithNoTypeInfo() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        Node root = compiler.parseSyntheticCode("var x = {}; x.y = function() {};");
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("x"));
        assertNull(scope.getVar("x").getType());
    }

    @Test
    public void testCreateScopeWithFunctionTypeAnnotation() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        String code = "/** @type {function(): number} */ var f;";
        Node root = compiler.parseSyntheticCode(code);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("f"));
        assertTrue(scope.getVar("f").getType().isFunctionType());
    }

    @Test
    public void testCreateScopeWithNameDefinitionInCatch() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        String code = "try {} catch (e) {}";
        Node root = compiler.parseSyntheticCode(code);
        TypedScopeCreator creator = new TypedScopeCreator(compiler);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("e"));
    }
}