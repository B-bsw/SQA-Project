package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(104.06639041664195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 104.06639041664197d + "'", double1 == 104.06639041664197d);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.1687440534368837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8447250802010534d + "'", double1 == 0.8447250802010534d);
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        double double1 = org.apache.commons.math.util.FastMath.tan((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.07657256688026017d) + "'", double1 == (-0.07657256688026017d));
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.8414709825806044d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0749608557100309d) + "'", double1 == (-0.0749608557100309d));
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2224467810154838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.2963685787093853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2699081698724155d + "'", double1 == 1.2699081698724155d);
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.2621221781635565E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.262122178163556E15d + "'", double1 == 2.262122178163556E15d);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4467246575506081d + "'", double1 == 0.4467246575506081d);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        double double2 = org.apache.commons.math.util.FastMath.max(0.16393750213817188d, 2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2104.8636254562957d + "'", double2 == 2104.8636254562957d);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0000000000000837d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        double double1 = org.apache.commons.math.util.FastMath.sinh(4.560229461916166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 47.7974777282436d + "'", double1 == 47.7974777282436d);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        double double2 = org.apache.commons.math.util.FastMath.atan2(32.69314718055994d, 21.072099696478684d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9982677335945611d + "'", double2 == 0.9982677335945611d);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        double double1 = org.apache.commons.math.util.FastMath.signum(36.741374145600744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2.8097847588172544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3375726937940255d + "'", double1 == 1.3375726937940255d);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        double double1 = org.apache.commons.math.util.FastMath.ceil(794.344456722457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 795.0d + "'", double1 == 795.0d);
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7805951733159243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.24769860755486173d) + "'", double1 == (-0.24769860755486173d));
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.2510922586777372d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.25650571966039964d + "'", double1 == 0.25650571966039964d);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5292052776014188d, (-0.19687317393211679d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.9269488944079232d + "'", double2 == 1.9269488944079232d);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.7359704175800968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3978952727983707d + "'", double1 == 2.3978952727983707d);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5887989736417516d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.74532925199433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.2032742454744652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 68.94253586247545d + "'", double1 == 68.94253586247545d);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.6571831014265066E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009494959759213906d + "'", double1 == 0.009494959759213906d);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 31L, (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.031700435335233736d + "'", double1 == 0.031700435335233736d);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-95.13395371691644d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2177.239621497128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.37896035806561d + "'", double1 == 8.37896035806561d);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        double double1 = org.apache.commons.math.util.FastMath.signum(32830.48166099617d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        double double1 = org.apache.commons.math.util.FastMath.rint(4.522227941985666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3265.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3265.0000000000005d + "'", double1 == 3265.0000000000005d);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 38.00000000000001d + "'", double1 == 38.00000000000001d);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8550048170562258d, 1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8550048170562257d + "'", double2 == 0.8550048170562257d);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.25480723471248695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3131479741286372d + "'", double1 == 1.3131479741286372d);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(116.29021260843672d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6662.938381142456d + "'", double1 == 6662.938381142456d);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8079471069956127d, 1.834991508392875E-20d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8079471069956126d + "'", double2 == 0.8079471069956126d);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        double double1 = org.apache.commons.math.util.FastMath.rint(7.091500380984786E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.091500380984786E248d + "'", double1 == 7.091500380984786E248d);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        double double2 = org.apache.commons.math.util.FastMath.min((-4.8193414259330913E-20d), 4.369491427691419d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.8193414259330913E-20d) + "'", double2 == (-4.8193414259330913E-20d));
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        double double2 = org.apache.commons.math.util.FastMath.pow(7.073385839060845E-7d, 50.69314718055995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.65292812185E-312d + "'", double2 == 1.65292812185E-312d);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.6145485553432246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.058530195189512d + "'", double1 == 1.058530195189512d);
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        double double1 = org.apache.commons.math.util.FastMath.ulp(14.741329353331304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        double double2 = org.apache.commons.math.util.FastMath.max(0.29267816394109086d, 0.17814068151824805d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.29267816394109086d + "'", double2 == 0.29267816394109086d);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.0980197632589184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316603012496908d + "'", double1 == 1.0316603012496908d);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.0267884501723548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.675466570140337E-4d) + "'", double1 == (-4.675466570140337E-4d));
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.202664356759283E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.70197740328915E-38d + "'", double1 == 4.70197740328915E-38d);
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6929693744344998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-8.144346427974586d) + "'", double1 == (-8.144346427974586d));
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5707962142597218d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3012986199364707d + "'", double1 == 2.3012986199364707d);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.009291130834171431d, 5.792613593616171E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9972934820117421d + "'", double2 == 0.9972934820117421d);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.2857111204210793d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2781825699829986d + "'", double1 == 0.2781825699829986d);
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5707660601741342d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415039528618016d + "'", double1 == 0.027415039528618016d);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7722726579137131d + "'", double1 == 0.7722726579137131d);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        double double2 = org.apache.commons.math.util.FastMath.max(2.1544346900318834d, 0.9367397952018179d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1544346900318834d + "'", double2 == 2.1544346900318834d);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-5.073519547246666d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        double double1 = org.apache.commons.math.util.FastMath.ulp(4.176903375733162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        double double1 = org.apache.commons.math.util.FastMath.signum((-4.8193414259330913E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        double double1 = org.apache.commons.math.util.FastMath.log(6.798432482299821E248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 572.9577951308233d + "'", double1 == 572.9577951308233d);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5397294065638794d), 50.69314718055995d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5397294065638792d) + "'", double2 == (-0.5397294065638792d));
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.7628286883743736d, (-0.4766393240263169d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.129274398827451d + "'", double2 == 2.129274398827451d);
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16723958605665326d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18203743107264986d + "'", double1 == 0.18203743107264986d);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 22025, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9990920390306268d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.004293621779660161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004293648164526892d + "'", double1 == 0.004293648164526892d);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.5409243178208767d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009440910350078538d + "'", double1 == 0.009440910350078538d);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        long long1 = org.apache.commons.math.util.FastMath.abs(7L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5707639925974655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707639925974655d + "'", double1 == 1.5707639925974655d);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 18L, 573.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        double double1 = org.apache.commons.math.util.FastMath.cos(1108.4556657549201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8645505642120598d) + "'", double1 == (-0.8645505642120598d));
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1373220393635d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1373220393635d + "'", double1 == 1.1373220393635d);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        double double1 = org.apache.commons.math.util.FastMath.log10(7.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8450980400142568d + "'", double1 == 0.8450980400142568d);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5158342259816473d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.028815182787626d + "'", double1 == 1.028815182787626d);
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0821368667394677d + "'", double1 == 1.0821368667394677d);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.9513433746520442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.760468391612327d) + "'", double1 == (-0.760468391612327d));
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        double double1 = org.apache.commons.math.util.FastMath.cosh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8079471069956126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.668456226237483d + "'", double1 == 0.668456226237483d);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6506783754890694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5011863400790127d + "'", double1 == 0.5011863400790127d);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.848501131276805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.848501131276805d + "'", double1 == 3.848501131276805d);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.01576559100617732d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 26L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 26.0f + "'", float1 == 26.0f);
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.8163011534362759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8163011534362759d + "'", double1 == 1.8163011534362759d);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 2147483647, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        long long1 = org.apache.commons.math.util.FastMath.round(0.3837641821656744d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.0026393956876864535d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0026428819590263043d + "'", double1 == 0.0026428819590263043d);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1900628023411102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18780679379795373d + "'", double1 == 0.18780679379795373d);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.31501331859055964d, 0.6651773355037965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.46376691716139407d + "'", double2 == 0.46376691716139407d);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26, (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5282953052207049d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6960386147148705d + "'", double1 == 0.6960386147148705d);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.042827011853929196d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.042813921172854257d) + "'", double1 == (-0.042813921172854257d));
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        double double1 = org.apache.commons.math.util.FastMath.rint((-7.470158750205857E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.19438719642597732d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-11.13756594658902d) + "'", double1 == (-11.13756594658902d));
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        double double1 = org.apache.commons.math.util.FastMath.floor(7.896296018267967E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.8962960182679E13d + "'", double1 == 7.8962960182679E13d);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        double double1 = org.apache.commons.math.util.FastMath.floor(21.48756259689264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.0d + "'", double1 == 21.0d);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.2863121968974662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2863121968974662d + "'", double1 == 0.2863121968974662d);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3827395580671282d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        double double1 = org.apache.commons.math.util.FastMath.signum((-1.2427728858045115d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8571305341625859d), 2.5356779950985695d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8571305341625858d) + "'", double2 == (-0.8571305341625858d));
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        double double1 = org.apache.commons.math.util.FastMath.sin((-1.1029120896883755d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8925244919471541d) + "'", double1 == (-0.8925244919471541d));
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(10.991338187845832d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.991338187845834d + "'", double1 == 10.991338187845834d);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.9465441391652027d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.928898996730949d) + "'", double1 == (-2.928898996730949d));
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.04636973784987636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04633654665509406d + "'", double1 == 0.04633654665509406d);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.7603734074051981d), 0.6189946455347085d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8875368086636076d) + "'", double2 == (-0.8875368086636076d));
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        double double1 = org.apache.commons.math.util.FastMath.tanh(8.442682412167346E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.442682411966751E-6d + "'", double1 == 8.442682411966751E-6d);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.6552377416047082d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01143605597433399d + "'", double1 == 0.01143605597433399d);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.3580540499984855E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.3580539237745366E-4d + "'", double1 == 3.3580539237745366E-4d);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.997417559331972d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6987456384434759d + "'", double1 == 0.6987456384434759d);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.28131747735322093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4593566380802732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9033391107665129d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033391107665129d + "'", double1 == 0.9033391107665129d);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        double double1 = org.apache.commons.math.util.FastMath.abs(14.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 14.0d + "'", double1 == 14.0d);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        long long1 = org.apache.commons.math.util.FastMath.round(0.5230140581531376d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        double double2 = org.apache.commons.math.util.FastMath.max((-0.3053205627843726d), (-0.9545943990414509d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3053205627843726d) + "'", double2 == (-0.3053205627843726d));
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.01790380500454481d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017902848520331135d) + "'", double1 == (-0.017902848520331135d));
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5239029773179922d + "'", double1 == 0.5239029773179922d);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(33.43950032726054d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.439500327260546d + "'", double1 == 33.439500327260546d);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.5901750099221726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.677934571594396d + "'", double1 == 0.677934571594396d);
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.3229163713435177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7589809880912084d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        int int2 = org.apache.commons.math.util.FastMath.max(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        double double2 = org.apache.commons.math.util.FastMath.min(2.675640048483193E7d, 1.058283143422131d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.058283143422131d + "'", double2 == 1.058283143422131d);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.001137172509454239d), (-0.834741096244351d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.834741096244351d) + "'", double2 == (-0.834741096244351d));
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.03479508686079259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03420342340659146d + "'", double1 == 0.03420342340659146d);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9950547536867305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        double double1 = org.apache.commons.math.util.FastMath.cos(99.98991284675513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8571673007021074d + "'", double1 == 0.8571673007021074d);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6571831014265066E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8428599996679606E24d + "'", double1 == 2.8428599996679606E24d);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        double double1 = org.apache.commons.math.util.FastMath.log10((-23.149651841415288d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        double double1 = org.apache.commons.math.util.FastMath.sinh(26.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.786480471441939E10d + "'", double1 == 9.786480471441939E10d);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.5544559615876794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9991371441458284d + "'", double1 == 0.9991371441458284d);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1252750800637434d, 0.3891513396382057d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2378432659522425d + "'", double2 == 1.2378432659522425d);
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.543080634815244d, (-0.0013377555385146109d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5430806348152437d + "'", double2 == 1.5430806348152437d);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        double double1 = org.apache.commons.math.util.FastMath.log1p(181.18516357615334d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.205023552180745d + "'", double1 == 5.205023552180745d);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.3414179241869126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005958866902386009d + "'", double1 == 0.005958866902386009d);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.819513221744016d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0706683905894867d + "'", double1 == 1.0706683905894867d);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.9369645424212623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9369645424212627d + "'", double1 == 2.9369645424212627d);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.5707963267936307d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2533141373149952d + "'", double1 == 1.2533141373149952d);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        double double2 = org.apache.commons.math.util.FastMath.min(1.834991508392875E-20d, 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.834991508392875E-20d + "'", double2 == 1.834991508392875E-20d);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.15154642678291888d), 0.17410381825958643d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.15154642678291888d) + "'", double2 == (-0.15154642678291888d));
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        long long2 = org.apache.commons.math.util.FastMath.min(1L, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.2781825699829986d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.1084164823547447E8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5425210.214035052d + "'", double1 == 5425210.214035052d);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707956194563126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1413750.10869755d + "'", double1 == 1413750.10869755d);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        double double1 = org.apache.commons.math.util.FastMath.ceil(117.61174253155805d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 118.0d + "'", double1 == 118.0d);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        double double1 = org.apache.commons.math.util.FastMath.acosh(11.082762530298217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0964965415327947d + "'", double1 == 3.0964965415327947d);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        double double2 = org.apache.commons.math.util.FastMath.max(0.28773980323653275d, 0.037610840448247515d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.28773980323653275d + "'", double2 == 0.28773980323653275d);
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.00859249933957278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.8306408778607839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8306408778607839d + "'", double1 == 0.8306408778607839d);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.13626144010775731d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.221555141999398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        double double2 = org.apache.commons.math.util.FastMath.min(3.0034306568216736E25d, 1.1530632246059498d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1530632246059498d + "'", double2 == 1.1530632246059498d);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.8240833297627779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014382967415158656d) + "'", double1 == (-0.014382967415158656d));
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        double double1 = org.apache.commons.math.util.FastMath.signum(1261966.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02604246991365352d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02604835893450624d + "'", double1 == 0.02604835893450624d);
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        long long2 = org.apache.commons.math.util.FastMath.min(22025L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.003142877647074027d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003142877647074027d + "'", double1 == 0.003142877647074027d);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.22309009934914975d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22690570903791685d) + "'", double1 == (-0.22690570903791685d));
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3010525128752803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5486825246672982d + "'", double1 == 0.5486825246672982d);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.3428141018704651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 76.93758070782783d + "'", double1 == 76.93758070782783d);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.17058116794162126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0145842804061052d + "'", double1 == 1.0145842804061052d);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.09867546503898518d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9951355252760118d + "'", double1 == 0.9951355252760118d);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.129274398827451d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5298961219858488d) + "'", double1 == (-0.5298961219858488d));
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6552377416047083d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.3922026785961111d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        double double2 = org.apache.commons.math.util.FastMath.atan2((double) 57L, (-0.8582226493088282d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5858517268878107d + "'", double2 == 1.5858517268878107d);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.17058116794162126d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8431746481004084d + "'", double1 == 0.8431746481004084d);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7869.239805184218d + "'", double1 == 7869.239805184218d);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.14336970329182389d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.10612853218660119d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        long long1 = org.apache.commons.math.util.FastMath.round(2.5231805679783186E8d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 252318057L + "'", long1 == 252318057L);
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.49546634624061675d, 1.2439775726559248d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4174499913463825d + "'", double2 == 0.4174499913463825d);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9251475365964139d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.623619432322562d) + "'", double1 == (-1.623619432322562d));
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-4.9E-324d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.6153708008103522d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.672285132493046d + "'", double1 == 13.672285132493046d);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7806737720297888d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 44.72931231386507d + "'", double1 == 44.72931231386507d);
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.378163642309E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9987070939021215d + "'", double1 == 0.9987070939021215d);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        double double1 = org.apache.commons.math.util.FastMath.log(1.180231032234882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571020934276792d + "'", double1 == 0.16571020934276792d);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.7367720489214966d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        float float2 = org.apache.commons.math.util.FastMath.max(573.0f, 22025.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(18.964889726830815d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1086.6081402784184d + "'", double1 == 1086.6081402784184d);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.518074431338224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 86.97925790240271d + "'", double1 == 86.97925790240271d);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        double double1 = org.apache.commons.math.util.FastMath.asin(1123.372703893139d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.8645505642120598d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8645505642120598d + "'", double1 == 0.8645505642120598d);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        double double1 = org.apache.commons.math.util.FastMath.ceil(4.810477380965351d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(3.26982946871976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 187.34742828514646d + "'", double1 == 187.34742828514646d);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.02320741180622532d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023209495501244227d + "'", double1 == 0.023209495501244227d);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8868714057877692d) + "'", double1 == (-0.8868714057877692d));
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8977914424923646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4607153415706695d + "'", double1 == 1.4607153415706695d);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.24600640679997673d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.24116097005287826d + "'", double1 == 0.24116097005287826d);
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        double double1 = org.apache.commons.math.util.FastMath.sinh(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.948148009134034E13d + "'", double1 == 3.948148009134034E13d);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.344569741801254E-5d + "'", double1 == 2.344569741801254E-5d);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.753448040579679d + "'", double1 == 0.753448040579679d);
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        long long2 = org.apache.commons.math.util.FastMath.min((-1L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.5005983596580951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1279379694981986d + "'", double1 == 1.1279379694981986d);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        double double1 = org.apache.commons.math.util.FastMath.log(3.1358057023023203d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1428861433947315d + "'", double1 == 1.1428861433947315d);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        double double2 = org.apache.commons.math.util.FastMath.pow((double) 2147483647, (double) 18L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.434905982971384E167d + "'", double2 == 9.434905982971384E167d);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5763404979381906d) + "'", double1 == (-0.5763404979381906d));
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        double double1 = org.apache.commons.math.util.FastMath.log((-2.2679048611920414d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9279056024825724d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1887551908513183d + "'", double1 == 1.1887551908513183d);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 1L, (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0706683905894867d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 26.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5323537367737086d + "'", double1 == 1.5323537367737086d);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.037623954904806E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        double double1 = org.apache.commons.math.util.FastMath.tan((-2.314789730112624E-25d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.314789730112624E-25d) + "'", double1 == (-2.314789730112624E-25d));
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        double double2 = org.apache.commons.math.util.FastMath.min(573.0d, 0.16571020934276792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16571020934276792d + "'", double2 == 0.16571020934276792d);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(5.509815340662585E104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.198083698874328E34d + "'", double1 == 8.198083698874328E34d);
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 31L, (float) (-2L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 52, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.046385953977476656d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.046385953977476656d + "'", double1 == 0.046385953977476656d);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        double double1 = org.apache.commons.math.util.FastMath.asin((-6.053272382792571d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.0033681671050402474d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003368179841877693d + "'", double1 == 0.003368179841877693d);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        double double2 = org.apache.commons.math.util.FastMath.atan2(16.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.137917206686937d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        double double1 = org.apache.commons.math.util.FastMath.expm1(99.30685281944007d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080844E43d + "'", double1 == 1.3440585709080844E43d);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.644250144850967d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.91281425065235d) + "'", double1 == (-36.91281425065235d));
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        long long2 = org.apache.commons.math.util.FastMath.max(57L, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2147483647L + "'", long2 == 2147483647L);
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.18838862103418863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2073026073820456d + "'", double1 == 0.2073026073820456d);
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        double double2 = org.apache.commons.math.util.FastMath.min(44.3614195558365d, 0.046385953977476656d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.046385953977476656d + "'", double2 == 0.046385953977476656d);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6342323330682557d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        double double1 = org.apache.commons.math.util.FastMath.cos(76.93224517135305d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03676655317564819d + "'", double1 == 0.03676655317564819d);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.08106152637093929d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003287284992087d + "'", double1 == 1.003287284992087d);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        float float2 = org.apache.commons.math.util.FastMath.min(97.0f, (float) 573);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.16883863257866716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17046147158500932d + "'", double1 == 0.17046147158500932d);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.10438442262469091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.981364306629734d) + "'", double1 == (-0.981364306629734d));
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.7370529091738743d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999999997709829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.841470984684158d + "'", double1 == 0.841470984684158d);
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.092046153706293E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0920461537065214E-7d + "'", double1 == 4.0920461537065214E-7d);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8390715290764524d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.027708598556821545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027708598556821548d + "'", double1 == 0.027708598556821548d);
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.008592287884538353d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.008592287884538355d + "'", double1 == 0.008592287884538355d);
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 'a', 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.0964965415327947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        double double1 = org.apache.commons.math.util.FastMath.exp(2.5328331098188576E-12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000025329d + "'", double1 == 1.0000000000025329d);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.9007381641682033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4614193723085869d + "'", double1 == 1.4614193723085869d);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.404037645323065d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.8418176412695313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8414709848078965d) + "'", double1 == (-0.8414709848078965d));
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.816301153436276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9932228457120744d + "'", double1 == 2.9932228457120744d);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26, (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9097218402675803d, 1.153068686219429d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9097218402675803d + "'", double2 == 0.9097218402675803d);
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, (-0.9503831832192838d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 57);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.1530632246059498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7417751600726001d + "'", double1 == 1.7417751600726001d);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        long long1 = org.apache.commons.math.util.FastMath.round(5.298342365610589d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5L + "'", long1 == 5L);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.11507828243072993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1219612639891907d + "'", double1 == 1.1219612639891907d);
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(3.8212977905417654E24d, 5.8562864467071635E-9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.821297790541765E24d + "'", double2 == 3.821297790541765E24d);
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.7219067166708869d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6180889778224288d) + "'", double1 == (-0.6180889778224288d));
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        double double2 = org.apache.commons.math.util.FastMath.pow(3.355437224494686E-7d, 184.52940052788836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.050000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.37661497259666377d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.07176165277035d + "'", double1 == 1.07176165277035d);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.274123996952347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.037807848611429d + "'", double1 == 1.037807848611429d);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        long long1 = org.apache.commons.math.util.FastMath.round(6060.800489722827d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6061L + "'", long1 == 6061L);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.999986049880067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5430642407677928d + "'", double1 == 1.5430642407677928d);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.6651773355037965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5099316255709411d + "'", double1 == 0.5099316255709411d);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (-2L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.4436354751788103d) + "'", double1 == (-1.4436354751788103d));
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.467699925813914d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.4363390260750379d) + "'", double1 == (-0.4363390260750379d));
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        double double1 = org.apache.commons.math.util.FastMath.log(0.057070660313307785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.8634651242655194d) + "'", double1 == (-2.8634651242655194d));
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        long long2 = org.apache.commons.math.util.FastMath.max(26L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(3.14147577836676d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1414757783667606d + "'", double1 == 3.1414757783667606d);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5017009167919776d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.9201875472177408d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9201875472177408d + "'", double1 == 0.9201875472177408d);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.5982145799432725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 263.4582887262702d + "'", double1 == 263.4582887262702d);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-36.736800569677094d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.16724814964758392d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1688252160466497d + "'", double1 == 0.1688252160466497d);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.1569245455535437d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0497881796611646d + "'", double1 == 1.0497881796611646d);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.33410855904595715d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3341085590459572d + "'", double1 == 0.3341085590459572d);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.473695319958728d, 2.71827069403746d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4967920654246698d + "'", double2 == 0.4967920654246698d);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        double double1 = org.apache.commons.math.util.FastMath.exp(2104.8636254562957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        float float1 = org.apache.commons.math.util.FastMath.abs(97.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97.0f + "'", float1 == 97.0f);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 1, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-0.12311456005264212d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0021487544300628886d) + "'", double1 == (-0.0021487544300628886d));
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.735436873328441d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.1544346900318834d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4677992676220695d + "'", double1 == 1.4677992676220695d);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8977366876079912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4561916900643846d + "'", double1 == 0.4561916900643846d);
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) 38);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 38L + "'", long1 == 38L);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.1205702641807171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        double double1 = org.apache.commons.math.util.FastMath.atan(3.948148009133979E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948712d + "'", double1 == 1.5707963267948712d);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.015705630273145536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.8039446305066866d) + "'", double1 == (-1.8039446305066866d));
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.015956618915170855d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.8550048170562257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.707392452065701d + "'", double1 == 0.707392452065701d);
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.8562864467071635E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0221148043495943E-10d + "'", double1 == 1.0221148043495943E-10d);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 10, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.9932228457120744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 22025);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.23824322705557036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2338357190760914d + "'", double1 == 0.2338357190760914d);
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        double double1 = org.apache.commons.math.util.FastMath.tan(15.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8559934009085187d) + "'", double1 == (-0.8559934009085187d));
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.6098494453571868d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        double double1 = org.apache.commons.math.util.FastMath.log1p(2005.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.603897968521881d + "'", double1 == 7.603897968521881d);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        int int2 = org.apache.commons.math.util.FastMath.min((-1), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9142469191379081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0896545917828711d) + "'", double1 == (-0.0896545917828711d));
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.037623954904807E-44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.037623954904807E-44d + "'", double1 == 8.037623954904807E-44d);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9330920755982086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 97, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        double double1 = org.apache.commons.math.util.FastMath.cos(2.2919043892128164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.660217314678067d) + "'", double1 == (-0.660217314678067d));
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.9484831895170822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-111.63986321151813d) + "'", double1 == (-111.63986321151813d));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4711276743037347d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.2378432659522425d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, 3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.3854204958440206d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.082967749701865d + "'", double1 == 22.082967749701865d);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        double double1 = org.apache.commons.math.util.FastMath.log(7.700888353141813E44d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 103.35507978448088d + "'", double1 == 103.35507978448088d);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.7359704175800968d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.613248695272591d, (-0.5763404979381906d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.325178437245552d + "'", double2 == 2.325178437245552d);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.1811276859692623d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4350592808603415d + "'", double1 == 2.4350592808603415d);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        double double2 = org.apache.commons.math.util.FastMath.min(2.328306436538697E-10d, 0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.328306436538697E-10d + "'", double2 == 2.328306436538697E-10d);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        long long1 = org.apache.commons.math.util.FastMath.abs(44L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 44L + "'", long1 == 44L);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.560229461916166d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 100, (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.7175057781016483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2567610122556662E-9d, 0.4947180585964329d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2567610122556662E-9d + "'", double2 == 1.2567610122556662E-9d);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        float float2 = org.apache.commons.math.util.FastMath.max((-1.0f), (float) 22025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        double double1 = org.apache.commons.math.util.FastMath.sin(5.824846554803807E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.824846225420026E-4d + "'", double1 == 5.824846225420026E-4d);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.424516743121025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14575846667616507d + "'", double1 == 0.14575846667616507d);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(16.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 916.7324722093172d + "'", double1 == 916.7324722093172d);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.7675283643313484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8451379033353027d + "'", double1 == 0.8451379033353027d);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        double double1 = org.apache.commons.math.util.FastMath.rint((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.6522336740340915d + "'", double1 == 5.6522336740340915d);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.4467246575506081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        double double1 = org.apache.commons.math.util.FastMath.acosh(28.031200676839138d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.026147060205699d + "'", double1 == 4.026147060205699d);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8997923511366261d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711276743037347d + "'", double1 == 1.4711276743037347d);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0995037190209988d, 0.01661243639878233d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9623912578794126d + "'", double2 == 0.9623912578794126d);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        double double1 = org.apache.commons.math.util.FastMath.log1p(14.389377026852705d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.733677467944594d + "'", double1 == 2.733677467944594d);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        double double1 = org.apache.commons.math.util.FastMath.asin(5.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(220.50287227348372d, 1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 220.5028722734837d + "'", double2 == 220.5028722734837d);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        double double1 = org.apache.commons.math.util.FastMath.sinh((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6268604078470186d) + "'", double1 == (-3.6268604078470186d));
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.7811284620871498d), 0.12186934340514759d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7811284620871498d) + "'", double2 == (-0.7811284620871498d));
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        long long1 = org.apache.commons.math.util.FastMath.round((-2.185039863261519d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2L) + "'", long1 == (-2L));
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        double double1 = org.apache.commons.math.util.FastMath.log((double) 22025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.999933450804381d + "'", double1 == 9.999933450804381d);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        double double2 = org.apache.commons.math.util.FastMath.atan2(572.9577951308233d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5680722294658567d + "'", double2 == 1.5680722294658567d);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.11087075938446825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.7755575615628914E-17d, 0.3873669366539792d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.165189640442122E-17d + "'", double2 == 7.165189640442122E-17d);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.0034360783325428643d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.003436071571126802d) + "'", double1 == (-0.003436071571126802d));
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 0.1688252160466497d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        double double1 = org.apache.commons.math.util.FastMath.log(0.02604835893450624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6478005095231385d) + "'", double1 == (-3.6478005095231385d));
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.6398359282348625E68d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 157.76352969722723d + "'", double1 == 157.76352969722723d);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.10438442262469091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.10476604866194007d + "'", double1 == 0.10476604866194007d);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        int int2 = org.apache.commons.math.util.FastMath.max(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        double double1 = org.apache.commons.math.util.FastMath.exp(137.34414422946176d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.44430607342225E59d + "'", double1 == 4.44430607342225E59d);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9974964160775457d, 2.4999999999999996d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9974964160775458d + "'", double2 == 0.9974964160775458d);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.36019649632180123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4336110861910443d + "'", double1 == 1.4336110861910443d);
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int int2 = org.apache.commons.math.util.FastMath.max((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.012835794880153763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000823799461538d + "'", double1 == 1.0000823799461538d);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-1.4070751110264779d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        double double1 = org.apache.commons.math.util.FastMath.log(21.487562596892644d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0674742838818108d + "'", double1 == 3.0674742838818108d);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.3541424281629695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5255815002652741d + "'", double1 == 0.5255815002652741d);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        long long2 = org.apache.commons.math.util.FastMath.min(52L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        double double2 = org.apache.commons.math.util.FastMath.min(1.3333452696210848d, 180.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3333452696210848d + "'", double2 == 1.3333452696210848d);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        int int2 = org.apache.commons.math.util.FastMath.max(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8988587803407233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2572089825833372d + "'", double1 == 1.2572089825833372d);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.5292064628230686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.041577875227763905d + "'", double1 == 0.041577875227763905d);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.4967920654246698d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.643440755033571d + "'", double1 == 1.643440755033571d);
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5680724581504838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8281987638796728d) + "'", double1 == (-0.8281987638796728d));
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        int int2 = org.apache.commons.math.util.FastMath.min(100, 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-2.1589185064977667d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.292445036602649d) + "'", double1 == (-1.292445036602649d));
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.18115285874844744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        double double1 = org.apache.commons.math.util.FastMath.ceil(573.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 573.0d + "'", double1 == 573.0d);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.9484831895170822d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9484831895170822d + "'", double1 == 1.9484831895170822d);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9999959038668202d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414687716506352d + "'", double1 == 0.8414687716506352d);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        double double1 = org.apache.commons.math.util.FastMath.atan(6.163042208289171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4099406642694605d + "'", double1 == 1.4099406642694605d);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        double double2 = org.apache.commons.math.util.FastMath.min(45.17197351819585d, (-1.1952095083615821d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.1952095083615821d) + "'", double2 == (-1.1952095083615821d));
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.29267816394109086d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.448317288402091d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2454561448049524d + "'", double1 == 2.2454561448049524d);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.8097847588172544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.809784758817255d + "'", double1 == 2.809784758817255d);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        double double1 = org.apache.commons.math.util.FastMath.log10(3.0964965415327947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.49087059928372606d + "'", double1 == 0.49087059928372606d);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.1186432080671145d), 0.7831978161372731d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7831978161372731d + "'", double2 == 0.7831978161372731d);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.9951355252760118d, 0.030307499521499394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9998522211029501d + "'", double2 == 0.9998522211029501d);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        double double1 = org.apache.commons.math.util.FastMath.signum(2.1256138592702154d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4515219270969891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5707008595346152d + "'", double1 == 0.5707008595346152d);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.9899924966004454d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8742794798780781d) + "'", double1 == (-0.8742794798780781d));
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int int2 = org.apache.commons.math.util.FastMath.max((int) '4', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.8758577137362275d), (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.8758577137362273d) + "'", double2 == (-0.8758577137362273d));
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-2L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.02772279083371712d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.028110643220979767d + "'", double1 == 0.028110643220979767d);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (short) 100, 57.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.5414384778337854d), 0.9957890945476039d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5414384778337854d) + "'", double2 == (-0.5414384778337854d));
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        double double1 = org.apache.commons.math.util.FastMath.rint((-35.27243300150086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-35.0d) + "'", double1 == (-35.0d));
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        double double2 = org.apache.commons.math.util.FastMath.max(4.27781241944192d, 75.78518007393176d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.78518007393176d + "'", double2 == 75.78518007393176d);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5773024999492183d, 1.4328100205340815d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5773024999492185d + "'", double2 == 0.5773024999492185d);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.43442052080657195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4090089713088122d + "'", double1 == 0.4090089713088122d);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        double double1 = org.apache.commons.math.util.FastMath.asin(180.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        double double1 = org.apache.commons.math.util.FastMath.sin(8.142219984543288E-13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.142219984543288E-13d + "'", double1 == 8.142219984543288E-13d);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.920960112236651d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.8995084834391828d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.4315459888945143d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        long long2 = org.apache.commons.math.util.FastMath.max(31L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.33978118561914555d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005930300425384097d + "'", double1 == 0.005930300425384097d);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.14466555184225383d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14466555184225383d + "'", double1 == 0.14466555184225383d);
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.017477767330207263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.01747865728166002d + "'", double1 == 0.01747865728166002d);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.7646088003705097E-39d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7646088003705097E-39d + "'", double1 == 1.7646088003705097E-39d);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.3217505543966422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        long long1 = org.apache.commons.math.util.FastMath.round(0.7972957247486471d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (byte) 10, (float) 57);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0142047603949278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7571699146056852d + "'", double1 == 1.7571699146056852d);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5645645685050509d, (-1.2427728858045115d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5645645685050507d + "'", double2 == 1.5645645685050507d);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.376727508058575d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4575070963166896d + "'", double1 == 1.4575070963166896d);
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.694903085487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9913622428561392d + "'", double1 == 0.9913622428561392d);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 35, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        long long1 = org.apache.commons.math.util.FastMath.round(2.9386097226368193d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3L + "'", long1 == 3L);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.1474836470000002E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.43321775502441545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.35992209475067005d + "'", double1 == 0.35992209475067005d);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.08510319447875853d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.003623462990636d + "'", double1 == 1.003623462990636d);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.0889074357665707d), 1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000044650487358d + "'", double2 == 1.000044650487358d);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.7644456989950164d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.874325854012688d + "'", double1 == 0.874325854012688d);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.0034360783325428643d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.5030754111237369d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.718403203777176d + "'", double1 == 2.718403203777176d);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.0214659450282346d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.02109732960109633d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        double double1 = org.apache.commons.math.util.FastMath.sinh(3.7092603658226646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.399552596494082d + "'", double1 == 20.399552596494082d);
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.355404407222922E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0069488823192564554d + "'", double1 == 0.0069488823192564554d);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        double double1 = org.apache.commons.math.util.FastMath.asin(14.741328744640542d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8307.888029396936d + "'", double1 == 8307.888029396936d);
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.1602461970174958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1737998214361567d + "'", double1 == 1.1737998214361567d);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.4070751110264779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.02455809351027681d) + "'", double1 == (-0.02455809351027681d));
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.5775492543555664d), (-4.716136598735705d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 97, 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.557407724654815d), 0.5005983596580951d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5574077246548148d) + "'", double2 == (-1.5574077246548148d));
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.813706986510902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7433358671192637d + "'", double1 == 0.7433358671192637d);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1776486171538092d, (-0.37661497259666377d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.37661497259666377d) + "'", double2 == (-0.37661497259666377d));
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        double double1 = org.apache.commons.math.util.FastMath.ulp(2.0173104911493955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.440892098500626E-16d + "'", double1 == 4.440892098500626E-16d);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.12186934340514759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12217123753453288d + "'", double1 == 0.12217123753453288d);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5475826624438378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        double double1 = org.apache.commons.math.util.FastMath.tan(7.896296018268069E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2425230239169618d + "'", double1 == 1.2425230239169618d);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.4182755546463937d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.978995704713228E82d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 82.84379293103548d + "'", double1 == 82.84379293103548d);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int int2 = org.apache.commons.math.util.FastMath.min(145, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.694903085487113d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6949030854871132d + "'", double1 == 1.6949030854871132d);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.117692795479829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019507419306942612d + "'", double1 == 0.019507419306942612d);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7718336803958262d + "'", double1 == 0.7718336803958262d);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9999877116507956d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5573656314890014d + "'", double1 == 1.5573656314890014d);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        double double1 = org.apache.commons.math.util.FastMath.log10((-2.2529813614778327d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.12186934340514759d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.982599029145449d) + "'", double1 == (-6.982599029145449d));
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.35843370322989837d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0649280515435875d + "'", double1 == 1.0649280515435875d);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9440450304036032d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7739894478141198d) + "'", double1 == (-1.7739894478141198d));
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6674572160283838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8169805481334202d + "'", double1 == 0.8169805481334202d);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        double double1 = org.apache.commons.math.util.FastMath.abs(144.99999999999997d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 144.99999999999997d + "'", double1 == 144.99999999999997d);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        double double1 = org.apache.commons.math.util.FastMath.log10((-1.529835379788728d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 334.6589236650981d + "'", double1 == 334.6589236650981d);
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0034800731177357003d + "'", double1 == 0.0034800731177357003d);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5257228523581828d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 57L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9075541030048625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7199562291766795d + "'", double1 == 0.7199562291766795d);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        double double2 = org.apache.commons.math.util.FastMath.max(19.5618061060276d, 198.60867061197567d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.60867061197567d + "'", double2 == 198.60867061197567d);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        double double1 = org.apache.commons.math.util.FastMath.tan(2.328306436538697E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.328306436538697E-10d + "'", double1 == 2.328306436538697E-10d);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.0206781281751491d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017814193939749055d) + "'", double1 == (-0.017814193939749055d));
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.201867548519866d, (double) 18.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0666714566769811d + "'", double2 == 0.0666714566769811d);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        double double1 = org.apache.commons.math.util.FastMath.asin(2.713200981319833d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 100, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.13442541122615329d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4359627388413443d + "'", double1 == 1.4359627388413443d);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        double double1 = org.apache.commons.math.util.FastMath.acosh(15.999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4647579066758625d + "'", double1 == 3.4647579066758625d);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 0, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-4.943508829600679d), 0.7433358671192637d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4215484089964614d) + "'", double2 == (-1.4215484089964614d));
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.6506783754890694d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975744860120546d + "'", double1 == 0.6975744860120546d);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.233403117511217d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.818446459232067d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.5356779950985695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5695141467684478d + "'", double1 == 0.5695141467684478d);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.943682501001078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4181620688734913d + "'", double1 == 1.4181620688734913d);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.4078300410496931d), 0.3596375654124956d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.40783004104969306d) + "'", double2 == (-0.40783004104969306d));
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        double double1 = org.apache.commons.math.util.FastMath.log(0.813706986510902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.20615494521474886d) + "'", double1 == (-0.20615494521474886d));
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        double double1 = org.apache.commons.math.util.FastMath.cosh((-0.07664776923849483d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0029388786388205d + "'", double1 == 1.0029388786388205d);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.019507419306942612d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.117692795479829d + "'", double1 == 1.117692795479829d);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.0000446504873581d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.3848831882289924d, 0.864392833312451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3848831882289925d + "'", double2 == 0.3848831882289925d);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1030238.5625234859d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.8622926809699384d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6105760168731105d + "'", double1 == 2.6105760168731105d);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.5998770763750486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8218948327082145d + "'", double1 == 1.8218948327082145d);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        double double1 = org.apache.commons.math.util.FastMath.cosh(104.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.338311150777212E44d + "'", double1 == 7.338311150777212E44d);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        double double1 = org.apache.commons.math.util.FastMath.log(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.0d + "'", double1 == 97.0d);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.382248583674181E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.382248583674181E-17d + "'", double1 == 3.382248583674181E-17d);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.026036584087129624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5447568000938525d + "'", double1 == 1.5447568000938525d);
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        double double1 = org.apache.commons.math.util.FastMath.tan(52.38248989944038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.6449961687907304d) + "'", double1 == (-1.6449961687907304d));
    }
}

