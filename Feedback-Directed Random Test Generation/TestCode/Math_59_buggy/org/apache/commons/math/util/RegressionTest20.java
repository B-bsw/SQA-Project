package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.014568980531170799d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.07176165277035d, 0.16354719567405981d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4193678790560924d + "'", double2 == 1.4193678790560924d);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.657733824090901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5632120983698852d + "'", double1 == 0.5632120983698852d);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4339872044851463d + "'", double1 == 3.4339872044851463d);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.2879824694293398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.441116808177853d + "'", double1 == 3.441116808177853d);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.672285132493045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23862639183347278d + "'", double1 == 0.23862639183347278d);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8336085691790922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7403618971104354d + "'", double1 == 0.7403618971104354d);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.047568060987967994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36233071379136494d + "'", double1 == 0.36233071379136494d);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4920.281738177185d), (-0.6090535823208306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4920.281738177184d) + "'", double2 == (-4920.281738177184d));
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8809570117013472d, 3.999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8809570117013473d + "'", double2 == 0.8809570117013473d);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.04636932132531771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3592611423487367d + "'", double1 == 0.3592611423487367d);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540302305895424d + "'", double1 == 0.540302305895424d);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7718336803958262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.22281237273011d + "'", double1 == 44.22281237273011d);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.35088571671474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999939085675996d + "'", double1 == 0.9999939085675996d);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.24769860755486173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.21940482668407568d) + "'", double1 == (-0.21940482668407568d));
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5469160326749675E-19d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.6661404377193246E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8395266781649566d) + "'", double1 == (-0.8395266781649566d));
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        long long1 = org.apache.commons.math.util.FastMath.round(2.6548885605479215d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.33051577000636745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3305157700063674d) + "'", double1 == (-0.3305157700063674d));
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-13.546349804879155d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.4328100205340816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41942336563939775d + "'", double1 == 0.41942336563939775d);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.503817570181902d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9187618740866558d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.6375861597263857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.01315789473684d + "'", double1 == 19.01315789473684d);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8737081353760942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13500890031466992d) + "'", double1 == (-0.13500890031466992d));
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318064L, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.09507068650612024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09081891507181945d + "'", double1 == 0.09081891507181945d);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.017450748081259813d), 7.0368744177664E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1610522125512257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0393469217744312E-249d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0129472849435034E-83d) + "'", double1 == (-1.0129472849435034E-83d));
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        double double1 = org.apache.commons.math.util.FastMath.tan((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8541673877839715d) + "'", double1 == (-0.8541673877839715d));
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.5325081704970691d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5325081704970691d + "'", double1 == 0.5325081704970691d);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.389662458514335d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.38966245851433495d + "'", double2 == 0.38966245851433495d);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4515219270969891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7671723618450381d + "'", double1 == 0.7671723618450381d);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.4079121250653364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8787600338676258d + "'", double1 == 0.8787600338676258d);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7595436208289167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11944727941634163d) + "'", double1 == (-0.11944727941634163d));
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.09950371902099903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7644456989950164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9589491796883352d + "'", double1 == 0.9589491796883352d);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6552377416047083d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.644250144850967d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.4436354751788103d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.163085598195192d) + "'", double1 == (-1.163085598195192d));
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.3673250405135535d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 5);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.011882748623020987d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1279281327218534E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.08106152637093929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08097301236170013d + "'", double1 == 0.08097301236170013d);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.7929422793014345d), 3.3553727166518725E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.7929422793014342d) + "'", double2 == (-1.7929422793014342d));
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.9567633533440579E80d, (-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9259299443872359E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.029464112608972946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000434098369181d + "'", double1 == 1.000434098369181d);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        float float2 = org.apache.commons.math.util.FastMath.max(145.0f, (float) 2405171239L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.4051712E9f + "'", float2 == 2.4051712E9f);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.6881824710286039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1699737671488761E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.931823875783932d) + "'", double1 == (-6.931823875783932d));
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5876803459339235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0087171808802526d + "'", double1 == 1.0087171808802526d);
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-5L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-74.20321057778875d) + "'", double1 == (-74.20321057778875d));
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5900523133380877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1752011936438884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16143936157126962d + "'", double1 == 0.16143936157126962d);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        double double1 = org.apache.commons.math.util.FastMath.tanh(11.435889973440437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999997666853d + "'", double1 == 0.9999999997666853d);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        double double1 = org.apache.commons.math.util.FastMath.ulp(809.0886869668323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.029464112608972946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02945984966136309d) + "'", double1 == (-0.02945984966136309d));
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-5.693388459081093d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-148.44728825006297d) + "'", double1 == (-148.44728825006297d));
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0174804374292909d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.757447703809722d) + "'", double1 == (-1.757447703809722d));
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        double double1 = org.apache.commons.math.util.FastMath.signum(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.04742517217871524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746077563140195d + "'", double1 == 0.04746077563140195d);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        double double2 = org.apache.commons.math.util.FastMath.atan2(28.031200676839138d, 4.8373008886306445E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707790699497692d + "'", double2 == 1.5707790699497692d);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0000121109089048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0159090561693984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1998999094117004d + "'", double1 == 1.1998999094117004d);
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05492754173067855d) + "'", double1 == (-0.05492754173067855d));
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8431746481004084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.377037239700286d + "'", double1 == 1.377037239700286d);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1219612639891907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3726152944843208d + "'", double1 == 1.3726152944843208d);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5843980649389331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010199670375468017d + "'", double1 == 0.010199670375468017d);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2304174960375769E11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.230417496037577E11d + "'", double1 == 1.230417496037577E11d);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9798783713774953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9932472940606253d + "'", double1 == 0.9932472940606253d);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.16724814964758392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int int2 = org.apache.commons.math.util.FastMath.max(4, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5585053606381855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7473321621863905d + "'", double1 == 0.7473321621863905d);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.570796326794889d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.903049969606974E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.903050362503117E-4d + "'", double1 == 4.903050362503117E-4d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.322730729536119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1642529702120725d) + "'", double1 == (-1.1642529702120725d));
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9545943990414509d), 0.6846624340993608d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9545943990414508d) + "'", double2 == (-0.9545943990414508d));
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.019658508809675648d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5511365515703515d + "'", double1 == 1.5511365515703515d);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7866131422952851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7866131422952851d + "'", double1 == 1.7866131422952851d);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6144072740383286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7159707284802358d + "'", double1 == 0.7159707284802358d);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.25533087064513765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.18525095627631863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1863272327128376d + "'", double1 == 0.1863272327128376d);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 7.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.8210429626092037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04923648803774589d + "'", double1 == 0.04923648803774589d);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9816270680622979d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        double double2 = org.apache.commons.math.util.FastMath.max(0.027715690889514186d, 1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1261966.2318521822d + "'", double2 == 1261966.2318521822d);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        double double2 = org.apache.commons.math.util.FastMath.max(4.6146685600490525d, (-8.833373523837084d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6146685600490525d + "'", double2 == 4.6146685600490525d);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8522390299521388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.852239029952139d + "'", double1 == 0.852239029952139d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 26.0f, 0.5514266812417142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5514266812417142d + "'", double2 == 0.5514266812417142d);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6994983692632405d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2547886346349597d + "'", double1 == 1.2547886346349597d);
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.9225054328816626E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.922505433118517E-5d + "'", double1 == 1.922505433118517E-5d);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.5521769452406319d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5806675682124768d) + "'", double1 == (-0.5806675682124768d));
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.10612853218660119d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10573186791192513d) + "'", double1 == (-0.10573186791192513d));
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4090089713088122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5968020998202846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7725296756890861d + "'", double1 == 0.7725296756890861d);
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.000601278442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8817986911785708d + "'", double1 == 0.8817986911785708d);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8237344352789204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7510946386756716d + "'", double1 == 0.7510946386756716d);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9418746580049391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9705022709942204d + "'", double1 == 0.9705022709942204d);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0419298307345257d, 0.8569259205417066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0419298307345255d + "'", double2 == 1.0419298307345255d);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7094902377818831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        double double1 = org.apache.commons.math.util.FastMath.expm1(29.23819432624582d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.988689301930058E12d + "'", double1 == 4.988689301930058E12d);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        double double1 = org.apache.commons.math.util.FastMath.signum(1634508.6862359024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9999998303558371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931470957378603d + "'", double1 == 0.6931470957378603d);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.8673445351016575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6245173869567006d + "'", double1 == 0.6245173869567006d);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.8357914941303838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6961872413292336d) + "'", double1 == (-0.6961872413292336d));
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.48863636973214d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0100220825342237d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.9685626425963985E-17d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 6061, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.2821188025582245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27497238525610734d + "'", double1 == 0.27497238525610734d);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0007386433516496d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017466184278427548d + "'", double1 == 0.017466184278427548d);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        double double2 = org.apache.commons.math.util.FastMath.max(0.01570692181693664d, 0.03905859609139826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03905859609139826d + "'", double2 == 0.03905859609139826d);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.47447846432657004d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.877256792376897d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9589242746631385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.574400879193934d + "'", double1 == 0.574400879193934d);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.01913259410521866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47905538530296876d + "'", double1 == 0.47905538530296876d);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.09744208412802913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09713484806370248d + "'", double1 == 0.09713484806370248d);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7304003084084857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9949853062930847d, 0.5893504478253487d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5893504478253487d + "'", double2 == 0.5893504478253487d);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9787900472628672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3967685262511838d) + "'", double1 == (-0.3967685262511838d));
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9852843599720181d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7779859403295012d + "'", double1 == 0.7779859403295012d);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.9970996906435381d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.5918362854056809d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-2L), (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9158465150847866d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5689800629322823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.505002848984886d + "'", double1 == 2.505002848984886d);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9999553501771875d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29322126667916d + "'", double1 == 57.29322126667916d);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.6043506968245094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4156994650884162d + "'", double1 == 0.4156994650884162d);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7907497569184486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7108807856057305d + "'", double1 == 0.7108807856057305d);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5802593100976132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2570836527843376d + "'", double1 == 1.2570836527843376d);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        double double1 = org.apache.commons.math.util.FastMath.log(17.858515120429434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8824804320384763d + "'", double1 == 2.8824804320384763d);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3373.800624777237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.816942328307682d + "'", double1 == 8.816942328307682d);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.404037645323065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.026341177789841626d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02808501931233197d + "'", double1 == 0.02808501931233197d);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        double double2 = org.apache.commons.math.util.FastMath.max((-43.56618709829934d), 1.3240578294914163d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3240578294914163d + "'", double2 == 1.3240578294914163d);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        double double2 = org.apache.commons.math.util.FastMath.max(9.261725192512572E-19d, 0.3222076544771963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3222076544771963d + "'", double2 == 0.3222076544771963d);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6566128730773926E-10d + "'", double1 == 4.6566128730773926E-10d);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.7883278476424156d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18L, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8995084834391828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9896835559265444d + "'", double1 == 0.9896835559265444d);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        long long1 = org.apache.commons.math.util.FastMath.round(4.764651313204947d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.558946309455193E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.558946309455193E-13d + "'", double1 == 4.558946309455193E-13d);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.5077885645823308d), 1.3640562262110947d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8354052209127564d) + "'", double2 == (-0.8354052209127564d));
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.18631502623505247d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9826935062897556d + "'", double1 == 0.9826935062897556d);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6946461479871102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2290790287811585d + "'", double1 == 0.2290790287811585d);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.850844047750578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.03274436492255d + "'", double1 == 47.03274436492255d);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        double double1 = org.apache.commons.math.util.FastMath.sin(13.672285132493045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8938745590549442d + "'", double1 == 0.8938745590549442d);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5017009167919775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6897511201227055d) + "'", double1 == (-0.6897511201227055d));
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.0850005042632922d), (-0.40908917437285713d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5395147593587678d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.603470874986783d + "'", double1 == 0.603470874986783d);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 252318057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1884593785089943d + "'", double1 == 2.1884593785089943d);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        int int2 = org.apache.commons.math.util.FastMath.min(24, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7310973244101043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7310973244101044d + "'", double1 == 0.7310973244101044d);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.018324993652862574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7369561671112403d) + "'", double1 == (-1.7369561671112403d));
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.554877906181354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2469474352118273d + "'", double1 == 1.2469474352118273d);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.454467422037778E-77d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.454467422037778E-77d + "'", double1 == 3.454467422037778E-77d);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.1606074732651916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.676406743021733d + "'", double1 == 8.676406743021733d);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16299078079570548d, 0.13100502560471863d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.788477670841945d + "'", double2 == 0.788477670841945d);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011882748623020987d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707963267936305d, 0.023542003793204997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5558101436938319d + "'", double2 == 1.5558101436938319d);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3383347192042505E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 44);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 44.0f + "'", float1 == 44.0f);
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7327237226262463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.45917371711502425d, 8666.81292500057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4591737171150243d + "'", double2 == 0.4591737171150243d);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.09713484806370248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.09713484806370248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09698274554263397d + "'", double1 == 0.09698274554263397d);
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.308604881651137d + "'", double1 == 2.308604881651137d);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.17259828953034054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7970747335500263d + "'", double1 == 0.7970747335500263d);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.774362643812196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.859831647227964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6525650438137741d + "'", double1 == 0.6525650438137741d);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        double double2 = org.apache.commons.math.util.FastMath.max(5.607240273007999E12d, 0.16571020934276798d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.607240273007999E12d + "'", double2 == 5.607240273007999E12d);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8470571280035653d + "'", double1 == 0.8470571280035653d);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5978220919084256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4499918000729173d) + "'", double1 == (-0.4499918000729173d));
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        float float2 = org.apache.commons.math.util.FastMath.min(21.0f, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9797056623737544d, (-0.26739338089528586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.26739338089528586d) + "'", double2 == (-0.26739338089528586d));
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        int int2 = org.apache.commons.math.util.FastMath.min(88, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        long long2 = org.apache.commons.math.util.FastMath.min((-5L), 2405171239L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.03841421002450886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999979411810735d, 0.27401024075282976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999979411810735d + "'", double2 == 0.9999979411810735d);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7945995197127065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7945995197127065d + "'", double1 == 0.7945995197127065d);
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8042331995094061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9343841113551586d) + "'", double1 == (-0.9343841113551586d));
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.915504000358288E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.666140437719325E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5419478974309992E7d + "'", double1 == 1.5419478974309992E7d);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        float float2 = org.apache.commons.math.util.FastMath.min(9.7864802E10f, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3374.0f + "'", float2 == 3374.0f);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.538659632515502d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994836608808633d + "'", double1 == 0.9994836608808633d);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.8962777330788523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3770540051424462d + "'", double1 == 1.3770540051424462d);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.027283067661679677d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0272763001493514d + "'", double1 == 0.0272763001493514d);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.11041129351109d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.2374252712536d + "'", double1 == 11.2374252712536d);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        float float2 = org.apache.commons.math.util.FastMath.min((-7.0f), (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1261967.0000000005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261968.0d + "'", double1 == 1261968.0d);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3771116715785444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.396067466391991d + "'", double1 == 0.396067466391991d);
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4901161193847656E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4901161193847656E-8d + "'", double1 == 1.4901161193847656E-8d);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.08726646259971647d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4435566798304896d) + "'", double1 == (-0.4435566798304896d));
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0582831434221311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4293116564491215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.12644237220649d + "'", double1 == 1.12644237220649d);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.2290790287811585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.25744140914518d + "'", double1 == 1.25744140914518d);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        long long2 = org.apache.commons.math.util.FastMath.max(6061L, 21L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5999857756436902d, (-0.8281987638796728d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0484473319527443d + "'", double2 == 2.0484473319527443d);
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 5, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1422988693731795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1529211698783688d + "'", double1 == 0.1529211698783688d);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0437346740099507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.675466570140337E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.160228571587528E-6d) + "'", double1 == (-8.160228571587528E-6d));
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9999999986258976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.540302307024407d + "'", double1 == 0.540302307024407d);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.009494959759213906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009495245111675741d + "'", double1 == 0.009495245111675741d);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707710209330625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810355649229662d + "'", double1 == 4.810355649229662d);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.12246868058081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0961179680051676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5896235118375416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8033093629498727d + "'", double1 == 0.8033093629498727d);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.5707038251666727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.99470004710469d + "'", double1 == 89.99470004710469d);
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        double double2 = org.apache.commons.math.util.FastMath.min(0.026931713802581317d, 1.02069796392607d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026931713802581317d + "'", double2 == 0.026931713802581317d);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9735500688063772d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5623675740436899d + "'", double1 == 0.5623675740436899d);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1553250449256478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14438172855945092d + "'", double1 == 0.14438172855945092d);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.07555051586576621d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0785568709304495d) + "'", double1 == (-0.0785568709304495d));
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.19006280234111017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19240232444172614d + "'", double1 == 0.19240232444172614d);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        int int2 = org.apache.commons.math.util.FastMath.min((-7), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991040211506196d + "'", double1 == 0.9991040211506196d);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.1552749197989466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.156534981721197d) + "'", double1 == (-0.156534981721197d));
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        double double1 = org.apache.commons.math.util.FastMath.cosh(5.205023552180745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 91.09532624865832d + "'", double1 == 91.09532624865832d);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.9899924966004454d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5645645685050509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0180658101402444d + "'", double1 == 1.0180658101402444d);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        double double1 = org.apache.commons.math.util.FastMath.log(7.271111366571952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9839091500919448d + "'", double1 == 1.9839091500919448d);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8749693034931421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7675238255099589d + "'", double1 == 0.7675238255099589d);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.02109628083757295d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0069730818226932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8862957149105529d + "'", double1 == 0.8862957149105529d);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9999999999675754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        double double2 = org.apache.commons.math.util.FastMath.max(2.6977837230134307d, 1.5619730447758073d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6977837230134307d + "'", double2 == 2.6977837230134307d);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.14273446680468305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8669842514321565d + "'", double1 == 0.8669842514321565d);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5081249405686994d, 0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5081249405686994d + "'", double2 == 1.5081249405686994d);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.555362640229557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        int int2 = org.apache.commons.math.util.FastMath.min(10, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9024010197259666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7341400494208246d + "'", double1 == 0.7341400494208246d);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3741766975878222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9122769076921013d, 1.1842287361344372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6564017449093553d + "'", double2 == 0.6564017449093553d);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-7.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9797056623737544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9797056623737544d + "'", double1 == 0.9797056623737544d);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        double double1 = org.apache.commons.math.util.FastMath.expm1(28.031200676839138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4920925950926543E12d + "'", double1 == 1.4920925950926543E12d);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.605056010682738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.7765227797066595E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.100617174256311E53d + "'", double1 == 3.100617174256311E53d);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.03700049997605E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.300565810929604E7d + "'", double1 == 5.300565810929604E7d);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        long long2 = org.apache.commons.math.util.FastMath.max(31L, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5825073257289527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9489863295583174d + "'", double1 == 0.9489863295583174d);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0928874300868892d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6994983692632405d, 0.9122440868593062d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6994983692632405d + "'", double2 == 0.6994983692632405d);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4407748512619138d + "'", double1 == 1.4407748512619138d);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04742517217871524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8368009637323028d), 0.04813832110931332d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8368009637323027d) + "'", double2 == (-0.8368009637323027d));
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        double double1 = org.apache.commons.math.util.FastMath.log(0.03468311433197074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.36150232914181d) + "'", double1 == (-3.36150232914181d));
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.560229461916166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02567602163380694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02567884291428669d + "'", double1 == 0.02567884291428669d);
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.556320495207163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5524262636095455d) + "'", double1 == (-0.5524262636095455d));
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.09507068650612024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09478579978850855d + "'", double1 == 0.09478579978850855d);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9984652528042448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.479389604825503d) + "'", double1 == (-6.479389604825503d));
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.3689877298052195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.11219328616561733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6832263252876027d + "'", double1 == 1.6832263252876027d);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3280805330246155d, 0.5836293809324178d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1800961313208411d + "'", double2 == 1.1800961313208411d);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        double double1 = org.apache.commons.math.util.FastMath.tan(8.486449227395258E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.486451264704345E-4d + "'", double1 == 8.486451264704345E-4d);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.44894677555465945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4817567395291671d + "'", double1 == 0.4817567395291671d);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.893761324052697d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        double double1 = org.apache.commons.math.util.FastMath.abs(75.90575913641077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.90575913641077d + "'", double1 == 75.90575913641077d);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5893504478253487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8313018892926551d + "'", double1 == 0.8313018892926551d);
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.1932800507380152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1932800507380157d + "'", double1 == 2.1932800507380157d);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.014568980531170799d), 23.137988217209347d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.014568980531170797d) + "'", double2 == (-0.014568980531170797d));
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-34.25492718415656d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.22719058232548d) + "'", double1 == (-4.22719058232548d));
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.3580539237745366E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3580538606625655E-4d + "'", double1 == 3.3580538606625655E-4d);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.004350147573099913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0043501201328900755d + "'", double1 == 0.0043501201328900755d);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        double double2 = org.apache.commons.math.util.FastMath.max(117.61174253155805d, 22025.461748222762d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.461748222762d + "'", double2 == 22025.461748222762d);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7929030831950329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.331165760045145d + "'", double1 == 1.331165760045145d);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-7.378742784442106d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.0d) + "'", double1 == (-7.0d));
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.12644237220649d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8097981538512853d + "'", double1 == 0.8097981538512853d);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        int int2 = org.apache.commons.math.util.FastMath.min(52, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.653805147100431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08291352492482613d) + "'", double1 == (-0.08291352492482613d));
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.012933598027822206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8882806409156938d) + "'", double1 == (-1.8882806409156938d));
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5081249405686994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17843732213843988d + "'", double1 == 0.17843732213843988d);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.15449917409448818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15512052078455524d + "'", double1 == 0.15512052078455524d);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 88, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.37835193832455283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        int int2 = org.apache.commons.math.util.FastMath.min(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        double double1 = org.apache.commons.math.util.FastMath.log10(97.09607204776374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9872016611903307d + "'", double1 == 1.9872016611903307d);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1029791463344196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3374.0f + "'", float2 == 3374.0f);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.677934571594396d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.263592139934385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.019595674851639586d) + "'", double1 == (-0.019595674851639586d));
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 145.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(104.06639041664197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.06639041664198d + "'", double1 == 104.06639041664198d);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.42614722344031464d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4142016019134124d) + "'", double1 == (-0.4142016019134124d));
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6558706068682112d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01144710155690362d) + "'", double1 == (-0.01144710155690362d));
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.00508816641386296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999870553092001d + "'", double1 == 0.9999870553092001d);
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.427768900977765E74d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (-1L), (-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.170898511753462d) + "'", double2 == (-2.170898511753462d));
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8289768072510253d, (-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.10707716392528016d) + "'", double2 == (-0.10707716392528016d));
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.19123459503123072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5761322064947163d + "'", double1 == 0.5761322064947163d);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.1800736247033484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7445498934249509d) + "'", double1 == (-0.7445498934249509d));
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.355404970159796E-7d, 0.3584059010869395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.362024899653887E-7d + "'", double2 == 9.362024899653887E-7d);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 252318057L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.157938378083989E-6d + "'", double1 == 1.157938378083989E-6d);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.07011222389235412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0024588689821368d + "'", double1 == 1.0024588689821368d);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.005126506862960794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005126461953399859d + "'", double1 == 0.005126461953399859d);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.7267002501159547d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.0785568709304495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07863769398936533d) + "'", double1 == (-0.07863769398936533d));
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.6057781034033436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2671930016391912d + "'", double1 == 1.2671930016391912d);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707963263486864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611987690678426d + "'", double1 == 0.19611987690678426d);
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9440450304036032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-54.08979591242595d) + "'", double1 == (-54.08979591242595d));
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        int int2 = org.apache.commons.math.util.FastMath.max(24, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        double double2 = org.apache.commons.math.util.FastMath.min(0.84325521395775d, 0.01807019118332042d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01807019118332042d + "'", double2 == 0.01807019118332042d);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9234976649034378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1771005758622557d + "'", double1 == 1.1771005758622557d);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 26.0f, 2005.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.0d + "'", double2 == 2005.0d);
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18033.985297831703d + "'", double1 == 18033.985297831703d);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.6625219529419444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        double double1 = org.apache.commons.math.util.FastMath.acos(5.824846225420026E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5702138421394163d + "'", double1 == 1.5702138421394163d);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1L), (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8068376590204337d + "'", double1 == 0.8068376590204337d);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.2322420723808665d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8079471069956126d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9999971097955397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8813715433348934d + "'", double1 == 0.8813715433348934d);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0997245430382514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048677520994062d + "'", double1 == 1.048677520994062d);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        double double2 = org.apache.commons.math.util.FastMath.min(0.396067466391991d, (-0.8011436155469335d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8011436155469335d) + "'", double2 == (-0.8011436155469335d));
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.007385037334679E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04751431132497118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04753219147216658d + "'", double1 == 0.04753219147216658d);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9036922050915037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.16765036534441544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.943508829600679d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        float float2 = org.apache.commons.math.util.FastMath.max(14.0f, (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        double double1 = org.apache.commons.math.util.FastMath.signum(1261966.2318521824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        int int2 = org.apache.commons.math.util.FastMath.min(4, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 57L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0863843851210684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08285510467138392d + "'", double1 == 0.08285510467138392d);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        long long2 = org.apache.commons.math.util.FastMath.max(4L, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.509815340662585E104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 241.86852796105256d + "'", double1 == 241.86852796105256d);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2366108776907425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8049617190941519d + "'", double1 == 0.8049617190941519d);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8064918000376506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8968071174052793d + "'", double1 == 0.8968071174052793d);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1155899177076452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04750458061756813d + "'", double1 == 0.04750458061756813d);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.668966448431096E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        double double2 = org.apache.commons.math.util.FastMath.max(144.54565322796893d, 2.99822295029797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.54565322796893d + "'", double2 == 144.54565322796893d);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        long long1 = org.apache.commons.math.util.FastMath.round(3.810422597041198d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.286032070646461d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.286032070646461d + "'", double1 == 1.286032070646461d);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0026393956876864535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0026428819590263d + "'", double1 == 1.0026428819590263d);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1276259652063807d + "'", double1 == 1.1276259652063807d);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        int int2 = org.apache.commons.math.util.FastMath.min(88, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.37666586311390227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31966453461015937d + "'", double1 == 0.31966453461015937d);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2531245894439322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8972728802522751d + "'", double1 == 0.8972728802522751d);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.19006280234111014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19238496354839055d + "'", double1 == 0.19238496354839055d);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.258096538021482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2580965380214826d + "'", double1 == 3.2580965380214826d);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9163193327076803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1587902392173515d + "'", double1 == 1.1587902392173515d);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8416276283141133d, 0.43038050860940513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0980966064439257d + "'", double2 == 1.0980966064439257d);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2182829050172777d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8287400822951458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3643135933151023d + "'", double1 == 1.3643135933151023d);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5796414510841192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1924023244417262d, 1.2369623959457472d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13019523074717101d + "'", double2 == 0.13019523074717101d);
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.7385302264922817d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.824221434472614d) + "'", double1 == (-0.824221434472614d));
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.001905171600991387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684043449710089E-19d + "'", double1 == 2.1684043449710089E-19d);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9916765892091398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.4359627388413443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.203690117036716d + "'", double1 == 4.203690117036716d);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        long long2 = org.apache.commons.math.util.FastMath.min(44L, (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.092046153706293E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3445697418011234E-5d + "'", double1 == 2.3445697418011234E-5d);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        double double1 = org.apache.commons.math.util.FastMath.asin(263.4582887262702d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        double double1 = org.apache.commons.math.util.FastMath.log10(99.95436267781281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9998017543876165d + "'", double1 == 1.9998017543876165d);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.9066329018748125E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.59459942804923d + "'", double1 == 36.59459942804923d);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.542519758633026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4948929599538448d + "'", double1 == 0.4948929599538448d);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.15268415727515278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15388751528792635d + "'", double1 == 0.15388751528792635d);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        long long1 = org.apache.commons.math.util.FastMath.round(45.68168005192165d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 46L + "'", long1 == 46L);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2722241413791169d + "'", double1 == 0.2722241413791169d);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0104439773554954d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5511365515703515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1575773237257143d + "'", double1 == 1.1575773237257143d);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.027726343135365997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3026663907504371d + "'", double1 == 0.3026663907504371d);
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2865589353893525d) + "'", double1 == (-1.2865589353893525d));
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 18L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 18L + "'", long1 == 18L);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999854664199463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4604935143691005d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6309721748208414d + "'", double1 == 0.6309721748208414d);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        double double1 = org.apache.commons.math.util.FastMath.log(0.19611987320636162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.629029208709809d) + "'", double1 == (-1.629029208709809d));
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.704649483450097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.704649483450097d + "'", double1 == 2.704649483450097d);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.03833419802937044d), 0.7623282273954516d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        double double1 = org.apache.commons.math.util.FastMath.log(0.679230018528973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38679544806976135d) + "'", double1 == (-0.38679544806976135d));
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2405171239L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        int int1 = org.apache.commons.math.util.FastMath.abs(2105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2105 + "'", int1 == 2105);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0259126351421606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6499263854931472d + "'", double1 == 1.6499263854931472d);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        float float2 = org.apache.commons.math.util.FastMath.max(2105.0f, 26.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7377665079155183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        double double1 = org.apache.commons.math.util.FastMath.exp(84.71050998855853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.156119580207122E36d + "'", double1 == 6.156119580207122E36d);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.02109732960109633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14524919828039096d + "'", double1 == 0.14524919828039096d);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4079121250653364d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.31381977877042333d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3138197787704233d) + "'", double1 == (-0.3138197787704233d));
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.602750627100152d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5473041341731993d + "'", double1 == 0.5473041341731993d);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.362024899653887E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.362024899651152E-7d + "'", double1 == 9.362024899651152E-7d);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.15162199145840144d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.623619432322562d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1753343083323213d) + "'", double1 == (-1.1753343083323213d));
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5429184913088887d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.155529386654044d + "'", double1 == 1.155529386654044d);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        double double1 = org.apache.commons.math.util.FastMath.log(7.165189640442122E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-37.174712052356604d) + "'", double1 == (-37.174712052356604d));
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2110835568321547E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110762232744568E-5d + "'", double1 == 1.2110762232744568E-5d);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-0.009450024787102135d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(68204.64473888976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.8574555638581d + "'", double1 == 40.8574555638581d);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.9295201403190069d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.38248989944038d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.89629601826829E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.518030551660861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 316.1598618344127d + "'", double1 == 316.1598618344127d);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.027708598556821545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5875857535281581d + "'", double1 == 1.5875857535281581d);
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.45107473510890356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7669190063698558d + "'", double1 == 0.7669190063698558d);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6929693744344996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.9511362998119728d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5554654490571869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9382343789067358d + "'", double1 == 0.9382343789067358d);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6949885829579836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8336597525117688d + "'", double1 == 0.8336597525117688d);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.073807815489322d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.932612730167286d + "'", double1 == 0.932612730167286d);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7352096506293136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3075995814907488d) + "'", double1 == (-0.3075995814907488d));
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.09507068650612026d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0016592965016631427d + "'", double1 == 0.0016592965016631427d);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.9166666666666665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4648867983026508d + "'", double1 == 0.4648867983026508d);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.02945984966136309d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029451331531531028d) + "'", double1 == (-0.029451331531531028d));
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.024137633434945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30624003949636625d + "'", double1 == 0.30624003949636625d);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        float float1 = org.apache.commons.math.util.FastMath.abs(5.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.0f + "'", float1 == 5.0f);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.37357877856082744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7202126291763723d + "'", double1 == 0.7202126291763723d);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.1373220393635002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75955366192464d + "'", double1 == 0.75955366192464d);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999999999675755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        long long2 = org.apache.commons.math.util.FastMath.max(14L, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9995740182847914d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8810723403798068d + "'", double1 == 0.8810723403798068d);
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8993090504883884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4579042365744073d + "'", double1 == 2.4579042365744073d);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.2679097686563057d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.881359054820088d + "'", double1 == 4.881359054820088d);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015420704664949368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1732412164843911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15977018918185268d + "'", double1 == 0.15977018918185268d);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.05448811598105866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.055999926816023d + "'", double1 == 1.055999926816023d);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9751426940447304d, (-1.5133088735275844d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9751426940447304d + "'", double2 == 0.9751426940447304d);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.12249813260893226d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13067619556339166d) + "'", double1 == (-0.13067619556339166d));
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.1474836459999945E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6865874069331717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01198321085371399d + "'", double1 == 0.01198321085371399d);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.22615662736669362d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        double double2 = org.apache.commons.math.util.FastMath.max(3.629122766574956d, 1.1805916207174113E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1805916207174113E21d + "'", double2 == 1.1805916207174113E21d);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1842287361344372d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9879690512915179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7564949900863757d + "'", double1 == 0.7564949900863757d);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1478035149914898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1478035149914898d + "'", double1 == 1.1478035149914898d);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.558278729101541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5582787291015412d + "'", double1 == 1.5582787291015412d);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        double double1 = org.apache.commons.math.util.FastMath.tan(13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6051676105323389d + "'", double1 == 0.6051676105323389d);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5894625297255608d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(54.31009080891797d, 1.3131479741286372d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.31009080891796d + "'", double2 == 54.31009080891796d);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0013377559375205616d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        double double1 = org.apache.commons.math.util.FastMath.floor(4342.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4342.0d + "'", double1 == 4342.0d);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        double double1 = org.apache.commons.math.util.FastMath.log(2.7755575615628914E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-38.123094930796995d) + "'", double1 == (-38.123094930796995d));
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573L, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.003368179841877693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003368173473419234d + "'", double1 == 0.003368173473419234d);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) 2105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        double double2 = org.apache.commons.math.util.FastMath.min(2.9386097226368193d, 0.5490176387842941d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5490176387842941d + "'", double2 == 0.5490176387842941d);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        double double1 = org.apache.commons.math.util.FastMath.cos(54.31009080891797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6192448679483495d) + "'", double1 == (-0.6192448679483495d));
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.020877862358127622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02088089633707753d + "'", double1 == 0.02088089633707753d);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        double double2 = org.apache.commons.math.util.FastMath.max(0.029954387626321317d, 3.2503203288452633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2503203288452633d + "'", double2 == 3.2503203288452633d);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(25.306852819440053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44168790501683897d + "'", double1 == 0.44168790501683897d);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.833489212424966E38d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2.232738956216599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4419694136099652d + "'", double1 == 1.4419694136099652d);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.003368179841877693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.472604727668263d) + "'", double1 == (-2.472604727668263d));
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.261725192512572E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.623785737698326E-10d + "'", double1 == 9.623785737698326E-10d);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.94744238847516E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9709393822234024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1588830833596715d) + "'", double1 == (-4.1588830833596715d));
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2147483647L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6983555819361141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9373799744831653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2150303696947626d + "'", double1 == 1.2150303696947626d);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.0161683420890135d, 2.675640048483193E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }
}

