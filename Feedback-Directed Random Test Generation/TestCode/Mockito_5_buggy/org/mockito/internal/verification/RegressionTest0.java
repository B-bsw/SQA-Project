package org.mockito.internal.verification;

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
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        long long6 = verificationOverTimeImpl4.getDuration();
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl4.getDelegate();
        long long8 = verificationOverTimeImpl4.getDuration();
        org.mockito.internal.verification.api.VerificationData verificationData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl4.verify(verificationData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        java.lang.Class<?> wildcardClass9 = verificationOverTimeImpl6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        org.mockito.verification.VerificationMode verificationMode6 = null;
        boolean boolean7 = verificationOverTimeImpl4.canRecoverFromFailure(verificationMode6);
        long long8 = verificationOverTimeImpl4.getPollingPeriod();
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        java.lang.Class<?> wildcardClass9 = verificationOverTimeImpl8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = verificationMode5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.api.VerificationData verificationData13 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl12.verify(verificationData13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        long long6 = verificationOverTimeImpl4.getDuration();
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl4.getDelegate();
        long long8 = verificationOverTimeImpl4.getDuration();
        long long9 = verificationOverTimeImpl4.getDuration();
        long long10 = verificationOverTimeImpl4.getPollingPeriod();
        org.mockito.internal.verification.api.VerificationData verificationData11 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl4.verify(verificationData11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false, timer13);
        java.lang.Class<?> wildcardClass15 = verificationOverTimeImpl14.getClass();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.verification.VerificationMode verificationMode8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode8, false);
        org.mockito.verification.VerificationMode verificationMode11 = verificationOverTimeImpl10.getDelegate();
        long long12 = verificationOverTimeImpl10.getDuration();
        org.mockito.verification.VerificationMode verificationMode13 = verificationOverTimeImpl10.getDelegate();
        long long14 = verificationOverTimeImpl10.getDuration();
        long long15 = verificationOverTimeImpl10.getDuration();
        long long16 = verificationOverTimeImpl10.getPollingPeriod();
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl18 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (byte) 100, (long) '#', (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, true);
        long long19 = verificationOverTimeImpl10.getPollingPeriod();
        org.mockito.internal.util.Timer timer21 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl22 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', (long) 1, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false, timer21);
        org.mockito.internal.util.Timer timer24 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl25 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) ' ', (long) 0, (org.mockito.verification.VerificationMode) verificationOverTimeImpl22, false, timer24);
        long long26 = verificationOverTimeImpl25.getDuration();
        org.junit.Assert.assertNull(verificationMode11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNull(verificationMode13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        long long6 = verificationOverTimeImpl4.getDuration();
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl4.getDelegate();
        long long8 = verificationOverTimeImpl4.getDuration();
        long long9 = verificationOverTimeImpl4.getPollingPeriod();
        org.mockito.internal.verification.api.VerificationData verificationData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl4.verify(verificationData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.verification.VerificationMode verificationMode13 = verificationOverTimeImpl12.getDelegate();
        long long14 = verificationOverTimeImpl12.getPollingPeriod();
        org.junit.Assert.assertNotNull(verificationMode13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        org.mockito.verification.VerificationMode verificationMode6 = null;
        boolean boolean7 = verificationOverTimeImpl4.canRecoverFromFailure(verificationMode6);
        org.mockito.internal.verification.api.VerificationData verificationData8 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl4.verify(verificationData8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.verification.VerificationMode verificationMode13 = verificationOverTimeImpl12.getDelegate();
        long long14 = verificationOverTimeImpl12.getDuration();
        org.junit.Assert.assertNotNull(verificationMode13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.verification.VerificationMode verificationMode15 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl17 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode15, false);
        org.mockito.verification.VerificationMode verificationMode18 = verificationOverTimeImpl17.getDelegate();
        long long19 = verificationOverTimeImpl17.getDuration();
        org.mockito.verification.VerificationMode verificationMode20 = verificationOverTimeImpl17.getDelegate();
        long long21 = verificationOverTimeImpl17.getDuration();
        long long22 = verificationOverTimeImpl17.getDuration();
        long long23 = verificationOverTimeImpl17.getPollingPeriod();
        boolean boolean24 = verificationOverTimeImpl8.canRecoverFromFailure((org.mockito.verification.VerificationMode) verificationOverTimeImpl17);
        org.mockito.internal.verification.api.VerificationData verificationData25 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl8.verify(verificationData25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(verificationMode20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        long long6 = verificationOverTimeImpl4.getDuration();
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl4.getDelegate();
        long long8 = verificationOverTimeImpl4.getDuration();
        java.lang.Class<?> wildcardClass9 = verificationOverTimeImpl4.getClass();
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        long long5 = verificationOverTimeImpl4.getPollingPeriod();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        long long13 = verificationOverTimeImpl12.getPollingPeriod();
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        long long6 = verificationOverTimeImpl4.getDuration();
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl4.getDelegate();
        long long8 = verificationOverTimeImpl4.getDuration();
        long long9 = verificationOverTimeImpl4.getDuration();
        org.mockito.internal.verification.api.VerificationData verificationData10 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl4.verify(verificationData10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false, timer13);
        java.lang.Class<?> wildcardClass15 = verificationOverTimeImpl6.getClass();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl8.getDelegate();
        long long10 = verificationOverTimeImpl8.getDuration();
        org.mockito.verification.VerificationMode verificationMode11 = verificationOverTimeImpl8.getDelegate();
        long long12 = verificationOverTimeImpl8.getDuration();
        long long13 = verificationOverTimeImpl8.getDuration();
        org.mockito.internal.util.Timer timer15 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl16 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false, timer15);
        long long17 = verificationOverTimeImpl8.getPollingPeriod();
        org.mockito.internal.util.Timer timer19 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl20 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (byte) 1, (long) 0, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false, timer19);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(verificationMode11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) -1, (long) '#', (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, true, timer13);
        java.lang.Class<?> wildcardClass15 = verificationOverTimeImpl6.getClass();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false, timer13);
        long long15 = verificationOverTimeImpl6.getDuration();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.util.Timer timer8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl9 = new org.mockito.internal.verification.VerificationOverTimeImpl((-1L), 0L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, true, timer8);
        org.mockito.verification.VerificationMode verificationMode14 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl16 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode14, false);
        org.mockito.verification.VerificationMode verificationMode17 = verificationOverTimeImpl16.getDelegate();
        long long18 = verificationOverTimeImpl16.getDuration();
        org.mockito.verification.VerificationMode verificationMode19 = verificationOverTimeImpl16.getDelegate();
        long long20 = verificationOverTimeImpl16.getDuration();
        long long21 = verificationOverTimeImpl16.getDuration();
        org.mockito.verification.VerificationMode verificationMode22 = verificationOverTimeImpl16.getDelegate();
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl24 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) -1, (long) '4', verificationMode22, false);
        boolean boolean25 = verificationOverTimeImpl9.canRecoverFromFailure(verificationMode22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass26 = verificationMode22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(verificationMode17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNull(verificationMode19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(verificationMode22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        long long9 = verificationOverTimeImpl8.getDuration();
        long long10 = verificationOverTimeImpl8.getDuration();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 10, (long) (byte) 0, verificationMode2, false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.mockito.verification.VerificationMode verificationMode15 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl17 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode15, false);
        org.mockito.verification.VerificationMode verificationMode18 = verificationOverTimeImpl17.getDelegate();
        long long19 = verificationOverTimeImpl17.getDuration();
        org.mockito.verification.VerificationMode verificationMode20 = verificationOverTimeImpl17.getDelegate();
        long long21 = verificationOverTimeImpl17.getDuration();
        long long22 = verificationOverTimeImpl17.getDuration();
        long long23 = verificationOverTimeImpl17.getPollingPeriod();
        boolean boolean24 = verificationOverTimeImpl8.canRecoverFromFailure((org.mockito.verification.VerificationMode) verificationOverTimeImpl17);
        org.mockito.verification.VerificationMode verificationMode25 = verificationOverTimeImpl8.getDelegate();
        org.junit.Assert.assertNull(verificationMode18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(verificationMode20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(verificationMode25);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        org.junit.Assert.assertNull(verificationMode9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl8.getDelegate();
        org.mockito.verification.VerificationMode verificationMode10 = verificationOverTimeImpl8.getDelegate();
        org.junit.Assert.assertNotNull(verificationMode9);
        org.junit.Assert.assertNotNull(verificationMode10);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) -1, (long) '#', (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, true, timer13);
        long long15 = verificationOverTimeImpl6.getDuration();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.mockito.verification.VerificationMode verificationMode8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false);
        org.mockito.verification.VerificationMode verificationMode17 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl19 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode17, false);
        org.mockito.verification.VerificationMode verificationMode20 = verificationOverTimeImpl19.getDelegate();
        long long21 = verificationOverTimeImpl19.getDuration();
        org.mockito.verification.VerificationMode verificationMode22 = verificationOverTimeImpl19.getDelegate();
        long long23 = verificationOverTimeImpl19.getDuration();
        long long24 = verificationOverTimeImpl19.getDuration();
        long long25 = verificationOverTimeImpl19.getPollingPeriod();
        boolean boolean26 = verificationOverTimeImpl10.canRecoverFromFailure((org.mockito.verification.VerificationMode) verificationOverTimeImpl19);
        org.mockito.internal.util.Timer timer28 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl29 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl19, true, timer28);
        org.mockito.verification.VerificationMode verificationMode30 = verificationOverTimeImpl19.getDelegate();
        org.junit.Assert.assertNull(verificationMode20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(verificationMode22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(verificationMode30);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.verification.VerificationMode verificationMode8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false);
        org.mockito.internal.util.Timer timer14 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl15 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) 1, (long) 1, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, true, timer14);
        org.mockito.internal.util.Timer timer17 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl18 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (-1L), (org.mockito.verification.VerificationMode) verificationOverTimeImpl15, true, timer17);
        java.lang.Class<?> wildcardClass19 = verificationOverTimeImpl15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.verification.VerificationMode verificationMode2 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl4 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode2, false);
        org.mockito.verification.VerificationMode verificationMode5 = verificationOverTimeImpl4.getDelegate();
        org.mockito.verification.VerificationMode verificationMode6 = null;
        boolean boolean7 = verificationOverTimeImpl4.canRecoverFromFailure(verificationMode6);
        org.mockito.verification.VerificationMode verificationMode10 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode10, false);
        org.mockito.verification.VerificationMode verificationMode13 = verificationOverTimeImpl12.getDelegate();
        long long14 = verificationOverTimeImpl12.getDuration();
        org.mockito.verification.VerificationMode verificationMode15 = verificationOverTimeImpl12.getDelegate();
        long long16 = verificationOverTimeImpl12.getDuration();
        long long17 = verificationOverTimeImpl12.getDuration();
        boolean boolean18 = verificationOverTimeImpl4.canRecoverFromFailure((org.mockito.verification.VerificationMode) verificationOverTimeImpl12);
        long long19 = verificationOverTimeImpl4.getDuration();
        org.junit.Assert.assertNull(verificationMode5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(verificationMode13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(verificationMode15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl8.getDelegate();
        long long10 = verificationOverTimeImpl8.getDuration();
        org.mockito.verification.VerificationMode verificationMode11 = verificationOverTimeImpl8.getDelegate();
        long long12 = verificationOverTimeImpl8.getDuration();
        long long13 = verificationOverTimeImpl8.getDuration();
        long long14 = verificationOverTimeImpl8.getPollingPeriod();
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl16 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (byte) 100, (long) '#', (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, true);
        long long17 = verificationOverTimeImpl8.getDuration();
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl19 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) 1, (long) (-1), (org.mockito.verification.VerificationMode) verificationOverTimeImpl8, false);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(verificationMode11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.mockito.verification.VerificationMode verificationMode6 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode6, false);
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl8.getDelegate();
        org.mockito.verification.VerificationMode verificationMode10 = null;
        boolean boolean11 = verificationOverTimeImpl8.canRecoverFromFailure(verificationMode10);
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((-1L), 0L, verificationMode10, false, timer13);
        org.mockito.internal.util.Timer timer16 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl17 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (short) -1, (long) (byte) 10, verificationMode10, true, timer16);
        org.mockito.verification.VerificationMode verificationMode18 = verificationOverTimeImpl17.getDelegate();
        java.lang.Class<?> wildcardClass19 = verificationOverTimeImpl17.getClass();
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(verificationMode18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl8 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false);
        org.mockito.internal.verification.api.VerificationData verificationData9 = null;
        // The following exception was thrown during execution in test generation
        try {
            verificationOverTimeImpl8.verify(verificationData9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.verification.VerificationMode verificationMode8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl10 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode8, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl12 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) '#', (long) (byte) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false);
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 'a', 1L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl10, false);
        org.mockito.internal.util.Timer timer16 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl17 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (byte) 100, (long) 0, (org.mockito.verification.VerificationMode) verificationOverTimeImpl14, false, timer16);
        org.mockito.verification.VerificationMode verificationMode18 = verificationOverTimeImpl14.getDelegate();
        org.junit.Assert.assertNotNull(verificationMode18);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.internal.util.Timer timer8 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl9 = new org.mockito.internal.verification.VerificationOverTimeImpl((-1L), 0L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, true, timer8);
        long long10 = verificationOverTimeImpl6.getPollingPeriod();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getDuration();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl(10L, (long) 100, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false, timer13);
        long long15 = verificationOverTimeImpl14.getDuration();
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.verification.VerificationMode verificationMode4 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl6 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) 0, (long) 100, verificationMode4, false);
        org.mockito.verification.VerificationMode verificationMode7 = verificationOverTimeImpl6.getDelegate();
        long long8 = verificationOverTimeImpl6.getDuration();
        org.mockito.verification.VerificationMode verificationMode9 = verificationOverTimeImpl6.getDelegate();
        long long10 = verificationOverTimeImpl6.getDuration();
        long long11 = verificationOverTimeImpl6.getPollingPeriod();
        org.mockito.internal.util.Timer timer13 = null;
        org.mockito.internal.verification.VerificationOverTimeImpl verificationOverTimeImpl14 = new org.mockito.internal.verification.VerificationOverTimeImpl((long) (byte) 100, 0L, (org.mockito.verification.VerificationMode) verificationOverTimeImpl6, false, timer13);
        org.junit.Assert.assertNull(verificationMode7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(verificationMode9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }
}

