package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NodeUtilTest {

    private Node scriptNode;
    private Node functionNode;
    private Node varNode;
    private Node assignNode;
    private Node addNode;
    private Node callNode;
    private Node nameNode;

    @Before
    public void setUp() {
        scriptNode = IR.script();
        functionNode = IR.function(IR.name("f"), IR.paramList(), IR.block());
        varNode = IR.var(IR.name("x"), IR.number(1.0));
        assignNode = IR.assign(IR.name("x"), IR.number(2.0));
        addNode = IR.add(IR.number(1.0), IR.number(2.0));
        callNode = IR.call(IR.getprop(IR.name("obj"), "method"), IR.name("arg"));
        nameNode = IR.name("x");
    }

    @After
    public void tearDown() {
        // Cleanup if needed
    }

    // ---- getPureBooleanValue tests ----
    @Test
    public void testGetPureBooleanValue_NullNode() {
        assertNull(NodeUtil.getPureBooleanValue(null));
    }

    @Test
    public void testGetPureBooleanValue_NullAndFalseNodes() {
        Node nullNode = IR.nullNode();
        Node falseNode = IR.falseNode();
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(nullNode));
        assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(falseNode));
    }

    @Test
    public void testGetPureBooleanValue_And_LiteralTrue() {
        Node trueNode = IR.trueNode();
        assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(trueNode));
    }

    // ---- isStrWhiteSpaceChar tests ----
    @Test
    public void testIsStrWhiteSpaceChar_AllWhiteSpaceChars() {
        assertTrue(NodeUtil.isStrWhiteSpaceChar(' '));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\n'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\r'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\t'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u000B'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u00A0'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u000C'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u2028'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u2029'));
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\uFEFF'));
    }

    @Test
    public void testIsStrWhiteSpaceChar_NonWhiteSpace() {
        assertFalse(NodeUtil.isStrWhiteSpaceChar('a'));
        assertFalse(NodeUtil.isStrWhiteSpaceChar('0'));
        assertFalse(NodeUtil.isStrWhiteSpaceChar('$'));
    }

    // ---- getNearestFunctionName tests ----
    @Test
    public void testGetNearestFunctionName_NonFunction() {
        Node var = IR.var(IR.name("x"));
        assertNull(NodeUtil.getNearestFunctionName(var));
    }

    @Test
    public void testGetNearestFunctionName_FunctionWithName() {
        Node fn = IR.function(IR.name("myFunc"), IR.paramList(), IR.block());
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionName_FunctionWithoutName() {
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        assertNull(NodeUtil.getNearestFunctionName(fn));
    }

    // ---- getStringValue tests ----
    @Test
    public void testGetStringValue_WholeNumber() {
        assertEquals("5", NodeUtil.getStringValue(5.0));
        assertEquals("-3", NodeUtil.getStringValue(-3.0));
    }

    @Test
    public void testGetStringValue_FractionalNumber() {
        assertEquals("3.14", NodeUtil.getStringValue(3.14));
        assertEquals("-0.5", NodeUtil.getStringValue(-0.5));
    }

    @Test
    public void testGetStringValue_SpecialValues() {
        assertEquals("Infinity", NodeUtil.getStringValue(Double.POSITIVE_INFINITY));
        assertEquals("-Infinity", NodeUtil.getStringValue(Double.NEGATIVE_INFINITY));
        assertEquals("NaN", NodeUtil.getStringValue(Double.NaN));
    }

    // ---- getStringNumberValue tests ----
    @Test
    public void testGetStringNumberValue_ValidNumbers() {
        assertEquals(Double.valueOf(123.0), NodeUtil.getStringNumberValue("123"));
        assertEquals(Double.valueOf(-45.6), NodeUtil.getStringNumberValue("-45.6"));
    }

    @Test
    public void testGetStringNumberValue_InvalidString() {
        assertNull(NodeUtil.getStringNumberValue("abc"));
        assertNull(NodeUtil.getStringNumberValue(""));
    }

    @Test
    public void testGetStringNumberValue_EdgeCases() {
        assertNull(NodeUtil.getStringNumberValue("0x1"));
        assertNull(NodeUtil.getStringNumberValue("1e5"));
        assertNull(NodeUtil.getStringNumberValue("Infinity"));
    }

    // ---- isSimpleOperator tests ----
    @Test
    public void testIsSimpleOperator_SimpleTokens() {
        assertTrue(NodeUtil.isSimpleOperator(IR.add(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.sub(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.mul(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.div(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.mod(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.bitand(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.bitor(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.bitxor(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.lsh(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.rsh(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.ursh(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.not(IR.number(1))));
        assertTrue(NodeUtil.isSimpleOperator(IR.neg(IR.number(1))));
        assertTrue(NodeUtil.isSimpleOperator(IR.pos(IR.number(1))));
        assertTrue(NodeUtil.isSimpleOperator(IR.voidNode(IR.number(1))));
        assertTrue(NodeUtil.isSimpleOperator(IR.typeof(IR.name("x"))));
        assertTrue(NodeUtil.isSimpleOperator(IR.sheq(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.eq(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.ne(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.shne(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.lt(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.le(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.gt(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.ge(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.and(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.or(IR.number(1), IR.number(2))));
        assertTrue(NodeUtil.isSimpleOperator(IR.bitnot(IR.number(1))));
    }

    @Test
    public void testIsSimpleOperator_NonSimpleToken() {
        assertFalse(NodeUtil.isSimpleOperator(IR.name("x")));
        assertFalse(NodeUtil.isSimpleOperator(IR.number(1)));
        assertFalse(NodeUtil.isSimpleOperator(IR.string("str")));
        assertFalse(NodeUtil.isSimpleOperator(IR.trueNode()));
        assertFalse(NodeUtil.isSimpleOperator(IR.falseNode()));
        assertFalse(NodeUtil.isSimpleOperator(IR.nullNode()));
        assertFalse(NodeUtil.isSimpleOperator(IR.call(IR.name("f"))));
        assertFalse(NodeUtil.isSimpleOperator(IR.newNode(IR.name("F"))));
        assertFalse(NodeUtil.isSimpleOperator(IR.var(IR.name("x"))));
        assertFalse(NodeUtil.isSimpleOperator(IR.returnNode(IR.number(1))));
    }

    // ---- isAssignmentOp tests ----
    @Test
    public void testIsAssignmentOp_AllAssignmentOps() {
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_BITOR));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_BITXOR));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_BITAND));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_LSH));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_RSH));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_URSH));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_ADD));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_SUB));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_MUL));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_DIV));
        assertTrue(NodeUtil.isAssignmentOp(Token.ASSIGN_MOD));
    }

    @Test
    public void testIsAssignmentOp_NonAssignment() {
        assertFalse(NodeUtil.isAssignmentOp(Token.ADD));
        assertFalse(NodeUtil.isAssignmentOp(Token.ASSIGN));
        assertFalse(NodeUtil.isAssignmentOp(Token.CALL));
    }

    // ---- isGet tests ----
    @Test
    public void testIsGet_GetProp() {
        Node getprop = IR.getprop(IR.name("obj"), "prop");
        assertTrue(NodeUtil.isGet(getprop));
    }

    @Test
    public void testIsGet_GetElem() {
        Node getelem = IR.getelem(IR.name("obj"), IR.string("key"));
        assertTrue(NodeUtil.isGet(getelem));
    }

    @Test
    public void testIsGet_NonGet() {
        assertFalse(NodeUtil.isGet(IR.name("x")));
        assertFalse(NodeUtil.isGet(IR.call(IR.name("f"))));
        assertFalse(NodeUtil.isGet(IR.number(1)));
    }

    // ---- isNew tests ----
    @Test
    public void testIsNew_NewNode() {
        Node newnode = IR.newNode(IR.name("Foo"));
        assertTrue(NodeUtil.isNew(newnode));
    }

    @Test
    public void testIsNew_NonNew() {
        assertFalse(NodeUtil.isNew(IR.name("x")));
        assertFalse(NodeUtil.isNew(IR.call(IR.name("f"))));
    }

    // ---- isValidSimpleName tests ----
    @Test
    public void testIsValidSimpleName_ValidNames() {
        assertTrue(NodeUtil.isValidSimpleName("foo"));
        assertTrue(NodeUtil.isValidSimpleName("$foo"));
        assertTrue(NodeUtil.isValidSimpleName("_foo"));
        assertTrue(NodeUtil.isValidSimpleName("foo1"));
        assertTrue(NodeUtil.isValidSimpleName("FooBar"));
    }

    @Test
    public void testIsValidSimpleName_InvalidNames() {
        assertFalse(NodeUtil.isValidSimpleName(""));
        assertFalse(NodeUtil.isValidSimpleName("1foo"));
        assertFalse(NodeUtil.isValidSimpleName(" foo"));
        assertFalse(NodeUtil.isValidSimpleName("foo bar"));
        assertFalse(NodeUtil.isValidSimpleName("if"));
        assertFalse(NodeUtil.isValidSimpleName("null"));
    }

    // ---- isValidQualifiedName tests ----
    @Test
    public void testIsValidQualifiedName_ValidNames() {
        assertTrue(NodeUtil.isValidQualifiedName("foo"));
        assertTrue(NodeUtil.isValidQualifiedName("foo.bar"));
        assertTrue(NodeUtil.isValidQualifiedName("foo.bar.baz"));
        assertTrue(NodeUtil.isValidQualifiedName("$foo._bar"));
    }

    @Test
    public void testIsValidQualifiedName_InvalidNames() {
        assertFalse(NodeUtil.isValidQualifiedName(""));
        assertFalse(NodeUtil.isValidQualifiedName(".foo"));
        assertFalse(NodeUtil.isValidQualifiedName("foo."));
        assertFalse(NodeUtil.isValidQualifiedName("foo..bar"));
        assertFalse(NodeUtil.isValidQualifiedName("1foo"));
        assertFalse(NodeUtil.isValidQualifiedName("foo bar"));
    }

    // ---- isLValue tests ----
    @Test
    public void testIsLValue_NullParent() {
        Node node = IR.name("x");
        assertFalse(NodeUtil.isLValue(node));
    }

    @Test
    public void testIsLValue_AssignTarget() {
        Node target = IR.name("x");
        Node assign = IR.assign(target, IR.number(1));
        assertTrue(NodeUtil.isLValue(target));
    }

    @Test
    public void testIsLValue_NonLValue() {
        Node name = IR.name("x");
        IR.exprResult(IR.call(IR.getprop(name, "prop")));
        assertFalse(NodeUtil.isLValue(IR.number(1)));
    }

    // ---- getop tests ----
    @Test
    public void testGetOp_TokenToString() {
        assertEquals("|", NodeUtil.getOp(Token.BITOR));
        assertEquals("||", NodeUtil.getOp(Token.OR));
        assertEquals("^", NodeUtil.getOp(Token.BITXOR));
        assertEquals("&&", NodeUtil.getOp(Token.AND));
        assertEquals("&", NodeUtil.getOp(Token.BITAND));
        assertEquals("===", NodeUtil.getOp(Token.SHEQ));
        assertEquals("==", NodeUtil.getOp(Token.EQ));
        assertEquals("!", NodeUtil.getOp(Token.NOT));
        assertEquals("!=", NodeUtil.getOp(Token.NE));
        assertEquals("!==", NodeUtil.getOp(Token.SHNE));
        assertEquals("<<", NodeUtil.getOp(Token.LSH));
        assertEquals("in", NodeUtil.getOp(Token.IN));
        assertEquals("<=", NodeUtil.getOp(Token.LE));
        assertEquals("<", NodeUtil.getOp(Token.LT));
        assertEquals(">>>", NodeUtil.getOp(Token.URSH));
        assertEquals(">>", NodeUtil.getOp(Token.RSH));
        assertEquals(">=", NodeUtil.getOp(Token.GE));
        assertEquals(">", NodeUtil.getOp(Token.GT));
        assertEquals("*", NodeUtil.getOp(Token.MUL));
        assertEquals("/", NodeUtil.getOp(Token.DIV));
        assertEquals("%", NodeUtil.getOp(Token.MOD));
        assertEquals("~", NodeUtil.getOp(Token.BITNOT));
        assertEquals("+", NodeUtil.getOp(Token.ADD));
        assertEquals("-", NodeUtil.getOp(Token.SUB));
        assertEquals("+", NodeUtil.getOp(Token.POS));
        assertEquals("-", NodeUtil.getOp(Token.NEG));
        assertEquals("=", NodeUtil.getOp(Token.ASSIGN));
        assertEquals("|=", NodeUtil.getOp(Token.ASSIGN_BITOR));
        assertEquals("^=", NodeUtil.getOp(Token.ASSIGN_BITXOR));
        assertEquals("&=", NodeUtil.getOp(Token.ASSIGN_BITAND));
        assertEquals("<<=", NodeUtil.getOp(Token.ASSIGN_LSH));
        assertEquals(">>=", NodeUtil.getOp(Token.ASSIGN_RSH));
        assertEquals(">>>=", NodeUtil.getOp(Token.ASSIGN_URSH));
        assertEquals("+=", NodeUtil.getOp(Token.ASSIGN_ADD));
        assertEquals("-=", NodeUtil.getOp(Token.ASSIGN_SUB));
        assertEquals("*=", NodeUtil.getOp(Token.ASSIGN_MUL));
        assertEquals("/=", NodeUtil.getOp(Token.ASSIGN_DIV));
        assertEquals("%=", NodeUtil.getOp(Token.ASSIGN_MOD));
        assertEquals("void", NodeUtil.getOp(Token.VOID));
        assertEquals("typeof", NodeUtil.getOp(Token.TYPEOF));
        assertEquals("instanceof", NodeUtil.getOp(Token.INSTANCEOF));
    }

    // ---- booleanNode/numberNode tests ----
    @Test
    public void testBooleanNode_True() {
        Node node = NodeUtil.booleanNode(true);
        assertTrue(node.isTrue());
    }

    @Test
    public void testBooleanNode_False() {
        Node node = NodeUtil.booleanNode(false);
        assertTrue(node.isFalse());
    }

    @Test
    public void testNumberNode_RegularNumber() {
        Node node = NodeUtil.numberNode(3.14, null);
        assertEquals(Token.NUMBER, node.getType());
        assertEquals(3.14, node.getDouble(), 0.0001);
    }

    @Test
    public void testNumberNode_Nan() {
        Node node = NodeUtil.numberNode(Double.NaN, null);
        assertEquals(Token.NUMBER, node.getType());
        assertTrue(Double.isNaN(node.getDouble()));
    }

    @Test
    public void testNumberNode_Infinity() {
        Node node = NodeUtil.numberNode(Double.POSITIVE_INFINITY, null);
        assertEquals(Token.NAME, node.getType());
        assertEquals("Infinity", node.getString());
    }

    @Test
    public void testNumberNode_NegativeInfinity() {
        Node node = NodeUtil.numberNode(Double.NEGATIVE_INFINITY, null);
        assertEquals(Token.NAME, node.getType());
        assertEquals("-Infinity", node.getString());
    }

    // ---- isObjectLitKey tests ----
    @Test
    public void testIsObjectLitKey_ValidKey() {
        Node key = IR.stringKey("key");
        Node objLit = IR.objectlit(key);
        assertTrue(NodeUtil.isObjectLitKey(key, objLit));
    }

    @Test
    public void testIsObjectLitKey_NotInObjectLit() {
        Node key = IR.stringKey("key");
        Node assign = IR.assign(IR.getprop(IR.name("o"), "x"), IR.string("v"));
        assertFalse(NodeUtil.isObjectLitKey(key, assign));
    }

    // ---- getSourceName tests ----
    @Test
    public void testGetSourceName_WithSource() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        fn.setSourceCodeForTesting("file.js");
        assertEquals("file.js", NodeUtil.getSourceName(fn));
    }

    @Test
    public void testGetSourceName_NoSource() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertNull(NodeUtil.getSourceName(fn));
    }

    // ---- getInputId tests ----
    @Test
    public void testGetInputId_WithInput() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        InputId id = new InputId("input");
        fn.setInputId(id);
        assertEquals(id, NodeUtil.getInputId(fn));
    }

    @Test
    public void testGetInputId_NoInput() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertNull(NodeUtil.getInputId(fn));
    }

    // ---- getFunctionJSDocInfo tests ----
    @Test
    public void testGetFunctionJSDocInfo_WithDocs() {
        JSDocInfo info = new JSDocInfo();
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        fn.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetFunctionJSDocInfo_NoDocs() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    // ---- getFunctionParameters tests ----
    @Test
    public void testGetFunctionParameters_RegularFunction() {
        Node paramList = IR.paramList(IR.name("a"), IR.name("b"));
        Node fn = IR.function(IR.name("f"), paramList, IR.block());
        assertEquals(paramList, NodeUtil.getFunctionParameters(fn));
    }

    // ---- newQualifiedNameNode tests ----
    @Test
    public void testNewQualifiedNameNode_SimpleName() {
        Node node = NodeUtil.newQualifiedNameNode("foo", 0, 0);
        assertTrue(node.isName());
        assertEquals("foo", node.getString());
    }

    @Test
    public void testNewQualifiedNameNode_QualifiedName() {
        Node node = NodeUtil.newQualifiedNameNode("foo.bar", 0, 0);
        assertTrue(node.isGetProp());
        assertEquals("foo", node.getFirstChild().getString());
        assertEquals("bar", node.getLastChild().getString());
    }

    @Test
    public void testNewQualifiedNameNode_EmptyString() {
        Node node = NodeUtil.newQualifiedNameNode("", 0, 0);
        assertEquals(Token.NAME, node.getType());
        assertEquals("", node.getString());
    }

    // ---- copyNameAnnotations tests ----
    @Test
    public void testCopyNameAnnotations_WithConstantName() {
        Node source = IR.name("x");
        source.putBooleanProp(Node.IS_CONSTANT_NAME, true);
        Node destination = IR.name("y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertTrue(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    @Test
    public void testCopyNameAnnotations_WithoutConstantName() {
        Node source = IR.name("x");
        Node destination = IR.name("y");
        NodeUtil.copyNameAnnotations(source, destination);
        assertFalse(destination.getBooleanProp(Node.IS_CONSTANT_NAME));
    }

    // ---- evaluatesToLocalValue tests ----
    @Test
    public void testEvaluatesToLocalValue_ImmutableValue() {
        Node num = IR.number(1);
        assertTrue(NodeUtil.evaluatesToLocalValue(num));
    }

    @Test
    public void testEvaluatesToLocalValue_NonLocal() {
        Node call = IR.call(IR.getprop(IR.name("obj"), "method"));
        assertFalse(NodeUtil.evaluatesToLocalValue(call));
    }

    @Test
    public void testEvaluatesToLocalValue_NameWithLocalsPredicate() {
        Node name = IR.name("x");
        Predicate<Node> locals = new Predicate<Node>() {
            @Override
            public boolean apply(Node n) {
                return n.isName() && n.getString().equals("x");
            }
        };
        assertTrue(NodeUtil.evaluatesToLocalValue(name, locals));
    }

    // ---- redeclareVarsInsideBranch tests ----
    @Test
    public void testRedeclareVarsInsideBranch_WithVar() {
        Node branch = IR.block();
        Node var = IR.var(IR.name("x"), IR.number(1));
        branch.addChildToBack(var);
        NodeUtil.redeclareVarsInsideBranch(branch);
        // No exception expected
    }

    @Test
    public void testRedeclareVarsInsideBranch_EmptyBranch() {
        Node branch = IR.block();
        NodeUtil.redeclareVarsInsideBranch(branch);
        // No exception expected
    }

    // ---- MatchNameNode predicate tests ----
    @Test
    public void testMatchNameNode_ApplyMatches() {
        Node name = IR.name("foo");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("foo");
        assertTrue(predicate.apply(name));
    }

    @Test
    public void testMatchNameNode_ApplyDoesNotMatch() {
        Node name = IR.name("bar");
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("foo");
        assertFalse(predicate.apply(name));
    }

    @Test
    public void testMatchNameNode_ApplyNull() {
        NodeUtil.MatchNameNode predicate = new NodeUtil.MatchNameNode("foo");
        assertFalse(predicate.apply(null));
    }

    // ---- MatchNodeType predicate tests ----
    @Test
    public void testMatchNodeType_ApplyMatches() {
        Node num = IR.number(1);
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NUMBER);
        assertTrue(predicate.apply(num));
    }

    @Test
    public void testMatchNodeType_ApplyDoesNotMatch() {
        Node num = IR.number(1);
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.STRING);
        assertFalse(predicate.apply(num));
    }

    // ---- MatchDeclaration predicate tests ----
    @Test
    public void testMatchDeclaration_ApplyVar() {
        Node var = IR.var(IR.name("x"));
        NodeUtil.MatchDeclaration predicate = new NodeUtil.MatchDeclaration();
        assertTrue(predicate.apply(var));
    }

    @Test
    public void testMatchDeclaration_ApplyFunction() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        NodeUtil.MatchDeclaration predicate = new NodeUtil.MatchDeclaration();
        assertTrue(predicate.apply(fn));
    }

    @Test
    public void testMatchDeclaration_ApplyNonDeclaration() {
        Node expr = IR.exprResult(IR.number(1));
        NodeUtil.MatchDeclaration predicate = new NodeUtil.MatchDeclaration();
        assertFalse(predicate.apply(expr));
    }

    // ---- NumbericResultPredicate tests ----
    @Test
    public void testNumbericResultPredicate_ApplyMatchedNode() {
        Node num = IR.number(1);
        NodeUtil.NumbericResultPredicate predicate = new NodeUtil.NumbericResultPredicate();
        assertTrue(predicate.apply(num));
    }

    @Test
    public void testNumbericResultPredicate_ApplyNonMatchedNode() {
        Node str = IR.string("str");
        NodeUtil.NumbericResultPredicate predicate = new NodeUtil.NumbericResultPredicate();
        assertFalse(predicate.apply(str));
    }

    // ---- BooleanResultPredicate tests ----
    @Test
    public void testBooleanResultPredicate_ApplyMatchedNode() {
        Node trueNode = IR.trueNode();
        NodeUtil.BooleanResultPredicate predicate = new NodeUtil.BooleanResultPredicate();
        assertTrue(predicate.apply(trueNode));
    }

    @Test
    public void testBooleanResultPredicate_ApplyNonMatchedNode() {
        Node num = IR.number(1);
        NodeUtil.BooleanResultPredicate predicate = new NodeUtil.BooleanResultPredicate();
        assertFalse(predicate.apply(num));
    }

    // ---- MayBeStringResultPredicate tests ----
    @Test
    public void testMayBeStringResultPredicate_ApplyMatchedNode() {
        Node str = IR.string("str");
        NodeUtil.MayBeStringResultPredicate predicate = new NodeUtil.MayBeStringResultPredicate();
        assertTrue(predicate.apply(str));
    }

    @Test
    public void testMayBeStringResultPredicate_ApplyNonMatchedNode() {
        Node num = IR.number(1);
        NodeUtil.MayBeStringResultPredicate predicate = new NodeUtil.MayBeStringResultPredicate();
        assertFalse(predicate.apply(num));
    }

    // ---- newVarNode tests ----
    @Test
    public void testNewVarNode_WithValue() {
        Node value = IR.number(1);
        Node var = NodeUtil.newVarNode("x", value);
        assertTrue(var.isVar());
        assertEquals("x", var.getFirstChild().getString());
        assertEquals(value, var.getFirstChild().getFirstChild());
    }

    @Test
    public void testNewVarNode_WithoutValue() {
        Node var = NodeUtil.newVarNode("x", null);
        assertTrue(var.isVar());
        assertEquals("x", var.getFirstChild().getString());
        assertNull(var.getFirstChild().getFirstChild());
    }

    // ---- isStatementBlock tests ----
    @Test
    public void testIsStatementBlock_BlockNode() {
        Node block = IR.block();
        assertTrue(NodeUtil.isStatementBlock(block));
    }

    @Test
    public void testIsStatementBlock_NonBlockNode() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertFalse(NodeUtil.isStatementBlock(fn));
    }

    // ---- getEnclosingFunction tests ----
    @Test
    public void testGetEnclosingFunction_InsideFunction() {
        Node inner = IR.number(1);
        Node block = IR.block(inner);
        Node fn = IR.function(IR.name("f"), IR.paramList(), block);
        assertEquals(fn, NodeUtil.getEnclosingFunction(inner));
    }

    @Test
    public void testGetEnclosingFunction_NotInsideFunction() {
        Node inner = IR.number(1);
        Node block = IR.block(inner);
        assertNull(NodeUtil.getEnclosingFunction(inner));
    }

    // ---- isExprAssign tests ----
    @Test
    public void testIsExprAssign_AssignInExprResult() {
        Node assign = IR.assign(IR.name("x"), IR.number(1));
        Node exprResult = IR.exprResult(assign);
        assertTrue(NodeUtil.isExprAssign(exprResult));
    }

    @Test
    public void testIsExprAssign_NotAssign() {
        Node num = IR.number(1);
        assertFalse(NodeUtil.isExprAssign(num));
    }

    // ---- isForIn tests ----
    @Test
    public void testIsForIn_ForInNode() {
        Node forIn = IR.forIn(IR.name("x"), IR.name("obj"), IR.block());
        assertTrue(NodeUtil.isForIn(forIn));
    }

    @Test
    public void testIsForIn_NotForIn() {
        Node forNode = IR.forNode(IR.name("i"), IR.number(0), IR.number(10), IR.number(1), IR.block());
        assertFalse(NodeUtil.isForIn(forNode));
    }

    // ---- getBlockStatement tests ----
    @Test
    public void testGetBlockStatement_ForInNode() {
        Node forIn = IR.forIn(IR.name("x"), IR.name("obj"), IR.block());
        assertEquals(Token.BLOCK, NodeUtil.getBlockStatement(forIn).getType());
    }

    @Test
    public void testGetBlockStatement_FunctionNode() {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertEquals(Token.BLOCK, NodeUtil.getBlockStatement(fn).getType());
    }

    @Test
    public void testGetBlockStatement_BlockNode() {
        Node block = IR.block();
        assertEquals(Token.BLOCK, NodeUtil.getBlockStatement(block).getType());
    }

    @Test
    public void testGetBlockStatement_Null() {
        Node num = IR.number(1);
        assertNull(NodeUtil.getBlockStatement(num));
    }

    // ---- getVarsDeclaredInBranch tests ----
    @Test
    public void testGetVarsDeclaredInBranch_WithVar() {
        Node branch = IR.block();
        Node var1 = IR.var(IR.name("x"));
        Node var2 = IR.var(IR.name("y"));
        branch.addChildToBack(var1);
        branch.addChildToBack(var2);
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(2, vars.size());
        assertTrue(vars.contains(var1));
        assertTrue(vars.contains(var2));
    }

    @Test
    public void testGetVarsDeclaredInBranch_Empty() {
        Node branch = IR.block();
        Collection<Node> vars = NodeUtil.getVarsDeclaredInBranch(branch);
        assertEquals(0, vars.size());
    }

    // ---- isCall tests ----
    @Test
    public void testIsCall_CallNode() {
        Node call = IR.call(IR.name("f"));
        assertTrue(NodeUtil.isCall(call));
    }

    @Test
    public void testIsCall_NonCallNode() {
        Node num = IR.number(1);
        assertFalse(NodeUtil.isCall(num));
    }

    // ---- isGetProp tests ----
    @Test
    public void testIsGetProp_GetPropNode() {
        Node getProp = IR.getprop(IR.name("obj"), "prop");
        assertTrue(NodeUtil.isGetProp(getProp));
    }

    @Test
    public void testIsGetProp_NonGetPropNode() {
        Node num = IR.number(1);
        assertFalse(NodeUtil.isGetProp(num));
    }
}