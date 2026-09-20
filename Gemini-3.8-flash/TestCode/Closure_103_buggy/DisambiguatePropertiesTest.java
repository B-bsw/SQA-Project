package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Multimap;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.NamedType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.UnionType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DisambiguatePropertiesTest {

  private TestCompiler compiler;
  private JSTypeRegistry registry;

  private static class FakeTypeValidator extends TypeValidator {
    private final List<TypeMismatch> mismatches;

    public FakeTypeValidator(AbstractCompiler compiler) {
      super(compiler);
      this.mismatches = new ArrayList<TypeMismatch>();
    }

    @Override
    public Iterable<TypeMismatch> getMismatches() {
      return this.mismatches;
    }

    public void addMismatch(TypeMismatch mismatch) {
      this.mismatches.add(mismatch);
    }
  }

  private static class TestCompiler extends Compiler {
    private final JSTypeRegistry typeRegistry;
    private final FakeTypeValidator typeValidator;
    private int codeChanges;

    public TestCompiler(JSTypeRegistry registry) {
      this.typeRegistry = registry;
      this.typeValidator = new FakeTypeValidator(this);
      this.codeChanges = 0;
    }

    @Override
    public JSTypeRegistry getTypeRegistry() {
      return this.typeRegistry;
    }

    @Override
    public TypeValidator getTypeValidator() {
      return this.typeValidator;
    }

    public FakeTypeValidator getFakeTypeValidator() {
      return this.typeValidator;
    }

    @Override
    public CodingConvention getCodingConvention() {
      return new DefaultCodingConvention();
    }

    @Override
    public void reportCodeChange() {
      this.codeChanges++;
    }

    public int getCodeChanges() {
      return this.codeChanges;
    }
  }

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter(), true);
    compiler = new TestCompiler(registry);
  }

  private Node createStringNode(String value) {
    Node node = new Node(Token.STRING);
    node.setString(value);
    return node;
  }

  private Node createGetPropNode(Node target, String propName) {
    Node propNode = createStringNode(propName);
    Node getProp = new Node(Token.GETPROP, target, propNode);
    return getProp;
  }

  @Test
  public void forJSTypeSystem_givenValidCompiler_shouldInstantiatePass() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    Assert.assertNotNull(pass);
  }

  @Test
  public void forConcreteTypeSystem_givenValidTightenTypes_shouldInstantiatePass() {
    TightenTypes tt = new TightenTypes(compiler);
    DisambiguateProperties<ConcreteType> pass =
        DisambiguateProperties.forConcreteTypeSystem(compiler, tt);
    Assert.assertNotNull(pass);
  }

  @Test
  public void getProperty_givenNewAndExistingNames_shouldReturnCachedInstance() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop1 = pass.getProperty("propA");
    DisambiguateProperties<JSType>.Property prop2 = pass.getProperty("propA");
    DisambiguateProperties<JSType>.Property prop3 = pass.getProperty("propB");

    Assert.assertNotNull(prop1);
    Assert.assertSame(prop1, prop2);
    Assert.assertNotSame(prop1, prop3);
    Assert.assertEquals("propA", prop1.name);
    Assert.assertEquals("propB", prop3.name);
  }

  @Test
  public void property_invalidate_shouldMarkSkippedAndClearTypes() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("prop");

    Assert.assertNotNull(prop.getTypes());
    Assert.assertFalse(prop.skipRenaming);

    boolean changedFirst = prop.invalidate();
    Assert.assertTrue(changedFirst);
    Assert.assertTrue(prop.skipRenaming);

    boolean changedSecond = prop.invalidate();
    Assert.assertFalse(changedSecond);
  }

  @Test(expected = IllegalStateException.class)
  public void property_addType_givenPropertySkipped_shouldThrowException() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("skippedProp");
    prop.invalidate();

    FunctionType fn = registry.createConstructorType("Foo", null, null, null, null);
    ObjectType instanceType = fn.getInstanceType();
    prop.addType(instanceType, instanceType, null);
  }

  @Test
  public void property_addType_givenInvalidatingTop_shouldInvalidateAndReturnFalse() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("testProp");
    JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);

    boolean result = prop.addType(allType, allType, null);
    Assert.assertFalse(result);
    Assert.assertTrue(prop.skipRenaming);
  }

  @Test
  public void property_addType_givenValidTypesWithRelated_shouldUnionTypes() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("testProp");

    FunctionType fn1 = registry.createConstructorType("Foo1", null, null, null, null);
    FunctionType fn2 = registry.createConstructorType("Foo2", null, null, null, null);
    ObjectType type1 = fn1.getInstanceType();
    ObjectType type2 = fn2.getInstanceType();

    boolean res1 = prop.addType(type1, type1, null);
    boolean res2 = prop.addType(type2, type2, type1);

    Assert.assertTrue(res1);
    Assert.assertTrue(res2);
    Assert.assertEquals(1, prop.getTypes().allEquivalenceClasses().size());
  }

  @Test
  public void property_scheduleRenaming_givenInvalidatingType_shouldInvalidate() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("prop");
    Node n = createStringNode("prop");

    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    boolean result = prop.scheduleRenaming(n, unknownType);

    Assert.assertFalse(result);
    Assert.assertTrue(prop.skipRenaming);
    Assert.assertTrue(prop.renameNodes.isEmpty());
  }

  @Test
  public void property_scheduleRenaming_givenValidType_shouldTrackNode() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("prop");
    Node n = createStringNode("prop");

    FunctionType fn = registry.createConstructorType("ValidFoo", null, null, null, null);
    ObjectType type = fn.getInstanceType();

    boolean result = prop.scheduleRenaming(n, type);
    Assert.assertTrue(result);
    Assert.assertFalse(prop.skipRenaming);
    Assert.assertTrue(prop.renameNodes.contains(n));
    Assert.assertEquals(type, prop.rootTypes.get(n));
  }

  @Test
  public void property_shouldRename_boundaryConditions() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("prop");

    Assert.assertFalse(prop.shouldRename());

    FunctionType fn1 = registry.createConstructorType("ClassA", null, null, null, null);
    FunctionType fn2 = registry.createConstructorType("ClassB", null, null, null, null);
    ObjectType type1 = fn1.getInstanceType();
    ObjectType type2 = fn2.getInstanceType();

    prop.getTypes().add(type1);
    Assert.assertFalse(prop.shouldRename());

    prop.getTypes().add(type2);
    Assert.assertTrue(prop.shouldRename());

    Assert.assertTrue(prop.shouldRename(type1));
    prop.typesToSkip.add(type1);
    Assert.assertFalse(prop.shouldRename(type1));

    prop.invalidate();
    Assert.assertFalse(prop.shouldRename());
    Assert.assertFalse(prop.shouldRename(type2));
  }

  @Test
  public void getTypeWithProperty_givenVariousTypes_shouldResolveCorrectly() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType nullResolved = pass.getTypeWithProperty("someProp", numberType);
    Assert.assertNull(nullResolved);

    FunctionType fn = registry.createConstructorType("CustomType", null, null, null, null);
    ObjectType instanceType = fn.getInstanceType();
    instanceType.defineDeclaredProperty(
        "customProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    JSType found = pass.getTypeWithProperty("customProp", instanceType);
    Assert.assertEquals(instanceType, found);

    JSType protoProp = pass.getTypeWithProperty("prototype", instanceType);
    Assert.assertNull(protoProp);
  }

  @Test
  public void process_givenEmptyExternsAndRoot_shouldCompleteGracefully() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);
    Assert.assertEquals(0, compiler.getCodeChanges());
  }

  @Test
  public void process_givenTypeMismatches_shouldAddInvalidatingTypes() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType fn1 = registry.createConstructorType("MismatchA", null, null, null, null);
    FunctionType fn2 = registry.createConstructorType("MismatchB", null, null, null, null);
    ObjectType typeA = fn1.getInstanceType();
    ObjectType typeB = fn2.getInstanceType();

    TypeValidator.TypeMismatch mismatch =
        new TypeValidator.TypeMismatch(new Node(Token.EMPTY), typeA, typeB, null);
    compiler.getFakeTypeValidator().addMismatch(mismatch);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("dummy");
    Assert.assertFalse(prop.addType(typeA, typeA, null));
    Assert.assertFalse(prop.addType(typeB, typeB, null));
  }

  @Test
  public void process_givenUnionTypeMismatch_shouldUnrollAlternates() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType fn1 = registry.createConstructorType("Alt1", null, null, null, null);
    FunctionType fn2 = registry.createConstructorType("Alt2", null, null, null, null);
    ObjectType type1 = fn1.getInstanceType();
    ObjectType type2 = fn2.getInstanceType();
    UnionType unionType = (UnionType) registry.createUnionType(type1, type2);

    TypeValidator.TypeMismatch mismatch =
        new TypeValidator.TypeMismatch(new Node(Token.EMPTY), unionType, type1, null);
    compiler.getFakeTypeValidator().addMismatch(mismatch);

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("dummy");
    Assert.assertFalse(prop.addType(type1, type1, null));
    Assert.assertFalse(prop.addType(type2, type2, null));
  }

  @Test
  public void process_givenExternGetProp_withInvalidatingType_shouldInvalidateProperty() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    Node externTarget = new Node(Token.NAME);
    externTarget.setString("x");
    externTarget.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));

    Node getProp = createGetPropNode(externTarget, "externProp");
    Node externs = new Node(Token.BLOCK, getProp);
    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("externProp");
    Assert.assertTrue(prop.skipRenaming);
  }

  @Test
  public void process_givenExternGetProp_withFunctionPrototype_shouldAddInstanceToSkip() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType fn = registry.createConstructorType("ExternFn", null, null, null, null);
    ObjectType protoType = fn.getPrototype();

    Node externTarget = new Node(Token.NAME);
    externTarget.setString("fnProto");
    externTarget.setJSType(protoType);

    Node getProp = createGetPropNode(externTarget, "sharedExtProp");
    Node externs = new Node(Token.BLOCK, getProp);
    Node root = new Node(Token.BLOCK);

    pass.process(externs, root);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("sharedExtProp");
    Assert.assertFalse(prop.skipRenaming);
    Assert.assertTrue(prop.typesToSkip.contains(fn.getInstanceType()));
  }

  @Test
  public void process_givenRenameableGetProp_shouldDisambiguateAcrossClasses() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType fnA = registry.createConstructorType("TypeFoo", null, null, null, null);
    ObjectType instanceA = fnA.getInstanceType();
    instanceA.defineDeclaredProperty(
        "display", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    FunctionType fnB = registry.createConstructorType("TypeBar", null, null, null, null);
    ObjectType instanceB = fnB.getInstanceType();
    instanceB.defineDeclaredProperty(
        "display", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);

    Node targetA = new Node(Token.NAME);
    targetA.setString("a");
    targetA.setJSType(instanceA);
    Node getPropA = createGetPropNode(targetA, "display");

    Node targetB = new Node(Token.NAME);
    targetB.setString("b");
    targetB.setJSType(instanceB);
    Node getPropB = createGetPropNode(targetB, "display");

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK, getPropA, getPropB);

    pass.process(externs, root);

    Assert.assertEquals(2, compiler.getCodeChanges());
    Assert.assertEquals("TypeFoo$display", getPropA.getLastChild().getString());
    Assert.assertEquals("TypeBar$display", getPropB.getLastChild().getString());
  }

  @Test
  public void process_givenObjectLitWithFunctionScope_shouldRenameProperties() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    RecordTypeBuilder b1 = new RecordTypeBuilder(registry);
    b1.addProperty("propVal", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    ObjectType rec1 = b1.build();

    RecordTypeBuilder b2 = new RecordTypeBuilder(registry);
    b2.addProperty("propVal", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    ObjectType rec2 = b2.build();

    Node key1 = createStringNode("propVal");
    Node val1 = new Node(Token.NUMBER);
    Node objLit1 = new Node(Token.OBJECTLIT, key1, val1);
    objLit1.setJSType(rec1);

    Node key2 = createStringNode("propVal");
    Node val2 = new Node(Token.NUMBER);
    Node objLit2 = new Node(Token.OBJECTLIT, key2, val2);
    objLit2.setJSType(rec2);

    Node fnNode = new Node(Token.FUNCTION, createStringNode("testFn"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK, objLit2));

    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK, objLit1, fnNode);

    pass.process(externs, root);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("propVal");
    Assert.assertNotNull(prop);
  }

  @Test
  public void renameProperties_givenAnonymousRecordType_shouldRetainOriginalPropertyName() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    RecordTypeBuilder b1 = new RecordTypeBuilder(registry);
    b1.addProperty("anonProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    ObjectType anonRecord1 = b1.build();

    FunctionType fn2 = registry.createConstructorType("NamedClazz", null, null, null, null);
    ObjectType instance2 = fn2.getInstanceType();
    instance2.defineDeclaredProperty(
        "anonProp", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    Node n1 = createStringNode("anonProp");
    Node n2 = createStringNode("anonProp");

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("anonProp");
    prop.scheduleRenaming(n1, anonRecord1);
    prop.scheduleRenaming(n2, instance2);

    prop.getTypes().add(anonRecord1);
    prop.getTypes().add(instance2);

    pass.renameProperties();

    Assert.assertEquals(1, compiler.getCodeChanges());
    Assert.assertEquals("anonProp", n1.getString());
    Assert.assertEquals("NamedClazz$anonProp", n2.getString());
  }

  @Test
  public void expandTypesToSkip_givenChainedSubTypes_shouldPropagateSkip() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    DisambiguateProperties<JSType>.Property prop = pass.getProperty("skipChainProp");

    FunctionType fnA = registry.createConstructorType("ParentClass", null, null, null, null);
    FunctionType fnB = registry.createConstructorType("ChildClass", null, null, null, null);
    ObjectType parentType = fnA.getInstanceType();
    ObjectType childType = fnB.getInstanceType();

    prop.getTypes().add(parentType);
    prop.getTypes().add(childType);
    prop.getTypes().union(parentType, childType);

    FunctionType fnC = registry.createConstructorType("OtherClass", null, null, null, null);
    ObjectType otherType = fnC.getInstanceType();
    prop.getTypes().add(otherType);

    prop.typesToSkip.add(childType);
    Assert.assertTrue(prop.shouldRename());

    prop.expandTypesToSkip();
    Assert.assertTrue(prop.typesToSkip.contains(parentType));
    Assert.assertTrue(prop.typesToSkip.contains(childType));
    Assert.assertFalse(prop.typesToSkip.contains(otherType));
  }

  @Test
  public void recordInterfaces_givenImplementedHierarchy_shouldLinkInterfaceProperties() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType ifaceType = registry.createInterfaceType("MyInterface", null);
    ObjectType ifaceInstance = ifaceType.getInstanceType();
    ifaceInstance.defineDeclaredProperty(
        "interfaceMethod", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    FunctionType implClass = registry.createConstructorType("MyImplementation", null, null, null, null);
    implClass.setImplementedInterfaces(ImmutableList.of(ifaceInstance));
    ObjectType implInstance = implClass.getInstanceType();
    implInstance.defineDeclaredProperty(
        "interfaceMethod", registry.getNativeType(JSTypeNative.STRING_TYPE), null);

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("interfaceMethod");
    prop.addType(implInstance, implInstance, null);

    Assert.assertTrue(prop.getTypes().elements().contains(ifaceInstance));
    Assert.assertTrue(prop.getTypes().elements().contains(implInstance));
    Assert.assertEquals(1, prop.getTypes().allEquivalenceClasses().size());
  }

  @Test
  public void getRenamedTypesForTesting_shouldExcludeSkippedTypes() {
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);

    FunctionType fn1 = registry.createConstructorType("RenamedA", null, null, null, null);
    FunctionType fn2 = registry.createConstructorType("RenamedB", null, null, null, null);
    ObjectType t1 = fn1.getInstanceType();
    ObjectType t2 = fn2.getInstanceType();

    DisambiguateProperties<JSType>.Property prop = pass.getProperty("testRenamedProp");
    prop.getTypes().add(t1);
    prop.getTypes().add(t2);

    Multimap<String, Collection<JSType>> resultBeforeSkip = pass.getRenamedTypesForTesting();
    Assert.assertEquals(2, resultBeforeSkip.get("testRenamedProp").size());

    prop.typesToSkip.add(t1);
    Multimap<String, Collection<JSType>> resultAfterSkip = pass.getRenamedTypesForTesting();
    Assert.assertEquals(1, resultAfterSkip.get("testRenamedProp").size());

    prop.invalidate();
    Multimap<String, Collection<JSType>> resultAfterInvalidate = pass.getRenamedTypesForTesting();
    Assert.assertTrue(resultAfterInvalidate.get("testRenamedProp").isEmpty());
  }
}