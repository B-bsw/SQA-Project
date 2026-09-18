package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.ArrayList;
import java.util.List;

public class GlobalNamespaceTest {

  @Test
  public void constructor_givenNullCompilerAndRoots_shouldInitializeProperly() {
    // Arrange & Act
    GlobalNamespace gn1 = new GlobalNamespace(null, null);
    GlobalNamespace gn2 = new GlobalNamespace(null, null, null);

    // Assert
    Assert.assertNotNull(gn1);
    Assert.assertNotNull(gn2);
  }

  @Test
  public void isSet_givenVariousRefTypes_shouldReturnExpectedBoolean() {
    // Arrange
    GlobalNamespace.Ref setGlobal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref setLocal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref aliasGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref callGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);
    GlobalNamespace.Ref protoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);

    // Act & Assert
    Assert.assertTrue(setGlobal.isSet());
    Assert.assertTrue(setLocal.isSet());
    Assert.assertFalse(directGet.isSet());
    Assert.assertFalse(aliasGet.isSet());
    Assert.assertFalse(callGet.isSet());
    Assert.assertFalse(protoGet.isSet());
  }

  @Test
  public void cloneAndReclassify_givenRef_shouldPreservePropertiesAndChangeType() {
    // Arrange
    GlobalNamespace.Ref original = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);

    // Act
    GlobalNamespace.Ref cloned = original.cloneAndReclassify(GlobalNamespace.Ref.Type.CALL_GET);

    // Assert
    Assert.assertEquals(GlobalNamespace.Ref.Type.CALL_GET, cloned.type);
    Assert.assertEquals(original.sourceName, cloned.sourceName);
    Assert.assertEquals(original.node, cloned.node);
    Assert.assertEquals(original.scope, cloned.scope);
    Assert.assertEquals(original.module, cloned.module);
  }

  @Test
  public void markTwins_givenAliasingGetAndSetFromGlobal_shouldLinkBothRefs() {
    // Arrange
    GlobalNamespace.Ref getRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);

    // Act
    GlobalNamespace.Ref.markTwins(getRef, setRef);

    // Assert
    Assert.assertSame(setRef, getRef.getTwin());
    Assert.assertSame(getRef, setRef.getTwin());
  }

  @Test
  public void markTwins_givenSetFromLocalAndAliasingGet_shouldLinkBothRefs() {
    // Arrange
    GlobalNamespace.Ref setRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref getRef = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

    // Act
    GlobalNamespace.Ref.markTwins(setRef, getRef);

    // Assert
    Assert.assertSame(getRef, setRef.getTwin());
    Assert.assertSame(setRef, getRef.getTwin());
  }

  @Test(expected = IllegalArgumentException.class)
  public void markTwins_givenTwoGetsWithoutSet_shouldThrowException() {
    // Arrange
    GlobalNamespace.Ref get1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref get2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);

    // Act
    GlobalNamespace.Ref.markTwins(get1, get2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void markTwins_givenTwoSetsWithoutAliasingGet_shouldThrowException() {
    // Arrange
    GlobalNamespace.Ref set1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref set2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);

    // Act
    GlobalNamespace.Ref.markTwins(set1, set2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void markTwins_givenDirectGetAndSetFromGlobal_shouldThrowException() {
    // Arrange
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref setGlobal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);

    // Act
    GlobalNamespace.Ref.markTwins(directGet, setGlobal);
  }

  @Test
  public void fullName_givenRootAndDescendantNames_shouldReturnDottedNotation() {
    // Arrange
    GlobalNamespace.Name root = new GlobalNamespace.Name("foo", null, false);
    GlobalNamespace.Name bar = root.addProperty("bar", false);
    GlobalNamespace.Name baz = bar.addProperty("baz", false);

    // Act & Assert
    Assert.assertEquals("foo", root.fullName());
    Assert.assertEquals("foo.bar", bar.fullName());
    Assert.assertEquals("foo.bar.baz", baz.fullName());
  }

  @Test
  public void isSimpleName_givenRootAndChildNames_shouldIdentifyCorrectly() {
    // Arrange
    GlobalNamespace.Name root = new GlobalNamespace.Name("root", null, false);
    GlobalNamespace.Name child = root.addProperty("child", false);

    // Act & Assert
    Assert.assertTrue(root.isSimpleName());
    Assert.assertFalse(child.isSimpleName());
  }

  @Test
  public void toString_givenName_shouldContainAllCountersAndFullName() {
    // Arrange
    GlobalNamespace.Name root = new GlobalNamespace.Name("myVar", null, false);
    root.type = GlobalNamespace.Name.Type.OTHER;

    // Act
    String representation = root.toString();

    // Assert
    Assert.assertEquals("myVar (OTHER): globalSets=0, localSets=0, totalGets=0, aliasingGets=0, callGets=0", representation);
  }

  @Test
  public void setIsClassOrEnum_givenHierarchy_shouldMarkAncestorsDescendantFlag() {
    // Arrange
    GlobalNamespace.Name root = new GlobalNamespace.Name("Root", null, false);
    GlobalNamespace.Name middle = root.addProperty("Middle", false);
    GlobalNamespace.Name leaf = middle.addProperty("Leaf", false);

    // Act
    leaf.setIsClassOrEnum();

    // Assert
    middle.type = GlobalNamespace.Name.Type.OBJECTLIT;
    root.type = GlobalNamespace.Name.Type.OBJECTLIT;
    Assert.assertTrue(middle.isNamespace());
    Assert.assertTrue(root.isNamespace());

    middle.type = GlobalNamespace.Name.Type.OTHER;
    Assert.assertFalse(middle.isNamespace());
  }

  @Test
  public void isNamespace_givenNoClassOrEnumDescendant_shouldReturnFalse() {
    // Arrange
    GlobalNamespace.Name root = new GlobalNamespace.Name("Root", null, false);
    root.type = GlobalNamespace.Name.Type.OBJECTLIT;

    // Act & Assert
    Assert.assertFalse(root.isNamespace());
  }

  @Test
  public void needsToBeStubbed_givenDifferentSetCounts_shouldVerifyLogic() {
    // Arrange
    GlobalNamespace.Name name1 = new GlobalNamespace.Name("n1", null, false);
    name1.globalSets = 0;
    name1.localSets = 2;

    GlobalNamespace.Name name2 = new GlobalNamespace.Name("n2", null, false);
    name2.globalSets = 1;
    name2.localSets = 2;

    GlobalNamespace.Name name3 = new GlobalNamespace.Name("n3", null, false);
    name3.globalSets = 0;
    name3.localSets = 0;

    // Act & Assert
    Assert.assertTrue(name1.needsToBeStubbed());
    Assert.assertFalse(name2.needsToBeStubbed());
    Assert.assertFalse(name3.needsToBeStubbed());
  }

  @Test
  public void addRef_givenAllRefTypes_shouldUpdateCountersAccurately() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("x", null, false);

    GlobalNamespace.Ref setGlobal1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref setGlobal2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref setLocal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref directGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref protoGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);
    GlobalNamespace.Ref aliasGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref callGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);

    // Act & Assert - First SET_FROM_GLOBAL sets declaration
    name.addRef(setGlobal1);
    Assert.assertSame(setGlobal1, name.declaration);
    Assert.assertEquals(1, name.globalSets);
    Assert.assertNull(name.refs);

    // Second SET_FROM_GLOBAL goes into refs
    name.addRef(setGlobal2);
    Assert.assertSame(setGlobal1, name.declaration);
    Assert.assertEquals(2, name.globalSets);
    Assert.assertEquals(1, name.refs.size());

    // SET_FROM_LOCAL
    name.addRef(setLocal);
    Assert.assertEquals(1, name.localSets);

    // DIRECT_GET
    name.addRef(directGet);
    Assert.assertEquals(1, name.totalGets);

    // PROTOTYPE_GET
    name.addRef(protoGet);
    Assert.assertEquals(2, name.totalGets);

    // ALIASING_GET
    name.addRef(aliasGet);
    Assert.assertEquals(1, name.aliasingGets);
    Assert.assertEquals(3, name.totalGets);

    // CALL_GET
    name.addRef(callGet);
    Assert.assertEquals(1, name.callGets);
    Assert.assertEquals(4, name.totalGets);
  }

  @Test
  public void addRef_givenDocInfoInVarParentFirstChild_shouldExtractDocInfo() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("v", null, false);
    Node varNode = new Node(Token.VAR);
    Node nameNode = Node.newString(Token.NAME, "v");
    varNode.addChildToBack(nameNode);
    JSDocInfo info = new JSDocInfo();
    varNode.setJSDocInfo(info);

    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    ref.node = nameNode;

    // Act
    name.addRef(ref);

    // Assert
    Assert.assertSame(ref, name.declaration);
    Assert.assertSame(info, name.docInfo);
  }

  @Test
  public void addRef_givenDocInfoInVarParentSecondChild_shouldExtractNodeDocInfo() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("second", null, false);
    Node varNode = new Node(Token.VAR);
    Node first = Node.newString(Token.NAME, "first");
    Node second = Node.newString(Token.NAME, "second");
    varNode.addChildToBack(first);
    varNode.addChildToBack(second);
    JSDocInfo info = new JSDocInfo();
    second.setJSDocInfo(info);

    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    ref.node = second;

    // Act
    name.addRef(ref);

    // Assert
    Assert.assertSame(ref, name.declaration);
    Assert.assertSame(info, name.docInfo);
  }

  @Test
  public void addRef_givenDocInfoInAssignParent_shouldExtractAssignDocInfo() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("a", null, false);
    Node assignNode = new Node(Token.ASSIGN);
    Node target = Node.newString(Token.NAME, "a");
    assignNode.addChildToBack(target);
    JSDocInfo info = new JSDocInfo();
    assignNode.setJSDocInfo(info);

    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    ref.node = target;

    // Act
    name.addRef(ref);

    // Assert
    Assert.assertSame(info, name.docInfo);
  }

  @Test
  public void addRef_givenDocInfoInFunctionParent_shouldExtractFunctionDocInfo() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("fn", null, false);
    Node fnNode = new Node(Token.FUNCTION);
    Node fnName = Node.newString(Token.NAME, "fn");
    fnNode.addChildToBack(fnName);
    JSDocInfo info = new JSDocInfo();
    fnNode.setJSDocInfo(info);

    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    ref.node = fnName;

    // Act
    name.addRef(ref);

    // Assert
    Assert.assertSame(info, name.docInfo);
  }

  @Test
  public void addRef_givenUnrecognizedParent_shouldLeaveDocInfoNull() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("expr", null, false);
    Node exprNode = new Node(Token.EXPR_RESULT);
    Node target = Node.newString(Token.NAME, "expr");
    exprNode.addChildToBack(target);

    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    ref.node = target;

    // Act
    name.addRef(ref);

    // Assert
    Assert.assertNull(name.docInfo);
  }

  @Test
  public void removeRef_givenDeclarationRemovedWhenSecondaryGlobalSetExists_shouldPromoteSecondaryRef() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("decPromote", null, false);
    GlobalNamespace.Ref decl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref secondary = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(decl);
    name.addRef(secondary);
    Assert.assertEquals(2, name.globalSets);
    Assert.assertSame(decl, name.declaration);
    Assert.assertEquals(1, name.refs.size());

    // Act
    name.removeRef(decl);

    // Assert
    Assert.assertSame(secondary, name.declaration);
    Assert.assertEquals(1, name.globalSets);
    Assert.assertEquals(0, name.refs.size());
  }

  @Test
  public void removeRef_givenDeclarationRemovedWhenOnlyLocalSetExists_shouldClearDeclaration() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("decClear", null, false);
    GlobalNamespace.Ref decl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref local = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    name.addRef(decl);
    name.addRef(local);

    // Act
    name.removeRef(decl);

    // Assert
    Assert.assertNull(name.declaration);
    Assert.assertEquals(0, name.globalSets);
    Assert.assertEquals(1, name.localSets);
    Assert.assertEquals(1, name.refs.size());
  }

  @Test
  public void removeRef_givenAllSecondaryRefTypes_shouldDecrementCountersAccurately() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("removal", null, false);
    GlobalNamespace.Ref decl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    GlobalNamespace.Ref local = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
    GlobalNamespace.Ref direct = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
    GlobalNamespace.Ref proto = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.PROTOTYPE_GET);
    GlobalNamespace.Ref alias = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);
    GlobalNamespace.Ref call = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.CALL_GET);

    name.addRef(decl);
    name.addRef(local);
    name.addRef(direct);
    name.addRef(proto);
    name.addRef(alias);
    name.addRef(call);

    // Act & Assert
    name.removeRef(local);
    Assert.assertEquals(0, name.localSets);

    name.removeRef(direct);
    Assert.assertEquals(3, name.totalGets);

    name.removeRef(proto);
    Assert.assertEquals(2, name.totalGets);

    name.removeRef(alias);
    Assert.assertEquals(0, name.aliasingGets);
    Assert.assertEquals(1, name.totalGets);

    name.removeRef(call);
    Assert.assertEquals(0, name.callGets);
    Assert.assertEquals(0, name.totalGets);
  }

  @Test
  public void removeRef_givenUnknownRef_shouldDoNothing() {
    // Arrange
    GlobalNamespace.Name name = new GlobalNamespace.Name("noop", null, false);
    GlobalNamespace.Ref decl = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    name.addRef(decl);
    GlobalNamespace.Ref unadded = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);

    // Act
    name.removeRef(unadded);

    // Assert
    Assert.assertEquals(1, name.globalSets);
    Assert.assertEquals(0, name.localSets);
    Assert.assertSame(decl, name.declaration);
  }

  @Test
  public void canCollapseUnannotatedChildNames_givenDifferentProperties_shouldVerifyAllBranches() {
    // 1. Type is OTHER -> false
    GlobalNamespace.Name otherName = new GlobalNamespace.Name("other", null, false);
    otherName.type = GlobalNamespace.Name.Type.OTHER;
    otherName.globalSets = 1;
    otherName.localSets = 0;
    Assert.assertFalse(otherName.canCollapseUnannotatedChildNames());

    // 2. globalSets != 1 -> false
    GlobalNamespace.Name globalSetZero = new GlobalNamespace.Name("zeroGlobal", null, false);
    globalSetZero.type = GlobalNamespace.Name.Type.OBJECTLIT;
    globalSetZero.globalSets = 0;
    globalSetZero.localSets = 0;
    Assert.assertFalse(globalSetZero.canCollapseUnannotatedChildNames());

    // 3. localSets != 0 -> false
    GlobalNamespace.Name localSetNonZero = new GlobalNamespace.Name("hasLocal", null, false);
    localSetNonZero.type = GlobalNamespace.Name.Type.OBJECTLIT;
    localSetNonZero.globalSets = 1;
    localSetNonZero.localSets = 1;
    Assert.assertFalse(localSetNonZero.canCollapseUnannotatedChildNames());

    // 4. isClassOrEnum -> true
    GlobalNamespace.Name classEnum = new GlobalNamespace.Name("classEnum", null, false);
    classEnum.type = GlobalNamespace.Name.Type.OBJECTLIT;
    classEnum.globalSets = 1;
    classEnum.localSets = 0;
    classEnum.setIsClassOrEnum();
    Assert.assertTrue(classEnum.canCollapseUnannotatedChildNames());

    // 5. FUNCTION type without aliasing gets, parent == null -> true
    GlobalNamespace.Name fnName = new GlobalNamespace.Name("fn", null, false);
    fnName.type = GlobalNamespace.Name.Type.FUNCTION;
    fnName.globalSets = 1;
    fnName.localSets = 0;
    Assert.assertTrue(fnName.canCollapseUnannotatedChildNames());

    // 6. OBJECTLIT type with aliasing gets > 0 -> false
    GlobalNamespace.Name objAliased = new GlobalNamespace.Name("objAliased", null, false);
    objAliased.type = GlobalNamespace.Name.Type.OBJECTLIT;
    objAliased.globalSets = 1;
    objAliased.localSets = 0;
    objAliased.aliasingGets = 1;
    Assert.assertFalse(objAliased.canCollapseUnannotatedChildNames());

    // 7. Child delegating to parent: parent can collapse -> true
    GlobalNamespace.Name validParent = new GlobalNamespace.Name("p", null, false);
    validParent.type = GlobalNamespace.Name.Type.OBJECTLIT;
    validParent.globalSets = 1;
    validParent.localSets = 0;

    GlobalNamespace.Name childOfValid = validParent.addProperty("c", false);
    childOfValid.type = GlobalNamespace.Name.Type.OBJECTLIT;
    childOfValid.globalSets = 1;
    childOfValid.localSets = 0;
    Assert.assertTrue(childOfValid.canCollapseUnannotatedChildNames());

    // 8. Child delegating to parent: parent cannot collapse -> false
    validParent.globalSets = 2; // invalidate parent
    Assert.assertFalse(childOfValid.canCollapseUnannotatedChildNames());
  }

  @Test
  public void canCollapse_givenDifferentStates_shouldVerifyAllBranches() {
    // 1. inExterns -> false
    GlobalNamespace.Name externName = new GlobalNamespace.Name("ext", null, true);
    externName.setIsClassOrEnum();
    Assert.assertFalse(externName.canCollapse());

    // 2. !inExterns and isClassOrEnum -> true
    GlobalNamespace.Name classEnum = new GlobalNamespace.Name("ce", null, false);
    classEnum.setIsClassOrEnum();
    Assert.assertTrue(classEnum.canCollapse());

    // 3. !inExterns, !isClassOrEnum, root, sets > 0 -> true
    GlobalNamespace.Name rootWithGlobalSet = new GlobalNamespace.Name("r1", null, false);
    rootWithGlobalSet.globalSets = 1;
    Assert.assertTrue(rootWithGlobalSet.canCollapse());

    GlobalNamespace.Name rootWithLocalSet = new GlobalNamespace.Name("r2", null, false);
    rootWithLocalSet.localSets = 1;
    Assert.assertTrue(rootWithLocalSet.canCollapse());

    // 4. !inExterns, !isClassOrEnum, root, sets == 0 -> false
    GlobalNamespace.Name rootNoSet = new GlobalNamespace.Name("r3", null, false);
    Assert.assertFalse(rootNoSet.canCollapse());

    // 5. Child of valid parent with sets > 0 -> true
    GlobalNamespace.Name parent = new GlobalNamespace.Name("p", null, false);
    parent.type = GlobalNamespace.Name.Type.OBJECTLIT;
    parent.globalSets = 1;
    parent.localSets = 0;

    GlobalNamespace.Name child = parent.addProperty("child", false);
    child.globalSets = 1;
    Assert.assertTrue(child.canCollapse());

    // 6. Child of invalid parent with sets > 0 -> false
    parent.globalSets = 0;
    Assert.assertFalse(child.canCollapse());
  }

  @Test
  public void canEliminate_givenDifferentConfigurations_shouldVerifyAllBranches() {
    // 1. cannot collapse unannotated child names -> false
    GlobalNamespace.Name cannotCollapse = new GlobalNamespace.Name("nc", null, false);
    cannotCollapse.type = GlobalNamespace.Name.Type.OTHER;
    Assert.assertFalse(cannotCollapse.canEliminate());

    // 2. can collapse unannotated child names, but totalGets > 0 -> false
    GlobalNamespace.Name hasGets = new GlobalNamespace.Name("hg", null, false);
    hasGets.type = GlobalNamespace.Name.Type.OBJECTLIT;
    hasGets.globalSets = 1;
    hasGets.localSets = 0;
    hasGets.totalGets = 1;
    Assert.assertFalse(hasGets.canEliminate());

    // 3. can collapse, totalGets == 0, props == null -> true
    GlobalNamespace.Name eliminatable = new GlobalNamespace.Name("el", null, false);
    eliminatable.type = GlobalNamespace.Name.Type.OBJECTLIT;
    eliminatable.globalSets = 1;
    eliminatable.localSets = 0;
    eliminatable.totalGets = 0;
    Assert.assertTrue(eliminatable.canEliminate());

    // 4. props != null and all can collapse -> true
    GlobalNamespace.Name child1 = eliminatable.addProperty("c1", false);
    child1.globalSets = 1;
    Assert.assertTrue(eliminatable.canEliminate());

    // 5. props != null and one cannot collapse -> false
    GlobalNamespace.Name child2 = eliminatable.addProperty("c2", false);
    child2.globalSets = 0; // cannot collapse
    Assert.assertFalse(eliminatable.canEliminate());
  }
}