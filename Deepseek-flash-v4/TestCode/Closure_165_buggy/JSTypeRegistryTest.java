package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class JSTypeRegistryTest {
    private JSTypeRegistry registry;
    private TestErrorReporter reporter;

    private static class TestErrorReporter implements ErrorReporter {
        private int errorCount = 0;
        private int warningCount = 0;

        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {
            warningCount++;
        }

        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {
            errorCount++;
        }

        public int getErrorCount() {
            return errorCount;
        }

        public int getWarningCount() {
            return warningCount;
        }
    }

    @Before
    public void setUp() {
        reporter = new TestErrorReporter();
        registry = new JSTypeRegistry(reporter);
    }

    @Test
    public void testConstructorWithReporter() {
        assertNotNull(registry);
        assertNotNull(registry.getErrorReporter());
        assertFalse(registry.shouldTolerateUndefinedValues());
    }

    @Test
    public void testConstructorWithReporterAndTolerateUndefined() {
        JSTypeRegistry customRegistry = new JSTypeRegistry(reporter, true);
        assertTrue(customRegistry.shouldTolerateUndefinedValues());
    }

    @Test
    public void testGetNativeType() {
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        assertNotNull(allType);
        assertTrue(allType.isAllType());

        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertNotNull(unknownType);
        assertTrue(unknownType.isUnknownType());
    }

    @Test
    public void testGetNativeObjectType() {
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE);
        assertNotNull(objType);
        assertEquals("Array", objType.getReferenceName());
    }

    @Test
    public void testGetNativeFunctionType() {
        FunctionType funcType = registry.getNativeFunctionType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        assertNotNull(funcType);
        assertEquals("Array", funcType.getReferenceName());
    }

    @Test
    public void testSetAndGetResolveMode() {
        assertEquals(ResolveMode.LAZY_NAMES, registry.getResolveMode());
        registry.setResolveMode(ResolveMode.IMMEDIATE);
        assertEquals(ResolveMode.IMMEDIATE, registry.getResolveMode());
    }

    @Test
    public void testCreateUnionType() {
        JSType type1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(type1, type2);
        assertNotNull(unionType);
        assertTrue(unionType.isUnionType());
        assertTrue(unionType.isStringType() || unionType.isNumberType() || unionType.isUnionType());
    }

    @Test
    public void testCreateUnionTypeWithVarArgs() {
        JSType type1 = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType unionType = registry.createUnionType(type1, type2);
        assertNotNull(unionType);
        assertTrue(unionType.isUnionType());
    }

    @Test
    public void testCreateNullableType() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType nullableType = registry.createNullableType(type);
        assertNotNull(nullableType);
        assertTrue(nullableType.isNullable());
    }

    @Test
    public void testCreateOptionalType() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType optionalType = registry.createOptionalType(type);
        assertNotNull(optionalType);
        assertTrue(optionalType.isUnionType());
    }

    @Test
    public void testCreateOptionalNullableType() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType optionalNullableType = registry.createOptionalNullableType(type);
        assertNotNull(optionalNullableType);
        assertTrue(optionalNullableType.isUnionType());
        assertTrue(optionalNullableType.isNullable());
    }

    @Test
    public void testCreateDefaultObjectUnion() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType defaultUnion = registry.createDefaultObjectUnion(type);
        assertNotNull(defaultUnion);
    }

    @Test
    public void testCreateDefaultObjectUnionWithTolerateUndefined() {
        JSTypeRegistry customRegistry = new JSTypeRegistry(reporter, true);
        JSType type = customRegistry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType defaultUnion = customRegistry.createDefaultObjectUnion(type);
        assertNotNull(defaultUnion);
        assertTrue(defaultUnion.isUnionType());
    }

    @Test
    public void testCreateEnumType() {
        Node source = new Node(Token.NAME, "MyEnum");
        JSType elementsType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        EnumType enumType = registry.createEnumType("MyEnum", source, elementsType);
        assertNotNull(enumType);
        assertEquals("MyEnum", enumType.getReferenceName());
    }

    @Test
    public void testCreateArrowType() {
        Node parameters = new Node(Token.PARAM_LIST);
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        ArrowType arrowType = registry.createArrowType(parameters, returnType);
        assertNotNull(arrowType);
        assertSame(returnType, arrowType.getReturnType());
    }

    @Test
    public void testCreateArrowTypeWithNullReturn() {
        Node parameters = new Node(Token.PARAM_LIST);
        ArrowType arrowType = registry.createArrowType(parameters, null);
        assertNotNull(arrowType);
        assertNull(arrowType.getReturnType());
    }

    @Test
    public void testCreateFunctionType() {
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType funcType = registry.createFunctionType(returnType, paramType);
        assertNotNull(funcType);
        assertNotNull(funcType.getParametersNode());
    }

    @Test
    public void testCreateFunctionTypeWithVarArgs() {
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType funcType = registry.createFunctionTypeWithVarArgs(returnType, paramType);
        assertNotNull(funcType);
        assertTrue(funcType.isVarArgs());
    }

    @Test
    public void testCreateConstructorType() {
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType constructorType = registry.createConstructorType(returnType, paramType);
        assertNotNull(constructorType);
        assertTrue(constructorType.isConstructor());
    }

    @Test
    public void testCreateObjectType() {
        ObjectType objType = registry.createObjectType(null);
        assertNotNull(objType);
    }

    @Test
    public void testCreateRecordType() {
        Map<String, RecordTypeBuilder.RecordProperty> properties = new HashMap<String, RecordTypeBuilder.RecordProperty>();
        RecordType recordType = registry.createRecordType(properties);
        assertNotNull(recordType);
        assertTrue(recordType.getProperties().isEmpty());
    }

    @Test
    public void testCreateAnonymousObjectType() {
        ObjectType objType = registry.createAnonymousObjectType();
        assertNotNull(objType);
    }

    @Test
    public void testCreateNamedType() {
        NamedType namedType = registry.createNamedType("Foo", null, 1, 2);
        assertNotNull(namedType);
        assertEquals("Foo", namedType.getReferenceName());
    }

    @Test
    public void testDeclareAndGetType() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertTrue(registry.declareType("MyType", type));
        assertSame(type, registry.getType("MyType"));
    }

    @Test
    public void testDeclareTypeDuplicate() {
        JSType type1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(registry.declareType("DupType", type1));
        assertFalse(registry.declareType("DupType", type2));
        assertSame(type1, registry.getType("DupType"));
    }

    @Test
    public void testOverwriteDeclaredType() {
        JSType type1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        registry.declareType("OverwriteType", type1);
        registry.overwriteDeclaredType("OverwriteType", type2);
        assertSame(type2, registry.getType("OverwriteType"));
    }

    @Test
    public void testForwardDeclareType() {
        registry.forwardDeclareType("ForwardType");
        assertTrue(registry.isForwardDeclaredType("ForwardType"));
        assertFalse(registry.isForwardDeclaredType("NonExistentType"));
    }

    @Test
    public void testHasNamespace() {
        assertFalse(registry.hasNamespace("NoNamespace"));
    }

    @Test
    public void testGetTypeNonExistent() {
        assertNull(registry.getType("NonExistentType"));
    }

    @Test
    public void testCreateFromTypeNodesString() {
        Node node = Node.newString("Foo");
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
        assertTrue(result.isNamedType());
    }

    @Test
    public void testCreateFromTypeNodesTokenLB() {
        Node node = new Node(Token.LB);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
        assertTrue(result.isArrayType());
    }

    @Test
    public void testCreateFromTypeNodesTokenBANG() {
        Node innerNode = Node.newString("Foo");
        Node node = new Node(Token.BANG, innerNode);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
    }

    @Test
    public void testCreateFromTypeNodesTokenQMARK() {
        Node node = new Node(Token.QMARK);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
        assertTrue(result.isUnknownType());
    }

    @Test
    public void testCreateFromTypeNodesTokenSTAR() {
        Node node = new Node(Token.STAR);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
        assertTrue(result.isAllType());
    }

    @Test
    public void testCreateFromTypeNodesTokenEMPTY() {
        Node node = new Node(Token.EMPTY);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
    }

    @Test
    public void testCreateFromTypeNodesTokenVOID() {
        Node node = new Node(Token.VOID);
        JSType result = registry.createFromTypeNodes(node, "source.js", null);
        assertNotNull(result);
    }

    @Test
    public void testCreateParameters() {
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node params = registry.createParameters(param1, param2);
        assertNotNull(params);
        assertEquals(2, params.getChildCount());
    }

    @Test
    public void testCreateParametersWithVarArgs() {
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node params = registry.createParametersWithVarArgs(param1, param2);
        assertNotNull(params);
        assertEquals(2, params.getChildCount());
    }

    @Test
    public void testCreateParametersWithVarArgsMarked() {
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        Node params = registry.createParametersWithVarArgs(param1);
        assertNotNull(params);
        assertTrue(params.getChildCount() >= 1);
    }

    @Test
    public void testCreateOptionalParameters() {
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node params = registry.createOptionalParameters(param1, param2);
        assertNotNull(params);
    }

    @Test
    public void testCreateFunctionTypeWithNewReturnType() {
        JSType returnType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType funcType = registry.createFunctionType(returnType, paramType);
        JSType newReturnType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        FunctionType newFuncType = registry.createFunctionTypeWithNewReturnType(funcType, newReturnType);
        assertNotNull(newFuncType);
        assertSame(newReturnType, newFuncType.getReturnType());
    }

    @Test
    public void testRegisterAndUnregisterPropertyOnType() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        String propertyName = "testProperty";
        registry.registerPropertyOnType(propertyName, type);
        assertTrue(registry.canPropertyBeDefined(type, propertyName));
        registry.unregisterPropertyOnType(propertyName, type);
        assertFalse(registry.canPropertyBeDefined(type, propertyName));
    }

    @Test
    public void testRegisterPropertyOnTypeWithUnion() {
        JSType type1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(type1, type2);
        registry.registerPropertyOnType("unionProp", unionType);
        assertTrue(registry.canPropertyBeDefined(unionType, "unionProp"));
    }

    @Test
    public void testGetTypesWithProperty() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("prop1", type);
        Iterable<JSType> types = registry.getTypesWithProperty("prop1");
        assertNotNull(types);
        assertTrue(types.iterator().hasNext());
    }

    @Test
    public void testGetTypesWithPropertyNonExistent() {
        Iterable<JSType> types = registry.getTypesWithProperty("nonExistent");
        assertNotNull(types);
        assertFalse(types.iterator().hasNext());
    }

    @Test
    public void testGetGreatestSubtypeWithProperty() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        registry.registerPropertyOnType("subProp", type);
        JSType result = registry.getGreatestSubtypeWithProperty("subProp");
        assertNotNull(result);
    }

    @Test
    public void testGetGreatestSubtypeWithPropertyNonExistent() {
        JSType result = registry.getGreatestSubtypeWithProperty("noSubProp");
        assertNotNull(result);
        assertTrue(result.isEmptyType());
    }

    @Test
    public void testCanPropertyBeDefinedNoProperty() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(registry.canPropertyBeDefined(type, "noProperty"));
    }

    @Test
    public void testSetTemplateTypeName() {
        String templateName = "T1";
        registry.setTemplateTypeName(templateName);
        JSType result = registry.getType(templateName);
        assertNotNull(result);
        assertTrue(result.isTemplateType());
    }

    @Test
    public void testClearTemplateTypeName() {
        String templateName = "T2";
        registry.setTemplateTypeName(templateName);
        registry.clearTemplateTypeName();
        assertNull(registry.getType(templateName));
    }

    @Test
    public void testRegisterPropertyOnTypeNamedType() {
        NamedType namedType = registry.createNamedType("NamedTypeTest", null, 1, 1);
        registry.registerPropertyOnType("namedProp", namedType);
        assertFalse(registry.canPropertyBeDefined(namedType, "namedProp"));
    }

    @Test
    public void testRegisterPropertyOnTypeUnion() {
        JSType type1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unionType = registry.createUnionType(type1, type2);
        registry.registerPropertyOnType("unionProp2", unionType);
        assertFalse(registry.canPropertyBeDefined(unionType, "unionProp2"));
    }

    @Test
    public void testCreateFunctionTypeWithVarArgsTyped() {
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        JSType param1 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType param2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        FunctionType funcType = registry.createFunctionTypeWithVarArgs(returnType, param1, param2);
        assertNotNull(funcType);
        assertTrue(funcType.isVarArgs());
        assertEquals(2, funcType.getParameters().size());
    }

    @Test
    public void testCreateConstructorTypeWithVarArgs() {
        JSType returnType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        JSType param = registry.getNativeType(JSTypeNative.STRING_TYPE);
        FunctionType constructorType = registry.createConstructorTypeWithVarArgs(returnType, param);
        assertNotNull(constructorType);
    }

    @Test
    public void testGetDirectImplementors() {
        FunctionType interfaceType = registry.createInterfaceType("MyInterface", null);
        if (interfaceType.getReferenceName() != null) {
            Collection<FunctionType> implementors = registry.getDirectImplementors(interfaceType);
            assertNotNull(implementors);
        }
    }

    @Test
    public void testCreateObjectTypeWithName() {
        ObjectType objType = registry.createObjectType("MyObject", null, null);
        assertNotNull(objType);
        assertEquals("MyObject", objType.getReferenceName());
    }

    @Test
    public void testCreateFunctionTypeWithNewThisType() {
        JSType returnType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        FunctionType funcType = registry.createFunctionType(returnType);
        ObjectType newThisType = registry.createObjectType(null);
        FunctionType result = registry.createFunctionTypeWithNewThisType(funcType, newThisType);
        assertNotNull(result);
    }

    @Test
    public void testCreateParameterizedType() {
        ObjectType baseType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        JSType paramType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        ParameterizedType paramTypeWrapper = registry.createParameterizedType(baseType, paramType);
        assertNotNull(paramTypeWrapper);
    }

    @Test
    public void testClearNamedTypes() {
        registry.clearNamedTypes();
        assertNotNull(registry);
    }
}