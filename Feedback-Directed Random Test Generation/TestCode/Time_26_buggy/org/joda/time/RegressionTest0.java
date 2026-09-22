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
        org.joda.time.DateTimeField dateTimeField0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = org.joda.time.field.LenientDateTimeField.getInstance(dateTimeField0, chronology1);
        org.junit.Assert.assertNull(dateTimeField2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology3 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName((long) (short) 10, locale2);
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky "1) test04(org.joda.time.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = null;
        boolean boolean2 = false; // flaky "2) test05(org.joda.time.RegressionTest0)": dateTimeZone0.isLocalDateTimeGap(localDateTime1);
        java.lang.Class<?> wildcardClass3 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        java.lang.String str6 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
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
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology2 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        int int7 = dateTimeZone0.getStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        boolean boolean6 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) '4');
        int int5 = dateTimeZone1.getOffsetFromLocal((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology6 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        java.lang.String str3 = dateTimeZone1.getName((long) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology3 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long4 = dateTimeZone0.convertLocalToUTC(0L, false);
        java.lang.String str6 = dateTimeZone0.getName((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-3600000) + "'", int5 == (-3600000));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone0.isLocalDateTimeGap(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        long long4 = dateTimeZone0.nextTransition(0L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology3 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        int int7 = dateTimeZone0.getStandardOffset((long) (byte) 100);
        java.lang.Class<?> wildcardClass8 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName(100L, locale2);
        java.lang.String str4 = dateTimeZone0.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        java.lang.String str8 = dateTimeZone6.getNameKey((-1L));
        boolean boolean9 = dateTimeZone0.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str2 = dateTimeZone1.getID();
        int int4 = dateTimeZone1.getOffsetFromLocal((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3600000) + "'", int4 == (-3600000));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        boolean boolean4 = dateTimeZone0.isStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.lang.String str7 = dateTimeZone0.getName((long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        boolean boolean3 = dateTimeZone1.isStandardOffset(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.lang.String str3 = dateTimeZone2.toString();
        java.lang.String str4 = dateTimeZone2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.ZonedChronology zonedChronology5 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must supply a chronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-00:00:00.001" + "'", str3, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.ReadableInstant readableInstant1 = null;
        int int2 = dateTimeZone0.getOffset(readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass6 = dateTimeZone3.getClass();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) wildcardClass6);
        int int9 = dateTimeZone0.getOffset(32L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset(0L);
        java.lang.Object obj3 = dateTimeZone0.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
        boolean boolean4 = dateTimeZone2.equals((java.lang.Object) '4');
        long long6 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, 10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 110L + "'", long6 == 110L);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) '4');
        java.lang.String str10 = dateTimeZone6.getShortName((long) (short) -1);
        java.lang.String str12 = dateTimeZone6.getNameKey((long) (short) 10);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) '4');
        boolean boolean15 = dateTimeZone0.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.convertLocalToUTC((long) (short) 10, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3600010L + "'", long5 == 3600010L);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale2 = null;
        java.lang.String str3 = dateTimeZone0.getName(100L, locale2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        boolean boolean6 = dateTimeZone4.equals((java.lang.Object) '4');
        java.lang.String str8 = dateTimeZone4.getShortName((long) (short) -1);
        java.util.TimeZone timeZone9 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        boolean boolean12 = dateTimeZone10.equals((java.lang.Object) '4');
        java.lang.String str14 = dateTimeZone10.getShortName((long) (short) -1);
        java.lang.String str16 = dateTimeZone10.getNameKey((long) (short) 10);
        long long18 = dateTimeZone4.getMillisKeepLocal(dateTimeZone10, (long) '4');
        long long20 = dateTimeZone0.getMillisKeepLocal(dateTimeZone10, (long) ' ');
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone0.isLocalDateTimeGap(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("-01:00");
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        int int2 = dateTimeZone0.getStandardOffset(0L);
        int int4 = dateTimeZone0.getOffset((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
        int int3 = dateTimeZone1.getOffset((long) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.joda.time.DateTimeZone.setProvider(provider0);
        org.junit.Assert.assertNotNull(provider0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 1);
        java.lang.String str5 = dateTimeZone0.toString();
        java.lang.String str7 = dateTimeZone0.getName((long) 100);
        long long9 = dateTimeZone0.nextTransition(100L);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        boolean boolean8 = dateTimeZone6.equals((java.lang.Object) '4');
        java.lang.String str10 = dateTimeZone6.getShortName((long) (short) -1);
        java.lang.String str12 = dateTimeZone6.getNameKey((long) (short) 10);
        long long14 = dateTimeZone0.getMillisKeepLocal(dateTimeZone6, (long) '4');
        java.lang.String str16 = dateTimeZone0.getName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 52L + "'", long14 == 52L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str6 = dateTimeZone5.getID();
        boolean boolean7 = dateTimeZone0.equals((java.lang.Object) str6);
        java.lang.String str9 = dateTimeZone0.getName((long) '#');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-01:00" + "'", str6, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        int int7 = dateTimeZone0.getStandardOffset((long) (byte) 100);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone0.getShortName((long) (short) 0, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName((long) 0, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long6 = dateTimeZone3.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName((long) 100, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999900L) + "'", long6 == (-359999900L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        long long3 = dateTimeZone0.convertUTCToLocal(0L);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone0.getOffset(readableInstant4);
        java.util.TimeZone timeZone6 = dateTimeZone0.toTimeZone();
        int int8 = dateTimeZone0.getStandardOffset((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((-1));
        int int3 = dateTimeZone1.getStandardOffset((long) 0);
        java.lang.String str4 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-00:00:00.001" + "'", str4, "-00:00:00.001");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.lang.String str6 = dateTimeZone0.getNameKey((long) (short) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone0.getShortName(0L, locale8);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        boolean boolean3 = dateTimeZone0.isFixed();
        java.util.Locale locale5 = null;
        java.lang.String str6 = dateTimeZone0.getShortName((long) 360000000, locale5);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        int int3 = dateTimeZone1.getStandardOffset((long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 360000000 + "'", int3 == 360000000);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        java.lang.Object obj4 = dateTimeZone1.writeReplace();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        boolean boolean2 = dateTimeZone0.equals((java.lang.Object) '4');
        java.lang.String str4 = dateTimeZone0.getShortName((long) (short) -1);
        java.util.TimeZone timeZone5 = dateTimeZone0.toTimeZone();
        int int7 = dateTimeZone0.getStandardOffset((long) (byte) 100);
        java.lang.String str8 = dateTimeZone0.toString();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long3 = dateTimeZone1.nextTransition((long) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str2 = dateTimeZone1.getID();
        java.lang.Object obj3 = dateTimeZone1.writeReplace();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone5 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-01:00" + "'", str2, "-01:00");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.convertUTCToLocal((long) (byte) 100);
        java.lang.String str4 = dateTimeZone0.getName((long) (byte) 1);
        java.lang.String str5 = dateTimeZone0.toString();
        java.lang.String str7 = dateTimeZone0.getName((long) 100);
        java.lang.String str9 = dateTimeZone0.getNameKey((-1L));
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 100);
        long long6 = dateTimeZone3.convertLocalToUTC((long) (byte) 100, false);
        boolean boolean7 = dateTimeZone1.equals((java.lang.Object) dateTimeZone3);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone3.getName((long) 100, locale9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-359999900L) + "'", long6 == (-359999900L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+100:00" + "'", str10, "+100:00");
    }
}
