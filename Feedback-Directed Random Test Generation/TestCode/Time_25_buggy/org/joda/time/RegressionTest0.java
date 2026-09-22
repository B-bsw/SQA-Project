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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        boolean boolean3 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-08:00" + "'", str2, "-08:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        java.lang.String str3 = dateTimeZone0.getID();
        long long6 = dateTimeZone0.convertLocalToUTC((long) (byte) 0, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        long long5 = dateTimeZone1.convertLocalToUTC((long) (byte) 10, true, 32L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getID();
        java.lang.String str6 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) ' ');
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        boolean boolean7 = dateTimeZone0.isStandardOffset((long) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.lang.String str3 = dateTimeZone1.getShortName((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        boolean boolean3 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.nextTransition((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        int int4 = dateTimeZone0.getOffset((long) 100);
        java.lang.String str6 = dateTimeZone0.getShortName((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.Class<?> wildcardClass2 = timeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((long) (short) 100, locale4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) ' ', locale7);
        java.lang.String str9 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long5 = dateTimeZone0.nextTransition((long) (-1));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) 0, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        long long7 = dateTimeZone0.convertUTCToLocal((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        boolean boolean6 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone0.getShortName((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName((long) (byte) -1, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        long long3 = dateTimeZone0.nextTransition(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone5.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (byte) 1);
        int int13 = dateTimeZone5.getOffsetFromLocal(97L);
        boolean boolean15 = dateTimeZone5.isStandardOffset((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        long long4 = dateTimeZone0.convertUTCToLocal((long) ' ');
        java.lang.Class<?> wildcardClass5 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.util.TimeZone timeZone4 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getShortName(100L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long7 = dateTimeZone5.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime8 = null;
        boolean boolean9 = dateTimeZone5.isLocalDateTimeGap(localDateTime8);
        long long11 = dateTimeZone0.getMillisKeepLocal(dateTimeZone5, (long) (byte) 1);
        int int13 = dateTimeZone5.getOffsetFromLocal(97L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        int int16 = dateTimeZone5.getOffsetFromLocal((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.previousTransition((long) 1);
        int int4 = dateTimeZone0.getOffset((long) 100);
        long long7 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        java.lang.String str3 = dateTimeZone0.getID();
        long long6 = dateTimeZone0.convertLocalToUTC((long) (short) 1, true);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getName((long) (short) 0, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '4');
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (short) 100);
        java.lang.Class<?> wildcardClass8 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forID("+00:00");
        long long4 = dateTimeZone0.getMillisKeepLocal(dateTimeZone2, 97L);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) ' ');
        long long7 = dateTimeZone0.convertLocalToUTC((long) 100, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.lang.Object obj5 = dateTimeZone0.writeReplace();
        java.lang.String str6 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getName((long) ' ', locale7);
        boolean boolean9 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj1 = dateTimeZone0.writeReplace();
        long long4 = dateTimeZone0.convertLocalToUTC((long) (short) -1, false);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone0.getName((long) (byte) 10, locale6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        java.lang.Object obj3 = dateTimeZone2.writeReplace();
        long long5 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) '4');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone2.getShortName(97L, locale7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getID();
        java.lang.String str6 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone0.getShortName(0L, locale10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.lang.String str5 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.lang.Object obj8 = dateTimeZone6.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        long long11 = dateTimeZone6.previousTransition((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        java.lang.String str5 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        java.lang.Object obj8 = dateTimeZone6.writeReplace();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) dateTimeZone6);
        int int11 = dateTimeZone6.getOffsetFromLocal((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (byte) 1);
        java.lang.Object obj4 = dateTimeZone0.writeReplace();
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        long long8 = dateTimeZone0.convertUTCToLocal((-1L));
        java.util.TimeZone timeZone9 = dateTimeZone0.toTimeZone();
        java.util.TimeZone timeZone10 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }
}

