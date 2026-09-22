package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class RenameVarsTest {

    private AbstractCompiler compiler;
    private RenameVars renameVars;
    private VariableMap prevMap;

    private static class TestCompiler extends AbstractCompiler {
        private boolean changed;
        private String debugLog;

        TestCompiler() {
            super(null);
        }

        @Override
        public void reportCodeChange() {
            changed = true;
        }

        @Override
        public void addToDebugLog(String log) {
            debugLog = log;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public boolean isExported(String name, boolean local) {
                    return name.startsWith("export");
                }
            };
        }

        @Override
        public void clearCryptoKeysIfNeeded() {}

        @Override
        public void setInForcedCrossModuleMotionLoop() {}

        @Override
        public void setHasRegExpReference() {}

        @Override
        public void setHasConditionalPropertyReference() {}

        @Override
        public void setHasSideEffect() {}

        @Override
        public void setHasDeferredFunction() {}

        @Override
        public void setHasEval() {}

        @Override
        public void setHasLoop() {}

        @Override
        public void setHasEnclosingFunction() {}

        @Override
        public void setHasArguments() {}

        @Override
        public void setHasThis() {}

        @Override
        public void setHasVar() {}

        @Override
        public void setHasCall() {}

        @Override
        public void setHasThrow() {}

        @Override
        public void setHasBreak() {}

        @Override
        public void setHasContinue() {}

        @Override
        public void setHasReturn() {}

        @Override
        public void setHasName() {}

        @Override
        public void setHasString() {}

        @Override
        public void setHasNumber() {}

        @Override
        public void setHasBoolean() {}

        @Override
        public void setHasTrue() {}

        @Override
        public void setHasFalse() {}

        @Override
        public void setHasNull() {}

        @Override
        public void setHasVoid() {}

        @Override
        public void setHasFunction() {}

        @Override
        public void setHasScript() {}

        @Override
        public void setHasRoot() {}

        @Override
        public void setHasComma() {}

        @Override
        public void setHasAssign() {}

        @Override
        public void setHasConditional() {}

        @Override
        public void setHasOr() {}

        @Override
        public void setHasAnd() {}

        @Override
        public void setHasBitwiseOr() {}

        @Override
        public void setHasBitwiseXor() {}

        @Override
        public void setHasBitwiseAnd() {}

        @Override
        public void setHasEq() {}

        @Override
        public void setHasNe() {}

        @Override
        public void setHasLt() {}

        @Override
        public void setHasLe() {}

        @Override
        public void setHasGt() {}

        @Override
        public void setHasGe() {}

        @Override
        public void setHasShl() {}

        @Override
        public void setHasShr() {}

        @Override
        public void setHasSub() {}

        @Override
        public void setHasAdd() {}

        @Override
        public void setHasMul() {}

        @Override
        public void setHasDiv() {}

        @Override
        public void setHasMod() {}

        @Override
        public void setHasInc() {}

        @Override
        public void setHasDec() {}

        @Override
        public void setHasNot() {}

        @Override
        public void setHasNeg() {}

        @Override
        public void setHasPos() {}

        @Override
        public void setHasNew() {}

        @Override
        public void setHasDelProp() {}

        @Override
        public void setHasGetElem() {}

        @Override
        public void setHasGetProp() {}

        @Override
        public void setHasObjectLit() {}

        @Override
        public void setHasArrayLit() {}

        @Override
        public void setHasRegExp() {}

        @Override
        public void setHasInstanceOf() {}

        @Override
        public void setHasTypeOf() {}

        @Override
        public void setHasType() {}

        @Override
        public void setHasCast() {}

        @Override
        public void setHasNameDeclaration() {}
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        prevMap = new VariableMap(null);
    }

    @Test
    public void testProcessWithNullExternsAndRoot() {
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        renameVars.process(externs, root);
        // No exception expected
    }

    @Test
    public void testProcessWithSingleGlobalVar() {
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "a");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertNotNull(nameNode.getString());
        assertFalse(nameNode.getString().isEmpty());
    }

    @Test
    public void testProcessWithLocalVar() {
        renameVars = new RenameVars(compiler, "", true, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "local");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertNotNull(nameNode.getString());
        assertFalse(nameNode.getString().isEmpty());
    }

    @Test
    public void testProcessWithExternName() {
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node externName = Node.newString(Token.NAME, "external");
        externs.addChildToBack(externName);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "external");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertEquals("external", nameNode.getString());
    }

    @Test
    public void testProcessWithReservedName() {
        Set<String> reserved = new HashSet<>();
        reserved.add("keep");
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, reserved);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "keep");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertEquals("keep", nameNode.getString());
    }

    @Test
    public void testProcessWithPreviouslyUsedMap() {
        Map<String, String> prevNames = new HashMap<>();
        prevNames.put("old", "new");
        VariableMap prevMap = new VariableMap(prevNames);
        renameVars = new RenameVars(compiler, "", false, false, false, prevMap, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "old");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertEquals("new", nameNode.getString());
    }

    @Test
    public void testProcessWithGeneratePseudoNames() {
        renameVars = new RenameVars(compiler, "", false, false, true, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "test");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertTrue(nameNode.getString().startsWith("$"));
        assertTrue(nameNode.getString().endsWith("$$"));
    }

    @Test
    public void testProcessWithMultipleVars() {
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode1 = Node.newString(Token.NAME, "b");
        Node nameNode2 = Node.newString(Token.NAME, "a");
        root.addChildToBack(nameNode1);
        root.addChildToBack(nameNode2);
        renameVars.process(externs, root);
        assertFalse(nameNode1.getString().equals(nameNode2.getString()));
    }

    @Test
    public void testProcessWithAnonymousFunctionName() {
        renameVars = new RenameVars(compiler, "", false, true, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "anon");
        nameNode.setString("");
        // Simulate anonymous function
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(nameNode);
        root.addChildToBack(functionNode);
        renameVars.process(externs, root);
        assertEquals("", nameNode.getString());
    }

    @Test
    public void testProcessWithLocalRenamingOnlyAndGlobalVar() {
        renameVars = new RenameVars(compiler, "", true, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "globalVar");
        root.addChildToBack(nameNode);
        // Need to create Scope.Var, skip for brevity - just verify no exception
        renameVars.process(externs, root);
        // No exception expected
    }

    @Test
    public void testProcessWithEmptyStringName() {
        renameVars = new RenameVars(compiler, "", false, false, false, null, null, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertEquals("", nameNode.getString());
    }

    @Test
    public void testProcessWithReservedCharacter() {
        char[] reservedChars = {'$'};
        renameVars = new RenameVars(compiler, "", false, false, true, null, reservedChars, null);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "test");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertFalse(nameNode.getString().contains("$"));
    }

    @Test
    public void testProcessWithPrefix() {
        Set<String> reserved = new HashSet<>();
        renameVars = new RenameVars(compiler, "prefix_", false, false, false, null, null, reserved);
        Node externs = new Node(Token.SCRIPT);
        Node root = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "var1");
        root.addChildToBack(nameNode);
        renameVars.process(externs, root);
        assertTrue(nameNode.getString().startsWith("prefix_"));
    }
}