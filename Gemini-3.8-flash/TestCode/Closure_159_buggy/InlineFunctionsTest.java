package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import java.util.*;

public class InlineFunctionsTest {
    private InlineFunctions inlineFunctions;
    private AbstractCompiler compiler;
    private Supplier<String> safeNameIdSupplier;

    @Before
    public void setUp() {
        compiler = new TestAbstractCompiler();
        safeNameIdSupplier = new Supplier<String>() {
            private int counter = 0;
            @Override
            public String get() {
                return "generated_" + (counter++);
            }
        };
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullCompiler() {
        new InlineFunctions(null, safeNameIdSupplier, true, true, true);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorNullSupplier() {
        new InlineFunctions(compiler, null, true, true, true);
    }

    @Test
    public void testConstructorValid() {
        inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        assertNotNull(inlineFunctions);
    }

    @Test
    public void testGetOrCreateFunctionStateNew() {
        inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        InlineFunctions.FunctionState fs = inlineFunctions.getOrCreateFunctionState("testFn");
        assertNotNull(fs);
        assertTrue(fs.canInline());
        assertFalse(fs.getReferencesThis());
        assertFalse(fs.hasInnerFunctions());
        assertFalse(fs.hasReferences());
        assertFalse(fs.hasBlockInliningReferences());
    }

    @Test
    public void testGetOrCreateFunctionStateExisting() {
        inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        InlineFunctions.FunctionState fs1 = inlineFunctions.getOrCreateFunctionState("testFn");
        InlineFunctions.FunctionState fs2 = inlineFunctions.getOrCreateFunctionState("testFn");
        assertSame(fs1, fs2);
    }

    @Test
    public void testGetOrCreateFunctionStateSetInlineFalse() {
        inlineFunctions = new InlineFunctions(compiler, safeNameIdSupplier, true, true, true);
        InlineFunctions.FunctionState fs = inlineFunctions.getOrCreateFunctionState("testFn");
        fs.setInline(false);
        assertFalse(fs.canInline());
    }

    @Test
    public void testFunctionStateSetReferencesThis() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.setReferencesThis(true);
        assertTrue(fs.getReferencesThis());
        fs.setReferencesThis(false);
        assertFalse(fs.getReferencesThis());
    }

    @Test
    public void testFunctionStateSetHasInnerFunctions() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.setHasInnerFunctions(true);
        assertTrue(fs.hasInnerFunctions());
        fs.setHasInnerFunctions(false);
        assertFalse(fs.hasInnerFunctions());
    }

    @Test
    public void testFunctionStateSetFnAndGetFn() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        Node fnNode = new Node(Token.FUNCTION);
        InlineFunctions.Function fn = new InlineFunctions.NamedFunction(fnNode);
        fs.setFn(fn);
        assertNotNull(fs.getFn());
        assertSame(fn, fs.getFn());
    }

    @Test
    public void testFunctionStateGetSafeFnNodeNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertNull(fs.getSafeFnNode());
    }

    @Test
    public void testFunctionStateSetAndGetSafeFnNode() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        Node safeNode = new Node(Token.NAME);
        fs.setSafeFnNode(safeNode);
        assertSame(safeNode, fs.getSafeFnNode());
    }

    @Test
    public void testFunctionStateCanRemoveDefault() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertTrue(fs.canRemove());
    }

    @Test
    public void testFunctionStateSetRemoveTrue() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.setRemove(true);
        assertTrue(fs.canRemove());
    }

    @Test
    public void testFunctionStateSetRemoveFalse() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.setRemove(false);
        assertFalse(fs.canRemove());
    }

    @Test
    public void testFunctionStateCanInlineDirectlyDefault() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertFalse(fs.canInlineDirectly());
    }

    @Test
    public void testFunctionStateInlineDirectlyTrue() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.inlineDirectly(true);
        assertTrue(fs.canInlineDirectly());
    }

    @Test
    public void testFunctionStateHasReferencesEmpty() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertFalse(fs.hasReferences());
        assertEquals(Collections.emptyMap(), fs.getReferencesInternal());
    }

    @Test
    public void testFunctionStateHasReferencesWithRefs() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        Node callNode = new Node(Token.CALL);
        InlineFunctions.Reference ref = new InlineFunctions.Reference(null, callNode, null, null);
        fs.addReference(ref);
        assertTrue(fs.hasReferences());
        assertEquals(1, fs.getReferences().size());
        assertSame(ref, fs.getReference(callNode));
    }

    @Test
    public void testFunctionStateGetReferencesWhenNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertEquals(Collections.emptyMap(), fs.getReferencesInternal());
        assertNull(fs.getReference(new Node(Token.NAME)));
    }

    @Test
    public void testFunctionStateAddReferenceNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.addReference(null);
        assertFalse(fs.hasReferences());
    }

    @Test
    public void testFunctionStateGetNamesToAliasNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertEquals(Collections.emptySet(), fs.getNamesToAlias());
    }

    @Test
    public void testFunctionStateSetNamesToAlias() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        Set<String> names = new HashSet<>(Arrays.asList("a", "b"));
        fs.setNamesToAlias(names);
        assertEquals(2, fs.getNamesToAlias().size());
        try {
            fs.getNamesToAlias().add("c");
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testFunctionStateSetNamesToAliasNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        fs.setNamesToAlias(null);
        assertEquals(Collections.emptySet(), fs.getNamesToAlias());
    }

    @Test
    public void testFunctionStateSetModule() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        JSModule module = new JSModule("test");
        fs.setModule(module);
        assertSame(module, fs.getModule());
    }

    @Test
    public void testFunctionStateGetModuleNull() {
        InlineFunctions.FunctionState fs = new InlineFunctions.FunctionState();
        assertNull(fs.getModule());
    }

    @Test
    public void testNamedFunctionGetName() {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "testFunc");
        fnNode.addChildToFront(nameNode);
        InlineFunctions.NamedFunction fn = new InlineFunctions.NamedFunction(fnNode);
        assertEquals("testFunc", fn.getName());
        assertSame(fnNode, fn.getFunctionNode());
        assertSame(fnNode.getParent(), fn.getDeclaringBlock());
    }

    @Test
    public void testNamedFunctionGetDeclaringBlockNull() {
        Node fnNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "testFunc");
        fnNode.addChildToFront(nameNode);
        InlineFunctions.NamedFunction fn = new InlineFunctions.NamedFunction(fnNode);
        assertNull(fn.getDeclaringBlock());
    }

    @Test
    public void testFunctionVarGetName() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "varFunc");
        Node fnNode = new Node(Token.FUNCTION);
        nameNode.addChildToFront(fnNode);
        varNode.addChildToFront(nameNode);
        InlineFunctions.FunctionVar fn = new InlineFunctions.FunctionVar(varNode);
        assertEquals("varFunc", fn.getName());
        assertSame(fnNode, fn.getFunctionNode());
        assertSame(varNode.getParent(), fn.getDeclaringBlock());
    }

    @Test
    public void testFunctionVarGetDeclaringBlockNull() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "varFunc");
        Node fnNode = new Node(Token.FUNCTION);
        nameNode.addChildToFront(fnNode);
        varNode.addChildToFront(nameNode);
        InlineFunctions.FunctionVar fn = new InlineFunctions.FunctionVar(varNode);
        assertNull(fn.getDeclaringBlock());
    }

    @Test
    public void testFunctionExpressionGetName() {
        Node fnNode = new Node(Token.FUNCTION);
        InlineFunctions.FunctionExpression fn = new InlineFunctions.FunctionExpression(fnNode, 0);
        assertNotNull(fn.getName());
        assertTrue(fn.getName().startsWith("fun_")); // Adjust based on implementation
        assertSame(fnNode, fn.getFunctionNode());
        assertNotNull(fn.getFakeName()); // Assuming fakeName is the same as name for anonymous
    }

    @Test
    public void testFunctionExpressionGetFunctionNode() {
        Node fnNode = new Node(Token.FUNCTION);
        InlineFunctions.FunctionExpression fn = new InlineFunctions.FunctionExpression(fnNode, 0);
        assertSame(fnNode, fn.getFunctionNode());
    }

    @Test
    public void testIsCandidateUsageNameVar() {
        Node name = new Node(Token.NAME, "test");
        Node parent = new Node(Token.VAR);
        parent.addChildToFront(name);
        assertTrue(InlineFunctions.FindCandidatesReferences.isCandidateUsage(name));
    }

    @Test
    public void testIsCandidateUsageNameFunction() {
        Node name = new Node(Token.NAME, "test");
        Node parent = new Node(Token.FUNCTION);
        parent.addChildToFront(name);
        assertTrue(InlineFunctions.FindCandidatesReferences.isCandidateUsage(name));
    }

    @Test
    public void testIsCandidateUsageNameCall() {
        Node name = new Node(Token.NAME, "test");
        Node parent = new Node(Token.CALL);
        parent.addChildToFront(name);
        assertTrue(InlineFunctions.FindCandidatesReferences.isCandidateUsage(name));
    }

    @Test
    public void testIsCandidateUsageNameGetCall() {
        Node name = new Node(Token.NAME, "test");
        Node parent = new Node(Token.CALL);
        Node getNode = new Node(Token.GET);
        name.addChildToFront(getNode);
        parent.addChildToFront(name);
        // Setup for get call pattern
        Node stringNode = new Node(Token.STRING, "call");
        getNode.addChildToFront(stringNode);
        Node gramps = new Node(Token.CALL);
        gramps.addChildToFront(parent);
        name.setParent(getNode);
        getNode.setParent(gramps);
        assertTrue(InlineFunctions.FindCandidatesReferences.isCandidateUsage(name));
    }

    private static class TestAbstractCompiler extends AbstractCompiler {
        private LifeCycleStage stage = LifeCycleStage.NORMALIZED;

        @Override
        public LifeCycleStage getLifeCycleStage() {
            return stage;
        }

        @Override
        public void setLifeCycleStage(LifeCycleStage stage) {
            this.stage = stage;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention();
        }

        @Override
        public void report(CheckLevel level, Node n, String message) {}

        @Override
        public void report(CheckLevel level, Node n, String message, Node... nodes) {}

        @Override
        public void report(CheckLevel level, Node n, String message, String... args) {}

        @Override
        public void report(CheckLevel level, Node n, String message, Object... args) {}

        @Override
        public void report(JSError error) {}
    }
}