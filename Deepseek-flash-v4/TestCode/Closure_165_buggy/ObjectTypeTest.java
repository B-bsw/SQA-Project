package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

public class ObjectTypeTest {

    private JSTypeRegistry registry;
    private JSType unknownType;
    private JSType numberType;
    private JSType stringType;
    private Node emptyNode;

    private static class TestObjectType extends ObjectType {
        private final String referenceName;
        private final java.util.Map<String, Property> properties = new java.util.HashMap<>();
        private final ObjectType implicitPrototype;
        private final boolean[] propertyTypeInferred;
        private FunctionType ownerFunction;
        private Node propertyNode;
        private JSDocInfo propertyDocInfo;

        TestObjectType(JSTypeRegistry registry, String referenceName, ObjectType implicitPrototype) {
            super(registry);
            this.referenceName = referenceName;
            this.implicitPrototype = implicitPrototype;
            this.propertyTypeInferred = new boolean[0];
        }

        TestObjectType(JSTypeRegistry registry, String referenceName, ObjectType implicitPrototype, int propertyCount) {
            super(registry);
            this.referenceName = referenceName;
            this.implicitPrototype = implicitPrototype;
            this.propertyTypeInferred = new boolean[propertyCount];
        }

        @Override
        public Property getSlot(String name) {
            return properties.get(name);
        }

        @Override
        public String getReferenceName() {
            return referenceName;
        }

        @Override
        public boolean hasProperty(String propertyName) {
            return properties.containsKey(propertyName);
        }

        @Override
        public boolean hasOwnProperty(String propertyName) {
            return properties.containsKey(propertyName);
        }

        @Override
        public Set<String> getOwnPropertyNames() {
            return properties.keySet();
        }

        @Override
        public FunctionType getConstructor() {
            return null;
        }

        @Override
        public ObjectType getImplicitPrototype() {
            return implicitPrototype;
        }

        @Override
        boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
            properties.put(propertyName, new Property(propertyName, type, inferred, propertyNode, this));
            return true;
        }

        @Override
        public boolean removeProperty(String propertyName) {
            return properties.remove(propertyName) != null;
        }

        @Override
        public Node getPropertyNode(String propertyName) {
            return properties.get(propertyName) != null ? properties.get(propertyName).getNode() : null;
        }

        @Override
        public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) {
            Property prop = properties.get(propertyName);
            return prop != null ? prop.getJSDocInfo() : null;
        }

        @Override
        public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) {
            Property prop = properties.get(propertyName);
            if (prop != null) {
                prop.setJSDocInfo(info);
            }
        }

        @Override
        public JSType findPropertyType(String propertyName) {
            Property prop = properties.get(propertyName);
            return prop != null ? prop.getType() : null;
        }

        @Override
        public JSType getPropertyType(String propertyName) {
            Property prop = properties.get(propertyName);
            return prop != null ? prop.getType() : null;
        }

        @Override
        public boolean isPropertyTypeInferred(String propertyName) {
            Property prop = properties.get(propertyName);
            return prop != null && prop.isTypeInferred();
        }

        @Override
        public boolean isPropertyTypeDeclared(String propertyName) {
            Property prop = properties.get(propertyName);
            return prop != null && !prop.isTypeInferred();
        }

        @Override
        public int getPropertiesCount() {
            return properties.size();
        }

        @Override
        public boolean isPropertyTypeDeclared(String propertyName) {
            return properties.get(propertyName) != null && !properties.get(propertyName).isTypeInferred();
        }
    }

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        emptyNode = new Node(0);
    }

    @Test
    public void testGetPropertyNode() {
        TestObjectType obj = new TestObjectType(registry, "Test", null, 1);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertNotNull(obj.getPropertyNode("prop1"));
        assertNull(obj.getPropertyNode("nonexistent"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        JSDocInfo info = new JSDocInfo();
        obj.setPropertyJSDocInfo("prop1", info);
        assertSame(info, obj.getOwnPropertyJSDocInfo("prop1"));
        assertNull(obj.getOwnPropertyJSDocInfo("nonexistent"));
    }

    @Test
    public void testSetPropertyJSDocInfo() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        JSDocInfo info = new JSDocInfo();
        obj.setPropertyJSDocInfo("prop1", info);
        assertSame(info, obj.getOwnPropertyJSDocInfo("prop1"));
    }

    @Test
    public void testHasProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.hasProperty("prop1"));
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(obj.hasProperty("prop1"));
        assertFalse(obj.hasProperty("prop2"));
    }

    @Test
    public void testHasOwnProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.hasOwnProperty("prop1"));
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(obj.hasOwnProperty("prop1"));
    }

    @Test
    public void testGetOwnPropertyNames() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertEquals(0, obj.getOwnPropertyNames().size());
        obj.defineProperty("prop1", numberType, false, emptyNode);
        obj.defineProperty("prop2", stringType, true, emptyNode);
        assertEquals(2, obj.getOwnPropertyNames().size());
        assertTrue(obj.getOwnPropertyNames().contains("prop1"));
        assertTrue(obj.getOwnPropertyNames().contains("prop2"));
        assertFalse(obj.getOwnPropertyNames().contains("prop3"));
    }

    @Test
    public void testDefineDeclaredProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.hasProperty("prop1"));
        obj.defineDeclaredProperty("prop1", numberType, emptyNode);
        assertTrue(obj.hasProperty("prop1"));
        assertEquals(numberType, obj.getPropertyType("prop1"));
        assertFalse(obj.isPropertyTypeInferred("prop1"));
    }

    @Test
    public void testDefineInferredProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineInferredProperty("prop1", numberType, emptyNode);
        assertTrue(obj.hasProperty("prop1"));
        assertEquals(numberType, obj.getPropertyType("prop1"));
        assertTrue(obj.isPropertyTypeInferred("prop1"));
    }

    @Test
    public void testRemoveProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(obj.hasProperty("prop1"));
        assertTrue(obj.removeProperty("prop1"));
        assertFalse(obj.hasProperty("prop1"));
        assertFalse(obj.removeProperty("nonexistent"));
    }

    @Test
    public void testGetNormalizedReferenceName() {
        TestObjectType obj = new TestObjectType(registry, "SomeName(suffix)", null);
        assertEquals("SomeName", obj.getNormalizedReferenceName());
        
        TestObjectType obj2 = new TestObjectType(registry, "PlainName", null);
        assertEquals("PlainName", obj2.getNormalizedReferenceName());
        
        TestObjectType obj3 = new TestObjectType(registry, null, null);
        assertNull(obj3.getNormalizedReferenceName());
    }

    @Test
    public void testCreateDelegateSuffix() {
        assertEquals("(suffix)", ObjectType.createDelegateSuffix("suffix"));
        assertEquals("()", ObjectType.createDelegateSuffix(""));
    }

    @Test
    public void testGetDisplayName() {
        TestObjectType obj = new TestObjectType(registry, "Name(suffix)", null);
        assertEquals("Name", obj.getDisplayName());
    }

    @Test
    public void testDetectImplicitPrototypeCycle() {
        TestObjectType obj1 = new TestObjectType(registry, "Type1", null);
        TestObjectType obj2 = new TestObjectType(registry, "Type2", obj1);
        TestObjectType obj3 = new TestObjectType(registry, "Type3", obj2);
        
        assertFalse(obj3.detectImplicitPrototypeCycle());
        
        obj1.implicitPrototype = obj3;
        assertTrue(obj3.detectImplicitPrototypeCycle());
    }

    @Test
    public void testIsObject() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertTrue(obj.isObject());
    }

    @Test
    public void testIsNativeObjectType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.isNativeObjectType());
    }

    @Test
    public void testHasCachedValues() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.hasCachedValues());
        
        obj.clearCachedValues();
        assertFalse(obj.hasCachedValues());
    }
    @org.junit.Test
    public void testClearCachedValues() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.clearCachedValues();
        assertFalse(obj.hasCachedValues());
    }

    @Test
    public void testIsFunctionPrototypeType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.isFunctionPrototypeType());
    }

    @Test
    public void testGetCtorImplementedInterfaces() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNotNull(obj.getCtorImplementedInterfaces());
        assertEquals(0, obj.getCtorImplementedInterfaces().size());
    }

    @Test
    public void testGetCtorExtendedInterfaces() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNotNull(obj.getCtorExtendedInterfaces());
        assertEquals(0, obj.getCtorExtendedInterfaces().size());
    }

    @Test
    public void testCast() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertSame(obj, ObjectType.cast(obj));
        assertNull(ObjectType.cast(unknownType));
    }

    @Test
    public void testGetPropertyType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertEquals(numberType, obj.getPropertyType("prop1"));
        assertNull(obj.getPropertyType("prop2"));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, true, emptyNode);
        assertTrue(obj.isPropertyTypeInferred("prop1"));
        assertFalse(obj.isPropertyTypeInferred("prop2"));
    }

    @Test
    public void testIsPropertyTypeDeclared() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(obj.isPropertyTypeDeclared("prop1"));
        assertFalse(obj.isPropertyTypeDeclared("prop2"));
    }

    @Test
    public void testIsPropertyInExterns() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.isPropertyInExterns("prop1"));
    }

    @Test
    public void testGetPropertiesCount() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertEquals(0, obj.getPropertiesCount());
        obj.defineProperty("prop1", numberType, false, emptyNode);
        obj.defineProperty("prop2", stringType, true, emptyNode);
        assertEquals(2, obj.getPropertiesCount());
    }

    @Test
    public void testGetPropertyNames() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNotNull(obj.getPropertyNames());
        assertEquals(0, obj.getPropertyNames().size());
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(obj.getPropertyNames().contains("prop1"));
    }

    @Test
    public void testVisit() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        Visitor<String> visitor = new Visitor<String>() {
            @Override
            public String caseObjectType(ObjectType type) {
                return "Object";
            }
        };
        assertEquals("Object", obj.visit(visitor));
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertEquals(BooleanLiteralSet.TRUE, obj.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testIsUnknownType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertFalse(obj.isUnknownType());
    }

    @Test
    public void testGetRootNode() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getRootNode());
    }

    @Test
    public void testGetParentScope() {
        TestObjectType proto = new TestObjectType(registry, "ProtoType", null);
        TestObjectType obj = new TestObjectType(registry, "Test", proto);
        assertSame(proto, obj.getParentScope());
    }

    @Test
    public void testGetSlot() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getSlot("prop1"));
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertNotNull(obj.getSlot("prop1"));
    }

    @Test
    public void testGetOwnSlot() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getOwnSlot("prop1"));
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertNotNull(obj.getOwnSlot("prop1"));
    }

    @Test
    public void testGetTypeOfThis() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getTypeOfThis());
    }

    @Test
    public void testGetParameterType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getParameterType());
    }

    @Test
    public void testGetIndexType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getIndexType());
    }

    @Test
    public void testGetJSDocInfo() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getJSDocInfo());
        JSDocInfo info = new JSDocInfo();
        obj.setJSDocInfo(info);
        assertSame(info, obj.getJSDocInfo());
    }

    @Test
    public void testSetJSDocInfo() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        JSDocInfo info = new JSDocInfo();
        obj.setJSDocInfo(info);
        assertSame(info, obj.getJSDocInfo());
    }

    @Test
    public void testTestForEquality() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        TestObjectType other = new TestObjectType(registry, "Other", null);
        
        JSType boolType = registry.getNativeType(JSTypeNative.BOOOLEAN_TYPE);
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        
        assertEquals(TernaryValue.FALSE, obj.testForEquality(nullType));
        assertEquals(TernaryValue.FALSE, obj.testForEquality(voidType));
        assertEquals(TernaryValue.UNKNOWN, obj.testForEquality(boolType));
        assertEquals(TernaryValue.UNKNOWN, obj.testForEquality(numberType));
    }

    @Test
    public void testDefineProperty() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        boolean result = obj.defineProperty("prop1", numberType, false, emptyNode);
        assertTrue(result);
        assertTrue(obj.hasProperty("prop1"));
    }

    @Test
    public void testGetConstructor() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.getConstructor());
    }

    @Test
    public void testGetImplicitPrototype() {
        TestObjectType proto = new TestObjectType(registry, "Proto", null);
        TestObjectType obj = new TestObjectType(registry, "Test", proto);
        assertSame(proto, obj.getImplicitPrototype());
    }

    @Test
    public void testFindPropertyType() {
        TestObjectType obj = new TestObjectType(registry, "Test", null);
        assertNull(obj.findPropertyType("prop1"));
        obj.defineProperty("prop1", numberType, false, emptyNode);
        assertEquals(numberType, obj.findPropertyType("prop1"));
    }
}