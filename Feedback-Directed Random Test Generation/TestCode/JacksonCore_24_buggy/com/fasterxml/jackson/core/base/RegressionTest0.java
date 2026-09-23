package com.fasterxml.jackson.core.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_COMMA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 44 + "'", int0 == 44);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_0;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 48 + "'", int0 == 48);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_e;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 101 + "'", int0 == 101);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.math.BigInteger bigInteger0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BI_MIN_LONG;
        org.junit.Assert.assertNotNull(bigInteger0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.math.BigInteger bigInteger0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BI_MIN_INT;
        org.junit.Assert.assertNotNull(bigInteger0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_PERIOD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 46 + "'", int0 == 46);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        char char0 = com.fasterxml.jackson.core.base.ParserMinimalBase.CHAR_NULL;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '\000' + "'", char0 == '\000');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        double double0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_LONG_D;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 9.223372036854776E18d + "'", double0 == 9.223372036854776E18d);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) -1 };
        java.lang.String str3 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_BACKSLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 92 + "'", int0 == 92);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        double double0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_INT_D;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.147483647E9d + "'", double0 == 2.147483647E9d);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "' ' (code 32)" + "'", str1, "' ' (code 32)");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_LF;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.math.BigDecimal bigDecimal0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BD_MAX_INT;
        org.junit.Assert.assertNotNull(bigDecimal0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_ASTERISK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 42 + "'", int0 == 42);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_APOS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 39 + "'", int0 == 39);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_PLUS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 43 + "'", int0 == 43);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_BIGINT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.math.BigInteger bigInteger0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BI_MAX_INT;
        org.junit.Assert.assertNotNull(bigInteger0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_QUOTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 34 + "'", int0 == 34);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_CR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_E;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 69 + "'", int0 == 69);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_UNKNOWN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_MINUS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 45 + "'", int0 == 45);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_TAB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        java.lang.String str5 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n\001\n" + "'", str4, "\n\001\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n\001\n" + "'", str5, "\n\001\n");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        long long0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MIN_INT_L;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-2147483648L) + "'", long0 == (-2147483648L));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_RCURLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 125 + "'", int0 == 125);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_9;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 57 + "'", int0 == 57);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_COLON;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 58 + "'", int0 == 58);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        double double0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MIN_LONG_D;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-9.223372036854776E18d) + "'", double0 == (-9.223372036854776E18d));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        byte[] byteArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_BYTES;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        long long0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_INT_L;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 2147483647L + "'", long0 == 2147483647L);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.math.BigDecimal bigDecimal0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BD_MAX_LONG;
        org.junit.Assert.assertNotNull(bigDecimal0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_LCURLY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 123 + "'", int0 == 123);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 104, (byte) 105, (byte) 33 });
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) -1, (byte) 1 };
        java.lang.String str4 = com.fasterxml.jackson.core.base.ParserMinimalBase._ascii(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) -1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n\ufffd\001" + "'", str4, "\n\ufffd\001");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NR_BIGDECIMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.math.BigDecimal bigDecimal0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BD_MIN_INT;
        org.junit.Assert.assertNotNull(bigDecimal0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_LBRACKET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 91 + "'", int0 == 91);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_HASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 35 + "'", int0 == 35);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.MAX_ERROR_TOKEN_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        int[] intArray0 = com.fasterxml.jackson.core.base.ParserMinimalBase.NO_INTS;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) 'a');
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 125);
        int[] intArray6 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray4, 58);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_SLASH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 47 + "'", int0 == 47);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int[] intArray5 = new int[] { 4, 13, (byte) 100, (byte) 100, (byte) 10 };
        int[] intArray7 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray5, 0);
        int[] intArray9 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray7, 9);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 4, 13, 100, 100, 10 });
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 4, 13, 100, 100, 10 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 4, 13, 100, 100, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.math.BigDecimal bigDecimal0 = com.fasterxml.jackson.core.base.ParserMinimalBase.BD_MIN_LONG;
        org.junit.Assert.assertNotNull(bigDecimal0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\n\ufffd\001");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) -3, (byte) 1 });
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str1 = com.fasterxml.jackson.core.base.ParserMinimalBase._getCharDesc(256);
// flaky "1) test53(com.fasterxml.jackson.core.base.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u0100' (code 256 / 0x100)" + "'", str1, "\u0100' (code 256 / 0x100)");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int[] intArray0 = null;
        int[] intArray2 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, (int) ' ');
        int[] intArray4 = com.fasterxml.jackson.core.base.ParserBase.growArrayBy(intArray0, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        int int0 = com.fasterxml.jackson.core.base.ParserMinimalBase.INT_RBRACKET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 93 + "'", int0 == 93);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\000\ufffd");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 0, (byte) -3 });
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        byte[] byteArray1 = com.fasterxml.jackson.core.base.ParserMinimalBase._asciiBytes("\n\001\n");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }
}
