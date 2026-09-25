package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        double double1 = org.apache.commons.math.util.FastMath.cos(8.486449227395259E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999996399009191d + "'", double1 == 0.9999996399009191d);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.04751431940689878d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.047514319406898785d + "'", double1 == 0.047514319406898785d);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        int int2 = org.apache.commons.math.util.FastMath.min(57, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        long long1 = org.apache.commons.math.util.FastMath.round((-1.1562707178680864d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.5663169859928074d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-4.22719058232548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.0d) + "'", double1 == (-4.0d));
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.4201312898382078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9130353976390855d + "'", double1 == 0.9130353976390855d);
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.550386653691239d, 0.33410855904595715d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0252139802155502d + "'", double2 == 1.0252139802155502d);
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.441116808177853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.441116808177853d + "'", double1 == 3.441116808177853d);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        int int2 = org.apache.commons.math.util.FastMath.max((-1), 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.3622179607761546d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3794364550897702d + "'", double1 == 0.3794364550897702d);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        double double2 = org.apache.commons.math.util.FastMath.max(0.49849450465990564d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.49849450465990564d + "'", double2 == 0.49849450465990564d);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7289664090565792d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0497671000301219d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        long long1 = org.apache.commons.math.util.FastMath.abs((-7L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7L + "'", long1 == 7L);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(423.85042430535873d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 20.58762794265912d + "'", double1 == 20.58762794265912d);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.7393910596966158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9119735200364077d + "'", double1 == 0.9119735200364077d);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        double double1 = org.apache.commons.math.util.FastMath.asin((-3.8485011312768047d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.1340335403533977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1340335403533977d + "'", double1 == 1.1340335403533977d);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.713200981319833d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) 145);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.669892813374866d + "'", double1 == 5.669892813374866d);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.5773024999492185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5492647745304893d + "'", double1 == 0.5492647745304893d);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.9993634612486487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5408378252616687d + "'", double1 == 0.5408378252616687d);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.5545225499960602d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5545225499960604d + "'", double1 == 1.5545225499960604d);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0392014991613199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5903479062214871d + "'", double1 == 1.5903479062214871d);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.0034419816264359996d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-6.982599029145449d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12186934340514759d) + "'", double1 == (-0.12186934340514759d));
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.3223164485279285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.33396222328582703d + "'", double1 == 0.33396222328582703d);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 24L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 24.0f + "'", float1 == 24.0f);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.3371802492356763d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32495771818528363d) + "'", double1 == (-0.32495771818528363d));
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.202664356759283E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.5897037861715806E-24d + "'", double1 == 5.5897037861715806E-24d);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        int int2 = org.apache.commons.math.util.FastMath.min(88, (-7));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-7) + "'", int2 == (-7));
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.4359627388413443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.025062277728736922d + "'", double1 == 0.025062277728736922d);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 35, 0.020976545894544365d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.020976545894544365d + "'", double2 == 0.020976545894544365d);
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.4928804097777624E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        long long1 = org.apache.commons.math.util.FastMath.round(0.482336065982447d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.8384749410913358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9402338316629347d + "'", double1 == 0.9402338316629347d);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.3250734611491427d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5447568000938525d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.1268427362473763d, 2.446319123081521d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4316568223804074d + "'", double2 == 0.4316568223804074d);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        double double2 = org.apache.commons.math.util.FastMath.atan2(19.37379252549111d, 0.6360918665423811d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5379755226690903d + "'", double2 == 1.5379755226690903d);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5081364827100966d) + "'", double1 == (-0.5081364827100966d));
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.5901750099221728d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.625036939225101d + "'", double1 == 0.625036939225101d);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5000715031063323d + "'", double1 == 1.5000715031063323d);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9962287607713785d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.08098004356058036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0808917956833961d + "'", double1 == 0.0808917956833961d);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3889399778217377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.010596477735979d + "'", double1 == 4.010596477735979d);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8813715433348934d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.12627601285118364d) + "'", double1 == (-0.12627601285118364d));
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5604874136486533d, 0.7255801160921299d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.1355631713990526d + "'", double2 == 1.1355631713990526d);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.406385048295506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4063850482955063d + "'", double1 == 1.4063850482955063d);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.38542049584402066d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3260037006675865d + "'", double1 == 0.3260037006675865d);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.9640275800758169d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9878624697502397d) + "'", double1 == (-0.9878624697502397d));
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.7310973244101043d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6676869314052953d + "'", double1 == 0.6676869314052953d);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        int int2 = org.apache.commons.math.util.FastMath.min(2, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 2105, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.3223164485279285d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2426208133067402d + "'", double1 == 1.2426208133067402d);
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        double double1 = org.apache.commons.math.util.FastMath.signum(27.788944546524185d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        double double2 = org.apache.commons.math.util.FastMath.max(2.7807376231348977d, 1.6098214429508984d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.7807376231348977d + "'", double2 == 2.7807376231348977d);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.35540497015967E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        float float2 = org.apache.commons.math.util.FastMath.min(18.0f, (float) 14L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 14.0f + "'", float2 == 14.0f);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.6566128730773926E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.6566128730773926E-10d + "'", double1 == 4.6566128730773926E-10d);
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        double double1 = org.apache.commons.math.util.FastMath.sin(25.535789562407242d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3922242299157646d + "'", double1 == 0.3922242299157646d);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.6603469013500041d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7212806105189438d) + "'", double1 == (-0.7212806105189438d));
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        int int2 = org.apache.commons.math.util.FastMath.max(1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        double double1 = org.apache.commons.math.util.FastMath.sinh(2.191510382551503d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.418485531230978d + "'", double1 == 4.418485531230978d);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.69609469362245d, 4.988689301930058E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.6960946936224506d + "'", double2 == 2.6960946936224506d);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        int int2 = org.apache.commons.math.util.FastMath.max(2147483647, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(6060.800489722827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 77.85114314974975d + "'", double1 == 77.85114314974975d);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        double double1 = org.apache.commons.math.util.FastMath.tanh(2.9624960684073707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9946705819037911d + "'", double1 == 0.9946705819037911d);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        int int2 = org.apache.commons.math.util.FastMath.max(2, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        double double1 = org.apache.commons.math.util.FastMath.atanh(4.764651313204946d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5171403224431976d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 18.619354389721313d + "'", double1 == 18.619354389721313d);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.1685366493835512d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(8.296722144923343d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.296722144923345d + "'", double1 == 8.296722144923345d);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.9702957262762539d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0973239967239925d) + "'", double1 == (-2.0973239967239925d));
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.878936673309907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.878936673309907d + "'", double1 == 0.878936673309907d);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9999999999837876d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1752011936187845d + "'", double1 == 1.1752011936187845d);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 44L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 44.0f + "'", float1 == 44.0f);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.5025477840930719d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026224406000968984d + "'", double1 == 0.026224406000968984d);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        double double1 = org.apache.commons.math.util.FastMath.atan(416.60399367417324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5683959703542163d + "'", double1 == 1.5683959703542163d);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        float float2 = org.apache.commons.math.util.FastMath.min(9.7864802E10f, (-5.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.4435566798304896d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3582501415697792d) + "'", double1 == (-0.3582501415697792d));
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9999999998054523d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.543080634586611d + "'", double1 == 1.543080634586611d);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.14575846667616507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1569167203609059d + "'", double1 == 1.1569167203609059d);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-3.7212497613894784d), 0.6146089504495703d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4071120324867423d) + "'", double2 == (-1.4071120324867423d));
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.17474078431209433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1756424958331345d + "'", double1 == 0.1756424958331345d);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9976952979536658d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.76062454003196d) + "'", double1 == (-0.76062454003196d));
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6865874069331717d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8196150145767829d + "'", double1 == 0.8196150145767829d);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        int int2 = org.apache.commons.math.util.FastMath.min(252318064, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.9503831832192838d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-54.45294531867341d) + "'", double1 == (-54.45294531867341d));
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        double double1 = org.apache.commons.math.util.FastMath.asin(19.34620097980911d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        double double2 = org.apache.commons.math.util.FastMath.max(0.9905499752128979d, 1.2840979642585698E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2840979642585698E43d + "'", double2 == 1.2840979642585698E43d);
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        int int2 = org.apache.commons.math.util.FastMath.max(44, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-15.31878175402805d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-877.7015417878196d) + "'", double1 == (-877.7015417878196d));
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-2.9580097917192205d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        int int2 = org.apache.commons.math.util.FastMath.max(88, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.6752823835417388d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9191066572935884d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7432715394217122d + "'", double1 == 0.7432715394217122d);
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.5220026552323394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.927128473999452d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.120548626573076d + "'", double1 == 53.120548626573076d);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.000127309544797d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.2963685787093853d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 208L, 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        double double2 = org.apache.commons.math.util.FastMath.min(3.1610522125512257d, 0.6931404284793072d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6931404284793072d + "'", double2 == 0.6931404284793072d);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.652982061744741d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7804798859761342d + "'", double1 == 0.7804798859761342d);
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0003841043626869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715691434456423d + "'", double1 == 0.027715691434456423d);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.02604246991365352d, 21.487562596892644d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026042469913653523d + "'", double2 == 0.026042469913653523d);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.378163642308943E12d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 27.951773034959903d + "'", double1 == 27.951773034959903d);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 21.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.000000000000004d + "'", double1 == 21.000000000000004d);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7972957247486472d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        double double2 = org.apache.commons.math.util.FastMath.max(0.05363026241493581d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05363026241493581d + "'", double2 == 0.05363026241493581d);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.7821340737569482d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.942524682253154d + "'", double1 == 4.942524682253154d);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 100, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        int int1 = org.apache.commons.math.util.FastMath.round(2.4051712E9f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.6949885829579836d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        double double1 = org.apache.commons.math.util.FastMath.log(0.0031091414242400395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.773408660281352d) + "'", double1 == (-5.773408660281352d));
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.02724670575710512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02725345025673568d + "'", double1 == 0.02725345025673568d);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.019659775126629562d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001932596035732d + "'", double1 == 1.0001932596035732d);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.3870426100977542d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6221274870135174d + "'", double1 == 0.6221274870135174d);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        float float2 = org.apache.commons.math.util.FastMath.min((-2.0f), 88.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.000000000000564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848082013d + "'", double1 == 0.8414709848082013d);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5998770763750486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.22193773381857146d) + "'", double1 == (-0.22193773381857146d));
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        double double2 = org.apache.commons.math.util.FastMath.max(2.784955363521653E-4d, (-90.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.784955363521653E-4d + "'", double2 == 2.784955363521653E-4d);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        int int2 = org.apache.commons.math.util.FastMath.max((-7), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4127191608141359d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4127191608141359d + "'", double1 == 0.4127191608141359d);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.11499635059167614d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9933952030651205d + "'", double1 == 0.9933952030651205d);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.9751426940447304d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.187622106658978d + "'", double1 == 2.187622106658978d);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.5664687918050895d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8274186954093609d) + "'", double1 == (-0.8274186954093609d));
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9490623602794171d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5379755226690903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5379755226690903d + "'", double1 == 1.5379755226690903d);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.6381195586291716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6381195586291717d + "'", double1 == 0.6381195586291717d);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.806217383918848E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.31819659006534d) + "'", double1 == (-5.31819659006534d));
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        double double2 = org.apache.commons.math.util.FastMath.min(0.009923127595128856d, 84.18243249387379d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.009923127595128856d + "'", double2 == 0.009923127595128856d);
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.8567638683085653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1539819417261585d + "'", double1 == 1.1539819417261585d);
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        double double1 = org.apache.commons.math.util.FastMath.acosh(89.66021682275232d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.189143237539527d + "'", double1 == 5.189143237539527d);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9612633548551068d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 55.07633323378401d + "'", double1 == 55.07633323378401d);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        double double1 = org.apache.commons.math.util.FastMath.floor(6.292146020044726d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.0d + "'", double1 == 6.0d);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 24, (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.2781825699829986d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5274301564975201d + "'", double1 == 0.5274301564975201d);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 18, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.08308215993632734d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.029711413080183918d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((double) 8.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13962634015954636d + "'", double1 == 0.13962634015954636d);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8622926809699383d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.6346446623333779d, 0.982933744815721d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6395885707069434d + "'", double2 == 0.6395885707069434d);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (short) 10, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 3.8205576256903795d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.8205576256903795d + "'", double2 == 3.8205576256903795d);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        long long1 = org.apache.commons.math.util.FastMath.round(0.33926863905287485d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0997245430382514d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.978688344114683d), 0.37357877856082744d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9786883441146829d) + "'", double2 == (-0.9786883441146829d));
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        double double2 = org.apache.commons.math.util.FastMath.max(104.06639041664197d, 0.27401024075282976d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.06639041664197d + "'", double2 == 104.06639041664197d);
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(60.30025405769243d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.7653238218178915d + "'", double1 == 7.7653238218178915d);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.932612730167286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8031791819160604d + "'", double1 == 0.8031791819160604d);
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.03676655317564819d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03677484159688882d + "'", double1 == 0.03677484159688882d);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 7, 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0895609743647756d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.42013128983820774d + "'", double1 == 0.42013128983820774d);
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2286446715540403d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        double double1 = org.apache.commons.math.util.FastMath.ceil(2.38374066418898d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.1282113520070887d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        double double1 = org.apache.commons.math.util.FastMath.abs((double) 35L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.527196701237181E38d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.527196701237181E38d + "'", double1 == 3.527196701237181E38d);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.6168341566328308d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-21.705919018022865d) + "'", double1 == (-21.705919018022865d));
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2863121968974662d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9592918926262646d + "'", double1 == 0.9592918926262646d);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.028393089566237137d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9333289938105209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.203576218989629d + "'", double1 == 1.203576218989629d);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        double double1 = org.apache.commons.math.util.FastMath.log((-1.1642529702120725d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.278583561895402d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 71.1381883290883d + "'", double1 == 71.1381883290883d);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        long long1 = org.apache.commons.math.util.FastMath.round(0.028092407000022617d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        double double1 = org.apache.commons.math.util.FastMath.log(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.01831768737184816d) + "'", double1 == (-0.01831768737184816d));
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.8184602640872807d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        double double1 = org.apache.commons.math.util.FastMath.floor((-1.4091896264064065d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        double double1 = org.apache.commons.math.util.FastMath.atan(2105.1256720540036d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5703212958083588d + "'", double1 == 1.5703212958083588d);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.9393167815174964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7349081916777875d + "'", double1 == 0.7349081916777875d);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        double double1 = org.apache.commons.math.util.FastMath.abs(5.088887490341627E-14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.088887490341627E-14d + "'", double1 == 5.088887490341627E-14d);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.998618223088628d, (-0.6149142306722746d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9986182230886279d + "'", double2 == 0.9986182230886279d);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0232274785475506d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.21511909301433413d + "'", double1 == 0.21511909301433413d);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        double double1 = org.apache.commons.math.util.FastMath.cosh(8.987143540941481d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3999.7869492987206d + "'", double1 == 3999.7869492987206d);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9580038272343695d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.6866383336765949d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.593798539843371d + "'", double1 == 8.593798539843371d);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        long long2 = org.apache.commons.math.util.FastMath.min((-7L), 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.0145842804061052d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9209371342424432d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        double double1 = org.apache.commons.math.util.FastMath.tanh(6.244429828961162d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999924632254483d + "'", double1 == 0.9999924632254483d);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        double double2 = org.apache.commons.math.util.FastMath.min(0.3877159156483166d, 1.7048627526623752d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3877159156483166d + "'", double2 == 0.3877159156483166d);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(2.029647097861444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2661160398544486d + "'", double1 == 1.2661160398544486d);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.605170185988092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        float float2 = org.apache.commons.math.util.FastMath.max(9.7864802E10f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.6432505387589902d), 105.3634469745431d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.16557683034755713d, (-0.47516248865385863d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.8062872218116985d + "'", double2 == 2.8062872218116985d);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1364636663857248d + "'", double1 == 1.1364636663857248d);
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.0674742838818108d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562596892644d + "'", double1 == 21.487562596892644d);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.14436016288910883d, 1.3127266958052475d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.07881050579161687d + "'", double2 == 0.07881050579161687d);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.6994983692632406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7651652504341014d + "'", double1 == 0.7651652504341014d);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.8645505642120598d), 4.702262890231486d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.18182772628144403d) + "'", double2 == (-0.18182772628144403d));
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.2396109578603927d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1508517095110122d + "'", double1 == 1.1508517095110122d);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.49321676688550387d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6375754550500171d + "'", double1 == 0.6375754550500171d);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.0100224164209735d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5922852717866929d + "'", double1 == 1.5922852717866929d);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.12247628949473413d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13029231995428586d + "'", double1 == 0.13029231995428586d);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.7725296756890861d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9175682771846194d + "'", double1 == 0.9175682771846194d);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.39315142536422965d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41552218880545d) + "'", double1 == (-0.41552218880545d));
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.001137172509454239d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011365261738176978d) + "'", double1 == (-0.0011365261738176978d));
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        double double1 = org.apache.commons.math.util.FastMath.atanh(1.9999999999999998d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        long long2 = org.apache.commons.math.util.FastMath.max(18L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.047478595403964284d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.523299875428963d + "'", double1 == 1.523299875428963d);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.1729941422876436d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.005958866902386009d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.005976656267031661d + "'", double1 == 0.005976656267031661d);
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.7733360568141627d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.030950552935740366d) + "'", double1 == (-0.030950552935740366d));
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        double double1 = org.apache.commons.math.util.FastMath.cosh(7.896296018267969E13d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5634006723939925E8d, 1.448317288402091d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.570796317531006d + "'", double2 == 1.570796317531006d);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        double double1 = org.apache.commons.math.util.FastMath.acos(95.95177303495919d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.01199038987880212d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        double double1 = org.apache.commons.math.util.FastMath.sin(2.675640048483193E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6053959687639325d + "'", double1 == 0.6053959687639325d);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        double double1 = org.apache.commons.math.util.FastMath.ulp((double) 31L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.014375482049125378d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.014376472424536655d + "'", double1 == 0.014376472424536655d);
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.0403008077402379E-4d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        double double2 = org.apache.commons.math.util.FastMath.max(5.447149092212036d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447149092212036d + "'", double2 == 5.447149092212036d);
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        float float2 = org.apache.commons.math.util.FastMath.max(44.0f, (float) 252318057L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        double double2 = org.apache.commons.math.util.FastMath.max(1.0410505700010417d, 0.17046147158500932d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0410505700010417d + "'", double2 == 1.0410505700010417d);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        double double1 = org.apache.commons.math.util.FastMath.atan(314.7524207034134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5676192372172209d + "'", double1 == 1.5676192372172209d);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, (-1.233403117511217d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.0206781281751491d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.020678128175149d) + "'", double1 == (-1.020678128175149d));
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.019316795055774244d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019314392800553973d + "'", double1 == 0.019314392800553973d);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        double double2 = org.apache.commons.math.util.FastMath.max(667.1451154336451d, 0.748480575315297d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 667.1451154336451d + "'", double2 == 667.1451154336451d);
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        double double1 = org.apache.commons.math.util.FastMath.rint(1.2150303696947626d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8742049625998478d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.01817173807132448d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.018169738291805432d) + "'", double1 == (-0.018169738291805432d));
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.281452070980398d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5104476392713513d + "'", double1 == 1.5104476392713513d);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145L, 2.52318064E8f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 145.0f + "'", float2 == 145.0f);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.3012986199364707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.160875346119392d + "'", double1 == 1.160875346119392d);
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '#', (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.5817398942542069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.0011281172648607977d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0011281167862954359d + "'", double1 == 0.0011281167862954359d);
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        double double1 = org.apache.commons.math.util.FastMath.abs(3.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        double double1 = org.apache.commons.math.util.FastMath.sinh(5.421010862427522E-20d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5412326235096074d, 0.0069488823192564554d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5579580383440144d + "'", double2 == 1.5579580383440144d);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.6983555819361141d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-1.5077885645823308d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7786009533186128d) + "'", double1 == (-0.7786009533186128d));
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        double double1 = org.apache.commons.math.util.FastMath.ulp((-0.13371050230626771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7755575615628914E-17d + "'", double1 == 2.7755575615628914E-17d);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.6653943626343264d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9803520251444924d + "'", double1 == 0.9803520251444924d);
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1805916207174113E21d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 49.213449819756114d + "'", double1 == 49.213449819756114d);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 145);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 145.0f + "'", float1 == 145.0f);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.16467280670940487d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17900729231931964d + "'", double1 == 0.17900729231931964d);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.6375861597263857d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        long long1 = org.apache.commons.math.util.FastMath.round(0.536211111061281d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        double double1 = org.apache.commons.math.util.FastMath.signum((-88.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        double double1 = org.apache.commons.math.util.FastMath.atan((-0.08479667516930563d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08459430471579181d) + "'", double1 == (-0.08459430471579181d));
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.2346585098971854d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6723323011208732d + "'", double1 == 0.6723323011208732d);
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        double double2 = org.apache.commons.math.util.FastMath.max(3.574187603328559E30d, 0.8673789059065279d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.574187603328559E30d + "'", double2 == 3.574187603328559E30d);
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        long long2 = org.apache.commons.math.util.FastMath.max(22025L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        double double1 = org.apache.commons.math.util.FastMath.expm1(809.0886869668323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.9642258512973702d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.3025072830175306d) + "'", double1 == (-1.3025072830175306d));
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.6725680697682985d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.32582734653607d + "'", double1 == 5.32582734653607d);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        double double2 = org.apache.commons.math.util.FastMath.atan2(6.365513453787659d, 1.565404923404685d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3296616524593337d + "'", double2 == 1.3296616524593337d);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.7216318821397784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0180658101402444d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        double double1 = org.apache.commons.math.util.FastMath.exp((-36.91281425065235d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.310402563396987E-17d + "'", double1 == 9.310402563396987E-17d);
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.8927780093580949d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8927780093580948d) + "'", double1 == (-0.8927780093580948d));
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.7312292784189323d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9545528260480599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9846154720721182d + "'", double1 == 0.9846154720721182d);
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.308604881651137d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.308604881651137d + "'", double1 == 2.308604881651137d);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        int int2 = org.apache.commons.math.util.FastMath.min(3, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.716145454548682d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2180280666000018d + "'", double1 == 1.2180280666000018d);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.1961970956842123d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        double double1 = org.apache.commons.math.util.FastMath.log(1.157938378083989E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-13.66886939431921d) + "'", double1 == (-13.66886939431921d));
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        double double1 = org.apache.commons.math.util.FastMath.floor((-8.271228063367024d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.0d) + "'", double1 == (-9.0d));
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.047514327475808714d, 0.6762038531919243d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.04751432747580872d + "'", double2 == 0.04751432747580872d);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        float float2 = org.apache.commons.math.util.FastMath.max(31.0f, (float) 4L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.33051577000636745d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7185530297404967d + "'", double1 == 0.7185530297404967d);
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.4181620688734913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8892148792331408d + "'", double1 == 0.8892148792331408d);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9L, (float) 70368744177664L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        double double1 = org.apache.commons.math.util.FastMath.log(0.025062277728736922d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.6863914426335023d) + "'", double1 == (-3.6863914426335023d));
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.2636545123256722d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.124123886555958d + "'", double1 == 1.124123886555958d);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        long long1 = org.apache.commons.math.util.FastMath.abs(4L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4L + "'", long1 == 4L);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.000000000000564d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.29577951311464d + "'", double1 == 57.29577951311464d);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        double double1 = org.apache.commons.math.util.FastMath.expm1(21.072099696478684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4174136800067873E9d + "'", double1 == 1.4174136800067873E9d);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.8559934009085187d), 137.34414422946176d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2982333069391765d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022658445665142777d + "'", double1 == 0.022658445665142777d);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.38472079802207915d), 2.1827710060295713d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.3847207980220791d) + "'", double2 == (-0.3847207980220791d));
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.9797056623737544d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.004293621779660161d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.004293621779660162d + "'", double1 == 0.004293621779660162d);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (short) 10, (float) 88);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        double double1 = org.apache.commons.math.util.FastMath.atanh((double) 5.0772058E16f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.1364636663857246d, 0.4694426632156045d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.06189150852923d + "'", double2 == 1.06189150852923d);
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.2021150793344156d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        double double1 = org.apache.commons.math.util.FastMath.rint(19.01315789473684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 19.0d + "'", double1 == 19.0d);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2979L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        double double2 = org.apache.commons.math.util.FastMath.max(3.1358057023023203d, 0.5239029773179922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.1358057023023203d + "'", double2 == 3.1358057023023203d);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        double double2 = org.apache.commons.math.util.FastMath.min(1.2681114372998328d, 7.059718629385893d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2681114372998328d + "'", double2 == 1.2681114372998328d);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.965201390124394d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.877008724326435d + "'", double1 == 2.877008724326435d);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((double) 3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0000000000000004d + "'", double1 == 3.0000000000000004d);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.02347666707911227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3451139406668549d + "'", double1 == 1.3451139406668549d);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (-7), (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7L) + "'", long2 == (-7L));
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3689877298052195d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3689877298052195d + "'", double1 == 1.3689877298052195d);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.9262160379374064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.524936813196082d + "'", double1 == 2.524936813196082d);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.534429040383576d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7064736365174854d + "'", double1 == 0.7064736365174854d);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.543532148561955d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003841043626869d + "'", double1 == 1.0003841043626869d);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.5713646578737349d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.571364657873735d + "'", double1 == 0.571364657873735d);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.7658368273288395d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.11586375326498695d) + "'", double1 == (-0.11586375326498695d));
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.577721810442024E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.0267884501723548d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5348651345724327d) + "'", double1 == (-1.5348651345724327d));
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.8740330636442814E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.874033E7d + "'", double1 == 1.874033E7d);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        double double1 = org.apache.commons.math.util.FastMath.log(5.792613593616171E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-7.453756784379475d) + "'", double1 == (-7.453756784379475d));
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        double double2 = org.apache.commons.math.util.FastMath.pow((-0.023923011433662468d), 0.9694911126077237d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.25650571966039964d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2594052227297022d + "'", double1 == 0.2594052227297022d);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10L, (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.566261269568209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.74016036106049d + "'", double1 == 89.74016036106049d);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0307694028144718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.05873643248951d + "'", double1 == 59.05873643248951d);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.29372720689250503d, (-0.19495746080256454d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.1567675914630158d + "'", double2 == 2.1567675914630158d);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 9, (long) 2147483647);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9L + "'", long2 == 9L);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        float float2 = org.apache.commons.math.util.FastMath.max(18.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        float float2 = org.apache.commons.math.util.FastMath.min((float) (-5L), (float) 9223372036854775807L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-5.0f) + "'", float2 == (-5.0f));
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9820976136448372d, 1.4575070963166896d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5929386606031983d + "'", double2 == 0.5929386606031983d);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 2105);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2105.0f + "'", float1 == 2105.0f);
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.035557078110499d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6864071167338994d + "'", double1 == 1.6864071167338994d);
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        double double2 = org.apache.commons.math.util.FastMath.min(0.05363026241493581d, (-0.7766609160650203d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7766609160650203d) + "'", double2 == (-0.7766609160650203d));
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-1.5470689102278574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1037000053083423d + "'", double1 == 1.1037000053083423d);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        int int2 = org.apache.commons.math.util.FastMath.min(1, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        double double2 = org.apache.commons.math.util.FastMath.min(0.01913492915272034d, 0.6758226352556027d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01913492915272034d + "'", double2 == 0.01913492915272034d);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5542664846177344d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.983314889212798d + "'", double1 == 0.983314889212798d);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.02670066439081122d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.2540574317869379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9679006243045807d + "'", double1 == 0.9679006243045807d);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.4227811167173201d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        double double1 = org.apache.commons.math.util.FastMath.sin(3.688655112807198E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.6886551128071145E-7d + "'", double1 == 3.6886551128071145E-7d);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        long long1 = org.apache.commons.math.util.FastMath.round(1.0115470718392225d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        long long1 = org.apache.commons.math.util.FastMath.round(0.1732412164843911d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.9976537452787457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9992173026375849d + "'", double1 == 0.9992173026375849d);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.2008036112160549d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.18299100867441095d + "'", double1 == 0.18299100867441095d);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.09950371902099903d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3877787807814457E-17d + "'", double1 == 1.3877787807814457E-17d);
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.1346458267562316d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7058523525145073d + "'", double1 == 1.7058523525145073d);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(3.8104768396174693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5619235585330076d + "'", double1 == 1.5619235585330076d);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.07642343372489104d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9333289938105209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        int int2 = org.apache.commons.math.util.FastMath.max(6061, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6061 + "'", int2 == 6061);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        float float2 = org.apache.commons.math.util.FastMath.max(24.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.3875274234338688d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.003594988557117298d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.003595004044379463d + "'", double1 == 0.003595004044379463d);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(96.30685281944005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5517.976204741508d + "'", double1 == 5517.976204741508d);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        double double2 = org.apache.commons.math.util.FastMath.max(57.29577951308232d, (-0.43968383668853217d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.29577951308232d + "'", double2 == 57.29577951308232d);
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.8567638683085653d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8567638683085654d + "'", double1 == 0.8567638683085654d);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        double double1 = org.apache.commons.math.util.FastMath.log(1.140655263641914E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-20.591662947001694d) + "'", double1 == (-20.591662947001694d));
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.402744338107512d, 13.522442286918901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.402744338107514d + "'", double2 == 9.402744338107514d);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        double double1 = org.apache.commons.math.util.FastMath.atan(9.999933450804381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4711270153964662d + "'", double1 == 1.4711270153964662d);
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        double double1 = org.apache.commons.math.util.FastMath.atan((double) 70368744177664L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948823d + "'", double1 == 1.5707963267948823d);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        double double1 = org.apache.commons.math.util.FastMath.rint(3.2576775945507415E26d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.2576775945507415E26d + "'", double1 == 3.2576775945507415E26d);
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.0232758299736455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2114392746431535d + "'", double1 == 1.2114392746431535d);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        double double1 = org.apache.commons.math.util.FastMath.asin((-23.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.025676021633806945d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003296471530856d + "'", double1 == 1.0003296471530856d);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        double double2 = org.apache.commons.math.util.FastMath.min(128.75625059607518d, (-220.50287227348372d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-220.50287227348372d) + "'", double2 == (-220.50287227348372d));
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        int int2 = org.apache.commons.math.util.FastMath.min(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3889399778217377d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1157352635485611d + "'", double1 == 1.1157352635485611d);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.41602402396743615d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41602402396743615d + "'", double1 == 0.41602402396743615d);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        double double1 = org.apache.commons.math.util.FastMath.expm1((-0.0011371729996371193d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0011365266634434722d) + "'", double1 == (-0.0011365266634434722d));
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 38, (float) 23L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 23.0f + "'", float2 == 23.0f);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.0044783897735092d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7304826536348665d + "'", double1 == 1.7304826536348665d);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 44, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.737153155240159d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9078827022238417d + "'", double1 == 0.9078827022238417d);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.039831411921513d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.8541673877839708d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        double double2 = org.apache.commons.math.util.FastMath.min(2.187622106658978d, 0.0026428819590263043d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0026428819590263043d + "'", double2 == 0.0026428819590263043d);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.10915815991542904d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9619437938642785d) + "'", double1 == (-0.9619437938642785d));
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 1, 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.36221796077615454d, (-0.9536075631471675d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.778585770254719d + "'", double2 == 2.778585770254719d);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.9922350436600222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5468199371065791d + "'", double1 == 0.5468199371065791d);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.8267087199189199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7533886729361133d + "'", double1 == 0.7533886729361133d);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.3978952727983707d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.379830211523892d + "'", double1 == 0.379830211523892d);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        long long2 = org.apache.commons.math.util.FastMath.max(35L, 31L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        double double2 = org.apache.commons.math.util.FastMath.min(5.007385037334679E43d, (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        double double1 = org.apache.commons.math.util.FastMath.atanh(7.642595581083531E24d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 4, 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 57L, (float) 3374L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3374.0f + "'", float2 == 3374.0f);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.344535127944533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0485317716214397d + "'", double1 == 2.0485317716214397d);
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-0.015910541093645102d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0159105410936451d) + "'", double1 == (-0.0159105410936451d));
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 44.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        double double1 = org.apache.commons.math.util.FastMath.acos(12.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.9860480246128209d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6861467469080639d + "'", double1 == 0.6861467469080639d);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.255451401301077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0787810324803502d + "'", double1 == 1.0787810324803502d);
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        double double1 = org.apache.commons.math.util.FastMath.log((-0.24512646241203326d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.553033583883514d, 0.1732412164843911d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5327650491555027d + "'", double2 == 1.5327650491555027d);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(4.930380657631324E-32d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8249000307521015E-30d + "'", double1 == 2.8249000307521015E-30d);
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9592918926262646d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7646242034802824d + "'", double1 == 0.7646242034802824d);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.5683959703542163d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        long long1 = org.apache.commons.math.util.FastMath.round(1.1553333796430316d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.9999999999999998d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.411320617819579d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.024632191582232208d + "'", double1 == 0.024632191582232208d);
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.8418176412695313d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.598960759246724d + "'", double1 == 3.598960759246724d);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.1602461970174958d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        float float2 = org.apache.commons.math.util.FastMath.max(21.0f, (float) 2105);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2105.0f + "'", float2 == 2105.0f);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        float float2 = org.apache.commons.math.util.FastMath.max((float) '4', 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-2.641656889827791d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.6416568898277903d) + "'", double1 == (-2.6416568898277903d));
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.13725468110322078d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13682734071841057d + "'", double1 == 0.13682734071841057d);
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7216318821397784d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6179191105708735d + "'", double1 == 0.6179191105708735d);
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        int int2 = org.apache.commons.math.util.FastMath.min(32, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.748066E7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.748066E7d + "'", double1 == 3.748066E7d);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        double double2 = org.apache.commons.math.util.FastMath.max((-44.49939260328992d), 1.3891965034627198d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3891965034627198d + "'", double2 == 1.3891965034627198d);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        double double1 = org.apache.commons.math.util.FastMath.exp((-8.345153194998874d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.375450674044403E-4d + "'", double1 == 2.375450674044403E-4d);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        double double1 = org.apache.commons.math.util.FastMath.cos((-1.8519238076558282d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.27743904429408767d) + "'", double1 == (-0.27743904429408767d));
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.3949588341794583d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02434662458621316d + "'", double1 == 0.02434662458621316d);
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        double double2 = org.apache.commons.math.util.FastMath.min(5.8562864467071635E-9d, (-0.5257228523581828d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5257228523581828d) + "'", double2 == (-0.5257228523581828d));
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        double double2 = org.apache.commons.math.util.FastMath.max((-1.3673250405135535d), 89.99470004710469d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.99470004710469d + "'", double2 == 89.99470004710469d);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.505423913083337d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.48605785025221965d + "'", double1 == 0.48605785025221965d);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9999103740052038d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.2540574317869379d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-3.0874466129197624d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9958465871576268d) + "'", double1 == (-0.9958465871576268d));
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        double double2 = org.apache.commons.math.util.FastMath.min(0.0d, 0.5017166594399687d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.2671930016391912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.29896066870743415d + "'", double1 == 0.29896066870743415d);
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9922350436600222d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 5, 23L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.4230598789337311d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4230598789337311d + "'", double1 == 0.4230598789337311d);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.109585842986132d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994612688509238d + "'", double1 == 0.9994612688509238d);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        float float2 = org.apache.commons.math.util.FastMath.min(2.4051712E9f, 31.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.9007381641682033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7837855463789322d + "'", double1 == 0.7837855463789322d);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6061, (float) 7L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.0069730818226932d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0069730818226934d + "'", double1 == 1.0069730818226934d);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.3276676988791267d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        long long2 = org.apache.commons.math.util.FastMath.max(3374L, 88L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3374L + "'", long2 == 3374L);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 9, (float) 44L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9545528260480599d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.95455282604806d + "'", double1 == 0.95455282604806d);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7806437106503584d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8956951317935471d + "'", double1 == 0.8956951317935471d);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.8431746481004084d, (-0.47129143909477184d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8431746481004083d + "'", double2 == 0.8431746481004083d);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.4181620688734913d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8853111202289007d + "'", double1 == 0.8853111202289007d);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.3026663907504371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3534628613875d + "'", double1 == 1.3534628613875d);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        float float2 = org.apache.commons.math.util.FastMath.max(26.0f, (float) 4);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4.0f + "'", float2 == 4.0f);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        double double1 = org.apache.commons.math.util.FastMath.tanh(3.732511156817248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9988551111734393d + "'", double1 == 0.9988551111734393d);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2416460874631542d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        double double1 = org.apache.commons.math.util.FastMath.ceil(1.922505433236944E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.0863843851210684d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.03598351475629838d + "'", double1 == 0.03598351475629838d);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 70368744177664L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.17682829234729394d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17682829234729394d + "'", double1 == 0.17682829234729394d);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        long long1 = org.apache.commons.math.util.FastMath.round(1.746606636224771d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        long long1 = org.apache.commons.math.util.FastMath.round(3.3580539237745366E-4d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.47612948991158704d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.32227491890514814d) + "'", double1 == (-0.32227491890514814d));
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        double double1 = org.apache.commons.math.util.FastMath.ulp(19.34620097980911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.552713678800501E-15d + "'", double1 == 3.552713678800501E-15d);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.0d, 1.647250949664825d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.13371050230626771d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        double double2 = org.apache.commons.math.util.FastMath.atan2(21.0d, 1.6270758403697987d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.4934710089963412d + "'", double2 == 1.4934710089963412d);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.4419694136099652d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        double double1 = org.apache.commons.math.util.FastMath.ceil((double) 57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 57.0d + "'", double1 == 57.0d);
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        double double1 = org.apache.commons.math.util.FastMath.ceil(13.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 13.0d + "'", double1 == 13.0d);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        double double1 = org.apache.commons.math.util.FastMath.sin((-2104.9999999999995d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.13253102293846056d) + "'", double1 == (-0.13253102293846056d));
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.111770234441798d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        double double1 = org.apache.commons.math.util.FastMath.signum(9.999999999999996d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        double double1 = org.apache.commons.math.util.FastMath.asinh((-0.8488998154697595d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7703989319318401d) + "'", double1 == (-0.7703989319318401d));
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.5777218104420236E-30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.773145071536183d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.6639936148097126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7261471066028697d + "'", double1 == 0.7261471066028697d);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.4350981213052501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6596196792889446d + "'", double1 == 0.6596196792889446d);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        double double1 = org.apache.commons.math.util.FastMath.abs((-35.27243300150086d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.27243300150086d + "'", double1 == 35.27243300150086d);
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.5042358266723017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5042358266723017d + "'", double1 == 1.5042358266723017d);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.5675655160966666d, 2.4917798526449118d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5675655160966668d + "'", double2 == 1.5675655160966668d);
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.6840612239368045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8367075511091291d + "'", double1 == 0.8367075511091291d);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 8L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        double double1 = org.apache.commons.math.util.FastMath.acos((-1.4650188248182272d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(22.326014307562925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.815812502462311d + "'", double1 == 2.815812502462311d);
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1634508.6862359024d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(4.5982145799432725d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08025398413321812d + "'", double1 == 0.08025398413321812d);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6250369392251007d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        double double1 = org.apache.commons.math.util.FastMath.asinh(2.094712547261101d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.485207247472973d + "'", double1 == 1.485207247472973d);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-1.7929422793014347d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5707963267948966d) + "'", double2 == (-1.5707963267948966d));
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        float float2 = org.apache.commons.math.util.FastMath.max(573.0f, (float) 44);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 44.0f + "'", float2 == 44.0f);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.124123886555958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.077519411329338d + "'", double1 == 2.077519411329338d);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 'a', 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(64.00846211951401d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 64.00846211951402d + "'", double1 == 64.00846211951402d);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.7716211363261058d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6478711240834688d + "'", double1 == 0.6478711240834688d);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2369623959457472d, 53.120548626573076d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2369623959457474d + "'", double2 == 1.2369623959457474d);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.003595004044379463d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05995835258226716d + "'", double1 == 0.05995835258226716d);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        float float2 = org.apache.commons.math.util.FastMath.max(0.0f, 88.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 88.0f + "'", float2 == 88.0f);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.999999831367789d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(57.870002544225116d, 0.7678292603100174d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 57.87000254422511d + "'", double2 == 57.87000254422511d);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.9916924449244282d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017308298331083802d + "'", double1 == 0.017308298331083802d);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        double double1 = org.apache.commons.math.util.FastMath.sin((-0.06515518537002861d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.06510909570837217d) + "'", double1 == (-0.06510909570837217d));
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        double double1 = org.apache.commons.math.util.FastMath.log10(6.798196712620037d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8323937271739859d + "'", double1 == 0.8323937271739859d);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 32, (float) (-7L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-7.0f) + "'", float2 == (-7.0f));
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.6090535823208306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6975110621162716d + "'", double1 == 0.6975110621162716d);
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        double double1 = org.apache.commons.math.util.FastMath.ulp(5.562253565251371d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.881784197001252E-16d + "'", double1 == 8.881784197001252E-16d);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.972550183292928E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.6676869314052953d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2313079121381658d + "'", double1 == 1.2313079121381658d);
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(7.230532568900645E7d, 0.9992204598064889d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.230532568900643E7d + "'", double2 == 7.230532568900643E7d);
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.2966900568644943d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8373830985134536d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5783182634403138d + "'", double1 == 0.5783182634403138d);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        double double2 = org.apache.commons.math.util.FastMath.max((-4920.281738177185d), (-23.84345739187178d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-23.84345739187178d) + "'", double2 == (-23.84345739187178d));
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        double double1 = org.apache.commons.math.util.FastMath.exp(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.0034800731177357003d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15154075835169306d + "'", double1 == 0.15154075835169306d);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        double double1 = org.apache.commons.math.util.FastMath.ceil(23.47295752174863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 24.0d + "'", double1 == 24.0d);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 22025, (float) 70368744177664L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22025.0f + "'", float2 == 22025.0f);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.2584662921392096d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.13524400261494207d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

