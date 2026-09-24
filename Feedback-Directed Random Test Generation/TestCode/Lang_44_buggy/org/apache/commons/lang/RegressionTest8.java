package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 100, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) -1, 10L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (-1), (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 1, (long) '#', (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, (long) (short) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 0, (long) (-1), (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 35, 32L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) ' ', (int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (short) -1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 10L, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, 1L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (short) 1, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) '4', 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) ' ', 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 1.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 10L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 35, (long) (short) 0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 10, (long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 10, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, (long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 0, (long) (byte) 1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, (long) (short) 0, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 0, (long) (byte) 1, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (-1), (long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) '#', (float) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 10, (long) 'a', 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) ' ', (-1L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(100L, (long) 'a', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', (long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 32, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) ' ', (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        int int2 = org.apache.commons.lang.NumberUtils.compare(1.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 10, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, 1L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(35, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((-1), (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 10, 97L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(52L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((-1), 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 0, (long) (short) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) 'a', (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(32, (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 10, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 1L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 1, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) -1, 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 100, (long) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        int int2 = org.apache.commons.lang.NumberUtils.compare(10.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 100, (long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 100, (long) (short) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 1, (int) (short) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (-1L), (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((-1), (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 'a', (long) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (-1), (long) (byte) 10, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 100, (long) (short) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 0, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(52L, (long) (short) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 32, (long) ' ', 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 32, (long) 32, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) ' ', (long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) -1, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) -1, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, 32L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 35L, (float) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 0, 97, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(10, 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 100, (long) '#', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, 10L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, (long) (short) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 52, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 97L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 52, (long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) ' ', (long) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 1, 32, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', (long) (short) 0, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 10, (long) 97, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(35, 32, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 0, (long) (short) 0, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(10L, (long) (short) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 97, (long) (short) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, (long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 0, (long) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', (int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 1, (long) 52, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1, (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 100, (long) (byte) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) ' ', (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 1, 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        int int2 = org.apache.commons.lang.NumberUtils.compare(10.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 100, (-1L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 0, (long) (byte) 10, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(52, (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(35L, (long) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, (long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 35, (double) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(32, 32, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 1, 10L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, (long) (-1), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(35L, (long) (short) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(32L, (long) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 10, (int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) 'a', 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        int int2 = org.apache.commons.lang.NumberUtils.compare((-1.0f), (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(100L, (long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 1, (long) 97, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) -1, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 52, (long) '#', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 97L, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, 97, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 1, (long) 32, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 1, 97L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(1L, (long) (byte) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, 10L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, (long) (short) -1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', (long) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(1L, (long) (byte) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(52, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) 1, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 0, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(10L, (long) 32, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 10, 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 0, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(52L, 52L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) 'a', (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 1, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(97, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) -1, (long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, 32L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, 97L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(1L, (long) 52, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(1, (int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, (long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) -1, 97L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(10, 35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, (long) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 0, 35, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 100, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 0, (long) 35, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '#', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 10, (long) (short) 10, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((-1L), (long) 52, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(52, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, (-1L), (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 0, 0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 0, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, 97L, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (short) 100, (double) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) ' ', (long) (short) -1, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(32L, (long) 1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, (long) 52, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 35L, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '4', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 0, 97L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 1, (long) (short) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 32, (long) 'a', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(97, 32, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 32, (long) (byte) -1, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 100, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(1L, (long) 10, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 'a', (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) -1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 0, (-1L), 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (-1.0f), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '4', (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 100, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) '#', (long) 35, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 52, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 32, (long) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        int int2 = org.apache.commons.lang.NumberUtils.compare(0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) ' ', (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(35L, (long) (short) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 0, 0L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 'a', (long) (byte) 10, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 0, (long) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) '4', (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 0, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 0, 35, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 1, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 1, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (-1), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (-1), (long) (byte) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 10, (int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 0, (long) 97, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, 10L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 100, 52L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 10, (long) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((-1L), 35L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(97, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(100, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 0, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, (long) (byte) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        int int2 = org.apache.commons.lang.NumberUtils.compare(10.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) ' ', (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(35, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) ' ', 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 10, 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, (long) 52, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) ' ', 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 97, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) ' ', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) -1, 1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 100, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 97, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 97, (long) (byte) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (short) 1, (float) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 10, (long) 97, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (long) 52, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 1, (long) (short) 100, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) -1, (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 0, (int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 100, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (-1), (long) 1, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) -1, 97, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(32, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(97, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 'a', (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', 97L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 10, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (short) -1, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 10, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(10L, 0L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 0, 52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 1, (long) 'a', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 35, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 0, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 1, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) ' ', 97L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (short) 0, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, (long) 32, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(1, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, (long) '#', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(52L, 1L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, (-1L), (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, (long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) -1, 52, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, 0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, 97L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 35, 97L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) -1, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(100L, 1L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 35, (long) (byte) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, (long) 35, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 100, 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(32, 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) '#', (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 10, (long) (short) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        int int2 = org.apache.commons.lang.NumberUtils.compare(100.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (short) 0, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (-1), (long) (byte) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, (int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 52, (long) 35, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 100, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((-1L), 10L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, 32L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 35, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 1, (long) (byte) -1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 10, (int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 1, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 100, (long) (short) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        int int2 = org.apache.commons.lang.NumberUtils.compare(10.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        int int2 = org.apache.commons.lang.NumberUtils.compare(0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 32, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(0, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 0, (long) (short) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, (long) 32, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 35, (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, (long) 100, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 0, 52L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1L, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 100, 32L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 52, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(100, (int) '#', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 0, (long) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 0, (long) (short) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 10, (long) (byte) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, (long) '#', (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        int int2 = org.apache.commons.lang.NumberUtils.compare((-1.0f), (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, (long) 52, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '4', 32, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (long) 100, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 0L, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 97, 100L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 10, 52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) 'a', 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 32, (long) (short) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, 100L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, (long) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (-1L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(10, 35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, (long) ' ', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 100, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(0L, (long) 'a', (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, (long) 52, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (int) 'a', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 10, (-1L), (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 10, (long) 32, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 100, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(35L, 100L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 0, 52L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, 52, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(32, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 0, (int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(32L, (long) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        int int2 = org.apache.commons.lang.NumberUtils.compare((-1.0d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) 'a', (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '#', (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(97, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) -1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(1, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (-1), (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 100, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) -1, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(97L, 1L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(10L, (long) 32, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(32, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 'a', (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 35, (long) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, (long) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 10, (long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(35, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 32L, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) '#', (-1), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 100, 1L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(32, 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 97, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(97L, 97L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(52L, (long) 'a', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, (long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 10.0f, (double) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 'a', (long) (byte) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 10, (long) (byte) -1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, 0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 32, (long) (byte) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(10L, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(100, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 1L, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 100L, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, 0L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) '#', (long) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 32, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', 52, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) -1, (long) (short) 0, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 10, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 10, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 1, (long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(32, 35, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 35, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 1, (long) '#', (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) -1, (int) (short) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) -1, 97L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(52L, (long) 32, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) -1, (long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(97L, (long) '4', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 100, (long) (byte) -1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(1L, 32L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 10, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 97, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 35, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '4', (long) 10, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(1, (int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, (-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (-1), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, 35, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) -1, 97L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) '4', (-1L), 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, (long) (short) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', (long) (short) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, (long) 32, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 1, (long) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(35L, 0L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((-1), (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 35L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 1, (long) '4', 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (-1), (long) '#', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 10, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 0L, (float) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 10, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(100L, (long) (byte) 1, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) 100, (float) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (-1), 97L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        long long3 = org.apache.commons.lang.NumberUtils.minimum(1L, (long) (short) 1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '4', (long) ' ', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(35, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (byte) 10, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(0, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 0, (long) (short) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(32, 32, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 0, (long) (byte) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(52, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(1L, 100L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '4', 35, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 10, (int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (-1), (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 100, (int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 'a', (long) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 10, (long) 10, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 35, (long) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(100, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) 100, (long) (byte) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (byte) 1, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) '#', (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) -1, (long) '#', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 32, (long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 0, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) (byte) -1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (byte) 100, (long) '#', (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) (short) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(35, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 52L, (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        int int2 = org.apache.commons.lang.NumberUtils.compare((float) 0L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(0, (int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 97, (double) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) (short) 10, 97L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(97, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        long long3 = org.apache.commons.lang.NumberUtils.minimum((long) 'a', (long) 1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) '#', (long) 100, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 10, (long) ' ', (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        int int3 = org.apache.commons.lang.NumberUtils.maximum(97, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 100.0f, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(10L, (long) (-1), (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) ' ', 97L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (byte) 100, (long) (byte) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (short) 10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (short) 100, 1L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        long long3 = org.apache.commons.lang.NumberUtils.maximum(0L, (long) (byte) -1, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) 'a', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        int int2 = org.apache.commons.lang.NumberUtils.compare(1.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        int int2 = org.apache.commons.lang.NumberUtils.compare((double) 35, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        int int3 = org.apache.commons.lang.NumberUtils.maximum((int) (short) 100, 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 0, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        long long3 = org.apache.commons.lang.NumberUtils.maximum((long) (-1), (long) (short) 10, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        int int3 = org.apache.commons.lang.NumberUtils.minimum((int) (byte) 1, (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        int int3 = org.apache.commons.lang.NumberUtils.minimum(52, 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

