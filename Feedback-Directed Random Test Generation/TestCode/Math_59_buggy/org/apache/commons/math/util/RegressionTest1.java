package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521824d + "'", double1 == 1261966.2318521824d);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.8163011534362759d, 3.360842641004344d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49546634624061675d + "'", double2 == 0.49546634624061675d);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5585053606381855d + "'", double1 == 0.5585053606381855d);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5585053606381855d, (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015955941794861567d + "'", double2 == 0.015955941794861567d);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.543073535942135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 88.41160108781288d + "'", double1 == 88.41160108781288d);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7493933565307835d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 35.0f, 0.19006280234111017d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.896296018268E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896296018268E13d + "'", double1 == 7.896296018268E13d);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.137917206686937d + "'", double1 == 1.137917206686937d);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025678842914286692d + "'", double1 == 0.025678842914286692d);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.786480471441939E10d + "'", double1 == 9.786480471441939E10d);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        double double1 = org.apache.commons.math.util.FastMath.tan(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.661006041483758d + "'", double1 == 0.661006041483758d);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.999999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.4445057894400712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4182755546463937d) + "'", double1 == (-0.4182755546463937d));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.776356839400252E-15d + "'", double1 == 1.776356839400252E-15d);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        double double1 = org.apache.commons.math.util.FastMath.log(2.9932228457120735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0963506817327155d + "'", double1 == 1.0963506817327155d);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        double double1 = org.apache.commons.math.util.FastMath.atanh(18.949874371066198d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        double double1 = org.apache.commons.math.util.FastMath.signum(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0461462579250012d + "'", double1 == 1.0461462579250012d);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.997417559331972d + "'", double1 == 4.997417559331972d);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854778E18d + "'", double1 == 9.223372036854778E18d);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.02809969691994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        long long1 = org.apache.commons.math.util.FastMath.round(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2005.3522829578812d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0000000000000002d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        long long1 = org.apache.commons.math.util.FastMath.round(9.786480471441939E10d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97864804714L + "'", long1 == 97864804714L);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        double double2 = org.apache.commons.math.util.FastMath.max(13.845300947487885d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.845300947487885d + "'", double2 == 13.845300947487885d);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-57.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.0d) + "'", double1 == (-57.0d));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.38905609893065d, 2.2919043892128164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2700305245105663d + "'", double2 == 1.2700305245105663d);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8997923511366261d + "'", double1 == 0.8997923511366261d);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.7453292519943295d, (-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7453292519943293d + "'", double2 == 1.7453292519943293d);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        int int1 = org.apache.commons.math.util.FastMath.round(35.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        double double1 = org.apache.commons.math.util.FastMath.signum(76.93224517135305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5525884268785045E-18d + "'", double1 == 1.5525884268785045E-18d);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.896296018268E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.543080634815244d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9694911126077237d + "'", double1 == 0.9694911126077237d);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5574077246549023d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5574077246549025d + "'", double2 == 1.5574077246549025d);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.656854249492381d + "'", double1 == 5.656854249492381d);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.399216241149525E248d + "'", double1 == 3.399216241149525E248d);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17814068151824802d + "'", double1 == 0.17814068151824802d);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 35.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7410405809129375d + "'", double1 == 0.7410405809129375d);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7831978161372731d + "'", double1 == 0.7831978161372731d);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        double double2 = org.apache.commons.math.util.FastMath.min((double) '4', (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.009494959585376654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009450024787102135d) + "'", double1 == (-0.009450024787102135d));
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16646964819512286d + "'", double1 == 0.16646964819512286d);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.543073535942135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430735359421353d + "'", double1 == 1.5430735359421353d);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.223372E18f + "'", float2 == 9.223372E18f);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        double double1 = org.apache.commons.math.util.FastMath.acos(14.389377026852705d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.073385839060845E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1261966.2318521822d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04747861148694368d + "'", double1 == 0.04747861148694368d);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.4445057894400712d), 9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.8193414259330926E-20d) + "'", double2 == (-4.8193414259330926E-20d));
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        double double1 = org.apache.commons.math.util.FastMath.ceil(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.999999999999998d, 0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999996d + "'", double2 == 9.999999999999996d);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.360842641004344d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16765036534441544d + "'", double1 == 0.16765036534441544d);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.355372716651809E-7d, (-15.906532428616288d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.616441887145511E102d + "'", double2 == 9.616441887145511E102d);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7320508075688772d + "'", double1 == 1.7320508075688772d);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        long long1 = org.apache.commons.math.util.FastMath.abs(97864804714L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97864804714L + "'", long1 == 97864804714L);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(8886110.520507816d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 207.12724888983414d + "'", double1 == 207.12724888983414d);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double1 = org.apache.commons.math.util.FastMath.tanh(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5525884268785045E-18d, 1.7253825588523148d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8739552914536586E-31d + "'", double2 == 1.8739552914536586E-31d);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        double double2 = org.apache.commons.math.util.FastMath.min(3.0d, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308232d + "'", double1 == 572.9577951308232d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.005282073904701802d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.999999995520374d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.760373407405198d) + "'", double1 == (-0.760373407405198d));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2700305245105663d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        long long1 = org.apache.commons.math.util.FastMath.abs((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        double double1 = org.apache.commons.math.util.FastMath.sin(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8569259205417066d + "'", double1 == 0.8569259205417066d);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 573L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        double double2 = org.apache.commons.math.util.FastMath.atan2(14.04818156408044d, (-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6145485553432248d + "'", double2 == 1.6145485553432248d);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7370529091738743d) + "'", double1 == (-0.7370529091738743d));
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        double double1 = org.apache.commons.math.util.FastMath.rint(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.0d + "'", double1 == 11013.0d);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360850939669095d) + "'", double1 == (-0.0034360850939669095d));
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999103740052037d, 38.45962336030118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.45962336030118d + "'", double2 == 38.45962336030118d);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3541424281629695d + "'", double1 == 3.3541424281629695d);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 573L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.545750190492393E248d + "'", double1 == 3.545750190492393E248d);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        double double2 = org.apache.commons.math.util.FastMath.max(9.999999995877692d, (-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999995877692d + "'", double2 == 9.999999995877692d);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.9512437185814275d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.322916371343518d + "'", double1 == 1.322916371343518d);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.41133756602909E-22d) + "'", double1 == (-8.41133756602909E-22d));
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0963506817327155d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9996159448097379d + "'", double1 == 0.9996159448097379d);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        long long1 = org.apache.commons.math.util.FastMath.round(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1558490147807587d + "'", double1 == 3.1558490147807587d);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.009494959585376654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009495102254525043d) + "'", double1 == (-0.009495102254525043d));
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.015955941794861567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015956618915170855d + "'", double1 == 0.015956618915170855d);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.0232274785475506d, (-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.130126224133262d + "'", double2 == 3.130126224133262d);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.16765036534441544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1692480936637681d + "'", double1 == 0.1692480936637681d);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 10L, 2.2919043892128164d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.999999999999998d + "'", double2 == 9.999999999999998d);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16648030344294168d + "'", double1 == 0.16648030344294168d);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        double double1 = org.apache.commons.math.util.FastMath.abs(13.845300947487885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.845300947487885d + "'", double1 == 13.845300947487885d);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1664909604641016d + "'", double1 == 0.1664909604641016d);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8163011534362759d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.6897511201227055d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5978220919084257d) + "'", double1 == (-0.5978220919084257d));
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999877116507956d + "'", double1 == 0.9999877116507956d);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918043161804359d + "'", double1 == 0.9918043161804359d);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.025618622601251d + "'", double1 == 5.025618622601251d);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 97864804714L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.005282073904701802d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.398057842737113E-7d + "'", double2 == 2.398057842737113E-7d);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047407404488248234d + "'", double1 == 0.047407404488248234d);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double1 = org.apache.commons.math.util.FastMath.asinh(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.18054648615969d + "'", double1 == 4.18054648615969d);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        double double1 = org.apache.commons.math.util.FastMath.atanh(9.223372036854776E18d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08883176481419076d) + "'", double1 == (-0.08883176481419076d));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7320508075688772d, (double) 573L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.957234655978706E136d + "'", double2 == 4.957234655978706E136d);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        double double1 = org.apache.commons.math.util.FastMath.asin((-1.4070751110264779d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.0889074357665707d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.653805147100431d + "'", double1 == 1.653805147100431d);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-3.848501131276805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-220.50287227348372d) + "'", double1 == (-220.50287227348372d));
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4445057894400712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.355372716651809E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355372716651809E-7d + "'", double1 == 3.355372716651809E-7d);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97864804714L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2722241413791169d) + "'", double1 == (-0.2722241413791169d));
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9142469191379081d + "'", double1 == 0.9142469191379081d);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.848637647975848d + "'", double1 == 0.848637647975848d);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4430227241169228d + "'", double1 == 0.4430227241169228d);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        double double1 = org.apache.commons.math.util.FastMath.log(7.38905609893065d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.8739552914536586E-31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8739552914536586E-31d + "'", double1 == 1.8739552914536586E-31d);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.027715691434453935d, (-0.4182755546463937d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027715691434453932d + "'", double2 == 0.027715691434453932d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 52L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9075712110370514d + "'", double1 == 0.9075712110370514d);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        double double1 = org.apache.commons.math.util.FastMath.asin(7.091500380984786E248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01661243639878233d + "'", double1 == 0.01661243639878233d);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054334737986E-5d + "'", double1 == 1.9225054334737986E-5d);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9251475365964139d) + "'", double1 == (-0.9251475365964139d));
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0461462579250012d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3026405418156001d + "'", double1 == 0.3026405418156001d);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        double double2 = org.apache.commons.math.util.FastMath.min(0.8623188722876839d, 0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.015956618915170855d + "'", double2 == 0.015956618915170855d);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-220.50287227348372d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.041406849910749d) + "'", double1 == (-6.041406849910749d));
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9999999958776927d, 1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8184464592320668d + "'", double2 == 1.8184464592320668d);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16723958605665326d + "'", double1 == 0.16723958605665326d);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6321205588285577d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        double double1 = org.apache.commons.math.util.FastMath.ulp(7.896296018267966E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015625d + "'", double1 == 0.015625d);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009972194509427618d + "'", double1 == 0.009972194509427618d);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 35.0f, 52.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.956763353344058E80d + "'", double2 == 1.956763353344058E80d);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 52, 26.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.0d + "'", double2 == 26.0d);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1261966.2318521824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.741328744640542d + "'", double1 == 14.741328744640542d);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(32.0d, (-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02771569143445394d + "'", double1 == 0.02771569143445394d);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2679097686563057d) + "'", double1 == (-2.2679097686563057d));
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 'a', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        int int1 = org.apache.commons.math.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9640275800758169d + "'", double1 == 0.9640275800758169d);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        double double2 = org.apache.commons.math.util.FastMath.max(9.223372036854778E18d, 2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854778E18d + "'", double2 == 9.223372036854778E18d);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.7182818284590453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3108324944320862d + "'", double1 == 1.3108324944320862d);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46749182950293094d + "'", double1 == 0.46749182950293094d);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.30685281944005d + "'", double1 == 56.30685281944005d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        double double1 = org.apache.commons.math.util.FastMath.expm1(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.685719999335932E24d + "'", double1 == 5.685719999335932E24d);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7625584504796027d + "'", double1 == 0.7625584504796027d);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8199744766146694d + "'", double1 == 0.8199744766146694d);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4080069217490346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8964711396507173d) + "'", double1 == (-0.8964711396507173d));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        double double1 = org.apache.commons.math.util.FastMath.abs(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.206709210579758d + "'", double1 == 10.206709210579758d);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-3.848501131276805d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        double double1 = org.apache.commons.math.util.FastMath.log1p(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983702d + "'", double1 == 2.3978952727983702d);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3032833236333146d + "'", double1 == 1.3032833236333146d);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7582649015960806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8488998154697595d) + "'", double1 == (-0.8488998154697595d));
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-1), (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.545750190492393E248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.36787944117144233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3596375654124956d + "'", double1 == 0.3596375654124956d);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.818446459232067d + "'", double1 == 1.818446459232067d);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double double2 = org.apache.commons.math.util.FastMath.min(10.693147180044656d, 2.398057842737113E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.398057842737113E-7d + "'", double2 == 2.398057842737113E-7d);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.893761324052697d + "'", double1 == 8.893761324052697d);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        long long1 = org.apache.commons.math.util.FastMath.round(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        long long1 = org.apache.commons.math.util.FastMath.abs(32L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        double double2 = org.apache.commons.math.util.FastMath.atan2(56.30685281944005d, 3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5004011384648823d + "'", double2 == 1.5004011384648823d);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9262160379374064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07664776923849483d) + "'", double1 == (-0.07664776923849483d));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(57.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3265.8594322456925d + "'", double1 == 3265.8594322456925d);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.04747861148694368d, 51.99999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.047478611486943684d + "'", double2 == 0.047478611486943684d);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0554544523933395E-6d + "'", double1 == 6.0554544523933395E-6d);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.3978952727983702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3384744041042738d + "'", double1 == 1.3384744041042738d);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.818446459232067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8184464592320673d + "'", double1 == 1.8184464592320673d);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1692480936637681d, 9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.834991508392875E-20d + "'", double2 == 1.834991508392875E-20d);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.786480471441939E10d, 0.16648030344294168d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.786480471441937E10d + "'", double2 == 9.786480471441937E10d);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1544346900318834d + "'", double1 == 2.1544346900318834d);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        float float2 = org.apache.commons.math.util.FastMath.min(1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5858845586028694d) + "'", double1 == (-3.5858845586028694d));
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(7.896296018267966E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.378163642308943E12d + "'", double1 == 1.378163642308943E12d);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 26L, (-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5812661035094697d + "'", double2 == 1.5812661035094697d);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.220446049250313E-16d, 9.999999995520374d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2204460492503136E-16d + "'", double2 == 2.2204460492503136E-16d);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        long long2 = org.apache.commons.math.util.FastMath.max(2L, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9877735581754346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9694911126077237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6145485553432248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0162571141467134d + "'", double1 == 1.0162571141467134d);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1373220393635d + "'", double1 == 1.1373220393635d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.776356839400252E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908904786682E-5d + "'", double1 == 1.2110908904786682E-5d);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.938893903907228E-18d + "'", double1 == 6.938893903907228E-18d);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9932228457120735d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2915496650148839d + "'", double1 == 1.2915496650148839d);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1205702641807171d) + "'", double1 == (-1.1205702641807171d));
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 32, 1.2401310215141802E-16d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054335922256E-5d + "'", double1 == 1.9225054335922256E-5d);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5525884268785043E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0486237723781806d + "'", double1 == 1.0486237723781806d);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8428599996679665E24d + "'", double1 == 2.8428599996679665E24d);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.19240232444172617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1924023244417262d + "'", double1 == 0.1924023244417262d);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        double double1 = org.apache.commons.math.util.FastMath.log((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 97);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        double double1 = org.apache.commons.math.util.FastMath.ulp(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1368683772161603E-13d + "'", double1 == 1.1368683772161603E-13d);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.984807753012208d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9698463103929541d + "'", double2 == 0.9698463103929541d);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8346187642153643d + "'", double1 == 0.8346187642153643d);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16723958605665326d, 0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.247595209480447d + "'", double2 == 0.247595209480447d);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        double double1 = org.apache.commons.math.util.FastMath.tan(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3078511907005352d + "'", double1 == 3.3078511907005352d);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1155899177076452d + "'", double1 == 1.1155899177076452d);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 151.2644211956603d + "'", double1 == 151.2644211956603d);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.30264054181560024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31223183389476095d + "'", double1 == 0.31223183389476095d);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.020573130590485034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02057603387904735d + "'", double1 == 0.02057603387904735d);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.009450024787102135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00944988413518589d) + "'", double1 == (-0.00944988413518589d));
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        long long1 = org.apache.commons.math.util.FastMath.round(0.31223183389476095d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        double double1 = org.apache.commons.math.util.FastMath.log10(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7581226324091723d + "'", double1 == 2.7581226324091723d);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.49546634624061675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1252750800637434d + "'", double1 == 1.1252750800637434d);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        double double1 = org.apache.commons.math.util.FastMath.ceil(38.45962336030118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 39.0d + "'", double1 == 39.0d);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9866275920404841d) + "'", double1 == (-0.9866275920404841d));
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.1558490147807587d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        double double1 = org.apache.commons.math.util.FastMath.tanh(9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999954430011d + "'", double1 == 0.9999999954430011d);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3643047812382505d) + "'", double1 == (-0.3643047812382505d));
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590842d + "'", double1 == 0.6483608274590842d);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.8428599996679665E24d, (-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5469160326749675E-19d + "'", double2 == 2.5469160326749675E-19d);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4657359027997265d + "'", double1 == 3.4657359027997265d);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 2L, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9999999999999998d + "'", double2 == 1.9999999999999998d);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7766609160650203d) + "'", double1 == (-0.7766609160650203d));
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.837300699980114E-4d + "'", double1 == 4.837300699980114E-4d);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.875409442231813E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3295673951398002d + "'", double1 == 1.3295673951398002d);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.06639041664197d + "'", double1 == 104.06639041664197d);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854776E18d + "'", double1 == 9.223372036854776E18d);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04749646746707085d + "'", double1 == 0.04749646746707085d);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.1205702641807171d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8077671816348476d) + "'", double1 == (-0.8077671816348476d));
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.1155899177076452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        double double1 = org.apache.commons.math.util.FastMath.exp(11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        double double1 = org.apache.commons.math.util.FastMath.sinh(14.04818156408044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 630983.1159256954d + "'", double1 == 630983.1159256954d);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4023976994865663d + "'", double1 == 1.4023976994865663d);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.8414709848078965d), 0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4694426632156045d + "'", double2 == 0.4694426632156045d);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07649802229777113d) + "'", double1 == (-0.07649802229777113d));
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-1), 1.543073535942135d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999999999999d) + "'", double2 == (-0.9999999999999999d));
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.015625d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 10L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.378163642308943E12d, (double) 573L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326379126d + "'", double2 == 1.570796326379126d);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999959038668202d + "'", double1 == 0.9999959038668202d);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 2L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 7L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015840105828908848d + "'", double1 == 0.015840105828908848d);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7806737720297888d + "'", double1 == 0.7806737720297888d);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9225054335922256E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054335922256E-5d + "'", double1 == 1.9225054335922256E-5d);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 97L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        double double1 = org.apache.commons.math.util.FastMath.floor(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.223372036854778E18d + "'", double1 == 9.223372036854778E18d);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        int int1 = org.apache.commons.math.util.FastMath.round(9.223372E18f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1606074732651916d + "'", double1 == 2.1606074732651916d);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.3596375654124956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4328100205340816d + "'", double1 == 0.4328100205340816d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.047407404488248234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8964711396507173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7092603658226646d + "'", double1 == 2.7092603658226646d);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) -1, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.786480471441939E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.78648047144194E10d + "'", double1 == 9.78648047144194E10d);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.302585092994046d + "'", double1 == 2.302585092994046d);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (short) 100, 1.0980197632589186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.99999999999999d + "'", double2 == 99.99999999999999d);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        double double1 = org.apache.commons.math.util.FastMath.log(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0482269650408d + "'", double1 == 36.0482269650408d);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        double double1 = org.apache.commons.math.util.FastMath.sinh(9.786480471441939E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 52.0f, 88.41160108781288d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5316667212195025d + "'", double2 == 0.5316667212195025d);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.3962634015954634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        float float2 = org.apache.commons.math.util.FastMath.min(35.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) (byte) 1, 0.1900795435532183d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        double double1 = org.apache.commons.math.util.FastMath.floor(1261966.2318521824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0d + "'", double1 == 1261966.0d);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.18054648615969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5071221992618504d) + "'", double1 == (-0.5071221992618504d));
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        int int1 = org.apache.commons.math.util.FastMath.abs(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.834991508392875E-20d + "'", double1 == 1.834991508392875E-20d);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 9.223372E18f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5773024999492183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5235629479269245d + "'", double1 == 0.5235629479269245d);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        double double2 = org.apache.commons.math.util.FastMath.pow(207.12724888983414d, 9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        float float1 = org.apache.commons.math.util.FastMath.abs(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 32.0f + "'", float1 == 32.0f);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7805951733159243d + "'", double1 == 0.7805951733159243d);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403023058681398d + "'", double1 == 0.5403023058681398d);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        double double1 = org.apache.commons.math.util.FastMath.log10((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8342233605065102d, (-0.8488998154697595d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8342233605065101d + "'", double2 == 0.8342233605065101d);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.12217304763960307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12217304763960309d + "'", double1 == 0.12217304763960309d);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.3032833236333146d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9163193327076803d + "'", double1 == 0.9163193327076803d);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1797945711178876d) + "'", double1 == (-0.1797945711178876d));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.641588833612779d, 0.9262160379374064d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.144549764063218d + "'", double2 == 4.144549764063218d);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(13.845300947487885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.845300947487887d + "'", double1 == 13.845300947487887d);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.322916371343518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7543545188936296d + "'", double1 == 2.7543545188936296d);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 32, 1.0000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        double double2 = org.apache.commons.math.util.FastMath.min(1.02809969691994d, 3.1558490147807587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.02809969691994d + "'", double2 == 1.02809969691994d);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5812661035094697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        double double2 = org.apache.commons.math.util.FastMath.pow(99.30685281944005d, (-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.030307499521499394d + "'", double2 == 0.030307499521499394d);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1443601628891088d) + "'", double1 == (-0.1443601628891088d));
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.5773024999492183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.8199681505512405E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8569259205417066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7085012011516139d + "'", double1 == 0.7085012011516139d);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.7493933565307835d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.1155899177076452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8060294742125208d + "'", double1 == 0.8060294742125208d);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        double double2 = org.apache.commons.math.util.FastMath.max(26.0d, 14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 26.0d + "'", double2 == 26.0d);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.398057842737113E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1261966.2318521824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261967.0d + "'", double1 == 1261967.0d);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        double double1 = org.apache.commons.math.util.FastMath.ceil(56.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9163193327076803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3032833236333146d + "'", double1 == 1.3032833236333146d);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.5071221992618504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3977738256075148d) + "'", double1 == (-0.3977738256075148d));
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.30685281944007d + "'", double1 == 99.30685281944007d);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665127d + "'", double1 == 0.9033391107665127d);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0643321090394411d) + "'", double1 == (-0.0643321090394411d));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8686709614860095d + "'", double1 == 0.8686709614860095d);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.10728189713552241d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9163193327076803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5000715031063323d + "'", double1 == 1.5000715031063323d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6603469013500041d) + "'", double1 == (-0.6603469013500041d));
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.89629601826797E13d + "'", double1 == 7.89629601826797E13d);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11013.232874703393d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11013.232874703392d + "'", double2 == 11013.232874703392d);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438014d + "'", double1 == 1.1752011936438014d);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4080069217490346d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.435597088531952d + "'", double1 == 4.435597088531952d);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-6.053272382792571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.1443601628891088d), 11013.232874703395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.14436016288910877d) + "'", double2 == (-0.14436016288910877d));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        double double1 = org.apache.commons.math.util.FastMath.rint((-15.906532428616288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-16.0d) + "'", double1 == (-16.0d));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        double double1 = org.apache.commons.math.util.FastMath.exp(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9762070212577264E11d + "'", double1 == 1.9762070212577264E11d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        double double1 = org.apache.commons.math.util.FastMath.asinh(6.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4917798526449118d + "'", double1 == 2.4917798526449118d);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.5430735359421353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6483608274590842d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4997813562224119d + "'", double1 == 0.4997813562224119d);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        double double1 = org.apache.commons.math.util.FastMath.cos(99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33978118561914555d + "'", double1 == 0.33978118561914555d);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4445057894400712d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3588589435717465d) + "'", double1 == (-0.3588589435717465d));
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9877735581754346d, 0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9877735581754346d + "'", double2 == 1.9877735581754346d);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        double double1 = org.apache.commons.math.util.FastMath.log1p(99.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        long long2 = org.apache.commons.math.util.FastMath.min(32L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7711778429329054d + "'", double1 == 0.7711778429329054d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.07649802229777113d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9344065786069821d + "'", double1 == 0.9344065786069821d);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 35L + "'", long1 == 35L);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        double double1 = org.apache.commons.math.util.FastMath.atanh(5.685719999335932E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641588833612779d + "'", double1 == 4.641588833612779d);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        double double2 = org.apache.commons.math.util.FastMath.min(4.18054648615969d, 9.949874371066198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.18054648615969d + "'", double2 == 4.18054648615969d);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        long long1 = org.apache.commons.math.util.FastMath.round(2.7581226324091723d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 0, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9999999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.7368005696771d) + "'", double1 == (-36.7368005696771d));
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2919043892128164d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7805951733159243d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        double double1 = org.apache.commons.math.util.FastMath.abs(7.073385839060845E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.073385839060845E-7d + "'", double1 == 7.073385839060845E-7d);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0850005042632922d) + "'", double1 == (-0.0850005042632922d));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.71827069403746d + "'", double1 == 1.71827069403746d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.594700892207039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04747861148694368d, (-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04747861148694368d + "'", double2 == 0.04747861148694368d);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        long long2 = org.apache.commons.math.util.FastMath.max(10L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.2710663101885897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12911222262740002d) + "'", double1 == (-0.12911222262740002d));
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355404970159859E-7d + "'", double1 == 3.355404970159859E-7d);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.1558490147807587d, 5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6929693744344998d + "'", double1 == 1.6929693744344998d);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9344065786069821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029464112608972946d) + "'", double1 == (-0.029464112608972946d));
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.5017009167919775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46500741642797333d + "'", double1 == 0.46500741642797333d);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.04747861148694368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2919043892128164d, 2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2919043892128164d + "'", double2 == 2.2919043892128164d);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.17814068151824802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42206715285395996d + "'", double1 == 0.42206715285395996d);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7615941559557649d), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        float float2 = org.apache.commons.math.util.FastMath.max(97.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.338474404104274d + "'", double1 == 1.338474404104274d);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.34668423136158d + "'", double1 == 0.34668423136158d);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        long long1 = org.apache.commons.math.util.FastMath.abs(9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9877735581754346d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5030754111237369d + "'", double2 == 0.5030754111237369d);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) -1, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.10728189713552241d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        double double1 = org.apache.commons.math.util.FastMath.acosh(99.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.291336409328632d + "'", double1 == 5.291336409328632d);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.801969570734137d) + "'", double1 == (-29.801969570734137d));
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999954430011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707008595346152d + "'", double1 == 1.5707008595346152d);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (byte) 1, (-57.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.124050593532391d + "'", double2 == 3.124050593532391d);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7175057781016483d + "'", double1 == 0.7175057781016483d);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        double double1 = org.apache.commons.math.util.FastMath.rint(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2979.3805346802806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        double double1 = org.apache.commons.math.util.FastMath.ulp(36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3.3078511907005352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8657726204163207d + "'", double1 == 1.8657726204163207d);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 35L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        float float2 = org.apache.commons.math.util.FastMath.min(573.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.897423420904053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.0482269650408d + "'", double1 == 36.0482269650408d);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        double double1 = org.apache.commons.math.util.FastMath.log(3.7897808285809945E73d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 169.42101997711706d + "'", double1 == 169.42101997711706d);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1155899177076452d, (-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.115589917707645d + "'", double2 == 1.115589917707645d);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.594700892207039d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

