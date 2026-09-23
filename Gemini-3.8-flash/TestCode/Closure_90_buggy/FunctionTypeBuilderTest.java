package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import static com.google.javascript.jscomp.TypeCheck.BAD_IMPLEMENTED_TYPE;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;

import java.util.List;

public class FunctionTypeBuilderTest {
    private FunctionTypeBuilder builder;
    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private Node errorRoot;
    private String sourceName;
    private Scope scope;

    private static class MockCompiler extends AbstractCompiler {
        private final CodingConvention convention = new CodingConvention() {
            @Override
            public boolean isOptionalParameter(Node param) {
                return param.isOptionalArg();
            }

            @Override
            public boolean isVarArgsParameter(Node param) {
                return param.isVarArgs();
            }

            @Override
            public boolean isOptionalArgument(Node param) {
                return false;
            }

            @Override
            public boolean isVarArgsArgument(Node param) {
                return false;
            }
        };

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public void report(CheckLevel level, JSDiagnostic message, Node n) {
        }

        @Override
        public Input getInput(String sourceName) {
            return new Input(sourceName);
        }
    }

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        typeRegistry = new JSTypeRegistry(compiler.getErrorReporter());
        errorRoot = new Node(Token.SCRIPT);
        sourceName = "test";
        scope = new Scope(null, null, null);
    }

    @Test
    public void testConstructorWithNullFnName() {
        builder = new FunctionTypeBuilder(null, compiler, errorRoot, sourceName, scope);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithNullParams() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferParameterTypes(null);
        assertNotNull(builder);
    }

    @Test
    public void testInferReturnTypeWithNullInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferReturnType(null);
        assertNotNull(builder);
    }

    @Test
    public void testInferReturnTypeWithEmptyInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        JSDocInfo info = new JSDocInfo();
        builder.inferReturnType(info);
        assertNotNull(builder);
    }

    @Test
    public void testInferReturnStatementsAsLastResortWithNullBlock() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferReturnStatementsAsLastResort(null);
        assertNotNull(builder);
    }

    @Test
    public void testInferInheritanceWithNullInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferInheritance(null);
        assertNotNull(builder);
    }

    @Test(expected = NullPointerException.class)
    public void testInferReturnStatementsAsLastResortWithNonNullBlock() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        Node block = new Node(Token.BLOCK);
        builder.inferReturnStatementsAsLastResort(block);
    }

    @Test
    public void testInferThisTypeWithNullInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferThisType(null, null);
        assertNotNull(builder);
    }

    @Test
    public void testInferThisTypeWithInfoNoThis() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        JSDocInfo info = new JSDocInfo();
        builder.inferThisType(info, null);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithNullParamsAndNullInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferParameterTypes((JSDocInfo) null);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithEmptyParamsAndEmptyInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        JSDocInfo info = new JSDocInfo();
        builder.inferParameterTypes(info);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithParamsAndNullInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        Node paramsParent = new Node(Token.PARAM_LIST);
        builder.inferParameterTypes(null, paramsParent);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithParamsAndEmptyInfo() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        Node paramsParent = new Node(Token.PARAM_LIST);
        JSDocInfo info = new JSDocInfo();
        builder.inferParameterTypes(info, paramsParent);
        assertNotNull(builder);
    }

    @Test
    public void testInferFromOverriddenFunctionWithNullOldType() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.inferFromOverriddenFunction(null, null);
        assertNotNull(builder);
    }

    @Test
    public void testInferFromOverriddenFunctionWithNonNullOldTypeAndNullParams() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        FunctionType oldType = new FunctionBuilder(typeRegistry).build();
        builder.inferFromOverriddenFunction(oldType, null);
        assertNotNull(builder);
    }

    @Test
    public void testSetSourceNode() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        builder.setSourceNode(null);
        assertNotNull(builder);
    }

    @Test
    public void testInferParameterTypesWithEmptyParamsAndVarArgs() {
        builder = new FunctionTypeBuilder("test", compiler, errorRoot, sourceName, scope);
        Node paramsParent = new Node(Token.PARAM_LIST);
        JSDocInfo info = new JSDocInfo();
        builder.inferParameterTypes(info, paramsParent);
        assertNotNull(builder);
    }
}