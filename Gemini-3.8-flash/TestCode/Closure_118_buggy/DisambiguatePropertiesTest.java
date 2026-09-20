package com.google.javascript.jscomp;

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DisambiguatePropertiesTest {

  private TestCompiler compiler;
  private JSTypeRegistry registry;

  private static class TestCompiler extends Compiler {
    private AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
    private JSTypeRegistry customRegistry;
    private TypeValidator customValidator;

    public TestCompiler() {
      super();
      this.customRegistry = new JSTypeRegistry(new SimpleErrorReporter());
      this.customValidator = new TypeValidator(this);
    }

    @Override
    public AbstractCompiler.LifeCycleStage getLifeCycleStage() {
      return this.stage;
    }

    @Override
    public void setLifeCycleStage(AbstractCompiler.LifeCycleStage stage) {
      this.stage = stage;
    }

    @Override
    public JSTypeRegistry getTypeRegistry() {
      return this.customRegistry;
    }

    @Override
    public TypeValidator getTypeValidator() {
      return this.customValidator;
    }
  }

  @Before
  public void setUp() {
    compiler = new TestCompiler();
    registry = compiler.getTypeRegistry();
  }

  @Test
  public void warnings_shouldHaveExpectedDiagnosticTypes() {
    Assert.assertNotNull(DisambiguateProperties.Warnings.INVALIDATION);
    Assert.assertNotNull(DisambiguateProperties.Warnings.INVALIDATION_ON_TYPE);
    Assert.assertEquals("JSC_INVALIDATION", DisambiguateProperties.Warnings.INVALIDATION.key);
    Assert.assertEquals("JSC_INVALIDATION_TYPE", DisambiguateProperties.Warnings.INVALIDATION_ON_TYPE.key);
  }

  @Test
  public void forJSTypeSystem_givenEmptyErrorMap_shouldCreateInstance() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Assert.assertNotNull(disambiguator);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void forJSTypeSystem_givenNonEmptyErrorMap_shouldCreateInstance() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("foo", CheckLevel.WARNING);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Assert.assertNotNull(disambiguator);
  }

  @Test
  public void forConcreteTypeSystem_givenTightenTypes_shouldCreateInstance() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    TightenTypes tt = new TightenTypes(compiler);
    DisambiguateProperties<ConcreteType> disambiguator =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt, propertiesToErrorFor);

    Assert.assertNotNull(disambiguator);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test(expected = IllegalStateException.class)
  public void process_givenUnnormalizedLifeCycle_shouldThrowException() {
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.RAW);
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);
  }

  @Test
  public void process_givenEmptyExternsAndRoot_shouldSucceed() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void process_givenTypeMismatches_shouldAddInvalidatingTypes() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("bar", CheckLevel.ERROR);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    ObjectType objTypeA = registry.createAnonymousObjectType();
    ObjectType objTypeB = registry.createAnonymousObjectType();
    JSError error = JSError.make("test.js", 1, 0, CheckLevel.ERROR,
        DisambiguateProperties.Warnings.INVALIDATION, "bar", "typeA", "node", "msg");

    compiler.getTypeValidator().registerMismatch(objTypeA, objTypeB, error);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void process_givenUnionAndEnumMismatches_shouldUnpackRecursively() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("val", CheckLevel.WARNING);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    ObjectType objType = registry.createAnonymousObjectType();
    JSType unionType = registry.createUnionType(objType, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    ObjectType enumType = registry.createEnumType("CustomEnum", null, objType);
    JSType enumElement = enumType.toMaybeEnumType().getElementsType();

    JSError error = JSError.make("test.js", 1, 0, CheckLevel.WARNING,
        DisambiguateProperties.Warnings.INVALIDATION, "val", "type", "node", "");

    compiler.getTypeValidator().registerMismatch(unionType, enumElement, error);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }

  @Test
  public void process_givenExternsGetProp_shouldSkipProperty() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node objNode = Node.newString(Token.NAME, "window");
    objNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    Node propNode = Node.newString(Token.STRING, "customProp");
    Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
    externs.addChildToBack(getPropNode);

    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void process_givenExternsInvalidatingType_shouldInvalidateProperty() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node objNode = Node.newString(Token.NAME, "unknownObj");
    objNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    Node propNode = Node.newString(Token.STRING, "invalProp");
    Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
    externs.addChildToBack(getPropNode);

    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void process_givenExternsPrototypeType_shouldTrackInstanceType() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType ctor = registry.createConstructorType("Foo", null, null, null);
    ObjectType proto = ctor.getPrototype();

    Node externs = new Node(Token.BLOCK);
    Node objNode = Node.newString(Token.NAME, "FooProto");
    objNode.setJSType(proto);
    Node propNode = Node.newString(Token.STRING, "protoField");
    Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
    externs.addChildToBack(getPropNode);

    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertTrue(disambiguator.getRenamedTypesForTesting().isEmpty());
  }

  @Test
  public void process_givenRootGetProp_shouldScheduleAndProcess() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType typeA = registry.createConstructorType("TypeA", null, null, null);
    ObjectType instA = typeA.getInstanceType();
    instA.defineDeclaredProperty("sharedProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node target = Node.newString(Token.NAME, "a");
    target.setJSType(instA);
    Node field = Node.newString(Token.STRING, "sharedProp");
    Node getProp = new Node(Token.GETPROP, target, field);
    root.addChildToBack(getProp);

    disambiguator.process(externs, root);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }

  @Test
  public void process_givenMultipleTypesSameProperty_shouldRenameProperty() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType typeA = registry.createConstructorType("TypeA", null, null, null);
    ObjectType instA = typeA.getInstanceType();
    instA.defineDeclaredProperty("foo", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    FunctionType typeB = registry.createConstructorType("TypeB", null, null, null);
    ObjectType instB = typeB.getInstanceType();
    instB.defineDeclaredProperty("foo", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node targetA = Node.newString(Token.NAME, "a");
    targetA.setJSType(instA);
    Node fieldA = Node.newString(Token.STRING, "foo");
    Node getPropA = new Node(Token.GETPROP, targetA, fieldA);
    root.addChildToBack(getPropA);

    Node targetB = Node.newString(Token.NAME, "b");
    targetB.setJSType(instB);
    Node fieldB = Node.newString(Token.STRING, "foo");
    Node getPropB = new Node(Token.GETPROP, targetB, fieldB);
    root.addChildToBack(getPropB);

    disambiguator.process(externs, root);

    Assert.assertFalse("foo".equals(fieldA.getString()));
    Assert.assertFalse("foo".equals(fieldB.getString()));
    Assert.assertNotEquals(fieldA.getString(), fieldB.getString());
  }

  @Test
  public void process_givenObjectLit_shouldScheduleAndProcessKeys() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node keyNode = Node.newString(Token.STRING_KEY, "propLit");
    keyNode.addChildToBack(Node.newNumber(1));
    Node objLit = new Node(Token.OBJECTLIT, keyNode);
    objLit.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
    root.addChildToBack(objLit);

    disambiguator.process(externs, root);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }

  @Test
  public void process_givenInvalidatingPropertyWithErrorReporting_shouldReportError() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("invalProp", CheckLevel.ERROR);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node target = Node.newString(Token.NAME, "unknownTarget");
    target.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    Node field = Node.newString(Token.STRING, "invalProp");
    Node getProp = new Node(Token.GETPROP, target, field);
    root.addChildToBack(getProp);

    disambiguator.process(externs, root);

    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void process_givenInvalidatingObjectLitWithErrorReporting_shouldReportError() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("litProp", CheckLevel.ERROR);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node keyNode = Node.newString(Token.STRING_KEY, "litProp");
    keyNode.addChildToBack(Node.newString("val"));
    Node objLit = new Node(Token.OBJECTLIT, keyNode);
    objLit.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    root.addChildToBack(objLit);

    disambiguator.process(externs, root);

    Assert.assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void process_givenThisObjectUnknown_shouldReportThisSuggestion() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("thisProp", CheckLevel.WARNING);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node thisNode = new Node(Token.THIS);
    thisNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    Node field = Node.newString(Token.STRING, "thisProp");
    Node getProp = new Node(Token.GETPROP, thisNode, field);
    root.addChildToBack(getProp);

    disambiguator.process(externs, root);

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void process_givenFunctionScopeTraversal_shouldEnterAndExitScope() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = Node.newString(Token.NAME, "myFunc");
    Node paramsNode = new Node(Token.PARAM_LIST);
    Node bodyNode = new Node(Token.BLOCK);

    FunctionType typeA = registry.createConstructorType("TypeA", null, null, null);
    ObjectType instA = typeA.getInstanceType();
    instA.defineDeclaredProperty("localProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    Node target = Node.newString(Token.NAME, "inst");
    target.setJSType(instA);
    Node field = Node.newString(Token.STRING, "localProp");
    Node getProp = new Node(Token.GETPROP, target, field);
    bodyNode.addChildToBack(getProp);

    fnNode.addChildToBack(nameNode);
    fnNode.addChildToBack(paramsNode);
    fnNode.addChildToBack(bodyNode);
    root.addChildToBack(fnNode);

    disambiguator.process(externs, root);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }

  @Test
  public void getTypeWithProperty_givenNullType_shouldReturnNull() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    JSType result = disambiguator.getTypeWithProperty("foo", null);
    Assert.assertNull(result);
  }

  @Test
  public void getTypeWithProperty_givenPrototypeField_shouldReturnNull() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType ctor = registry.createConstructorType("TypeFoo", null, null, null);
    JSType result = disambiguator.getTypeWithProperty("prototype", ctor.getInstanceType());
    Assert.assertNull(result);
  }

  @Test
  public void getTypeWithProperty_givenAutoboxableType_shouldFindOnObject() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    JSType stringPrimitive = registry.getNativeType(JSTypeNative.STRING_TYPE);
    JSType result = disambiguator.getTypeWithProperty("length", stringPrimitive);
    Assert.assertNotNull(result);
  }

  @Test
  public void getTypeWithProperty_givenEnumElementType_shouldCheckPrimitive() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    ObjectType objType = registry.createAnonymousObjectType();
    objType.defineDeclaredProperty("enumProp", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), null);
    ObjectType enumType = registry.createEnumType("MyEnum", null, objType);
    JSType enumElement = enumType.toMaybeEnumType().getElementsType();

    JSType result = disambiguator.getTypeWithProperty("enumProp", enumElement);
    Assert.assertNotNull(result);
  }

  @Test
  public void getTypeWithProperty_givenImplementedInterface_shouldFindOnTopInterface() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType iface = registry.createInterfaceType("IAction", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    ifaceInstance.defineDeclaredProperty("execute", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null);

    JSType result = disambiguator.getTypeWithProperty("execute", ifaceInstance);
    Assert.assertNotNull(result);
  }

  @Test
  public void process_withInterfaceImplementation_shouldRecordInterfaces() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType iface = registry.createInterfaceType("IWorker", null);
    ObjectType ifaceInstance = iface.getInstanceType();
    ifaceInstance.defineDeclaredProperty("work", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null);

    FunctionType ctor = registry.createConstructorType("WorkerImpl", null, null, null);
    ctor.getPrototype().defineDeclaredProperty("work", registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), null);
    java.util.List<ObjectType> ifaces = new java.util.ArrayList<ObjectType>();
    ifaces.add(ifaceInstance);
    ctor.setImplementedInterfaces(ifaces);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node target = Node.newString(Token.NAME, "worker");
    target.setJSType(ctor.getInstanceType());
    Node field = Node.newString(Token.STRING, "work");
    Node getProp = new Node(Token.GETPROP, target, field);
    root.addChildToBack(getProp);

    disambiguator.process(externs, root);
    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }

  @Test
  public void process_givenSkippedTypeInEquivalence_shouldReportWarningOnType() {
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    propertiesToErrorFor.put("bar", CheckLevel.WARNING);
    DisambiguateProperties<JSType> disambiguator =
        DisambiguateProperties.forJSTypeSystem(compiler, propertiesToErrorFor);

    FunctionType typeA = registry.createConstructorType("FooA", null, null, null);
    ObjectType instA = typeA.getInstanceType();
    instA.defineDeclaredProperty("bar", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    FunctionType typeB = registry.createConstructorType("FooB", null, null, null);
    ObjectType instB = typeB.getInstanceType();
    instB.defineDeclaredProperty("bar", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    Node externs = new Node(Token.BLOCK);
    Node externTarget = Node.newString(Token.NAME, "extA");
    externTarget.setJSType(instA);
    Node externField = Node.newString(Token.STRING, "bar");
    externs.addChildToBack(new Node(Token.GETPROP, externTarget, externField));

    Node root = new Node(Token.BLOCK);
    Node targetA = Node.newString(Token.NAME, "instA");
    targetA.setJSType(instA);
    Node fieldA = Node.newString(Token.STRING, "bar");
    root.addChildToBack(new Node(Token.GETPROP, targetA, fieldA));

    Node targetB = Node.newString(Token.NAME, "instB");
    targetB.setJSType(instB);
    Node fieldB = Node.newString(Token.STRING, "bar");
    root.addChildToBack(new Node(Token.GETPROP, targetB, fieldB));

    disambiguator.process(externs, root);

    Assert.assertTrue(compiler.getWarningCount() > 0);
  }

  @Test
  public void concreteTypeSystem_getTypeWithProperty_shouldHandleVariousConcreteTypes() {
    TightenTypes tt = new TightenTypes(compiler);
    Map<String, CheckLevel> propertiesToErrorFor = new HashMap<String, CheckLevel>();
    DisambiguateProperties<ConcreteType> disambiguator =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt, propertiesToErrorFor);

    ConcreteType noneType = ConcreteType.NONE;
    ConcreteType resultNone = disambiguator.getTypeWithProperty("testProp", noneType);
    Assert.assertNotNull(resultNone);

    ConcreteType allType = ConcreteType.ALL;
    ConcreteType resultAll = disambiguator.getTypeWithProperty("testProp", allType);
    Assert.assertNull(resultAll);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    disambiguator.process(externs, root);

    Assert.assertNotNull(disambiguator.getRenamedTypesForTesting());
  }
}