package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21580950969080773d + "'", double1 == 0.21580950969080773d);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2184249125858766d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(11.548739357257746d, 0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.548739357257745d + "'", double2 == 11.548739357257745d);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.486876001962704d + "'", double1 == 0.486876001962704d);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.8977914424923646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9646989825943999d + "'", double1 == 0.9646989825943999d);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        double double1 = org.apache.commons.math.util.FastMath.exp(16384.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999954430011d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.979079476192864E-9d) + "'", double1 == (-1.979079476192864E-9d));
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        double double2 = org.apache.commons.math.util.FastMath.min(4.9E-324d, 3.2503203288452633d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.02771569143445394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028103344278946d + "'", double1 == 1.028103344278946d);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.7811284620871498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7811284620871497d) + "'", double1 == (-0.7811284620871497d));
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-36.736800569677094d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6610060414837631d + "'", double1 == 0.6610060414837631d);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9694911126077237d, 0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9709393822234023d + "'", double2 == 0.9709393822234023d);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9425345992440989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8401501864046733d + "'", double1 == 0.8401501864046733d);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        double double2 = org.apache.commons.math.util.FastMath.max(14.741329353331304d, 5.685719999335932E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.685719999335932E24d + "'", double2 == 5.685719999335932E24d);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.24600640679997673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6090535823208306d) + "'", double1 == (-0.6090535823208306d));
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.463984075193098E74d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7646088003705097E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.613248695272591d + "'", double1 == 0.613248695272591d);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.46749182950293094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5292052776014188d + "'", double1 == 0.5292052776014188d);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        double double2 = org.apache.commons.math.util.FastMath.atan2(14.741328744640542d, (-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5779630976207808d + "'", double2 == 1.5779630976207808d);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        int int1 = org.apache.commons.math.util.FastMath.abs(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.11507828243072993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11533380529205599d + "'", double1 == 0.11533380529205599d);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590449d + "'", double1 == 1.7182818284590449d);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.06515518537002861d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001137172509454239d) + "'", double1 == (-0.001137172509454239d));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.2723414711850413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        double double1 = org.apache.commons.math.util.FastMath.log(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0860321793404941d + "'", double1 == 1.0860321793404941d);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1261966.2318521822d, 0.9999553501771875d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707955344160478d + "'", double2 == 1.5707955344160478d);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2184249125858766d, 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2184249125858764d + "'", double2 == 1.2184249125858764d);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        float float2 = org.apache.commons.math.util.FastMath.min(32.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5412326235096074d, 0.9996157480449777d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49624800899233534d + "'", double2 == 0.49624800899233534d);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.585786437626905d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5528548740537169d) + "'", double1 == (-0.5528548740537169d));
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.8002419211835452d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8347410962443511d) + "'", double1 == (-0.8347410962443511d));
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9155040003582885E22d, 0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.915504000358288E22d + "'", double2 == 1.915504000358288E22d);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6483608274590842d, 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9155040003582885E22d + "'", double2 == 1.9155040003582885E22d);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.406385048295506d + "'", double1 == 1.406385048295506d);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        double double2 = org.apache.commons.math.util.FastMath.max(2.9932228457120735d, 1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9932228457120735d + "'", double2 == 2.9932228457120735d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0162571141467134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6145485553432246d + "'", double1 == 1.6145485553432246d);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.1797945711178876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1797945711178876d + "'", double1 == 0.1797945711178876d);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.9225239138463643E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355437224494686E-7d + "'", double1 == 3.355437224494686E-7d);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 573);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 573 + "'", int1 == 573);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.15082891211336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.15082891211336d + "'", double1 == 2.15082891211336d);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.6571830862563444E-4d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9092974268256818d + "'", double1 == 0.9092974268256818d);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.7453292519943293d, 0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0029461466385965d + "'", double2 == 1.0029461466385965d);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        double double1 = org.apache.commons.math.util.FastMath.sinh(19.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.924115048159362E7d + "'", double1 == 8.924115048159362E7d);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        int int2 = org.apache.commons.math.util.FastMath.min((int) ' ', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        double double1 = org.apache.commons.math.util.FastMath.log10(6283429.00742421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.798196712620037d + "'", double1 == 6.798196712620037d);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9698463103929541d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 52.0f, 4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.519955384405313E8d + "'", double2 == 3.519955384405313E8d);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9518224930797358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49186351728990335d + "'", double1 == 0.49186351728990335d);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        double double2 = org.apache.commons.math.util.FastMath.max(6.0554544523933395E-6d, 1.028103344278946d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.028103344278946d + "'", double2 == 1.028103344278946d);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6842868307608122d) + "'", double1 == (-0.6842868307608122d));
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.896296018268E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326794884d + "'", double1 == 1.570796326794884d);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) 145);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.1061285321866012d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11219328616561733d) + "'", double1 == (-0.11219328616561733d));
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.10728189713552241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.10707716392528016d) + "'", double1 == (-0.10707716392528016d));
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.247595209480447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2809413143351598d + "'", double1 == 1.2809413143351598d);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.14336970329182389d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        double double1 = org.apache.commons.math.util.FastMath.signum(11.548739357257745d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        double double1 = org.apache.commons.math.util.FastMath.cos(9.2233720368547451E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9986502386334037d + "'", double1 == 0.9986502386334037d);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3266.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2439775726559248d + "'", double1 == 1.2439775726559248d);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.006767125876795721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.02320741180622532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023205328672353965d + "'", double1 == 0.023205328672353965d);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        double double1 = org.apache.commons.math.util.FastMath.acosh(4.980489805286518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2884410516143325d + "'", double1 == 2.2884410516143325d);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.395265851666d + "'", double1 == 5557.395265851666d);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        double double2 = org.apache.commons.math.util.FastMath.max(4.997417559331972d, 1.0486237723781806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.997417559331972d + "'", double2 == 4.997417559331972d);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        double double1 = org.apache.commons.math.util.FastMath.signum((-36.7368005696771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9806829901996237d + "'", double1 == 0.9806829901996237d);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013377559375205616d) + "'", double1 == (-0.0013377559375205616d));
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        int int2 = org.apache.commons.math.util.FastMath.max(97, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5323537367737086d + "'", double1 == 1.5323537367737086d);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        double double1 = org.apache.commons.math.util.FastMath.acosh(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.784425389995983d + "'", double1 == 8.784425389995983d);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.013669380586024594d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.983606621708336d + "'", double1 == 4.983606621708336d);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.716136598735705d) + "'", double1 == (-4.716136598735705d));
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5707055250154314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        long long1 = org.apache.commons.math.util.FastMath.abs(2147483647L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5525884268785045E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        double double1 = org.apache.commons.math.util.FastMath.rint((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-89.0d) + "'", double1 == (-89.0d));
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5422326689561365d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6750163915861345d + "'", double1 == 4.6750163915861345d);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.3026405418156001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29804177942641236d + "'", double1 == 0.29804177942641236d);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.442682412367938E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682412167344E-6d + "'", double1 == 8.442682412167344E-6d);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9136034117448754d + "'", double1 == 0.9136034117448754d);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1752011936438014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5836293809324178d + "'", double1 == 0.5836293809324178d);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9640275800758169d, (-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9640275800758168d + "'", double2 == 0.9640275800758168d);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        double double1 = org.apache.commons.math.util.FastMath.exp((-5.693388459081093d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0033681607366540358d + "'", double1 == 0.0033681607366540358d);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.29804177942641236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5257228523581828d) + "'", double1 == (-0.5257228523581828d));
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.1752011936438014d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        double double1 = org.apache.commons.math.util.FastMath.log(9.223372036854776E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.66827237527655d + "'", double1 == 43.66827237527655d);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.463984075193098E74d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.642595581083531E24d + "'", double1 == 7.642595581083531E24d);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.930067261567154E14d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0398314119215128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28131747735322093d + "'", double1 == 0.28131747735322093d);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1787535542062797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.38587492474475d) + "'", double1 == (-11.38587492474475d));
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7777181923662807d + "'", double1 == 0.7777181923662807d);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1373220393635d, 1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3440585709080844E43d + "'", double2 == 1.3440585709080844E43d);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        double double1 = org.apache.commons.math.util.FastMath.log(0.1900628023411102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6604007228000894d) + "'", double1 == (-1.6604007228000894d));
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        double double2 = org.apache.commons.math.util.FastMath.min((double) '#', 4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.605170185988092d + "'", double2 == 4.605170185988092d);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        double double1 = org.apache.commons.math.util.FastMath.log1p(17.889566311799566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9386097226368193d + "'", double1 == 2.9386097226368193d);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6940658945086007E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        long long1 = org.apache.commons.math.util.FastMath.round(0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 0, 26L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.760373407405198d), 0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7603734074051979d) + "'", double2 == (-0.7603734074051979d));
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        long long1 = org.apache.commons.math.util.FastMath.round(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6657298105782764d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.8622957433108482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3803000710956943d + "'", double1 == 1.3803000710956943d);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5430806348152437d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0052820984669221145d + "'", double1 == 0.0052820984669221145d);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3414179241869126d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3227009165069088d + "'", double1 == 1.3227009165069088d);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        double double1 = org.apache.commons.math.util.FastMath.exp(14.04818156408044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521831d + "'", double1 == 1261966.2318521831d);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.42012681275810204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42012681275810204d + "'", double1 == 0.42012681275810204d);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 26, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 3L, 2.842859999667966E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        long long2 = org.apache.commons.math.util.FastMath.min((long) '#', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.864392833312451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9297272897535336d + "'", double1 == 0.9297272897535336d);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2110835568321545E-5d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2110835568321545E-5d + "'", double2 == 1.2110835568321545E-5d);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.1800736247033484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003142877647074027d + "'", double1 == 0.003142877647074027d);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.01661243639878233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9998620166517991d + "'", double1 == 0.9998620166517991d);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, (float) 145);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.688117141816135E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5401776706283433E45d + "'", double1 == 1.5401776706283433E45d);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01913492915272034d + "'", double1 == 0.01913492915272034d);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        double double2 = org.apache.commons.math.util.FastMath.max(0.36019649632180123d, (double) 3L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.6150317436149153d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.010734328930361884d) + "'", double1 == (-0.010734328930361884d));
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8267087199189199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5975638469446122d + "'", double1 == 0.5975638469446122d);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.020573130590485034d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2567610122556662E-9d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.5528548740537169d), 0.02057603387904735d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02057603387904735d + "'", double2 == 0.02057603387904735d);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        double double1 = org.apache.commons.math.util.FastMath.rint(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 38L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.027719239916259047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027719239916259047d + "'", double1 == 0.027719239916259047d);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9698463103929541d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9698463103929541d + "'", double1 == 0.9698463103929541d);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2110908904786682E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.916823262511692d) + "'", double1 == (-4.916823262511692d));
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.02670066439081122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.026700664390811216d) + "'", double1 == (-0.026700664390811216d));
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9297272897535336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3401110801853975d + "'", double1 == 1.3401110801853975d);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 38L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 38.0f + "'", float1 == 38.0f);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        int int2 = org.apache.commons.math.util.FastMath.max(3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        int int1 = org.apache.commons.math.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.467699925813914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5071221992618504d) + "'", double1 == (-0.5071221992618504d));
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.82679529269723d), 1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.82679529269723d) + "'", double2 == (-1.82679529269723d));
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 3L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9030899869919435d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.037623954904806E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.037623954904807E-44d + "'", double1 == 8.037623954904807E-44d);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9999999995419658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707660601741342d + "'", double1 == 1.5707660601741342d);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 3.0f, 5.050000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8199744766146694d, 2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6881171418161737E43d + "'", double2 == 2.6881171418161737E43d);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.0758711123132111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        double double2 = org.apache.commons.math.util.FastMath.max(1.9877735581754346d, (-0.7603734074051979d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9877735581754346d + "'", double2 == 1.9877735581754346d);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.40531933496538397d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3922026785961111d) + "'", double1 == (-0.3922026785961111d));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        double double1 = org.apache.commons.math.util.FastMath.floor(2097152.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2097152.0d + "'", double1 == 2097152.0d);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9442157056960554d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.016479672913437944d + "'", double1 == 0.016479672913437944d);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.915504000358288E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5975638469446122d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1839177489147017d + "'", double1 == 1.1839177489147017d);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.570796326379126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570796326379126d + "'", double1 == 1.570796326379126d);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        long long1 = org.apache.commons.math.util.FastMath.round(5.267831587699267d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0034360850939669095d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034360715711427674d) + "'", double1 == (-0.0034360715711427674d));
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        long long1 = org.apache.commons.math.util.FastMath.abs(8L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 8L + "'", long1 == 8L);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8964711396507173d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6284217534373299d) + "'", double1 == (-0.6284217534373299d));
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2798386717543342d, 0.748636741546022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3854204958440206d + "'", double2 == 0.3854204958440206d);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6789823271282955d + "'", double1 == 4.6789823271282955d);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) (short) 100, 3.948148009134E13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5328331098188576E-12d + "'", double2 == 2.5328331098188576E-12d);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1839177489147017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7866131422952851d + "'", double1 == 1.7866131422952851d);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.6789823271282955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 29.923020517919355d + "'", double1 == 29.923020517919355d);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.355404970159859E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3554049701598595E-7d + "'", double1 == 3.3554049701598595E-7d);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6506783754890694d + "'", double1 == 0.6506783754890694d);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.3440585709080678E43d, 1.281047928335586d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7765227797066595E55d + "'", double2 == 1.7765227797066595E55d);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.399216241149911E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.230532568900645E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.029698164942722875d) + "'", double1 == (-0.029698164942722875d));
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.281047928335586d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1075653784740282d + "'", double1 == 0.1075653784740282d);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        double double1 = org.apache.commons.math.util.FastMath.log(0.015840768241279675d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.1451683936911605d) + "'", double1 == (-4.1451683936911605d));
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7582649015960806d, (-1.6604007228000894d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.713200981319833d + "'", double2 == 2.713200981319833d);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5707660601741342d, (-2.7983904661072323d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.630107219510141d + "'", double2 == 2.630107219510141d);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        int int2 = org.apache.commons.math.util.FastMath.max(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        double double2 = org.apache.commons.math.util.FastMath.pow(9.949874371066198d, (-0.9835107230884862d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.10438442262469091d + "'", double2 == 0.10438442262469091d);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6150317436149153d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.42012681275810204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4467246575506081d + "'", double1 == 0.4467246575506081d);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.7615941542245016d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        double double1 = org.apache.commons.math.util.FastMath.expm1(6.156119580207157E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.692955134525155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6929551345251551d + "'", double1 == 0.6929551345251551d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        double double1 = org.apache.commons.math.util.FastMath.tan(9.786480471441937E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14466555184225383d + "'", double1 == 0.14466555184225383d);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.003358054049998483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003358054049998483d + "'", double1 == 0.003358054049998483d);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        float float2 = org.apache.commons.math.util.FastMath.max((float) ' ', (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6610060414837631d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-4.8193414259330913E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8193414259330913E-20d) + "'", double1 == (-4.8193414259330913E-20d));
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1416876847493498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13250759287604744d + "'", double1 == 0.13250759287604744d);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.999986049880067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5403140444367246d + "'", double1 == 0.5403140444367246d);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 75.6939756606048d + "'", double1 == 75.6939756606048d);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 0, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        double double1 = org.apache.commons.math.util.FastMath.ulp(10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.162277660168381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 23.62434292201784d + "'", double1 == 23.62434292201784d);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8390715290764524d), 2.688117141816135E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1214098374803794E-44d) + "'", double2 == (-3.1214098374803794E-44d));
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7346568543593086d + "'", double1 == 0.7346568543593086d);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7370529091738743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9033018261833695d) + "'", double1 == (-0.9033018261833695d));
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        long long1 = org.apache.commons.math.util.FastMath.round(57.29577951308234d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.7983904661072323d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4091896264064065d) + "'", double1 == (-1.4091896264064065d));
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 37.87285640966874d + "'", double1 == 37.87285640966874d);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9918043161804359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9918043161804359d + "'", double1 == 0.9918043161804359d);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        double double1 = org.apache.commons.math.util.FastMath.log(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        double double1 = org.apache.commons.math.util.FastMath.expm1(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.798432482299822E248d + "'", double1 == 6.798432482299822E248d);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.355372716651809E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3553727166518095E-7d + "'", double1 == 3.3553727166518095E-7d);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.503817570181902d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        double double1 = org.apache.commons.math.util.FastMath.log(1.1037080495808624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09867546503898518d + "'", double1 == 0.09867546503898518d);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.6751788539128234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17058116794162126d) + "'", double1 == (-0.17058116794162126d));
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 113.8351333444046d + "'", double1 == 113.8351333444046d);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.3873669366539792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3873669366539792d + "'", double1 == 0.3873669366539792d);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.7621956910836305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        double double1 = org.apache.commons.math.util.FastMath.signum(2005.3522829578812d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        double double1 = org.apache.commons.math.util.FastMath.acos(3.5553480614894135d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        double double2 = org.apache.commons.math.util.FastMath.min(2.5328331098188576E-12d, 1.5574077246549025d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5328331098188576E-12d + "'", double2 == 2.5328331098188576E-12d);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1215705721632271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3486697178752796d + "'", double1 == 0.3486697178752796d);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.0034306568216736E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1084164823547447E8d + "'", double1 == 3.1084164823547447E8d);
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(99.98991284675515d, 1.0438252985430079d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 99.98991284675513d + "'", double2 == 99.98991284675513d);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        double double1 = org.apache.commons.math.util.FastMath.signum((-2.0572983097976434d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.49186351728990335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.30815538892118943d) + "'", double1 == (-0.30815538892118943d));
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.15527491979894661d), 4.8373005113295966E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8373005113295966E-4d + "'", double2 == 4.8373005113295966E-4d);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8772827919571972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13092588481596368d) + "'", double1 == (-0.13092588481596368d));
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.9642258512973702d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 0, 572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.028103344278946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        double double1 = org.apache.commons.math.util.FastMath.rint(6.798196712620037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.0d + "'", double1 == 7.0d);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 0, (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16648030344294168d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5402647332399916d + "'", double1 == 0.5402647332399916d);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.10707716392528016d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4201312898382078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.39704103087032844d + "'", double1 == 0.39704103087032844d);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.153068686219429d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3553727166518095E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3553727166519355E-7d + "'", double1 == 3.3553727166519355E-7d);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        long long2 = org.apache.commons.math.util.FastMath.min(5L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.7612158210501148d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5660043779672871d + "'", double1 == 0.5660043779672871d);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.047442967903742035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746078367186166d + "'", double1 == 0.04746078367186166d);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.19240232444172625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5773024999492185d + "'", double1 == 0.5773024999492185d);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7831978161372731d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.293727206892505d + "'", double1 == 0.293727206892505d);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.014686439244896978d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9999999958776927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7902953051996431E-9d) + "'", double1 == (-1.7902953051996431E-9d));
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3440585709080844E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.666140437719325E21d + "'", double1 == 3.666140437719325E21d);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-89.2328896037985d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.833489212424966E38d) + "'", double1 == (-2.833489212424966E38d));
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        double double2 = org.apache.commons.math.util.FastMath.max(0.15122623336946334d, 14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.389377026852705d + "'", double2 == 14.389377026852705d);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.04749646746707085d, (-0.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04749646746707084d + "'", double2 == 0.04749646746707084d);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.14147577836676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.464573725157382d + "'", double1 == 1.464573725157382d);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.84345739187178d) + "'", double1 == (-23.84345739187178d));
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        double double1 = org.apache.commons.math.util.FastMath.log((-89.2328896037985d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(794.344456722457d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 794.3444567224569d + "'", double2 == 794.3444567224569d);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        double double1 = org.apache.commons.math.util.FastMath.rint(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3266.0d + "'", double1 == 3266.0d);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-8.833373523837084d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998542144022069d) + "'", double1 == (-0.9998542144022069d));
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 99.95436267781281d + "'", double1 == 99.95436267781281d);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9899924966004454d) + "'", double1 == (-0.9899924966004454d));
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.355437224494686E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.792613593616171E-4d + "'", double1 == 5.792613593616171E-4d);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.15122623336946334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026393956876864535d + "'", double1 == 0.0026393956876864535d);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        long long1 = org.apache.commons.math.util.FastMath.abs(57L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 57L + "'", long1 == 57L);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        double double1 = org.apache.commons.math.util.FastMath.expm1(56.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8428599996679606E24d + "'", double1 == 2.8428599996679606E24d);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        int int2 = org.apache.commons.math.util.FastMath.max(26, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1123.372703893139d + "'", double1 == 1123.372703893139d);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        double double1 = org.apache.commons.math.util.FastMath.signum(22025.461748222762d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 1.3227009165069088d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 52, 1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 51.99999999999999d + "'", double2 == 51.99999999999999d);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8430650369670094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8519238076558282d) + "'", double1 == (-1.8519238076558282d));
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5395564933646284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6625219529419444d + "'", double1 == 3.6625219529419444d);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.042800856867951736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042827011853929196d) + "'", double1 == (-0.042827011853929196d));
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3282.8063500117437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1449159333471108d + "'", double1 == 1.1449159333471108d);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        double double1 = org.apache.commons.math.util.FastMath.signum(19.34620097980911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        double double1 = org.apache.commons.math.util.FastMath.asinh(96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.267831587699267d + "'", double1 == 5.267831587699267d);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.7615941559557649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-23.84345739187178d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.5982145799432725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.356655043862392d + "'", double1 == 1.356655043862392d);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7811284620871498d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.984807753012208d, (-0.9914968516113685d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.3595791268726303d + "'", double2 == 2.3595791268726303d);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        long long2 = org.apache.commons.math.util.FastMath.max(1L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2567610122556662E-9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        double double1 = org.apache.commons.math.util.FastMath.log(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0794534402614928d) + "'", double1 == (-1.0794534402614928d));
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        double double1 = org.apache.commons.math.util.FastMath.acosh(36.0482269650408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.27781241944192d + "'", double1 == 4.27781241944192d);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.1649569776443817d, 1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707038251666727d + "'", double2 == 1.5707038251666727d);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.9982229502979694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.9225054334737986E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.28131747735322093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.274123996952347d + "'", double1 == 0.274123996952347d);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.3754758794263844d, (-29.801969570734137d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.028809780999338d + "'", double2 == 3.028809780999338d);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7054294284722258d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.15154642678291888d) + "'", double1 == (-0.15154642678291888d));
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.8384708625565505E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        double double1 = org.apache.commons.math.util.FastMath.ceil(14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 15.0d + "'", double1 == 15.0d);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        double double1 = org.apache.commons.math.util.FastMath.cos(207.12724888983414d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9763608754884531d + "'", double1 == 0.9763608754884531d);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2054747075950174d + "'", double1 == 1.2054747075950174d);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7866131422952851d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.900837378826303d + "'", double1 == 2.900837378826303d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9297272897535336d, (-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.3012989023072947d) + "'", double2 == (-2.3012989023072947d));
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        double double2 = org.apache.commons.math.util.FastMath.min(2097152.0d, 53.90625327736449d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.90625327736449d + "'", double2 == 53.90625327736449d);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984546603E-13d + "'", double1 == 8.142219984546603E-13d);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4693643970957537d + "'", double1 == 1.4693643970957537d);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6571830710861824E-4d + "'", double1 == 1.6571830710861824E-4d);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.0034306568216736E25d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4917863811300067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.078927767113337d + "'", double1 == 0.078927767113337d);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.24600640679997673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004293621779660161d + "'", double1 == 0.004293621779660161d);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        double double2 = org.apache.commons.math.util.FastMath.max((-15.906532428616288d), 4.226651359933871d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.226651359933871d + "'", double2 == 4.226651359933871d);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        int int2 = org.apache.commons.math.util.FastMath.min(35, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.615620091065296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.27243300150086d) + "'", double1 == (-35.27243300150086d));
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.993222845712074d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        long long2 = org.apache.commons.math.util.FastMath.max(5L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.066732021965656d + "'", double1 == 1.066732021965656d);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        int int2 = org.apache.commons.math.util.FastMath.max(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        int int1 = org.apache.commons.math.util.FastMath.abs(573);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 573 + "'", int1 == 573);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9999959038668202d, 0.5988224392024553d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999959038668201d + "'", double2 == 0.9999959038668201d);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        double double1 = org.apache.commons.math.util.FastMath.ulp(62.802933415151905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.02057603387904735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6866383336765949d) + "'", double1 == (-1.6866383336765949d));
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        double double2 = org.apache.commons.math.util.FastMath.atan2(23.62434292201784d, 0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5385290260103368d + "'", double2 == 1.5385290260103368d);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027705053070945427d + "'", double1 == 0.027705053070945427d);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6784102379846987d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7785713669985503d + "'", double1 == 0.7785713669985503d);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3299302472020562d, 0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7175057781016483d + "'", double2 == 0.7175057781016483d);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.6750163915861345d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6384205222376984d + "'", double1 == 3.6384205222376984d);
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.3333452696210846d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3333452696210848d + "'", double1 == 1.3333452696210848d);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        double double1 = org.apache.commons.math.util.FastMath.atan(26.00961538461539d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.532367934462324d + "'", double1 == 1.532367934462324d);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-4.8193414259330913E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.411337566029088E-22d) + "'", double1 == (-8.411337566029088E-22d));
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.0572983097976434d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        double double2 = org.apache.commons.math.util.FastMath.max(47.7974777282436d, 2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 47.7974777282436d + "'", double2 == 47.7974777282436d);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        double double1 = org.apache.commons.math.util.FastMath.log(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.35088571671474d + "'", double1 == 6.35088571671474d);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        double double2 = org.apache.commons.math.util.FastMath.max(4.61512051684126d, 1.818446459232067d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.61512051684126d + "'", double2 == 4.61512051684126d);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        double double1 = org.apache.commons.math.util.FastMath.asin(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        long long1 = org.apache.commons.math.util.FastMath.round(22025.461748222762d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 22025L + "'", long1 == 22025L);
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.19561370955657775d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        long long2 = org.apache.commons.math.util.FastMath.min(100L, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5528548740537169d), 0.015840768241279675d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.36019649632180123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43361108619104427d + "'", double1 == 0.43361108619104427d);
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.930067261567154E14d + "'", double1 == 7.930067261567154E14d);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-1.0794534402614928d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0258124639856192d) + "'", double1 == (-1.0258124639856192d));
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2710663101885897d + "'", double1 == 3.2710663101885897d);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04749646746707084d + "'", double1 == 0.04749646746707084d);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        double double1 = org.apache.commons.math.util.FastMath.ulp(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6843418860808015E-14d + "'", double1 == 5.6843418860808015E-14d);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0643321090394411d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06230646868508781d) + "'", double1 == (-0.06230646868508781d));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        double double2 = org.apache.commons.math.util.FastMath.min(4.253522697326158d, 1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5777218104420236E-30d + "'", double2 == 1.5777218104420236E-30d);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) 2147483647L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562597358306d + "'", double1 == 21.487562597358306d);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5777218104420236E-30d + "'", double1 == 1.5777218104420236E-30d);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5528548740537169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.1606074732651916d, (-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.160607473265191d + "'", double2 == 2.160607473265191d);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7273406689256667d + "'", double1 == 1.7273406689256667d);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9700147524633321d + "'", double1 == 0.9700147524633321d);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        int int1 = org.apache.commons.math.util.FastMath.round(573.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 573 + "'", int1 == 573);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        double double1 = org.apache.commons.math.util.FastMath.ulp(21.487562597358306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5403057526408277d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7165316160329993d + "'", double1 == 1.7165316160329993d);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5422326689561365d, 0.02347666707911227d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02347666707911227d + "'", double2 == 0.02347666707911227d);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000044650487358d + "'", double1 == 1.000044650487358d);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571020934276798d + "'", double1 == 0.16571020934276798d);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        double double1 = org.apache.commons.math.util.FastMath.asin((-8.345153194998874d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        double double2 = org.apache.commons.math.util.FastMath.max((-2.0572983097976434d), 0.7805951733159242d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7805951733159242d + "'", double2 == 0.7805951733159242d);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        double double1 = org.apache.commons.math.util.FastMath.exp((double) 52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5323537367737086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03843312210120447d + "'", double1 == 0.03843312210120447d);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        double double2 = org.apache.commons.math.util.FastMath.min(3.3554049701598595E-7d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025670380746355033d + "'", double1 == 0.025670380746355033d);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        long long1 = org.apache.commons.math.util.FastMath.abs((-2L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.8184464592320673d, (-0.9786883441146831d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.818446459232067d + "'", double2 == 1.818446459232067d);
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.34668423136158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5887989736417515d + "'", double1 == 0.5887989736417515d);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.2885829000440232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.28858290004402326d + "'", double1 == 0.28858290004402326d);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.570796326379126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567773547207d + "'", double1 == 0.027415567773547207d);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.2809413143351598d, 1.1449159333471108d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3277366163928728d + "'", double2 == 1.3277366163928728d);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        double double1 = org.apache.commons.math.util.FastMath.ulp(6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1805916207174113E21d + "'", double1 == 1.1805916207174113E21d);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        long long1 = org.apache.commons.math.util.FastMath.round(1.406385048295506d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        double double1 = org.apache.commons.math.util.FastMath.expm1(630983.1159256954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0470934242082532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0232758299736455d + "'", double1 == 1.0232758299736455d);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6823165548747481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6305926250944657d + "'", double1 == 0.6305926250944657d);
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027241040673019475d + "'", double1 == 0.027241040673019475d);
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        double double1 = org.apache.commons.math.util.FastMath.abs(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.009450024787102135d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09950371902099903d + "'", double1 == 0.09950371902099903d);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        double double1 = org.apache.commons.math.util.FastMath.atanh(57.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.025678843658570077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025681666614117072d + "'", double1 == 0.025681666614117072d);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0318224457943772d, 99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0318224457943774d + "'", double2 == 1.0318224457943774d);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3169578969248166d, 573.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 573.0d + "'", double2 == 573.0d);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        double double2 = org.apache.commons.math.util.FastMath.min(4.435597088531952d, 3.1558490147807587d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1558490147807587d + "'", double2 == 3.1558490147807587d);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        int int2 = org.apache.commons.math.util.FastMath.max(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.9700147524633321d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 573, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.15154642678291888d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.16299078079570548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16299078079570548d + "'", double1 == 0.16299078079570548d);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        double double1 = org.apache.commons.math.util.FastMath.log(1.544068044350276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.43442052080657195d + "'", double1 == 0.43442052080657195d);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.3803000710956943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9819103918991889d + "'", double1 == 0.9819103918991889d);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9030899869919435d, (-0.026700664390811216d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.026700664390811216d) + "'", double2 == (-0.026700664390811216d));
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.009495102254525043d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        int int2 = org.apache.commons.math.util.FastMath.max((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.358053923774534E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3580540499984855E-4d + "'", double1 == 3.3580540499984855E-4d);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        double double2 = org.apache.commons.math.util.FastMath.atan2(8.0d, (-0.19438719642597732d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5950899460174346d + "'", double2 == 1.5950899460174346d);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.864392833312451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9525849574608642d + "'", double1 == 0.9525849574608642d);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 573L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        double double1 = org.apache.commons.math.util.FastMath.ulp(97.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8524700138162723d + "'", double1 == 0.8524700138162723d);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.8519238076558282d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.8845500881248141d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.1589185064977667d) + "'", double1 == (-2.1589185064977667d));
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.1193272159135788d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.04749646746707084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.289697403667576E-4d + "'", double1 == 8.289697403667576E-4d);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        double double1 = org.apache.commons.math.util.FastMath.rint(18.964889726830815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.9033018261833695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4434830720305272d + "'", double1 == 0.4434830720305272d);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        int int2 = org.apache.commons.math.util.FastMath.min(26, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9408416071039944d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.74532925199433d + "'", double1 == 1.74532925199433d);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.6795226183513794d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7330383821741316d) + "'", double1 == (-0.7330383821741316d));
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.020573130590485034d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6555421614583431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01144136910308836d + "'", double1 == 0.01144136910308836d);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-1), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.717906776707044d + "'", double1 == 2.717906776707044d);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.291336409328633d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 198.60867061197567d + "'", double1 == 198.60867061197567d);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        long long2 = org.apache.commons.math.util.FastMath.min(0L, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9999999998054523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999999351508d + "'", double1 == 0.9999999999351508d);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1811276859692623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.258046185049248d + "'", double1 == 2.258046185049248d);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        long long1 = org.apache.commons.math.util.FastMath.round(0.023205328672353965d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        long long1 = org.apache.commons.math.util.FastMath.round(3.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.029464112608972946d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.469446951953614E-18d + "'", double1 == 3.469446951953614E-18d);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(13.110581167104948d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22882280821594225d + "'", double1 == 0.22882280821594225d);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        double double1 = org.apache.commons.math.util.FastMath.ulp(57.29577951308232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        float float2 = org.apache.commons.math.util.FastMath.min(8.0f, 2.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 8L, 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.899417119369014E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.19006280234111023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19006280234111023d + "'", double1 == 0.19006280234111023d);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9030612511435305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44395208930645685d + "'", double1 == 0.44395208930645685d);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.3401110801853975d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8030064940059782d + "'", double1 == 0.8030064940059782d);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        double double1 = org.apache.commons.math.util.FastMath.asinh(35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6784066528087076d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8236544498809605d + "'", double1 == 0.8236544498809605d);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.735436873328441d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.397107525138078d + "'", double1 == 2.397107525138078d);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(Double.NaN, 1.338474404104274d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        double double2 = org.apache.commons.math.util.FastMath.max(0.008592287884538353d, (double) 2147483647);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.147483647E9d + "'", double2 == 2.147483647E9d);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5401776706283433E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5401776706283436E45d + "'", double1 == 1.5401776706283436E45d);
    }
}

