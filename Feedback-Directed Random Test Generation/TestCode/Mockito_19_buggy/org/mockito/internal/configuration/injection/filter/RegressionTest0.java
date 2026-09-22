package org.mockito.internal.configuration.injection.filter;

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
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        java.util.Collection<java.lang.Object> objCollection3 = null;
        java.lang.reflect.Field field4 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter5 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter6 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter7 = nameBasedCandidateFilter2.filterCandidate(objCollection3, field4, (java.lang.Object) typeBasedCandidateFilter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection0 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection12 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter31 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter32 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter31);
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, propertyAndSetterInjection12, 1, 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100, "", (byte) 100, (byte) 100, 100.0d, 0.0f, (short) 0, 'a', "hi!", ' ', "", mockCandidateFilter31, (byte) -1, 1L, 0, (byte) 0, (byte) 10, (short) 1, 10.0f, 100.0f, (byte) 0, 10.0f, 'a', (byte) 10 };
        java.util.LinkedHashSet<java.lang.Object> objSet46 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet46, objArray45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = propertyAndSetterInjection0.process(field1, (java.lang.Object) (-1.0d), (java.util.Set<java.lang.Object>) objSet46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter4 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter6 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter4);
        java.lang.Object[] objArray8 = new java.lang.Object[] { (byte) 100, nameBasedCandidateFilter6, 100 };
        java.util.ArrayList<java.lang.Object> objList9 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList9, objArray8);
        java.lang.reflect.Field field11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter13 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList9, field11, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter9 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter8);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter10 = typeBasedCandidateFilter9.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter14 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter15 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter14);
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection37 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection38 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy39 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection40 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter46 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter47 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter46);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter48 = typeBasedCandidateFilter47.next;
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection49 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        java.lang.Object[] objArray52 = new java.lang.Object[] { 100.0f, (short) -1, false, (short) 100, (byte) 10, mockCandidateFilter10, "hi!", '4', (short) 1, typeBasedCandidateFilter15, 0.0d, 1L, 10, 0.0f, 100, 0.0f, true, 0, 0, 100, 0.0d, 10, '#', '4', (-1.0f), (short) 0, 100.0f, (-1), 0L, (-1.0d), 1L, propertyAndSetterInjection37, propertyAndSetterInjection38, mockInjectionStrategy39, propertyAndSetterInjection40, (-1), 100, false, 100.0d, ' ', typeBasedCandidateFilter47, propertyAndSetterInjection49, 100, (-1.0f) };
        java.util.ArrayList<java.lang.Object> objList53 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList53, objArray52);
        java.lang.reflect.Field field55 = null;
        java.lang.Object obj56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter57 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objList53, field55, obj56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter10);
        org.junit.Assert.assertNotNull(mockInjectionStrategy39);
        org.junit.Assert.assertNull(mockCandidateFilter48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet16 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet16, objArray15);
        boolean boolean18 = mockInjectionStrategy0.process(field1, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet16);
        java.lang.Class<?> wildcardClass19 = mockInjectionStrategy0.getClass();
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy7 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field8 = null;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet23 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet23, objArray22);
        boolean boolean25 = mockInjectionStrategy7.process(field8, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet23);
        java.lang.reflect.Field field26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter28 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet23, field26, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNotNull(mockInjectionStrategy7);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        java.lang.Class<?> wildcardClass7 = typeBasedCandidateFilter1.getClass();
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = mockCandidateFilter2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet20 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet20, objArray19);
        boolean boolean22 = mockInjectionStrategy4.process(field5, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter25 = nameBasedCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objSet20, field23, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy6 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy8 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field9 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet24 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet24, objArray23);
        boolean boolean26 = mockInjectionStrategy8.process(field9, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet24);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter28 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter29 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter28);
        java.lang.Class<?> wildcardClass30 = typeBasedCandidateFilter29.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter7.filterCandidate((java.util.Collection<java.lang.Object>) objSet24, field27, (java.lang.Object) typeBasedCandidateFilter29);
        boolean boolean32 = mockInjectionStrategy4.process(field5, (java.lang.Object) mockInjectionStrategy6, (java.util.Set<java.lang.Object>) objSet24);
        java.lang.reflect.Field field33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter35 = nameBasedCandidateFilter2.filterCandidate((java.util.Collection<java.lang.Object>) objSet24, field33, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(mockInjectionStrategy6);
        org.junit.Assert.assertNotNull(mockInjectionStrategy8);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection0 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy3 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field4 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy5 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter6 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy7 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field8 = null;
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet23 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet23, objArray22);
        boolean boolean25 = mockInjectionStrategy7.process(field8, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet23);
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter27 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter28 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter27);
        java.lang.Class<?> wildcardClass29 = typeBasedCandidateFilter28.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter6.filterCandidate((java.util.Collection<java.lang.Object>) objSet23, field26, (java.lang.Object) typeBasedCandidateFilter28);
        boolean boolean31 = mockInjectionStrategy3.process(field4, (java.lang.Object) mockInjectionStrategy5, (java.util.Set<java.lang.Object>) objSet23);
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter33 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter33);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter35 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter33);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter36 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter35);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter37 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter36);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy38 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field39 = null;
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet54 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet54, objArray53);
        boolean boolean56 = mockInjectionStrategy38.process(field39, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet54);
        boolean boolean57 = mockInjectionStrategy5.process(field32, (java.lang.Object) nameBasedCandidateFilter36, (java.util.Set<java.lang.Object>) objSet54);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = propertyAndSetterInjection0.processInjection(field1, (java.lang.Object) 10L, (java.util.Set<java.lang.Object>) objSet54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy3);
        org.junit.Assert.assertNotNull(mockInjectionStrategy5);
        org.junit.Assert.assertNotNull(mockInjectionStrategy7);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(ongoingInjecter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy38);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet20 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet20, objArray19);
        boolean boolean22 = mockInjectionStrategy4.process(field5, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter25 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet20, field23, (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter3);
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        java.lang.Class<?> wildcardClass3 = nameBasedCandidateFilter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        java.lang.Class<?> wildcardClass5 = nameBasedCandidateFilter3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy2 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field3 = null;
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet18 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet18, objArray17);
        boolean boolean20 = mockInjectionStrategy2.process(field3, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet18);
        java.lang.reflect.Field field21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter23 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet18, field21, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy2);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy1 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field2 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet17 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet17, objArray16);
        boolean boolean19 = mockInjectionStrategy1.process(field2, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet17);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter21 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter22 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter21);
        java.lang.Class<?> wildcardClass23 = typeBasedCandidateFilter22.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter24 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet17, field20, (java.lang.Object) typeBasedCandidateFilter22);
        java.util.Collection<java.lang.Object> objCollection25 = null;
        java.lang.reflect.Field field26 = null;
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter28 = finalMockCandidateFilter0.filterCandidate(objCollection25, field26, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(ongoingInjecter24);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy2 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet20 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet20, objArray19);
        boolean boolean22 = mockInjectionStrategy4.process(field5, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field23 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter24 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter25 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter24);
        java.lang.Class<?> wildcardClass26 = typeBasedCandidateFilter25.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objSet20, field23, (java.lang.Object) typeBasedCandidateFilter25);
        boolean boolean28 = mockInjectionStrategy0.process(field1, (java.lang.Object) mockInjectionStrategy2, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy31 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy33 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy35 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field36 = null;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet51 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet51, objArray50);
        boolean boolean53 = mockInjectionStrategy35.process(field36, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter55 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter56 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter55);
        java.lang.Class<?> wildcardClass57 = typeBasedCandidateFilter56.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objSet51, field54, (java.lang.Object) typeBasedCandidateFilter56);
        boolean boolean59 = mockInjectionStrategy31.process(field32, (java.lang.Object) mockInjectionStrategy33, (java.util.Set<java.lang.Object>) objSet51);
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy62 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field63 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy64 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter65 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy66 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field67 = null;
        java.lang.Object[] objArray81 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet82 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet82, objArray81);
        boolean boolean84 = mockInjectionStrategy66.process(field67, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet82);
        java.lang.reflect.Field field85 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter86 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter87 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter86);
        java.lang.Class<?> wildcardClass88 = typeBasedCandidateFilter87.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter89 = finalMockCandidateFilter65.filterCandidate((java.util.Collection<java.lang.Object>) objSet82, field85, (java.lang.Object) typeBasedCandidateFilter87);
        boolean boolean90 = mockInjectionStrategy62.process(field63, (java.lang.Object) mockInjectionStrategy64, (java.util.Set<java.lang.Object>) objSet82);
        boolean boolean91 = mockInjectionStrategy31.process(field60, (java.lang.Object) 100L, (java.util.Set<java.lang.Object>) objSet82);
        boolean boolean92 = mockInjectionStrategy2.process(field29, (java.lang.Object) (byte) 10, (java.util.Set<java.lang.Object>) objSet82);
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNotNull(mockInjectionStrategy2);
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy31);
        org.junit.Assert.assertNotNull(mockInjectionStrategy33);
        org.junit.Assert.assertNotNull(mockInjectionStrategy35);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy62);
        org.junit.Assert.assertNotNull(mockInjectionStrategy64);
        org.junit.Assert.assertNotNull(mockInjectionStrategy66);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(ongoingInjecter89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy2 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet20 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet20, objArray19);
        boolean boolean22 = mockInjectionStrategy4.process(field5, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field23 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter24 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter25 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter24);
        java.lang.Class<?> wildcardClass26 = typeBasedCandidateFilter25.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objSet20, field23, (java.lang.Object) typeBasedCandidateFilter25);
        boolean boolean28 = mockInjectionStrategy0.process(field1, (java.lang.Object) mockInjectionStrategy2, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy31 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy33 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy35 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field36 = null;
        java.lang.Object[] objArray50 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet51 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet51, objArray50);
        boolean boolean53 = mockInjectionStrategy35.process(field36, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet51);
        java.lang.reflect.Field field54 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter55 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter56 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter55);
        java.lang.Class<?> wildcardClass57 = typeBasedCandidateFilter56.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter58 = finalMockCandidateFilter34.filterCandidate((java.util.Collection<java.lang.Object>) objSet51, field54, (java.lang.Object) typeBasedCandidateFilter56);
        boolean boolean59 = mockInjectionStrategy31.process(field32, (java.lang.Object) mockInjectionStrategy33, (java.util.Set<java.lang.Object>) objSet51);
        boolean boolean60 = mockInjectionStrategy0.process(field29, (java.lang.Object) 100L, (java.util.Set<java.lang.Object>) objSet51);
        java.lang.reflect.Field field61 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy63 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy65 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter66 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy67 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field68 = null;
        java.lang.Object[] objArray82 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet83 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet83, objArray82);
        boolean boolean85 = mockInjectionStrategy67.process(field68, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet83);
        java.lang.reflect.Field field86 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter87 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter88 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter87);
        java.lang.Class<?> wildcardClass89 = typeBasedCandidateFilter88.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter90 = finalMockCandidateFilter66.filterCandidate((java.util.Collection<java.lang.Object>) objSet83, field86, (java.lang.Object) typeBasedCandidateFilter88);
        boolean boolean91 = mockInjectionStrategy63.process(field64, (java.lang.Object) mockInjectionStrategy65, (java.util.Set<java.lang.Object>) objSet83);
        boolean boolean92 = mockInjectionStrategy0.process(field61, (java.lang.Object) (short) 10, (java.util.Set<java.lang.Object>) objSet83);
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNotNull(mockInjectionStrategy2);
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy31);
        org.junit.Assert.assertNotNull(mockInjectionStrategy33);
        org.junit.Assert.assertNotNull(mockInjectionStrategy35);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(ongoingInjecter58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy63);
        org.junit.Assert.assertNotNull(mockInjectionStrategy65);
        org.junit.Assert.assertNotNull(mockInjectionStrategy67);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNotNull(ongoingInjecter90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection0 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter2);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy6 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy8 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field9 = null;
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet24 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet24, objArray23);
        boolean boolean26 = mockInjectionStrategy8.process(field9, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet24);
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter28 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter29 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter28);
        java.lang.Class<?> wildcardClass30 = typeBasedCandidateFilter29.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter31 = finalMockCandidateFilter7.filterCandidate((java.util.Collection<java.lang.Object>) objSet24, field27, (java.lang.Object) typeBasedCandidateFilter29);
        boolean boolean32 = mockInjectionStrategy4.process(field5, (java.lang.Object) mockInjectionStrategy6, (java.util.Set<java.lang.Object>) objSet24);
        java.lang.reflect.Field field33 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter34 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter35 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter34);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter36 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter34);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter37 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter36);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter38 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter37);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy39 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field40 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet55 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet55, objArray54);
        boolean boolean57 = mockInjectionStrategy39.process(field40, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet55);
        boolean boolean58 = mockInjectionStrategy6.process(field33, (java.lang.Object) nameBasedCandidateFilter37, (java.util.Set<java.lang.Object>) objSet55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean59 = propertyAndSetterInjection0.processInjection(field1, (java.lang.Object) typeBasedCandidateFilter3, (java.util.Set<java.lang.Object>) objSet55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(mockInjectionStrategy6);
        org.junit.Assert.assertNotNull(mockInjectionStrategy8);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(ongoingInjecter31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy39);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter7 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter8 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter1);
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter9 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy10 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field11 = null;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet26 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet26, objArray25);
        boolean boolean28 = mockInjectionStrategy10.process(field11, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet26);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter30 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter31 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter30);
        java.lang.Class<?> wildcardClass32 = typeBasedCandidateFilter31.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter9.filterCandidate((java.util.Collection<java.lang.Object>) objSet26, field29, (java.lang.Object) typeBasedCandidateFilter31);
        java.lang.reflect.Field field34 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter35 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter36 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter35);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter37 = typeBasedCandidateFilter36.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter38 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter39 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter38);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter40 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter38);
        typeBasedCandidateFilter36.next = mockCandidateFilter38;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter42 = typeBasedCandidateFilter36.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter43 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter36);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter44 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet26, field34, (java.lang.Object) typeBasedCandidateFilter43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter7);
        org.junit.Assert.assertNotNull(mockInjectionStrategy10);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNull(mockCandidateFilter37);
        org.junit.Assert.assertNull(mockCandidateFilter42);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy1 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field2 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet17 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet17, objArray16);
        boolean boolean19 = mockInjectionStrategy1.process(field2, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet17);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter21 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter22 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter21);
        java.lang.Class<?> wildcardClass23 = typeBasedCandidateFilter22.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter24 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet17, field20, (java.lang.Object) typeBasedCandidateFilter22);
        java.lang.Class<?> wildcardClass25 = typeBasedCandidateFilter22.getClass();
        org.junit.Assert.assertNotNull(mockInjectionStrategy1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(ongoingInjecter24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = typeBasedCandidateFilter4.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter8 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter7);
        org.junit.Assert.assertNotNull(mockCandidateFilter6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection0 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter6 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter5);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter6);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = typeBasedCandidateFilter6.next;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy9 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field10 = null;
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet25 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet25, objArray24);
        boolean boolean27 = mockInjectionStrategy9.process(field10, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = propertyAndSetterInjection0.processInjection(field1, (java.lang.Object) typeBasedCandidateFilter6, (java.util.Set<java.lang.Object>) objSet25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockCandidateFilter8);
        org.junit.Assert.assertNotNull(mockInjectionStrategy9);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter4 = typeBasedCandidateFilter3.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter5 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter6 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter5);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter5);
        typeBasedCandidateFilter3.next = mockCandidateFilter5;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter9 = typeBasedCandidateFilter3.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter10 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter11 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter10);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter12 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter10);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter13 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter12);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter14 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter13);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter15 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter14);
        typeBasedCandidateFilter3.next = typeBasedCandidateFilter15;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy17 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field18 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy19 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter20 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy21 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field22 = null;
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet37 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet37, objArray36);
        boolean boolean39 = mockInjectionStrategy21.process(field22, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet37);
        java.lang.reflect.Field field40 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter41 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter42 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter41);
        java.lang.Class<?> wildcardClass43 = typeBasedCandidateFilter42.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter44 = finalMockCandidateFilter20.filterCandidate((java.util.Collection<java.lang.Object>) objSet37, field40, (java.lang.Object) typeBasedCandidateFilter42);
        boolean boolean45 = mockInjectionStrategy17.process(field18, (java.lang.Object) mockInjectionStrategy19, (java.util.Set<java.lang.Object>) objSet37);
        boolean boolean46 = mockInjectionStrategy0.process(field1, (java.lang.Object) typeBasedCandidateFilter15, (java.util.Set<java.lang.Object>) objSet37);
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNull(mockCandidateFilter4);
        org.junit.Assert.assertNull(mockCandidateFilter9);
        org.junit.Assert.assertNotNull(mockInjectionStrategy17);
        org.junit.Assert.assertNotNull(mockInjectionStrategy19);
        org.junit.Assert.assertNotNull(mockInjectionStrategy21);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(ongoingInjecter44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter6);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = typeBasedCandidateFilter7.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter9 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter10 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter9);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter11 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter9);
        typeBasedCandidateFilter7.next = mockCandidateFilter9;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter13 = typeBasedCandidateFilter7.next;
        typeBasedCandidateFilter4.next = mockCandidateFilter13;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter15 = typeBasedCandidateFilter4.next;
        org.junit.Assert.assertNull(mockCandidateFilter8);
        org.junit.Assert.assertNull(mockCandidateFilter13);
        org.junit.Assert.assertNull(mockCandidateFilter15);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy6 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field7 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy8 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter9 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy10 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field11 = null;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet26 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet26, objArray25);
        boolean boolean28 = mockInjectionStrategy10.process(field11, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet26);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter30 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter31 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter30);
        java.lang.Class<?> wildcardClass32 = typeBasedCandidateFilter31.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter9.filterCandidate((java.util.Collection<java.lang.Object>) objSet26, field29, (java.lang.Object) typeBasedCandidateFilter31);
        boolean boolean34 = mockInjectionStrategy6.process(field7, (java.lang.Object) mockInjectionStrategy8, (java.util.Set<java.lang.Object>) objSet26);
        java.lang.reflect.Field field35 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy37 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field38 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy39 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter40 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy41 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field42 = null;
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet57 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet57, objArray56);
        boolean boolean59 = mockInjectionStrategy41.process(field42, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet57);
        java.lang.reflect.Field field60 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter61 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter62 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter61);
        java.lang.Class<?> wildcardClass63 = typeBasedCandidateFilter62.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter64 = finalMockCandidateFilter40.filterCandidate((java.util.Collection<java.lang.Object>) objSet57, field60, (java.lang.Object) typeBasedCandidateFilter62);
        boolean boolean65 = mockInjectionStrategy37.process(field38, (java.lang.Object) mockInjectionStrategy39, (java.util.Set<java.lang.Object>) objSet57);
        boolean boolean66 = mockInjectionStrategy6.process(field35, (java.lang.Object) 100L, (java.util.Set<java.lang.Object>) objSet57);
        java.lang.reflect.Field field67 = null;
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection68 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter69 = typeBasedCandidateFilter4.filterCandidate((java.util.Collection<java.lang.Object>) objSet57, field67, (java.lang.Object) propertyAndSetterInjection68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy6);
        org.junit.Assert.assertNotNull(mockInjectionStrategy8);
        org.junit.Assert.assertNotNull(mockInjectionStrategy10);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy37);
        org.junit.Assert.assertNotNull(mockInjectionStrategy39);
        org.junit.Assert.assertNotNull(mockInjectionStrategy41);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(ongoingInjecter64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = typeBasedCandidateFilter4.next;
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter6);
        java.lang.Class<?> wildcardClass8 = nameBasedCandidateFilter7.getClass();
        org.junit.Assert.assertNotNull(mockCandidateFilter6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter7 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter8 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter1);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy9 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field10 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy11 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy13 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field14 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        boolean boolean31 = mockInjectionStrategy13.process(field14, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet29);
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter33 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter33);
        java.lang.Class<?> wildcardClass35 = typeBasedCandidateFilter34.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter36 = finalMockCandidateFilter12.filterCandidate((java.util.Collection<java.lang.Object>) objSet29, field32, (java.lang.Object) typeBasedCandidateFilter34);
        boolean boolean37 = mockInjectionStrategy9.process(field10, (java.lang.Object) mockInjectionStrategy11, (java.util.Set<java.lang.Object>) objSet29);
        java.lang.reflect.Field field38 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy40 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field41 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy42 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter43 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy44 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field45 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet60 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet60, objArray59);
        boolean boolean62 = mockInjectionStrategy44.process(field45, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet60);
        java.lang.reflect.Field field63 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter64 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter65 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter64);
        java.lang.Class<?> wildcardClass66 = typeBasedCandidateFilter65.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter67 = finalMockCandidateFilter43.filterCandidate((java.util.Collection<java.lang.Object>) objSet60, field63, (java.lang.Object) typeBasedCandidateFilter65);
        boolean boolean68 = mockInjectionStrategy40.process(field41, (java.lang.Object) mockInjectionStrategy42, (java.util.Set<java.lang.Object>) objSet60);
        boolean boolean69 = mockInjectionStrategy9.process(field38, (java.lang.Object) 100L, (java.util.Set<java.lang.Object>) objSet60);
        java.lang.reflect.Field field70 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter71 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter72 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter71);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter73 = typeBasedCandidateFilter72.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter74 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter75 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter74);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter76 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter74);
        typeBasedCandidateFilter72.next = mockCandidateFilter74;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter78 = typeBasedCandidateFilter72.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter79 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter80 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter79);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter81 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter79);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter82 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter81);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter83 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter82);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter84 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter83);
        typeBasedCandidateFilter72.next = typeBasedCandidateFilter84;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter86 = typeBasedCandidateFilter8.filterCandidate((java.util.Collection<java.lang.Object>) objSet60, field70, (java.lang.Object) typeBasedCandidateFilter72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter7);
        org.junit.Assert.assertNotNull(mockInjectionStrategy9);
        org.junit.Assert.assertNotNull(mockInjectionStrategy11);
        org.junit.Assert.assertNotNull(mockInjectionStrategy13);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(ongoingInjecter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy40);
        org.junit.Assert.assertNotNull(mockInjectionStrategy42);
        org.junit.Assert.assertNotNull(mockInjectionStrategy44);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(ongoingInjecter67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(mockCandidateFilter73);
        org.junit.Assert.assertNull(mockCandidateFilter78);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy2 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy4 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field5 = null;
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet20 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet20, objArray19);
        boolean boolean22 = mockInjectionStrategy4.process(field5, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet20);
        java.lang.reflect.Field field23 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter24 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter25 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter24);
        java.lang.Class<?> wildcardClass26 = typeBasedCandidateFilter25.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter27 = finalMockCandidateFilter3.filterCandidate((java.util.Collection<java.lang.Object>) objSet20, field23, (java.lang.Object) typeBasedCandidateFilter25);
        boolean boolean28 = mockInjectionStrategy0.process(field1, (java.lang.Object) mockInjectionStrategy2, (java.util.Set<java.lang.Object>) objSet20);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy29 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy30 = mockInjectionStrategy0.thenTry(mockInjectionStrategy29);
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNotNull(mockInjectionStrategy2);
        org.junit.Assert.assertNotNull(mockInjectionStrategy4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(ongoingInjecter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy29);
        org.junit.Assert.assertNotNull(mockInjectionStrategy30);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy1 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field2 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet17 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet17, objArray16);
        boolean boolean19 = mockInjectionStrategy1.process(field2, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet17);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter21 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter22 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter21);
        java.lang.Class<?> wildcardClass23 = typeBasedCandidateFilter22.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter24 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet17, field20, (java.lang.Object) typeBasedCandidateFilter22);
        java.util.Collection<java.lang.Object> objCollection25 = null;
        java.lang.reflect.Field field26 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter27 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter28 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter27);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter29 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter30 = finalMockCandidateFilter0.filterCandidate(objCollection25, field26, (java.lang.Object) nameBasedCandidateFilter29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(ongoingInjecter24);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter7 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = typeBasedCandidateFilter1.next;
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter7);
        org.junit.Assert.assertNull(mockCandidateFilter8);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = typeBasedCandidateFilter4.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter9 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter8);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter10 = typeBasedCandidateFilter9.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter11 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter12 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter11);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter13 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter11);
        typeBasedCandidateFilter9.next = mockCandidateFilter11;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter15 = typeBasedCandidateFilter9.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter16 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter17 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter16);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter18 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter16);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter19 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter18);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter20 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter19);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter21 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter20);
        typeBasedCandidateFilter9.next = typeBasedCandidateFilter21;
        typeBasedCandidateFilter4.next = typeBasedCandidateFilter21;
        org.junit.Assert.assertNotNull(mockCandidateFilter6);
        org.junit.Assert.assertNull(mockCandidateFilter10);
        org.junit.Assert.assertNull(mockCandidateFilter15);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy7 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field8 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy9 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter10 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy11 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field12 = null;
        java.lang.Object[] objArray26 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet27 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet27, objArray26);
        boolean boolean29 = mockInjectionStrategy11.process(field12, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet27);
        java.lang.reflect.Field field30 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter31 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter32 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter31);
        java.lang.Class<?> wildcardClass33 = typeBasedCandidateFilter32.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter34 = finalMockCandidateFilter10.filterCandidate((java.util.Collection<java.lang.Object>) objSet27, field30, (java.lang.Object) typeBasedCandidateFilter32);
        boolean boolean35 = mockInjectionStrategy7.process(field8, (java.lang.Object) mockInjectionStrategy9, (java.util.Set<java.lang.Object>) objSet27);
        java.lang.reflect.Field field36 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter37 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter38 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter37);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter39 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter37);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter40 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter39);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter41 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter40);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy42 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field43 = null;
        java.lang.Object[] objArray57 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet58 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet58, objArray57);
        boolean boolean60 = mockInjectionStrategy42.process(field43, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet58);
        boolean boolean61 = mockInjectionStrategy9.process(field36, (java.lang.Object) nameBasedCandidateFilter40, (java.util.Set<java.lang.Object>) objSet58);
        java.lang.reflect.Field field62 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy64 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field65 = null;
        java.lang.Object[] objArray79 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet80 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet80, objArray79);
        boolean boolean82 = mockInjectionStrategy64.process(field65, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet80);
        boolean boolean83 = mockInjectionStrategy9.process(field62, (java.lang.Object) 1L, (java.util.Set<java.lang.Object>) objSet80);
        java.lang.reflect.Field field84 = null;
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter85 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter86 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet80, field84, (java.lang.Object) finalMockCandidateFilter85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNotNull(mockInjectionStrategy7);
        org.junit.Assert.assertNotNull(mockInjectionStrategy9);
        org.junit.Assert.assertNotNull(mockInjectionStrategy11);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(ongoingInjecter34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy42);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy64);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter6);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter8 = typeBasedCandidateFilter7.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter9 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter10 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter9);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter11 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter9);
        typeBasedCandidateFilter7.next = mockCandidateFilter9;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter13 = typeBasedCandidateFilter7.next;
        typeBasedCandidateFilter4.next = mockCandidateFilter13;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter15 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter13);
        org.junit.Assert.assertNull(mockCandidateFilter8);
        org.junit.Assert.assertNull(mockCandidateFilter13);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter6);
        typeBasedCandidateFilter5.next = mockCandidateFilter6;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy9 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field10 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy11 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter12 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy13 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field14 = null;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet29 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet29, objArray28);
        boolean boolean31 = mockInjectionStrategy13.process(field14, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet29);
        java.lang.reflect.Field field32 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter33 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter33);
        java.lang.Class<?> wildcardClass35 = typeBasedCandidateFilter34.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter36 = finalMockCandidateFilter12.filterCandidate((java.util.Collection<java.lang.Object>) objSet29, field32, (java.lang.Object) typeBasedCandidateFilter34);
        boolean boolean37 = mockInjectionStrategy9.process(field10, (java.lang.Object) mockInjectionStrategy11, (java.util.Set<java.lang.Object>) objSet29);
        java.lang.reflect.Field field38 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter39 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter40 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter39);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter41 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter39);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter42 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter41);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter43 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter42);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy44 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field45 = null;
        java.lang.Object[] objArray59 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet60 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet60, objArray59);
        boolean boolean62 = mockInjectionStrategy44.process(field45, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet60);
        boolean boolean63 = mockInjectionStrategy11.process(field38, (java.lang.Object) nameBasedCandidateFilter42, (java.util.Set<java.lang.Object>) objSet60);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy66 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field67 = null;
        java.lang.Object[] objArray81 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet82 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet82, objArray81);
        boolean boolean84 = mockInjectionStrategy66.process(field67, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet82);
        boolean boolean85 = mockInjectionStrategy11.process(field64, (java.lang.Object) 1L, (java.util.Set<java.lang.Object>) objSet82);
        java.lang.reflect.Field field86 = null;
        java.lang.Object obj87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter88 = typeBasedCandidateFilter5.filterCandidate((java.util.Collection<java.lang.Object>) objSet82, field86, obj87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mockInjectionStrategy9);
        org.junit.Assert.assertNotNull(mockInjectionStrategy11);
        org.junit.Assert.assertNotNull(mockInjectionStrategy13);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(ongoingInjecter36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy44);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy66);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter2 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter3 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter3);
        typeBasedCandidateFilter1.next = mockCandidateFilter3;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter7 = typeBasedCandidateFilter1.next;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter8 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter1);
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter9 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy10 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field11 = null;
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet26 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet26, objArray25);
        boolean boolean28 = mockInjectionStrategy10.process(field11, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet26);
        java.lang.reflect.Field field29 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter30 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter31 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter30);
        java.lang.Class<?> wildcardClass32 = typeBasedCandidateFilter31.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter33 = finalMockCandidateFilter9.filterCandidate((java.util.Collection<java.lang.Object>) objSet26, field29, (java.lang.Object) typeBasedCandidateFilter31);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter34 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter9);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy35 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field36 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy37 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter38 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy39 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field40 = null;
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet55 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet55, objArray54);
        boolean boolean57 = mockInjectionStrategy39.process(field40, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet55);
        java.lang.reflect.Field field58 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter59 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter60 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter59);
        java.lang.Class<?> wildcardClass61 = typeBasedCandidateFilter60.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter62 = finalMockCandidateFilter38.filterCandidate((java.util.Collection<java.lang.Object>) objSet55, field58, (java.lang.Object) typeBasedCandidateFilter60);
        boolean boolean63 = mockInjectionStrategy35.process(field36, (java.lang.Object) mockInjectionStrategy37, (java.util.Set<java.lang.Object>) objSet55);
        java.lang.reflect.Field field64 = null;
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter66 = finalMockCandidateFilter9.filterCandidate((java.util.Collection<java.lang.Object>) objSet55, field64, (java.lang.Object) (byte) 1);
        java.lang.reflect.Field field67 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy68 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field69 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy70 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter71 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy72 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field73 = null;
        java.lang.Object[] objArray87 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet88 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet88, objArray87);
        boolean boolean90 = mockInjectionStrategy72.process(field73, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet88);
        java.lang.reflect.Field field91 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter92 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter93 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter92);
        java.lang.Class<?> wildcardClass94 = typeBasedCandidateFilter93.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter95 = finalMockCandidateFilter71.filterCandidate((java.util.Collection<java.lang.Object>) objSet88, field91, (java.lang.Object) typeBasedCandidateFilter93);
        boolean boolean96 = mockInjectionStrategy68.process(field69, (java.lang.Object) mockInjectionStrategy70, (java.util.Set<java.lang.Object>) objSet88);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter97 = typeBasedCandidateFilter1.filterCandidate((java.util.Collection<java.lang.Object>) objSet55, field67, (java.lang.Object) mockInjectionStrategy70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(mockCandidateFilter2);
        org.junit.Assert.assertNull(mockCandidateFilter7);
        org.junit.Assert.assertNotNull(mockInjectionStrategy10);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(ongoingInjecter33);
        org.junit.Assert.assertNotNull(mockInjectionStrategy35);
        org.junit.Assert.assertNotNull(mockInjectionStrategy37);
        org.junit.Assert.assertNotNull(mockInjectionStrategy39);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(ongoingInjecter62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(ongoingInjecter66);
        org.junit.Assert.assertNotNull(mockInjectionStrategy68);
        org.junit.Assert.assertNotNull(mockInjectionStrategy70);
        org.junit.Assert.assertNotNull(mockInjectionStrategy72);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
        org.junit.Assert.assertNotNull(ongoingInjecter95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy1 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field2 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet17 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet17, objArray16);
        boolean boolean19 = mockInjectionStrategy1.process(field2, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet17);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter21 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter22 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter21);
        java.lang.Class<?> wildcardClass23 = typeBasedCandidateFilter22.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter24 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet17, field20, (java.lang.Object) typeBasedCandidateFilter22);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter25 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter0);
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy26 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field27 = null;
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy28 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter29 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy30 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field31 = null;
        java.lang.Object[] objArray45 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet46 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet46, objArray45);
        boolean boolean48 = mockInjectionStrategy30.process(field31, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet46);
        java.lang.reflect.Field field49 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter50 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter51 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter50);
        java.lang.Class<?> wildcardClass52 = typeBasedCandidateFilter51.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter53 = finalMockCandidateFilter29.filterCandidate((java.util.Collection<java.lang.Object>) objSet46, field49, (java.lang.Object) typeBasedCandidateFilter51);
        boolean boolean54 = mockInjectionStrategy26.process(field27, (java.lang.Object) mockInjectionStrategy28, (java.util.Set<java.lang.Object>) objSet46);
        java.lang.reflect.Field field55 = null;
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter57 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet46, field55, (java.lang.Object) (byte) 1);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter58 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter0);
        org.junit.Assert.assertNotNull(mockInjectionStrategy1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(ongoingInjecter24);
        org.junit.Assert.assertNotNull(mockInjectionStrategy26);
        org.junit.Assert.assertNotNull(mockInjectionStrategy28);
        org.junit.Assert.assertNotNull(mockInjectionStrategy30);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(ongoingInjecter53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(ongoingInjecter57);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter0 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter1 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter2 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter(mockCandidateFilter0);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter3 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter2);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter4 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) nameBasedCandidateFilter3);
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter5 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) typeBasedCandidateFilter4);
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter6 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter7 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter6);
        typeBasedCandidateFilter5.next = mockCandidateFilter6;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter9 = typeBasedCandidateFilter5.next;
        org.junit.Assert.assertNull(mockCandidateFilter9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter0 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy1 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field2 = null;
        java.lang.Object[] objArray16 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet17 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet17, objArray16);
        boolean boolean19 = mockInjectionStrategy1.process(field2, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet17);
        java.lang.reflect.Field field20 = null;
        org.mockito.internal.configuration.injection.filter.MockCandidateFilter mockCandidateFilter21 = null;
        org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter typeBasedCandidateFilter22 = new org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter(mockCandidateFilter21);
        java.lang.Class<?> wildcardClass23 = typeBasedCandidateFilter22.getClass();
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter24 = finalMockCandidateFilter0.filterCandidate((java.util.Collection<java.lang.Object>) objSet17, field20, (java.lang.Object) typeBasedCandidateFilter22);
        org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter nameBasedCandidateFilter25 = new org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter((org.mockito.internal.configuration.injection.filter.MockCandidateFilter) finalMockCandidateFilter0);
        java.lang.Class<?> wildcardClass26 = finalMockCandidateFilter0.getClass();
        org.junit.Assert.assertNotNull(mockInjectionStrategy1);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(ongoingInjecter24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy0 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field1 = null;
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet16 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet16, objArray15);
        boolean boolean18 = mockInjectionStrategy0.process(field1, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet16);
        java.lang.reflect.Field field19 = null;
        org.mockito.internal.configuration.injection.PropertyAndSetterInjection propertyAndSetterInjection20 = new org.mockito.internal.configuration.injection.PropertyAndSetterInjection();
        org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter finalMockCandidateFilter21 = new org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter();
        org.mockito.internal.configuration.injection.MockInjectionStrategy mockInjectionStrategy22 = org.mockito.internal.configuration.injection.MockInjectionStrategy.nop();
        java.lang.reflect.Field field23 = null;
        java.lang.Object[] objArray37 = new java.lang.Object[] { 10.0f, 100, 100.0d, 10.0d, 1.0f, 10L, (byte) 1, (short) 1, 100.0d, (short) -1, (byte) 10, (short) 100 };
        java.util.LinkedHashSet<java.lang.Object> objSet38 = new java.util.LinkedHashSet<java.lang.Object>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objSet38, objArray37);
        boolean boolean40 = mockInjectionStrategy22.process(field23, (java.lang.Object) 100, (java.util.Set<java.lang.Object>) objSet38);
        java.lang.reflect.Field field41 = null;
        org.mockito.internal.configuration.injection.filter.OngoingInjecter ongoingInjecter43 = finalMockCandidateFilter21.filterCandidate((java.util.Collection<java.lang.Object>) objSet38, field41, (java.lang.Object) 0.0f);
        boolean boolean44 = mockInjectionStrategy0.process(field19, (java.lang.Object) propertyAndSetterInjection20, (java.util.Set<java.lang.Object>) objSet38);
        org.junit.Assert.assertNotNull(mockInjectionStrategy0);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mockInjectionStrategy22);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10.0, 100, 100.0, 10.0, 1.0, 10, 1, 1, 100.0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ongoingInjecter43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }
}

