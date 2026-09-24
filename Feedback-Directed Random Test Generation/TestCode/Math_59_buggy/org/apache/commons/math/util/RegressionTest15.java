package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2706488717750568d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02321157975766268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023207412479587464d + "'", double1 == 0.023207412479587464d);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 2105L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4363390260750379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.467699925813914d) + "'", double1 == (-0.467699925813914d));
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.047514327475808714d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047532207641238694d + "'", double1 == 0.047532207641238694d);
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1123.3727038931393d + "'", double1 == 1123.3727038931393d);
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.1936435159220643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19127615185222843d + "'", double1 == 0.19127615185222843d);
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.37265448204541224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9313641603463556d + "'", double1 == 0.9313641603463556d);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.231079894239296d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5440482715802522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.01693485514155029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.00014339808637d + "'", double1 == 1.00014339808637d);
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        double double2 = org.apache.commons.math.util.FastMath.max(0.003358054049998483d, 1.0486237723781806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0486237723781806d + "'", double2 == 1.0486237723781806d);
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6897511201227055d), (-3.516464347103154d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        double double1 = org.apache.commons.math.util.FastMath.tan(1261966.2318521824d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.662514763028327d + "'", double1 == 1.662514763028327d);
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.981992372399956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6697701228637745d + "'", double1 == 2.6697701228637745d);
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.922505433355371E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.922505433355371E-5d + "'", double1 == 1.922505433355371E-5d);
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7929030831950329d + "'", double1 == 0.7929030831950329d);
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8334357964461425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9333289938105209d + "'", double1 == 0.9333289938105209d);
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-11.13756594658902d), 0.702683232003031d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5077885645823308d) + "'", double2 == (-1.5077885645823308d));
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        long long1 = org.apache.commons.math.util.FastMath.round(1.6849742439769542d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7766609160650201d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8571305341625857d) + "'", double1 == (-0.8571305341625857d));
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.027415567773547207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.06230646868508781d), 9.733479389818152E-8d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.06230646868508781d) + "'", double2 == (-0.06230646868508781d));
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5937881252841114d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.656854249492381d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.566661270303212d, 14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.03842139290913186d + "'", double2 == 0.03842139290913186d);
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 32.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.666536656761523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6250369392251007d + "'", double1 == 0.6250369392251007d);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5990573688262014E224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.427768900977763E74d + "'", double1 == 5.427768900977763E74d);
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(5.607240273008E12d, 0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.607240273007999E12d + "'", double2 == 5.607240273007999E12d);
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.019926209128347205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2711075181832782d + "'", double1 == 0.2711075181832782d);
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        double double1 = org.apache.commons.math.util.FastMath.cosh(57.29577951308234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8212977905418196E24d + "'", double1 == 3.8212977905418196E24d);
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        double double1 = org.apache.commons.math.util.FastMath.cosh(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3992154382857253E248d + "'", double1 == 3.3992154382857253E248d);
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.39522188866412444d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.862318872287684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9518224930797358d + "'", double1 == 0.9518224930797358d);
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9962287607713785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.538659632515502d + "'", double1 == 1.538659632515502d);
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.12125048919205E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.12125048919205E-18d + "'", double1 == 4.12125048919205E-18d);
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.566661270303212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44894677555465945d + "'", double1 == 0.44894677555465945d);
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.026785246294635624d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.520586644733795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.435889973440437d + "'", double1 == 11.435889973440437d);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.669115964572823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5843980649389331d + "'", double1 == 0.5843980649389331d);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 24L, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.8519238076558282d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-47.82715545863623d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 7, (float) 21L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.516464347103154d), 1.6832810232787436d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1243451287244837d) + "'", double2 == (-1.1243451287244837d));
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.41078129050290885d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41078129050290885d + "'", double1 == 0.41078129050290885d);
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        double double1 = org.apache.commons.math.util.FastMath.cos(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.37357877856082744d + "'", double1 == 0.37357877856082744d);
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.506999785948914d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16571020934276792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1802310322348819d + "'", double1 == 0.1802310322348819d);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9033343321773988d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 51.75724472303371d + "'", double1 == 51.75724472303371d);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        double double2 = org.apache.commons.math.util.FastMath.max(0.37357877856082744d, 1.7571699146056852d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7571699146056852d + "'", double2 == 1.7571699146056852d);
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1752011929370179d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011929370179d + "'", double1 == 1.1752011929370179d);
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.06515518537002861d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0651551853700286d) + "'", double1 == (-0.0651551853700286d));
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        double double1 = org.apache.commons.math.util.FastMath.log(0.027708598556821548d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.5860124967445253d) + "'", double1 == (-3.5860124967445253d));
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(386.7761267440676d, 30.566416618160495d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 386.77612674406754d + "'", double2 == 386.77612674406754d);
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        double double1 = org.apache.commons.math.util.FastMath.sinh(52.50123045039397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1620205061985014E22d + "'", double1 == 3.1620205061985014E22d);
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 10, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        int int2 = org.apache.commons.math.util.FastMath.max(88, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.3844911685834901d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-6.4742592311448774d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8281987638796728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6762038531919243d + "'", double1 == 0.6762038531919243d);
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7151743879062039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1455880470507534d) + "'", double1 == (-0.1455880470507534d));
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5193968358809402d + "'", double1 == 1.5193968358809402d);
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2378432659522425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 70.9231948377534d + "'", double1 == 70.9231948377534d);
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4984945046599057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49849450465990575d + "'", double1 == 0.49849450465990575d);
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.40846716344564316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1500222153141935d + "'", double1 == 1.1500222153141935d);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5258789063684237E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789063684237E-5d + "'", double1 == 1.5258789063684237E-5d);
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15327808949840438d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026752073329137003d + "'", double1 == 0.0026752073329137003d);
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5937881252841113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5212327146899054d) + "'", double1 == (-0.5212327146899054d));
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.53567799509857d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.624987626712537d + "'", double1 == 11.624987626712537d);
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.48500857799096964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5042485128603001d + "'", double1 == 0.5042485128603001d);
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5699061505137777d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0224922732521746d + "'", double1 == 1.0224922732521746d);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.8550048170562258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7545740771672895d + "'", double1 == 0.7545740771672895d);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.006790074609561d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0033892936490607d + "'", double1 == 1.0033892936490607d);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.338311150777212E44d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0000000000000564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936438884d + "'", double1 == 1.1752011936438884d);
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        int int1 = org.apache.commons.math.util.FastMath.round(32.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999103740052038d + "'", double1 == 0.9999103740052038d);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        double double1 = org.apache.commons.math.util.FastMath.signum(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9513433746520442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.016604074204712136d) + "'", double1 == (-0.016604074204712136d));
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.33410855904595715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3222076544771963d + "'", double1 == 0.3222076544771963d);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0790099456648899d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(23.62434292201784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.860487930446679d + "'", double1 == 4.860487930446679d);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.3250734611491427d), (-2.2529813614778327d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.37875811820847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0624758151222142d + "'", double1 == 3.0624758151222142d);
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.3250734611491427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39315142536422965d) + "'", double1 == (-0.39315142536422965d));
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.5526261428708923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8206232337472084d + "'", double1 == 0.8206232337472084d);
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0037665865012192047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 88, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.9822165519059916d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4079121250653364d + "'", double1 == 1.4079121250653364d);
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.026700664390811216d), 0.36332563610469826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.026700664390811216d) + "'", double2 == (-0.026700664390811216d));
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 252318064);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 252318064L + "'", long1 == 252318064L);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        double double1 = org.apache.commons.math.util.FastMath.acosh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.158638853279167d + "'", double1 == 4.158638853279167d);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.17415508950769856d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1732865386340432d + "'", double1 == 0.1732865386340432d);
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0023782107733894223d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0003297196233993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003297196233996d + "'", double1 == 1.0003297196233996d);
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        double double1 = org.apache.commons.math.util.FastMath.floor(6060.800489722827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6060.0d + "'", double1 == 6060.0d);
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9763608754884532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6346446623333779d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3940493875124622d, 0.07011222389235412d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07011222389235412d + "'", double2 == 0.07011222389235412d);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.155849014780759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.47295752174863d + "'", double1 == 23.47295752174863d);
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(60.30380470871524d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.921464049239914d + "'", double1 == 3.921464049239914d);
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9525849574608642d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.395800713121622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3958007131216221d + "'", double1 == 1.3958007131216221d);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8148580335308185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0607262979269563d + "'", double1 == 1.0607262979269563d);
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        double double1 = org.apache.commons.math.util.FastMath.acos(1108.4556657549201d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        double double1 = org.apache.commons.math.util.FastMath.abs((-9.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.0d + "'", double1 == 9.0d);
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.08308215993632734d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        double double1 = org.apache.commons.math.util.FastMath.floor(11.13028260783892d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.6881824710286039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.822285085872435d) + "'", double1 == (-0.822285085872435d));
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.16646964819512283d, (-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9304472369983396d + "'", double2 == 2.9304472369983396d);
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0144000753344111d + "'", double1 == 1.0144000753344111d);
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-2.556320495207163d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8622926809699384d), (-8.144346427974586d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8622926809699385d) + "'", double2 == (-0.8622926809699385d));
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4350981213052501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.36123322409017133d + "'", double1 == 0.36123322409017133d);
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        double double1 = org.apache.commons.math.util.FastMath.acosh(16.01682731613292d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.465811118179043d + "'", double1 == 3.465811118179043d);
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1707323589456107d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4571067167281766d + "'", double1 == 1.4571067167281766d);
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        int int2 = org.apache.commons.math.util.FastMath.min(573, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.258046185049248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1538952507055567d + "'", double1 == 1.1538952507055567d);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.28858290004402326d, 2.15082891211336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1333763191612873d + "'", double2 == 0.1333763191612873d);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8582226493088282d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9717320044784657d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.12246868058081d + "'", double1 == 2.12246868058081d);
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5195530114104545d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        long long1 = org.apache.commons.math.util.FastMath.abs(22025L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.005126506862960794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.94744238847516E-5d + "'", double1 == 8.94744238847516E-5d);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9442157056960554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.737153155240159d + "'", double1 == 0.737153155240159d);
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.46036359942346083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43038050860940513d + "'", double1 == 0.43038050860940513d);
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.716348056229995E16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7163480562299952E16d + "'", double1 == 1.7163480562299952E16d);
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8784747043354492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12956816592384285d) + "'", double1 == (-0.12956816592384285d));
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        double double2 = org.apache.commons.math.util.FastMath.max((double) (-1), 0.9992606284658041d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9992606284658041d + "'", double2 == 0.9992606284658041d);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3363319325507605d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.3169578969248166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8545352927414394d + "'", double1 == 3.8545352927414394d);
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5193968358809402d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.020576033879047353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.5430735359421353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5430735359421353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9957880446333222d + "'", double1 == 0.9957880446333222d);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6242244357574577d + "'", double1 == 0.6242244357574577d);
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.2937272068925049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2896596422698989d + "'", double1 == 0.2896596422698989d);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        double double1 = org.apache.commons.math.util.FastMath.acos(30.566416618160495d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        int int2 = org.apache.commons.math.util.FastMath.max((-2), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.687884041545413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42941052881510655d + "'", double1 == 0.42941052881510655d);
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3962634015954634d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8962777330788523d + "'", double1 == 1.8962777330788523d);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        int int1 = org.apache.commons.math.util.FastMath.abs(252318064);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 252318064 + "'", int1 == 252318064);
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.586494943452394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8431572614602446d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.573924941356922d + "'", double1 == 2.573924941356922d);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-15.906532428616288d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.906532428616286d) + "'", double1 == (-15.906532428616286d));
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-2104.9999999999995d), 0.6161114410916003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.570503637282546d) + "'", double2 == (-1.570503637282546d));
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9862108565452042d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 44);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.36221796077615454d, 2.291904389212817d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3622179607761546d + "'", double2 == 0.3622179607761546d);
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.164006151880159d, 1.066732021965656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8289768072510253d + "'", double2 == 0.8289768072510253d);
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.7267002501159548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6744030727096091d) + "'", double1 == (-0.6744030727096091d));
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6947987431833846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5266257059491419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4230598789337311d + "'", double1 == 0.4230598789337311d);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        int int1 = org.apache.commons.math.util.FastMath.round(9.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        double double1 = org.apache.commons.math.util.FastMath.atanh(76.93224517135305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        int int2 = org.apache.commons.math.util.FastMath.min(35, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.44760755429150645d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4476075542915065d + "'", double1 == 0.4476075542915065d);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9225054330000896E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054328816626E-5d + "'", double1 == 1.9225054328816626E-5d);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        double double2 = org.apache.commons.math.util.FastMath.max(7.737125245533627E25d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.737125245533627E25d + "'", double2 == 7.737125245533627E25d);
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        long long1 = org.apache.commons.math.util.FastMath.round(4.092046153706293E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.28858290004402326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29687014491226815d + "'", double1 == 0.29687014491226815d);
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.762834413413614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(5.583020167494775d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 319.8834925338725d + "'", double1 == 319.8834925338725d);
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.051259701279579704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05123725626428588d + "'", double1 == 0.05123725626428588d);
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5707963263486864d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8079471069956127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.344535127944533d + "'", double1 == 1.344535127944533d);
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5258789063684237E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        double double1 = org.apache.commons.math.util.FastMath.sinh(104.06639041664197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.842041095903772E44d + "'", double1 == 7.842041095903772E44d);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5645645685050509d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027306803080457513d + "'", double1 == 0.027306803080457513d);
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.16649096046410153d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002905815434906278d + "'", double1 == 0.002905815434906278d);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        double double1 = org.apache.commons.math.util.FastMath.signum(1164.1175712113197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        double double1 = org.apache.commons.math.util.FastMath.exp(7.0368744177664E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        long long2 = org.apache.commons.math.util.FastMath.max(38L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 38L + "'", long2 == 38L);
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.053272382792571d, 7.54983443527075d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6758226352556027d + "'", double2 == 0.6758226352556027d);
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6588988415573005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0283135696992154d + "'", double1 == 1.0283135696992154d);
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5269814632356071d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9270254928966067d + "'", double1 == 0.9270254928966067d);
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.026744865808352235d, 14.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.580009162762818E-23d + "'", double2 == 9.580009162762818E-23d);
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        double double2 = org.apache.commons.math.util.FastMath.max((double) 4L, 1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        long long2 = org.apache.commons.math.util.FastMath.min(7L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.0446384732171334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.927895858986315d + "'", double1 == 3.927895858986315d);
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8486310513737183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 48.6229776074638d + "'", double1 == 48.6229776074638d);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.785670652509231E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.7212497613894784d) + "'", double1 == (-3.7212497613894784d));
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6949030854871132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1195149937370361d + "'", double1 == 1.1195149937370361d);
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        double double1 = org.apache.commons.math.util.FastMath.exp(4.806217383937352E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000048062289337d + "'", double1 == 1.0000048062289337d);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.14436016288910883d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15530012983524727d + "'", double1 == 0.15530012983524727d);
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.005126506862960794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        double double2 = org.apache.commons.math.util.FastMath.max(3.8754094422318124E-18d, 0.5773024999492186d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5773024999492186d + "'", double2 == 0.5773024999492186d);
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.092046153706521E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3445697418012538E-5d + "'", double1 == 2.3445697418012538E-5d);
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.09507068650612024d, 0.7310973244101043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09507068650612026d + "'", double2 == 0.09507068650612026d);
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6269849711913712d + "'", double1 == 0.6269849711913712d);
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        double double1 = org.apache.commons.math.util.FastMath.tanh(181.18516357615334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.1256138592702154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9719067723105449d + "'", double1 == 0.9719067723105449d);
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5634006723939925E8d + "'", double1 == 1.5634006723939925E8d);
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.355404970159922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        int int1 = org.apache.commons.math.util.FastMath.round(38.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        float float1 = org.apache.commons.math.util.FastMath.abs((-2.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02693177575907612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.61444843452283d) + "'", double1 == (-3.61444843452283d));
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6400357798772336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 31.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.8758577137362275d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6291227665749557d + "'", double1 == 3.6291227665749557d);
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.1820629731608001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        int int2 = org.apache.commons.math.util.FastMath.max(2105, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6218099972365794d, (-8.415543885269349d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6218099972365793d + "'", double2 == 0.6218099972365793d);
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        double double1 = org.apache.commons.math.util.FastMath.log10(26.702762565175334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4265561941266642d + "'", double1 == 1.4265561941266642d);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5707008595346152d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00788160505235013d + "'", double1 == 0.00788160505235013d);
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        double double2 = org.apache.commons.math.util.FastMath.max(0.36938946978079723d, (-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.36938946978079723d + "'", double2 == 0.36938946978079723d);
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        double double2 = org.apache.commons.math.util.FastMath.min(1.117692795479829d, (-0.22690570903791685d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.22690570903791685d) + "'", double2 == (-0.22690570903791685d));
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1185968158812507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.482336065982447d + "'", double1 == 0.482336065982447d);
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.257208982583337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6576038937046224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.46297836831268596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8947262842125601d + "'", double1 == 0.8947262842125601d);
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9228015395339156d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.320925154115482d + "'", double1 == 1.320925154115482d);
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        long long2 = org.apache.commons.math.util.FastMath.min(4L, (long) 57);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.614548555343225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.84139267594658d) + "'", double1 == (-22.84139267594658d));
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        double double2 = org.apache.commons.math.util.FastMath.min((-59.00187915014031d), 0.027181157926883755d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-59.00187915014031d) + "'", double2 == (-59.00187915014031d));
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.027406828344271994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30149926649701686d + "'", double1 == 0.30149926649701686d);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        double double2 = org.apache.commons.math.util.FastMath.max(0.04405404020821298d, 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        double double1 = org.apache.commons.math.util.FastMath.expm1(97.09607204776374d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4732902162636147E42d + "'", double1 == 1.4732902162636147E42d);
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        float float2 = org.apache.commons.math.util.FastMath.max(57.0f, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0497671000301219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.718265747676712d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        double double2 = org.apache.commons.math.util.FastMath.max(0.1253169546054925d, 0.037610840448247515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1253169546054925d + "'", double2 == 0.1253169546054925d);
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        long long2 = org.apache.commons.math.util.FastMath.min(2L, 9L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.22882280821594225d, (-6.053272382793105d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22882280821594222d + "'", double2 == 0.22882280821594222d);
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        double double2 = org.apache.commons.math.util.FastMath.max(0.16723958605665326d, (double) 2105L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2105.0d + "'", double2 == 2105.0d);
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        double double1 = org.apache.commons.math.util.FastMath.exp((-88.99999999999997d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.227363561795807E-39d + "'", double1 == 2.227363561795807E-39d);
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2915496650148837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.638420522237698d + "'", double1 == 3.638420522237698d);
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.009972525083085704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0100224164209735d + "'", double1 == 1.0100224164209735d);
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 1, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.18054648615969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.40158451054796d + "'", double1 == 64.40158451054796d);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.9922350436600222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5311260223141459d) + "'", double1 == (-1.5311260223141459d));
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8567638683085653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8567638683085653d + "'", double1 == 0.8567638683085653d);
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.13250759287604744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13289845629372468d + "'", double1 == 0.13289845629372468d);
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.46749182950293094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.5575274776122784d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6795224267964927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5185094832388669d + "'", double1 == 0.5185094832388669d);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        double double1 = org.apache.commons.math.util.FastMath.sinh(99.98991284675515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3305689962177146E43d + "'", double1 == 1.3305689962177146E43d);
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5266257059491419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6932092724703223d + "'", double1 == 1.6932092724703223d);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.338311150777212E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.338311150777212E44d + "'", double1 == 7.338311150777212E44d);
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1262023.5276316945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.011436055974333992d, 207.12724888983414d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5212706314637656E-5d + "'", double2 == 5.5212706314637656E-5d);
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9995818558737992d, 0.5005983596580951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999790655876222d + "'", double2 == 0.999790655876222d);
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        int int2 = org.apache.commons.math.util.FastMath.min(22025, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.331941588598159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7240465401405306d + "'", double1 == 0.7240465401405306d);
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        float float2 = org.apache.commons.math.util.FastMath.min(145.0f, (float) 21L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        double double1 = org.apache.commons.math.util.FastMath.tanh(22025.46174822276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        double double1 = org.apache.commons.math.util.FastMath.exp(2738.593745198908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.009494959585376654d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7593379915389414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.46500741642797333d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3325401204690593d) + "'", double1 == (-0.3325401204690593d));
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.064934783641962d, 1.2017861323049612d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.064934783641961d + "'", double2 == 4.064934783641961d);
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.25609884107417175d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.009494959628835965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571830786712632E-4d) + "'", double1 == (-1.6571830786712632E-4d));
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        long long1 = org.apache.commons.math.util.FastMath.round(0.41032129904825876d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.3873669366539792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3977738256075148d) + "'", double1 == (-0.3977738256075148d));
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        float float2 = org.apache.commons.math.util.FastMath.min(38.0f, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5988224392024553d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1847163416814828d + "'", double1 == 1.1847163416814828d);
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.03760197886023984d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992931288863935d + "'", double1 == 0.9992931288863935d);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.12126956628620691d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.012933598027822206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0130175987600416d + "'", double1 == 1.0130175987600416d);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        long long1 = org.apache.commons.math.util.FastMath.round(0.8835877589816592d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.0011015144742223212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.9580097917192205d) + "'", double1 == (-2.9580097917192205d));
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.1310193973073308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9710527319006851d) + "'", double1 == (-0.9710527319006851d));
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 2405171239L, 1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963261418054d + "'", double2 == 1.5707963261418054d);
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.027676573351037934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.7929030831950329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.209802363378155d + "'", double1 == 1.209802363378155d);
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.558278729101541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7506370702293332d + "'", double1 == 3.7506370702293332d);
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        long long1 = org.apache.commons.math.util.FastMath.round(7.0368744177664E13d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 70368744177664L + "'", long1 == 70368744177664L);
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.1749455142537386d, 0.03905859609139826d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1749455142537384d + "'", double2 == 1.1749455142537384d);
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.01693485514155029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2567992959374606d) + "'", double1 == (-0.2567992959374606d));
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        double double2 = org.apache.commons.math.util.FastMath.max(1.003623462990636d, 0.025684489383558138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.003623462990636d + "'", double2 == 1.003623462990636d);
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        double double1 = org.apache.commons.math.util.FastMath.expm1(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042505E42d + "'", double1 == 1.3383347192042505E42d);
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        double double1 = org.apache.commons.math.util.FastMath.asin(18.132482812411777d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        long long2 = org.apache.commons.math.util.FastMath.max((-1L), (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.03994949099270701d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3984887497784473d) + "'", double1 == (-1.3984887497784473d));
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        double double1 = org.apache.commons.math.util.FastMath.rint(21.487562596892644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9922350436600222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.997404952775158d) + "'", double1 == (-0.997404952775158d));
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        int int1 = org.apache.commons.math.util.FastMath.abs(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.71827069403746d, 0.020598917446710018d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7182706940374595d + "'", double2 == 2.7182706940374595d);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5664744974827294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5664744974827294d + "'", double1 == 1.5664744974827294d);
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.1644937984762475d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.163752983493265d + "'", double1 == 0.163752983493265d);
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8435037267365852d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8435037267365852d + "'", double1 == 1.8435037267365852d);
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        int int1 = org.apache.commons.math.util.FastMath.abs((-5));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.999470683622238d, 2.9166666666666665d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.999470683622237d + "'", double2 == 7.999470683622237d);
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.8660533668334749d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9306198831066714d + "'", double1 == 0.9306198831066714d);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.33730966282112745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3507127702249935d) + "'", double1 == (-0.3507127702249935d));
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9717320044784657d, (-64.09353460322046d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9717320044784656d + "'", double2 == 0.9717320044784656d);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        double double2 = org.apache.commons.math.util.FastMath.pow(5.050000000000001d, 0.7615941553786771d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.43259529684736d + "'", double2 == 3.43259529684736d);
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        double double2 = org.apache.commons.math.util.FastMath.min(96.0d, 0.8931193992435265d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8931193992435265d + "'", double2 == 0.8931193992435265d);
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1800736247033484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16557683034755713d + "'", double1 == 0.16557683034755713d);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.057101686238878076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.38507883074354915d + "'", double1 == 0.38507883074354915d);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.7182818284590375d, 0.4624424875899187d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.718281828459037d + "'", double2 == 2.718281828459037d);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.5063656411097466d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5063656411097465d) + "'", double1 == (-0.5063656411097465d));
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9836434950657202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.869760369346332d + "'", double1 == 0.869760369346332d);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8645505642120598d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3418436161673093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1029791463344196d + "'", double1 == 1.1029791463344196d);
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9225239138463643E-5d, 1.1847163416814828d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1847163416814828d + "'", double2 == 1.1847163416814828d);
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        double double2 = org.apache.commons.math.util.FastMath.min(5.6522336740340915d, 0.41622255643392403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.41622255643392403d + "'", double2 == 0.41622255643392403d);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.010703208866066098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010703208866066098d + "'", double1 == 0.010703208866066098d);
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.8210429626092037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9490623602794171d) + "'", double1 == (-0.9490623602794171d));
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9030899869919435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015761893714802175d + "'", double1 == 0.015761893714802175d);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0239868679260569d, 0.8405693131513021d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0201244245550114d + "'", double2 == 1.0201244245550114d);
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9624960684073707d + "'", double1 == 2.9624960684073707d);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.3978952727983702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7359704175800965d) + "'", double1 == (-0.7359704175800965d));
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.6810043444511893d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(9.434905982971384E167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.646701740189627E166d + "'", double1 == 1.646701740189627E166d);
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.48500857799096964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.78894454652419d + "'", double1 == 27.78894454652419d);
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5680724581504838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.566616563906514d + "'", double1 == 0.566616563906514d);
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5707849382711037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.810422597041198d + "'", double1 == 3.810422597041198d);
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.848501131276807d), 1.0821368667394677d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.2966900568644943d) + "'", double2 == (-1.2966900568644943d));
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5403140444367246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.9529619711981727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.089425942248695d + "'", double1 == 52.089425942248695d);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707639925974655d, 5.60724027300823E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8013138658578754E-13d + "'", double2 == 2.8013138658578754E-13d);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.6929551345251551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6059822019406358d + "'", double1 == 0.6059822019406358d);
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.180231032234882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0863843851210684d + "'", double1 == 1.0863843851210684d);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.043456497483734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.793828860836693d + "'", double1 == 3.793828860836693d);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.981992372399956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7763127943644386d + "'", double1 == 0.7763127943644386d);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.0069488823192564554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0069730818226932d + "'", double1 == 1.0069730818226932d);
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.247220505424423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2456957589636597d) + "'", double1 == (-1.2456957589636597d));
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        double double1 = org.apache.commons.math.util.FastMath.acos(50.69314718055995d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1749455142537384d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3928546462301097d + "'", double1 == 2.3928546462301097d);
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.05363026241493581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0550944219637926d + "'", double1 == 1.0550944219637926d);
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 57, 26.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 4);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 54.598150033144236d + "'", double1 == 54.598150033144236d);
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6762038531919243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.011801983652871448d + "'", double1 == 0.011801983652871448d);
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5451146601807795d, 0.8772827919571972d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5451146601807795d + "'", double2 == 1.5451146601807795d);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.545676718844663d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        double double1 = org.apache.commons.math.util.FastMath.expm1(5.551115123125783E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.017480437429290896d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.757447703809722d) + "'", double1 == (-1.757447703809722d));
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.24769860755486173d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.030834470682018d + "'", double1 == 1.030834470682018d);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        double double2 = org.apache.commons.math.util.FastMath.min(38.45962336030118d, 27.951773034959217d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 27.951773034959217d + "'", double2 == 27.951773034959217d);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        long long2 = org.apache.commons.math.util.FastMath.max(252318057L, (long) 2105);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318057L + "'", long2 == 252318057L);
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        double double1 = org.apache.commons.math.util.FastMath.log10((-3.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.6916735960213485E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.6916735960213485E41d + "'", double1 == 6.6916735960213485E41d);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.558278729101541d, 8.09158438412067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 36.20799082484449d + "'", double2 == 36.20799082484449d);
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        double double1 = org.apache.commons.math.util.FastMath.cos(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1729941422876436d + "'", double1 == 0.1729941422876436d);
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.970329505706851d, 515119.2812612585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9703295057068511d + "'", double2 == 0.9703295057068511d);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(9.674658414801334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.11041129351109d + "'", double1 == 3.11041129351109d);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1216780097738317d + "'", double1 == 1.1216780097738317d);
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.73931296875567d + "'", double1 == 84.73931296875567d);
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.07892776711333702d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.07900994566488992d + "'", double1 == 0.07900994566488992d);
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4290881902052651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4169057093427464d + "'", double1 == 0.4169057093427464d);
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        int int2 = org.apache.commons.math.util.FastMath.max(7, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43863689361672054d + "'", double1 == 0.43863689361672054d);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.007385037334679E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.685844387060522E14d + "'", double1 == 3.685844387060522E14d);
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        double double1 = org.apache.commons.math.util.FastMath.asin((-8.415543885269349d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.0214659450282346d), (-0.3053205627843726d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3053205627843726d) + "'", double2 == (-0.3053205627843726d));
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5263007573504037d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.8622926809699383d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.4766393240263169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        double double1 = org.apache.commons.math.util.FastMath.log(1.7165316160329993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403057526408277d + "'", double1 == 0.5403057526408277d);
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        int int2 = org.apache.commons.math.util.FastMath.min(5, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        long long1 = org.apache.commons.math.util.FastMath.round(1.7544036781775962d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.42941052881510655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45917371711502425d + "'", double1 == 0.45917371711502425d);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0797696988252596d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8237344352789204d + "'", double1 == 0.8237344352789204d);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        long long2 = org.apache.commons.math.util.FastMath.min(3L, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3374L, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0177774980683254E-13d + "'", double1 == 1.0177774980683254E-13d);
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.6603469013500041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.619879087765546d) + "'", double1 == (-0.619879087765546d));
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(38.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2177.239621497128d + "'", double1 == 2177.239621497128d);
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        double double1 = org.apache.commons.math.util.FastMath.ceil(9.169084941497005E58d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.169084941497005E58d + "'", double1 == 9.169084941497005E58d);
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(62.00187531968229d, (-2.9999999999999996d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 62.001875319682284d + "'", double2 == 62.001875319682284d);
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        float float2 = org.apache.commons.math.util.FastMath.min(9.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.POSITIVE_INFINITY, 2502.0077057310687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7357275822226734d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        double double1 = org.apache.commons.math.util.FastMath.expm1(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 26.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.0d + "'", double1 == 26.0d);
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.549478463118442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00959020835021504d) + "'", double1 == (-0.00959020835021504d));
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.948148009134E13d, 0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948755d + "'", double2 == 1.5707963267948755d);
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        double double1 = org.apache.commons.math.util.FastMath.sin(184.52940052788836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7342532423748005d + "'", double1 == 0.7342532423748005d);
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2110835568321545E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000121109089048d + "'", double1 == 1.0000121109089048d);
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006625404912081631d + "'", double1 == 0.006625404912081631d);
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.436278331420456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 573);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        double double1 = org.apache.commons.math.util.FastMath.abs(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.305661184154149d + "'", double1 == 8.305661184154149d);
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.6881824710286039d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8444947972912709d) + "'", double1 == (-0.8444947972912709d));
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4790553853029686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        double double1 = org.apache.commons.math.util.FastMath.acos(54.31009080891797d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        double double2 = org.apache.commons.math.util.FastMath.max(4.255946955090421d, 0.02740339846894975d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.255946955090421d + "'", double2 == 4.255946955090421d);
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0001924087026581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001924087026581d + "'", double1 == 1.0001924087026581d);
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.391211443014167d + "'", double1 == 3.391211443014167d);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        double double2 = org.apache.commons.math.util.FastMath.max(1.4861883958752362d, 25.99999999999995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.99999999999995d + "'", double2 == 25.99999999999995d);
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.3250734611491427d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3250734611491427d + "'", double1 == 0.3250734611491427d);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        int int2 = org.apache.commons.math.util.FastMath.min(7, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.718281827836512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913289157898506d + "'", double1 == 0.9913289157898506d);
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        double double1 = org.apache.commons.math.util.FastMath.sinh(7.89629601826829E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5792809126705765d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8368565106885936d + "'", double1 == 0.8368565106885936d);
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        double double1 = org.apache.commons.math.util.FastMath.sinh(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1634508.6862359024d + "'", double1 == 1634508.6862359024d);
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        double double1 = org.apache.commons.math.util.FastMath.asin(9.586494943452394d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.607240273007999E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.607240273008E12d + "'", double1 == 5.607240273008E12d);
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1692480936637681d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9763608754884532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.023923011433662468d) + "'", double1 == (-0.023923011433662468d));
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        double double1 = org.apache.commons.math.util.FastMath.floor(17765.729914390176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17765.0d + "'", double1 == 17765.0d);
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 14L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.0013377555385146107d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        double double1 = org.apache.commons.math.util.FastMath.atan(8.943562482807576E-24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.943562482807576E-24d + "'", double1 == 8.943562482807576E-24d);
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        int int2 = org.apache.commons.math.util.FastMath.max(22025, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.19006280234111023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.4365120111136123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5968020998202846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1834353217914126d + "'", double1 == 1.1834353217914126d);
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) -1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        double double1 = org.apache.commons.math.util.FastMath.acos(6.978995704713228E82d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.5257228523581828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7459634284910276d) + "'", double1 == (-0.7459634284910276d));
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        double double1 = org.apache.commons.math.util.FastMath.sin(9.2233720368547451E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0519393961983163d + "'", double1 == 0.0519393961983163d);
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.535856475922823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.8373005113295966E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000001169973836d + "'", double1 == 1.0000001169973836d);
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6931471804454368d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        double double1 = org.apache.commons.math.util.FastMath.asinh(3.130126224133262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.858812034116941d + "'", double1 == 1.858812034116941d);
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6929551345251551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.5604676481299897d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4855425219370817d + "'", double1 == 2.4855425219370817d);
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.6483608216038771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5705654479051033d + "'", double1 == 0.5705654479051033d);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8401501864046733d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8401501864046732d + "'", double2 == 0.8401501864046732d);
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.37661497259666377d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.31381977877042333d) + "'", double1 == (-0.31381977877042333d));
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.8421709430404007E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.546349804879155d) + "'", double1 == (-13.546349804879155d));
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7237368423548132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8837010719759295d + "'", double1 == 0.8837010719759295d);
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0009877980461306d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        double double1 = org.apache.commons.math.util.FastMath.sin(10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.954616416642997d) + "'", double1 == (-0.954616416642997d));
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        float float1 = org.apache.commons.math.util.FastMath.abs(573.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 573.0f + "'", float1 == 573.0f);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.570784215959328d, 0.9999103740052037d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0039219324667403d + "'", double2 == 1.0039219324667403d);
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 6061L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6061 + "'", int1 == 6061);
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.8117141891585623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 46.507797209669384d + "'", double1 == 46.507797209669384d);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5707963261418054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473513485225d + "'", double1 == 1.1624473513485225d);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9153412831308465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9153412831308466d + "'", double1 == 0.9153412831308466d);
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3411556794582669d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7809582065568654d + "'", double1 == 1.7809582065568654d);
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.11242999849270602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11290734809029539d) + "'", double1 == (-0.11290734809029539d));
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 145, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7836624457399028d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.90055070379631d + "'", double1 == 44.90055070379631d);
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3916997416124741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3916997416124743d + "'", double1 == 1.3916997416124743d);
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.047407404488248234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        double double1 = org.apache.commons.math.util.FastMath.ulp(32.69314718055993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.1438634000260818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.144868408209819d) + "'", double1 == (-0.144868408209819d));
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7765227797066595E55d, 1.570796326794896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        double double2 = org.apache.commons.math.util.FastMath.pow(4.12125048919205E-18d, (-1.757447703809722d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.574187603328559E30d + "'", double2 == 3.574187603328559E30d);
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        double double2 = org.apache.commons.math.util.FastMath.min(2.842859999667966E24d, 1.424516743121025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.424516743121025d + "'", double2 == 1.424516743121025d);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9587343982924914d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        double double2 = org.apache.commons.math.util.FastMath.min(4.0920461537065214E-7d, 0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0920461537065214E-7d + "'", double2 == 4.0920461537065214E-7d);
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.39522188866412444d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.40559151081122097d) + "'", double1 == (-0.40559151081122097d));
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.49186351728990335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4000260212501031d + "'", double1 == 0.4000260212501031d);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.806217383937352E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.318196590063668d) + "'", double1 == (-5.318196590063668d));
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        double double1 = org.apache.commons.math.util.FastMath.log(0.6712757054461316d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39857533900047715d) + "'", double1 == (-0.39857533900047715d));
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 100, 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        double double1 = org.apache.commons.math.util.FastMath.log10((-111.63986321151813d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.5469160326749675E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.3072816183413566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0475836473520026d + "'", double1 == 1.0475836473520026d);
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.12311456005264212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.1234277126187036d) + "'", double1 == (-0.1234277126187036d));
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97864804714L + "'", long2 == 97864804714L);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17259828953034054d + "'", double1 == 0.17259828953034054d);
    }
}

