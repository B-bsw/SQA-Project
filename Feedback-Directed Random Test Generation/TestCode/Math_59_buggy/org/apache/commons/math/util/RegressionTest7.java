package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.025684490500959736d, 0.9149994957367078d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.028063127633168303d + "'", double2 == 0.028063127633168303d);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9646989825943999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1672611943505358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1820629731608001d + "'", double1 == 0.1820629731608001d);
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.16646964819512283d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571020934276795d + "'", double1 == 0.16571020934276795d);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.009972525083085703d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009972194509427618d + "'", double1 == 0.009972194509427618d);
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        double double1 = org.apache.commons.math.util.FastMath.log1p(104.06639041664195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.654592440028928d + "'", double1 == 4.654592440028928d);
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.0034419884227690025d), 0.4947180585964329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.003441988422769002d) + "'", double2 == (-0.003441988422769002d));
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        double double1 = org.apache.commons.math.util.FastMath.cos(2005.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7876030784130355d + "'", double1 == 0.7876030784130355d);
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9963896316913787d + "'", double1 == 0.9963896316913787d);
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.2710663101885897d, 0.7625584504796027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3417645546948611d + "'", double2 == 1.3417645546948611d);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 26.000000000000004d + "'", double1 == 26.000000000000004d);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.01807019118332042d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13442541122615329d + "'", double1 == 0.13442541122615329d);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.355372716651809E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000000335537328d + "'", double1 == 1.000000335537328d);
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7853952054853407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6674619946174979d + "'", double1 == 0.6674619946174979d);
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.6603469013500041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7897794929039231d + "'", double1 == 0.7897794929039231d);
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14436016288910877d) + "'", double1 == (-0.14436016288910877d));
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        double double1 = org.apache.commons.math.util.FastMath.asinh(8.479030977575487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.834202696611004d + "'", double1 == 2.834202696611004d);
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.137917206686937d + "'", double1 == 1.137917206686937d);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.845300947487885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7706103966970982d) + "'", double1 == (-0.7706103966970982d));
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999999997709829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718281827836512d + "'", double1 == 2.718281827836512d);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.220446049250313E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-15.653559774527022d) + "'", double1 == (-15.653559774527022d));
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.3417645546948611d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8257883656009093d + "'", double1 == 2.8257883656009093d);
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1805916207174113E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1805916207174113E21d + "'", double1 == 1.1805916207174113E21d);
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        double double2 = org.apache.commons.math.util.FastMath.max(0.7085012011516139d, (-0.7370529091738743d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7085012011516139d + "'", double2 == 0.7085012011516139d);
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.230532568900645E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963129646567d + "'", double1 == 1.5707963129646567d);
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        long long1 = org.apache.commons.math.util.FastMath.round((double) 3.0f);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.27781241944192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.154374381457872d + "'", double1 == 2.154374381457872d);
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0013377559375205616d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.001337755538514611d) + "'", double1 == (-0.001337755538514611d));
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.7453292519943293d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        double double2 = org.apache.commons.math.util.FastMath.min(169.42101997711706d, (double) 22025L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 169.42101997711706d + "'", double2 == 169.42101997711706d);
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.078927767113337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.522227941985666d + "'", double1 == 4.522227941985666d);
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        double double2 = org.apache.commons.math.util.FastMath.min(4.8373005113295966E-4d, 0.18115285874844744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.8373005113295966E-4d + "'", double2 == 4.8373005113295966E-4d);
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        long long1 = org.apache.commons.math.util.FastMath.round(8.653397151028901d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9L + "'", long1 == 9L);
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        double double1 = org.apache.commons.math.util.FastMath.acosh(10.693147180044656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0605566643729682d + "'", double1 == 3.0605566643729682d);
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5323537367737086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 25.99999999999995d + "'", double1 == 25.99999999999995d);
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        double double2 = org.apache.commons.math.util.FastMath.min(314.7524207034134d, 96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99484522385717d + "'", double2 == 96.99484522385717d);
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7897794929039231d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6603469013500041d + "'", double1 == 0.6603469013500041d);
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 32.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9223372036854775807L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2182829050172777d, 2.9369645424212623d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.39320825252632513d + "'", double2 == 0.39320825252632513d);
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5451146601807795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2195305837148458d + "'", double1 == 1.2195305837148458d);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.16571020934276795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.180231032234882d + "'", double1 == 1.180231032234882d);
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        double double2 = org.apache.commons.math.util.FastMath.max(50.69314718055995d, 7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.69314718055995d + "'", double2 == 50.69314718055995d);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        double double1 = org.apache.commons.math.util.FastMath.floor(104.06639041664197d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.0d + "'", double1 == 104.0d);
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1488093008679707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7357243515423462d + "'", double1 == 1.7357243515423462d);
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7143859385096635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3363319325507605d) + "'", double1 == (-0.3363319325507605d));
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.026697492810876286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9992606284658041d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.554877906181354d + "'", double1 == 1.554877906181354d);
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.9536075631471675d), 0.14466555184225383d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2976454463101708d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9700147524633321d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5085304107780737d + "'", double1 == 1.5085304107780737d);
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4876096657890749d + "'", double1 == 0.4876096657890749d);
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.8384708625565505E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        double double1 = org.apache.commons.math.util.FastMath.log1p(5.826543326104914E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.824846554803807E-4d + "'", double1 == 5.824846554803807E-4d);
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5707639925974655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.810321840554628d + "'", double1 == 4.810321840554628d);
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.6636920174428667d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        long long1 = org.apache.commons.math.util.FastMath.round(1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        int int1 = org.apache.commons.math.util.FastMath.abs(145);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 8L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 8.0f + "'", float1 == 8.0f);
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1900628023411102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.150076871218412d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.594700892207039d + "'", double1 == 4.594700892207039d);
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5836293809324178d, 52.38248989944038d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.619290194948025E-13d + "'", double2 == 5.619290194948025E-13d);
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 32L, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        long long1 = org.apache.commons.math.util.FastMath.round(0.17410381825958643d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        float float2 = org.apache.commons.math.util.FastMath.min((float) '#', (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7460679984455996d + "'", double1 == 0.7460679984455996d);
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.12911222262740002d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5054239130833369d) + "'", double1 == (-0.5054239130833369d));
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        int int2 = org.apache.commons.math.util.FastMath.min(97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.154434690031884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03760197886023983d + "'", double1 == 0.03760197886023983d);
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0115470718397392d + "'", double1 == 1.0115470718397392d);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        long long2 = org.apache.commons.math.util.FastMath.max(22025L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9916765892091398d, 0.46500741642797333d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9916765892091397d + "'", double2 == 0.9916765892091397d);
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5402647332399915d, 0.4290881902052651d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7678292603100174d + "'", double2 == 0.7678292603100174d);
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(4.0920461537065214E-7d, (-0.1559057424196283d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.092046153706521E-7d + "'", double2 == 4.092046153706521E-7d);
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16648030344294168d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1902899496825317d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4999999999999996d + "'", double1 == 2.4999999999999996d);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.08308215993632734d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        double double1 = org.apache.commons.math.util.FastMath.asin(22.597055569270644d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        int int1 = org.apache.commons.math.util.FastMath.round(26.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.9484831895170822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9295201403190069d) + "'", double1 == (-0.9295201403190069d));
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2.5356779950985695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5695141467684478d) + "'", double1 == (-0.5695141467684478d));
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.4182755546463937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4315459888945143d) + "'", double1 == (-0.4315459888945143d));
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2147483647, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7416901480811822d + "'", double1 == 0.7416901480811822d);
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        long long2 = org.apache.commons.math.util.FastMath.min(145L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.3754758794263844d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.23824322705557036d + "'", double1 == 0.23824322705557036d);
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.001337755538514611d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0013377555385146109d) + "'", double1 == (-0.0013377555385146109d));
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.442682412167344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682412167346E-6d + "'", double1 == 8.442682412167346E-6d);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.0605566643729682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0809473267183269d + "'", double1 == 0.0809473267183269d);
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.058283143422131d, 1.151665335034498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0582831434221311d + "'", double2 == 1.0582831434221311d);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        double double1 = org.apache.commons.math.util.FastMath.signum(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9756139057433201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.399216241149911E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.978995704713228E82d + "'", double1 == 6.978995704713228E82d);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.2980417794264124d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        double double1 = org.apache.commons.math.util.FastMath.floor((-2.7983904661072323d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.0d) + "'", double1 == (-3.0d));
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.8104768396174693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.17197351819585d + "'", double1 == 45.17197351819585d);
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.21580950969080773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0037665865012192047d + "'", double1 == 0.0037665865012192047d);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.019234492165425023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.357052182357205E-4d + "'", double1 == 3.357052182357205E-4d);
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.08317777404333762d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201875472177408d + "'", double1 == 0.9201875472177408d);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.8184464592320668d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24512646241203326d) + "'", double1 == (-0.24512646241203326d));
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        double double1 = org.apache.commons.math.util.FastMath.log(1.6940658945086007E-21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-47.82715545863623d) + "'", double1 == (-47.82715545863623d));
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9624876016981836d + "'", double1 == 0.9624876016981836d);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.006767125876795721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006744331656933604d + "'", double1 == 0.006744331656933604d);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.6789823271282955d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        double double1 = org.apache.commons.math.util.FastMath.cos(3.1558490147807587d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9998983798039537d) + "'", double1 == (-0.9998983798039537d));
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, (-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.9E-324d) + "'", double2 == (-4.9E-324d));
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.15082891211336d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.354182541534335d + "'", double1 == 4.354182541534335d);
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.004293621779660161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004302852580113831d + "'", double1 == 0.004302852580113831d);
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.875409442231813E-18d, (-2.7983904661072323d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8754094422318124E-18d + "'", double2 == 3.8754094422318124E-18d);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 22025, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.7377936960093874E-61d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7377936960093874E-61d + "'", double1 == 1.7377936960093874E-61d);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        double double2 = org.apache.commons.math.util.FastMath.atan2(3.16227766016838d, 75.6939756606048d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04175285837729747d + "'", double2 == 0.04175285837729747d);
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.5004011384648823d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42017156972796377d) + "'", double1 == (-0.42017156972796377d));
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9936116249145202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.19240232444172625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4386368936167206d + "'", double1 == 0.4386368936167206d);
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 97.0f, 0.8569259205417066d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99999999999999d + "'", double2 == 96.99999999999999d);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.730093305612845d + "'", double1 == 1.730093305612845d);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.21259644855998064d, (-36.736800569677094d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1358057023023203d + "'", double2 == 3.1358057023023203d);
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        int int2 = org.apache.commons.math.util.FastMath.min((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        double double1 = org.apache.commons.math.util.FastMath.log10(8.442682412167344E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.073519547246666d) + "'", double1 == (-5.073519547246666d));
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.16571020934276795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9863014530427412d + "'", double1 == 0.9863014530427412d);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        double double1 = org.apache.commons.math.util.FastMath.exp((-1.529835379788728d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21657131639750768d + "'", double1 == 0.21657131639750768d);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.01773703268867599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017737032688675995d + "'", double1 == 0.017737032688675995d);
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.5473008271869906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5791357593406526d + "'", double1 == 0.5791357593406526d);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        double double2 = org.apache.commons.math.util.FastMath.min(1.6145485553432248d, 0.49546634624061675d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49546634624061675d + "'", double2 == 0.49546634624061675d);
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        double double2 = org.apache.commons.math.util.FastMath.max(8.442682412167344E-6d, 1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8163011534362759d + "'", double2 == 1.8163011534362759d);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.399216241149911E248d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.1443601628891088d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1443601628891088d + "'", double1 == 0.1443601628891088d);
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        double double1 = org.apache.commons.math.util.FastMath.log(1.2172043679489204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19655672755619258d + "'", double1 == 0.19655672755619258d);
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.015705630273145536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01570692181693664d + "'", double1 == 0.01570692181693664d);
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9617267167450815E22d + "'", double1 == 4.9617267167450815E22d);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        double double1 = org.apache.commons.math.util.FastMath.acos(7.896296018267967E13d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        double double1 = org.apache.commons.math.util.FastMath.asin(29.923020517919355d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.142219984543288E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        long long2 = org.apache.commons.math.util.FastMath.max(7L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7L + "'", long2 == 7L);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8845500881248141d), 3.8212977905417654E24d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.314789730112624E-25d) + "'", double2 == (-2.314789730112624E-25d));
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        double double2 = org.apache.commons.math.util.FastMath.min((-6.041406849910749d), 0.5937881252841113d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-6.041406849910749d) + "'", double2 == (-6.041406849910749d));
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-1.5707963267948966d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.233403117511217d) + "'", double1 == (-1.233403117511217d));
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3265.8594322456925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.09158438412067d + "'", double1 == 8.09158438412067d);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        int int2 = org.apache.commons.math.util.FastMath.max(573, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        double double2 = org.apache.commons.math.util.FastMath.max(0.49186351728990335d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49186351728990335d + "'", double2 == 0.49186351728990335d);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7777181923662807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7151743879062039d + "'", double1 == 0.7151743879062039d);
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.000000335537328d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.9225054335922256E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.922505433355371E-5d + "'", double1 == 1.922505433355371E-5d);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.543080634815244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.232630319679133d + "'", double1 == 2.232630319679133d);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.355372716651809E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.4742592311448774d) + "'", double1 == (-6.4742592311448774d));
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.0850005042632922d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6558995212736551d + "'", double1 == 1.6558995212736551d);
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 8L, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.741263221749836d + "'", double1 == 17.741263221749836d);
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        double double1 = org.apache.commons.math.util.FastMath.asin(4.1577059034868376E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.1577059034868376E-10d + "'", double1 == 4.1577059034868376E-10d);
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.718281827836512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04744296789287678d + "'", double1 == 0.04744296789287678d);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.355404970159922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.355404407222922E-7d + "'", double1 == 3.355404407222922E-7d);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        double double2 = org.apache.commons.math.util.FastMath.min(7.044033658705184d, 0.9525849574608642d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9525849574608642d + "'", double2 == 0.9525849574608642d);
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3643047812382505d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 5L, (float) 145);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.806217383955855E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383918848E-6d + "'", double1 == 4.806217383918848E-6d);
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.1797945711178876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.17788194668502907d) + "'", double1 == (-0.17788194668502907d));
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 26L, (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.1256138592702154d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.023271265020779454d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023271265020779454d + "'", double1 == 0.023271265020779454d);
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-2.3012989023072947d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.943508829600679d) + "'", double1 == (-4.943508829600679d));
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.07634906307728516d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9264927456996488d + "'", double1 == 0.9264927456996488d);
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.1498887117707062d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.06065581061219554d + "'", double1 == 0.06065581061219554d);
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-7.095326904862169d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6425066610664365d + "'", double1 == 0.6425066610664365d);
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.156119580207155E36d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.156119580207155E36d + "'", double1 == 6.156119580207155E36d);
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.201867548519866d + "'", double1 == 1.201867548519866d);
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.920960112236651d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.920960112236651d + "'", double1 == 0.920960112236651d);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1037080495808624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3418436161673093d + "'", double1 == 1.3418436161673093d);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, (long) 3);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        double double2 = org.apache.commons.math.util.FastMath.pow((-4.9E-324d), (-15.906532428616288d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.8267087199189199d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97864804714L, (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        double double1 = org.apache.commons.math.util.FastMath.asinh(47.7974777282436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.560229461916166d + "'", double1 == 4.560229461916166d);
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0067670225817297d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00676691929044773d + "'", double1 == 0.00676691929044773d);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.05482909570415162d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        long long2 = org.apache.commons.math.util.FastMath.min(97L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.02347666707911227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.857130534162586d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5292052776014188d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5048474895291349d + "'", double1 == 0.5048474895291349d);
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.23824322705557036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        long long1 = org.apache.commons.math.util.FastMath.round(38.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.28131747735322093d, 1.9867978813066445d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.281317477353221d + "'", double2 == 0.281317477353221d);
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.661006041483758d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9367397952018179d + "'", double1 == 0.9367397952018179d);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        double double1 = org.apache.commons.math.util.FastMath.floor((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4669214877224426d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        float float2 = org.apache.commons.math.util.FastMath.max(22025.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.509815340662585E104d + "'", double1 == 5.509815340662585E104d);
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.818446459232067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3593642103115025d + "'", double1 == 1.3593642103115025d);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3276676988791267d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2369623959457472d + "'", double1 == 1.2369623959457472d);
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.02809969691994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0092801775366613d + "'", double1 == 1.0092801775366613d);
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9905499752128979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8363276179706672d + "'", double1 == 0.8363276179706672d);
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.21657131639750768d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6005285309527064d + "'", double1 == 0.6005285309527064d);
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        double double1 = org.apache.commons.math.util.FastMath.acosh(198.60867061197567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.984477251954342d + "'", double1 == 5.984477251954342d);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.84585047808035d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9503831832192838d) + "'", double1 == (-0.9503831832192838d));
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        double double2 = org.apache.commons.math.util.FastMath.min(7.38905609893065d, 1261966.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.38905609893065d + "'", double2 == 7.38905609893065d);
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.355404407222922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000564d + "'", double1 == 1.0000000000000564d);
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9998620166517991d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        double double1 = org.apache.commons.math.util.FastMath.log(0.13212285788973227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0240230476782646d) + "'", double1 == (-2.0240230476782646d));
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.8657726204163207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3078511907005352d + "'", double1 == 3.3078511907005352d);
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9786883441146831d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2654676519986654d) + "'", double1 == (-2.2654676519986654d));
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.9762070212577264E11d, 1.2915496650148839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.976207021257726E11d + "'", double2 == 1.976207021257726E11d);
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        double double1 = org.apache.commons.math.util.FastMath.floor(31.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 31.0d + "'", double1 == 31.0d);
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.9386097226368193d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.2722241413791169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.47627435869419515d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.008592287884538353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.00859249933957278d + "'", double1 == 0.00859249933957278d);
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        int int2 = org.apache.commons.math.util.FastMath.min(573, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        int int2 = org.apache.commons.math.util.FastMath.max(573, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 573 + "'", int2 == 573);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 57L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 57.0f + "'", float1 == 57.0f);
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 1, (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        double double1 = org.apache.commons.math.util.FastMath.abs(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.0d + "'", double1 == 1261966.0d);
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.13626144010775731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.360842641004344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 10, (-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.646687632678067d + "'", double2 == 1.646687632678067d);
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.2172043679489204d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.2706488717750568d, 4.18054648615969d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.2950705142472815d + "'", double2 == 0.2950705142472815d);
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.027715691434453935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003841043626869d + "'", double1 == 1.0003841043626869d);
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9960434131864047d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.111770234441798d + "'", double1 == 3.111770234441798d);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.4201312898382078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(22025.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261939.543775638d + "'", double1 == 1261939.543775638d);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.2054747075950174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7909427726190764d + "'", double1 == 0.7909427726190764d);
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.00676691929044773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.006766867647289856d + "'", double1 == 0.006766867647289856d);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.006767125876795721d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.673617379884035E-19d + "'", double1 == 8.673617379884035E-19d);
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.6870151974084779d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6342323330682557d + "'", double1 == 0.6342323330682557d);
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        double double2 = org.apache.commons.math.util.FastMath.pow(38.00000000000001d, (double) 7.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1441558259200015E11d + "'", double2 == 1.1441558259200015E11d);
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145L, (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2722218725854067E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1279281327218534E-7d + "'", double1 == 1.1279281327218534E-7d);
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        int int1 = org.apache.commons.math.util.FastMath.abs(22025);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22025 + "'", int1 == 22025);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 22025, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5654049234046847d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.565404923404685d + "'", double1 == 1.565404923404685d);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        double double1 = org.apache.commons.math.util.FastMath.sin(32.00000000000003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812417142d + "'", double1 == 0.5514266812417142d);
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.8657726204163207d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.231079894239296d + "'", double1 == 1.231079894239296d);
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2334031175105369d + "'", double1 == 1.2334031175105369d);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.04818156408044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.04818156408044d + "'", double1 == 14.04818156408044d);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        double double1 = org.apache.commons.math.util.FastMath.log(0.5412326235096074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6139061045510341d) + "'", double1 == (-0.6139061045510341d));
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.111770234441798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2598597557151618d + "'", double1 == 1.2598597557151618d);
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9999940841932833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718265747676712d + "'", double1 == 2.718265747676712d);
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.71827069403746d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3108282473449602d + "'", double1 == 1.3108282473449602d);
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        float float2 = org.apache.commons.math.util.FastMath.min(22025.0f, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 573.0f + "'", float2 == 573.0f);
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.4711276743037345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        long long2 = org.apache.commons.math.util.FastMath.max(573L, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        double double1 = org.apache.commons.math.util.FastMath.sin(57.295779251985515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6795224267964927d + "'", double1 == 0.6795224267964927d);
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6530932635023257d + "'", double1 == 0.6530932635023257d);
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0398314119215128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8287400822951458d + "'", double1 == 1.8287400822951458d);
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9916605674542439d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5292064628230686d + "'", double1 == 1.5292064628230686d);
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        double double2 = org.apache.commons.math.util.FastMath.max(1.8287400822951458d, 0.5402647332399916d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.8287400822951458d + "'", double2 == 1.8287400822951458d);
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        int int2 = org.apache.commons.math.util.FastMath.min(3, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.07657274203834082d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        double double1 = org.apache.commons.math.util.FastMath.cosh(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9861758970260069d, 0.1800736247033484d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9974964160775457d + "'", double2 == 0.9974964160775457d);
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        double double2 = org.apache.commons.math.util.FastMath.max(9.261725192512572E-19d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.261725192512572E-19d + "'", double2 == 9.261725192512572E-19d);
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6571830862563444E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6571831014265066E-4d) + "'", double1 == (-1.6571831014265066E-4d));
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (short) -1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8347410962443511d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9075712110370514d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3333452696210846d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3333452696210846d + "'", double2 == 1.3333452696210846d);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        double double1 = org.apache.commons.math.util.FastMath.log((-2104.8636254562957d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        double double1 = org.apache.commons.math.util.FastMath.tan(1261966.2318521831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6625147656574195d + "'", double1 == 1.6625147656574195d);
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.7425628777192574d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9852843599720181d + "'", double1 == 0.9852843599720181d);
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(17.889566311799566d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6153708008103522d + "'", double1 == 2.6153708008103522d);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.516464347103154d) + "'", double1 == (-3.516464347103154d));
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.43361108619104427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4336110861910443d + "'", double1 == 0.4336110861910443d);
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7615941553786771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6900760704576593d + "'", double1 == 0.6900760704576593d);
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.6430496853696097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21565069657906166d + "'", double1 == 0.21565069657906166d);
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        double double1 = org.apache.commons.math.util.FastMath.acos((-4.916823262511692d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8430650369670094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 35L, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        double double1 = org.apache.commons.math.util.FastMath.cosh(57.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8428599996679864E24d + "'", double1 == 2.8428599996679864E24d);
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.644920215519164d + "'", double1 == 28.644920215519164d);
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.023205328672353965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02320532867235397d + "'", double1 == 0.02320532867235397d);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.613248695272591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.57552721903246d + "'", double1 == 0.57552721903246d);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        long long2 = org.apache.commons.math.util.FastMath.max(32L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2599210498948732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5501042757606859d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5005983596580951d + "'", double1 == 0.5005983596580951d);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.809784758817254d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8097847588172544d + "'", double1 == 2.8097847588172544d);
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.140655263641914E-9d + "'", double1 == 1.140655263641914E-9d);
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, 5L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5L + "'", long2 == 5L);
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        double double1 = org.apache.commons.math.util.FastMath.floor(96.99999999999999d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 96.0d + "'", double1 == 96.0d);
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6931471805599453d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8060294742125208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3428141018704651d + "'", double1 == 1.3428141018704651d);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.247595209480447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2501327124042694d + "'", double1 == 0.2501327124042694d);
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5773024999492185d, 0.986746382996133d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5773024999492186d + "'", double2 == 0.5773024999492186d);
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        long long1 = org.apache.commons.math.util.FastMath.round(0.16883863257866716d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1966899686190524d, 1.156864174916083E21d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1966899686190524d + "'", double2 == 1.1966899686190524d);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-4.819341425933092E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.819341425933092E-20d) + "'", double1 == (-4.819341425933092E-20d));
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        double double1 = org.apache.commons.math.util.FastMath.ceil(5.159449696805132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 38L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.690612768985d + "'", double1 == 5557.690612768985d);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2184249125858766d + "'", double1 == 1.2184249125858766d);
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.45158270528864863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48500857799096964d + "'", double1 == 0.48500857799096964d);
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.6090535823208306d), 3.1805546814635168E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.6090535823208306d) + "'", double2 == (-0.6090535823208306d));
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7144972908707885d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.4078300410496931d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        int int1 = org.apache.commons.math.util.FastMath.abs(38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.39522188866412444d) + "'", double1 == (-0.39522188866412444d));
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7416901480811822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7352096506293136d + "'", double1 == 0.7352096506293136d);
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.025676021633806945d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02567602163380694d + "'", double2 == 0.02567602163380694d);
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1252750800637434d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.8995084834391828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1186432080671145d) + "'", double1 == (-1.1186432080671145d));
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.8414709848078965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.5356779950985695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6928551622806686d + "'", double1 == 0.6928551622806686d);
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3877277521741615d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.409122972438234d + "'", double1 == 0.409122972438234d);
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.748636741546022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6806406458923995d + "'", double1 == 0.6806406458923995d);
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.229687871848033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.702262890231486d + "'", double1 == 4.702262890231486d);
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.6832810232787436d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0347427151417616d + "'", double1 == 1.0347427151417616d);
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        double double1 = org.apache.commons.math.util.FastMath.rint(72.28798294509544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 72.0d + "'", double1 == 72.0d);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.42017156972796377d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.3977738256075148d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-22.790761408083426d) + "'", double1 == (-22.790761408083426d));
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.6284217534373299d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5878687580950964d) + "'", double1 == (-0.5878687580950964d));
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 2147483647);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.0259126351421606d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8278068656280008d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        float float2 = org.apache.commons.math.util.FastMath.min(8.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        long long2 = org.apache.commons.math.util.FastMath.min(9223372036854775807L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04746078367186166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04746078367186167d + "'", double1 == 0.04746078367186167d);
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6674619946174979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7307952105240656d + "'", double1 == 0.7307952105240656d);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.7359704175800968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8042331995094061d) + "'", double1 == (-0.8042331995094061d));
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.001137172509454239d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5719334995494423d + "'", double1 == 1.5719334995494423d);
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6284217534373299d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.748066027288565E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.439335658532258d + "'", double1 == 17.439335658532258d);
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        double double1 = org.apache.commons.math.util.FastMath.exp(75.6939756606048d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.472672389719356E32d + "'", double1 == 7.472672389719356E32d);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1261967.0000000002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261967.0000000005d + "'", double1 == 1261967.0000000005d);
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.837300699980114E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02771569143445394d + "'", double1 == 0.02771569143445394d);
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        double double1 = org.apache.commons.math.util.FastMath.log10((-22.790761408083426d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.806217383955855E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383918848E-6d + "'", double1 == 4.806217383918848E-6d);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.6321205588285577d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8582226493088282d) + "'", double1 == (-0.8582226493088282d));
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.04175285837729747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04174073658303252d + "'", double1 == 0.04174073658303252d);
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.6866383336765949d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.6268604078470186d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 36.59459942804923d + "'", double1 == 36.59459942804923d);
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        long long1 = org.apache.commons.math.util.FastMath.round(1.2738247147297843d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        long long2 = org.apache.commons.math.util.FastMath.max(31L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 31L + "'", long2 == 31L);
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9763608754884531d, 1.189207115002721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6874262672169151d + "'", double2 == 0.6874262672169151d);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.11109916834859056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11087075938446825d + "'", double1 == 0.11087075938446825d);
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8740254132919673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3498819149396504d + "'", double1 == 1.3498819149396504d);
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        double double1 = org.apache.commons.math.util.FastMath.cos(21.487562597358306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8758577137362275d) + "'", double1 == (-0.8758577137362275d));
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        double double2 = org.apache.commons.math.util.FastMath.min(0.027705053070945427d, 4.524244356327113E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.027705053070945427d + "'", double2 == 0.027705053070945427d);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        double double2 = org.apache.commons.math.util.FastMath.min(5.619290194948025E-13d, 1.647369156657704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.619290194948025E-13d + "'", double2 == 5.619290194948025E-13d);
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.7273406689256667d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7273406689256667d + "'", double1 == 1.7273406689256667d);
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.1508598335814295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.6881171418161737E43d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 573, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9207813824870029d, 96.99484522385717d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.99484522385717d + "'", double2 == 96.99484522385717d);
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        double double1 = org.apache.commons.math.util.FastMath.ulp(9.261725192512572E-19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9259299443872359E-34d + "'", double1 == 1.9259299443872359E-34d);
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.04175285837729747d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9949723229224731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        double double1 = org.apache.commons.math.util.FastMath.atanh(2.2529813614778327d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        float float1 = org.apache.commons.math.util.FastMath.abs(35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 35.0f + "'", float1 == 35.0f);
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9092974268256818d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.786480471441939E10d, (-0.3873669366539792d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.786480471441937E10d + "'", double2 == 9.786480471441937E10d);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.7544036781775962d, 1.5707639925974655d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8405693131513021d + "'", double2 == 0.8405693131513021d);
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.43361108619104427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        double double2 = org.apache.commons.math.util.FastMath.max(1.577721810442024E-30d, (-4.8193414259330926E-20d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.577721810442024E-30d + "'", double2 == 1.577721810442024E-30d);
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2105.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2104.9999999999995d) + "'", double1 == (-2104.9999999999995d));
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5968020998202848d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5968020998202846d + "'", double2 == 0.5968020998202846d);
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 9.223372E18f, 0.22882280821594225d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.22882280821594225d + "'", double2 == 0.22882280821594225d);
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 28.031200676839138d + "'", double1 == 28.031200676839138d);
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 4L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        double double1 = org.apache.commons.math.util.FastMath.signum(72.28798294509544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.82679529269723d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.8205576256903795d + "'", double1 == 3.8205576256903795d);
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.5257228523581828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        double double2 = org.apache.commons.math.util.FastMath.pow((-2.0240230476782646d), 45.17197351819585d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.042800856867951736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.470158750205857E-4d) + "'", double1 == (-7.470158750205857E-4d));
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        double double1 = org.apache.commons.math.util.FastMath.asin(13.845300947487887d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 573.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.545750190492393E248d + "'", double1 == 3.545750190492393E248d);
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 97864804714L, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 100.0f + "'", float1 == 100.0f);
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        float float1 = org.apache.commons.math.util.FastMath.abs(22025.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 22025.0f + "'", float1 == 22025.0f);
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.5773024999492183d, (-0.2863121968974662d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1703428488012644d + "'", double2 == 1.1703428488012644d);
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(6283429.00742421d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 184.52940052788836d + "'", double1 == 184.52940052788836d);
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5085304107780737d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.508530410778074d + "'", double1 == 1.508530410778074d);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9033391107665127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4365220340900304d + "'", double1 == 1.4365220340900304d);
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        double double1 = org.apache.commons.math.util.FastMath.acosh(5.267884728309446d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.345643037242276d + "'", double1 == 2.345643037242276d);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 31L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 31.0f + "'", float1 == 31.0f);
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.5473008271869906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49849450465990564d + "'", double1 == 0.49849450465990564d);
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(117.61174253155806d, 1.1593781051128063d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 117.61174253155805d + "'", double2 == 117.61174253155805d);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.7603734074051979d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3032833236333146d + "'", double1 == 1.3032833236333146d);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9330920755982086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.833262585529406d + "'", double1 == 0.833262585529406d);
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 3.9702919135521215d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.8550048170562257d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 38L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2177.239621497128d + "'", double1 == 2177.239621497128d);
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        double double1 = org.apache.commons.math.util.FastMath.log(1.5451146601807795d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4350981213052501d + "'", double1 == 0.4350981213052501d);
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        double double2 = org.apache.commons.math.util.FastMath.max(0.23824322705557036d, 1.9224869535749408E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.23824322705557036d + "'", double2 == 0.23824322705557036d);
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0003841043626869d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5514266812417142d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7357275822226734d + "'", double1 == 1.7357275822226734d);
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.77640662496864d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.77640662496864d + "'", double1 == 2.77640662496864d);
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        double double1 = org.apache.commons.math.util.FastMath.log(4.691649480399091E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 95.95177303495919d + "'", double1 == 95.95177303495919d);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1924023244417262d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2121580997058448d + "'", double1 == 1.2121580997058448d);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9640275800758169d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1204413228389418d + "'", double1 == 1.1204413228389418d);
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0009877980461306d + "'", double1 == 1.0009877980461306d);
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 1L, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5401776706283436E45d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-34.25492718415656d) + "'", double1 == (-34.25492718415656d));
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05483113556160755d + "'", double1 == 0.05483113556160755d);
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9425345992440989d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6639936148097126d + "'", double1 == 0.6639936148097126d);
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.0755196757053205d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2564302995664707d + "'", double1 == 1.2564302995664707d);
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0486237723781806d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        double double1 = org.apache.commons.math.util.FastMath.signum(630983.1159256954d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3108324944320862d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.7092603658226646d + "'", double1 == 3.7092603658226646d);
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        double double2 = org.apache.commons.math.util.FastMath.max(0.964384282367839d, 1.5440680443502757d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5440680443502757d + "'", double2 == 1.5440680443502757d);
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.74532925199433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.3588589435717465d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6984728684912337d + "'", double1 == 0.6984728684912337d);
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.005282073904701802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005282123029073894d + "'", double1 == 0.005282123029073894d);
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.11507828243072993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4554625215028407d + "'", double1 == 1.4554625215028407d);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9986793944976201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5528932480470083d + "'", double1 == 1.5528932480470083d);
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.04746078367186167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04747860345348138d + "'", double1 == 0.04747860345348138d);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6588988415573005d + "'", double1 == 1.6588988415573005d);
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7151743879062039d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.75497889798194d + "'", double1 == 0.75497889798194d);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.019233306345811094d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        double double1 = org.apache.commons.math.util.FastMath.acos(2.9982229502979694d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(2.9369645424212623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.051259701279579704d + "'", double1 == 0.051259701279579704d);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.6153708008103522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3777732767106265d + "'", double1 == 1.3777732767106265d);
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.718281827836512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.544137098079419d + "'", double1 == 7.544137098079419d);
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7085012011516139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7593379915389414d + "'", double1 == 0.7593379915389414d);
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.746594273122733d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3208472334904937d + "'", double1 == 1.3208472334904937d);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        double double2 = org.apache.commons.math.util.FastMath.max(50.69314718055995d, 5.291336409328632d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.69314718055995d + "'", double2 == 50.69314718055995d);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.545750190492393E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1715099723401879d + "'", double1 == 0.1715099723401879d);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0115470718397392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5403023058681398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2673631790022216d) + "'", double1 == (-0.2673631790022216d));
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.424516743121025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9587343982924914d + "'", double1 == 0.9587343982924914d);
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.46549581933118d, 1261966.2318521831d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.688655112807198E-7d + "'", double2 == 3.688655112807198E-7d);
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3333452696210848d, 4.27781241944192d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.333345269621085d + "'", double2 == 1.333345269621085d);
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.3414179241869126d, 7.930067261567154E14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.6674619946174979d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.2427552769663d + "'", double1 == 38.2427552769663d);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        double double1 = org.apache.commons.math.util.FastMath.log(0.4997813562224119d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6935845637532064d) + "'", double1 == (-0.6935845637532064d));
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        int int2 = org.apache.commons.math.util.FastMath.min(32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 1, (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        int int1 = org.apache.commons.math.util.FastMath.round(52.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.4080069217490346d, 3.688655112807198E-7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999996693227694d + "'", double2 == 0.9999996693227694d);
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.4281826694961574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9097218402675803d + "'", double1 == 0.9097218402675803d);
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.8099371976588898d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5551139947717301d) + "'", double1 == (-0.5551139947717301d));
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3418436161673093d, 1.653805147100431d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6816339640127264d + "'", double2 == 0.6816339640127264d);
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.13442541122615329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13524400261494204d + "'", double1 == 0.13524400261494204d);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.1029120896883755d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.618990892446662d, 0.7897794929039231d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6846624340993608d + "'", double2 == 0.6846624340993608d);
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.716348056229995E16d + "'", double1 == 1.716348056229995E16d);
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.1508598335814295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5323425837018869d + "'", double1 == 0.5323425837018869d);
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.13626144010775731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4341096590261957d + "'", double1 == 1.4341096590261957d);
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2855617141854978d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2780447199016436d + "'", double1 == 0.2780447199016436d);
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 573, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        double double1 = org.apache.commons.math.util.FastMath.exp(5.184705528587072E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.00676691929044773d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3877159156483166d + "'", double1 == 0.3877159156483166d);
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3848831882289924d + "'", double1 == 0.3848831882289924d);
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4365220340900304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665129d + "'", double1 == 0.9033391107665129d);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.39704103087032844d, 1.2184249125858764d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.31501331859055964d + "'", double2 == 0.31501331859055964d);
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.11109916834859056d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.954289192030958d) + "'", double1 == (-0.954289192030958d));
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        double double2 = org.apache.commons.math.util.FastMath.max(0.999986049880067d, (-0.3873669366539792d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.999986049880067d + "'", double2 == 0.999986049880067d);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1900628023411102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.435961927627987d + "'", double1 == 0.435961927627987d);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3596375654124956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4328100205340815d + "'", double1 == 1.4328100205340815d);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        double double1 = org.apache.commons.math.util.FastMath.atanh(44.3614195558365d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.047407404488248234d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.048549105685016d + "'", double1 == 1.048549105685016d);
    }
}

