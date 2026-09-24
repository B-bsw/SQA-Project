package org.apache.commons.math3.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        double double2 = org.apache.commons.math3.util.FastMath.min(3.973642758047122E-8d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.1927423644675912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9293847018729513d + "'", double1 == 0.9293847018729513d);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-3.4023066454805946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05938145312611983d) + "'", double1 == (-0.05938145312611983d));
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        double double1 = org.apache.commons.math3.util.FastMath.cos((-44.55243935826922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8418242266486727d + "'", double1 == 0.8418242266486727d);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        float float2 = org.apache.commons.math3.util.FastMath.max((-3.0948501E26f), 1.1368684E-13f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1368684E-13f + "'", float2 == 1.1368684E-13f);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-63));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-62.999996f) + "'", float1 == (-62.999996f));
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-0.9867447596805989d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9867447596805988d) + "'", double1 == (-0.9867447596805988d));
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(3.056285E-37f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.24E-44f + "'", float1 == 2.24E-44f);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(9069942.243593039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.196694109852979E8d + "'", double1 == 5.196694109852979E8d);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.4184699583316451d), 0.9021813597714503d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9945090808761636d + "'", double2 == 0.9945090808761636d);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        int int1 = org.apache.commons.math3.util.FastMath.round(9.2233709E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.1948514127726066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8320774294189782d + "'", double1 == 0.8320774294189782d);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(5.233070557154263E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.233070543461749E-9d + "'", double1 == 5.233070543461749E-9d);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.4781431851220553E200d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 460.90780529426263d + "'", double1 == 460.90780529426263d);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(750.0030809757644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.621409754253409d + "'", double1 == 6.621409754253409d);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 25, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 25L + "'", long2 == 25L);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.8052885407089897d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0405935286659937d) + "'", double1 == (-1.0405935286659937d));
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.0619928668337089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0202514011976098d + "'", double1 == 1.0202514011976098d);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(2.01744846757651d, (double) 3.1691263E29f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.365945276916502E-30d + "'", double2 == 6.365945276916502E-30d);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.9999999999813518d, (-2.169280592675679E-8d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999999999981352d + "'", double2 == 0.999999999981352d);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-2147483648), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.14748352E9f) + "'", float2 == (-2.14748352E9f));
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-0.04132408178025465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.041300583086831065d) + "'", double1 == (-0.041300583086831065d));
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.120521553928585d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2606768457949564d + "'", double1 == 1.2606768457949564d);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-1.17136825E21f), 17);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.5353358E26f) + "'", float2 == (-1.5353358E26f));
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.5463474835799746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.220200232155833d + "'", double1 == 1.220200232155833d);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.49999999999211775d, 1.7627472583327795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49999999999211775d + "'", double2 == 0.49999999999211775d);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.699521118285311d, 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3183197410027853E-4d + "'", double2 == 1.3183197410027853E-4d);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        int int2 = org.apache.commons.math3.util.FastMath.max(62, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        double double2 = org.apache.commons.math3.util.FastMath.log(2.7182480630556016d, 3.191374943865368E23d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.12058124794998d + "'", double2 == 54.12058124794998d);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        double double1 = org.apache.commons.math3.util.FastMath.asin(6.666666666666755E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.666667160494014E-4d + "'", double1 == 6.666667160494014E-4d);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(1.355327355879784E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.7057641025183d + "'", double1 == 97.7057641025183d);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(52.000008f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.3012989018466428d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2261911708835174d + "'", double1 == 1.2261911708835174d);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        double double1 = org.apache.commons.math3.util.FastMath.exp(7.677028874569825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2158.197959725427d + "'", double1 == 2158.197959725427d);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        int int2 = org.apache.commons.math3.util.FastMath.max((-10), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 32.000008f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1833.465381550741d + "'", double1 == 1833.465381550741d);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079215E11f, (-1.8171204965576213d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079207E11f + "'", float2 == 1.03079207E11f);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) 15L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(5.684342E-14f, 1.5373482451913212d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.6843426E-14f + "'", float2 == 5.6843426E-14f);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.01294875932935354d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.734723475976807E-18d + "'", double1 == 1.734723475976807E-18d);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.5707453850936495d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        double double2 = org.apache.commons.math3.util.FastMath.pow(2.3768448754279146E32d, (-149));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.3129131773544485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3049757433332023d + "'", double1 == 2.3049757433332023d);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(32768.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 32768.0d + "'", double1 == 32768.0d);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.24611750286723066d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24126560212316137d) + "'", double1 == (-0.24126560212316137d));
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.9999999801317847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709740730538d) + "'", double1 == (-0.8414709740730538d));
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.7515979658790339d), (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.02348743643371981d) + "'", double2 == (-0.02348743643371981d));
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-127), 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-105.99999f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.41078129050290885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.007169486024867073d + "'", double1 == 0.007169486024867073d);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 187, (-4.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 187.0f + "'", float2 == 187.0f);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-126.99998f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        int int2 = org.apache.commons.math3.util.FastMath.min(18, (-3));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-3) + "'", int2 == (-3));
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        double double1 = org.apache.commons.math3.util.FastMath.acos(12.054594532724904d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        int int1 = org.apache.commons.math3.util.FastMath.abs(18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        double double1 = org.apache.commons.math3.util.FastMath.floor(15.560636497313808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.40180391273652716d, (-7.263102063200969E31d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.263102063200969E31d + "'", double2 == 7.263102063200969E31d);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.142794603177835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.142794603177835d + "'", double1 == 0.142794603177835d);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.7798115718222205d, 0.7152939446264618d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7798115718222205d + "'", double2 == 0.7798115718222205d);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (-1023L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(6.811682183676626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8956207714771849d + "'", double1 == 1.8956207714771849d);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(35.000004f, (-17));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.6702884E-4f + "'", float2 == 2.6702884E-4f);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.1630855981951917d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7715357200183153d + "'", double1 == 0.7715357200183153d);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.13970367520817575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-12.125f), 689.5549024078317d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-12.124999f) + "'", float2 == (-12.124999f));
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.030335641787932688d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03034029473695931d + "'", double1 == 0.03034029473695931d);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.3817208956030992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.06537329234338424d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5563207343123242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.2922328441437454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6831251162316458d + "'", double1 == 1.6831251162316458d);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.172561628611239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 181.7743915645749d + "'", double1 == 181.7743915645749d);
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(5.233070557154263E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.233070557154263E-9d + "'", double1 == 5.233070557154263E-9d);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.092963241182991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0929632411829913d + "'", double1 == 1.0929632411829913d);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        int int2 = org.apache.commons.math3.util.FastMath.min(0, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) 14.999999f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.03034029473695931d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.49527859064093d) + "'", double1 == (-3.49527859064093d));
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.3618317991931828E34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((-2.778726E7f), (float) 75L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.778726E7f + "'", float2 == 2.778726E7f);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.09951163E12f + "'", float1 == 1.09951163E12f);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        int int2 = org.apache.commons.math3.util.FastMath.min(35, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 128);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 128L + "'", long1 == 128L);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 12.125f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.125000000000002d + "'", double1 == 12.125000000000002d);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 9.094949E-13f, (-0.7775867565969075d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.307158536735294E9d + "'", double2 == 2.307158536735294E9d);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.9999999801317847d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.1529215E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4918373962705977d + "'", double1 == 1.4918373962705977d);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(101.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.8114214365648633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7415620755075767d + "'", double1 == 0.7415620755075767d);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.2958765778522976d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.9939386574859939d), 0.5645439425056553d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.46227637316155d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.1235582092889473E307d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.008949316167871405d, (double) 1.2207033E-4f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008950148660065434d + "'", double2 == 0.008950148660065434d);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        float float2 = org.apache.commons.math3.util.FastMath.max((-17.0f), 1.23794004E27f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.23794004E27f + "'", float2 == 1.23794004E27f);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.2334054821199578d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3310261664379639d + "'", double1 == 0.3310261664379639d);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.8526676855528264E78d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0615003922244727E80d + "'", double1 == 1.0615003922244727E80d);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(2.2557079554805255d, (double) 144.00002f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.255707955480526d + "'", double2 == 2.255707955480526d);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        long long2 = org.apache.commons.math3.util.FastMath.min(384L, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.006732012348487d, (double) 72L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0067320123484873d + "'", double2 == 1.0067320123484873d);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.307896633423856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1619207976332557d + "'", double1 == 1.1619207976332557d);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        int int2 = org.apache.commons.math3.util.FastMath.min(113, (-149));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-149) + "'", int2 == (-149));
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-95), (-4.5474735E-13f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-95.0f) + "'", float2 == (-95.0f));
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.1415126117084844d, 0.999999777777786d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14151261170848442d + "'", double2 == 0.14151261170848442d);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        double double1 = org.apache.commons.math3.util.FastMath.signum(0.4305321337581916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(455.00418673529737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.81345259352101d + "'", double1 == 6.81345259352101d);
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8139312059190631d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(718053.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(7.555788E22f, (float) (-6L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.555788E22f) + "'", float2 == (-7.555788E22f));
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(3.2831173789857327E-17d, 0.0027304059504153545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.2831173789857327E-17d + "'", double2 == 3.2831173789857327E-17d);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-20), 75.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 20.0f + "'", float2 == 20.0f);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(148.99998474121094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 149.0d + "'", double1 == 149.0d);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(52.11725091815784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2986.098517434759d + "'", double1 == 2986.098517434759d);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(3.292518830274316E33d, 0.05010842414258889d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 91555L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0078125f + "'", float1 == 0.0078125f);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 46, (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.483820718218251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9962200055527257d + "'", double1 == 0.9962200055527257d);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.1754644578327482d, (-58));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.078211580357636E-18d + "'", double2 == 4.078211580357636E-18d);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(749.99994f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.1035156E-5f + "'", float1 == 6.1035156E-5f);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(65.7845440269863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1481568901940804d + "'", double1 == 1.1481568901940804d);
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        double double2 = org.apache.commons.math3.util.FastMath.log(79.0d, 1.5851655638965927d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10543411299233287d + "'", double2 == 0.10543411299233287d);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        double double1 = org.apache.commons.math3.util.FastMath.asin(4.176194859519057E-53d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.176194859519057E-53d + "'", double1 == 4.176194859519057E-53d);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.8446748471756063E19d, (-0.2904083499766355d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.12522031689999574d) + "'", double2 == (-0.12522031689999574d));
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        int int2 = org.apache.commons.math3.util.FastMath.max(76, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 76 + "'", int2 == 76);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.4564611501574685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-1.5707962303827807d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.4958590114270875d), 1.5707962971309473d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.4958590114270875d) + "'", double2 == (-0.4958590114270875d));
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9868344195994365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.154986906341471d + "'", double1 == 1.154986906341471d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.0677263196157526E20d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-10L), (-1.17136825E21f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.17136825E21f) + "'", float2 == (-1.17136825E21f));
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) (-17L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29670597283903605d) + "'", double1 == (-0.29670597283903605d));
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5723611106383126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027442878410953393d + "'", double1 == 0.027442878410953393d);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.7453293851523843d, 0.8414710492169446d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453293851523843d + "'", double2 == 1.7453293851523843d);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5705714871469996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.917116616662696d + "'", double1 == 0.917116616662696d);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.589505306405459E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.589505306405459E-4d + "'", double1 == 1.589505306405459E-4d);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 4.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-3.0f), (-12));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.324219E-4f) + "'", float2 == (-7.324219E-4f));
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(5.877472E-39f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.10172233398898892d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10189858341669025d) + "'", double1 == (-0.10189858341669025d));
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-3.0948500982134503E26d), 3.3166247903554003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.8666209983995007E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47407643548680184d) + "'", double1 == (-0.47407643548680184d));
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        double double1 = org.apache.commons.math3.util.FastMath.rint(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.355466754254918d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(20.50895781851543d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        float float2 = org.apache.commons.math3.util.FastMath.min(1023.0f, 1.2676506E30f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1023.0f + "'", float2 == 1023.0f);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((-0.15655890067882908d), 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5253244.986822524d) + "'", double2 == (-5253244.986822524d));
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(1.5707949341414806d, 1.734723475976807E-18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707949341414806d + "'", double2 == 1.5707949341414806d);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.027046513573097505d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026684031931997858d) + "'", double1 == (-0.026684031931997858d));
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        double double1 = org.apache.commons.math3.util.FastMath.rint(1.5707961462678175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.9604644775390625E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.960464477539055E-8d + "'", double1 == 5.960464477539055E-8d);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.8144606961796d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 123.28030883746575d + "'", double1 == 123.28030883746575d);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.1374665693876721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13703725790411278d + "'", double1 == 0.13703725790411278d);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.026931837701290245d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8894854184948215d, 2.0705304252072893E41d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-812.3305865367872d) + "'", double2 == (-812.3305865367872d));
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 4096.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5705521861747473d + "'", double1 == 1.5705521861747473d);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        double double2 = org.apache.commons.math3.util.FastMath.min(23844.919681868952d, 3.748066029033894E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23844.919681868952d + "'", double2 == 23844.919681868952d);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.0771875889955993d, 0.5483703652841707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0771875889955993d + "'", double2 == 0.0771875889955993d);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 2979L, 1025);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 9.536743E-7f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.536743164062502E-7d + "'", double1 == 9.536743164062502E-7d);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 0, (-0.8673958914208877d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.4E-45f) + "'", float2 == (-1.4E-45f));
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.031250004f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.7252903E-9f + "'", float1 == 3.7252903E-9f);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(13.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        double double2 = org.apache.commons.math3.util.FastMath.pow(91.0d, (-4));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4582582117691621E-8d + "'", double2 == 1.4582582117691621E-8d);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.03079199E11f, 0.027442878410953393d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.03079191E11f + "'", float2 == 1.03079191E11f);
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        double double2 = org.apache.commons.math3.util.FastMath.max(3.97364275804712E-8d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.97364275804712E-8d + "'", double2 == 3.97364275804712E-8d);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0092655E-36f + "'", float1 == 3.0092655E-36f);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.920357019063927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5101864143818207d + "'", double1 == 1.5101864143818207d);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (-1.9843744f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9156887001523807d) + "'", double1 == (-0.9156887001523807d));
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1031.411577317404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.013432001936747d + "'", double1 == 3.013432001936747d);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.2599210498948732d), 76);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.22759351940662E7d + "'", double2 == 4.22759351940662E7d);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        double double1 = org.apache.commons.math3.util.FastMath.acos((-1.2470996758325352d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        double double1 = org.apache.commons.math3.util.FastMath.abs(2.9932228461263812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228461263812d + "'", double1 == 2.9932228461263812d);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6080833036297886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010613055774744197d + "'", double1 == 0.010613055774744197d);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 149, (-61944147371L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 149L + "'", long2 == 149L);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(8192.0f, 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) 'a', (-1023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(31.999994f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        int int2 = org.apache.commons.math3.util.FastMath.min((-58), 46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-58) + "'", int2 == (-58));
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        int int2 = org.apache.commons.math3.util.FastMath.max((-106), 106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        long long2 = org.apache.commons.math3.util.FastMath.max(5447015486L, 58L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.2599960997248316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.113227431294952d + "'", double1 == 3.113227431294952d);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(223.23772953327423d, (double) 5.8058397E32f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 223.23772953327423d + "'", double2 == 223.23772953327423d);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        double double1 = org.apache.commons.math3.util.FastMath.asin(859.4367473377482d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        double double1 = org.apache.commons.math3.util.FastMath.signum(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.0d, 0.6795639535619324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6795639535619324d + "'", double2 == 0.6795639535619324d);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.02735579744613546d), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.346895724234661E-16d + "'", double2 == 2.346895724234661E-16d);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(6.70949768864047E-4d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.4337808304830271d, 0.7615941559557649d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8764653257719432d + "'", double2 == 0.8764653257719432d);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(57.95729927114847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8699264691708812d + "'", double1 == 3.8699264691708812d);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.2606768457949564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9522971143772588d + "'", double1 == 0.9522971143772588d);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        float float2 = org.apache.commons.math3.util.FastMath.min(3.7778936E22f, (float) 76L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 76.0f + "'", float2 == 76.0f);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.15349285356613754d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15409628067323952d + "'", double1 == 0.15409628067323952d);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        float float1 = org.apache.commons.math3.util.FastMath.abs(175.00002f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 175.00002f + "'", float1 == 175.00002f);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.42637126919570534d, (-7));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 390.3772262159567d + "'", double2 == 390.3772262159567d);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        double double2 = org.apache.commons.math3.util.FastMath.max(7.6770294200238824d, 2.2244673757305733E-65d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.6770294200238824d + "'", double2 == 7.6770294200238824d);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 9, 33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.7309411E10f + "'", float2 == 7.7309411E10f);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 1.0842026E-19f, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        double double1 = org.apache.commons.math3.util.FastMath.cos(3.733241996798949E32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8100774437579773d) + "'", double1 == (-0.8100774437579773d));
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(4.76837158203125E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.5707543717664076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9171456716268348d + "'", double1 == 0.9171456716268348d);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0872902135394655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4648862355425744d + "'", double1 == 0.4648862355425744d);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        float float2 = org.apache.commons.math3.util.FastMath.max(5.999999f, (-1.2676506E30f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.999999f + "'", float2 == 5.999999f);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.602619601945246E39d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.938953933193034E-64d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.938953933193034E-64d + "'", double1 == 1.938953933193034E-64d);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) (-2.09E-43f), 7.306979419100936E85d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0879347118439774E-43d) + "'", double2 == (-2.0879347118439774E-43d));
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (-54.0f), (-1023));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.5828755547221693d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6592860918491319d) + "'", double1 == (-0.6592860918491319d));
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        long long2 = org.apache.commons.math3.util.FastMath.max(4096L, (long) 79);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4096L + "'", long2 == 4096L);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        long long1 = org.apache.commons.math3.util.FastMath.round(100.00371790007361d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((double) 106.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.732623491163369d + "'", double1 == 4.732623491163369d);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        long long1 = org.apache.commons.math3.util.FastMath.abs(63L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 63L + "'", long1 == 63L);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.648027917416435E219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 219.7518968347063d + "'", double1 == 219.7518968347063d);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(1.762747174039086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.828427124746191d + "'", double1 == 4.828427124746191d);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.6215812094469404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.199482114212278d + "'", double1 == 1.199482114212278d);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.7182818284590458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1364211033963856d + "'", double1 == 1.1364211033963856d);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.9172426875149238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.5023810222358853d + "'", double1 == 2.5023810222358853d);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        float float1 = org.apache.commons.math3.util.FastMath.abs(6.338253E29f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6.338253E29f + "'", float1 == 6.338253E29f);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 2.14748365E9f, (-14));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 131072.0d + "'", double2 == 131072.0d);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-0.0017254937309181956d), 1.5609003851579142d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5609013388791557d + "'", double2 == 1.5609013388791557d);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.8426967805898358d, 0.008949196713333642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8427442981938755d + "'", double2 == 0.8427442981938755d);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) 63L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 63.0d + "'", double1 == 63.0d);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(89.94404710810622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1539934375120782E39d + "'", double1 == 1.1539934375120782E39d);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.159127075050616d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        double double1 = org.apache.commons.math3.util.FastMath.exp(101.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.307059979368067E43d + "'", double1 == 7.307059979368067E43d);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.3187334977903953E21d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.8091056466488195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2458984613822286d + "'", double1 == 1.2458984613822286d);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.5145744929332654d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 750.0d + "'", double1 == 750.0d);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        int int1 = org.apache.commons.math3.util.FastMath.round(4.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.14151261170848442d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.108075398769754d + "'", double1 == 8.108075398769754d);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(33.418366853490404d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.418366853490404d + "'", double2 == 33.418366853490404d);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(35.000004f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.193615433083745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1948273773478871d + "'", double1 == 0.1948273773478871d);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.4293757289532156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15514640343243516d + "'", double1 == 0.15514640343243516d);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        float float1 = org.apache.commons.math3.util.FastMath.abs((-14.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 14.0f + "'", float1 == 14.0f);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7415620755075767d, (-0.8604993868447559d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4302987128940274d + "'", double2 == 2.4302987128940274d);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(3.5963016834733655E18d, 2.2779475125273763d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.596301683473365E18d + "'", double2 == 3.596301683473365E18d);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        long long2 = org.apache.commons.math3.util.FastMath.max(1L, (-10L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        float float1 = org.apache.commons.math3.util.FastMath.signum(3.9443045E-31f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.4285721902064785d), 1024);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 46);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        int int1 = org.apache.commons.math3.util.FastMath.round((-41.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-41) + "'", int1 == (-41));
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(689.5549024078317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.537495480778778d + "'", double1 == 6.537495480778778d);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        double double1 = org.apache.commons.math3.util.FastMath.atan(18.02648051389328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5153791807308472d + "'", double1 == 1.5153791807308472d);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        double double1 = org.apache.commons.math3.util.FastMath.tan(3.689503773740456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6102347996486217d + "'", double1 == 0.6102347996486217d);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.7931961188674407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7931961188674408d + "'", double1 == 0.7931961188674408d);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-0.002893947719693431d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.002893955798593638d) + "'", double1 == (-0.002893955798593638d));
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.09951163E12f, 5.684342E-14f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.684342E-14f + "'", float2 == 5.684342E-14f);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4096.000976562497d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7381034178687166d) + "'", double1 == (-0.7381034178687166d));
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8123449763706567d, 1.2334031175080034d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8123449763706567d + "'", double2 == 1.8123449763706567d);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        float float2 = org.apache.commons.math3.util.FastMath.min(1.15292164E18f, (float) 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1018.0f + "'", float2 == 1018.0f);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.5537689358093707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1975712214073553d + "'", double1 == 1.1975712214073553d);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(8.69889334015925E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.698515008372825E-5d + "'", double1 == 8.698515008372825E-5d);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.8125409412719369d), (double) 2.5243549E-29f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.8125409412719367d) + "'", double2 == (-1.8125409412719367d));
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.3669495678698107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.366949567869811d + "'", double1 == 1.366949567869811d);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-95.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.5635500768149997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.58482045885515d + "'", double1 == 89.58482045885515d);
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        double double2 = org.apache.commons.math3.util.FastMath.log(4.722257605773872E-8d, 0.41447385747550813d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05221275892338193d + "'", double2 == 0.05221275892338193d);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) 10, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-8537.071147449265d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.764356722354419d) + "'", double1 == (-4.764356722354419d));
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(0.04687067344618581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04580540319523005d + "'", double1 == 0.04580540319523005d);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        int int2 = org.apache.commons.math3.util.FastMath.max(54, 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 79, (long) 8);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (-4.5474735E-13f), 1.627430214775713E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.547473508864641E-13d + "'", double2 == 4.547473508864641E-13d);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.007169486024867073d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-8) + "'", int1 == (-8));
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 128, 1018);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5685946486297746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9433589200145089d + "'", double1 == 0.9433589200145089d);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        double double2 = org.apache.commons.math3.util.FastMath.max((-40.20253647247683d), 1.2430450186027935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2430450186027935d + "'", double2 == 1.2430450186027935d);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        double double1 = org.apache.commons.math3.util.FastMath.log(4.784919240787009E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.6448712247921655d) + "'", double1 == (-7.6448712247921655d));
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5.104235503814077E41d, (-13));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.230756230241793E37d + "'", double2 == 6.230756230241793E37d);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(55.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5628918379719732d, 1.1927423644675912d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7033631291413862d + "'", double2 == 1.7033631291413862d);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.221356488779385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9767456046870426d + "'", double1 == 0.9767456046870426d);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.09220376963371194d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09207362133081386d) + "'", double1 == (-0.09207362133081386d));
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-6.0f), 2.4302987128940274d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.9999995f) + "'", float2 == (-5.9999995f));
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-1.4655091713670404E-8d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4655091713670404E-8d) + "'", double1 == (-1.4655091713670404E-8d));
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(104.9952379872535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.71762265949589d + "'", double1 == 4.71762265949589d);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        double double1 = org.apache.commons.math3.util.FastMath.asin((-0.15655567643651128d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15720235618409836d) + "'", double1 == (-0.15720235618409836d));
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        float float2 = org.apache.commons.math3.util.FastMath.min(9.094948E-13f, (float) (-17L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-17.0f) + "'", float2 == (-17.0f));
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        float float1 = org.apache.commons.math3.util.FastMath.abs(1.0842023E-19f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0842023E-19f + "'", float1 == 1.0842023E-19f);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 15L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-3.4023066454805946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.402306645480594d) + "'", double1 == (-3.402306645480594d));
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        float float2 = org.apache.commons.math3.util.FastMath.min(113.0f, (float) 1018);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 113.0f + "'", float2 == 113.0f);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.9760322118920343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01703497570303895d + "'", double1 == 0.01703497570303895d);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((-5.8058397E32f), 1.3484654383204928E18d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.8058394E32f) + "'", float2 == (-5.8058394E32f));
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        float float2 = org.apache.commons.math3.util.FastMath.max(138.00003f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 138.00003f + "'", float2 == 138.00003f);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        int int2 = org.apache.commons.math3.util.FastMath.max((-58), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 127, (long) 1018);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) '#', (-10));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-2.667490975180856d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6674909751808555d) + "'", double1 == (-2.6674909751808555d));
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(2.299249233707907E97d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.9971213268799871d, 18);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9494325008304088d + "'", double2 == 0.9494325008304088d);
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.961121328055908E-308d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-5.4470149E9f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.120909654024235E11d) + "'", double1 == (-3.120909654024235E11d));
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (-1023), (float) 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 138.00003f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.563508956048186E59d + "'", double1 == 8.563508956048186E59d);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 1023, (-0.5018895836882269d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1022.9999999999999d + "'", double2 == 1022.9999999999999d);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 35.00001f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.47382873378529766d + "'", double1 == 0.47382873378529766d);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.8996937401571155d, (double) 31.999998f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8996937401571155d + "'", double2 == 1.8996937401571155d);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.731673471130767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998140599709003d) + "'", double1 == (-0.9998140599709003d));
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(1024.0001f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1024.0002f + "'", float1 == 1024.0002f);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        double double1 = org.apache.commons.math3.util.FastMath.atan(2.2837568197948556E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2837568197948556E-15d + "'", double1 == 2.2837568197948556E-15d);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(10.067661995777765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 576.8345419223211d + "'", double1 == 576.8345419223211d);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.6714065E24f, 0.18387663746222113d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.671406E24f + "'", float2 == 9.671406E24f);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.414424815716438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6437583519585885d + "'", double1 == 0.6437583519585885d);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.734723475976807E-18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(32.00001402957443d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.031249986299249726d + "'", double2 == 0.031249986299249726d);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        double double1 = org.apache.commons.math3.util.FastMath.log10(2.2844135865397565E222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 222.35877473446493d + "'", double1 == 222.35877473446493d);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-23.111480753557903d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.44701491200001E9d) + "'", double1 == (-5.44701491200001E9d));
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(5.447015424E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.506835355571496E7d + "'", double1 == 9.506835355571496E7d);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        int int1 = org.apache.commons.math3.util.FastMath.round((-148.99997f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        double double2 = org.apache.commons.math3.util.FastMath.min(3050885.6675126073d, 9.848857801796104d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.848857801796104d + "'", double2 == 9.848857801796104d);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(3.7778932E22f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.16244735150962653d, (-2.0006493254743547d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0605730817257655d + "'", double2 == 3.0605730817257655d);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.4290008686463924d, 5.30829220390157d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.30829220390157d + "'", double2 == 5.30829220390157d);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.8429167374147226d, (double) 62.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.15123493877053d) + "'", double2 == (-24.15123493877053d));
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(1.03079191E11f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8192.0f + "'", float1 == 8192.0f);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((-0.6358572501411002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((-0.014608467344896908d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01450228138603884d) + "'", double1 == (-0.01450228138603884d));
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.16693720083014163d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1826462504974204d) + "'", double1 == (-0.1826462504974204d));
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(1.5347691E22f, (float) 6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.5347691E22f + "'", float2 == 1.5347691E22f);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((-0.9992790497916413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.938917213337377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2194703520389538d + "'", double1 == 1.2194703520389538d);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.9503933001340736E-65d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.2168791772922093E-81d + "'", double1 == 4.2168791772922093E-81d);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-8), (float) 63L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 4.5474732E-13f, 9.736158605041556d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.08008177227575938d) + "'", double2 == (-0.08008177227575938d));
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        float float2 = org.apache.commons.math3.util.FastMath.max(2.14748365E9f, (float) 76L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        float float2 = org.apache.commons.math3.util.FastMath.max(14.999999f, (float) 1024L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.0f + "'", float2 == 1024.0f);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.0d, 0.39592515018183416d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39592515018183416d + "'", double2 == 0.39592515018183416d);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.9978517795247785d, (-106));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.462542442645822E-32d + "'", double2 == 2.462542442645822E-32d);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(4.68213122712422d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2252965223549954d + "'", double1 == 2.2252965223549954d);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.7453293851523841d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.203998096309481d + "'", double1 == 1.203998096309481d);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 6400L, (-3));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 800.0f + "'", float2 == 800.0f);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        int int2 = org.apache.commons.math3.util.FastMath.min(750, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(2.5807420276636606E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.580742027663661E-18d + "'", double1 == 2.580742027663661E-18d);
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2048.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) (short) 1, (double) (-41.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 41L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.3025849976266093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        long long1 = org.apache.commons.math3.util.FastMath.round(0.8320774294189782d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(2.606354165955547d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.989165212670675d + "'", double1 == 0.989165212670675d);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.4617111047443176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-3.0948501E26f), 25);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0384594E34f) + "'", float2 == (-1.0384594E34f));
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 8388608L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 5.820766E-11f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0159153328244164E-12d + "'", double1 == 1.0159153328244164E-12d);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.38874545763980906d) + "'", double1 == (-0.38874545763980906d));
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((double) 22026.002f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 384.426255132733d + "'", double1 == 384.426255132733d);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.3601695942848226E29d, (double) (-17.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-17.0d) + "'", double2 == (-17.0d));
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        double double1 = org.apache.commons.math3.util.FastMath.rint((-96.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-97.0d) + "'", double1 == (-97.0d));
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((-0.09715902486194199d), 6.8200151728564355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0142451959845503d) + "'", double2 == (-0.0142451959845503d));
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.9522971143772588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8147495501141983d + "'", double1 == 0.8147495501141983d);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        int int1 = org.apache.commons.math3.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.25110378549586093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316925580547904d + "'", double1 == 1.0316925580547904d);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(2.4576E7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(9.6714065E24f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(138.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.620387737964422d + "'", double1 == 5.620387737964422d);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) 63L, (-6.053128792867637d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.99999999999999d + "'", double2 == 62.99999999999999d);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.026544854745010848d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.9073485E-6f, 90.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.9073486E-6f + "'", float2 == 1.9073486E-6f);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((-1.6290482690107402d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(5.000000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 74.2099485247879d + "'", double1 == 74.2099485247879d);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(2.153330206915566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.24869926123636d + "'", double1 == 4.24869926123636d);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.07726425812829045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07718740615311516d + "'", double1 == 0.07718740615311516d);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(1.0842023E-19f, (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0842024E-19f + "'", float2 == 1.0842024E-19f);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        double double2 = org.apache.commons.math3.util.FastMath.pow(6.81345259352101d, (-3));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00316153711337832d + "'", double2 == 0.00316153711337832d);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.29378315946961E27d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(96.99999f, (double) 63.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.999985f + "'", float2 == 96.999985f);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.6053856514068299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010565972861379823d + "'", double1 == 0.010565972861379823d);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        double double2 = org.apache.commons.math3.util.FastMath.pow(847.3800800113253d, 58);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.738116712752242E169d + "'", double2 == 6.738116712752242E169d);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        long long1 = org.apache.commons.math3.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        int int2 = org.apache.commons.math3.util.FastMath.min(8, 458);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.6110605986256412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.008120017295933d + "'", double1 == 5.008120017295933d);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(7.555788E22f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.0071993E15f + "'", float1 == 9.0071993E15f);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.9999986f, (float) 128L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.9999986f + "'", float2 == 5.9999986f);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.1884223E32f, 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.2169445E35f + "'", float2 == 1.2169445E35f);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.033714142796992426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.033726922260209034d + "'", double1 == 0.033726922260209034d);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((-0.011416138981219515d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.011481803329747568d) + "'", double1 == (-0.011481803329747568d));
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.7615941559557649d, (-0.057144489200644466d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6456887220381655d + "'", double2 == 1.6456887220381655d);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) 52.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        double double1 = org.apache.commons.math3.util.FastMath.atan(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2645189576252271d + "'", double1 == 1.2645189576252271d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.295779513082316d) + "'", double1 == (-57.295779513082316d));
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 2979L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.0000000000005d + "'", double1 == 2979.0000000000005d);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 113);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(0.01327398611765252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013362476578268945d + "'", double1 == 0.013362476578268945d);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.6777110728270873d, (-0.8390715290764524d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0785793105465808d + "'", double2 == 1.0785793105465808d);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        int int1 = org.apache.commons.math3.util.FastMath.round((-1.6210082E32f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        double double2 = org.apache.commons.math3.util.FastMath.max(0.008022730733654788d, 0.5893322666832159d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5893322666832159d + "'", double2 == 0.5893322666832159d);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((-0.7920486373025791d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.223373E19f, (double) (-1.0000001f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E19f + "'", float2 == 9.223372E19f);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.1415126117084844d, 0.2532797083404758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1415126117084844d + "'", double2 == 0.1415126117084844d);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(1.1235582092889473E307d, 567.8714856179881d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1235582092889473E307d + "'", double2 == 1.1235582092889473E307d);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        double double1 = org.apache.commons.math3.util.FastMath.asin(2.998223140086234d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        long long1 = org.apache.commons.math3.util.FastMath.round(2.6299036625652747d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(1.9974303711370634E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.997430371134407E-6d + "'", double1 == 1.997430371134407E-6d);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(7.629395440818717E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.629395440744702E-6d + "'", double1 == 7.629395440744702E-6d);
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-6), (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.877472E-39f, 75.000015f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.877472E-39f + "'", float2 == 5.877472E-39f);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(0.9999991684716266d, 0.7798115718222205d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22018759664940613d + "'", double2 == 0.22018759664940613d);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        double double2 = org.apache.commons.math3.util.FastMath.pow(3.051757812490001E11d, 0.5136814478622124d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 793232.1453335404d + "'", double2 == 793232.1453335404d);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((-1.2676505246703657E30d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2676505246703655E30d) + "'", double1 == (-1.2676505246703655E30d));
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        int int2 = org.apache.commons.math3.util.FastMath.min((-2), 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        int int2 = org.apache.commons.math3.util.FastMath.min(5, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        int int1 = org.apache.commons.math3.util.FastMath.abs(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(11013.21191404869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.9565213251730015d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        double double2 = org.apache.commons.math3.util.FastMath.min(8.644433940529861E10d, 2.8844902699029284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8844902699029284d + "'", double2 == 2.8844902699029284d);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(0.3789102796893686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.709959840322416d + "'", double1 == 21.709959840322416d);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.1564407373162061d, (double) 9.223372E19f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.696133872634648E-21d + "'", double2 == 1.696133872634648E-21d);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(6.285615910267171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8455080609385532d + "'", double1 == 1.8455080609385532d);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-0.06698009627141037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06703019001296902d) + "'", double1 == (-0.06703019001296902d));
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.5481703243545996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1540455170995345d + "'", double1 == 1.1540455170995345d);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.1662430606729808d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.335516632346646d + "'", double1 == 2.335516632346646d);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        float float2 = org.apache.commons.math3.util.FastMath.min((-52.0f), (float) 95L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-52.0f) + "'", float2 == (-52.0f));
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) (-18));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        double double1 = org.apache.commons.math3.util.FastMath.acos(2.3016241492783763E19d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-1.522697550491263d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-87.24414311805793d) + "'", double1 == (-87.24414311805793d));
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.9073486E-6f), 5.8207657E-11f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.9073486E-6f) + "'", float2 == (-1.9073486E-6f));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-6912.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.1641303166053958d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.39440344502654d + "'", double2 == 23.39440344502654d);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-4.732623491163369d), 1.0817453575253018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.732623491163369d + "'", double2 == 4.732623491163369d);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1024.0f, 2.3978950994030255d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.15655890067882908d, (double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999858527384886d + "'", double2 == 0.9999858527384886d);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.9682413013090552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.032273944558377246d) + "'", double1 == (-0.032273944558377246d));
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(5.560083416183179d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        double double1 = org.apache.commons.math3.util.FastMath.log10(1.5428213977454868d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1883156535660207d + "'", double1 == 0.1883156535660207d);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(0.24364487601066484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4936039667695802d + "'", double1 == 0.4936039667695802d);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (-54), 20.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-54), 6400L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-54L) + "'", long2 == (-54L));
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        double double2 = org.apache.commons.math3.util.FastMath.min(8.644433940529861E10d, (double) 1638400.1f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1638400.125d + "'", double2 == 1638400.125d);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.9369601382566869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7125539158461947d + "'", double1 == 1.7125539158461947d);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 79.00001f, 5.119898284918105E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 79.00000762939453d + "'", double2 == 79.00000762939453d);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.81474976710656E14d + "'", double1 == 2.81474976710656E14d);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 4, 4294967296L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4294967296L + "'", long2 == 4294967296L);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 76);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-0.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.203998096309481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-2.204438512506361d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11031244697810666d + "'", double1 == 0.11031244697810666d);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.007169486024867073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0071952483204687d + "'", double1 == 1.0071952483204687d);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4470159E9f + "'", float1 == 5.4470159E9f);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(175.0006414538025d, 11.55574042944425d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 175.0006414538025d + "'", double2 == 175.0006414538025d);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        int int1 = org.apache.commons.math3.util.FastMath.round(12.000003f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        double double1 = org.apache.commons.math3.util.FastMath.signum(35.74434308084386d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        float float1 = org.apache.commons.math3.util.FastMath.signum(138.00003f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        double double2 = org.apache.commons.math3.util.FastMath.log(1.2233801800560518d, 57.29578634327149d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.078731912282265d + "'", double2 == 20.078731912282265d);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(0.4337808304830271d, (-0.04430534570644151d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6725809930368223d + "'", double2 == 1.6725809930368223d);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        long long2 = org.apache.commons.math3.util.FastMath.max(12L, 17L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 17L + "'", long2 == 17L);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 46, (long) (-4));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 5447015486L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.4470154E9f + "'", float2 == 5.4470154E9f);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(7.629395E-6f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-17) + "'", int1 == (-17));
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        double double2 = org.apache.commons.math3.util.FastMath.pow(23.111480858936716d, 0.24117260647275346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.132641710488177d + "'", double2 == 2.132641710488177d);
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 9.999999f, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999046325684d + "'", double2 == 9.999999046325684d);
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(5.95177979919759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.439626979519121d + "'", double1 == 2.439626979519121d);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        int int2 = org.apache.commons.math3.util.FastMath.max(67, 138);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 138 + "'", int2 == 138);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        double double1 = org.apache.commons.math3.util.FastMath.exp((-0.4103302129827837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6634311403861297d + "'", double1 == 0.6634311403861297d);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(96.30685281944005d, 1.0041442383211276d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.30685281944005d + "'", double2 == 96.30685281944005d);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(2.0677263196157526E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        int int2 = org.apache.commons.math3.util.FastMath.max(26, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        int int2 = org.apache.commons.math3.util.FastMath.min(4096, (-458));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-458) + "'", int2 == (-458));
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.1365081616962985d, 2.71828215250351d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5021666895493118d) + "'", double2 == (-0.5021666895493118d));
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        double double1 = org.apache.commons.math3.util.FastMath.log10(5.824212550988658E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.76523721589926d + "'", double1 == 9.76523721589926d);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(6400.0f, (-1.9843749f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-6400.0f) + "'", float2 == (-6400.0f));
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        double double2 = org.apache.commons.math3.util.FastMath.max(1.5209081446769386d, 1.6456887220381655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6456887220381655d + "'", double2 == 1.6456887220381655d);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(9.5367431640625E-7d, 1500);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(3000.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3000.0002f + "'", float1 == 3000.0002f);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.2721850946649906d), (-0.41032129904824216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.13813620438325158d + "'", double2 == 0.13813620438325158d);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.46923377193038524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        double double2 = org.apache.commons.math3.util.FastMath.min((-0.058916076536616895d), 6.310887241768095E67d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.058916076536616895d) + "'", double2 == (-0.058916076536616895d));
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.0000000001E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.23003301858504133d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.0d, 0.2519853959658094d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (-138.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        float float1 = org.apache.commons.math3.util.FastMath.abs(106.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 106.0f + "'", float1 == 106.0f);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(5.5795230490737015E-5d, 8.69889334015925E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5795230490737015E-5d + "'", double2 == 5.5795230490737015E-5d);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.028300622637313404d, (-1.7636242638424793d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 537.5887312189672d + "'", double2 == 537.5887312189672d);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 5.4470159E9f, 1.0941931051470568d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447015936E9d + "'", double2 == 5.447015936E9d);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        double double2 = org.apache.commons.math3.util.FastMath.min(222.35877473446493d, 5.6843418860808015E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.6843418860808015E-14d + "'", double2 == 5.6843418860808015E-14d);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        int int2 = org.apache.commons.math3.util.FastMath.min(4, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(3.2281805647428924E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2281805647428924E20d + "'", double1 == 3.2281805647428924E20d);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) 2.3841858E-7f, 27.386127875258307d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.384185791015625E-7d + "'", double2 == 2.384185791015625E-7d);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        double double2 = org.apache.commons.math3.util.FastMath.log(0.2855802432114244d, (-33.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.15655890067882908d, 0.025822755842440984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15867420742219507d + "'", double2 == 0.15867420742219507d);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        long long2 = org.apache.commons.math3.util.FastMath.max(101651685L, (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101651685L + "'", long2 == 101651685L);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(5557.690612768986d, 33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.774019884625799E13d + "'", double2 == 4.774019884625799E13d);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        long long1 = org.apache.commons.math3.util.FastMath.abs(25L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 25L + "'", long1 == 25L);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(90.34675736186902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.196771678071439d + "'", double1 == 5.196771678071439d);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(3.189620006501493d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.119006116482174d + "'", double1 == 12.119006116482174d);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-15.0f), 23);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2582912E8f) + "'", float2 == (-1.2582912E8f));
    }
}

