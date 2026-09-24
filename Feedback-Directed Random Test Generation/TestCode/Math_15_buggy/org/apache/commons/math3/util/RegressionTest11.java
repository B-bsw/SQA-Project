package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (-4));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01831563888873418d + "'", double1 == 0.01831563888873418d);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-2.9499630527705192E-5d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        int int2 = org.apache.commons.math3.util.FastMath.max(52, 175);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 175 + "'", int2 == 175);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4096.001f, 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4096.001f + "'", float2 == 4096.001f);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 100L, 1.192093037616354E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.192093037616354E-7d + "'", double2 == 1.192093037616354E-7d);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(255370.74139618516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.201867548519866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18387663746222113d + "'", double1 == 0.18387663746222113d);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        int int1 = org.apache.commons.math3.util.FastMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.76837158203125E-7d, 0.12520241624226194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14274598524894844d + "'", double2 == 0.14274598524894844d);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5015887158341327d + "'", double1 == 0.5015887158341327d);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1120213610286207d) + "'", double1 == (-1.1120213610286207d));
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, (double) (-63L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.4203952968051369d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3979639665392374d + "'", double1 == 0.3979639665392374d);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.37076031045626007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.1235582092889473E307d, 3.2374576517016327E-71d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1235582092889473E307d + "'", double2 == 1.1235582092889473E307d);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9998757901941958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414038674724426d + "'", double1 == 0.8414038674724426d);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(11883.891508581362d, 0.6053856514068299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707453850936495d + "'", double2 == 1.5707453850936495d);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.951243865300542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.374030431949343d + "'", double1 == 1.374030431949343d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.9914900537226896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5862745278957586d + "'", double1 == 1.5862745278957586d);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(750.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-47.96018124249531d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1073422413691776d) + "'", double1 == (-1.1073422413691776d));
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.7320508075688774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508075688774d + "'", double1 == 1.7320508075688774d);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(9.999999f, 75);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.777893E23f + "'", float2 == 3.777893E23f);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.932447891572509d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.932447891572508d + "'", double2 == 6.932447891572508d);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.3795085488311785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3795085488311785d + "'", double1 == 1.3795085488311785d);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.0001761935342754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        double double2 = org.apache.commons.math3.util.FastMath.log(9.462941570952797d, 0.8643238493907621d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06487889975186842d) + "'", double2 == (-0.06487889975186842d));
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        long long2 = org.apache.commons.math3.util.FastMath.min(79L, 458L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 79L + "'", long2 == 79L);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.5481985207131723d, 1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.548198520713172d + "'", double2 == 2.548198520713172d);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(8.63114046460753E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 90.34675736186902d + "'", double1 == 90.34675736186902d);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        float float1 = org.apache.commons.math3.util.FastMath.signum(22025.998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.1606570981826605d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7526551608216967d + "'", double1 == 1.7526551608216967d);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (-100.0f), 96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8042090786043492d) + "'", double2 == (-0.8042090786043492d));
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.0194839173657902E-28d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.4841550858394146E-44d + "'", double1 == 4.4841550858394146E-44d);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.9999999999998966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6033115335528957d, 96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006264389542770914d + "'", double2 == 0.006264389542770914d);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1.1529215E18f, 5.648027917416435E219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.15292150460684723E18d + "'", double2 == 1.15292150460684723E18d);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 2979.38053468028d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(23207.519636520385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23208.0d + "'", double1 == 23208.0d);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-17.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-3.0f), 23208.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.9999998f) + "'", float2 == (-2.9999998f));
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2979.3805346802806d, (double) (-6));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5728101655170956d + "'", double2 == 1.5728101655170956d);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        float float1 = org.apache.commons.math3.util.FastMath.abs(22025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.0f + "'", float1 == 22025.0f);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        float float1 = org.apache.commons.math3.util.FastMath.signum(750.00006f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        double double1 = org.apache.commons.math3.util.FastMath.asin(328280.7253817591d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 35.000008f, 0.00724572153624304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5705893062276597d + "'", double2 == 1.5705893062276597d);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.8190930489946614E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5707846912665506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810421408845061d + "'", double1 == 4.810421408845061d);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.9999751568045011d, (-0.9992790497916413d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (-0.4103302129827837d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-18L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.913180823778077d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(223.23772953327418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.1013894524176076d + "'", double1 == 6.1013894524176076d);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.342925101645957d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-17.0f), 3.668970750059695d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.999998f) + "'", float2 == (-16.999998f));
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.13608771814969906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1365081616962985d + "'", double1 == 0.1365081616962985d);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (-0.25f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24999999999999997d) + "'", double1 == (-0.24999999999999997d));
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.620414103520911d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.9333634218998555d), 0.025819886105840354d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5431401081740224d) + "'", double2 == (-1.5431401081740224d));
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 18.000002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9444390795532054d + "'", double1 == 2.9444390795532054d);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        int int2 = org.apache.commons.math3.util.FastMath.min(15, 144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.868551121099462d, (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.868551121099462d + "'", double2 == 1.868551121099462d);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.008022644671146243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008022730733654788d + "'", double1 == 0.008022730733654788d);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.066281120220074d, 97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.066281120220075d + "'", double2 == 6.066281120220075d);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.752553812699746d + "'", double1 == 7.752553812699746d);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.02396008020219597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023962372790212762d + "'", double1 == 0.023962372790212762d);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.8750612633917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.695600561273704d + "'", double1 == 1.695600561273704d);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        float float1 = org.apache.commons.math3.util.FastMath.signum(0.031250004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-148.99999999999804d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9503933001340736E-65d + "'", double1 == 1.9503933001340736E-65d);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6156614228606675d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.2676505246703657E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9780821240516806d + "'", double1 == 0.9780821240516806d);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.1727481272914977d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.3931722845112914d), 22026);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.588250504492026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2009190019566577d + "'", double1 == 0.2009190019566577d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        double double1 = org.apache.commons.math3.util.FastMath.sin(328281.00000000006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2721850946649906d) + "'", double1 == (-0.2721850946649906d));
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.9843745f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        double double2 = org.apache.commons.math3.util.FastMath.pow(8.973830118957931E-4d, 22.14423310405345d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.357616567889211E-68d + "'", double2 == 3.357616567889211E-68d);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0024151657987541153d, (-9.235280381378425d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4764498148372356E24d + "'", double2 == 1.4764498148372356E24d);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1261939.543775638d, (-0.996833390848202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.306298138481234d + "'", double2 == 0.306298138481234d);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        double double1 = org.apache.commons.math3.util.FastMath.cos(23.1114808588885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4353833334705676d) + "'", double1 == (-0.4353833334705676d));
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 32768.004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.3841858E-7f, (-63));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5849394142282115E-26d + "'", double2 == 2.5849394142282115E-26d);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(6.691673596021348E41d, (-2.667490975180856d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021347E41d + "'", double2 == 6.691673596021347E41d);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.001401979773852388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2631562551169929d + "'", double1 == 0.2631562551169929d);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-1.2261911708835171d), 0.026535507103947666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2261911708835171d + "'", double2 == 1.2261911708835171d);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.1629259179658376d, (-458));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.189032263212272E-139d + "'", double2 == 2.189032263212272E-139d);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(53248.0d, 0.7500000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24999999999211775d + "'", double2 == 0.24999999999211775d);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        int int1 = org.apache.commons.math3.util.FastMath.round(100.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(114.59155902616463d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(3.000000238418579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508763943914d + "'", double1 == 1.7320508763943914d);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(99.99999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.07718758899559931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9970225167945358d + "'", double1 == 0.9970225167945358d);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9794818692056363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01709518358122681d + "'", double1 == 0.01709518358122681d);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        double double2 = org.apache.commons.math3.util.FastMath.max(138.00002158667908d, (-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.00002158667908d + "'", double2 == 138.00002158667908d);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-105.99999f), 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.7787262E7f) + "'", float2 == (-2.7787262E7f));
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.99997885272489d, 17.872171546425456d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.4499804372832909E17d + "'", double2 == 7.4499804372832909E17d);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.15987052369731924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15919038274063185d + "'", double1 == 0.15919038274063185d);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.356564024018388d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.012793491209214d, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.341371165927588E18d + "'", double2 == 9.341371165927588E18d);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.63824392687195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.014811373879680489d, 1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014810290931637665d + "'", double2 == 0.014810290931637665d);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (-1.9843745f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8625334306123279d) + "'", double1 == (-0.8625334306123279d));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.001953125f, 9.999999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.001953125f + "'", float2 == 0.001953125f);
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-3L), (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-3.0f) + "'", float2 == (-3.0f));
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 144, (long) (-127));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999806514771749d, 1.381888937281653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999732625891371d + "'", double2 == 0.9999732625891371d);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        long long1 = org.apache.commons.math3.util.FastMath.abs(5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-12.125f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.125f + "'", float1 == 12.125f);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.1741109918529156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0549609508701883d + "'", double1 == 1.0549609508701883d);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5373482451913212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03344184514419537d + "'", double1 == 0.03344184514419537d);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.562922473770796d), 1.381888937281653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.086227143433629d + "'", double2 == 2.086227143433629d);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 10L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.000001f + "'", float1 == 10.000001f);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32L, 548.3170351552121d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(35.00000000000001d, 2.8190931236751223E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.2532797083404758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004420564839032246d + "'", double1 == 0.004420564839032246d);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(4.3625831891367726E215d, (-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.662514762151963d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.87234351317457d) + "'", double1 == (-10.87234351317457d));
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) 1, 6400);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6400 + "'", int2 == 6400);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47712125471966244d + "'", double1 == 0.47712125471966244d);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.0831933869426666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000000001E10d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.983978114526449E-12d, 0.15786583843612662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.983978114526449E-12d + "'", double2 == 5.983978114526449E-12d);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.834796820967027d, (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.834796820967027d + "'", double2 == 0.834796820967027d);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5408815889082699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02991027634527111d + "'", double1 == 0.02991027634527111d);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(39.00000000000001d, 1.4901161193847656E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 39.0d + "'", double2 == 39.0d);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-12.125f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.1674533972268024E8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707963182292441d) + "'", double1 == (-1.5707963182292441d));
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(52.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.1691265E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7778932E22f + "'", float1 == 3.7778932E22f);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 149);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 12);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        double double2 = org.apache.commons.math3.util.FastMath.log(8.602325267042627d, 1.5677465296093194d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.20893701516559085d + "'", double2 == 0.20893701516559085d);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(9.86283941997888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        int int1 = org.apache.commons.math3.util.FastMath.round((-100.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-100) + "'", int1 == (-100));
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.9921249019112125d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003433649623862475d) + "'", double1 == (-0.003433649623862475d));
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, 7.555787E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        double double2 = org.apache.commons.math3.util.FastMath.pow(18.999352444162646d, (-17));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8257462397988056E-22d + "'", double2 == 1.8257462397988056E-22d);
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.128360965853085d, 3.0562853121379475E-37d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.70197740328915E-38d + "'", double2 == 4.70197740328915E-38d);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        long long2 = org.apache.commons.math3.util.FastMath.max(99L, 99L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.17260366972569707d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.3732912E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.3732912E-4f + "'", float1 == 1.3732912E-4f);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.2557079554805255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.311477841049903d + "'", double1 == 1.311477841049903d);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.5725986423097538E-55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.267964697122677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0587664925401685d + "'", double1 == 1.0587664925401685d);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 5.80584E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.763865073340014d + "'", double1 == 32.763865073340014d);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(458.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.8200151728564355d + "'", double1 == 6.8200151728564355d);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        double double1 = org.apache.commons.math3.util.FastMath.log(6.647156080594096E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.45881643099403d + "'", double1 == 59.45881643099403d);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(74.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-1L), (-41));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-4.5474735E-13f) + "'", float2 == (-4.5474735E-13f));
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.03126018221959883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.455931045053886E-4d + "'", double1 == 5.455931045053886E-4d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 3.0562853E-37f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.51480610569081d) + "'", double1 == (-36.51480610569081d));
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-2.0980541598711233d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.27941549819892586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9612168045072789d + "'", double1 == 0.9612168045072789d);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        double double1 = org.apache.commons.math3.util.FastMath.exp(138.0088572840262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.639431632506995E59d + "'", double1 == 8.639431632506995E59d);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4280592992577826E77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4280592992577826E77d + "'", double1 == 1.4280592992577826E77d);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 3000.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 2.103E-42f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.094947E-13f, 5730.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094948E-13f + "'", float2 == 9.094948E-13f);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-9.215233751015083E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-2.07E-43f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.3513335921151082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.301091950862747d + "'", double1 == 0.301091950862747d);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(101.0482306841231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.834060808472666E43d + "'", double1 == 3.834060808472666E43d);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.7539022543433046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7539022543433046d + "'", double1 == 0.7539022543433046d);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.573806628911546d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7927452630284285d) + "'", double1 == (-0.7927452630284285d));
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.99627207622075d + "'", double1 == 0.99627207622075d);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 108);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 108.0f + "'", float1 == 108.0f);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-30.708115498279298d), 7.284538580399531E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.708115498279298d + "'", double2 == 30.708115498279298d);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.587997411051078d), (double) (-2));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5537689358093707d + "'", double2 == 2.5537689358093707d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.2166140353901593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2166140353901593d + "'", double1 == 0.2166140353901593d);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5549408655424255d) + "'", double1 == (-1.5549408655424255d));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 256.0f + "'", float1 == 256.0f);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.44943985085450217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4661381914791386d + "'", double1 == 0.4661381914791386d);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.891454401121671E-47d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        double double1 = org.apache.commons.math3.util.FastMath.tan(127.00000762939453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.186033145648624d + "'", double1 == 4.186033145648624d);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.99999999999956d + "'", double1 == 96.99999999999956d);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.25f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        double double1 = org.apache.commons.math3.util.FastMath.cos(127.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23235910202965793d + "'", double1 == 0.23235910202965793d);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(79.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 79.00001f + "'", float1 == 79.00001f);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(29937.07086594976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        int int2 = org.apache.commons.math3.util.FastMath.max((-22), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(57.29577951308395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000284d + "'", double1 == 1.0000000000000284d);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1024.0001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 1.3732912E-4f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3732911697772492E-4d + "'", double1 == 1.3732911697772492E-4d);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.13970721181982998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.149937061583715d + "'", double1 == 1.149937061583715d);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.15292144E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0529879845855437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3241189037517391d + "'", double1 == 0.3241189037517391d);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768986d + "'", double1 == 5557.690612768986d);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.05235987755982989d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-17.0f), (-100.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.9843745f), (double) 1018L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9843744f) + "'", float2 == (-1.9843744f));
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.013362476578269d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017686511732454713d + "'", double1 == 0.017686511732454713d);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        double double1 = org.apache.commons.math3.util.FastMath.sin(5.656854249492381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.586176193003373d) + "'", double1 == (-0.586176193003373d));
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.5529523200824553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5280657044573005d + "'", double1 == 0.5280657044573005d);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        long long2 = org.apache.commons.math3.util.FastMath.min(18L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-3), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, 95L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11013.21191404869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.2168091200164d + "'", double1 == 192.2168091200164d);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5063590621241333d), (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.1747956118563848E9d) + "'", double2 == (-2.1747956118563848E9d));
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.023665418289289288d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        double double1 = org.apache.commons.math3.util.FastMath.log10(9.437246939205792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9748453191400233d + "'", double1 == 0.9748453191400233d);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6679190596134986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6193535575220712d + "'", double1 == 0.6193535575220712d);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-12.125f), 0.04687067344618581d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.124999f) + "'", float2 == (-12.124999f));
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.243374546616421E-11d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.026538621740554002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5442545888816204d + "'", double1 == 1.5442545888816204d);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.003127495644813641d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003127500743274655d + "'", double1 == 0.003127500743274655d);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.000667111259251d, (-1.7031839360032603E-108d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 108);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0065821320002953E46d + "'", double1 == 4.0065821320002953E46d);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.02134620319296122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.743392130574644E-23d, 0.13970721181982995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7433921305746446E-23d + "'", double2 == 3.7433921305746446E-23d);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1500.0003333332966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9939386574859939d) + "'", double1 == (-0.9939386574859939d));
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(3.6379788E-12f, (float) 53248L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.6379788E-12f + "'", float2 == 3.6379788E-12f);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(256.0f, 0.023964666826589657d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 255.99998f + "'", float2 == 255.99998f);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        long long1 = org.apache.commons.math3.util.FastMath.abs((-149L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 149L + "'", long1 == 149L);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000001137d + "'", double1 == 1.0000000000001137d);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-41.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-40));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(43.134641898419105d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.8784688923495146d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9706244805940946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.130372968474061d + "'", double1 == 1.130372968474061d);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(4.9344739331306915d, 0.06692625537479202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9344739331306915d + "'", double2 == 4.9344739331306915d);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-2L), (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 22025L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22025 + "'", int1 == 22025);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(8.931287896711864E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9885260408288E48d + "'", double1 == 2.9885260408288E48d);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1024L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1024L + "'", long1 == 1024L);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.186033145648624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3023186765274486d, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4373177370416246d + "'", double2 == 1.4373177370416246d);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.502154937700731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.208774782825373d + "'", double1 == 12.208774782825373d);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double1 = org.apache.commons.math3.util.FastMath.rint(91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.0d + "'", double1 == 91.0d);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) (-58), (-58));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0122792E-16f) + "'", float2 == (-2.0122792E-16f));
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.555787E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.555788E22f + "'", float1 == 7.555788E22f);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (-126.99998f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-127.0d) + "'", double1 == (-127.0d));
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.008949316167871405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0089894810243984d + "'", double1 == 1.0089894810243984d);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-1023L), 2980.9579870417283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1023.0d) + "'", double2 == (-1023.0d));
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5706217939194553d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.24611750286723066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.04399474110473024d), 203.18733465192955d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.9542141200785643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.083779534054409d) + "'", double1 == (-3.083779534054409d));
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        int int2 = org.apache.commons.math3.util.FastMath.min(1500, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(597.258785006331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.424132284821418d + "'", double1 == 10.424132284821418d);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 175, 0.4738240626447961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 175.0006414538025d + "'", double2 == 175.0006414538025d);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        float float1 = org.apache.commons.math3.util.FastMath.signum(22026.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.012849789557351724d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1884224E32f, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1884223E32f + "'", float2 == 1.1884223E32f);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.855486072473502E7d + "'", double1 == 2.855486072473502E7d);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 62);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.792391689498254d + "'", double1 == 1.792391689498254d);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, (double) (-20));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.70949768864047E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570125376975692d + "'", double1 == 1.570125376975692d);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 52.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.21110307993129d + "'", double1 == 7.21110307993129d);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.3241189037517391d, 3.383362716805521d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3241189037517391d + "'", double2 == 0.3241189037517391d);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.689503773740456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        double double1 = org.apache.commons.math3.util.FastMath.abs(4.825487151967882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.825487151967882d + "'", double1 == 4.825487151967882d);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.22168521914039824d, (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4663299296337E-309d + "'", double2 == 2.4663299296337E-309d);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 127L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 32, 9.2233715E18f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(4.8144606961796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.814460696179601d + "'", double1 == 4.814460696179601d);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double1 = org.apache.commons.math3.util.FastMath.log((-3.5963016834733655E18d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-126.999985f), 5.4043196E16f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.999985f + "'", float2 == 126.999985f);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 54);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-17.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.0d + "'", double1 == 17.0d);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-61944147371L), (float) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6.1944148E10f) + "'", float2 == (-6.1944148E10f));
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        float float2 = org.apache.commons.math3.util.FastMath.max(10.000001f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 63L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 63.0f + "'", float1 == 63.0f);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.8625334306123279d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        double double1 = org.apache.commons.math3.util.FastMath.abs(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.9950547536867305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7595094447988621d) + "'", double1 == (-0.7595094447988621d));
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 0.9678957951470605d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        double double2 = org.apache.commons.math3.util.FastMath.pow(9.256230992860951E225d, 0.661011522946662d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3249670098212854E149d + "'", double2 == 2.3249670098212854E149d);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 33, (long) 22026);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22026L + "'", long2 == 22026L);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6268604078470186d + "'", double1 == 3.6268604078470186d);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        double double2 = org.apache.commons.math3.util.FastMath.log(1659255.7839972847d, 0.8405507891024043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.012128149649440787d) + "'", double2 == (-0.012128149649440787d));
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(258048.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.015625f + "'", float1 == 0.015625f);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(7.555788E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.555789E22f + "'", float1 == 7.555789E22f);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.5707543717664076d, (double) (-63));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1166652089154914d + "'", double2 == 3.1166652089154914d);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-17.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        int int2 = org.apache.commons.math3.util.FastMath.max((-100), 1500);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.006732012348487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        long long2 = org.apache.commons.math3.util.FastMath.max(9L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(138.0d, 750.0000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.18196468595918594d + "'", double2 == 0.18196468595918594d);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 63.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(631011.7625152353d, (-0.0054342900833709755d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 631011.7625152353d + "'", double2 == 631011.7625152353d);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5563207343123242d, (double) 1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000053996151583d + "'", double2 == 1.000053996151583d);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.2281805647428924E20d, (-0.15655890067882908d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2281805647428924E20d + "'", double2 == 3.2281805647428924E20d);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(96.99999237060545d, 2.0786305240141214d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999237060545d + "'", double2 == 96.99999237060545d);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        int int1 = org.apache.commons.math3.util.FastMath.abs(76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9999295221303693d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000070482837111d + "'", double2 == 1.000070482837111d);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 100, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) 10, 101651685L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.984807753012208d + "'", double1 == 0.984807753012208d);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.017686511732454713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.086878629239412E-4d + "'", double1 == 3.086878629239412E-4d);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(378077.081374287d, 11013.21191404869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5416750205131582d + "'", double2 == 1.5416750205131582d);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 22025.998f, 3.7325113393608302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13170840853865248d + "'", double2 == 0.13170840853865248d);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(0.0f, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(22.95294447899659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.952944478996592d + "'", double1 == 22.952944478996592d);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) (-3.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.017874927409903d) + "'", double1 == (-10.017874927409903d));
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 12.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4876550949064553d + "'", double1 == 1.4876550949064553d);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.3678794630987664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.23235910202965793d, 1.4643253509790913E95d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4643253509790913E95d + "'", double2 == 1.4643253509790913E95d);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.9754659633069416d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        float float2 = org.apache.commons.math3.util.FastMath.max((-1.9843748f), 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.8146973E-6f + "'", float2 == 3.8146973E-6f);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.747801550829054d, (double) (-2L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7837860351644754d + "'", double2 == 2.7837860351644754d);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.7613487752456315d), (double) (-9.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.032145479207474d + "'", double2 == 9.032145479207474d);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 106, 99);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.718548E31f + "'", float2 == 6.718548E31f);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 750L, 45.254833995939045d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 749.99994f + "'", float2 == 749.99994f);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        double double2 = org.apache.commons.math3.util.FastMath.max(2005.3522829578812d, 57.29577951308395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.9443043E-31f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.9443045E-31f + "'", float1 == 3.9443045E-31f);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.2612473073318639d, 0.7778696553673483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8205677036841424d + "'", double2 == 0.8205677036841424d);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.6649237511146353d, (-0.012849789557351726d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9934708510524944d + "'", double2 == 0.9934708510524944d);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        double double1 = org.apache.commons.math3.util.FastMath.tan(17.872171546425456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4825609493135583d) + "'", double1 == (-1.4825609493135583d));
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9748453191400233d, 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9748453191400233d + "'", double2 == 0.9748453191400233d);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        double double1 = org.apache.commons.math3.util.FastMath.rint(5.211020790109826E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.1826881112499317d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1143659906583754d, (-56.83127452036154d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(52.0000114440918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831051843374681E22d + "'", double1 == 3.831051843374681E22d);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1024);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double1 = org.apache.commons.math3.util.FastMath.acos(148.4131591025766d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.856118598515538E77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.994188727481171d + "'", double1 == 0.994188727481171d);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.551070328970187E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5510703289701874E21d + "'", double1 == 1.5510703289701874E21d);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        double double1 = org.apache.commons.math3.util.FastMath.log(25.75100659895216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2484737175671463d + "'", double1 == 3.2484737175671463d);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 52.00001f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.6053856514068299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5018895836882269d) + "'", double1 == (-0.5018895836882269d));
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.37928799478267655d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        double double1 = org.apache.commons.math3.util.FastMath.tan(74.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.737022539278999d) + "'", double1 == (-5.737022539278999d));
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.7227342478134157d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.272740699632835d + "'", double1 == 1.272740699632835d);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 58);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.753515866530499d + "'", double1 == 4.753515866530499d);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.37021206770136134d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.0088885951019526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8462402091167727d + "'", double1 == 0.8462402091167727d);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        double double1 = org.apache.commons.math3.util.FastMath.log(3.469446951953614E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-40.20253647247683d) + "'", double1 == (-40.20253647247683d));
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(75.0f, 4.605170185988093d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 74.99999f + "'", float2 == 74.99999f);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-0.021986227279203782d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02198977097857152d) + "'", double1 == (-0.02198977097857152d));
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8126232407697149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6823907848375064d + "'", double1 == 0.6823907848375064d);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 34.999996f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4738100493246071d + "'", double1 == 0.4738100493246071d);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        double double2 = org.apache.commons.math3.util.FastMath.max(28.03100307406022d, (double) 138);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.0d + "'", double2 == 138.0d);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 187L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 187 + "'", int1 == 187);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.002415168146714362d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0024151728426471814d + "'", double1 == 0.0024151728426471814d);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        float float2 = org.apache.commons.math3.util.FastMath.min(75.99999f, 10.000001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.000001f + "'", float2 == 10.000001f);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.7613487752456315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.62207155902897d) + "'", double1 == (-43.62207155902897d));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.288241522117258d + "'", double1 == 5.288241522117258d);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7433261306201426d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 144L, (double) 8192.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8192.0d + "'", double2 == 8192.0d);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9426286359925615d, 2.234021194410018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9426286359925615d + "'", double2 == 0.9426286359925615d);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (byte) 10, 6.709497185234125E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.017686511732454713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001564104258314d + "'", double1 == 1.0001564104258314d);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.8812778905541143d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7715524587962287d + "'", double1 == 0.7715524587962287d);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 99.99999f, 1833.464944418634d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05448754828505034d + "'", double2 == 0.05448754828505034d);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5696954877123248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.570796326794893d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.831051843374681E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.195031017211833E24d + "'", double1 == 2.195031017211833E24d);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45760881147219573d + "'", double1 == 0.45760881147219573d);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        int int1 = org.apache.commons.math3.util.FastMath.round((-2.09E-43f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(9.178679289503757E-29d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(5730.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 108);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.7526551608216967d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.17571389149050348d, (double) 1.984375f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.39410242298628406d) + "'", double2 == (-0.39410242298628406d));
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(39.803104571515284d, 0.40213799685287804d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00855711691964206d) + "'", double2 == (-0.00855711691964206d));
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.3978950994030255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5485138357157244d + "'", double1 == 1.5485138357157244d);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        int int2 = org.apache.commons.math3.util.FastMath.max((-18), 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 1.2089257E24f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-18));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-17.999998f) + "'", float1 == (-17.999998f));
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-2.5049299045672764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        double double1 = org.apache.commons.math3.util.FastMath.cos(83.17782841321889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07430835130604421d + "'", double1 == 0.07430835130604421d);
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.0d, 0.5483703652841707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4333887434795537d) + "'", double2 == (-0.4333887434795537d));
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.666977646080837d, 1.5862338664598659d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5862338664598659d + "'", double2 == 1.5862338664598659d);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.049999527931213d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7156569181624268d + "'", double1 == 1.7156569181624268d);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-2.09E-43f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.01745329147964599d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017454177589139353d) + "'", double1 == (-0.017454177589139353d));
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-54.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10727605356188535d) + "'", double1 == (-0.10727605356188535d));
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.023667627328711145d, 5.01389619242801d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023667627328711145d + "'", double2 == 0.023667627328711145d);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        long long2 = org.apache.commons.math3.util.FastMath.max(106L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 106L + "'", long2 == 106L);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.621322410763002d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6L + "'", long1 == 6L);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.0393938008757937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5.508115596856299E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.508115596856299E15d + "'", double1 == 5.508115596856299E15d);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 144, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(5.53754499586793E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.537544995867647E-7d + "'", double1 == 5.537544995867647E-7d);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-16.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9073486E-6f + "'", float1 == 1.9073486E-6f);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        int int2 = org.apache.commons.math3.util.FastMath.max(18, (-17));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.587997411051078d), 458);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.754473730996652E91d + "'", double2 == 9.754473730996652E91d);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.027298433348069674d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(9.810189733007238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        double double1 = org.apache.commons.math3.util.FastMath.exp(38.025003373828866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2662478706390684E16d + "'", double1 == 3.2662478706390684E16d);
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(32.000008f, 108);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0384596E34f + "'", float2 == 1.0384596E34f);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.7715524587962287d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013466130757852076d + "'", double1 == 0.013466130757852076d);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1638400.1f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        double double1 = org.apache.commons.math3.util.FastMath.asin(1.272740699632835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.624216256515976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8114214365648633d + "'", double1 == 0.8114214365648633d);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1022.99994f), 1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1022.99994f) + "'", float2 == (-1022.99994f));
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3012.989023970796d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-0.5783152542625629d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5783152542625629d + "'", double1 == 0.5783152542625629d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 12.000003f, 3.000000238418579d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.000000238418579d + "'", double2 == 3.000000238418579d);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        double double1 = org.apache.commons.math3.util.FastMath.signum(403.4287934927351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 52, 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(97.000015f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.09220376963371194d), (double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09220376963371192d) + "'", double2 == (-0.09220376963371192d));
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.485731137483685d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(7.105427357601002E-15d, 1.3383347192043076E42d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.105427357601002E-15d + "'", double2 == 7.105427357601002E-15d);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.0089894810243984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.007983904417203952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.5635500768149995d, (-106));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.927224263991661E-32d + "'", double2 == 1.927224263991661E-32d);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.000003814697266d + "'", double1 == 52.000003814697266d);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.272740699632835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24117260647275346d + "'", double1 == 0.24117260647275346d);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.09731253940776538d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09715902486194199d) + "'", double1 == (-0.09715902486194199d));
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        float float2 = org.apache.commons.math3.util.FastMath.max(53248.004f, 750.00006f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.004f + "'", float2 == 53248.004f);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.3732912E-4f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.12520241624226192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12487556775313036d + "'", double1 == 0.12487556775313036d);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 1, (long) 149);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.545061952940336d) + "'", double1 == (-3.545061952940336d));
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.7102126686676506d, 0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.025822755842440984d + "'", double2 == 0.025822755842440984d);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) (-149));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        float float2 = org.apache.commons.math3.util.FastMath.max(4.2949673E9f, 131072.02f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(4.8828125E-4f, 18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 128.0f + "'", float2 == 128.0f);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.34147968535479184d), 2.0512062454087515E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.34147968535479184d) + "'", double2 == (-0.34147968535479184d));
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 99L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(6400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        int int2 = org.apache.commons.math3.util.FastMath.max(22026, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22026 + "'", int2 == 22026);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9.0f, (double) 7.629395E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000167636356807d + "'", double2 == 1.0000167636356807d);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1025.0d + "'", double1 == 1025.0d);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(8.317766405137894d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 476.5729099901041d + "'", double1 == 476.5729099901041d);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-1.1073422413691776d), (-0.031149732764242856d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01404813814356523d + "'", double2 == 0.01404813814356523d);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.026871352829836912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0272356433040997d + "'", double1 == 1.0272356433040997d);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-9.215236359557623E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.210991634471118E-4d) + "'", double1 == (-9.210991634471118E-4d));
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.8844902699029284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.381888937281653d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25110378549586093d + "'", double1 == 0.25110378549586093d);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-1.3237334981628701d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-3.0f), (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.0031545098999704E16d) + "'", double2 == (-5.0031545098999704E16d));
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-48.99628209992639d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 511.99997f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.931472699667872d + "'", double1 == 6.931472699667872d);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-0.15853338004399595d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 101651685L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(9.848857801796104d, 0.035211118248524166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.010255307790662582d) + "'", double2 == (-0.010255307790662582d));
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(2.299249233707907E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.299249233707907E97d + "'", double1 == 2.299249233707907E97d);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-1.5704510598095374d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7920486373025791d) + "'", double1 == (-0.7920486373025791d));
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(3.0562853121379475E-37d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.33422415771498E-39d + "'", double1 == 5.33422415771498E-39d);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.14015855437046063d, 4.194983122255699E96d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-113.22351824030044d) + "'", double2 == (-113.22351824030044d));
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        int int1 = org.apache.commons.math3.util.FastMath.round((-12.124999f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12) + "'", int1 == (-12));
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.6643855961249147d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6165755315688757d + "'", double1 == 0.6165755315688757d);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.5258789E-5f, (float) (-61944147371L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5258789E-5f + "'", float2 == 1.5258789E-5f);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.9074079744350795E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 172.15170601593198d + "'", double1 == 172.15170601593198d);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.13970367520817575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13970367520817575d + "'", double1 == 0.13970367520817575d);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.7528415227961107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2839005344264299d) + "'", double1 == (-0.2839005344264299d));
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-6), 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6L) + "'", long2 == (-6L));
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5706400767961681d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45148322850318046d + "'", double1 == 0.45148322850318046d);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.950423060997261E-65d, 0.8768045251087089d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2244673757305733E-65d + "'", double2 == 2.2244673757305733E-65d);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.22609662867095306d, 2.153330206915566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2260966286709531d + "'", double2 == 0.2260966286709531d);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.9999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.9604645E-8f + "'", float1 == 5.9604645E-8f);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 631011.7625152355d + "'", double1 == 631011.7625152355d);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-19.409313714545853d), (-0.23003301858504133d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5826474541736284d) + "'", double2 == (-1.5826474541736284d));
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025196192240463114d + "'", double1 == 0.025196192240463114d);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.40432E16f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-149.0f), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.00000002049957d, 2.0626820368470065d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000000422840953d + "'", double2 == 1.0000000422840953d);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(258048.0f, 6.243374546616421E-11d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 258047.98f + "'", float2 == 258047.98f);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        double double2 = org.apache.commons.math3.util.FastMath.pow(10.579878738885967d, 1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.273085878361627d + "'", double2 == 11.273085878361627d);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-2));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.9999999f) + "'", float1 == (-1.9999999f));
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.9964048291869961d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.708526687174765d + "'", double1 == 1.708526687174765d);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        long long2 = org.apache.commons.math3.util.FastMath.max(144L, (-63L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 144L + "'", long2 == 144L);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.3334888230404185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33970476966674595d + "'", double1 == 0.33970476966674595d);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.13235423529153753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13235423529153753d + "'", double1 == 0.13235423529153753d);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(304.1700902674171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        double double1 = org.apache.commons.math3.util.FastMath.tan(9.178679289503757E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.178679289503757E-29d + "'", double1 == 9.178679289503757E-29d);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(22.24871540768837d, (-1.5706791906040234d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.248715407688366d + "'", double2 == 22.248715407688366d);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.395725598471343E-46d, 9.5367431640625E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.395725598471343E-46d + "'", double2 == 2.395725598471343E-46d);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.4764498148372356E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4764498148372358E24d + "'", double1 == 1.4764498148372358E24d);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5635505418565119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2831781865614684d + "'", double1 == 2.2831781865614684d);
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.0f, (float) 4294967296L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.5510703289701874E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.0d + "'", double1 == 76.0d);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        double double1 = org.apache.commons.math3.util.FastMath.log(5.288241522117258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6654857751291565d + "'", double1 == 1.6654857751291565d);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.7561974449853123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.563150929088647d + "'", double1 == 0.563150929088647d);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        float float2 = org.apache.commons.math3.util.FastMath.min(3000.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-0.5987297191141082d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.12049738039639d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.4515827052894548d, (-6809493.145514925d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }
}

