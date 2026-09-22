package com.google.javascript.jscomp.type;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.rhino.jstype.FlowScope;
import com.google.javascript.rhino.jstype.JSTypeNative;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClosureReverseAbstractInterpreterTest {

    private CodingConvention convention;
    private JSTypeRegistry typeRegistry;
    private ClosureReverseAbstractInterpreter interpreter;
    private FlowScope blindScope;
    private Node condition;
    private Node param;
    private Node callee;
    private Node left;
    private Node right;

    @Before
    public void setUp() {
        convention = mock(CodingConvention.class);
        typeRegistry = mock(JSTypeRegistry.class);
        interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        blindScope = mock(FlowScope.class);
        condition = mock(Node.class);
        param = mock(Node.class);
        callee = mock(Node.class);
        left = mock(Node.class);
        right = mock(Node.class);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_notCall() {
        when(condition.isCall()).thenReturn(false);
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
        verify(condition).isCall();
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_callChildCountNotTwo() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(3);
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
        verify(condition).getChildCount();
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_notGetProp() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(false);
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_paramNotQualifiedName() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(true);
        when(param.isQualifiedName()).thenReturn(false);
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_nonGoogCall() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(true);
        when(param.isQualifiedName()).thenReturn(true);
        when(callee.getFirstChild()).thenReturn(left);
        when(callee.getLastChild()).thenReturn(right);
        when(left.isName()).thenReturn(true);
        when(left.getString()).thenReturn("notGoog");
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
        verify(left).getString();
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsDef() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(true);
        when(param.isQualifiedName()).thenReturn(true);
        when(callee.getFirstChild()).thenReturn(left);
        when(callee.getLastChild()).thenReturn(right);
        when(left.isName()).thenReturn(true);
        when(left.getString()).thenReturn("goog");
        when(right.isString()).thenReturn(true);
        when(right.getString()).thenReturn("isDef");
        JSType paramType = mock(JSType.class);
        when(getTypeIfRefinable(param, blindScope)).thenReturn(paramType);
        when(typeRegistry.createUnionType(any(JSType.class), any(JSType.class))).thenReturn(mock(JSType.class));
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_googIsNull_outcomeTrue() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(true);
        when(param.isQualifiedName()).thenReturn(true);
        when(callee.getFirstChild()).thenReturn(left);
        when(callee.getLastChild()).thenReturn(right);
        when(left.isName()).thenReturn(true);
        when(left.getString()).thenReturn("goog");
        when(right.isString()).thenReturn(true);
        when(right.getString()).thenReturn("isNull");
        JSType paramType = mock(JSType.class);
        when(getTypeIfRefinable(param, blindScope)).thenReturn(paramType);
        when(paramType.isSubtype(any(JSType.class))).thenReturn(true);
        Node result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_unknownRestricter() {
        when(condition.isCall()).thenReturn(true);
        when(condition.getChildCount()).thenReturn(2);
        when(condition.getFirstChild()).thenReturn(callee);
        when(condition.getLastChild()).thenReturn(param);
        when(callee.isGetProp()).thenReturn(true);
        when(param.isQualifiedName()).thenReturn(true);
        when(callee.getFirstChild()).thenReturn(left);
        when(callee.getLastChild()).thenReturn(right);
        when(left.isName()).thenReturn(true);
        when(left.getString()).thenReturn("goog");
        when(right.isString()).thenReturn(true);
        when(right.getString()).thenReturn("unknown");
        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(
                condition, blindScope, true);
        assertNotNull(result);
    }

    @Test
    public void testRestrictParameter_nullType_createsChildScope() {
        Node parameter = mock(Node.class);
        JSType type = mock(JSType.class);
        FlowScope informed = mock(FlowScope.class);
        when(blindScope.createChildFlowScope()).thenReturn(informed);
        Function<TypeRestriction, JSType> restriction = mock(Function.class);
        when(restriction.apply(any(TypeRestriction.class))).thenReturn(type);
        FlowScope result = interpreter.restrictParameter(parameter, type, blindScope, restriction, true);
        assertEquals(informed, result);
        verify(blindScope).createChildFlowScope();
    }

    @Test
    public void testRestrictParameter_nullType_noChildScope() {
        Node parameter = mock(Node.class);
        JSType type = mock(JSType.class);
        Function<TypeRestriction, JSType> restriction = mock(Function.class);
        when(restriction.apply(any(TypeRestriction.class))).thenReturn(null);
        FlowScope result = interpreter.restrictParameter(parameter, type, blindScope, restriction, true);
        assertSame(blindScope, result);
        verify(blindScope, never()).createChildFlowScope();
    }

    @Test
    public void testRestrictParameter_outcomeTrue_uNULL() {
        Node parameter = mock(Node.class);
        JSType type = mock(JSType.class);
        when(type.getGreatestSubtype(any(JSType.class))).thenReturn(type);
        when(type.isSubtype(any(JSType.class))).thenReturn(true);
        when(type.isNullable()).thenReturn(true);
        when(type.isObject()).thenReturn(true);
        when(type.isFunctionType()).thenReturn(false);
        FlowScope result = interpreter.restrictParameter(parameter, type, blindScope,
                new Function<TypeRestriction, JSType>() {
                    @Override
                    public JSType apply(TypeRestriction p) {
                        return p.type;
                    }
                }, true);
        assertNotNull(result);
    }

    @Test
    public void testRestrictParameter_outcomeFalse_uNOT() {
        Node parameter = mock(Node.class);
        JSType type = mock(JSType.class);
        when(type.getGreatestSubtype(any(JSType.class))).thenReturn(type);
        when(type.isSubtype(any(JSType.class))).thenReturn(false);
        when(type.isNullable()).thenReturn(false);
        when(type.isObject()).thenReturn(false);
        when(type.isFunctionType()).thenReturn(false);
        FlowScope result = interpreter.restrictParameter(parameter, type, blindScope,
                new Function<TypeRestriction, JSType>() {
                    @Override
                    public JSType apply(TypeRestriction p) {
                        return p.type;
                    }
                }, false);
        assertNotNull(result);
    }

    @Test
    public void testApply_isDef_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isDef_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isNull_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isNull_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isDefAndNotNull_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isDefAndNotNull_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isString_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isBoolean_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isNumber_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isFunction_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isArray_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        when(p.type).thenReturn(mock(JSType.class));
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isArray_outcomeFalse_nullType() {
        TypeRestriction p = new TypeRestriction(null, false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isObject_outcomeTrue() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), true);
        when(p.outcome).thenReturn(true);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testApply_isObject_outcomeFalse() {
        TypeRestriction p = new TypeRestriction(mock(JSType.class), false);
        when(p.outcome).thenReturn(false);
        Function<TypeRestriction, JSType> fn = new Function<TypeRestriction, JSType>() {
            @Override
            public JSType apply(TypeRestriction p) {
                return p.type;
            }
        };
        JSType result = fn.apply(p);
        assertNotNull(result);
    }

    @Test
    public void testVisitRestrictToArrayVisitor() {
        ObjectType type = mock(ObjectType.class);
        JSType arrayType = mock(JSType.class);
        when(typeRegistry.getNativeType(JSTypeNative.ARRAY_TYPE)).thenReturn(arrayType);
        when(arrayType.isSubtype(any(JSType.class))).thenReturn(true);
        when(arrayType.getGreatestSubtype(any(JSType.class))).thenReturn(arrayType);
        ClosureReverseAbstractInterpreter interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        Visitor<JSType> visitor = new ClosureReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor() {
            @Override
            protected JSType caseTopType(JSType topType) {
                return topType;
            }
        };
        JSType result = visitor.caseObjectType(type);
        assertNotNull(result);
    }

    @Test
    public void testVisitRestrictToNotArrayVisitor() {
        ObjectType type = mock(ObjectType.class);
        when(type.isSubtype(any(JSType.class))).thenReturn(false);
        when(type.getGreatestSubtype(any(JSType.class))).thenReturn(type);
        ClosureReverseAbstractInterpreter interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        Visitor<JSType> visitor = new ClosureReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor() {
            @Override
            public JSType caseObjectType(ObjectType type) {
                return type;
            }
        };
        JSType result = visitor.caseObjectType(type);
        assertNotNull(result);
    }

    @Test
    public void testVisitRestrictToObjectVisitor() {
        ObjectType type = mock(ObjectType.class);
        when(type.getGreatestSubtype(any(JSType.class))).thenReturn(type);
        ClosureReverseAbstractInterpreter interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        Visitor<JSType> visitor = new ClosureReverseAbstractInterpreter.RestrictByTrueTypeOfResultVisitor() {
            @Override
            protected JSType caseTopType(JSType topType) {
                return topType;
            }
        };
        JSType result = visitor.caseObjectType(type);
        assertNotNull(result);
    }

    @Test
    public void testVisitRestrictToNotObjectVisitor() {
        ObjectType type = mock(ObjectType.class);
        when(type.getGreatestSubtype(any(JSType.class))).thenReturn(type);
        ClosureReverseAbstractInterpreter interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
        Visitor<JSType> visitor = new ClosureReverseAbstractInterpreter.RestrictByFalseTypeOfResultVisitor() {
            @Override
            public JSType caseObjectType(ObjectType type) {
                return type;
            }
        };
        JSType result = visitor.caseObjectType(type);
        assertNotNull(result);
    }

    @Test
    public void testTypeRestrictionConstructor() {
        JSType type = mock(JSType.class);
        boolean outcome = true;
        ClosureReverseAbstractInterpreter.TypeRestriction tr = new ClosureReverseAbstractInterpreter.TypeRestriction(type, outcome);
        assertSame(type, tr.type);
        assertTrue(tr.outcome);
    }
}