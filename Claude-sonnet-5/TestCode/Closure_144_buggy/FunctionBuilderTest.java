package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

public class FunctionBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        // no-op
      }

      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        // no-op
      }
    });
  }

  // -------------------- withName --------------------

  @Test
  public void testWithName_normalCase() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withName("myFunction");
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertEquals("myFunction", type.getReferenceName());
  }

  @Test
  public void testWithName_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withName(null);
    FunctionType type = builder.build();
    assertNull(type.getReferenceName());
  }

  @Test
  public void testWithName_defaultIsNull() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();
    assertNull(type.getReferenceName());
  }

  // -------------------- withSourceNode --------------------

  @Test
  public void testWithSourceNode_normalCase() {
    Node sourceNode = new Node(Token.FUNCTION);
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withSourceNode(sourceNode);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertSame(sourceNode, type.getSource());
  }

  @Test
  public void testWithSourceNode_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withSourceNode(null);
    FunctionType type = builder.build();
    assertNull(type.getSource());
  }

  // -------------------- withParams (FunctionParamBuilder) --------------------

  @Test
  public void testWithParams_normalCase() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    paramBuilder.addRequiredParams(numberType);

    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withParams(paramBuilder);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    Node paramsNode = type.getParametersNode();
    assertNotNull(paramsNode);
    assertEquals(1, paramsNode.getChildCount());
  }

  @Test
  public void testWithParams_emptyParams() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    // no params added

    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withParams(paramBuilder);

    FunctionType type = builder.build();
    Node paramsNode = type.getParametersNode();
    assertNotNull(paramsNode);
    assertEquals(0, paramsNode.getChildCount());
  }

  @Test
  public void testWithParams_multipleParams() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    paramBuilder.addRequiredParams(numberType, stringType);

    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withParams(paramBuilder);

    FunctionType type = builder.build();
    Node paramsNode = type.getParametersNode();
    assertNotNull(paramsNode);
    assertEquals(2, paramsNode.getChildCount());
  }

  // -------------------- withParamsNode --------------------

  @Test
  public void testWithParamsNode_normalCase() {
    Node paramsNode = new Node(Token.PARAM_LIST);
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withParamsNode(paramsNode);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertSame(paramsNode, type.getParametersNode());
  }

  @Test
  public void testWithParamsNode_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withParamsNode(null);
    FunctionType type = builder.build();
    assertNull(type.getParametersNode());
  }

  // -------------------- withReturnType --------------------

  @Test
  public void testWithReturnType_normalCase() {
    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withReturnType(numberType);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertEquals(numberType, type.getReturnType());
    assertFalse(type.isReturnTypeInferred());
  }

  @Test
  public void testWithReturnType_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withReturnType(null);
    FunctionType type = builder.build();
    assertNotNull(type);
  }

  // -------------------- withInferredReturnType --------------------

  @Test
  public void testWithInferredReturnType_normalCase() {
    JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withInferredReturnType(stringType);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertEquals(stringType, type.getReturnType());
    assertTrue(type.isReturnTypeInferred());
  }

  @Test
  public void testWithReturnType_defaultNotInferred() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();
    assertFalse(type.isReturnTypeInferred());
  }

  // -------------------- withTypeOfThis --------------------

  @Test
  public void testWithTypeOfThis_normalCase() {
    ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withTypeOfThis(objType);
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertEquals(objType, type.getTypeOfThis());
  }

  @Test
  public void testWithTypeOfThis_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withTypeOfThis(null);
    FunctionType type = builder.build();
    assertNotNull(type);
  }

  // -------------------- withTemplateName --------------------

  @Test
  public void testWithTemplateName_normalCase() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.withTemplateName("T");
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertEquals("T", type.getTemplateTypeName());
  }

  @Test
  public void testWithTemplateName_nullInput() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withTemplateName(null);
    FunctionType type = builder.build();
    assertNull(type.getTemplateTypeName());
  }

  @Test
  public void testWithTemplateName_emptyString() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withTemplateName("");
    FunctionType type = builder.build();
    assertEquals("", type.getTemplateTypeName());
  }

  // -------------------- forConstructor --------------------

  @Test
  public void testForConstructor_setsTrue() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionBuilder returned = builder.forConstructor();
    assertSame(builder, returned);

    FunctionType type = builder.build();
    assertTrue(type.isConstructor());
  }

  @Test
  public void testForConstructor_defaultFalse() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();
    assertFalse(type.isConstructor());
  }

  // -------------------- copyFromOtherFunction --------------------

  @Test
  public void testCopyFromOtherFunction_copiesAllFields() {
    Node sourceNode = new Node(Token.FUNCTION);
    Node paramsNode = new Node(Token.PARAM_LIST);
    JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    ObjectType typeOfThis = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);

    FunctionType original = new FunctionBuilder(registry)
        .withName("originalFn")
        .withSourceNode(sourceNode)
        .withParamsNode(paramsNode)
        .withReturnType(returnType)
        .withTypeOfThis(typeOfThis)
        .withTemplateName("T")
        .forConstructor()
        .build();

    FunctionBuilder copyBuilder = new FunctionBuilder(registry);
    FunctionBuilder returned = copyBuilder.copyFromOtherFunction(original);
    assertSame(copyBuilder, returned);

    FunctionType copy = copyBuilder.build();

    assertEquals(original.getReferenceName(), copy.getReferenceName());
    assertSame(original.getSource(), copy.getSource());
    assertSame(original.getParametersNode(), copy.getParametersNode());
    assertEquals(original.getReturnType(), copy.getReturnType());
    assertEquals(original.getTypeOfThis(), copy.getTypeOfThis());
    assertEquals(original.getTemplateTypeName(), copy.getTemplateTypeName());
    assertEquals(original.isConstructor(), copy.isConstructor());
    assertEquals(original.isNativeObjectType(), copy.isNativeObjectType());
  }

  @Test
  public void testCopyFromOtherFunction_withDefaultsOnOriginal() {
    FunctionType original = new FunctionBuilder(registry).build();

    FunctionBuilder copyBuilder = new FunctionBuilder(registry);
    copyBuilder.copyFromOtherFunction(original);
    FunctionType copy = copyBuilder.build();

    assertNull(copy.getReferenceName());
    assertNull(copy.getSource());
    assertFalse(copy.isConstructor());
  }

  // -------------------- build --------------------

  @Test
  public void testBuild_returnsNonNullType() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();
    assertNotNull(type);
  }

  @Test
  public void testBuild_defaultValues() {
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType type = builder.build();

    assertNull(type.getReferenceName());
    assertNull(type.getSource());
    assertNull(type.getParametersNode());
    assertFalse(type.isConstructor());
    assertFalse(type.isReturnTypeInferred());
    assertNull(type.getTemplateTypeName());
  }

  @Test
  public void testBuild_chainedCallsProduceConsistentType() {
    Node sourceNode = new Node(Token.FUNCTION);
    JSType returnType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);

    FunctionType type = new FunctionBuilder(registry)
        .withName("chainedFn")
        .withSourceNode(sourceNode)
        .withReturnType(returnType)
        .forConstructor()
        .build();

    assertEquals("chainedFn", type.getReferenceName());
    assertSame(sourceNode, type.getSource());
    assertEquals(returnType, type.getReturnType());
    assertTrue(type.isConstructor());
  }
}