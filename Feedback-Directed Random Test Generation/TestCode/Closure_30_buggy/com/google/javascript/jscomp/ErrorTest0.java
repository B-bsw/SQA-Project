package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean3 = mustDef1.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean3 = mustDef0.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef2 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean5 = mustDef3.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef2 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean5 = mustDef3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal6, node7, node8);
        boolean boolean10 = mustDef3.equals((java.lang.Object) node7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass4 = mustDef3.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean6 = mustDef4.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef7 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef4);
        boolean boolean8 = mustDef0.equals((java.lang.Object) mustDef7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean14 = mustDef12.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables5.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal22, node23, node24);
        boolean boolean26 = mustDef3.equals((java.lang.Object) node23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        boolean boolean4 = mustDef0.equals((java.lang.Object) true);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef5 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef6 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables8.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        flowSensitiveInlineVariables8.exitScope(nodeTraversal13);
        boolean boolean15 = mustDef6.equals((java.lang.Object) nodeTraversal13);
        boolean boolean17 = mustDef6.equals((java.lang.Object) 1L);
        boolean boolean18 = mustDef5.equals((java.lang.Object) mustDef6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef5", mustDef0.equals(mustDef5) ? mustDef0.hashCode() == mustDef5.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef10 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef11 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef10", mustDef0.equals(mustDef10) ? mustDef0.hashCode() == mustDef10.hashCode() : true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables3 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal8);
        boolean boolean10 = mustDef0.equals((java.lang.Object) nodeTraversal8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal10);
        boolean boolean12 = mustDef3.equals((java.lang.Object) nodeTraversal10);
        boolean boolean14 = mustDef3.equals((java.lang.Object) 1L);
        boolean boolean15 = mustDef0.equals((java.lang.Object) mustDef3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal37);
        boolean boolean39 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef2 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef2);
        boolean boolean4 = mustDef0.equals((java.lang.Object) mustDef2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        boolean boolean4 = mustDef0.equals((java.lang.Object) true);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef5 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass6 = mustDef0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef5", mustDef0.equals(mustDef5) ? mustDef0.hashCode() == mustDef5.hashCode() : true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal27, node28, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal35, node36, node37);
        boolean boolean39 = mustDef12.equals((java.lang.Object) node37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        boolean boolean4 = mustDef0.equals((java.lang.Object) true);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef5 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean7 = mustDef0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef5", mustDef0.equals(mustDef5) ? mustDef0.hashCode() == mustDef5.hashCode() : true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables3 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables3.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        flowSensitiveInlineVariables3.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables3.visit(nodeTraversal14, node15, node16);
        boolean boolean18 = mustDef0.equals((java.lang.Object) node15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef10 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass11 = mustDef0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef10", mustDef0.equals(mustDef10) ? mustDef0.hashCode() == mustDef10.hashCode() : true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef10 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        flowSensitiveInlineVariables12.visit(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        flowSensitiveInlineVariables12.visit(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        flowSensitiveInlineVariables12.exitScope(nodeTraversal21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        flowSensitiveInlineVariables12.exitScope(nodeTraversal23);
        boolean boolean25 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef10", mustDef0.equals(mustDef10) ? mustDef0.hashCode() == mustDef10.hashCode() : true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal23);
        boolean boolean25 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal27, node28, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal43);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = null;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal45, node46, node47);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = null;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal49, node50, node51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal53);
        boolean boolean55 = mustDef12.equals((java.lang.Object) nodeTraversal53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        boolean boolean32 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal29, node30, node31);
        boolean boolean33 = mustDef12.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass13 = mustDef0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal27, node28, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal43, node44, node45);
        java.lang.Class<?> wildcardClass47 = flowSensitiveInlineVariables14.getClass();
        boolean boolean48 = mustDef12.equals((java.lang.Object) wildcardClass47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables11.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables11.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal24);
        boolean boolean26 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables28 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        flowSensitiveInlineVariables28.visit(nodeTraversal29, node30, node31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        flowSensitiveInlineVariables28.exitScope(nodeTraversal33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables28.shouldTraverse(nodeTraversal35, node36, node37);
        boolean boolean39 = mustDef0.equals((java.lang.Object) boolean38);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef40 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables42 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        flowSensitiveInlineVariables42.visit(nodeTraversal43, node44, node45);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = null;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        flowSensitiveInlineVariables42.visit(nodeTraversal47, node48, node49);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        flowSensitiveInlineVariables42.exitScope(nodeTraversal51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        flowSensitiveInlineVariables42.exitScope(nodeTraversal53);
        java.lang.Class<?> wildcardClass55 = flowSensitiveInlineVariables42.getClass();
        boolean boolean56 = mustDef40.equals((java.lang.Object) wildcardClass55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef40", mustDef0.equals(mustDef40) ? mustDef0.hashCode() == mustDef40.hashCode() : true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal46, node47, node48);
        boolean boolean50 = mustDef0.equals((java.lang.Object) boolean49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables52 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal53, node54, node55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        boolean boolean60 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal57, node58, node59);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = null;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal61, node62, node63);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = null;
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = null;
        boolean boolean68 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal65, node66, node67);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal69 = null;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal69, node70, node71);
        boolean boolean73 = mustDef0.equals((java.lang.Object) node70);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef74 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Object obj75 = new java.lang.Object();
        java.lang.Class<?> wildcardClass76 = obj75.getClass();
        boolean boolean77 = mustDef74.equals((java.lang.Object) wildcardClass76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef74", mustDef0.equals(mustDef74) ? mustDef0.hashCode() == mustDef74.hashCode() : true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables11.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables11.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal24);
        boolean boolean26 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables28 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        flowSensitiveInlineVariables28.visit(nodeTraversal29, node30, node31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        flowSensitiveInlineVariables28.exitScope(nodeTraversal33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables28.shouldTraverse(nodeTraversal35, node36, node37);
        boolean boolean39 = mustDef0.equals((java.lang.Object) boolean38);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef40 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef41 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef40", mustDef0.equals(mustDef40) ? mustDef0.hashCode() == mustDef40.hashCode() : true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef10 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables12 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        flowSensitiveInlineVariables12.visit(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        flowSensitiveInlineVariables12.exitScope(nodeTraversal17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = flowSensitiveInlineVariables12.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = flowSensitiveInlineVariables12.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        flowSensitiveInlineVariables12.exitScope(nodeTraversal27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        flowSensitiveInlineVariables12.visit(nodeTraversal29, node30, node31);
        boolean boolean33 = mustDef10.equals((java.lang.Object) flowSensitiveInlineVariables12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef10", mustDef0.equals(mustDef10) ? mustDef0.hashCode() == mustDef10.hashCode() : true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables11 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables11.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables11.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables11.exitScope(nodeTraversal24);
        boolean boolean26 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables28 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        flowSensitiveInlineVariables28.visit(nodeTraversal29, node30, node31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        flowSensitiveInlineVariables28.exitScope(nodeTraversal33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables28.shouldTraverse(nodeTraversal35, node36, node37);
        boolean boolean39 = mustDef0.equals((java.lang.Object) boolean38);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef40 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass41 = mustDef40.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef40", mustDef0.equals(mustDef40) ? mustDef0.hashCode() == mustDef40.hashCode() : true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables3 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        flowSensitiveInlineVariables3.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables3.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables3.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables3.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal22);
        boolean boolean24 = mustDef0.equals((java.lang.Object) nodeTraversal22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef13 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef3);
        boolean boolean5 = mustDef0.equals((java.lang.Object) mustDef4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass2 = mustDef1.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass13 = mustDef12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal46, node47, node48);
        boolean boolean50 = mustDef0.equals((java.lang.Object) boolean49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables52 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal53, node54, node55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        boolean boolean60 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal57, node58, node59);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = null;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal61, node62, node63);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = null;
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = null;
        boolean boolean68 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal65, node66, node67);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal69 = null;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal69, node70, node71);
        boolean boolean73 = mustDef0.equals((java.lang.Object) node70);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef74 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef75 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef74", mustDef0.equals(mustDef74) ? mustDef0.hashCode() == mustDef74.hashCode() : true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal46, node47, node48);
        boolean boolean50 = mustDef0.equals((java.lang.Object) boolean49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables52 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal53, node54, node55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        boolean boolean60 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal57, node58, node59);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = null;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal61, node62, node63);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = null;
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = null;
        boolean boolean68 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal65, node66, node67);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal69 = null;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal69, node70, node71);
        boolean boolean73 = mustDef0.equals((java.lang.Object) node70);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef74 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean76 = mustDef74.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef74", mustDef0.equals(mustDef74) ? mustDef0.hashCode() == mustDef74.hashCode() : true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal46, node47, node48);
        boolean boolean50 = mustDef0.equals((java.lang.Object) boolean49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler51 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables52 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal53, node54, node55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        boolean boolean60 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal57, node58, node59);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal61 = null;
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal61, node62, node63);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal65 = null;
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = null;
        boolean boolean68 = flowSensitiveInlineVariables52.shouldTraverse(nodeTraversal65, node66, node67);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal69 = null;
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = null;
        flowSensitiveInlineVariables52.visit(nodeTraversal69, node70, node71);
        boolean boolean73 = mustDef0.equals((java.lang.Object) node70);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef74 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef75 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef74", mustDef0.equals(mustDef74) ? mustDef0.hashCode() == mustDef74.hashCode() : true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        boolean boolean4 = mustDef0.equals((java.lang.Object) true);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef5 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef6 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables8 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables8.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        flowSensitiveInlineVariables8.exitScope(nodeTraversal13);
        boolean boolean15 = mustDef6.equals((java.lang.Object) nodeTraversal13);
        boolean boolean17 = mustDef6.equals((java.lang.Object) 1L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef18 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef6);
        boolean boolean19 = mustDef5.equals((java.lang.Object) mustDef6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef5", mustDef0.equals(mustDef5) ? mustDef0.hashCode() == mustDef5.hashCode() : true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef10 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef11 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef10", mustDef0.equals(mustDef10) ? mustDef0.hashCode() == mustDef10.hashCode() : true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        boolean boolean13 = mustDef0.equals((java.lang.Object) 100.0f);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables15 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables15.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables15.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal48, node49, node50);
        boolean boolean52 = mustDef0.equals((java.lang.Object) nodeTraversal48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables54 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler53);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = null;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = null;
        flowSensitiveInlineVariables54.visit(nodeTraversal55, node56, node57);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal59, node60, node61);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = null;
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = null;
        flowSensitiveInlineVariables54.visit(nodeTraversal63, node64, node65);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = null;
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = null;
        boolean boolean70 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal67, node68, node69);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal71 = null;
        flowSensitiveInlineVariables54.exitScope(nodeTraversal71);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal73 = null;
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = null;
        boolean boolean76 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal73, node74, node75);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal77 = null;
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = null;
        boolean boolean80 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal77, node78, node79);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal81 = null;
        flowSensitiveInlineVariables54.exitScope(nodeTraversal81);
        boolean boolean83 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables54);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef84 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef85 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef84", mustDef0.equals(mustDef84) ? mustDef0.hashCode() == mustDef84.hashCode() : true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables13 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables13.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        flowSensitiveInlineVariables13.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = flowSensitiveInlineVariables13.shouldTraverse(nodeTraversal46, node47, node48);
        boolean boolean50 = mustDef0.equals((java.lang.Object) boolean49);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef51 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef52 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef51", mustDef0.equals(mustDef51) ? mustDef0.hashCode() == mustDef51.hashCode() : true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal11, node12, node13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal25, node26, node27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        boolean boolean32 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal29, node30, node31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal33);
        boolean boolean35 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef36 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables38 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        flowSensitiveInlineVariables38.visit(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = flowSensitiveInlineVariables38.shouldTraverse(nodeTraversal43, node44, node45);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = null;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        flowSensitiveInlineVariables38.visit(nodeTraversal47, node48, node49);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        flowSensitiveInlineVariables38.exitScope(nodeTraversal51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        boolean boolean56 = flowSensitiveInlineVariables38.shouldTraverse(nodeTraversal53, node54, node55);
        boolean boolean57 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef36", mustDef0.equals(mustDef36) ? mustDef0.hashCode() == mustDef36.hashCode() : true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal11, node12, node13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal25, node26, node27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        boolean boolean32 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal29, node30, node31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal33);
        boolean boolean35 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef36 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef37 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef36", mustDef0.equals(mustDef36) ? mustDef0.hashCode() == mustDef36.hashCode() : true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10L);
        boolean boolean4 = mustDef0.equals((java.lang.Object) true);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef5 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables7 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        flowSensitiveInlineVariables7.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables7.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables7.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables7.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables7.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables7.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables7.exitScope(nodeTraversal26);
        boolean boolean28 = mustDef0.equals((java.lang.Object) nodeTraversal26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef5", mustDef0.equals(mustDef5) ? mustDef0.hashCode() == mustDef5.hashCode() : true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) 1.0f);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef12 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables14 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal27, node28, node29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal43);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal45 = null;
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        boolean boolean48 = flowSensitiveInlineVariables14.shouldTraverse(nodeTraversal45, node46, node47);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal49 = null;
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = null;
        flowSensitiveInlineVariables14.visit(nodeTraversal49, node50, node51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal53);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = null;
        flowSensitiveInlineVariables14.exitScope(nodeTraversal55);
        java.lang.Class<?> wildcardClass57 = flowSensitiveInlineVariables14.getClass();
        boolean boolean58 = mustDef0.equals((java.lang.Object) wildcardClass57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef12", mustDef0.equals(mustDef12) ? mustDef0.hashCode() == mustDef12.hashCode() : true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables2 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler1);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = flowSensitiveInlineVariables2.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        flowSensitiveInlineVariables2.exitScope(nodeTraversal7);
        boolean boolean9 = mustDef0.equals((java.lang.Object) nodeTraversal7);
        boolean boolean11 = mustDef0.equals((java.lang.Object) "hi!");
        boolean boolean13 = mustDef0.equals((java.lang.Object) 100.0f);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables15 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables15.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables15.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = flowSensitiveInlineVariables15.shouldTraverse(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        flowSensitiveInlineVariables15.visit(nodeTraversal48, node49, node50);
        boolean boolean52 = mustDef0.equals((java.lang.Object) nodeTraversal48);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables54 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler53);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = null;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = null;
        flowSensitiveInlineVariables54.visit(nodeTraversal55, node56, node57);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal59, node60, node61);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = null;
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = null;
        flowSensitiveInlineVariables54.visit(nodeTraversal63, node64, node65);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = null;
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = null;
        boolean boolean70 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal67, node68, node69);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal71 = null;
        flowSensitiveInlineVariables54.exitScope(nodeTraversal71);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal73 = null;
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = null;
        boolean boolean76 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal73, node74, node75);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal77 = null;
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = null;
        boolean boolean80 = flowSensitiveInlineVariables54.shouldTraverse(nodeTraversal77, node78, node79);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal81 = null;
        flowSensitiveInlineVariables54.exitScope(nodeTraversal81);
        boolean boolean83 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables54);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef84 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass85 = mustDef84.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef84", mustDef0.equals(mustDef84) ? mustDef0.hashCode() == mustDef84.hashCode() : true);
    }
}

