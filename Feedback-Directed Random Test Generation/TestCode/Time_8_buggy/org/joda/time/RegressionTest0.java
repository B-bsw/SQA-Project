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
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        long long8 = dateTimeZone0.adjustOffset((long) 100, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        boolean boolean4 = dateTimeZone0.isFixed();
        boolean boolean6 = dateTimeZone0.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.String str3 = dateTimeZone0.getShortName((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str3 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        java.lang.Object obj14 = dateTimeZone6.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        int int15 = dateTimeZone6.getOffsetFromLocal(1L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        boolean boolean6 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.toString();
        java.lang.String str8 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        long long14 = dateTimeZone0.convertLocalToUTC((long) (short) 1, false, (long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hours out of range: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        boolean boolean2 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Pacific Standard Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        int int3 = dateTimeZone0.getOffsetFromLocal((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Pacific Standard Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-28800000) + "'", int3 == (-28800000));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        boolean boolean6 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.toString();
        java.lang.String str8 = dateTimeZone0.toString();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone0.isLocalDateTimeGap(localDateTime9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = dateTimeZone0.getOffset(readableInstant11);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getShortName((long) (-28800000), locale2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-08:00" + "'", str3, "-08:00");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        java.lang.String str7 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        boolean boolean6 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.toString();
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        int int7 = dateTimeZone0.getStandardOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((long) '4', locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone0.isLocalDateTimeGap(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.convertLocalToUTC((-1L), true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test26(org.joda.time.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone0.getShortName((long) '#', locale7);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = false; // flaky "2) test28(org.joda.time.RegressionTest0)": dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((long) '4', locale4);
        java.lang.Class<?> wildcardClass6 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.lang.String str8 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        boolean boolean6 = dateTimeZone0.isFixed();
        java.lang.String str7 = dateTimeZone0.toString();
        java.lang.String str8 = dateTimeZone0.toString();
        java.lang.String str9 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-08:00");
        long long3 = dateTimeZone1.previousTransition((long) (-28800000));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-28800000L) + "'", long3 == (-28800000L));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.lang.String str9 = dateTimeZone0.getName(100L);
        long long11 = dateTimeZone0.nextTransition((long) (short) 0);
        long long14 = dateTimeZone0.adjustOffset((long) (short) -1, false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        long long9 = dateTimeZone0.adjustOffset((long) (byte) 1, true);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        java.lang.String str8 = dateTimeZone0.getShortName((long) 10);
        long long10 = dateTimeZone0.convertUTCToLocal((long) (short) 100);
        boolean boolean12 = dateTimeZone0.equals((java.lang.Object) (-1L));
        java.lang.String str14 = dateTimeZone0.getShortName(0L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone0.getName((long) (short) 10, locale16);
        long long19 = dateTimeZone0.convertUTCToLocal((long) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        boolean boolean2 = dateTimeZone0.isFixed();
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone1.getShortName(0L);
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        long long7 = dateTimeZone1.convertLocalToUTC((long) 100, false);
        java.lang.String str9 = dateTimeZone1.getShortName((long) 10);
        long long11 = dateTimeZone1.convertUTCToLocal((long) (short) 100);
        boolean boolean13 = dateTimeZone1.equals((java.lang.Object) (-1L));
        long long15 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.lang.String str9 = dateTimeZone0.getName(100L);
        boolean boolean11 = dateTimeZone0.isStandardOffset((long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        java.lang.String str15 = dateTimeZone0.getNameKey((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone0.getShortName((long) '4', locale4);
        int int7 = dateTimeZone0.getStandardOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = dateTimeZone0.isLocalDateTimeGap(localDateTime1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        long long5 = dateTimeZone3.previousTransition((long) 100);
        java.lang.String str6 = dateTimeZone3.getID();
        long long8 = dateTimeZone0.getMillisKeepLocal(dateTimeZone3, (long) (-1));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        boolean boolean4 = dateTimeZone0.isFixed();
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone0.isLocalDateTimeGap(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '-00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-08:00");
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-08:00");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        java.lang.String str5 = dateTimeZone0.getNameKey((long) ' ');
        java.lang.Object obj6 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        boolean boolean7 = dateTimeZone0.isFixed();
        java.lang.String str9 = dateTimeZone0.getName(100L);
        java.lang.String str11 = dateTimeZone0.getName(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        java.lang.String str3 = dateTimeZone0.getNameKey((long) (short) 100);
        java.lang.Class<?> wildcardClass4 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky "3) test47(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
// flaky "1) test47(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        java.lang.String str7 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey((long) (byte) 0);
        java.lang.String str4 = dateTimeZone0.getNameKey((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(10);
        java.lang.String str3 = dateTimeZone1.getName((long) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str5 = dateTimeZone4.toString();
        java.lang.Object obj6 = dateTimeZone4.writeReplace();
        long long8 = dateTimeZone1.getMillisKeepLocal(dateTimeZone4, 10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.010" + "'", str3, "+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 20L + "'", long8 == 20L);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.lang.String str1 = dateTimeZone0.getID();
        java.lang.String str2 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "4) test51(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
// flaky "2) test51(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        long long6 = dateTimeZone0.convertUTCToLocal((long) ' ');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        int int9 = dateTimeZone0.getStandardOffset((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone6.getShortName((long) (short) 100, locale15);
        boolean boolean17 = dateTimeZone6.isFixed();
        boolean boolean19 = dateTimeZone6.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        long long17 = dateTimeZone0.convertLocalToUTC(0L, false, (long) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        java.lang.String str8 = dateTimeZone0.getShortName((long) 10);
        long long10 = dateTimeZone0.previousTransition((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str1 = dateTimeZone0.toString();
        java.lang.Object obj2 = dateTimeZone0.writeReplace();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getName((-1L), locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTC" + "'", str1, "UTC");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        int int15 = dateTimeZone6.getStandardOffset((long) (short) -1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        long long6 = dateTimeZone0.convertLocalToUTC((long) 100, false);
        java.lang.String str8 = dateTimeZone0.getShortName((long) 10);
        java.lang.String str9 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        int int3 = dateTimeZone1.getOffsetFromLocal(20L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getShortName(0L);
        java.lang.String str4 = dateTimeZone0.getNameKey(100L);
        java.lang.String str5 = dateTimeZone0.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str8 = dateTimeZone6.getShortName(0L);
        java.lang.String str10 = dateTimeZone6.getNameKey(100L);
        java.lang.String str11 = dateTimeZone6.getID();
        long long13 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (-1L));
        int int15 = dateTimeZone6.getStandardOffset(20L);
        boolean boolean16 = dateTimeZone6.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00" + "'", str2, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }
}
