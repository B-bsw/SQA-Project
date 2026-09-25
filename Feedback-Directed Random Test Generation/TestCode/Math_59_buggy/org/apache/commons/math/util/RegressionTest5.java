package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3643047812382505d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3053205627843726d) + "'", double1 == (-0.3053205627843726d));
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        double double2 = org.apache.commons.math.util.FastMath.atan2(113.8351333444046d, 1.7453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5554654490571869d + "'", double2 == 1.5554654490571869d);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9932228457120735d + "'", double1 == 1.9932228457120735d);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.08489862787744332d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        double double1 = org.apache.commons.math.util.FastMath.tanh(20948.590341753694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5978220919084257d), 3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5978220919084256d) + "'", double2 == (-0.5978220919084256d));
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.999999999999996d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        double double2 = org.apache.commons.math.util.FastMath.pow(76.93224517135305d, (-0.13092588481596368d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5663169859928074d + "'", double2 == 0.5663169859928074d);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        double double1 = org.apache.commons.math.util.FastMath.acosh(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        double double1 = org.apache.commons.math.util.FastMath.asin(113.8351333444046d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.009495102254525043d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.151665335034498d + "'", double1 == 1.151665335034498d);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0889074357665707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01900502000357532d) + "'", double1 == (-0.01900502000357532d));
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9992606284658041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5409243178208767d + "'", double1 == 0.5409243178208767d);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.688117141816135E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.184705528587072E21d + "'", double1 == 5.184705528587072E21d);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        double double1 = org.apache.commons.math.util.FastMath.cos(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3010525128752803d + "'", double1 == 0.3010525128752803d);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        double double2 = org.apache.commons.math.util.FastMath.max(1.444667861009766d, 0.5403140444367246d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.444667861009766d + "'", double2 == 1.444667861009766d);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.956763353344058E80d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.0034360715711427674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034419884227690025d) + "'", double1 == (-0.0034419884227690025d));
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        double double1 = org.apache.commons.math.util.FastMath.log(65.16375280274023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.176903375733162d + "'", double1 == 4.176903375733162d);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        double double1 = org.apache.commons.math.util.FastMath.log(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.791759469228055d + "'", double1 == 1.791759469228055d);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1L), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        int int2 = org.apache.commons.math.util.FastMath.max(145, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707955344160478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533138212020356d + "'", double1 == 1.2533138212020356d);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.13250759287604744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13212285788973227d + "'", double1 == 0.13212285788973227d);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8347410962443511d), (-0.1500253585642916d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.834741096244351d) + "'", double2 == (-0.834741096244351d));
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4328100205340816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44760755429150645d + "'", double1 == 0.44760755429150645d);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016920811983827888d + "'", double1 == 0.016920811983827888d);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8550048170562257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1498887117707062d + "'", double1 == 1.1498887117707062d);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        double double1 = org.apache.commons.math.util.FastMath.log((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.544068044350276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9337643921132143d + "'", double1 == 0.9337643921132143d);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18838862103418863d + "'", double1 == 0.18838862103418863d);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.1797945711178876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306408778607839d + "'", double1 == 0.8306408778607839d);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.14147577836676d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986793944976201d + "'", double1 == 0.9986793944976201d);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.0258124639856192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8995084834391828d) + "'", double1 == (-0.8995084834391828d));
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026697492810876286d) + "'", double1 == (-0.026697492810876286d));
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        double double1 = org.apache.commons.math.util.FastMath.cosh(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        int int2 = org.apache.commons.math.util.FastMath.min(573, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4501394397391184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46549581933118d + "'", double1 == 0.46549581933118d);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        double double2 = org.apache.commons.math.util.FastMath.max(0.009972525083085703d, 1.1020552221563014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1020552221563014d + "'", double2 == 1.1020552221563014d);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7183274194704676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5413513871676172d + "'", double1 == 0.5413513871676172d);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.6789823271282955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7367720489214966d + "'", double1 == 1.7367720489214966d);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.026785246294635624d), 3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02678524629463562d) + "'", double2 == (-0.02678524629463562d));
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        double double1 = org.apache.commons.math.util.FastMath.log1p(25.306852819440053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.26982946871976d + "'", double1 == 3.26982946871976d);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        int int2 = org.apache.commons.math.util.FastMath.min(145, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02320741180622532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5475868312936525d + "'", double1 == 1.5475868312936525d);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.07594384022318276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07890198156137432d + "'", double1 == 0.07890198156137432d);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7453292519943293d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9567633533440579E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.84585047808035d) + "'", double1 == (-0.84585047808035d));
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        double double1 = org.apache.commons.math.util.FastMath.abs(8.442682412167344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682412167344E-6d + "'", double1 == 8.442682412167344E-6d);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.748066027288565E7d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.06515518537002861d), 0.6784066528087076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0651551853700286d) + "'", double2 == (-0.0651551853700286d));
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.5528548740537169d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 573, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5407439555097887E-33d + "'", double1 == 1.5407439555097887E-33d);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.5618061060276d + "'", double1 == 19.5618061060276d);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00495749420004732d + "'", double1 == 0.00495749420004732d);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5151928326914723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8099371976588898d) + "'", double1 == (-0.8099371976588898d));
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1672611943505358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16883863257866716d + "'", double1 == 0.16883863257866716d);
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.761592435679563d, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16354719567405981d + "'", double2 == 0.16354719567405981d);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8099371976588898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9440450304036032d) + "'", double1 == (-0.9440450304036032d));
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.33730966282112745d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        double double1 = org.apache.commons.math.util.FastMath.rint((-220.50287227348372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-221.0d) + "'", double1 == (-221.0d));
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5525884268785045E-18d, 2.630107219510141d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.903137390602939E-19d + "'", double2 == 5.903137390602939E-19d);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4434830720305272d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4290881902052651d + "'", double1 == 0.4290881902052651d);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        double double1 = org.apache.commons.math.util.FastMath.tan(1261967.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.33672933803259d) + "'", double1 == (-4.33672933803259d));
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2110835568321545E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835568025492E-5d + "'", double1 == 1.2110835568025492E-5d);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9272995150405832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        double double1 = org.apache.commons.math.util.FastMath.abs((-8.411337566029088E-22d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.411337566029088E-22d + "'", double1 == 8.411337566029088E-22d);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.467699925813914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43747530300863346d) + "'", double1 == (-0.43747530300863346d));
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '4');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028099800521022494d + "'", double1 == 0.028099800521022494d);
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.06515518537002861d), 0.9640275800758168d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5429184913088887d + "'", double1 == 1.5429184913088887d);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.17058116794162126d), 0.7085012011516139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7085012011516139d + "'", double2 == 0.7085012011516139d);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.15527491979894661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15527491979894661d + "'", double1 == 0.15527491979894661d);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3554049701597965E-7d + "'", double1 == 3.3554049701597965E-7d);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.137917206686937d, 36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 105.3634469745431d + "'", double2 == 105.3634469745431d);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 97864804714L, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963263486864d + "'", double2 == 1.5707963263486864d);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        long long1 = org.apache.commons.math.util.FastMath.round(1.3227009165069088d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0033681607366540358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033681671050402474d + "'", double1 == 0.0033681671050402474d);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        long long2 = org.apache.commons.math.util.FastMath.min(22025L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.3922026785961111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.077902435287947d + "'", double1 == 1.077902435287947d);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1649569776443817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15268415727515278d + "'", double1 == 0.15268415727515278d);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810477380965351d + "'", double1 == 4.810477380965351d);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8551464208140986d + "'", double1 == 3.8551464208140986d);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571830786712632E-4d) + "'", double1 == (-1.6571830786712632E-4d));
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3891965034627198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5093497777060075d + "'", double1 == 0.5093497777060075d);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.442682412167344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.17814068151824805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3916997416124741d + "'", double1 == 1.3916997416124741d);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012835794880153763d) + "'", double1 == (-0.012835794880153763d));
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        double double1 = org.apache.commons.math.util.FastMath.acos(11013.232874703392d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6784102379846987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784102379846987d + "'", double1 == 0.6784102379846987d);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.202664356759283E-22d + "'", double1 == 3.202664356759283E-22d);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0429318112613317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7143859385096635d + "'", double1 == 0.7143859385096635d);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.355404970159859E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355404970159922E-7d + "'", double1 == 3.355404970159922E-7d);
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5151928326914723d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01807019118332042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.342925101645957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        double double1 = org.apache.commons.math.util.FastMath.abs((-16.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        int int2 = org.apache.commons.math.util.FastMath.min(145, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3333452696210848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9272995150405832d + "'", double1 == 0.9272995150405832d);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.857130534162586d) + "'", double1 == (-0.857130534162586d));
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.015704339111595068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015705630273145536d + "'", double1 == 0.015705630273145536d);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 573L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32830.48166099617d + "'", double1 == 32830.48166099617d);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        double double1 = org.apache.commons.math.util.FastMath.abs(3266.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266.0d + "'", double1 == 3266.0d);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        long long1 = org.apache.commons.math.util.FastMath.round(2.2884410516143325d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.202664356759283E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.202664356759283E-22d + "'", double1 == 3.202664356759283E-22d);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 97864804714L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1488093008679707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1488093008679707d + "'", double1 == 1.1488093008679707d);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0318224457943774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0318224457943774d + "'", double1 == 1.0318224457943774d);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.8739552914536586E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8739552914536586E-31d + "'", double1 == 1.8739552914536586E-31d);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7893750108307106d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0214659450282346d) + "'", double1 == (-1.0214659450282346d));
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.613248695272591d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.355372716651809E-7d, 0.8199744766146694d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0920453164646635E-7d + "'", double2 == 4.0920453164646635E-7d);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0980197632589186d, 0.46549581933118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0980197632589186d + "'", double2 == 1.0980197632589186d);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 22025L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.0034306568216736E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.29804177942641236d, 1.1171584131235877d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2980417794264124d + "'", double2 == 0.2980417794264124d);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        double double1 = org.apache.commons.math.util.FastMath.atan((-4.716136598735705d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.361853049433758d) + "'", double1 == (-1.361853049433758d));
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-8.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        double double1 = org.apache.commons.math.util.FastMath.cos(14.741328744640542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5680724581504838d) + "'", double1 == (-0.5680724581504838d));
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        double double2 = org.apache.commons.math.util.FastMath.min(2.809784758817254d, 0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.12217304763960307d + "'", double2 == 0.12217304763960307d);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1649569776443817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571439123522547d + "'", double1 == 0.16571439123522547d);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07657274203834082d) + "'", double1 == (-0.07657274203834082d));
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 57L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.848501131276805d + "'", double1 == 3.848501131276805d);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        double double1 = org.apache.commons.math.util.FastMath.abs(169.42101997711706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 169.42101997711706d + "'", double1 == 169.42101997711706d);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        double double1 = org.apache.commons.math.util.FastMath.cos(13.845300947487885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28773980323653275d + "'", double1 == 0.28773980323653275d);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01144136910308836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.414973347970818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.365513453787659d + "'", double1 == 6.365513453787659d);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.36019649632180123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36019649632180123d + "'", double1 == 0.36019649632180123d);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.8199681505512405E-18d, 0.07890198156137432d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.5740143590154496E-17d + "'", double2 == 3.5740143590154496E-17d);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        int int2 = org.apache.commons.math.util.FastMath.min(2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0016554297339535329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8430650369670094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9465441391652027d) + "'", double1 == (-0.9465441391652027d));
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.8418176412695313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9634979770895203d) + "'", double1 == (-0.9634979770895203d));
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0034360715711427674d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.0258124639856192d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6414949254120567d) + "'", double1 == (-0.6414949254120567d));
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.411337566029088E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.411337566029088E-22d + "'", double1 == 8.411337566029088E-22d);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1056495335997729d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3978952727983702d, 4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3978952727983707d + "'", double2 == 2.3978952727983707d);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0100220825342237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.870002544225116d + "'", double1 == 57.870002544225116d);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.15527491979894661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9879690512915179d + "'", double1 == 0.9879690512915179d);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(144.54565322796893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.248094888236225d + "'", double1 == 5.248094888236225d);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07627516821128054d) + "'", double1 == (-0.07627516821128054d));
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.078927767113337d, (-0.9158465150847866d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0556249365601964d + "'", double2 == 3.0556249365601964d);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5413513871676172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7357658507756508d + "'", double1 == 0.7357658507756508d);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5356779950985695d) + "'", double1 == (-2.5356779950985695d));
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        long long1 = org.apache.commons.math.util.FastMath.round(31.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        int int2 = org.apache.commons.math.util.FastMath.max(97, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.801969570734137d) + "'", double1 == (-29.801969570734137d));
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0033681671050402474d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.614548555343225d + "'", double1 == 1.614548555343225d);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        long long1 = org.apache.commons.math.util.FastMath.round(0.39704103087032844d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3026405418156002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1952095083615821d) + "'", double1 == (-1.1952095083615821d));
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9158465150847866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003109141424240039d + "'", double1 == 0.003109141424240039d);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707038251666727d, 0.1075653784740282d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0497671000301219d + "'", double2 == 1.0497671000301219d);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.8055865251572774E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.23688540362855587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21259644855998064d + "'", double1 == 0.21259644855998064d);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2919043892128173d + "'", double1 == 2.2919043892128173d);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.025673200539316265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.1061285321866012d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.822482662536925d) + "'", double1 == (-1.822482662536925d));
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 573);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.044033658705184d + "'", double1 == 7.044033658705184d);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.024137633434945d + "'", double1 == 2.024137633434945d);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        double double1 = org.apache.commons.math.util.FastMath.atanh(169.42101997711706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1075653784740282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4755806431682656d + "'", double1 == 0.4755806431682656d);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.00944988413518589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5414384778337854d) + "'", double1 == (-0.5414384778337854d));
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 145, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        double double2 = org.apache.commons.math.util.FastMath.min(5.184705528587072E21d, 14.741328744640542d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.741328744640542d + "'", double2 == 14.741328744640542d);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0016554297339535329d, 3.748066E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016554297339535329d + "'", double2 == 0.0016554297339535329d);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0429318112613317d, (-0.9914968516113685d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4924750848100893d + "'", double2 == 0.4924750848100893d);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        double double2 = org.apache.commons.math.util.FastMath.min(1.816301153436276d, (double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.816301153436276d + "'", double2 == 1.816301153436276d);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        double double1 = org.apache.commons.math.util.FastMath.cosh(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080869E43d + "'", double1 == 1.3440585709080869E43d);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.14147577836676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05482909570415162d + "'", double1 == 0.05482909570415162d);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.78115991081385d + "'", double1 == 44.78115991081385d);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.1451683936911605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.55620531888934d) + "'", double1 == (-31.55620531888934d));
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6494710267528832d + "'", double1 == 0.6494710267528832d);
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16883863257866716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16964194266037994d + "'", double1 == 0.16964194266037994d);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3553727166519355E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6098494453571868d) + "'", double1 == (-0.6098494453571868d));
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5501042757606859d, (-89.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-89.0d) + "'", double2 == (-89.0d));
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11109916834859056d + "'", double1 == 0.11109916834859056d);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5402647332399916d, 0.015705630273145536d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5402647332399915d + "'", double2 == 0.5402647332399915d);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8278068656280008d, 4.144549764063218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8278068656280009d + "'", double2 == 0.8278068656280009d);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0023782107733894223d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1400656231999866d + "'", double2 == 3.1400656231999866d);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6417445913244706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6042895701620367d + "'", double1 == 0.6042895701620367d);
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        double double1 = org.apache.commons.math.util.FastMath.floor(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4755806431682656d, 3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4755806431682656d + "'", double2 == 0.4755806431682656d);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        double double1 = org.apache.commons.math.util.FastMath.log10((-8.271228063367024d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9932228457120735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1672611943505358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16649096046410153d + "'", double1 == 0.16649096046410153d);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04747861148694368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04751433553952635d + "'", double1 == 0.04751433553952635d);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.5740143590154496E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5740143590154496E-17d + "'", double1 == 3.5740143590154496E-17d);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        double double2 = org.apache.commons.math.util.FastMath.max(5.954844600830958E183d, 2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.954844600830958E183d + "'", double2 == 5.954844600830958E183d);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        double double2 = org.apache.commons.math.util.FastMath.min(0.293727206892505d, 0.7785713669985503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.293727206892505d + "'", double2 == 0.293727206892505d);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        long long1 = org.apache.commons.math.util.FastMath.round(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 573);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.653397151028901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 495.80313520448664d + "'", double1 == 495.80313520448664d);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.1805916207174113E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.03843312210120447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.037712963705904774d + "'", double1 == 0.037712963705904774d);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        long long1 = org.apache.commons.math.util.FastMath.round(1.570490128690081d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        long long1 = org.apache.commons.math.util.FastMath.abs(31L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 31L + "'", long1 == 31L);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.45013943973911846d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        double double2 = org.apache.commons.math.util.FastMath.min(0.19240232444172625d, 0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19240232444172625d + "'", double2 == 0.19240232444172625d);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        double double1 = org.apache.commons.math.util.FastMath.ceil(10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.980489805286518d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.28131747735322093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6552377416047082d + "'", double1 == 0.6552377416047082d);
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.630107219510141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2L, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.015704339111595068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1253169546054925d + "'", double1 == 0.1253169546054925d);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        double double2 = org.apache.commons.math.util.FastMath.pow((-5.693388459081093d), 1.6430496853696097d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.798432482299822E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.397107525138078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 137.34414422946176d + "'", double1 == 137.34414422946176d);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.713200981319833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.853398979608905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02320741180622532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02321157953304928d + "'", double1 == 0.02321157953304928d);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.3554049701598595E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.042827011853929196d), 0.9646989825943999d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5385290260103368d, 0.17814068151824805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0797696988252596d + "'", double2 == 1.0797696988252596d);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.14466555184225383d, 0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14466555184225385d + "'", double2 == 0.14466555184225385d);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '4', (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9877735581754346d, 0.01807019118332042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0124918756966113d + "'", double2 == 1.0124918756966113d);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.012835794880153763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012836499881563112d) + "'", double1 == (-0.012836499881563112d));
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9259555601603967d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.155849014780759d + "'", double1 == 3.155849014780759d);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.414973347970818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1462158347805889d + "'", double1 == 1.1462158347805889d);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5707008595346152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515219270969891d + "'", double1 == 0.4515219270969891d);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5401776706283433E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        double double1 = org.apache.commons.math.util.FastMath.log1p(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.0d + "'", double1 == 32.0d);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8278068656280008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9256440224479643d + "'", double1 == 0.9256440224479643d);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        double double2 = org.apache.commons.math.util.FastMath.max(8.479030977575487d, 0.583398179910364d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.479030977575487d + "'", double2 == 8.479030977575487d);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.365513453787659d + "'", double1 == 6.365513453787659d);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.02678524629463562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0267884501723548d) + "'", double1 == (-0.0267884501723548d));
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9990920390306268d) + "'", double1 == (-0.9990920390306268d));
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.088887490341627E-14d, 7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.432066880993469d + "'", double2 == 1.432066880993469d);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.008592287884538353d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.0429318112613317d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-6.053272382792571d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.7929422793014347d), (-1.0794534402614928d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0794534402614928d) + "'", double2 == (-1.0794534402614928d));
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.71827069403746d + "'", double1 == 2.71827069403746d);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8772827919571972d, 9.786480471441939E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8772827919571973d + "'", double2 == 0.8772827919571973d);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9786883441146831d), 0.9999999954430011d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.978688344114683d) + "'", double2 == (-0.978688344114683d));
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9513433746520442d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.479030977575487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1425465430742778d) + "'", double1 == (-0.1425465430742778d));
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.14336970329182389d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9999999999999747d), 1.7646088003705097E-39d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999746d) + "'", double2 == (-0.9999999999999746d));
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        double double1 = org.apache.commons.math.util.FastMath.rint((-8.833373523837084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        long long1 = org.apache.commons.math.util.FastMath.round(3.6384205222376984d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7359704175800968d) + "'", double1 == (-0.7359704175800968d));
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.964384282367839d + "'", double1 == 0.964384282367839d);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.979079476192864E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.979079474234486E-9d) + "'", double1 == (-1.979079474234486E-9d));
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.16571020934276798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.15154642678291888d), 2.189442356607096E26d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.189442356607096E26d + "'", double2 == 2.189442356607096E26d);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1664909604641016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.4430227241169228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47447846432657004d + "'", double1 == 0.47447846432657004d);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-89.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-89.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        double double1 = org.apache.commons.math.util.FastMath.floor(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3265.0d + "'", double1 == 3265.0d);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9950547536867305d + "'", double1 == 0.9950547536867305d);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01654379973059443d + "'", double1 == 0.01654379973059443d);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5211141550652623d + "'", double1 == 1.5211141550652623d);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07634906307728516d) + "'", double1 == (-0.07634906307728516d));
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1020552221563014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019234492165425023d + "'", double1 == 0.019234492165425023d);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3036378347354876d + "'", double1 == 1.3036378347354876d);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9412241963654842d + "'", double1 == 0.9412241963654842d);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9459101490553132d, 9.78648047144194E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.78648047144194E10d + "'", double2 == 9.78648047144194E10d);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        double double1 = org.apache.commons.math.util.FastMath.log(4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4414100388676627d + "'", double1 == 1.4414100388676627d);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02109628083757295d) + "'", double1 == (-0.02109628083757295d));
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232874703395d, 0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703393d + "'", double2 == 11013.232874703393d);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9905499752128979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004123608553823457d) + "'", double1 == (-0.004123608553823457d));
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16393750213817188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16467280670940487d + "'", double1 == 0.16467280670940487d);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8236544498809605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8236544498809605d + "'", double1 == 0.8236544498809605d);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8686709614860095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686709614860095d + "'", double1 == 0.8686709614860095d);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.1971657626758088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3418628230105176d + "'", double1 == 0.3418628230105176d);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(62.802933415151905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.974903989667673d + "'", double1 == 3.974903989667673d);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.15527491979894661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3940493875124622d + "'", double1 == 0.3940493875124622d);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.448317288402091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.123795169711219d + "'", double1 == 8.123795169711219d);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 10, 4.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1902899496825317d + "'", double2 == 1.1902899496825317d);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7616835171611754d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7616835171611754d + "'", double2 == 0.7616835171611754d);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707956194563126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.956824444577827E-60d + "'", double1 == 9.956824444577827E-60d);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.1500253585642916d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5313592245660101d) + "'", double1 == (-0.5313592245660101d));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5211141550652623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-9.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-23.84345739187178d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 97.0f, (-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4070751110264779d) + "'", double2 == (-1.4070751110264779d));
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.162277660168381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220697d + "'", double1 == 1.4677992676220697d);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.46549581933118d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 2.900837378826303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9996159448097379d, 1.066732021965656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.066732021965656d + "'", double2 == 1.066732021965656d);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.28858290004402326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5397294065638794d) + "'", double1 == (-0.5397294065638794d));
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.378163642308943E12d, 1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        double double1 = org.apache.commons.math.util.FastMath.atan(2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703212366690238d + "'", double1 == 1.5703212366690238d);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        double double1 = org.apache.commons.math.util.FastMath.tan(19.346200979809115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5419542310290228d + "'", double1 == 0.5419542310290228d);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.322916371343518d, 0.9996157480444497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3229163713435177d + "'", double2 == 1.3229163713435177d);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.006767125876795721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0067670225817297d + "'", double1 == 0.0067670225817297d);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.01654379973059443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.1292690580733946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12963181746861624d + "'", double1 == 0.12963181746861624d);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999092042625951d + "'", double1 == 0.9999092042625951d);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5282953052207049d + "'", double1 == 0.5282953052207049d);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        long long1 = org.apache.commons.math.util.FastMath.round(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(52.38248989944039d, 0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.38248989944038d + "'", double2 == 52.38248989944038d);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.857130534162586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8571305341625859d) + "'", double1 == (-0.8571305341625859d));
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        double double1 = org.apache.commons.math.util.FastMath.tanh(495.80313520448664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1805916207174113E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.072099696478684d + "'", double1 == 21.072099696478684d);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.71827069403746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574500491081818d + "'", double1 == 1.6574500491081818d);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.142219984546603E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984546603E-13d + "'", double1 == 8.142219984546603E-13d);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003564839175727d + "'", double1 == 1.0003564839175727d);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5544559615876794d + "'", double1 == 1.5544559615876794d);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        double double1 = org.apache.commons.math.util.FastMath.acos(11.082762530298217d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.716003343634799d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.025681666614117072d, 1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02109576457512843d + "'", double2 == 0.02109576457512843d);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        double double2 = org.apache.commons.math.util.FastMath.pow(57.295779251985515d, 1.1776486171538092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 117.61174253155806d + "'", double2 == 117.61174253155806d);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6750559827141311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5937881252841113d + "'", double1 == 0.5937881252841113d);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        double double1 = org.apache.commons.math.util.FastMath.log(8886110.520507816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.999999999999993d + "'", double1 == 15.999999999999993d);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.43442052080657195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5440680443502759d + "'", double1 == 0.5440680443502759d);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.15527491979894661d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.3553727166519355E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3553727166518725E-7d + "'", double1 == 3.3553727166518725E-7d);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7144972908707885d + "'", double1 == 0.7144972908707885d);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        double double1 = org.apache.commons.math.util.FastMath.floor(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.0d + "'", double1 == 16.0d);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        double double1 = org.apache.commons.math.util.FastMath.log(8.289697403667576E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.095326904862169d) + "'", double1 == (-7.095326904862169d));
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.762834413413614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0547920720722763d + "'", double1 == 1.0547920720722763d);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2.2529813614778327d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2529813614778327d + "'", double1 == 2.2529813614778327d);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 185.47866641176898d + "'", double1 == 185.47866641176898d);
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7418061661440577d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0997245430382512d + "'", double1 == 1.0997245430382512d);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.012836499881563112d), (-1.6112949659561453d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.979079476192864E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1339290130681278E-7d) + "'", double1 == (-1.1339290130681278E-7d));
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.3854204958440206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.395663482186485d + "'", double1 == 0.395663482186485d);
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.15527491979894661d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1687440534368837d) + "'", double1 == (-0.1687440534368837d));
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7615941542245016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941542245016d + "'", double1 == 0.7615941542245016d);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2147483647L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.875409442231813E-18d + "'", double1 == 3.875409442231813E-18d);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6795226183513794d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6250369392251006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.666536656761523d + "'", double1 == 0.666536656761523d);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.029698164942722875d), 3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4757278705561235d, 1.653878486731224d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29267816394109086d + "'", double2 == 0.29267816394109086d);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.296722144923343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9189065459251122d + "'", double1 == 0.9189065459251122d);
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.172148047597968d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03791113527135105d + "'", double1 == 0.03791113527135105d);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3132616875182228d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.724670203544525d + "'", double1 == 1.724670203544525d);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.291336409328633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7425628777192574d + "'", double1 == 1.7425628777192574d);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.267909768656306d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.16765036534441544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.551401785493842d + "'", double1 == 0.551401785493842d);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5412326235096074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5412326235096074d + "'", double1 == 0.5412326235096074d);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        double double2 = org.apache.commons.math.util.FastMath.min(1.9877735581754346d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.585786437626905d) + "'", double2 == (-0.585786437626905d));
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.267831587699266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7216318821397784d + "'", double1 == 0.7216318821397784d);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        double double2 = org.apache.commons.math.util.FastMath.min(4.5982145799432725d, 0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6751788539128234d + "'", double2 == 0.6751788539128234d);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9802576824651942d + "'", double1 == 0.9802576824651942d);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        double double1 = org.apache.commons.math.util.FastMath.signum(15.999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.13742894001701d) + "'", double1 == (-42.13742894001701d));
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028092407000022617d + "'", double1 == 0.028092407000022617d);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.583398179910364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(19.346200979809115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1108.4556657549201d + "'", double1 == 1108.4556657549201d);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.82679529269723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08106152637093929d + "'", double1 == 0.08106152637093929d);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4142135623730951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.189207115002721d + "'", double1 == 1.189207115002721d);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        double double2 = org.apache.commons.math.util.FastMath.max(9.616441887145511E102d, 1.0470934242082532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.616441887145511E102d + "'", double2 == 9.616441887145511E102d);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2915496650148839d, 2.1971657626758088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7544036781775962d + "'", double2 == 1.7544036781775962d);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.147483647E9d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2304174960375769E11d + "'", double1 == 1.2304174960375769E11d);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        long long1 = org.apache.commons.math.util.FastMath.round(8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6145485553432246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2706488717750568d + "'", double1 == 1.2706488717750568d);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2265357086400204d + "'", double1 == 1.2265357086400204d);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.956824444577827E-60d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.00187915014031d) + "'", double1 == (-59.00187915014031d));
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        int int1 = org.apache.commons.math.util.FastMath.round((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 573L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 573.0f + "'", float1 == 573.0f);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.853398979608905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.826543326104914E-4d + "'", double1 == 5.826543326104914E-4d);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        double double1 = org.apache.commons.math.util.FastMath.acos((-2.267909768656306d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8030064940059782d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3401110801853975d + "'", double1 == 1.3401110801853975d);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.24600640679997673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25109225867773716d + "'", double1 == 0.25109225867773716d);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.717237764496549d + "'", double1 == 7.717237764496549d);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        float float1 = org.apache.commons.math.util.FastMath.abs(38.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 38.0f + "'", float1 == 38.0f);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.1971657626758088d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        double double1 = org.apache.commons.math.util.FastMath.acos((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        double double1 = org.apache.commons.math.util.FastMath.cos(18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9949723229224731d + "'", double1 == 0.9949723229224731d);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.003358054049998483d, 1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0027856622314566606d + "'", double2 == 0.0027856622314566606d);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        double double2 = org.apache.commons.math.util.FastMath.max((-3.8485011312768047d), (-2.4751129460689736d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.4751129460689736d) + "'", double2 == (-2.4751129460689736d));
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.469446951953614E-18d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.469446951953614E-18d + "'", double2 == 3.469446951953614E-18d);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5937881252841113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5937881252841114d + "'", double1 == 0.5937881252841114d);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0159090561693984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5619730447758076d + "'", double1 == 1.5619730447758076d);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.156119580207157E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7589809880912084d) + "'", double1 == (-0.7589809880912084d));
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 573L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999999995419658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999997709829d + "'", double1 == 0.9999999997709829d);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.435597088531952d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        double double2 = org.apache.commons.math.util.FastMath.max(0.5403023058681398d, 1.4371344463413933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4371344463413933d + "'", double2 == 1.4371344463413933d);
    }
}

