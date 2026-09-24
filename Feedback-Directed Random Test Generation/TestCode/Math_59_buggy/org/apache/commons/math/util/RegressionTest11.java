package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 10, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 18.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
        double double1 = org.apache.commons.math.util.FastMath.signum((-8.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(1.180231032234882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1802310322348821d + "'", double1 == 1.1802310322348821d);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.3384744041042738d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.037733537220261d + "'", double1 == 2.037733537220261d);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        long long1 = org.apache.commons.math.util.FastMath.round(2.247220505424423d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (-1), (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.613248695272591d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.0024988771868024017d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0024988745861502584d + "'", double1 == 0.0024988745861502584d);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
        double double1 = org.apache.commons.math.util.FastMath.floor((-22.790761408083426d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.0d) + "'", double1 == (-23.0d));
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.9264927456996488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7472606656014572d + "'", double1 == 0.7472606656014572d);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.037623954904807E-44d, (-2.2654676519986654d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.2661802399344254E97d + "'", double2 == 4.2661802399344254E97d);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7675283643313483d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(5.509815340662585E104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.616441887145511E102d + "'", double1 == 9.616441887145511E102d);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7472606656014572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
        double double1 = org.apache.commons.math.util.FastMath.sin(4.6750163915861345d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999301726082793d) + "'", double1 == (-0.999301726082793d));
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1109771831925104d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.019390209761241513d + "'", double1 == 0.019390209761241513d);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.064934783641962d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9994109602857177d + "'", double1 == 0.9994109602857177d);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        long long1 = org.apache.commons.math.util.FastMath.round(2104.863863001364d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2105L + "'", long1 == 2105L);
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.5544559615876794d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.732511156817248d + "'", double1 == 3.732511156817248d);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
        double double1 = org.apache.commons.math.util.FastMath.acosh(1.1171584131235877d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4794572327333977d + "'", double1 == 0.4794572327333977d);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
        double double1 = org.apache.commons.math.util.FastMath.cos(62.802933415151905d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995818558737992d + "'", double1 == 0.9995818558737992d);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.15268415727515278d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15327808949840438d + "'", double1 == 0.15327808949840438d);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
        int int2 = org.apache.commons.math.util.FastMath.min(4, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 2, 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        double double2 = org.apache.commons.math.util.FastMath.max(1.076731389884332d, 0.04174073658303252d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.076731389884332d + "'", double2 == 1.076731389884332d);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
        long long2 = org.apache.commons.math.util.FastMath.min(22025L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.005930300425384097d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.564865991609037d + "'", double1 == 1.564865991609037d);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
        double double1 = org.apache.commons.math.util.FastMath.floor(3.0964965415327947d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.0d + "'", double1 == 3.0d);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4860487273861172d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.45107473510890356d + "'", double1 == 0.45107473510890356d);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.7044288495501951d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(5.248094888236225d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.290872080286506d + "'", double1 == 2.290872080286506d);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.833489212424966E38d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.945371607655668E36d) + "'", double1 == (-4.945371607655668E36d));
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.3053205627843726d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.5611212455169257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.764160044617983d + "'", double1 == 4.764160044617983d);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
        float float2 = org.apache.commons.math.util.FastMath.max(35.0f, (float) 252318057L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.52318064E8f + "'", float2 == 2.52318064E8f);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.2568953489826145d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.841104430236654E-9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.9964228836762624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4861883958752362d + "'", double1 == 1.4861883958752362d);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.8002419211835452d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
        double double2 = org.apache.commons.math.util.FastMath.min(3.26982946871976d, (-2.2679048611920414d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.2679048611920414d) + "'", double2 == (-2.2679048611920414d));
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.16571020934276798d, (-0.004123608553823457d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16571020934276795d + "'", double2 == 0.16571020934276795d);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3494089883469367d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1050481441584241d + "'", double1 == 1.1050481441584241d);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.6639936148097126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8148580335308185d + "'", double1 == 0.8148580335308185d);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.8550048170562257d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5452361990715799d + "'", double1 == 0.5452361990715799d);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.2146848510894035E-8d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.214684851089406E-8d + "'", double1 == 4.214684851089406E-8d);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9991371441458284d, 17.741263221749836d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.05625771078525112d + "'", double2 == 0.05625771078525112d);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.5298961219858488d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
        double double1 = org.apache.commons.math.util.FastMath.cos(1.02809969691994d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5164470423549196d + "'", double1 == 0.5164470423549196d);
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.24769860755486173d), 17.889566311799566d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.24769860755486173d) + "'", double2 == (-0.24769860755486173d));
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.267909768656306d + "'", double1 == 2.267909768656306d);
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5574077246549023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (-7L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.46376691716139407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6810043444511893d + "'", double1 == 0.6810043444511893d);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 0, 97864804714L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-1.4070751110264779d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
        double double1 = org.apache.commons.math.util.FastMath.floor((-23.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-23.0d) + "'", double1 == (-23.0d));
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.010703208866066098d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.010703413224816612d + "'", double1 == 0.010703413224816612d);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
        double double2 = org.apache.commons.math.util.FastMath.max(4.6146685600490525d, 0.6975744860120546d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6146685600490525d + "'", double2 == 4.6146685600490525d);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.10728189713552241d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.47516248865385863d) + "'", double1 == (-0.47516248865385863d));
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
        double double1 = org.apache.commons.math.util.FastMath.ceil(3.1400656231999866d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 100L, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.6414949254120567d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-8.144346427974586d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.999999831367789d) + "'", double1 == (-0.999999831367789d));
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
        float float2 = org.apache.commons.math.util.FastMath.max(100.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
        long long1 = org.apache.commons.math.util.FastMath.abs((long) (-2));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
        double double1 = org.apache.commons.math.util.FastMath.atanh(3.7092603658226646d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.15527491979894661d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(8.142219984546603E-13d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.142219984546602E-13d + "'", double2 == 8.142219984546602E-13d);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.8430650369670094d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        double double1 = org.apache.commons.math.util.FastMath.cos((-9.194268262590603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9735500688063772d) + "'", double1 == (-0.9735500688063772d));
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 3L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9122440868593062d, 0.748636741546022d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8835877589816593d + "'", double2 == 0.8835877589816593d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        double double1 = org.apache.commons.math.util.FastMath.tanh(4.806217383937352E-6d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.806217383900344E-6d + "'", double1 == 4.806217383900344E-6d);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
        double double1 = org.apache.commons.math.util.FastMath.acosh((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.52587890625E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5258789063684237E-5d + "'", double1 == 1.5258789063684237E-5d);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-0.6842868307608122d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1529211698783688d) + "'", double1 == (-1.1529211698783688d));
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        double double1 = org.apache.commons.math.util.FastMath.ceil(8.411337566029088E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        long long2 = org.apache.commons.math.util.FastMath.max(252318057L, (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 252318057L + "'", long2 == 252318057L);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.984807753012208d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5254040795191397d + "'", double1 == 1.5254040795191397d);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(38.45962336030118d, 1.3333452696210848d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 38.45962336030117d + "'", double2 == 38.45962336030117d);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        double double1 = org.apache.commons.math.util.FastMath.asin((-0.3217505543966422d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3275777768846914d) + "'", double1 == (-0.3275777768846914d));
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
        double double1 = org.apache.commons.math.util.FastMath.log(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.3598729022063691d) + "'", double1 == (-0.3598729022063691d));
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.9648525037059907d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
        double double2 = org.apache.commons.math.util.FastMath.max(0.0d, 0.9999999999999999d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999999999999d + "'", double2 == 0.9999999999999999d);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.5054239130833369d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8749693034931421d + "'", double1 == 0.8749693034931421d);
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.9802576824651942d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8673445351016575d + "'", double1 == 0.8673445351016575d);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
        double double1 = org.apache.commons.math.util.FastMath.cos(0.7615941553786771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7237368423548132d + "'", double1 == 0.7237368423548132d);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.5334846105232111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7304003084084857d + "'", double1 == 0.7304003084084857d);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(44.78115991081385d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2565.7714645900714d + "'", double1 == 2565.7714645900714d);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
        int int2 = org.apache.commons.math.util.FastMath.min(0, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) (-7L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.0f + "'", float1 == 7.0f);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
        double double1 = org.apache.commons.math.util.FastMath.log10(4.560229461916166d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6589866960716184d + "'", double1 == 0.6589866960716184d);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        float float2 = org.apache.commons.math.util.FastMath.min((float) ' ', 18.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 18.0f + "'", float2 == 18.0f);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.5407439555097887E-33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5407439555097887E-33d + "'", double1 == 1.5407439555097887E-33d);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.46944266321560457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4537149018123079d + "'", double1 == 0.4537149018123079d);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(9.223372036854778E18d, (double) 9.7864802E10f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.223372036854776E18d + "'", double2 == 9.223372036854776E18d);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 145L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 145.0f + "'", float1 == 145.0f);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.5011863400790127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5478438885653748d + "'", double1 == 0.5478438885653748d);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(2.9982229502979694d, 5.60724027300823E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.99822295029797d + "'", double2 == 2.99822295029797d);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
        int int1 = org.apache.commons.math.util.FastMath.round((float) 2105L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2105 + "'", int1 == 2105);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.2851600114359308E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        double double2 = org.apache.commons.math.util.FastMath.max(0.30260180916397406d, 0.6552377416047083d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6552377416047083d + "'", double2 == 0.6552377416047083d);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.005282098466922115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.2771935070968476d) + "'", double1 == (-2.2771935070968476d));
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        double double2 = org.apache.commons.math.util.FastMath.min((-1.4650188248182272d), 1.028815182787626d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.4650188248182272d) + "'", double2 == (-1.4650188248182272d));
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.0034360715711427674d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9965698249672023d + "'", double1 == 0.9965698249672023d);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.4790553853029686d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4454867810501793d + "'", double1 == 0.4454867810501793d);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        double double1 = org.apache.commons.math.util.FastMath.asinh(0.7876030784130355d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7229585916119629d + "'", double1 == 0.7229585916119629d);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.0679515313825692E-25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.547473508864641E-13d + "'", double1 == 4.547473508864641E-13d);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.154434690031884d, 1.8287400822951458d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8669842514321565d + "'", double2 == 0.8669842514321565d);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.4161468365471424d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6595834124225789d + "'", double1 == 0.6595834124225789d);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        double double1 = org.apache.commons.math.util.FastMath.log10(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6989700043360189d + "'", double1 == 0.6989700043360189d);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-2.2529813614778327d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.8293830829792643d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6801446119583209d + "'", double1 == 0.6801446119583209d);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        double double2 = org.apache.commons.math.util.FastMath.max((-35.0d), 0.029949908321658922d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.029949908321658922d + "'", double2 == 0.029949908321658922d);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.345643037242276d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3702619213552053d + "'", double1 == 0.3702619213552053d);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        double double1 = org.apache.commons.math.util.FastMath.expm1(3.162277660168381d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22.62434292201784d + "'", double1 == 22.62434292201784d);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.015956618915170855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015955264795222576d + "'", double1 == 0.015955264795222576d);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9264927456996488d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9264927456996489d + "'", double1 == 0.9264927456996489d);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
        double double1 = org.apache.commons.math.util.FastMath.acos((double) 97);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.7853952054853407d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9033343321773988d + "'", double1 == 0.9033343321773988d);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-1.7929422793014345d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7929422793014342d) + "'", double1 == (-1.7929422793014342d));
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
        int int2 = org.apache.commons.math.util.FastMath.max(10, 145);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 145 + "'", int2 == 145);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1350720090231239d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.065397582606195d + "'", double1 == 1.065397582606195d);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        double double2 = org.apache.commons.math.util.FastMath.max(1.3277366163928728d, 0.6750559827141311d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3277366163928728d + "'", double2 == 1.3277366163928728d);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
        double double2 = org.apache.commons.math.util.FastMath.min(1.5876803459339235d, 0.9264927456996488d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9264927456996488d + "'", double2 == 0.9264927456996488d);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.13350766661191907d + "'", double1 == 0.13350766661191907d);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.9999999999999998d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) (-2));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 3L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1411200080598672d + "'", double1 == 0.1411200080598672d);
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        long long1 = org.apache.commons.math.util.FastMath.round(21.0d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 21L + "'", long1 == 21L);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.0316603012496908d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8009803642025967d + "'", double1 == 0.8009803642025967d);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
        double double1 = org.apache.commons.math.util.FastMath.acosh(22.46077005725419d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.804421492533036d + "'", double1 == 3.804421492533036d);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.0547920720722763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7201746613556624d + "'", double1 == 0.7201746613556624d);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        double double1 = org.apache.commons.math.util.FastMath.signum(6060.800489722827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.0582831434221311d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 57, (long) 38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 57L + "'", long2 == 57L);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
        int int2 = org.apache.commons.math.util.FastMath.max(3, 22025);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22025 + "'", int2 == 22025);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-2.842859999667966E24d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.9617267167450915E22d) + "'", double1 == (-4.9617267167450915E22d));
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.5071221992618504d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.05596171509638d) + "'", double1 == (-29.05596171509638d));
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.07634906307728516d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.7357275822226734d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.9246629085368494d + "'", double1 == 2.9246629085368494d);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.8784747043354492d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.411320617819579d + "'", double1 == 1.411320617819579d);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.6653943626343264d, 2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6146089504495703d + "'", double2 == 0.6146089504495703d);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        long long1 = org.apache.commons.math.util.FastMath.round((-4.716136598735705d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-5L) + "'", long1 == (-5L));
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.3976568654895484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3976568654895484d + "'", double1 == 0.3976568654895484d);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
        float float2 = org.apache.commons.math.util.FastMath.min(26.0f, (float) 5L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
        double double1 = org.apache.commons.math.util.FastMath.sin(0.04636973784987636d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04635312263426354d + "'", double1 == 0.04635312263426354d);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.9998983798039537d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.1732412164843911d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41622255643392403d + "'", double1 == 0.41622255643392403d);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0000059033229618d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.90330553725532E-6d + "'", double1 == 5.90330553725532E-6d);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        double double2 = org.apache.commons.math.util.FastMath.min(0.408334722591744d, (-3.1214098374803794E-44d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.1214098374803794E-44d) + "'", double2 == (-3.1214098374803794E-44d));
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1584562587899128d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9891033741019186d + "'", double1 == 0.9891033741019186d);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6987456384434759d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8873733262331065d + "'", double1 == 0.8873733262331065d);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(794.344456722457d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45512.58484980906d + "'", double1 == 45512.58484980906d);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        double double2 = org.apache.commons.math.util.FastMath.min(2.331941588598159d, 1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5000715031063323d + "'", double2 == 1.5000715031063323d);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.3686469200204923d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.110274779799159d + "'", double1 == 1.110274779799159d);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9965698249672023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5457199876890706d + "'", double1 == 1.5457199876890706d);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-0.5071221992618504d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5071221992618503d) + "'", double2 == (-0.5071221992618503d));
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.3276676988791268d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.7182818284590449d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.574941524760878d + "'", double1 == 5.574941524760878d);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        long long1 = org.apache.commons.math.util.FastMath.round((double) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.01747865728166002d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017480437429290896d + "'", double1 == 0.017480437429290896d);
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.2110835568321547E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.21108355686176E-5d + "'", double1 == 1.21108355686176E-5d);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.43321775502441545d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.542212008553136d + "'", double1 == 1.542212008553136d);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 9223372036854775807L, (float) 8L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.2261911708835171d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0214010731908018d + "'", double1 == 0.0214010731908018d);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.9262160379374064d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9262160379374065d + "'", double1 == 0.9262160379374065d);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.20615494521474886d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.9344065786069821d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4692606193559588d + "'", double1 == 1.4692606193559588d);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
        double double1 = org.apache.commons.math.util.FastMath.rint(2.3595791268726303d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.025678842914286695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5904245494217928d) + "'", double1 == (-1.5904245494217928d));
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.15527491979894661d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.02604835893450624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        double double1 = org.apache.commons.math.util.FastMath.floor(2.8428599996679606E24d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8428599996679606E24d + "'", double1 == 2.8428599996679606E24d);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        double double1 = org.apache.commons.math.util.FastMath.log(3.4965075614664802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.251764630741022d + "'", double1 == 1.251764630741022d);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
        double double2 = org.apache.commons.math.util.FastMath.pow(6.798432482299822E248d, 3.657733824090901d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 57, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0145502426353863d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5603440460313085d + "'", double1 == 1.5603440460313085d);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        double double2 = org.apache.commons.math.util.FastMath.atan2((-0.5763404979381906d), 44.72931231386507d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0128843609622747d) + "'", double2 == (-0.0128843609622747d));
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.03479508686079259d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.034802108343239824d + "'", double1 == 0.034802108343239824d);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.4341096590261957d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.978790047262867d + "'", double1 == 1.978790047262867d);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.9732324798502845d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(99.98991284675515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.641432760305329d + "'", double1 == 4.641432760305329d);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        long long2 = org.apache.commons.math.util.FastMath.max((-7L), (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2L) + "'", long2 == (-2L));
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        double double1 = org.apache.commons.math.util.FastMath.tan(4.654592440028928d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 17.28280388028889d + "'", double1 == 17.28280388028889d);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 2);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (-2), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        double double1 = org.apache.commons.math.util.FastMath.expm1(2.834202696611004d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 16.01682731613292d + "'", double1 == 16.01682731613292d);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        int int2 = org.apache.commons.math.util.FastMath.min(145, (-2));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2) + "'", int2 == (-2));
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        double double1 = org.apache.commons.math.util.FastMath.signum((double) 21L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
        double double1 = org.apache.commons.math.util.FastMath.log(0.8669842514321565d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.14273446680468305d) + "'", double1 == (-0.14273446680468305d));
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
        double double2 = org.apache.commons.math.util.FastMath.min((-8.144346427974586d), 7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-8.144346427974586d) + "'", double2 == (-8.144346427974586d));
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.2110835568025492E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2110835567729439E-5d + "'", double1 == 1.2110835567729439E-5d);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.2439775726559248d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9470684152084292d + "'", double1 == 0.9470684152084292d);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(3.3553727166518725E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.856230153716194E-9d + "'", double1 == 5.856230153716194E-9d);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.7357658507756508d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7357658507756508d + "'", double1 == 0.7357658507756508d);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
        double double1 = org.apache.commons.math.util.FastMath.cos((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.02298720378970533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.022989228293811562d + "'", double1 == 0.022989228293811562d);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.5707963267948712d, (-0.07657256688026017d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9660121696160564d + "'", double2 == 0.9660121696160564d);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 573, 18L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-1.6571830786712632E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.009494959628835965d) + "'", double1 == (-0.009494959628835965d));
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.5707963267936305d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.02724670575710512d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5611212455169257d + "'", double1 == 1.5611212455169257d);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.5887989736417515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
        double double2 = org.apache.commons.math.util.FastMath.max(2.260882740708347d, 3.14147577836676d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.14147577836676d + "'", double2 == 3.14147577836676d);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
        long long2 = org.apache.commons.math.util.FastMath.max((long) '4', 44L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
        double double1 = org.apache.commons.math.util.FastMath.abs(4.0920461537065214E-7d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0920461537065214E-7d + "'", double1 == 4.0920461537065214E-7d);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9806829901996237d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.19687317393211692d + "'", double1 == 0.19687317393211692d);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.000044650487358d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.017454071817960312d + "'", double1 == 0.017454071817960312d);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.473814720414451d, 1.464573725157382d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3128901297030714d + "'", double2 == 0.3128901297030714d);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.6874262672169151d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.570796326379126d, 0.0016308456897390394d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963263791258d + "'", double2 == 1.5707963263791258d);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        double double2 = org.apache.commons.math.util.FastMath.max(1.5122039064583164d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5122039064583164d + "'", double2 == 1.5122039064583164d);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
        double double1 = org.apache.commons.math.util.FastMath.cosh(4.675016391586134d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 53.62182509529453d + "'", double1 == 53.62182509529453d);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
        double double1 = org.apache.commons.math.util.FastMath.exp(1.3418436161673093d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.826090850019643d + "'", double1 == 3.826090850019643d);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        double double1 = org.apache.commons.math.util.FastMath.floor(4.435597088531952d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
        double double1 = org.apache.commons.math.util.FastMath.log10((-0.8368009637323028d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        double double1 = org.apache.commons.math.util.FastMath.abs((-0.41032129904825876d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.41032129904825876d + "'", double1 == 0.41032129904825876d);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
        double double1 = org.apache.commons.math.util.FastMath.log1p(794.3444567224569d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.678775299712307d + "'", double1 == 6.678775299712307d);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.02347666707911227d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.023472355419337804d + "'", double1 == 0.023472355419337804d);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.015956618846211263d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.784955363521653E-4d + "'", double1 == 2.784955363521653E-4d);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        double double1 = org.apache.commons.math.util.FastMath.asin(794.3444567224569d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.4290881902052651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.535856475922823d + "'", double1 == 0.535856475922823d);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.978790047262867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4341096590261957d + "'", double1 == 1.4341096590261957d);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        double double2 = org.apache.commons.math.util.FastMath.max(0.4794572327333977d, 0.473814720414451d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.4794572327333977d + "'", double2 == 0.4794572327333977d);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.028815182787626d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.3940493875124622d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3748459100034484d + "'", double1 == 0.3748459100034484d);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        double double1 = org.apache.commons.math.util.FastMath.asin(8.479030977575487d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
        double double1 = org.apache.commons.math.util.FastMath.log(2.147483647E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 21.487562596892644d + "'", double1 == 21.487562596892644d);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
        long long2 = org.apache.commons.math.util.FastMath.max((long) (byte) 10, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.978790047262867d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.255451401301077d + "'", double1 == 1.255451401301077d);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        double double1 = org.apache.commons.math.util.FastMath.cosh(2.5249271018183177d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.285024441173896d + "'", double1 == 6.285024441173896d);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.5778020121309203E33d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0772059364683248E16d + "'", double1 == 5.0772059364683248E16d);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-1.6342953050784887d), 0.023271265020779454d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.6342953050784885d) + "'", double2 == (-1.6342953050784885d));
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.03843312210120447d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0007386433516496d + "'", double1 == 1.0007386433516496d);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        float float2 = org.apache.commons.math.util.FastMath.max(38.0f, (float) 3);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.0651551853700286d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
        double double1 = org.apache.commons.math.util.FastMath.log(0.05794871914027507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.848196812283183d) + "'", double1 == (-2.848196812283183d));
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.04633654665509406d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.04633654665509406d + "'", double1 == 0.04633654665509406d);
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        double double1 = org.apache.commons.math.util.FastMath.log10(2.7543545188936296d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44001983849540993d + "'", double1 == 0.44001983849540993d);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 145L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
        double double1 = org.apache.commons.math.util.FastMath.log10(113.83513334440458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.056276320607069d + "'", double1 == 2.056276320607069d);
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
        double double1 = org.apache.commons.math.util.FastMath.exp((-0.5071221992618503d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6022261743924853d + "'", double1 == 0.6022261743924853d);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
        double double1 = org.apache.commons.math.util.FastMath.atan((-1.361853049433758d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9374233164976175d) + "'", double1 == (-0.9374233164976175d));
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        double double2 = org.apache.commons.math.util.FastMath.min((double) 2105L, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.2572089825833372d, 0.47612948991158704d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.257208982583337d + "'", double2 == 1.257208982583337d);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-0.9998542144022069d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.5093497777060075d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.2929838790434248d) + "'", double1 == (-0.2929838790434248d));
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-29.801969570734137d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-29.0d) + "'", double1 == (-29.0d));
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(2.4350592808603415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604676481299897d + "'", double1 == 1.5604676481299897d);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.008592287884538353d, 1.5607966601082315d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.008592287884538355d + "'", double2 == 0.008592287884538355d);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.6840612239368045d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.9163193327076803d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.50123045039397d + "'", double1 == 52.50123045039397d);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
        double double1 = org.apache.commons.math.util.FastMath.sin(1123.372703893139d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9680831371227122d) + "'", double1 == (-0.9680831371227122d));
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        double double1 = org.apache.commons.math.util.FastMath.log(1.0029461466385965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.002941815253766312d + "'", double1 == 0.002941815253766312d);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        double double1 = org.apache.commons.math.util.FastMath.atanh(32.00000000000003d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.3418436161673093d, 0.004293648164526892d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.567596525075122d + "'", double2 == 1.567596525075122d);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
        double double1 = org.apache.commons.math.util.FastMath.acos(4.810321840554628d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.44488600522827d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.44488600522827004d + "'", double1 == 0.44488600522827004d);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
        double double1 = org.apache.commons.math.util.FastMath.acos(5557.395265851666d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        double double1 = org.apache.commons.math.util.FastMath.acos(1.3877787807814457E-17d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(1.0437346740099507d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 59.80159175223299d + "'", double1 == 59.80159175223299d);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.027712143770207958d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027715690889514186d + "'", double1 == 0.027715690889514186d);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
        int int2 = org.apache.commons.math.util.FastMath.max(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
        double double1 = org.apache.commons.math.util.FastMath.log(8.893761324052697d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1853500561148294d + "'", double1 == 2.1853500561148294d);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.5975638469446122d, 1.7377936960093874E-61d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5975638469446121d + "'", double2 == 0.5975638469446121d);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.7182818284590455d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.7182818284590455d + "'", double1 == 2.7182818284590455d);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        double double1 = org.apache.commons.math.util.FastMath.abs(2.4350592808603415d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4350592808603415d + "'", double1 == 2.4350592808603415d);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        double double1 = org.apache.commons.math.util.FastMath.rint(8.289697403667576E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        long long2 = org.apache.commons.math.util.FastMath.min((long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.16648030344294168d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16648030344294168d + "'", double1 == 0.16648030344294168d);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        double double2 = org.apache.commons.math.util.FastMath.pow(1.4142135623730951d, (-0.5775492543555664d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.8185970499987356d + "'", double2 == 0.8185970499987356d);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        double double1 = org.apache.commons.math.util.FastMath.tan(0.9034600343951872d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2691520328233756d + "'", double1 == 1.2691520328233756d);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.9960434131864047d, 0.4515219270969891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.145188644042308d + "'", double2 == 1.145188644042308d);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.025678843658570077d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003297196233993d + "'", double1 == 1.0003297196233993d);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.010703208866066098d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        double double1 = org.apache.commons.math.util.FastMath.tan(3.0034306568216736E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.1562707178680864d) + "'", double1 == (-1.1562707178680864d));
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
        double double1 = org.apache.commons.math.util.FastMath.atan(1.4962149926291224d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9816270680622979d + "'", double1 == 0.9816270680622979d);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(2.5356779950985695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.53567799509857d + "'", double1 == 2.53567799509857d);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        double double2 = org.apache.commons.math.util.FastMath.min(1.1902899496825317d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
        long long2 = org.apache.commons.math.util.FastMath.min((long) (byte) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.047478595403964284d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        double double1 = org.apache.commons.math.util.FastMath.sinh(0.9998342954234115d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1749455142537386d + "'", double1 == 1.1749455142537386d);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
        double double1 = org.apache.commons.math.util.FastMath.abs(8307.888029396936d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8307.888029396936d + "'", double1 == 8307.888029396936d);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.995592469141819E14d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948932d + "'", double1 == 1.5707963267948932d);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 52, 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5011863400790127d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.04582714110102d + "'", double1 == 1.04582714110102d);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        double double1 = org.apache.commons.math.util.FastMath.asin(3.1805546814635168E-15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1805546814635168E-15d + "'", double1 == 3.1805546814635168E-15d);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        double double1 = org.apache.commons.math.util.FastMath.log(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.29969989012090864d) + "'", double1 == (-0.29969989012090864d));
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        double double1 = org.apache.commons.math.util.FastMath.sin((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
        double double2 = org.apache.commons.math.util.FastMath.max(4.0920453164646635E-7d, 0.01570692181693664d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.01570692181693664d + "'", double2 == 0.01570692181693664d);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.16964194266037994d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        double double2 = org.apache.commons.math.util.FastMath.atan2(2.688117141816135E43d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        double double1 = org.apache.commons.math.util.FastMath.toRadians((-1.1339290130681278E-7d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.979079476192864E-9d) + "'", double1 == (-1.979079476192864E-9d));
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
        double double2 = org.apache.commons.math.util.FastMath.min((-0.9998983798039537d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9998983798039537d) + "'", double2 == (-0.9998983798039537d));
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 145, (float) 38L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 38.0f + "'", float2 == 38.0f);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        double double1 = org.apache.commons.math.util.FastMath.asin((-2.0863269013483303d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, 3.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
        int int2 = org.apache.commons.math.util.FastMath.min(145, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
        float float2 = org.apache.commons.math.util.FastMath.max(10.0f, (-2.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.0f) + "'", float2 == (-2.0f));
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.04746078367186167d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
        double double1 = org.apache.commons.math.util.FastMath.signum(1.0029216922179651d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
        double double1 = org.apache.commons.math.util.FastMath.cos((-0.042800856867951736d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9990841831465845d + "'", double1 == 0.9990841831465845d);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.74532925199433d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3211090992020038d + "'", double1 == 1.3211090992020038d);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.0437346740099507d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.05847593957153261d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-4.8193414259330913E-20d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4.8193414259330913E-20d) + "'", double1 == (-4.8193414259330913E-20d));
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(198.60867061197567d, 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.60867061197564d + "'", double2 == 198.60867061197564d);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.11087075938446825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.2857111204210793d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
        double double1 = org.apache.commons.math.util.FastMath.atan(0.16646964819512286d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16495697764438172d + "'", double1 == 0.16495697764438172d);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0547920720722763d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6098214429508984d + "'", double1 == 1.6098214429508984d);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.6588988415573005d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.9818490617583829d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.1908198889222978d + "'", double1 == 0.1908198889222978d);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.19123459503123072d, 0.02895324674269463d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9532328851516084d + "'", double2 == 0.9532328851516084d);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        double double1 = org.apache.commons.math.util.FastMath.atan(7.999470683622238d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.4464331883887016d + "'", double1 == 1.4464331883887016d);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7615941553786771d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 43.63613080502884d + "'", double1 == 43.63613080502884d);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.14436016288910875d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
        double double1 = org.apache.commons.math.util.FastMath.ulp(1.0963506817327155d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        double double1 = org.apache.commons.math.util.FastMath.atanh((-0.4762966926573635d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5181833398210461d) + "'", double1 == (-0.5181833398210461d));
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        long long2 = org.apache.commons.math.util.FastMath.max(8L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.01913492915272034d, (-40.65444981483749d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.102050415563806E69d + "'", double2 == 7.102050415563806E69d);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6305926250944657d, 0.4515219270969891d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6305926250944657d + "'", double2 == 0.6305926250944657d);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145, (float) 97864804714L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.7864802E10f + "'", float2 == 9.7864802E10f);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
        double double1 = org.apache.commons.math.util.FastMath.nextUp(0.4336110861910443d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.4336110861910444d + "'", double1 == 0.4336110861910444d);
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        double double1 = org.apache.commons.math.util.FastMath.tanh((double) 22025L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
        double double1 = org.apache.commons.math.util.FastMath.tanh(1.7544036781775965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9418746580049391d + "'", double1 == 0.9418746580049391d);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.023205328672353965d, 0.49624800899233534d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15449917409448818d + "'", double2 == 0.15449917409448818d);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.7908790493650335d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3293900953243956d + "'", double1 == 1.3293900953243956d);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        double double1 = org.apache.commons.math.util.FastMath.exp(13.672285132493046d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 866558.702472181d + "'", double1 == 866558.702472181d);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
        double double2 = org.apache.commons.math.util.FastMath.pow(2.520586644733795d, 0.9999065754719239d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.520368950567552d + "'", double2 == 2.520368950567552d);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.25109225867773716d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0316896331825138d + "'", double1 == 1.0316896331825138d);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        double double1 = org.apache.commons.math.util.FastMath.log1p(3.9529619711981727d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5999857756436902d + "'", double1 == 1.5999857756436902d);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
        double double1 = org.apache.commons.math.util.FastMath.floor(1.0000000000000073d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.3498819149396504d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3498819149396504d + "'", double1 == 1.3498819149396504d);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        float float2 = org.apache.commons.math.util.FastMath.min(0.0f, (float) 3L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((-4.8193414259330926E-20d), 8.442682412167344E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-4.819341425933092E-20d) + "'", double2 == (-4.819341425933092E-20d));
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
        double double1 = org.apache.commons.math.util.FastMath.asinh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298342365610589d + "'", double1 == 5.298342365610589d);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
        double double1 = org.apache.commons.math.util.FastMath.floor(0.004302852580113831d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
        double double1 = org.apache.commons.math.util.FastMath.asinh(1.1020552221563014d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9517287150164593d + "'", double1 == 0.9517287150164593d);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        double double2 = org.apache.commons.math.util.FastMath.pow(8.142219984546602E-13d, (-0.3111051691882221d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5768.06833196359d + "'", double2 == 5768.06833196359d);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7678292603100174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6953504051162575d + "'", double1 == 0.6953504051162575d);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        long long1 = org.apache.commons.math.util.FastMath.round(0.025684489383558138d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
        double double1 = org.apache.commons.math.util.FastMath.cosh(15.999999999999993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4443055.260253961d + "'", double1 == 4443055.260253961d);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 26L, (float) 2L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
        double double1 = org.apache.commons.math.util.FastMath.asin((double) 573L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        double double1 = org.apache.commons.math.util.FastMath.acos((-0.0013377555385146109d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5721340827324173d + "'", double1 == 1.5721340827324173d);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
        double double1 = org.apache.commons.math.util.FastMath.cosh(1.0221148043495943E-10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.5402647332399915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.716461206378684d + "'", double1 == 0.716461206378684d);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        double double1 = org.apache.commons.math.util.FastMath.tan(1.5707963267936302d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.896513884640342E11d + "'", double1 == 7.896513884640342E11d);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
        long long1 = org.apache.commons.math.util.FastMath.round(1.776356839400252E-15d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
        double double1 = org.apache.commons.math.util.FastMath.log1p((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
        double double1 = org.apache.commons.math.util.FastMath.atan(4.764160044617983d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.363899346513529d + "'", double1 == 1.363899346513529d);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
        float float2 = org.apache.commons.math.util.FastMath.max(9.223372E18f, (float) 57L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 57.0f + "'", float2 == 57.0f);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(4.702262890231486d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1684701727788385d + "'", double1 == 2.1684701727788385d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        double double1 = org.apache.commons.math.util.FastMath.log1p(1.251764630741022d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8117141891585623d + "'", double1 == 0.8117141891585623d);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 6061L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
        double double1 = org.apache.commons.math.util.FastMath.exp(3.202664356759283E-22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
        float float2 = org.apache.commons.math.util.FastMath.max(3.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(0.05224159390358993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.22856420083554188d + "'", double1 == 0.22856420083554188d);
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
        double double2 = org.apache.commons.math.util.FastMath.max(1261967.0d, 0.5413513871676172d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1261967.0d + "'", double2 == 1261967.0d);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        double double1 = org.apache.commons.math.util.FastMath.log10(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.9966529754586305d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-0.004123608553823457d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.00412362024024141d) + "'", double1 == (-0.00412362024024141d));
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.11584792671408882d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.0d, 0.8835877589816593d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
        double double1 = org.apache.commons.math.util.FastMath.atan(99.98991284675515d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5607956513920278d + "'", double1 == 1.5607956513920278d);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 35, (float) 2);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
        int int1 = org.apache.commons.math.util.FastMath.abs(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.8657584620020855d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3158911158571682d + "'", double1 == 1.3158911158571682d);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.31048985231669685d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.31048985231669685d + "'", double1 == 0.31048985231669685d);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
        int int2 = org.apache.commons.math.util.FastMath.min(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
        double double1 = org.apache.commons.math.util.FastMath.sqrt((-0.19687317393211679d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.006766867647289856d, 1.5000715031063323d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0067668676472898565d + "'", double2 == 0.0067668676472898565d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        double double1 = org.apache.commons.math.util.FastMath.cbrt((-0.3873669366539792d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7289664090565792d) + "'", double1 == (-0.7289664090565792d));
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        double double1 = org.apache.commons.math.util.FastMath.nextUp((-36.91281425065235d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-36.912814250652346d) + "'", double1 == (-36.912814250652346d));
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.6589866960716184d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9328327947012864d + "'", double1 == 0.9328327947012864d);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.5255815002652741d, (-0.0013377555385146109d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5733416078768503d + "'", double2 == 1.5733416078768503d);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
        double double1 = org.apache.commons.math.util.FastMath.signum((-0.8240833297627779d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
        double double1 = org.apache.commons.math.util.FastMath.exp(0.8267087199189199d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2857831935745585d + "'", double1 == 2.2857831935745585d);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
        double double1 = org.apache.commons.math.util.FastMath.log1p((-23.149651841415288d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
        double double1 = org.apache.commons.math.util.FastMath.rint(5557.395265851666d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5557.0d + "'", double1 == 5557.0d);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        double double1 = org.apache.commons.math.util.FastMath.ulp(39.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
        double double1 = org.apache.commons.math.util.FastMath.expm1(4.368505610608687E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
        double double1 = org.apache.commons.math.util.FastMath.asin(0.29820130685016655d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.30280766885405475d + "'", double1 == 0.30280766885405475d);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        int int1 = org.apache.commons.math.util.FastMath.round((float) (-2L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2) + "'", int1 == (-2));
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
        double double1 = org.apache.commons.math.util.FastMath.tan((-1.4215484089964614d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-6.650437639661919d) + "'", double1 == (-6.650437639661919d));
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 252318057L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees((-0.760373407405198d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-43.56618709829934d) + "'", double1 == (-43.56618709829934d));
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.263592139934385d + "'", double1 == 6.263592139934385d);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        double double1 = org.apache.commons.math.util.FastMath.signum(0.9007381641682033d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.020573130590485038d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.27401024075282976d + "'", double1 == 0.27401024075282976d);
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.4677992676220695d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16666666666666666d + "'", double1 == 0.16666666666666666d);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.19561370955657775d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        double double1 = org.apache.commons.math.util.FastMath.log1p(10.54930615400752d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.4466253619172305d + "'", double1 == 2.4466253619172305d);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
        double double1 = org.apache.commons.math.util.FastMath.cos((-2.0863269013483303d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.49299653486035117d) + "'", double1 == (-0.49299653486035117d));
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        double double1 = org.apache.commons.math.util.FastMath.cosh(0.09180265859838255d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0042168243360932d + "'", double1 == 1.0042168243360932d);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        long long1 = org.apache.commons.math.util.FastMath.round(5.856230153716194E-9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        long long2 = org.apache.commons.math.util.FastMath.max((-5L), (long) 573);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 573L + "'", long2 == 573L);
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.7972957247486471d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 45.68168005192165d + "'", double1 == 45.68168005192165d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
        double double2 = org.apache.commons.math.util.FastMath.atan2(4.806217383955855E-6d, 2.38374066418898d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.016250113174355E-6d + "'", double2 == 2.016250113174355E-6d);
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
        double double1 = org.apache.commons.math.util.FastMath.cosh(105.3634469745431d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8690202903623525E45d + "'", double1 == 2.8690202903623525E45d);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
        double double1 = org.apache.commons.math.util.FastMath.abs((-1.1529211698783688d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1529211698783688d + "'", double1 == 1.1529211698783688d);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-1.292445036602649d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        double double2 = org.apache.commons.math.util.FastMath.min(172.58048571980692d, 7.717237764496549d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 7.717237764496549d + "'", double2 == 7.717237764496549d);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 10, 22025L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
        long long1 = org.apache.commons.math.util.FastMath.round(0.9944105305785783d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(1.1737998214361567d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.02048667164338245d + "'", double1 == 0.02048667164338245d);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
        long long1 = org.apache.commons.math.util.FastMath.round((-0.7095540048557133d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
        long long2 = org.apache.commons.math.util.FastMath.max(21L, 24L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
        double double1 = org.apache.commons.math.util.FastMath.tanh((-0.9513433746520442d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7403906210677523d) + "'", double1 == (-0.7403906210677523d));
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        double double2 = org.apache.commons.math.util.FastMath.min(0.9999553501771875d, 104.06639041664195d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999553501771875d + "'", double2 == 0.9999553501771875d);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
        double double1 = org.apache.commons.math.util.FastMath.ulp(3.3574902236589466E-4d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.421010862427522E-20d + "'", double1 == 5.421010862427522E-20d);
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
        long long2 = org.apache.commons.math.util.FastMath.max(145L, (long) 38);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 145L + "'", long2 == 145L);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
        double double1 = org.apache.commons.math.util.FastMath.tan((double) (-2.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.185039863261519d + "'", double1 == 2.185039863261519d);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
        double double1 = org.apache.commons.math.util.FastMath.cos(4.440892098500626E-16d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        double double2 = org.apache.commons.math.util.FastMath.max(0.02326916464517103d, 1.2960262299781737d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.2960262299781737d + "'", double2 == 1.2960262299781737d);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
        double double1 = org.apache.commons.math.util.FastMath.log(0.04174073658303252d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-3.1762777305546113d) + "'", double1 == (-3.1762777305546113d));
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
        double double2 = org.apache.commons.math.util.FastMath.max(1.333345269621085d, (-0.0034360850939669095d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.333345269621085d + "'", double2 == 1.333345269621085d);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.5334846105232111d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 30.566416618160495d + "'", double1 == 30.566416618160495d);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.9771057199762778d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9771057199762778d + "'", double1 == 1.9771057199762778d);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        double double2 = org.apache.commons.math.util.FastMath.max(1.6653943626343264d, 1.922505433236944E-5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6653943626343264d + "'", double2 == 1.6653943626343264d);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.8559934009085187d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        double double1 = org.apache.commons.math.util.FastMath.floor((-0.5313592245660101d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
        double double1 = org.apache.commons.math.util.FastMath.asin(1.8002419211835452d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 18L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 18.0f + "'", float1 == 18.0f);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.150076871218412d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0477128967594869d + "'", double1 == 1.0477128967594869d);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
        float float2 = org.apache.commons.math.util.FastMath.max((float) (byte) 1, 7.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.0f + "'", float2 == 7.0f);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.5403140444367246d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9999860498800669d + "'", double1 == 0.9999860498800669d);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        double double1 = org.apache.commons.math.util.FastMath.acos(0.7352096506293136d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.7448204053596359d + "'", double1 == 0.7448204053596359d);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
        double double1 = org.apache.commons.math.util.FastMath.acosh((-0.6180889778224288d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        double double2 = org.apache.commons.math.util.FastMath.max(0.6881824710286039d, 0.5452361990715799d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6881824710286039d + "'", double2 == 0.6881824710286039d);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
        double double1 = org.apache.commons.math.util.FastMath.ceil((-3.843257992499208E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.0d) + "'", double1 == (-0.0d));
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        double double1 = org.apache.commons.math.util.FastMath.log1p(4.27781241944192d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6635116973665676d + "'", double1 == 1.6635116973665676d);
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.4757278705561235d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
        double double1 = org.apache.commons.math.util.FastMath.toRadians(0.7410405809129375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.012933598027822206d + "'", double1 == 0.012933598027822206d);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        double double2 = org.apache.commons.math.util.FastMath.atan2(1.5122039064583164d, 4.5982145799432725d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.3177260465812805d + "'", double2 == 0.3177260465812805d);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        double double1 = org.apache.commons.math.util.FastMath.rint(0.5773024999492183d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
        long long1 = org.apache.commons.math.util.FastMath.round(0.6555421614583431d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
        int int2 = org.apache.commons.math.util.FastMath.max((int) (byte) 0, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
        long long1 = org.apache.commons.math.util.FastMath.round(0.011436055974333992d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(1.2058117586109089E-11d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.2931185359546688E-4d + "'", double1 == 2.2931185359546688E-4d);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        long long2 = org.apache.commons.math.util.FastMath.max(2105L, 573L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
        long long2 = org.apache.commons.math.util.FastMath.max(22025L, (-5L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        double double1 = org.apache.commons.math.util.FastMath.sqrt(1.1530632246059498d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.073807815489322d + "'", double1 == 1.073807815489322d);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
        double double1 = org.apache.commons.math.util.FastMath.sinh((-9.194268262590603d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-4920.281738177185d) + "'", double1 == (-4920.281738177185d));
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
        double double1 = org.apache.commons.math.util.FastMath.tanh(0.1253169546054925d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.12466504278665175d + "'", double1 == 0.12466504278665175d);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
        double double1 = org.apache.commons.math.util.FastMath.atan(2.1746941190129174d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1397939566479853d + "'", double1 == 1.1397939566479853d);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.6507779951543295d, 0.4386368936167206d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6507779951543294d + "'", double2 == 0.6507779951543294d);
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
        double double1 = org.apache.commons.math.util.FastMath.sinh(1.1169110613978732d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3640562262110947d + "'", double1 == 1.3640562262110947d);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
        double double1 = org.apache.commons.math.util.FastMath.atanh(0.015625d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.015626271752052213d + "'", double1 == 0.015626271752052213d);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
        double double1 = org.apache.commons.math.util.FastMath.rint((-0.1056495335997729d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        double double1 = org.apache.commons.math.util.FastMath.cbrt(0.6610060414837631d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8711009277842993d + "'", double1 == 0.8711009277842993d);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
        double double1 = org.apache.commons.math.util.FastMath.sin(1.5999857756436902d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9995740182847914d + "'", double1 == 0.9995740182847914d);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
        long long2 = org.apache.commons.math.util.FastMath.max(97L, 2105L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2105L + "'", long2 == 2105L);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        long long2 = org.apache.commons.math.util.FastMath.min(8L, (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8L + "'", long2 == 8L);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(1.3131479741286372d, 0.0067668676472898565d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.313147974128637d + "'", double2 == 1.313147974128637d);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter((double) 32, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.999999999999996d + "'", double2 == 31.999999999999996d);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.2265357086400204d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.08868019652085424d + "'", double1 == 0.08868019652085424d);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        double double1 = org.apache.commons.math.util.FastMath.tan(6.614415338769718E71d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.35019665784357706d) + "'", double1 == (-0.35019665784357706d));
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
        float float1 = org.apache.commons.math.util.FastMath.abs((float) 6061L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 6061.0f + "'", float1 == 6061.0f);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
        float float2 = org.apache.commons.math.util.FastMath.max((float) 145L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
        double double2 = org.apache.commons.math.util.FastMath.nextAfter(0.9034600343951872d, 515119.2812612585d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9034600343951873d + "'", double2 == 0.9034600343951873d);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        double double1 = org.apache.commons.math.util.FastMath.ceil(0.7201746613556624d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        int int2 = org.apache.commons.math.util.FastMath.min((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
        long long2 = org.apache.commons.math.util.FastMath.max(100L, (-2L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
        long long2 = org.apache.commons.math.util.FastMath.min((long) 100, 2147483647L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
        double double1 = org.apache.commons.math.util.FastMath.rint(9.616441887145511E102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.616441887145511E102d + "'", double1 == 9.616441887145511E102d);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
        double double1 = org.apache.commons.math.util.FastMath.signum(4.253522697326158d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
        double double1 = org.apache.commons.math.util.FastMath.acosh(0.7908790493650335d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
        double double1 = org.apache.commons.math.util.FastMath.ulp(0.6674572160283838d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
        float float2 = org.apache.commons.math.util.FastMath.min((float) 21L, 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 21.0f + "'", float2 == 21.0f);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        double double1 = org.apache.commons.math.util.FastMath.abs(0.16571020934276792d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16571020934276792d + "'", double1 == 0.16571020934276792d);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        double double1 = org.apache.commons.math.util.FastMath.expm1(0.697765004828061d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0092570056990897d + "'", double1 == 1.0092570056990897d);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        double double1 = org.apache.commons.math.util.FastMath.atan((-15.653559774527022d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.506999785948914d) + "'", double1 == (-1.506999785948914d));
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
        long long2 = org.apache.commons.math.util.FastMath.min(35L, (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
        double double1 = org.apache.commons.math.util.FastMath.abs(1.2851600114359308E19d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2851600114359308E19d + "'", double1 == 1.2851600114359308E19d);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
        double double1 = org.apache.commons.math.util.FastMath.log10(1.7044288495501951d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.2315788765577623d + "'", double1 == 0.2315788765577623d);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
        double double1 = org.apache.commons.math.util.FastMath.log10(0.3748459100034484d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.42614722344031464d) + "'", double1 == (-0.42614722344031464d));
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
        double double2 = org.apache.commons.math.util.FastMath.atan2(0.0d, (-36.912814250652346d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.141592653589793d + "'", double2 == 3.141592653589793d);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.05224159390358993d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.050922739949144445d + "'", double1 == 0.050922739949144445d);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
        double double1 = org.apache.commons.math.util.FastMath.log1p(0.1215705721632271d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.11472999958168163d + "'", double1 == 0.11472999958168163d);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
        long long2 = org.apache.commons.math.util.FastMath.max((long) 3, (long) 22025);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 22025L + "'", long2 == 22025L);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        double double1 = org.apache.commons.math.util.FastMath.toDegrees(0.1656976552431233d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.493776320644722d + "'", double1 == 9.493776320644722d);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
        double double1 = org.apache.commons.math.util.FastMath.expm1(1.4614193723085869d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.312075627545756d + "'", double1 == 3.312075627545756d);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        double double2 = org.apache.commons.math.util.FastMath.pow(0.42012681275810204d, 1.9828744915858403d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17914743767370203d + "'", double2 == 0.17914743767370203d);
    }
}

