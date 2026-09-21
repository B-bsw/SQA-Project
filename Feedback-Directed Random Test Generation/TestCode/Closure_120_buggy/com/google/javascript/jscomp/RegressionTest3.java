package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        boolean boolean9 = referenceCollection0.isEscaped();
        java.lang.Class<?> wildcardClass10 = referenceCollection0.getClass();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        boolean boolean10 = referenceCollection0.isEscaped();
        boolean boolean11 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        java.lang.Class<?> wildcardClass25 = varIterable24.getClass();
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(reference7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior6.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior6.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback18.process(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList14);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.Scope.Var var7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = referenceCollectingCallback6.getReferences(var7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback6.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback6.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = referenceCollectingCallback6.getScope(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean5 = referenceCollection0.isEscaped();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceList8.spliterator();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10);
        java.lang.Class<?> wildcardClass22 = referenceCollectingCallback21.getClass();
        org.junit.Assert.assertNotNull(behavior10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
        java.lang.Class<?> wildcardClass14 = referenceCollection0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection2.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection2.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceList4.spliterator();
        referenceCollection0.references = referenceList4;
        boolean boolean7 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = referenceCollectingCallback12.getReferences(var13);
        com.google.javascript.jscomp.Scope.Var var15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = referenceCollectingCallback12.getScope(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection14);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = null;
        referenceCollection0.add(reference3);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isEscaped();
        boolean boolean8 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection5.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection5.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean13 = referenceCollection12.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection12.references = referenceList15;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection12.spliterator();
        boolean boolean19 = referenceCollection12.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection12.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection12.references;
        referenceCollection5.references = referenceList21;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection5.references;
        referenceCollection0.references = referenceList23;
        boolean boolean25 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection7 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection7.references;
        boolean boolean9 = referenceCollection7.isEscaped();
        boolean boolean10 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection7.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection7.isAssignedOnceInLifetime();
        boolean boolean13 = referenceCollection7.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = null;
        referenceCollection7.add(reference14);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        boolean boolean18 = referenceCollection16.isEscaped();
        boolean boolean19 = referenceCollection16.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = null;
        referenceCollection16.add(reference20);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = referenceCollection16.references;
        referenceCollection7.references = referenceList22;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor24 = referenceCollection7.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection25.references;
        boolean boolean27 = referenceCollection25.isEscaped();
        boolean boolean28 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        boolean boolean29 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor30 = referenceCollection25.iterator();
        boolean boolean31 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        boolean boolean32 = referenceCollection25.isWellDefined();
        boolean boolean33 = referenceCollection25.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList34 = referenceCollection25.references;
        referenceCollection7.references = referenceList34;
        referenceCollection0.references = referenceList34;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor37 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList22);
        org.junit.Assert.assertNotNull(referenceItor24);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(referenceItor30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(referenceList34);
        org.junit.Assert.assertNotNull(referenceItor37);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior9.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9, varPredicate24);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = referenceCollectingCallback25.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior9);
        org.junit.Assert.assertNotNull(varIterable26);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior7.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior7.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.hotSwapScript(node21, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection0.references;
        boolean boolean12 = referenceCollection0.isWellDefined();
        boolean boolean13 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection14.spliterator();
        boolean boolean16 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean17 = referenceCollection14.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection14.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection14.references;
        boolean boolean20 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean21 = referenceCollection14.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean23 = referenceCollection22.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator24 = referenceCollection22.spliterator();
        boolean boolean25 = referenceCollection22.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor26 = referenceCollection22.iterator();
        boolean boolean27 = referenceCollection22.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection28.references;
        boolean boolean30 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = null;
        referenceCollection28.add(reference31);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList33 = referenceCollection28.references;
        referenceCollection22.references = referenceList33;
        referenceCollection14.references = referenceList33;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection36.references;
        boolean boolean38 = referenceCollection36.firstReferenceIsAssigningDeclaration();
        boolean boolean39 = referenceCollection36.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection40 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean41 = referenceCollection40.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray42 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList43, referenceArray42);
        referenceCollection40.references = referenceList43;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator46 = referenceList43.spliterator();
        referenceCollection36.references = referenceList43;
        referenceCollection14.references = referenceList43;
        referenceCollection0.references = referenceList43;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference50 = null;
        referenceCollection0.add(reference50);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceList33);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(referenceArray42);
        org.junit.Assert.assertArrayEquals(referenceArray42, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator46);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection3.references;
        boolean boolean5 = referenceCollection3.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList9, referenceArray8);
        referenceCollection6.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList13, referenceArray12);
        referenceCollection6.references = referenceList13;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = null;
        referenceCollection6.add(reference16);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection6.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection6.references;
        referenceCollection3.references = referenceList19;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator21 = referenceList19.spliterator();
        referenceCollection0.references = referenceList19;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference23 = null;
        referenceCollection0.add(reference23);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor25 = referenceCollection0.iterator();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceArray8);
        org.junit.Assert.assertArrayEquals(referenceArray8, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceArray12);
        org.junit.Assert.assertArrayEquals(referenceArray12, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceSpliterator21);
        org.junit.Assert.assertNotNull(referenceItor25);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor11 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection0.add(reference13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference15 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceItor11);
        org.junit.Assert.assertNull(reference12);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior6.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior6.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback18.getReferences(var19);
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection20);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior9.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap23 = null;
        behavior9.afterExitScope(nodeTraversal22, referenceMap23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        com.google.javascript.jscomp.Scope.Var var26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = referenceCollectingCallback25.getReferences(var26);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable28 = referenceCollectingCallback25.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior9);
        org.junit.Assert.assertNull(referenceCollection27);
        org.junit.Assert.assertNotNull(varIterable28);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList2 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = null;
        referenceCollection0.add(reference3);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertNotNull(referenceList2);
        org.junit.Assert.assertNotNull(referenceItor5);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior4.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior4.afterExitScope(nodeTraversal13, referenceMap14);
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNull(referenceCollection22);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = referenceCollectingCallback2.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = referenceCollectingCallback2.getReferences(var5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = referenceCollectingCallback2.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varIterable3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNull(referenceCollection6);
        org.junit.Assert.assertNotNull(varIterable7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection5.spliterator();
        boolean boolean7 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection5.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection5.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection5.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection5.add(reference11);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection13.references;
        boolean boolean15 = referenceCollection13.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = null;
        referenceCollection13.add(reference16);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList18 = referenceCollection13.references;
        referenceCollection5.references = referenceList18;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection5.references;
        referenceCollection0.references = referenceList20;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection22.references;
        boolean boolean24 = referenceCollection22.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = null;
        referenceCollection22.add(reference25);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection22.references;
        referenceCollection0.references = referenceList27;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceList18);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(referenceList27);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isWellDefined();
        boolean boolean8 = referenceCollection0.isEscaped();
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor11 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceItor11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        boolean boolean8 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection0.references = referenceList10;
        boolean boolean13 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection0.references;
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior4.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate15);
        com.google.javascript.jscomp.Scope.Var var17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = referenceCollectingCallback16.getReferences(var17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.hotSwapScript(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
        org.junit.Assert.assertNull(referenceCollection18);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior7.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback21.process(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor12 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceItor12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior4.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior4.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.Scope.Var var15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = referenceCollectingCallback14.getScope(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor3 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isEscaped();
        boolean boolean8 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean10 = referenceCollection5.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection5.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean13 = referenceCollection12.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList15, referenceArray14);
        referenceCollection12.references = referenceList15;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection12.spliterator();
        boolean boolean19 = referenceCollection12.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection12.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection12.references;
        referenceCollection5.references = referenceList21;
        referenceCollection0.references = referenceList21;
        boolean boolean24 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceItor3);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceArray14);
        org.junit.Assert.assertArrayEquals(referenceArray14, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(referenceList25);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = null;
        referenceCollection0.add(reference3);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertNotNull(referenceList5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        boolean boolean8 = referenceCollection6.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection6.add(reference9);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection6.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor12 = referenceCollection6.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection6.references;
        referenceCollection0.references = referenceList13;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertNotNull(referenceItor12);
        org.junit.Assert.assertNotNull(referenceList13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceItor9);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior8.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8, varPredicate13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8, varPredicate19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = referenceCollectingCallback24.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope27 = referenceCollectingCallback24.getScope(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNotNull(varIterable25);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isWellDefined();
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection3.references;
        boolean boolean5 = referenceCollection3.isEscaped();
        boolean boolean6 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        referenceCollection3.references = referenceList10;
        referenceCollection0.references = referenceList10;
        boolean boolean13 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection0.references;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior3.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior3.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior3.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior3.afterExitScope(nodeTraversal16, referenceMap17);
        org.junit.Assert.assertNotNull(behavior3);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        com.google.javascript.jscomp.Scope.Var var19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback18.getReferences(var19);
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNull(referenceCollection20);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean13 = referenceCollection0.isNeverAssigned();
        boolean boolean14 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean15 = referenceCollection0.isEscaped();
        boolean boolean16 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior8.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior8.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.process(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior12 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler11, behavior12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior12.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler10, behavior12, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior12.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior12, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior12, varPredicate28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap31 = null;
        behavior12.afterExitScope(nodeTraversal30, referenceMap31);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback33 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback34 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate35 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback36 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior12, varPredicate35);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate37 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback38 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior12, varPredicate37);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = referenceCollectingCallback38.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable40 = referenceCollectingCallback38.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable41 = referenceCollectingCallback38.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior12);
        org.junit.Assert.assertNotNull(varIterable39);
        org.junit.Assert.assertNotNull(varIterable40);
        org.junit.Assert.assertNotNull(varIterable41);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable5 = referenceCollectingCallback4.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback4.exitScope(nodeTraversal6);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNotNull(varIterable5);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior10.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate29);
        com.google.javascript.jscomp.Scope.Var var31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope32 = referenceCollectingCallback30.getScope(var31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection0.add(reference11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reference8);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior6.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.enterScope(nodeTraversal24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = null;
        referenceCollection8.add(reference11);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection8.references;
        referenceCollection0.references = referenceList13;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isEscaped();
        boolean boolean18 = referenceCollection15.firstReferenceIsAssigningDeclaration();
        boolean boolean19 = referenceCollection15.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList20 = referenceCollection15.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator21 = referenceList20.spliterator();
        referenceCollection0.references = referenceList20;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = null;
        referenceCollection0.references = referenceList23;
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceList20);
        org.junit.Assert.assertNotNull(referenceSpliterator21);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection8.spliterator();
        boolean boolean10 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection8.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection8.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection8.references;
        boolean boolean14 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        boolean boolean15 = referenceCollection8.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        boolean boolean18 = referenceCollection16.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean20 = referenceCollection19.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection19.references = referenceList22;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList26, referenceArray25);
        referenceCollection19.references = referenceList26;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = null;
        referenceCollection19.add(reference29);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator31 = referenceCollection19.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection19.references;
        referenceCollection16.references = referenceList32;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection34 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean35 = referenceCollection34.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList37, referenceArray36);
        referenceCollection34.references = referenceList37;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray40 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList41 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList41, referenceArray40);
        referenceCollection34.references = referenceList41;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference44 = null;
        referenceCollection34.add(reference44);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator46 = referenceCollection34.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList47 = referenceCollection34.references;
        referenceCollection16.references = referenceList47;
        referenceCollection8.references = referenceList47;
        referenceCollection0.references = referenceList47;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceArray25);
        org.junit.Assert.assertArrayEquals(referenceArray25, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator31);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceArray36);
        org.junit.Assert.assertArrayEquals(referenceArray36, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(referenceArray40);
        org.junit.Assert.assertArrayEquals(referenceArray40, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator46);
        org.junit.Assert.assertNotNull(referenceList47);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate9);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback10.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        boolean boolean6 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        boolean boolean8 = referenceCollection0.isWellDefined();
        boolean boolean9 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior12 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler11, behavior12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior12.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler10, behavior12, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap21 = null;
        behavior12.afterExitScope(nodeTraversal20, referenceMap21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior12, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior12, varPredicate28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap31 = null;
        behavior12.afterExitScope(nodeTraversal30, referenceMap31);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback33 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback34 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate35 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback36 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior12, varPredicate35);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate37 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback38 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior12, varPredicate37);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = referenceCollectingCallback38.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable40 = referenceCollectingCallback38.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal41 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback38.enterScope(nodeTraversal41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior12);
        org.junit.Assert.assertNotNull(varIterable39);
        org.junit.Assert.assertNotNull(varIterable40);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isEscaped();
        boolean boolean8 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor10 = referenceCollection5.iterator();
        boolean boolean11 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection5.isWellDefined();
        boolean boolean13 = referenceCollection5.isWellDefined();
        boolean boolean14 = referenceCollection5.isWellDefined();
        boolean boolean15 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean16 = referenceCollection5.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection5.references;
        referenceCollection0.references = referenceList17;
        boolean boolean19 = referenceCollection0.isEscaped();
        boolean boolean20 = referenceCollection0.isEscaped();
        boolean boolean21 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = null;
        referenceCollection0.add(reference3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        java.lang.Class<?> wildcardClass6 = referenceCollection0.getClass();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior6.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback20.getReferences(var24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.visit(nodeTraversal26, node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection22);
        org.junit.Assert.assertNotNull(varIterable23);
        org.junit.Assert.assertNull(referenceCollection25);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.exitScope(nodeTraversal14);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean7 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNull(reference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior10.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap29 = null;
        behavior10.afterExitScope(nodeTraversal28, referenceMap29);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap33 = null;
        behavior10.afterExitScope(nodeTraversal32, referenceMap33);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback35 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback35.enterScope(nodeTraversal36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap3 = null;
        behavior1.afterExitScope(nodeTraversal2, referenceMap3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate5);
        com.google.javascript.jscomp.Scope.Var var7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = referenceCollectingCallback6.getScope(var7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior6.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate22);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback23.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.enterScope(nodeTraversal25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNotNull(varIterable24);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior9.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9, varPredicate18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = referenceCollectingCallback24.shouldTraverse(nodeTraversal25, node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior4 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = null;
        behavior4.afterExitScope(nodeTraversal6, referenceMap7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior4, varPredicate9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior4, varPredicate11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior4.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior4, varPredicate16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback17.hotSwapScript(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior4);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior9.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior9.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior9.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap29 = null;
        behavior9.afterExitScope(nodeTraversal28, referenceMap29);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        java.lang.Class<?> wildcardClass32 = behavior9.getClass();
        org.junit.Assert.assertNotNull(behavior9);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference1 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean3 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNull(reference1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.isNeverAssigned();
        boolean boolean8 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection6.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection6.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection11 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection11.references;
        boolean boolean13 = referenceCollection11.isEscaped();
        boolean boolean14 = referenceCollection11.firstReferenceIsAssigningDeclaration();
        boolean boolean15 = referenceCollection11.firstReferenceIsAssigningDeclaration();
        boolean boolean16 = referenceCollection11.isAssignedOnceInLifetime();
        boolean boolean17 = referenceCollection11.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean19 = referenceCollection18.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList21, referenceArray20);
        referenceCollection18.references = referenceList21;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator24 = referenceCollection18.spliterator();
        boolean boolean25 = referenceCollection18.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = referenceCollection18.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection18.references;
        referenceCollection11.references = referenceList27;
        referenceCollection6.references = referenceList27;
        boolean boolean30 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean33 = referenceCollection32.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator34 = referenceCollection32.spliterator();
        boolean boolean35 = referenceCollection32.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor36 = referenceCollection32.iterator();
        boolean boolean37 = referenceCollection32.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection38 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList39 = referenceCollection38.references;
        boolean boolean40 = referenceCollection38.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference41 = null;
        referenceCollection38.add(reference41);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = referenceCollection38.references;
        referenceCollection32.references = referenceList43;
        referenceCollection6.references = referenceList43;
        referenceCollection0.references = referenceList43;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference47 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(referenceArray20);
        org.junit.Assert.assertArrayEquals(referenceArray20, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceList26);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(reference31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceItor36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(referenceList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceList43);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection6.spliterator();
        boolean boolean8 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference11 = referenceCollection6.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection6.add(reference12);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection14.references;
        boolean boolean16 = referenceCollection14.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = null;
        referenceCollection14.add(reference17);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection14.references;
        referenceCollection6.references = referenceList19;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference21 = null;
        referenceCollection6.add(reference21);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList23 = referenceCollection6.references;
        referenceCollection0.references = referenceList23;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor25 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNull(reference11);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceList23);
        org.junit.Assert.assertNotNull(referenceItor25);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = null;
        referenceCollection0.add(reference9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceList8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior10.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior10.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback28.hotSwapScript(node29, node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = null;
        referenceCollection0.add(reference4);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList9, referenceArray8);
        referenceCollection6.references = referenceList9;
        referenceCollection0.references = referenceList9;
        boolean boolean13 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor14 = referenceCollection0.iterator();
        boolean boolean15 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean17 = referenceCollection16.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator18 = referenceCollection16.spliterator();
        boolean boolean19 = referenceCollection16.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator21 = referenceCollection20.spliterator();
        boolean boolean22 = referenceCollection20.firstReferenceIsAssigningDeclaration();
        boolean boolean23 = referenceCollection20.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference24 = referenceCollection20.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = referenceCollection20.references;
        boolean boolean26 = referenceCollection20.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection27 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator28 = referenceCollection27.spliterator();
        boolean boolean29 = referenceCollection27.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection27.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = referenceCollection27.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference32 = referenceCollection27.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor33 = referenceCollection27.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList34 = referenceCollection27.references;
        referenceCollection20.references = referenceList34;
        referenceCollection16.references = referenceList34;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference37 = referenceCollection16.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList38 = referenceCollection16.references;
        referenceCollection0.references = referenceList38;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceArray8);
        org.junit.Assert.assertArrayEquals(referenceArray8, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(reference24);
        org.junit.Assert.assertNotNull(referenceList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(reference31);
        org.junit.Assert.assertNull(reference32);
        org.junit.Assert.assertNotNull(referenceItor33);
        org.junit.Assert.assertNotNull(referenceList34);
        org.junit.Assert.assertNull(reference37);
        org.junit.Assert.assertNotNull(referenceList38);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean7 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList9, referenceArray8);
        referenceCollection6.references = referenceList9;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray12 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList13, referenceArray12);
        referenceCollection6.references = referenceList13;
        referenceCollection0.references = referenceList13;
        boolean boolean17 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference19 = null;
        referenceCollection0.add(reference19);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator22 = referenceCollection21.spliterator();
        boolean boolean23 = referenceCollection21.firstReferenceIsAssigningDeclaration();
        boolean boolean24 = referenceCollection21.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference25 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference26 = referenceCollection21.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference27 = null;
        referenceCollection21.add(reference27);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection29 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = referenceCollection29.references;
        boolean boolean31 = referenceCollection29.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference32 = null;
        referenceCollection29.add(reference32);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList34 = referenceCollection29.references;
        referenceCollection21.references = referenceList34;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor36 = referenceCollection21.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection21.references;
        referenceCollection0.references = referenceList37;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceArray8);
        org.junit.Assert.assertArrayEquals(referenceArray8, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceArray12);
        org.junit.Assert.assertArrayEquals(referenceArray12, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(reference25);
        org.junit.Assert.assertNull(reference26);
        org.junit.Assert.assertNotNull(referenceList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(referenceList34);
        org.junit.Assert.assertNotNull(referenceItor36);
        org.junit.Assert.assertNotNull(referenceList37);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = referenceCollectingCallback2.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = referenceCollectingCallback2.getReferences(var5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = referenceCollectingCallback2.getReferences(var8);
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varIterable3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNull(referenceCollection6);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNull(referenceCollection9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior10.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior10.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback27.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        boolean boolean8 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection0.references = referenceList10;
        boolean boolean13 = referenceCollection0.isWellDefined();
        boolean boolean14 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean16 = referenceCollection15.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor17 = referenceCollection15.iterator();
        boolean boolean18 = referenceCollection15.isEscaped();
        boolean boolean19 = referenceCollection15.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = referenceCollection15.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection15.references;
        referenceCollection0.references = referenceList21;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection23 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean24 = referenceCollection23.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList26, referenceArray25);
        referenceCollection23.references = referenceList26;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator29 = referenceCollection23.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList30 = referenceCollection23.references;
        boolean boolean31 = referenceCollection23.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray32 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList33 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList33, referenceArray32);
        referenceCollection23.references = referenceList33;
        boolean boolean36 = referenceCollection23.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection23.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection38 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean39 = referenceCollection38.isNeverAssigned();
        boolean boolean40 = referenceCollection38.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor41 = referenceCollection38.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList42 = referenceCollection38.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = referenceCollection38.references;
        referenceCollection23.references = referenceList43;
        referenceCollection0.references = referenceList43;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(referenceItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(reference20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(referenceArray25);
        org.junit.Assert.assertArrayEquals(referenceArray25, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator29);
        org.junit.Assert.assertNotNull(referenceList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(referenceArray32);
        org.junit.Assert.assertArrayEquals(referenceArray32, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(referenceItor41);
        org.junit.Assert.assertNotNull(referenceList42);
        org.junit.Assert.assertNotNull(referenceList43);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isWellDefined();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback18.hotSwapScript(node19, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection0.add(reference13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        boolean boolean8 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList10, referenceArray9);
        referenceCollection0.references = referenceList10;
        boolean boolean13 = referenceCollection0.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection0.references;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection0.spliterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor16 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceArray9);
        org.junit.Assert.assertArrayEquals(referenceArray9, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertNotNull(referenceItor16);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.isNeverAssigned();
        boolean boolean11 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        boolean boolean7 = referenceCollection0.isEscaped();
        boolean boolean8 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9, varPredicate18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback19.enterScope(nodeTraversal20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior6.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior6.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection14.references;
        boolean boolean16 = referenceCollection14.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference17 = null;
        referenceCollection14.add(reference17);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection14.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor20 = referenceCollection14.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList21 = referenceCollection14.references;
        referenceCollection0.references = referenceList21;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor23 = referenceCollection0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reference13);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertNotNull(referenceItor20);
        org.junit.Assert.assertNotNull(referenceList21);
        org.junit.Assert.assertNotNull(referenceItor23);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback5 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3, varPredicate4);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior3.afterExitScope(nodeTraversal8, referenceMap9);
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
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior7.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate18);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = referenceCollectingCallback19.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable20);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection6.references;
        referenceCollection0.references = referenceList7;
        boolean boolean9 = referenceCollection0.isEscaped();
        boolean boolean10 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor11 = referenceCollection0.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList12 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection0.references;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(referenceItor11);
        org.junit.Assert.assertNotNull(referenceList12);
        org.junit.Assert.assertNotNull(referenceList13);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback10.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback10.exitScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior5.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior5.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior5.afterExitScope(nodeTraversal17, referenceMap18);
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = null;
        referenceCollection0.add(reference8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior5.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.Scope.Var var14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = referenceCollectingCallback13.getScope(var14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean6 = referenceCollection5.isNeverAssigned();
        boolean boolean7 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection8.references;
        boolean boolean10 = referenceCollection8.isEscaped();
        boolean boolean11 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection8.add(reference12);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean15 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList17, referenceArray16);
        referenceCollection14.references = referenceList17;
        referenceCollection8.references = referenceList17;
        referenceCollection5.references = referenceList17;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean23 = referenceCollection22.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor24 = referenceCollection22.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean26 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator27 = referenceCollection25.spliterator();
        boolean boolean28 = referenceCollection25.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor29 = referenceCollection25.iterator();
        boolean boolean30 = referenceCollection25.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection31 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection31.references;
        boolean boolean33 = referenceCollection31.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference34 = null;
        referenceCollection31.add(reference34);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList36 = referenceCollection31.references;
        referenceCollection25.references = referenceList36;
        referenceCollection22.references = referenceList36;
        referenceCollection5.references = referenceList36;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor40 = referenceCollection5.iterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList41 = referenceCollection5.references;
        referenceCollection0.references = referenceList41;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator43 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference44 = null;
        referenceCollection0.add(reference44);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(referenceArray16);
        org.junit.Assert.assertArrayEquals(referenceArray16, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(referenceItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(referenceItor29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(referenceList36);
        org.junit.Assert.assertNotNull(referenceItor40);
        org.junit.Assert.assertNotNull(referenceList41);
        org.junit.Assert.assertNotNull(referenceSpliterator43);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback22.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = referenceCollectingCallback22.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.visit(nodeTraversal25, node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable23);
        org.junit.Assert.assertNotNull(varIterable24);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.isWellDefined();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection5.references;
        boolean boolean7 = referenceCollection5.isEscaped();
        boolean boolean8 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor10 = referenceCollection5.iterator();
        boolean boolean11 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean12 = referenceCollection5.isWellDefined();
        boolean boolean13 = referenceCollection5.isWellDefined();
        boolean boolean14 = referenceCollection5.isWellDefined();
        boolean boolean15 = referenceCollection5.firstReferenceIsAssigningDeclaration();
        boolean boolean16 = referenceCollection5.isEscaped();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection5.references;
        referenceCollection0.references = referenceList17;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor19 = referenceCollection0.iterator();
        boolean boolean20 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(referenceItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertNotNull(referenceItor19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference6 = null;
        referenceCollection0.add(reference6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior9.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9, varPredicate14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9, varPredicate16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9, varPredicate18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9, varPredicate20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference7 = null;
        referenceCollection0.add(reference7);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        boolean boolean11 = referenceCollection9.isEscaped();
        boolean boolean12 = referenceCollection9.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection9.add(reference13);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection9.references;
        referenceCollection0.references = referenceList15;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor17 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection18 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection18.references;
        boolean boolean20 = referenceCollection18.isEscaped();
        boolean boolean21 = referenceCollection18.firstReferenceIsAssigningDeclaration();
        boolean boolean22 = referenceCollection18.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor23 = referenceCollection18.iterator();
        boolean boolean24 = referenceCollection18.firstReferenceIsAssigningDeclaration();
        boolean boolean25 = referenceCollection18.isWellDefined();
        boolean boolean26 = referenceCollection18.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList27 = referenceCollection18.references;
        referenceCollection0.references = referenceList27;
        boolean boolean29 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean30 = referenceCollection0.isEscaped();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertNotNull(referenceItor17);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(referenceItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = referenceCollectingCallback14.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable15);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6, varPredicate13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior6.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6, varPredicate20);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6, varPredicate22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.exitScope(nodeTraversal24);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate14);
        com.google.javascript.jscomp.Scope.Var var16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection17 = referenceCollectingCallback15.getReferences(var16);
        com.google.javascript.jscomp.Scope.Var var18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope19 = referenceCollectingCallback15.getScope(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNull(referenceCollection17);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior6.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback15.visit(nodeTraversal16, node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection0.add(reference13);
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor15 = referenceCollection0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference16 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNotNull(referenceItor15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior7.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior7.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate20);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback21.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback21.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = referenceCollectingCallback21.shouldTraverse(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNotNull(varIterable23);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor6 = referenceCollection0.iterator();
        boolean boolean7 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor9 = referenceCollection0.iterator();
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator11 = referenceCollection0.spliterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertNotNull(referenceItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator11);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection3.references;
        boolean boolean5 = referenceCollection3.isEscaped();
        boolean boolean6 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection3.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection9 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection9.references;
        referenceCollection3.references = referenceList10;
        referenceCollection0.references = referenceList10;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator13 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean15 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertNotNull(referenceList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertNotNull(referenceSpliterator13);
        org.junit.Assert.assertNull(reference14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior10.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap29 = null;
        behavior10.afterExitScope(nodeTraversal28, referenceMap29);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap33 = null;
        behavior10.afterExitScope(nodeTraversal32, referenceMap33);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback35 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10);
        java.lang.Class<?> wildcardClass36 = behavior10.getClass();
        org.junit.Assert.assertNotNull(behavior10);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate19);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.visit(nodeTraversal23, node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNull(referenceCollection22);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = null;
        behavior7.afterExitScope(nodeTraversal9, referenceMap10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7, varPredicate12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback23.visit(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean4 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertNull(reference3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.isEscaped();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference8 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList9 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reference8);
        org.junit.Assert.assertNotNull(referenceList9);
        org.junit.Assert.assertNull(reference10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNull(reference13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior9.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior9.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = referenceCollectingCallback25.shouldTraverse(nodeTraversal26, node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = referenceCollection0.references;
        boolean boolean4 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = referenceCollection0.isNeverAssigned();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(referenceList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = null;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1, varPredicate2);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = referenceCollectingCallback3.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = referenceCollectingCallback3.getReferences(var5);
        com.google.javascript.jscomp.Scope.Var var7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = referenceCollectingCallback3.getReferences(var7);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = referenceCollectingCallback3.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = referenceCollectingCallback3.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = referenceCollectingCallback3.getAllSymbols();
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertNull(referenceCollection6);
        org.junit.Assert.assertNull(referenceCollection8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList10 = referenceCollection0.references;
        boolean boolean11 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = null;
        referenceCollection0.add(reference12);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator14 = referenceCollection0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior9.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior9.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate22 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9, varPredicate22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior9.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9, varPredicate28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap31 = null;
        behavior9.afterExitScope(nodeTraversal30, referenceMap31);
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.hotSwapScript(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior8.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior2.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior2.afterExitScope(nodeTraversal8, referenceMap9);
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean6 = referenceCollection0.isEscaped();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection0.spliterator();
        boolean boolean8 = referenceCollection0.isWellDefined();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNull(reference5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate3 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2, varPredicate3);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2, varPredicate5);
        com.google.javascript.jscomp.Scope.Var var7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = referenceCollectingCallback6.getReferences(var7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback6.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
        org.junit.Assert.assertNull(referenceCollection8);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior10.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior10.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate27);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = referenceCollectingCallback28.getAllSymbols();
        org.junit.Assert.assertNotNull(behavior10);
        org.junit.Assert.assertNotNull(varIterable29);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor4 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        boolean boolean6 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(referenceItor4);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior6.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = referenceCollectingCallback20.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback20.getReferences(var23);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope27 = referenceCollectingCallback20.getScope(var26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNotNull(varIterable21);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNull(referenceCollection24);
        org.junit.Assert.assertNotNull(varIterable25);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior7.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior7.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback20.exitScope(nodeTraversal21);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9, varPredicate15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap18 = null;
        behavior9.afterExitScope(nodeTraversal17, referenceMap18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9);
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = null;
        referenceCollection0.add(reference10);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator12 = referenceCollection0.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference14 = null;
        referenceCollection0.add(reference14);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator16 = referenceCollection0.spliterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator17 = referenceCollection0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = referenceCollection0.firstReferenceIsAssigningDeclaration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertNotNull(referenceSpliterator16);
        org.junit.Assert.assertNotNull(referenceSpliterator17);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior2 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback3 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = null;
        behavior2.afterExitScope(nodeTraversal4, referenceMap5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior2.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap11 = null;
        behavior2.afterExitScope(nodeTraversal10, referenceMap11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior2.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior2);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback16.hotSwapScript(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior2);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior1 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback2 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior1);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable3 = referenceCollectingCallback2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection5 = referenceCollectingCallback2.getReferences(var4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback2.hotSwapScript(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior1);
        org.junit.Assert.assertNotNull(varIterable3);
        org.junit.Assert.assertNull(referenceCollection5);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior10.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap20 = null;
        behavior10.afterExitScope(nodeTraversal19, referenceMap20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate23);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate27);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal29 = null;
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback28.visit(nodeTraversal29, node30, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior13 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler12, behavior13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior13.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler11, behavior13, varPredicate18);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler10, behavior13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior13.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior13, varPredicate24);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate29 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback30 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior13, varPredicate29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap32 = null;
        behavior13.afterExitScope(nodeTraversal31, referenceMap32);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback34 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback35 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate36 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback37 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior13, varPredicate36);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate38 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback39 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior13, varPredicate38);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate40 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback41 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior13, varPredicate40);
        org.junit.Assert.assertNotNull(behavior13);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8, varPredicate13);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap17 = null;
        behavior8.afterExitScope(nodeTraversal16, referenceMap17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate21);
        com.google.javascript.jscomp.Scope.Var var23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope24 = referenceCollectingCallback22.getScope(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior10.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback16 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10, varPredicate15);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10, varPredicate21);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback25 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate26 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback27 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap29 = null;
        behavior10.afterExitScope(nodeTraversal28, referenceMap29);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback31 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap33 = null;
        behavior10.afterExitScope(nodeTraversal32, referenceMap33);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate35 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback36 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10, varPredicate35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback36.hotSwapScript(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = null;
        behavior5.afterExitScope(nodeTraversal7, referenceMap8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap14 = null;
        behavior5.afterExitScope(nodeTraversal13, referenceMap14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback18.visit(nodeTraversal19, node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior10 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler9, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior10, varPredicate16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior10.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior10, varPredicate21);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior10, varPredicate23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap26 = null;
        behavior10.afterExitScope(nodeTraversal25, referenceMap26);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback28 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior10);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback29 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = referenceCollectingCallback29.shouldTraverse(nodeTraversal30, node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior10);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate12);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = referenceCollectingCallback13.getAllSymbols();
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
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable14);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior3 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback4 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap6 = null;
        behavior3.afterExitScope(nodeTraversal5, referenceMap6);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior3, varPredicate8);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior3, varPredicate10);
        com.google.javascript.jscomp.Scope.Var var12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection13 = referenceCollectingCallback11.getReferences(var12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback11.hotSwapScript(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior3);
        org.junit.Assert.assertNull(referenceCollection13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator2 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection3 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean4 = referenceCollection3.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray5 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList6, referenceArray5);
        referenceCollection3.references = referenceList6;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceList6.spliterator();
        referenceCollection0.references = referenceList6;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator11 = referenceCollection0.spliterator();
        boolean boolean12 = referenceCollection0.isWellDefined();
        boolean boolean13 = referenceCollection0.isWellDefined();
        boolean boolean14 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection15 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection15.references;
        boolean boolean17 = referenceCollection15.isEscaped();
        boolean boolean18 = referenceCollection15.firstReferenceIsAssigningDeclaration();
        boolean boolean19 = referenceCollection15.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference20 = null;
        referenceCollection15.add(reference20);
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean23 = referenceCollection22.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray24 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList25 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList25, referenceArray24);
        referenceCollection22.references = referenceList25;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList29, referenceArray28);
        referenceCollection22.references = referenceList29;
        boolean boolean32 = referenceCollection22.isAssignedOnceInLifetime();
        boolean boolean33 = referenceCollection22.isAssignedOnceInLifetime();
        boolean boolean34 = referenceCollection22.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference35 = referenceCollection22.getInitializingReferenceForConstants();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList37, referenceArray36);
        referenceCollection22.references = referenceList37;
        referenceCollection15.references = referenceList37;
        referenceCollection0.references = referenceList37;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray5);
        org.junit.Assert.assertArrayEquals(referenceArray5, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertNotNull(referenceSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceArray24);
        org.junit.Assert.assertArrayEquals(referenceArray24, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(referenceArray28);
        org.junit.Assert.assertArrayEquals(referenceArray28, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(reference35);
        org.junit.Assert.assertNotNull(referenceArray36);
        org.junit.Assert.assertArrayEquals(referenceArray36, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor1 = referenceCollection0.iterator();
        boolean boolean2 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean3 = referenceCollection0.isNeverAssigned();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList4 = referenceCollection0.references;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceItor1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(referenceList4);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean5 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator7 = referenceCollection6.spliterator();
        boolean boolean8 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        boolean boolean9 = referenceCollection6.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference10 = referenceCollection6.getInitializingReferenceForConstants();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor11 = referenceCollection6.iterator();
        boolean boolean12 = referenceCollection6.isEscaped();
        boolean boolean13 = referenceCollection6.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList14 = referenceCollection6.references;
        referenceCollection0.references = referenceList14;
        java.lang.Class<?> wildcardClass16 = referenceCollection0.getClass();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reference10);
        org.junit.Assert.assertNotNull(referenceItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior8.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap19 = null;
        behavior8.afterExitScope(nodeTraversal18, referenceMap19);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.hotSwapScript(node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.isNeverAssigned();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor2 = referenceCollection0.iterator();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator3 = referenceCollection0.spliterator();
        boolean boolean4 = referenceCollection0.isEscaped();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(referenceItor2);
        org.junit.Assert.assertNotNull(referenceSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        boolean boolean6 = referenceCollection0.isNeverAssigned();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList8 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(referenceList8);
        org.junit.Assert.assertNull(reference9);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate12);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference3 = null;
        referenceCollection0.add(reference3);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList6 = referenceCollection0.references;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor7 = referenceCollection0.iterator();
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertNotNull(referenceList6);
        org.junit.Assert.assertNotNull(referenceItor7);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior8.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8, varPredicate21);
        com.google.javascript.jscomp.Scope.Var var23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback22.getReferences(var23);
        org.junit.Assert.assertNotNull(behavior8);
        org.junit.Assert.assertNull(referenceCollection24);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference5 = null;
        referenceCollection0.add(reference5);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = referenceCollection0.references;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection8 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection8.spliterator();
        boolean boolean10 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection8.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection8.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList13 = referenceCollection8.references;
        boolean boolean14 = referenceCollection8.firstReferenceIsAssigningDeclaration();
        boolean boolean15 = referenceCollection8.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection16 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection16.references;
        boolean boolean18 = referenceCollection16.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection19 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean20 = referenceCollection19.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray21 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList22 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList22, referenceArray21);
        referenceCollection19.references = referenceList22;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray25 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList26 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList26, referenceArray25);
        referenceCollection19.references = referenceList26;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference29 = null;
        referenceCollection19.add(reference29);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator31 = referenceCollection19.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList32 = referenceCollection19.references;
        referenceCollection16.references = referenceList32;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection34 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean35 = referenceCollection34.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList37, referenceArray36);
        referenceCollection34.references = referenceList37;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray40 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList41 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList41, referenceArray40);
        referenceCollection34.references = referenceList41;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference44 = null;
        referenceCollection34.add(reference44);
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator46 = referenceCollection34.spliterator();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList47 = referenceCollection34.references;
        referenceCollection16.references = referenceList47;
        referenceCollection8.references = referenceList47;
        referenceCollection0.references = referenceList47;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = referenceCollection0.isAssignedOnceInLifetime();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceList7);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(reference12);
        org.junit.Assert.assertNotNull(referenceList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(referenceList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(referenceArray21);
        org.junit.Assert.assertArrayEquals(referenceArray21, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceArray25);
        org.junit.Assert.assertArrayEquals(referenceArray25, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator31);
        org.junit.Assert.assertNotNull(referenceList32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(referenceArray36);
        org.junit.Assert.assertArrayEquals(referenceArray36, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(referenceArray40);
        org.junit.Assert.assertArrayEquals(referenceArray40, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator46);
        org.junit.Assert.assertNotNull(referenceList47);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList5 = referenceCollection0.references;
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean10 = referenceCollection0.isAssignedOnceInLifetime();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertNotNull(referenceList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator5 = referenceCollection0.spliterator();
        boolean boolean6 = referenceCollection0.isAssignedOnceInLifetime();
        boolean boolean7 = referenceCollection0.isWellDefined();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator9 = referenceCollection0.spliterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection10 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection10.references;
        boolean boolean12 = referenceCollection10.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = null;
        referenceCollection10.add(reference13);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList15 = referenceCollection10.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList16 = referenceCollection10.references;
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList17 = referenceCollection10.references;
        referenceCollection0.references = referenceList17;
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator9);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(referenceList15);
        org.junit.Assert.assertNotNull(referenceList16);
        org.junit.Assert.assertNotNull(referenceList17);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior6.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = referenceCollectingCallback20.getReferences(var21);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var24 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection25 = referenceCollectingCallback20.getReferences(var24);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var27 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = referenceCollectingCallback20.getReferences(var27);
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection22);
        org.junit.Assert.assertNotNull(varIterable23);
        org.junit.Assert.assertNull(referenceCollection25);
        org.junit.Assert.assertNotNull(varIterable26);
        org.junit.Assert.assertNull(referenceCollection28);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean8 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior5 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback6 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior5, varPredicate7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior5);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate10 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior5, varPredicate10);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior5, varPredicate12);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = referenceCollectingCallback13.getAllSymbols();
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback13.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior5);
        org.junit.Assert.assertNotNull(varIterable14);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean1 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray2 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList3 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList3, referenceArray2);
        referenceCollection0.references = referenceList3;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray6 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList7 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList7, referenceArray6);
        referenceCollection0.references = referenceList7;
        boolean boolean10 = referenceCollection0.isWellDefined();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList11 = referenceCollection0.references;
        boolean boolean12 = referenceCollection0.isWellDefined();
        boolean boolean13 = referenceCollection0.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection14 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator15 = referenceCollection14.spliterator();
        boolean boolean16 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean17 = referenceCollection14.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference18 = referenceCollection14.getInitializingReferenceForConstants();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList19 = referenceCollection14.references;
        boolean boolean20 = referenceCollection14.firstReferenceIsAssigningDeclaration();
        boolean boolean21 = referenceCollection14.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection22 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean23 = referenceCollection22.firstReferenceIsAssigningDeclaration();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator24 = referenceCollection22.spliterator();
        boolean boolean25 = referenceCollection22.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor26 = referenceCollection22.iterator();
        boolean boolean27 = referenceCollection22.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection28 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList29 = referenceCollection28.references;
        boolean boolean30 = referenceCollection28.isWellDefined();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference31 = null;
        referenceCollection28.add(reference31);
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList33 = referenceCollection28.references;
        referenceCollection22.references = referenceList33;
        referenceCollection14.references = referenceList33;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection36 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList37 = referenceCollection36.references;
        boolean boolean38 = referenceCollection36.firstReferenceIsAssigningDeclaration();
        boolean boolean39 = referenceCollection36.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection40 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        boolean boolean41 = referenceCollection40.firstReferenceIsAssigningDeclaration();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] referenceArray42 = new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {};
        java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList43 = new java.util.ArrayList<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference>) referenceList43, referenceArray42);
        referenceCollection40.references = referenceList43;
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator46 = referenceList43.spliterator();
        referenceCollection36.references = referenceList43;
        referenceCollection14.references = referenceList43;
        referenceCollection0.references = referenceList43;
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor50 = referenceCollection0.iterator();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference51 = null;
        referenceCollection0.add(reference51);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(referenceArray2);
        org.junit.Assert.assertArrayEquals(referenceArray2, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceArray6);
        org.junit.Assert.assertArrayEquals(referenceArray6, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(referenceList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(reference18);
        org.junit.Assert.assertNotNull(referenceList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(referenceItor26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(referenceList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(referenceList33);
        org.junit.Assert.assertNotNull(referenceList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(referenceArray42);
        org.junit.Assert.assertArrayEquals(referenceArray42, new com.google.javascript.jscomp.ReferenceCollectingCallback.Reference[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator46);
        org.junit.Assert.assertNotNull(referenceItor50);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior7 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior7);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior7.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback14 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior7.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior7);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior7, varPredicate19);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior7, varPredicate21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            referenceCollectingCallback22.process(node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior7);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior8 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior8);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior8.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior8, varPredicate17);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior8, varPredicate19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap22 = null;
        behavior8.afterExitScope(nodeTraversal21, referenceMap22);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior8);
        org.junit.Assert.assertNotNull(behavior8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback8 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback9 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback11 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap13 = null;
        behavior6.afterExitScope(nodeTraversal12, referenceMap13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap16 = null;
        behavior6.afterExitScope(nodeTraversal15, referenceMap16);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        com.google.javascript.jscomp.Scope.Var var19 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection20 = referenceCollectingCallback18.getReferences(var19);
        com.google.javascript.jscomp.Scope.Var var21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope22 = referenceCollectingCallback18.getScope(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNull(referenceCollection20);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior9 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback10 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler8, behavior9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = null;
        behavior9.afterExitScope(nodeTraversal11, referenceMap12);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback15 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler7, behavior9, varPredicate14);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate16 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback17 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler6, behavior9, varPredicate16);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate18 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior9, varPredicate18);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate20 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback21 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior9, varPredicate20);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback22 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback23 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior9);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback24 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate25 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback26 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior9, varPredicate25);
        org.junit.Assert.assertNotNull(behavior9);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator1 = referenceCollection0.spliterator();
        boolean boolean2 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean3 = referenceCollection0.isEscaped();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference4 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean5 = referenceCollection0.isWellDefined();
        java.util.Spliterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceSpliterator6 = referenceCollection0.spliterator();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        org.junit.Assert.assertNotNull(referenceSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(reference4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(referenceSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior behavior6 = com.google.javascript.jscomp.ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback7 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler5, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap9 = null;
        behavior6.afterExitScope(nodeTraversal8, referenceMap9);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate11 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback12 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler4, behavior6, varPredicate11);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback13 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler3, behavior6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap15 = null;
        behavior6.afterExitScope(nodeTraversal14, referenceMap15);
        com.google.common.base.Predicate<com.google.javascript.jscomp.Scope.Var> varPredicate17 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback18 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler2, behavior6, varPredicate17);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback19 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler1, behavior6);
        com.google.javascript.jscomp.ReferenceCollectingCallback referenceCollectingCallback20 = new com.google.javascript.jscomp.ReferenceCollectingCallback(abstractCompiler0, behavior6);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = referenceCollectingCallback20.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = referenceCollectingCallback20.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var23 = null;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection24 = referenceCollectingCallback20.getReferences(var23);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = referenceCollectingCallback20.getAllSymbols();
        java.lang.Class<?> wildcardClass26 = varIterable25.getClass();
        org.junit.Assert.assertNotNull(behavior6);
        org.junit.Assert.assertNotNull(varIterable21);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNull(referenceCollection24);
        org.junit.Assert.assertNotNull(varIterable25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection referenceCollection0 = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
        java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceList1 = referenceCollection0.references;
        boolean boolean2 = referenceCollection0.isEscaped();
        boolean boolean3 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean4 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        java.util.Iterator<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> referenceItor5 = referenceCollection0.iterator();
        boolean boolean6 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean7 = referenceCollection0.isNeverAssigned();
        boolean boolean8 = referenceCollection0.isAssignedOnceInLifetime();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference9 = referenceCollection0.getInitializingReferenceForConstants();
        boolean boolean10 = referenceCollection0.firstReferenceIsAssigningDeclaration();
        boolean boolean11 = referenceCollection0.isNeverAssigned();
        com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference12 = referenceCollection0.getInitializingReferenceForConstants();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ReferenceCollectingCallback.Reference reference13 = referenceCollection0.getInitializingReference();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(referenceList1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(referenceItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reference9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(reference12);
    }
}

