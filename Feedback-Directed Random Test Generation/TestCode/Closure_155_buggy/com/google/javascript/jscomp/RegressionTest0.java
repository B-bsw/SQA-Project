package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock0 = null;
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock(basicBlock0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.NodeTraversal nodeTraversal0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock1 = null;
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = com.google.javascript.jscomp.ReferenceCollectingCallback.Reference.newBleedingFunction(nodeTraversal0, basicBlock1, node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.exitScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        java.lang.Class<?> wildcardClass3 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.exitScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock basicBlock3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference(node0, node1, nodeTraversal2, basicBlock3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.visit(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope6.declare("hi!", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput6 = null;
        com.google.javascript.jscomp.Scope.Var var7 = scope2.declare("hi!", node4, jSType5, compilerInput6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = var7.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType4 = null;
        com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(node3, objectType4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("hi!", node7, jSType8, compilerInput9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = referenceCollectingCallback2.getReferenceCollection(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.InlineVariables.Mode mode0 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        java.lang.Class<?> wildcardClass1 = mode0.getClass();
        org.junit.Assert.assertTrue("'" + mode0 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode0.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = referenceCollectingCallback2.shouldTraverse(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        java.lang.Class<?> wildcardClass7 = scope2.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, false);
        java.lang.Class<?> wildcardClass4 = inlineVariables3.getClass();
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollectingCallback6.shouldTraverse(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(scope2, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal7, node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getVars();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope5, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, abstractCompiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        java.lang.Class<?> wildcardClass5 = varItor4.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        java.lang.Class<?> wildcardClass1 = behavior0.getClass();
        org.junit.Assert.assertNotNull(behavior0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.ObjectType objectType11 = scope10.getTypeOfThis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection4 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection4.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection4.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList8, referenceArray7);
        referenceCollection4.references = referenceList8;
        referenceCollection0.references = referenceList8;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertNotNull(referenceArray7);
        org.junit.Assert.assertArrayEquals(referenceArray7, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope9.declare("hi!", node11, jSType12, compilerInput13);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.lang.Class<?> wildcardClass5 = varSet4.getClass();
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        java.lang.Class<?> wildcardClass2 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope6.declare("hi!", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            scope3.undeclare(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.enterScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.exitScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap5 = null;
        behavior1.afterExitScope(nodeTraversal4, varMap5);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(scope2, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        boolean boolean11 = scope2.isLocal();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node6, jSType7, compilerInput8, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var10.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope11.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput6 = null;
        com.google.javascript.jscomp.Scope.Var var7 = scope2.declare("hi!", node4, jSType5, compilerInput6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var7.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.enterScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.enterScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope15.getSlot("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope15.declare("hi!", node19, jSType20, compilerInput21, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback12.getReferenceCollection(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("", node7, jSType8, compilerInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(scope5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var14.setType(jSType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        java.lang.Class<?> wildcardClass7 = referenceList4.getClass();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = var14.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean8 = scope5.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope scope9 = scope5.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope9.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Class<?> wildcardClass9 = behavior2.getClass();
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.Scope scope0 = null;
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(scope0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope7.getVars();
        com.google.javascript.jscomp.Scope scope10 = scope7.getGlobalScope();
        boolean boolean11 = scope7.isGlobal();
        boolean boolean12 = scope7.isLocal();
        com.google.javascript.rhino.Node node13 = scope7.getRootNode();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope7.declare("hi!", node15, jSType16, compilerInput17, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback3.getReferenceCollection(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = referenceCollectingCallback9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection3.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList14, referenceArray13);
        referenceCollection10.references = referenceList14;
        referenceCollection3.references = referenceList14;
        referenceCollection0.references = referenceList14;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference19 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNotNull(referenceArray13);
        org.junit.Assert.assertArrayEquals(referenceArray13, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope6.declare("", node8, jSType9, compilerInput10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection3.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList14, referenceArray13);
        referenceCollection10.references = referenceList14;
        referenceCollection3.references = referenceList14;
        referenceCollection0.references = referenceList14;
        boolean boolean19 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNotNull(referenceArray13);
        org.junit.Assert.assertArrayEquals(referenceArray13, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope12.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getVars();
        com.google.javascript.jscomp.Scope scope15 = scope12.getGlobalScope();
        boolean boolean16 = scope12.isGlobal();
        boolean boolean17 = scope12.isLocal();
        com.google.javascript.rhino.Node node18 = scope12.getRootNode();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope12.declare("hi!", node20, jSType21, compilerInput22, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("", node10, jSType11, compilerInput12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope9.declare("hi!", node11, jSType12, compilerInput13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollectingCallback3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getVars();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope11.declare("hi!", node15, jSType16, compilerInput17, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback8.getReferenceCollection(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.lang.Class<?> wildcardClass6 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node6, jSType7, compilerInput8, false);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getVars();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("hi!", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, varMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = referenceCollectingCallback14.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var13.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope14.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        com.google.javascript.jscomp.Scope scope17 = scope14.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope17.getVars();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope17.declare("hi!", node20, jSType21, compilerInput22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback11.getReferenceCollection(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope11.getSlot("");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope11.declare("hi!", node15, jSType16, compilerInput17, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.jscomp.Scope scope7 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope7.getSlot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        boolean boolean10 = scope2.isDeclared("", false);
        boolean boolean11 = scope2.isBottom();
        java.lang.Class<?> wildcardClass12 = scope2.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = var7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node6, jSType7, compilerInput8, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var11.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean8 = scope5.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope5.declare("", node10, jSType11, compilerInput12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput6 = null;
        com.google.javascript.jscomp.Scope.Var var7 = scope2.declare("hi!", node4, jSType5, compilerInput6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("");
        boolean boolean13 = scope10.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope10.getParentScope();
        int int15 = scope10.getDepth();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope10.declare("hi!", node17, jSType18, compilerInput19, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var13.setType(jSType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType5 = null;
        com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(node4, objectType5);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope6.getSlot("");
        boolean boolean9 = scope6.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope6.getParentScope();
        int int11 = scope6.getDepth();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope6.declare("hi!", node13, jSType14, compilerInput15, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback3.getReferenceCollection(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior2.afterExitScope(nodeTraversal10, varMap11);
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope5.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet9 = referenceCollectingCallback8.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varSet9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        int int10 = scope2.getVarCount();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean10 = referenceCollection9.isWellDefined();
        boolean boolean11 = referenceCollection9.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection12.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection12.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList16, referenceArray15);
        referenceCollection12.references = referenceList16;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList23, referenceArray22);
        referenceCollection19.references = referenceList23;
        referenceCollection12.references = referenceList23;
        referenceCollection9.references = referenceList23;
        referenceCollection6.references = referenceList23;
        referenceCollection0.references = referenceList23;
        java.lang.Class<?> wildcardClass30 = referenceList23.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNotNull(referenceArray15);
        org.junit.Assert.assertArrayEquals(referenceArray15, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNull(reference21);
        org.junit.Assert.assertNotNull(referenceArray22);
        org.junit.Assert.assertArrayEquals(referenceArray22, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isEscaped();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet9 = referenceCollectingCallback8.getReferencedVariables();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope12.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope12.getOwnSlot("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope12.declare("hi!", node18, jSType19, compilerInput20, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback8.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varSet9);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope13.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getVars();
        com.google.javascript.jscomp.Scope scope16 = scope13.getGlobalScope();
        boolean boolean17 = scope13.isGlobal();
        boolean boolean18 = scope13.isLocal();
        com.google.javascript.rhino.Node node19 = scope13.getRootNode();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope13.declare("hi!", node21, jSType22, compilerInput23, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, varMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap16 = null;
        behavior4.afterExitScope(nodeTraversal15, varMap16);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = referenceCollectingCallback12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = referenceCollectingCallback11.shouldTraverse(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = referenceCollectingCallback3.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.jscomp.Scope scope7 = scope2.getParent();
        boolean boolean10 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = referenceCollectingCallback11.shouldTraverse(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, varMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope17.getTypeOfThis();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope17.declare("hi!", node22, jSType23, compilerInput24, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = referenceCollectingCallback14.getReferenceCollection(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(var19);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var13.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference19 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("", node6, jSType7, compilerInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node7, jSType8, compilerInput9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, false);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.exitScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.lang.Class<?> wildcardClass4 = referenceCollectingCallback3.getClass();
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope14.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope14.getOwnSlot("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope14.declare("hi!", node20, jSType21, compilerInput22, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback11.getReferenceCollection(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("");
        java.lang.Class<?> wildcardClass8 = scope2.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        com.google.javascript.jscomp.Scope scope7 = scope5.getGlobalScope();
        com.google.javascript.jscomp.Scope scope8 = scope7.getParent();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node7, jSType8, compilerInput9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var10.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getVars();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope8.declare("hi!", node12, jSType13, compilerInput14, false);
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("hi!", node7, jSType8, compilerInput9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior3.afterExitScope(nodeTraversal11, varMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.ObjectType objectType19 = scope18.getTypeOfThis();
        boolean boolean20 = scope18.isGlobal();
        com.google.javascript.jscomp.Scope.Var var22 = scope18.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = scope18.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope18.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope18.getParentScope();
        boolean boolean27 = scope18.isBottom();
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput31 = null;
        com.google.javascript.jscomp.Scope.Var var32 = scope18.declare("hi!", node29, jSType30, compilerInput31);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection33 = referenceCollectingCallback15.getReferenceCollection(var32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(objectType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertNull(objectType23);
        org.junit.Assert.assertNull(jSTypeStaticSlot25);
        org.junit.Assert.assertNull(jSTypeStaticScope26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(var32);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = scope6.isLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope12.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getVars();
        com.google.javascript.jscomp.Scope scope15 = scope12.getGlobalScope();
        boolean boolean16 = scope12.isGlobal();
        boolean boolean17 = scope12.isLocal();
        com.google.javascript.rhino.Node node18 = scope12.getRootNode();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope12.declare("hi!", node20, jSType21, compilerInput22, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope14.getSlot("");
        boolean boolean17 = scope14.isBottom();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope14.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback11.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet10 = referenceCollectingCallback9.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varSet10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollectingCallback3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection3.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection10.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList14, referenceArray13);
        referenceCollection10.references = referenceList14;
        referenceCollection3.references = referenceList14;
        referenceCollection0.references = referenceList14;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean20 = referenceCollection19.firstReferenceIsAssigningDeclaration();
        boolean boolean21 = referenceCollection19.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection23.references = referenceList27;
        referenceCollection19.references = referenceList27;
        referenceCollection0.references = referenceList27;
        boolean boolean32 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference33 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNotNull(referenceArray13);
        org.junit.Assert.assertArrayEquals(referenceArray13, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(reference22);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = scope6.isDeclared("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = scope6.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getVar("hi!");
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope6, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap4 = null;
        behavior2.afterExitScope(nodeTraversal3, varMap4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope12.getTypeOfThis();
        boolean boolean14 = scope12.isGlobal();
        com.google.javascript.jscomp.Scope.Var var16 = scope12.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope12.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope12.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope12.getParentScope();
        boolean boolean21 = scope12.isBottom();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope12.declare("hi!", node23, jSType24, compilerInput25);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = referenceCollectingCallback9.getReferenceCollection(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
        org.junit.Assert.assertNull(jSTypeStaticScope20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior0.afterExitScope(nodeTraversal2, varMap3);
        org.junit.Assert.assertNotNull(behavior0);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        boolean boolean9 = scope2.isBottom();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, varMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.exitScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = scope9.getDepth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.exitScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean8 = scope5.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope scope9 = scope5.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var11 = scope5.getVar("");
        com.google.javascript.jscomp.Scope scope12 = scope5.getParent();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType18 = scope15.getTypeOfThis();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope15.declare("hi!", node20, jSType21, compilerInput22, true);
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior3.afterExitScope(nodeTraversal11, varMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap17 = null;
        behavior3.afterExitScope(nodeTraversal16, varMap17);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet13 = referenceCollectingCallback12.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback12.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varSet13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        com.google.javascript.jscomp.Scope scope7 = scope5.getGlobalScope();
        int int8 = scope7.getDepth();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node6, jSType7, compilerInput8, false);
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        java.lang.Class<?> wildcardClass10 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior2.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior2.afterExitScope(nodeTraversal10, varMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap14 = null;
        behavior2.afterExitScope(nodeTraversal13, varMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("", node7, jSType8, compilerInput9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(scope5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var13.setType(jSType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, varMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope19.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope19.getVars();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope19.declare("hi!", node23, jSType24, compilerInput25, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = referenceCollectingCallback16.getReferenceCollection(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, varMap14);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node13, jSType14, compilerInput15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        boolean boolean12 = scope2.isDeclared("", false);
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, varMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior2;
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior4.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, varMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection16.references = referenceList20;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection23.references = referenceList27;
        referenceCollection16.references = referenceList27;
        referenceCollection0.references = referenceList27;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection0.references;
        boolean boolean33 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior2.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior2.afterExitScope(nodeTraversal10, varMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap14 = null;
        behavior2.afterExitScope(nodeTraversal13, varMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap17 = null;
        behavior2.afterExitScope(nodeTraversal16, varMap17);
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection14.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection14.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection14.references = referenceList18;
        referenceCollection7.references = referenceList18;
        referenceCollection0.references = referenceList18;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.isWellDefined();
        boolean boolean25 = referenceCollection23.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference27 = referenceCollection26.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference28 = referenceCollection26.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection26.references = referenceList30;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection33 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference34 = referenceCollection33.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference35 = referenceCollection33.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList37, referenceArray36);
        referenceCollection33.references = referenceList37;
        referenceCollection26.references = referenceList37;
        referenceCollection23.references = referenceList37;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection42 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean43 = referenceCollection42.firstReferenceIsAssigningDeclaration();
        boolean boolean44 = referenceCollection42.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference45 = referenceCollection42.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection46 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference47 = referenceCollection46.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference48 = referenceCollection46.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray49 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList50 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList50, referenceArray49);
        referenceCollection46.references = referenceList50;
        referenceCollection42.references = referenceList50;
        referenceCollection23.references = referenceList50;
        referenceCollection0.references = referenceList50;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference56 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(reference27);
        org.junit.Assert.assertNull(reference28);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(reference34);
        org.junit.Assert.assertNull(reference35);
        org.junit.Assert.assertNotNull(referenceArray36);
        org.junit.Assert.assertArrayEquals(referenceArray36, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(reference45);
        org.junit.Assert.assertNull(reference47);
        org.junit.Assert.assertNull(reference48);
        org.junit.Assert.assertNotNull(referenceArray49);
        org.junit.Assert.assertArrayEquals(referenceArray49, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, varMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.enterScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior4.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("hi!", node8, jSType9, compilerInput10, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = var12.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        int int8 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getVars();
        int int10 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, varMap11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("hi!", node7, jSType8, compilerInput9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var10.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior4.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate13);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap8 = null;
        behavior4.afterExitScope(nodeTraversal7, varMap8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, varMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        com.google.javascript.jscomp.Scope scope7 = scope5.getGlobalScope();
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(scope7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope5.isBottom();
        com.google.javascript.jscomp.Scope scope7 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, varMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet10 = referenceCollectingCallback9.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varSet10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node6, jSType7, compilerInput8, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = scope3.getVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean8 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope5.isBottom();
        boolean boolean7 = scope5.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope5.getVars();
        boolean boolean9 = scope5.isGlobal();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope14.getTypeOfThis();
        boolean boolean16 = scope14.isGlobal();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getVar("");
        int int19 = scope14.getDepth();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var25 = scope14.declare("hi!", node21, jSType22, compilerInput23, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = referenceCollectingCallback11.getReferenceCollection(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(var18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(var25);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap10 = null;
        behavior4.afterExitScope(nodeTraversal9, varMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope19.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope19.getVars();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope19.declare("hi!", node23, jSType24, compilerInput25, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = referenceCollectingCallback16.getReferenceCollection(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, varMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback14.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("", node6, jSType7, compilerInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getVars();
        int int11 = scope8.getDepth();
        boolean boolean12 = scope8.isGlobal();
        com.google.javascript.jscomp.Scope.Var var14 = scope8.getVar("hi!");
        com.google.javascript.jscomp.Scope scope15 = scope8.getGlobalScope();
        int int16 = scope15.getVarCount();
        int int17 = scope15.getDepth();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope15.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback3.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap7 = null;
        behavior3.afterExitScope(nodeTraversal6, varMap7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior0;
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope16.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope16.getVars();
        com.google.javascript.jscomp.Scope scope19 = scope16.getGlobalScope();
        boolean boolean20 = scope16.isGlobal();
        boolean boolean21 = scope16.isLocal();
        int int22 = scope16.getDepth();
        boolean boolean23 = scope16.isBottom();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope16.declare("hi!", node25, jSType26, compilerInput27, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNotNull(scope19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection0.references = referenceList20;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(reference23);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = var14.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope9.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getVars();
        int int12 = scope9.getDepth();
        boolean boolean13 = scope9.isGlobal();
        com.google.javascript.jscomp.Scope.Var var15 = scope9.getVar("hi!");
        com.google.javascript.jscomp.Scope scope16 = scope9.getGlobalScope();
        int int17 = scope16.getVarCount();
        int int18 = scope16.getDepth();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope16.declare("hi!", node20, jSType21, compilerInput22);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback6.getReferenceCollection(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        int int10 = scope9.getVarCount();
        int int11 = scope9.getDepth();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope9.declare("hi!", node13, jSType14, compilerInput15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        boolean boolean10 = scope2.isDeclared("hi!", false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope13.getSlot("");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope13.declare("hi!", node17, jSType18, compilerInput19, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        int int11 = scope2.getDepth();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("", node13, jSType14, compilerInput15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node17, jSType18, compilerInput19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        boolean boolean10 = scope8.isGlobal();
        com.google.javascript.jscomp.Scope.Var var12 = scope8.getVar("");
        int int13 = scope8.getDepth();
        int int14 = scope8.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope8.declare("hi!", node16, jSType17, compilerInput18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback3.getReferenceCollection(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        java.lang.Class<?> wildcardClass6 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isWellDefined();
        boolean boolean9 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection7.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection7.references;
        referenceCollection0.references = referenceList11;
        boolean boolean13 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        int int9 = scope2.getVarCount();
        int int10 = scope2.getDepth();
        boolean boolean11 = scope2.isBottom();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean18 = referenceCollection0.isEscaped();
        boolean boolean19 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node10, jSType11, compilerInput12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope2.getVarCount();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = var14.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("hi!", node8, jSType9, compilerInput10, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = var12.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        boolean boolean10 = scope2.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("hi!", node9, jSType10, compilerInput11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = var12.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope10.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope10.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope scope17 = scope10.getGlobalScope();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope10.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node10, jSType11, compilerInput12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var13.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        int int10 = scope2.getVarCount();
        boolean boolean11 = scope2.isLocal();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isLocal();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope12.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getVars();
        com.google.javascript.jscomp.Scope scope15 = scope12.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var17 = scope12.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope12.getParentScope();
        com.google.javascript.jscomp.Scope.Var var20 = scope12.getVar("hi!");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope12.declare("hi!", node22, jSType23, compilerInput24, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(var17);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isGlobal();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isLocal();
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(scope2, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection16.references = referenceList20;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection23.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList27, referenceArray26);
        referenceCollection23.references = referenceList27;
        referenceCollection16.references = referenceList27;
        referenceCollection0.references = referenceList27;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection0.references;
        boolean boolean33 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNotNull(referenceArray26);
        org.junit.Assert.assertArrayEquals(referenceArray26, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getDepth();
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("");
        boolean boolean13 = scope10.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope10.declare("hi!", node15, jSType16, compilerInput17);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isLocal();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getOwnSlot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope6 = scope5.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope9.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope9.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope9.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope9.getParentScope();
        com.google.javascript.jscomp.Scope scope16 = scope9.getGlobalScope();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope9.declare("hi!", node18, jSType19, compilerInput20);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node10, jSType11, compilerInput12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        java.lang.Class<?> wildcardClass16 = referenceCollection0.getClass();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.lang.Class<?> wildcardClass5 = referenceCollectingCallback3.getClass();
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean8 = scope5.isDeclared("hi!", true);
        com.google.javascript.jscomp.Scope scope9 = scope5.getGlobalScope();
        int int10 = scope5.getVarCount();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope6.declare("hi!", node8, jSType9, compilerInput10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(objectType6);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = null;
        referenceCollection0.references = referenceList5;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollection0.isWellDefined();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("hi!", node16, jSType17, compilerInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        boolean boolean9 = scope5.isDeclared("", false);
        int int10 = scope5.getDepth();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("", node12, jSType13, compilerInput14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.lang.Class<?> wildcardClass4 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isGlobal();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var16.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope5.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope8 = scope5.getParent();
        java.lang.Class<?> wildcardClass9 = scope5.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope5.isBottom();
        boolean boolean7 = scope5.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope5.getVars();
        com.google.javascript.jscomp.Scope scope9 = scope5.getParent();
        com.google.javascript.jscomp.Scope.Var var10 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior1;
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        java.lang.Class<?> wildcardClass9 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(objectType9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList13, referenceArray12);
        referenceCollection9.references = referenceList13;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection16.references = referenceList20;
        referenceCollection9.references = referenceList20;
        boolean boolean24 = referenceCollection9.isEscaped();
        boolean boolean25 = referenceCollection9.isEscaped();
        boolean boolean26 = referenceCollection9.firstReferenceIsAssigningDeclaration();
        boolean boolean27 = referenceCollection9.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList29, referenceArray28);
        referenceCollection9.references = referenceList29;
        referenceCollection0.references = referenceList29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceArray12);
        org.junit.Assert.assertArrayEquals(referenceArray12, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceArray28);
        org.junit.Assert.assertArrayEquals(referenceArray28, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.exitScope(nodeTraversal3);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        boolean boolean11 = scope2.isBottom();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        boolean boolean11 = scope2.isLocal();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = referenceCollectingCallback13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope12.declare("", node14, jSType15, compilerInput16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node11, jSType12, compilerInput13, false);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            var15.setType(jSType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode1 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables3 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode1, false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode1 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode1.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("", node5, jSType6, compilerInput7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(scope2, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope7 = scope6.getParent();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope7.getTypeOfThis();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope7.declare("hi!", node12, jSType13, compilerInput14, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = referenceCollectingCallback3.getReferenceCollection(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getParent();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope5, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean9 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection8.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean12 = referenceCollection11.isWellDefined();
        boolean boolean13 = referenceCollection11.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection14.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection14.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList18, referenceArray17);
        referenceCollection14.references = referenceList18;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference22 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList25, referenceArray24);
        referenceCollection21.references = referenceList25;
        referenceCollection14.references = referenceList25;
        referenceCollection11.references = referenceList25;
        referenceCollection8.references = referenceList25;
        referenceCollection0.references = referenceList25;
        boolean boolean32 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNotNull(referenceArray17);
        org.junit.Assert.assertArrayEquals(referenceArray17, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference22);
        org.junit.Assert.assertNull(reference23);
        org.junit.Assert.assertNotNull(referenceArray24);
        org.junit.Assert.assertArrayEquals(referenceArray24, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean5 = scope2.isDeclared("", false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        int int11 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("", node15, jSType16, compilerInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        int int7 = scope5.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope5.getVars();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(varItor8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet14 = referenceCollectingCallback13.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.visit(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior5);
        org.junit.Assert.assertNotNull(varSet14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean18 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope10.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope10.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope scope17 = scope10.getGlobalScope();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope10.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback6.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getVarCount();
        int int9 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope14.getSlot("");
        boolean boolean17 = scope14.isBottom();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope14.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isWellDefined();
        boolean boolean9 = referenceCollection7.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection7.references;
        boolean boolean11 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection7.isWellDefined();
        boolean boolean13 = referenceCollection7.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean15 = referenceCollection14.isWellDefined();
        boolean boolean16 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean17 = referenceCollection14.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection14.references;
        referenceCollection7.references = referenceList18;
        referenceCollection0.references = referenceList18;
        boolean boolean21 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node11, jSType12, compilerInput13, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = var15.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node10, jSType11, compilerInput12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = scope17.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope17.getVars();
        com.google.javascript.jscomp.Scope scope20 = scope17.getGlobalScope();
        boolean boolean21 = scope17.isGlobal();
        boolean boolean22 = scope17.isLocal();
        com.google.javascript.rhino.Node node23 = scope17.getRootNode();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope17.declare("hi!", node25, jSType26, compilerInput27, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(varItor19);
        org.junit.Assert.assertNotNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node9, jSType10, compilerInput11, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var13.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node10, jSType11, compilerInput12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope16.getTypeOfThis();
        boolean boolean18 = scope16.isGlobal();
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getVar("");
        int int21 = scope16.getDepth();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var27 = scope16.declare("hi!", node23, jSType24, compilerInput25, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        java.lang.Class<?> wildcardClass7 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = scope6.getVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getVars();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("hi!", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var11.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection6.references = referenceList10;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList17, referenceArray16);
        referenceCollection13.references = referenceList17;
        referenceCollection6.references = referenceList17;
        referenceCollection3.references = referenceList17;
        referenceCollection0.references = referenceList17;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNotNull(referenceArray16);
        org.junit.Assert.assertArrayEquals(referenceArray16, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        boolean boolean7 = scope5.isGlobal();
        java.lang.Class<?> wildcardClass8 = scope5.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node10, jSType11, compilerInput12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean13 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope10.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope10.getVars();
        com.google.javascript.jscomp.Scope scope13 = scope10.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope13.getVars();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("hi!", node16, jSType17, compilerInput18);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("hi!", node7, jSType8, compilerInput9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("hi!", node12, jSType13, compilerInput14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        boolean boolean10 = scope2.isDeclared("", false);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        boolean boolean14 = scope2.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope16 = scope2.getGlobalScope();
        boolean boolean17 = scope16.isGlobal();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope20.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope20.getVars();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope20.declare("hi!", node24, jSType25, compilerInput26, false);
        // The following exception was thrown during execution in test generation
        try {
            scope16.undeclare(var28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(objectType21);
        org.junit.Assert.assertNotNull(varItor22);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        int int4 = scope2.getDepth();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("hi!", node6, jSType7, compilerInput8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isWellDefined();
        boolean boolean8 = referenceCollection6.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList13, referenceArray12);
        referenceCollection9.references = referenceList13;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection16.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection6.references = referenceList20;
        referenceCollection0.references = referenceList20;
        java.lang.Class<?> wildcardClass26 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceArray12);
        org.junit.Assert.assertArrayEquals(referenceArray12, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables15.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = scope6.getRootNode();
        com.google.javascript.jscomp.Scope scope8 = scope6.getParent();
        com.google.javascript.jscomp.Scope.Var var10 = scope6.getVar("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = var10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("hi!", node8, jSType9, compilerInput10, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node14, jSType15, compilerInput16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope9.getSlot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getOwnSlot("hi!");
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope6.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope13.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getVars();
        com.google.javascript.jscomp.Scope scope16 = scope13.getGlobalScope();
        boolean boolean17 = scope13.isGlobal();
        boolean boolean18 = scope13.isLocal();
        int int19 = scope13.getDepth();
        boolean boolean20 = scope13.isBottom();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope13.declare("hi!", node22, jSType23, compilerInput24, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope10.getSlot("");
        boolean boolean13 = scope10.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope10.declare("hi!", node15, jSType16, compilerInput17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = referenceCollectingCallback6.getReferenceCollection(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = scope6.getRootNode();
        com.google.javascript.jscomp.Scope scope8 = scope6.getParent();
        com.google.javascript.jscomp.Scope.Var var10 = scope6.getVar("hi!");
        int int11 = scope6.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        boolean boolean10 = scope2.isDeclared("hi!", false);
        boolean boolean11 = scope2.isBottom();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        int int9 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection6.references = referenceList10;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList17, referenceArray16);
        referenceCollection13.references = referenceList17;
        referenceCollection6.references = referenceList17;
        referenceCollection3.references = referenceList17;
        referenceCollection0.references = referenceList17;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = null;
        referenceCollection0.references = referenceList23;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNotNull(referenceArray16);
        org.junit.Assert.assertArrayEquals(referenceArray16, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet14 = referenceCollectingCallback13.getReferencedVariables();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior5);
        org.junit.Assert.assertNotNull(varSet14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNull(reference5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node8 = scope5.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope5.getVars();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(varItor9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isWellDefined();
        boolean boolean9 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection7.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection7.references;
        referenceCollection0.references = referenceList11;
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        int int10 = scope2.getVarCount();
        boolean boolean11 = scope2.isLocal();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node13, jSType14, compilerInput15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope5.isBottom();
        com.google.javascript.jscomp.Scope scope7 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = scope7.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection6.references = referenceList10;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection13.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList17, referenceArray16);
        referenceCollection13.references = referenceList17;
        referenceCollection6.references = referenceList17;
        referenceCollection3.references = referenceList17;
        referenceCollection0.references = referenceList17;
        boolean boolean23 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList24 = null;
        referenceCollection0.references = referenceList24;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference7);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertNull(reference15);
        org.junit.Assert.assertNotNull(referenceArray16);
        org.junit.Assert.assertArrayEquals(referenceArray16, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.isWellDefined();
        boolean boolean5 = referenceCollection3.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection3.references;
        referenceCollection0.references = referenceList6;
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        boolean boolean11 = scope2.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope14.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope14.getOwnSlot("");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope14.declare("hi!", node20, jSType21, compilerInput22, true);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = var15.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        boolean boolean11 = scope8.isDeclared("hi!", true);
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node11, jSType12, compilerInput13, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope15.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope15.getVars();
        com.google.javascript.jscomp.Scope scope18 = scope15.getGlobalScope();
        boolean boolean19 = scope15.isGlobal();
        boolean boolean20 = scope15.isLocal();
        int int21 = scope15.getDepth();
        boolean boolean22 = scope15.isGlobal();
        boolean boolean23 = scope15.isLocal();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope15.declare("hi!", node25, jSType26, compilerInput27, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(var29);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = var15.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        int int8 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = scope9.isGlobal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node10, jSType11, compilerInput12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var13.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean18 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        boolean boolean11 = scope2.isGlobal();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getSlot("");
        boolean boolean15 = scope2.isGlobal();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var20 = scope2.declare("", node17, jSType18, compilerInput19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getVars();
        com.google.javascript.jscomp.Scope scope11 = scope8.getGlobalScope();
        boolean boolean12 = scope8.isGlobal();
        boolean boolean13 = scope8.isLocal();
        com.google.javascript.rhino.Node node14 = scope8.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope8.declare("hi!", node16, jSType17, compilerInput18, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = null;
        referenceCollection0.references = referenceList5;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(referenceList7);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback3.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
        org.junit.Assert.assertNotNull(varSet4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback8.enterScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        com.google.javascript.jscomp.Scope scope7 = scope5.getGlobalScope();
        com.google.javascript.jscomp.Scope scope8 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = scope8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getOwnSlot("");
        boolean boolean15 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("", node19, jSType20, compilerInput21, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(var17);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        int int8 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getVars();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        boolean boolean13 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(var6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = scope6.getRootNode();
        com.google.javascript.jscomp.Scope scope8 = scope6.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = scope8.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = scope6.getRootNode();
        com.google.javascript.jscomp.Scope scope8 = scope6.getParent();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope6, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean8 = referenceCollection7.isWellDefined();
        boolean boolean9 = referenceCollection7.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection7.references;
        boolean boolean11 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection7.isWellDefined();
        boolean boolean13 = referenceCollection7.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection7.references;
        referenceCollection0.references = referenceList14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(referenceList14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean17 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection0.references;
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(reference16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceList19);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = referenceCollectingCallback8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertNotNull(referenceList4);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        int int10 = scope9.getVarCount();
        int int11 = scope9.getDepth();
        boolean boolean14 = scope9.isDeclared("", true);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope9.getVars();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet10 = referenceCollectingCallback9.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet11 = referenceCollectingCallback9.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet12 = referenceCollectingCallback9.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback9.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
        org.junit.Assert.assertNotNull(varSet10);
        org.junit.Assert.assertNotNull(varSet11);
        org.junit.Assert.assertNotNull(varSet12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        boolean boolean11 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getVar("");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        int int8 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isGlobal();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        boolean boolean9 = scope2.isLocal();
        boolean boolean10 = scope2.isBottom();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getVars();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(varItor9);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior3;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet14 = referenceCollectingCallback13.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior5);
        org.junit.Assert.assertNotNull(varSet14);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean10 = scope2.isDeclared("", false);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var15 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(var14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        java.lang.Class<?> wildcardClass5 = scope2.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet14 = referenceCollectingCallback13.getReferencedVariables();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.ObjectType objectType18 = scope17.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope17.getVars();
        int int20 = scope17.getDepth();
        boolean boolean21 = scope17.isGlobal();
        com.google.javascript.jscomp.Scope.Var var23 = scope17.getVar("");
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.JSType jSType26 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope17.declare("hi!", node25, jSType26, compilerInput27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection29 = referenceCollectingCallback13.getReferenceCollection(var28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior5);
        org.junit.Assert.assertNotNull(varSet14);
        org.junit.Assert.assertNull(objectType18);
        org.junit.Assert.assertNotNull(varItor19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet8 = referenceCollectingCallback6.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet9 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = referenceCollectingCallback6.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(varSet8);
        org.junit.Assert.assertNotNull(varSet9);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        int int10 = scope9.getVarCount();
        int int11 = scope9.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope9.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope9.getVars();
        boolean boolean15 = scope9.isGlobal();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode2 = com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables4 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode2, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode2, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode2 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY + "'", mode2.equals(com.google.javascript.jscomp.InlineVariables.Mode.CONSTANTS_ONLY));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet8 = referenceCollectingCallback6.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet9 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(varSet8);
        org.junit.Assert.assertNotNull(varSet9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope5.getTypeOfThis();
        boolean boolean8 = scope5.isGlobal();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope5, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean18 = referenceCollection17.isWellDefined();
        boolean boolean19 = referenceCollection17.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection17.references;
        boolean boolean21 = referenceCollection17.isAssignedOnceInLifetime();
        boolean boolean22 = referenceCollection17.isWellDefined();
        boolean boolean23 = referenceCollection17.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection24.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = referenceCollection24.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList28 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList28, referenceArray27);
        referenceCollection24.references = referenceList28;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection31 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference32 = referenceCollection31.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference33 = referenceCollection31.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray34 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList35 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList35, referenceArray34);
        referenceCollection31.references = referenceList35;
        referenceCollection24.references = referenceList35;
        referenceCollection17.references = referenceList35;
        referenceCollection0.references = referenceList35;
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNull(reference26);
        org.junit.Assert.assertNotNull(referenceArray27);
        org.junit.Assert.assertArrayEquals(referenceArray27, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(reference32);
        org.junit.Assert.assertNull(reference33);
        org.junit.Assert.assertNotNull(referenceArray34);
        org.junit.Assert.assertArrayEquals(referenceArray34, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        int int7 = scope5.getVarCount();
        boolean boolean8 = scope5.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope5, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.enterScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior4);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getOwnSlot("hi!");
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope8.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getVars();
        com.google.javascript.jscomp.Scope scope11 = scope8.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope11.getVars();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("hi!", node14, jSType15, compilerInput16);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.visit(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        boolean boolean9 = scope2.isGlobal();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope13.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getVars();
        com.google.javascript.jscomp.Scope scope16 = scope13.getGlobalScope();
        boolean boolean17 = scope13.isGlobal();
        boolean boolean18 = scope13.isLocal();
        int int19 = scope13.getDepth();
        boolean boolean20 = scope13.isBottom();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.JSType jSType23 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope13.declare("hi!", node22, jSType23, compilerInput24, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(var26);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope13.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getVars();
        com.google.javascript.jscomp.Scope scope16 = scope13.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getVars();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope16.declare("hi!", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope5.isBottom();
        boolean boolean7 = scope5.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope5.getVars();
        com.google.javascript.jscomp.Scope scope9 = scope5.getParent();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope5.declare("hi!", node11, jSType12, compilerInput13);
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("", node9, jSType10, compilerInput11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode5 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode5, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode5, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode5, false);
        org.junit.Assert.assertTrue("'" + mode5 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode5.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        boolean boolean9 = scope5.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope5.getOwnSlot("");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        int int7 = scope2.getDepth();
        int int8 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("hi!", node10, jSType11, compilerInput12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var13.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet7 = referenceCollectingCallback6.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet8 = referenceCollectingCallback6.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior2);
        org.junit.Assert.assertNotNull(varSet7);
        org.junit.Assert.assertNotNull(varSet8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope6.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = var14.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = var14.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope9 = scope8.getGlobalScope();
        com.google.javascript.rhino.Node node10 = scope8.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.isNeverAssigned();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isWellDefined();
        boolean boolean8 = referenceCollection6.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection6.references;
        boolean boolean10 = referenceCollection6.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection6.isWellDefined();
        boolean boolean12 = referenceCollection6.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection6.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection6.references;
        referenceCollection0.references = referenceList14;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNull(reference16);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(varItor8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean6 = referenceCollection5.isWellDefined();
        boolean boolean7 = referenceCollection5.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection5.references;
        boolean boolean9 = referenceCollection5.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean11 = referenceCollection10.isWellDefined();
        boolean boolean12 = referenceCollection10.isNeverAssigned();
        boolean boolean13 = referenceCollection10.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection10.getInitializingReferenceForConstants();
        boolean boolean15 = referenceCollection10.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean17 = referenceCollection16.isWellDefined();
        boolean boolean18 = referenceCollection16.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = referenceCollection19.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList23, referenceArray22);
        referenceCollection19.references = referenceList23;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection26 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference27 = referenceCollection26.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference28 = referenceCollection26.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList30, referenceArray29);
        referenceCollection26.references = referenceList30;
        referenceCollection19.references = referenceList30;
        referenceCollection16.references = referenceList30;
        referenceCollection10.references = referenceList30;
        referenceCollection5.references = referenceList30;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection37 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean38 = referenceCollection37.isWellDefined();
        boolean boolean39 = referenceCollection37.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection40 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean41 = referenceCollection40.isWellDefined();
        boolean boolean42 = referenceCollection40.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = referenceCollection40.references;
        referenceCollection37.references = referenceList43;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection45 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean46 = referenceCollection45.firstReferenceIsAssigningDeclaration();
        boolean boolean47 = referenceCollection45.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection48 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean49 = referenceCollection48.isWellDefined();
        boolean boolean50 = referenceCollection48.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection51 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference52 = referenceCollection51.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference53 = referenceCollection51.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray54 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList55 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList55, referenceArray54);
        referenceCollection51.references = referenceList55;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection58 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference59 = referenceCollection58.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference60 = referenceCollection58.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray61 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList62 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList62, referenceArray61);
        referenceCollection58.references = referenceList62;
        referenceCollection51.references = referenceList62;
        referenceCollection48.references = referenceList62;
        referenceCollection45.references = referenceList62;
        referenceCollection37.references = referenceList62;
        referenceCollection5.references = referenceList62;
        referenceCollection0.references = referenceList62;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNull(reference21);
        org.junit.Assert.assertNotNull(referenceArray22);
        org.junit.Assert.assertArrayEquals(referenceArray22, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference27);
        org.junit.Assert.assertNull(reference28);
        org.junit.Assert.assertNotNull(referenceArray29);
        org.junit.Assert.assertArrayEquals(referenceArray29, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(referenceList43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(reference52);
        org.junit.Assert.assertNull(reference53);
        org.junit.Assert.assertNotNull(referenceArray54);
        org.junit.Assert.assertArrayEquals(referenceArray54, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(reference59);
        org.junit.Assert.assertNull(reference60);
        org.junit.Assert.assertNotNull(referenceArray61);
        org.junit.Assert.assertArrayEquals(referenceArray61, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean8 = scope2.isLocal();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(varItor7);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("");
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getVarCount();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isEscaped();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(reference6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope6.getOwnSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(scope8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node8 = scope5.getRootNode();
        int int9 = scope5.getVarCount();
        com.google.javascript.jscomp.Scope scope10 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = scope10.getRootNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope9.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getVars();
        com.google.javascript.jscomp.Scope scope12 = scope9.getGlobalScope();
        com.google.javascript.jscomp.Scope scope13 = scope12.getGlobalScope();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope13.declare("hi!", node15, jSType16, compilerInput17, false);
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isWellDefined();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4, varPredicate5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR = behavior4;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        int int7 = scope2.getDepth();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode4 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables6 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables8 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode4, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode4, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode4, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode4 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode4.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope9.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getVars();
        int int12 = scope9.getDepth();
        com.google.javascript.jscomp.Scope scope13 = scope9.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope9.getVars();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope9.declare("hi!", node16, jSType17, compilerInput18, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(scope13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6, varPredicate7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.enterScope(nodeTraversal17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        java.lang.Class<?> wildcardClass9 = varItor8.getClass();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isWellDefined();
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isWellDefined();
        boolean boolean8 = referenceCollection6.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection9.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList13, referenceArray12);
        referenceCollection9.references = referenceList13;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection16.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection16.references = referenceList20;
        referenceCollection9.references = referenceList20;
        referenceCollection6.references = referenceList20;
        referenceCollection0.references = referenceList20;
        boolean boolean26 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceArray12);
        org.junit.Assert.assertArrayEquals(referenceArray12, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(reference17);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        int int9 = scope2.getVarCount();
        int int10 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(scope2, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getDepth();
        int int7 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("hi!");
        boolean boolean12 = scope2.isDeclared("", false);
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode3 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables5 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables7 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode3, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode3, false);
        java.lang.Class<?> wildcardClass10 = inlineVariables9.getClass();
        org.junit.Assert.assertTrue("'" + mode3 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode3.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getOwnSlot("hi!");
        com.google.javascript.rhino.Node node8 = scope5.getRootNode();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope5.declare("hi!", node10, jSType11, compilerInput12, false);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var14.setType(jSType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope6 = scope5.getGlobalScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope6.declare("hi!", node8, jSType9, compilerInput10, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = var12.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = referenceCollectingCallback2.shouldTraverse(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior1);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        int int10 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope scope11 = scope2.getParent();
        boolean boolean12 = scope2.isGlobal();
        boolean boolean13 = scope2.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("", node15, jSType16, compilerInput17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        boolean boolean11 = scope2.isBottom();
        int int12 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope13 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope14 = scope13.getParent();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(scope14);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope5.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope5.getSlot("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSTypeStaticSlot10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var11.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList7);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        java.lang.Class<?> wildcardClass5 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet4 = referenceCollectingCallback3.getReferencedVariables();
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet5 = referenceCollectingCallback3.getReferencedVariables();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = referenceCollectingCallback3.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varSet4);
        org.junit.Assert.assertNotNull(varSet5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope8.declare("hi!", node10, jSType11, compilerInput12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var13.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList4, referenceArray3);
        referenceCollection0.references = referenceList4;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection7.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList11, referenceArray10);
        referenceCollection7.references = referenceList11;
        referenceCollection0.references = referenceList11;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        boolean boolean17 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean18 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList20, referenceArray19);
        referenceCollection0.references = referenceList20;
        boolean boolean23 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean24 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertNotNull(referenceArray3);
        org.junit.Assert.assertArrayEquals(referenceArray3, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNotNull(referenceArray10);
        org.junit.Assert.assertArrayEquals(referenceArray10, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(referenceArray19);
        org.junit.Assert.assertArrayEquals(referenceArray19, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getVars();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope11.declare("hi!", node15, jSType16, compilerInput17, false);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        int int6 = scope5.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope5.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope5.getSlot("");
        com.google.javascript.jscomp.Scope scope11 = scope5.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = scope11.getGlobalScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        boolean boolean7 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        boolean boolean4 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        boolean boolean10 = scope2.isDeclared("", false);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("");
        com.google.javascript.jscomp.Scope scope15 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate8);
        java.util.Set<com.google.javascript.jscomp.Scope.Var> varSet10 = referenceCollectingCallback9.getReferencedVariables();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope13.getSlot("");
        boolean boolean16 = scope13.isBottom();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope13.declare("hi!", node18, jSType19, compilerInput20, true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = referenceCollectingCallback9.getReferenceCollection(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(behavior3);
        org.junit.Assert.assertNotNull(varSet10);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean8 = scope5.isDeclared("hi!", true);
        com.google.javascript.rhino.Node node9 = scope5.getRootNode();
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node6 = scope5.getRootNode();
        boolean boolean7 = scope5.isGlobal();
        com.google.javascript.jscomp.Scope scope8 = scope5.getGlobalScope();
        int int9 = scope5.getVarCount();
        com.google.javascript.jscomp.Scope scope10 = scope5.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope5.getSlot("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSTypeStaticSlot12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference2 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isEscaped();
        boolean boolean5 = referenceCollection0.isWellDefined();
        boolean boolean6 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNull(reference2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.lang.Class<?> wildcardClass3 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isLocal();
        int int8 = scope2.getDepth();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.ObjectType objectType3 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        int int5 = scope2.getDepth();
        boolean boolean6 = scope2.isGlobal();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope11 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = scope11.getVarCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectType3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(objectType10);
        org.junit.Assert.assertNull(scope11);
    }
}

