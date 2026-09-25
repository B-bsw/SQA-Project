package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9380275718736537d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9793520787205557d) + "'", double1 == (-0.9793520787205557d));
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8742049625998478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7183795354997284d) + "'", double1 == (-0.7183795354997284d));
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.21657131639750768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2200220284760452d + "'", double1 == 0.2200220284760452d);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1322832176161492E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9209371342424432d + "'", double1 == 0.9209371342424432d);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.9881722337154755d, 0.03760197886023983d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.558213385991504d + "'", double2 == 1.558213385991504d);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999940403043344d + "'", double1 == 0.9999940403043344d);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.866317614445707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        double double1 = org.apache.commons.math.util.FastMath.expm1(169.42101997711706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.789780828580952E73d + "'", double1 == 3.789780828580952E73d);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5687114866419769d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5687114866419769d + "'", double1 == 0.5687114866419769d);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.52318064E8d + "'", double1 == 2.52318064E8d);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.22309009934914975d), (-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22309009934914978d) + "'", double2 == (-0.22309009934914978d));
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        long long1 = org.apache.commons.math.util.FastMath.round(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2979L + "'", long1 == 2979L);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.8039446305066866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.77462798227501d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.8054126007489795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6173312283870106d + "'", double1 == 0.6173312283870106d);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9918043161804359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        double double1 = org.apache.commons.math.util.FastMath.cos(22.43026792747856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9051264149247703d) + "'", double1 == (-0.9051264149247703d));
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.1606074732651916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.676406743021734d + "'", double1 == 7.676406743021734d);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.733479389818152E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000047d + "'", double1 == 1.0000000000000047d);
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.972501523185553E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03994949099270701d + "'", double1 == 0.03994949099270701d);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 88, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        double double2 = org.apache.commons.math.util.FastMath.min(1.153068686219429d, 1.3248054181561355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.153068686219429d + "'", double2 == 1.153068686219429d);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6684562262374831d, 0.8251802222449077d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6684562262374831d + "'", double2 == 0.6684562262374831d);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9642258512973702d), 0.6931237786692368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9475378833879686d) + "'", double2 == (-0.9475378833879686d));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9999999999999747d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0997501702946166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.005605148959791052d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.005605178309980436d) + "'", double1 == (-0.005605178309980436d));
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5573185038727098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.19146656470733d + "'", double1 == 74.19146656470733d);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.03994949099270701d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        double double2 = org.apache.commons.math.util.FastMath.max(5.551115123125783E-17d, 0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5585053606381855d + "'", double2 == 0.5585053606381855d);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 26L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9516133360820653d + "'", double1 == 3.9516133360820653d);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5409004834963647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.227302203813422d + "'", double1 == 2.227302203813422d);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.13019523074717101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9915365662477135d + "'", double1 == 0.9915365662477135d);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1224799415331224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12217394401427815d + "'", double1 == 0.12217394401427815d);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.45363791367130896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8988587803407233d + "'", double1 == 0.8988587803407233d);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9999999998054523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.972550183292928E-5d + "'", double1 == 1.972550183292928E-5d);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5397294065638792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5663183116235424d) + "'", double1 == (-0.5663183116235424d));
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 38L, (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7304003084084857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7304003084084858d + "'", double1 == 0.7304003084084858d);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0636083985381795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        double double1 = org.apache.commons.math.util.FastMath.expm1(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.259554979423884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2538792427651392d) + "'", double1 == (-0.2538792427651392d));
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7766609160650201d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 46.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8028514559173916d + "'", double1 == 0.8028514559173916d);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9074644222731123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3303440783034024d) + "'", double1 == (-0.3303440783034024d));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.848501131276807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.760373407405197d) + "'", double1 == (-0.760373407405197d));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        long long1 = org.apache.commons.math.util.FastMath.abs(252318064L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 252318064L + "'", long1 == 252318064L);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0424543400597124d, (-0.29969989012090864d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9876164307133322d + "'", double2 == 0.9876164307133322d);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.11524997326667767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11499500694534612d + "'", double1 == 0.11499500694534612d);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.555362640229557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8497092935503449d + "'", double1 == 0.8497092935503449d);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5544559615876794d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6507779951543295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8067081226530012d + "'", double1 == 0.8067081226530012d);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9777313730176922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.774138956873145d + "'", double1 == 0.774138956873145d);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.184705528587072E21d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.232738956216599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1553333796430316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.175081748724746d + "'", double1 == 2.175081748724746d);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6295736575984704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.142219984543288E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984543288E-13d + "'", double1 == 8.142219984543288E-13d);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8421630577599043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7460851374654318d + "'", double1 == 0.7460851374654318d);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-2.322730729536119d), 1.1624473513485225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3227307295361186d) + "'", double2 == (-2.3227307295361186d));
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7925863873716607d, 0.5428187279146441d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7925863873716607d + "'", double2 == 0.7925863873716607d);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6494710267528832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6047652140543645d + "'", double1 == 0.6047652140543645d);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.47905538530296876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4790553853029688d + "'", double1 == 0.4790553853029688d);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.43968383668853217d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.45398815654405256d) + "'", double1 == (-0.45398815654405256d));
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        long long1 = org.apache.commons.math.util.FastMath.abs(23L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.7883278476424156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3375726937940255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3375726937940255d + "'", double1 == 1.3375726937940255d);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        float float1 = org.apache.commons.math.util.FastMath.abs(3374.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3374.0f + "'", float1 == 3374.0f);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.08704561128797016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08715591099014713d) + "'", double1 == (-0.08715591099014713d));
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.806217383937352E-6d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1155899177076454d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.003142877647074027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-3.5860124967445253d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9722914014431785d) + "'", double1 == (-0.9722914014431785d));
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0029388786388205d, 1.1397939566479853d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0029388786388207d + "'", double2 == 1.0029388786388207d);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5896235118375416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6305926250944657d + "'", double1 == 0.6305926250944657d);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.3277366163928728d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 62.802933415151905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.802933415151905d + "'", double2 == 62.802933415151905d);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.276907645666474d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2213870726063898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3918892688709152d + "'", double1 == 2.3918892688709152d);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.020877862358127622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02109732960109633d + "'", double1 == 0.02109732960109633d);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.4917863811300067d, 0.27401024075282976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4917863811300065d + "'", double2 == 1.4917863811300065d);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.003884821853522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6950877074459285d + "'", double1 == 0.6950877074459285d);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        int int2 = org.apache.commons.math.util.FastMath.max(145, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.4948929599538448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.029698164942722875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029261507757911004d) + "'", double1 == (-0.029261507757911004d));
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6881824710286039d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        double double2 = org.apache.commons.math.util.FastMath.max(2.786083656729492d, 0.7907497569184486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.786083656729492d + "'", double2 == 2.786083656729492d);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 22025.0f, 2.325178437245552d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5706907568321902d + "'", double2 == 1.5706907568321902d);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.142219984543288E-13d, 29.640332897826156d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01807019118332042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7430372525623743d) + "'", double1 == (-1.7430372525623743d));
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        double double1 = org.apache.commons.math.util.FastMath.signum(84.71050998855853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.10016708343765153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4644172503913179d + "'", double1 == 0.4644172503913179d);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3836860204576589d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41602402396743615d) + "'", double1 == (-0.41602402396743615d));
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        double double2 = org.apache.commons.math.util.FastMath.max(0.953159315987153d, 1.0144000753344113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0144000753344113d + "'", double2 == 1.0144000753344113d);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4855425219370817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.009440910350078538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009441050601667472d + "'", double1 == 0.009441050601667472d);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0016592965016631427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684043449710089E-19d + "'", double1 == 2.1684043449710089E-19d);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8809570117013473d, 3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8809570117013474d + "'", double2 == 0.8809570117013474d);
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        double double1 = org.apache.commons.math.util.FastMath.ceil(314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 315.0d + "'", double1 == 315.0d);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5719334995494423d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9860480246128209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.479140461416069d + "'", double1 == 2.479140461416069d);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.336795041445171E-6d) + "'", double1 == (-5.336795041445171E-6d));
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7889886852857807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2011692254191186d + "'", double1 == 2.2011692254191186d);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        int int2 = org.apache.commons.math.util.FastMath.min(7, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.1443601628891088d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.220788174228434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.553033583883514d + "'", double1 == 4.553033583883514d);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        double double1 = org.apache.commons.math.util.FastMath.log10(416.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6190933306267428d + "'", double1 == 2.6190933306267428d);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.016250113174355E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.016250113175721E-6d + "'", double1 == 2.016250113175721E-6d);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8271614989766833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.478304958658093d + "'", double1 == 8.478304958658093d);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        double double1 = org.apache.commons.math.util.FastMath.atanh(917.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.4350592808603415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8535188133012066d) + "'", double1 == (-0.8535188133012066d));
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0000000005d + "'", double1 == 2097152.0000000005d);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.17046147158500932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.04582714110102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5011863400790127d + "'", double1 == 0.5011863400790127d);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.144549764063218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 237.46520946276348d + "'", double1 == 237.46520946276348d);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0026393956876864535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.3368086899420177E-19d + "'", double1 == 4.3368086899420177E-19d);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9761286101774449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2081071494997784d + "'", double1 == 2.2081071494997784d);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.46611365138537225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08737726680187785d) + "'", double1 == (-0.08737726680187785d));
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        double double1 = org.apache.commons.math.util.FastMath.asinh(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.356873151729317d + "'", double1 == 4.356873151729317d);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5501042757606859d + "'", double1 == 0.5501042757606859d);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7806437106503584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7160033436347992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.562253565251371d + "'", double1 == 5.562253565251371d);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.570284784815413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20798594268384546d + "'", double1 == 0.20798594268384546d);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6536774959982918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5030015933080284d + "'", double1 == 0.5030015933080284d);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        double double1 = org.apache.commons.math.util.FastMath.abs((-74.20321057778875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.20321057778875d + "'", double1 == 74.20321057778875d);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.05198617759458842d, 4.221555141999398d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05198617759458843d + "'", double2 == 0.05198617759458843d);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        double double1 = org.apache.commons.math.util.FastMath.log(4.22665135993387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4414100388676625d + "'", double1 == 1.4414100388676625d);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.638420522237698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.998618223088628d + "'", double1 == 0.998618223088628d);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.014376878057673298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5680722294658567d, 1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5680722294658564d + "'", double2 == 1.5680722294658564d);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2049805685556032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08098004356058036d + "'", double1 == 0.08098004356058036d);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5707775369683652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8789826530317993E-5d + "'", double1 == 1.8789826530317993E-5d);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        double double1 = org.apache.commons.math.util.FastMath.atan((-23.149651841415288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.527625971442648d) + "'", double1 == (-1.527625971442648d));
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.641656889827791d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47936916501280824d) + "'", double1 == (-0.47936916501280824d));
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        double double2 = org.apache.commons.math.util.FastMath.max(3.8104768396174693d, 0.0033681607366540358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8104768396174693d + "'", double2 == 3.8104768396174693d);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.18006177305525128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.389747076415403d + "'", double1 == 1.389747076415403d);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.05198617759458843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.07329964552074E-4d + "'", double1 == 9.07329964552074E-4d);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        int int2 = org.apache.commons.math.util.FastMath.min(18, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9256440224479643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6270758403697987d + "'", double1 == 1.6270758403697987d);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 97, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5293379817722996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-27.288510643477288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-27.0d) + "'", double1 == (-27.0d));
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5707008595346152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5435393044832875d + "'", double1 == 0.5435393044832875d);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        double double1 = org.apache.commons.math.util.FastMath.log(5.192685234819999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.647250949664825d + "'", double1 == 1.647250949664825d);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        double double1 = org.apache.commons.math.util.FastMath.log(0.09478579978850855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3561356722014506d) + "'", double1 == (-2.3561356722014506d));
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0000000000000564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.54308063481531d + "'", double1 == 1.54308063481531d);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5514266812417142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.584073464102096d + "'", double1 == 0.584073464102096d);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.4499918000729173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5978220919084256d) + "'", double1 == (-0.5978220919084256d));
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 57.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3265.8594322456925d + "'", double1 == 3265.8594322456925d);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6846624340993608d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8342233605065101d, (-0.999999831367789d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.446329262369421d + "'", double2 == 2.446329262369421d);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.43321775502441545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46252134864854033d + "'", double1 == 0.46252134864854033d);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1703428488012644d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        double double2 = org.apache.commons.math.util.FastMath.pow(94.16221914321702d, 6061.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.748480575315297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7484805753152971d + "'", double1 == 0.7484805753152971d);
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5900523133380877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7079733481537867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012356465941651695d + "'", double1 == 0.012356465941651695d);
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.5605255838238796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5174378764949161d + "'", double1 == 1.5174378764949161d);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.0855285725376713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.93889390390723E-18d + "'", double1 == 6.93889390390723E-18d);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 46L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 46.0f + "'", float1 == 46.0f);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9092974268256817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5234524435626737d) + "'", double1 == (-1.5234524435626737d));
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6589866960716184d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0403008077402379E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999945888711d + "'", double1 == 0.9999999945888711d);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.8849038025E-314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.03510704E-316d + "'", double1 == 5.03510704E-316d);
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.026413890076495333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02641081871667966d + "'", double1 == 0.02641081871667966d);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2535878724929015d + "'", double1 == 5.2535878724929015d);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        double double1 = org.apache.commons.math.util.FastMath.floor(194.22760893365327d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 194.0d + "'", double1 == 194.0d);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5710894459602672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1771005758622557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16305427565736225d + "'", double1 == 0.16305427565736225d);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0044783897735092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5511365515703515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4389879213057085d + "'", double1 == 0.4389879213057085d);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.0037665865012192047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        double double1 = org.apache.commons.math.util.FastMath.atanh(25.306852819440053d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.4051712E9f + "'", float1 == 2.4051712E9f);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000142d + "'", double1 == 1.0000000000000142d);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.3217505543966422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2751210143443959d) + "'", double1 == (-0.2751210143443959d));
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.329930247202055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0997052232726492d + "'", double1 == 1.0997052232726492d);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        double double2 = org.apache.commons.math.util.FastMath.atan2(116.29021260843669d, 0.6673509830411444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5650577212629906d + "'", double2 == 1.5650577212629906d);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        float float2 = org.apache.commons.math.util.FastMath.min(7.0f, 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11013.232874703392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6674619946174979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7289664090565792d), 3.808192513462892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7289664090565792d) + "'", double2 == (-0.7289664090565792d));
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.7807376231348977d, (-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.203358235506625d + "'", double2 == 0.203358235506625d);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1518086555466036d, 0.9709393822234024d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1550966525721575d + "'", double2 == 0.1550966525721575d);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2405171239L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.60088693921685d + "'", double1 == 21.60088693921685d);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.15530012983524727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1680084626919773d + "'", double1 == 1.1680084626919773d);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5703212367226402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0037477761736835d + "'", double1 == 1.0037477761736835d);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.07657274203834082d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07371446805959182d) + "'", double1 == (-0.07371446805959182d));
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0000000000000142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559557708d + "'", double1 == 0.7615941559557708d);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        float float2 = org.apache.commons.math.util.FastMath.min(31.0f, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8416276283141133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.019926209128347205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019928846806353966d + "'", double1 == 0.019928846806353966d);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49620195291270724d + "'", double1 == 0.49620195291270724d);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8988277953526667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5929534779793011d) + "'", double1 == (-0.5929534779793011d));
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        double double1 = org.apache.commons.math.util.FastMath.atanh(6662.938381142456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.011801983652871448d, 0.9964228836762624d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01180198365287145d + "'", double2 == 0.01180198365287145d);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1685366493835512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9956739004232531d + "'", double1 == 0.9956739004232531d);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2469474352118273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.7175814658190476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7175814658190476d + "'", double1 == 0.7175814658190476d);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(99.98991284675513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5728.999999999999d + "'", double1 == 5728.999999999999d);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-5), 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7678292603100174d, 1.1699737671488761E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7678292603100173d + "'", double2 == 0.7678292603100173d);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.5298961219858488d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.48727747834274504d) + "'", double1 == (-0.48727747834274504d));
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9998927719796812d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.140552959911252d) + "'", double1 == (-9.140552959911252d));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.821297790541765E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.582210883213058d + "'", double1 == 24.582210883213058d);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6114263875697965E253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2558664223046163E237d + "'", double1 == 3.2558664223046163E237d);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.055401663508057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7821340737569482d + "'", double1 == 1.7821340737569482d);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.055999926816023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7207623119975984d + "'", double1 == 0.7207623119975984d);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4359627388413443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.27460447365547d + "'", double1 == 82.27460447365547d);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        double double1 = org.apache.commons.math.util.FastMath.abs(64.00846211951401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.00846211951401d + "'", double1 == 64.00846211951401d);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        double double1 = org.apache.commons.math.util.FastMath.log(2.0250132137771875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7055762258592805d + "'", double1 == 0.7055762258592805d);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        long long2 = org.apache.commons.math.util.FastMath.max(31L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5430806348152437d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.3275777768846914d), 0.40508603762258366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3275777768846914d) + "'", double2 == (-0.3275777768846914d));
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.003884821853522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7288624076361814d + "'", double1 == 1.7288624076361814d);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8028514559173916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.676477218028962d + "'", double1 == 0.676477218028962d);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6363452148964369d) + "'", double1 == (-0.6363452148964369d));
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.0855285725376713d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7952403142819212d) + "'", double1 == (-0.7952403142819212d));
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6595834124225789d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8505319453324977d + "'", double1 == 0.8505319453324977d);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8810723403798068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.413486398183208d + "'", double1 == 2.413486398183208d);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        long long2 = org.apache.commons.math.util.FastMath.max(52L, (long) (-7));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6908159092322977d, 1.0003297196233996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0003297196233996d + "'", double2 == 1.0003297196233996d);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.014318449318574797d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.5605255838238796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.18168321028484d + "'", double1 == 35.18168321028484d);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5430770857878007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.06678364136101d + "'", double1 == 36.06678364136101d);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1589041769344135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.186439588236026d + "'", double1 == 2.186439588236026d);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        double double1 = org.apache.commons.math.util.FastMath.log1p(59.92148128532128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.109585842986132d + "'", double1 == 4.109585842986132d);
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.156534981721197d), 1.5193968358809402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5193968358809402d + "'", double2 == 1.5193968358809402d);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9998017543876165d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9093799082412982d + "'", double1 == 0.9093799082412982d);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7020801147004252d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5085304107780737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.13326424646685242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36505375832451364d + "'", double1 == 0.36505375832451364d);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        float float2 = org.apache.commons.math.util.FastMath.min(2.52318064E8f, (-7.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4340375802095812d + "'", double1 == 0.4340375802095812d);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9516746866399276d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7357243515423462d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9864301748943035d + "'", double1 == 0.9864301748943035d);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.763865462982212E-20d + "'", double1 == 6.763865462982212E-20d);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        long long1 = org.apache.commons.math.util.FastMath.round(0.005282123029073894d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.073807815489322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.073807815489322d + "'", double1 == 1.073807815489322d);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15333411044111225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026761850828140236d + "'", double1 == 0.0026761850828140236d);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.015704339111595068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01570433911159507d + "'", double1 == 0.01570433911159507d);
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1948306514787485d + "'", double1 == 0.1948306514787485d);
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3380.558658643968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        double double2 = org.apache.commons.math.util.FastMath.min(0.17597003220072988d, 0.7689073597099995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17597003220072988d + "'", double2 == 0.17597003220072988d);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        double double2 = org.apache.commons.math.util.FastMath.max(5.300565810929604E7d, 0.7510946386756716d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.300565810929604E7d + "'", double2 == 5.300565810929604E7d);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5258789063684237E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789063092117E-5d + "'", double1 == 1.5258789063092117E-5d);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999877116507956d + "'", double1 == 0.9999877116507956d);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.330707985359738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.948171812387205d + "'", double1 == 18.948171812387205d);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9640275800758169d), 1.0470934242082532d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9640275800758168d) + "'", double2 == (-0.9640275800758168d));
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        int int1 = org.apache.commons.math.util.FastMath.abs(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3153778949771762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.2963685787093853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30072622845812175d + "'", double1 == 0.30072622845812175d);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.4202810717463716d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.276907645666474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.88433813059947d + "'", double1 == 97.88433813059947d);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9489863295583174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016562936007208623d + "'", double1 == 0.016562936007208623d);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 9, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.02372538120370837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02372538120370837d + "'", double1 == 0.02372538120370837d);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        long long2 = org.apache.commons.math.util.FastMath.max(26L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.014375482049125378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7377665079155183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.07959101875688647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0765822830801347d + "'", double1 == 0.0765822830801347d);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9860480246128209d, (-0.5524262636095455d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9860480246128209d + "'", double2 == 0.9860480246128209d);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1215705721632271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.965480697943523d + "'", double1 == 6.965480697943523d);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9359323643709385d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.46036359942346083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47840473817806073d + "'", double1 == 0.47840473817806073d);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9330920755982086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3495613258011565d + "'", double1 == 1.3495613258011565d);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0392014991613199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.908823369713606d + "'", double1 == 0.908823369713606d);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8368009637323028d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1209452514271958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1482664472188384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442157056955628d + "'", double1 == 0.9442157056955628d);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.329930247202055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.796016763369322d), 1.8002419211835452d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.796016763369322d) + "'", double2 == (-0.796016763369322d));
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.30149926649701686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30149926649701686d + "'", double1 == 0.30149926649701686d);
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9864301748943035d, 0.7085012011516139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9479282788649209d + "'", double2 == 0.9479282788649209d);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6218099972365794d, (-31.55620531888934d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3246235.170392019d + "'", double2 == 3246235.170392019d);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7612158210501148d, 0.6874262672169151d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7612158210501146d + "'", double2 == 0.7612158210501146d);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-3.1214098374803794E-44d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1214098374803794E-44d) + "'", double1 == (-3.1214098374803794E-44d));
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5511365515703515d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2105);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2105L + "'", long1 == 2105L);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.1732865386340432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17504212419356444d + "'", double1 == 0.17504212419356444d);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0000000002d + "'", double1 == 1261966.0000000002d);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.936739795201818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2464946689549923d + "'", double1 == 1.2464946689549923d);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6145485553432246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.841392675946814d) + "'", double1 == (-22.841392675946814d));
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9L, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        double double1 = org.apache.commons.math.util.FastMath.log(7.54983443527075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.021525633917275d + "'", double1 == 2.021525633917275d);
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.446270374659366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.129274398827451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        double double1 = org.apache.commons.math.util.FastMath.tanh(49.23318428806336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9344065786069821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5457023351911707d + "'", double1 == 1.5457023351911707d);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6795224267964927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7778729247654365d + "'", double1 == 0.7778729247654365d);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0033524283771879993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033524409363083485d + "'", double1 == 0.0033524409363083485d);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(32830.48166099617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.25209651547738315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004399914227885181d) + "'", double1 == (-0.004399914227885181d));
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-5));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7393910596966158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1311258049772751d) + "'", double1 == (-0.1311258049772751d));
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        float float2 = org.apache.commons.math.util.FastMath.max(7.0f, (float) 38);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8001550844245482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8883134081974706d + "'", double1 == 0.8883134081974706d);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.982933744815721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.583398179910364d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.540837475237443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1877568325341648d + "'", double1 == 0.1877568325341648d);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.019661041786274192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019659775126629562d + "'", double1 == 0.019659775126629562d);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        long long1 = org.apache.commons.math.util.FastMath.round(208.466140018005d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 208L + "'", long1 == 208L);
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        double double1 = org.apache.commons.math.util.FastMath.floor((-35.27243300150086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.0d) + "'", double1 == (-36.0d));
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10471975511965978d + "'", double1 == 0.10471975511965978d);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.9509786666449536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.124661240581514d + "'", double1 == 18.124661240581514d);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.4227811167173201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4365120111136124d + "'", double1 == 0.4365120111136124d);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.3940493875124622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        long long1 = org.apache.commons.math.util.FastMath.round(5.0772059364683248E16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50772059364683248L + "'", long1 == 50772059364683248L);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 42901.69723267188d + "'", double1 == 42901.69723267188d);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.596082767675576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996803149883307d + "'", double1 == 0.9996803149883307d);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        double double1 = org.apache.commons.math.util.FastMath.sin(18.783999931406715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06550904478307228d) + "'", double1 == (-0.06550904478307228d));
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.1243451287244837d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6483608216038771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18818323607416396d) + "'", double1 == (-0.18818323607416396d));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 208L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 208 + "'", int1 == 208);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.572014987956012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9618359958599999d + "'", double1 == 0.9618359958599999d);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        double double2 = org.apache.commons.math.util.FastMath.max(1.172527850990744d, (-1.6571831014265066E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.172527850990744d + "'", double2 == 1.172527850990744d);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4443055.260253993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.2679048611920414d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1555058720069662d) + "'", double1 == (-1.1555058720069662d));
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9024010197259666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7848171480912521d + "'", double1 == 0.7848171480912521d);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.2584662921392096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2584662921392096d + "'", double1 == 3.2584662921392096d);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.444306073422251E59d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.64780396057959d + "'", double1 == 59.64780396057959d);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 50772059364683248L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0772058E16f + "'", float1 == 5.0772058E16f);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.229687871848033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9698463103929541d, 100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9698463103929542d + "'", double2 == 0.9698463103929542d);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        long long2 = org.apache.commons.math.util.FastMath.max(26L, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        int int1 = org.apache.commons.math.util.FastMath.abs(6061);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6061 + "'", int1 == 6061);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        double double2 = org.apache.commons.math.util.FastMath.min(2.6153708008103522d, (-74.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-74.0d) + "'", double2 == (-74.0d));
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        long long1 = org.apache.commons.math.util.FastMath.round(0.0758711123132111d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9872016611903307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7160847588576873d + "'", double1 == 3.7160847588576873d);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1847163416814828d, 1.2572089825833372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2572089825833372d + "'", double2 == 1.2572089825833372d);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.1685366493835512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1685366493835514d + "'", double1 == 1.1685366493835514d);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0011281692747829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5780308183687116d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4389980055905558d) + "'", double1 == (-0.4389980055905558d));
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32.00000000000001d + "'", double1 == 32.00000000000001d);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.564865991609037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1609826175660287d + "'", double1 == 1.1609826175660287d);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7803343343483228d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-44.70986396730936d) + "'", double1 == (-44.70986396730936d));
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.050922739949144445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2256606743523214d + "'", double1 == 0.2256606743523214d);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.718281827836512d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.635639945965383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986105227635058d + "'", double1 == 0.9986105227635058d);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0419298307345257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2885829000440234d + "'", double1 == 0.2885829000440234d);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5974781997606962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1838634728558128d + "'", double1 == 1.1838634728558128d);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.564865991609037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.66021682275232d + "'", double1 == 89.66021682275232d);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.05687617898814E-7d + "'", double1 == 1.05687617898814E-7d);
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.3227307295361186d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0692714642076024d + "'", double1 == 1.0692714642076024d);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        int int2 = org.apache.commons.math.util.FastMath.max(252318064, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252318064 + "'", int2 == 252318064);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8100372897558831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9442157056960553d + "'", double1 == 0.9442157056960553d);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 18);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.46036359942346083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3368990229972805d) + "'", double1 == (-0.3368990229972805d));
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        int int2 = org.apache.commons.math.util.FastMath.min(208, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 208 + "'", int2 == 208);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.017903805004544807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017903805004544804d) + "'", double1 == (-0.017903805004544804d));
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        int int2 = org.apache.commons.math.util.FastMath.max(26, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.24164608746315416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6228640365404432d + "'", double1 == 0.6228640365404432d);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7853981633974483d + "'", double1 == 0.7853981633974483d);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066E7d + "'", double1 == 3.748066E7d);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.0636613312976665E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.009495245111675741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        double double1 = org.apache.commons.math.util.FastMath.asin(104.06639041664195d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.370663976112529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        long long1 = org.apache.commons.math.util.FastMath.round(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        double double1 = org.apache.commons.math.util.FastMath.sin(42901.69723267188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10774568069837373d + "'", double1 == 0.10774568069837373d);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.607240273008231E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5663183116235424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8273454220921984d) + "'", double1 == (-0.8273454220921984d));
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.357490349840526E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999436362933d + "'", double1 == 0.9999999436362933d);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.5392041709542967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.539204170954297d + "'", double1 == 3.539204170954297d);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999979411810735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414698724214998d + "'", double1 == 0.8414698724214998d);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0000000000000073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017453292519943424d + "'", double1 == 0.017453292519943424d);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999870553092001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.761588719464173d + "'", double1 == 0.761588719464173d);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9469359297167088d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-5.992954145267955E-5d), 4.8384708625565505E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12323286724363772d) + "'", double2 == (-0.12323286724363772d));
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.359304092810529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6168341566328308d + "'", double1 == 1.6168341566328308d);
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7945995197127065d, (-0.5894625297255608d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7945995197127064d + "'", double2 == 0.7945995197127064d);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        double double1 = org.apache.commons.math.util.FastMath.atan((-6.650437639661919d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4215484089964614d) + "'", double1 == (-1.4215484089964614d));
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.741789388563884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.916376166677489d + "'", double1 == 0.916376166677489d);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9474823836948711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4834619689567121d + "'", double1 == 1.4834619689567121d);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        double double1 = org.apache.commons.math.util.FastMath.sinh(16.35257472052315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6321250.05427975d + "'", double1 == 6321250.05427975d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.2503203288452633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.250320328845264d + "'", double1 == 3.250320328845264d);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.004293621779660161d, 0.028099800521022494d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15162623805801723d + "'", double2 == 0.15162623805801723d);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        double double2 = org.apache.commons.math.util.FastMath.min(0.17415508950769856d, 1.0094308805335483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17415508950769856d + "'", double2 == 0.17415508950769856d);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6655995223232382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.077902435287947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0779024352879472d + "'", double1 == 1.0779024352879472d);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44L, (float) 88);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.013588633815877825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3716640093490897E-4d + "'", double1 == 2.3716640093490897E-4d);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 5.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9765625.0d + "'", double2 == 9765625.0d);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6758226352556027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8213843305800421d + "'", double1 == 0.8213843305800421d);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0550944219637926d, 0.5043106036526678d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0550944219637923d + "'", double2 == 1.0550944219637923d);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(44.72931231386507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2562.800816107011d + "'", double1 == 2562.800816107011d);
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.16304220828917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 474.8705346675522d + "'", double1 == 474.8705346675522d);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3582230891800424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3061772933911105d + "'", double1 == 0.3061772933911105d);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8431746481004084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6669488829987684d + "'", double1 == 0.6669488829987684d);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.1204413228389418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7009017030407749d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9179836287841473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.451779620382493d + "'", double1 == 1.451779620382493d);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        double double1 = org.apache.commons.math.util.FastMath.log(0.3438091364081366d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0676686116100613d) + "'", double1 == (-1.0676686116100613d));
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.5231805679783186E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.022985179606481648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3169537828015687d + "'", double1 == 1.3169537828015687d);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24543920176413073d, 1.9225054330000896E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707179976031762d + "'", double2 == 1.5707179976031762d);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7322395414892202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012779990912280517d) + "'", double1 == (-0.012779990912280517d));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.109585842986132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.92148128532129d + "'", double1 == 59.92148128532129d);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2599210498948734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8637242016148625d, 1.956763353344058E80d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.414045265815001E-81d + "'", double2 == 4.414045265815001E-81d);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        int int1 = org.apache.commons.math.util.FastMath.abs(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.3371802492356763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3252087738629967d) + "'", double1 == (-0.3252087738629967d));
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.545676718844663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.817168859688089d) + "'", double1 == (-0.817168859688089d));
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.02693177575907612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026931775759076123d + "'", double1 == 0.026931775759076123d);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        int int2 = org.apache.commons.math.util.FastMath.min(1, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4181620688734913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.1338408776625688d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9910566721356068d + "'", double1 == 0.9910566721356068d);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0403008077402379E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0403008096166385E-4d + "'", double1 == 1.0403008096166385E-4d);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4419694136099652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1621365301056465d + "'", double1 == 1.1621365301056465d);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        long long2 = org.apache.commons.math.util.FastMath.min(23L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.15388751528792635d, 0.9187618740866558d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16595398048800908d + "'", double2 == 0.16595398048800908d);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.262122178163556E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.262122178163556E15d + "'", double1 == 2.262122178163556E15d);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.29295641644784054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2929564164478406d + "'", double1 == 0.2929564164478406d);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.09950371902099903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.701143145758856d + "'", double1 == 5.701143145758856d);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1909689201661917E184d, 0.019234492165425023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3153778949771764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9207751579328988d + "'", double1 == 0.9207751579328988d);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.155849014780759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.342227591314738E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.77974432719921E10d + "'", double1 == 4.77974432719921E10d);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.007385037334679E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.43424333421128425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42163871316334345d + "'", double1 == 0.42163871316334345d);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-29.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5061454830783556d) + "'", double1 == (-0.5061454830783556d));
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7151743879062039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2668250024125176d + "'", double1 == 1.2668250024125176d);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        double double2 = org.apache.commons.math.util.FastMath.min(0.859831647227964d, 0.1526841572751528d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1526841572751528d + "'", double2 == 0.1526841572751528d);
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.1214098374803794E-44d), 0.6047652140543645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.16135810218705E-44d) + "'", double2 == (-5.16135810218705E-44d));
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1462158347805889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5343882110782414d + "'", double1 == 0.5343882110782414d);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7805951733159244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1827710060295713d + "'", double1 == 2.1827710060295713d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6806406458923995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38472079802207915d) + "'", double1 == (-0.38472079802207915d));
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.105413129397948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04352461855154322d + "'", double1 == 0.04352461855154322d);
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9612179885158494d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.7430372525623743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7430372525623743d + "'", double1 == 1.7430372525623743d);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(44.90055070379631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.700787319695822d + "'", double1 == 6.700787319695822d);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        double double1 = org.apache.commons.math.util.FastMath.cos(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7809582065568654d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        double double2 = org.apache.commons.math.util.FastMath.min(14.0d, 1.2570836527843376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2570836527843376d + "'", double2 == 1.2570836527843376d);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.660145060896617E-4d) + "'", double1 == (-4.660145060896617E-4d));
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9511362998119728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.18022785572694996d) + "'", double1 == (-0.18022785572694996d));
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.0042167534122862105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999911095085035d + "'", double1 == 0.9999911095085035d);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5457023351911707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8622926809699383d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6506982637332008d + "'", double1 == 0.6506982637332008d);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.04635312263426354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9989258863528101d + "'", double1 == 0.9989258863528101d);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        int int2 = org.apache.commons.math.util.FastMath.max(31, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5011220152577573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5011220152577572d) + "'", double1 == (-0.5011220152577572d));
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.7020801147004252d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2109306698976214d) + "'", double1 == (-1.2109306698976214d));
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.804421492533036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.2907797382680593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1911245392097096d + "'", double1 == 1.1911245392097096d);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0896545917828711d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08941553074656307d) + "'", double1 == (-0.08941553074656307d));
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.9066329018748125E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        double double1 = org.apache.commons.math.util.FastMath.tanh(99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9028593904094279d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6971708190707435d + "'", double1 == 2.6971708190707435d);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0546210580295705d, (-0.12323286724363772d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9150844419188419d + "'", double2 == 0.9150844419188419d);
    }
}

