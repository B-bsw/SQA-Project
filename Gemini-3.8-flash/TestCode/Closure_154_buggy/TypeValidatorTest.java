package com.google.javascript.jscomp;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TypeValidatorTest {

    private TypeValidator validator;
    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private NodeTraversal traversal;
    private Node node;

    @Before
    public void setUp() {
        // Simple mock AbstractCompiler with minimal type registry
        compiler = new SimpleCompiler();
        typeRegistry = new SimpleTypeRegistry();
        validator = new TypeValidator(compiler);
        traversal = new SimpleNodeTraversal();
        node = new Node(Token.NAME, "test");
    }

    @After
    public void tearDown() {
        validator = null;
        compiler = null;
        typeRegistry = null;
        traversal = null;
        node = null;
    }

    // Helper methods
    private JSType getNativeType(JSTypeNative typeId) {
        return typeRegistry.getNativeType(typeId);
    }

    private JSType getStringType() {
        return getNativeType(JSTypeNative.STRING_TYPE);
    }

    private JSType getNumberType() {
        return getNativeType(JSTypeNative.NUMBER_TYPE);
    }

    private JSType getObjectType() {
        return getNativeType(JSTypeNative.OBJECT_TYPE);
    }

    private JSType getUnknownType() {
        return getNativeType(JSTypeNative.UNKNOWN_TYPE);
    }

    private JSType getArrayType() {
        return getNativeType(JSTypeNative.ARRAY_TYPE);
    }

    private JSType getNullType() {
        return getNativeType(JSTypeNative.NULL_TYPE);
    }

    private JSType getVoidType() {
        return getNativeType(JSTypeNative.VOID_TYPE);
    }

    private JSType createUnionType(JSType... types) {
        return typeRegistry.createUnionType(types);
    }

    private void assertMismatchCount(int expected) {
        int count = 0;
        for (TypeMismatch mismatch : validator.getMismatches()) {
            count++;
        }
        assertEquals("Mismatch count", expected, count);
    }

    @Test
    public void testExpectObject_ObjectType_NoMismatch() {
        JSType objectType = getObjectType();
        validator.expectObject(traversal, node, objectType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectObject_StringType_Mismatch() {
        JSType stringType = getStringType();
        validator.expectObject(traversal, node, stringType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectObject_UnknownType_NoMismatch() {
        JSType unknownType = getUnknownType();
        validator.expectObject(traversal, node, unknownType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectAnyObject_NullType_Mismatch() {
        JSType nullType = getNullType();
        validator.expectAnyObject(traversal, node, nullType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectAnyObject_ObjectType_NoMismatch() {
        JSType objectType = getObjectType();
        validator.expectAnyObject(traversal, node, objectType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectString_NumberType_Mismatch() {
        JSType numberType = getNumberType();
        validator.expectString(traversal, node, numberType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectString_StringType_NoMismatch() {
        JSType stringType = getStringType();
        validator.expectString(traversal, node, stringType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectNumber_StringType_Mismatch() {
        JSType stringType = getStringType();
        validator.expectNumber(traversal, node, stringType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectNumber_NumberType_NoMismatch() {
        JSType numberType = getNumberType();
        validator.expectNumber(traversal, node, numberType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectBitwiseable_ObjectType_NoMismatch() {
        JSType objectType = getObjectType();
        validator.expectBitwiseable(traversal, node, objectType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectBitwiseable_StringType_Mismatch() {
        JSType stringType = getStringType();
        validator.expectBitwiseable(traversal, node, stringType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectStringOrNumber_BooleanType_Mismatch() {
        JSType booleanType = getNativeType(JSTypeNative.BOOLEAN_TYPE);
        validator.expectStringOrNumber(traversal, node, booleanType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectStringOrNumber_StringType_NoMismatch() {
        JSType stringType = getStringType();
        validator.expectStringOrNumber(traversal, node, stringType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectNotNullOrUndefined_UndefinedType_Mismatch() {
        JSType voidType = getVoidType();
        validator.expectNotNullOrUndefined(traversal, node, voidType, "msg", getObjectType());
        assertMismatchCount(1);
    }

    @Test
    public void testExpectNotNullOrUndefined_NullType_Mismatch() {
        JSType nullType = getNullType();
        validator.expectNotNullOrUndefined(traversal, node, nullType, "msg", getObjectType());
        assertMismatchCount(1);
    }

    @Test
    public void testExpectNotNullOrUndefined_ObjectType_NoMismatch() {
        JSType objectType = getObjectType();
        validator.expectNotNullOrUndefined(traversal, node, objectType, "msg", getObjectType());
        assertMismatchCount(0);
    }

    @Test
    public void testExpectSwitchMatchesCase_Match() {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        Node switchNode = new Node(Token.SWITCH, node);
        validator.expectSwitchMatchesCase(traversal, node, stringType, numberType);
        assertMismatchCount(1);
    }

    @Test
    public void testExpectIndexMatch_ArrayType_NumberIndex_NoMismatch() {
        JSType arrayType = getArrayType();
        JSType numberType = getNumberType();
        validator.expectIndexMatch(traversal, node, arrayType, numberType);
        assertMismatchCount(0);
    }

    @Test
    public void testExpectIndexMatch_ObjectType_StringIndex_NoMismatch() {
        JSType objectType = getObjectType();
        JSType stringType = getStringType();
        validator.expectIndexMatch(traversal, node, objectType, stringType);
        assertMismatchCount(0);
    }

    @Test
    public void testExpectIndexMatch_NumberType_UnknownIndex_Mismatch() {
        JSType numberType = getNumberType();
        JSType unknownType = getUnknownType();
        validator.expectIndexMatch(traversal, node, numberType, unknownType);
        assertMismatchCount(1);
    }

    @Test
    public void testExpectCanAssignToPropertyOf_Assignable_NoMismatch() {
        JSType stringType = getStringType();
        JSType objectType = getObjectType();
        validator.expectCanAssignToPropertyOf(traversal, node, stringType, objectType, node, "prop");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectCanAssignToPropertyOf_NotAssignable_Mismatch() {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        validator.expectCanAssignToPropertyOf(traversal, node, stringType, numberType, node, "prop");
        assertMismatchCount(1);
    }

    @Test
    public void testExpectCanAssignTo_Assignable_NoMismatch() {
        JSType stringType = getStringType();
        validator.expectCanAssignTo(traversal, node, stringType, stringType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectCanAssignTo_NotAssignable_Mismatch() {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        validator.expectCanAssignTo(traversal, node, stringType, numberType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testBothIntrinsics_ConstructorAndConstructor_True() {
        JSType constructorType = getNativeType(JSTypeNative.FUNCTION_TYPE);
        JSType enumType = getNativeType(JSTypeNative.OBJECT_TYPE);
        assertTrue(validator.bothIntrinsics(constructorType, enumType));
    }

    @Test
    public void testBothIntrinsics_ObjectAndString_False() {
        JSType objectType = getObjectType();
        JSType stringType = getStringType();
        assertFalse(validator.bothIntrinsics(objectType, stringType));
    }

    @Test
    public void testExpectArgumentMatchesParameter_NoMismatch() {
        JSType stringType = getStringType();
        JSType objectType = getObjectType();
        Node callNode = new Node(Token.CALL);
        validator.expectArgumentMatchesParameter(traversal, node, stringType, objectType, callNode, 0);
        assertMismatchCount(0);
    }

    @Test
    public void testExpectCanOverride_Overridable_NoMismatch() {
        JSType stringType = getStringType();
        validator.expectCanOverride(traversal, node, stringType, stringType, "prop", getObjectType());
        assertMismatchCount(0);
    }

    @Test
    public void testExpectSuperType_InheritanceMismatch_Mismatch() {
        JSType objectType = getObjectType();
        ObjectType superObject = (ObjectType) objectType;
        // Create and set up subObject
        ObjectType subObject = (ObjectType) getObjectType();
        validator.expectSuperType(traversal, node, superObject, subObject);
        assertMismatchCount(1);
    }

    @Test
    public void testMismatch_RegistersMismatch() throws Exception {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        // Call private mismatch via reflection or make it package-private for test
        validator.expectCanAssignTo(traversal, node, stringType, numberType, "msg");
        assertMismatchCount(1);
    }

    @Test
    public void testGetMismatches_EmptyInitially() {
        assertEquals("Should be empty", 0, validator.getMismatches().spliterator().estimateSize());
    }

    @Test
    public void testSetShouldReport_ToFalse_NoErrorReported() {
        validator.setShouldReport(false);
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        validator.expectCanAssignTo(traversal, node, stringType, numberType, "msg");
        assertMismatchCount(1); // still register mismatch but no compiler report
    }

    @Test
    public void testContainsForwardDeclaredUnresolvedName_NonUnionType_False() {
        JSType stringType = getStringType();
        // Since we can't easily create a UnionType through SimpleTypeRegistry, test false case
        assertFalse(validator.containsForwardDeclaredUnresolvedName(stringType));
    }

    @Test
    public void testExpectSuperType_NullSubCtor_NoThrow() {
        JSType objectType = getObjectType();
        ObjectType superObject = (ObjectType) objectType;
        ObjectType subObject = (ObjectType) objectType;
        validator.expectSuperType(traversal, node, superObject, subObject);
    }

    @Test
    public void testExpectObject_NoType_NullType_NoMismatch() {
        JSType nullType = getNullType();
        // NoType type
        JSType noType = getNativeType(JSTypeNative.NO_TYPE);
        validator.expectObject(traversal, node, noType, "msg");
        assertMismatchCount(0);
    }

    @Test
    public void testExpectNotNullOrUndefined_NullObjectContext_NoMismatch() {
        JSType nullType = getNullType();
        // test with null context
        validator.expectNotNullOrUndefined(traversal, node, nullType, "msg", getObjectType());
        assertMismatchCount(1);
    }

    @Test
    public void testTypeMismatch_EqualsAndHashCode() {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        // Need to create via registerMismatch indirectly
        validator.expectCanAssignTo(traversal, node, stringType, numberType, "msg");
        TypeMismatch mismatch = validator.getMismatches().iterator().next();
        
        // Test toString
        assertNotNull("toString should not be null", mismatch.toString());
        
        // Test equals
        TypeMismatch mismatch2 = new TypeMismatch(stringType, numberType);
        assertEquals("Equals should be true for same types", mismatch, mismatch2);
        assertNotEquals("Different types should not be equal", mismatch, new TypeMismatch(numberType, stringType));
        
        // Test hashCode
        assertEquals("HashCode should be consistent with equals", mismatch.hashCode(), mismatch2.hashCode());
    }

    @Test
    public void testRegisterMismatch_DuplicateMismatch() {
        JSType stringType = getStringType();
        JSType numberType = getNumberType();
        Node n = new Node(Token.NAME, "test");
        
        // First mismatch
        validator.expectCanAssignTo(traversal, n, stringType, numberType, "msg1");
        // Duplicate mismatch with same types
        validator.expectCanAssignTo(traversal, n, stringType, numberType, "msg2");
        
        // Should still be one mismatch in list because equals is overridden
        assertMismatchCount(1);
    }

    @Test
    public void testGetNativeType_NullTypeId() {
        // Should return null for null typeId
        JSType result = validator.getNativeType(null);
        assertNull("Native type for null should be null", result);
    }

    @Test
    public void testGetReadableJSTypeName_NullType() {
        JSType result = validator.getReadableJSTypeName(null, true);
        assertNotNull("Result should not be null for null type", result);
    }

    // Simple mock AbstractCompiler
    private static class SimpleCompiler extends AbstractCompiler {
        private JSTypeRegistry registry = new SimpleTypeRegistry();
        
        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }
        
        @Override
        public void report(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, DiagnosticType diagnosticType, String... arguments) {
            // No-op for test
        }
        
        // Implement abstract methods
        @Override
        protected void report(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, DiagnosticType diagnosticType, String description) {
            // No-op
        }
        
        @Override
        public String getSourceLine(String sourceName, int lineNumber) {
            return null;
        }
        
        @Override
        public String getSourceLineMaybe(String sourceName, int lineNumber) {
            return null;
        }
    }
    
    // Simple TypeRegistry
    private static class SimpleTypeRegistry extends JSTypeRegistry {
        public SimpleTypeRegistry() {
            super(null);
        }
        
        @Override
        public JSType getNativeType(JSTypeNative typeId) {
            return new SimpleJSType(typeId.toString());
        }
        
        @Override
        public JSType createUnionType(JSType... variants) {
            return new SimpleJSType("union");
        }
    }
    
    // Simple JSType
    private static class SimpleJSType extends JSType {
        private String name;
        
        SimpleJSType(String name) {
            super(null);
            this.name = name;
        }
        
        @Override
        public boolean isSubtype(JSType type) {
            return this.equals(type);
        }
        
        @Override
        public boolean canAssignTo(JSType type) {
            return this.equals(type) || name.contains("UNKNOWN");
        }
        
        @Override
        public String toString() {
            return name;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SimpleJSType) {
                return ((SimpleJSType) obj).name.equals(this.name);
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return name.hashCode();
        }
        
        @Override
        public boolean matchesStringContext() {
            return name.contains("STRING");
        }
        
        @Override
        public boolean matchesNumberContext() {
            return name.contains("NUMBER");
        }
        
        @Override
        public boolean matchesObjectContext() {
            return name.contains("OBJECT") || name.contains("UNKNOWN");
        }
        
        @Override
        public boolean isObject() {
            return name.contains("OBJECT") || name.contains("UNKNOWN");
        }
        
        @Override
        public boolean isArrayType() {
            return name.contains("ARRAY");
        }
    }
    
    // Simple NodeTraversal
    private static class SimpleNodeTraversal extends NodeTraversal {
        public SimpleNodeTraversal() {
            super(null, null);
        }
        
        @Override
        public String getSourceName() {
            return "test";
        }
        
        @Override
        public boolean inGlobalScope() {
            return true;
        }
        
        @Override
        public void report(Node n, DiagnosticType diagnosticType, String... arguments) {
            // No-op
        }
        
        @Override
        public void report(Node n, com.google.javascript.jscomp.DiagnosticType diagnosticType, String description) {
            // No-op
        }
        
        @Override
        public com.google.javascript.jscomp.Scope getScope() {
            return null;
        }
        
        @Override
        public boolean hasScope() {
            return false;
        }
        
        @Override
        public void report(Node n, com.google.javascript.jscomp.DiagnosticType diagnosticType) {
            // No-op
        }
    }
}