package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;

public class TypeValidatorTest {

    private AbstractCompiler compiler;
    private TypeValidator validator;
    private NodeTraversal t;

    @Before
    public void setUp() {
        // Use a real Compiler as AbstractCompiler implementation testable
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        validator = new TypeValidator(compiler);
        t = new NodeTraversal(compiler, new Node(0, 0, 0));
    }

    @Test
    public void testGetMismatchesEmptyInitially() {
        assertTrue(validator.getMismatches().iterator() instanceof java.util.Iterator);
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testSetShouldReportToFalse() {
        validator.setShouldReport(false);
        // No direct getter, but should suppress reporting
        Node n = new Node(0, 0, 0);
        validator.expectString(t, n, getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE), "test");
        assertFalse(validator.getMismatches().iterator().hasNext());
        validator.setShouldReport(true);
    }

    @Test
    public void testExpectValidTypeofNameUnknownType() {
        Node n = new Node(0, 0, 0);
        validator.expectValidTypeofName(t, n, "unknownString");
        // Verify mismatch added
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectObjectWithObjectType() {
        JSType objType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
        Node n = new Node(0, 0, 0);
        assertTrue(validator.expectObject(t, n, objType, "msg"));
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectObjectWithNonObjectType() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        assertFalse(validator.expectObject(t, n, numType, "msg"));
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectActualObjectWithObject() {
        JSType objType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectActualObject(t, n, objType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectActualObjectWithNonObject() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectActualObject(t, n, numType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectAnyObjectWithAnyObjectType() {
        JSType anyObjType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectAnyObject(t, n, anyObjType, "msg");
        // Subtype of NO_OBJECT_TYPE, no mismatch
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectAnyObjectWithEmptyType() {
        JSType emptyType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectAnyObject(t, n, emptyType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectAnyObjectWithMismatch() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectAnyObject(t, n, numType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringWithStringContext() {
        JSType strType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectString(t, n, strType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringWithMismatch() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectString(t, n, numType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNumberWithNumberContext() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectNumber(t, n, numType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNumberWithMismatch() {
        JSType strType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectNumber(t, n, strType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectBitwiseableWithNumber() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectBitwiseable(t, n, numType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectBitwiseableWithMismatch() {
        JSType objType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectBitwiseable(t, n, objType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumberWithNumber() {
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectStringOrNumber(t, n, numType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumberWithString() {
        JSType strType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectStringOrNumber(t, n, strType, "msg");
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectStringOrNumberWithMismatch() {
        JSType objType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
        Node n = new Node(0, 0, 0);
        validator.expectStringOrNumber(t, n, objType, "msg");
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNotNullOrUndefinedWithDefinedType() {
        JSType strType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        Node n = new Node(0, 0, 0);
        assertTrue(validator.expectNotNullOrUndefined(t, n, strType, "msg", strType));
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNotNullOrUndefinedWithNullType() {
        JSType nullType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE);
        Node n = new Node(0, 0, 0);
        assertFalse(validator.expectNotNullOrUndefined(t, n, nullType, "msg", getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)));
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectNotNullOrUndefinedWithVoidType() {
        JSType voidType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE);
        Node n = new Node(0, 0, 0);
        assertFalse(validator.expectNotNullOrUndefined(t, n, voidType, "msg", getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE)));
        assertTrue(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectIndexMatchOnArrayAccess() {
        JSType arrayType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        n.setType(com.google.javascript.rhino.Token.GETPROP);
        Node parent = new Node(com.google.javascript.rhino.Token.GETELEM);
        Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP);
        getProp.addChildToBack(new Node(0, 0, 0)); // object
        getProp.addChildToBack(new Node(0, 0, 0)); // prop
        parent.addChildToBack(getProp);
        parent.addChildToBack(new Node(0, 0, 0)); // index
        n.setParent(parent);
        validator.expectIndexMatch(t, n, arrayType, numType);
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testTypeMismatchCreation() {
        JSType typeA = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        TypeMismatch mismatch = validator.new TypeMismatch(typeA, typeB);
        assertEquals(typeA, mismatch.typeA);
        assertEquals(typeB, mismatch.typeB);
    }

    @Test
    public void testTypeMismatchEqualsSameTypes() {
        JSType typeA = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        TypeMismatch mismatch1 = validator.new TypeMismatch(typeA, typeB);
        TypeMismatch mismatch2 = validator.new TypeMismatch(typeA, typeB);
        assertTrue(mismatch1.equals(mismatch2));
        assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
    }

    @Test
    public void testTypeMismatchEqualsDifferentTypes() {
        JSType typeA = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        JSType typeC = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE);
        TypeMismatch mismatch1 = validator.new TypeMismatch(typeA, typeB);
        TypeMismatch mismatch2 = validator.new TypeMismatch(typeA, typeC);
        assertFalse(mismatch1.equals(mismatch2));
    }

    @Test
    public void testTypeMismatchToString() {
        JSType typeA = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        JSType typeB = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        TypeMismatch mismatch = validator.new TypeMismatch(typeA, typeB);
        String expected = "(" + typeA.toString() + ", " + typeB.toString() + ")";
        assertEquals(expected, mismatch.toString());
    }

    @Test
    public void testExpectIndexMatchOnPropertyAccess() {
        JSType objType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);
        JSType strType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
        Node n = new Node(0, 0, 0);
        n.setType(com.google.javascript.rhino.Token.GETPROP);
        Node parent = new Node(com.google.javascript.rhino.Token.GETELEM);
        Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP);
        getProp.addChildToBack(new Node(0, 0, 0)); // object
        getProp.addChildToBack(new Node(0, 0, 0)); // prop
        parent.addChildToBack(getProp);
        parent.addChildToBack(new Node(0, 0, 0)); // index
        n.setParent(parent);
        validator.expectIndexMatch(t, n, objType, strType);
        assertFalse(validator.getMismatches().iterator().hasNext());
    }

    @Test
    public void testExpectIndexMatchWithUnknownObject() {
        JSType unknownType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
        JSType numType = getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);
        Node n = new Node(0, 0, 0);
        n.setType(com.google.javascript.rhino.Token.GETPROP);
        Node parent = new Node(com.google.javascript.rhino.Token.GETELEM);
        Node getProp = new Node(com.google.javascript.rhino.Token.GETPROP);
        getProp.addChildToBack(new Node(0, 0, 0));
        getProp.addChildToBack(new Node(0, 0, 0));
        parent.addChildToBack(getProp);
        parent.addChildToBack(new Node(0, 0, 0));
        n.setParent(parent);
        validator.expectIndexMatch(t, n, unknownType, numType);
        // Expect string or number since unknown in matchObjectContext? Actually unknown matches any, but
        // no mismatch expected for unknown deref
        assertTrue(validator.getMismatches().iterator().hasNext()); // unknown not matching, mismatch expected
    }

    private JSType getNativeType(com.google.javascript.rhino.jstype.JSTypeNative typeId) {
        return compiler.getTypeRegistry().getNativeType(typeId);
    }
}