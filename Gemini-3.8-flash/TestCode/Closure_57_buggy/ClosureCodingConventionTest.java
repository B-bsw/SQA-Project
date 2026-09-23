package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import org.junit.Before;
import org.junit.Test;

public class ClosureCodingConventionTest {

    private static final String EXTERN_TYPE = "testType";
    private ClosureCodingConvention convention;

    @Before
    public void setUp() {
        convention = new ClosureCodingConvention();
    }

    @Test
    public void testApplySubclassRelationshipInherits() {
        JSTypeRegistry registry = new JSTypeRegistry(null);
        ObjectType parentProto = registry.createAnonymousObjectType(null);
        FunctionType parentCtor = registry.createFunctionType(parentProto, parentProto);
        FunctionType childCtor = registry.createFunctionType(registry.createAnonymousObjectType(null), null);
        
        convention.applySubclassRelationship(parentCtor, childCtor, SubclassType.INHERITS);
        
        assertEquals(parentCtor.getPrototype(), childCtor.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testGetClassesDefinedByCallInheritsDeprecated() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        Node subclass = new Node(Token.NAME, "SubClass");
        Node superclass = new Node(Token.NAME, "SuperClass");
        callName.addChildToBack(subclass);
        callName.addChildToBack(new Node(Token.STRING, "inherits"));
        call.addChildToBack(callName);
        call.addChildToBack(superclass);
        
        SubclassRelationship result = convention.getClassesDefinedByCall(call);
        
        assertNotNull(result);
        assertEquals(subclass, result.subclass);
        assertEquals(superclass, result.superclass);
        assertEquals(SubclassType.INHERITS, result.type);
    }

    @Test
    public void testGetClassesDefinedByCallGoogInherits() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.inherits");
        Node subclass = new Node(Token.NAME, "SubClass");
        Node superclass = new Node(Token.NAME, "SuperClass");
        call.addChildToBack(callName);
        call.addChildToBack(subclass);
        call.addChildToBack(superclass);
        
        SubclassRelationship result = convention.getClassesDefinedByCall(call);
        
        assertNotNull(result);
        assertEquals(subclass, result.subclass);
        assertEquals(superclass, result.superclass);
        assertEquals(SubclassType.INHERITS, result.type);
    }

    @Test
    public void testGetClassesDefinedByCallMixin() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        Node subclass = new Node(Token.NAME, "SubClass");
        Node superclass = new Node(Token.NAME, "SuperClass");
        Node prototype = new Node(Token.GETPROP);
        prototype.addChildToBack(new Node(Token.NAME, "SuperClass"));
        prototype.addChildToBack(new Node(Token.STRING, "prototype"));
        
        callName.addChildToBack(subclass);
        callName.addChildToBack(new Node(Token.STRING, "mixin"));
        call.addChildToBack(callName);
        call.addChildToBack(prototype);
        
        SubclassRelationship result = convention.getClassesDefinedByCall(call);
        
        assertNotNull(result);
        assertEquals(subclass, result.subclass);
        assertEquals(prototype, result.superclass);
        assertEquals(SubclassType.MIXIN, result.type);
    }

    @Test
    public void testGetClassesDefinedByCallNullType() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "someOther");
        call.addChildToBack(callName);
        
        assertNull(convention.getClassesDefinedByCall(call));
    }

    @Test
    public void testGetClassesDefinedByCallWrongChildCount() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.inherits");
        call.addChildToBack(callName);
        call.addChildToBack(new Node(Token.NAME, "A"));
        call.addChildToBack(new Node(Token.NAME, "B"));
        call.addChildToBack(new Node(Token.NAME, "C"));
        
        assertNull(convention.getClassesDefinedByCall(call));
    }

    @Test
    public void testGetClassesDefinedByCallMixinNonPrototype() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        Node subclass = new Node(Token.NAME, "SubClass");
        Node superclass = new Node(Token.NAME, "SuperClass");
        
        callName.addChildToBack(subclass);
        callName.addChildToBack(new Node(Token.STRING, "mixin"));
        call.addChildToBack(callName);
        call.addChildToBack(superclass);
        
        SubclassRelationship result = convention.getClassesDefinedByCall(call);
        
        assertNull(result);
    }

    @Test
    public void testExtractClassNameIfGoogProvide() {
        Node node = new Node(Token.STRING, "foo.bar");
        Node parent = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.addChildToBack(new Node(Token.NAME, "goog"));
        callName.addChildToBack(new Node(Token.STRING, "provide"));
        call.addChildToBack(callName);
        call.addChildToBack(new Node(Token.STRING, "foo.bar"));
        parent.addChildToBack(call);
        
        String result = convention.extractClassNameIfProvide(node, parent);
        
        assertEquals("foo.bar", result);
    }

    @Test
    public void testExtractClassNameIfGoogRequire() {
        Node node = new Node(Token.STRING, "foo.bar");
        Node parent = new Node(Token.EXPR_RESULT);
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.addChildToBack(new Node(Token.NAME, "goog"));
        callName.addChildToBack(new Node(Token.STRING, "require"));
        call.addChildToBack(callName);
        call.addChildToBack(new Node(Token.STRING, "foo.bar"));
        parent.addChildToBack(call);
        
        String result = convention.extractClassNameIfRequire(node, parent);
        
        assertEquals("foo.bar", result);
    }

    @Test
    public void testGetExportPropertyFunction() {
        assertEquals("goog.exportProperty", convention.getExportPropertyFunction());
    }

    @Test
    public void testGetExportSymbolFunction() {
        assertEquals("goog.exportSymbol", convention.getExportSymbolFunction());
    }

    @Test
    public void testIdentifyTypeDeclarationCall() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.addDependency");
        call.addChildToBack(callName);
        Node numNode = new Node(Token.NUMBER, 1);
        call.addChildToBack(numNode);
        Node typeArray = new Node(Token.ARRAYLIT);
        typeArray.addChildToBack(new Node(Token.STRING, "test.Type"));
        call.addChildToBack(typeArray);
        
        List<String> result = convention.identifyTypeDeclarationCall(call);
        
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("test.Type", result.get(0));
    }

    @Test
    public void testIdentifyTypeDeclarationCallEmptyArray() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.addDependency");
        call.addChildToBack(callName);
        Node numNode = new Node(Token.NUMBER, 1);
        call.addChildToBack(numNode);
        Node typeArray = new Node(Token.ARRAYLIT);
        call.addChildToBack(typeArray);
        
        List<String> result = convention.identifyTypeDeclarationCall(call);
        
        assertEquals(0, result.size());
    }

    @Test
    public void testGetAbstractMethodName() {
        assertEquals("goog.abstractMethod", convention.getAbstractMethodName());
    }

    @Test
    public void testGetSingletonGetterClassNameValid() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.addSingletonGetter");
        call.addChildToBack(callName);
        Node type = new Node(Token.NAME, "Foo");
        call.addChildToBack(type);
        call.addChildToBack(new Node(Token.NAME, "arg2"));
        
        String result = convention.getSingletonGetterClassName(call);
        
        assertEquals("Foo", result);
    }

    @Test
    public void testGetSingletonGetterClassNameInvalid() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.addSomething");
        call.addChildToBack(callName);
        call.addChildToBack(new Node(Token.NAME, "Foo"));
        call.addChildToBack(new Node(Token.NAME, "arg2"));
        
        assertNull(convention.getSingletonGetterClassName(call));
    }

    @Test
    public void testIsPropertyTestFunctionValid() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.isObject");
        call.addChildToBack(callName);
        
        assertTrue(convention.isPropertyTestFunction(call));
    }

    @Test
    public void testIsPropertyTestFunctionInvalid() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.isWhatever");
        call.addChildToBack(callName);
        
        assertTrue(!convention.isPropertyTestFunction(call));
    }

    @Test
    public void testGetObjectLiteralCastValid() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.reflect.object");
        call.addChildToBack(callName);
        Node typeNode = new Node(Token.NAME, "Foo");
        call.addChildToBack(typeNode);
        Node objectLit = new Node(Token.OBJECTLIT);
        call.addChildToBack(objectLit);
        
        ObjectLiteralCast result = convention.getObjectLiteralCast(null, call);
        
        assertNotNull(result);
        assertEquals("Foo", result.typeName);
        assertSame(objectLit, result.objectNode);
    }

    @Test
    public void testGetObjectLiteralCastNullType() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.GETPROP);
        callName.setQualifiedName("goog.reflect.object");
        call.addChildToBack(callName);
        Node objectLit = new Node(Token.OBJECTLIT);
        call.addChildToBack(objectLit);
        
        ObjectLiteralCast result = convention.getObjectLiteralCast(null, call);
        
        assertNull(result);
    }

    @Test
    public void testGetObjectLiteralCastInvalidCall() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.reflect.notObject");
        call.addChildToBack(callName);
        call.addChildToBack(new Node(Token.NAME, "Foo"));
        call.addChildToBack(new Node(Token.OBJECTLIT));
        
        ObjectLiteralCast result = convention.getObjectLiteralCast(null, call);
        
        assertNull(result);
    }

    @Test
    public void testDescribeFunctionBind() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "goog.bind");
        call.addChildToBack(callName);
        Node fn = new Node(Token.NAME, "fn");
        call.addChildToBack(fn);
        Node thisValue = new Node(Token.THIS);
        call.addChildToBack(thisValue);
        Node param = new Node(Token.NAME, "arg");
        call.addChildToBack(param);
        
        Bind result = convention.describeFunctionBind(call);
        
        assertNotNull(result);
        assertEquals(fn, result.fn);
        assertEquals(thisValue, result.thisValue);
    }

    @Test
    public void testDescribeFunctionBindNoMatch() {
        Node call = new Node(Token.CALL);
        Node callName = new Node(Token.NAME, "foo");
        call.addChildToBack(callName);
        
        Bind result = convention.describeFunctionBind(call);
        
        assertNull(result);
    }

    @Test
    public void testSafeNextNull() {
        assertNull(new ClosureCodingConvention().describeFunctionBind(new Node(Token.CALL)));
    }
}