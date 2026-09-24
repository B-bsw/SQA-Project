package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

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
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.930380657631324E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.930380657631324E-32d + "'", double1 == 4.930380657631324E-32d);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999092042625951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.00126983485097483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.001269834509710858d + "'", double1 == 0.001269834509710858d);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6045293842815553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6491749416975924d + "'", double1 == 0.6491749416975924d);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        long long1 = org.apache.commons.math.util.FastMath.round(31.53667995284064d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.04746078367790618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.6698068255943352d), 57.29577951308234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.029135380124996127d) + "'", double2 == (-0.029135380124996127d));
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        double double1 = org.apache.commons.math.util.FastMath.sinh(315.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.174912815396022E136d + "'", double1 == 3.174912815396022E136d);
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1216780097738317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8426853067671305d + "'", double1 == 0.8426853067671305d);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        double double1 = org.apache.commons.math.util.FastMath.exp(36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.524244356327113E15d + "'", double1 == 4.524244356327113E15d);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        long long2 = org.apache.commons.math.util.FastMath.min(46L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        int int2 = org.apache.commons.math.util.FastMath.min(573, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        double double1 = org.apache.commons.math.util.FastMath.asin(17.889566311799566d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.7923701627780075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5670251038185632d + "'", double1 == 1.5670251038185632d);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.0300863255517117E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.4174499913463825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.621581484926361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8618702344270952d + "'", double1 == 1.8618702344270952d);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        float float2 = org.apache.commons.math.util.FastMath.max(38.0f, (float) 208L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 208.0f + "'", float2 == 208.0f);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.0749608557100309d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07510157693911161d) + "'", double1 == (-0.07510157693911161d));
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9735500688063772d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016991654133688625d) + "'", double1 == (-0.016991654133688625d));
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.01900502000357532d), 0.5934084662501166d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01900502000357532d) + "'", double2 == (-0.01900502000357532d));
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.058283143422131d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0582831434221311d + "'", double1 == 1.0582831434221311d);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8373174648948869d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-2.3042456820170427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9802630286812348d) + "'", double1 == (-0.9802630286812348d));
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.6881171418161346E43d, 1.5475826624438378d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6242806060379504E67d + "'", double2 == 1.6242806060379504E67d);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7766609160650203d), (-0.2328937172877614d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2328937172877614d) + "'", double2 == (-0.2328937172877614d));
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9879690512915179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8349098942032968d + "'", double1 == 0.8349098942032968d);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9465441391652027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 22025.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261939.543775638d + "'", double1 == 1261939.543775638d);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9207813824870029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9595735419898794d + "'", double1 == 0.9595735419898794d);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        long long1 = org.apache.commons.math.util.FastMath.round(0.015840768241279675d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6524071371928835d, (-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6524071371928835d + "'", double2 == 0.6524071371928835d);
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        float float2 = org.apache.commons.math.util.FastMath.max(2.0f, 26.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.028961339866994493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028961339866994496d + "'", double1 == 0.028961339866994496d);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5043106036526678d, 0.9717320044784656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5043106036526678d + "'", double2 == 0.5043106036526678d);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.2437769052498596d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5526261428708923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8837010719759295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837010719759295d + "'", double1 == 0.8837010719759295d);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7804798859761342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1825193746721485d + "'", double1 == 2.1825193746721485d);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        double double1 = org.apache.commons.math.util.FastMath.tan(70.35280798945955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8909236456318963d + "'", double1 == 2.8909236456318963d);
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.1269280110429727d, 0.04174073658303252d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1269280110429722d + "'", double2 == 2.1269280110429722d);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5683959703542163d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7989443678098986d + "'", double1 == 3.7989443678098986d);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.810422597041198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 218.321132971739d + "'", double1 == 218.321132971739d);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.006625404912081631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081632d + "'", double1 == 0.006625404912081632d);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8810723403798068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.380540940558829d + "'", double1 == 1.380540940558829d);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8575660368838224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9260486147518511d + "'", double1 == 0.9260486147518511d);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        double double2 = org.apache.commons.math.util.FastMath.min(0.29764544631017087d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        double double1 = org.apache.commons.math.util.FastMath.exp((-2.641656889827791d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07124312969415512d + "'", double1 == 0.07124312969415512d);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8287400822951458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26215198385453153d + "'", double1 == 0.26215198385453153d);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 18, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.18142406551130624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0031664472855261836d) + "'", double1 == (-0.0031664472855261836d));
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5081249405686994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852843599720181d + "'", double1 == 0.9852843599720181d);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.26215198385453153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26516499257446363d + "'", double1 == 0.26516499257446363d);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.015910541093645102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.015911883857260598d) + "'", double1 == (-0.015911883857260598d));
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9798783713774953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.490566333382995d + "'", double1 == 1.490566333382995d);
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.030950552935740366d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9601793548609198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04063518399030403d) + "'", double1 == (-0.04063518399030403d));
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        double double1 = org.apache.commons.math.util.FastMath.expm1(75.78518007393176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.186259664464608E32d + "'", double1 == 8.186259664464608E32d);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9717320044784656d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.041740736583032526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041728616900550596d + "'", double1 == 0.041728616900550596d);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.509815340662585E104d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2798386717543342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24673403229618204d + "'", double1 == 0.24673403229618204d);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.2224467810154835d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.1456832649894027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4245927561907135d + "'", double1 == 1.4245927561907135d);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, (float) 23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.0717314035742076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.9062942889558228d + "'", double1 == 3.9062942889558228d);
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0913152249309966E92d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8889596028910255d + "'", double1 == 0.8889596028910255d);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        long long2 = org.apache.commons.math.util.FastMath.max(252318064L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.010703413224816612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.8690202903623525E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9035232576164774d) + "'", double1 == (-0.9035232576164774d));
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        double double2 = org.apache.commons.math.util.FastMath.pow(38.0d, (-56.52959697507491d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.959866365929982E-90d + "'", double2 == 4.959866365929982E-90d);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 2147483647L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        long long2 = org.apache.commons.math.util.FastMath.max(97864804714L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1473848885767544d + "'", double1 == 1.1473848885767544d);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.01180198365287145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011801709677987715d + "'", double1 == 0.011801709677987715d);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.07124312969415512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07136390839423627d + "'", double1 == 0.07136390839423627d);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        double double2 = org.apache.commons.math.util.FastMath.min(0.027181157926883755d, 0.4336110861910444d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027181157926883755d + "'", double2 == 0.027181157926883755d);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        double double1 = org.apache.commons.math.util.FastMath.log(3.2262449532373516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1713189077681307d + "'", double1 == 1.1713189077681307d);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.016070666815463455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016069975143818162d + "'", double1 == 0.016069975143818162d);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.999997042092267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573975923329688d + "'", double1 == 1.5573975923329688d);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        double double1 = org.apache.commons.math.util.FastMath.log(0.781270733495882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24683353940894648d) + "'", double1 == (-0.24683353940894648d));
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        long long1 = org.apache.commons.math.util.FastMath.round((-15.653559774527022d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-16L) + "'", long1 == (-16L));
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.2661160398544486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8527414880617079d + "'", double1 == 0.8527414880617079d);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9999999450748849d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981359348899d) + "'", double1 == (-0.7853981359348899d));
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.026036584087129624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02603070304668768d + "'", double1 == 0.02603070304668768d);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.24427299786223713d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24676990807251953d + "'", double1 == 0.24676990807251953d);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5343797471700231d + "'", double1 == 0.5343797471700231d);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3374L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3374.0f + "'", float1 == 3374.0f);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7330383821741316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9016588263401231d) + "'", double1 == (-0.9016588263401231d));
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.2960262299781737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0461462579250012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8466596604383154d + "'", double1 == 1.8466596604383154d);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        long long2 = org.apache.commons.math.util.FastMath.max(252318064L, (long) 65);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8773171306729552d, 0.9024010197259666d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7713047923326367d + "'", double2 == 0.7713047923326367d);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.5243548967072383E-29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5243548967072383E-29d + "'", double1 == 2.5243548967072383E-29d);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        double double2 = org.apache.commons.math.util.FastMath.min(6.051737164167091d, 6.051737164167091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.051737164167091d + "'", double2 == 6.051737164167091d);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.2864655896856925d, (-0.5397294065638794d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5261458087742223d + "'", double2 == 0.5261458087742223d);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        double double2 = org.apache.commons.math.util.FastMath.max(0.893485813313701d, 0.5492647745304893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.893485813313701d + "'", double2 == 0.893485813313701d);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1372082089452704d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4389879213057085d, 3.100617174256311E53d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.415808197640525E-54d + "'", double2 == 1.415808197640525E-54d);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5662191695169762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        int int2 = org.apache.commons.math.util.FastMath.max(65, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.07627516821128054d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.8257883656009093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9153412831308465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4490037322231597d + "'", double1 == 1.4490037322231597d);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3640562262110947d, (-0.014686439244896978d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3640562262110945d + "'", double2 == 1.3640562262110945d);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.762860921275018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6294764138281497d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6375556246283297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2102168652335425d + "'", double1 == 1.2102168652335425d);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.792585752632344E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024067791241890776d + "'", double1 == 0.024067791241890776d);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.0020024162435120616d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        double double2 = org.apache.commons.math.util.FastMath.min(0.833262585529406d, (double) (-16L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-16.0d) + "'", double2 == (-16.0d));
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.21565069657906166d, 0.9922768665593191d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.21400134153032543d + "'", double2 == 0.21400134153032543d);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0607262979269563d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9236684042710187d + "'", double1 == 0.9236684042710187d);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1839177489147017d, (-3.5861404610918224d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8227215283343727d + "'", double2 == 2.8227215283343727d);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.6655995223232382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6655995223232382d + "'", double1 == 0.6655995223232382d);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.027708598556821545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.836062759298851E-4d + "'", double1 == 4.836062759298851E-4d);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.42206715285396d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5251109367966196d + "'", double1 == 0.5251109367966196d);
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0003758147439736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003758147439739d + "'", double1 == 1.0003758147439739d);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5675655160966668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2520245668902295d + "'", double1 == 1.2520245668902295d);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 65, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65L + "'", long2 == 65L);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2426208133067402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9867717342662448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.986771734266245d + "'", double1 == 1.986771734266245d);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7202126291763723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0548700895303318d + "'", double1 == 1.0548700895303318d);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.487119795718273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.950813074779872d + "'", double1 == 0.950813074779872d);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.001194862670967d), 794.344456722457d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 794.344456722457d + "'", double2 == 794.344456722457d);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.27085111057860184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0369049501594014d + "'", double1 == 1.0369049501594014d);
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.815532388198284d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.690281376701678d) + "'", double1 == (-1.690281376701678d));
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.06595527560643515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06590755031564108d + "'", double1 == 0.06590755031564108d);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8192337173071639d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7306228408137826d + "'", double1 == 0.7306228408137826d);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.197664423181249E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.197664419213603E-5d + "'", double1 == 6.197664419213603E-5d);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8308557776153688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3582230891800424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3436479236011068d + "'", double1 == 0.3436479236011068d);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.18006177305525128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1820465308549501d + "'", double1 == 0.1820465308549501d);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        double double1 = org.apache.commons.math.util.FastMath.expm1(104.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4676622301554424E45d + "'", double1 == 1.4676622301554424E45d);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.2538792427651392d), 1.5293379817722996d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.41200782328131d + "'", double1 == 88.41200782328131d);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.21511909301433413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003754536457004064d + "'", double1 == 0.003754536457004064d);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(59356.76276403235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1035.9709435575346d + "'", double1 == 1035.9709435575346d);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 24, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4419694136099652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1297578026909818d + "'", double1 == 1.1297578026909818d);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0103661992710218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.746606636224771d + "'", double1 == 2.746606636224771d);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3131479741286372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9669918681861681d + "'", double1 == 0.9669918681861681d);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.051646920459275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31210262267268785d + "'", double1 == 0.31210262267268785d);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0177774980683254E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5544559615876794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2467782327213126d + "'", double1 == 1.2467782327213126d);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8430650369670094d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 573, (float) 208);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 208.0f + "'", float2 == 208.0f);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.2654676519986654d), 0.8651477187829238d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.583398179910364d, (-1.5883129417272057d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7895836861378647d + "'", double2 == 2.7895836861378647d);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        int int1 = org.apache.commons.math.util.FastMath.round(24.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 23, (long) 24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        int int2 = org.apache.commons.math.util.FastMath.min((-5), 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7462862861846525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7342152287352455d + "'", double1 == 0.7342152287352455d);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1020552221563014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8012360466706263d + "'", double1 == 0.8012360466706263d);
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3827395580671282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8815632447267399d + "'", double1 == 0.8815632447267399d);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        double double2 = org.apache.commons.math.util.FastMath.max(1.003884821853522d, 0.18299100867441095d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.003884821853522d + "'", double2 == 1.003884821853522d);
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        double double1 = org.apache.commons.math.util.FastMath.log10(82.84379293103548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9182599744718911d + "'", double1 == 1.9182599744718911d);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.105413129397948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.02678524629463562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026782043566295294d) + "'", double1 == (-0.026782043566295294d));
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.763865462982212E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0034360783325109324d), 0.22882280821594225d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        int int2 = org.apache.commons.math.util.FastMath.max(57, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1811276859692628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.25804618504925d + "'", double1 == 2.25804618504925d);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 573, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8902596696356354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9965698249672023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6914306205971281d + "'", double1 == 0.6914306205971281d);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        double double1 = org.apache.commons.math.util.FastMath.sin(6061.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7628898667367525d) + "'", double1 == (-0.7628898667367525d));
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 31, (long) 65);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65L + "'", long2 == 65L);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0000000000000004d + "'", double1 == 2.0000000000000004d);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.760373407405197d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6501071001720865d) + "'", double1 == (-0.6501071001720865d));
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.19561370955657775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.19688321050870175d) + "'", double1 == (-0.19688321050870175d));
    }

    @Test
    public void test13687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13687");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1909689201661917E184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13688");
        long long2 = org.apache.commons.math.util.FastMath.max((long) ' ', (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test13689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13689");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3266.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.836748221334597d + "'", double1 == 14.836748221334597d);
    }

    @Test
    public void test13690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13690");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5496974318194474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5496974318194474d + "'", double1 == 1.5496974318194474d);
    }

    @Test
    public void test13691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13691");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test13692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13692");
        long long2 = org.apache.commons.math.util.FastMath.min(2405171239L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13693");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9999999999816658d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13694");
        int int2 = org.apache.commons.math.util.FastMath.max(8, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test13695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13695");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0013299769888426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8823137101470458d + "'", double1 == 0.8823137101470458d);
    }

    @Test
    public void test13696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13696");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.019473243773419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.77173435102943d + "'", double1 == 1.77173435102943d);
    }

    @Test
    public void test13697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13697");
        double double1 = org.apache.commons.math.util.FastMath.log(3.7592634247064667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.324223040526895d + "'", double1 == 1.324223040526895d);
    }

    @Test
    public void test13698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13698");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5670251038185632d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.792370162778007d + "'", double1 == 3.792370162778007d);
    }

    @Test
    public void test13699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13699");
        double double1 = org.apache.commons.math.util.FastMath.log(1.8107709146380932E94d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 217.03675141572953d + "'", double1 == 217.03675141572953d);
    }

    @Test
    public void test13700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13700");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.14352199719731384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14254460059501362d) + "'", double1 == (-0.14254460059501362d));
    }

    @Test
    public void test13701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13701");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.475112946068973d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9158465150847866d) + "'", double1 == (-0.9158465150847866d));
    }

    @Test
    public void test13702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13702");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(17.89400457879299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.615587067541882d + "'", double1 == 2.615587067541882d);
    }

    @Test
    public void test13703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13703");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8535188133012066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5740864183640747d) + "'", double1 == (-0.5740864183640747d));
    }

    @Test
    public void test13704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13704");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0972885351119612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.3300741270311587d) + "'", double1 == (-2.3300741270311587d));
    }

    @Test
    public void test13705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13705");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.31048985231669685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3208677058068467d + "'", double1 == 0.3208677058068467d);
    }

    @Test
    public void test13706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13706");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9835107230884862d), (-0.7952403142819212d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9835107230884862d) + "'", double2 == (-0.9835107230884862d));
    }

    @Test
    public void test13707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13707");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.354182541534335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07599482158262891d + "'", double1 == 0.07599482158262891d);
    }

    @Test
    public void test13708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13708");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7L, 2105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test13709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13709");
        float float1 = org.apache.commons.math.util.FastMath.abs((-7.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test13710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13710");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 9.223372E18f, 0.6478711240834688d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test13711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13711");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.07579817506743834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9971286934481787d + "'", double1 == 0.9971286934481787d);
    }

    @Test
    public void test13712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13712");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9459101490553132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test13713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13713");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2722218725854067E-14d + "'", double1 == 1.2722218725854067E-14d);
    }

    @Test
    public void test13714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13714");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5225789835263854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1504293251526032d + "'", double1 == 1.1504293251526032d);
    }

    @Test
    public void test13715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13715");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5664744974827294d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13716");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test13717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13717");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-23.84345739187178d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1366.1294775542583d) + "'", double1 == (-1366.1294775542583d));
    }

    @Test
    public void test13718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13718");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6478711240834688d, 1.0037477761736835d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5731714658543642d + "'", double2 == 0.5731714658543642d);
    }

    @Test
    public void test13719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13719");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.20615494521474886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20330671077725107d) + "'", double1 == (-0.20330671077725107d));
    }

    @Test
    public void test13720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13720");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.257020034487148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.738787638592477d + "'", double1 == 1.738787638592477d);
    }

    @Test
    public void test13721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13721");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test13722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13722");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, 14.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test13723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13723");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 17765.729914390176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13724");
        long long1 = org.apache.commons.math.util.FastMath.round(0.997937090867597d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13725");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19077079376318204d + "'", double1 == 0.19077079376318204d);
    }

    @Test
    public void test13726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13726");
        double double2 = org.apache.commons.math.util.FastMath.min(0.551407059902704d, 0.026744865808352235d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026744865808352235d + "'", double2 == 0.026744865808352235d);
    }

    @Test
    public void test13727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13727");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9189765263380592d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7949811624747668d + "'", double1 == 0.7949811624747668d);
    }

    @Test
    public void test13728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13728");
        int int2 = org.apache.commons.math.util.FastMath.max(21, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test13729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13729");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13730");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.395778272734467d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.038116105652526d + "'", double1 == 3.038116105652526d);
    }

    @Test
    public void test13731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13731");
        double double1 = org.apache.commons.math.util.FastMath.sinh(8.486449227395259E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.486450246049546E-4d + "'", double1 == 8.486450246049546E-4d);
    }

    @Test
    public void test13732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13732");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.042800856867951736d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13733");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6865874069331717d, 1.1488093008679707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6492241324306856d + "'", double2 == 0.6492241324306856d);
    }

    @Test
    public void test13734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13734");
        double double1 = org.apache.commons.math.util.FastMath.sin(14.18616053088712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988000541376995d + "'", double1 == 0.9988000541376995d);
    }

    @Test
    public void test13735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13735");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test13736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13736");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.04751433553952635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0011290184240431d + "'", double1 == 1.0011290184240431d);
    }

    @Test
    public void test13737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13737");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5164470423549196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47671850254073067d + "'", double1 == 0.47671850254073067d);
    }

    @Test
    public void test13738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13738");
        double double2 = org.apache.commons.math.util.FastMath.min(7.338311150777212E44d, 0.9986502386334037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9986502386334037d + "'", double2 == 0.9986502386334037d);
    }

    @Test
    public void test13739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13739");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4901161193847656E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000149011612d + "'", double1 == 1.0000000149011612d);
    }

    @Test
    public void test13740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13740");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2689810367809309d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13741");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11482578710300394d + "'", double1 == 0.11482578710300394d);
    }

    @Test
    public void test13742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13742");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.07136390839423627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13743");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5680722294658567d, 0.40508603762258366d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.40508603762258366d + "'", double2 == 0.40508603762258366d);
    }

    @Test
    public void test13744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13744");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8817482115299875d), 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.00881725361211956d) + "'", double2 == (-0.00881725361211956d));
    }

    @Test
    public void test13745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13745");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9580038272343695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7639529884526898d) + "'", double1 == (-0.7639529884526898d));
    }

    @Test
    public void test13746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13746");
        double double1 = org.apache.commons.math.util.FastMath.expm1(84.71050998855853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.156119580207122E36d + "'", double1 == 6.156119580207122E36d);
    }

    @Test
    public void test13747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13747");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test13748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13748");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0029388786388205d, (-0.9536075631474413d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3309863659136356d + "'", double2 == 2.3309863659136356d);
    }

    @Test
    public void test13749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13749");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5043106036526678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13750");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9932472940606253d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0029426094350859045d) + "'", double1 == (-0.0029426094350859045d));
    }

    @Test
    public void test13751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13751");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.39320825252632513d, 1.7765227797066595E55d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2133589111154087E-56d + "'", double2 == 2.2133589111154087E-56d);
    }

    @Test
    public void test13752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13752");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1553001298352472d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test13753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13753");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5485130342067743d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6162519564619863d + "'", double1 == 0.6162519564619863d);
    }

    @Test
    public void test13754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13754");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999400722542864d, 59.05873643248951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999400722542864d + "'", double2 == 0.9999400722542864d);
    }

    @Test
    public void test13755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13755");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 208, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test13756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13756");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7811284620871497d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13757");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7289664090565792d), 1.567596525075122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.567596525075122d + "'", double2 == 1.567596525075122d);
    }

    @Test
    public void test13758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13758");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.542519758633026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5734337731020339d + "'", double1 == 0.5734337731020339d);
    }

    @Test
    public void test13759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13759");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test13760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13760");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.10612853218660119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13761");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8681090589666719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7004121176122478d + "'", double1 == 0.7004121176122478d);
    }

    @Test
    public void test13762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13762");
        float float2 = org.apache.commons.math.util.FastMath.max(23.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test13763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13763");
        int int1 = org.apache.commons.math.util.FastMath.abs(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test13764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13764");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.003436071571126802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.997076225033722E-5d) + "'", double1 == (-5.997076225033722E-5d));
    }

    @Test
    public void test13765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13765");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.259554979423884d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22860520401337178d) + "'", double1 == (-0.22860520401337178d));
    }

    @Test
    public void test13766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13766");
        int int2 = org.apache.commons.math.util.FastMath.max(18, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test13767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13767");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.7182706940374595d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6487178940126352d + "'", double1 == 1.6487178940126352d);
    }

    @Test
    public void test13768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13768");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.441116808177853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test13769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13769");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.206498704176892E-40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13770");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9182599744718911d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13771");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.016991654133688625d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01699001916101003d) + "'", double1 == (-0.01699001916101003d));
    }

    @Test
    public void test13772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13772");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.16571020934276787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13773");
        long long1 = org.apache.commons.math.util.FastMath.abs(3374L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3374L + "'", long1 == 3374L);
    }

    @Test
    public void test13774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13774");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999999997666853d, (-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999997666853d + "'", double2 == 0.9999999997666853d);
    }

    @Test
    public void test13775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13775");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7852261405049433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996560133851694d + "'", double1 == 0.9996560133851694d);
    }

    @Test
    public void test13776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13776");
        int int2 = org.apache.commons.math.util.FastMath.max(24, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test13777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13777");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7658368273288395d + "'", double1 == 0.7658368273288395d);
    }

    @Test
    public void test13778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13778");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.08025398413321812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0014006962609679438d + "'", double1 == 0.0014006962609679438d);
    }

    @Test
    public void test13779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13779");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.05480166132497733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1399039042265118d + "'", double1 == 3.1399039042265118d);
    }

    @Test
    public void test13780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13780");
        float float2 = org.apache.commons.math.util.FastMath.max(21.0f, 2.4051712E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test13781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13781");
        double double2 = org.apache.commons.math.util.FastMath.min(1.297413204526123d, 0.0850051845495627d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0850051845495627d + "'", double2 == 0.0850051845495627d);
    }

    @Test
    public void test13782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13782");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999911095085035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414661812215855d + "'", double1 == 0.8414661812215855d);
    }

    @Test
    public void test13783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13783");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9911334539817277d, 2.3445697418011234E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9911334539817276d + "'", double2 == 0.9911334539817276d);
    }

    @Test
    public void test13784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13784");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.083420426905528d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9391481366191295d + "'", double1 == 0.9391481366191295d);
    }

    @Test
    public void test13785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13785");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.619290194948025E-13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13786");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test13787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13787");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4340375802095812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4086900422710444d + "'", double1 == 0.4086900422710444d);
    }

    @Test
    public void test13788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13788");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.163752983493265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16523253613971078d + "'", double1 == 0.16523253613971078d);
    }

    @Test
    public void test13789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13789");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.03098397132677646d), 5.878549459101058E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5688990417943884d) + "'", double2 == (-1.5688990417943884d));
    }

    @Test
    public void test13790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13790");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0004032192265475d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test13791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13791");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7611197186420408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.60894758237362d + "'", double1 == 43.60894758237362d);
    }

    @Test
    public void test13792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13792");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 7);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test13793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13793");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.10196489714181856d), 1.5689800629322823d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10196489714181854d) + "'", double2 == (-0.10196489714181854d));
    }

    @Test
    public void test13794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13794");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.998222949887785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7315377413986057d + "'", double1 == 1.7315377413986057d);
    }

    @Test
    public void test13795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13795");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.557254786481422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13796");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.653397151028901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.455745113549518d + "'", double1 == 1.455745113549518d);
    }

    @Test
    public void test13797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13797");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.072012182577236d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13798");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.6604007228000892d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13799");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9973625536928628d, 0.5144053249353481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9973625536928626d + "'", double2 == 0.9973625536928626d);
    }

    @Test
    public void test13800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13800");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.810355649229662d, 0.20798594268384546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3863831305398955d + "'", double2 == 1.3863831305398955d);
    }

    @Test
    public void test13801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13801");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5734337731020339d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5459114848171533d + "'", double1 == 0.5459114848171533d);
    }

    @Test
    public void test13802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13802");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0237158576051484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13803");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.041740736583032526d, 3.3580540499984855E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04174073658303252d + "'", double2 == 0.04174073658303252d);
    }

    @Test
    public void test13804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13804");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.501928515588587d, (-0.5978220919084255d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5779662355417141d + "'", double2 == 0.5779662355417141d);
    }

    @Test
    public void test13805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13805");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.154374381457872d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13806");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 14, 3374L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3374L + "'", long2 == 3374L);
    }

    @Test
    public void test13807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13807");
        double double1 = org.apache.commons.math.util.FastMath.log(5.509815340662585E104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241.17538078049262d + "'", double1 == 241.17538078049262d);
    }

    @Test
    public void test13808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13808");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, 208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 208 + "'", int2 == 208);
    }

    @Test
    public void test13809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13809");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.359872902206369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9359415893964486d + "'", double1 == 0.9359415893964486d);
    }

    @Test
    public void test13810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13810");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.3588589435717465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.006263270115555517d) + "'", double1 == (-0.006263270115555517d));
    }

    @Test
    public void test13811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13811");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9878624697502397d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017241452654024568d) + "'", double1 == (-0.017241452654024568d));
    }

    @Test
    public void test13812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13812");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.00014339808637d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8415484544727652d + "'", double1 == 0.8415484544727652d);
    }

    @Test
    public void test13813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13813");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9915365662477135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.695372911082545d + "'", double1 == 2.695372911082545d);
    }

    @Test
    public void test13814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13814");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.036389649528461486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13815");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test13816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13816");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8212947882963074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13817");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.017761615041548273d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.017761615041548273d) + "'", double2 == (-0.017761615041548273d));
    }

    @Test
    public void test13818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13818");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6589866960716184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5062069919305946d + "'", double1 == 0.5062069919305946d);
    }

    @Test
    public void test13819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13819");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.013563338773585676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999908019330765d + "'", double1 == 0.999908019330765d);
    }

    @Test
    public void test13820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13820");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1975820906580308E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.049291091004647604d + "'", double1 == 0.049291091004647604d);
    }

    @Test
    public void test13821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13821");
        double double1 = org.apache.commons.math.util.FastMath.rint((-59.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-59.0d) + "'", double1 == (-59.0d));
    }

    @Test
    public void test13822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13822");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2032742454744652d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13823");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0L, 208.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 208.0f + "'", float2 == 208.0f);
    }

    @Test
    public void test13824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13824");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7611197186420408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.140671829196306d + "'", double1 == 1.140671829196306d);
    }

    @Test
    public void test13825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13825");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5572742824180026d) + "'", double1 == (-1.5572742824180026d));
    }

    @Test
    public void test13826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13826");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 1.4626719456900756d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4626719456900756d + "'", double2 == 1.4626719456900756d);
    }

    @Test
    public void test13827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13827");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.19688321050870175d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13828");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.1500253585642916d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test13829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13829");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0562782347418378d, 3.357490349840526E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0562782347418376d + "'", double2 == 1.0562782347418376d);
    }

    @Test
    public void test13830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13830");
        int int2 = org.apache.commons.math.util.FastMath.max(23, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test13831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13831");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.6622771995498022d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13832");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.070242962723665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.022886531639843d + "'", double1 == 1.022886531639843d);
    }

    @Test
    public void test13833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13833");
        double double1 = org.apache.commons.math.util.FastMath.ulp(117.61174253155805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test13834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13834");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4464331883887016d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13835");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2979L, 8.479030977575487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5679500669490418d + "'", double2 == 1.5679500669490418d);
    }

    @Test
    public void test13836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13836");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7806737720297889d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8624226607908212d + "'", double1 == 0.8624226607908212d);
    }

    @Test
    public void test13837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13837");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.5356779950985695d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13838");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.2692488706763693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13839");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2378432659522425d, 0.04640300046199763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2378432659522423d + "'", double2 == 1.2378432659522423d);
    }

    @Test
    public void test13840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13840");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6603469013500041d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13841");
        int int2 = org.apache.commons.math.util.FastMath.min(65, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test13842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13842");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.3026663907504371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29390122575948957d + "'", double1 == 0.29390122575948957d);
    }

    @Test
    public void test13843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13843");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test13844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13844");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.89324023572096E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 221206.69600446004d + "'", double1 == 221206.69600446004d);
    }

    @Test
    public void test13845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13845");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707947732546232d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13846");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.174912815396022E136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13847");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5975638469446122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6893493469573421d + "'", double1 == 0.6893493469573421d);
    }

    @Test
    public void test13848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13848");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-3.5376893133346528d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13849");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test13850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13850");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9999983369439447d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813724110608399d) + "'", double1 == (-0.8813724110608399d));
    }

    @Test
    public void test13851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13851");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5990573688262014E224d, (-4.716132424155146d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5990573688262012E224d + "'", double2 == 1.5990573688262012E224d);
    }

    @Test
    public void test13852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13852");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 14, (float) (-16L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-16.0f) + "'", float2 == (-16.0f));
    }

    @Test
    public void test13853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13853");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.150076871218412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13854");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.021525633917275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1114170668649481d + "'", double1 == 1.1114170668649481d);
    }

    @Test
    public void test13855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13855");
        long long2 = org.apache.commons.math.util.FastMath.min(65L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test13856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13856");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02741500344259761d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.562011695244624d) + "'", double1 == (-1.562011695244624d));
    }

    @Test
    public void test13857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13857");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.19688321050870175d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5817497797686035d) + "'", double1 == (-0.5817497797686035d));
    }

    @Test
    public void test13858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13858");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.07493107731902326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0748611350583797d + "'", double1 == 0.0748611350583797d);
    }

    @Test
    public void test13859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13859");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.3684785197548404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36061183000283104d + "'", double1 == 0.36061183000283104d);
    }

    @Test
    public void test13860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13860");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test13861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13861");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.3746156955164151d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7208783618547572d) + "'", double1 == (-0.7208783618547572d));
    }

    @Test
    public void test13862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13862");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.016308471348987046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016442180342043495d + "'", double1 == 0.016442180342043495d);
    }

    @Test
    public void test13863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13863");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 208, 26.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test13864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13864");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8964711396507173d), 45.17197351819585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8964711396507172d) + "'", double2 == (-0.8964711396507172d));
    }

    @Test
    public void test13865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13865");
        int int2 = org.apache.commons.math.util.FastMath.min(23, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test13866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13866");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.653770797665783d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2771418599758875d + "'", double1 == 1.2771418599758875d);
    }

    @Test
    public void test13867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13867");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 7, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test13868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13868");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7615941559557708d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13869");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9996701716352728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.35496019923568d + "'", double1 == 4.35496019923568d);
    }

    @Test
    public void test13870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13870");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test13871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13871");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9420512808597249d), (-0.9802630286812348d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.942051280859725d) + "'", double2 == (-0.942051280859725d));
    }

    @Test
    public void test13872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13872");
        int int2 = org.apache.commons.math.util.FastMath.max((-5), 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test13873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13873");
        long long2 = org.apache.commons.math.util.FastMath.max(208L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 208L + "'", long2 == 208L);
    }

    @Test
    public void test13874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13874");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.47627435869419515d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13875");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.31210262267268785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13876");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7868568775134381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7223722721408069d + "'", double1 == 0.7223722721408069d);
    }

    @Test
    public void test13877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13877");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4281826694961574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4045633056695769d) + "'", double1 == (-0.4045633056695769d));
    }

    @Test
    public void test13878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13878");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-371.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.640836539336446E160d) + "'", double1 == (-6.640836539336446E160d));
    }

    @Test
    public void test13879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13879");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7918857299241612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7116792708049968d + "'", double1 == 0.7116792708049968d);
    }

    @Test
    public void test13880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13880");
        int int2 = org.apache.commons.math.util.FastMath.max(38, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test13881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13881");
        double double2 = org.apache.commons.math.util.FastMath.max(22.46077005725419d, 0.050922739949144445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.46077005725419d + "'", double2 == 22.46077005725419d);
    }

    @Test
    public void test13882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13882");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 14, (long) 252318064);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test13883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13883");
        long long2 = org.apache.commons.math.util.FastMath.max(44L, 88L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 88L + "'", long2 == 88L);
    }

    @Test
    public void test13884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13884");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.8882806409156938d), 1.9885908398396104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8882806409156936d) + "'", double2 == (-1.8882806409156936d));
    }

    @Test
    public void test13885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13885");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.0852062581427079d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9963721424696249d + "'", double1 == 0.9963721424696249d);
    }

    @Test
    public void test13886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13886");
        long long1 = org.apache.commons.math.util.FastMath.round(5768.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5768L + "'", long1 == 5768L);
    }

    @Test
    public void test13887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13887");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.3588589435717465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3755755624704016d) + "'", double1 == (-0.3755755624704016d));
    }

    @Test
    public void test13888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13888");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5604771509986111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.748650219393951d + "'", double1 == 0.748650219393951d);
    }

    @Test
    public void test13889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13889");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.06705672030612886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9977525404815092d + "'", double1 == 0.9977525404815092d);
    }

    @Test
    public void test13890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13890");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.8872709503576206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.944271909999156d + "'", double1 == 16.944271909999156d);
    }

    @Test
    public void test13891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13891");
        long long1 = org.apache.commons.math.util.FastMath.round(0.005462207545959866d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13892");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0980197632589186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test13893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13893");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5680729590898163d), 0.42013128983820774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9340021159882501d) + "'", double2 == (-0.9340021159882501d));
    }

    @Test
    public void test13894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13894");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.18299100867441095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16804598452308128d + "'", double1 == 0.16804598452308128d);
    }

    @Test
    public void test13895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13895");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9927738000811871d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9927738000811871d + "'", double1 == 0.9927738000811871d);
    }

    @Test
    public void test13896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13896");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707963267936305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780781674d + "'", double1 == 0.027415567780781674d);
    }

    @Test
    public void test13897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13897");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 6061);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13898");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.597500164801286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1689976475697947d + "'", double1 == 1.1689976475697947d);
    }

    @Test
    public void test13899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13899");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test13900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13900");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-221.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-221.0d) + "'", double1 == (-221.0d));
    }

    @Test
    public void test13901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13901");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8918357513053619d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13902");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.3918892688709152d, 0.9911334539817276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.391889268870915d + "'", double2 == 2.391889268870915d);
    }

    @Test
    public void test13903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13903");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.2456957589636597d), 0.1457584666761651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1457584666761651d + "'", double2 == 0.1457584666761651d);
    }

    @Test
    public void test13904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13904");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.017904761458085616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test13905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13905");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0692714642076024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7891865864731453d + "'", double1 == 0.7891865864731453d);
    }

    @Test
    public void test13906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13906");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7615941559421474d + "'", double1 == 0.7615941559421474d);
    }

    @Test
    public void test13907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13907");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1703428488012644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7666790173998574d + "'", double1 == 1.7666790173998574d);
    }

    @Test
    public void test13908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13908");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.673617379884035E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13909");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7237368423548132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6720041159903701d + "'", double1 == 0.6720041159903701d);
    }

    @Test
    public void test13910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13910");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3026663907504371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.26441323370363023d + "'", double1 == 0.26441323370363023d);
    }

    @Test
    public void test13911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13911");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999076759361661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813083025411189d + "'", double1 == 0.8813083025411189d);
    }

    @Test
    public void test13912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13912");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8622926809699384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3022165377537542d) + "'", double1 == (-1.3022165377537542d));
    }

    @Test
    public void test13913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13913");
        double double1 = org.apache.commons.math.util.FastMath.exp(263.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6574816940096004E114d + "'", double1 == 1.6574816940096004E114d);
    }

    @Test
    public void test13914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13914");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.19006280234111014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19006280234111014d + "'", double1 == 0.19006280234111014d);
    }

    @Test
    public void test13915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13915");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.15154075835169306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16362572830982952d + "'", double1 == 0.16362572830982952d);
    }

    @Test
    public void test13916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13916");
        long long1 = org.apache.commons.math.util.FastMath.round(2.695372911082545d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test13917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13917");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7564949900863757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7272462299567566d + "'", double1 == 0.7272462299567566d);
    }

    @Test
    public void test13918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13918");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2691520328233756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2691520328233759d + "'", double1 == 1.2691520328233759d);
    }

    @Test
    public void test13919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13919");
        long long1 = org.apache.commons.math.util.FastMath.round(21.000000000000004d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test13920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13920");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13921");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test13922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13922");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.8273454220921984d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test13923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13923");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.016562936007208623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016562936007208626d + "'", double1 == 0.016562936007208626d);
    }

    @Test
    public void test13924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13924");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9306198831066714d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test13925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13925");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5554713240230669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9146837372689862d + "'", double1 == 0.9146837372689862d);
    }

    @Test
    public void test13926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13926");
        double double1 = org.apache.commons.math.util.FastMath.log(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-10.859296216322308d) + "'", double1 == (-10.859296216322308d));
    }

    @Test
    public void test13927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13927");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.270383403460351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5510301680268407d + "'", double1 == 0.5510301680268407d);
    }

    @Test
    public void test13928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13928");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.16985734991186185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13929");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1745329251274851d + "'", double1 == 0.1745329251274851d);
    }

    @Test
    public void test13930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13930");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9763608754884532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5600411350491531d + "'", double1 == 0.5600411350491531d);
    }

    @Test
    public void test13931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13931");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5419478974309992E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test13932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13932");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(35.35507978448085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.35507978448086d + "'", double1 == 35.35507978448086d);
    }

    @Test
    public void test13933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13933");
        long long2 = org.apache.commons.math.util.FastMath.max(2105L, 46L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test13934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13934");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.9793520787205557d), 5.0772059364683248E16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9289193524456238E-17d) + "'", double2 == (-1.9289193524456238E-17d));
    }

    @Test
    public void test13935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13935");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.15082891211336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8364447919366048d + "'", double1 == 0.8364447919366048d);
    }

    @Test
    public void test13936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13936");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6893493469573421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6360352339522728d + "'", double1 == 0.6360352339522728d);
    }

    @Test
    public void test13937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13937");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9925405320054786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007487428961978244d) + "'", double1 == (-0.007487428961978244d));
    }

    @Test
    public void test13938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13938");
        long long1 = org.apache.commons.math.util.FastMath.round(0.006766867647289856d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test13939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13939");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1363181080686976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1354830165635017d + "'", double1 == 0.1354830165635017d);
    }

    @Test
    public void test13940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13940");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5990573688262012E224d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.599057368826201E224d + "'", double2 == 1.599057368826201E224d);
    }

    @Test
    public void test13941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13941");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.01144710155690362d), (-3.7635528157399536d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.011447101556903622d) + "'", double2 == (-0.011447101556903622d));
    }

    @Test
    public void test13942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13942");
        double double1 = org.apache.commons.math.util.FastMath.rint(97.11079348211254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test13943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13943");
        long long1 = org.apache.commons.math.util.FastMath.round(1.596082767675576d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test13944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13944");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1591745389548616d) + "'", double1 == (-0.1591745389548616d));
    }

    @Test
    public void test13945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13945");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.9484831895170822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9484831895170824d + "'", double1 == 1.9484831895170824d);
    }

    @Test
    public void test13946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13946");
        long long2 = org.apache.commons.math.util.FastMath.max(23L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test13947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13947");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 31, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test13948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13948");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.377731627086182d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7221706706422825d) + "'", double1 == (-0.7221706706422825d));
    }

    @Test
    public void test13949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13949");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.479140461416069d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13950");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.18950492734531413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.857832533819803d + "'", double1 == 10.857832533819803d);
    }

    @Test
    public void test13951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13951");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9963896316913787d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5388477733051724d + "'", double1 == 1.5388477733051724d);
    }

    @Test
    public void test13952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13952");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.580009162762818E-23d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.580009162762818E-23d + "'", double1 == 9.580009162762818E-23d);
    }

    @Test
    public void test13953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13953");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.08285510467138392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13954");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test13955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13955");
        float float2 = org.apache.commons.math.util.FastMath.max(5.0772058E16f, 31.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test13956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13956");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.017466184278427548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017619610027530368d + "'", double1 == 0.017619610027530368d);
    }

    @Test
    public void test13957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13957");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0386389304106265d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13958");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.169084941497005E58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.169084941497005E58d + "'", double1 == 9.169084941497005E58d);
    }

    @Test
    public void test13959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13959");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5825073257289527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5825073257289528d + "'", double1 == 0.5825073257289528d);
    }

    @Test
    public void test13960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13960");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7925622793797507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13961");
        double double1 = org.apache.commons.math.util.FastMath.log(100.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test13962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13962");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.09364907698670265d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13963");
        double double2 = org.apache.commons.math.util.FastMath.pow(14.636198082366448d, 1.6725680697682985d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 88.9729778315723d + "'", double2 == 88.9729778315723d);
    }

    @Test
    public void test13964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13964");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.255946955090421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13965");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.8793838227939d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13966");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0770250738285216d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7920932836288949d + "'", double1 == 0.7920932836288949d);
    }

    @Test
    public void test13967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13967");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.00126983485097483d, (-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1297341463161503d + "'", double2 == 3.1297341463161503d);
    }

    @Test
    public void test13968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13968");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5569432209472811d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5315552789771771d + "'", double1 == 0.5315552789771771d);
    }

    @Test
    public void test13969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13969");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9822165519059916d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13970");
        long long2 = org.apache.commons.math.util.FastMath.max(65L, (long) 252318064);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test13971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13971");
        float float2 = org.apache.commons.math.util.FastMath.min(6061.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test13972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13972");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.25609884107417175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13973");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.185039863261519d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test13974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13974");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.14436016288910875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.524584902892576d) + "'", double1 == (-0.524584902892576d));
    }

    @Test
    public void test13975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13975");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9702957262762539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2443460952781419d + "'", double1 == 0.2443460952781419d);
    }

    @Test
    public void test13976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13976");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-1.945282190337118d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test13977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13977");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.292445036602649d), 9.772019376909056E-90d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test13978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13978");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test13979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13979");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9391481366191295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06278205223889706d) + "'", double1 == (-0.06278205223889706d));
    }

    @Test
    public void test13980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13980");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.998618223088628d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13981");
        double double1 = org.apache.commons.math.util.FastMath.log10(2105.1256720540036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.323278027511558d + "'", double1 == 3.323278027511558d);
    }

    @Test
    public void test13982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13982");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6914306205971281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test13983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13983");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0548700895303318d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.871602078493953d + "'", double1 == 2.871602078493953d);
    }

    @Test
    public void test13984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13984");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.42012681275810204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1372112673411252d + "'", double1 == 1.1372112673411252d);
    }

    @Test
    public void test13985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13985");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.109099920787457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8585796301765078d + "'", double1 == 0.8585796301765078d);
    }

    @Test
    public void test13986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13986");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6801446119583209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test13987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13987");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test13988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13988");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.638420522237698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5343739035971846d + "'", double1 == 1.5343739035971846d);
    }

    @Test
    public void test13989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13989");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.129949619977457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5044378506438314d + "'", double1 == 0.5044378506438314d);
    }

    @Test
    public void test13990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13990");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7740456749600707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6587135725289204d + "'", double1 == 0.6587135725289204d);
    }

    @Test
    public void test13991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13991");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4435566798304896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test13992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13992");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715691434453942d + "'", double1 == 0.027715691434453942d);
    }

    @Test
    public void test13993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13993");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.07890198156137432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test13994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13994");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4624424875899187d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46244248758991874d + "'", double1 == 0.46244248758991874d);
    }

    @Test
    public void test13995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13995");
        long long1 = org.apache.commons.math.util.FastMath.round(16384.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16384L + "'", long1 == 16384L);
    }

    @Test
    public void test13996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13996");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8541673877839715d + "'", double1 == 0.8541673877839715d);
    }

    @Test
    public void test13997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13997");
        float float2 = org.apache.commons.math.util.FastMath.max(2.4051712E9f, (float) 46L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test13998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13998");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4901161193847656E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161082825355E-8d + "'", double1 == 1.4901161082825355E-8d);
    }

    @Test
    public void test13999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13999");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267948457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232274785475086d + "'", double1 == 1.0232274785475086d);
    }

    @Test
    public void test14000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test14000");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26L, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }
}

