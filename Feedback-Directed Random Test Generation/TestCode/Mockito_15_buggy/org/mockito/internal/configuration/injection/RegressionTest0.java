package org.mockito.internal.configuration.injection;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass1 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass2 = finalMockCandidateFilter1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { finalMockCandidateFilter1, "hi!" };
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList5, objArray4);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter9 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList5, field7, obj8);
        java.lang.Class<?> wildcardClass10 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass13 = finalMockCandidateFilter12.getClass();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter22 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter23 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass24 = finalMockCandidateFilter23.getClass();
        java.lang.Object[] objArray26 = new java.lang.Object[] { finalMockCandidateFilter23, "hi!" };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter22.filterCandidate((java.util.Collection<java.lang.Object>) objList27, field29, obj30);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d), 10.0f, (short) 1, (-1.0d), (byte) 10, "", "hi!", (byte) 1, (-1.0d), (-1.0f), "", wildcardClass13, (-1L), 10, 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, finalMockCandidateFilter22, 1L, 10.0d };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        java.lang.reflect.Field field37 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter39 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList35, field37, (java.lang.Object) "");
        java.util.Collection<java.lang.Object> objCollection40 = null;
        java.lang.reflect.Field field41 = null;
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter42 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter43 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter44 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass45 = finalMockCandidateFilter44.getClass();
        java.lang.Object[] objArray47 = new java.lang.Object[] { finalMockCandidateFilter44, "hi!" };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.lang.reflect.Field field50 = null;
        java.lang.Object obj51 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter52 = finalMockCandidateFilter43.filterCandidate((java.util.Collection<java.lang.Object>) objList48, field50, obj51);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter53 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter54 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass55 = finalMockCandidateFilter54.getClass();
        java.lang.Object[] objArray57 = new java.lang.Object[] { finalMockCandidateFilter54, "hi!" };
        java.util.ArrayList<java.lang.Object> objList58 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList58, objArray57);
        java.lang.reflect.Field field60 = null;
        java.lang.Object obj61 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter53.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field60, obj61);
        java.lang.reflect.Field field63 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter65 = finalMockCandidateFilter43.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field63, (java.lang.Object) 100.0d);
        java.lang.reflect.Field field66 = null;
        java.lang.Object obj67 = new java.lang.Object();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter68 = finalMockCandidateFilter42.filterCandidate((java.util.Collection<java.lang.Object>) objList58, field66, obj67);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter69 = finalMockCandidateFilter0.filterCandidate(objCollection40, field41, (java.lang.Object) field66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter39);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter52);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
        org.junit.Assert.assertNotNull(ongoingInjecter65);
        org.junit.Assert.assertNotNull(ongoingInjecter68);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass2 = finalMockCandidateFilter1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { finalMockCandidateFilter1, "hi!" };
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList5, objArray4);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter9 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList5, field7, obj8);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter10 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter11 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass12 = finalMockCandidateFilter11.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { finalMockCandidateFilter11, "hi!" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter19 = finalMockCandidateFilter10.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field17, obj18);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter22 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field20, (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass23 = objList15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter19);
        org.junit.Assert.assertNotNull(ongoingInjecter22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass3 = finalMockCandidateFilter2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { finalMockCandidateFilter2, "hi!" };
        java.util.ArrayList<java.lang.Object> objList6 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList6, objArray5);
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter10 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList6, field8, obj9);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter11 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass13 = finalMockCandidateFilter12.getClass();
        java.lang.Object[] objArray15 = new java.lang.Object[] { finalMockCandidateFilter12, "hi!" };
        java.util.ArrayList<java.lang.Object> objList16 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList16, objArray15);
        java.lang.reflect.Field field18 = null;
        java.lang.Object obj19 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter20 = finalMockCandidateFilter11.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field18, obj19);
        java.lang.reflect.Field field21 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter23 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field21, (java.lang.Object) 100.0d);
        java.lang.reflect.Field field24 = null;
        java.lang.Object obj25 = new java.lang.Object();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field24, obj25);
        java.lang.Class<?> wildcardClass27 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter20);
        org.junit.Assert.assertNotNull(ongoingInjecter23);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass2 = finalMockCandidateFilter1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { finalMockCandidateFilter1, "hi!" };
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList5, objArray4);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter9 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList5, field7, obj8);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter10 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter11 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass12 = finalMockCandidateFilter11.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { finalMockCandidateFilter11, "hi!" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter19 = finalMockCandidateFilter10.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field17, obj18);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter22 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field20, (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass23 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter19);
        org.junit.Assert.assertNotNull(ongoingInjecter22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter2 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass3 = finalMockCandidateFilter2.getClass();
        java.lang.Object[] objArray5 = new java.lang.Object[] { finalMockCandidateFilter2, "hi!" };
        java.util.ArrayList<java.lang.Object> objList6 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList6, objArray5);
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter10 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList6, field8, obj9);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter11 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass13 = finalMockCandidateFilter12.getClass();
        java.lang.Object[] objArray15 = new java.lang.Object[] { finalMockCandidateFilter12, "hi!" };
        java.util.ArrayList<java.lang.Object> objList16 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList16, objArray15);
        java.lang.reflect.Field field18 = null;
        java.lang.Object obj19 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter20 = finalMockCandidateFilter11.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field18, obj19);
        java.lang.reflect.Field field21 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter23 = finalMockCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field21, (java.lang.Object) 100.0d);
        java.lang.reflect.Field field24 = null;
        java.lang.Object obj25 = new java.lang.Object();
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter26 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList16, field24, obj25);
        java.lang.Class<?> wildcardClass27 = obj25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter20);
        org.junit.Assert.assertNotNull(ongoingInjecter23);
        org.junit.Assert.assertNotNull(ongoingInjecter26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass2 = finalMockCandidateFilter1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { finalMockCandidateFilter1, "hi!" };
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList5, objArray4);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter9 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList5, field7, obj8);
        java.lang.Class<?> wildcardClass10 = ongoingInjecter9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter1 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass2 = finalMockCandidateFilter1.getClass();
        java.lang.Object[] objArray4 = new java.lang.Object[] { finalMockCandidateFilter1, "hi!" };
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList5, objArray4);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter9 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList5, field7, obj8);
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter10 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter11 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass12 = finalMockCandidateFilter11.getClass();
        java.lang.Object[] objArray14 = new java.lang.Object[] { finalMockCandidateFilter11, "hi!" };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        java.lang.reflect.Field field17 = null;
        java.lang.Object obj18 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter19 = finalMockCandidateFilter10.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field17, obj18);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter22 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList15, field20, (java.lang.Object) 100.0d);
        java.lang.Class<?> wildcardClass23 = ongoingInjecter22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter19);
        org.junit.Assert.assertNotNull(ongoingInjecter22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass13 = finalMockCandidateFilter12.getClass();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter22 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.FinalMockCandidateFilter finalMockCandidateFilter23 = new org.mockito.internal.configuration.injection.FinalMockCandidateFilter();
        java.lang.Class<?> wildcardClass24 = finalMockCandidateFilter23.getClass();
        java.lang.Object[] objArray26 = new java.lang.Object[] { finalMockCandidateFilter23, "hi!" };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        java.lang.reflect.Field field29 = null;
        java.lang.Object obj30 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter22.filterCandidate((java.util.Collection<java.lang.Object>) objList27, field29, obj30);
        java.lang.Object[] objArray34 = new java.lang.Object[] { (-1.0d), 10.0f, (short) 1, (-1.0d), (byte) 10, "", "hi!", (byte) 1, (-1.0d), (-1.0f), "", wildcardClass13, (-1L), 10, 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, finalMockCandidateFilter22, 1L, 10.0d };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        java.lang.reflect.Field field37 = null;
        org.mockito.internal.configuration.injection.OngoingInjecter ongoingInjecter39 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objList35, field37, (java.lang.Object) "");
        java.lang.Class<?> wildcardClass40 = ongoingInjecter39.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(ongoingInjecter39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }
}

