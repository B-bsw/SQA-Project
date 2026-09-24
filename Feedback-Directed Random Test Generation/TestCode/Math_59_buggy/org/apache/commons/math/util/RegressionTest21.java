package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.8373005113295966E-4d, 6738.656468237557d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9486832980505138d, (-0.467699925813914d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9486832980505138d + "'", double2 == 0.9486832980505138d);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        double double2 = org.apache.commons.math.util.FastMath.min(0.49321676688550387d, (-0.5063656411097465d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5063656411097465d) + "'", double2 == (-0.5063656411097465d));
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        double double1 = org.apache.commons.math.util.FastMath.log(5.65685424949238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7328679513998633d + "'", double1 == 1.7328679513998633d);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.89629601826797E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9958397769281062d + "'", double1 == 0.9958397769281062d);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        double double1 = org.apache.commons.math.util.FastMath.log10(48.6229776074638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.686841550946937d + "'", double1 == 1.686841550946937d);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.786480471441939E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4608.315216893515d + "'", double1 == 4608.315216893515d);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0475836473520026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8086329085929951d + "'", double1 == 0.8086329085929951d);
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9382343789067358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9382343789067358d + "'", double1 == 0.9382343789067358d);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6535598729692599d + "'", double1 == 0.6535598729692599d);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        double double2 = org.apache.commons.math.util.FastMath.max(0.17259828953034054d, 1.2982333069391765d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2982333069391765d + "'", double2 == 1.2982333069391765d);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(22.597055569270644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8271614989766833d + "'", double1 == 2.8271614989766833d);
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        double double1 = org.apache.commons.math.util.FastMath.log(1.4043181929877973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.339551913108391d + "'", double1 == 0.339551913108391d);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.6402833035492551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9999999999999746d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5707961012994098d) + "'", double1 == (-1.5707961012994098d));
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43424333421128425d + "'", double1 == 0.43424333421128425d);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        long long2 = org.apache.commons.math.util.FastMath.min(22025L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        double double1 = org.apache.commons.math.util.FastMath.sin(64.40158451054796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999994330067817d + "'", double1 == 0.9999994330067817d);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02372538120370837d, 0.00495749420004732d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.023725381203708366d + "'", double2 == 0.023725381203708366d);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3374L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7144972908707885d, 2.850754361071198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7144972908707885d + "'", double2 == 0.7144972908707885d);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9893960285726507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1589041769344135d + "'", double1 == 1.1589041769344135d);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9922768665593191d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1633187061821186d + "'", double1 == 1.1633187061821186d);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2681114372998328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23752873645929662d + "'", double1 == 0.23752873645929662d);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 5);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.408834622494818E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.408834618959393E-10d + "'", double1 == 8.408834618959393E-10d);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-8.415543885269349d), 6060.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0013887027187277023d) + "'", double2 == (-0.0013887027187277023d));
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        int int2 = org.apache.commons.math.util.FastMath.min(6061, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.65292812185E-312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.470580522036E-311d + "'", double1 == 9.470580522036E-311d);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3643135933151023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.860487744432721d + "'", double1 == 0.860487744432721d);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        int int1 = org.apache.commons.math.util.FastMath.abs(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707956194563126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624471770240332d + "'", double1 == 1.1624471770240332d);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        int int2 = org.apache.commons.math.util.FastMath.min(7, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9992606284658041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992606284658042d + "'", double1 == 0.9992606284658042d);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.355437224494686E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3554372244946866E-7d + "'", double1 == 3.3554372244946866E-7d);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.026697492810876286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026691151684922913d) + "'", double1 == (-0.026691151684922913d));
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1644937984762475d, 0.2725138805025834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6114907143230294d + "'", double2 == 0.6114907143230294d);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        double double1 = org.apache.commons.math.util.FastMath.sin(7.842041095903772E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.44502728797681357d) + "'", double1 == (-0.44502728797681357d));
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.5392041709542967d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9219884848112342d) + "'", double1 == (-0.9219884848112342d));
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8428599996679665E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.864392833312451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9761286101774449d + "'", double1 == 0.9761286101774449d);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.09507068650612024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.447149092212036d + "'", double1 == 5.447149092212036d);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7085012011516139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0309449983266528d + "'", double1 == 2.0309449983266528d);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.3881317890172014E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.058530195189512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.882131703527553d + "'", double1 == 1.882131703527553d);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2.9580097917192205d), 0.9927738000811871d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2469871948152413d) + "'", double2 == (-1.2469871948152413d));
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1961970956842123d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080844E43d + "'", double1 == 1.3440585709080844E43d);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8346187642153643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        double double1 = org.apache.commons.math.util.FastMath.floor((-15.31878175402805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.0d) + "'", double1 == (-16.0d));
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9601793548609198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6242244357574577d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4365120111136123d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        double double1 = org.apache.commons.math.util.FastMath.signum(5557.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        float float2 = org.apache.commons.math.util.FastMath.min(38.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7307952105240656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012754782581450061d + "'", double1 == 0.012754782581450061d);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.4341096590261957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.270383403460351d + "'", double1 == 7.270383403460351d);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0887482668978d + "'", double1 == 1.0887482668978d);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 14, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9153412831308466d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2147483647L, (float) 24);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.0f + "'", float2 == 24.0f);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        double double2 = org.apache.commons.math.util.FastMath.max(53.0d, 0.9189065459251122d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.0d + "'", double2 == 53.0d);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        double double1 = org.apache.commons.math.util.FastMath.log10(14.741329353331306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1685366493835512d + "'", double1 == 1.1685366493835512d);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5099316255709411d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4277476069688093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8492219606876473d) + "'", double1 == (-0.8492219606876473d));
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3375726937940255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9288182873042609d + "'", double1 == 0.9288182873042609d);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        double double1 = org.apache.commons.math.util.FastMath.log(0.31048985231669685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1696040598924322d) + "'", double1 == (-1.1696040598924322d));
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.8373006999801143E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        double double2 = org.apache.commons.math.util.FastMath.pow((-4.819341425933092E-20d), 866558.702472181d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        double double1 = org.apache.commons.math.util.FastMath.tan(30.566416618160495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1372082089452704d) + "'", double1 == (-1.1372082089452704d));
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(27.78894454652419d, (-0.0749608557100309d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.788944546524185d + "'", double2 == 27.788944546524185d);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.014117181966128814d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014116713057245904d + "'", double1 == 0.014116713057245904d);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.922505433118517E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3881317890172014E-21d + "'", double1 == 3.3881317890172014E-21d);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 3.162277660168381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.377037239700286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3770372397002861d + "'", double1 == 1.3770372397002861d);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7674983998669958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.16227766016838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.791006851197306d + "'", double1 == 11.791006851197306d);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        double double1 = org.apache.commons.math.util.FastMath.sin((-59.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6367380071391379d) + "'", double1 == (-0.6367380071391379d));
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07679839938557123d) + "'", double1 == (-0.07679839938557123d));
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3675220813204314d, 0.6477149319066933d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5229107753521856d + "'", double2 == 0.5229107753521856d);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.11041129351109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.43026792747856d + "'", double1 == 22.43026792747856d);
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.6090535823208306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.015840768241279675d, 0.7375148883697067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01584076824127968d + "'", double2 == 0.01584076824127968d);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7019330522792107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8887205671511632d + "'", double1 == 0.8887205671511632d);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.0923176850416234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0923176850416234d + "'", double1 == 3.0923176850416234d);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.1339290130681278E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1339290130681254E-7d) + "'", double1 == (-1.1339290130681254E-7d));
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        float float1 = org.apache.commons.math.util.FastMath.abs(2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.52318064E8f + "'", float1 == 2.52318064E8f);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8148580335308185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.14131980404576d + "'", double1 == 1.14131980404576d);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.04395847663815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.04395847663815d + "'", double1 == 7.04395847663815d);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2105, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8988587803407233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45363791367130896d + "'", double1 == 0.45363791367130896d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5212327146899054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5780308183687116d) + "'", double1 == (-0.5780308183687116d));
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9866275920404853d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.783999931406715d + "'", double1 == 18.783999931406715d);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.0129472849435034E-83d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0129472849435034E-83d) + "'", double1 == (-1.0129472849435034E-83d));
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.13028260783892d, 0.8414687716506352d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.596303001718402d + "'", double2 == 7.596303001718402d);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5680724581504838d), 1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.47806077048862167d) + "'", double2 == (-0.47806077048862167d));
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.9127299606445602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.446270374659366d + "'", double1 == 1.446270374659366d);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        double double1 = org.apache.commons.math.util.FastMath.log(0.023201164311237112d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7635528157399536d) + "'", double1 == (-3.7635528157399536d));
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.006766867647289856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0822609728078258d + "'", double1 == 0.0822609728078258d);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        double double1 = org.apache.commons.math.util.FastMath.cos(7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1363181080686976d + "'", double1 == 0.1363181080686976d);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0327744053192653d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3498819149396504d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        long long2 = org.apache.commons.math.util.FastMath.min(2405171239L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 573);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.144549764063218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.53667995284064d + "'", double1 == 31.53667995284064d);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.522227941985666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6536774959982918d + "'", double1 == 1.6536774959982918d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02740339846894975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.027782324965362d + "'", double1 == 1.027782324965362d);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.022993279121268483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002643570889984d + "'", double1 == 1.0002643570889984d);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6855415188524085d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8817482115299875d) + "'", double1 == (-0.8817482115299875d));
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.570503637282546d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-90.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.036090693379206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01539777269705334d + "'", double1 == 0.01539777269705334d);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.0393469217744312E-249d), 0.5660043779672871d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0393469217744312E-249d) + "'", double2 == (-1.0393469217744312E-249d));
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3795753676207831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1124497590076214d + "'", double1 == 2.1124497590076214d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5638998844065481d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019390209761241513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1109771831925104d + "'", double1 == 1.1109771831925104d);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '#', 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7453292519943295d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        long long1 = org.apache.commons.math.util.FastMath.round(22.597055569270644d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 23L + "'", long1 == 23L);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.046956526320538d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0469565263205383d + "'", double1 == 1.0469565263205383d);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        double double1 = org.apache.commons.math.util.FastMath.acos(105.76695267085637d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.90330553725532E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3276676988791268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31642354632274017d + "'", double1 == 0.31642354632274017d);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        long long1 = org.apache.commons.math.util.FastMath.round(0.21565069657906166d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        double double1 = org.apache.commons.math.util.FastMath.exp(6.197664423181247E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000619785648237d + "'", double1 == 1.0000619785648237d);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        double double1 = org.apache.commons.math.util.FastMath.asin(198.60867061197564d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9545030018773397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        double double2 = org.apache.commons.math.util.FastMath.max(7.8962960182679E13d, 7.896296018267898E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.8962960182679E13d + "'", double2 == 7.8962960182679E13d);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        int int2 = org.apache.commons.math.util.FastMath.max((-7), (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-5) + "'", int2 == (-5));
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        double double2 = org.apache.commons.math.util.FastMath.atan2(97.09607204776374d, 1.5802593100976132d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5545225499960602d + "'", double2 == 1.5545225499960602d);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.3771116715785444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31998831419142215d + "'", double1 == 0.31998831419142215d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1998999094117004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3197846269106472d + "'", double1 == 3.3197846269106472d);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0316603012496908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.805720310651806d + "'", double1 == 2.805720310651806d);
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2180280666000018d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.692617836018588d + "'", double1 == 8.692617836018588d);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        double double1 = org.apache.commons.math.util.FastMath.signum((-9.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5447568000938525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        double double2 = org.apache.commons.math.util.FastMath.max((-11.13756594658902d), 1.0523779637351338d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0523779637351338d + "'", double2 == 1.0523779637351338d);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5900523133380877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201573526616591d + "'", double1 == 0.9201573526616591d);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.025681666614117075d, 7.596303001718402d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.2988128331442E-13d + "'", double2 == 8.2988128331442E-13d);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-7), 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        int int2 = org.apache.commons.math.util.FastMath.max(32, (-5));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5669192166547647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.77785795226306d + "'", double1 == 89.77785795226306d);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5405025668761214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5405025668761216d + "'", double1 == 1.5405025668761216d);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.47268102317694594d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8903508867789269d + "'", double1 == 0.8903508867789269d);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.267020871997795d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8401501864046732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6673509830411444d + "'", double1 == 0.6673509830411444d);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.6342953050784887d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.26275795703227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1237250362220599d + "'", double1 == 1.1237250362220599d);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.063180265289355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        float float2 = org.apache.commons.math.util.FastMath.max(2.4051712E9f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.8995084834391828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7830212834246152d) + "'", double1 == (-0.7830212834246152d));
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.4182755546463937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4061852755785258d) + "'", double1 == (-0.4061852755785258d));
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0019051692959427317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.263184405090835d) + "'", double1 == (-6.263184405090835d));
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0127428005375332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0127428005375332d + "'", double1 == 1.0127428005375332d);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        double double1 = org.apache.commons.math.util.FastMath.signum(314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9961652815068444d, 1.3277366163928728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9961652815068444d + "'", double2 == 0.9961652815068444d);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 22025L, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2809413143351598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.938901295571055d + "'", double1 == 1.938901295571055d);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8461880395534626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6131229941396816d + "'", double1 == 0.6131229941396816d);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        double double1 = org.apache.commons.math.util.FastMath.asinh(9.493776320644722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.946545886871167d + "'", double1 == 2.946545886871167d);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        double double1 = org.apache.commons.math.util.FastMath.rint(87.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 87.0d + "'", double1 == 87.0d);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7544036781775962d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5440211108893683d), 2.654888560547921d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.2021150793344156d) + "'", double2 == (-0.2021150793344156d));
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        double double1 = org.apache.commons.math.util.FastMath.asin(5425210.214035052d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6294764138281497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2047492386876624d + "'", double1 == 1.2047492386876624d);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        double double1 = org.apache.commons.math.util.FastMath.atan((-3.1762777305546113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2657865887328426d) + "'", double1 == (-1.2657865887328426d));
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.009972525083085704d, 7.853398979608905d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00126983485097483d + "'", double2 == 0.00126983485097483d);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1868734375770279d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.6881171418161356E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.620277154609447d + "'", double1 == 23.620277154609447d);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.2929838790434248d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6641730380811092d) + "'", double1 == (-0.6641730380811092d));
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0042167534122862105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004216765908741502d + "'", double1 == 0.004216765908741502d);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6499263854931472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.028099800521022494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027712244539693204d + "'", double1 == 0.027712244539693204d);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5430735359421346d, 10.206709210579758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1500460074074101d + "'", double2 == 0.1500460074074101d);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.0021606868913209d), (-1.5136946405560185d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.5567842218911343d) + "'", double2 == (-2.5567842218911343d));
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        int int2 = org.apache.commons.math.util.FastMath.max(573, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.48486417183142105d, 43.99337600241585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4769526856462363E-14d + "'", double2 == 1.4769526856462363E-14d);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6061, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8902596696356355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6367142109758311d + "'", double1 == 0.6367142109758311d);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.020576033879047353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0207891798536342d + "'", double1 == 1.0207891798536342d);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9986502386334037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2915496650148837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9612633548551068d + "'", double1 == 0.9612633548551068d);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8384749410913358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07650991231654689d) + "'", double1 == (-0.07650991231654689d));
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.31642354632274017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3111696595403102d + "'", double1 == 0.3111696595403102d);
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6692096495584949d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.535856475922823d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.597500164801286d + "'", double1 == 1.597500164801286d);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-7L), (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.40559151081122097d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41762586642257626d) + "'", double1 == (-0.41762586642257626d));
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5669192166547647d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.917031690363043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033458514861907554d + "'", double1 == 0.033458514861907554d);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-6.479389604825503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-371.2416781774396d) + "'", double1 == (-371.2416781774396d));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9850530471537312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        double double2 = org.apache.commons.math.util.FastMath.min(2.6977837230134307d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.848501131276805d + "'", double1 == 3.848501131276805d);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6723323011208733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2346585098971854d + "'", double1 == 1.2346585098971854d);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        double double1 = org.apache.commons.math.util.FastMath.rint((-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        double double1 = org.apache.commons.math.util.FastMath.rint((-74.20321057778875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.0d) + "'", double1 == (-74.0d));
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1749455142537386d, 74.54793938031867d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015759634004795586d + "'", double2 == 0.015759634004795586d);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 88, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        long long2 = org.apache.commons.math.util.FastMath.min(2405171239L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.1642529702120725d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9762070212477264E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5011220152577573d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5248948525042159d) + "'", double1 == (-0.5248948525042159d));
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        double double2 = org.apache.commons.math.util.FastMath.min(2.0309449983266528d, 3.3553727166517466E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.3553727166517466E-7d + "'", double2 == 3.3553727166517466E-7d);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2800017211707247E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9976537452787457d + "'", double1 == 0.9976537452787457d);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        int int2 = org.apache.commons.math.util.FastMath.max((-7), (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 573);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.26739338089528586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8414832194846726d + "'", double1 == 1.8414832194846726d);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3158911158571682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1471229732932595d + "'", double1 == 1.1471229732932595d);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        double double1 = org.apache.commons.math.util.FastMath.signum((-43.56618709829934d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        double double2 = org.apache.commons.math.util.FastMath.min(0.09492805084579563d, 0.9999999999266639d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09492805084579563d + "'", double2 == 0.09492805084579563d);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7054294284722258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0247159689465697d + "'", double1 == 2.0247159689465697d);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.733479389818152E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.0717314035742076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31633344918758416d + "'", double1 == 0.31633344918758416d);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0074724144482754d + "'", double1 == 1.0074724144482754d);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.71827069403746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7315708709828758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6783386294296885d + "'", double1 == 0.6783386294296885d);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (short) -1, 0.05363026241493581d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 7, (-0.615620091065296d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.615620091065296d) + "'", double2 == (-0.615620091065296d));
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.070242962723665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8773171306729552d + "'", double1 == 0.8773171306729552d);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.019926209128347205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6653943626343264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7384370979130614d + "'", double1 == 2.7384370979130614d);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.593332143810673E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.028063127633168303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16752052899023542d + "'", double1 == 0.16752052899023542d);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1577059034868376E-10d + "'", double1 == 4.1577059034868376E-10d);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.641588833612779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.003594988557117298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.356655043862392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8212984814728256d + "'", double1 == 0.8212984814728256d);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.39857533900047715d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3787293076750206d) + "'", double1 == (-0.3787293076750206d));
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08704561128797016d) + "'", double1 == (-0.08704561128797016d));
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        double double2 = org.apache.commons.math.util.FastMath.min(0.017466184278427548d, (-1.6449961687907304d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6449961687907304d) + "'", double2 == (-1.6449961687907304d));
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6059822019406358d, 0.761592435679563d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6828464904741856d + "'", double2 == 0.6828464904741856d);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776928d + "'", double1 == 0.9999999958776928d);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9862108565452042d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6270126807426111d) + "'", double1 == (-0.6270126807426111d));
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7611452618032624d) + "'", double1 == (-0.7611452618032624d));
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.7289664090565792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.012722863974477118d) + "'", double1 == (-0.012722863974477118d));
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.01539777269705334d, 0.21488230331615563d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015397772697053341d + "'", double2 == 0.015397772697053341d);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.65685424949238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 143.12163518255818d + "'", double1 == 143.12163518255818d);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.3445697418011234E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3445697422307273E-5d + "'", double1 == 2.3445697422307273E-5d);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.0033681607366540358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.878549459101058E-5d + "'", double1 == 5.878549459101058E-5d);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8342233605065101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8451379033353027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2388871380358915d + "'", double1 == 1.2388871380358915d);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8823160160403881d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9393167815174964d + "'", double1 == 0.9393167815174964d);
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.005268221548625999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005268172811086017d + "'", double1 == 0.005268172811086017d);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-5), (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.003480073117650629d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1209452514271958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        double double2 = org.apache.commons.math.util.FastMath.pow((-3.7635528157399536d), 0.01144136910308836d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.3104642473694204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8374484772285518d + "'", double1 == 0.8374484772285518d);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.739102559195019d + "'", double1 == 3.739102559195019d);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.18525095627631863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18525095627631866d + "'", double1 == 0.18525095627631866d);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        long long2 = org.apache.commons.math.util.FastMath.max((-7L), 38L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        float float2 = org.apache.commons.math.util.FastMath.max(4.0f, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-8.942845591094487d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.8690202903623525E45d, 2.0446384732171334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.80300734186678E92d + "'", double2 == 8.80300734186678E92d);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.8737081353760942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.020976545894544365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020973469767673416d + "'", double1 == 0.020973469767673416d);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-2));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4436354751788103d) + "'", double1 == (-1.4436354751788103d));
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(6.292146020044726d, 1.0011281692747829d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.292146020044725d + "'", double2 == 6.292146020044725d);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8771338786018624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4039996680771014d + "'", double1 == 2.4039996680771014d);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        int int1 = org.apache.commons.math.util.FastMath.round(88.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.818446459232067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.18930738450575d + "'", double1 == 104.18930738450575d);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5901750099221726d, 6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.819542696659197E-43d + "'", double2 == 8.819542696659197E-43d);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7968780678647466d + "'", double1 == 0.7968780678647466d);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.14131975637264d, 0.11507828243072993d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1413197563726394d + "'", double2 == 2.1413197563726394d);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.274123996952347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.706148088626525d + "'", double1 == 15.706148088626525d);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.123795169711219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9097589647345423d + "'", double1 == 0.9097589647345423d);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5081249405686994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06263036852065101d + "'", double1 == 0.06263036852065101d);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.943562482807576E-24d, 13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.943562482807578E-24d + "'", double2 == 8.943562482807578E-24d);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0666714566769811d, 1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06667145667698111d + "'", double2 == 0.06667145667698111d);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        long long1 = org.apache.commons.math.util.FastMath.round(0.49087059928372606d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.47905538530296876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5525884268785045E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5525884268785045E-18d + "'", double1 == 1.5525884268785045E-18d);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.2469871948152413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.979540547380804d) + "'", double1 == (-2.979540547380804d));
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.001137172509454239d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.1204413228389418d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        double double2 = org.apache.commons.math.util.FastMath.min(15.154093508474027d, (-0.31408714102768087d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.31408714102768087d) + "'", double2 == (-0.31408714102768087d));
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        double double1 = org.apache.commons.math.util.FastMath.acosh(301.8275618935516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.403000303500052d + "'", double1 == 6.403000303500052d);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 6061.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6061.0d + "'", double1 == 6061.0d);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(95.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.7954975899624d + "'", double1 == 9.7954975899624d);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        double double1 = org.apache.commons.math.util.FastMath.floor(13.672285132493046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500625E-16d + "'", double1 == 4.440892098500625E-16d);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        int int2 = org.apache.commons.math.util.FastMath.max(100, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.893485813313701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.6478005095231385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9986438861399506d) + "'", double1 == (-0.9986438861399506d));
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.07634914996399904d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0794211466769333d) + "'", double1 == (-0.0794211466769333d));
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3227901114524386d + "'", double1 == 0.3227901114524386d);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 38);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 38.0f + "'", float1 == 38.0f);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.506565440100699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.746606636224771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.324212955504118d + "'", double1 == 1.324212955504118d);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8.206498704176892E-40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.362373621914044E-14d + "'", double1 == 9.362373621914044E-14d);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        double double1 = org.apache.commons.math.util.FastMath.cos((-3.0874466129197624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.998534461247149d) + "'", double1 == (-0.998534461247149d));
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9293779356001103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7303037375861448d + "'", double1 == 0.7303037375861448d);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.08479667516930564d), 8.142219984546602E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08479667516930563d) + "'", double2 == (-0.08479667516930563d));
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-5.0d), (-0.00412362024024141d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.999999999999999d) + "'", double2 == (-4.999999999999999d));
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.21735815689017746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1171584131235877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3644746251564972d + "'", double1 == 1.3644746251564972d);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        float float2 = org.apache.commons.math.util.FastMath.min(6061.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        double double1 = org.apache.commons.math.util.FastMath.expm1(10.991338187845834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59356.76276403235d + "'", double1 == 59356.76276403235d);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.719473597969312d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.34414365766927546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-7), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.017903805004544807d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.970233767273539d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9640275800758168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.036635374743696394d) + "'", double1 == (-0.036635374743696394d));
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6571831014265066E-4d, 0.8903508867789269d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8612696487393387E-4d + "'", double2 == 1.8612696487393387E-4d);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6715318396690159d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2340792576253348d + "'", double1 == 1.2340792576253348d);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.027719239916259047d, 1.1842287361344372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.014318479023854054d + "'", double2 == 0.014318479023854054d);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.978688344114683d), 2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.37551599325380286d) + "'", double2 == (-0.37551599325380286d));
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7571699146056852d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.092046153706521E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6454899392731472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8642309710897006d + "'", double1 == 0.8642309710897006d);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (float) 88);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.4215484089964614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-81.44872420903422d) + "'", double1 == (-81.44872420903422d));
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.230032955705395d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0214010731908018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02139780681552994d + "'", double1 == 0.02139780681552994d);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        double double1 = org.apache.commons.math.util.FastMath.log(16.11830415560668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.779955530279347d + "'", double1 == 2.779955530279347d);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.35885894357174647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6984728684912337d + "'", double1 == 0.6984728684912337d);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5403057526408277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6045873137726164d + "'", double1 == 0.6045873137726164d);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        double double1 = org.apache.commons.math.util.FastMath.floor(117.61174253155805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 117.0d + "'", double1 == 117.0d);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5185094832388669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5185094832388669d + "'", double1 == 0.5185094832388669d);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.046419655042440194d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046453025254094255d + "'", double1 == 0.046453025254094255d);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9881722337154755d + "'", double1 == 2.9881722337154755d);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.0d, (-0.12528656017866552d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7706460593219109d + "'", double2 == 0.7706460593219109d);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        int int2 = org.apache.commons.math.util.FastMath.min(18, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.028809780999338d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.772878362416013d + "'", double1 == 1.772878362416013d);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999959038668201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7789316805292234E-6d) + "'", double1 == (-1.7789316805292234E-6d));
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        long long2 = org.apache.commons.math.util.FastMath.min(18L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        double double2 = org.apache.commons.math.util.FastMath.max(0.43442052080657195d, 0.7315511733755106d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7315511733755106d + "'", double2 == 0.7315511733755106d);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5473008271869906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7285809766034075d + "'", double1 == 0.7285809766034075d);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        long long2 = org.apache.commons.math.util.FastMath.max(24L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        double double1 = org.apache.commons.math.util.FastMath.abs(70.9231948377534d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.9231948377534d + "'", double1 == 70.9231948377534d);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.18203743107264986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1830444795794677d + "'", double1 == 0.1830444795794677d);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.271111366571952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        double double1 = org.apache.commons.math.util.FastMath.ulp(27.78894454652419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.6490151682005654d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.07609034874226744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07601711547887371d + "'", double1 == 0.07601711547887371d);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707963129646567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 23L, 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 44, 24.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 24.0f + "'", float2 == 24.0f);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9153412831308465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.44519233748684d + "'", double1 == 52.44519233748684d);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(449.96661636393753d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25781.188039435863d + "'", double1 == 25781.188039435863d);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.614548555343225d, 1.1909689201661917E184d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3556596885147312E-184d + "'", double2 == 1.3556596885147312E-184d);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-7));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        float float2 = org.apache.commons.math.util.FastMath.max((-7.0f), (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.4994917602860767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1944812635486721d + "'", double1 == 1.1944812635486721d);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.1216780097738317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12137974134193381d + "'", double1 == 0.12137974134193381d);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8868714057877692d), 1.119514993737036d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.119514993737036d + "'", double2 == 1.119514993737036d);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8646887382670995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8646887382670996d + "'", double1 == 0.8646887382670996d);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        double double1 = org.apache.commons.math.util.FastMath.asin(11.624987626712537d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04742517217871524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0486021326201485d) + "'", double1 == (-3.0486021326201485d));
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.8039446305066866d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 14L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 46L, (float) 573);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double double2 = org.apache.commons.math.util.FastMath.min(0.7592367113429862d, 1.0003841043626869d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7592367113429862d + "'", double2 == 0.7592367113429862d);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.2722241413791169d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        double double1 = org.apache.commons.math.util.FastMath.log1p(38.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6635616461296463d + "'", double1 == 3.6635616461296463d);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.002132323554382712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12871160368240295d + "'", double1 == 0.12871160368240295d);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.0411283785788545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.461878788198661d + "'", double1 == 1.461878788198661d);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 252318064, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 14L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8642309710897006d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9759024308843093d + "'", double1 == 0.9759024308843093d);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7689073597099995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.056276320607069d, 0.8401501864046733d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0562763206070684d + "'", double2 == 2.0562763206070684d);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2681114372998328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022132719863079714d + "'", double1 == 0.022132719863079714d);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.21259644855998064d, 1.115589917707645d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1883107123678801d + "'", double2 == 0.1883107123678801d);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.1451683936911605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3684785197548404d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.798196712620037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.1612393557517264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2981237180183044d + "'", double1 == 0.2981237180183044d);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        double double1 = org.apache.commons.math.util.FastMath.atanh(8.819542696659197E-43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.819542696659197E-43d + "'", double1 == 8.819542696659197E-43d);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.155529386654044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9871894583475739d + "'", double1 == 0.9871894583475739d);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8646887382670996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7129600646494462d + "'", double1 == 0.7129600646494462d);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7616835171611754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7236751730374692d + "'", double1 == 0.7236751730374692d);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 14, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        double double2 = org.apache.commons.math.util.FastMath.max(3.7279248142772476d, 0.13019523074717101d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.7279248142772476d + "'", double2 == 3.7279248142772476d);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6535598729692599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7814878657341103d + "'", double1 == 0.7814878657341103d);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.13725468110322078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13812646321591882d + "'", double1 == 0.13812646321591882d);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        int int2 = org.apache.commons.math.util.FastMath.min(18, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015956618846211263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015957296052726624d + "'", double1 == 0.015957296052726624d);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        long long2 = org.apache.commons.math.util.FastMath.min(44L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.5804466683565797d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5519859061836423d) + "'", double1 == (-0.5519859061836423d));
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        double double1 = org.apache.commons.math.util.FastMath.abs(144.54565322796893d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 144.54565322796893d + "'", double1 == 144.54565322796893d);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.591552284503315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3870426100977542d, 26.000000000000004d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9130586038089042E-11d + "'", double2 == 1.9130586038089042E-11d);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011536475885345746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011536987710179311d + "'", double1 == 0.011536987710179311d);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.7544036781775962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.197664423181247E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-8.942845591094487d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9999999658513922d) + "'", double1 == (-0.9999999658513922d));
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        double double2 = org.apache.commons.math.util.FastMath.min(2.7182706940374604d, 4.064934783641961d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182706940374604d + "'", double2 == 2.7182706940374604d);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        float float1 = org.apache.commons.math.util.FastMath.abs(14.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.10915815991542903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4614202171239006d + "'", double1 == 1.4614202171239006d);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1397939566479853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.126124181718359d + "'", double1 == 3.126124181718359d);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.3418122447084941d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7822996259883344d) + "'", double1 == (-1.7822996259883344d));
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.2857111204210793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.330707985359738d + "'", double1 == 0.330707985359738d);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        double double1 = org.apache.commons.math.util.FastMath.sinh(17765.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 7, 0.8470571280035653d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.999999999999999d + "'", double2 == 6.999999999999999d);
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        double double1 = org.apache.commons.math.util.FastMath.log(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.556090791758852d + "'", double1 == 14.556090791758852d);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.028393089566237137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.028396905882036416d) + "'", double1 == (-0.028396905882036416d));
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.2931185359546688E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2931185359546688E-4d + "'", double1 == 2.2931185359546688E-4d);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.1713189077681307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2262449532373516d + "'", double1 == 3.2262449532373516d);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-6.982599029145449d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.641656889827791d) + "'", double1 == (-2.641656889827791d));
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.428182669496151d) + "'", double1 == (-0.428182669496151d));
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6146089504495703d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.26275795703227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.35070148451122d + "'", double1 == 72.35070148451122d);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4825777280150008d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.8690202903623525E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.773145071536183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.7268687239847369d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9262856941868183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        int int2 = org.apache.commons.math.util.FastMath.min(18, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8357914941303838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5664687918050895d) + "'", double1 == (-0.5664687918050895d));
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        double double1 = org.apache.commons.math.util.FastMath.log1p(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.352555865969627d + "'", double1 == 6.352555865969627d);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.6180889778224288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.41388979278031d) + "'", double1 == (-35.41388979278031d));
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.629122766574956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.853143817940012d + "'", double1 == 18.853143817940012d);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        double double1 = org.apache.commons.math.util.FastMath.rint((-47.82715545863623d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-48.0d) + "'", double1 == (-48.0d));
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.26739338089528597d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6651773355037965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40770160394586774d) + "'", double1 == (-0.40770160394586774d));
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0002643570889984d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(8.206498704176892E-40d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.70197740328915E-38d + "'", double1 == 4.70197740328915E-38d);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        long long1 = org.apache.commons.math.util.FastMath.abs(252318057L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 252318057L + "'", long1 == 252318057L);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5025477840930719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17682829234729394d + "'", double1 == 0.17682829234729394d);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.04175285837729747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04176499920524645d + "'", double1 == 0.04176499920524645d);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9359323643709385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9789263579018709d) + "'", double1 == (-0.9789263579018709d));
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        double double1 = org.apache.commons.math.util.FastMath.abs(37.38156029837415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.38156029837415d + "'", double1 == 37.38156029837415d);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0003297196233996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.028961339866994493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02896943978137557d + "'", double1 == 0.02896943978137557d);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8589849307047837d + "'", double1 == 1.8589849307047837d);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0127428005375332d, 0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0127428005375332d + "'", double2 == 1.0127428005375332d);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0145842804061052d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        double double1 = org.apache.commons.math.util.FastMath.ulp(22.57736682417917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7740456749600706d, 2.520586644733795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7740456749600707d + "'", double2 == 0.7740456749600707d);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.12126956628620691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1218693434051476d + "'", double1 == 0.1218693434051476d);
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.0923176850416234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.092317685041624d + "'", double1 == 3.092317685041624d);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9036922050915037d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        int int2 = org.apache.commons.math.util.FastMath.max(26, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7725296756890861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.878936673309907d + "'", double1 == 0.878936673309907d);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6381615560800912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7988501461977028d + "'", double1 == 0.7988501461977028d);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.5817398942542069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5239288708778396d) + "'", double1 == (-0.5239288708778396d));
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3777732767106265d, 1.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3777732767106263d + "'", double2 == 1.3777732767106263d);
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2416460874631542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4202810717463716d) + "'", double1 == (-1.4202810717463716d));
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16248448599366297d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        long long1 = org.apache.commons.math.util.FastMath.round(1.028532029497268d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.6105760168731105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2049805685556032d + "'", double1 == 1.2049805685556032d);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.850754361071198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8507543610711985d + "'", double1 == 2.8507543610711985d);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.18525095627631863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7322395414892202d) + "'", double1 == (-0.7322395414892202d));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.3598729022063691d), 2.377731627086182d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.359872902206369d) + "'", double2 == (-0.359872902206369d));
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        double double1 = org.apache.commons.math.util.FastMath.ulp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }
}

