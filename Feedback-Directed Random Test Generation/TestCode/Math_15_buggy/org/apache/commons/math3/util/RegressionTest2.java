package org.apache.commons.math3.util;

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
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8731400784750731d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5730.0d + "'", double1 == 5730.0d);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.7763568394002505E-15d, (double) (-2.3768449E32f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.37684487542793E32d + "'", double2 == 2.37684487542793E32d);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.5845632502852868E29d, 11.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852866E29d + "'", double2 == 1.5845632502852866E29d);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.0000001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        double double1 = org.apache.commons.math3.util.FastMath.abs(718053.7444319915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 718053.7444319915d + "'", double1 == 718053.7444319915d);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.09246595244807976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3040821475326688d + "'", double1 == 0.3040821475326688d);
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 2147483647, 1.4842386559313054d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6519950360895284d + "'", double2 == 0.6519950360895284d);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.058916076536616895d) + "'", double1 == (-0.058916076536616895d));
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.9169970877394357d, 0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9169970877394357d + "'", double2 == 0.9169970877394357d);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        float float2 = org.apache.commons.math3.util.FastMath.min(7.0f, (-126.999985f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.999985f) + "'", float2 == (-126.999985f));
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        long long1 = org.apache.commons.math3.util.FastMath.abs(1025L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1025L + "'", long1 == 1025L);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.9483398404364088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5830326867761627d + "'", double1 == 0.5830326867761627d);
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 6.0f, 7.668093098623077E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.39608926335157d + "'", double2 == 56.39608926335157d);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.4436354751788103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0230833853373482d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.515287744883901E10d + "'", double2 == 3.515287744883901E10d);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        double double1 = org.apache.commons.math3.util.FastMath.floor(39.803104571515284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 234683.56883849486d + "'", double1 == 234683.56883849486d);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        int int1 = org.apache.commons.math3.util.FastMath.round((-126.999985f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        double double1 = org.apache.commons.math3.util.FastMath.log(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(22026.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) ' ', 1.560487413648653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.2377295332742d + "'", double2 == 223.2377295332742d);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0269035089368426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.013362476578269d + "'", double1 == 1.013362476578269d);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7254630513334037d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.16371340869567735d) + "'", double1 == (-0.16371340869567735d));
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5604874136486533d, (double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.000003814697266d + "'", double2 == 52.000003814697266d);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.09966865249116202d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.5262586308923471d, (-1.557407724654902d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0771875889955993d, 138.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 138.00002158667908d + "'", double2 == 138.00002158667908d);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.16323882911185375d, 7.584283767291423E71d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16323882911185375d + "'", double2 == 0.16323882911185375d);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        int int1 = org.apache.commons.math3.util.FastMath.round(4096.001f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.6698790550935152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5127512017063653d + "'", double1 == 0.5127512017063653d);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4515827052894548d + "'", double1 == 0.4515827052894548d);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.7911843097149078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10172233398898892d) + "'", double1 == (-0.10172233398898892d));
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 35.000004f, 63);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2281805647428924E20d + "'", double2 == 3.2281805647428924E20d);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5730.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.894443933771722d + "'", double1 == 17.894443933771722d);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.99999994f), 4.574710978503383d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.9999999f) + "'", float2 == (-0.9999999f));
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7396130970112139d) + "'", double1 == (-0.7396130970112139d));
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.7581682870722382d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8604993868447559d) + "'", double1 == (-0.8604993868447559d));
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.08957411090233484d), 15.00402842524522d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.005969933155126179d) + "'", double2 == (-0.005969933155126179d));
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017459443376353793d + "'", double1 == 0.017459443376353793d);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        double double2 = org.apache.commons.math3.util.FastMath.min(53248.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        double double2 = org.apache.commons.math3.util.FastMath.pow(11013.232920103323d, (double) 5L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6202204943810763E20d + "'", double2 == 1.6202204943810763E20d);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        float float1 = org.apache.commons.math3.util.FastMath.signum(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (-1), 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) (-9223372036854775808L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.223372036854776E18d) + "'", double1 == (-9.223372036854776E18d));
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.0d, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03844259002118798d + "'", double2 == 0.03844259002118798d);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(4.684434645507153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.1199089796844d + "'", double1 == 54.1199089796844d);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 32.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948163070152176E13d + "'", double1 == 3.948163070152176E13d);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.7396130970112139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        long long2 = org.apache.commons.math3.util.FastMath.min(5L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.22374095013561138d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22011573792157446d) + "'", double1 == (-0.22011573792157446d));
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.16181164155481406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16110644616183156d + "'", double1 == 0.16110644616183156d);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1025, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1025.0f + "'", float2 == 1025.0f);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(31.999998f, (-0.09246595244807976d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999996f + "'", float2 == 31.999996f);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(22.418333678328555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.723507742868687E9d + "'", double1 == 2.723507742868687E9d);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(2.37684487542793E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.24164408196494d + "'", double1 == 75.24164408196494d);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-3.031835271646539d), 0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.031835271646539d + "'", double2 == 3.031835271646539d);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.2676505E30f), 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676505E30f) + "'", float2 == (-1.2676505E30f));
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        double double1 = org.apache.commons.math3.util.FastMath.tan(2.856118598515538E77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.235280381378425d) + "'", double1 == (-9.235280381378425d));
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.04687067344618581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04690504152837204d + "'", double1 == 0.04690504152837204d);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.52587890625E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.75100659895216d + "'", double1 == 25.75100659895216d);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        double double2 = org.apache.commons.math3.util.FastMath.log((-0.08957411090233484d), 3.2710663101885897d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9342813E25f, 138.00000000000003d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9342812E25f + "'", float2 == 1.9342812E25f);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-8537.071147449265d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8537.071147449265d + "'", double1 == 8537.071147449265d);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 127, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9169970877394357d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698197646053376d + "'", double1 == 1.5698197646053376d);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.7683716E-7f + "'", float1 == 4.7683716E-7f);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(700.4129619927088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.553096817707418d + "'", double1 == 6.553096817707418d);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 15L, 99.99999f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 15.0f + "'", float2 == 15.0f);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(2.1533302069155655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2913289205442933d + "'", double1 == 1.2913289205442933d);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 31.999998f, 1.0113951599323715E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.99999809265137d + "'", double2 == 31.99999809265137d);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 512.0d + "'", double1 == 512.0d);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        float float2 = org.apache.commons.math3.util.FastMath.min((-148.99998f), 22026.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5698197646053376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0036030562437495d + "'", double1 == 1.0036030562437495d);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 32.000004f, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6643855961249147d + "'", double2 == 0.6643855961249147d);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.3678794630987664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787946309876646d + "'", double1 == 0.36787946309876646d);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        double double1 = org.apache.commons.math3.util.FastMath.acos(22025.465794806718d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(148.4131591025766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.182493960703473d + "'", double1 == 12.182493960703473d);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.8282604197892285d) + "'", double1 == (-5.8282604197892285d));
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8390715290764524d) + "'", double1 == (-0.8390715290764524d));
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        double double1 = org.apache.commons.math3.util.FastMath.atan(138.0088572840262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5635505418565119d + "'", double1 == 1.5635505418565119d);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.7966228647962957d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-1.5706791906040234d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 6.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (-0.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403024061792941d + "'", double1 == 0.5403024061792941d);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.39929200144991767d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7363713281677684d) + "'", double1 == (-0.7363713281677684d));
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-3) + "'", int1 == (-3));
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4096, 5447015486L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-7.623359472495549E-46d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.6952633082705699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1578506894064046d) + "'", double1 == (-0.1578506894064046d));
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0036030562437495d, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00518408307889d + "'", double2 == 97.00518408307889d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 1.0000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29578634327149d + "'", double1 == 57.29578634327149d);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-0.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.1920929E-7f, (double) (-149.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920928E-7f + "'", float2 == 1.1920928E-7f);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0001761935342754d, 400.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001761935342757d + "'", double2 == 1.0001761935342757d);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (short) -1, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        long long2 = org.apache.commons.math3.util.FastMath.max(97L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        float float1 = org.apache.commons.math3.util.FastMath.abs(9.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999998f + "'", float1 == 9.999998f);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 10, 31.999998f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.999998f + "'", float2 == 31.999998f);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629394531250002E-6d + "'", double1 == 7.629394531250002E-6d);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4425149084880988d + "'", double1 == 1.4425149084880988d);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1760912590556813d + "'", double1 == 3.1760912590556813d);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (-3));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1425465430742778d + "'", double1 == 0.1425465430742778d);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.1658334890961391E10d, (-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1415126117084844d + "'", double2 == 0.1415126117084844d);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-1.522697550491263d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9897050718833815d) + "'", double2 == (-0.9897050718833815d));
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(9.094947017729282E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0194839173657902E-28d + "'", double1 == 2.0194839173657902E-28d);
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, (double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.017459443376353793d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017459443376353797d + "'", double2 == 0.017459443376353797d);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        double double1 = org.apache.commons.math3.util.FastMath.exp(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000284d + "'", double1 == 1.0000000000000284d);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5707963266960232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(101.04822696504081d, (double) 1024.9998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1029.9685644157091d + "'", double2 == 1029.9685644157091d);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 512.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.996833390848202d) + "'", double1 == (-0.996833390848202d));
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5442452350911982d, 512.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.194983122255699E96d + "'", double2 == 4.194983122255699E96d);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146977E-6f + "'", float1 == 3.8146977E-6f);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.2913289205442933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8291319638968807d + "'", double1 == 0.8291319638968807d);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 'a', 0.0771875889955993d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.99999f + "'", float2 == 96.99999f);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        double double1 = org.apache.commons.math3.util.FastMath.atan(29.885930658415557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5373482451913212d + "'", double1 == 1.5373482451913212d);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-44.3614195558365d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 5, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 138L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 138.00000000000003d + "'", double1 == 138.00000000000003d);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 31.999998f, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8526676855528264E78d + "'", double2 == 1.8526676855528264E78d);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        int int1 = org.apache.commons.math3.util.FastMath.abs(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        double double1 = org.apache.commons.math3.util.FastMath.rint(3.1760912590556813d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-44.3614195558365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6487212707001282d + "'", double1 == 1.6487212707001282d);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        double double1 = org.apache.commons.math3.util.FastMath.floor(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0d + "'", double1 == 2979.0d);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1025, 35.000008f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000008f + "'", float2 == 35.000008f);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2.3768449E32f, 1.4425149084880988d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.045031552153607E46d + "'", double2 == 5.045031552153607E46d);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8851880063739007d + "'", double1 == 0.8851880063739007d);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        double double1 = org.apache.commons.math3.util.FastMath.acos(6.591783121186793E31d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 5L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1024.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1024.0d + "'", double1 == 1024.0d);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.802596928649635E-45d + "'", double1 == 2.802596928649635E-45d);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.802596928649635E-45d, (double) 22026.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.802596928649635E-45d + "'", double2 == 2.802596928649635E-45d);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 243.43253608919426d + "'", double1 == 243.43253608919426d);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.027181892591221314d) + "'", double1 == (-0.027181892591221314d));
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 138, 9.094947E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.0f + "'", float2 == 138.0f);
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(328280.7252583891d, (-0.1578506894064046d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 328280.725258389d + "'", double2 == 328280.725258389d);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 7.0f, 2.3283064365386964E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.376000838461856d + "'", double1 == 32.376000838461856d);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.6643855961249147d, 1.5635500768149995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40180391273652716d + "'", double2 == 0.40180391273652716d);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.723507742868687E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963264277232d + "'", double1 == 1.5707963264277232d);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 127, 5.545972E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        double double2 = org.apache.commons.math3.util.FastMath.log(138.00002158667908d, 3.0466282343967674d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22609662867095306d + "'", double2 == 0.22609662867095306d);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        double double1 = org.apache.commons.math3.util.FastMath.abs(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735448726939d) + "'", double1 == (-0.8813735448726939d));
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.9344739331306915d, 29.885930658415557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.128360965853085d + "'", double2 == 2.128360965853085d);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.37684487542793E32d, 63);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.10729846174016215d, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3601695942848226E29d + "'", double2 == 1.3601695942848226E29d);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 5.4470154E9f, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.299249233707907E97d + "'", double2 == 2.299249233707907E97d);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-126.99999f), 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 126.99999f + "'", float2 == 126.99999f);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.688117141816136E43d + "'", double1 == 2.688117141816136E43d);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.185891831851989d + "'", double1 == 4.185891831851989d);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        int int2 = org.apache.commons.math3.util.FastMath.min(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(53.80040108927525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.334875669653525d + "'", double1 == 7.334875669653525d);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.564085018163574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.23606797749979d + "'", double1 == 2.23606797749979d);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        int int1 = org.apache.commons.math3.util.FastMath.abs(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0000001f + "'", float1 == 1.0000001f);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        int int1 = org.apache.commons.math3.util.FastMath.abs(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.4012984643248174E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4012984643248174E-45d + "'", double1 == 1.4012984643248174E-45d);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(127.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.00001f + "'", float1 == 127.00001f);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.0d, 8388608.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-149.0d), (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2350186363540905d) + "'", double2 == (-1.2350186363540905d));
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0E100d, 0.22609662867095306d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E100d + "'", double2 == 1.0E100d);
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.22011573792157446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.802425921479547d + "'", double1 == 0.802425921479547d);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.3734007669450161d, 1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5376614260315677d + "'", double2 == 1.5376614260315677d);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 35.000008f, (double) 1024.9999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03413309100327678d + "'", double2 == 0.03413309100327678d);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.7031839360032603E-108d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1L, (int) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.2949673E9f + "'", float2 == 4.2949673E9f);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0113951599323715E10d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.602619601945246E39d + "'", double2 == 1.602619601945246E39d);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 5L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        double double1 = org.apache.commons.math3.util.FastMath.acos(0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0771787365603915d + "'", double1 == 1.0771787365603915d);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(114.59155902616465d, 1.560487412837878d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 114.59155902616463d + "'", double2 == 114.59155902616463d);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.0003524181127126d, 400.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 400.0d + "'", double2 == 400.0d);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 7.5557864E22f, 11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5137.518865003625d) + "'", double2 == (-5137.518865003625d));
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 15L, 2.3768449E32f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3768449E32f + "'", float2 == 2.3768449E32f);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.16181164155481406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0028241459131883822d + "'", double1 == 0.0028241459131883822d);
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.560487413648653d, (-2.185039863261519d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.74434308084387d + "'", double1 == 35.74434308084387d);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((-0.09252791806716626d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        double double1 = org.apache.commons.math3.util.FastMath.asin(33.418366853490404d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        double double1 = org.apache.commons.math3.util.FastMath.abs(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.24164408196494d + "'", double1 == 75.24164408196494d);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707886974003653d + "'", double1 == 1.5707886974003653d);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        double double1 = org.apache.commons.math3.util.FastMath.acos(1.3754263876807227d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-1L), 127.00001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.013362476578269d, (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5066812382891345d + "'", double2 == 0.5066812382891345d);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        double double1 = org.apache.commons.math3.util.FastMath.floor(4.574710978503383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8972849022006305E-4d + "'", double1 == 3.8972849022006305E-4d);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        float float2 = org.apache.commons.math3.util.FastMath.max((-2.3768449E32f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        double double2 = org.apache.commons.math3.util.FastMath.log(7.584283767291423E71d, 1.6144206905127136d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.002893947719693431d + "'", double2 == 0.002893947719693431d);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1500.0f, (-1.949823557438858d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1499.9999f + "'", float2 == 1499.9999f);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.973830118957929E-4d + "'", double1 == 8.973830118957929E-4d);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(126.99999f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.5501416712979399d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.155183333204203d + "'", double1 == 1.155183333204203d);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716578E22d + "'", double1 == 3.831008000716578E22d);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.308769561254787d + "'", double1 == 5.308769561254787d);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 127.0f, 4096);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        int int2 = org.apache.commons.math3.util.FastMath.min((-3), 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3023186765274486d + "'", double1 == 1.3023186765274486d);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 4096.0005f, (double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1500.0d + "'", double2 == 1500.0d);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.5063656411097588d), 127);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.61536494421336E37d) + "'", double2 == (-8.61536494421336E37d));
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-7.6770288745698245d), 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-30.708115498279298d) + "'", double2 == (-30.708115498279298d));
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.23606797749979d, 1.5845632502852866E29d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4111572870929613E-29d + "'", double2 == 1.4111572870929613E-29d);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 5447015486L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.447015486E9d + "'", double1 == 5.447015486E9d);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 4096, 127);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(52.000003814697266d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.0d + "'", double1 == 53.0d);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(5729.578400155824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5730.0d + "'", double1 == 5730.0d);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 5447015486L, 1.373400766945016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447015486E9d + "'", double2 == 5.447015486E9d);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        int int2 = org.apache.commons.math3.util.FastMath.min(127, (-127));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-127) + "'", int2 == (-127));
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 127);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4302079958348105E55d + "'", double1 == 1.4302079958348105E55d);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        double double1 = org.apache.commons.math3.util.FastMath.log(9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2873554892516914d + "'", double1 == 2.2873554892516914d);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1.2207031E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207033E-4f + "'", float1 == 1.2207033E-4f);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-149));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 149.0f + "'", float1 == 149.0f);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(6.691673596021348E41d, 0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.691673596021348E41d + "'", double2 == 6.691673596021348E41d);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, (long) 1025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1025L + "'", long2 == 1025L);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-0.9999999f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709203988365d) + "'", double1 == (-0.8414709203988365d));
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        long long2 = org.apache.commons.math3.util.FastMath.max((-6L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(9.094948E-13f, 7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.094948E-13f + "'", float2 == 9.094948E-13f);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9426286359925615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016451973321653327d + "'", double1 == 0.016451973321653327d);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.00498431552268554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.69927168291248E-5d + "'", double1 == 8.69927168291248E-5d);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.2350186363540905d), 1.3560551570236352d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 127.0f, 1.564085018163574d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.564085018163574d + "'", double2 == 1.564085018163574d);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.688117141816136E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14933831547143916d + "'", double1 == 0.14933831547143916d);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(101.46782120377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.3129131773544485d + "'", double1 == 5.3129131773544485d);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        double double1 = org.apache.commons.math3.util.FastMath.sin(57.29578634327149d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6795276293349446d + "'", double1 == 0.6795276293349446d);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 1024, (float) 750);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 750, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 750.0f + "'", float2 == 750.0f);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 1024.0f, 0.026541737035255974d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0000003439764d + "'", double2 == 1024.0000003439764d);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (-3));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.2207033E-4f + "'", float1 == 1.2207033E-4f);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1743590056195488d + "'", double1 == 1.1743590056195488d);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3560551570236352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9353866470427131d + "'", double1 == 0.9353866470427131d);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 4.5474735E-13f + "'", float1 == 4.5474735E-13f);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.730093305612845d + "'", double1 == 1.730093305612845d);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        long long1 = org.apache.commons.math3.util.FastMath.abs(15L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-1.557407724654902d), 0.3010299956639812d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5862338664598659d + "'", double2 == 1.5862338664598659d);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.2913289205442933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6376174496659073d + "'", double1 == 2.6376174496659073d);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.949823557438858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0969082479362111d) + "'", double1 == (-1.0969082479362111d));
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436354751788103d + "'", double1 == 1.4436354751788103d);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-3), (long) 750);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3L) + "'", long2 == (-3L));
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.701627437177594d + "'", double1 == 12.701627437177594d);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.371095219025714E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3710953E7d + "'", double1 == 3.3710953E7d);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        double double1 = org.apache.commons.math3.util.FastMath.tan(6.553096817707418d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27666287087872976d + "'", double1 == 0.27666287087872976d);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 100, 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6400.0f + "'", float2 == 6400.0f);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3734007669450157d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3734007669450157d + "'", double2 == 1.3734007669450157d);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 7.5557864E22f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3187334977903953E21d + "'", double1 == 1.3187334977903953E21d);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.6940658945086007E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(13.394771296627336d, 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.394771296627336d + "'", double2 == 13.394771296627336d);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.3187334977903953E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3187334977903953E21d + "'", double1 == 1.3187334977903953E21d);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 97.00001f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.16125382097679095d, (-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.16125382097679095d) + "'", double2 == (-0.16125382097679095d));
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(52.000003814697266d, 3.2281805647428924E20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2281805647428924E20d + "'", double2 == 3.2281805647428924E20d);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.4716190657154942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4716190657154944d + "'", double1 == 1.4716190657154944d);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.9344739331306915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((-44.3614195558365d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5698197646053376d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027398523555245483d + "'", double1 == 0.027398523555245483d);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.6420926159343308d, (-2.9499630527705192E-5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9499630527705192E-5d) + "'", double2 == (-2.9499630527705192E-5d));
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        float float2 = org.apache.commons.math3.util.FastMath.max(35.0f, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        float float2 = org.apache.commons.math3.util.FastMath.max(1.4E-45f, 35.000004f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.000004f + "'", float2 == 35.000004f);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) 4096.001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.317766405137894d + "'", double1 == 8.317766405137894d);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.3768449E32f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.9342813E25f + "'", float1 == 1.9342813E25f);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1, 4096);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (-3L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.1071487177940904d, 138.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008022644671146243d + "'", double2 == 0.008022644671146243d);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.42280635864377986d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(2.856118598515538E77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 178.34851573024756d + "'", double1 == 178.34851573024756d);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-0.5063656411097588d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8745129512124437d + "'", double1 == 0.8745129512124437d);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.2207031E-4f, 0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8079404376202444d + "'", double2 == 0.8079404376202444d);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.447015423999999E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963266113099d + "'", double1 == 1.5707963266113099d);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.0626820368470065d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(10.545893600459793d, 75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13925318512771137d + "'", double2 == 0.13925318512771137d);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.15349285356613754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16589945506899414d + "'", double1 == 0.16589945506899414d);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.730093305612845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004335786492981d + "'", double1 == 1.004335786492981d);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.970566590482209E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.163544458620017d + "'", double1 == 2.163544458620017d);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        long long1 = org.apache.commons.math3.util.FastMath.round((-5.8282604197892285d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-6L) + "'", long1 == (-6L));
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28366218546322625d + "'", double1 == 0.28366218546322625d);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 100.00001f, 1.452146029569111d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.08100514452844133d + "'", double2 == 0.08100514452844133d);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        double double1 = org.apache.commons.math3.util.FastMath.tan(8.69927168291248E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.699271704857068E-5d + "'", double1 == 8.699271704857068E-5d);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((-0.7363713281677684d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2835960924048626d + "'", double1 == 1.2835960924048626d);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.662514762151963d, (-127));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.178679289503757E-29d + "'", double2 == 9.178679289503757E-29d);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.9131200615513249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5987297191141082d) + "'", double1 == (-0.5987297191141082d));
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(10.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.536743E-7f + "'", float1 == 9.536743E-7f);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.0230833853373482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968076702201445d + "'", double1 == 0.7968076702201445d);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.386127875258307d + "'", double1 == 27.386127875258307d);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.9875650456761652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9875650456761653d + "'", double1 == 0.9875650456761653d);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(2.128360965853085d, 0.023667627328711145d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0017254937309181956d) + "'", double2 == (-0.0017254937309181956d));
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 52.000004f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053128792867638d) + "'", double1 == (-6.053128792867638d));
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        double double1 = org.apache.commons.math3.util.FastMath.asin(15.29676667877352d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0954922813103776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43361281667855023d + "'", double1 == 0.43361281667855023d);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        float float1 = org.apache.commons.math3.util.FastMath.signum(9.094948E-13f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1025L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.832824094709035d + "'", double1 == 0.832824094709035d);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 4096);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.9999975763076077d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (byte) 10, (double) 96.99999f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9867717001074399d + "'", double2 == 1.9867717001074399d);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(91.45317136336229d, 1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.45317136336227d + "'", double2 == 91.45317136336227d);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.8715802485510056E20d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1025 + "'", int1 == 1025);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.16125382097679095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15987052369731924d + "'", double1 == 0.15987052369731924d);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777765d + "'", double1 == 10.067661995777765d);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9999999403953551d), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        double double1 = org.apache.commons.math3.util.FastMath.log10(0.1585290151921035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7998912382754204d) + "'", double1 == (-0.7998912382754204d));
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        double double2 = org.apache.commons.math3.util.FastMath.pow(53.0d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.797874411390694E167d + "'", double2 == 1.797874411390694E167d);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        double double1 = org.apache.commons.math3.util.FastMath.log(75.24164408196494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.320704855363221d + "'", double1 == 4.320704855363221d);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.0771787365603915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03228777187869229d + "'", double1 == 0.03228777187869229d);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        float float2 = org.apache.commons.math3.util.FastMath.max(52.000004f, 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.000004f + "'", float2 == 52.000004f);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1024.9999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.POSITIVE_INFINITY, (float) (-6L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.NEGATIVE_INFINITY + "'", float2 == Float.NEGATIVE_INFINITY);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 3.8146977E-6f, 148.99998474121094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.814697720372351E-6d + "'", double2 == 3.814697720372351E-6d);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        int int1 = org.apache.commons.math3.util.FastMath.abs((-6));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-7.6770288745698245d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(9.849160264910656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9831006351425686d + "'", double1 == 2.9831006351425686d);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        float float1 = org.apache.commons.math3.util.FastMath.signum(1.9342813E25f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2684529660545276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6370408237133427d + "'", double1 == 1.6370408237133427d);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        float float2 = org.apache.commons.math3.util.FastMath.max(31.999998f, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.194983122255699E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.17520542459923d + "'", double1 == 223.17520542459923d);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1023) + "'", int1 == (-1023));
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.0626820368470065d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        float float1 = org.apache.commons.math3.util.FastMath.signum(19.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 4096);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4096L + "'", long1 == 4096L);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-1.564085018163574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2092794124576321d + "'", double1 == 0.2092794124576321d);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 52, 4.7683716E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2005.3522829578812d + "'", double1 == 2005.3522829578812d);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.0E20d, (double) (-1.2676505E30f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2676505246703657E30d + "'", double2 == 1.2676505246703657E30d);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        double double1 = org.apache.commons.math3.util.FastMath.signum(7.584283767291423E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-149.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        double double1 = org.apache.commons.math3.util.FastMath.sin(2.9831006351425686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15782930550131322d + "'", double1 == 0.15782930550131322d);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.027298433348069678d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-2.185039863261519d), 3.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8149601367384811d + "'", double2 == 0.8149601367384811d);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5413248546129181d + "'", double1 == 0.5413248546129181d);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 52L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 52.0f + "'", float1 == 52.0f);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 6.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27941549819892586d) + "'", double1 == (-0.27941549819892586d));
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.3010299956639812d, 328280.725258389d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-10.579878738885967d) + "'", double2 == (-10.579878738885967d));
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        int int2 = org.apache.commons.math3.util.FastMath.min(7, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8731400784750731d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 12);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.000001f + "'", float1 == 12.000001f);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        double double2 = org.apache.commons.math3.util.FastMath.log(75.24164408196494d, 1.0830799868521925d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.018471250572709978d + "'", double2 == 0.018471250572709978d);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        double double1 = org.apache.commons.math3.util.FastMath.tan(101.04822696504083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5689319876403915d + "'", double1 == 0.5689319876403915d);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(101.00000000000003d, 0.7717075948257832d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.00000000000001d + "'", double2 == 101.00000000000001d);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(2048.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.317766226323982d + "'", double1 == 8.317766226323982d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.017459443376353793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017612750376510982d + "'", double1 == 0.017612750376510982d);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-9.223372036854776E18d), 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.2207033E-4f, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.416897404767d + "'", double1 == 384.416897404767d);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.8745129512124437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0644306856851378d + "'", double1 == 1.0644306856851378d);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2147483647, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        float float1 = org.apache.commons.math3.util.FastMath.abs(7.5557864E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.5557864E22f + "'", float1 == 7.5557864E22f);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.8125409412719369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.031634807252392476d) + "'", double1 == (-0.031634807252392476d));
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 6400.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 80.0d + "'", double1 == 80.0d);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.506835355571496E7d + "'", double1 == 9.506835355571496E7d);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 12, 138);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.453021129808693E148d + "'", double2 == 8.453021129808693E148d);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        double double1 = org.apache.commons.math3.util.FastMath.atan(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.017459443376353797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0174594433763538d + "'", double1 == 0.0174594433763538d);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        int int2 = org.apache.commons.math3.util.FastMath.max((-6), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        double double1 = org.apache.commons.math3.util.FastMath.signum(4.9344739331306915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        double double1 = org.apache.commons.math3.util.FastMath.floor(10.545893600459793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.0644306856851378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8991879649199075d + "'", double1 == 2.8991879649199075d);
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.000000000000001d + "'", double1 == 5.000000000000001d);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(2.802596928649634E-45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.223015277861142E-61d + "'", double1 == 6.223015277861142E-61d);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(99.99999237060545d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.16323882911185375d, 1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16323882911185375d + "'", double2 == 0.16323882911185375d);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-0.0017254937309181956d), 1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0017254937309181954d) + "'", double2 == (-0.0017254937309181954d));
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.7456418720467646d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3237334981628701d) + "'", double1 == (-1.3237334981628701d));
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1024.9998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.9999f + "'", float1 == 1024.9999f);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-2.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2599210498948732d) + "'", double1 == (-1.2599210498948732d));
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.22374095013561138d), (-149.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22374095013561138d) + "'", double2 == (-0.22374095013561138d));
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450729502920265d + "'", double1 == 0.7450729502920265d);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.3768449E32f, 149.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3768449E32f + "'", float2 == 2.3768449E32f);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.15052756842981832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026272016841214006d + "'", double1 == 0.0026272016841214006d);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        float float1 = org.apache.commons.math3.util.FastMath.abs(31.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.999998f + "'", float1 == 31.999998f);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5707932806215363d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4738240626447961d + "'", double1 == 0.4738240626447961d);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(4.684434645507153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.2676505E30f), (-1.5706791906040234d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.26765045E30f) + "'", float2 == (-1.26765045E30f));
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.16125382097679095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0130295945424812d + "'", double1 == 1.0130295945424812d);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (short) -1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.1533302069155655d, 0.8291319638968807d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2032471075153308d + "'", double2 == 1.2032471075153308d);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 12.000001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5365721132383438d) + "'", double1 == (-0.5365721132383438d));
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(138.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 127);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 127.00001f + "'", float1 == 127.00001f);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        long long2 = org.apache.commons.math3.util.FastMath.max((-149L), (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.7911843097149078d, (-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7911843097149077d + "'", double2 == 0.7911843097149077d);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.194983122255699E96d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25484119874557287d + "'", double1 == 0.25484119874557287d);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        long long2 = org.apache.commons.math3.util.FastMath.min((-149L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) ' ', (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(5.447015423999999E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1759.4875643140501d + "'", double1 == 1759.4875643140501d);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(512.0f, 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        double double2 = org.apache.commons.math3.util.FastMath.pow(16.93539593942879d, 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-5137.518865003625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2979.3805346802806d, 178.34851573024756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2979.38053468028d + "'", double2 == 2979.38053468028d);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (-149), 97.00518408307889d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.00518408307889d + "'", double2 == 97.00518408307889d);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(12.000001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 12.000002f + "'", float1 == 12.000002f);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(Float.NEGATIVE_INFINITY, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) '#', 15L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 15L + "'", long2 == 15L);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.2491947060601294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8480576692493907d + "'", double1 == 0.8480576692493907d);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 200.3351263076086d + "'", double1 == 200.3351263076086d);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.1741109918529156d, 1.9520523170857447d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2779475125273763d + "'", double2 == 2.2779475125273763d);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 750.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7450729502920265d + "'", double1 == 0.7450729502920265d);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-9.235280381378425d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0980541598711233d) + "'", double1 == (-2.0980541598711233d));
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.447015423999999E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.736158605041556d + "'", double1 == 9.736158605041556d);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 5447015486L, 4096.001f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(8.317766226323982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14517240706053733d + "'", double1 == 0.14517240706053733d);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.41032129904822556d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.633123935319537E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.850338976445283E14d + "'", double1 == 2.850338976445283E14d);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-1), 8.006367456539117d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-0.99999994f) + "'", float2 == (-0.99999994f));
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        int int2 = org.apache.commons.math3.util.FastMath.min(10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.684434645507153d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 1.0000001f, 1.0644306856851378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06443056647584822d) + "'", double2 == (-0.06443056647584822d));
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1023), (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5698197646053376d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-0.5987297191141082d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8428370245346917d) + "'", double1 == (-0.8428370245346917d));
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 7);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        int int2 = org.apache.commons.math3.util.FastMath.max(2, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        float float2 = org.apache.commons.math3.util.FastMath.min(4096.0005f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        double double1 = org.apache.commons.math3.util.FastMath.cos(35.74434308084387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.37460659341591257d) + "'", double1 == (-0.37460659341591257d));
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.6717532003326169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8139312059190631d + "'", double1 == 0.8139312059190631d);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.8526676855528264E78d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(25.75100659895216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9530087697160634d + "'", double1 == 2.9530087697160634d);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.3560551570236352d, (int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.824212550988658E9d + "'", double2 == 5.824212550988658E9d);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 100.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063590621241333d) + "'", double1 == (-0.5063590621241333d));
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) 22026L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22026.002f + "'", float1 == 22026.002f);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.000000000000004E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4874710524825647d) + "'", double1 == (-0.4874710524825647d));
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        float float1 = org.apache.commons.math3.util.FastMath.abs(138.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.0f + "'", float1 == 138.0f);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(223.2377295332742d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 223.23772953327423d + "'", double1 == 223.23772953327423d);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 1.0000000000000284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-149), 2.2873554892516914d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-148.99998f) + "'", float2 == (-148.99998f));
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }
}

