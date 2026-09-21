package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        java.lang.String str8 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(nameGenerator9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        java.lang.String str8 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("f", node9, node10, "e", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier5.get();
        java.lang.String str7 = labelNameSupplier5.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        processLabels10.exitScope(nodeTraversal11);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_a" + "'", str6, "JSCompiler_inline_label_JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_JSCompiler_inline_label_b");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator13 = defaultNameSupplier3.nameGenerator;
        java.lang.String str14 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier3.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator11);
        org.junit.Assert.assertNotNull(nameGenerator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a" + "'", str14, "a");
        org.junit.Assert.assertNotNull(nameGenerator15);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str3 = defaultNameSupplier2.get();
        java.lang.String str4 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "b" + "'", str4, "b");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier8 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler7, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8, true);
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler6, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8, false);
        com.google.javascript.jscomp.RenameLabels renameLabels15 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler5, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier8.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier17 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8);
        com.google.javascript.jscomp.NameGenerator nameGenerator18 = defaultNameSupplier8.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels20 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator21 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8);
        java.lang.String str22 = defaultNameSupplier8.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator23 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8);
        java.lang.String str24 = defaultNameSupplier8.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator25 = defaultNameSupplier8.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels27 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator28 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier8);
        java.lang.String str29 = defaultNameSupplier8.get();
        org.junit.Assert.assertNotNull(nameGenerator16);
        org.junit.Assert.assertNotNull(nameGenerator18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "b" + "'", str24, "b");
        org.junit.Assert.assertNotNull(nameGenerator25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "c" + "'", str29, "c");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        java.lang.String str7 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str3 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
            com.google.javascript.rhino.Node node15 = functionToBlockMutator8.mutate("JSCompiler_inline_label_g", node10, node11, "d", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        com.google.javascript.jscomp.NameGenerator nameGenerator14 = defaultNameSupplier4.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier4.nameGenerator;
        java.lang.String str16 = defaultNameSupplier4.get();
        org.junit.Assert.assertNotNull(nameGenerator14);
        org.junit.Assert.assertNotNull(nameGenerator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str12 = defaultNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator15 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "b" + "'", str9, "b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c" + "'", str12, "c");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier6);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier3.nameGenerator;
        java.lang.String str11 = defaultNameSupplier3.get();
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator16 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier15);
        com.google.javascript.jscomp.RenameLabels renameLabels18 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier15, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            renameLabels18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator13);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = labelNameSupplier6.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_a" + "'", str7, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        java.lang.String str7 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier10, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier6.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier8);
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier12 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier12.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels15 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier12, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels16 = renameLabels15.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = labelNameSupplier1.idSupplier;
        java.lang.String str3 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str7 = labelNameSupplier6.get();
        java.lang.Class<?> wildcardClass8 = labelNameSupplier6.getClass();
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_a" + "'", str7, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier10.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier13 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_c" + "'", str8, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels9.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        processLabels11.enterScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        processLabels11.exitScope(nodeTraversal14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier15 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier13);
        com.google.javascript.jscomp.RenameLabels renameLabels17 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier15, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels9 = renameLabels8.new ProcessLabels();
        org.junit.Assert.assertNotNull(strSupplier5);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier8.idSupplier;
        java.lang.String str11 = labelNameSupplier8.get();
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_a" + "'", str11, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str7 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, true);
        java.lang.String str10 = labelNameSupplier4.get();
        java.lang.String str11 = labelNameSupplier4.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator13 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, strSupplier12);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier(strSupplier12);
        com.google.common.base.Supplier<java.lang.String> strSupplier15 = labelNameSupplier14.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator16 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_d" + "'", str11, "JSCompiler_inline_label_d");
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNotNull(strSupplier15);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier3.nameGenerator;
        java.lang.String str11 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator12 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier16 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier17 = labelNameSupplier3.idSupplier;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_d" + "'", str10, "JSCompiler_inline_label_d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JSCompiler_inline_label_e" + "'", str13, "JSCompiler_inline_label_e");
        org.junit.Assert.assertNotNull(strSupplier14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JSCompiler_inline_label_f" + "'", str15, "JSCompiler_inline_label_f");
        org.junit.Assert.assertNotNull(strSupplier17);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier3.idSupplier;
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str4, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str6, "JSCompiler_inline_label_JSCompiler_inline_label_c");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels3 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, false);
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier1.nameGenerator;
        java.lang.String str9 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "b" + "'", str5, "b");
        org.junit.Assert.assertNotNull(nameGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "c" + "'", str9, "c");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.util.ArrayList<java.lang.String> strList16 = processLabels15.names;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str5 = labelNameSupplier4.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        java.lang.String str7 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, true);
        java.lang.String str10 = labelNameSupplier4.get();
        com.google.javascript.jscomp.RenameLabels renameLabels12 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4, false);
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator14 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = functionToBlockMutator14.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_e", node16, node17, "JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier13);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str1 = defaultNameSupplier0.get();
        java.lang.String str2 = defaultNameSupplier0.get();
        java.lang.String str3 = defaultNameSupplier0.get();
        java.lang.String str4 = defaultNameSupplier0.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b" + "'", str2, "b");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "c" + "'", str3, "c");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier1.nameGenerator;
        java.lang.String str7 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "b" + "'", str7, "b");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertNotNull(nameGenerator3);
        org.junit.Assert.assertNotNull(nameGenerator5);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str9 = labelNameSupplier8.get();
        java.lang.String str10 = labelNameSupplier8.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_a" + "'", str9, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_b" + "'", str10, "JSCompiler_inline_label_b");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("a", node12, node13, "JSCompiler_inline_label_g", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels11 = renameLabels10.new ProcessLabels();
        java.util.ArrayList<java.lang.String> strList12 = processLabels11.names;
        java.util.ArrayList<java.lang.String> strList13 = processLabels11.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = processLabels11.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = labelNameSupplier2.idSupplier;
        java.lang.String str4 = labelNameSupplier2.get();
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier2.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, strSupplier6);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_d", node9, node10, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_e", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier6 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler5, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler4, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, true);
        java.lang.String str11 = defaultNameSupplier6.get();
        java.lang.String str12 = defaultNameSupplier6.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler3, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator15 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator16 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels18 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator19 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6);
        java.lang.String str20 = defaultNameSupplier6.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator21 = defaultNameSupplier6.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels23 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier6, false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "b" + "'", str12, "b");
        org.junit.Assert.assertNotNull(nameGenerator15);
        org.junit.Assert.assertNotNull(nameGenerator16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "c" + "'", str20, "c");
        org.junit.Assert.assertNotNull(nameGenerator21);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator4 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels10 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.NameGenerator nameGenerator11 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator4);
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertNotNull(nameGenerator6);
        org.junit.Assert.assertNotNull(nameGenerator11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator7);
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        java.lang.Class<?> wildcardClass9 = labelNameSupplier3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        com.google.javascript.jscomp.NameGenerator nameGenerator2 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator3 = defaultNameSupplier0.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        org.junit.Assert.assertNotNull(nameGenerator2);
        org.junit.Assert.assertNotNull(nameGenerator3);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels13 = renameLabels12.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, true);
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator9 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier2.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str12 = labelNameSupplier11.get();
        org.junit.Assert.assertNotNull(nameGenerator9);
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JSCompiler_inline_label_a" + "'", str12, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier4.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier4.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier4);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels10 = renameLabels9.new ProcessLabels();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertNotNull(strSupplier6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str5 = labelNameSupplier2.get();
        com.google.javascript.jscomp.RenameLabels renameLabels7 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        java.lang.String str9 = labelNameSupplier8.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier8.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier8.idSupplier;
        java.lang.Class<?> wildcardClass12 = labelNameSupplier8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_b" + "'", str5, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(strSupplier11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels6 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.NameGenerator nameGenerator8 = defaultNameSupplier3.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node12, node13, "", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator8);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels4 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2, false);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = functionToBlockMutator7.mutate("JSCompiler_inline_label_JSCompiler_inline_label_a", node9, node10, "JSCompiler_inline_label_JSCompiler_inline_label_e", false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels8 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier9 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator10 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = functionToBlockMutator10.mutate("JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b", node12, node13, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_d", true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier4 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        java.lang.String str6 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, true);
        com.google.javascript.jscomp.NameGenerator nameGenerator10 = defaultNameSupplier3.nameGenerator;
        java.lang.String str11 = defaultNameSupplier3.get();
        java.lang.String str12 = defaultNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertNotNull(nameGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "c" + "'", str12, "c");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels renameLabels1 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels2 = renameLabels1.new ProcessLabels();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        processLabels2.enterScope(nodeTraversal3);
        java.util.ArrayList<java.lang.String> strList5 = processLabels2.names;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        processLabels2.exitScope(nodeTraversal6);
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
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        java.lang.String str2 = defaultNameSupplier1.get();
        java.lang.String str3 = defaultNameSupplier1.get();
        java.lang.String str4 = defaultNameSupplier1.get();
        java.lang.String str5 = defaultNameSupplier1.get();
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "b" + "'", str3, "b");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "c" + "'", str4, "c");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "e" + "'", str6, "e");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator8 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator11 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier9);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier9, true);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels12 = renameLabels11.new ProcessLabels();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier5 = labelNameSupplier2.idSupplier;
        java.lang.String str6 = labelNameSupplier2.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier2.idSupplier;
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier2.idSupplier;
        java.lang.String str9 = labelNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier2);
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = labelNameSupplier10.idSupplier;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_c" + "'", str9, "JSCompiler_inline_label_c");
        org.junit.Assert.assertNotNull(strSupplier11);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = processLabels17.getNameForId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(nameGenerator12);
        org.junit.Assert.assertNotNull(nameGenerator14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.Class<?> wildcardClass8 = functionToBlockMutator7.getClass();
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        com.google.javascript.jscomp.RenameLabels renameLabels13 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11, false);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier14 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier11);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
            com.google.javascript.rhino.Node node13 = functionToBlockMutator6.mutate("", node8, node9, "JSCompiler_inline_label_JSCompiler_inline_label_b", true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "JSCompiler_inline_label_a" + "'", str3, "JSCompiler_inline_label_a");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier2 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator3 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str4 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator5 = defaultNameSupplier1.nameGenerator;
        java.lang.String str6 = defaultNameSupplier1.get();
        com.google.javascript.jscomp.NameGenerator nameGenerator7 = defaultNameSupplier1.nameGenerator;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
        org.junit.Assert.assertNotNull(nameGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "b" + "'", str6, "b");
        org.junit.Assert.assertNotNull(nameGenerator7);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str5 = defaultNameSupplier2.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier6 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str7 = labelNameSupplier6.get();
        com.google.javascript.jscomp.RenameLabels renameLabels9 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier6, true);
        java.lang.String str10 = labelNameSupplier6.get();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JSCompiler_inline_label_b" + "'", str7, "JSCompiler_inline_label_b");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "JSCompiler_inline_label_c" + "'", str10, "JSCompiler_inline_label_c");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        com.google.javascript.jscomp.RenameLabels renameLabels14 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier12, false);
        com.google.javascript.jscomp.RenameLabels.ProcessLabels processLabels15 = renameLabels14.new ProcessLabels();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = processLabels15.getNameForId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JSCompiler_inline_label_a" + "'", str5, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str11, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier12);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier1 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator2 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier1);
        java.lang.String str3 = defaultNameSupplier1.get();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier5);
        java.lang.String str8 = labelNameSupplier7.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, strSupplier9, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str8, "JSCompiler_inline_label_JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier3 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.RenameLabels renameLabels5 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler2, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3, false);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator6 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier7 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier7.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator9 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier7);
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = labelNameSupplier7.idSupplier;
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator4 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator5 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        com.google.javascript.jscomp.NameGenerator nameGenerator6 = defaultNameSupplier2.nameGenerator;
        org.junit.Assert.assertNotNull(nameGenerator6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier0 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier1 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier0);
        java.lang.String str2 = labelNameSupplier1.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier1);
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        java.lang.String str6 = labelNameSupplier3.get();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier8 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier9 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier10 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier11 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JSCompiler_inline_label_a" + "'", str2, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JSCompiler_inline_label_JSCompiler_inline_label_b" + "'", str6, "JSCompiler_inline_label_JSCompiler_inline_label_b");
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNotNull(strSupplier9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier defaultNameSupplier2 = new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier3 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) defaultNameSupplier2);
        java.lang.String str4 = labelNameSupplier3.get();
        com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier labelNameSupplier5 = new com.google.javascript.jscomp.FunctionToBlockMutator.LabelNameSupplier((com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = labelNameSupplier3.idSupplier;
        com.google.javascript.jscomp.FunctionToBlockMutator functionToBlockMutator7 = new com.google.javascript.jscomp.FunctionToBlockMutator(abstractCompiler1, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3);
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = labelNameSupplier3.idSupplier;
        java.lang.String str9 = labelNameSupplier3.get();
        com.google.javascript.jscomp.RenameLabels renameLabels11 = new com.google.javascript.jscomp.RenameLabels(abstractCompiler0, (com.google.common.base.Supplier<java.lang.String>) labelNameSupplier3, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JSCompiler_inline_label_a" + "'", str4, "JSCompiler_inline_label_a");
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "JSCompiler_inline_label_b" + "'", str9, "JSCompiler_inline_label_b");
    }
}

