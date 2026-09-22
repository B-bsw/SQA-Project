package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.DisambiguateProperties.Property;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class DisambiguatePropertiesTest {

    private DisambiguateProperties<JSType> disambiguateProperties;
    private AbstractCompiler compiler;
    private JSTypeSystem typeSystem;
    private JSTypeRegistry registry;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        compiler = compilerSupplier.get();
        typeSystem = new JSTypeSystem(compiler);
        disambiguateProperties = new DisambiguateProperties<JSType>(compiler, typeSystem);
        externs = new Node(Token.EMPTY);
        root = new Node(Token.EMPTY);
    }

    @Test
    public void testForJSTypeSystem() {
        assertNotNull(DisambiguateProperties.forJSTypeSystem(compiler));
    }

    @Test
    public void testForConcreteTypeSystem() {
        TightenTypes tt = new TightenTypes(compiler);
        assertNotNull(DisambiguateProperties.forConcreteTypeSystem(compiler, tt));
    }

    @Test
    public void testProcessWithNoMismatches() {
        disambiguateProperties.process(externs, root);
    }

    @Test
    public void testAddInvalidatingType() {
        JSType type = registry.getNativeType(JSTypeNative.NO_TYPE);
        typeSystem.addInvalidatingType(type);
        assertTrue(typeSystem.invalidatingTypes.contains(type));
    }

    @Test
    public void testGetTypeWithPropertyNotObject() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(typeSystem.getTypeWithProperty("foo", type));
    }

    @Test
    public void testGetTypeWithPropertyAutoboxes() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType result = typeSystem.getTypeWithProperty("foo", type);
        assertNotNull(result);
        assertTrue(result.isObjectType());
    }

    @Test
    public void testGetTypeWithPropertyPrototype() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        JSType result = typeSystem.getTypeWithProperty("prototype", type);
        assertNotNull(result);
        assertTrue(result.isObjectType());
    }

    @Test
    public void testGetTypeWithPropertyOwnProperty() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        Node objNode = new Node(Token.OBJECTLIT);
        objNode.putProp("foo", type);
        typeSystem.objectTypes.add(type);
        typeSystem.typeProperties.put(type, new HashSet<String>());
        JSType result = typeSystem.getTypeWithProperty("foo", type);
        assertNull(result);
    }

    @Test
    public void testGetInstanceFromPrototypeNotFunction() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertNull(typeSystem.getInstanceFromPrototype(type));
    }

    @Test
    public void testGetInstanceFromPrototypeFunction() {
        JSType type = registry.getNativeType(JSTypeNative.OBJECT_FUNCTION_TYPE);
        ObjectType objType = (ObjectType) type;
        FunctionType funcType = objType.getOwnerFunction();
        ObjectType instance = typeSystem.getInstanceFromPrototype(registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE));
        assertNotNull(instance);
    }

    @Test
    public void testGetInstanceFromPrototypeInterface() {
        JSType type = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        ObjectType objType = (ObjectType) type;
        ObjectType prototype = objType.getImplicitPrototype();
        ObjectType instance = typeSystem.getInstanceFromPrototype(prototype);
        assertNotNull(instance);
    }

    @Test
    public void testRecordInterfaces_NoSkip_Constructor() {
        JSType type = registry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        ObjectType objType = (ObjectType) type;
        FunctionType fn = objType.getOwnerFunction();
        fn.setPrototypeBasedOn(objType);
        JSType related = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        typeSystem.recordInterfaces(type, related, null);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        JSType type = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType result = typeSystem.restrictByNotNullOrUndefined(type);
        assertNotNull(result);
        assertFalse(result.isNullable());
    }

    @Test
    public void testGetTypeAlternativesUnion() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType type2 = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType union = registry.createUnionType(type, type2);
        Iterable<JSType> alts = typeSystem.getTypeAlternatives(union);
        int count = 0;
        for (JSType alt : alts) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetTypeAlternativesNonUnion() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Iterable<JSType> alts = typeSystem.getTypeAlternatives(type);
        int count = 0;
        for (JSType alt : alts) {
            count++;
        }
        assertEquals(0, count);
    }

    @Test
    public void testIsTypeToSkipEnum() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        assertFalse(typeSystem.isTypeToSkip(type));
    }

    @Test
    public void testIsTypeToSkipAutobox() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertFalse(typeSystem.isTypeToSkip(type));
    }

    private AbstractCompiler createCompiler() {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        return new Compiler(options);
    }
}