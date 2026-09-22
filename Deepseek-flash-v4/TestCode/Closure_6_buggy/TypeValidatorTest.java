package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import java.util.List;

public class TypeValidatorTest {
    private TypeValidator validator;
    private AbstractCompiler compiler;
    private JSTypeRegistry registry;
    private NodeTraversal t;
    private Node n;

    private static class TestCompiler extends AbstractCompiler {
        private JSTypeRegistry typeRegistry = new JSTypeRegistry();
        
        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }
        
        @Override
        public void report(JSError error) {}
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        registry = compiler.getTypeRegistry();
        validator = new TypeValidator(compiler);
        t = null;
        n = new Node(0);
    }

    @After
    public void tearDown() {
        validator = null;
        compiler = null;
        registry = null;
        t = null;
        n = null;
    }

    private JSType getNativeType(int typeId) {
        return registry.getNativeType(typeId);
    }

    @Test
    public void testGetMismatches_EmptyListInitially() {
        Iterable<TypeMismatch> mismatches = validator.getMismatches();
        assertNotNull(mismatches);
        assertFalse(mismatches.iterator().hasNext());
    }

    @Test
    public void testGetMismatches_WithMismatch() {
        TypeValidator spy = new TypeValidator(compiler) {
            @Override
            void expectType(NodeTraversal t, Node n, JSType type, JSType expectedType, String msg) {
                mismatch(t, n, msg, type, expectedType);
            }
        };
        JSType numberType = getNativeType(NUMBER_TYPE);
        JSType stringType = getNativeType(STRING_TYPE);
        spy.expectType(t, n, numberType, stringType, "test mismatch");
        Iterable<TypeMismatch> mismatches = spy.getMismatches();
        assertTrue(mismatches.iterator().hasNext());
    }

    @Test
    public void testSetShouldReport_False() {
        validator.setShouldReport(false);
        JSType numberType = getNativeType(NUMBER_TYPE);
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectType(t, n, numberType, stringType, "no report");
        Iterable<TypeMismatch> mismatches = validator.getMismatches();
        assertFalse(mismatches.iterator().hasNext());
    }

    @Test
    public void testSetShouldReport_True() {
        validator.setShouldReport(true);
        JSType numberType = getNativeType(NUMBER_TYPE);
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectType(t, n, numberType, stringType, "report");
        Iterable<TypeMismatch> mismatches = validator.getMismatches();
        assertTrue(mismatches.iterator().hasNext());
    }

    @Test
    public void testSetShouldReport_Boundary_ShouldReportTrue() {
        validator.setShouldReport(true);
        assertTrue(validator.getMismatches().iterator().hasNext() == false);
        JSType numberType = getNativeType(NUMBER_TYPE);
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectType(t, n, numberType, stringType, "test");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testSetShouldReport_Boundary_ShouldReportFalse() {
        validator.setShouldReport(false);
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectObject_TypesMatch() {
        JSType objType = getNativeType(OBJECT_TYPE);
        assertTrue(validator.expectObject(t, n, objType, "should match"));
    }

    @Test
    public void testExpectObject_NoObjectType() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        assertFalse(validator.expectObject(t, n, numberType, "not object"));
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectObject_Boundary_NullType() {
        JSType nullType = getNativeType(NULL_TYPE);
        assertFalse(validator.expectObject(t, n, nullType, "null type"));
    }

    @Test
    public void testExpectObject_Boundary_UnknownType() {
        JSType unknownType = getNativeType(UNKNOWN_TYPE);
        assertFalse(validator.expectObject(t, n, unknownType, "unknown type"));
    }

    @Test
    public void testExpectAnyObject_MatchingType() {
        JSType type = getNativeType(OBJECT_TYPE);
        validator.expectAnyObject(t, n, type, "match");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectAnyObject_NonObjectType() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectAnyObject(t, n, numberType, "not any object");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectAnyObject_Boundary_EmptyType() {
        JSType emptyType = getNativeType(NO_OBJECT_TYPE);
        validator.expectAnyObject(t, n, emptyType, "empty type");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectString_MatchesStringContext() {
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectString(t, n, stringType, "match string");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectString_NonStringType() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectString(t, n, numberType, "not string");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectString_Boundary_NullType() {
        JSType nullType = getNativeType(NULL_TYPE);
        validator.expectString(t, n, nullType, "null string");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNumber_MatchesNumberContext() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectNumber(t, n, numberType, "match number");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNumber_NonNumberType() {
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectNumber(t, n, stringType, "not number");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNumber_Boundary_VoidType() {
        JSType voidType = getNativeType(VOID_TYPE);
        validator.expectNumber(t, n, voidType, "void type");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectBitwiseable_MatchesNumberContext() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectBitwiseable(t, n, numberType, "bitwiseable");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectBitwiseable_NonBitwiseable() {
        JSType voidType = getNativeType(VOID_TYPE);
        validator.expectBitwiseable(t, n, voidType, "not bitwiseable");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectBitwiseable_Boundary_EmptyType() {
        JSType emptyType = getNativeType(NO_OBJECT_TYPE);
        validator.expectBitwiseable(t, n, emptyType, "empty bitwiseable");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumber_MatchingNumberContext() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectStringOrNumber(t, n, numberType, "number context");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumber_MatchingStringContext() {
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectStringOrNumber(t, n, stringType, "string context");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumber_NeitherContext() {
        JSType voidType = getNativeType(VOID_TYPE);
        validator.expectStringOrNumber(t, n, voidType, "neither");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumber_Boundary_NullType() {
        JSType nullType = getNativeType(NULL_TYPE);
        validator.expectStringOrNumber(t, n, nullType, "null");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNotNullOrUndefined_NotNullType() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        assertTrue(validator.expectNotNullOrUndefined(t, n, numberType, "not null", numberType));
    }

    @Test
    public void testExpectNotNullOrUndefined_NullType() {
        JSType nullType = getNativeType(NULL_TYPE);
        assertFalse(validator.expectNotNullOrUndefined(t, n, nullType, "null", nullType));
    }

    @Test
    public void testExpectNotNullOrUndefined_Boundary_NoType() {
        JSType noType = getNativeType(NO_OBJECT_TYPE);
        assertTrue(validator.expectNotNullOrUndefined(t, n, noType, "no type", noType));
    }

    @Test
    public void testExpectNotNullOrUndefined_Boundary_UnknownType() {
        JSType unknownType = getNativeType(UNKNOWN_TYPE);
        assertTrue(validator.expectNotNullOrUndefined(t, n, unknownType, "unknown", unknownType));
    }

    @Test
    public void testExpectNotNullOrUndefined_WithMismatch() {
        JSType nullType = getNativeType(NULL_TYPE);
        JSType numberType = getNativeType(NUMBER_TYPE);
        assertFalse(validator.expectNotNullOrUndefined(t, n, nullType, "mismatch", numberType));
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectCanAssignTo_ValidAssignment() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        validator.expectCanAssignTo(t, n, numberType, numberType, "valid");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectCanAssignTo_InvalidAssignment() {
        JSType numberType = getNativeType(NUMBER_TYPE);
        JSType stringType = getNativeType(STRING_TYPE);
        validator.expectCanAssignTo(t, n, stringType, numberType, "invalid");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectCanAssignTo_ConstructorTypes() {
        JSType objType = getNativeType(OBJECT_TYPE);
        validator.expectCanAssignTo(t, n, objType, objType, "constructor");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectCanAssignTo_Boundary_UnknownTypes() {
        JSType unknownType = getNativeType(UNKNOWN_TYPE);
        validator.expectCanAssignTo(t, n, unknownType, unknownType, "unknown assign");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }
}