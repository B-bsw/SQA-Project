package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.count;
        java.lang.String str19 = assignment17.oldName;
        int int20 = assignment17.orderOfOccurrence;
        assignment17.count = 52;
        assignment17.setNewName("hi!");
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars56 = renameVars51.new ProcessVars(true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        boolean boolean60 = processVars56.shouldTraverse(nodeTraversal57, node58, node59);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.VariableMap variableMap20 = renameVars19.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renameVars19.getVariableMap();
        char[] charArray22 = new char[] {};
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        com.google.javascript.jscomp.RenameVars renameVars27 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", true, false, false, variableMap21, charArray22, (java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars29 = renameVars27.new ProcessVars(true);
        java.lang.Class<?> wildcardClass30 = processVars29.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        int int19 = assignment17.count;
        assignment17.setNewName("hi!");
        java.lang.String str22 = assignment17.oldName;
        java.lang.String str23 = assignment17.oldName;
        assignment17.newName = "";
        java.lang.String str26 = assignment17.oldName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        char[] charArray43 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        com.google.javascript.jscomp.RenameVars renameVars48 = new com.google.javascript.jscomp.RenameVars(abstractCompiler34, "", true, false, false, variableMap39, charArray43, (java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        char[] charArray58 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        com.google.javascript.jscomp.RenameVars renameVars63 = new com.google.javascript.jscomp.RenameVars(abstractCompiler49, "", true, false, false, variableMap54, charArray58, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars renameVars64 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, true, false, variableMap25, charArray43, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars66 = renameVars64.new ProcessVars(true);
        com.google.javascript.jscomp.VariableMap variableMap67 = renameVars64.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput69 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment70 = renameVars64.new Assignment("hi!", compilerInput69);
        java.lang.String str71 = assignment70.oldName;
        assignment70.count = 52;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.count;
        java.lang.String str19 = assignment17.oldName;
        assignment17.setNewName("hi!");
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        int int26 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        int int19 = assignment17.count;
        java.lang.String str20 = assignment17.newName;
        java.lang.String str21 = assignment17.newName;
        int int22 = assignment17.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.count;
        int int19 = assignment17.orderOfOccurrence;
        java.lang.String str20 = assignment17.newName;
        int int21 = assignment17.count;
        java.lang.String str22 = assignment17.oldName;
        int int23 = assignment17.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.orderOfOccurrence;
        int int19 = assignment17.count;
        int int20 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars16 = renameVars14.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment19 = renameVars14.new Assignment("hi!", compilerInput18);
        assignment19.setNewName("");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        int int21 = assignment17.count;
        java.lang.String str22 = assignment17.oldName;
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.oldName;
        assignment17.count = (byte) 1;
        assignment17.count = (byte) 100;
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        java.lang.String str33 = assignment17.oldName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.orderOfOccurrence;
        int int19 = assignment17.count;
        java.lang.Class<?> wildcardClass20 = assignment17.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        java.lang.String str61 = assignment54.oldName;
        assignment54.newName = "";
        assignment54.newName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            assignment54.setNewName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment18.input;
        assignment18.count = '#';
        java.lang.String str24 = assignment18.oldName;
        java.lang.String str25 = assignment18.newName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        char[] charArray43 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        com.google.javascript.jscomp.RenameVars renameVars48 = new com.google.javascript.jscomp.RenameVars(abstractCompiler34, "", true, false, false, variableMap39, charArray43, (java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        char[] charArray58 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        com.google.javascript.jscomp.RenameVars renameVars63 = new com.google.javascript.jscomp.RenameVars(abstractCompiler49, "", true, false, false, variableMap54, charArray58, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars renameVars64 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, true, false, variableMap25, charArray43, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars66 = renameVars64.new ProcessVars(true);
        com.google.javascript.jscomp.CompilerInput compilerInput68 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment69 = renameVars64.new Assignment("hi!", compilerInput68);
        com.google.javascript.jscomp.VariableMap variableMap70 = renameVars64.getVariableMap();
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars72 = renameVars64.new ProcessVars(false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(variableMap70);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.count;
        java.lang.String str19 = assignment17.oldName;
        assignment17.setNewName("hi!");
        assignment17.count = '4';
        int int24 = assignment17.count;
        int int25 = assignment17.orderOfOccurrence;
        int int26 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars17 = renameVars14.new ProcessVars(false);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars19 = renameVars14.new ProcessVars(true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = processVars19.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        processVars19.incCount("hi!", compilerInput25);
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        processVars19.incCount("hi!", compilerInput28);
        com.google.javascript.jscomp.CompilerInput compilerInput31 = null;
        processVars19.incCount("", compilerInput31);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal33 = null;
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        boolean boolean36 = processVars19.shouldTraverse(nodeTraversal33, node34, node35);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal37 = null;
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            processVars19.visit(nodeTraversal37, node38, node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        int int21 = assignment18.count;
        assignment18.count = 0;
        assignment18.setNewName("");
        int int26 = assignment18.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        char[] charArray43 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        com.google.javascript.jscomp.RenameVars renameVars48 = new com.google.javascript.jscomp.RenameVars(abstractCompiler34, "", true, false, false, variableMap39, charArray43, (java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        char[] charArray58 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        com.google.javascript.jscomp.RenameVars renameVars63 = new com.google.javascript.jscomp.RenameVars(abstractCompiler49, "", true, false, false, variableMap54, charArray58, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars renameVars64 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, true, false, variableMap25, charArray43, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars66 = renameVars64.new ProcessVars(true);
        com.google.javascript.jscomp.CompilerInput compilerInput68 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment69 = renameVars64.new Assignment("hi!", compilerInput68);
        assignment69.count = (byte) 100;
        com.google.javascript.jscomp.CompilerInput compilerInput72 = assignment69.input;
        java.lang.String str73 = assignment69.newName;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(compilerInput72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        java.lang.String str19 = assignment17.oldName;
        int int20 = assignment17.orderOfOccurrence;
        int int21 = assignment17.orderOfOccurrence;
        java.lang.String str22 = assignment17.newName;
        assignment17.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        assignment18.count = (byte) 1;
        int int23 = assignment18.count;
        int int24 = assignment18.count;
        java.lang.String str25 = assignment18.oldName;
        java.lang.String str26 = assignment18.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = assignment18.input;
        int int28 = assignment18.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(compilerInput27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        int int61 = assignment54.count;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        java.lang.String str22 = assignment17.oldName;
        assignment17.count = (byte) 0;
        java.lang.String str25 = assignment17.newName;
        java.lang.Class<?> wildcardClass26 = assignment17.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        java.lang.String str61 = assignment54.oldName;
        assignment54.newName = "";
        java.lang.String str64 = assignment54.newName;
        int int65 = assignment54.count;
        java.lang.String str66 = assignment54.newName;
        java.lang.String str67 = assignment54.oldName;
        java.lang.String str68 = assignment54.oldName;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.setNewName("hi!");
        int int21 = assignment17.orderOfOccurrence;
        int int22 = assignment17.count;
        int int23 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler34 = null;
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        char[] charArray43 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        com.google.javascript.jscomp.RenameVars renameVars48 = new com.google.javascript.jscomp.RenameVars(abstractCompiler34, "", true, false, false, variableMap39, charArray43, (java.util.Set<java.lang.String>) strSet46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler49 = null;
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        char[] charArray58 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        com.google.javascript.jscomp.RenameVars renameVars63 = new com.google.javascript.jscomp.RenameVars(abstractCompiler49, "", true, false, false, variableMap54, charArray58, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.RenameVars renameVars64 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, true, false, variableMap25, charArray43, (java.util.Set<java.lang.String>) strSet61);
        com.google.javascript.jscomp.VariableMap variableMap65 = renameVars64.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput67 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment68 = renameVars64.new Assignment("hi!", compilerInput67);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertArrayEquals(charArray43, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertArrayEquals(strArray45, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(variableMap65);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.oldName;
        assignment17.count = (byte) 1;
        assignment17.count = (byte) 100;
        com.google.javascript.jscomp.CompilerInput compilerInput29 = assignment17.input;
        java.lang.String str30 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput31 = assignment17.input;
        com.google.javascript.jscomp.CompilerInput compilerInput32 = assignment17.input;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(compilerInput29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(compilerInput31);
        org.junit.Assert.assertNull(compilerInput32);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        com.google.javascript.jscomp.CompilerInput compilerInput56 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment57 = renameVars51.new Assignment("", compilerInput56);
        java.lang.String str58 = assignment57.newName;
        com.google.javascript.jscomp.CompilerInput compilerInput59 = assignment57.input;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(compilerInput59);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        int int21 = assignment18.count;
        assignment18.newName = "hi!";
        java.lang.String str24 = assignment18.newName;
        assignment18.count = 10;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = assignment18.input;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(compilerInput27);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.VariableMap variableMap20 = null;
        char[] charArray24 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        com.google.javascript.jscomp.RenameVars renameVars29 = new com.google.javascript.jscomp.RenameVars(abstractCompiler15, "", true, false, false, variableMap20, charArray24, (java.util.Set<java.lang.String>) strSet27);
        com.google.javascript.jscomp.VariableMap variableMap30 = renameVars29.getVariableMap();
        char[] charArray32 = new char[] { 'a' };
        java.lang.String[] strArray35 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        com.google.javascript.jscomp.RenameVars renameVars38 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "hi!", false, false, true, variableMap30, charArray32, (java.util.Set<java.lang.String>) strSet36);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        com.google.javascript.jscomp.VariableMap variableMap44 = null;
        char[] charArray48 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        com.google.javascript.jscomp.RenameVars renameVars53 = new com.google.javascript.jscomp.RenameVars(abstractCompiler39, "", true, false, false, variableMap44, charArray48, (java.util.Set<java.lang.String>) strSet51);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        com.google.javascript.jscomp.VariableMap variableMap59 = null;
        char[] charArray63 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        com.google.javascript.jscomp.RenameVars renameVars68 = new com.google.javascript.jscomp.RenameVars(abstractCompiler54, "", true, false, false, variableMap59, charArray63, (java.util.Set<java.lang.String>) strSet66);
        com.google.javascript.jscomp.RenameVars renameVars69 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", false, true, false, variableMap30, charArray48, (java.util.Set<java.lang.String>) strSet66);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars71 = renameVars69.new ProcessVars(true);
        com.google.javascript.jscomp.CompilerInput compilerInput73 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment74 = renameVars69.new Assignment("hi!", compilerInput73);
        com.google.javascript.jscomp.VariableMap variableMap75 = renameVars69.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap76 = renameVars69.getVariableMap();
        char[] charArray77 = null;
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        com.google.javascript.jscomp.RenameVars renameVars82 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, false, true, variableMap76, charArray77, (java.util.Set<java.lang.String>) strSet80);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars84 = renameVars82.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput86 = null;
        processVars84.incCount("hi!", compilerInput86);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(variableMap30);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertArrayEquals(strArray50, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(variableMap75);
        org.junit.Assert.assertNotNull(variableMap76);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        assignment17.newName = "";
        int int25 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        int int21 = assignment17.count;
        java.lang.String str22 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = assignment17.input;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(compilerInput23);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        int int19 = assignment18.count;
        int int20 = assignment18.count;
        java.lang.String str21 = assignment18.oldName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        assignment17.newName = "";
        com.google.javascript.jscomp.CompilerInput compilerInput22 = assignment17.input;
        assignment17.count = (short) -1;
        assignment17.count = 10;
        assignment17.newName = "";
        assignment17.count = (short) -1;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(compilerInput22);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.newName;
        java.lang.String str25 = assignment17.oldName;
        java.lang.String str26 = assignment17.oldName;
        assignment17.count = (short) 1;
        int int29 = assignment17.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        assignment17.newName = "hi!";
        java.lang.String str23 = assignment17.newName;
        assignment17.count = 35;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.orderOfOccurrence;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = assignment17.input;
        java.lang.String str20 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment17.input;
        assignment17.setNewName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            assignment17.setNewName("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(compilerInput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(compilerInput21);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        assignment18.count = (byte) 1;
        int int23 = assignment18.orderOfOccurrence;
        assignment18.setNewName("");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.VariableMap variableMap16 = null;
        char[] charArray20 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        com.google.javascript.jscomp.RenameVars renameVars25 = new com.google.javascript.jscomp.RenameVars(abstractCompiler11, "", true, false, false, variableMap16, charArray20, (java.util.Set<java.lang.String>) strSet23);
        com.google.javascript.jscomp.VariableMap variableMap26 = renameVars25.getVariableMap();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        com.google.javascript.jscomp.VariableMap variableMap32 = null;
        char[] charArray36 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        com.google.javascript.jscomp.RenameVars renameVars41 = new com.google.javascript.jscomp.RenameVars(abstractCompiler27, "", true, false, false, variableMap32, charArray36, (java.util.Set<java.lang.String>) strSet39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler47 = null;
        com.google.javascript.jscomp.VariableMap variableMap52 = null;
        char[] charArray56 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        com.google.javascript.jscomp.RenameVars renameVars61 = new com.google.javascript.jscomp.RenameVars(abstractCompiler47, "", true, false, false, variableMap52, charArray56, (java.util.Set<java.lang.String>) strSet59);
        com.google.javascript.jscomp.VariableMap variableMap62 = renameVars61.getVariableMap();
        char[] charArray64 = new char[] { 'a' };
        java.lang.String[] strArray67 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        com.google.javascript.jscomp.RenameVars renameVars70 = new com.google.javascript.jscomp.RenameVars(abstractCompiler42, "hi!", false, false, true, variableMap62, charArray64, (java.util.Set<java.lang.String>) strSet68);
        com.google.javascript.jscomp.RenameVars renameVars71 = new com.google.javascript.jscomp.RenameVars(abstractCompiler6, "hi!", false, false, true, variableMap26, charArray36, (java.util.Set<java.lang.String>) strSet68);
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet74 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet74, strArray73);
        com.google.javascript.jscomp.RenameVars renameVars76 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap5, charArray36, (java.util.Set<java.lang.String>) strSet74);
        com.google.javascript.jscomp.VariableMap variableMap77 = renameVars76.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput79 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment80 = renameVars76.new Assignment("", compilerInput79);
        com.google.javascript.jscomp.VariableMap variableMap81 = renameVars76.getVariableMap();
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars83 = renameVars76.new ProcessVars(false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertArrayEquals(charArray56, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(variableMap62);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(variableMap77);
        org.junit.Assert.assertNotNull(variableMap81);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = assignment17.input;
        assignment17.newName = "";
        int int28 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        // The following exception was thrown during execution in test generation
        try {
            assignment17.setNewName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.VariableMap variableMap20 = renameVars19.getVariableMap();
        char[] charArray22 = new char[] { 'a' };
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        com.google.javascript.jscomp.RenameVars renameVars28 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, true, variableMap20, charArray22, (java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment31 = renameVars28.new Assignment("hi!", compilerInput30);
        int int32 = assignment31.count;
        assignment31.setNewName("hi!");
        int int35 = assignment31.count;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars17 = renameVars14.new ProcessVars(false);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars19 = renameVars14.new ProcessVars(true);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = processVars19.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = processVars19.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            processVars19.visit(nodeTraversal28, node29, node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.VariableMap variableMap40 = null;
        char[] charArray44 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.google.javascript.jscomp.RenameVars renameVars49 = new com.google.javascript.jscomp.RenameVars(abstractCompiler35, "", true, false, false, variableMap40, charArray44, (java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, false, true, variableMap25, charArray34, (java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars52 = renameVars50.new ProcessVars(false);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars54 = renameVars50.new ProcessVars(true);
        com.google.javascript.jscomp.CompilerInput compilerInput56 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment57 = renameVars50.new Assignment("", compilerInput56);
        com.google.javascript.jscomp.VariableMap variableMap58 = renameVars50.getVariableMap();
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars60 = renameVars50.new ProcessVars(false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(variableMap58);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        int int21 = assignment18.count;
        java.lang.String str22 = assignment18.newName;
        java.lang.String str23 = assignment18.newName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.oldName;
        assignment17.count = (byte) 1;
        assignment17.count = (byte) 100;
        assignment17.newName = "hi!";
        int int31 = assignment17.count;
        assignment17.newName = "";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.VariableMap variableMap20 = renameVars19.getVariableMap();
        char[] charArray22 = new char[] { 'a' };
        java.lang.String[] strArray25 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        com.google.javascript.jscomp.RenameVars renameVars28 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, true, variableMap20, charArray22, (java.util.Set<java.lang.String>) strSet26);
        com.google.javascript.jscomp.CompilerInput compilerInput30 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment31 = renameVars28.new Assignment("hi!", compilerInput30);
        assignment31.newName = "hi!";
        assignment31.count = (byte) 0;
        java.lang.String str36 = assignment31.newName;
        int int37 = assignment31.count;
        java.lang.String str38 = assignment31.newName;
        assignment31.newName = "";
        assignment31.count = 52;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment18.input;
        int int22 = assignment18.orderOfOccurrence;
        java.lang.String str23 = assignment18.oldName;
        int int24 = assignment18.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        int int61 = assignment54.orderOfOccurrence;
        java.lang.String str62 = assignment54.newName;
        java.lang.String str63 = assignment54.oldName;
        java.lang.String str64 = assignment54.newName;
        java.lang.String str65 = assignment54.newName;
        assignment54.newName = "hi!";
        assignment54.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        int int19 = assignment18.orderOfOccurrence;
        assignment18.newName = "";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        java.lang.String str23 = assignment17.oldName;
        assignment17.newName = "";
        java.lang.String str26 = assignment17.newName;
        assignment17.count = (short) -1;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars16 = renameVars14.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment19 = renameVars14.new Assignment("hi!", compilerInput18);
        java.lang.String str20 = assignment19.newName;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment19.input;
        int int22 = assignment19.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        com.google.javascript.jscomp.CompilerInput compilerInput61 = assignment54.input;
        java.lang.String str62 = assignment54.newName;
        int int63 = assignment54.count;
        com.google.javascript.jscomp.CompilerInput compilerInput64 = assignment54.input;
        assignment54.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(compilerInput61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(compilerInput64);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.setNewName("");
        assignment17.newName = "hi!";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.VariableMap variableMap20 = renameVars19.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renameVars19.getVariableMap();
        char[] charArray22 = new char[] {};
        java.lang.String[] strArray24 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        com.google.javascript.jscomp.RenameVars renameVars27 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", true, false, false, variableMap21, charArray22, (java.util.Set<java.lang.String>) strSet25);
        com.google.javascript.jscomp.CompilerInput compilerInput29 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment30 = renameVars27.new Assignment("", compilerInput29);
        int int31 = assignment30.count;
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray34 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler35 = null;
        com.google.javascript.jscomp.VariableMap variableMap40 = null;
        char[] charArray44 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        com.google.javascript.jscomp.RenameVars renameVars49 = new com.google.javascript.jscomp.RenameVars(abstractCompiler35, "", true, false, false, variableMap40, charArray44, (java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, false, true, variableMap25, charArray34, (java.util.Set<java.lang.String>) strSet47);
        com.google.javascript.jscomp.VariableMap variableMap51 = renameVars50.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars50.new Assignment("hi!", compilerInput53);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertArrayEquals(charArray44, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(variableMap51);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars21 = renameVars19.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment24 = renameVars19.new Assignment("hi!", compilerInput23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars19.getVariableMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = renameVars19.getVariableMap();
        char[] charArray27 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        com.google.javascript.jscomp.VariableMap variableMap33 = null;
        char[] charArray37 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        com.google.javascript.jscomp.RenameVars renameVars42 = new com.google.javascript.jscomp.RenameVars(abstractCompiler28, "", true, false, false, variableMap33, charArray37, (java.util.Set<java.lang.String>) strSet40);
        com.google.javascript.jscomp.RenameVars renameVars43 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, true, variableMap26, charArray27, (java.util.Set<java.lang.String>) strSet40);
        com.google.javascript.jscomp.VariableMap variableMap44 = renameVars43.getVariableMap();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(variableMap44);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars16 = renameVars14.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment19 = renameVars14.new Assignment("", compilerInput18);
        int int20 = assignment19.count;
        java.lang.String str21 = assignment19.newName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        int int61 = assignment54.orderOfOccurrence;
        java.lang.String str62 = assignment54.newName;
        java.lang.String str63 = assignment54.oldName;
        java.lang.String str64 = assignment54.newName;
        java.lang.String str65 = assignment54.newName;
        assignment54.newName = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            assignment54.setNewName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        java.lang.String str23 = assignment17.oldName;
        assignment17.newName = "";
        java.lang.String str26 = assignment17.newName;
        java.lang.Class<?> wildcardClass27 = assignment17.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.count;
        assignment17.setNewName("");
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment17.input;
        int int22 = assignment17.count;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = assignment17.input;
        com.google.javascript.jscomp.CompilerInput compilerInput24 = assignment17.input;
        java.lang.String str25 = assignment17.oldName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(compilerInput23);
        org.junit.Assert.assertNull(compilerInput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        int int21 = assignment18.count;
        assignment18.newName = "hi!";
        java.lang.String str24 = assignment18.newName;
        java.lang.String str25 = assignment18.newName;
        assignment18.count = (byte) 10;
        java.lang.String str28 = assignment18.oldName;
        int int29 = assignment18.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.orderOfOccurrence;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = assignment17.input;
        java.lang.String str20 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment17.input;
        assignment17.setNewName("hi!");
        int int24 = assignment17.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(compilerInput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        java.lang.String str18 = assignment17.oldName;
        assignment17.newName = "hi!";
        int int21 = assignment17.count;
        assignment17.count = 10;
        java.lang.String str24 = assignment17.oldName;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = assignment17.input;
        int int26 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        com.google.javascript.jscomp.CompilerInput compilerInput56 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment57 = renameVars51.new Assignment("", compilerInput56);
        assignment57.newName = "";
        int int60 = assignment57.orderOfOccurrence;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        assignment17.newName = "hi!";
        assignment17.newName = "";
        int int27 = assignment17.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars21 = renameVars19.new ProcessVars(false);
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment24 = renameVars19.new Assignment("hi!", compilerInput23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars19.getVariableMap();
        char[] charArray26 = new char[] {};
        java.lang.String[] strArray28 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        com.google.javascript.jscomp.RenameVars renameVars31 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", false, false, false, variableMap25, charArray26, (java.util.Set<java.lang.String>) strSet29);
        java.lang.Class<?> wildcardClass32 = charArray26.getClass();
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        assignment54.newName = "";
        assignment54.newName = "";
        java.lang.String str61 = assignment54.oldName;
        assignment54.newName = "";
        java.lang.String str64 = assignment54.newName;
        int int65 = assignment54.count;
        com.google.javascript.jscomp.CompilerInput compilerInput66 = assignment54.input;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(compilerInput66);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        char[] charArray14 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        com.google.javascript.jscomp.RenameVars renameVars19 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "", true, false, false, variableMap10, charArray14, (java.util.Set<java.lang.String>) strSet17);
        com.google.javascript.jscomp.VariableMap variableMap20 = renameVars19.getVariableMap();
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.VariableMap variableMap26 = null;
        char[] charArray30 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        com.google.javascript.jscomp.RenameVars renameVars35 = new com.google.javascript.jscomp.RenameVars(abstractCompiler21, "", true, false, false, variableMap26, charArray30, (java.util.Set<java.lang.String>) strSet33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        com.google.javascript.jscomp.VariableMap variableMap46 = null;
        char[] charArray50 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        com.google.javascript.jscomp.RenameVars renameVars55 = new com.google.javascript.jscomp.RenameVars(abstractCompiler41, "", true, false, false, variableMap46, charArray50, (java.util.Set<java.lang.String>) strSet53);
        com.google.javascript.jscomp.VariableMap variableMap56 = renameVars55.getVariableMap();
        char[] charArray58 = new char[] { 'a' };
        java.lang.String[] strArray61 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        com.google.javascript.jscomp.RenameVars renameVars64 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "hi!", false, false, true, variableMap56, charArray58, (java.util.Set<java.lang.String>) strSet62);
        com.google.javascript.jscomp.RenameVars renameVars65 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, true, variableMap20, charArray30, (java.util.Set<java.lang.String>) strSet62);
        com.google.javascript.jscomp.CompilerInput compilerInput67 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment68 = renameVars65.new Assignment("", compilerInput67);
        com.google.javascript.jscomp.RenameVars.ProcessVars processVars70 = renameVars65.new ProcessVars(true);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertArrayEquals(charArray30, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertArrayEquals(charArray50, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertArrayEquals(strArray52, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertArrayEquals(charArray58, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        int int19 = assignment18.count;
        int int20 = assignment18.count;
        int int21 = assignment18.count;
        int int22 = assignment18.count;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        int int19 = assignment18.count;
        java.lang.String str20 = assignment18.newName;
        java.lang.String str21 = assignment18.newName;
        java.lang.String str22 = assignment18.oldName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        com.google.javascript.jscomp.CompilerInput compilerInput23 = assignment17.input;
        assignment17.newName = "";
        assignment17.newName = "";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(compilerInput23);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        char[] charArray19 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        com.google.javascript.jscomp.RenameVars renameVars24 = new com.google.javascript.jscomp.RenameVars(abstractCompiler10, "", true, false, false, variableMap15, charArray19, (java.util.Set<java.lang.String>) strSet22);
        com.google.javascript.jscomp.VariableMap variableMap25 = renameVars24.getVariableMap();
        char[] charArray27 = new char[] { 'a' };
        java.lang.String[] strArray30 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        com.google.javascript.jscomp.RenameVars renameVars33 = new com.google.javascript.jscomp.RenameVars(abstractCompiler5, "hi!", false, false, true, variableMap25, charArray27, (java.util.Set<java.lang.String>) strSet31);
        char[] charArray35 = new char[] { '4' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.VariableMap variableMap41 = null;
        char[] charArray45 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        com.google.javascript.jscomp.RenameVars renameVars50 = new com.google.javascript.jscomp.RenameVars(abstractCompiler36, "", true, false, false, variableMap41, charArray45, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.RenameVars renameVars51 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "hi!", false, false, false, variableMap25, charArray35, (java.util.Set<java.lang.String>) strSet48);
        com.google.javascript.jscomp.CompilerInput compilerInput53 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment54 = renameVars51.new Assignment("", compilerInput53);
        assignment54.newName = "hi!";
        com.google.javascript.jscomp.CompilerInput compilerInput57 = assignment54.input;
        int int58 = assignment54.count;
        com.google.javascript.jscomp.CompilerInput compilerInput59 = assignment54.input;
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertArrayEquals(charArray19, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { 'a' });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '4' });
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertArrayEquals(charArray45, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(compilerInput57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(compilerInput59);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        assignment17.newName = "";
        java.lang.String str22 = assignment17.oldName;
        int int23 = assignment17.count;
        assignment17.newName = "hi!";
        assignment17.newName = "";
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        assignment17.count = ' ';
        java.lang.String str25 = assignment17.newName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.VariableMap variableMap15 = renameVars14.getVariableMap();
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment18 = renameVars14.new Assignment("", compilerInput17);
        assignment18.count = (byte) -1;
        assignment18.count = (byte) 1;
        int int23 = assignment18.orderOfOccurrence;
        int int24 = assignment18.count;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = assignment18.input;
        java.lang.String str26 = assignment18.newName;
        com.google.javascript.jscomp.CompilerInput compilerInput27 = assignment18.input;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(compilerInput27);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = assignment17.input;
        java.lang.String str22 = assignment17.newName;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        assignment17.newName = "hi!";
        int int20 = assignment17.orderOfOccurrence;
        assignment17.newName = "";
        com.google.javascript.jscomp.CompilerInput compilerInput23 = assignment17.input;
        assignment17.newName = "hi!";
        assignment17.count = (byte) -1;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(compilerInput23);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.VariableMap variableMap5 = null;
        char[] charArray9 = new char[] { '#', '4', '#' };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        com.google.javascript.jscomp.RenameVars renameVars14 = new com.google.javascript.jscomp.RenameVars(abstractCompiler0, "", true, false, false, variableMap5, charArray9, (java.util.Set<java.lang.String>) strSet12);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.RenameVars.Assignment assignment17 = renameVars14.new Assignment("hi!", compilerInput16);
        int int18 = assignment17.orderOfOccurrence;
        assignment17.newName = "hi!";
        assignment17.count = 0;
        assignment17.newName = "hi!";
        assignment17.count = (byte) 100;
        assignment17.count = (short) 100;
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', '4', '#' });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}

