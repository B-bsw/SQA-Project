package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

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
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.69609469362245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.589913436819202d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.45398815654405256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4261655259124248d) + "'", double1 == (-0.4261655259124248d));
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        double double2 = org.apache.commons.math.util.FastMath.pow((-1.5234524435626737d), 4.22665135993387d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        long long2 = org.apache.commons.math.util.FastMath.max(252318064L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318064L + "'", long2 == 252318064L);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5817398942542069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5589250495943158d + "'", double1 == 0.5589250495943158d);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        int int2 = org.apache.commons.math.util.FastMath.min(252318064, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.1449159333471108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2416460874631542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23935408417387294d + "'", double1 == 0.23935408417387294d);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(89.94637491116947d, 52.089425942248695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.94637491116946d + "'", double2 == 89.94637491116946d);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.357490349840526E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.473985226914506d) + "'", double1 == (-3.473985226914506d));
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        double double1 = org.apache.commons.math.util.FastMath.cos(263.4582887262702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9066616809749151d + "'", double1 == 0.9066616809749151d);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2110835568025492E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02296455508820045d + "'", double1 == 0.02296455508820045d);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9982677335945611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        double double2 = org.apache.commons.math.util.FastMath.pow(11.71517765301278d, 0.06314391275900404d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1681133462016111d + "'", double2 == 1.1681133462016111d);
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.999999995877692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        long long1 = org.apache.commons.math.util.FastMath.round(65.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 65L + "'", long1 == 65L);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.01747865728166002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7574919331182968d) + "'", double1 == (-1.7574919331182968d));
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7615941559557708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5662191695169762d + "'", double1 == 0.5662191695169762d);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.1339290130681278E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.004840184937421675d) + "'", double1 == (-0.004840184937421675d));
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9015023811213569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.04503312184618226d) + "'", double1 == (-0.04503312184618226d));
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.1971657626758088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3000326939856166d + "'", double1 == 1.3000326939856166d);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8837010719759295d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02077746805881874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0209948223958205d + "'", double1 == 1.0209948223958205d);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.903049969606974E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0842021724855044E-19d + "'", double1 == 1.0842021724855044E-19d);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.896513884640342E11d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.06314391275900404d, 8.123795169711219d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06314391275900405d + "'", double2 == 0.06314391275900405d);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        double double2 = org.apache.commons.math.util.FastMath.max(16.01682731613292d, 1.5475868312936525d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.01682731613292d + "'", double2 == 16.01682731613292d);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.015957296052726624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016085293626796997d + "'", double1 == 0.016085293626796997d);
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2932359235759898d, 3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.29153046097456287d, 0.9864301748943035d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2915304609745629d + "'", double2 == 0.2915304609745629d);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3325401204690593d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-19.053145421649052d) + "'", double1 == (-19.053145421649052d));
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9803520251444924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9803520251444925d + "'", double1 == 0.9803520251444925d);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        double double1 = org.apache.commons.math.util.FastMath.log1p(8.442682741625229E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442647102379884E-6d + "'", double1 == 8.442647102379884E-6d);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0997501702946166d, (-3.719590361169149d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7021066632335075d + "'", double2 == 0.7021066632335075d);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8461139641393225d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1909689201661917E184d, 0.7812270842136727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9709393822234024d, (-0.602750627100152d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.602750627100152d) + "'", double2 == (-0.602750627100152d));
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        double double1 = org.apache.commons.math.util.FastMath.log1p(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.70805020110221d + "'", double1 == 2.70805020110221d);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.09460497975487737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16299078079570548d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.7929422793014347d), (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.0795643887411437d) + "'", double2 == (-2.0795643887411437d));
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9763608754884531d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9478899016727291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.738826273246199d + "'", double1 == 0.738826273246199d);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.9503831832192838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6134071408270492d) + "'", double1 == (-0.6134071408270492d));
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.4365120111136123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.01029594357767d + "'", double1 == 25.01029594357767d);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.2654676519986654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-129.80173508293583d) + "'", double1 == (-129.80173508293583d));
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        double double1 = org.apache.commons.math.util.FastMath.atan((-2.170898511753462d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1391305096956303d) + "'", double1 == (-1.1391305096956303d));
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9798783713774953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.14289511608317d + "'", double1 == 56.14289511608317d);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8281987638796728d), 10.693101595361254d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8281987638796728d) + "'", double2 == (-0.8281987638796728d));
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        int int2 = org.apache.commons.math.util.FastMath.max(4, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5081249405686994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        double double1 = org.apache.commons.math.util.FastMath.ulp(187.34742828514646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6657298105782764d, 1.023227478547548d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5768092661815861d + "'", double2 == 0.5768092661815861d);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        long long1 = org.apache.commons.math.util.FastMath.abs(208L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 208L + "'", long1 == 208L);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.948148009134034E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3958007131216221d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        int int2 = org.apache.commons.math.util.FastMath.min(18, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5887989736417515d + "'", double1 == 0.5887989736417515d);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1584562587899128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14708830741435835d + "'", double1 == 0.14708830741435835d);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        double double2 = org.apache.commons.math.util.FastMath.min(0.016804105884637304d, (-0.1438634000260818d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.1438634000260818d) + "'", double2 == (-0.1438634000260818d));
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.7739894478141198d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        long long2 = org.apache.commons.math.util.FastMath.min(2147483647L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318064L, (float) 7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8199681505512405E-18d + "'", double1 == 2.8199681505512405E-18d);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6060.800489722827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7484805753152971d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8651477187829238d + "'", double1 == 0.8651477187829238d);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 65L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.974903989667673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.30072622845812175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        double double1 = org.apache.commons.math.util.FastMath.sinh(6.197664423181249E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.197664427148895E-5d + "'", double1 == 6.197664427148895E-5d);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.38374066418898d, 1.338474404104274d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3837406641889793d + "'", double2 == 2.3837406641889793d);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 65L, 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 31, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.981992372399956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9819923723999561d + "'", double1 == 0.9819923723999561d);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9127535552074844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5437811609553316d + "'", double1 == 1.5437811609553316d);
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5603440460313085d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9369645424212627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2075328811095254d) + "'", double1 == (-0.2075328811095254d));
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        double double1 = org.apache.commons.math.util.FastMath.sinh(89.06376603792404d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3926112041789106E38d + "'", double1 == 2.3926112041789106E38d);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6178462366399048d) + "'", double1 == (-0.6178462366399048d));
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        long long2 = org.apache.commons.math.util.FastMath.min((-7L), (-7L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.07555051586576621d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8323937271739859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2988148951746634d + "'", double1 == 2.2988148951746634d);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3848831882289924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.05218229106051d + "'", double1 == 22.05218229106051d);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9191066572935884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9587005044817638d + "'", double1 == 0.9587005044817638d);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0350326805537281E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.21940482668407568d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2211693708601261d) + "'", double1 == (-0.2211693708601261d));
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.4404842646755718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2297766482920633d + "'", double1 == 2.2297766482920633d);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3596375654124956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8240833297627779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.923053249606733E20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.840297672059425d + "'", double1 == 20.840297672059425d);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-371.2416781774396d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-371.0d) + "'", double1 == (-371.0d));
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.7460679984455996d, 1.5104476392713513d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7460679984455997d + "'", double2 == 0.7460679984455997d);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6115694833732153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5741531779424643d + "'", double1 == 0.5741531779424643d);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 1, (long) 7);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.025681666614117075d, 0.7054294284722258d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.036389649528461486d + "'", double2 == 0.036389649528461486d);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        int int2 = org.apache.commons.math.util.FastMath.min(97, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        double double1 = org.apache.commons.math.util.FastMath.abs((-54.45294531867341d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.45294531867341d + "'", double1 == 54.45294531867341d);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0042168243360932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1817185613997696d + "'", double1 == 1.1817185613997696d);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1173952.1465157769d + "'", double1 == 1173952.1465157769d);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        double double1 = org.apache.commons.math.util.FastMath.tanh(26.000000000000004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.158638853279167d, 1.1209771966297117E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.158638853279166d + "'", double2 == 4.158638853279166d);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.6441283045187972E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.545676718844663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6071725078043736d) + "'", double1 == (-0.6071725078043736d));
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.08139459933906179d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.06668130983047423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0022240224310819d + "'", double1 == 1.0022240224310819d);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.25209651547738315d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.257650349732972d) + "'", double1 == (-0.257650349732972d));
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        double double1 = org.apache.commons.math.util.FastMath.atan(5.088887490341627E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.088887490341627E-14d + "'", double1 == 5.088887490341627E-14d);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.01584076824127968d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        int int2 = org.apache.commons.math.util.FastMath.min(2105, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.003436071571126802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.6681507037242218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.550386653691239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.4161468365471423d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.007263132469506304d) + "'", double1 == (-0.007263132469506304d));
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.532367934462324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2378884983964928d + "'", double1 == 1.2378884983964928d);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1269280110429727d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.005282172155090746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        long long2 = org.apache.commons.math.util.FastMath.min(18L, (long) 31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-2L), 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.6490151682005654d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6490151682005656d + "'", double1 == 1.6490151682005656d);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.69927534455855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        double double2 = org.apache.commons.math.util.FastMath.max(0.017738893077120243d, (double) 23L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 23.0d + "'", double2 == 23.0d);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9330920755982086d, 1.543532148561955d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9330920755982086d + "'", double2 == 0.9330920755982086d);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.6809442969904994d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.240940680313788d + "'", double1 == 1.240940680313788d);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9878624697502397d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8348512284034268d) + "'", double1 == (-0.8348512284034268d));
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.03760197886023984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0383178781566987d + "'", double1 == 0.0383178781566987d);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 7, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.05850927105379495d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.05854270538900857d) + "'", double1 == (-0.05854270538900857d));
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9097218402675803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01587764138997121d + "'", double1 == 0.01587764138997121d);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        double double2 = org.apache.commons.math.util.FastMath.min(2.01122831707001d, 2.262122178163556E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.01122831707001d + "'", double2 == 2.01122831707001d);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0142047603949278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7002244576463161d + "'", double1 == 0.7002244576463161d);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2533138212020356d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.501928515588587d + "'", double1 == 2.501928515588587d);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 22025L, 38.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.4362355307740595d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.12186934340514759d), 0.00475630033796798d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        double double2 = org.apache.commons.math.util.FastMath.max(1.2346585098971854d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2346585098971854d + "'", double2 == 1.2346585098971854d);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8030064940059781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8921309921954693d + "'", double1 == 0.8921309921954693d);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        double double1 = org.apache.commons.math.util.FastMath.log10(31.53483235683642d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.498790526570994d + "'", double1 == 1.498790526570994d);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.04633654665509406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5993266431154813d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.015704339111595068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.555091342094562d + "'", double1 == 1.555091342094562d);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        double double1 = org.apache.commons.math.util.FastMath.log(0.07609034874226744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5758338455177396d) + "'", double1 == (-2.5758338455177396d));
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9922768665593191d, 1.4359627388413443d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9922768665593191d + "'", double2 == 0.9922768665593191d);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.719319974221618E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.621581484926361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.7929422793014345d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.7811284620871498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8964711396507172d) + "'", double1 == (-0.8964711396507172d));
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.997937090867597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7607264249902573d + "'", double1 == 0.7607264249902573d);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.5904245494217928d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        double double1 = org.apache.commons.math.util.FastMath.log(4.988689301930058E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.238194326245623d + "'", double1 == 29.238194326245623d);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.8323937271739859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 9, 1.1157352635485611d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 0, 46.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 46.0f + "'", float2 == 46.0f);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.281452070980398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3164482246630265d + "'", double1 == 1.3164482246630265d);
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7455603080204268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9233377873846023d + "'", double1 == 0.9233377873846023d);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.26207036451596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.047442967903742035d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2104.8636254562957d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-120599.80218925102d) + "'", double1 == (-120599.80218925102d));
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8835877589816592d, 9.2233720368547748E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.579877678695133E-20d + "'", double2 == 9.579877678695133E-20d);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0034419884227690025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.848196812283183d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9420512808597249d) + "'", double1 == (-0.9420512808597249d));
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.08123954526961918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08106152637093929d + "'", double1 == 0.08106152637093929d);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(37.38156029837415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6524313067394227d + "'", double1 == 0.6524313067394227d);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.32291637134351786d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5515679276951895d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1576846224537243d + "'", double1 == 1.1576846224537243d);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.4894731122556734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7880908405842116d + "'", double1 == 0.7880908405842116d);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8772827919571973d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7918857299241612d + "'", double1 == 0.7918857299241612d);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.786083656729492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4071208046018095d + "'", double1 == 1.4071208046018095d);
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.378163642308943E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707963267936302d, 0.9986793944976201d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267936302d + "'", double2 == 1.5707963267936302d);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        double double1 = org.apache.commons.math.util.FastMath.expm1(53.62182509529453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9393792670388525E23d + "'", double1 == 1.9393792670388525E23d);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.3992162411499114E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.95553826735078E-106d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.95553826735078E-106d + "'", double1 == 7.95553826735078E-106d);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027415039528618016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.596663528266212d) + "'", double1 == (-3.596663528266212d));
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.028396905882036416d), 0.7172377208137243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.039571374082369264d) + "'", double2 == (-0.039571374082369264d));
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.391593686458413d) + "'", double1 == (-4.391593686458413d));
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.568408219180732E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.43424333421128425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3606374169110648d + "'", double1 == 0.3606374169110648d);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1681133462016111d, 24.182680047644382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.048266201836385775d + "'", double2 == 0.048266201836385775d);
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        double double1 = org.apache.commons.math.util.FastMath.tan(57.29577951311464d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262160379974445d + "'", double1 == 0.9262160379974445d);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.15179996136176638d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15238362695988383d + "'", double1 == 0.15238362695988383d);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9279056024825724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9279056024825725d + "'", double1 == 0.9279056024825725d);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        long long2 = org.apache.commons.math.util.FastMath.max(9223372036854775807L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.356655043862392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3566550438623923d + "'", double1 == 1.3566550438623923d);
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.2125204179373373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6725993386887972d) + "'", double1 == (-0.6725993386887972d));
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.981364306629734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9937491099990867d) + "'", double1 == (-0.9937491099990867d));
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        float float2 = org.apache.commons.math.util.FastMath.min(10.0f, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.8551464208140986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5680032523292624d + "'", double1 == 1.5680032523292624d);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
        double double1 = org.apache.commons.math.util.FastMath.sin(33.43950032726054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8992355293852338d + "'", double1 == 0.8992355293852338d);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.650149769841539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.48042882520381d + "'", double1 == 38.48042882520381d);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.388925695466724d) + "'", double1 == (-2.388925695466724d));
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, 0.5666612703032121d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9998522211029501d, 0.8988587803407233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998671666480918d + "'", double2 == 0.9998671666480918d);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5816161669572506d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.025684489383558138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996701716352728d + "'", double1 == 0.9996701716352728d);
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        long long2 = org.apache.commons.math.util.FastMath.min(252318057L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9623912578794126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6741637591414843d + "'", double1 == 0.6741637591414843d);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.46656342243821886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4854013909922005d + "'", double1 == 0.4854013909922005d);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.3291890022899713E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41953092062109926d + "'", double1 == 0.41953092062109926d);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.12494262448882598d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1330834399601935d + "'", double1 == 0.1330834399601935d);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1508517095110122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.020086151533172506d + "'", double1 == 0.020086151533172506d);
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5430642407677928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2184159968141006d + "'", double1 == 1.2184159968141006d);
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.538585403585032d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.657996423229761d + "'", double1 == 3.657996423229761d);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.009923127595128856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9490623602794171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3956150475295281d) + "'", double1 == (-1.3956150475295281d));
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1046574097802226d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
        long long2 = org.apache.commons.math.util.FastMath.min((-2L), 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9142469191379081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1536452689025833d + "'", double1 == 1.1536452689025833d);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.50788993223225E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3552527156068805E-20d + "'", double1 == 1.3552527156068805E-20d);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6931470957378603d, 37.38156029837415d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931470957378603d + "'", double2 == 0.6931470957378603d);
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.030668400526856803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03067801920840657d + "'", double1 == 0.03067801920840657d);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5887989736417516d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.965201390124394d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 57L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.46549581933118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00812443470159776d + "'", double1 == 0.00812443470159776d);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.8064918000376506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.15098572778760802d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15098572778760802d + "'", double1 == 0.15098572778760802d);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.253522697326158d, 1.7334337635678283d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.299694371376205d + "'", double2 == 12.299694371376205d);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        int int2 = org.apache.commons.math.util.FastMath.max(6061, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        long long1 = org.apache.commons.math.util.FastMath.abs(50772059364683248L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 50772059364683248L + "'", long1 == 50772059364683248L);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.029698164942722875d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029693799599027664d) + "'", double1 == (-0.029693799599027664d));
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8386412218044967d + "'", double1 == 0.8386412218044967d);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.920960112236651d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9957880446333222d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.026697492810876286d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7869.239805184218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7869.239805184219d + "'", double1 == 7869.239805184219d);
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5791357593406526d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5220369978447109d + "'", double1 == 0.5220369978447109d);
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.0011371729996371193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011378200714542528d) + "'", double1 == (-0.0011378200714542528d));
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        double double1 = org.apache.commons.math.util.FastMath.ulp(8.123795169711219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7675283643313483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7675283643313483d + "'", double1 == 0.7675283643313483d);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.1529211698783688d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6725993386887972d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7377157926311014d) + "'", double1 == (-0.7377157926311014d));
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        double double1 = org.apache.commons.math.util.FastMath.log(0.006948882707861607d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.969174393787706d) + "'", double1 == (-4.969174393787706d));
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2725138805025834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2692488706763693d + "'", double1 == 0.2692488706763693d);
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027181892591221314d + "'", double1 == 0.027181892591221314d);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.17453292512124874d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16087055803275832d + "'", double1 == 0.16087055803275832d);
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6555421614583431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42229265830698903d) + "'", double1 == (-0.42229265830698903d));
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        long long2 = org.apache.commons.math.util.FastMath.max(2147483647L, (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5792809126705764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 5L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6989700043360189d + "'", double1 == 0.6989700043360189d);
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7615941557173695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.63613082443449d + "'", double1 == 43.63613082443449d);
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        double double2 = org.apache.commons.math.util.FastMath.min(4.558946309455194E-13d, 0.008592287884538355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.558946309455194E-13d + "'", double2 == 4.558946309455194E-13d);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1261967.0000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9990841831465845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01570692181693664d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998766488395199d + "'", double1 == 0.9998766488395199d);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        double double1 = org.apache.commons.math.util.FastMath.signum(5.0772059364683248E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5440211108893683d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-31.170113619979354d) + "'", double1 == (-31.170113619979354d));
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.953159315987153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.953159315987153d + "'", double1 == 0.953159315987153d);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (-3L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-3L) + "'", long1 == (-3L));
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        double double2 = org.apache.commons.math.util.FastMath.atan2(96.99999999999999d, 1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5549259429223932d + "'", double2 == 1.5549259429223932d);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.42082174926089705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9127535552074842d + "'", double1 == 0.9127535552074842d);
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2019433684703145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5129829789451061d + "'", double1 == 1.5129829789451061d);
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        double double1 = org.apache.commons.math.util.FastMath.acosh(99.95436267781281d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.2978358653826545d + "'", double1 == 5.2978358653826545d);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.115997069138992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.43361108619104427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.844085188830206d + "'", double1 == 24.844085188830206d);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.1771005758622557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9234976649034378d + "'", double1 == 0.9234976649034378d);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.2322420723808665d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9980595798433141d, 1.6588988415573005d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9967830974902308d + "'", double2 == 0.9967830974902308d);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5792809126705765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.506565440100699d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2274222745659698d + "'", double1 == 1.2274222745659698d);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.000127309544797d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.331165760045145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.900837378826303d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.3561356722014506d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.24667646914497054d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24918577239678152d) + "'", double1 == (-0.24918577239678152d));
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.3553727166519355E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.4742592311448615d) + "'", double1 == (-6.4742592311448615d));
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.6112949659561453d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5707963267936307d, (-0.22942520686930212d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22942520686930212d) + "'", double2 == (-0.22942520686930212d));
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9999940841932833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2668250024125176d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1765355471794627d + "'", double1 == 1.1765355471794627d);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        long long2 = org.apache.commons.math.util.FastMath.min(26L, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        double double1 = org.apache.commons.math.util.FastMath.log1p(117.61174253155806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.775855491203465d + "'", double1 == 4.775855491203465d);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.2661802399344254E97d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.588550360256754E81d + "'", double1 == 7.588550360256754E81d);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2073026073820456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.20730260738204562d + "'", double1 == 0.20730260738204562d);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        long long2 = org.apache.commons.math.util.FastMath.max(44L, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 208, 1.523299875428963d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5634729006290211d + "'", double2 == 1.5634729006290211d);
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5619235585330076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5619235585330078d + "'", double1 == 1.5619235585330078d);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.5422326689561365d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 252318064);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        int int2 = org.apache.commons.math.util.FastMath.min(2105, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017454730321241296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.04751430328761029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.722369044884642d + "'", double1 == 2.722369044884642d);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.762860921275018d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0030232463348634d + "'", double1 == 1.0030232463348634d);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1690062794301309d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0029497160326013502d + "'", double1 == 0.0029497160326013502d);
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        int int2 = org.apache.commons.math.util.FastMath.max(22025, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.014376472383597346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01437746296372209d + "'", double1 == 0.01437746296372209d);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        float float2 = org.apache.commons.math.util.FastMath.max(145.0f, (float) 208);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 208.0f + "'", float2 == 208.0f);
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5703212367226402d, 0.12217304763960309d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.493151428452226d + "'", double2 == 1.493151428452226d);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        int int2 = org.apache.commons.math.util.FastMath.min(9, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.19123459503123072d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033376733270129647d + "'", double1 == 0.0033376733270129647d);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3644746251564972d, 1.1961970956842123d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8510199734620654d + "'", double2 == 0.8510199734620654d);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.000000000000007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5473041341731993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4365141483726487d + "'", double1 == 0.4365141483726487d);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        long long2 = org.apache.commons.math.util.FastMath.max(65L, 28L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 65L + "'", long2 == 65L);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.20150158639695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2015015863969503d + "'", double1 == 1.2015015863969503d);
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        double double1 = org.apache.commons.math.util.FastMath.exp((-3.1762777305546113d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041740736583032526d + "'", double1 == 0.041740736583032526d);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.2932344847484805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.072012182577236d + "'", double1 == 2.072012182577236d);
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5313592245660101d), 0.31993754771431815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31993754771431815d + "'", double2 == 0.31993754771431815d);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5683959703542163d, 0.5229107753521856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2653361067604598d + "'", double2 == 1.2653361067604598d);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2204460492503136E-16d + "'", double1 == 2.2204460492503136E-16d);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        long long2 = org.apache.commons.math.util.FastMath.min(46L, 50772059364683248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 46L + "'", long2 == 46L);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.85836923677614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3632201717903605d + "'", double1 == 1.3632201717903605d);
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.22882280821594222d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22495005378656976d + "'", double1 == 0.22495005378656976d);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.798543638801929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.56029137100851d + "'", double1 == 1.56029137100851d);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4817567395291671d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0033681543683328455d, 0.09081891507181945d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09081891507181945d + "'", double2 == 0.09081891507181945d);
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        double double1 = org.apache.commons.math.util.FastMath.cos(71.1381883290883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.43708364069671046d) + "'", double1 == (-0.43708364069671046d));
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.5680724581504838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1657392447065713d + "'", double1 == 1.1657392447065713d);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.9634979770895203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8705713391151586d + "'", double1 == 2.8705713391151586d);
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.7853981633974484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0593061708232434d + "'", double1 == 1.0593061708232434d);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        double double1 = org.apache.commons.math.util.FastMath.acosh(51.999999999999986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.644298430695373d + "'", double1 == 4.644298430695373d);
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5263007573504037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.02567602163380694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.481311163232249E-4d + "'", double1 == 4.481311163232249E-4d);
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.583398179910364d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.175058497441132d + "'", double1 == 1.175058497441132d);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.037712963705904774d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03773085828810849d + "'", double1 == 0.03773085828810849d);
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-4.1588830833596715d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.6114907143230294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9128531089774885d + "'", double1 == 0.9128531089774885d);
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
        double double1 = org.apache.commons.math.util.FastMath.log(2.8402862384356652E138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 318.8006476684542d + "'", double1 == 318.8006476684542d);
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.717906776707044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 155.72458741531906d + "'", double1 == 155.72458741531906d);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.16752052899023542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16597934716902493d + "'", double1 == 0.16597934716902493d);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9984652528042448d), 7.142780804492972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9984652528042448d) + "'", double2 == (-0.9984652528042448d));
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9717320044784656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9207813824870029d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016070666815463455d + "'", double1 == 0.016070666815463455d);
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.1279281327218534E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999999937d + "'", double1 == 0.9999999999999937d);
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.5395785615511952d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.329930247202055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9711317411865499d + "'", double1 == 0.9711317411865499d);
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6674619946174979d, 10.206709210579758d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.06530145639668906d + "'", double2 == 0.06530145639668906d);
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.011882748623020987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011883307934849898d + "'", double1 == 0.011883307934849898d);
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1508517095110122d, 0.16724385078247328d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4264847385134667d + "'", double2 == 1.4264847385134667d);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.057298309797643d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-7), 208L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.16299078079570548d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.257276807732676E209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 209.35358481946747d + "'", double1 == 209.35358481946747d);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.31408714102768087d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.36123322409017133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3538054270864081d + "'", double1 == 0.3538054270864081d);
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7778729247654365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9196788910729141d + "'", double1 == 0.9196788910729141d);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7075479591666258d + "'", double1 == 1.7075479591666258d);
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        long long1 = org.apache.commons.math.util.FastMath.round(0.025062277728736922d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
        double double1 = org.apache.commons.math.util.FastMath.asinh(95.95177303495919d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.257020034487148d + "'", double1 == 5.257020034487148d);
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5707947732546232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19611944750641985d + "'", double1 == 0.19611944750641985d);
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        double double2 = org.apache.commons.math.util.FastMath.max(7.036874417766399E13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.036874417766399E13d + "'", double2 == 7.036874417766399E13d);
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7614327327621273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8371725644107859d + "'", double1 == 0.8371725644107859d);
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 23L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4515219270969891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
        long long2 = org.apache.commons.math.util.FastMath.max(3L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.4755806431682656d, 0.1800736247033484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2088386718902782d + "'", double2 == 1.2088386718902782d);
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-3.7635528157399536d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(33.81453724263198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1937.4302701907525d + "'", double1 == 1937.4302701907525d);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.14466555184225383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1456832649894027d + "'", double1 == 0.1456832649894027d);
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.5645645685050507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9161568588365114d + "'", double1 == 0.9161568588365114d);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7448204053596359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8402656502485981d + "'", double1 == 0.8402656502485981d);
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.09698274554263397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0972885351119612d + "'", double1 == 0.0972885351119612d);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-2.928898996730949d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3837641821656744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.40446651080769747d + "'", double1 == 0.40446651080769747d);
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.398057842737113E-7d, 0.0020024162435120616d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1975820906580308E-4d + "'", double2 == 1.1975820906580308E-4d);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7564949900863757d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27905936826557504d) + "'", double1 == (-0.27905936826557504d));
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        int int1 = org.apache.commons.math.util.FastMath.round((-5.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-5) + "'", int1 == (-5));
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
        float float2 = org.apache.commons.math.util.FastMath.min(18.0f, 21.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 14);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2032742454744652d, 6.000000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2032742454744652d + "'", double2 == 1.2032742454744652d);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.02669432190897104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02670066439081122d) + "'", double1 == (-0.02670066439081122d));
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
        long long2 = org.apache.commons.math.util.FastMath.max(21L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9700147524633321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4592472930705591d + "'", double1 == 1.4592472930705591d);
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.4499918000729173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7663047777864153d) + "'", double1 == (-0.7663047777864153d));
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        double double2 = org.apache.commons.math.util.FastMath.max(0.015625d, 0.992521333312215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.992521333312215d + "'", double2 == 0.992521333312215d);
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.2594052227297022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2624062929186908d + "'", double1 == 0.2624062929186908d);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
        long long2 = org.apache.commons.math.util.FastMath.max(6061L, (long) 88);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.26755161558636115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5172539179033457d + "'", double1 == 0.5172539179033457d);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.2576775945507415E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.257677594550742E26d + "'", double1 == 3.257677594550742E26d);
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8789826530317993E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999998234712d + "'", double1 == 0.9999999998234712d);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.593798539843371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.593798539843373d + "'", double1 == 8.593798539843373d);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4476075542915065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9014851557986342d + "'", double1 == 0.9014851557986342d);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2121580997058448d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9998037827419103d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7177485069771006d + "'", double1 == 1.7177485069771006d);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.031689820826759175d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.03468311433197074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1749455142537384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
        double double2 = org.apache.commons.math.util.FastMath.min(1.120369769123427d, 1.1891529137764139d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.120369769123427d + "'", double2 == 1.120369769123427d);
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-1.7430372525623743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.7698429446681243d) + "'", double1 == (-2.7698429446681243d));
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
        float float2 = org.apache.commons.math.util.FastMath.max(2.14748365E9f, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1411200080598672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.958144629610086d) + "'", double1 == (-1.958144629610086d));
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5703212366690238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02740727589386358d + "'", double1 == 0.02740727589386358d);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
        double double1 = org.apache.commons.math.util.FastMath.acosh(2738.593745198908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.608346983180573d + "'", double1 == 8.608346983180573d);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        double double1 = org.apache.commons.math.util.FastMath.floor(263.4582887262702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.0d + "'", double1 == 263.0d);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.30815538892118943d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 21.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3222192947339193d + "'", double1 == 1.3222192947339193d);
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        double double1 = org.apache.commons.math.util.FastMath.log(0.2008036112160549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.605427907182576d) + "'", double1 == (-1.605427907182576d));
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707639925974655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02741500344259761d + "'", double1 == 0.02741500344259761d);
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.9881722337154755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05215344409500856d + "'", double1 == 0.05215344409500856d);
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
        long long2 = org.apache.commons.math.util.FastMath.min(573L, 50772059364683248L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9393167815174964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3574158419544757d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.169084941497005E58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6003072162415438E57d + "'", double1 == 1.6003072162415438E57d);
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.890355464123843d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.435995406381136d + "'", double1 == 1.435995406381136d);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.2081071494997784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 126.515220379d + "'", double1 == 126.515220379d);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6797686131578042d, (-1.4990641066341381d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6797686131578042d + "'", double2 == 0.6797686131578042d);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
        double double2 = org.apache.commons.math.util.FastMath.max(104.94284158531252d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.94284158531252d + "'", double2 == 104.94284158531252d);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1649569776443817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5484329805341774d + "'", double1 == 0.5484329805341774d);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5901750099221726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.08317777404333761d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0831777740433376d) + "'", double1 == (-0.0831777740433376d));
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9925405320054786d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7584435302537637d + "'", double1 == 0.7584435302537637d);
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
        double double1 = org.apache.commons.math.util.FastMath.acosh(17.89400457879299d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.576831208328824d + "'", double1 == 3.576831208328824d);
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-2.3042456820170427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9001659211007923d) + "'", double1 == (-0.9001659211007923d));
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.97561390574332d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9756139057433201d + "'", double1 == 0.9756139057433201d);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
        double double1 = org.apache.commons.math.util.FastMath.abs((-23.149651841415288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.149651841415288d + "'", double1 == 23.149651841415288d);
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.06189150852923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8918357513053619d + "'", double1 == 1.8918357513053619d);
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8169805481334201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0848151289814358d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.047514327475808714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988714066933155d + "'", double1 == 0.9988714066933155d);
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.5422326689561365d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1553581515703277d) + "'", double1 == (-1.1553581515703277d));
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
        double double1 = org.apache.commons.math.util.FastMath.ulp(48.42055096759488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9680831371227122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1909689201661917E184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0913152249309966E92d + "'", double1 == 1.0913152249309966E92d);
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.08510319447875853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08500080043694076d) + "'", double1 == (-0.08500080043694076d));
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.019658508809675648d, (-0.042827011853929196d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.711262023414353d + "'", double2 == 2.711262023414353d);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.6725680697682985d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5048474895291349d, 1.2800017E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.9441157736676025E-8d + "'", double2 == 3.9441157736676025E-8d);
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.5636043816926894d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6380998614296135d) + "'", double1 == (-0.6380998614296135d));
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.739102559195019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988700965012318d + "'", double1 == 0.9988700965012318d);
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0403008096166385E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0403008077402379E-4d + "'", double1 == 1.0403008077402379E-4d);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1784082623540273d + "'", double1 == 1.1784082623540273d);
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4419694136099652d, 7.073385839060845E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0000002588929067d + "'", double2 == 1.0000002588929067d);
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.547473508864641E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
        double double1 = org.apache.commons.math.util.FastMath.tan(11.548739357257746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6195157923977428d) + "'", double1 == (-1.6195157923977428d));
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
        long long2 = org.apache.commons.math.util.FastMath.min(3374L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14417459718970865d) + "'", double1 == (-0.14417459718970865d));
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        double double1 = org.apache.commons.math.util.FastMath.log10(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1378101476805313d + "'", double1 == 2.1378101476805313d);
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.938901295571055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9594467926903744d + "'", double1 == 0.9594467926903744d);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 31, 2105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
        int int2 = org.apache.commons.math.util.FastMath.min(44, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.7711778429329054d, 2.3445697418012538E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999939079760684d + "'", double2 == 0.9999939079760684d);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0692714642076024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0340558322487245d + "'", double1 == 1.0340558322487245d);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 24L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
        double double1 = org.apache.commons.math.util.FastMath.tan(27.951773034959903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33423390227375654d) + "'", double1 == (-0.33423390227375654d));
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
        double double1 = org.apache.commons.math.util.FastMath.expm1(18.948171812387205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6946751364198387E8d + "'", double1 == 1.6946751364198387E8d);
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7207623119975984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.878417521546595d + "'", double1 == 0.878417521546595d);
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5707639925974655d, 1.5638998844065481d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707639925974655d + "'", double2 == 1.5707639925974655d);
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.025062277728736922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        long long1 = org.apache.commons.math.util.FastMath.round((-5.31819659006534d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.18043044929108396d), 1.0003296471530856d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18043044929108393d) + "'", double2 == (-0.18043044929108393d));
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.017477767330207263d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
        long long2 = org.apache.commons.math.util.FastMath.min(252318057L, 14L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1508598335814295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15028825570516427d + "'", double1 == 0.15028825570516427d);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1732760697622087d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.927987487988979d + "'", double1 == 9.927987487988979d);
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8414687716506352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.10932030584389242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
        double double1 = org.apache.commons.math.util.FastMath.cosh(6.678775299712307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 397.67285701966154d + "'", double1 == 397.67285701966154d);
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        double double2 = org.apache.commons.math.util.FastMath.max(3.574187603328559E30d, 0.3223164485279285d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.574187603328559E30d + "'", double2 == 3.574187603328559E30d);
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2699081698724155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.015706921816936642d, 1.5619235585330078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.010055800941169564d + "'", double2 == 0.010055800941169564d);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3142624216984847d, 43.99337600241585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.659454819393307E-23d + "'", double2 == 7.659454819393307E-23d);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9879690512915179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9959734927635803d + "'", double1 == 0.9959734927635803d);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0465732865948152d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5457023351911707d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.027306803080457513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02694062351004261d + "'", double1 == 0.02694062351004261d);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.02434662458621316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5464472962902656d + "'", double1 == 1.5464472962902656d);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.189143237539527d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8884890644290818d) + "'", double1 == (-0.8884890644290818d));
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4127191608141359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1453590034435102d + "'", double1 == 1.1453590034435102d);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
        double double1 = org.apache.commons.math.util.FastMath.asin(3266.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

