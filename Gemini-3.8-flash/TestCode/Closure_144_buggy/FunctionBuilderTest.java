package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunctionBuilderTest {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    this.registry = new JSTypeRegistry(new SimpleErrorReporter());
  }

  @Test
  public void build_givenDefaultValues_shouldConstructFunctionWithDefaults() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionType functionType = builder.build();

    // Assert
    Assert.assertNotNull(functionType);
    Assert.assertNull(functionType.getReferenceName());
    Assert.assertNull(functionType.getSource());
    Assert.assertNull(functionType.getParametersNode());
    Assert.assertNull(functionType.getReturnType());
    Assert.assertNull(functionType.getTypeOfThis());
    Assert.assertNull(functionType.getTemplateTypeName());
    Assert.assertFalse(functionType.isConstructor());
    Assert.assertFalse(functionType.isNativeObjectType());
  }

  @Test
  public void withName_givenValidName_shouldSetFunctionName() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    String expectedName = "myCustomFunction";

    // Act
    FunctionBuilder resultBuilder = builder.withName(expectedName);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertEquals(expectedName, functionType.getReferenceName());
  }

  @Test
  public void withName_givenNullName_shouldSetNullName() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withName("initialName");

    // Act
    FunctionBuilder resultBuilder = builder.withName(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getReferenceName());
  }

  @Test
  public void withName_givenEmptyName_shouldSetEmptyName() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.withName("");
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertEquals("", functionType.getReferenceName());
  }

  @Test
  public void withSourceNode_givenValidNode_shouldSetSourceNode() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    Node sourceNode = new Node(0);

    // Act
    FunctionBuilder resultBuilder = builder.withSourceNode(sourceNode);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertSame(sourceNode, functionType.getSource());
  }

  @Test
  public void withSourceNode_givenNullNode_shouldSetNullSourceNode() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withSourceNode(new Node(0));

    // Act
    FunctionBuilder resultBuilder = builder.withSourceNode(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getSource());
  }

  @Test
  public void withParamsNode_givenValidNode_shouldSetParametersNode() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    Node paramNode = new Node(0);

    // Act
    FunctionBuilder resultBuilder = builder.withParamsNode(paramNode);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertSame(paramNode, functionType.getParametersNode());
  }

  @Test
  public void withParamsNode_givenNullNode_shouldSetNullParametersNode() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withParamsNode(new Node(0));

    // Act
    FunctionBuilder resultBuilder = builder.withParamsNode(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getParametersNode());
  }

  @Test
  public void withParams_givenParamBuilder_shouldSetParametersNodeFromBuilder() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionParamBuilder paramBuilder = new FunctionParamBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.withParams(paramBuilder);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNotNull(functionType.getParametersNode());
  }

  @Test(expected = NullPointerException.class)
  public void withParams_givenNullParamBuilder_shouldThrowNullPointerException() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    builder.withParams(null);
  }

  @Test
  public void withReturnType_givenValidType_shouldSetReturnType() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    JSType expectedReturnType = new FunctionBuilder(registry).build();

    // Act
    FunctionBuilder resultBuilder = builder.withReturnType(expectedReturnType);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertSame(expectedReturnType, functionType.getReturnType());
    Assert.assertFalse(functionType.isReturnTypeInferred());
  }

  @Test
  public void withReturnType_givenNullType_shouldSetNullReturnType() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withReturnType(new FunctionBuilder(registry).build());

    // Act
    FunctionBuilder resultBuilder = builder.withReturnType(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getReturnType());
  }

  @Test
  public void withInferredReturnType_givenValidType_shouldSetReturnTypeAndInferredTrue() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    JSType expectedReturnType = new FunctionBuilder(registry).build();

    // Act
    FunctionBuilder resultBuilder = builder.withInferredReturnType(expectedReturnType);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertSame(expectedReturnType, functionType.getReturnType());
    Assert.assertTrue(functionType.isReturnTypeInferred());
  }

  @Test
  public void withInferredReturnType_givenNullType_shouldSetNullReturnTypeAndInferredTrue() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.withInferredReturnType(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getReturnType());
    Assert.assertTrue(functionType.isReturnTypeInferred());
  }

  @Test
  public void withTypeOfThis_givenValidObjectType_shouldSetTypeOfThis() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    ObjectType expectedThisType = new FunctionBuilder(registry).build();

    // Act
    FunctionBuilder resultBuilder = builder.withTypeOfThis(expectedThisType);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertSame(expectedThisType, functionType.getTypeOfThis());
  }

  @Test
  public void withTypeOfThis_givenNullObjectType_shouldSetNullTypeOfThis() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withTypeOfThis(new FunctionBuilder(registry).build());

    // Act
    FunctionBuilder resultBuilder = builder.withTypeOfThis(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getTypeOfThis());
  }

  @Test
  public void withTemplateName_givenValidName_shouldSetTemplateName() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    String expectedTemplate = "T";

    // Act
    FunctionBuilder resultBuilder = builder.withTemplateName(expectedTemplate);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertEquals(expectedTemplate, functionType.getTemplateTypeName());
  }

  @Test
  public void withTemplateName_givenNullName_shouldSetNullTemplateName() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);
    builder.withTemplateName("T");

    // Act
    FunctionBuilder resultBuilder = builder.withTemplateName(null);
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertNull(functionType.getTemplateTypeName());
  }

  @Test
  public void forConstructor_whenCalled_shouldSetIsConstructorToTrue() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.forConstructor();
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertTrue(functionType.isConstructor());
  }

  @Test
  public void forNativeType_whenCalled_shouldSetIsNativeObjectTypeToTrue() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.forNativeType();
    FunctionType functionType = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertTrue(functionType.isNativeObjectType());
  }

  @Test
  public void copyFromOtherFunction_givenValidFunctionType_shouldCopyAllAttributes() {
    // Arrange
    Node sourceNode = new Node(0);
    Node paramsNode = new Node(0);
    JSType returnType = new FunctionBuilder(registry).build();
    ObjectType typeOfThis = new FunctionBuilder(registry).build();

    FunctionType sourceFunction = new FunctionBuilder(registry)
        .withName("originalName")
        .withSourceNode(sourceNode)
        .withParamsNode(paramsNode)
        .withReturnType(returnType)
        .withTypeOfThis(typeOfThis)
        .withTemplateName("T")
        .forConstructor()
        .forNativeType()
        .build();

    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    FunctionBuilder resultBuilder = builder.copyFromOtherFunction(sourceFunction);
    FunctionType copiedFunction = resultBuilder.build();

    // Assert
    Assert.assertSame(builder, resultBuilder);
    Assert.assertEquals("originalName", copiedFunction.getReferenceName());
    Assert.assertSame(sourceNode, copiedFunction.getSource());
    Assert.assertSame(paramsNode, copiedFunction.getParametersNode());
    Assert.assertSame(returnType, copiedFunction.getReturnType());
    Assert.assertSame(typeOfThis, copiedFunction.getTypeOfThis());
    Assert.assertEquals("T", copiedFunction.getTemplateTypeName());
    Assert.assertTrue(copiedFunction.isConstructor());
    Assert.assertTrue(copiedFunction.isNativeObjectType());
  }

  @Test(expected = NullPointerException.class)
  public void copyFromOtherFunction_givenNullOtherType_shouldThrowNullPointerException() {
    // Arrange
    FunctionBuilder builder = new FunctionBuilder(registry);

    // Act
    builder.copyFromOtherFunction(null);
  }

  @Test
  public void chaining_whenAllMethodsCalled_shouldMaintainFluentInterfaceAndProperState() {
    // Arrange
    Node sourceNode = new Node(0);
    Node paramsNode = new Node(0);
    JSType returnType = new FunctionBuilder(registry).build();
    ObjectType thisType = new FunctionBuilder(registry).build();

    // Act
    FunctionType fn = new FunctionBuilder(registry)
        .withName("chainedFunction")
        .withSourceNode(sourceNode)
        .withParamsNode(paramsNode)
        .withReturnType(returnType)
        .withTypeOfThis(thisType)
        .withTemplateName("K")
        .forConstructor()
        .forNativeType()
        .build();

    // Assert
    Assert.assertEquals("chainedFunction", fn.getReferenceName());
    Assert.assertSame(sourceNode, fn.getSource());
    Assert.assertSame(paramsNode, fn.getParametersNode());
    Assert.assertSame(returnType, fn.getReturnType());
    Assert.assertSame(thisType, fn.getTypeOfThis());
    Assert.assertEquals("K", fn.getTemplateTypeName());
    Assert.assertTrue(fn.isConstructor());
    Assert.assertTrue(fn.isNativeObjectType());
  }
}