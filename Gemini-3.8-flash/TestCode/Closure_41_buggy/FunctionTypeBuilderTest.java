package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.List;

public class FunctionTypeBuilderTest {
    private FunctionTypeBuilder builder;
    private AbstractCompiler compiler;
    private Node errorRoot;
    private String sourceName;
    private Scope scope;
    private JSTypeRegistry typeRegistry;

    private static class TestCompiler extends AbstractCompiler {
        private final CodingConvention convention = new ClosureCodingConvention();
        private final JSTypeRegistry registry = new JSTypeRegistry();

        @Override
        public CodingConvention getCodingConvention() {
            return convention;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        errorRoot = new Node(Token.SCRIPT);
        sourceName = "test.js";
        scope = new Scope(compiler.getTypeRegistry().getNativeObjectType(
            compiler.getTypeRegistry().getNativeType(JSTypeNative.OBJECT_TYPE)), null);
        typeRegistry = compiler.getTypeRegistry();
        builder = new FunctionTypeBuilder("testFn", compiler, errorRoot, sourceName, scope);
    }

    @Test
    public void testConstructorWithNullErrorRoot() {
        try {
            new FunctionTypeBuilder("test", compiler, null, sourceName, scope);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testSetContentsWithNull() {
        FunctionTypeBuilder result = builder.setContents(null);
        assertSame(builder, result);
    }

    @Test
    public void testSetContentsWithValidContents() {
        FunctionContents contents = new FunctionTypeBuilder.AstFunctionContents(new Node(Token.SCRIPT));
        FunctionTypeBuilder result = builder.setContents(contents);
        assertSame(builder, result);
    }

    @Test
    public void testInferThisTypeWithNullInfoAndType() {
        builder.inferThisType(null, null);
        assertNull(builder.thisType);
    }

    @Test
    public void testInferThisTypeWithValidObjectType() {
        JSType type = typeRegistry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node node = new Node(Token.THIS);
        JSDocInfo info = new JSDocInfo();
        builder.inferThisType(info, type);
        assertNotNull(builder.thisType);
    }

    @Test
    public void testInferInheritanceWithBaseType() {
        JSDocInfo info = new JSDocInfo();
        info.setConstructor(true);
        info.setBaseType(new JSTypeExpression(new Node(Token.STRING), "Object"));
        builder.inferInheritance(info);
        assertFalse(builder.isConstructor);
    }

    @Test
    public void testInferReturnTypeWithTemplateType() {
        JSDocInfo info = new JSDocInfo();
        JSType templateType = typeRegistry.createTypeFromExpressionString("function(T):T");
        info.setReturnType(templateType);
        builder.templateTypeName = "T";
        FunctionTypeBuilder result = builder.inferReturnType(info);
        assertFalse(result.returnTypeInferred);
    }

    @Test
    public void testUnknownFunctionContentsMethods() {
        FunctionTypeBuilder.UnknownFunctionContents contents = 
            FunctionTypeBuilder.UnknownFunctionContents.get();
        assertNull(contents.getSourceNode());
        assertFalse(contents.mayBeFromExterns());
        assertFalse(contents.mayHaveNonEmptyReturns());
        assertTrue(contents.getEscapedVarNames() instanceof List);
        assertEquals(0, contents.getEscapedVarNames().size());
    }

    @Test
    public void testAstFunctionContentsWithNullNode() {
        try {
            new FunctionTypeBuilder.AstFunctionContents(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAstFunctionContentsWithNode() {
        Node node = new Node(Token.SCRIPT);
        FunctionTypeBuilder.AstFunctionContents contents = 
            new FunctionTypeBuilder.AstFunctionContents(node);
        assertEquals(node, contents.getSourceNode());
        assertFalse(contents.mayBeFromExterns());
    }

    @Test
    public void testAddParameterWithOptionalParam() {
        Node param = new Node(Token.NAME, "param");
        param.setOptionalArg(true);
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(
            JSTypeNative.NUMBER_TYPE), false, true, false);
        assertTrue(result);
    }

    @Test
    public void testAddParameterWithVarArgs() {
        Node param = new Node(Token.NAME, "param");
        param.setVarArgs(true);
        FunctionParamBuilder paramBuilder = new FunctionParamBuilder(typeRegistry);
        boolean result = builder.addParameter(paramBuilder, typeRegistry.getNativeType(
            JSTypeNative.NUMBER_TYPE), false, false, true);
        assertTrue(result);
    }

    @Test
    public void testReportWarning() {
        builder.reportWarning(EXTENDS_WITHOUT_TYPEDEF, "arg1");
        // Verify no exception is thrown
    }

    @Test
    public void testInferParameterTypesWithNullInfo() {
        FunctionTypeBuilder result = builder.inferParameterTypes(null);
        assertSame(builder, result);
    }
}