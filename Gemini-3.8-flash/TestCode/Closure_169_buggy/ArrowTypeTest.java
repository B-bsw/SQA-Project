package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ArrowType;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ArrowTypeTest {

  @Mock
  private JSTypeRegistry mockRegistry;
  @Mock
  private JSType mockReturnType;
  @Mock
  private JSType mockOtherType;
  @Mock
  private JSType mockParamType1;
  @Mock
  private JSType mockParamType2;
  @Mock
  private Node mockParameters;
  @Mock
  private Node mockThisParam;
  @Mock
  private Node mockThatParam;
  @Mock
  private Node mockNextParam;
  @Mock
  private ErrorReporter mockErrorReporter;

  private ArrowType arrowType;
  private ArrowType otherArrowType;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);
    arrowType = new ArrowType(mockRegistry, mockParameters, mockReturnType);
    otherArrowType = new ArrowType(mockRegistry, mockParameters, mockOtherType);
  }

  @Test
  public void testHashCodeWithAllFieldsSet() {
    when(mockReturnType.hashCode()).thenReturn(10);
    when(mockParamType1.hashCode()).thenReturn(20);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockThisParam.getNext()).thenReturn(null);
    int expected = 10 + 20;
    if (arrowType.returnTypeInferred) {
      expected += 1;
    }
    assertEquals(expected, arrowType.hashCode());
  }

  @Test
  public void testHashCodeWithNullReturnTypeAndParamType() {
    when(mockParameters.getFirstChild()).thenReturn(null);
    ArrowType arrowTypeNoReturn = new ArrowType(mockRegistry, mockParameters, null);
    assertEquals(0, arrowTypeNoReturn.hashCode());
  }

  @Test
  public void testGetLeastSupertypeReturnsNull() {
    try {
      arrowType.getLeastSupertype(mockOtherType);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
    }
  }

  @Test
  public void testGetGreatestSubtypeReturnsNull() {
    try {
      arrowType.getGreatestSubtype(mockOtherType);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
    }
  }

  @Test
  public void testTestForEqualityThrowsUnsupportedOperation() {
    try {
      arrowType.testForEquality(mockOtherType);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
    }
  }

  @Test
  public void testVisitThrowsUnsupportedOperation() {
    try {
      arrowType.visit(null);
      fail("Expected UnsupportedOperationException");
    } catch (UnsupportedOperationException e) {
    }
  }

  @Test
  public void testGetPossibleToBooleanOutcomes() {
    assertEquals(BooleanLiteralSet.TRUE, arrowType.getPossibleToBooleanOutcomes());
  }

  @Test
  public void testResolveInternalResolvesReturnTypeAndParameters() {
    when(mockReturnType.resolve(mockErrorReporter, null)).thenReturn(mockReturnType);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockThisParam.getNext()).thenReturn(null);
    when(mockParamType1.resolve(mockErrorReporter, null)).thenReturn(mockParamType1);
    when(mockParameters.getNext()).thenReturn(null);

    JSType result = arrowType.resolveInternal(mockErrorReporter, null);
    assertEquals(arrowType, result);
    verify(mockThisParam).setJSType(mockParamType1);
  }

  @Test
  public void testResolveInternalWithNullReturnType() {
    ArrowType arrowTypeNoReturn = new ArrowType(mockRegistry, mockParameters, null);
    JSType result = arrowTypeNoReturn.resolveInternal(mockErrorReporter, null);
    assertEquals(arrowTypeNoReturn, result);
  }

  @Test
  public void testHasUnknownParamsOrReturnWithUnknownParam() {
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockThisParam.getJSType()).thenReturn(null);
    when(mockThisParam.getNext()).thenReturn(null);
    when(mockReturnType.isUnknownType()).thenReturn(false);
    assertTrue(arrowType.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturnWithUnknownReturn() {
    when(mockParameters.getFirstChild()).thenReturn(null);
    when(mockReturnType.isUnknownType()).thenReturn(true);
    assertTrue(arrowType.hasUnknownParamsOrReturn());
  }

  @Test
  public void testHasUnknownParamsOrReturnNoneUnknown() {
    when(mockParameters.getFirstChild()).thenReturn(null);
    when(mockReturnType.isUnknownType()).thenReturn(false);
    assertFalse(arrowType.hasUnknownParamsOrReturn());
  }

  @Test
  public void testToStringHelper() {
    assertEquals("[ArrowType]", arrowType.toStringHelper(false));
  }

  @Test
  public void testHasAnyTemplateInternalWithTemplatedReturn() {
    when(mockReturnType.hasAnyTemplate()).thenReturn(true);
    assertTrue(arrowType.hasAnyTemplateInternal());
  }

  @Test
  public void testHasAnyTemplateInternalWithTemplatedParameter() {
    when(mockReturnType.hasAnyTemplate()).thenReturn(false);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockParamType1.hasAnyTemplate()).thenReturn(true);
    when(mockThisParam.getNext()).thenReturn(null);
    assertTrue(arrowType.hasAnyTemplateInternal());
  }

  @Test
  public void testHasAnyTemplateInternalWithNoTemplate() {
    when(mockReturnType.hasAnyTemplate()).thenReturn(false);
    when(mockParameters.getFirstChild()).thenReturn(null);
    assertFalse(arrowType.hasAnyTemplateInternal());
  }

  @Test
  public void testIsSubtypeWithNonArrowType() {
    JSType mockNonArrow = mock(JSType.class);
    assertFalse(arrowType.isSubtype(mockNonArrow));
  }

  @Test
  public void testIsSubtypeWithEqualParameters() {
    when(mockReturnType.isSubtype(mockOtherType)).thenReturn(true);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockOtherArrowType.parameters.getFirstChild()).thenReturn(mockThatParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockThatParam.getJSType()).thenReturn(mockParamType2);
    when(mockParamType2.isSubtype(mockParamType1)).thenReturn(true);
    when(mockThisParam.isVarArgs()).thenReturn(false);
    when(mockThatParam.isVarArgs()).thenReturn(false);
    when(mockThisParam.isOptionalArg()).thenReturn(false);
    when(mockThatParam.isOptionalArg()).thenReturn(false);
    when(mockThisParam.getNext()).thenReturn(null);
    when(mockThatParam.getNext()).thenReturn(null);

    boolean result = arrowType.isSubtype(otherArrowType);
    assertFalse(result);
  }

  @Test
  public void testIsSubtypeWithMissingRequiredArg() {
    when(mockReturnType.isSubtype(mockOtherType)).thenReturn(true);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockOtherArrowType.parameters.getFirstChild()).thenReturn(mockThatParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockThatParam.getJSType()).thenReturn(mockParamType2);
    when(mockParamType2.isSubtype(mockParamType1)).thenReturn(true);
    when(mockThisParam.isVarArgs()).thenReturn(false);
    when(mockThatParam.isVarArgs()).thenReturn(false);
    when(mockThisParam.isOptionalArg()).thenReturn(false);
    when(mockThatParam.isOptionalArg()).thenReturn(true);
    when(mockThisParam.getNext()).thenReturn(null);
    when(mockThatParam.getNext()).thenReturn(null);

    boolean result = arrowType.isSubtype(otherArrowType);
    assertFalse(result);
  }

  @Test
  public void testIsSubtypeWithVarArgs() {
    when(mockReturnType.isSubtype(mockOtherType)).thenReturn(true);
    when(mockParameters.getFirstChild()).thenReturn(mockThisParam);
    when(mockOtherArrowType.parameters.getFirstChild()).thenReturn(mockThatParam);
    when(mockThisParam.getJSType()).thenReturn(mockParamType1);
    when(mockThatParam.getJSType()).thenReturn(mockParamType2);
    when(mockParamType2.isSubtype(mockParamType1)).thenReturn(true);
    when(mockThisParam.isVarArgs()).thenReturn(true);
    when(mockThatParam.isVarArgs()).thenReturn(true);
    when(mockThisParam.getNext()).thenReturn(null);
    when(mockThatParam.getNext()).thenReturn(null);

    boolean result = arrowType.isSubtype(otherArrowType);
    assertFalse(result);
  }
}