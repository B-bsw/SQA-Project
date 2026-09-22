package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.Result;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class TypedScopeCreatorTest {

    private Compiler compiler;
    private JSTypeRegistry typeRegistry;
    private TypedScopeCreator creator;
    private Node rootNode;
    private Scope globalScope;

    @Before
    public void setUp() throws Exception {
        compiler = new Compiler();
        typeRegistry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler, compiler.getCodingConvention());
    }

    @After
    public void tearDown() {
        compiler = null;
        typeRegistry = null;
        creator = null;
        rootNode = null;
        globalScope = null;
    }

    private Node parseAndCreateScope(String code) {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(CompilerOptions.LanguageMode.ECMASCRIPT5);
        compiler.init(new ArrayList<SourceFile>(), Arrays.asList(SourceFile.fromCode("test.js", code)), options);
        Node root = compiler.parseInputs();
        assertNotNull("Failed to parse input", root);
        globalScope = creator.createScope(root, null);
        return root;
    }

    @Test
    public void testCreateScopeWithNullParent() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test"));
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertEquals(root, scope.getRootNode());
    }

    @Test
    public void testCreateScopeWithParentAndExistingType() {
        parseAndCreateScope("var a = 1;");
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNotNull(a.getType());
    }

    @Test
    public void testCreateScopeWithFunctionParent() {
        String code = "function f() { var x = 1; }";
        parseAndCreateScope(code);
        Node fnNode = findFunctionNode(rootNode, "f");
        assertNotNull(fnNode);
        Scope fnScope = creator.createScope(fnNode, globalScope);
        assertNotNull(fnScope);
        assertTrue(fnScope.isLocal());
        assertNull(fnScope.getVar("x"));
    }

    @Test
    public void testCreateScopeWithRedeclaredVar() {
        String code = "var a; var a;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
    }

    @Test
    public void testDeclareVarWithRValueFunction() {
        String code = "var f = function() {};";
        parseAndCreateScope(code);
        Var f = globalScope.getVar("f");
        assertNotNull(f);
        assertNotNull(f.getType());
        assertTrue(f.getType().isFunctionType());
    }

    @Test
    public void testDeclareVarWithNullRValue() {
        String code = "var a;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNull(a.getType());
    }

    @Test
    public void testDeclareVarWithTypeAnnotation() {
        String code = "/** @type {number} */ var a;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), a.getType());
    }

    @Test
    public void testDeclareVarWithConstantName() {
        String code = "var CONSTANT = 1;";
        parseAndCreateScope(code);
        Var c = globalScope.getVar("CONSTANT");
        assertNotNull(c);
        assertNotNull(c.getType());
    }

    @Test
    public void testDeclareVarWithEnum() {
        String code = "/** @enum {string} */ var E = {A: 'a', B: 'b'};";
        parseAndCreateScope(code);
        Var e = globalScope.getVar("E");
        assertNotNull(e);
        assertTrue(e.getType().isEnumType());
    }

    @Test
    public void testDeclareVarWithTypedef() {
        String code = "/** @typedef {number|string} */ var MyType;";
        parseAndCreateScope(code);
        Var t = globalScope.getVar("MyType");
        assertNotNull(t);
        assertNotNull(t.getType());
    }

    @Test
    public void testDeclareVarWithEnumValue() {
        String code = "/** @enum {number} */ var E = {A: 1, B: 2}; var x = E.A;";
        parseAndCreateScope(code);
        Var x = globalScope.getVar("x");
        assertNotNull(x);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), x.getType());
    }

    @Test
    public void testDeclareVarWithInvalidEnumKey() {
        String code = "/** @enum {number} */ var E = {1: 1};";
        try {
            parseAndCreateScope(code);
            fail("Expected RuntimeException for invalid enum key");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Invalid enum key"));
        }
    }

    @Test
    public void testDeclareVarWithLendsAnnotation() {
        String code = "/** @lends {Foo} */ var obj = {a: 1};";
        parseAndCreateScope(code);
        Var obj = globalScope.getVar("obj");
        assertNotNull(obj);
        assertNotNull(obj.getType());
    }

    @Test
    public void testDeclareVarWithTypeOverride() {
        String code = "/** @type {number} */ var a = 'string';";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), a.getType());
    }

    @Test
    public void testDeclareVarWithTypeAnnotationInJSDoc() {
        String code = "/** @type {boolean} */ var b;";
        parseAndCreateScope(code);
        Var b = globalScope.getVar("b");
        assertNotNull(b);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.BOOLEAN_TYPE), b.getType());
    }

    @Test
    public void testDeclarePropertyWithDuplicate() {
        String code = "var obj = {x: 1, x: 2};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.getPropertyType("x"));
    }

    @Test
    public void testDeclarePropertyWithQuotedName() {
        String code = "var obj = {'a-b': 1};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertNotNull(objType.getPropertyType("a-b"));
    }

    @Test
    public void testDeclarePropertyWithInvalidEnumKey() {
        String code = "var obj = {'1': 1};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertNotNull(objType.getPropertyType("1"));
    }

    @Test
    public void testDeclarePropertyWithQuotedNumericKey() {
        String code = "var obj = {'1': 1};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertNotNull(objType.getPropertyType("1"));
    }

    @Test
    public void testDeclarePropertyWithNumericKey() {
        String code = "var obj = {1: 'a'};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.STRING_TYPE), objType.getPropertyType("1"));
    }

    @Test
    public void testDeclarePropertyWithInferredType() {
        String code = "var obj = {a: 1};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.getPropertyType("a"));
    }

    @Test
    public void testDeclarePropertyWithFunctionType() {
        String code = "var obj = {f: function() {}};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertTrue(objType.getPropertyType("f").isFunctionType());
    }

    @Test
    public void testDeclarePropertyWithEnumType() {
        String code = "/** @enum {number} */ var E = {A: 1}; var obj = {e: E.A};";
        parseAndCreateScope(code);
        Var objVar = globalScope.getVar("obj");
        assertNotNull(objVar);
        ObjectType objType = objVar.getType().toObjectType();
        assertNotNull(objType);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), objType.getPropertyType("e"));
    }

    @Test
    public void testDeclareVarWithRValueComplex() {
        String code = "var a = (function() { return 1; })();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNotNull(a.getType());
    }

    @Test
    public void testDeclareVarWithRValueOr() {
        String code = "var a = b || c;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNull(a.getType());
    }

    @Test
    public void testDeclareVarWithRValueQualifiedName() {
        String code = "var a = {}; var b = a.x;";
        parseAndCreateScope(code);
        Var b = globalScope.getVar("b");
        assertNotNull(b);
        assertNull(b.getType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndVoid0() {
        String code = "function f() {} var a = f();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertTrue(a.getType().isVoidType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndVoid() {
        String code = "function f() { return; } var a = f();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertTrue(a.getType().isVoidType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndReturn() {
        String code = "function f() { return 1; } var a = f();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertEquals(typeRegistry.getNativeType(JSTypeNative.NUMBER_TYPE), a.getType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndReturnNull() {
        String code = "function f() { return null; } var a = f();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertTrue(a.getType().isNullType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndThis() {
        String code = "function f() { this.x = 1; }";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("f");
        assertNotNull(a);
        FunctionType fnType = a.getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertNotNull(fnType.getTypeOfThis());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndPrototype() {
        String code = "function f() {} f.prototype.m = function() {};";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("f");
        assertNotNull(a);
        FunctionType fnType = a.getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertNotNull(fnType.getInstanceType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndInherits() {
        String code = "/** @constructor */ function A() {} /** @constructor */ function B() {} B.prototype = new A();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("A");
        assertNotNull(a);
        Var b = globalScope.getVar("B");
        assertNotNull(b);
        FunctionType bType = b.getType().toMaybeFunctionType();
        assertNotNull(bType);
        assertNotNull(bType.getInstanceType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndDelegate() {
        String code = "/** @constructor */ function A() {} /** @constructor */ function B() {} B.prototype.method = function() {};";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("A");
        assertNotNull(a);
        Var b = globalScope.getVar("B");
        assertNotNull(b);
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndDelegateOf() {
        String code = "/** @constructor */ function A() {} /** @constructor */ function B() {} B.prototype.method = A.prototype.method;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("A");
        assertNotNull(a);
        Var b = globalScope.getVar("B");
        assertNotNull(b);
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndObjectLiteralCast() {
        String code = "var a = {x: 1};";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNotNull(a.getType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndCast() {
        String code = "/** @constructor */ function A() {} var a = /** @type {A} */ (new A());";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertTrue(a.getType().isConstructor());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndNewTarget() {
        String code = "var a = new Foo();";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNull(a.getType());
    }

    @Test
    public void testDeclareVarWithFunctionTypeAndQualifiedName() {
        String code = "var a = b.c.d;";
        parseAndCreateScope(code);
        Var a = globalScope.getVar("a");
        assertNotNull(a);
        assertNull(a.getType());
    }

    private Node findFunctionNode(Node root, String name) {
        if (root.isFunction() && root.getFirstChild().getString().equals(name)) {
            return root;
        }
        Node result = null;
        for (Node child = root.getFirstChild(); child != null && result == null; child = child.getNext()) {
            result = findFunctionNode(child, name);
        }
        return result;
    }
}