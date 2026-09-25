package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.025673200539316265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000329574714624d + "'", double1 == 1.000329574714624d);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6832810232787436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22615662736669362d + "'", double1 == 0.22615662736669362d);
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1379172066869372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0440073467671152d + "'", double1 == 1.0440073467671152d);
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.48756259689264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1474836459999945E9d + "'", double1 == 2.1474836459999945E9d);
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8117141891585623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.741789388563884d + "'", double1 == 0.741789388563884d);
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6507779951543294d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.917031690363043d + "'", double1 == 1.917031690363043d);
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        int int2 = org.apache.commons.math.util.FastMath.max(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5794495262170003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.545676718844663d) + "'", double1 == (-0.545676718844663d));
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.13626144010775731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5145856347184302d + "'", double1 == 0.5145856347184302d);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7607198300261392d, 5.984477251954342d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.984477251954342d + "'", double2 == 5.984477251954342d);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2699081698724155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0829060309440988d + "'", double1 == 1.0829060309440988d);
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.047478611486943684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04751431940689878d + "'", double1 == 0.04751431940689878d);
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.9999940841932833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.999997042092267d + "'", double1 == 0.999997042092267d);
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.7556587893900818d), 0.027705053070945423d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027705053070945423d + "'", double2 == 0.027705053070945423d);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        int int1 = org.apache.commons.math.util.FastMath.round(97.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.716136598735705d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.87234370703825d + "'", double1 == 55.87234370703825d);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9034600343951872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6436733007677201d + "'", double1 == 0.6436733007677201d);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        long long1 = org.apache.commons.math.util.FastMath.round(14.04818156408044d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 14L + "'", long1 == 14L);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.16964194266037994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.719767342840083d + "'", double1 == 9.719767342840083d);
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        double double2 = org.apache.commons.math.util.FastMath.min(0.5282953052207049d, 0.9297272897535336d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5282953052207049d + "'", double2 == 0.5282953052207049d);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        int int2 = org.apache.commons.math.util.FastMath.min(26, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        double double1 = org.apache.commons.math.util.FastMath.acosh(9.2233720368547451E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.3614195558365d + "'", double1 == 44.3614195558365d);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(22025.461748222762d, 1.0316896331825138d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22025.46174822276d + "'", double2 == 22025.46174822276d);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1692480936637681d, 0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5893504478253487d + "'", double2 == 0.5893504478253487d);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.009972525083085703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009923127595128856d + "'", double1 == 0.009923127595128856d);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        double double1 = org.apache.commons.math.util.FastMath.asinh(7.161972439135291d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6667712316526706d + "'", double1 == 2.6667712316526706d);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800801422487353d + "'", double1 == 0.0034800801422487353d);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 44L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7740456749600706d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8536890064297054d + "'", double1 == 0.8536890064297054d);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        double double1 = org.apache.commons.math.util.FastMath.floor(5.60724027300823E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.607240273008E12d + "'", double1 == 5.607240273008E12d);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707963129646567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963129646567d + "'", double1 == 1.5707963129646567d);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.899417119369014E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0002899837490977d + "'", double1 == 1.0002899837490977d);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.896296018267967E13d, 0.5968020998202848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794889d + "'", double2 == 1.570796326794889d);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-4.916823262511692d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7004408617295015d) + "'", double1 == (-1.7004408617295015d));
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.11109916834859056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1175057225567089d + "'", double1 == 1.1175057225567089d);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.791759469228055d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.006929673254199679d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0069297841781581285d + "'", double1 == 0.0069297841781581285d);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        double double1 = org.apache.commons.math.util.FastMath.log(1164.1175712113197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.059718629385893d + "'", double1 == 7.059718629385893d);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262160379374064d + "'", double1 == 0.9262160379374064d);
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        double double1 = org.apache.commons.math.util.FastMath.abs(25.306852819445986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.306852819445986d + "'", double1 == 25.306852819445986d);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9646989825943999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5025477840930719d + "'", double1 == 1.5025477840930719d);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8401501864046733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8401501864046733d + "'", double1 == 0.8401501864046733d);
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97864804714L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.361853049433758d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6603469013500041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.6342953050784887d), 3.26982946871976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.26982946871976d + "'", double2 == 3.26982946871976d);
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9330920755982086d, 1.3295673951398002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3295673951398002d + "'", double2 == 1.3295673951398002d);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4210854715202004E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.883541294419299d + "'", double1 == 0.883541294419299d);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7393910596966158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.399216241149525E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9680578953622686E232d + "'", double1 == 4.9680578953622686E232d);
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-1.7883278476424156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5356779950985695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5923812342208035d + "'", double1 == 1.5923812342208035d);
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4757278705561234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1690062794301309d + "'", double1 == 0.1690062794301309d);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
        double double2 = org.apache.commons.math.util.FastMath.max(1.1811276859692628d, (-0.02669432190897104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1811276859692628d + "'", double2 == 1.1811276859692628d);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.3104642473694204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) (-2L), 7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.9999999999999998d) + "'", double2 == (-1.9999999999999998d));
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8030064940059781d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2322420723808665d + "'", double1 == 2.2322420723808665d);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.9964491924882743E28d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0011273202556092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        float float2 = org.apache.commons.math.util.FastMath.max(44.0f, (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36221796077615454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4365120111136123d + "'", double1 == 1.4365120111136123d);
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9259555601603967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9974964160775458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9974964160775458d + "'", double1 == 0.9974964160775458d);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607966601082315d + "'", double1 == 1.5607966601082315d);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.092046153706521E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.092046153706521E-7d + "'", double1 == 4.092046153706521E-7d);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        float float2 = org.apache.commons.math.util.FastMath.min(9.223372E18f, (float) 18L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.12684760810589946d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4436060621143874d + "'", double1 == 1.4436060621143874d);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) 2105L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3428141018704651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.103244991405612d + "'", double1 == 1.103244991405612d);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 573, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3827395580671282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8674578744516237d + "'", double1 == 1.8674578744516237d);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6806406458923995d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.777169725542001d + "'", double1 == 0.777169725542001d);
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4637669171613941d + "'", double1 == 0.4637669171613941d);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9918043161804359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.69609469362245d + "'", double1 == 2.69609469362245d);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7830288330849284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7830288330849284d + "'", double1 == 0.7830288330849284d);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 62.81626692957517d + "'", double1 == 62.81626692957517d);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.226651359933871d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.902641160672524d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7175814658190476d) + "'", double1 == (-0.7175814658190476d));
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.17914743767370203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1961970956842123d + "'", double1 == 1.1961970956842123d);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        double double1 = org.apache.commons.math.util.FastMath.log1p(33.439500327260546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5392041709542967d + "'", double1 == 3.5392041709542967d);
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 3);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.0f + "'", float1 == 3.0f);
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.2857068927136726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.047407404488248234d, 0.7722726579137131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09492753617060128d + "'", double2 == 0.09492753617060128d);
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7551415795108859d) + "'", double1 == (-0.7551415795108859d));
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0963506817327155d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9643630888883036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1209452514271958d + "'", double1 == 1.1209452514271958d);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        double double2 = org.apache.commons.math.util.FastMath.atan2(198.60867061197567d, (-0.017450748081259817d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5708841917807634d + "'", double2 == 1.5708841917807634d);
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1219390793339943d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05448811598105866d + "'", double1 == 0.05448811598105866d);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.0034419884227690025d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0034419748301271536d) + "'", double1 == (-0.0034419748301271536d));
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        long long1 = org.apache.commons.math.util.FastMath.round(32.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.89629601826797E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.897423420904053d + "'", double1 == 13.897423420904053d);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4174499913463825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4174499913463825d + "'", double1 == 0.4174499913463825d);
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3036378347354876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0997245430382512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0997245430382514d + "'", double1 == 1.0997245430382514d);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        double double1 = org.apache.commons.math.util.FastMath.sin((-3.6478005095231385d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48486417183142105d + "'", double1 == 0.48486417183142105d);
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9999531967662273d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.16723958605665326d, 1.0092570056990897d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1644937984762475d + "'", double2 == 0.1644937984762475d);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5298961219858488d), 1.3962634015954631d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5298961219858488d) + "'", double2 == (-0.5298961219858488d));
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2110835567729439E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.954844600830958E183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7022630673105111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 40.236709864803935d + "'", double1 == 40.236709864803935d);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6870151974084779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.757373373600886d + "'", double1 == 0.757373373600886d);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5323537367737086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1528859429959881d + "'", double1 == 1.1528859429959881d);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000127309544797d + "'", double1 == 1.000127309544797d);
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        long long1 = org.apache.commons.math.util.FastMath.round(0.31048985231669685d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-88.99999999999999d), 0.9207813824870029d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-88.99999999999997d) + "'", double2 == (-88.99999999999997d));
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 97.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(13.672285132493046d, 0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.672285132493045d + "'", double2 == 13.672285132493045d);
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.2224467810154838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2224467810154835d) + "'", double1 == (-1.2224467810154835d));
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 9L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), 6061.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6061.0f + "'", float2 == 6061.0f);
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.8076350433445d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4434101142727052d + "'", double1 == 1.4434101142727052d);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) 44.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.477207657226922d + "'", double1 == 4.477207657226922d);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        double double1 = org.apache.commons.math.util.FastMath.asinh(4.522227941985666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.214158312255157d + "'", double1 == 2.214158312255157d);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 2L, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.2915496650148837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9566325290903617d + "'", double1 == 1.9566325290903617d);
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-8.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.0963506817327158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0963506817327158d + "'", double1 == 1.0963506817327158d);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.623619432322562d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1737998214361567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5813544075272363d + "'", double1 == 0.5813544075272363d);
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.0889074357665707d), 43.63613080502884d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0889074357665705d) + "'", double2 == (-1.0889074357665705d));
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8998668269691937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0263258863529197d + "'", double1 == 1.0263258863529197d);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(4.957234655978706E136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.957234655978707E136d + "'", double1 == 4.957234655978707E136d);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0850005042632922d + "'", double1 == 0.0850005042632922d);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        int int2 = org.apache.commons.math.util.FastMath.min(573, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7628286883743736d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7228843693793349d + "'", double1 == 0.7228843693793349d);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5707963267948932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.023227478547548d + "'", double1 == 1.023227478547548d);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        double double1 = org.apache.commons.math.util.FastMath.exp(8.442682412167346E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000084427180518d + "'", double1 == 1.0000084427180518d);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.10915815991542903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0019051692959427317d + "'", double1 == 0.0019051692959427317d);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.2110835567729439E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110908904194567E-5d + "'", double1 == 1.2110908904194567E-5d);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.29267816394109086d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(36.741374145600744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2105.1256720540036d + "'", double1 == 2105.1256720540036d);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.239487368601187E31d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.10173949806242E32d + "'", double1 == 7.10173949806242E32d);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.09492753617060128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.09507068650612024d + "'", double1 == 0.09507068650612024d);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        double double2 = org.apache.commons.math.util.FastMath.min(0.4924750848100893d, 1.0003564839175727d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4924750848100893d + "'", double2 == 0.4924750848100893d);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        float float2 = org.apache.commons.math.util.FastMath.min(2105.0f, 2105.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.3675220813204314d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7162992214244817d + "'", double1 == 0.7162992214244817d);
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.19611987691520022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1936435159220643d + "'", double1 == 0.1936435159220643d);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 3, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, 22025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318057L, (float) 44L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.000000335537328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.7357275822226734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2017861323049612d + "'", double1 == 1.2017861323049612d);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(9.223372036854778E18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.22337203685478E18d + "'", double1 == 9.22337203685478E18d);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.024137633434945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.850844047750578d + "'", double1 == 3.850844047750578d);
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.4917863811300067d, (-0.6935845637532064d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.00600102974592d + "'", double2 == 2.00600102974592d);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.46297836831268596d + "'", double1 == 0.46297836831268596d);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        int int2 = org.apache.commons.math.util.FastMath.min((int) '4', 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8360218615377305d) + "'", double1 == (-0.8360218615377305d));
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        double double2 = org.apache.commons.math.util.FastMath.min(57.295779251985515d, 0.11482578710300392d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.11482578710300392d + "'", double2 == 0.11482578710300392d);
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.840060340331501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41078129050290885d + "'", double1 == 0.41078129050290885d);
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.21657131639750768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2148823033161556d + "'", double1 == 0.2148823033161556d);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02057603387904735d, 3.527196701237181E38d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020576033879047353d + "'", double2 == 0.020576033879047353d);
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-1.2214830415908176d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8435037267365852d + "'", double1 == 1.8435037267365852d);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.4365120111136123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4679136108514075d + "'", double1 == 0.4679136108514075d);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        double double1 = org.apache.commons.math.util.FastMath.rint((-1.6342953050784887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.0486237723781806d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9153412831308465d + "'", double1 == 0.9153412831308465d);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9976632019944932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992204598064889d + "'", double1 == 0.9992204598064889d);
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0547920720722763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.2180280666000018d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2180280666000018d + "'", double1 == 1.2180280666000018d);
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        double double2 = org.apache.commons.math.util.FastMath.max(3.130126224133262d, 4.369491427691419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.369491427691419d + "'", double2 == 4.369491427691419d);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.6098214429508984d, 0.15122623336946334d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0746578463114123d + "'", double2 == 1.0746578463114123d);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        double double1 = org.apache.commons.math.util.FastMath.acos(10.69310178011491d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.30280766885405475d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3028076688540548d + "'", double2 == 0.3028076688540548d);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        long long2 = org.apache.commons.math.util.FastMath.min(31L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.04636973784987636d, (-1.0258124639856192d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04636973784987635d + "'", double2 == 0.04636973784987635d);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.6842868307608122d), 1.3428141018704651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.47129143909477184d) + "'", double2 == (-0.47129143909477184d));
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5430642407677928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0269315515711845d + "'", double1 == 0.0269315515711845d);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.4692606193559588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2121306115084953d + "'", double1 == 1.2121306115084953d);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5719334995494423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011371725094542697d) + "'", double1 == (-0.0011371725094542697d));
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        float float2 = org.apache.commons.math.util.FastMath.min(3.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6975744860120546d, 1.9269488944079232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6975744860120547d + "'", double2 == 0.6975744860120547d);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.840060340331501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 162.72347106348323d + "'", double1 == 162.72347106348323d);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        double double2 = org.apache.commons.math.util.FastMath.max(1.570796326794889d, 0.8108288062597232d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794889d + "'", double2 == 1.570796326794889d);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.155849014780759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.71517765301278d + "'", double1 == 11.71517765301278d);
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        int int2 = org.apache.commons.math.util.FastMath.max(44, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        double double1 = org.apache.commons.math.util.FastMath.tanh(5.60724027300823E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.999997042092267d, 0.6960386147148705d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999979411810735d + "'", double2 == 0.9999979411810735d);
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        double double2 = org.apache.commons.math.util.FastMath.max(0.00859249933957278d, 3.382248583674181E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.00859249933957278d + "'", double2 == 0.00859249933957278d);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282073904701802d + "'", double1 == 0.005282073904701802d);
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        double double1 = org.apache.commons.math.util.FastMath.cos(198.60867061197564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7723057735309792d) + "'", double1 == (-0.7723057735309792d));
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.12217123753453288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.122477214625761d + "'", double1 == 0.122477214625761d);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3158911158571682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.095821923671918d + "'", double1 == 1.095821923671918d);
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.586494943452394d + "'", double1 == 9.586494943452394d);
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.545750190492393E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.985608890758629d + "'", double1 == 0.985608890758629d);
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.90330553725532E-6d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9312797787813019d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.1186432080671145d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1186432080671145d) + "'", double2 == (-1.1186432080671145d));
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        double double2 = org.apache.commons.math.util.FastMath.max(0.006744331656933604d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.4371344463413933d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13326424646685242d + "'", double1 == 0.13326424646685242d);
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.809784758817255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6762412591322453d + "'", double1 == 1.6762412591322453d);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7607198300261392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8721925418312972d + "'", double1 == 0.8721925418312972d);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.6146685600490525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6146685600490525d + "'", double1 == 4.6146685600490525d);
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) -1, (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.8218948327082145d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8113468175918646d + "'", double1 == 0.8113468175918646d);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.6961714618132557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(11013.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.94284158531252d + "'", double1 == 104.94284158531252d);
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.1715099723401879d, 1.1820604684682068d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17150997234018792d + "'", double2 == 0.17150997234018792d);
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-88.99999999999999d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-88.0d) + "'", double1 == (-88.0d));
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.12125048919205E-18d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0300863255517117E-9d + "'", double1 == 2.0300863255517117E-9d);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0104439773554954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6983555819361141d + "'", double1 == 0.6983555819361141d);
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        double double1 = org.apache.commons.math.util.FastMath.log(0.44488600522827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8099371976588898d) + "'", double1 == (-0.8099371976588898d));
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01693485514155029d) + "'", double1 == (-0.01693485514155029d));
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4336110861910443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5428187279146441d + "'", double1 == 0.5428187279146441d);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.4651144277202135E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0003564839175727d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        long long2 = org.apache.commons.math.util.FastMath.max(6061L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6061L + "'", long2 == 6061L);
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.9369645424212627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2426208133067402d + "'", double1 == 1.2426208133067402d);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8784747043354492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7056543667253279d + "'", double1 == 0.7056543667253279d);
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.6571830710861824E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000137312788d + "'", double1 == 1.0000000137312788d);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3554049701597965E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.293955920339377E-23d + "'", double1 == 5.293955920339377E-23d);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        double double1 = org.apache.commons.math.util.FastMath.signum((-29.801969570734137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8995084834391828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5932304554191821d) + "'", double1 == (-0.5932304554191821d));
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6380998614296134d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8032290633000474d + "'", double1 == 0.8032290633000474d);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        double double1 = org.apache.commons.math.util.FastMath.tan(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8203867151263053d) + "'", double1 == (-0.8203867151263053d));
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.3211090992020038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7403681597556238d + "'", double1 == 1.7403681597556238d);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.6653943626343264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.029066614972121423d + "'", double1 == 0.029066614972121423d);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.3275777768846914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.347218072702102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.10691545966407d + "'", double1 == 1.10691545966407d);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(75.78518007393176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4342.170967875233d + "'", double1 == 4342.170967875233d);
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        double double1 = org.apache.commons.math.util.FastMath.tanh(114.59155902616465d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9961652815068444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        double double1 = org.apache.commons.math.util.FastMath.ulp(172.58048571980692d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.0000000000000564d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000564d + "'", double2 == 1.000000000000564d);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.6342953050784887d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.267020871997795d) + "'", double1 == (-1.267020871997795d));
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6527952774484755d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9756139057433201d + "'", double1 == 0.9756139057433201d);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.8571305341625859d), 5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8571305341625859d) + "'", double2 == (-0.8571305341625859d));
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.1175057225567089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.057219132537549d + "'", double1 == 2.057219132537549d);
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0206781281751491d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        long long2 = org.apache.commons.math.util.FastMath.max(0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.095315644213873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0465732865948152d + "'", double1 == 1.0465732865948152d);
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.262122178163556E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.615620091065296d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6552490790653522d) + "'", double1 == (-0.6552490790653522d));
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2738.593745198908d + "'", double1 == 2738.593745198908d);
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        double double2 = org.apache.commons.math.util.FastMath.atan2(5.916079783099616d, 75.6939756606048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07799930268337386d + "'", double2 == 0.07799930268337386d);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        double double1 = org.apache.commons.math.util.FastMath.log(6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 84.71050998855853d + "'", double1 == 84.71050998855853d);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9996159448097379d, 0.019810283960318427d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999923903252116d + "'", double2 == 0.9999923903252116d);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.1438634000260818d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0103661992710218d + "'", double1 == 1.0103661992710218d);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        long long2 = org.apache.commons.math.util.FastMath.min(9L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.757373373600886d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8592811670678461d + "'", double1 == 0.8592811670678461d);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.8076350433445d, 1.0232274785465052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4404842646755718d + "'", double2 == 1.4404842646755718d);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        float float2 = org.apache.commons.math.util.FastMath.min(88.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8657584620020855d, 1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8657584620020855d + "'", double2 == 0.8657584620020855d);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        double double1 = org.apache.commons.math.util.FastMath.tan(22.46077005725419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5074898020664782d + "'", double1 == 0.5074898020664782d);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
        double double1 = org.apache.commons.math.util.FastMath.signum(151.2644211956603d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.19006280234111023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.981992372399956d + "'", double1 == 0.981992372399956d);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        double double2 = org.apache.commons.math.util.FastMath.min(1.8218948327082145d, (-1.6571830710861824E-4d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6571830710861824E-4d) + "'", double2 == (-1.6571830710861824E-4d));
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.355404970159922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355404970159796E-7d + "'", double1 == 3.355404970159796E-7d);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9517287150164593d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9836434950657202d + "'", double1 == 0.9836434950657202d);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 252318057L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 252318064 + "'", int1 == 252318064);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 69.35280798945955d + "'", double1 == 69.35280798945955d);
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.03760197886023983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5331854813304842d + "'", double1 == 1.5331854813304842d);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0895609743647756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7201746613556624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.669115964572823d + "'", double1 == 0.669115964572823d);
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.13997351035384709d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13100502560471863d + "'", double1 == 0.13100502560471863d);
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.7175814658190476d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4256654690606231d + "'", double1 == 0.4256654690606231d);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        int int2 = org.apache.commons.math.util.FastMath.max(44, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        double double1 = org.apache.commons.math.util.FastMath.acosh(8.096453930081621d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7807376231348977d + "'", double1 == 2.7807376231348977d);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(29.923020517919355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1714.4627859601458d + "'", double1 == 1714.4627859601458d);
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.29295641644784054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3403843704464924d + "'", double1 == 1.3403843704464924d);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5323679344623238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026744865808352235d + "'", double1 == 0.026744865808352235d);
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(3.124050593532391d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7674983998669958d + "'", double1 == 1.7674983998669958d);
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.4692606193559588d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        double double1 = org.apache.commons.math.util.FastMath.tan(1714.4627859601458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1310193973073308d) + "'", double1 == (-1.1310193973073308d));
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.233403117511217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0142047603949278d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        double double2 = org.apache.commons.math.util.FastMath.min(8.442682412367938E-6d, 5.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.442682412367938E-6d + "'", double2 == 8.442682412367938E-6d);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09364907698670265d) + "'", double1 == (-0.09364907698670265d));
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5978220919084256d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6407814939389498d) + "'", double1 == (-0.6407814939389498d));
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        double double1 = org.apache.commons.math.util.FastMath.sin(6.614415338769718E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.33051577000636745d) + "'", double1 == (-0.33051577000636745d));
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999999958776927d + "'", double1 == 0.9999999958776927d);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 145, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        double double1 = org.apache.commons.math.util.FastMath.sinh(25.306852819440053d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.89324023572096E10d + "'", double1 == 4.89324023572096E10d);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.6105760168731105d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8622926809699383d) + "'", double1 == (-0.8622926809699383d));
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1553250449256478d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1553250449256478d + "'", double1 == 1.1553250449256478d);
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.13524400261494204d, 5425210.214035052d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.4928804097777624E-8d + "'", double2 == 2.4928804097777624E-8d);
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.02048667164338245d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5755987295198134E-4d + "'", double1 == 3.5755987295198134E-4d);
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.112226704088329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.036090693379206d + "'", double1 == 1.036090693379206d);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.992954145267955E-5d) + "'", double1 == (-5.992954145267955E-5d));
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        double double1 = org.apache.commons.math.util.FastMath.acos(43.63613080502884d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5401776706283436E45d, 1.7273406689256667d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5401776706283433E45d + "'", double2 == 1.5401776706283433E45d);
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.24164608746315416d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2416460874631542d + "'", double1 == 0.2416460874631542d);
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5665959743566382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2907797382680593d + "'", double1 == 2.2907797382680593d);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.067661995777765d + "'", double1 == 10.067661995777765d);
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.9246629085368494d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9765628692296336d) + "'", double1 == (-0.9765628692296336d));
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        long long2 = org.apache.commons.math.util.FastMath.max(573L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        double double2 = org.apache.commons.math.util.FastMath.min(0.6846624340993608d, 1.556935161647739d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6846624340993608d + "'", double2 == 0.6846624340993608d);
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        double double2 = org.apache.commons.math.util.FastMath.max(1.7453292519943295d, 3.974903989667673d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.974903989667673d + "'", double2 == 3.974903989667673d);
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 9);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.6874262672169151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9885908398396104d + "'", double1 == 1.9885908398396104d);
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        double double1 = org.apache.commons.math.util.FastMath.log(4.221555141999398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4402035772236546d + "'", double1 == 1.4402035772236546d);
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        double double2 = org.apache.commons.math.util.FastMath.atan2(7.0368744177664E13d, 0.05625771078525112d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796326794896d + "'", double2 == 1.570796326794896d);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.15122623336946334d, 32.00000000000003d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15122623336946336d + "'", double2 == 0.15122623336946336d);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 252318064, (-7L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1737998214361567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.083420426905528d + "'", double1 == 1.083420426905528d);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7453292519943295d + "'", double1 == 1.7453292519943295d);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
        double double1 = org.apache.commons.math.util.FastMath.ulp(99.98991284675515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4210854715202004E-14d + "'", double1 == 1.4210854715202004E-14d);
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5573185038727098d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        double double1 = org.apache.commons.math.util.FastMath.tan((-29.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8871428437982151d) + "'", double1 == (-0.8871428437982151d));
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.112226704088329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6849742439769542d + "'", double1 == 1.6849742439769542d);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        double double2 = org.apache.commons.math.util.FastMath.max(0.8669842514321565d, (-0.9998542144022069d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8669842514321565d + "'", double2 == 0.8669842514321565d);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.9966529754586305d), 0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9966529754586304d) + "'", double2 == (-0.9966529754586304d));
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3593642103115025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02372538120370837d + "'", double1 == 0.02372538120370837d);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.842859999667966E24d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        float float2 = org.apache.commons.math.util.FastMath.max(2.52318064E8f, (float) 88L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(15.999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.999999999999999d + "'", double1 == 3.999999999999999d);
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.331941588598159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.197511737224069d + "'", double1 == 5.197511737224069d);
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.8690202903623525E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.007385037334679E43d + "'", double1 == 5.007385037334679E43d);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9033391107665129d, 0.008592287884538355d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9033391107665127d + "'", double2 == 0.9033391107665127d);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.791759469228055d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9166666666666665d + "'", double1 == 2.9166666666666665d);
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5071221992618503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.363899346513529d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8291545066738191d + "'", double1 == 0.8291545066738191d);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        int int1 = org.apache.commons.math.util.FastMath.round(145.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 9, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        double double1 = org.apache.commons.math.util.FastMath.log(6.365513453787659d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.850894897064994d + "'", double1 == 1.850894897064994d);
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.8205576256903795d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.7263513014980092d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7476026429360669d + "'", double1 == 0.7476026429360669d);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, (-0.01900502000357532d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.01900502000357532d) + "'", double2 == (-0.01900502000357532d));
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        int int2 = org.apache.commons.math.util.FastMath.max(0, 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2105 + "'", int2 == 2105);
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.05363026241493581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.2705900780121366d) + "'", double1 == (-1.2705900780121366d));
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.520586644733795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.89629601826829E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4537149018123079d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5741491464259456d + "'", double1 == 1.5741491464259456d);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.9369645424212623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.858515120429434d + "'", double1 == 17.858515120429434d);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 573.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.044033658705184d + "'", double1 == 7.044033658705184d);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        double double1 = org.apache.commons.math.util.FastMath.log(1.270648871775057d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23952769265148452d + "'", double1 == 0.23952769265148452d);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        int int2 = org.apache.commons.math.util.FastMath.min(145, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.014686439244896978d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014685383422630798d) + "'", double1 == (-0.014685383422630798d));
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.41610699968243714d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7465662286826749d) + "'", double1 == (-0.7465662286826749d));
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.01693485514155029d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2599210498948734d, 0.4755806431682656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2098631571075213d + "'", double2 == 1.2098631571075213d);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        double double1 = org.apache.commons.math.util.FastMath.log(7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.043456497483734d + "'", double1 == 2.043456497483734d);
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7678292603100174d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        double double1 = org.apache.commons.math.util.FastMath.atan(88.41160108781288d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.559486076253748d + "'", double1 == 1.559486076253748d);
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        double double1 = org.apache.commons.math.util.FastMath.signum(572.9577951308233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-95.13395371691644d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-95.0d) + "'", double1 == (-95.0d));
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.149071860492834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.149071860492834d + "'", double1 == 5.149071860492834d);
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.102050415563806E69d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(56.25580735763506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 56.255807357635064d + "'", double1 == 56.255807357635064d);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.5326825911566597d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1529684096980417d + "'", double1 == 1.1529684096980417d);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 10, (-7.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.2110835568321545E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.570784215959328d + "'", double1 == 1.570784215959328d);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.009494959628835965d), 116.29021260843672d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.009494959628835965d) + "'", double2 == (-0.009494959628835965d));
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.408334722591744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5043106036526678d + "'", double1 == 0.5043106036526678d);
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.7370529091738743d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-42.23002097350219d) + "'", double1 == (-42.23002097350219d));
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, 2.14748365E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.14748365E9f + "'", float2 == 2.14748365E9f);
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.0267884501723548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02678524721389689d) + "'", double1 == (-0.02678524721389689d));
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.5792809126705764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6178462366399047d) + "'", double1 == (-0.6178462366399047d));
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.004756300337967979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.322730729536119d) + "'", double1 == (-2.322730729536119d));
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.6667712316526706d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.21565069657906166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21565069657906166d + "'", double1 == 0.21565069657906166d);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        double double2 = org.apache.commons.math.util.FastMath.min(9.719767342840083d, 35.00000000000001d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.719767342840083d + "'", double2 == 9.719767342840083d);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.770091723226162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.025678842914286695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003297196042849d + "'", double1 == 1.0003297196042849d);
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.03833419802937044d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3371802492356763d) + "'", double1 == (-0.3371802492356763d));
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        double double2 = org.apache.commons.math.util.FastMath.max(2005.3522829578812d, 5.6522336740340915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2005.3522829578812d + "'", double2 == 2005.3522829578812d);
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8035486307140491d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.025618622601251d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.7603734074051981d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9127299606445602d) + "'", double1 == (-0.9127299606445602d));
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7765227797066595E55d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7765227797066595E55d + "'", double1 == 1.7765227797066595E55d);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.9974964160775457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        double double1 = org.apache.commons.math.util.FastMath.acos(10.206709210579758d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26, 4.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.0643321090394411d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5665959743566382d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.8784747043354492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6383260072387366d + "'", double1 == 0.6383260072387366d);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        long long2 = org.apache.commons.math.util.FastMath.max((-2L), (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.004756300337967979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00475630033796798d + "'", double1 == 0.00475630033796798d);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 573);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 573L + "'", long1 == 573L);
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 9, 145L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        double double2 = org.apache.commons.math.util.FastMath.min(1.487119795718273d, 1.1368683772161603E-13d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1368683772161603E-13d + "'", double2 == 1.1368683772161603E-13d);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.1703428488012644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8637242016148625d + "'", double1 == 0.8637242016148625d);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.05483113556160755d, 0.9153412831308465d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0701099368820658d + "'", double2 == 0.0701099368820658d);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        double double2 = org.apache.commons.math.util.FastMath.max(2.2919043892128164d, 1.5950899460174346d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.2919043892128164d + "'", double2 == 2.2919043892128164d);
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9905499752128979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8746755989516632d + "'", double1 == 0.8746755989516632d);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        double double1 = org.apache.commons.math.util.FastMath.floor(8.993445053121845E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.027708598556821545d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.8002419211835452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25533087064513765d + "'", double1 == 0.25533087064513765d);
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8414709848078965d), 0.6250369392251006d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        long long1 = org.apache.commons.math.util.FastMath.round(1.5707963267948948d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.08883176481419076d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08894901143102314d) + "'", double1 == (-0.08894901143102314d));
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        int int2 = org.apache.commons.math.util.FastMath.min((-2), 2105);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.93224517135305d + "'", double1 == 76.93224517135305d);
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.2511212299366168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.325178437245552d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5802718846862194d + "'", double1 == 1.5802718846862194d);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5430642407677928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.050069572111205d + "'", double1 == 36.050069572111205d);
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 52, (float) (-2));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.9259299443872359E-34d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        double double1 = org.apache.commons.math.util.FastMath.expm1((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6321205588285577d) + "'", double1 == (-0.6321205588285577d));
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.6881171418161737E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5816161669572506d) + "'", double1 == (-0.5816161669572506d));
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2591878587402234d + "'", double1 == 0.2591878587402234d);
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.10691545966407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0250132137771875d + "'", double1 == 2.0250132137771875d);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        double double1 = org.apache.commons.math.util.FastMath.ceil(22026.465794806703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22027.0d + "'", double1 == 22027.0d);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.7544036781775962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3280805330246155d + "'", double1 == 1.3280805330246155d);
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 52, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.9225054330000896E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9225054331185167E-5d + "'", double1 == 1.9225054331185167E-5d);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3329726105619924d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.077925278655343d + "'", double1 == 19.077925278655343d);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.2073026073820456d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5918362854056809d + "'", double1 == 0.5918362854056809d);
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.7740624720562873d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.9262160379374064d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        long long1 = org.apache.commons.math.util.FastMath.abs(6061L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6061L + "'", long1 == 6061L);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        double double2 = org.apache.commons.math.util.FastMath.max(0.048623772378180656d, (-0.01900502000357532d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.048623772378180656d + "'", double2 == 0.048623772378180656d);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        double double1 = org.apache.commons.math.util.FastMath.sinh(181.18516357615334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4360530864024404E78d + "'", double1 == 2.4360530864024404E78d);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-2.001194862670967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-114.66001961430878d) + "'", double1 == (-114.66001961430878d));
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.38942345262260686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.0161683420890135d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9651522587201157d + "'", double1 == 0.9651522587201157d);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0092570056990897d, (-0.5313592245660101d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0092570056990897d + "'", double2 == 1.0092570056990897d);
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.402744338107512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
        long long2 = org.apache.commons.math.util.FastMath.min(7L, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        double double2 = org.apache.commons.math.util.FastMath.max(0.42012681275810204d, 0.46349720318630866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46349720318630866d + "'", double2 == 0.46349720318630866d);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8571305341625858d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7766609160650201d) + "'", double1 == (-0.7766609160650201d));
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6161114410916003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.195876932689694d + "'", double1 == 1.195876932689694d);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.247220505424423d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 128.75625059607518d + "'", double1 == 128.75625059607518d);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.8749693034931421d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.019507419306942612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019506182106850515d + "'", double1 == 0.019506182106850515d);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.355404970159796E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.35540497015967E-7d + "'", double1 == 3.35540497015967E-7d);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9247009288407589d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        double double1 = org.apache.commons.math.util.FastMath.atan(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5699061505137777d + "'", double1 == 1.5699061505137777d);
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5858517268878107d, 0.7972957247486471d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5858517268878105d + "'", double2 == 1.5858517268878105d);
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.35583418012252627d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.4800229187927331d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008377980417966557d + "'", double1 == 0.008377980417966557d);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9127299606445602d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
        int int2 = org.apache.commons.math.util.FastMath.min(44, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.60724027300823E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17765.729914390176d + "'", double1 == 17765.729914390176d);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 252318064, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6881824710286039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7438033307384155d + "'", double1 == 0.7438033307384155d);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9698480248174192d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1209452514271958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1209452514271958d + "'", double1 == 1.1209452514271958d);
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.7192510249555393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.395778272734467d + "'", double1 == 1.395778272734467d);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7711778429329054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.345643037242276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04405404020821298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.044054040208212984d + "'", double1 == 0.044054040208212984d);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.0000000000000002d, 4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.11219328616561733d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0000059033229618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6931501322170701d + "'", double1 == 0.6931501322170701d);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.395663482186485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.164006151880159d + "'", double1 == 1.164006151880159d);
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.9225054334737986E-5d, (-1.506999785948914d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2800017211707247E7d + "'", double2 == 1.2800017211707247E7d);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7722726579137131d, 1.0000000000000564d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6576038937046224d + "'", double2 == 0.6576038937046224d);
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.02772279083371712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027729896256446035d + "'", double1 == 0.027729896256446035d);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9142469191379081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7231644046549128d + "'", double1 == 0.7231644046549128d);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.550386653691239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.53483235683642d + "'", double1 == 31.53483235683642d);
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        long long1 = org.apache.commons.math.util.FastMath.round(3.355404407222922E-7d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        long long2 = org.apache.commons.math.util.FastMath.min(24L, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        long long2 = org.apache.commons.math.util.FastMath.min(24L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.8240833297627779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.679230018528973d + "'", double1 == 0.679230018528973d);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9861758970260069d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5269814632356071d + "'", double1 == 1.5269814632356071d);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        double double1 = org.apache.commons.math.util.FastMath.acosh(572.9577948946323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.04395847663815d + "'", double1 == 7.04395847663815d);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        int int2 = org.apache.commons.math.util.FastMath.max(44, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8042331995094061d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7359704175800968d) + "'", double1 == (-0.7359704175800968d));
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3036378347354876d, 0.015747708586685748d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3036378347354873d + "'", double2 == 1.3036378347354873d);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.095821923671918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8310867969492228d + "'", double1 == 0.8310867969492228d);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8721925418312972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.702486392946792d + "'", double1 == 0.702486392946792d);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.979079476192864E-9d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.979079476192864E-9d) + "'", double1 == (-1.979079476192864E-9d));
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        double double2 = org.apache.commons.math.util.FastMath.atan2(97.09607204776374d, 4.619035187754997d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5232603615987637d + "'", double2 == 1.5232603615987637d);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.0749608557100309d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.013625327705883431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.013624484621116897d + "'", double1 == 0.013624484621116897d);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
        double double1 = org.apache.commons.math.util.FastMath.acos(16.01682731613292d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        int int2 = org.apache.commons.math.util.FastMath.min(252318064, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.554877906181354d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8401463744358098d + "'", double1 == 0.8401463744358098d);
    }
}

