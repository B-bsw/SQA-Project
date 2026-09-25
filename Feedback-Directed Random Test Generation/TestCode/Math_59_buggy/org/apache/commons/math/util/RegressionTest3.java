package org.apache.commons.math.util;

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.105427357601002E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000000000007d + "'", double1 == 1.000000000000007d);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.07649802229777113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.647369156657704d + "'", double1 == 1.647369156657704d);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        double double2 = org.apache.commons.math.util.FastMath.atan2(31.0d, 1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5122039064583164d + "'", double2 == 1.5122039064583164d);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030612511435305d + "'", double1 == 0.9030612511435305d);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        int int1 = org.apache.commons.math.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5151928326914723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4757278705561235d + "'", double1 == 0.4757278705561235d);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.5469160326749675E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-7.3975854401035095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-423.85042430535873d) + "'", double1 == (-423.85042430535873d));
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.29577951308234d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        double double1 = org.apache.commons.math.util.FastMath.asinh(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.69310178011491d + "'", double1 == 10.69310178011491d);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1482664472188384d + "'", double1 == 2.1482664472188384d);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4997813562224119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40531933496538397d + "'", double1 == 0.40531933496538397d);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.0889074357665707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36787944117144233d + "'", double1 == 0.36787944117144233d);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.644483341943245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        double double1 = org.apache.commons.math.util.FastMath.tanh(151.2644211956603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        double double2 = org.apache.commons.math.util.FastMath.max(7.105427357601002E-15d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3962634015954634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3962634015954634d + "'", double1 == 1.3962634015954634d);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.18054648615969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1375961717620005d + "'", double1 == 2.1375961717620005d);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        int int1 = org.apache.commons.math.util.FastMath.round(9.7864802E10f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        double double1 = org.apache.commons.math.util.FastMath.expm1(43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.2233720368547451E18d + "'", double1 == 9.2233720368547451E18d);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5440211108893683d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-3.5858845586028694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8660254037844386d + "'", double1 == 0.8660254037844386d);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(21.487562596892644d, 0.01661243639878233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.48756259689264d + "'", double2 == 21.48756259689264d);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682412367938E-6d + "'", double1 == 8.442682412367938E-6d);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8997923511366261d + "'", double2 == 0.8997923511366261d);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.33730966282112745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2863121968974662d) + "'", double1 == (-0.2863121968974662d));
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-4.819341425933092E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8193414259330913E-20d) + "'", double1 == (-4.8193414259330913E-20d));
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3877787807814457E-17d, 0.46749182950293094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9685626425963985E-17d + "'", double2 == 2.9685626425963985E-17d);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(38.45962336030118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3754758794263844d + "'", double1 == 3.3754758794263844d);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        double double2 = org.apache.commons.math.util.FastMath.max(1.647369156657704d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.6250369392251006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5901750099221726d + "'", double1 == 0.5901750099221726d);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        double double1 = org.apache.commons.math.util.FastMath.atanh(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.833373523837084d) + "'", double1 == (-8.833373523837084d));
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.00000000000001d + "'", double2 == 35.00000000000001d);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.3299302472020562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.461748222762d + "'", double1 == 22025.461748222762d);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.1752011936438014d), (-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.2529813614778327d) + "'", double2 == (-2.2529813614778327d));
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.712891454807323d + "'", double1 == 1.712891454807323d);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.61391130652238d + "'", double1 == 0.61391130652238d);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0034360850939669095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1924023244417262d, 572.9577951308232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.358053923774534E-4d + "'", double2 == 3.358053923774534E-4d);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0961179680051676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.802933415151905d + "'", double1 == 62.802933415151905d);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.36787944117144233d, 1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.24600640679997673d + "'", double2 == 0.24600640679997673d);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19438719642597732d) + "'", double1 == (-0.19438719642597732d));
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.19438719642597732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19561370955657775d) + "'", double1 == (-0.19561370955657775d));
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.2204460492503136E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.653559774527022d) + "'", double1 == (-15.653559774527022d));
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8977914424923646d + "'", double1 == 0.8977914424923646d);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.614415338769718E71d + "'", double1 == 6.614415338769718E71d);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3282.8063500117437d + "'", double1 == 3282.8063500117437d);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014686439244896978d) + "'", double1 == (-0.014686439244896978d));
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        double double1 = org.apache.commons.math.util.FastMath.sin(18.964889726830815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11507828243072993d + "'", double1 == 0.11507828243072993d);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2147483647);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.14748365E9f + "'", float1 == 2.14748365E9f);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-3.848501131276805d), 32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.8485011312768047d) + "'", double2 == (-3.8485011312768047d));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5812661035094697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0318224457943772d + "'", double1 == 1.0318224457943772d);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        long long1 = org.apache.commons.math.util.FastMath.abs(52L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 52L + "'", long1 == 52L);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        double double1 = org.apache.commons.math.util.FastMath.log(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.306852819440053d + "'", double1 == 25.306852819440053d);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.12911222262740002d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172625d + "'", double1 == 0.19240232444172625d);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.08510319447875853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08489862787744332d) + "'", double1 == (-0.08489862787744332d));
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.144549764063218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8430650369670094d) + "'", double1 == (-0.8430650369670094d));
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5430735359421353d, 1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5430735359421353d + "'", double2 == 1.5430735359421353d);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 'a', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        double double2 = org.apache.commons.math.util.FastMath.pow(1261966.2318521822d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03490658503988659d + "'", double1 == 0.03490658503988659d);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8373005113295966E-4d + "'", double1 == 4.8373005113295966E-4d);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        double double1 = org.apache.commons.math.util.FastMath.exp((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7646088003705097E-39d + "'", double1 == 1.7646088003705097E-39d);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.8813735870195429d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999999999999d) + "'", double1 == (-0.9999999999999999d));
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7853981633974483d, 0.1900795435532183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3333452696210846d + "'", double2 == 1.3333452696210846d);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1900628023411102d, 0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.19006280234111023d + "'", double2 == 0.19006280234111023d);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.7092603658226646d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5422326689561365d + "'", double1 == 1.5422326689561365d);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 35);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5988224392024553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.536211111061281d + "'", double1 == 0.536211111061281d);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931471805599453d + "'", double1 == 0.6931471805599453d);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9698463103929541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.748636741546022d + "'", double1 == 0.748636741546022d);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.1606074732651916d, 2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.037623954904806E-44d + "'", double2 == 8.037623954904806E-44d);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        double double1 = org.apache.commons.math.util.FastMath.log(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.653397151028901d + "'", double1 == 8.653397151028901d);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97864804714L, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1569245455535437d + "'", double1 == 1.1569245455535437d);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1037080495808624d + "'", double1 == 1.1037080495808624d);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        double double1 = org.apache.commons.math.util.FastMath.sin(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9536075631471675d) + "'", double1 == (-0.9536075631471675d));
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-8.41133756602909E-22d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.41133756602909E-22d) + "'", double1 == (-8.41133756602909E-22d));
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.16227766016838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '#', 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8569259205417066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.154359865434033d + "'", double1 == 1.154359865434033d);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        long long2 = org.apache.commons.math.util.FastMath.min(38L, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.4762966926573635d), 1.4371344463413933d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.748066027288565E7d, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2567610122556662E-9d + "'", double2 == 1.2567610122556662E-9d);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999999954430011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.295779251985515d + "'", double1 == 57.295779251985515d);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025673200539316265d + "'", double1 == 0.025673200539316265d);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.8384708625565505E-4d + "'", double1 == 4.8384708625565505E-4d);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.2857111204210793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2857111204210793d + "'", double1 == 0.2857111204210793d);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14336970329182389d) + "'", double1 == (-0.14336970329182389d));
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        double double1 = org.apache.commons.math.util.FastMath.log(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7929422793014347d) + "'", double1 == (-1.7929422793014347d));
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-57.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1787535542062797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2503203288452633d + "'", double1 == 3.2503203288452633d);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-220.50287227348372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.848501131276805d) + "'", double1 == (-3.848501131276805d));
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.082762530298217d + "'", double1 == 11.082762530298217d);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        double double1 = org.apache.commons.math.util.FastMath.sinh(14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.9999996033d + "'", double1 == 1261966.9999996033d);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-1L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.1500253585642916d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.860686150383241d + "'", double1 == 0.860686150383241d);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028092407000022617d + "'", double1 == 0.028092407000022617d);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.860686150383241d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06515518537002861d) + "'", double1 == (-0.06515518537002861d));
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.1797945711178876d), 0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9478899016727291d + "'", double2 == 0.9478899016727291d);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5412326235096074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.150076871218412d + "'", double1 == 1.150076871218412d);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.402744338107512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.402744338107514d + "'", double1 == 9.402744338107514d);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1559057424196283d) + "'", double1 == (-0.1559057424196283d));
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.956763353344058E80d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42012681275810204d + "'", double1 == 0.42012681275810204d);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8988587803407233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1171584131235877d + "'", double1 == 1.1171584131235877d);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47627435869419515d) + "'", double1 == (-0.47627435869419515d));
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.46500741642797333d, 25.306852819440053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.841104430236654E-9d + "'", double2 == 3.841104430236654E-9d);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.331941588598159d + "'", double1 == 2.331941588598159d);
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9293779356001103d, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9293779356001103d + "'", double2 == 0.9293779356001103d);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        double double2 = org.apache.commons.math.util.FastMath.min(0.984807753012208d, 0.9293779356001103d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9293779356001103d + "'", double2 == 0.9293779356001103d);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9459101490553132d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.90625327736449d + "'", double1 == 53.90625327736449d);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.9225054335922256E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000192252391384d + "'", double1 == 1.0000192252391384d);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.529835379788728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02670066439081122d) + "'", double1 == (-0.02670066439081122d));
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        int int1 = org.apache.commons.math.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.06424358004527628d), 1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.042800856867951736d) + "'", double2 == (-0.042800856867951736d));
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        float float2 = org.apache.commons.math.util.FastMath.max(32.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.156119580207157E36d, 6283429.00742421d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.156119580207155E36d + "'", double2 == 6.156119580207155E36d);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5316667212195025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.922505433236944E-5d + "'", double1 == 1.922505433236944E-5d);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(630983.1159256954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 794.344456722457d + "'", double1 == 794.344456722457d);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.583398179910364d + "'", double1 == 0.583398179910364d);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.4751129460689736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9158465150847866d) + "'", double1 == (-0.9158465150847866d));
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0438252985430079d + "'", double1 == 1.0438252985430079d);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        int int1 = org.apache.commons.math.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 145L, 1.2184249125858766d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.99999999999997d + "'", double2 == 144.99999999999997d);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.618990892446662d + "'", double1 == 0.618990892446662d);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.2723414711850413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3873669366539792d) + "'", double1 == (-0.3873669366539792d));
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8660254037844386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6238107163648714d + "'", double1 == 0.6238107163648714d);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        long long1 = org.apache.commons.math.util.FastMath.abs(35L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9478899016727291d, (-0.4078300410496931d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9771057199762778d + "'", double2 == 1.9771057199762778d);
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9272995150405832d + "'", double1 == 0.9272995150405832d);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.376727508058575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        double double2 = org.apache.commons.math.util.FastMath.min(1.000000000000007d, (-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6150317436149153d) + "'", double2 == (-0.6150317436149153d));
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6784102379846987d + "'", double1 == 0.6784102379846987d);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6108652381980153d + "'", double1 == 0.6108652381980153d);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707008595346152d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-36.7368005696771d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 573L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5978220919084257d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        double double1 = org.apache.commons.math.util.FastMath.cos(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9036922050915037d) + "'", double1 == (-0.9036922050915037d));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        double double1 = org.apache.commons.math.util.FastMath.sin(169.42101997711706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22309009934914975d) + "'", double1 == (-0.22309009934914975d));
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.38398225238984507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3746156955164151d) + "'", double1 == (-0.3746156955164151d));
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8739552914536586E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8739552914536586E-31d + "'", double1 == 1.8739552914536586E-31d);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.04749646746707085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04640300046199763d + "'", double1 == 0.04640300046199763d);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0159090561693984d + "'", double1 == 1.0159090561693984d);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.03994949099270701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.8199681505512405E-18d, 36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.82276518977207E-20d + "'", double2 == 7.82276518977207E-20d);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9207813824870029d + "'", double1 == 0.9207813824870029d);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6250369392251006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550048170562257d + "'", double1 == 0.8550048170562257d);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2937272068925049d + "'", double1 == 0.2937272068925049d);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5707963267948966d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        long long1 = org.apache.commons.math.util.FastMath.abs(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.30264054181560024d, 0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3026405418156002d + "'", double2 == 0.3026405418156002d);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(19.34620097980911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.346200979809115d + "'", double1 == 19.346200979809115d);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.36637843919405666d) + "'", double1 == (-0.36637843919405666d));
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 1, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.00000000000001d + "'", double1 == 38.00000000000001d);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 573L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8210429626092037d + "'", double1 == 2.8210429626092037d);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5729.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.98991284675515d + "'", double1 == 99.98991284675515d);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3877277521741615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3276676988791267d + "'", double1 == 0.3276676988791267d);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5403057526408277d, 1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5403057526408277d + "'", double2 == 0.5403057526408277d);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        double double2 = org.apache.commons.math.util.FastMath.max(0.3276676988791267d, 573.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 573.0d + "'", double2 == 573.0d);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.34668423136158d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.2503203288452633d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        double double1 = org.apache.commons.math.util.FastMath.log(1.322916371343518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2798386717543342d + "'", double1 == 0.2798386717543342d);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2261911708835171d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.8055865251572774E26d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-36.736800569677094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2104.8636254562957d) + "'", double1 == (-2104.8636254562957d));
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9818490617583829d + "'", double1 == 0.9818490617583829d);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6750559827141311d + "'", double1 == 0.6750559827141311d);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.82679529269723d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2172043679489204d + "'", double1 == 1.2172043679489204d);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8622957433108482d + "'", double1 == 1.8622957433108482d);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013669380586024594d + "'", double1 == 0.013669380586024594d);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        double double2 = org.apache.commons.math.util.FastMath.min(1.577721810442024E-30d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.577721810442024E-30d + "'", double2 == 1.577721810442024E-30d);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        float float2 = org.apache.commons.math.util.FastMath.max(573.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.296722144923343d + "'", double1 == 8.296722144923343d);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.806217383937352E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383955855E-6d + "'", double1 == 4.806217383955855E-6d);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        double double2 = org.apache.commons.math.util.FastMath.min(1.0159090561693984d, (double) 7L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0159090561693984d + "'", double2 == 1.0159090561693984d);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 38.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2963685787093853d + "'", double1 == 0.2963685787093853d);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-423.85042430535873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.954844600830958E183d + "'", double1 == 5.954844600830958E183d);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267884728309446d + "'", double1 == 5.267884728309446d);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.15082891211336d + "'", double1 == 2.15082891211336d);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8550048170562257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8550048170562258d + "'", double1 == 0.8550048170562258d);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.345153194998874d) + "'", double1 == (-8.345153194998874d));
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9642258512973702d) + "'", double1 == (-0.9642258512973702d));
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.06424358004527628d), 2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.026785246294635624d) + "'", double2 == (-0.026785246294635624d));
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4023976994865663d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.058283143422131d + "'", double1 == 1.058283143422131d);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9877735581754346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6870151974084779d + "'", double1 == 0.6870151974084779d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0470934242082532d + "'", double1 == 1.0470934242082532d);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0398314119215128d + "'", double1 == 1.0398314119215128d);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7897808285809945E73d + "'", double1 == 3.7897808285809945E73d);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        double double1 = org.apache.commons.math.util.FastMath.rint((-8.345153194998874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.0d) + "'", double1 == (-8.0d));
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.0554544523933395E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.055454452467354E-6d + "'", double1 == 6.055454452467354E-6d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        double double2 = org.apache.commons.math.util.FastMath.max(104.06639041664197d, (-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.06639041664197d + "'", double2 == 104.06639041664197d);
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        double double2 = org.apache.commons.math.util.FastMath.min(0.006767125876795721d, 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.006767125876795721d + "'", double2 == 0.006767125876795721d);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8595318579974747d + "'", double1 == 0.8595318579974747d);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.355372716651809E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17814068151824805d + "'", double1 == 0.17814068151824805d);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        double double2 = org.apache.commons.math.util.FastMath.max(1.818446459232067d, (-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.818446459232067d + "'", double2 == 1.818446459232067d);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.442682412367938E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        long long2 = org.apache.commons.math.util.FastMath.max(38L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.7974777282436d + "'", double1 == 47.7974777282436d);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.444667861009766d + "'", double1 == 1.444667861009766d);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(7.89629601826797E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8886110.520507816d + "'", double1 == 8886110.520507816d);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.548739357257746d + "'", double1 == 11.548739357257746d);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1416876847493498d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        double double1 = org.apache.commons.math.util.FastMath.tan(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.053272382793105d) + "'", double1 == (-6.053272382793105d));
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        double double1 = org.apache.commons.math.util.FastMath.asin(3265.8594322456925d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.7453292519943293d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8430650369670094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6651773355037965d + "'", double1 == 0.6651773355037965d);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 573L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 573 + "'", int1 == 573);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.267831587699267d, 1.1252750800637434d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.267831587699266d + "'", double2 == 5.267831587699266d);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.52587890625E-5d + "'", double1 == 1.52587890625E-5d);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2184249125858766d, 1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7418061661440577d + "'", double2 == 0.7418061661440577d);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1569245455535437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1569245455535437d + "'", double1 == 1.1569245455535437d);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0162571141467134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.762834413413614d + "'", double1 == 1.762834413413614d);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8073347732655894d + "'", double1 == 0.8073347732655894d);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        int int1 = org.apache.commons.math.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9918043161804359d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.746594273122733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0805490483952224d, 0.16765036534441544d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6555421614583431d + "'", double2 == 0.6555421614583431d);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4142135623730951d + "'", double1 == 1.4142135623730951d);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        double double2 = org.apache.commons.math.util.FastMath.max(4.957234655978706E136d, 0.04747861148694368d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.957234655978706E136d + "'", double2 == 4.957234655978706E136d);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018267969E13d + "'", double1 == 7.896296018267969E13d);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017136498885300926d + "'", double1 == 0.017136498885300926d);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2110908904786682E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835568321545E-5d + "'", double1 == 1.2110835568321545E-5d);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.7811284620871498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9914968516113685d) + "'", double1 == (-0.9914968516113685d));
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.902641160672524d), 9.261725192512572E-19d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.902641160672524d) + "'", double2 == (-0.902641160672524d));
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.023205328672353965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02320741180622532d + "'", double1 == 0.02320741180622532d);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5071221992618504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.467699925813914d) + "'", double1 == (-0.467699925813914d));
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 1, 3.8104768396174693d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.24600640679997673d, (-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.14147577836676d + "'", double2 == 3.14147577836676d);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.735436873328441d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3414179241869126d + "'", double1 == 0.3414179241869126d);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8418176412695313d) + "'", double1 == (-1.8418176412695313d));
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1155899177076452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0429318112613317d + "'", double1 == 2.0429318112613317d);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.017136498885300926d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015704339111595068d + "'", double1 == 0.015704339111595068d);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 573.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9425345992440989d + "'", double1 == 0.9425345992440989d);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(171.88733853924697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.110581167104948d + "'", double1 == 13.110581167104948d);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9996157480444497d, 0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9996157480449777d + "'", double2 == 0.9996157480449777d);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        int int2 = org.apache.commons.math.util.FastMath.max(26, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.000044650487358d, 1261966.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000446504873581d + "'", double2 == 1.0000446504873581d);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(6.614415338769718E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7897808285809945E73d + "'", double1 == 3.7897808285809945E73d);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015625d, 1.8184464592320673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008592287884538353d + "'", double2 == 0.008592287884538353d);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        long long2 = org.apache.commons.math.util.FastMath.min(10L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.07579834219123135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0758711123132111d + "'", double1 == 0.0758711123132111d);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        float float2 = org.apache.commons.math.util.FastMath.min((-1.0f), 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.088887490341627E-14d + "'", double1 == 5.088887490341627E-14d);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7370529091738743d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1488093008679707d + "'", double1 == 1.1488093008679707d);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.205145470084797d + "'", double1 == 1.205145470084797d);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        double double1 = org.apache.commons.math.util.FastMath.log10(9.999999995520374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998054523d + "'", double1 == 0.9999999998054523d);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16646964819512283d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        long long1 = org.apache.commons.math.util.FastMath.round(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        double double1 = org.apache.commons.math.util.FastMath.floor(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.653878486731224d + "'", double1 == 1.653878486731224d);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.1375961717620005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.479030977575487d + "'", double1 == 8.479030977575487d);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5403057526408277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.615620091065296d) + "'", double1 == (-0.615620091065296d));
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        double double1 = org.apache.commons.math.util.FastMath.cos(10.206709210579758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7095540048557133d) + "'", double1 == (-0.7095540048557133d));
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.954844600830958E183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9513433746520442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9835107230884862d) + "'", double1 == (-0.9835107230884862d));
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4997813562224119d, 22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4997813562224119d + "'", double2 == 0.4997813562224119d);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0318224457943772d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        long long1 = org.apache.commons.math.util.FastMath.round(0.025673200539316265d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.030312139532567103d + "'", double1 == 0.030312139532567103d);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        double double1 = org.apache.commons.math.util.FastMath.signum(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        double double1 = org.apache.commons.math.util.FastMath.cosh(9.402744338107514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6060.800489722827d + "'", double1 == 6060.800489722827d);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        double double2 = org.apache.commons.math.util.FastMath.max(0.17814068151824805d, 43.66827237527655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 43.66827237527655d + "'", double2 == 43.66827237527655d);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        double double1 = org.apache.commons.math.util.FastMath.cos(22025.461748222762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9702957262762539d) + "'", double1 == (-0.9702957262762539d));
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.806217383955855E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383937352E-6d + "'", double1 == 4.806217383937352E-6d);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.653397151028901d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999995419658d + "'", double1 == 0.9999999995419658d);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.9685626425963985E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9685626425963985E-17d + "'", double1 == 2.9685626425963985E-17d);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.448317288402091d + "'", double1 == 1.448317288402091d);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003358054049998483d + "'", double1 == 0.003358054049998483d);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-7.3975854401035095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.9484831895170822d) + "'", double1 == (-1.9484831895170822d));
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.2679097686563057d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        int int1 = org.apache.commons.math.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97864804714L, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9030612511435305d, 62.802933415151905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0016554297339535329d + "'", double2 == 0.0016554297339535329d);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        double double1 = org.apache.commons.math.util.FastMath.asinh(18.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.635639945965383d + "'", double1 == 3.635639945965383d);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4080069217490346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.503817570181902d + "'", double1 == 1.503817570181902d);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7615941542245016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        double double1 = org.apache.commons.math.util.FastMath.log10(51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.716003343634799d + "'", double1 == 1.716003343634799d);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-2.3012989023072947d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571830862563444E-4d) + "'", double1 == (-1.6571830862563444E-4d));
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9155040003582885E22d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07579834219123135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07594384022318276d + "'", double1 == 0.07594384022318276d);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6150317436149153d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.14317511632530183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0024988771868024017d + "'", double1 == 0.0024988771868024017d);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        int int2 = org.apache.commons.math.util.FastMath.max(145, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.402744338107514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9369645424212623d + "'", double1 == 2.9369645424212623d);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8184464592320668d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.01153673179946589d, 4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.140655263641914E-9d + "'", double2 == 1.140655263641914E-9d);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.7543545188936296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9259555601603967d) + "'", double1 == (-0.9259555601603967d));
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        double double1 = org.apache.commons.math.util.FastMath.expm1(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20948.590341753694d + "'", double1 == 20948.590341753694d);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5712556729872559d) + "'", double1 == (-0.5712556729872559d));
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        double double1 = org.apache.commons.math.util.FastMath.abs((-423.85042430535873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 423.85042430535873d + "'", double1 == 423.85042430535873d);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.378163642308943E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.378163642309E12d + "'", double1 == 1.378163642309E12d);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.922505433236944E-5d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6150317436149153d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.938893903907228E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9861758970260069d + "'", double1 == 0.9861758970260069d);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.0d, 1.3299302472020562d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 573);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 573.0f + "'", float1 == 573.0f);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2567610122556662E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2567610122556662E-9d + "'", double1 == 1.2567610122556662E-9d);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.00944988413518589d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999553501771875d + "'", double1 == 0.9999553501771875d);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.023205328672353965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02347666707911227d + "'", double1 == 0.02347666707911227d);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.029464112608972946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.058283143422131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.881784197001252E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        double double1 = org.apache.commons.math.util.FastMath.tanh(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.536211111061281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        double double1 = org.apache.commons.math.util.FastMath.tan(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.693388459081093d) + "'", double1 == (-5.693388459081093d));
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.605170185988092d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998037827419103d + "'", double1 == 0.9998037827419103d);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.5858845586028694d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9984652528042448d) + "'", double1 == (-0.9984652528042448d));
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        double double1 = org.apache.commons.math.util.FastMath.ceil(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.0d + "'", double1 == 8.0d);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999958776927d + "'", double2 == 0.9999999958776927d);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15527491979894661d) + "'", double1 == (-0.15527491979894661d));
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29153046097456287d + "'", double1 == 0.29153046097456287d);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.11507828243072993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11482578710300392d + "'", double1 == 0.11482578710300392d);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9344065786069821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016308471348987046d + "'", double1 == 0.016308471348987046d);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5901750099221726d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2567610122556662E-9d, (-0.36637843919405666d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.36637843919405666d) + "'", double2 == (-0.36637843919405666d));
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36019649632180123d + "'", double1 == 0.36019649632180123d);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.293054868705138d + "'", double1 == 14.293054868705138d);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.12911222262740002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9916765892091398d + "'", double1 == 0.9916765892091398d);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992606284658041d + "'", double1 == 0.9992606284658041d);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        long long1 = org.apache.commons.math.util.FastMath.round(0.01153673179946589d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964138d) + "'", double1 == (-0.9251475365964138d));
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        double double2 = org.apache.commons.math.util.FastMath.pow((-4.8193414259330926E-20d), 6.156119580207157E36d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        double double1 = org.apache.commons.math.util.FastMath.atan(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707055250154314d + "'", double1 == 1.5707055250154314d);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        double double1 = org.apache.commons.math.util.FastMath.cos(6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7183274194704676d + "'", double1 == 0.7183274194704676d);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.009494959585376654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9905499752128979d + "'", double1 == 0.9905499752128979d);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2700305245105663d, (-3.5858845586028694d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.5858845586028694d) + "'", double2 == (-3.5858845586028694d));
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12311456005264212d) + "'", double1 == (-0.12311456005264212d));
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2855617141854978d + "'", double1 == 0.2855617141854978d);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.1797945711178876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8354418176629007d + "'", double1 == 0.8354418176629007d);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3104642473694204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.864392833312451d + "'", double1 == 0.864392833312451d);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025678843658570077d + "'", double1 == 0.025678843658570077d);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 2.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        int int2 = org.apache.commons.math.util.FastMath.min(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3032833236333146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7048627526623752d + "'", double1 == 1.7048627526623752d);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5707008595346152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        double double1 = org.apache.commons.math.util.FastMath.sin((-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6795226183513794d) + "'", double1 == (-0.6795226183513794d));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        int int1 = org.apache.commons.math.util.FastMath.round(2.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.140655263641914E-9d + "'", double1 == 1.140655263641914E-9d);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        double double1 = org.apache.commons.math.util.FastMath.abs((-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2104.8636254562957d + "'", double1 == 2104.8636254562957d);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 8L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9030899869919435d + "'", double1 == 0.9030899869919435d);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1649569776443817d + "'", double1 == 0.1649569776443817d);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.398057842737113E-7d, (-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0034306568216736E25d + "'", double2 == 3.0034306568216736E25d);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0162571141467134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1800736247033484d + "'", double1 == 0.1800736247033484d);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.025678843658570077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5451146601807795d + "'", double1 == 1.5451146601807795d);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.1606074732651916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3299302472020562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3299302472020562d + "'", double1 == 1.3299302472020562d);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.786480471441939E10d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8622957433108482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6218099972365794d + "'", double1 == 0.6218099972365794d);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.08510319447875853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0852062581427079d) + "'", double1 == (-0.0852062581427079d));
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        double double2 = org.apache.commons.math.util.FastMath.min(4.1577059034868376E-10d, 0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.1577059034868376E-10d + "'", double2 == 4.1577059034868376E-10d);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.4751129460689736d), 4.8384708625565505E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5706008419460695d) + "'", double2 == (-1.5706008419460695d));
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.4078300410496931d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9179836287841473d + "'", double1 == 0.9179836287841473d);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9293779356001103d, 1.5632046291841053d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5632046291841053d + "'", double2 == 1.5632046291841053d);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.42012681275810204d, 0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4201312898382078d + "'", double2 == 0.4201312898382078d);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        long long1 = org.apache.commons.math.util.FastMath.abs(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.08510319447875853d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.07649802229777113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07642343372489104d) + "'", double1 == (-0.07642343372489104d));
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 97864804714L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.6929693744344998d, 1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6929693744344996d + "'", double2 == 1.6929693744344996d);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.189442356607096E26d + "'", double1 == 2.189442356607096E26d);
    }
}

