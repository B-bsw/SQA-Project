package org.joda.time.tz;

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
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = null;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.io.DataOutputStream dataOutputStream0 = null;
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.StringTokenizer stringTokenizer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear1 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear(stringTokenizer0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.ThreadLocal<java.lang.Boolean> booleanThreadLocal0 = null;
        org.joda.time.tz.ZoneInfoCompiler.cVerbose = booleanThreadLocal0;
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.ThreadLocal<java.lang.Boolean> booleanThreadLocal0 = org.joda.time.tz.ZoneInfoCompiler.cVerbose;
        org.junit.Assert.assertNull(booleanThreadLocal0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        char char1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar('#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'w' + "'", char1 == 'w');
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.Class<?> wildcardClass1 = dateTimeOfYear0.getClass();
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        char char1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar('a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'w' + "'", char1 == 'w');
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addRecurring(dateTimeZoneBuilder2, "", (int) (short) -1, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        int int1 = dateTimeOfYear0.iMonthOfYear;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        char char1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar('w');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'w' + "'", char1 == 'w');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        char char2 = dateTimeOfYear0.iZoneChar;
        java.lang.Class<?> wildcardClass3 = dateTimeOfYear0.getClass();
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'w' + "'", char2 == 'w');
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseDayOfWeek("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"MonthOfYear: 1?DayOfMonth: 1?DayOfWeek: 0?AdvanceDayOfWeek: false?MillisOfDay: 0?ZoneChar: w?\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.BufferedReader bufferedReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            zoneInfoCompiler0.parseDataFile(bufferedReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.io.DataOutputStream dataOutputStream0 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler1 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = null;
        java.io.File[] fileArray3 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap4 = zoneInfoCompiler1.compile(file2, fileArray3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray3);
        org.junit.Assert.assertArrayEquals(fileArray3, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseTime("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MonthOfYear: 1?DayOfMonth: 1?DayOfWeek: 0?AdvanceDayOfWeek: false?MillisOfDay: 0?ZoneChar: w?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        int int2 = dateTimeOfYear0.iDayOfWeek;
        int int3 = dateTimeOfYear0.iMillisOfDay;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        int int2 = dateTimeOfYear0.iDayOfMonth;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        int int2 = dateTimeOfYear0.iDayOfMonth;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"monthofyear: 1?dayofmonth: 1?dayofweek: 0?advancedayofweek: false?millisofday: 0?zonechar: w?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        int int2 = dateTimeOfYear0.iDayOfWeek;
        int int3 = dateTimeOfYear0.iMillisOfDay;
        int int4 = dateTimeOfYear0.iMonthOfYear;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File[] fileArray2 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap3 = zoneInfoCompiler0.compile(file1, fileArray2);
        java.io.BufferedReader bufferedReader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            zoneInfoCompiler0.parseDataFile(bufferedReader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray2);
        org.junit.Assert.assertArrayEquals(fileArray2, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler2 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file3 = null;
        java.io.File[] fileArray4 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = zoneInfoCompiler2.compile(file3, fileArray4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = zoneInfoCompiler0.compile(file1, fileArray4);
        java.lang.Class<?> wildcardClass7 = fileArray4.getClass();
        org.junit.Assert.assertNotNull(fileArray4);
        org.junit.Assert.assertArrayEquals(fileArray4, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        int int2 = dateTimeOfYear0.iDayOfWeek;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        boolean boolean1 = dateTimeOfYear0.iAdvanceDayOfWeek;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addRecurring(dateTimeZoneBuilder2, "hi!", (int) (byte) 0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.io.DataOutputStream dataOutputStream0 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler1 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file2 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler3 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file4 = null;
        java.io.File[] fileArray5 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = zoneInfoCompiler3.compile(file4, fileArray5);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = zoneInfoCompiler1.compile(file2, fileArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.ZoneInfoCompiler.writeZoneInfoMap(dataOutputStream0, strMap7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(fileArray5);
        org.junit.Assert.assertArrayEquals(fileArray5, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        boolean boolean1 = dateTimeOfYear0.iAdvanceDayOfWeek;
        int int2 = dateTimeOfYear0.iDayOfWeek;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        int int2 = dateTimeOfYear0.iDayOfMonth;
        java.lang.String str3 = dateTimeOfYear0.toString();
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str3, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        char char1 = org.joda.time.tz.ZoneInfoCompiler.parseZoneChar(' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'w' + "'", char1 == 'w');
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.cStartOfYear;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        char char2 = dateTimeOfYear0.iZoneChar;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'w' + "'", char2 == 'w');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseMonth("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.joda.time.Chronology chronology0 = org.joda.time.tz.ZoneInfoCompiler.cLenientISO;
        org.junit.Assert.assertNotNull(chronology0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        int int2 = dateTimeOfYear0.iMillisOfDay;
        java.lang.String str3 = dateTimeOfYear0.toString();
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str3, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.String str1 = org.joda.time.tz.ZoneInfoCompiler.parseOptional("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.joda.time.tz.ZoneInfoCompiler.parseMonth("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        int int3 = dateTimeOfYear0.iDayOfWeek;
        int int4 = dateTimeOfYear0.iDayOfWeek;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler2 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file3 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler4 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file5 = null;
        java.io.File[] fileArray6 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap7 = zoneInfoCompiler4.compile(file5, fileArray6);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap8 = zoneInfoCompiler2.compile(file3, fileArray6);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap9 = zoneInfoCompiler0.compile(file1, fileArray6);
        org.junit.Assert.assertNotNull(fileArray6);
        org.junit.Assert.assertArrayEquals(fileArray6, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        boolean boolean1 = dateTimeOfYear0.iAdvanceDayOfWeek;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        boolean boolean3 = dateTimeOfYear0.iAdvanceDayOfWeek;
        int int4 = dateTimeOfYear0.iDayOfWeek;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.joda.time.tz.ZoneInfoCompiler.parseYear("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.joda.time.Chronology chronology0 = org.joda.time.tz.ZoneInfoCompiler.getLenientISOChronology();
        org.joda.time.tz.ZoneInfoCompiler.cLenientISO = chronology0;
        org.joda.time.tz.ZoneInfoCompiler.cLenientISO = chronology0;
        org.joda.time.tz.ZoneInfoCompiler.cLenientISO = chronology0;
        org.junit.Assert.assertNotNull(chronology0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = new org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear();
        boolean boolean1 = dateTimeOfYear0.iAdvanceDayOfWeek;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        int int3 = dateTimeOfYear0.iDayOfWeek;
        boolean boolean4 = dateTimeOfYear0.iAdvanceDayOfWeek;
        java.lang.String str5 = dateTimeOfYear0.toString();
        int int6 = dateTimeOfYear0.iMillisOfDay;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str5, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iMillisOfDay;
        boolean boolean2 = dateTimeOfYear0.iAdvanceDayOfWeek;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        char char2 = dateTimeOfYear0.iZoneChar;
        java.lang.String str3 = dateTimeOfYear0.toString();
        int int4 = dateTimeOfYear0.iMillisOfDay;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'w' + "'", char2 == 'w');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str3, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        int int2 = dateTimeOfYear0.iMonthOfYear;
        java.lang.String str3 = dateTimeOfYear0.toString();
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str3, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder2, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        char char2 = dateTimeOfYear0.iZoneChar;
        java.lang.String str3 = dateTimeOfYear0.toString();
        char char4 = dateTimeOfYear0.iZoneChar;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addCutover(dateTimeZoneBuilder5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'w' + "'", char2 == 'w');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str3, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + 'w' + "'", char4 == 'w');
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        int int2 = dateTimeOfYear0.iMillisOfDay;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addRecurring(dateTimeZoneBuilder4, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", (int) '4', (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        int int1 = dateTimeOfYear0.iDayOfMonth;
        int int2 = dateTimeOfYear0.iMillisOfDay;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.joda.time.tz.DateTimeZoneBuilder dateTimeZoneBuilder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeOfYear0.addRecurring(dateTimeZoneBuilder4, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n", (int) ' ', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler2 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file3 = null;
        java.io.File[] fileArray4 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap5 = zoneInfoCompiler2.compile(file3, fileArray4);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap6 = zoneInfoCompiler0.compile(file1, fileArray4);
        java.io.File file7 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler8 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file9 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler10 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file11 = null;
        java.io.File[] fileArray12 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap13 = zoneInfoCompiler10.compile(file11, fileArray12);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap14 = zoneInfoCompiler8.compile(file9, fileArray12);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap15 = zoneInfoCompiler0.compile(file7, fileArray12);
        java.io.File file16 = null;
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler17 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file18 = null;
        java.io.File[] fileArray19 = new java.io.File[] {};
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap20 = zoneInfoCompiler17.compile(file18, fileArray19);
        java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap21 = zoneInfoCompiler0.compile(file16, fileArray19);
        org.junit.Assert.assertNotNull(fileArray4);
        org.junit.Assert.assertArrayEquals(fileArray4, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(fileArray12);
        org.junit.Assert.assertArrayEquals(fileArray12, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(fileArray19);
        org.junit.Assert.assertArrayEquals(fileArray19, new java.io.File[] {});
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.tz.ZoneInfoCompiler.cLenientISO = chronology0;
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear dateTimeOfYear0 = org.joda.time.tz.ZoneInfoCompiler.getStartOfYear();
        java.lang.String str1 = dateTimeOfYear0.toString();
        char char2 = dateTimeOfYear0.iZoneChar;
        int int3 = dateTimeOfYear0.iMillisOfDay;
        int int4 = dateTimeOfYear0.iDayOfWeek;
        org.joda.time.tz.ZoneInfoCompiler.cStartOfYear = dateTimeOfYear0;
        org.junit.Assert.assertNotNull(dateTimeOfYear0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n" + "'", str1, "MonthOfYear: 1\nDayOfMonth: 1\nDayOfWeek: 0\nAdvanceDayOfWeek: false\nMillisOfDay: 0\nZoneChar: w\n");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'w' + "'", char2 == 'w');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.joda.time.tz.ZoneInfoCompiler.test("hi!", dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

