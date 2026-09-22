package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TypeCheckTest {
    private TypeCheck typeCheck;
    private JSTypeRegistry registry;
    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        registry = compiler.getTypeRegistry();
        typeCheck = new TypeCheck(compiler);
    }

    @After
    public void tearDown() {
        typeCheck = null;
        registry = null;
        compiler = null;
    }

    @Test
    public void testGetNativeType_NormalCase() {
        JSType type = typeCheck.getNativeType(JSTypeNative.ARRAY_TYPE);
        assertNotNull(type);
        assertTrue(type.isArrayType());
    }

    @Test
    public void testGetNativeType_UnknownTypeId() {
        JSType type = typeCheck.getNativeType(JSTypeNative.VOID_TYPE);
        assertNotNull(type);
        assertEquals("void", type.toString());
    }

    @Test
    public void testGetNativeType_NullRegistryType() {
        try {
            typeCheck.getNativeType(JSTypeNative.UNKNOWN_TYPE);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCheckTypeofComparison_BothTypeofAndString() {
        Node n = new Node(Token.NE);
        n.addChildToBack(new Node(Token.TYPEOF));
        n.addChildToBack(Node.newString("string"));
        
        typeCheck.checkNode(n, false);
    }

    @Test
    public void testCheckNode_ExternsTrue() {
        Node n = new Node(Token.SCRIPT);
        n.setType(Token.SCRIPT);
        typeCheck.check(n, true);
    }

    @Test
    public void testCheckNode_NoTypeCheckWithInfo() {
        Node n = new Node(Token.NAME, "x");
        JSDocInfo info = new JSDocInfo();
        info.setNoTypeCheck();
        n.setJSDocInfo(info);
        n.setType(Token.NAME);
        typeCheck.check(n, false);
    }

    @Test
    public void testShouldTraverse_FunctionNameNotEmpty() {
        Node functionNode = new Node(Token.FUNCTION);
        String functionName = "myFunction";
        typeCheck.setCurrentFunctionName(functionName);
        assertTrue(typeCheck.shouldTraverse(null, functionNode, null) == true);
    }

    @Test
    public void testVisit_NoJSType() {
        Node n = new Node(Token.NAME, "x");
        n.setType(Token.NAME);
        n.clearJSType();
        typeCheck.visit(null, n, null);
    }

    @Test
    public void testVisit_UnknownTypeWithReport() {
        Node n = new Node(Token.NAME, "x");
        n.setType(Token.NAME);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        n.setJSType(unknownType);
        typeCheck.setReportUnknownTypes(true);
        typeCheck.visit(null, n, null);
    }

    @Test
    public void testVisit_EnumTypeCheck() {
        Node n = new Node(Token.NAME, "e");
        n.setType(Token.NAME);
        ObjectType enumType = registry.createEnumType("Color", registry.getNativeType(JSTypeNative.STRING_TYPE));
        n.setJSType(enumType);
        typeCheck.visit(null, n, null);
    }

    @Test
    public void testVisit_PropertyTest() {
        Node n = new Node(Token.STRING_KEY, "prop");
        n.setType(Token.STRING_KEY);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.addChildToBack(n);
        typeCheck.visit(null, objLit, null);
    }

    @Test
    public void testVisit_ObjectLiteralWithDict() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.STRING_KEY, "key");
        key.setString("key");
        objLit.addChildToBack(key);
        objLit.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        typeCheck.visit(null, objLit, null);
    }

    @Test
    public void testVisit_ObjectLiteralWithType() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node key = new Node(Token.STRING_KEY, "key");
        key.setString("key");
        objLit.addChildToBack(key);
        JSType objType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        objLit.setJSType(objType);
        key.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        typeCheck.visit(null, objLit, null);
    }

    @Test
    public void testProcessForTesting_ExternsAndJs() {
        Node externs = new Node(Token.SCRIPT);
        Node js = new Node(Token.SCRIPT);
        typeCheck.processForTesting(externs, js);
    }

    @Test
    public void testProcess_NullExterns() {
        Node jsRoot = new Node(Token.SCRIPT);
        typeCheck.process(null, jsRoot);
    }

    @Test
    public void testReportTypeMismatch_SideEffect() {
        Node n = new Node(Token.NAME, "x");
        n.setType(Token.NAME);
        typeCheck.reportTypeMismatch(n, "test message");
        assertEquals("test message", n.getJSDocInfo() == null ? "" : "");
    }

    @Test
    public void testCheckUnknownType_WithImplicitCast() {
        Node n = new Node(Token.NAME, "x");
        n.setType(Token.NAME);
        JSDocInfo docInfo = new JSDocInfo();
        docInfo.setImplicitCast(true);
        n.setJSDocInfo(docInfo);
        typeCheck.checkUnknownType(null, n, false);
    }

    @Test
    public void testCheckUnknownType_NoDocInfo() {
        Node n = new Node(Token.NAME, "x");
        n.setType(Token.NAME);
        typeCheck.checkUnknownType(null, n, false);
    }
}