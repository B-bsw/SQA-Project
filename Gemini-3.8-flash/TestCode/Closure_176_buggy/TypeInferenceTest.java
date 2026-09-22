package com.google.javascript.jscomp;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Scope globalScope;
  private ReverseAbstractInterpreter reverseInterpreter;
  private Map<String, AssertionFunctionSpec> assertionMap;

  private static class DummyReverseAbstractInterpreter implements ReverseAbstractInterpreter {
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      return blindScope;
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    reverseInterpreter = new DummyReverseAbstractInterpreter();
    assertionMap = new HashMap<String, AssertionFunctionSpec>();
  }

  private TypeInference createTypeInference(Node functionNode, Scope scope) {
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, functionNode);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    return new TypeInference(compiler, cfg, reverseInterpreter, scope, assertionMap);
  }

  private Scope createFunctionScope(Node functionNode) {
    Node scriptRoot = new Node(Token.SCRIPT, functionNode);
    SyntacticScopeCreator scopeCreator = new SyntacticScopeCreator(compiler);
    globalScope = scopeCreator.createScope(scriptRoot, null);
    return scopeCreator.createScope(functionNode, globalScope);
  }

  @Test
  public void getBooleanOutcomes_givenTrueCondition_shouldEvaluateCorrectly() {
    BooleanLiteralSet left = BooleanLiteralSet.TRUE;
    BooleanLiteralSet right = BooleanLiteralSet.FALSE;
    BooleanLiteralSet outcome = TypeInference.getBooleanOutcomes(left, right, true);
    Assert.assertEquals(BooleanLiteralSet.FALSE, outcome);

    left = BooleanLiteralSet.BOTH;
    right = BooleanLiteralSet.EMPTY;
    outcome = TypeInference.getBooleanOutcomes(left, right, true);
    Assert.assertEquals(BooleanLiteralSet.FALSE, outcome);

    left = BooleanLiteralSet.FALSE;
    right = BooleanLiteralSet.TRUE;
    outcome = TypeInference.getBooleanOutcomes(left, right, true);
    Assert.assertEquals(BooleanLiteralSet.TRUE, outcome);
  }

  @Test
  public void getBooleanOutcomes_givenFalseCondition_shouldEvaluateCorrectly() {
    BooleanLiteralSet left = BooleanLiteralSet.TRUE;
    BooleanLiteralSet right = BooleanLiteralSet.FALSE;
    BooleanLiteralSet outcome = TypeInference.getBooleanOutcomes(left, right, false);
    Assert.assertEquals(BooleanLiteralSet.BOTH, outcome);

    left = BooleanLiteralSet.EMPTY;
    right = BooleanLiteralSet.TRUE;
    outcome = TypeInference.getBooleanOutcomes(left, right, false);
    Assert.assertEquals(BooleanLiteralSet.TRUE, outcome);
  }

  @Test
  public void initialAndEntryLattice_givenScope_shouldInitializeProperly() {
    Node fn = compiler.parseSyntheticCode("test", "function f(x) { return x; }").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);

    FlowScope entry = ti.createEntryLattice();
    FlowScope initial = ti.createInitialEstimateLattice();

    Assert.assertNotNull(entry);
    Assert.assertNotNull(initial);
    Assert.assertNotSame(entry, initial);
  }

  @Test
  public void flowThrough_givenBottomScope_shouldReturnBottomScope() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);

    FlowScope bottom = ti.createInitialEstimateLattice();
    Node expr = new Node(Token.EMPTY);
    FlowScope result = ti.flowThrough(expr, bottom);

    Assert.assertSame(bottom, result);
  }

  @Test
  public void flowThrough_givenBasicExpressions_shouldInferTypes() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node numNode = Node.newNumber(42.0);
    FlowScope s1 = ti.flowThrough(numNode, entry);
    Assert.assertNotNull(s1);

    Node strNode = Node.newString("hello");
    FlowScope s2 = ti.flowThrough(strNode, entry);
    Assert.assertNotNull(s2);

    Node posNode = new Node(Token.POS, Node.newNumber(1.0));
    ti.flowThrough(posNode, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), posNode.getJSType());

    Node negNode = new Node(Token.NEG, Node.newNumber(2.0));
    ti.flowThrough(negNode, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), negNode.getJSType());

    Node arrLit = new Node(Token.ARRAYLIT);
    ti.flowThrough(arrLit, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrLit.getJSType());

    Node typeOfNode = new Node(Token.TYPEOF, Node.newString("foo"));
    ti.flowThrough(typeOfNode, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), typeOfNode.getJSType());

    int[] boolTokens = new int[] {
      Token.DELPROP, Token.LT, Token.LE, Token.GT, Token.GE,
      Token.NOT, Token.EQ, Token.NE, Token.SHEQ, Token.SHNE,
      Token.INSTANCEOF, Token.IN
    };
    for (int i = 0; i < boolTokens.length; i++) {
      Node boolNode = new Node(boolTokens[i], Node.newNumber(1.0), Node.newNumber(2.0));
      ti.flowThrough(boolNode, entry);
      Assert.assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), boolNode.getJSType());
    }

    int[] numTokens = new int[] {
      Token.BITNOT, Token.INC, Token.DEC, Token.SUB, Token.MUL,
      Token.DIV, Token.MOD, Token.BITAND, Token.BITOR, Token.BITXOR,
      Token.LSH, Token.RSH, Token.URSH
    };
    for (int i = 0; i < numTokens.length; i++) {
      Node opNode = new Node(numTokens[i], Node.newNumber(1.0), Node.newNumber(2.0));
      ti.flowThrough(opNode, entry);
      Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), opNode.getJSType());
    }
  }

  @Test
  public void flowThrough_givenAddExpression_shouldInferTypes() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node addStrNum = new Node(Token.ADD, Node.newString("a"), Node.newNumber(1.0));
    addStrNum.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    addStrNum.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    ti.flowThrough(addStrNum, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addStrNum.getJSType());

    Node addNumNum = new Node(Token.ADD, Node.newNumber(2.0), Node.newNumber(3.0));
    addNumNum.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    addNumNum.getLastChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    ti.flowThrough(addNumNum, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), addNumNum.getJSType());

    Node addUnknown = new Node(Token.ADD, Node.newString("a"), Node.newString("b"));
    addUnknown.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    addUnknown.getLastChild().setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
    ti.flowThrough(addUnknown, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), addUnknown.getJSType());
  }

  @Test
  public void flowThrough_givenCommaAndParam_shouldInferLastChildType() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node comma = new Node(Token.COMMA, Node.newNumber(1.0), Node.newString("str"));
    comma.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    comma.getLastChild().setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    ti.flowThrough(comma, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), comma.getJSType());

    Node paramList = new Node(Token.PARAM_LIST, Node.newNumber(5.0));
    paramList.getFirstChild().setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    ti.flowThrough(paramList, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), paramList.getJSType());
  }

  @Test
  public void flowThrough_givenHookExpression_shouldInferSupertype() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node cond = Node.newNumber(1.0);
    Node trueNode = Node.newNumber(2.0);
    Node falseNode = Node.newNumber(3.0);
    cond.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    trueNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    falseNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node hook = new Node(Token.HOOK, cond, trueNode, falseNode);
    ti.flowThrough(hook, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), hook.getJSType());
  }

  @Test
  public void flowThrough_givenAndOrExpressions_shouldInferJoinedTypes() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node andLeft = Node.newNumber(1.0);
    Node andRight = Node.newString("abc");
    andLeft.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    andRight.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node andNode = new Node(Token.AND, andLeft, andRight);
    FlowScope andScope = ti.flowThrough(andNode, entry);
    Assert.assertNotNull(andScope);
    Assert.assertNotNull(andNode.getJSType());

    Node orLeft = Node.newNumber(1.0);
    Node orRight = Node.newString("abc");
    orLeft.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    orRight.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    Node orNode = new Node(Token.OR, orLeft, orRight);
    FlowScope orScope = ti.flowThrough(orNode, entry);
    Assert.assertNotNull(orScope);
    Assert.assertNotNull(orNode.getJSType());
  }

  @Test
  public void flowThrough_givenReturnAndCatch_shouldProcessSuccessfully() {
    Node fn = compiler.parseSyntheticCode("test", "function f() { return 1; }").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node retChild = Node.newNumber(10.0);
    retChild.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node retNode = new Node(Token.RETURN, retChild);
    FlowScope retScope = ti.flowThrough(retNode, entry);
    Assert.assertNotNull(retScope);

    Node catchName = Node.newString(Token.NAME, "err");
    Node catchBlock = new Node(Token.BLOCK);
    Node catchNode = new Node(Token.CATCH, catchName, catchBlock);
    FlowScope catchScope = ti.flowThrough(catchNode, entry);
    Assert.assertNotNull(catchScope);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchName.getJSType());
  }

  @Test
  public void flowThrough_givenThisAndGetElem_shouldExecuteWithoutError() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node thisNode = new Node(Token.THIS);
    ti.flowThrough(thisNode, entry);
    Assert.assertEquals(entry.getTypeOfThis(), thisNode.getJSType());

    Node objNode = Node.newString(Token.NAME, "arr");
    objNode.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
    Node elemIndex = Node.newNumber(0.0);
    elemIndex.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node getElemNode = new Node(Token.GETELEM, objNode, elemIndex);
    FlowScope elemScope = ti.flowThrough(getElemNode, entry);
    Assert.assertNotNull(elemScope);
  }

  @Test
  public void flowThrough_givenObjectLit_shouldDefineProperties() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node key = Node.newString(Token.STRING_KEY, "prop");
    Node val = Node.newNumber(42.0);
    val.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    key.addChildToFront(val);

    Node objLit = new Node(Token.OBJECTLIT, key);
    ObjectType objType = registry.createAnonymousObjectType();
    objLit.setJSType(objType);

    FlowScope objScope = ti.flowThrough(objLit, entry);
    Assert.assertNotNull(objScope);
    Assert.assertTrue(objType.hasProperty("prop"));
  }

  @Test
  public void flowThrough_givenCastNode_shouldUpdateTypeFromJSDoc() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node inner = Node.newNumber(1.0);
    Node castNode = new Node(Token.CAST, inner);
    JSDocInfoBuilder builder = new JSDocInfoBuilder(false);
    builder.recordType(new Node(Token.STRING));
    JSDocInfo info = builder.build(castNode);
    castNode.setJSDocInfo(info);

    ti.flowThrough(castNode, entry);
    Assert.assertNotNull(castNode.getJSType());
  }

  @Test
  public void flowThrough_givenCallAndNew_shouldInferReturnType() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    FunctionType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node target = Node.newString(Token.NAME, "myFn");
    target.setJSType(fnType);

    Node callNode = new Node(Token.CALL, target);
    ti.flowThrough(callNode, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), callNode.getJSType());

    FunctionType ctorType = registry.createConstructorType("MyClass", null, null, null);
    Node ctorTarget = Node.newString(Token.NAME, "MyClass");
    ctorTarget.setJSType(ctorType);

    Node newNode = new Node(Token.NEW, ctorTarget);
    ti.flowThrough(newNode, entry);
    Assert.assertEquals(ctorType.getInstanceType(), newNode.getJSType());
  }

  @Test
  public void flowThrough_givenAssignAdd_shouldInferType() {
    Node fn = compiler.parseSyntheticCode("test", "function f() { var x = 1; }").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node left = Node.newString(Token.NAME, "x");
    left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    Node right = Node.newNumber(2.0);
    right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

    Node assignAdd = new Node(Token.ASSIGN_ADD, left, right);
    ti.flowThrough(assignAdd, entry);
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignAdd.getJSType());
  }

  @Test
  public void branchedFlowThrough_givenBasicSource_shouldReturnExpectedBranches() {
    Node fn = compiler.parseSyntheticCode("test", "function f(a) { if (a) { return 1; } else { return 2; } }").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    ControlFlowGraph<Node> cfg = ti.getCfg();
    Node firstNode = cfg.getEntry().getValue();
    List<FlowScope> results = ti.branchedFlowThrough(firstNode, entry);
    Assert.assertNotNull(results);
    Assert.assertEquals(cfg.getOutEdges(firstNode).size(), results.size());
  }

  @Test
  public void flowThrough_givenVarAndSwitchAndThrow_shouldHandleGracefully() {
    Node fn = compiler.parseSyntheticCode("test", "function f() {}").getFirstChild();
    Scope scope = createFunctionScope(fn);
    TypeInference ti = createTypeInference(fn, scope);
    FlowScope entry = ti.createEntryLattice();

    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "dummy"));
    FlowScope s1 = ti.flowThrough(varNode, entry);
    Assert.assertNotNull(s1);

    Node throwNode = new Node(Token.THROW, Node.newString("err"));
    FlowScope s2 = ti.flowThrough(throwNode, entry);
    Assert.assertNotNull(s2);

    Node switchVal = Node.newNumber(1.0);
    Node switchNode = new Node(Token.SWITCH, switchVal);
    FlowScope s3 = ti.flowThrough(switchNode, entry);
    Assert.assertNotNull(s3);
  }
}
