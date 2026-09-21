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
        com.google.javascript.jscomp.RenameLabels renameLabels0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels1 = renameLabels0.new ProcessLabels();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to com.google.javascript.jscomp.RenameLabels$ProcessLabels with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.Class<?> wildcardClass2 = defaultNameSupplier0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels1.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels1.process(node2, node3);
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
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels2.visit(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = processLabels2.getNameForId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = processLabels2.shouldTraverse(nodeTraversal3, node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.Class<?> wildcardClass6 = labelNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_b", node7, node8, "d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("b", node7, node8, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_a", node7, node8, "d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.lang.Class<?> wildcardClass3 = renameLabels1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = processLabels3.shouldTraverse(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_b", node6, node7, "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("a", node6, node7, "JSCompiler_inline_label_b", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels4.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node5, node6, "", false, true);
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
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("d", node5, node6, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        java.lang.Class<?> wildcardClass13 = labelNameSupplier6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.Class<?> wildcardClass2 = labelNameSupplier1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = processLabels4.getNameForId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels7.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_b", node8, node9, "JSCompiler_inline_label_a", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier1.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        java.lang.String str6 = labelNameSupplier5.get();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("", node5, node6, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        java.lang.Class<?> wildcardClass10 = labelNameSupplier5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("a", node6, node7, "a", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "a", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("d", node4, node5, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        java.lang.Class<?> wildcardClass8 = defaultNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels7.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        java.lang.Class<?> wildcardClass4 = labelNameSupplier3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_a", node5, node6, "JSCompiler_inline_label_JSCompiler_inline_label_c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node7, node8, "d", false, true);
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
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("", node7, node8, "JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = labelNameSupplier1.idSupplier;
        java.lang.Class<?> wildcardClass3 = labelNameSupplier1.getClass();
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("hi!", node4, node5, "JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = processLabels7.getNameForId((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels1.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.Class<?> wildcardClass4 = functionToBlockMutator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels8.exitScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels8.exitScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels2.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_c", node8, node9, "a", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier1.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        java.lang.String str7 = labelNameSupplier4.get();
        java.lang.Class<?> wildcardClass8 = labelNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        java.lang.Class<?> wildcardClass10 = renameLabels7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels7.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.Class<?> wildcardClass7 = labelNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("", node4, node5, "d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.enterScope(nodeTraversal4);
        java.lang.Class<?> wildcardClass6 = processLabels3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels6.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = processLabels8.getNameForId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node5, node6, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "b" + "'", str12, "b");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = labelNameSupplier1.idSupplier;
        java.lang.String str3 = labelNameSupplier1.get();
        java.lang.String str4 = labelNameSupplier1.get();
        java.lang.Class<?> wildcardClass5 = labelNameSupplier1.getClass();
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_b" + "'", str4, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        java.lang.Class<?> wildcardClass3 = nameGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_a", node10, node11, "JSCompiler_inline_label_d", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node9, node10, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        java.lang.Class<?> wildcardClass4 = renameLabels3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels3.process(node5, node6);
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
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_b", node8, node9, "JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        java.lang.Class<?> wildcardClass5 = processLabels4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        java.lang.Class<?> wildcardClass9 = renameLabels7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.String str8 = labelNameSupplier2.get();
        java.lang.Class<?> wildcardClass9 = labelNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier5, false);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels7.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels8.visit(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels3.visit(nodeTraversal4, node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.Class<?> wildcardClass8 = labelNameSupplier7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node10, node11, "a", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node5, node6, "a", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels14.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("a", node10, node11, "a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels7.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = processLabels10.getNameForId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.Class<?> wildcardClass11 = defaultNameSupplier3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        java.lang.Class<?> wildcardClass9 = nameGenerator8.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node11, node12, "c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("b", node8, node9, "c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_d", node6, node7, "f", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels13.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        java.lang.Class<?> wildcardClass11 = labelNameSupplier9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels14.process(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = processLabels3.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("e", node5, node6, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("c", node5, node6, "e", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("hi!", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node8, node9, "JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_c", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_d", node6, node7, "JSCompiler_inline_label_a", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node5, node6, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_e", node5, node6, "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels8.exitScope(nodeTraversal9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node11, node12, "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = processLabels9.getNameForId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.Class<?> wildcardClass7 = labelNameSupplier6.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = processLabels10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = processLabels7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels2.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels2.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels2.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels4.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = processLabels4.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier5, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels8.visit(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.Class<?> wildcardClass4 = functionToBlockMutator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels4.new ProcessLabels();
        java.lang.Class<?> wildcardClass6 = processLabels5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_d", node6, node7, "d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.Class<?> wildcardClass9 = renameLabels8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier6, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str7 = labelNameSupplier6.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        java.lang.Class<?> wildcardClass6 = labelNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_e", node7, node8, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels14.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = processLabels16.getNameForId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 96 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("", node11, node12, "JSCompiler_inline_label_c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str7 = labelNameSupplier3.get();
        java.lang.Class<?> wildcardClass8 = labelNameSupplier3.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_e", node6, node7, "b", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels1.new ProcessLabels();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels1.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("e", node7, node8, "JSCompiler_inline_label_c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_d", node6, node7, "JSCompiler_inline_label_c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.Class<?> wildcardClass6 = defaultNameSupplier1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        java.lang.Class<?> wildcardClass5 = renameLabels3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("e", node5, node6, "b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        java.lang.Class<?> wildcardClass8 = processLabels7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels7.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels16 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels16.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_c", node11, node12, "JSCompiler_inline_label_c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("e", node7, node8, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        java.lang.String str9 = defaultNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("f", node8, node9, "a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = processLabels5.shouldTraverse(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels4.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels5.visit(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str11 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(nameGenerator12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        java.lang.String str4 = labelNameSupplier3.get();
        java.lang.String str5 = labelNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str4, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str5, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels8.exitScope(nodeTraversal9);
        java.util.ArrayList<java.lang.String> strList11 = processLabels8.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels8.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList4 = processLabels3.names;
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node7, node8, "c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("a", node7, node8, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node10, node11, "JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels10.new ProcessLabels();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("hi!", node14, node15, "hi!", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        java.lang.String str4 = defaultNameSupplier0.get();
        java.lang.String str5 = defaultNameSupplier0.get();
        java.lang.Class<?> wildcardClass6 = defaultNameSupplier0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels2.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels2.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = processLabels2.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        java.lang.Class<?> wildcardClass10 = processLabels9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("d", node8, node9, "JSCompiler_inline_label_d", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        java.lang.Class<?> wildcardClass5 = nameGenerator4.getClass();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels17 = renameLabels14.new ProcessLabels();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels14.process(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("c", node14, node15, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.Class<?> wildcardClass11 = labelNameSupplier5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("", node11, node12, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = processLabels11.getNameForId(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        processLabels2.enterScope(nodeTraversal3);
        java.util.ArrayList<java.lang.String> strList5 = processLabels2.names;
        java.lang.Class<?> wildcardClass6 = processLabels2.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_e", node9, node10, "JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        processLabels2.enterScope(nodeTraversal3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = processLabels2.getNameForId((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        java.lang.String str12 = labelNameSupplier9.get();
        java.lang.String str13 = labelNameSupplier9.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_d" + "'", str13, "JSCompiler_inline_label_JSCompiler_inline_label_d");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node14, node15, "JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("d", node12, node13, "a", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str7 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("c", node10, node11, "JSCompiler_inline_label_e", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        java.lang.Class<?> wildcardClass9 = defaultNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("b", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels renameLabels16 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels17 = renameLabels16.new ProcessLabels();
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_b", node11, node12, "e", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels1.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("d", node7, node8, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.Class<?> wildcardClass5 = defaultNameSupplier0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node9, node10, "JSCompiler_inline_label_e", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_c", node7, node8, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        java.lang.Class<?> wildcardClass7 = defaultNameSupplier1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        java.lang.String str6 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.Class<?> wildcardClass8 = labelNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        java.lang.String str13 = defaultNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "c" + "'", str13, "c");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels7.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.Class<?> wildcardClass8 = functionToBlockMutator7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.Class<?> wildcardClass10 = renameLabels9.getClass();
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertNotNull(nameGenerator9);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator18 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = functionToBlockMutator18.mutate("c", node20, node21, "JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels6 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        processLabels6.exitScope(nodeTraversal7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels6.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("", node11, node12, "a", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.Class<?> wildcardClass15 = defaultNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.Class<?> wildcardClass10 = defaultNameSupplier2.getClass();
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier4.idSupplier;
        java.lang.Class<?> wildcardClass8 = strSupplier7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels6.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels12.visit(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator18 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = functionToBlockMutator18.mutate("b", node20, node21, "f", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("a", node7, node8, "JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str7 = defaultNameSupplier3.get();
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_d", node6, node7, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node6, node7, "JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        java.lang.String str7 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("a", node10, node11, "c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_c", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_c", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_d", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        java.lang.String str4 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_JSCompiler_inline_label_d", node7, node8, "JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels2.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels2.visit(nodeTraversal6, node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = processLabels4.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str7 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b" + "'", str5, "b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c" + "'", str7, "c");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList10 = processLabels9.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        processLabels9.enterScope(nodeTraversal11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        java.lang.String str6 = labelNameSupplier2.get();
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.String str8 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier2.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier5.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator18 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = functionToBlockMutator18.mutate("JSCompiler_inline_label_a", node20, node21, "a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        java.lang.Class<?> wildcardClass10 = nameGenerator9.getClass();
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels4.new ProcessLabels();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels4.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str7 = defaultNameSupplier2.get();
        java.lang.String str8 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_e", node6, node7, "b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("c", node12, node13, "e", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        processLabels4.exitScope(nodeTraversal5);
        java.lang.Class<?> wildcardClass7 = processLabels4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels1.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = processLabels5.getNameForId((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 99 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str7 = defaultNameSupplier3.get();
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str11 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c" + "'", str11, "c");
        org.junit.Assert.assertNotNull(nameGenerator12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("", node10, node11, "e", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels11.visit(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels10.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList14 = processLabels13.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels13.visit(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.Class<?> wildcardClass11 = labelNameSupplier10.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels12.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList14 = processLabels13.names;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("hi!", node11, node12, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        java.lang.String str4 = defaultNameSupplier0.get();
        java.lang.Class<?> wildcardClass5 = defaultNameSupplier0.getClass();
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str3 = defaultNameSupplier2.get();
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str8 = defaultNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels6.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList9 = processLabels8.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        processLabels8.exitScope(nodeTraversal10);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels5.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels5.visit(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = processLabels8.getNameForId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("c", node6, node7, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("a", node4, node5, "JSCompiler_inline_label_c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels3.enterScope(nodeTraversal6);
        java.util.ArrayList<java.lang.String> strList8 = processLabels3.names;
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = processLabels12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.Class<?> wildcardClass11 = labelNameSupplier5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.Class<?> wildcardClass7 = defaultNameSupplier1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("JSCompiler_inline_label_e", node14, node15, "b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels2.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels2.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, false);
        java.lang.String str7 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("e", node6, node7, "JSCompiler_inline_label_e", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.String str12 = labelNameSupplier5.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_b", node10, node11, "JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.enterScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels3.exitScope(nodeTraversal6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels11.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList13 = processLabels12.names;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str8 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.exitScope(nodeTraversal12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str9 = labelNameSupplier8.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier8.idSupplier;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_a" + "'", str9, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node10, node11, "JSCompiler_inline_label_JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("b", node8, node9, "JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        java.lang.String str12 = labelNameSupplier9.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier9.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_e", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str3 = defaultNameSupplier2.get();
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c" + "'", str7, "c");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node4, node5, "JSCompiler_inline_label_JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels12.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = processLabels13.getNameForId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_b", node10, node11, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("JSCompiler_inline_label_c", node6, node7, "JSCompiler_inline_label_a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels3.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = processLabels3.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, strSupplier6, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier6);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("d", node11, node12, "d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str8 = labelNameSupplier7.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.Class<?> wildcardClass8 = renameLabels7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str3 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        java.lang.String str11 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("c", node14, node15, "JSCompiler_inline_label_JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels12.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = processLabels13.getNameForId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        java.lang.String str10 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_d" + "'", str10, "JSCompiler_inline_label_d");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("f", node4, node5, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_JSCompiler_inline_label_d", node10, node11, "d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = functionToBlockMutator11.mutate("e", node13, node14, "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_b", node11, node12, "JSCompiler_inline_label_JSCompiler_inline_label_c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str8 = defaultNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str7 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier3.nameGenerator;
        java.lang.String str10 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "b" + "'", str10, "b");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier8.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_e", node11, node12, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.Class<?> wildcardClass13 = renameLabels12.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_d", node7, node8, "", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels14.new ProcessLabels();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels14.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        java.lang.String str11 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("d", node14, node15, "hi!", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node7, node8, "a", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels11.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        processLabels12.enterScope(nodeTraversal13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = processLabels12.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        java.lang.String str7 = labelNameSupplier4.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier4.idSupplier;
        java.lang.String str9 = labelNameSupplier4.get();
        java.lang.Class<?> wildcardClass10 = labelNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("a", node10, node11, "JSCompiler_inline_label_JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("JSCompiler_inline_label_a", node14, node15, "JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        java.lang.String str10 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        java.lang.String str13 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier14 = labelNameSupplier3.idSupplier;
        java.lang.Class<?> wildcardClass15 = strSupplier14.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_d" + "'", str10, "JSCompiler_inline_label_d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_e" + "'", str13, "JSCompiler_inline_label_e");
        org.junit.Assert.assertNotNull(strSupplier14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str8 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = processLabels9.getNameForId((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -2 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.Class<?> wildcardClass6 = labelNameSupplier2.getClass();
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.String str11 = labelNameSupplier6.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier6.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier13);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = functionToBlockMutator15.mutate("JSCompiler_inline_label_JSCompiler_inline_label_d", node17, node18, "e", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_d", node5, node6, "JSCompiler_inline_label_JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = labelNameSupplier1.idSupplier;
        java.lang.String str3 = labelNameSupplier1.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier1.idSupplier;
        java.lang.Class<?> wildcardClass5 = labelNameSupplier1.getClass();
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.String str8 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier9);
        java.lang.String str11 = labelNameSupplier10.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_d" + "'", str11, "JSCompiler_inline_label_d");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str12 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier3.nameGenerator;
        java.lang.Class<?> wildcardClass14 = nameGenerator13.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c" + "'", str12, "c");
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels4.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier5, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier5);
        java.lang.String str9 = labelNameSupplier8.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("", node5, node6, "JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier2.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8, false);
        java.lang.Class<?> wildcardClass12 = labelNameSupplier8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str4 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        java.lang.String str8 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node11, node12, "", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier5.idSupplier;
        java.lang.Class<?> wildcardClass10 = labelNameSupplier5.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels14.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels8.exitScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels8.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        processLabels4.enterScope(nodeTraversal5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier2.idSupplier;
        java.lang.String str9 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier2.idSupplier;
        java.lang.String str11 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_c" + "'", str11, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str8 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier2.idSupplier;
        java.lang.String str10 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.String str10 = labelNameSupplier5.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels5.exitScope(nodeTraversal6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        java.lang.String str4 = labelNameSupplier2.get();
        java.lang.String str5 = labelNameSupplier2.get();
        java.lang.String str6 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_c" + "'", str6, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier8, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        processLabels4.exitScope(nodeTraversal5);
        java.util.ArrayList<java.lang.String> strList7 = processLabels4.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = processLabels4.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier2.idSupplier;
        java.lang.String str7 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        java.lang.String str4 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertNotNull(nameGenerator5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("b", node11, node12, "JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("e", node11, node12, "hi!", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str8 = labelNameSupplier4.get();
        java.lang.String str9 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node8, node9, "JSCompiler_inline_label_c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str8 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_b", node11, node12, "d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier4.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_d", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertNotNull(nameGenerator9);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator7);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.Class<?> wildcardClass7 = defaultNameSupplier1.getClass();
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier6 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler5, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels18 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator19 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        java.lang.String str20 = defaultNameSupplier6.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator21 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node28 = functionToBlockMutator21.mutate("", node23, node24, "JSCompiler_inline_label_JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator14);
        org.junit.Assert.assertNotNull(nameGenerator16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str10 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "g" + "'", str10, "g");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str10 = defaultNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier0.nameGenerator;
        java.lang.Class<?> wildcardClass6 = nameGenerator5.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        java.lang.String str4 = defaultNameSupplier0.get();
        java.lang.String str5 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier0.nameGenerator;
        java.lang.String str7 = defaultNameSupplier0.get();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "e" + "'", str5, "e");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier4.idSupplier;
        java.lang.String str9 = labelNameSupplier4.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.String str8 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier2.idSupplier;
        java.lang.Class<?> wildcardClass10 = labelNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier4.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c" + "'", str7, "c");
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier5 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        java.lang.String str7 = labelNameSupplier6.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.common.base.Supplier<java.lang.String> strSupplier15 = labelNameSupplier8.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, strSupplier15, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator18 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier15);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_a" + "'", str7, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier15);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str10 = defaultNameSupplier2.get();
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str9 = defaultNameSupplier4.get();
        java.lang.String str10 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels16 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels16.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "b" + "'", str10, "b");
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        java.lang.String str7 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_c" + "'", str7, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str8 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_e", node11, node12, "JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = processLabels8.getNameForId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 51 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier1.nameGenerator;
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node9, node10, "JSCompiler_inline_label_a", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node11, node12, "b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.Class<?> wildcardClass9 = defaultNameSupplier2.getClass();
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier10.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier10.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(strSupplier12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.Class<?> wildcardClass7 = renameLabels6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier5.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        processLabels11.exitScope(nodeTraversal14);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        java.lang.String str8 = defaultNameSupplier1.get();
        java.lang.String str9 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("JSCompiler_inline_label_d", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.String str13 = labelNameSupplier6.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str13, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_a", node10, node11, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = processLabels4.shouldTraverse(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.exitScope(nodeTraversal12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str8 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str13 = labelNameSupplier12.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_b" + "'", str13, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels7.new ProcessLabels();
        java.lang.Class<?> wildcardClass10 = processLabels9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier1.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier1.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier1.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier1.idSupplier;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node12, node13, "c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = processLabels10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        java.lang.String str3 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertNotNull(nameGenerator4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("b", node10, node11, "JSCompiler_inline_label_c", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels4.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList6 = processLabels5.names;
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        java.lang.String str11 = labelNameSupplier9.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        java.lang.String str13 = labelNameSupplier12.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_d" + "'", str13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_d");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        java.lang.String str10 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier3.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier11);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier10, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertNotNull(nameGenerator14);
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        java.lang.Class<?> wildcardClass16 = renameLabels14.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier7);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels16 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels17 = renameLabels16.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        processLabels17.enterScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        processLabels17.exitScope(nodeTraversal20);
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels16 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels17 = renameLabels16.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = processLabels17.getNameForId((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str14 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c" + "'", str14, "c");
        org.junit.Assert.assertNotNull(nameGenerator15);
        org.junit.Assert.assertNotNull(nameGenerator16);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str8 = defaultNameSupplier4.get();
        java.lang.String str9 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node14, node15, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, strSupplier8);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier8, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_e", node10, node11, "c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        java.lang.String str7 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_d", node11, node12, "JSCompiler_inline_label_JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        java.lang.String str9 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str11 = defaultNameSupplier2.get();
        java.lang.String str12 = defaultNameSupplier2.get();
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c" + "'", str12, "c");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        processLabels4.enterScope(nodeTraversal5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        java.lang.String str10 = labelNameSupplier7.get();
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_a" + "'", str10, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("c", node11, node12, "f", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier4.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node10, node11, "JSCompiler_inline_label_JSCompiler_inline_label_a", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        java.lang.Class<?> wildcardClass13 = nameGenerator12.getClass();
        org.junit.Assert.assertNotNull(nameGenerator11);
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator13 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node20 = functionToBlockMutator13.mutate("e", node15, node16, "g", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "b" + "'", str8, "b");
        org.junit.Assert.assertNotNull(nameGenerator11);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier8.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str8 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_b", node11, node12, "JSCompiler_inline_label_d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = functionToBlockMutator3.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node5, node6, "JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels14 = renameLabels10.new ProcessLabels();
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        java.lang.String str10 = labelNameSupplier5.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier5.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier12);
        java.lang.String str14 = labelNameSupplier13.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str14, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels7.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        processLabels8.enterScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        processLabels8.enterScope(nodeTraversal11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        processLabels8.enterScope(nodeTraversal13);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        java.lang.String str4 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = defaultNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = processLabels11.getNameForId((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels15 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13, false);
        org.junit.Assert.assertNotNull(nameGenerator12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str6 = defaultNameSupplier2.get();
        java.lang.String str7 = defaultNameSupplier2.get();
        java.lang.String str8 = defaultNameSupplier2.get();
        java.lang.String str9 = defaultNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "c" + "'", str8, "c");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier1.nameGenerator;
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("f", node10, node11, "", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.String str11 = labelNameSupplier6.get();
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels14 = renameLabels13.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = processLabels14.getNameForId((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 34 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str3 = defaultNameSupplier2.get();
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str10 = defaultNameSupplier3.get();
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        java.lang.String str4 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str6 = labelNameSupplier5.get();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_e" + "'", str6, "JSCompiler_inline_label_e");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        java.util.ArrayList<java.lang.String> strList4 = processLabels2.names;
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels8 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels6.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        processLabels9.enterScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels9.visit(nodeTraversal12, node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str7 = labelNameSupplier2.get();
        java.lang.String str8 = labelNameSupplier2.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("JSCompiler_inline_label_a", node11, node12, "c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList3 = processLabels2.names;
        java.util.ArrayList<java.lang.String> strList4 = processLabels2.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = processLabels2.getNameForId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "c" + "'", str5, "c");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier13);
        java.lang.Class<?> wildcardClass15 = strSupplier13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        java.lang.String str4 = defaultNameSupplier0.get();
        java.lang.String str5 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier0.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b" + "'", str5, "b");
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier6.idSupplier;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels11.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str9 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str12 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_c" + "'", str12, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier9.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier10, true);
        java.lang.Class<?> wildcardClass13 = renameLabels12.getClass();
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels11.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        processLabels12.enterScope(nodeTraversal13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = processLabels12.shouldTraverse(nodeTraversal15, node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str6 = defaultNameSupplier2.get();
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = functionToBlockMutator4.mutate("", node6, node7, "JSCompiler_inline_label_JSCompiler_inline_label_d", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier8);
        java.lang.String str10 = labelNameSupplier9.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier7, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier6, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        processLabels9.exitScope(nodeTraversal10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier11.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str8 = labelNameSupplier7.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier7.idSupplier;
        java.lang.String str10 = labelNameSupplier7.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier7.idSupplier;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(strSupplier11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier6.idSupplier;
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier3.nameGenerator;
        java.lang.String str10 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str13 = defaultNameSupplier3.get();
        java.lang.String str14 = defaultNameSupplier3.get();
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "b" + "'", str13, "b");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "c" + "'", str14, "c");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier10.idSupplier;
        java.lang.String str12 = labelNameSupplier10.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels3.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels4.visit(nodeTraversal5, node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels3.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels3.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processLabels3.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier8, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        java.lang.String str6 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8, false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = functionToBlockMutator11.mutate("JSCompiler_inline_label_b", node13, node14, "b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        java.lang.String str10 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        java.lang.String str13 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier14 = labelNameSupplier3.idSupplier;
        java.lang.String str15 = labelNameSupplier3.get();
        java.lang.String str16 = labelNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_d" + "'", str10, "JSCompiler_inline_label_d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_e" + "'", str13, "JSCompiler_inline_label_e");
        org.junit.Assert.assertNotNull(strSupplier14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSCompiler_inline_label_f" + "'", str15, "JSCompiler_inline_label_f");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "JSCompiler_inline_label_g" + "'", str16, "JSCompiler_inline_label_g");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels10.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier5, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier5);
        java.lang.String str9 = labelNameSupplier8.get();
        java.lang.String str10 = labelNameSupplier8.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        processLabels3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels3.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels3.exitScope(nodeTraversal8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = processLabels3.getNameForId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("d", node11, node12, "c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = functionToBlockMutator5.mutate("d", node7, node8, "JSCompiler_inline_label_f", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        java.lang.String str9 = labelNameSupplier6.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        java.lang.String str8 = defaultNameSupplier3.get();
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str13 = defaultNameSupplier3.get();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "c" + "'", str13, "c");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("", node9, node10, "f", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str7 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        java.lang.String str12 = labelNameSupplier10.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator13 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str12, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        java.lang.String str8 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        org.junit.Assert.assertNotNull(nameGenerator5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str7 = labelNameSupplier6.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        java.lang.String str9 = labelNameSupplier6.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        processLabels11.exitScope(nodeTraversal14);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        processLabels16.enterScope(nodeTraversal17);
        java.lang.Class<?> wildcardClass19 = processLabels16.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, true);
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels17 = renameLabels14.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        processLabels17.enterScope(nodeTraversal18);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = labelNameSupplier1.idSupplier;
        java.lang.String str3 = labelNameSupplier1.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier1.idSupplier;
        java.lang.String str5 = labelNameSupplier1.get();
        java.lang.String str6 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_c" + "'", str6, "JSCompiler_inline_label_c");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.common.base.Supplier<java.lang.String> strSupplier1 = null;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = functionToBlockMutator2.mutate("e", node4, node5, "JSCompiler_inline_label_JSCompiler_inline_label_c", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        java.lang.String str11 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = functionToBlockMutator12.mutate("g", node14, node15, "JSCompiler_inline_label_f", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_b");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels7 = renameLabels6.new ProcessLabels();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels6.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str8 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = functionToBlockMutator9.mutate("c", node11, node12, "g", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("g", node12, node13, "b", false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier7 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler6, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7, true);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler5, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7, false);
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier7.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7);
        com.google.javascript.jscomp.NameGenerator nameGenerator17 = defaultNameSupplier7.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels19 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator20 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7);
        java.lang.String str21 = defaultNameSupplier7.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator22 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7);
        com.google.javascript.jscomp.RenameLabels renameLabels24 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier7, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels24.process(node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator15);
        org.junit.Assert.assertNotNull(nameGenerator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a" + "'", str21, "a");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str10 = labelNameSupplier4.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier4.idSupplier;
        java.lang.Class<?> wildcardClass12 = labelNameSupplier4.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier5.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_JSCompiler_inline_label_c", node9, node10, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_c", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier4 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        java.lang.String str8 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4, false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.String str9 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels12.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels3 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels4 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels5 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels5.enterScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        processLabels5.enterScope(nodeTraversal8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = processLabels5.getNameForId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 9 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        java.util.ArrayList<java.lang.String> strList14 = processLabels11.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = processLabels11.getNameForId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 31 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.Class<?> wildcardClass10 = defaultNameSupplier2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        java.lang.String str7 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = functionToBlockMutator11.mutate("JSCompiler_inline_label_b", node13, node14, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
        org.junit.Assert.assertNotNull(nameGenerator10);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator12 = defaultNameSupplier3.nameGenerator;
        java.lang.String str13 = defaultNameSupplier3.get();
        java.lang.String str14 = defaultNameSupplier3.get();
        org.junit.Assert.assertNotNull(nameGenerator11);
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "b" + "'", str14, "b");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier5.idSupplier;
        java.lang.String str8 = labelNameSupplier5.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str9 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels8.new ProcessLabels();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels8.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }
}

