package org.joda.time;

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
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) '4', false, (long) 1);
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999948L) + "'", long8 == (-359999948L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.nextTransition((long) 0);
        java.lang.Class<?> wildcardClass10 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, false, 1L);
        int int13 = dateTimeZone2.getOffsetFromLocal(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-359999900L) + "'", long11 == (-359999900L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+100:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:00\" is malformed at \"0:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, true, 100L);
        java.lang.String str9 = dateTimeZone2.getID();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999900L) + "'", long8 == (-359999900L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+100:00" + "'", str9, "+100:00");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, false, 1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone2.getOffset(readableInstant13);
        java.lang.Class<?> wildcardClass15 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-359999900L) + "'", long11 == (-359999900L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360000000 + "'", int14 == 360000000);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean2 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        int int6 = dateTimeZone2.getOffsetFromLocal((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 360000000 + "'", int6 == 360000000);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        long long10 = dateTimeZone2.convertLocalToUTC((long) '#', true, 0L);
        java.lang.String str11 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-359999965L) + "'", long10 == (-359999965L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long11 = dateTimeZone2.convertLocalToUTC((long) (byte) 100, false, 1L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone2.getOffset(readableInstant13);
        java.lang.String str16 = dateTimeZone2.getNameKey((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-359999900L) + "'", long11 == (-359999900L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360000000 + "'", int14 == 360000000);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        java.lang.String str8 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 360000000, false);
        int int9 = dateTimeZone2.getStandardOffset((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 360000000 + "'", int9 == 360000000);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) '4', false, (long) 1);
        java.lang.String str10 = dateTimeZone2.getName((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999948L) + "'", long8 == (-359999948L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.nextTransition((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getShortName((long) (byte) 100, locale11);
        long long15 = dateTimeZone2.adjustOffset(0L, false);
        java.lang.String str17 = dateTimeZone2.getName((long) '4');
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:00" + "'", str12, "+100:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+100:00" + "'", str17, "+100:00");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.100" + "'", str2, "+00:00:00.100");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        java.lang.String str8 = dateTimeZone2.getID();
        java.lang.Object obj9 = dateTimeZone2.writeReplace();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getName((long) ' ', locale11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+100:00" + "'", str8, "+100:00");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:00" + "'", str12, "+100:00");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.nextTransition((long) 0);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone2.getShortName((long) (byte) 100, locale11);
        long long15 = dateTimeZone2.adjustOffset(0L, false);
        int int17 = dateTimeZone2.getStandardOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+100:00" + "'", str12, "+100:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 360000000 + "'", int17 == 360000000);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.previousTransition((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        java.lang.String str4 = dateTimeZone2.getNameKey((long) 'a');
        java.lang.String str6 = dateTimeZone2.getShortName((long) ' ');
        long long8 = dateTimeZone2.convertUTCToLocal(1L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+100:00" + "'", str6, "+100:00");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 360000001L + "'", long8 == 360000001L);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) '4', false, (long) 1);
        boolean boolean10 = dateTimeZone2.isStandardOffset((long) '4');
        java.lang.String str11 = dateTimeZone2.toString();
        int int13 = dateTimeZone2.getOffset(360000000L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999948L) + "'", long8 == (-359999948L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+100:00" + "'", str11, "+100:00");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        long long7 = dateTimeZone2.convertLocalToUTC((long) 360000000, false);
        int int9 = dateTimeZone2.getOffset((long) '#');
        int int11 = dateTimeZone2.getOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 360000000 + "'", int9 == 360000000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360000000 + "'", int11 == 360000000);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(0);
        long long3 = dateTimeZone1.convertUTCToLocal((long) (short) 0);
        long long5 = dateTimeZone1.convertUTCToLocal(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.nextTransition((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int5 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        long long9 = dateTimeZone3.convertLocalToUTC((long) '4', false, (long) 1);
        boolean boolean11 = dateTimeZone3.isStandardOffset((long) '4');
        java.lang.Object obj12 = dateTimeZone3.writeReplace();
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, (long) 100);
        java.lang.Class<?> wildcardClass15 = dateTimeZone3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 360000000 + "'", int5 == 360000000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-359999948L) + "'", long9 == (-359999948L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-359999800L) + "'", long14 == (-359999800L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.previousTransition((long) (-1));
        boolean boolean11 = dateTimeZone2.isStandardOffset((long) (short) 10);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone2.getShortName((long) (byte) 1, locale13);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:00" + "'", str14, "+100:00");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.nextTransition((-359999948L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-359999948L) + "'", long4 == (-359999948L));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffset((long) 10);
        java.lang.Object obj5 = dateTimeZone2.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        boolean boolean3 = dateTimeZone1.isStandardOffset(10L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone6.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone6.convertLocalToUTC((long) 360000000, false);
        long long13 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, 0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-359999900L) + "'", long13 == (-359999900L));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone2.getShortName((long) (short) 10, locale6);
        long long9 = dateTimeZone2.previousTransition((long) (-1));
        long long11 = dateTimeZone2.previousTransition((long) 10);
        java.util.TimeZone timeZone12 = dateTimeZone2.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+100:00" + "'", str7, "+100:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+:0:00");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getOffsetFromLocal((long) '#');
        boolean boolean4 = dateTimeZone0.isStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        boolean boolean5 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        java.lang.String str8 = dateTimeZone2.getNameKey((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.toString();
        java.lang.Class<?> wildcardClass3 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.010" + "'", str2, "+00:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) '4', false, (long) 1);
        boolean boolean10 = dateTimeZone2.isStandardOffset((long) '4');
        long long12 = dateTimeZone2.previousTransition((long) 360000000);
        java.lang.String str13 = dateTimeZone2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999948L) + "'", long8 == (-359999948L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 360000000L + "'", long12 == 360000000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+100:00" + "'", str13, "+100:00");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (byte) 1);
        long long8 = dateTimeZone2.convertLocalToUTC((long) '4', false, (long) 1);
        boolean boolean10 = dateTimeZone2.isStandardOffset((long) '4');
        java.lang.Object obj11 = dateTimeZone2.writeReplace();
        int int13 = dateTimeZone2.getStandardOffset((-359999800L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 360000000 + "'", int4 == 360000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-359999948L) + "'", long8 == (-359999948L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
    }
}

