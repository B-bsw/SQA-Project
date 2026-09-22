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

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

@RunWith(JUnit4.class)
public class FunctionTypeBuilderTest {

    private FunctionTypeBuilder builder;
    private AbstractCompiler compiler;
    private Node errorRoot;
    private String sourceName;
    private Scope scope;
    private JSTypeRegistry typeRegistry;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        errorRoot = new Node(Token.SCRIPT);
        sourceName = "test.js";
        scope = new TestScope();
        typeRegistry = compiler.getTypeRegistry();
        builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
    }

    @Test
    public void testConstructor() {
        assertNotNull(builder);
        assertEquals("testFn", builder.fnName);
        assertEquals(compiler, builder.compiler);
        assertEquals(errorRoot, builder.errorRoot);
        assertEquals(sourceName, builder.sourceName);
        assertEquals(scope, builder.scope);
    }

    @Test
    public void testSetSourceNode() {
        Node sourceNode = new Node(Token.FUNCTION);
        builder.setSourceNode(sourceNode);
        assertEquals(sourceNode, builder.sourceNode);
    }

    @Test
    public void testInferFromOverriddenFunction_withoutParams() {
        FunctionType oldType = createFunctionType();
        FunctionTypeBuilder result = builder.inferFromOverriddenFunction(oldType, null);
        assertNotNull(result);
    }

    @Test
    public void testInferFromOverriddenFunction_withParams() {
        FunctionType oldType = createFunctionType();
        Node paramsParent = new Node(Token.PARAM_LIST);
        FunctionTypeBuilder result = builder.inferFromOverriddenFunction(oldType, paramsParent);
        assertNotNull(result);
    }

    @Test
    public void testInferReturnType_withNullInfo() {
        JSDocInfo info = null;
        builder.inferReturnType(info);
        assertNotNull(builder.returnType);
    }

    @Test
    public void testInferReturnType_withInfoNoReturnType() {
        JSDocInfo info = new JSDocInfo();
        builder.inferReturnType(info);
        assertNotNull(builder.returnType);
    }

    @Test
    public void testInferReturnType_withInfoAndReturnType() {
        JSDocInfo info = new JSDocInfo();
        info.setReturnType(new JSTypeExpression(new Node(Token.NUMBER), "test"));
        builder.inferReturnType(info);
        assertNotNull(builder.returnType);
    }

    @Test
    public void testInferThisType_withNullInfoAndNullOwner() {
        JSDocInfo info = null;
        Node owner = null;
        builder.inferThisType(info, owner);
        assertNull(builder.thisType);
    }

    @Test
    public void testInferThisType_withInfoAndNoThisType() {
        JSDocInfo info = new JSDocInfo();
        Node owner = new Node(Token.NAME);
        builder.inferThisType(info, owner);
        assertNull(builder.thisType);
    }

    @Test
    public void testInferThisType_withInfoAndThisType() {
        JSDocInfo info = new JSDocInfo();
        JSTypeExpression thisTypeExpr = new JSTypeExpression(new Node(Token.OBJECT), "test");
        info.setThisType(thisTypeExpr);
        Node owner = new Node(Token.NAME);
        builder.inferThisType(info, owner);
        assertNull(builder.thisType);
    }

    @Test
    public void testInferInheritance_withNullInfo() {
        JSDocInfo info = null;
        builder.inferInheritance(info);
        assertFalse(builder.isConstructor);
        assertFalse(builder.isInterface);
        assertNull(builder.baseType);
        assertNull(builder.implementedInterfaces);
    }

    @Test
    public void testInferInheritance_withInfoNoBaseType() {
        JSDocInfo info = new JSDocInfo();
        builder.inferInheritance(info);
        assertNull(builder.baseType);
        assertNull(builder.implementedInterfaces);
    }

    @Test
    public void testInferInheritance_withInfoAndConstructor() {
        JSDocInfo info = new JSDocInfo();
        info.setConstructor(true);
        info.setBaseType(new JSTypeExpression(new Node(Token.NAME, new Node(Token.NAME)), "test"));
        builder.inferInheritance(info);
        assertTrue(builder.isConstructor);
        assertNotNull(builder.baseType);
    }

    @Test
    public void testInferInheritance_withInfoAndInterface() {
        JSDocInfo info = new JSDocInfo();
        info.setInterface(true);
        info.setBaseType(new JSTypeExpression(new Node(Token.NAME, new Node(Token.NAME)), "test"));
        builder.inferInheritance(info);
        assertTrue(builder.isInterface);
        assertNotNull(builder.baseType);
    }

    @Test
    public void testInferParameterTypes_withNullInfo() {
        JSDocInfo info = null;
        builder.inferParameterTypes(info);
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testInferParameterTypes_withInfo() {
        JSDocInfo info = new JSDocInfo();
        builder.inferParameterTypes(info);
        assertNotNull(builder.parametersNode);
    }

    @Test
    public void testAddParameter_requiredParameter() {
        JSDocInfo info = new JSDocInfo();
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), false, false, false);
        assertFalse(result);
        assertNotNull(paramBuilder.build());
    }

    @Test
    public void testAddParameter_optionalParameter() {
        JSDocInfo info = new JSDocInfo();
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), true, false, false);
        assertFalse(result);
        assertNotNull(paramBuilder.build());
    }

    @Test
    public void testAddParameter_varArgsParameter() {
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), false, true, false);
        assertFalse(result);
        assertNotNull(paramBuilder.build());
    }

    @Test
    public void testAddParameter_dupVarArgs() {
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        builder.addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), false, true, false);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), false, true, false);
        assertTrue(result);
    }

    @Test
    public void testEmitWarning_requiredAfterOptional() {
        builder.parametersNode = new FunctionParamBuilder(typeRegistry).build();
        boolean result = builder.emitWarning(true, true);
        assertTrue(result);
    }

    @Test
    public void testEmitWarning_noWarned() {
        boolean result = builder.emitWarning(false, false);
        assertFalse(result);
    }

    @Test
    public void testEmitWarning_alreadyWarned() {
        boolean result = builder.emitWarning(true, false);
        assertTrue(result);
        result = builder.emitWarning(true, true);
        assertTrue(result);
    }

    private FunctionType createFunctionType() {
        return new FunctionBuilder(typeRegistry)
                .withReturnType(typeRegistry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE))
                .build();
    }

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public boolean isOptionalParameter(Node parameter) {
                    return false;
                }
                @Override
                public boolean isVarArgsParameter(Node parameter) {
                    return false;
                }
            };
        }
        @Override
        JSTypeRegistry getTypeRegistry() {
            return new JSTypeRegistry();
        }
    }

    private static class TestScope extends Scope {
    }
}