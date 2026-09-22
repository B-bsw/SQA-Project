package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

public class FunctionBuilderTest {

  private JSTypeRegistry registry;
  private FunctionBuilder builder;

  @Before
  public void setUp() {
    registry = JSTypeRegistry.getDefaultRegistry();
    builder = new FunctionBuilder(registry);
  }

  @Test
  public void testBuilderDefaultValues() {
    FunctionType type = builder.build();
    assertNull(type.getReferenceName());
    assertNull(type.getSource());
    assertNull(type.getParametersNode());
    assertNull(type.getReturnType());
    assertNull(type.getTypeOfThis());
    assertNull(type.getTemplateTypeName());
    assertTrue(!type.isConstructor());
    assertTrue(!type.isNativeObjectType());
    assertTrue(!type.isReturnTypeInferred());
  }

  @Test
  public void testBuilderWithAllSetters() {
    Node sourceNode = new Node(1, 0, 0);
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    Node paramsNode = paramBuilder.build();
    JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

    FunctionBuilder result = builder
        .withName("testFunction")
        .withSourceNode(sourceNode)
        .withParams(paramBuilder)
        .withReturnType(returnType)
        .withTypeOfThis(null)
        .withTemplateName("T")
        .forConstructor();

    assertSame(builder, result);
    FunctionType type = builder.build();
    assertEquals("testFunction", type.getReferenceName());
    assertSame(sourceNode, type.getSource());
    assertSame(paramsNode, type.getParametersNode());
    assertSame(returnType, type.getReturnType());
    assertNull(type.getTypeOfThis());
    assertEquals("T", type.getTemplateTypeName());
    assertTrue(type.isConstructor());
  }

  @Test
  public void testBuilderWithInferredReturnType() {
    JSType returnType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    builder.withInferredReturnType(returnType);
    FunctionType type = builder.build();
    assertSame(returnType, type.getReturnType());
    assertTrue(type.isReturnTypeInferred());
  }

  @Test
  public void testBuilderWithParamsNode() {
    Node paramsNode = new Node(2, 0, 0);
    builder.withParamsNode(paramsNode);
    FunctionType type = builder.build();
    assertSame(paramsNode, type.getParametersNode());
  }

  @Test
  public void testBuilderForNativeType() {
    builder.forNativeType();
    FunctionType type = builder.build();
    assertTrue(type.isNativeObjectType());
  }

  @Test
  public void testCopyWithFromOtherFunction() {
    Node sourceNode = new Node(3, 0, 0);
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    builder
        .withName("original")
        .withSourceNode(sourceNode)
        .withParams(paramBuilder)
        .withReturnType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE))
        .withTemplateName("T")
        .forConstructor();

    FunctionType originalType = builder.build();
    FunctionBuilder copyBuilder = new FunctionBuilder(registry);
    copyBuilder.copyFromOtherFunction(originalType);

    FunctionType copiedType = copyBuilder.build();
    assertEquals("original", copiedType.getReferenceName());
    assertSame(sourceNode, copiedType.getSource());
    assertNotNull(copiedType.getParametersNode());
    assertEquals(
        registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), copiedType.getReturnType());
    assertNull(copiedType.getTypeOfThis());
    assertEquals("T", copiedType.getTemplateTypeName());
    assertTrue(copiedType.isConstructor());
    assertTrue(!copiedType.isNativeObjectType());
  }

  @Test
  public void testBuilderWithNameNull() {
    builder.withName(null).build();
    FunctionType type = builder.build();
    assertNull(type.getReferenceName());
  }

  @Test
  public void testBuilderWithReturnTypeNull() {
    builder.withReturnType(null).build();
    FunctionType type = builder.build();
    assertNull(type.getReturnType());
  }

  @Test
  public void testBuilderWithSourceNodeNull() {
    builder.withSourceNode(null).build();
    FunctionType type = builder.build();
    assertNull(type.getSource());
  }

  @Test
  public void testBuilderWithTypeOfThisNull() {
    builder.withTypeOfThis(null).build();
    FunctionType type = builder.build();
    assertNull(type.getTypeOfThis());
  }

  @Test
  public void testBuilderWithParamsNull() {
    try {
      builder.withParams(null);
      fail("Expected NullPointerException not thrown");
    } catch (NullPointerException e) {
      // expected
    }
  }

  @Test
  public void testBuilderWithTemplateNameNull() {
    builder.withTemplateName(null).build();
    FunctionType type = builder.build();
    assertNull(type.getTemplateTypeName());
  }

  @Test
  public void testBuilderWithAllPropertiesAndBuild() {
    builder
        .withName("func")
        .withReturnType(registry.getNativeType(JSTypeNative.VOID_TYPE))
        .forConstructor()
        .build();
    FunctionType type = builder.build();
    assertEquals("func", type.getReferenceName());
    assertTrue(type.isConstructor());
  }

  @Test
  public void testCopyFromOtherFunctionWithNulls() {
    FunctionBuilder sourceBuilder = new FunctionBuilder(registry);
    FunctionType emptyType = sourceBuilder.build();
    FunctionBuilder targetBuilder = new FunctionBuilder(registry);
    targetBuilder
        .withName("toBeOverridden")
        .withReturnType(registry.getNativeType(JSTypeNative.NUMBER_TYPE))
        .build();
    targetBuilder.copyFromOtherFunction(emptyType);
    FunctionType result = targetBuilder.build();
    assertNull(result.getReferenceName());
    assertNull(result.getParametersNode());
    assertNull(result.getReturnType());
    assertNull(result.getTypeOfThis());
    assertNull(result.getTemplateTypeName());
    assertTrue(!result.isConstructor());
    assertTrue(!result.isNativeObjectType());
  }

  @Test
  public void testBuildWithFunctionParamBuilder() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    FunctionType type = builder
        .withParams(paramBuilder)
        .build();
    assertNotNull(type.getParametersNode());
    assertEquals(0, type.getParametersNode().getChildCount());
  }

  @Test
  public void testBuildWithMultipleChildrenParams() {
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);
    paramBuilder.addRequiredParams(
        registry.getNativeType(JSTypeNative.NUMBER_TYPE),
        registry.getNativeType(JSTypeNative.STRING_TYPE));
    builder.withParams(paramBuilder);
    FunctionType type = builder.build();
    assertEquals(2, type.getParametersNode().getChildCount());
  }
}